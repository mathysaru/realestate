package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class q
{
  private static Context pW;
  private static c pX;
  
  private static <T> T a(ClassLoader paramClassLoader, String paramString)
  {
    try
    {
      paramClassLoader = c(((ClassLoader)dm.e(paramClassLoader)).loadClass(paramString));
      return paramClassLoader;
    }
    catch (ClassNotFoundException paramClassLoader)
    {
      throw new IllegalStateException("Unable to find dynamic class " + paramString);
    }
  }
  
  private static <T> T c(Class<?> paramClass)
  {
    try
    {
      Object localObject = paramClass.newInstance();
      return (T)localObject;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new IllegalStateException("Unable to instantiate the dynamic class " + paramClass.getName());
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new IllegalStateException("Unable to call the default constructor of " + paramClass.getName());
    }
  }
  
  private static boolean cI()
  {
    return cJ() != null;
  }
  
  private static Class<?> cJ()
  {
    try
    {
      Class localClass = Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return null;
  }
  
  private static Context getRemoteContext(Context paramContext)
  {
    if (pW == null) {
      if (!cI()) {
        break label20;
      }
    }
    label20:
    for (pW = paramContext;; pW = GooglePlayServicesUtil.getRemoteContext(paramContext)) {
      return pW;
    }
  }
  
  public static c u(Context paramContext)
    throws GooglePlayServicesNotAvailableException
  {
    dm.e(paramContext);
    if (pX != null) {
      return pX;
    }
    v(paramContext);
    pX = w(paramContext);
    try
    {
      pX.a(com.google.android.gms.dynamic.c.g(getRemoteContext(paramContext).getResources()), 4030500);
      return pX;
    }
    catch (RemoteException paramContext)
    {
      throw new RuntimeRemoteException(paramContext);
    }
  }
  
  private static void v(Context paramContext)
    throws GooglePlayServicesNotAvailableException
  {
    int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramContext);
    switch (i)
    {
    default: 
      throw new GooglePlayServicesNotAvailableException(i);
    }
  }
  
  private static c w(Context paramContext)
  {
    if (cI())
    {
      Log.i(q.class.getSimpleName(), "Making Creator statically");
      return (c)c(cJ());
    }
    return c.a.J((IBinder)a(getRemoteContext(paramContext).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\internal\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */