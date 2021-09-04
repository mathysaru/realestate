package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.en;

public final class ParticipantEntity
  extends en
  implements Participant
{
  public static final Parcelable.Creator<ParticipantEntity> CREATOR = new a();
  private final int iM;
  private final String ml;
  private final Uri mq;
  private final Uri mr;
  private final int nU;
  private final String nV;
  private final boolean nW;
  private final PlayerEntity nX;
  private final int nY;
  private final String nd;
  
  ParticipantEntity(int paramInt1, String paramString1, String paramString2, Uri paramUri1, Uri paramUri2, int paramInt2, String paramString3, boolean paramBoolean, PlayerEntity paramPlayerEntity, int paramInt3)
  {
    this.iM = paramInt1;
    this.nd = paramString1;
    this.ml = paramString2;
    this.mq = paramUri1;
    this.mr = paramUri2;
    this.nU = paramInt2;
    this.nV = paramString3;
    this.nW = paramBoolean;
    this.nX = paramPlayerEntity;
    this.nY = paramInt3;
  }
  
  public ParticipantEntity(Participant paramParticipant)
  {
    this.iM = 1;
    this.nd = paramParticipant.getParticipantId();
    this.ml = paramParticipant.getDisplayName();
    this.mq = paramParticipant.getIconImageUri();
    this.mr = paramParticipant.getHiResImageUri();
    this.nU = paramParticipant.getStatus();
    this.nV = paramParticipant.ci();
    this.nW = paramParticipant.isConnectedToRoom();
    Object localObject = paramParticipant.getPlayer();
    if (localObject == null) {}
    for (localObject = null;; localObject = new PlayerEntity((Player)localObject))
    {
      this.nX = ((PlayerEntity)localObject);
      this.nY = paramParticipant.getCapabilities();
      return;
    }
  }
  
  static int a(Participant paramParticipant)
  {
    return dl.hashCode(new Object[] { paramParticipant.getPlayer(), Integer.valueOf(paramParticipant.getStatus()), paramParticipant.ci(), Boolean.valueOf(paramParticipant.isConnectedToRoom()), paramParticipant.getDisplayName(), paramParticipant.getIconImageUri(), paramParticipant.getHiResImageUri(), Integer.valueOf(paramParticipant.getCapabilities()) });
  }
  
  static boolean a(Participant paramParticipant, Object paramObject)
  {
    boolean bool2 = true;
    boolean bool1;
    if (!(paramObject instanceof Participant)) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramParticipant == paramObject);
      paramObject = (Participant)paramObject;
      if ((!dl.equal(((Participant)paramObject).getPlayer(), paramParticipant.getPlayer())) || (!dl.equal(Integer.valueOf(((Participant)paramObject).getStatus()), Integer.valueOf(paramParticipant.getStatus()))) || (!dl.equal(((Participant)paramObject).ci(), paramParticipant.ci())) || (!dl.equal(Boolean.valueOf(((Participant)paramObject).isConnectedToRoom()), Boolean.valueOf(paramParticipant.isConnectedToRoom()))) || (!dl.equal(((Participant)paramObject).getDisplayName(), paramParticipant.getDisplayName())) || (!dl.equal(((Participant)paramObject).getIconImageUri(), paramParticipant.getIconImageUri())) || (!dl.equal(((Participant)paramObject).getHiResImageUri(), paramParticipant.getHiResImageUri()))) {
        break;
      }
      bool1 = bool2;
    } while (dl.equal(Integer.valueOf(((Participant)paramObject).getCapabilities()), Integer.valueOf(paramParticipant.getCapabilities())));
    return false;
  }
  
  static String b(Participant paramParticipant)
  {
    return dl.d(paramParticipant).a("Player", paramParticipant.getPlayer()).a("Status", Integer.valueOf(paramParticipant.getStatus())).a("ClientAddress", paramParticipant.ci()).a("ConnectedToRoom", Boolean.valueOf(paramParticipant.isConnectedToRoom())).a("DisplayName", paramParticipant.getDisplayName()).a("IconImage", paramParticipant.getIconImageUri()).a("HiResImage", paramParticipant.getHiResImageUri()).a("Capabilities", Integer.valueOf(paramParticipant.getCapabilities())).toString();
  }
  
  public String ci()
  {
    return this.nV;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public Participant freeze()
  {
    return this;
  }
  
  public int getCapabilities()
  {
    return this.nY;
  }
  
  public String getDisplayName()
  {
    if (this.nX == null) {
      return this.ml;
    }
    return this.nX.getDisplayName();
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    if (this.nX == null)
    {
      eg.b(this.ml, paramCharArrayBuffer);
      return;
    }
    this.nX.getDisplayName(paramCharArrayBuffer);
  }
  
  public Uri getHiResImageUri()
  {
    if (this.nX == null) {
      return this.mr;
    }
    return this.nX.getHiResImageUri();
  }
  
  public Uri getIconImageUri()
  {
    if (this.nX == null) {
      return this.mq;
    }
    return this.nX.getIconImageUri();
  }
  
  public String getParticipantId()
  {
    return this.nd;
  }
  
  public Player getPlayer()
  {
    return this.nX;
  }
  
  public int getStatus()
  {
    return this.nU;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public int hashCode()
  {
    return a(this);
  }
  
  public boolean isConnectedToRoom()
  {
    return this.nW;
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
    int j = 0;
    if (!aX())
    {
      c.a(this, paramParcel, paramInt);
      return;
    }
    paramParcel.writeString(this.nd);
    paramParcel.writeString(this.ml);
    Object localObject1;
    if (this.mq == null)
    {
      localObject1 = null;
      label46:
      paramParcel.writeString((String)localObject1);
      if (this.mr != null) {
        break label143;
      }
      localObject1 = localObject2;
      label63:
      paramParcel.writeString((String)localObject1);
      paramParcel.writeInt(this.nU);
      paramParcel.writeString(this.nV);
      if (!this.nW) {
        break label155;
      }
      i = 1;
      label94:
      paramParcel.writeInt(i);
      if (this.nX != null) {
        break label160;
      }
    }
    label143:
    label155:
    label160:
    for (int i = j;; i = 1)
    {
      paramParcel.writeInt(i);
      if (this.nX == null) {
        break;
      }
      this.nX.writeToParcel(paramParcel, paramInt);
      return;
      localObject1 = this.mq.toString();
      break label46;
      localObject1 = this.mr.toString();
      break label63;
      i = 0;
      break label94;
    }
  }
  
  static final class a
    extends c
  {
    public ParticipantEntity w(Parcel paramParcel)
    {
      int i = 0;
      if ((ParticipantEntity.b(ParticipantEntity.bQ())) || (ParticipantEntity.J(ParticipantEntity.class.getCanonicalName()))) {
        return super.w(paramParcel);
      }
      String str1 = paramParcel.readString();
      String str2 = paramParcel.readString();
      Object localObject1 = paramParcel.readString();
      Object localObject2;
      label68:
      int j;
      String str3;
      boolean bool;
      if (localObject1 == null)
      {
        localObject1 = null;
        localObject2 = paramParcel.readString();
        if (localObject2 != null) {
          break label150;
        }
        localObject2 = null;
        j = paramParcel.readInt();
        str3 = paramParcel.readString();
        if (paramParcel.readInt() <= 0) {
          break label160;
        }
        bool = true;
        label89:
        if (paramParcel.readInt() > 0) {
          i = 1;
        }
        if (i == 0) {
          break label166;
        }
      }
      label150:
      label160:
      label166:
      for (paramParcel = (PlayerEntity)PlayerEntity.CREATOR.createFromParcel(paramParcel);; paramParcel = null)
      {
        return new ParticipantEntity(1, str1, str2, (Uri)localObject1, (Uri)localObject2, j, str3, bool, paramParcel, 7);
        localObject1 = Uri.parse((String)localObject1);
        break;
        localObject2 = Uri.parse((String)localObject2);
        break label68;
        bool = false;
        break label89;
      }
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\games\multiplayer\ParticipantEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */