package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;

public abstract class bs
  extends cg
{
  private final bu eI;
  private final br.a gx;
  
  public bs(bu parambu, br.a parama)
  {
    this.eI = parambu;
    this.gx = parama;
  }
  
  private static bw a(by paramby, bu parambu)
  {
    try
    {
      paramby = paramby.a(parambu);
      return paramby;
    }
    catch (RemoteException paramby)
    {
      cn.b("Could not fetch ad response from ad request service.", paramby);
    }
    return null;
  }
  
  /* Error */
  public final void ac()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 44	com/google/android/gms/internal/bs:af	()Lcom/google/android/gms/internal/by;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +27 -> 33
    //   9: new 46	com/google/android/gms/internal/bw
    //   12: dup
    //   13: iconst_0
    //   14: invokespecial 49	com/google/android/gms/internal/bw:<init>	(I)V
    //   17: astore_1
    //   18: aload_0
    //   19: invokevirtual 52	com/google/android/gms/internal/bs:ae	()V
    //   22: aload_0
    //   23: getfield 23	com/google/android/gms/internal/bs:gx	Lcom/google/android/gms/internal/br$a;
    //   26: aload_1
    //   27: invokeinterface 57 2 0
    //   32: return
    //   33: aload_1
    //   34: aload_0
    //   35: getfield 21	com/google/android/gms/internal/bs:eI	Lcom/google/android/gms/internal/bu;
    //   38: invokestatic 59	com/google/android/gms/internal/bs:a	(Lcom/google/android/gms/internal/by;Lcom/google/android/gms/internal/bu;)Lcom/google/android/gms/internal/bw;
    //   41: astore_2
    //   42: aload_2
    //   43: astore_1
    //   44: aload_2
    //   45: ifnonnull -27 -> 18
    //   48: new 46	com/google/android/gms/internal/bw
    //   51: dup
    //   52: iconst_0
    //   53: invokespecial 49	com/google/android/gms/internal/bw:<init>	(I)V
    //   56: astore_1
    //   57: goto -39 -> 18
    //   60: astore_1
    //   61: aload_0
    //   62: invokevirtual 52	com/google/android/gms/internal/bs:ae	()V
    //   65: aload_1
    //   66: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	this	bs
    //   4	53	1	localObject1	Object
    //   60	6	1	localObject2	Object
    //   41	4	2	localbw	bw
    // Exception table:
    //   from	to	target	type
    //   0	5	60	finally
    //   9	18	60	finally
    //   33	42	60	finally
    //   48	57	60	finally
  }
  
  public abstract void ae();
  
  public abstract by af();
  
  public final void onStop()
  {
    ae();
  }
  
  public static final class a
    extends bs
  {
    private final Context mContext;
    
    public a(Context paramContext, bu parambu, br.a parama)
    {
      super(parama);
      this.mContext = paramContext;
    }
    
    public void ae() {}
    
    public by af()
    {
      return bz.a(this.mContext, new am());
    }
  }
  
  public static final class b
    extends bs
    implements GooglePlayServicesClient.ConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener
  {
    private final Object eJ = new Object();
    private final br.a gx;
    private final bt gy;
    
    public b(Context paramContext, bu parambu, br.a parama)
    {
      super(parama);
      this.gx = parama;
      this.gy = new bt(paramContext, this, this, parambu.eg.hR);
      this.gy.connect();
    }
    
    public void ae()
    {
      synchronized (this.eJ)
      {
        if ((this.gy.isConnected()) || (this.gy.isConnecting())) {
          this.gy.disconnect();
        }
        return;
      }
    }
    
    public by af()
    {
      synchronized (this.eJ)
      {
        try
        {
          by localby = this.gy.ai();
          return localby;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          return null;
        }
      }
    }
    
    public void onConnected(Bundle paramBundle)
    {
      start();
    }
    
    public void onConnectionFailed(ConnectionResult paramConnectionResult)
    {
      this.gx.a(new bw(0));
    }
    
    public void onDisconnected()
    {
      cn.m("Disconnected from remote ad request service.");
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */