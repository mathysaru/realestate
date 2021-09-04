package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class fb
  implements Parcelable.Creator<fa>
{
  static void a(fa paramfa, Parcel paramParcel, int paramInt)
  {
    paramInt = b.k(paramParcel);
    b.a(paramParcel, 1, paramfa.getRequestId(), false);
    b.c(paramParcel, 1000, paramfa.getVersionCode());
    b.a(paramParcel, 2, paramfa.getExpirationTime());
    b.a(paramParcel, 3, paramfa.co());
    b.a(paramParcel, 4, paramfa.getLatitude());
    b.a(paramParcel, 5, paramfa.getLongitude());
    b.a(paramParcel, 6, paramfa.cp());
    b.c(paramParcel, 7, paramfa.cq());
    b.c(paramParcel, 8, paramfa.getNotificationResponsiveness());
    b.c(paramParcel, 9, paramfa.cr());
    b.C(paramParcel, paramInt);
  }
  
  public fa[] ac(int paramInt)
  {
    return new fa[paramInt];
  }
  
  public fa z(Parcel paramParcel)
  {
    int n = a.j(paramParcel);
    int m = 0;
    String str = null;
    int k = 0;
    short s = 0;
    double d2 = 0.0D;
    double d1 = 0.0D;
    float f = 0.0F;
    long l = 0L;
    int j = 0;
    int i = -1;
    while (paramParcel.dataPosition() < n)
    {
      int i1 = a.i(paramParcel);
      switch (a.y(i1))
      {
      default: 
        a.b(paramParcel, i1);
        break;
      case 1: 
        str = a.l(paramParcel, i1);
        break;
      case 1000: 
        m = a.f(paramParcel, i1);
        break;
      case 2: 
        l = a.g(paramParcel, i1);
        break;
      case 3: 
        s = a.e(paramParcel, i1);
        break;
      case 4: 
        d2 = a.j(paramParcel, i1);
        break;
      case 5: 
        d1 = a.j(paramParcel, i1);
        break;
      case 6: 
        f = a.i(paramParcel, i1);
        break;
      case 7: 
        k = a.f(paramParcel, i1);
        break;
      case 8: 
        j = a.f(paramParcel, i1);
        break;
      case 9: 
        i = a.f(paramParcel, i1);
      }
    }
    if (paramParcel.dataPosition() != n) {
      throw new a.a("Overread allowed size end=" + n, paramParcel);
    }
    return new fa(m, str, k, s, d2, d1, f, l, j, i);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\fb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */