package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.r;

public final class LatLng
  implements SafeParcelable
{
  public static final LatLngCreator CREATOR = new LatLngCreator();
  private final int iM;
  public final double latitude;
  public final double longitude;
  
  public LatLng(double paramDouble1, double paramDouble2)
  {
    this(1, paramDouble1, paramDouble2);
  }
  
  LatLng(int paramInt, double paramDouble1, double paramDouble2)
  {
    this.iM = paramInt;
    if ((-180.0D <= paramDouble2) && (paramDouble2 < 180.0D)) {}
    for (this.longitude = paramDouble2;; this.longitude = (((paramDouble2 - 180.0D) % 360.0D + 360.0D) % 360.0D - 180.0D))
    {
      this.latitude = Math.max(-90.0D, Math.min(90.0D, paramDouble1));
      return;
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
      if (!(paramObject instanceof LatLng)) {
        return false;
      }
      paramObject = (LatLng)paramObject;
    } while ((Double.doubleToLongBits(this.latitude) == Double.doubleToLongBits(((LatLng)paramObject).latitude)) && (Double.doubleToLongBits(this.longitude) == Double.doubleToLongBits(((LatLng)paramObject).longitude)));
    return false;
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public int hashCode()
  {
    long l = Double.doubleToLongBits(this.latitude);
    int i = (int)(l ^ l >>> 32);
    l = Double.doubleToLongBits(this.longitude);
    return (i + 31) * 31 + (int)(l ^ l >>> 32);
  }
  
  public String toString()
  {
    return "lat/lng: (" + this.latitude + "," + this.longitude + ")";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (r.cK())
    {
      e.a(this, paramParcel, paramInt);
      return;
    }
    LatLngCreator.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\LatLng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */