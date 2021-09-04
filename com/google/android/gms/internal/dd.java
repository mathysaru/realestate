package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Field;

public abstract class dd
  implements SafeParcelable
{
  private static ClassLoader kA = null;
  private static Integer kB = null;
  private static final Object kz = new Object();
  private boolean kC = false;
  
  private static boolean a(Class<?> paramClass)
  {
    try
    {
      boolean bool = "SAFE_PARCELABLE_NULL_STRING".equals(paramClass.getField("NULL").get(null));
      return bool;
    }
    catch (IllegalAccessException paramClass)
    {
      return false;
    }
    catch (NoSuchFieldException paramClass) {}
    return false;
  }
  
  protected static ClassLoader aV()
  {
    synchronized (kz)
    {
      ClassLoader localClassLoader = kA;
      return localClassLoader;
    }
  }
  
  protected static Integer aW()
  {
    synchronized (kz)
    {
      Integer localInteger = kB;
      return localInteger;
    }
  }
  
  protected static boolean y(String paramString)
  {
    ClassLoader localClassLoader = aV();
    if (localClassLoader == null) {
      return true;
    }
    try
    {
      boolean bool = a(localClassLoader.loadClass(paramString));
      return bool;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  protected boolean aX()
  {
    return this.kC;
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */