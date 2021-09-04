package com.google.android.gms.auth;

import android.accounts.AccountManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.R.string;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.IOException;
import java.net.URISyntaxException;

public final class GoogleAuthUtil
{
  public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
  public static final String KEY_ANDROID_PACKAGE_NAME;
  public static final String KEY_CALLER_UID;
  public static final String KEY_CLIENT_PACKAGE_NAME = "clientPackageName";
  public static final String KEY_REQUEST_ACTIONS = "request_visible_actions";
  @Deprecated
  public static final String KEY_REQUEST_VISIBLE_ACTIVITIES = "request_visible_actions";
  public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
  private static final ComponentName iH;
  private static final ComponentName iI;
  private static final Intent iJ;
  private static final Intent iK;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      KEY_CALLER_UID = "callerUid";
      if (Build.VERSION.SDK_INT < 14) {
        break label100;
      }
    }
    label100:
    for (;;)
    {
      KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
      iH = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
      iI = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
      iJ = new Intent().setPackage("com.google.android.gms").setComponent(iH);
      iK = new Intent().setPackage("com.google.android.gms").setComponent(iI);
      return;
      break;
    }
  }
  
  private static String a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
    throws IOException, UserRecoverableNotifiedException, GoogleAuthException
  {
    Object localObject = paramBundle;
    if (paramBundle == null) {
      localObject = new Bundle();
    }
    try
    {
      paramString1 = getToken(paramContext, paramString1, paramString2, (Bundle)localObject);
      return paramString1;
    }
    catch (GooglePlayServicesAvailabilityException paramBundle)
    {
      localObject = GooglePlayServicesUtil.getErrorPendingIntent(paramBundle.getConnectionStatusCode(), paramContext, 0);
      Resources localResources = paramContext.getResources();
      Notification localNotification = new Notification(17301642, localResources.getString(R.string.auth_client_play_services_err_notification_msg), System.currentTimeMillis());
      localNotification.flags |= 0x10;
      paramString2 = paramContext.getApplicationInfo().name;
      paramString1 = paramString2;
      if (TextUtils.isEmpty(paramString2)) {
        paramString1 = paramContext.getPackageName();
      }
      paramString1 = localResources.getString(R.string.auth_client_requested_by_msg, new Object[] { paramString1 });
      int i;
      switch (paramBundle.getConnectionStatusCode())
      {
      default: 
        i = R.string.auth_client_using_bad_version_title;
      }
      for (;;)
      {
        localNotification.setLatestEventInfo(paramContext, localResources.getString(i), paramString1, (PendingIntent)localObject);
        ((NotificationManager)paramContext.getSystemService("notification")).notify(39789, localNotification);
        throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        i = R.string.auth_client_needs_installation_title;
        continue;
        i = R.string.auth_client_needs_update_title;
        continue;
        i = R.string.auth_client_needs_enabling_title;
      }
    }
    catch (UserRecoverableAuthException paramContext)
    {
      throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
    }
  }
  
  private static void b(Intent paramIntent)
  {
    if (paramIntent == null) {
      throw new IllegalArgumentException("Callack cannot be null.");
    }
    paramIntent = paramIntent.toUri(1);
    try
    {
      Intent.parseUri(paramIntent, 1);
      return;
    }
    catch (URISyntaxException paramIntent)
    {
      throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
    }
  }
  
  public static String getToken(Context paramContext, String paramString1, String paramString2)
    throws IOException, UserRecoverableAuthException, GoogleAuthException
  {
    return getToken(paramContext, paramString1, paramString2, new Bundle());
  }
  
  /* Error */
  public static String getToken(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
    throws IOException, UserRecoverableAuthException, GoogleAuthException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 224	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   4: astore 5
    //   6: ldc -30
    //   8: invokestatic 231	com/google/android/gms/internal/dm:x	(Ljava/lang/String;)V
    //   11: aload 5
    //   13: invokestatic 235	com/google/android/gms/auth/GoogleAuthUtil:m	(Landroid/content/Context;)V
    //   16: aload_3
    //   17: ifnonnull +108 -> 125
    //   20: new 91	android/os/Bundle
    //   23: dup
    //   24: invokespecial 92	android/os/Bundle:<init>	()V
    //   27: astore_3
    //   28: aload_0
    //   29: invokevirtual 141	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   32: getfield 238	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   35: astore_0
    //   36: aload_3
    //   37: ldc 13
    //   39: aload_0
    //   40: invokevirtual 241	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: aload_3
    //   44: getstatic 43	com/google/android/gms/auth/GoogleAuthUtil:KEY_ANDROID_PACKAGE_NAME	Ljava/lang/String;
    //   47: invokevirtual 245	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   50: ifne +11 -> 61
    //   53: aload_3
    //   54: getstatic 43	com/google/android/gms/auth/GoogleAuthUtil:KEY_ANDROID_PACKAGE_NAME	Ljava/lang/String;
    //   57: aload_0
    //   58: invokevirtual 241	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   61: new 247	com/google/android/gms/common/a
    //   64: dup
    //   65: invokespecial 248	com/google/android/gms/common/a:<init>	()V
    //   68: astore_0
    //   69: aload 5
    //   71: getstatic 73	com/google/android/gms/auth/GoogleAuthUtil:iJ	Landroid/content/Intent;
    //   74: aload_0
    //   75: iconst_1
    //   76: invokevirtual 252	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   79: ifeq +163 -> 242
    //   82: aload_0
    //   83: invokevirtual 256	com/google/android/gms/common/a:aG	()Landroid/os/IBinder;
    //   86: invokestatic 261	com/google/android/gms/internal/o$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/internal/o;
    //   89: aload_1
    //   90: aload_2
    //   91: aload_3
    //   92: invokeinterface 266 4 0
    //   97: astore_1
    //   98: aload_1
    //   99: ldc_w 268
    //   102: invokevirtual 271	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   105: astore_2
    //   106: aload_2
    //   107: invokestatic 152	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   110: istore 4
    //   112: iload 4
    //   114: ifne +23 -> 137
    //   117: aload 5
    //   119: aload_0
    //   120: invokevirtual 275	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   123: aload_2
    //   124: areturn
    //   125: new 91	android/os/Bundle
    //   128: dup
    //   129: aload_3
    //   130: invokespecial 278	android/os/Bundle:<init>	(Landroid/os/Bundle;)V
    //   133: astore_3
    //   134: goto -106 -> 28
    //   137: aload_1
    //   138: ldc_w 280
    //   141: invokevirtual 271	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   144: astore_2
    //   145: aload_1
    //   146: ldc_w 282
    //   149: invokevirtual 286	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   152: checkcast 61	android/content/Intent
    //   155: astore_1
    //   156: aload_2
    //   157: invokestatic 289	com/google/android/gms/auth/GoogleAuthUtil:s	(Ljava/lang/String;)Z
    //   160: ifeq +45 -> 205
    //   163: new 89	com/google/android/gms/auth/UserRecoverableAuthException
    //   166: dup
    //   167: aload_2
    //   168: aload_1
    //   169: invokespecial 292	com/google/android/gms/auth/UserRecoverableAuthException:<init>	(Ljava/lang/String;Landroid/content/Intent;)V
    //   172: athrow
    //   173: astore_1
    //   174: ldc_w 294
    //   177: ldc_w 296
    //   180: aload_1
    //   181: invokestatic 302	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   184: pop
    //   185: new 81	java/io/IOException
    //   188: dup
    //   189: ldc_w 304
    //   192: invokespecial 305	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   195: athrow
    //   196: astore_1
    //   197: aload 5
    //   199: aload_0
    //   200: invokevirtual 275	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   203: aload_1
    //   204: athrow
    //   205: aload_2
    //   206: invokestatic 308	com/google/android/gms/auth/GoogleAuthUtil:r	(Ljava/lang/String;)Z
    //   209: ifeq +24 -> 233
    //   212: new 81	java/io/IOException
    //   215: dup
    //   216: aload_2
    //   217: invokespecial 305	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   220: athrow
    //   221: astore_1
    //   222: new 85	com/google/android/gms/auth/GoogleAuthException
    //   225: dup
    //   226: ldc_w 310
    //   229: invokespecial 311	com/google/android/gms/auth/GoogleAuthException:<init>	(Ljava/lang/String;)V
    //   232: athrow
    //   233: new 85	com/google/android/gms/auth/GoogleAuthException
    //   236: dup
    //   237: aload_2
    //   238: invokespecial 311	com/google/android/gms/auth/GoogleAuthException:<init>	(Ljava/lang/String;)V
    //   241: athrow
    //   242: new 81	java/io/IOException
    //   245: dup
    //   246: ldc_w 313
    //   249: invokespecial 305	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   252: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	253	0	paramContext	Context
    //   0	253	1	paramString1	String
    //   0	253	2	paramString2	String
    //   0	253	3	paramBundle	Bundle
    //   110	3	4	bool	boolean
    //   4	194	5	localContext	Context
    // Exception table:
    //   from	to	target	type
    //   82	112	173	android/os/RemoteException
    //   137	173	173	android/os/RemoteException
    //   205	221	173	android/os/RemoteException
    //   233	242	173	android/os/RemoteException
    //   82	112	196	finally
    //   137	173	196	finally
    //   174	196	196	finally
    //   205	221	196	finally
    //   222	233	196	finally
    //   233	242	196	finally
    //   82	112	221	java/lang/InterruptedException
    //   137	173	221	java/lang/InterruptedException
    //   205	221	221	java/lang/InterruptedException
    //   233	242	221	java/lang/InterruptedException
  }
  
  public static String getTokenWithNotification(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
    throws IOException, UserRecoverableNotifiedException, GoogleAuthException
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localBundle.putBoolean("handle_notification", true);
    return a(paramContext, paramString1, paramString2, localBundle);
  }
  
  public static String getTokenWithNotification(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, Intent paramIntent)
    throws IOException, UserRecoverableNotifiedException, GoogleAuthException
  {
    b(paramIntent);
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localBundle.putParcelable("callback_intent", paramIntent);
    localBundle.putBoolean("handle_notification", true);
    return a(paramContext, paramString1, paramString2, localBundle);
  }
  
  public static String getTokenWithNotification(Context paramContext, String paramString1, String paramString2, Bundle paramBundle1, String paramString3, Bundle paramBundle2)
    throws IOException, UserRecoverableNotifiedException, GoogleAuthException
  {
    if (TextUtils.isEmpty(paramString3)) {
      throw new IllegalArgumentException("Authority cannot be empty or null.");
    }
    Bundle localBundle = paramBundle1;
    if (paramBundle1 == null) {
      localBundle = new Bundle();
    }
    paramBundle1 = paramBundle2;
    if (paramBundle2 == null) {
      paramBundle1 = new Bundle();
    }
    ContentResolver.validateSyncExtrasBundle(paramBundle1);
    localBundle.putString("authority", paramString3);
    localBundle.putBundle("sync_extras", paramBundle1);
    localBundle.putBoolean("handle_notification", true);
    return a(paramContext, paramString1, paramString2, localBundle);
  }
  
  public static void invalidateToken(Context paramContext, String paramString)
  {
    AccountManager.get(paramContext).invalidateAuthToken("com.google", paramString);
  }
  
  private static void m(Context paramContext)
    throws GooglePlayServicesAvailabilityException, GoogleAuthException
  {
    try
    {
      GooglePlayServicesUtil.m(paramContext);
      return;
    }
    catch (GooglePlayServicesRepairableException paramContext)
    {
      throw new GooglePlayServicesAvailabilityException(paramContext.getConnectionStatusCode(), paramContext.getMessage(), paramContext.getIntent());
    }
    catch (GooglePlayServicesNotAvailableException paramContext)
    {
      throw new GoogleAuthException(paramContext.getMessage());
    }
  }
  
  private static boolean r(String paramString)
  {
    return ("NetworkError".equals(paramString)) || ("ServiceUnavailable".equals(paramString)) || ("Timeout".equals(paramString));
  }
  
  private static boolean s(String paramString)
  {
    return ("BadAuthentication".equals(paramString)) || ("CaptchaRequired".equals(paramString)) || ("DeviceManagementRequiredOrSyncDisabled".equals(paramString)) || ("NeedPermission".equals(paramString)) || ("NeedsBrowser".equals(paramString)) || ("UserCancel".equals(paramString)) || ("AppDownloadRequired".equals(paramString));
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\GoogleAuthUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */