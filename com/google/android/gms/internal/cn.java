package com.google.android.gms.internal;

import android.util.Log;

public final class cn
{
  public static void a(String paramString, Throwable paramThrowable)
  {
    if (k(3)) {
      Log.d("Ads", paramString, paramThrowable);
    }
  }
  
  public static void b(String paramString, Throwable paramThrowable)
  {
    if (k(5)) {
      Log.w("Ads", paramString, paramThrowable);
    }
  }
  
  public static boolean k(int paramInt)
  {
    return ((paramInt >= 5) || (Log.isLoggable("Ads", paramInt))) && (paramInt != 2);
  }
  
  public static void m(String paramString)
  {
    if (k(3)) {
      Log.d("Ads", paramString);
    }
  }
  
  public static void n(String paramString)
  {
    if (k(6)) {
      Log.e("Ads", paramString);
    }
  }
  
  public static void o(String paramString)
  {
    if (k(4)) {
      Log.i("Ads", paramString);
    }
  }
  
  public static void p(String paramString)
  {
    if (k(2)) {
      Log.v("Ads", paramString);
    }
  }
  
  public static void q(String paramString)
  {
    if (k(5)) {
      Log.w("Ads", paramString);
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */