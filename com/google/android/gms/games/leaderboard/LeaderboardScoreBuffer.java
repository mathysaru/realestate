package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataBuffer;

public final class LeaderboardScoreBuffer
  extends DataBuffer<LeaderboardScore>
{
  private final b nv;
  
  public LeaderboardScoreBuffer(com.google.android.gms.common.data.d paramd)
  {
    super(paramd);
    this.nv = new b(paramd.aM());
  }
  
  public b cb()
  {
    return this.nv;
  }
  
  public LeaderboardScore get(int paramInt)
  {
    return new d(this.jf, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\games\leaderboard\LeaderboardScoreBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */