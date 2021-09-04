package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dl;

public final class LocationRequest
  implements SafeParcelable
{
  public static final LocationRequestCreator CREATOR = new LocationRequestCreator();
  public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
  public static final int PRIORITY_HIGH_ACCURACY = 100;
  public static final int PRIORITY_LOW_POWER = 104;
  public static final int PRIORITY_NO_POWER = 105;
  private final int iM;
  int mPriority;
  long oC;
  long oJ;
  long oK;
  boolean oL;
  int oM;
  float oN;
  
  public LocationRequest()
  {
    this.iM = 1;
    this.mPriority = 102;
    this.oJ = 3600000L;
    this.oK = 600000L;
    this.oL = false;
    this.oC = Long.MAX_VALUE;
    this.oM = Integer.MAX_VALUE;
    this.oN = 0.0F;
  }
  
  LocationRequest(int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, long paramLong3, int paramInt3, float paramFloat)
  {
    this.iM = paramInt1;
    this.mPriority = paramInt2;
    this.oJ = paramLong1;
    this.oK = paramLong2;
    this.oL = paramBoolean;
    this.oC = paramLong3;
    this.oM = paramInt3;
    this.oN = paramFloat;
  }
  
  private static void X(int paramInt)
  {
    switch (paramInt)
    {
    case 101: 
    case 103: 
    default: 
      throw new IllegalArgumentException("invalid quality: " + paramInt);
    }
  }
  
  public static String Y(int paramInt)
  {
    switch (paramInt)
    {
    case 101: 
    case 103: 
    default: 
      return "???";
    case 100: 
      return "PRIORITY_HIGH_ACCURACY";
    case 102: 
      return "PRIORITY_BALANCED_POWER_ACCURACY";
    case 104: 
      return "PRIORITY_LOW_POWER";
    }
    return "PRIORITY_NO_POWER";
  }
  
  private static void a(float paramFloat)
  {
    if (paramFloat < 0.0F) {
      throw new IllegalArgumentException("invalid displacement: " + paramFloat);
    }
  }
  
  public static LocationRequest create()
  {
    return new LocationRequest();
  }
  
  private static void h(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("invalid interval: " + paramLong);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof LocationRequest)) {
        return false;
      }
      paramObject = (LocationRequest)paramObject;
    } while ((this.mPriority == ((LocationRequest)paramObject).mPriority) && (this.oJ == ((LocationRequest)paramObject).oJ) && (this.oK == ((LocationRequest)paramObject).oK) && (this.oL == ((LocationRequest)paramObject).oL) && (this.oC == ((LocationRequest)paramObject).oC) && (this.oM == ((LocationRequest)paramObject).oM) && (this.oN == ((LocationRequest)paramObject).oN));
    return false;
  }
  
  public long getExpirationTime()
  {
    return this.oC;
  }
  
  public long getFastestInterval()
  {
    return this.oK;
  }
  
  public long getInterval()
  {
    return this.oJ;
  }
  
  public int getNumUpdates()
  {
    return this.oM;
  }
  
  public int getPriority()
  {
    return this.mPriority;
  }
  
  public float getSmallestDisplacement()
  {
    return this.oN;
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public int hashCode()
  {
    return dl.hashCode(new Object[] { Integer.valueOf(this.mPriority), Long.valueOf(this.oJ), Long.valueOf(this.oK), Boolean.valueOf(this.oL), Long.valueOf(this.oC), Integer.valueOf(this.oM), Float.valueOf(this.oN) });
  }
  
  public LocationRequest setExpirationDuration(long paramLong)
  {
    long l = SystemClock.elapsedRealtime();
    if (paramLong > Long.MAX_VALUE - l) {}
    for (this.oC = Long.MAX_VALUE;; this.oC = (l + paramLong))
    {
      if (this.oC < 0L) {
        this.oC = 0L;
      }
      return this;
    }
  }
  
  public LocationRequest setExpirationTime(long paramLong)
  {
    this.oC = paramLong;
    if (this.oC < 0L) {
      this.oC = 0L;
    }
    return this;
  }
  
  public LocationRequest setFastestInterval(long paramLong)
  {
    h(paramLong);
    this.oL = true;
    this.oK = paramLong;
    return this;
  }
  
  public LocationRequest setInterval(long paramLong)
  {
    h(paramLong);
    this.oJ = paramLong;
    if (!this.oL) {
      this.oK = ((this.oJ / 6.0D));
    }
    return this;
  }
  
  public LocationRequest setNumUpdates(int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("invalid numUpdates: " + paramInt);
    }
    this.oM = paramInt;
    return this;
  }
  
  public LocationRequest setPriority(int paramInt)
  {
    X(paramInt);
    this.mPriority = paramInt;
    return this;
  }
  
  public LocationRequest setSmallestDisplacement(float paramFloat)
  {
    a(paramFloat);
    this.oN = paramFloat;
    return this;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Request[").append(Y(this.mPriority));
    if (this.mPriority != 105)
    {
      localStringBuilder.append(" requested=");
      localStringBuilder.append(this.oJ + "ms");
    }
    localStringBuilder.append(" fastest=");
    localStringBuilder.append(this.oK + "ms");
    if (this.oC != Long.MAX_VALUE)
    {
      long l1 = this.oC;
      long l2 = SystemClock.elapsedRealtime();
      localStringBuilder.append(" expireIn=");
      localStringBuilder.append(l1 - l2 + "ms");
    }
    if (this.oM != Integer.MAX_VALUE) {
      localStringBuilder.append(" num=").append(this.oM);
    }
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    LocationRequestCreator.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\LocationRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */