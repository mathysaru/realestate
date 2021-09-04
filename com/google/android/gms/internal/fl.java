package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.data.d;
import com.google.android.gms.plus.PlusClient.OnAccessRevokedListener;
import com.google.android.gms.plus.PlusClient.OnMomentsLoadedListener;
import com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class fl
  extends de<fk>
  implements GooglePlayServicesClient
{
  private Person ro;
  private fn rp;
  
  public fl(Context paramContext, fn paramfn, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramConnectionCallbacks, paramOnConnectionFailedListener, paramfn.cZ());
    this.rp = paramfn;
  }
  
  public boolean Y(String paramString)
  {
    return Arrays.asList(aY()).contains(paramString);
  }
  
  protected void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    if ((paramInt == 0) && (paramBundle != null) && (paramBundle.containsKey("loaded_person"))) {
      this.ro = fv.e(paramBundle.getByteArray("loaded_person"));
    }
    super.a(paramInt, paramIBinder, paramBundle);
  }
  
  protected void a(dj paramdj, de.d paramd)
    throws RemoteException
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("client_id", this.rp.df());
    localBundle.putStringArray("request_visible_actions", this.rp.da());
    paramdj.a(paramd, 4030500, this.rp.dd(), this.rp.dc(), aY(), this.rp.getAccountName(), localBundle);
  }
  
  public void a(PlusClient.OnPeopleLoadedListener paramOnPeopleLoadedListener, Collection<String> paramCollection)
  {
    bc();
    paramOnPeopleLoadedListener = new c(paramOnPeopleLoadedListener);
    try
    {
      ((fk)bd()).a(paramOnPeopleLoadedListener, new ArrayList(paramCollection));
      return;
    }
    catch (RemoteException paramCollection)
    {
      paramOnPeopleLoadedListener.a(d.r(8), null);
    }
  }
  
  public void a(PlusClient.OnPeopleLoadedListener paramOnPeopleLoadedListener, String[] paramArrayOfString)
  {
    a(paramOnPeopleLoadedListener, Arrays.asList(paramArrayOfString));
  }
  
  protected String ag()
  {
    return "com.google.android.gms.plus.service.START";
  }
  
  protected String ah()
  {
    return "com.google.android.gms.plus.internal.IPlusService";
  }
  
  protected fk ar(IBinder paramIBinder)
  {
    return fk.a.aq(paramIBinder);
  }
  
  public void clearDefaultAccount()
  {
    bc();
    try
    {
      this.ro = null;
      ((fk)bd()).clearDefaultAccount();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  public String getAccountName()
  {
    bc();
    try
    {
      String str = ((fk)bd()).getAccountName();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  public Person getCurrentPerson()
  {
    bc();
    return this.ro;
  }
  
  public void loadMoments(PlusClient.OnMomentsLoadedListener paramOnMomentsLoadedListener)
  {
    loadMoments(paramOnMomentsLoadedListener, 20, null, null, null, "me");
  }
  
  public void loadMoments(PlusClient.OnMomentsLoadedListener paramOnMomentsLoadedListener, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3)
  {
    bc();
    if (paramOnMomentsLoadedListener != null) {}
    for (paramOnMomentsLoadedListener = new a(paramOnMomentsLoadedListener);; paramOnMomentsLoadedListener = null) {
      try
      {
        ((fk)bd()).a(paramOnMomentsLoadedListener, paramInt, paramString1, paramUri, paramString2, paramString3);
        return;
      }
      catch (RemoteException paramString1)
      {
        paramOnMomentsLoadedListener.a(d.r(8), null, null);
      }
    }
  }
  
  public void loadVisiblePeople(PlusClient.OnPeopleLoadedListener paramOnPeopleLoadedListener, int paramInt, String paramString)
  {
    bc();
    paramOnPeopleLoadedListener = new c(paramOnPeopleLoadedListener);
    try
    {
      ((fk)bd()).a(paramOnPeopleLoadedListener, 1, paramInt, -1, paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      paramOnPeopleLoadedListener.a(d.r(8), null);
    }
  }
  
  public void loadVisiblePeople(PlusClient.OnPeopleLoadedListener paramOnPeopleLoadedListener, String paramString)
  {
    loadVisiblePeople(paramOnPeopleLoadedListener, 0, paramString);
  }
  
  public void removeMoment(String paramString)
  {
    bc();
    try
    {
      ((fk)bd()).removeMoment(paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      throw new IllegalStateException(paramString);
    }
  }
  
  public void revokeAccessAndDisconnect(PlusClient.OnAccessRevokedListener paramOnAccessRevokedListener)
  {
    bc();
    clearDefaultAccount();
    paramOnAccessRevokedListener = new e(paramOnAccessRevokedListener);
    try
    {
      ((fk)bd()).b(paramOnAccessRevokedListener);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      paramOnAccessRevokedListener.b(8, null);
    }
  }
  
  public void writeMoment(Moment paramMoment)
  {
    bc();
    try
    {
      paramMoment = ec.a((fs)paramMoment);
      ((fk)bd()).a(paramMoment);
      return;
    }
    catch (RemoteException paramMoment)
    {
      throw new IllegalStateException(paramMoment);
    }
  }
  
  final class a
    extends fg
  {
    private final PlusClient.OnMomentsLoadedListener rq;
    
    public a(PlusClient.OnMomentsLoadedListener paramOnMomentsLoadedListener)
    {
      this.rq = paramOnMomentsLoadedListener;
    }
    
    public void a(d paramd, String paramString1, String paramString2)
    {
      if (paramd.aM() != null) {}
      for (Object localObject = (PendingIntent)paramd.aM().getParcelable("pendingIntent");; localObject = null)
      {
        localObject = new ConnectionResult(paramd.getStatusCode(), (PendingIntent)localObject);
        if ((!((ConnectionResult)localObject).isSuccess()) && (paramd != null))
        {
          if (!paramd.isClosed()) {
            paramd.close();
          }
          paramd = null;
        }
        for (;;)
        {
          fl.this.a(new fl.b(fl.this, this.rq, (ConnectionResult)localObject, paramd, paramString1, paramString2));
          return;
        }
      }
    }
  }
  
  final class b
    extends de<fk>.c<PlusClient.OnMomentsLoadedListener>
  {
    private final ConnectionResult rs;
    private final String rt;
    private final String ru;
    
    public b(PlusClient.OnMomentsLoadedListener paramOnMomentsLoadedListener, ConnectionResult paramConnectionResult, d paramd, String paramString1, String paramString2)
    {
      super(paramOnMomentsLoadedListener, paramd);
      this.rs = paramConnectionResult;
      this.rt = paramString1;
      this.ru = paramString2;
    }
    
    protected void a(PlusClient.OnMomentsLoadedListener paramOnMomentsLoadedListener, d paramd)
    {
      ConnectionResult localConnectionResult = this.rs;
      if (paramd != null) {}
      for (paramd = new MomentBuffer(paramd);; paramd = null)
      {
        paramOnMomentsLoadedListener.onMomentsLoaded(localConnectionResult, paramd, this.rt, this.ru);
        return;
      }
    }
  }
  
  final class c
    extends fg
  {
    private final PlusClient.OnPeopleLoadedListener rv;
    
    public c(PlusClient.OnPeopleLoadedListener paramOnPeopleLoadedListener)
    {
      this.rv = paramOnPeopleLoadedListener;
    }
    
    public void a(d paramd, String paramString)
    {
      if (paramd.aM() != null) {}
      for (Object localObject = (PendingIntent)paramd.aM().getParcelable("pendingIntent");; localObject = null)
      {
        localObject = new ConnectionResult(paramd.getStatusCode(), (PendingIntent)localObject);
        if ((!((ConnectionResult)localObject).isSuccess()) && (paramd != null))
        {
          if (!paramd.isClosed()) {
            paramd.close();
          }
          paramd = null;
        }
        for (;;)
        {
          fl.this.a(new fl.d(fl.this, this.rv, (ConnectionResult)localObject, paramd, paramString));
          return;
        }
      }
    }
  }
  
  final class d
    extends de<fk>.c<PlusClient.OnPeopleLoadedListener>
  {
    private final ConnectionResult rs;
    private final String rt;
    
    public d(PlusClient.OnPeopleLoadedListener paramOnPeopleLoadedListener, ConnectionResult paramConnectionResult, d paramd, String paramString)
    {
      super(paramOnPeopleLoadedListener, paramd);
      this.rs = paramConnectionResult;
      this.rt = paramString;
    }
    
    protected void a(PlusClient.OnPeopleLoadedListener paramOnPeopleLoadedListener, d paramd)
    {
      ConnectionResult localConnectionResult = this.rs;
      if (paramd != null) {}
      for (paramd = new PersonBuffer(paramd);; paramd = null)
      {
        paramOnPeopleLoadedListener.onPeopleLoaded(localConnectionResult, paramd, this.rt);
        return;
      }
    }
  }
  
  final class e
    extends fg
  {
    private final PlusClient.OnAccessRevokedListener rw;
    
    public e(PlusClient.OnAccessRevokedListener paramOnAccessRevokedListener)
    {
      this.rw = paramOnAccessRevokedListener;
    }
    
    public void b(int paramInt, Bundle paramBundle)
    {
      PendingIntent localPendingIntent = null;
      if (paramBundle != null) {
        localPendingIntent = (PendingIntent)paramBundle.getParcelable("pendingIntent");
      }
      paramBundle = new ConnectionResult(paramInt, localPendingIntent);
      fl.this.a(new fl.f(fl.this, this.rw, paramBundle));
    }
  }
  
  final class f
    extends de<fk>.b<PlusClient.OnAccessRevokedListener>
  {
    private final ConnectionResult rs;
    
    public f(PlusClient.OnAccessRevokedListener paramOnAccessRevokedListener, ConnectionResult paramConnectionResult)
    {
      super(paramOnAccessRevokedListener);
      this.rs = paramConnectionResult;
    }
    
    protected void a(PlusClient.OnAccessRevokedListener paramOnAccessRevokedListener)
    {
      fl.this.disconnect();
      if (paramOnAccessRevokedListener != null) {
        paramOnAccessRevokedListener.onAccessRevoked(this.rs);
      }
    }
    
    protected void aF() {}
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\fl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */