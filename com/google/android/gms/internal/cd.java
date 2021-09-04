package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;

public final class cd
{
  public final int hh;
  public final boolean hi;
  public final boolean hj;
  public final String hk;
  public final String hl;
  public final boolean hm;
  public final boolean hn;
  public final boolean ho;
  public final String hp;
  public final String hq;
  public final int hr;
  public final int hs;
  public final int ht;
  public final int hu;
  public final int hv;
  public final int hw;
  public final float hx;
  public final int hy;
  public final int hz;
  
  public cd(Context paramContext)
  {
    AudioManager localAudioManager = (AudioManager)paramContext.getSystemService("audio");
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    Locale localLocale = Locale.getDefault();
    PackageManager localPackageManager = paramContext.getPackageManager();
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    this.hh = localAudioManager.getMode();
    if (a(localPackageManager, "geo:0,0?q=donuts") != null)
    {
      bool1 = true;
      this.hi = bool1;
      if (a(localPackageManager, "http://www.google.com") == null) {
        break label255;
      }
    }
    label255:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.hj = bool1;
      this.hk = localTelephonyManager.getNetworkOperator();
      this.hl = localLocale.getCountry();
      this.hm = cm.aq();
      this.hn = localAudioManager.isMusicActive();
      this.ho = localAudioManager.isSpeakerphoneOn();
      this.hp = localLocale.getLanguage();
      this.hq = a(localPackageManager);
      this.hr = localAudioManager.getStreamVolume(3);
      this.hs = a(paramContext, localConnectivityManager, localPackageManager);
      this.ht = localTelephonyManager.getNetworkType();
      this.hu = localTelephonyManager.getPhoneType();
      this.hv = localAudioManager.getRingerMode();
      this.hw = localAudioManager.getStreamVolume(2);
      this.hx = localDisplayMetrics.density;
      this.hy = localDisplayMetrics.widthPixels;
      this.hz = localDisplayMetrics.heightPixels;
      return;
      bool1 = false;
      break;
    }
  }
  
  private static int a(Context paramContext, ConnectivityManager paramConnectivityManager, PackageManager paramPackageManager)
  {
    int i = -2;
    if (ci.a(paramPackageManager, paramContext.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
    {
      paramContext = paramConnectivityManager.getActiveNetworkInfo();
      if (paramContext != null) {
        i = paramContext.getType();
      }
    }
    else
    {
      return i;
    }
    return -1;
  }
  
  private static ResolveInfo a(PackageManager paramPackageManager, String paramString)
  {
    return paramPackageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)), 65536);
  }
  
  private static String a(PackageManager paramPackageManager)
  {
    Object localObject = a(paramPackageManager, "market://details?id=com.google.android.gms.ads");
    if (localObject == null) {}
    for (;;)
    {
      return null;
      localObject = ((ResolveInfo)localObject).activityInfo;
      if (localObject != null) {
        try
        {
          paramPackageManager = paramPackageManager.getPackageInfo(((ActivityInfo)localObject).packageName, 0);
          if (paramPackageManager != null)
          {
            paramPackageManager = paramPackageManager.versionCode + "." + ((ActivityInfo)localObject).packageName;
            return paramPackageManager;
          }
        }
        catch (PackageManager.NameNotFoundException paramPackageManager) {}
      }
    }
    return null;
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */