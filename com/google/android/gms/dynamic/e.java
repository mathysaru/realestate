package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.dm;

public abstract class e<T>
{
  private final String mi;
  private T mj;
  
  protected e(String paramString)
  {
    this.mi = paramString;
  }
  
  protected abstract T d(IBinder paramIBinder);
  
  protected final T t(Context paramContext)
    throws e.a
  {
    if (this.mj == null)
    {
      dm.e(paramContext);
      paramContext = GooglePlayServicesUtil.getRemoteContext(paramContext);
      if (paramContext == null) {
        throw new a("Could not get remote context.");
      }
      paramContext = paramContext.getClassLoader();
    }
    try
    {
      this.mj = d((IBinder)paramContext.loadClass(this.mi).newInstance());
      return (T)this.mj;
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
    
    public a(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\dynamic\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */