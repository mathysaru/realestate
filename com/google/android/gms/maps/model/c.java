package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

public class c
{
  static void a(GroundOverlayOptions paramGroundOverlayOptions, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramGroundOverlayOptions.getVersionCode());
    b.a(paramParcel, 2, paramGroundOverlayOptions.cM(), false);
    b.a(paramParcel, 3, paramGroundOverlayOptions.getLocation(), paramInt, false);
    b.a(paramParcel, 4, paramGroundOverlayOptions.getWidth());
    b.a(paramParcel, 5, paramGroundOverlayOptions.getHeight());
    b.a(paramParcel, 6, paramGroundOverlayOptions.getBounds(), paramInt, false);
    b.a(paramParcel, 7, paramGroundOverlayOptions.getBearing());
    b.a(paramParcel, 8, paramGroundOverlayOptions.getZIndex());
    b.a(paramParcel, 9, paramGroundOverlayOptions.isVisible());
    b.a(paramParcel, 10, paramGroundOverlayOptions.getTransparency());
    b.a(paramParcel, 11, paramGroundOverlayOptions.getAnchorU());
    b.a(paramParcel, 12, paramGroundOverlayOptions.getAnchorV());
    b.C(paramParcel, i);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */