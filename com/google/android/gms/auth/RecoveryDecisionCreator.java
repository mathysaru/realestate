package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class RecoveryDecisionCreator
  implements Parcelable.Creator<RecoveryDecision>
{
  public static final int CONTENT_DESCRIPTION = 0;
  
  static void a(RecoveryDecision paramRecoveryDecision, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramRecoveryDecision.iM);
    b.a(paramParcel, 2, paramRecoveryDecision.recoveryIntent, paramInt, false);
    b.a(paramParcel, 3, paramRecoveryDecision.showRecoveryInterstitial);
    b.a(paramParcel, 4, paramRecoveryDecision.isRecoveryInfoNeeded);
    b.a(paramParcel, 5, paramRecoveryDecision.isRecoveryInterstitialAllowed);
    b.a(paramParcel, 6, paramRecoveryDecision.recoveryIntentWithoutIntro, paramInt, false);
    b.C(paramParcel, i);
  }
  
  public RecoveryDecision createFromParcel(Parcel paramParcel)
  {
    PendingIntent localPendingIntent1 = null;
    boolean bool1 = false;
    int j = a.j(paramParcel);
    boolean bool2 = false;
    boolean bool3 = false;
    PendingIntent localPendingIntent2 = null;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.i(paramParcel);
      switch (a.y(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        i = a.f(paramParcel, k);
        break;
      case 2: 
        localPendingIntent2 = (PendingIntent)a.a(paramParcel, k, PendingIntent.CREATOR);
        break;
      case 3: 
        bool3 = a.c(paramParcel, k);
        break;
      case 4: 
        bool2 = a.c(paramParcel, k);
        break;
      case 5: 
        bool1 = a.c(paramParcel, k);
        break;
      case 6: 
        localPendingIntent1 = (PendingIntent)a.a(paramParcel, k, PendingIntent.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new RecoveryDecision(i, localPendingIntent2, bool3, bool2, bool1, localPendingIntent1);
  }
  
  public RecoveryDecision[] newArray(int paramInt)
  {
    return new RecoveryDecision[paramInt];
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\RecoveryDecisionCreator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */