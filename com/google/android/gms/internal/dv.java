package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class dv
  implements Parcelable.Creator<dt.a>
{
  static void a(dt.a parama, Parcel paramParcel, int paramInt)
  {
    paramInt = b.k(paramParcel);
    b.c(paramParcel, 1, parama.versionCode);
    b.a(paramParcel, 2, parama.lx, false);
    b.c(paramParcel, 3, parama.ly);
    b.C(paramParcel, paramInt);
  }
  
  public dt.a[] B(int paramInt)
  {
    return new dt.a[paramInt];
  }
  
  public dt.a n(Parcel paramParcel)
  {
    int j = 0;
    int k = a.j(paramParcel);
    String str = null;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.i(paramParcel);
      switch (a.y(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        i = a.f(paramParcel, m);
        break;
      case 2: 
        str = a.l(paramParcel, m);
        break;
      case 3: 
        j = a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a("Overread allowed size end=" + k, paramParcel);
    }
    return new dt.a(i, str, j);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */