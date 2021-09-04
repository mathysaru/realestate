package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.b;
import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import com.google.android.gms.internal.eu;
import com.google.android.gms.internal.ev;

public final class e
  extends b
  implements LeaderboardVariant
{
  e(d paramd, int paramInt)
  {
    super(paramd, paramInt);
  }
  
  public String ce()
  {
    return getString("top_page_token_next");
  }
  
  public String cf()
  {
    return getString("window_page_token_prev");
  }
  
  public String cg()
  {
    return getString("window_page_token_next");
  }
  
  public int getCollection()
  {
    return getInteger("collection");
  }
  
  public String getDisplayPlayerRank()
  {
    return getString("player_display_rank");
  }
  
  public String getDisplayPlayerScore()
  {
    return getString("player_display_score");
  }
  
  public long getNumScores()
  {
    if (v("total_scores")) {
      return -1L;
    }
    return getLong("total_scores");
  }
  
  public long getPlayerRank()
  {
    if (v("player_rank")) {
      return -1L;
    }
    return getLong("player_rank");
  }
  
  public String getPlayerScoreTag()
  {
    return getString("player_score_tag");
  }
  
  public long getRawPlayerScore()
  {
    if (v("player_raw_score")) {
      return -1L;
    }
    return getLong("player_raw_score");
  }
  
  public int getTimeSpan()
  {
    return getInteger("timespan");
  }
  
  public boolean hasPlayerInfo()
  {
    return !v("player_raw_score");
  }
  
  public String toString()
  {
    dl.a locala = dl.d(this).a("TimeSpan", ev.R(getTimeSpan())).a("Collection", eu.R(getCollection()));
    if (hasPlayerInfo())
    {
      localObject = Long.valueOf(getRawPlayerScore());
      locala = locala.a("RawPlayerScore", localObject);
      if (!hasPlayerInfo()) {
        break label163;
      }
      localObject = getDisplayPlayerScore();
      label64:
      locala = locala.a("DisplayPlayerScore", localObject);
      if (!hasPlayerInfo()) {
        break label169;
      }
      localObject = Long.valueOf(getPlayerRank());
      label87:
      locala = locala.a("PlayerRank", localObject);
      if (!hasPlayerInfo()) {
        break label175;
      }
    }
    label163:
    label169:
    label175:
    for (Object localObject = getDisplayPlayerRank();; localObject = "none")
    {
      return locala.a("DisplayPlayerRank", localObject).a("NumScores", Long.valueOf(getNumScores())).a("TopPageNextToken", ce()).a("WindowPageNextToken", cg()).a("WindowPagePrevToken", cf()).toString();
      localObject = "none";
      break;
      localObject = "none";
      break label64;
      localObject = "none";
      break label87;
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\games\leaderboard\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */