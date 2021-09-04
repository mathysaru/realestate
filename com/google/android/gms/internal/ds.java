package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ds
  implements Parcelable.Creator<dr>
{
  static void a(dr paramdr, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramdr.getVersionCode());
    b.a(paramParcel, 2, paramdr.bk(), paramInt, false);
    b.C(paramParcel, i);
  }
  
  public dr l(Parcel paramParcel)
  {
    int j = a.j(paramParcel);
    int i = 0;
    dt localdt = null;
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
        localdt = (dt)a.a(paramParcel, k, dt.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new dr(i, localdt);
  }
  
  public dr[] z(int paramInt)
  {
    return new dr[paramInt];
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\ds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */