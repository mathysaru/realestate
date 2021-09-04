package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class bg
  implements Parcelable.Creator<bh>
{
  static void a(bh parambh, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, parambh.versionCode);
    b.a(paramParcel, 2, parambh.fR, paramInt, false);
    b.a(paramParcel, 3, parambh.U(), false);
    b.a(paramParcel, 4, parambh.V(), false);
    b.a(paramParcel, 5, parambh.W(), false);
    b.a(paramParcel, 6, parambh.X(), false);
    b.a(paramParcel, 7, parambh.fW, false);
    b.a(paramParcel, 8, parambh.fX);
    b.a(paramParcel, 9, parambh.fY, false);
    b.a(paramParcel, 10, parambh.Y(), false);
    b.c(paramParcel, 11, parambh.orientation);
    b.c(paramParcel, 12, parambh.ga);
    b.a(paramParcel, 13, parambh.fz, false);
    b.a(paramParcel, 14, parambh.eg, paramInt, false);
    b.C(paramParcel, i);
  }
  
  public bh d(Parcel paramParcel)
  {
    int m = a.j(paramParcel);
    int k = 0;
    be localbe = null;
    IBinder localIBinder5 = null;
    IBinder localIBinder4 = null;
    IBinder localIBinder3 = null;
    IBinder localIBinder2 = null;
    String str3 = null;
    boolean bool = false;
    String str2 = null;
    IBinder localIBinder1 = null;
    int j = 0;
    int i = 0;
    String str1 = null;
    co localco = null;
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
        localbe = (be)a.a(paramParcel, n, be.CREATOR);
        break;
      case 3: 
        localIBinder5 = a.m(paramParcel, n);
        break;
      case 4: 
        localIBinder4 = a.m(paramParcel, n);
        break;
      case 5: 
        localIBinder3 = a.m(paramParcel, n);
        break;
      case 6: 
        localIBinder2 = a.m(paramParcel, n);
        break;
      case 7: 
        str3 = a.l(paramParcel, n);
        break;
      case 8: 
        bool = a.c(paramParcel, n);
        break;
      case 9: 
        str2 = a.l(paramParcel, n);
        break;
      case 10: 
        localIBinder1 = a.m(paramParcel, n);
        break;
      case 11: 
        j = a.f(paramParcel, n);
        break;
      case 12: 
        i = a.f(paramParcel, n);
        break;
      case 13: 
        str1 = a.l(paramParcel, n);
        break;
      case 14: 
        localco = (co)a.a(paramParcel, n, co.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a("Overread allowed size end=" + m, paramParcel);
    }
    return new bh(k, localbe, localIBinder5, localIBinder4, localIBinder3, localIBinder2, str3, bool, str2, localIBinder1, j, i, str1, localco);
  }
  
  public bh[] h(int paramInt)
  {
    return new bh[paramInt];
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */