package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class y
  implements Parcelable.Creator<x>
{
  static void a(x paramx, Parcel paramParcel, int paramInt)
  {
    paramInt = b.k(paramParcel);
    b.c(paramParcel, 1, paramx.versionCode);
    b.a(paramParcel, 2, paramx.ew, false);
    b.c(paramParcel, 3, paramx.height);
    b.c(paramParcel, 4, paramx.heightPixels);
    b.a(paramParcel, 5, paramx.ex);
    b.c(paramParcel, 6, paramx.width);
    b.c(paramParcel, 7, paramx.widthPixels);
    b.C(paramParcel, paramInt);
  }
  
  public x b(Parcel paramParcel)
  {
    int i = 0;
    int i1 = a.j(paramParcel);
    String str = null;
    int j = 0;
    boolean bool = false;
    int k = 0;
    int m = 0;
    int n = 0;
    while (paramParcel.dataPosition() < i1)
    {
      int i2 = a.i(paramParcel);
      switch (a.y(i2))
      {
      default: 
        a.b(paramParcel, i2);
        break;
      case 1: 
        n = a.f(paramParcel, i2);
        break;
      case 2: 
        str = a.l(paramParcel, i2);
        break;
      case 3: 
        m = a.f(paramParcel, i2);
        break;
      case 4: 
        k = a.f(paramParcel, i2);
        break;
      case 5: 
        bool = a.c(paramParcel, i2);
        break;
      case 6: 
        j = a.f(paramParcel, i2);
        break;
      case 7: 
        i = a.f(paramParcel, i2);
      }
    }
    if (paramParcel.dataPosition() != i1) {
      throw new a.a("Overread allowed size end=" + i1, paramParcel);
    }
    return new x(n, str, m, k, bool, j, i);
  }
  
  public x[] c(int paramInt)
  {
    return new x[paramInt];
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */