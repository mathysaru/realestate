package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.internal.dm;
import java.util.ArrayList;

public final class b
  extends com.google.android.gms.common.data.b
  implements Invitation
{
  private final ArrayList<Participant> nQ;
  private final Game nS;
  private final d nT;
  
  b(com.google.android.gms.common.data.d paramd, int paramInt1, int paramInt2)
  {
    super(paramd, paramInt1);
    this.nS = new com.google.android.gms.games.b(paramd, paramInt1);
    this.nQ = new ArrayList(paramInt2);
    String str = getString("external_inviter_id");
    paramInt1 = 0;
    paramd = null;
    while (paramInt1 < paramInt2)
    {
      d locald = new d(this.jf, this.ji + paramInt1);
      if (locald.getParticipantId().equals(str)) {
        paramd = locald;
      }
      this.nQ.add(locald);
      paramInt1 += 1;
    }
    this.nT = ((d)dm.a(paramd, "Must have a valid inviter!"));
  }
  
  public int ch()
  {
    return getInteger("type");
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return InvitationEntity.a(this, paramObject);
  }
  
  public Invitation freeze()
  {
    return new InvitationEntity(this);
  }
  
  public long getCreationTimestamp()
  {
    return getLong("creation_timestamp");
  }
  
  public Game getGame()
  {
    return this.nS;
  }
  
  public String getInvitationId()
  {
    return getString("external_invitation_id");
  }
  
  public Participant getInviter()
  {
    return this.nT;
  }
  
  public ArrayList<Participant> getParticipants()
  {
    return this.nQ;
  }
  
  public int getVariant()
  {
    return getInteger("variant");
  }
  
  public int hashCode()
  {
    return InvitationEntity.a(this);
  }
  
  public String toString()
  {
    return InvitationEntity.b(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((InvitationEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\games\multiplayer\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */