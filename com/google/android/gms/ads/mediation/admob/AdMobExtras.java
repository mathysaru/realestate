package com.google.android.gms.ads.mediation.admob;

import android.os.Bundle;
import com.google.ads.mediation.NetworkExtras;

public final class AdMobExtras
  implements NetworkExtras
{
  private final Bundle im;
  
  public AdMobExtras(Bundle paramBundle)
  {
    if (paramBundle != null) {}
    for (paramBundle = new Bundle(paramBundle);; paramBundle = null)
    {
      this.im = paramBundle;
      return;
    }
  }
  
  public Bundle getExtras()
  {
    return this.im;
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\admob\AdMobExtras.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */