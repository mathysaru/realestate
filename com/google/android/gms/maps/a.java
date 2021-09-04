package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

public class a
{
  static void a(GoogleMapOptions paramGoogleMapOptions, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramGoogleMapOptions.getVersionCode());
    b.a(paramParcel, 2, paramGoogleMapOptions.cv());
    b.a(paramParcel, 3, paramGoogleMapOptions.cw());
    b.c(paramParcel, 4, paramGoogleMapOptions.getMapType());
    b.a(paramParcel, 5, paramGoogleMapOptions.getCamera(), paramInt, false);
    b.a(paramParcel, 6, paramGoogleMapOptions.cx());
    b.a(paramParcel, 7, paramGoogleMapOptions.cy());
    b.a(paramParcel, 8, paramGoogleMapOptions.cz());
    b.a(paramParcel, 9, paramGoogleMapOptions.cA());
    b.a(paramParcel, 10, paramGoogleMapOptions.cB());
    b.a(paramParcel, 11, paramGoogleMapOptions.cC());
    b.C(paramParcel, i);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */