package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.e.a;

public final class bm
  extends e<bo>
{
  private static final bm gl = new bm();
  
  private bm()
  {
    super("com.google.android.gms.ads.AdOverlayCreatorImpl");
  }
  
  public static bn a(Activity paramActivity)
  {
    try
    {
      if (b(paramActivity))
      {
        cn.m("Using AdOverlay from the client jar.");
        return new bf(paramActivity);
      }
      paramActivity = gl.c(paramActivity);
      return paramActivity;
    }
    catch (a paramActivity)
    {
      cn.q(paramActivity.getMessage());
    }
    return null;
  }
  
  private static boolean b(Activity paramActivity)
    throws bm.a
  {
    paramActivity = paramActivity.getIntent();
    if (!paramActivity.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
      throw new a("Ad overlay requires the useClientJar flag in intent extras.");
    }
    return paramActivity.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
  }
  
  private bn c(Activity paramActivity)
  {
    try
    {
      b localb = c.g(paramActivity);
      paramActivity = bn.a.m(((bo)t(paramActivity)).a(localb));
      return paramActivity;
    }
    catch (RemoteException paramActivity)
    {
      cn.b("Could not create remote AdOverlay.", paramActivity);
      return null;
    }
    catch (e.a paramActivity)
    {
      cn.b("Could not create remote AdOverlay.", paramActivity);
    }
    return null;
  }
  
  protected bo l(IBinder paramIBinder)
  {
    return bo.a.n(paramIBinder);
  }
  
  private static final class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */