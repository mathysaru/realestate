package com.google.android.gms.games.achievement;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.d;

public final class AchievementBuffer
  extends DataBuffer<Achievement>
{
  public AchievementBuffer(d paramd)
  {
    super(paramd);
  }
  
  public Achievement get(int paramInt)
  {
    return new a(this.jf, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\games\achievement\AchievementBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */