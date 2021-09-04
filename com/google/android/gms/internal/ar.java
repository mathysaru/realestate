package com.google.android.gms.internal;

public final class ar
  extends ay.a
{
  private final Object eJ = new Object();
  private at.a fb;
  private aq fc;
  
  public void a(aq paramaq)
  {
    synchronized (this.eJ)
    {
      this.fc = paramaq;
      return;
    }
  }
  
  public void a(at.a parama)
  {
    synchronized (this.eJ)
    {
      this.fb = parama;
      return;
    }
  }
  
  public void onAdClosed()
  {
    synchronized (this.eJ)
    {
      if (this.fc != null) {
        this.fc.E();
      }
      return;
    }
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    for (;;)
    {
      synchronized (this.eJ)
      {
        if (this.fb != null)
        {
          if (paramInt == 3)
          {
            paramInt = 1;
            this.fb.d(paramInt);
            this.fb = null;
          }
        }
        else {
          return;
        }
      }
      paramInt = 2;
    }
  }
  
  public void onAdLeftApplication()
  {
    synchronized (this.eJ)
    {
      if (this.fc != null) {
        this.fc.F();
      }
      return;
    }
  }
  
  public void onAdLoaded()
  {
    synchronized (this.eJ)
    {
      if (this.fb != null)
      {
        this.fb.d(0);
        this.fb = null;
        return;
      }
      if (this.fc != null) {
        this.fc.H();
      }
      return;
    }
  }
  
  public void onAdOpened()
  {
    synchronized (this.eJ)
    {
      if (this.fc != null) {
        this.fc.G();
      }
      return;
    }
  }
  
  public void y()
  {
    synchronized (this.eJ)
    {
      if (this.fc != null) {
        this.fc.D();
      }
      return;
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */