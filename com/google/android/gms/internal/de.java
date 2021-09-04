package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.data.d;
import java.util.ArrayList;

public abstract class de<T extends IInterface>
  implements GooglePlayServicesClient
{
  public static final String[] kO = { "service_esmobile", "service_googleme" };
  private final String[] is;
  private T kD;
  private ArrayList<GooglePlayServicesClient.ConnectionCallbacks> kE;
  final ArrayList<GooglePlayServicesClient.ConnectionCallbacks> kF = new ArrayList();
  private boolean kG = false;
  private ArrayList<GooglePlayServicesClient.OnConnectionFailedListener> kH;
  private boolean kI = false;
  private final ArrayList<de<T>.b<?>> kJ = new ArrayList();
  private de<T>.e kK;
  boolean kL = false;
  boolean kM = false;
  private final Object kN = new Object();
  private final Context mContext;
  final Handler mHandler;
  
  protected de(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener, String... paramVarArgs)
  {
    this.mContext = ((Context)dm.e(paramContext));
    this.kE = new ArrayList();
    this.kE.add(dm.e(paramConnectionCallbacks));
    this.kH = new ArrayList();
    this.kH.add(dm.e(paramOnConnectionFailedListener));
    this.mHandler = new a(paramContext.getMainLooper());
    a(paramVarArgs);
    this.is = paramVarArgs;
  }
  
  protected void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    this.mHandler.sendMessage(this.mHandler.obtainMessage(1, new f(paramInt, paramIBinder, paramBundle)));
  }
  
  protected void a(ConnectionResult paramConnectionResult)
  {
    this.mHandler.removeMessages(4);
    for (;;)
    {
      int i;
      synchronized (this.kH)
      {
        this.kI = true;
        ArrayList localArrayList2 = this.kH;
        int j = localArrayList2.size();
        i = 0;
        if (i < j)
        {
          if (!this.kL) {
            return;
          }
          if (this.kH.contains(localArrayList2.get(i))) {
            ((GooglePlayServicesClient.OnConnectionFailedListener)localArrayList2.get(i)).onConnectionFailed(paramConnectionResult);
          }
        }
        else
        {
          this.kI = false;
          return;
        }
      }
      i += 1;
    }
  }
  
  public final void a(de<T>.b<?> paramde)
  {
    synchronized (this.kJ)
    {
      this.kJ.add(paramde);
      this.mHandler.sendMessage(this.mHandler.obtainMessage(2, paramde));
      return;
    }
  }
  
  protected abstract void a(dj paramdj, d paramd)
    throws RemoteException;
  
  protected void a(String... paramVarArgs) {}
  
  public final String[] aY()
  {
    return this.is;
  }
  
  protected void aZ()
  {
    boolean bool2 = true;
    for (;;)
    {
      int i;
      synchronized (this.kE)
      {
        if (!this.kG)
        {
          bool1 = true;
          dm.k(bool1);
          this.mHandler.removeMessages(4);
          this.kG = true;
          if (this.kF.size() != 0) {
            break label166;
          }
          bool1 = bool2;
          dm.k(bool1);
          Bundle localBundle = ba();
          ArrayList localArrayList2 = this.kE;
          int j = localArrayList2.size();
          i = 0;
          if ((i >= j) || (!this.kL) || (!isConnected()))
          {
            this.kF.clear();
            this.kG = false;
            return;
          }
          this.kF.size();
          if (this.kF.contains(localArrayList2.get(i))) {
            break label171;
          }
          ((GooglePlayServicesClient.ConnectionCallbacks)localArrayList2.get(i)).onConnected(localBundle);
        }
      }
      boolean bool1 = false;
      continue;
      label166:
      bool1 = false;
      continue;
      label171:
      i += 1;
    }
  }
  
  protected abstract String ag();
  
  protected abstract String ah();
  
  protected Bundle ba()
  {
    return null;
  }
  
  protected final void bb()
  {
    this.mHandler.removeMessages(4);
    for (;;)
    {
      int i;
      synchronized (this.kE)
      {
        this.kG = true;
        ArrayList localArrayList2 = this.kE;
        int j = localArrayList2.size();
        i = 0;
        if ((i >= j) || (!this.kL))
        {
          this.kG = false;
          return;
        }
        if (this.kE.contains(localArrayList2.get(i))) {
          ((GooglePlayServicesClient.ConnectionCallbacks)localArrayList2.get(i)).onDisconnected();
        }
      }
      i += 1;
    }
  }
  
  protected final void bc()
  {
    if (!isConnected()) {
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
  }
  
  protected final T bd()
  {
    bc();
    return this.kD;
  }
  
  public void connect()
  {
    this.kL = true;
    do
    {
      synchronized (this.kN)
      {
        this.kM = true;
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.mContext);
        if (i != 0)
        {
          this.mHandler.sendMessage(this.mHandler.obtainMessage(3, Integer.valueOf(i)));
          return;
        }
      }
      if (this.kK != null)
      {
        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
        this.kD = null;
        df.s(this.mContext).b(ag(), this.kK);
      }
      this.kK = new e();
    } while (df.s(this.mContext).a(ag(), this.kK));
    Log.e("GmsClient", "unable to connect to service: " + ag());
    this.mHandler.sendMessage(this.mHandler.obtainMessage(3, Integer.valueOf(9)));
  }
  
  public void disconnect()
  {
    this.kL = false;
    synchronized (this.kN)
    {
      this.kM = false;
    }
    synchronized (this.kJ)
    {
      int j = this.kJ.size();
      int i = 0;
      while (i < j)
      {
        ((b)this.kJ.get(i)).bf();
        i += 1;
        continue;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
      this.kJ.clear();
      this.kD = null;
      if (this.kK != null)
      {
        df.s(this.mContext).b(ag(), this.kK);
        this.kK = null;
      }
      return;
    }
  }
  
  public final Context getContext()
  {
    return this.mContext;
  }
  
  public boolean isConnected()
  {
    return this.kD != null;
  }
  
  public boolean isConnecting()
  {
    synchronized (this.kN)
    {
      boolean bool = this.kM;
      return bool;
    }
  }
  
  public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    dm.e(paramConnectionCallbacks);
    synchronized (this.kE)
    {
      boolean bool = this.kE.contains(paramConnectionCallbacks);
      return bool;
    }
  }
  
  public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    dm.e(paramOnConnectionFailedListener);
    synchronized (this.kH)
    {
      boolean bool = this.kH.contains(paramOnConnectionFailedListener);
      return bool;
    }
  }
  
  protected abstract T p(IBinder paramIBinder);
  
  public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    dm.e(paramConnectionCallbacks);
    synchronized (this.kE)
    {
      if (this.kE.contains(paramConnectionCallbacks))
      {
        Log.w("GmsClient", "registerConnectionCallbacks(): listener " + paramConnectionCallbacks + " is already registered");
        if (isConnected()) {
          this.mHandler.sendMessage(this.mHandler.obtainMessage(4, paramConnectionCallbacks));
        }
        return;
      }
      if (this.kG) {
        this.kE = new ArrayList(this.kE);
      }
      this.kE.add(paramConnectionCallbacks);
    }
  }
  
  public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    dm.e(paramOnConnectionFailedListener);
    synchronized (this.kH)
    {
      if (this.kH.contains(paramOnConnectionFailedListener))
      {
        Log.w("GmsClient", "registerConnectionFailedListener(): listener " + paramOnConnectionFailedListener + " is already registered");
        return;
      }
      if (this.kI) {
        this.kH = new ArrayList(this.kH);
      }
      this.kH.add(paramOnConnectionFailedListener);
    }
  }
  
  protected final void u(IBinder paramIBinder)
  {
    try
    {
      a(dj.a.w(paramIBinder), new d(this));
      return;
    }
    catch (RemoteException paramIBinder)
    {
      Log.w("GmsClient", "service died");
    }
  }
  
  public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    dm.e(paramConnectionCallbacks);
    synchronized (this.kE)
    {
      if (this.kE != null)
      {
        if (this.kG) {
          this.kE = new ArrayList(this.kE);
        }
        if (this.kE.remove(paramConnectionCallbacks)) {
          break label87;
        }
        Log.w("GmsClient", "unregisterConnectionCallbacks(): listener " + paramConnectionCallbacks + " not found");
      }
      label87:
      while ((!this.kG) || (this.kF.contains(paramConnectionCallbacks))) {
        return;
      }
      this.kF.add(paramConnectionCallbacks);
    }
  }
  
  public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    dm.e(paramOnConnectionFailedListener);
    synchronized (this.kH)
    {
      if (this.kH != null)
      {
        if (this.kI) {
          this.kH = new ArrayList(this.kH);
        }
        if (!this.kH.remove(paramOnConnectionFailedListener)) {
          Log.w("GmsClient", "unregisterConnectionFailedListener(): listener " + paramOnConnectionFailedListener + " not found");
        }
      }
      return;
    }
  }
  
  final class a
    extends Handler
  {
    public a(Looper paramLooper)
    {
      super();
    }
    
    public void handleMessage(Message paramMessage)
    {
      if ((paramMessage.what == 1) && (!de.this.isConnecting()))
      {
        paramMessage = (de.b)paramMessage.obj;
        paramMessage.aF();
        paramMessage.unregister();
        return;
      }
      synchronized (de.a(de.this))
      {
        de.this.kM = false;
        if (paramMessage.what == 3)
        {
          de.this.a(new ConnectionResult(((Integer)paramMessage.obj).intValue(), null));
          return;
        }
      }
      if (paramMessage.what == 4) {
        synchronized (de.b(de.this))
        {
          if ((de.this.kL) && (de.this.isConnected()) && (de.b(de.this).contains(paramMessage.obj))) {
            ((GooglePlayServicesClient.ConnectionCallbacks)paramMessage.obj).onConnected(de.this.ba());
          }
          return;
        }
      }
      if ((paramMessage.what == 2) && (!de.this.isConnected()))
      {
        paramMessage = (de.b)paramMessage.obj;
        paramMessage.aF();
        paramMessage.unregister();
        return;
      }
      if ((paramMessage.what == 2) || (paramMessage.what == 1))
      {
        ((de.b)paramMessage.obj).be();
        return;
      }
      Log.wtf("GmsClient", "Don't know how to handle this message.");
    }
  }
  
  protected abstract class b<TListener>
  {
    private boolean kQ;
    private TListener mListener;
    
    public b()
    {
      Object localObject;
      this.mListener = localObject;
      this.kQ = false;
    }
    
    protected abstract void a(TListener paramTListener);
    
    protected abstract void aF();
    
    /* Error */
    public void be()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield 24	com/google/android/gms/internal/de$b:mListener	Ljava/lang/Object;
      //   6: astore_1
      //   7: aload_0
      //   8: getfield 26	com/google/android/gms/internal/de$b:kQ	Z
      //   11: ifeq +33 -> 44
      //   14: ldc 37
      //   16: new 39	java/lang/StringBuilder
      //   19: dup
      //   20: invokespecial 40	java/lang/StringBuilder:<init>	()V
      //   23: ldc 42
      //   25: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   28: aload_0
      //   29: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   32: ldc 51
      //   34: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   37: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   40: invokestatic 61	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
      //   43: pop
      //   44: aload_0
      //   45: monitorexit
      //   46: aload_1
      //   47: ifnull +34 -> 81
      //   50: aload_0
      //   51: aload_1
      //   52: invokevirtual 63	com/google/android/gms/internal/de$b:a	(Ljava/lang/Object;)V
      //   55: aload_0
      //   56: monitorenter
      //   57: aload_0
      //   58: iconst_1
      //   59: putfield 26	com/google/android/gms/internal/de$b:kQ	Z
      //   62: aload_0
      //   63: monitorexit
      //   64: aload_0
      //   65: invokevirtual 66	com/google/android/gms/internal/de$b:unregister	()V
      //   68: return
      //   69: astore_1
      //   70: aload_0
      //   71: monitorexit
      //   72: aload_1
      //   73: athrow
      //   74: astore_1
      //   75: aload_0
      //   76: invokevirtual 68	com/google/android/gms/internal/de$b:aF	()V
      //   79: aload_1
      //   80: athrow
      //   81: aload_0
      //   82: invokevirtual 68	com/google/android/gms/internal/de$b:aF	()V
      //   85: goto -30 -> 55
      //   88: astore_1
      //   89: aload_0
      //   90: monitorexit
      //   91: aload_1
      //   92: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	93	0	this	b
      //   6	46	1	localObject1	Object
      //   69	4	1	localObject2	Object
      //   74	6	1	localRuntimeException	RuntimeException
      //   88	4	1	localObject3	Object
      // Exception table:
      //   from	to	target	type
      //   2	44	69	finally
      //   44	46	69	finally
      //   70	72	69	finally
      //   50	55	74	java/lang/RuntimeException
      //   57	64	88	finally
      //   89	91	88	finally
    }
    
    public void bf()
    {
      try
      {
        this.mListener = null;
        return;
      }
      finally {}
    }
    
    public void unregister()
    {
      bf();
      synchronized (de.c(de.this))
      {
        de.c(de.this).remove(this);
        return;
      }
    }
  }
  
  public abstract class c<TListener>
    extends de<T>.b<TListener>
  {
    private final d jf;
    
    public c(d paramd)
    {
      super(paramd);
      d locald;
      this.jf = locald;
    }
    
    protected final void a(TListener paramTListener)
    {
      a(paramTListener, this.jf);
    }
    
    protected abstract void a(TListener paramTListener, d paramd);
    
    protected void aF()
    {
      if (this.jf != null) {
        this.jf.close();
      }
    }
  }
  
  public static final class d
    extends di.a
  {
    private de kR;
    
    public d(de paramde)
    {
      this.kR = paramde;
    }
    
    public void b(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    {
      dm.a("onPostInitComplete can be called only once per call to getServiceFromBroker", this.kR);
      this.kR.a(paramInt, paramIBinder, paramBundle);
      this.kR = null;
    }
  }
  
  final class e
    implements ServiceConnection
  {
    e() {}
    
    public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      de.this.u(paramIBinder);
    }
    
    public void onServiceDisconnected(ComponentName paramComponentName)
    {
      de.a(de.this, null);
      de.this.bb();
    }
  }
  
  protected final class f
    extends de<T>.b<Boolean>
  {
    public final Bundle kS;
    public final IBinder kT;
    public final int statusCode;
    
    public f(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    {
      super(Boolean.valueOf(true));
      this.statusCode = paramInt;
      this.kT = paramIBinder;
      this.kS = paramBundle;
    }
    
    protected void a(Boolean paramBoolean)
    {
      if (paramBoolean == null) {
        return;
      }
      switch (this.statusCode)
      {
      default: 
        if (this.kS == null) {
          break;
        }
      }
      for (paramBoolean = (PendingIntent)this.kS.getParcelable("pendingIntent");; paramBoolean = null)
      {
        if (de.e(de.this) != null)
        {
          df.s(de.f(de.this)).b(de.this.ag(), de.e(de.this));
          de.a(de.this, null);
        }
        de.a(de.this, null);
        de.this.a(new ConnectionResult(this.statusCode, paramBoolean));
        return;
        try
        {
          paramBoolean = this.kT.getInterfaceDescriptor();
          if (de.this.ah().equals(paramBoolean))
          {
            de.a(de.this, de.this.p(this.kT));
            if (de.d(de.this) != null)
            {
              de.this.aZ();
              return;
            }
          }
        }
        catch (RemoteException paramBoolean)
        {
          df.s(de.f(de.this)).b(de.this.ag(), de.e(de.this));
          de.a(de.this, null);
          de.a(de.this, null);
          de.this.a(new ConnectionResult(8, null));
          return;
        }
        throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
      }
    }
    
    protected void aF() {}
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */