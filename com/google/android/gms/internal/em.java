package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.OnGamesLoadedListener;
import com.google.android.gms.games.OnPlayersLoadedListener;
import com.google.android.gms.games.OnSignOutCompleteListener;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.OnAchievementUpdatedListener;
import com.google.android.gms.games.achievement.OnAchievementsLoadedListener;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.OnLeaderboardMetadataLoadedListener;
import com.google.android.gms.games.leaderboard.OnLeaderboardScoresLoadedListener;
import com.google.android.gms.games.leaderboard.OnScoreSubmittedListener;
import com.google.android.gms.games.leaderboard.SubmitScoreResult;
import com.google.android.gms.games.leaderboard.b;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.google.android.gms.games.multiplayer.OnInvitationsLoadedListener;
import com.google.android.gms.games.multiplayer.ParticipantUtils;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeReliableMessageSentListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import com.google.android.gms.games.multiplayer.realtime.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public final class em
  extends de<er>
{
  private final String it;
  private final String mF;
  private final Map<String, et> mG;
  private PlayerEntity mH;
  private GameEntity mI;
  private final es mJ;
  private boolean mK = false;
  private final Binder mL;
  private final long mM;
  private final boolean mN;
  
  public em(Context paramContext, String paramString1, String paramString2, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener, String[] paramArrayOfString, int paramInt, View paramView, boolean paramBoolean)
  {
    super(paramContext, paramConnectionCallbacks, paramOnConnectionFailedListener, paramArrayOfString);
    this.mF = paramString1;
    this.it = ((String)dm.e(paramString2));
    this.mL = new Binder();
    this.mG = new HashMap();
    this.mJ = es.a(this, paramInt);
    setViewForPopups(paramView);
    this.mM = hashCode();
    this.mN = paramBoolean;
  }
  
  private et K(String paramString)
  {
    try
    {
      Object localObject = ((er)bd()).M(paramString);
      if (localObject == null) {
        return null;
      }
      ep.e("GamesClient", "Creating a socket to bind to:" + (String)localObject);
      LocalSocket localLocalSocket = new LocalSocket();
      return null;
    }
    catch (RemoteException paramString)
    {
      try
      {
        localLocalSocket.connect(new LocalSocketAddress((String)localObject));
        localObject = new et(localLocalSocket, paramString);
        this.mG.put(paramString, localObject);
        return (et)localObject;
      }
      catch (IOException paramString)
      {
        ep.d("GamesClient", "connect() call failed on socket: " + paramString.getMessage());
      }
      paramString = paramString;
      ep.d("GamesClient", "Unable to create socket. Service died.");
      return null;
    }
  }
  
  private void bR()
  {
    this.mH = null;
  }
  
  private void bS()
  {
    Iterator localIterator = this.mG.values().iterator();
    while (localIterator.hasNext())
    {
      et localet = (et)localIterator.next();
      try
      {
        localet.close();
      }
      catch (IOException localIOException)
      {
        ep.a("GamesClient", "IOException:", localIOException);
      }
    }
    this.mG.clear();
  }
  
  private Room x(d paramd)
  {
    a locala = new a(paramd);
    paramd = null;
    try
    {
      if (locala.getCount() > 0) {
        paramd = (Room)((Room)locala.get(0)).freeze();
      }
      return paramd;
    }
    finally
    {
      locala.close();
    }
  }
  
  protected er A(IBinder paramIBinder)
  {
    return er.a.C(paramIBinder);
  }
  
  public int a(byte[] paramArrayOfByte, String paramString, String[] paramArrayOfString)
  {
    dm.a(paramArrayOfString, "Participant IDs must not be null");
    try
    {
      int i = ((er)bd()).b(paramArrayOfByte, paramString, paramArrayOfString);
      return i;
    }
    catch (RemoteException paramArrayOfByte)
    {
      ep.c("GamesClient", "service died");
    }
    return -1;
  }
  
  protected void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    if ((paramInt == 0) && (paramBundle != null)) {
      this.mK = paramBundle.getBoolean("show_welcome_popup");
    }
    super.a(paramInt, paramIBinder, paramBundle);
  }
  
  public void a(IBinder paramIBinder, Bundle paramBundle)
  {
    if (isConnected()) {}
    try
    {
      ((er)bd()).a(paramIBinder, paramBundle);
      return;
    }
    catch (RemoteException paramIBinder)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  protected void a(ConnectionResult paramConnectionResult)
  {
    super.a(paramConnectionResult);
    this.mK = false;
  }
  
  public void a(OnPlayersLoadedListener paramOnPlayersLoadedListener, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      ((er)bd()).a(new ae(paramOnPlayersLoadedListener), paramInt, paramBoolean1, paramBoolean2);
      return;
    }
    catch (RemoteException paramOnPlayersLoadedListener)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void a(OnAchievementUpdatedListener paramOnAchievementUpdatedListener, String paramString)
  {
    if (paramOnAchievementUpdatedListener == null) {}
    for (paramOnAchievementUpdatedListener = null;; paramOnAchievementUpdatedListener = new d(paramOnAchievementUpdatedListener)) {
      try
      {
        ((er)bd()).a(paramOnAchievementUpdatedListener, paramString, this.mJ.bZ(), this.mJ.bY());
        return;
      }
      catch (RemoteException paramOnAchievementUpdatedListener)
      {
        ep.c("GamesClient", "service died");
      }
    }
  }
  
  public void a(OnAchievementUpdatedListener paramOnAchievementUpdatedListener, String paramString, int paramInt)
  {
    if (paramOnAchievementUpdatedListener == null) {}
    for (paramOnAchievementUpdatedListener = null;; paramOnAchievementUpdatedListener = new d(paramOnAchievementUpdatedListener)) {
      try
      {
        ((er)bd()).a(paramOnAchievementUpdatedListener, paramString, paramInt, this.mJ.bZ(), this.mJ.bY());
        return;
      }
      catch (RemoteException paramOnAchievementUpdatedListener)
      {
        ep.c("GamesClient", "service died");
      }
    }
  }
  
  public void a(OnScoreSubmittedListener paramOnScoreSubmittedListener, String paramString1, long paramLong, String paramString2)
  {
    if (paramOnScoreSubmittedListener == null) {}
    for (paramOnScoreSubmittedListener = null;; paramOnScoreSubmittedListener = new ap(paramOnScoreSubmittedListener)) {
      try
      {
        ((er)bd()).a(paramOnScoreSubmittedListener, paramString1, paramLong, paramString2);
        return;
      }
      catch (RemoteException paramOnScoreSubmittedListener)
      {
        ep.c("GamesClient", "service died");
      }
    }
  }
  
  protected void a(dj paramdj, de.d paramd)
    throws RemoteException
  {
    String str = getContext().getResources().getConfiguration().locale.toString();
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.mN);
    paramdj.a(paramd, 4030500, getContext().getPackageName(), this.it, aY(), this.mF, this.mJ.bZ(), str, localBundle);
  }
  
  protected void a(String... paramVarArgs)
  {
    int i = 0;
    int j = 0;
    boolean bool1 = false;
    if (i < paramVarArgs.length)
    {
      String str = paramVarArgs[i];
      boolean bool2;
      if (str.equals("https://www.googleapis.com/auth/games")) {
        bool2 = true;
      }
      for (;;)
      {
        i += 1;
        bool1 = bool2;
        break;
        bool2 = bool1;
        if (str.equals("https://www.googleapis.com/auth/games.firstparty"))
        {
          j = 1;
          bool2 = bool1;
        }
      }
    }
    if (j != 0)
    {
      if (!bool1) {}
      for (bool1 = true;; bool1 = false)
      {
        dm.a(bool1, String.format("Cannot have both %s and %s!", new Object[] { "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty" }));
        return;
      }
    }
    dm.a(bool1, String.format("GamesClient requires %s to function.", new Object[] { "https://www.googleapis.com/auth/games" }));
  }
  
  protected void aZ()
  {
    super.aZ();
    if (this.mK)
    {
      this.mJ.bX();
      this.mK = false;
    }
  }
  
  protected String ag()
  {
    return "com.google.android.gms.games.service.START";
  }
  
  protected String ah()
  {
    return "com.google.android.gms.games.internal.IGamesService";
  }
  
  public void b(OnAchievementUpdatedListener paramOnAchievementUpdatedListener, String paramString)
  {
    if (paramOnAchievementUpdatedListener == null) {}
    for (paramOnAchievementUpdatedListener = null;; paramOnAchievementUpdatedListener = new d(paramOnAchievementUpdatedListener)) {
      try
      {
        ((er)bd()).b(paramOnAchievementUpdatedListener, paramString, this.mJ.bZ(), this.mJ.bY());
        return;
      }
      catch (RemoteException paramOnAchievementUpdatedListener)
      {
        ep.c("GamesClient", "service died");
      }
    }
  }
  
  public void b(OnAchievementUpdatedListener paramOnAchievementUpdatedListener, String paramString, int paramInt)
  {
    if (paramOnAchievementUpdatedListener == null) {}
    for (paramOnAchievementUpdatedListener = null;; paramOnAchievementUpdatedListener = new d(paramOnAchievementUpdatedListener)) {
      try
      {
        ((er)bd()).b(paramOnAchievementUpdatedListener, paramString, paramInt, this.mJ.bZ(), this.mJ.bY());
        return;
      }
      catch (RemoteException paramOnAchievementUpdatedListener)
      {
        ep.c("GamesClient", "service died");
      }
    }
  }
  
  public void bT()
  {
    if (isConnected()) {}
    try
    {
      ((er)bd()).bT();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  protected Bundle ba()
  {
    try
    {
      Bundle localBundle = ((er)bd()).ba();
      if (localBundle != null) {
        localBundle.setClassLoader(em.class.getClassLoader());
      }
      return localBundle;
    }
    catch (RemoteException localRemoteException)
    {
      ep.c("GamesClient", "service died");
    }
    return null;
  }
  
  public void clearNotifications(int paramInt)
  {
    try
    {
      ((er)bd()).clearNotifications(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void connect()
  {
    bR();
    super.connect();
  }
  
  public void createRoom(RoomConfig paramRoomConfig)
  {
    try
    {
      aj localaj = new aj(paramRoomConfig.getRoomUpdateListener(), paramRoomConfig.getRoomStatusUpdateListener(), paramRoomConfig.getMessageReceivedListener());
      ((er)bd()).a(localaj, this.mL, paramRoomConfig.getVariant(), paramRoomConfig.getInvitedPlayerIds(), paramRoomConfig.getAutoMatchCriteria(), paramRoomConfig.isSocketEnabled(), this.mM);
      return;
    }
    catch (RemoteException paramRoomConfig)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void disconnect()
  {
    this.mK = false;
    if (isConnected()) {}
    try
    {
      er localer = (er)bd();
      localer.bT();
      localer.g(this.mM);
      localer.f(this.mM);
      bS();
      super.disconnect();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        ep.c("GamesClient", "Failed to notify client disconnect.");
      }
    }
  }
  
  public Intent getAchievementsIntent()
  {
    bc();
    Intent localIntent = new Intent("com.google.android.gms.games.VIEW_ACHIEVEMENTS");
    localIntent.addFlags(67108864);
    return eo.c(localIntent);
  }
  
  public Intent getAllLeaderboardsIntent()
  {
    bc();
    Intent localIntent = new Intent("com.google.android.gms.games.VIEW_LEADERBOARDS");
    localIntent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", this.mF);
    localIntent.addFlags(67108864);
    return eo.c(localIntent);
  }
  
  public String getAppId()
  {
    try
    {
      String str = ((er)bd()).getAppId();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      ep.c("GamesClient", "service died");
    }
    return null;
  }
  
  public String getCurrentAccountName()
  {
    try
    {
      String str = ((er)bd()).getCurrentAccountName();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      ep.c("GamesClient", "service died");
    }
    return null;
  }
  
  /* Error */
  public com.google.android.gms.games.Game getCurrentGame()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 557	com/google/android/gms/internal/em:bc	()V
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 591	com/google/android/gms/internal/em:mI	Lcom/google/android/gms/games/GameEntity;
    //   10: astore_1
    //   11: aload_1
    //   12: ifnonnull +51 -> 63
    //   15: new 593	com/google/android/gms/games/GameBuffer
    //   18: dup
    //   19: aload_0
    //   20: invokevirtual 215	com/google/android/gms/internal/em:bd	()Landroid/os/IInterface;
    //   23: checkcast 217	com/google/android/gms/internal/er
    //   26: invokeinterface 597 1 0
    //   31: invokespecial 598	com/google/android/gms/games/GameBuffer:<init>	(Lcom/google/android/gms/common/data/d;)V
    //   34: astore_1
    //   35: aload_1
    //   36: invokevirtual 599	com/google/android/gms/games/GameBuffer:getCount	()I
    //   39: ifle +20 -> 59
    //   42: aload_0
    //   43: aload_1
    //   44: iconst_0
    //   45: invokevirtual 602	com/google/android/gms/games/GameBuffer:get	(I)Lcom/google/android/gms/games/Game;
    //   48: invokeinterface 605 1 0
    //   53: checkcast 607	com/google/android/gms/games/GameEntity
    //   56: putfield 591	com/google/android/gms/internal/em:mI	Lcom/google/android/gms/games/GameEntity;
    //   59: aload_1
    //   60: invokevirtual 608	com/google/android/gms/games/GameBuffer:close	()V
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_0
    //   66: getfield 591	com/google/android/gms/internal/em:mI	Lcom/google/android/gms/games/GameEntity;
    //   69: areturn
    //   70: astore_2
    //   71: aload_1
    //   72: invokevirtual 608	com/google/android/gms/games/GameBuffer:close	()V
    //   75: aload_2
    //   76: athrow
    //   77: astore_1
    //   78: ldc -33
    //   80: ldc_w 346
    //   83: invokestatic 348	com/google/android/gms/internal/ep:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   86: goto -23 -> 63
    //   89: astore_1
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_1
    //   93: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	this	em
    //   10	62	1	localObject1	Object
    //   77	1	1	localRemoteException	RemoteException
    //   89	4	1	localObject2	Object
    //   70	6	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   35	59	70	finally
    //   15	35	77	android/os/RemoteException
    //   59	63	77	android/os/RemoteException
    //   71	77	77	android/os/RemoteException
    //   6	11	89	finally
    //   15	35	89	finally
    //   59	63	89	finally
    //   63	65	89	finally
    //   71	77	89	finally
    //   78	86	89	finally
    //   90	92	89	finally
  }
  
  /* Error */
  public com.google.android.gms.games.Player getCurrentPlayer()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 557	com/google/android/gms/internal/em:bc	()V
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 280	com/google/android/gms/internal/em:mH	Lcom/google/android/gms/games/PlayerEntity;
    //   10: astore_1
    //   11: aload_1
    //   12: ifnonnull +51 -> 63
    //   15: new 612	com/google/android/gms/games/PlayerBuffer
    //   18: dup
    //   19: aload_0
    //   20: invokevirtual 215	com/google/android/gms/internal/em:bd	()Landroid/os/IInterface;
    //   23: checkcast 217	com/google/android/gms/internal/er
    //   26: invokeinterface 615 1 0
    //   31: invokespecial 616	com/google/android/gms/games/PlayerBuffer:<init>	(Lcom/google/android/gms/common/data/d;)V
    //   34: astore_1
    //   35: aload_1
    //   36: invokevirtual 617	com/google/android/gms/games/PlayerBuffer:getCount	()I
    //   39: ifle +20 -> 59
    //   42: aload_0
    //   43: aload_1
    //   44: iconst_0
    //   45: invokevirtual 620	com/google/android/gms/games/PlayerBuffer:get	(I)Lcom/google/android/gms/games/Player;
    //   48: invokeinterface 623 1 0
    //   53: checkcast 625	com/google/android/gms/games/PlayerEntity
    //   56: putfield 280	com/google/android/gms/internal/em:mH	Lcom/google/android/gms/games/PlayerEntity;
    //   59: aload_1
    //   60: invokevirtual 626	com/google/android/gms/games/PlayerBuffer:close	()V
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_0
    //   66: getfield 280	com/google/android/gms/internal/em:mH	Lcom/google/android/gms/games/PlayerEntity;
    //   69: areturn
    //   70: astore_2
    //   71: aload_1
    //   72: invokevirtual 626	com/google/android/gms/games/PlayerBuffer:close	()V
    //   75: aload_2
    //   76: athrow
    //   77: astore_1
    //   78: ldc -33
    //   80: ldc_w 346
    //   83: invokestatic 348	com/google/android/gms/internal/ep:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   86: goto -23 -> 63
    //   89: astore_1
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_1
    //   93: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	this	em
    //   10	62	1	localObject1	Object
    //   77	1	1	localRemoteException	RemoteException
    //   89	4	1	localObject2	Object
    //   70	6	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   35	59	70	finally
    //   15	35	77	android/os/RemoteException
    //   59	63	77	android/os/RemoteException
    //   71	77	77	android/os/RemoteException
    //   6	11	89	finally
    //   15	35	89	finally
    //   59	63	89	finally
    //   63	65	89	finally
    //   71	77	89	finally
    //   78	86	89	finally
    //   90	92	89	finally
  }
  
  public String getCurrentPlayerId()
  {
    try
    {
      String str = ((er)bd()).getCurrentPlayerId();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      ep.c("GamesClient", "service died");
    }
    return null;
  }
  
  public Intent getInvitationInboxIntent()
  {
    bc();
    Intent localIntent = new Intent("com.google.android.gms.games.SHOW_INVITATIONS");
    localIntent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", this.mF);
    return eo.c(localIntent);
  }
  
  public Intent getLeaderboardIntent(String paramString)
  {
    bc();
    Intent localIntent = new Intent("com.google.android.gms.games.VIEW_LEADERBOARD_SCORES");
    localIntent.putExtra("com.google.android.gms.games.LEADERBOARD_ID", paramString);
    localIntent.addFlags(67108864);
    return eo.c(localIntent);
  }
  
  public RealTimeSocket getRealTimeSocketForParticipant(String paramString1, String paramString2)
  {
    if ((paramString2 == null) || (!ParticipantUtils.Q(paramString2))) {
      throw new IllegalArgumentException("Bad participant ID");
    }
    et localet = (et)this.mG.get(paramString2);
    if (localet != null)
    {
      paramString1 = localet;
      if (!localet.isClosed()) {}
    }
    else
    {
      paramString1 = K(paramString2);
    }
    return paramString1;
  }
  
  public Intent getRealTimeWaitingRoomIntent(Room paramRoom, int paramInt)
  {
    bc();
    Intent localIntent = new Intent("com.google.android.gms.games.SHOW_REAL_TIME_WAITING_ROOM");
    dm.a(paramRoom, "Room parameter must not be null");
    localIntent.putExtra("room", (Parcelable)paramRoom.freeze());
    if (paramInt >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      dm.a(bool, "minParticipantsToStart must be >= 0");
      localIntent.putExtra("com.google.android.gms.games.MIN_PARTICIPANTS_TO_START", paramInt);
      return eo.c(localIntent);
    }
  }
  
  public Intent getSelectPlayersIntent(int paramInt1, int paramInt2)
  {
    bc();
    Intent localIntent = new Intent("com.google.android.gms.games.SELECT_PLAYERS");
    localIntent.putExtra("com.google.android.gms.games.MIN_SELECTIONS", paramInt1);
    localIntent.putExtra("com.google.android.gms.games.MAX_SELECTIONS", paramInt2);
    return eo.c(localIntent);
  }
  
  public Intent getSettingsIntent()
  {
    bc();
    Intent localIntent = new Intent("com.google.android.gms.games.SHOW_SETTINGS");
    localIntent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", this.mF);
    localIntent.addFlags(67108864);
    return eo.c(localIntent);
  }
  
  public void i(String paramString, int paramInt)
  {
    try
    {
      ((er)bd()).i(paramString, paramInt);
      return;
    }
    catch (RemoteException paramString)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void j(String paramString, int paramInt)
  {
    try
    {
      ((er)bd()).j(paramString, paramInt);
      return;
    }
    catch (RemoteException paramString)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void joinRoom(RoomConfig paramRoomConfig)
  {
    try
    {
      aj localaj = new aj(paramRoomConfig.getRoomUpdateListener(), paramRoomConfig.getRoomStatusUpdateListener(), paramRoomConfig.getMessageReceivedListener());
      ((er)bd()).a(localaj, this.mL, paramRoomConfig.getInvitationId(), paramRoomConfig.isSocketEnabled(), this.mM);
      return;
    }
    catch (RemoteException paramRoomConfig)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void leaveRoom(RoomUpdateListener paramRoomUpdateListener, String paramString)
  {
    try
    {
      ((er)bd()).e(new aj(paramRoomUpdateListener), paramString);
      bS();
      return;
    }
    catch (RemoteException paramRoomUpdateListener)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void loadAchievements(OnAchievementsLoadedListener paramOnAchievementsLoadedListener, boolean paramBoolean)
  {
    try
    {
      ((er)bd()).b(new f(paramOnAchievementsLoadedListener), paramBoolean);
      return;
    }
    catch (RemoteException paramOnAchievementsLoadedListener)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void loadGame(OnGamesLoadedListener paramOnGamesLoadedListener)
  {
    try
    {
      ((er)bd()).d(new j(paramOnGamesLoadedListener));
      return;
    }
    catch (RemoteException paramOnGamesLoadedListener)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void loadInvitations(OnInvitationsLoadedListener paramOnInvitationsLoadedListener)
  {
    try
    {
      ((er)bd()).e(new n(paramOnInvitationsLoadedListener));
      return;
    }
    catch (RemoteException paramOnInvitationsLoadedListener)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener paramOnLeaderboardMetadataLoadedListener, String paramString, boolean paramBoolean)
  {
    try
    {
      ((er)bd()).c(new s(paramOnLeaderboardMetadataLoadedListener), paramString, paramBoolean);
      return;
    }
    catch (RemoteException paramOnLeaderboardMetadataLoadedListener)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener paramOnLeaderboardMetadataLoadedListener, boolean paramBoolean)
  {
    try
    {
      ((er)bd()).c(new s(paramOnLeaderboardMetadataLoadedListener), paramBoolean);
      return;
    }
    catch (RemoteException paramOnLeaderboardMetadataLoadedListener)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void loadMoreScores(OnLeaderboardScoresLoadedListener paramOnLeaderboardScoresLoadedListener, LeaderboardScoreBuffer paramLeaderboardScoreBuffer, int paramInt1, int paramInt2)
  {
    try
    {
      ((er)bd()).a(new q(paramOnLeaderboardScoresLoadedListener), paramLeaderboardScoreBuffer.cb().cc(), paramInt1, paramInt2);
      return;
    }
    catch (RemoteException paramOnLeaderboardScoresLoadedListener)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void loadPlayer(OnPlayersLoadedListener paramOnPlayersLoadedListener, String paramString)
  {
    try
    {
      ((er)bd()).c(new ae(paramOnPlayersLoadedListener), paramString);
      return;
    }
    catch (RemoteException paramOnPlayersLoadedListener)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void loadPlayerCenteredScores(OnLeaderboardScoresLoadedListener paramOnLeaderboardScoresLoadedListener, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    try
    {
      ((er)bd()).b(new q(paramOnLeaderboardScoresLoadedListener), paramString, paramInt1, paramInt2, paramInt3, paramBoolean);
      return;
    }
    catch (RemoteException paramOnLeaderboardScoresLoadedListener)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void loadTopScores(OnLeaderboardScoresLoadedListener paramOnLeaderboardScoresLoadedListener, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    try
    {
      ((er)bd()).a(new q(paramOnLeaderboardScoresLoadedListener), paramString, paramInt1, paramInt2, paramInt3, paramBoolean);
      return;
    }
    catch (RemoteException paramOnLeaderboardScoresLoadedListener)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void registerInvitationListener(OnInvitationReceivedListener paramOnInvitationReceivedListener)
  {
    try
    {
      paramOnInvitationReceivedListener = new l(paramOnInvitationReceivedListener);
      ((er)bd()).a(paramOnInvitationReceivedListener, this.mM);
      return;
    }
    catch (RemoteException paramOnInvitationReceivedListener)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public int sendReliableRealTimeMessage(RealTimeReliableMessageSentListener paramRealTimeReliableMessageSentListener, byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    try
    {
      int i = ((er)bd()).a(new ah(paramRealTimeReliableMessageSentListener), paramArrayOfByte, paramString1, paramString2);
      return i;
    }
    catch (RemoteException paramRealTimeReliableMessageSentListener)
    {
      ep.c("GamesClient", "service died");
    }
    return -1;
  }
  
  public int sendUnreliableRealTimeMessageToAll(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      int i = ((er)bd()).b(paramArrayOfByte, paramString, null);
      return i;
    }
    catch (RemoteException paramArrayOfByte)
    {
      ep.c("GamesClient", "service died");
    }
    return -1;
  }
  
  public void setGravityForPopups(int paramInt)
  {
    this.mJ.setGravity(paramInt);
  }
  
  public void setUseNewPlayerNotificationsFirstParty(boolean paramBoolean)
  {
    try
    {
      ((er)bd()).setUseNewPlayerNotificationsFirstParty(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  public void setViewForPopups(View paramView)
  {
    this.mJ.e(paramView);
  }
  
  public void signOut(OnSignOutCompleteListener paramOnSignOutCompleteListener)
  {
    if (paramOnSignOutCompleteListener == null) {}
    for (paramOnSignOutCompleteListener = null;; paramOnSignOutCompleteListener = new an(paramOnSignOutCompleteListener)) {
      try
      {
        ((er)bd()).a(paramOnSignOutCompleteListener);
        return;
      }
      catch (RemoteException paramOnSignOutCompleteListener)
      {
        ep.c("GamesClient", "service died");
      }
    }
  }
  
  public void unregisterInvitationListener()
  {
    try
    {
      ((er)bd()).g(this.mM);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ep.c("GamesClient", "service died");
    }
  }
  
  abstract class a
    extends em.c
  {
    private final ArrayList<String> mO = new ArrayList();
    
    a(RoomStatusUpdateListener paramRoomStatusUpdateListener, d paramd, String[] paramArrayOfString)
    {
      super(paramRoomStatusUpdateListener, paramd);
      int i = 0;
      int j = paramArrayOfString.length;
      while (i < j)
      {
        this.mO.add(paramArrayOfString[i]);
        i += 1;
      }
    }
    
    protected void a(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom)
    {
      a(paramRoomStatusUpdateListener, paramRoom, this.mO);
    }
    
    protected abstract void a(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom, ArrayList<String> paramArrayList);
  }
  
  final class aa
    extends em.a
  {
    aa(RoomStatusUpdateListener paramRoomStatusUpdateListener, d paramd, String[] paramArrayOfString)
    {
      super(paramRoomStatusUpdateListener, paramd, paramArrayOfString);
    }
    
    protected void a(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom, ArrayList<String> paramArrayList)
    {
      paramRoomStatusUpdateListener.onPeersDisconnected(paramRoom, paramArrayList);
    }
  }
  
  final class ab
    extends em.a
  {
    ab(RoomStatusUpdateListener paramRoomStatusUpdateListener, d paramd, String[] paramArrayOfString)
    {
      super(paramRoomStatusUpdateListener, paramd, paramArrayOfString);
    }
    
    protected void a(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom, ArrayList<String> paramArrayList)
    {
      paramRoomStatusUpdateListener.onPeerInvitedToRoom(paramRoom, paramArrayList);
    }
  }
  
  final class ac
    extends em.a
  {
    ac(RoomStatusUpdateListener paramRoomStatusUpdateListener, d paramd, String[] paramArrayOfString)
    {
      super(paramRoomStatusUpdateListener, paramd, paramArrayOfString);
    }
    
    protected void a(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom, ArrayList<String> paramArrayList)
    {
      paramRoomStatusUpdateListener.onPeerJoined(paramRoom, paramArrayList);
    }
  }
  
  final class ad
    extends em.a
  {
    ad(RoomStatusUpdateListener paramRoomStatusUpdateListener, d paramd, String[] paramArrayOfString)
    {
      super(paramRoomStatusUpdateListener, paramd, paramArrayOfString);
    }
    
    protected void a(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom, ArrayList<String> paramArrayList)
    {
      paramRoomStatusUpdateListener.onPeerLeft(paramRoom, paramArrayList);
    }
  }
  
  final class ae
    extends el
  {
    private final OnPlayersLoadedListener ne;
    
    ae(OnPlayersLoadedListener paramOnPlayersLoadedListener)
    {
      this.ne = ((OnPlayersLoadedListener)dm.a(paramOnPlayersLoadedListener, "Listener must not be null"));
    }
    
    public void e(d paramd)
    {
      em.this.a(new em.af(em.this, this.ne, paramd));
    }
  }
  
  final class af
    extends de<er>.c<OnPlayersLoadedListener>
  {
    af(OnPlayersLoadedListener paramOnPlayersLoadedListener, d paramd)
    {
      super(paramOnPlayersLoadedListener, paramd);
    }
    
    protected void a(OnPlayersLoadedListener paramOnPlayersLoadedListener, d paramd)
    {
      paramOnPlayersLoadedListener.onPlayersLoaded(paramd.getStatusCode(), new PlayerBuffer(paramd));
    }
  }
  
  final class ag
    extends de<er>.b<RealTimeReliableMessageSentListener>
  {
    private final int iC;
    private final String nf;
    private final int ng;
    
    ag(RealTimeReliableMessageSentListener paramRealTimeReliableMessageSentListener, int paramInt1, int paramInt2, String paramString)
    {
      super(paramRealTimeReliableMessageSentListener);
      this.iC = paramInt1;
      this.ng = paramInt2;
      this.nf = paramString;
    }
    
    public void a(RealTimeReliableMessageSentListener paramRealTimeReliableMessageSentListener)
    {
      if (paramRealTimeReliableMessageSentListener != null) {
        paramRealTimeReliableMessageSentListener.onRealTimeMessageSent(this.iC, this.ng, this.nf);
      }
    }
    
    protected void aF() {}
  }
  
  final class ah
    extends el
  {
    final RealTimeReliableMessageSentListener nh;
    
    public ah(RealTimeReliableMessageSentListener paramRealTimeReliableMessageSentListener)
    {
      this.nh = paramRealTimeReliableMessageSentListener;
    }
    
    public void a(int paramInt1, int paramInt2, String paramString)
    {
      em.this.a(new em.ag(em.this, this.nh, paramInt1, paramInt2, paramString));
    }
  }
  
  final class ai
    extends em.c
  {
    ai(RoomStatusUpdateListener paramRoomStatusUpdateListener, d paramd)
    {
      super(paramRoomStatusUpdateListener, paramd);
    }
    
    public void a(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom)
    {
      paramRoomStatusUpdateListener.onRoomAutoMatching(paramRoom);
    }
  }
  
  final class aj
    extends el
  {
    private final RoomUpdateListener ni;
    private final RoomStatusUpdateListener nj;
    private final RealTimeMessageReceivedListener nk;
    
    public aj(RoomUpdateListener paramRoomUpdateListener)
    {
      this.ni = ((RoomUpdateListener)dm.a(paramRoomUpdateListener, "Callbacks must not be null"));
      this.nj = null;
      this.nk = null;
    }
    
    public aj(RoomUpdateListener paramRoomUpdateListener, RoomStatusUpdateListener paramRoomStatusUpdateListener, RealTimeMessageReceivedListener paramRealTimeMessageReceivedListener)
    {
      this.ni = ((RoomUpdateListener)dm.a(paramRoomUpdateListener, "Callbacks must not be null"));
      this.nj = paramRoomStatusUpdateListener;
      this.nk = paramRealTimeMessageReceivedListener;
    }
    
    public void a(d paramd, String[] paramArrayOfString)
    {
      em.this.a(new em.ab(em.this, this.nj, paramd, paramArrayOfString));
    }
    
    public void b(d paramd, String[] paramArrayOfString)
    {
      em.this.a(new em.ac(em.this, this.nj, paramd, paramArrayOfString));
    }
    
    public void c(d paramd, String[] paramArrayOfString)
    {
      em.this.a(new em.ad(em.this, this.nj, paramd, paramArrayOfString));
    }
    
    public void d(d paramd, String[] paramArrayOfString)
    {
      em.this.a(new em.z(em.this, this.nj, paramd, paramArrayOfString));
    }
    
    public void e(d paramd, String[] paramArrayOfString)
    {
      em.this.a(new em.y(em.this, this.nj, paramd, paramArrayOfString));
    }
    
    public void f(d paramd, String[] paramArrayOfString)
    {
      em.this.a(new em.aa(em.this, this.nj, paramd, paramArrayOfString));
    }
    
    public void n(d paramd)
    {
      em.this.a(new em.am(em.this, this.ni, paramd));
    }
    
    public void o(d paramd)
    {
      em.this.a(new em.p(em.this, this.ni, paramd));
    }
    
    public void onLeftRoom(int paramInt, String paramString)
    {
      em.this.a(new em.u(em.this, this.ni, paramInt, paramString));
    }
    
    public void onP2PConnected(String paramString)
    {
      em.this.a(new em.w(em.this, this.nj, paramString));
    }
    
    public void onP2PDisconnected(String paramString)
    {
      em.this.a(new em.x(em.this, this.nj, paramString));
    }
    
    public void onRealTimeMessageReceived(RealTimeMessage paramRealTimeMessage)
    {
      ep.b("GamesClient", "RoomBinderCallbacks: onRealTimeMessageReceived");
      em.this.a(new em.v(em.this, this.nk, paramRealTimeMessage));
    }
    
    public void p(d paramd)
    {
      em.this.a(new em.al(em.this, this.nj, paramd));
    }
    
    public void q(d paramd)
    {
      em.this.a(new em.ai(em.this, this.nj, paramd));
    }
    
    public void r(d paramd)
    {
      em.this.a(new em.ak(em.this, this.ni, paramd));
    }
    
    public void s(d paramd)
    {
      em.this.a(new em.h(em.this, this.nj, paramd));
    }
    
    public void t(d paramd)
    {
      em.this.a(new em.i(em.this, this.nj, paramd));
    }
  }
  
  final class ak
    extends em.b
  {
    ak(RoomUpdateListener paramRoomUpdateListener, d paramd)
    {
      super(paramRoomUpdateListener, paramd);
    }
    
    public void a(RoomUpdateListener paramRoomUpdateListener, Room paramRoom, int paramInt)
    {
      paramRoomUpdateListener.onRoomConnected(paramInt, paramRoom);
    }
  }
  
  final class al
    extends em.c
  {
    al(RoomStatusUpdateListener paramRoomStatusUpdateListener, d paramd)
    {
      super(paramRoomStatusUpdateListener, paramd);
    }
    
    public void a(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom)
    {
      paramRoomStatusUpdateListener.onRoomConnecting(paramRoom);
    }
  }
  
  final class am
    extends em.b
  {
    public am(RoomUpdateListener paramRoomUpdateListener, d paramd)
    {
      super(paramRoomUpdateListener, paramd);
    }
    
    public void a(RoomUpdateListener paramRoomUpdateListener, Room paramRoom, int paramInt)
    {
      paramRoomUpdateListener.onRoomCreated(paramInt, paramRoom);
    }
  }
  
  final class an
    extends el
  {
    private final OnSignOutCompleteListener nl;
    
    public an(OnSignOutCompleteListener paramOnSignOutCompleteListener)
    {
      this.nl = ((OnSignOutCompleteListener)dm.a(paramOnSignOutCompleteListener, "Listener must not be null"));
    }
    
    public void onSignOutComplete()
    {
      em.this.a(new em.ao(em.this, this.nl));
    }
  }
  
  final class ao
    extends de<er>.b<OnSignOutCompleteListener>
  {
    public ao(OnSignOutCompleteListener paramOnSignOutCompleteListener)
    {
      super(paramOnSignOutCompleteListener);
    }
    
    public void a(OnSignOutCompleteListener paramOnSignOutCompleteListener)
    {
      paramOnSignOutCompleteListener.onSignOutComplete();
    }
    
    protected void aF() {}
  }
  
  final class ap
    extends el
  {
    private final OnScoreSubmittedListener nm;
    
    public ap(OnScoreSubmittedListener paramOnScoreSubmittedListener)
    {
      this.nm = ((OnScoreSubmittedListener)dm.a(paramOnScoreSubmittedListener, "Listener must not be null"));
    }
    
    public void d(d paramd)
    {
      paramd = new SubmitScoreResult(paramd);
      em.this.a(new em.aq(em.this, this.nm, paramd));
    }
  }
  
  final class aq
    extends de<er>.b<OnScoreSubmittedListener>
  {
    private final SubmitScoreResult nn;
    
    public aq(OnScoreSubmittedListener paramOnScoreSubmittedListener, SubmitScoreResult paramSubmitScoreResult)
    {
      super(paramOnScoreSubmittedListener);
      this.nn = paramSubmitScoreResult;
    }
    
    public void a(OnScoreSubmittedListener paramOnScoreSubmittedListener)
    {
      paramOnScoreSubmittedListener.onScoreSubmitted(this.nn.getStatusCode(), this.nn);
    }
    
    protected void aF() {}
  }
  
  abstract class b
    extends de<er>.c<RoomUpdateListener>
  {
    b(RoomUpdateListener paramRoomUpdateListener, d paramd)
    {
      super(paramRoomUpdateListener, paramd);
    }
    
    protected void a(RoomUpdateListener paramRoomUpdateListener, d paramd)
    {
      a(paramRoomUpdateListener, em.a(em.this, paramd), paramd.getStatusCode());
    }
    
    protected abstract void a(RoomUpdateListener paramRoomUpdateListener, Room paramRoom, int paramInt);
  }
  
  abstract class c
    extends de<er>.c<RoomStatusUpdateListener>
  {
    c(RoomStatusUpdateListener paramRoomStatusUpdateListener, d paramd)
    {
      super(paramRoomStatusUpdateListener, paramd);
    }
    
    protected void a(RoomStatusUpdateListener paramRoomStatusUpdateListener, d paramd)
    {
      a(paramRoomStatusUpdateListener, em.a(em.this, paramd));
    }
    
    protected abstract void a(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom);
  }
  
  final class d
    extends el
  {
    private final OnAchievementUpdatedListener mQ;
    
    d(OnAchievementUpdatedListener paramOnAchievementUpdatedListener)
    {
      this.mQ = ((OnAchievementUpdatedListener)dm.a(paramOnAchievementUpdatedListener, "Listener must not be null"));
    }
    
    public void onAchievementUpdated(int paramInt, String paramString)
    {
      em.this.a(new em.e(em.this, this.mQ, paramInt, paramString));
    }
  }
  
  final class e
    extends de<er>.b<OnAchievementUpdatedListener>
  {
    private final int iC;
    private final String mR;
    
    e(OnAchievementUpdatedListener paramOnAchievementUpdatedListener, int paramInt, String paramString)
    {
      super(paramOnAchievementUpdatedListener);
      this.iC = paramInt;
      this.mR = paramString;
    }
    
    protected void a(OnAchievementUpdatedListener paramOnAchievementUpdatedListener)
    {
      paramOnAchievementUpdatedListener.onAchievementUpdated(this.iC, this.mR);
    }
    
    protected void aF() {}
  }
  
  final class f
    extends el
  {
    private final OnAchievementsLoadedListener mS;
    
    f(OnAchievementsLoadedListener paramOnAchievementsLoadedListener)
    {
      this.mS = ((OnAchievementsLoadedListener)dm.a(paramOnAchievementsLoadedListener, "Listener must not be null"));
    }
    
    public void b(d paramd)
    {
      em.this.a(new em.g(em.this, this.mS, paramd));
    }
  }
  
  final class g
    extends de<er>.c<OnAchievementsLoadedListener>
  {
    g(OnAchievementsLoadedListener paramOnAchievementsLoadedListener, d paramd)
    {
      super(paramOnAchievementsLoadedListener, paramd);
    }
    
    protected void a(OnAchievementsLoadedListener paramOnAchievementsLoadedListener, d paramd)
    {
      paramOnAchievementsLoadedListener.onAchievementsLoaded(paramd.getStatusCode(), new AchievementBuffer(paramd));
    }
  }
  
  final class h
    extends em.c
  {
    h(RoomStatusUpdateListener paramRoomStatusUpdateListener, d paramd)
    {
      super(paramRoomStatusUpdateListener, paramd);
    }
    
    public void a(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom)
    {
      paramRoomStatusUpdateListener.onConnectedToRoom(paramRoom);
    }
  }
  
  final class i
    extends em.c
  {
    i(RoomStatusUpdateListener paramRoomStatusUpdateListener, d paramd)
    {
      super(paramRoomStatusUpdateListener, paramd);
    }
    
    public void a(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom)
    {
      paramRoomStatusUpdateListener.onDisconnectedFromRoom(paramRoom);
    }
  }
  
  final class j
    extends el
  {
    private final OnGamesLoadedListener mT;
    
    j(OnGamesLoadedListener paramOnGamesLoadedListener)
    {
      this.mT = ((OnGamesLoadedListener)dm.a(paramOnGamesLoadedListener, "Listener must not be null"));
    }
    
    public void g(d paramd)
    {
      em.this.a(new em.k(em.this, this.mT, paramd));
    }
  }
  
  final class k
    extends de<er>.c<OnGamesLoadedListener>
  {
    k(OnGamesLoadedListener paramOnGamesLoadedListener, d paramd)
    {
      super(paramOnGamesLoadedListener, paramd);
    }
    
    protected void a(OnGamesLoadedListener paramOnGamesLoadedListener, d paramd)
    {
      paramOnGamesLoadedListener.onGamesLoaded(paramd.getStatusCode(), new GameBuffer(paramd));
    }
  }
  
  final class l
    extends el
  {
    private final OnInvitationReceivedListener mU;
    
    l(OnInvitationReceivedListener paramOnInvitationReceivedListener)
    {
      this.mU = paramOnInvitationReceivedListener;
    }
    
    public void k(d paramd)
    {
      InvitationBuffer localInvitationBuffer = new InvitationBuffer(paramd);
      paramd = null;
      try
      {
        if (localInvitationBuffer.getCount() > 0) {
          paramd = (Invitation)((Invitation)localInvitationBuffer.get(0)).freeze();
        }
        localInvitationBuffer.close();
        if (paramd != null) {
          em.this.a(new em.m(em.this, this.mU, paramd));
        }
        return;
      }
      finally
      {
        localInvitationBuffer.close();
      }
    }
  }
  
  final class m
    extends de<er>.b<OnInvitationReceivedListener>
  {
    private final Invitation mV;
    
    m(OnInvitationReceivedListener paramOnInvitationReceivedListener, Invitation paramInvitation)
    {
      super(paramOnInvitationReceivedListener);
      this.mV = paramInvitation;
    }
    
    protected void a(OnInvitationReceivedListener paramOnInvitationReceivedListener)
    {
      paramOnInvitationReceivedListener.onInvitationReceived(this.mV);
    }
    
    protected void aF() {}
  }
  
  final class n
    extends el
  {
    private final OnInvitationsLoadedListener mW;
    
    n(OnInvitationsLoadedListener paramOnInvitationsLoadedListener)
    {
      this.mW = paramOnInvitationsLoadedListener;
    }
    
    public void j(d paramd)
    {
      em.this.a(new em.o(em.this, this.mW, paramd));
    }
  }
  
  final class o
    extends de<er>.c<OnInvitationsLoadedListener>
  {
    o(OnInvitationsLoadedListener paramOnInvitationsLoadedListener, d paramd)
    {
      super(paramOnInvitationsLoadedListener, paramd);
    }
    
    protected void a(OnInvitationsLoadedListener paramOnInvitationsLoadedListener, d paramd)
    {
      paramOnInvitationsLoadedListener.onInvitationsLoaded(paramd.getStatusCode(), new InvitationBuffer(paramd));
    }
  }
  
  final class p
    extends em.b
  {
    public p(RoomUpdateListener paramRoomUpdateListener, d paramd)
    {
      super(paramRoomUpdateListener, paramd);
    }
    
    public void a(RoomUpdateListener paramRoomUpdateListener, Room paramRoom, int paramInt)
    {
      paramRoomUpdateListener.onJoinedRoom(paramInt, paramRoom);
    }
  }
  
  final class q
    extends el
  {
    private final OnLeaderboardScoresLoadedListener mX;
    
    q(OnLeaderboardScoresLoadedListener paramOnLeaderboardScoresLoadedListener)
    {
      this.mX = ((OnLeaderboardScoresLoadedListener)dm.a(paramOnLeaderboardScoresLoadedListener, "Listener must not be null"));
    }
    
    public void a(d paramd1, d paramd2)
    {
      em.this.a(new em.r(em.this, this.mX, paramd1, paramd2));
    }
  }
  
  final class r
    extends de<er>.b<OnLeaderboardScoresLoadedListener>
  {
    private final d mY;
    private final d mZ;
    
    r(OnLeaderboardScoresLoadedListener paramOnLeaderboardScoresLoadedListener, d paramd1, d paramd2)
    {
      super(paramOnLeaderboardScoresLoadedListener);
      this.mY = paramd1;
      this.mZ = paramd2;
    }
    
    protected void a(OnLeaderboardScoresLoadedListener paramOnLeaderboardScoresLoadedListener)
    {
      Object localObject = null;
      d locald1 = this.mY;
      d locald2 = this.mZ;
      if (paramOnLeaderboardScoresLoadedListener != null) {}
      for (;;)
      {
        try
        {
          LeaderboardBuffer localLeaderboardBuffer = new LeaderboardBuffer(locald1);
          LeaderboardScoreBuffer localLeaderboardScoreBuffer = new LeaderboardScoreBuffer(locald2);
          paramOnLeaderboardScoresLoadedListener.onLeaderboardScoresLoaded(locald2.getStatusCode(), localLeaderboardBuffer, localLeaderboardScoreBuffer);
          locald1 = null;
          paramOnLeaderboardScoresLoadedListener = (OnLeaderboardScoresLoadedListener)localObject;
          return;
        }
        finally
        {
          if (locald1 != null) {
            locald1.close();
          }
          if (locald2 != null) {
            locald2.close();
          }
        }
        paramOnLeaderboardScoresLoadedListener = locald2;
      }
    }
    
    protected void aF()
    {
      if (this.mY != null) {
        this.mY.close();
      }
      if (this.mZ != null) {
        this.mZ.close();
      }
    }
  }
  
  final class s
    extends el
  {
    private final OnLeaderboardMetadataLoadedListener na;
    
    s(OnLeaderboardMetadataLoadedListener paramOnLeaderboardMetadataLoadedListener)
    {
      this.na = ((OnLeaderboardMetadataLoadedListener)dm.a(paramOnLeaderboardMetadataLoadedListener, "Listener must not be null"));
    }
    
    public void c(d paramd)
    {
      em.this.a(new em.t(em.this, this.na, paramd));
    }
  }
  
  final class t
    extends de<er>.c<OnLeaderboardMetadataLoadedListener>
  {
    t(OnLeaderboardMetadataLoadedListener paramOnLeaderboardMetadataLoadedListener, d paramd)
    {
      super(paramOnLeaderboardMetadataLoadedListener, paramd);
    }
    
    protected void a(OnLeaderboardMetadataLoadedListener paramOnLeaderboardMetadataLoadedListener, d paramd)
    {
      paramOnLeaderboardMetadataLoadedListener.onLeaderboardMetadataLoaded(paramd.getStatusCode(), new LeaderboardBuffer(paramd));
    }
  }
  
  final class u
    extends de<er>.b<RoomUpdateListener>
  {
    private final int iC;
    private final String nb;
    
    u(RoomUpdateListener paramRoomUpdateListener, int paramInt, String paramString)
    {
      super(paramRoomUpdateListener);
      this.iC = paramInt;
      this.nb = paramString;
    }
    
    public void a(RoomUpdateListener paramRoomUpdateListener)
    {
      paramRoomUpdateListener.onLeftRoom(this.iC, this.nb);
    }
    
    protected void aF() {}
  }
  
  final class v
    extends de<er>.b<RealTimeMessageReceivedListener>
  {
    private final RealTimeMessage nc;
    
    v(RealTimeMessageReceivedListener paramRealTimeMessageReceivedListener, RealTimeMessage paramRealTimeMessage)
    {
      super(paramRealTimeMessageReceivedListener);
      this.nc = paramRealTimeMessage;
    }
    
    public void a(RealTimeMessageReceivedListener paramRealTimeMessageReceivedListener)
    {
      ep.b("GamesClient", "Deliver Message received callback");
      if (paramRealTimeMessageReceivedListener != null) {
        paramRealTimeMessageReceivedListener.onRealTimeMessageReceived(this.nc);
      }
    }
    
    protected void aF() {}
  }
  
  final class w
    extends de<er>.b<RoomStatusUpdateListener>
  {
    private final String nd;
    
    w(RoomStatusUpdateListener paramRoomStatusUpdateListener, String paramString)
    {
      super(paramRoomStatusUpdateListener);
      this.nd = paramString;
    }
    
    public void a(RoomStatusUpdateListener paramRoomStatusUpdateListener)
    {
      if (paramRoomStatusUpdateListener != null) {
        paramRoomStatusUpdateListener.onP2PConnected(this.nd);
      }
    }
    
    protected void aF() {}
  }
  
  final class x
    extends de<er>.b<RoomStatusUpdateListener>
  {
    private final String nd;
    
    x(RoomStatusUpdateListener paramRoomStatusUpdateListener, String paramString)
    {
      super(paramRoomStatusUpdateListener);
      this.nd = paramString;
    }
    
    public void a(RoomStatusUpdateListener paramRoomStatusUpdateListener)
    {
      if (paramRoomStatusUpdateListener != null) {
        paramRoomStatusUpdateListener.onP2PDisconnected(this.nd);
      }
    }
    
    protected void aF() {}
  }
  
  final class y
    extends em.a
  {
    y(RoomStatusUpdateListener paramRoomStatusUpdateListener, d paramd, String[] paramArrayOfString)
    {
      super(paramRoomStatusUpdateListener, paramd, paramArrayOfString);
    }
    
    protected void a(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom, ArrayList<String> paramArrayList)
    {
      paramRoomStatusUpdateListener.onPeersConnected(paramRoom, paramArrayList);
    }
  }
  
  final class z
    extends em.a
  {
    z(RoomStatusUpdateListener paramRoomStatusUpdateListener, d paramd, String[] paramArrayOfString)
    {
      super(paramRoomStatusUpdateListener, paramd, paramArrayOfString);
    }
    
    protected void a(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom, ArrayList<String> paramArrayList)
    {
      paramRoomStatusUpdateListener.onPeerDeclined(paramRoom, paramArrayList);
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\em.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */