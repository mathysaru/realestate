package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class dr
  implements SafeParcelable
{
  public static final ds CREATOR = new ds();
  private final int iM;
  private final dt lt;
  
  dr(int paramInt, dt paramdt)
  {
    this.iM = paramInt;
    this.lt = paramdt;
  }
  
  private dr(dt paramdt)
  {
    this.iM = 1;
    this.lt = paramdt;
  }
  
  public static dr a(dw.b<?, ?> paramb)
  {
    if ((paramb instanceof dt)) {
      return new dr((dt)paramb);
    }
    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
  }
  
  dt bk()
  {
    return this.lt;
  }
  
  public dw.b<?, ?> bl()
  {
    if (this.lt != null) {
      return this.lt;
    }
    throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
  }
  
  public int describeContents()
  {
    ds localds = CREATOR;
    return 0;
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ds localds = CREATOR;
    ds.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */