package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

public class fa
  implements SafeParcelable, Geofence
{
  public static final fb CREATOR = new fb();
  private final int iM;
  private final String oA;
  private final int oB;
  private final short oD;
  private final double oE;
  private final double oF;
  private final float oG;
  private final int oH;
  private final int oI;
  private final long pc;
  
  public fa(int paramInt1, String paramString, int paramInt2, short paramShort, double paramDouble1, double paramDouble2, float paramFloat, long paramLong, int paramInt3, int paramInt4)
  {
    R(paramString);
    b(paramFloat);
    a(paramDouble1, paramDouble2);
    paramInt2 = aa(paramInt2);
    this.iM = paramInt1;
    this.oD = paramShort;
    this.oA = paramString;
    this.oE = paramDouble1;
    this.oF = paramDouble2;
    this.oG = paramFloat;
    this.pc = paramLong;
    this.oB = paramInt2;
    this.oH = paramInt3;
    this.oI = paramInt4;
  }
  
  public fa(String paramString, int paramInt1, short paramShort, double paramDouble1, double paramDouble2, float paramFloat, long paramLong, int paramInt2, int paramInt3)
  {
    this(1, paramString, paramInt1, paramShort, paramDouble1, paramDouble2, paramFloat, paramLong, paramInt2, paramInt3);
  }
  
  private static void R(String paramString)
  {
    if ((paramString == null) || (paramString.length() > 100)) {
      throw new IllegalArgumentException("requestId is null or too long: " + paramString);
    }
  }
  
  private static void a(double paramDouble1, double paramDouble2)
  {
    if ((paramDouble1 > 90.0D) || (paramDouble1 < -90.0D)) {
      throw new IllegalArgumentException("invalid latitude: " + paramDouble1);
    }
    if ((paramDouble2 > 180.0D) || (paramDouble2 < -180.0D)) {
      throw new IllegalArgumentException("invalid longitude: " + paramDouble2);
    }
  }
  
  private static int aa(int paramInt)
  {
    int i = paramInt & 0x7;
    if (i == 0) {
      throw new IllegalArgumentException("No supported transition specified: " + paramInt);
    }
    return i;
  }
  
  private static String ab(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return "CIRCLE";
  }
  
  private static void b(float paramFloat)
  {
    if (paramFloat <= 0.0F) {
      throw new IllegalArgumentException("invalid radius: " + paramFloat);
    }
  }
  
  public static fa d(byte[] paramArrayOfByte)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(paramArrayOfByte, 0, paramArrayOfByte.length);
    localParcel.setDataPosition(0);
    paramArrayOfByte = CREATOR.z(localParcel);
    localParcel.recycle();
    return paramArrayOfByte;
  }
  
  public short co()
  {
    return this.oD;
  }
  
  public float cp()
  {
    return this.oG;
  }
  
  public int cq()
  {
    return this.oB;
  }
  
  public int cr()
  {
    return this.oI;
  }
  
  public int describeContents()
  {
    fb localfb = CREATOR;
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (!(paramObject instanceof fa)) {
        return false;
      }
      paramObject = (fa)paramObject;
      if (this.oG != ((fa)paramObject).oG) {
        return false;
      }
      if (this.oE != ((fa)paramObject).oE) {
        return false;
      }
      if (this.oF != ((fa)paramObject).oF) {
        return false;
      }
    } while (this.oD == ((fa)paramObject).oD);
    return false;
  }
  
  public long getExpirationTime()
  {
    return this.pc;
  }
  
  public double getLatitude()
  {
    return this.oE;
  }
  
  public double getLongitude()
  {
    return this.oF;
  }
  
  public int getNotificationResponsiveness()
  {
    return this.oH;
  }
  
  public String getRequestId()
  {
    return this.oA;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public int hashCode()
  {
    long l = Double.doubleToLongBits(this.oE);
    int i = (int)(l ^ l >>> 32);
    l = Double.doubleToLongBits(this.oF);
    return ((((i + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(this.oG)) * 31 + this.oD) * 31 + this.oB;
  }
  
  public String toString()
  {
    return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] { ab(this.oD), this.oA, Integer.valueOf(this.oB), Double.valueOf(this.oE), Double.valueOf(this.oF), Float.valueOf(this.oG), Integer.valueOf(this.oH / 1000), Integer.valueOf(this.oI), Long.valueOf(this.pc) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    fb localfb = CREATOR;
    fb.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\fa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */