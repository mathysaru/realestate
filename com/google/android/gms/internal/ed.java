package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ed
  implements Parcelable.Creator<ec>
{
  static void a(ec paramec, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramec.getVersionCode());
    b.a(paramParcel, 2, paramec.bH(), false);
    b.a(paramParcel, 3, paramec.bI(), paramInt, false);
    b.C(paramParcel, i);
  }
  
  public ec[] G(int paramInt)
  {
    return new ec[paramInt];
  }
  
  public ec s(Parcel paramParcel)
  {
    dz localdz = null;
    int j = a.j(paramParcel);
    int i = 0;
    Parcel localParcel = null;
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
        localParcel = a.y(paramParcel, k);
        break;
      case 3: 
        localdz = (dz)a.a(paramParcel, k, dz.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new ec(i, localParcel, localdz);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */