package com.google.android.gms.games;

import com.google.android.gms.common.data.DataBuffer;

public final class PlayerBuffer
  extends DataBuffer<Player>
{
  public PlayerBuffer(com.google.android.gms.common.data.d paramd)
  {
    super(paramd);
  }
  
  public Player get(int paramInt)
  {
    return new d(this.jf, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\games\PlayerBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */