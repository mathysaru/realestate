package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.CameraPosition;

public class GoogleMapOptionsCreator
  implements Parcelable.Creator<GoogleMapOptions>
{
  public static final int CONTENT_DESCRIPTION = 0;
  
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
  
  public GoogleMapOptions createFromParcel(Parcel paramParcel)
  {
    byte b1 = 0;
    int k = a.j(paramParcel);
    CameraPosition localCameraPosition = null;
    byte b2 = 0;
    byte b3 = 0;
    byte b4 = 0;
    byte b5 = 0;
    byte b6 = 0;
    int i = 0;
    byte b7 = 0;
    byte b8 = 0;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.i(paramParcel);
      switch (a.y(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        j = a.f(paramParcel, m);
        break;
      case 2: 
        b8 = a.d(paramParcel, m);
        break;
      case 3: 
        b7 = a.d(paramParcel, m);
        break;
      case 4: 
        i = a.f(paramParcel, m);
        break;
      case 5: 
        localCameraPosition = (CameraPosition)a.a(paramParcel, m, CameraPosition.CREATOR);
        break;
      case 6: 
        b6 = a.d(paramParcel, m);
        break;
      case 7: 
        b5 = a.d(paramParcel, m);
        break;
      case 8: 
        b4 = a.d(paramParcel, m);
        break;
      case 9: 
        b3 = a.d(paramParcel, m);
        break;
      case 10: 
        b2 = a.d(paramParcel, m);
        break;
      case 11: 
        b1 = a.d(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a("Overread allowed size end=" + k, paramParcel);
    }
    return new GoogleMapOptions(j, b8, b7, i, localCameraPosition, b6, b5, b4, b3, b2, b1);
  }
  
  public GoogleMapOptions[] newArray(int paramInt)
  {
    return new GoogleMapOptions[paramInt];
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\GoogleMapOptionsCreator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */