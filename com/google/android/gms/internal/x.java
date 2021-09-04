package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class x
  implements SafeParcelable
{
  public static final y CREATOR = new y();
  public final String ew;
  public final boolean ex;
  public final int height;
  public final int heightPixels;
  public final int versionCode;
  public final int width;
  public final int widthPixels;
  
  public x()
  {
    this(1, "interstitial_mb", 0, 0, true, 0, 0);
  }
  
  x(int paramInt1, String paramString, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5)
  {
    this.versionCode = paramInt1;
    this.ew = paramString;
    this.height = paramInt2;
    this.heightPixels = paramInt3;
    this.ex = paramBoolean;
    this.width = paramInt4;
    this.widthPixels = paramInt5;
  }
  
  public x(Context paramContext, AdSize paramAdSize)
  {
    this.versionCode = 1;
    this.ex = false;
    this.width = paramAdSize.getWidth();
    this.height = paramAdSize.getHeight();
    int i;
    label52:
    int k;
    if (this.width == -1)
    {
      i = 1;
      if (this.height != -2) {
        break label155;
      }
      paramContext = paramContext.getResources().getDisplayMetrics();
      if (i == 0) {
        break label161;
      }
      this.widthPixels = a(paramContext);
      k = (int)(this.widthPixels / paramContext.density);
      label85:
      if (j == 0) {
        break label182;
      }
    }
    label155:
    label161:
    label182:
    for (int m = c(paramContext);; m = this.height)
    {
      this.heightPixels = cm.a(paramContext, m);
      if ((i == 0) && (j == 0)) {
        break label191;
      }
      this.ew = (k + "x" + m + "_as");
      return;
      i = 0;
      break;
      j = 0;
      break label52;
      k = this.width;
      this.widthPixels = cm.a(paramContext, this.width);
      break label85;
    }
    label191:
    this.ew = paramAdSize.toString();
  }
  
  public static int a(DisplayMetrics paramDisplayMetrics)
  {
    return paramDisplayMetrics.widthPixels;
  }
  
  public static int b(DisplayMetrics paramDisplayMetrics)
  {
    return (int)(c(paramDisplayMetrics) * paramDisplayMetrics.density);
  }
  
  private static int c(DisplayMetrics paramDisplayMetrics)
  {
    int i = (int)(paramDisplayMetrics.heightPixels / paramDisplayMetrics.density);
    if (i <= 400) {
      return 32;
    }
    if (i <= 720) {
      return 50;
    }
    return 90;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    y.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */