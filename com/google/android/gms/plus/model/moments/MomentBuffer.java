package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.fu;

public final class MomentBuffer
  extends DataBuffer<Moment>
{
  public MomentBuffer(d paramd)
  {
    super(paramd);
  }
  
  public Moment get(int paramInt)
  {
    return new fu(this.jf, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\plus\model\moments\MomentBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */