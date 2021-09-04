package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class du
  implements Parcelable.Creator<dt>
{
  static void a(dt paramdt, Parcel paramParcel, int paramInt)
  {
    paramInt = b.k(paramParcel);
    b.c(paramParcel, 1, paramdt.getVersionCode());
    b.b(paramParcel, 2, paramdt.bm(), false);
    b.C(paramParcel, paramInt);
  }
  
  public dt[] A(int paramInt)
  {
    return new dt[paramInt];
  }
  
  public dt m(Parcel paramParcel)
  {
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
        localArrayList = a.c(paramParcel, k, dt.a.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new dt(i, localArrayList);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\du.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */