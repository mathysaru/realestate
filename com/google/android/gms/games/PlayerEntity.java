package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.db;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.en;

public final class PlayerEntity
  extends en
  implements Player
{
  public static final Parcelable.Creator<PlayerEntity> CREATOR = new a();
  private final int iM;
  private final String mD;
  private final long mE;
  private final String ml;
  private final Uri mq;
  private final Uri mr;
  
  PlayerEntity(int paramInt, String paramString1, String paramString2, Uri paramUri1, Uri paramUri2, long paramLong)
  {
    this.iM = paramInt;
    this.mD = paramString1;
    this.ml = paramString2;
    this.mq = paramUri1;
    this.mr = paramUri2;
    this.mE = paramLong;
  }
  
  public PlayerEntity(Player paramPlayer)
  {
    this.iM = 1;
    this.mD = paramPlayer.getPlayerId();
    this.ml = paramPlayer.getDisplayName();
    this.mq = paramPlayer.getIconImageUri();
    this.mr = paramPlayer.getHiResImageUri();
    this.mE = paramPlayer.getRetrievedTimestamp();
    db.c(this.mD);
    db.c(this.ml);
    if (this.mE > 0L) {}
    for (;;)
    {
      db.k(bool);
      return;
      bool = false;
    }
  }
  
  static int a(Player paramPlayer)
  {
    return dl.hashCode(new Object[] { paramPlayer.getPlayerId(), paramPlayer.getDisplayName(), paramPlayer.getIconImageUri(), paramPlayer.getHiResImageUri(), Long.valueOf(paramPlayer.getRetrievedTimestamp()) });
  }
  
  static boolean a(Player paramPlayer, Object paramObject)
  {
    boolean bool2 = true;
    boolean bool1;
    if (!(paramObject instanceof Player)) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramPlayer == paramObject);
      paramObject = (Player)paramObject;
      if ((!dl.equal(((Player)paramObject).getPlayerId(), paramPlayer.getPlayerId())) || (!dl.equal(((Player)paramObject).getDisplayName(), paramPlayer.getDisplayName())) || (!dl.equal(((Player)paramObject).getIconImageUri(), paramPlayer.getIconImageUri())) || (!dl.equal(((Player)paramObject).getHiResImageUri(), paramPlayer.getHiResImageUri()))) {
        break;
      }
      bool1 = bool2;
    } while (dl.equal(Long.valueOf(((Player)paramObject).getRetrievedTimestamp()), Long.valueOf(paramPlayer.getRetrievedTimestamp())));
    return false;
  }
  
  static String b(Player paramPlayer)
  {
    return dl.d(paramPlayer).a("PlayerId", paramPlayer.getPlayerId()).a("DisplayName", paramPlayer.getDisplayName()).a("IconImageUri", paramPlayer.getIconImageUri()).a("HiResImageUri", paramPlayer.getHiResImageUri()).a("RetrievedTimestamp", Long.valueOf(paramPlayer.getRetrievedTimestamp())).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public Player freeze()
  {
    return this;
  }
  
  public String getDisplayName()
  {
    return this.ml;
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    eg.b(this.ml, paramCharArrayBuffer);
  }
  
  public Uri getHiResImageUri()
  {
    return this.mr;
  }
  
  public Uri getIconImageUri()
  {
    return this.mq;
  }
  
  public String getPlayerId()
  {
    return this.mD;
  }
  
  public long getRetrievedTimestamp()
  {
    return this.mE;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public boolean hasHiResImage()
  {
    return getHiResImageUri() != null;
  }
  
  public boolean hasIconImage()
  {
    return getIconImageUri() != null;
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
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject2 = null;
    if (!aX())
    {
      c.a(this, paramParcel, paramInt);
      return;
    }
    paramParcel.writeString(this.mD);
    paramParcel.writeString(this.ml);
    if (this.mq == null)
    {
      localObject1 = null;
      paramParcel.writeString((String)localObject1);
      if (this.mr != null) {
        break label82;
      }
    }
    label82:
    for (Object localObject1 = localObject2;; localObject1 = this.mr.toString())
    {
      paramParcel.writeString((String)localObject1);
      paramParcel.writeLong(this.mE);
      return;
      localObject1 = this.mq.toString();
      break;
    }
  }
  
  static final class a
    extends c
  {
    public PlayerEntity u(Parcel paramParcel)
    {
      Uri localUri = null;
      if ((PlayerEntity.b(PlayerEntity.bQ())) || (PlayerEntity.J(PlayerEntity.class.getCanonicalName()))) {
        return super.u(paramParcel);
      }
      String str1 = paramParcel.readString();
      String str2 = paramParcel.readString();
      Object localObject = paramParcel.readString();
      String str3 = paramParcel.readString();
      if (localObject == null)
      {
        localObject = null;
        if (str3 != null) {
          break label89;
        }
      }
      for (;;)
      {
        return new PlayerEntity(1, str1, str2, (Uri)localObject, localUri, paramParcel.readLong());
        localObject = Uri.parse((String)localObject);
        break;
        label89:
        localUri = Uri.parse(str3);
      }
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\games\PlayerEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */