package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DetectedActivity
  implements SafeParcelable
{
  public static final DetectedActivityCreator CREATOR = new DetectedActivityCreator();
  public static final int IN_VEHICLE = 0;
  public static final int ON_BICYCLE = 1;
  public static final int ON_FOOT = 2;
  public static final int STILL = 3;
  public static final int TILTING = 5;
  public static final int UNKNOWN = 4;
  private final int iM;
  int oy;
  int oz;
  
  public DetectedActivity(int paramInt1, int paramInt2)
  {
    this.iM = 1;
    this.oy = paramInt1;
    this.oz = paramInt2;
  }
  
  public DetectedActivity(int paramInt1, int paramInt2, int paramInt3)
  {
    this.iM = paramInt1;
    this.oy = paramInt2;
    this.oz = paramInt3;
  }
  
  private int W(int paramInt)
  {
    int i = paramInt;
    if (paramInt > 6) {
      i = 4;
    }
    return i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getConfidence()
  {
    return this.oz;
  }
  
  public int getType()
  {
    return W(this.oy);
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public String toString()
  {
    return "DetectedActivity [type=" + getType() + ", confidence=" + this.oz + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    DetectedActivityCreator.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\DetectedActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */