package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class fn
  implements SafeParcelable
{
  public static final fp CREATOR = new fp();
  private final int iM;
  private final String it;
  private final String[] rA;
  private final String rB;
  private final String rC;
  private final String rD;
  private final String rE;
  private final String[] ry;
  private final String[] rz;
  
  fn(int paramInt, String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.iM = paramInt;
    this.it = paramString1;
    this.ry = paramArrayOfString1;
    this.rz = paramArrayOfString2;
    this.rA = paramArrayOfString3;
    this.rB = paramString2;
    this.rC = paramString3;
    this.rD = paramString4;
    this.rE = paramString5;
  }
  
  fn(String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.iM = 1;
    this.it = paramString1;
    this.ry = paramArrayOfString1;
    this.rz = paramArrayOfString2;
    this.rA = paramArrayOfString3;
    this.rB = paramString2;
    this.rC = paramString3;
    this.rD = paramString4;
    this.rE = paramString5;
  }
  
  public String[] cZ()
  {
    return this.ry;
  }
  
  public String[] da()
  {
    return this.rz;
  }
  
  public String[] db()
  {
    return this.rA;
  }
  
  public String dc()
  {
    return this.rB;
  }
  
  public String dd()
  {
    return this.rC;
  }
  
  public String de()
  {
    return this.rD;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String df()
  {
    return this.rE;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof fn)) {}
    do
    {
      return false;
      paramObject = (fn)paramObject;
    } while ((this.iM != ((fn)paramObject).iM) || (!dl.equal(this.it, ((fn)paramObject).it)) || (!dl.equal(this.ry, ((fn)paramObject).ry)) || (!dl.equal(this.rz, ((fn)paramObject).rz)) || (!dl.equal(this.rA, ((fn)paramObject).rA)) || (!dl.equal(this.rB, ((fn)paramObject).rB)) || (!dl.equal(this.rC, ((fn)paramObject).rC)) || (!dl.equal(this.rD, ((fn)paramObject).rD)) || (!dl.equal(this.rE, ((fn)paramObject).rE)));
    return true;
  }
  
  public String getAccountName()
  {
    return this.it;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public int hashCode()
  {
    return dl.hashCode(new Object[] { Integer.valueOf(this.iM), this.it, this.ry, this.rz, this.rA, this.rB, this.rC, this.rD, this.rE });
  }
  
  public String toString()
  {
    return dl.d(this).a("versionCode", Integer.valueOf(this.iM)).a("accountName", this.it).a("requestedScopes", this.ry).a("visibleActivities", this.rz).a("requiredFeatures", this.rA).a("packageNameForAuth", this.rB).a("callingPackageName", this.rC).a("applicationName", this.rD).a("clientId", this.rE).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    fp.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\fn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */