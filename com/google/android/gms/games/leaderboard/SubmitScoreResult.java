package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.ev;
import java.util.HashMap;

public final class SubmitScoreResult
{
  private static final String[] nI = { "leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag" };
  private int iC;
  private String mD;
  private String nJ;
  private HashMap<Integer, Result> nK;
  
  public SubmitScoreResult(int paramInt, String paramString1, String paramString2)
  {
    this(paramInt, paramString1, paramString2, new HashMap());
  }
  
  public SubmitScoreResult(int paramInt, String paramString1, String paramString2, HashMap<Integer, Result> paramHashMap)
  {
    this.iC = paramInt;
    this.nJ = paramString1;
    this.mD = paramString2;
    this.nK = paramHashMap;
  }
  
  public SubmitScoreResult(d paramd)
  {
    this.iC = paramd.getStatusCode();
    this.nK = new HashMap();
    int j = paramd.getCount();
    if (j == 3) {}
    for (boolean bool = true;; bool = false)
    {
      dm.m(bool);
      int i = 0;
      while (i < j)
      {
        int k = paramd.q(i);
        if (i == 0)
        {
          this.nJ = paramd.c("leaderboardId", i, k);
          this.mD = paramd.c("playerId", i, k);
        }
        if (paramd.d("hasResult", i, k)) {
          a(new Result(paramd.a("rawScore", i, k), paramd.c("formattedScore", i, k), paramd.c("scoreTag", i, k), paramd.d("newBest", i, k)), paramd.b("timeSpan", i, k));
        }
        i += 1;
      }
    }
  }
  
  private void a(Result paramResult, int paramInt)
  {
    this.nK.put(Integer.valueOf(paramInt), paramResult);
  }
  
  public String getLeaderboardId()
  {
    return this.nJ;
  }
  
  public String getPlayerId()
  {
    return this.mD;
  }
  
  public Result getScoreResult(int paramInt)
  {
    return (Result)this.nK.get(Integer.valueOf(paramInt));
  }
  
  public int getStatusCode()
  {
    return this.iC;
  }
  
  public String toString()
  {
    dl.a locala = dl.d(this).a("PlayerId", this.mD).a("StatusCode", Integer.valueOf(this.iC));
    int i = 0;
    if (i < 3)
    {
      Object localObject = (Result)this.nK.get(Integer.valueOf(i));
      locala.a("TimesSpan", ev.R(i));
      if (localObject == null) {}
      for (localObject = "null";; localObject = ((Result)localObject).toString())
      {
        locala.a("Result", localObject);
        i += 1;
        break;
      }
    }
    return locala.toString();
  }
  
  public static final class Result
  {
    public final String formattedScore;
    public final boolean newBest;
    public final long rawScore;
    public final String scoreTag;
    
    public Result(long paramLong, String paramString1, String paramString2, boolean paramBoolean)
    {
      this.rawScore = paramLong;
      this.formattedScore = paramString1;
      this.scoreTag = paramString2;
      this.newBest = paramBoolean;
    }
    
    public String toString()
    {
      return dl.d(this).a("RawScore", Long.valueOf(this.rawScore)).a("FormattedScore", this.formattedScore).a("ScoreTag", this.scoreTag).a("NewBest", Boolean.valueOf(this.newBest)).toString();
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\games\leaderboard\SubmitScoreResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */