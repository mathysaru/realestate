package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class dx
  implements Parcelable.Creator<dw.a>
{
  static void a(dw.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, parama.getVersionCode());
    b.c(paramParcel, 2, parama.bn());
    b.a(paramParcel, 3, parama.bt());
    b.c(paramParcel, 4, parama.bo());
    b.a(paramParcel, 5, parama.bu());
    b.a(paramParcel, 6, parama.bv(), false);
    b.c(paramParcel, 7, parama.bw());
    b.a(paramParcel, 8, parama.by(), false);
    b.a(paramParcel, 9, parama.bA(), paramInt, false);
    b.C(paramParcel, i);
  }
  
  public dw.a[] C(int paramInt)
  {
    return new dw.a[paramInt];
  }
  
  public dw.a o(Parcel paramParcel)
  {
    dr localdr = null;
    int i = 0;
    int n = a.j(paramParcel);
    String str1 = null;
    String str2 = null;
    boolean bool1 = false;
    int j = 0;
    boolean bool2 = false;
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < n)
    {
      int i1 = a.i(paramParcel);
      switch (a.y(i1))
      {
      default: 
        a.b(paramParcel, i1);
        break;
      case 1: 
        m = a.f(paramParcel, i1);
        break;
      case 2: 
        k = a.f(paramParcel, i1);
        break;
      case 3: 
        bool2 = a.c(paramParcel, i1);
        break;
      case 4: 
        j = a.f(paramParcel, i1);
        break;
      case 5: 
        bool1 = a.c(paramParcel, i1);
        break;
      case 6: 
        str2 = a.l(paramParcel, i1);
        break;
      case 7: 
        i = a.f(paramParcel, i1);
        break;
      case 8: 
        str1 = a.l(paramParcel, i1);
        break;
      case 9: 
        localdr = (dr)a.a(paramParcel, i1, dr.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != n) {
      throw new a.a("Overread allowed size end=" + n, paramParcel);
    }
    return new dw.a(m, k, bool2, j, bool1, str2, i, str1, localdr);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */