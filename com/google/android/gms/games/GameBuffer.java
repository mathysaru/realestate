package com.google.android.gms.games;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.d;

public final class GameBuffer
  extends DataBuffer<Game>
{
  public GameBuffer(d paramd)
  {
    super(paramd);
  }
  
  public Game get(int paramInt)
  {
    return new b(this.jf, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\games\GameBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */