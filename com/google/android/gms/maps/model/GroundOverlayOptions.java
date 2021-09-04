package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.b.a;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.internal.r;

public final class GroundOverlayOptions
  implements SafeParcelable
{
  public static final GroundOverlayOptionsCreator CREATOR = new GroundOverlayOptionsCreator();
  public static final float NO_DIMENSION = -1.0F;
  private final int iM;
  private float qd;
  private float qk;
  private boolean ql = true;
  private BitmapDescriptor qn;
  private LatLng qo;
  private float qp;
  private float qq;
  private LatLngBounds qr;
  private float qs = 0.0F;
  private float qt = 0.5F;
  private float qu = 0.5F;
  
  public GroundOverlayOptions()
  {
    this.iM = 1;
  }
  
  GroundOverlayOptions(int paramInt, IBinder paramIBinder, LatLng paramLatLng, float paramFloat1, float paramFloat2, LatLngBounds paramLatLngBounds, float paramFloat3, float paramFloat4, boolean paramBoolean, float paramFloat5, float paramFloat6, float paramFloat7)
  {
    this.iM = paramInt;
    this.qn = new BitmapDescriptor(b.a.z(paramIBinder));
    this.qo = paramLatLng;
    this.qp = paramFloat1;
    this.qq = paramFloat2;
    this.qr = paramLatLngBounds;
    this.qd = paramFloat3;
    this.qk = paramFloat4;
    this.ql = paramBoolean;
    this.qs = paramFloat5;
    this.qt = paramFloat6;
    this.qu = paramFloat7;
  }
  
  private GroundOverlayOptions a(LatLng paramLatLng, float paramFloat1, float paramFloat2)
  {
    this.qo = paramLatLng;
    this.qp = paramFloat1;
    this.qq = paramFloat2;
    return this;
  }
  
  public GroundOverlayOptions anchor(float paramFloat1, float paramFloat2)
  {
    this.qt = paramFloat1;
    this.qu = paramFloat2;
    return this;
  }
  
  public GroundOverlayOptions bearing(float paramFloat)
  {
    this.qd = ((paramFloat % 360.0F + 360.0F) % 360.0F);
    return this;
  }
  
  IBinder cM()
  {
    return this.qn.cs().asBinder();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public float getAnchorU()
  {
    return this.qt;
  }
  
  public float getAnchorV()
  {
    return this.qu;
  }
  
  public float getBearing()
  {
    return this.qd;
  }
  
  public LatLngBounds getBounds()
  {
    return this.qr;
  }
  
  public float getHeight()
  {
    return this.qq;
  }
  
  public BitmapDescriptor getImage()
  {
    return this.qn;
  }
  
  public LatLng getLocation()
  {
    return this.qo;
  }
  
  public float getTransparency()
  {
    return this.qs;
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public float getWidth()
  {
    return this.qp;
  }
  
  public float getZIndex()
  {
    return this.qk;
  }
  
  public GroundOverlayOptions image(BitmapDescriptor paramBitmapDescriptor)
  {
    this.qn = paramBitmapDescriptor;
    return this;
  }
  
  public boolean isVisible()
  {
    return this.ql;
  }
  
  public GroundOverlayOptions position(LatLng paramLatLng, float paramFloat)
  {
    boolean bool2 = true;
    if (this.qr == null)
    {
      bool1 = true;
      dm.a(bool1, "Position has already been set using positionFromBounds");
      if (paramLatLng == null) {
        break label59;
      }
      bool1 = true;
      label24:
      dm.b(bool1, "Location must be specified");
      if (paramFloat < 0.0F) {
        break label64;
      }
    }
    label59:
    label64:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      dm.b(bool1, "Width must be non-negative");
      return a(paramLatLng, paramFloat, -1.0F);
      bool1 = false;
      break;
      bool1 = false;
      break label24;
    }
  }
  
  public GroundOverlayOptions position(LatLng paramLatLng, float paramFloat1, float paramFloat2)
  {
    boolean bool2 = true;
    if (this.qr == null)
    {
      bool1 = true;
      dm.a(bool1, "Position has already been set using positionFromBounds");
      if (paramLatLng == null) {
        break label81;
      }
      bool1 = true;
      label27:
      dm.b(bool1, "Location must be specified");
      if (paramFloat1 < 0.0F) {
        break label87;
      }
      bool1 = true;
      label43:
      dm.b(bool1, "Width must be non-negative");
      if (paramFloat2 < 0.0F) {
        break label93;
      }
    }
    label81:
    label87:
    label93:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      dm.b(bool1, "Height must be non-negative");
      return a(paramLatLng, paramFloat1, paramFloat2);
      bool1 = false;
      break;
      bool1 = false;
      break label27;
      bool1 = false;
      break label43;
    }
  }
  
  public GroundOverlayOptions positionFromBounds(LatLngBounds paramLatLngBounds)
  {
    if (this.qo == null) {}
    for (boolean bool = true;; bool = false)
    {
      dm.a(bool, "Position has already been set using position: " + this.qo);
      this.qr = paramLatLngBounds;
      return this;
    }
  }
  
  public GroundOverlayOptions transparency(float paramFloat)
  {
    if ((paramFloat >= 0.0F) && (paramFloat <= 1.0F)) {}
    for (boolean bool = true;; bool = false)
    {
      dm.b(bool, "Transparency must be in the range [0..1]");
      this.qs = paramFloat;
      return this;
    }
  }
  
  public GroundOverlayOptions visible(boolean paramBoolean)
  {
    this.ql = paramBoolean;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (r.cK())
    {
      c.a(this, paramParcel, paramInt);
      return;
    }
    GroundOverlayOptionsCreator.a(this, paramParcel, paramInt);
  }
  
  public GroundOverlayOptions zIndex(float paramFloat)
  {
    this.qk = paramFloat;
    return this;
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\GroundOverlayOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */