package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class v
  implements SafeParcelable
{
  public static final w CREATOR = new w();
  public final long es;
  public final int et;
  public final List<String> eu;
  public final boolean ev;
  public final Bundle extras;
  public final int tagForChildDirectedTreatment;
  public final int versionCode;
  
  v(int paramInt1, long paramLong, Bundle paramBundle, int paramInt2, List<String> paramList, boolean paramBoolean, int paramInt3)
  {
    this.versionCode = paramInt1;
    this.es = paramLong;
    this.extras = paramBundle;
    this.et = paramInt2;
    this.eu = paramList;
    this.ev = paramBoolean;
    this.tagForChildDirectedTreatment = paramInt3;
  }
  
  public v(Context paramContext, AdRequest paramAdRequest)
  {
    this.versionCode = 1;
    Object localObject1 = paramAdRequest.getBirthday();
    long l;
    if (localObject1 != null)
    {
      l = ((Date)localObject1).getTime();
      this.es = l;
      this.et = paramAdRequest.getGender();
      localObject1 = paramAdRequest.getKeywords();
      if (((Set)localObject1).isEmpty()) {
        break label130;
      }
    }
    label130:
    for (localObject1 = Collections.unmodifiableList(new ArrayList((Collection)localObject1));; localObject1 = null)
    {
      this.eu = ((List)localObject1);
      this.ev = paramAdRequest.isTestDevice(paramContext);
      this.tagForChildDirectedTreatment = paramAdRequest.w();
      paramAdRequest = (AdMobExtras)paramAdRequest.getNetworkExtras(AdMobExtras.class);
      paramContext = (Context)localObject2;
      if (paramAdRequest != null) {
        paramContext = paramAdRequest.getExtras();
      }
      this.extras = paramContext;
      return;
      l = -1L;
      break;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    w.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */