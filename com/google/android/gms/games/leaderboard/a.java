package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.b;
import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import java.util.ArrayList;

public final class a
  extends b
  implements Leaderboard
{
  private final int nu;
  
  a(d paramd, int paramInt1, int paramInt2)
  {
    super(paramd, paramInt1);
    this.nu = paramInt2;
  }
  
  public String getDisplayName()
  {
    return getString("name");
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    a("name", paramCharArrayBuffer);
  }
  
  public Uri getIconImageUri()
  {
    return u("board_icon_image_uri");
  }
  
  public String getLeaderboardId()
  {
    return getString("external_leaderboard_id");
  }
  
  public int getScoreOrder()
  {
    return getInteger("score_order");
  }
  
  public ArrayList<LeaderboardVariant> getVariants()
  {
    ArrayList localArrayList = new ArrayList(this.nu);
    int i = 0;
    while (i < this.nu)
    {
      localArrayList.add(new e(this.jf, this.ji + i));
      i += 1;
    }
    return localArrayList;
  }
  
  public String toString()
  {
    return dl.d(this).a("ID", getLeaderboardId()).a("DisplayName", getDisplayName()).a("IconImageURI", getIconImageUri()).a("ScoreOrder", Integer.valueOf(getScoreOrder())).toString();
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\games\leaderboard\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */