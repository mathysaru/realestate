package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

public class f
{
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
    b.C(paramParcel, i);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */