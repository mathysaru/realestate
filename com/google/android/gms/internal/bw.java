package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

public final class bw
  implements SafeParcelable
{
  public static final bx CREATOR = new bx();
  public final List<String> eW;
  public final List<String> eX;
  public final int errorCode;
  public final String fW;
  public final long fa;
  public final String gG;
  public final long gH;
  public final boolean gI;
  public final long gJ;
  public final List<String> gK;
  public final int orientation;
  public final int versionCode;
  
  public bw(int paramInt)
  {
    this(1, null, null, null, paramInt, null, -1L, false, -1L, null, -1L, -1);
  }
  
  bw(int paramInt1, String paramString1, String paramString2, List<String> paramList1, int paramInt2, List<String> paramList2, long paramLong1, boolean paramBoolean, long paramLong2, List<String> paramList3, long paramLong3, int paramInt3)
  {
    this.versionCode = paramInt1;
    this.fW = paramString1;
    this.gG = paramString2;
    if (paramList1 != null)
    {
      paramString1 = Collections.unmodifiableList(paramList1);
      this.eW = paramString1;
      this.errorCode = paramInt2;
      if (paramList2 == null) {
        break label109;
      }
      paramString1 = Collections.unmodifiableList(paramList2);
      label52:
      this.eX = paramString1;
      this.gH = paramLong1;
      this.gI = paramBoolean;
      this.gJ = paramLong2;
      if (paramList3 == null) {
        break label114;
      }
    }
    label109:
    label114:
    for (paramString1 = Collections.unmodifiableList(paramList3);; paramString1 = null)
    {
      this.gK = paramString1;
      this.fa = paramLong3;
      this.orientation = paramInt3;
      return;
      paramString1 = null;
      break;
      paramString1 = null;
      break label52;
    }
  }
  
  public bw(String paramString1, String paramString2, List<String> paramList1, List<String> paramList2, long paramLong1, boolean paramBoolean, long paramLong2, List<String> paramList3, long paramLong3, int paramInt)
  {
    this(1, paramString1, paramString2, paramList1, -2, paramList2, paramLong1, paramBoolean, paramLong2, paramList3, paramLong3, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bx.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */