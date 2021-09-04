package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.e.a;

public final class u
  extends e<ad>
{
  private static final u er = new u();
  
  private u()
  {
    super("com.google.android.gms.ads.AdManagerCreatorImpl");
  }
  
  public static ac a(Context paramContext, x paramx, String paramString, av paramav)
  {
    Object localObject;
    if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramContext) == 0)
    {
      ac localac = er.b(paramContext, paramx, paramString, paramav);
      localObject = localac;
      if (localac != null) {}
    }
    else
    {
      cn.m("Using AdManager from the client jar.");
      localObject = new r(paramContext, paramx, paramString, paramav, new co(4030500, 4030500, true));
    }
    return (ac)localObject;
  }
  
  private ac b(Context paramContext, x paramx, String paramString, av paramav)
  {
    try
    {
      b localb = c.g(paramContext);
      paramContext = ac.a.f(((ad)t(paramContext)).a(localb, paramx, paramString, paramav, 4030500));
      return paramContext;
    }
    catch (RemoteException paramContext)
    {
      cn.b("Could not create remote AdManager.", paramContext);
      return null;
    }
    catch (e.a paramContext)
    {
      cn.b("Could not create remote AdManager.", paramContext);
    }
    return null;
  }
  
  protected ad c(IBinder paramIBinder)
  {
    return ad.a.g(paramIBinder);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */