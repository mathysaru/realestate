package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.en;

public final class GameEntity
  extends en
  implements Game
{
  public static final Parcelable.Creator<GameEntity> CREATOR = new a();
  private final int iM;
  private final String mk;
  private final String ml;
  private final String mm;
  private final String mn;
  private final String mo;
  private final String mp;
  private final Uri mq;
  private final Uri mr;
  private final Uri ms;
  private final boolean mt;
  private final boolean mu;
  private final String mv;
  private final int mw;
  private final int mx;
  private final int my;
  
  GameEntity(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Uri paramUri1, Uri paramUri2, Uri paramUri3, boolean paramBoolean1, boolean paramBoolean2, String paramString7, int paramInt2, int paramInt3, int paramInt4)
  {
    this.iM = paramInt1;
    this.mk = paramString1;
    this.ml = paramString2;
    this.mm = paramString3;
    this.mn = paramString4;
    this.mo = paramString5;
    this.mp = paramString6;
    this.mq = paramUri1;
    this.mr = paramUri2;
    this.ms = paramUri3;
    this.mt = paramBoolean1;
    this.mu = paramBoolean2;
    this.mv = paramString7;
    this.mw = paramInt2;
    this.mx = paramInt3;
    this.my = paramInt4;
  }
  
  public GameEntity(Game paramGame)
  {
    this.iM = 1;
    this.mk = paramGame.getApplicationId();
    this.mm = paramGame.getPrimaryCategory();
    this.mn = paramGame.getSecondaryCategory();
    this.mo = paramGame.getDescription();
    this.mp = paramGame.getDeveloperName();
    this.ml = paramGame.getDisplayName();
    this.mq = paramGame.getIconImageUri();
    this.mr = paramGame.getHiResImageUri();
    this.ms = paramGame.getFeaturedImageUri();
    this.mt = paramGame.isPlayEnabledGame();
    this.mu = paramGame.isInstanceInstalled();
    this.mv = paramGame.getInstancePackageName();
    this.mw = paramGame.getGameplayAclStatus();
    this.mx = paramGame.getAchievementTotalCount();
    this.my = paramGame.getLeaderboardCount();
  }
  
  static int a(Game paramGame)
  {
    return dl.hashCode(new Object[] { paramGame.getApplicationId(), paramGame.getDisplayName(), paramGame.getPrimaryCategory(), paramGame.getSecondaryCategory(), paramGame.getDescription(), paramGame.getDeveloperName(), paramGame.getIconImageUri(), paramGame.getHiResImageUri(), paramGame.getFeaturedImageUri(), Boolean.valueOf(paramGame.isPlayEnabledGame()), Boolean.valueOf(paramGame.isInstanceInstalled()), paramGame.getInstancePackageName(), Integer.valueOf(paramGame.getGameplayAclStatus()), Integer.valueOf(paramGame.getAchievementTotalCount()), Integer.valueOf(paramGame.getLeaderboardCount()) });
  }
  
  static boolean a(Game paramGame, Object paramObject)
  {
    boolean bool2 = true;
    boolean bool1;
    if (!(paramObject instanceof Game)) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramGame == paramObject);
      paramObject = (Game)paramObject;
      if ((!dl.equal(((Game)paramObject).getApplicationId(), paramGame.getApplicationId())) || (!dl.equal(((Game)paramObject).getDisplayName(), paramGame.getDisplayName())) || (!dl.equal(((Game)paramObject).getPrimaryCategory(), paramGame.getPrimaryCategory())) || (!dl.equal(((Game)paramObject).getSecondaryCategory(), paramGame.getSecondaryCategory())) || (!dl.equal(((Game)paramObject).getDescription(), paramGame.getDescription())) || (!dl.equal(((Game)paramObject).getDeveloperName(), paramGame.getDeveloperName())) || (!dl.equal(((Game)paramObject).getIconImageUri(), paramGame.getIconImageUri())) || (!dl.equal(((Game)paramObject).getHiResImageUri(), paramGame.getHiResImageUri())) || (!dl.equal(((Game)paramObject).getFeaturedImageUri(), paramGame.getFeaturedImageUri())) || (!dl.equal(Boolean.valueOf(((Game)paramObject).isPlayEnabledGame()), Boolean.valueOf(paramGame.isPlayEnabledGame()))) || (!dl.equal(Boolean.valueOf(((Game)paramObject).isInstanceInstalled()), Boolean.valueOf(paramGame.isInstanceInstalled()))) || (!dl.equal(((Game)paramObject).getInstancePackageName(), paramGame.getInstancePackageName())) || (!dl.equal(Integer.valueOf(((Game)paramObject).getGameplayAclStatus()), Integer.valueOf(paramGame.getGameplayAclStatus()))) || (!dl.equal(Integer.valueOf(((Game)paramObject).getAchievementTotalCount()), Integer.valueOf(paramGame.getAchievementTotalCount())))) {
        break;
      }
      bool1 = bool2;
    } while (dl.equal(Integer.valueOf(((Game)paramObject).getLeaderboardCount()), Integer.valueOf(paramGame.getLeaderboardCount())));
    return false;
  }
  
  static String b(Game paramGame)
  {
    return dl.d(paramGame).a("ApplicationId", paramGame.getApplicationId()).a("DisplayName", paramGame.getDisplayName()).a("PrimaryCategory", paramGame.getPrimaryCategory()).a("SecondaryCategory", paramGame.getSecondaryCategory()).a("Description", paramGame.getDescription()).a("DeveloperName", paramGame.getDeveloperName()).a("IconImageUri", paramGame.getIconImageUri()).a("HiResImageUri", paramGame.getHiResImageUri()).a("FeaturedImageUri", paramGame.getFeaturedImageUri()).a("PlayEnabledGame", Boolean.valueOf(paramGame.isPlayEnabledGame())).a("InstanceInstalled", Boolean.valueOf(paramGame.isInstanceInstalled())).a("InstancePackageName", paramGame.getInstancePackageName()).a("GameplayAclStatus", Integer.valueOf(paramGame.getGameplayAclStatus())).a("AchievementTotalCount", Integer.valueOf(paramGame.getAchievementTotalCount())).a("LeaderboardCount", Integer.valueOf(paramGame.getLeaderboardCount())).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public Game freeze()
  {
    return this;
  }
  
  public int getAchievementTotalCount()
  {
    return this.mx;
  }
  
  public String getApplicationId()
  {
    return this.mk;
  }
  
  public String getDescription()
  {
    return this.mo;
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    eg.b(this.mo, paramCharArrayBuffer);
  }
  
  public String getDeveloperName()
  {
    return this.mp;
  }
  
  public void getDeveloperName(CharArrayBuffer paramCharArrayBuffer)
  {
    eg.b(this.mp, paramCharArrayBuffer);
  }
  
  public String getDisplayName()
  {
    return this.ml;
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    eg.b(this.ml, paramCharArrayBuffer);
  }
  
  public Uri getFeaturedImageUri()
  {
    return this.ms;
  }
  
  public int getGameplayAclStatus()
  {
    return this.mw;
  }
  
  public Uri getHiResImageUri()
  {
    return this.mr;
  }
  
  public Uri getIconImageUri()
  {
    return this.mq;
  }
  
  public String getInstancePackageName()
  {
    return this.mv;
  }
  
  public int getLeaderboardCount()
  {
    return this.my;
  }
  
  public String getPrimaryCategory()
  {
    return this.mm;
  }
  
  public String getSecondaryCategory()
  {
    return this.mn;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public int hashCode()
  {
    return a(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public boolean isInstanceInstalled()
  {
    return this.mu;
  }
  
  public boolean isPlayEnabledGame()
  {
    return this.mt;
  }
  
  public String toString()
  {
    return b(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    Object localObject2 = null;
    if (!aX())
    {
      a.a(this, paramParcel, paramInt);
      return;
    }
    paramParcel.writeString(this.mk);
    paramParcel.writeString(this.ml);
    paramParcel.writeString(this.mm);
    paramParcel.writeString(this.mn);
    paramParcel.writeString(this.mo);
    paramParcel.writeString(this.mp);
    Object localObject1;
    if (this.mq == null)
    {
      localObject1 = null;
      paramParcel.writeString((String)localObject1);
      if (this.mr != null) {
        break label189;
      }
      localObject1 = null;
      label93:
      paramParcel.writeString((String)localObject1);
      if (this.ms != null) {
        break label201;
      }
      localObject1 = localObject2;
      label110:
      paramParcel.writeString((String)localObject1);
      if (!this.mt) {
        break label213;
      }
      paramInt = 1;
      label125:
      paramParcel.writeInt(paramInt);
      if (!this.mu) {
        break label218;
      }
    }
    label189:
    label201:
    label213:
    label218:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.mv);
      paramParcel.writeInt(this.mw);
      paramParcel.writeInt(this.mx);
      paramParcel.writeInt(this.my);
      return;
      localObject1 = this.mq.toString();
      break;
      localObject1 = this.mr.toString();
      break label93;
      localObject1 = this.ms.toString();
      break label110;
      paramInt = 0;
      break label125;
    }
  }
  
  static final class a
    extends a
  {
    public GameEntity t(Parcel paramParcel)
    {
      if ((GameEntity.b(GameEntity.bQ())) || (GameEntity.J(GameEntity.class.getCanonicalName()))) {
        return super.t(paramParcel);
      }
      String str1 = paramParcel.readString();
      String str2 = paramParcel.readString();
      String str3 = paramParcel.readString();
      String str4 = paramParcel.readString();
      String str5 = paramParcel.readString();
      String str6 = paramParcel.readString();
      Object localObject1 = paramParcel.readString();
      Object localObject2;
      label90:
      Object localObject3;
      label104:
      boolean bool1;
      if (localObject1 == null)
      {
        localObject1 = null;
        localObject2 = paramParcel.readString();
        if (localObject2 != null) {
          break label177;
        }
        localObject2 = null;
        localObject3 = paramParcel.readString();
        if (localObject3 != null) {
          break label187;
        }
        localObject3 = null;
        if (paramParcel.readInt() <= 0) {
          break label197;
        }
        bool1 = true;
        label113:
        if (paramParcel.readInt() <= 0) {
          break label202;
        }
      }
      label177:
      label187:
      label197:
      label202:
      for (boolean bool2 = true;; bool2 = false)
      {
        return new GameEntity(1, str1, str2, str3, str4, str5, str6, (Uri)localObject1, (Uri)localObject2, (Uri)localObject3, bool1, bool2, paramParcel.readString(), paramParcel.readInt(), paramParcel.readInt(), paramParcel.readInt());
        localObject1 = Uri.parse((String)localObject1);
        break;
        localObject2 = Uri.parse((String)localObject2);
        break label90;
        localObject3 = Uri.parse((String)localObject3);
        break label104;
        bool1 = false;
        break label113;
      }
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\games\GameEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */