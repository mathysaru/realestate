package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.plus.PlusOneDummyView;

public final class fm
{
  private static Context pW;
  private static fi rx;
  
  public static View a(Context paramContext, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    if (paramString == null) {
      try
      {
        throw new NullPointerException();
      }
      catch (Exception paramString)
      {
        return new PlusOneDummyView(paramContext, paramInt1);
      }
    }
    paramString = (View)c.b(x(paramContext).a(c.g(paramContext), paramInt1, paramInt2, paramString, paramInt3));
    return paramString;
  }
  
  public static View a(Context paramContext, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      try
      {
        throw new NullPointerException();
      }
      catch (Exception paramString1)
      {
        return new PlusOneDummyView(paramContext, paramInt1);
      }
    }
    paramString1 = (View)c.b(x(paramContext).a(c.g(paramContext), paramInt1, paramInt2, paramString1, paramString2));
    return paramString1;
  }
  
  private static fi x(Context paramContext)
    throws fm.a
  {
    dm.e(paramContext);
    if (rx == null)
    {
      if (pW == null)
      {
        pW = GooglePlayServicesUtil.getRemoteContext(paramContext);
        if (pW == null) {
          throw new a("Could not get remote context.");
        }
      }
      paramContext = pW.getClassLoader();
    }
    try
    {
      rx = fi.a.ao((IBinder)paramContext.loadClass("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl").newInstance());
      return rx;
    }
    catch (ClassNotFoundException paramContext)
    {
      throw new a("Could not load creator class.");
    }
    catch (InstantiationException paramContext)
    {
      throw new a("Could not instantiate creator.");
    }
    catch (IllegalAccessException paramContext)
    {
      throw new a("Could not access creator.");
    }
  }
  
  public static class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\fm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */