package com.google.android.gms.internal;

import android.util.Log;

public final class dh
{
  private final String li;
  
  public dh(String paramString)
  {
    this.li = ((String)dm.e(paramString));
  }
  
  public void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (x(6)) {
      Log.e(paramString1, paramString2, paramThrowable);
    }
  }
  
  public void b(String paramString1, String paramString2)
  {
    if (x(3)) {
      Log.d(paramString1, paramString2);
    }
  }
  
  public void c(String paramString1, String paramString2)
  {
    if (x(5)) {
      Log.w(paramString1, paramString2);
    }
  }
  
  public void d(String paramString1, String paramString2)
  {
    if (x(6)) {
      Log.e(paramString1, paramString2);
    }
  }
  
  public void e(String paramString1, String paramString2)
  {
    if (x(4)) {}
  }
  
  public boolean x(int paramInt)
  {
    return Log.isLoggable(this.li, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */