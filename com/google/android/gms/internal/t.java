package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

public final class t
  extends ab.a
{
  private final AdListener dT;
  
  public t(AdListener paramAdListener)
  {
    this.dT = paramAdListener;
  }
  
  public void onAdClosed()
  {
    this.dT.onAdClosed();
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    this.dT.onAdFailedToLoad(paramInt);
  }
  
  public void onAdLeftApplication()
  {
    this.dT.onAdLeftApplication();
  }
  
  public void onAdLoaded()
  {
    this.dT.onAdLoaded();
  }
  
  public void onAdOpened()
  {
    this.dT.onAdOpened();
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */