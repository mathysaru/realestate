package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class MarkerOptionsCreator
  implements Parcelable.Creator<MarkerOptions>
{
  public static final int CONTENT_DESCRIPTION = 0;
  
  static void a(MarkerOptions paramMarkerOptions, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramMarkerOptions.getVersionCode());
    b.a(paramParcel, 2, paramMarkerOptions.getPosition(), paramInt, false);
    b.a(paramParcel, 3, paramMarkerOptions.getTitle(), false);
    b.a(paramParcel, 4, paramMarkerOptions.getSnippet(), false);
    b.a(paramParcel, 5, paramMarkerOptions.cN(), false);
    b.a(paramParcel, 6, paramMarkerOptions.getAnchorU());
    b.a(paramParcel, 7, paramMarkerOptions.getAnchorV());
    b.a(paramParcel, 8, paramMarkerOptions.isDraggable());
    b.a(paramParcel, 9, paramMarkerOptions.isVisible());
    b.a(paramParcel, 10, paramMarkerOptions.isFlat());
    b.a(paramParcel, 11, paramMarkerOptions.getRotation());
    b.a(paramParcel, 12, paramMarkerOptions.getInfoWindowAnchorU());
    b.a(paramParcel, 13, paramMarkerOptions.getInfoWindowAnchorV());
    b.a(paramParcel, 14, paramMarkerOptions.getAlpha());
    b.C(paramParcel, i);
  }
  
  public MarkerOptions createFromParcel(Parcel paramParcel)
  {
    int j = a.j(paramParcel);
    int i = 0;
    LatLng localLatLng = null;
    String str2 = null;
    String str1 = null;
    IBinder localIBinder = null;
    float f6 = 0.0F;
    float f5 = 0.0F;
    boolean bool3 = false;
    boolean bool2 = false;
    boolean bool1 = false;
    float f4 = 0.0F;
    float f3 = 0.5F;
    float f2 = 0.0F;
    float f1 = 1.0F;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.i(paramParcel);
      switch (a.y(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        i = a.f(paramParcel, k);
        break;
      case 2: 
        localLatLng = (LatLng)a.a(paramParcel, k, LatLng.CREATOR);
        break;
      case 3: 
        str2 = a.l(paramParcel, k);
        break;
      case 4: 
        str1 = a.l(paramParcel, k);
        break;
      case 5: 
        localIBinder = a.m(paramParcel, k);
        break;
      case 6: 
        f6 = a.i(paramParcel, k);
        break;
      case 7: 
        f5 = a.i(paramParcel, k);
        break;
      case 8: 
        bool3 = a.c(paramParcel, k);
        break;
      case 9: 
        bool2 = a.c(paramParcel, k);
        break;
      case 10: 
        bool1 = a.c(paramParcel, k);
        break;
      case 11: 
        f4 = a.i(paramParcel, k);
        break;
      case 12: 
        f3 = a.i(paramParcel, k);
        break;
      case 13: 
        f2 = a.i(paramParcel, k);
        break;
      case 14: 
        f1 = a.i(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new MarkerOptions(i, localLatLng, str2, str1, localIBinder, f6, f5, bool3, bool2, bool1, f4, f3, f2, f1);
  }
  
  public MarkerOptions[] newArray(int paramInt)
  {
    return new MarkerOptions[paramInt];
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\MarkerOptionsCreator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */