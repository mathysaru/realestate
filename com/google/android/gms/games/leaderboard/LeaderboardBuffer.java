package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.f;

public final class LeaderboardBuffer
  extends f<Leaderboard>
{
  public LeaderboardBuffer(d paramd)
  {
    super(paramd);
  }
  
  protected Leaderboard getEntry(int paramInt1, int paramInt2)
  {
    return new a(this.jf, paramInt1, paramInt2);
  }
  
  protected String getPrimaryDataMarkerColumn()
  {
    return "external_leaderboard_id";
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\games\leaderboard\LeaderboardBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */