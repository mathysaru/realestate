package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.appstate.AppState;
import com.google.android.gms.appstate.AppStateBuffer;
import com.google.android.gms.appstate.OnSignOutCompleteListener;
import com.google.android.gms.appstate.OnStateDeletedListener;
import com.google.android.gms.appstate.OnStateListLoadedListener;
import com.google.android.gms.appstate.OnStateLoadedListener;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.data.d;

public final class cw
  extends de<cy>
{
  private final String it;
  
  public cw(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString, String[] paramArrayOfString)
  {
    super(paramContext, paramConnectionCallbacks, paramOnConnectionFailedListener, paramArrayOfString);
    this.it = ((String)dm.e(paramString));
  }
  
  public void a(OnStateLoadedListener paramOnStateLoadedListener, int paramInt, byte[] paramArrayOfByte)
  {
    if (paramOnStateLoadedListener == null) {}
    for (paramOnStateLoadedListener = null;; paramOnStateLoadedListener = new e(paramOnStateLoadedListener)) {
      try
      {
        ((cy)bd()).a(paramOnStateLoadedListener, paramInt, paramArrayOfByte);
        return;
      }
      catch (RemoteException paramOnStateLoadedListener)
      {
        Log.w("AppStateClient", "service died");
      }
    }
  }
  
  protected void a(dj paramdj, de.d paramd)
    throws RemoteException
  {
    paramdj.a(paramd, 4030500, getContext().getPackageName(), this.it, aY());
  }
  
  protected void a(String... paramVarArgs)
  {
    int i = 0;
    boolean bool = false;
    while (i < paramVarArgs.length)
    {
      if (paramVarArgs[i].equals("https://www.googleapis.com/auth/appstate")) {
        bool = true;
      }
      i += 1;
    }
    dm.a(bool, String.format("AppStateClient requires %s to function.", new Object[] { "https://www.googleapis.com/auth/appstate" }));
  }
  
  protected String ag()
  {
    return "com.google.android.gms.appstate.service.START";
  }
  
  protected String ah()
  {
    return "com.google.android.gms.appstate.internal.IAppStateService";
  }
  
  public void deleteState(OnStateDeletedListener paramOnStateDeletedListener, int paramInt)
  {
    try
    {
      ((cy)bd()).b(new a(paramOnStateDeletedListener), paramInt);
      return;
    }
    catch (RemoteException paramOnStateDeletedListener)
    {
      Log.w("AppStateClient", "service died");
    }
  }
  
  public int getMaxNumKeys()
  {
    try
    {
      int i = ((cy)bd()).getMaxNumKeys();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("AppStateClient", "service died");
    }
    return 2;
  }
  
  public int getMaxStateSize()
  {
    try
    {
      int i = ((cy)bd()).getMaxStateSize();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("AppStateClient", "service died");
    }
    return 2;
  }
  
  public void listStates(OnStateListLoadedListener paramOnStateListLoadedListener)
  {
    try
    {
      ((cy)bd()).a(new c(paramOnStateListLoadedListener));
      return;
    }
    catch (RemoteException paramOnStateListLoadedListener)
    {
      Log.w("AppStateClient", "service died");
    }
  }
  
  public void loadState(OnStateLoadedListener paramOnStateLoadedListener, int paramInt)
  {
    try
    {
      ((cy)bd()).a(new e(paramOnStateLoadedListener), paramInt);
      return;
    }
    catch (RemoteException paramOnStateLoadedListener)
    {
      Log.w("AppStateClient", "service died");
    }
  }
  
  protected cy r(IBinder paramIBinder)
  {
    return cy.a.t(paramIBinder);
  }
  
  public void resolveState(OnStateLoadedListener paramOnStateLoadedListener, int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      ((cy)bd()).a(new e(paramOnStateLoadedListener), paramInt, paramString, paramArrayOfByte);
      return;
    }
    catch (RemoteException paramOnStateLoadedListener)
    {
      Log.w("AppStateClient", "service died");
    }
  }
  
  public void signOut(OnSignOutCompleteListener paramOnSignOutCompleteListener)
  {
    if (paramOnSignOutCompleteListener == null) {}
    for (paramOnSignOutCompleteListener = null;; paramOnSignOutCompleteListener = new g(paramOnSignOutCompleteListener)) {
      try
      {
        ((cy)bd()).b(paramOnSignOutCompleteListener);
        return;
      }
      catch (RemoteException paramOnSignOutCompleteListener)
      {
        Log.w("AppStateClient", "service died");
      }
    }
  }
  
  final class a
    extends cv
  {
    private final OnStateDeletedListener iA;
    
    public a(OnStateDeletedListener paramOnStateDeletedListener)
    {
      this.iA = ((OnStateDeletedListener)dm.a(paramOnStateDeletedListener, "Listener must not be null"));
    }
    
    public void onStateDeleted(int paramInt1, int paramInt2)
    {
      cw.this.a(new cw.b(cw.this, this.iA, paramInt1, paramInt2));
    }
  }
  
  final class b
    extends de<cy>.b<OnStateDeletedListener>
  {
    private final int iC;
    private final int iD;
    
    public b(OnStateDeletedListener paramOnStateDeletedListener, int paramInt1, int paramInt2)
    {
      super(paramOnStateDeletedListener);
      this.iC = paramInt1;
      this.iD = paramInt2;
    }
    
    public void a(OnStateDeletedListener paramOnStateDeletedListener)
    {
      paramOnStateDeletedListener.onStateDeleted(this.iC, this.iD);
    }
    
    protected void aF() {}
  }
  
  final class c
    extends cv
  {
    private final OnStateListLoadedListener iE;
    
    public c(OnStateListLoadedListener paramOnStateListLoadedListener)
    {
      this.iE = ((OnStateListLoadedListener)dm.a(paramOnStateListLoadedListener, "Listener must not be null"));
    }
    
    public void a(d paramd)
    {
      cw.this.a(new cw.d(cw.this, this.iE, paramd));
    }
  }
  
  final class d
    extends de<cy>.c<OnStateListLoadedListener>
  {
    public d(OnStateListLoadedListener paramOnStateListLoadedListener, d paramd)
    {
      super(paramOnStateListLoadedListener, paramd);
    }
    
    public void a(OnStateListLoadedListener paramOnStateListLoadedListener, d paramd)
    {
      paramOnStateListLoadedListener.onStateListLoaded(paramd.getStatusCode(), new AppStateBuffer(paramd));
    }
  }
  
  final class e
    extends cv
  {
    private final OnStateLoadedListener iF;
    
    public e(OnStateLoadedListener paramOnStateLoadedListener)
    {
      this.iF = ((OnStateLoadedListener)dm.a(paramOnStateLoadedListener, "Listener must not be null"));
    }
    
    public void a(int paramInt, d paramd)
    {
      cw.this.a(new cw.f(cw.this, this.iF, paramInt, paramd));
    }
  }
  
  final class f
    extends de<cy>.c<OnStateLoadedListener>
  {
    private final int iD;
    
    public f(OnStateLoadedListener paramOnStateLoadedListener, int paramInt, d paramd)
    {
      super(paramOnStateLoadedListener, paramd);
      this.iD = paramInt;
    }
    
    public void a(OnStateLoadedListener paramOnStateLoadedListener, d paramd)
    {
      Object localObject = null;
      AppStateBuffer localAppStateBuffer = new AppStateBuffer(paramd);
      for (;;)
      {
        int i;
        try
        {
          if (localAppStateBuffer.getCount() <= 0) {
            break label112;
          }
          localObject = localAppStateBuffer.get(0);
          str = ((AppState)localObject).getConflictVersion();
          arrayOfByte = ((AppState)localObject).getLocalData();
          localObject = ((AppState)localObject).getConflictData();
          localAppStateBuffer.close();
          i = paramd.getStatusCode();
          if (i == 2000)
          {
            paramOnStateLoadedListener.onStateConflict(this.iD, str, arrayOfByte, (byte[])localObject);
            return;
          }
        }
        finally
        {
          localAppStateBuffer.close();
        }
        paramOnStateLoadedListener.onStateLoaded(i, this.iD, arrayOfByte);
        return;
        label112:
        byte[] arrayOfByte = null;
        String str = null;
      }
    }
  }
  
  final class g
    extends cv
  {
    private final OnSignOutCompleteListener iG;
    
    public g(OnSignOutCompleteListener paramOnSignOutCompleteListener)
    {
      this.iG = ((OnSignOutCompleteListener)dm.a(paramOnSignOutCompleteListener, "Listener must not be null"));
    }
    
    public void onSignOutComplete()
    {
      cw.this.a(new cw.h(cw.this, this.iG));
    }
  }
  
  final class h
    extends de<cy>.b<OnSignOutCompleteListener>
  {
    public h(OnSignOutCompleteListener paramOnSignOutCompleteListener)
    {
      super(paramOnSignOutCompleteListener);
    }
    
    public void a(OnSignOutCompleteListener paramOnSignOutCompleteListener)
    {
      paramOnSignOutCompleteListener.onSignOutComplete();
    }
    
    protected void aF() {}
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */