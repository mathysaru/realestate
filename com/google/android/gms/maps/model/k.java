package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

public class k
{
  static void a(VisibleRegion paramVisibleRegion, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramVisibleRegion.getVersionCode());
    b.a(paramParcel, 2, paramVisibleRegion.nearLeft, paramInt, false);
    b.a(paramParcel, 3, paramVisibleRegion.nearRight, paramInt, false);
    b.a(paramParcel, 4, paramVisibleRegion.farLeft, paramInt, false);
    b.a(paramParcel, 5, paramVisibleRegion.farRight, paramInt, false);
    b.a(paramParcel, 6, paramVisibleRegion.latLngBounds, paramInt, false);
    b.C(paramParcel, i);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */