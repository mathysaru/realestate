package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e
  implements Parcelable.Creator<LineItem>
{
  static void a(LineItem paramLineItem, Parcel paramParcel, int paramInt)
  {
    paramInt = b.k(paramParcel);
    b.c(paramParcel, 1, paramLineItem.getVersionCode());
    b.a(paramParcel, 2, paramLineItem.description, false);
    b.a(paramParcel, 3, paramLineItem.tQ, false);
    b.a(paramParcel, 4, paramLineItem.tR, false);
    b.a(paramParcel, 5, paramLineItem.tD, false);
    b.c(paramParcel, 6, paramLineItem.tS);
    b.a(paramParcel, 7, paramLineItem.tE, false);
    b.C(paramParcel, paramInt);
  }
  
  public LineItem R(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int k = a.j(paramParcel);
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
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
        str5 = a.l(paramParcel, m);
        break;
      case 3: 
        str4 = a.l(paramParcel, m);
        break;
      case 4: 
        str3 = a.l(paramParcel, m);
        break;
      case 5: 
        str2 = a.l(paramParcel, m);
        break;
      case 6: 
        i = a.f(paramParcel, m);
        break;
      case 7: 
        str1 = a.l(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a("Overread allowed size end=" + k, paramParcel);
    }
    return new LineItem(j, str5, str4, str3, str2, i, str1);
  }
  
  public LineItem[] aw(int paramInt)
  {
    return new LineItem[paramInt];
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\wallet\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */