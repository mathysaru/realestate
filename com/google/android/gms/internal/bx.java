package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class bx
  implements Parcelable.Creator<bw>
{
  static void a(bw parambw, Parcel paramParcel, int paramInt)
  {
    paramInt = b.k(paramParcel);
    b.c(paramParcel, 1, parambw.versionCode);
    b.a(paramParcel, 2, parambw.fW, false);
    b.a(paramParcel, 3, parambw.gG, false);
    b.a(paramParcel, 4, parambw.eW, false);
    b.c(paramParcel, 5, parambw.errorCode);
    b.a(paramParcel, 6, parambw.eX, false);
    b.a(paramParcel, 7, parambw.gH);
    b.a(paramParcel, 8, parambw.gI);
    b.a(paramParcel, 9, parambw.gJ);
    b.a(paramParcel, 10, parambw.gK, false);
    b.a(paramParcel, 11, parambw.fa);
    b.c(paramParcel, 12, parambw.orientation);
    b.C(paramParcel, paramInt);
  }
  
  public bw f(Parcel paramParcel)
  {
    int m = a.j(paramParcel);
    int k = 0;
    String str2 = null;
    String str1 = null;
    ArrayList localArrayList3 = null;
    int j = 0;
    ArrayList localArrayList2 = null;
    long l3 = 0L;
    boolean bool = false;
    long l2 = 0L;
    ArrayList localArrayList1 = null;
    long l1 = 0L;
    int i = 0;
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
        str2 = a.l(paramParcel, n);
        break;
      case 3: 
        str1 = a.l(paramParcel, n);
        break;
      case 4: 
        localArrayList3 = a.x(paramParcel, n);
        break;
      case 5: 
        j = a.f(paramParcel, n);
        break;
      case 6: 
        localArrayList2 = a.x(paramParcel, n);
        break;
      case 7: 
        l3 = a.g(paramParcel, n);
        break;
      case 8: 
        bool = a.c(paramParcel, n);
        break;
      case 9: 
        l2 = a.g(paramParcel, n);
        break;
      case 10: 
        localArrayList1 = a.x(paramParcel, n);
        break;
      case 11: 
        l1 = a.g(paramParcel, n);
        break;
      case 12: 
        i = a.f(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a("Overread allowed size end=" + m, paramParcel);
    }
    return new bw(k, str2, str1, localArrayList3, j, localArrayList2, l3, bool, l2, localArrayList1, l1, i);
  }
  
  public bw[] j(int paramInt)
  {
    return new bw[paramInt];
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */