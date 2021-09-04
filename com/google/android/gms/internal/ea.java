package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class ea
  implements Parcelable.Creator<dz>
{
  static void a(dz paramdz, Parcel paramParcel, int paramInt)
  {
    paramInt = b.k(paramParcel);
    b.c(paramParcel, 1, paramdz.getVersionCode());
    b.b(paramParcel, 2, paramdz.bE(), false);
    b.a(paramParcel, 3, paramdz.bF(), false);
    b.C(paramParcel, paramInt);
  }
  
  public dz[] E(int paramInt)
  {
    return new dz[paramInt];
  }
  
  public dz q(Parcel paramParcel)
  {
    String str = null;
    int j = a.j(paramParcel);
    int i = 0;
    ArrayList localArrayList = null;
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
        localArrayList = a.c(paramParcel, k, dz.a.CREATOR);
        break;
      case 3: 
        str = a.l(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new dz(i, localArrayList, str);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */