package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

public class g
{
  static void a(PolygonOptions paramPolygonOptions, Parcel paramParcel, int paramInt)
  {
    paramInt = b.k(paramParcel);
    b.c(paramParcel, 1, paramPolygonOptions.getVersionCode());
    b.b(paramParcel, 2, paramPolygonOptions.getPoints(), false);
    b.c(paramParcel, 3, paramPolygonOptions.cO(), false);
    b.a(paramParcel, 4, paramPolygonOptions.getStrokeWidth());
    b.c(paramParcel, 5, paramPolygonOptions.getStrokeColor());
    b.c(paramParcel, 6, paramPolygonOptions.getFillColor());
    b.a(paramParcel, 7, paramPolygonOptions.getZIndex());
    b.a(paramParcel, 8, paramPolygonOptions.isVisible());
    b.a(paramParcel, 9, paramPolygonOptions.isGeodesic());
    b.C(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */