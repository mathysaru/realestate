package com.google.android.gms.internal;

import android.app.Activity;
import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.ads.mediation.admob.AdMobServerParameters;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class az<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters>
  extends ax.a
{
  private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> fr;
  private final NETWORK_EXTRAS fs;
  
  public az(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> paramMediationAdapter, NETWORK_EXTRAS paramNETWORK_EXTRAS)
  {
    this.fr = paramMediationAdapter;
    this.fs = paramNETWORK_EXTRAS;
  }
  
  private SERVER_PARAMETERS a(String paramString, int paramInt)
    throws RemoteException
  {
    Object localObject1;
    Object localObject2;
    if (paramString != null) {
      try
      {
        localObject1 = new JSONObject(paramString);
        paramString = new HashMap(((JSONObject)localObject1).length());
        localObject2 = ((JSONObject)localObject1).keys();
        while (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          paramString.put(str, ((JSONObject)localObject1).getString(str));
        }
        localObject2 = this.fr.getServerParametersType();
      }
      catch (Throwable paramString)
      {
        cn.b("Could not get MediationServerParameters.", paramString);
        throw new RemoteException();
      }
    }
    for (;;)
    {
      localObject1 = null;
      if (localObject2 != null)
      {
        localObject1 = (MediationServerParameters)((Class)localObject2).newInstance();
        ((MediationServerParameters)localObject1).load(paramString);
      }
      if (!(localObject1 instanceof AdMobServerParameters)) {
        break;
      }
      ((AdMobServerParameters)localObject1).tagForChildDirectedTreatment = paramInt;
      return (SERVER_PARAMETERS)localObject1;
      paramString = new HashMap(0);
    }
    return (SERVER_PARAMETERS)localObject1;
  }
  
  public void a(b paramb, v paramv, String paramString, ay paramay)
    throws RemoteException
  {
    if (!(this.fr instanceof MediationInterstitialAdapter))
    {
      cn.q("MediationAdapter is not a MediationInterstitialAdapter: " + this.fr.getClass().getCanonicalName());
      throw new RemoteException();
    }
    cn.m("Requesting interstitial ad from adapter.");
    try
    {
      ((MediationInterstitialAdapter)this.fr).requestInterstitialAd(new ba(paramay), (Activity)c.b(paramb), a(paramString, paramv.tagForChildDirectedTreatment), bb.e(paramv), this.fs);
      return;
    }
    catch (Throwable paramb)
    {
      cn.b("Could not request interstitial ad from adapter.", paramb);
      throw new RemoteException();
    }
  }
  
  public void a(b paramb, x paramx, v paramv, String paramString, ay paramay)
    throws RemoteException
  {
    if (!(this.fr instanceof MediationBannerAdapter))
    {
      cn.q("MediationAdapter is not a MediationBannerAdapter: " + this.fr.getClass().getCanonicalName());
      throw new RemoteException();
    }
    cn.m("Requesting banner ad from adapter.");
    try
    {
      ((MediationBannerAdapter)this.fr).requestBannerAd(new ba(paramay), (Activity)c.b(paramb), a(paramString, paramv.tagForChildDirectedTreatment), bb.a(paramx), bb.e(paramv), this.fs);
      return;
    }
    catch (Throwable paramb)
    {
      cn.b("Could not request banner ad from adapter.", paramb);
      throw new RemoteException();
    }
  }
  
  public void destroy()
    throws RemoteException
  {
    try
    {
      this.fr.destroy();
      return;
    }
    catch (Throwable localThrowable)
    {
      cn.b("Could not destroy adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public b getView()
    throws RemoteException
  {
    if (!(this.fr instanceof MediationBannerAdapter))
    {
      cn.q("MediationAdapter is not a MediationBannerAdapter: " + this.fr.getClass().getCanonicalName());
      throw new RemoteException();
    }
    try
    {
      b localb = c.g(((MediationBannerAdapter)this.fr).getBannerView());
      return localb;
    }
    catch (Throwable localThrowable)
    {
      cn.b("Could not get banner view from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public void showInterstitial()
    throws RemoteException
  {
    if (!(this.fr instanceof MediationInterstitialAdapter))
    {
      cn.q("MediationAdapter is not a MediationInterstitialAdapter: " + this.fr.getClass().getCanonicalName());
      throw new RemoteException();
    }
    cn.m("Showing interstitial from adapter.");
    try
    {
      ((MediationInterstitialAdapter)this.fr).showInterstitial();
      return;
    }
    catch (Throwable localThrowable)
    {
      cn.b("Could not show interstitial from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */