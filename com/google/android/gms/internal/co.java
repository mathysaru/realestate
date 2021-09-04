package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class co
  implements SafeParcelable
{
  public static final cp CREATOR = new cp();
  public String hP;
  public int hQ;
  public int hR;
  public boolean hS;
  public final int versionCode;
  
  public co(int paramInt1, int paramInt2, boolean paramBoolean) {}
  
  co(int paramInt1, String paramString, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.versionCode = paramInt1;
    this.hP = paramString;
    this.hQ = paramInt2;
    this.hR = paramInt3;
    this.hS = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cp.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\co.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */