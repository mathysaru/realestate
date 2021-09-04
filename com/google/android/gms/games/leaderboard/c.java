package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.eg;

public final class c
  implements LeaderboardScore
{
  private final long nA;
  private final long nB;
  private final String nC;
  private final Uri nD;
  private final Uri nE;
  private final PlayerEntity nF;
  private final String nG;
  private final long nx;
  private final String ny;
  private final String nz;
  
  public c(LeaderboardScore paramLeaderboardScore)
  {
    this.nx = paramLeaderboardScore.getRank();
    this.ny = ((String)dm.e(paramLeaderboardScore.getDisplayRank()));
    this.nz = ((String)dm.e(paramLeaderboardScore.getDisplayScore()));
    this.nA = paramLeaderboardScore.getRawScore();
    this.nB = paramLeaderboardScore.getTimestampMillis();
    this.nC = paramLeaderboardScore.getScoreHolderDisplayName();
    this.nD = paramLeaderboardScore.getScoreHolderIconImageUri();
    this.nE = paramLeaderboardScore.getScoreHolderHiResImageUri();
    Object localObject = paramLeaderboardScore.getScoreHolder();
    if (localObject == null) {}
    for (localObject = null;; localObject = (PlayerEntity)((Player)localObject).freeze())
    {
      this.nF = ((PlayerEntity)localObject);
      this.nG = paramLeaderboardScore.getScoreTag();
      return;
    }
  }
  
  static int a(LeaderboardScore paramLeaderboardScore)
  {
    return dl.hashCode(new Object[] { Long.valueOf(paramLeaderboardScore.getRank()), paramLeaderboardScore.getDisplayRank(), Long.valueOf(paramLeaderboardScore.getRawScore()), paramLeaderboardScore.getDisplayScore(), Long.valueOf(paramLeaderboardScore.getTimestampMillis()), paramLeaderboardScore.getScoreHolderDisplayName(), paramLeaderboardScore.getScoreHolderIconImageUri(), paramLeaderboardScore.getScoreHolderHiResImageUri(), paramLeaderboardScore.getScoreHolder() });
  }
  
  static boolean a(LeaderboardScore paramLeaderboardScore, Object paramObject)
  {
    boolean bool2 = true;
    boolean bool1;
    if (!(paramObject instanceof LeaderboardScore)) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramLeaderboardScore == paramObject);
      paramObject = (LeaderboardScore)paramObject;
      if ((!dl.equal(Long.valueOf(((LeaderboardScore)paramObject).getRank()), Long.valueOf(paramLeaderboardScore.getRank()))) || (!dl.equal(((LeaderboardScore)paramObject).getDisplayRank(), paramLeaderboardScore.getDisplayRank())) || (!dl.equal(Long.valueOf(((LeaderboardScore)paramObject).getRawScore()), Long.valueOf(paramLeaderboardScore.getRawScore()))) || (!dl.equal(((LeaderboardScore)paramObject).getDisplayScore(), paramLeaderboardScore.getDisplayScore())) || (!dl.equal(Long.valueOf(((LeaderboardScore)paramObject).getTimestampMillis()), Long.valueOf(paramLeaderboardScore.getTimestampMillis()))) || (!dl.equal(((LeaderboardScore)paramObject).getScoreHolderDisplayName(), paramLeaderboardScore.getScoreHolderDisplayName())) || (!dl.equal(((LeaderboardScore)paramObject).getScoreHolderIconImageUri(), paramLeaderboardScore.getScoreHolderIconImageUri())) || (!dl.equal(((LeaderboardScore)paramObject).getScoreHolderHiResImageUri(), paramLeaderboardScore.getScoreHolderHiResImageUri())) || (!dl.equal(((LeaderboardScore)paramObject).getScoreHolder(), paramLeaderboardScore.getScoreHolder()))) {
        break;
      }
      bool1 = bool2;
    } while (dl.equal(((LeaderboardScore)paramObject).getScoreTag(), paramLeaderboardScore.getScoreTag()));
    return false;
  }
  
  static String b(LeaderboardScore paramLeaderboardScore)
  {
    dl.a locala = dl.d(paramLeaderboardScore).a("Rank", Long.valueOf(paramLeaderboardScore.getRank())).a("DisplayRank", paramLeaderboardScore.getDisplayRank()).a("Score", Long.valueOf(paramLeaderboardScore.getRawScore())).a("DisplayScore", paramLeaderboardScore.getDisplayScore()).a("Timestamp", Long.valueOf(paramLeaderboardScore.getTimestampMillis())).a("DisplayName", paramLeaderboardScore.getScoreHolderDisplayName()).a("IconImageUri", paramLeaderboardScore.getScoreHolderIconImageUri()).a("HiResImageUri", paramLeaderboardScore.getScoreHolderHiResImageUri());
    if (paramLeaderboardScore.getScoreHolder() == null) {}
    for (Object localObject = null;; localObject = paramLeaderboardScore.getScoreHolder()) {
      return locala.a("Player", localObject).a("ScoreTag", paramLeaderboardScore.getScoreTag()).toString();
    }
  }
  
  public LeaderboardScore cd()
  {
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public String getDisplayRank()
  {
    return this.ny;
  }
  
  public void getDisplayRank(CharArrayBuffer paramCharArrayBuffer)
  {
    eg.b(this.ny, paramCharArrayBuffer);
  }
  
  public String getDisplayScore()
  {
    return this.nz;
  }
  
  public void getDisplayScore(CharArrayBuffer paramCharArrayBuffer)
  {
    eg.b(this.nz, paramCharArrayBuffer);
  }
  
  public long getRank()
  {
    return this.nx;
  }
  
  public long getRawScore()
  {
    return this.nA;
  }
  
  public Player getScoreHolder()
  {
    return this.nF;
  }
  
  public String getScoreHolderDisplayName()
  {
    if (this.nF == null) {
      return this.nC;
    }
    return this.nF.getDisplayName();
  }
  
  public void getScoreHolderDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    if (this.nF == null)
    {
      eg.b(this.nC, paramCharArrayBuffer);
      return;
    }
    this.nF.getDisplayName(paramCharArrayBuffer);
  }
  
  public Uri getScoreHolderHiResImageUri()
  {
    if (this.nF == null) {
      return this.nE;
    }
    return this.nF.getHiResImageUri();
  }
  
  public Uri getScoreHolderIconImageUri()
  {
    if (this.nF == null) {
      return this.nD;
    }
    return this.nF.getIconImageUri();
  }
  
  public String getScoreTag()
  {
    return this.nG;
  }
  
  public long getTimestampMillis()
  {
    return this.nB;
  }
  
  public int hashCode()
  {
    return a(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return b(this);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\games\leaderboard\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */