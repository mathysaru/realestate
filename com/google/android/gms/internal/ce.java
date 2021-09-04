package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

public final class ce
{
  public final List<String> eW;
  public final List<String> eX;
  public final int errorCode;
  public final cq fU;
  public final long fa;
  public final ao fm;
  public final ax fn;
  public final String fo;
  public final ar fp;
  public final v gB;
  public final String gE;
  public final long gH;
  public final boolean gI;
  public final long gJ;
  public final List<String> gK;
  public final ap hA;
  public final int orientation;
  
  public ce(v paramv, cq paramcq, List<String> paramList1, int paramInt1, List<String> paramList2, List<String> paramList3, int paramInt2, long paramLong1, String paramString1, boolean paramBoolean, ao paramao, ax paramax, String paramString2, ap paramap, ar paramar, long paramLong2, long paramLong3)
  {
    this.gB = paramv;
    this.fU = paramcq;
    if (paramList1 != null)
    {
      paramv = Collections.unmodifiableList(paramList1);
      this.eW = paramv;
      this.errorCode = paramInt1;
      if (paramList2 == null) {
        break label138;
      }
      paramv = Collections.unmodifiableList(paramList2);
      label45:
      this.eX = paramv;
      if (paramList3 == null) {
        break label143;
      }
    }
    label138:
    label143:
    for (paramv = Collections.unmodifiableList(paramList3);; paramv = null)
    {
      this.gK = paramv;
      this.orientation = paramInt2;
      this.fa = paramLong1;
      this.gE = paramString1;
      this.gI = paramBoolean;
      this.fm = paramao;
      this.fn = paramax;
      this.fo = paramString2;
      this.hA = paramap;
      this.fp = paramar;
      this.gJ = paramLong2;
      this.gH = paramLong3;
      return;
      paramv = null;
      break;
      paramv = null;
      break label45;
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */