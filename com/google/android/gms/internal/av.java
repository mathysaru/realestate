package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationServerParameters;
import java.util.Map;

public final class av
  extends aw.a
{
  private Map<Class<? extends com.google.android.gms.ads.mediation.NetworkExtras>, com.google.android.gms.ads.mediation.NetworkExtras> fq;
  
  private <NETWORK_EXTRAS extends com.google.ads.mediation.NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> ax h(String paramString)
    throws RemoteException
  {
    try
    {
      Object localObject = (MediationAdapter)Class.forName(paramString).newInstance();
      localObject = new az((MediationAdapter)localObject, (com.google.ads.mediation.NetworkExtras)this.fq.get(((MediationAdapter)localObject).getAdditionalParametersType()));
      return (ax)localObject;
    }
    catch (Throwable localThrowable)
    {
      cn.q("Could not instantiate mediation adapter: " + paramString + ". " + localThrowable.getMessage());
      throw new RemoteException();
    }
  }
  
  public void c(Map<Class<? extends com.google.android.gms.ads.mediation.NetworkExtras>, com.google.android.gms.ads.mediation.NetworkExtras> paramMap)
  {
    this.fq = paramMap;
  }
  
  public ax g(String paramString)
    throws RemoteException
  {
    return h(paramString);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */