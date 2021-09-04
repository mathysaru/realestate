package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f
  implements Parcelable.Creator<LoyaltyWalletObject>
{
  static void a(LoyaltyWalletObject paramLoyaltyWalletObject, Parcel paramParcel, int paramInt)
  {
    paramInt = b.k(paramParcel);
    b.c(paramParcel, 1, paramLoyaltyWalletObject.getVersionCode());
    b.a(paramParcel, 2, paramLoyaltyWalletObject.tU, false);
    b.a(paramParcel, 3, paramLoyaltyWalletObject.tV, false);
    b.a(paramParcel, 4, paramLoyaltyWalletObject.tW, false);
    b.a(paramParcel, 5, paramLoyaltyWalletObject.tX, false);
    b.a(paramParcel, 6, paramLoyaltyWalletObject.tY, false);
    b.C(paramParcel, paramInt);
  }
  
  public LoyaltyWalletObject S(Parcel paramParcel)
  {
    String str1 = null;
    int j = a.j(paramParcel);
    int i = 0;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
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
        str5 = a.l(paramParcel, k);
        break;
      case 3: 
        str4 = a.l(paramParcel, k);
        break;
      case 4: 
        str3 = a.l(paramParcel, k);
        break;
      case 5: 
        str2 = a.l(paramParcel, k);
        break;
      case 6: 
        str1 = a.l(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new LoyaltyWalletObject(i, str5, str4, str3, str2, str1);
  }
  
  public LoyaltyWalletObject[] ax(int paramInt)
  {
    return new LoyaltyWalletObject[paramInt];
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\wallet\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */