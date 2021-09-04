package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class cp
  implements Parcelable.Creator<co>
{
  static void a(co paramco, Parcel paramParcel, int paramInt)
  {
    paramInt = b.k(paramParcel);
    b.c(paramParcel, 1, paramco.versionCode);
    b.a(paramParcel, 2, paramco.hP, false);
    b.c(paramParcel, 3, paramco.hQ);
    b.c(paramParcel, 4, paramco.hR);
    b.a(paramParcel, 5, paramco.hS);
    b.C(paramParcel, paramInt);
  }
  
  public co g(Parcel paramParcel)
  {
    boolean bool = false;
    int m = a.j(paramParcel);
    String str = null;
    int i = 0;
    int j = 0;
    int k = 0;
    while (paramParcel.dataPosition() < m)
    {
      int n = a.i(paramParcel);
      switch (a.y(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        k = a.f(paramParcel, n);
        break;
      case 2: 
        str = a.l(paramParcel, n);
        break;
      case 3: 
        j = a.f(paramParcel, n);
        break;
      case 4: 
        i = a.f(paramParcel, n);
        break;
      case 5: 
        bool = a.c(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a("Overread allowed size end=" + m, paramParcel);
    }
    return new co(k, str, j, i, bool);
  }
  
  public co[] l(int paramInt)
  {
    return new co[paramInt];
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */