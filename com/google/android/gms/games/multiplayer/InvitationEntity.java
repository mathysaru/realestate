package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.en;
import java.util.ArrayList;

public final class InvitationEntity
  extends en
  implements Invitation
{
  public static final Parcelable.Creator<InvitationEntity> CREATOR = new a();
  private final int iM;
  private final GameEntity nL;
  private final String nM;
  private final long nN;
  private final int nO;
  private final ParticipantEntity nP;
  private final ArrayList<ParticipantEntity> nQ;
  private final int nR;
  
  InvitationEntity(int paramInt1, GameEntity paramGameEntity, String paramString, long paramLong, int paramInt2, ParticipantEntity paramParticipantEntity, ArrayList<ParticipantEntity> paramArrayList, int paramInt3)
  {
    this.iM = paramInt1;
    this.nL = paramGameEntity;
    this.nM = paramString;
    this.nN = paramLong;
    this.nO = paramInt2;
    this.nP = paramParticipantEntity;
    this.nQ = paramArrayList;
    this.nR = paramInt3;
  }
  
  InvitationEntity(Invitation paramInvitation)
  {
    this.iM = 1;
    this.nL = new GameEntity(paramInvitation.getGame());
    this.nM = paramInvitation.getInvitationId();
    this.nN = paramInvitation.getCreationTimestamp();
    this.nO = paramInvitation.ch();
    this.nR = paramInvitation.getVariant();
    String str = paramInvitation.getInviter().getParticipantId();
    Participant localParticipant = null;
    ArrayList localArrayList = paramInvitation.getParticipants();
    int j = localArrayList.size();
    this.nQ = new ArrayList(j);
    int i = 0;
    paramInvitation = localParticipant;
    while (i < j)
    {
      localParticipant = (Participant)localArrayList.get(i);
      if (localParticipant.getParticipantId().equals(str)) {
        paramInvitation = localParticipant;
      }
      this.nQ.add((ParticipantEntity)localParticipant.freeze());
      i += 1;
    }
    dm.a(paramInvitation, "Must have a valid inviter!");
    this.nP = ((ParticipantEntity)paramInvitation.freeze());
  }
  
  static int a(Invitation paramInvitation)
  {
    return dl.hashCode(new Object[] { paramInvitation.getGame(), paramInvitation.getInvitationId(), Long.valueOf(paramInvitation.getCreationTimestamp()), Integer.valueOf(paramInvitation.ch()), paramInvitation.getInviter(), paramInvitation.getParticipants(), Integer.valueOf(paramInvitation.getVariant()) });
  }
  
  static boolean a(Invitation paramInvitation, Object paramObject)
  {
    boolean bool2 = true;
    boolean bool1;
    if (!(paramObject instanceof Invitation)) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramInvitation == paramObject);
      paramObject = (Invitation)paramObject;
      if ((!dl.equal(((Invitation)paramObject).getGame(), paramInvitation.getGame())) || (!dl.equal(((Invitation)paramObject).getInvitationId(), paramInvitation.getInvitationId())) || (!dl.equal(Long.valueOf(((Invitation)paramObject).getCreationTimestamp()), Long.valueOf(paramInvitation.getCreationTimestamp()))) || (!dl.equal(Integer.valueOf(((Invitation)paramObject).ch()), Integer.valueOf(paramInvitation.ch()))) || (!dl.equal(((Invitation)paramObject).getInviter(), paramInvitation.getInviter())) || (!dl.equal(((Invitation)paramObject).getParticipants(), paramInvitation.getParticipants()))) {
        break;
      }
      bool1 = bool2;
    } while (dl.equal(Integer.valueOf(((Invitation)paramObject).getVariant()), Integer.valueOf(paramInvitation.getVariant())));
    return false;
  }
  
  static String b(Invitation paramInvitation)
  {
    return dl.d(paramInvitation).a("Game", paramInvitation.getGame()).a("InvitationId", paramInvitation.getInvitationId()).a("CreationTimestamp", Long.valueOf(paramInvitation.getCreationTimestamp())).a("InvitationType", Integer.valueOf(paramInvitation.ch())).a("Inviter", paramInvitation.getInviter()).a("Participants", paramInvitation.getParticipants()).a("Variant", Integer.valueOf(paramInvitation.getVariant())).toString();
  }
  
  public int ch()
  {
    return this.nO;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public Invitation freeze()
  {
    return this;
  }
  
  public long getCreationTimestamp()
  {
    return this.nN;
  }
  
  public Game getGame()
  {
    return this.nL;
  }
  
  public String getInvitationId()
  {
    return this.nM;
  }
  
  public Participant getInviter()
  {
    return this.nP;
  }
  
  public ArrayList<Participant> getParticipants()
  {
    return new ArrayList(this.nQ);
  }
  
  public int getVariant()
  {
    return this.nR;
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
  
  public String toString()
  {
    return b(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!aX()) {
      a.a(this, paramParcel, paramInt);
    }
    for (;;)
    {
      return;
      this.nL.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(this.nM);
      paramParcel.writeLong(this.nN);
      paramParcel.writeInt(this.nO);
      this.nP.writeToParcel(paramParcel, paramInt);
      int j = this.nQ.size();
      paramParcel.writeInt(j);
      int i = 0;
      while (i < j)
      {
        ((ParticipantEntity)this.nQ.get(i)).writeToParcel(paramParcel, paramInt);
        i += 1;
      }
    }
  }
  
  static final class a
    extends a
  {
    public InvitationEntity v(Parcel paramParcel)
    {
      if ((InvitationEntity.b(InvitationEntity.bQ())) || (InvitationEntity.J(InvitationEntity.class.getCanonicalName()))) {
        return super.v(paramParcel);
      }
      GameEntity localGameEntity = (GameEntity)GameEntity.CREATOR.createFromParcel(paramParcel);
      String str = paramParcel.readString();
      long l = paramParcel.readLong();
      int j = paramParcel.readInt();
      ParticipantEntity localParticipantEntity = (ParticipantEntity)ParticipantEntity.CREATOR.createFromParcel(paramParcel);
      int k = paramParcel.readInt();
      ArrayList localArrayList = new ArrayList(k);
      int i = 0;
      while (i < k)
      {
        localArrayList.add(ParticipantEntity.CREATOR.createFromParcel(paramParcel));
        i += 1;
      }
      return new InvitationEntity(1, localGameEntity, str, l, j, localParticipantEntity, localArrayList, -1);
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\games\multiplayer\InvitationEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */