package com.google.android.gms.games.multiplayer;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;

public abstract interface Invitation
  extends Parcelable, Freezable<Invitation>, Participatable
{
  public abstract int ch();
  
  public abstract long getCreationTimestamp();
  
  public abstract Game getGame();
  
  public abstract String getInvitationId();
  
  public abstract Participant getInviter();
  
  public abstract int getVariant();
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\games\multiplayer\Invitation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */