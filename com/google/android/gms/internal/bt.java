package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;

public class bt
  extends de<by>
{
  private final int gz;
  
  public bt(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener, int paramInt)
  {
    super(paramContext, paramConnectionCallbacks, paramOnConnectionFailedListener, new String[0]);
    this.gz = paramInt;
  }
  
  protected void a(dj paramdj, de.d paramd)
    throws RemoteException
  {
    Bundle localBundle = new Bundle();
    paramdj.g(paramd, this.gz, getContext().getPackageName(), localBundle);
  }
  
  protected String ag()
  {
    return "com.google.android.gms.ads.service.START";
  }
  
  protected String ah()
  {
    return "com.google.android.gms.ads.internal.request.IAdRequestService";
  }
  
  public by ai()
  {
    return (by)super.bd();
  }
  
  protected by o(IBinder paramIBinder)
  {
    return by.a.q(paramIBinder);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */