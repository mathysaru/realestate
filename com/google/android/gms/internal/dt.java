package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class dt
  implements SafeParcelable, dw.b<String, Integer>
{
  public static final du CREATOR = new du();
  private final int iM;
  private final HashMap<String, Integer> lu;
  private final HashMap<Integer, String> lv;
  private final ArrayList<a> lw;
  
  public dt()
  {
    this.iM = 1;
    this.lu = new HashMap();
    this.lv = new HashMap();
    this.lw = null;
  }
  
  dt(int paramInt, ArrayList<a> paramArrayList)
  {
    this.iM = paramInt;
    this.lu = new HashMap();
    this.lv = new HashMap();
    this.lw = null;
    a(paramArrayList);
  }
  
  private void a(ArrayList<a> paramArrayList)
  {
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      a locala = (a)paramArrayList.next();
      c(locala.lx, locala.ly);
    }
  }
  
  public String a(Integer paramInteger)
  {
    String str = (String)this.lv.get(paramInteger);
    paramInteger = str;
    if (str == null)
    {
      paramInteger = str;
      if (this.lu.containsKey("gms_unknown")) {
        paramInteger = "gms_unknown";
      }
    }
    return paramInteger;
  }
  
  ArrayList<a> bm()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.lu.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new a(str, ((Integer)this.lu.get(str)).intValue()));
    }
    return localArrayList;
  }
  
  public int bn()
  {
    return 7;
  }
  
  public int bo()
  {
    return 0;
  }
  
  public dt c(String paramString, int paramInt)
  {
    this.lu.put(paramString, Integer.valueOf(paramInt));
    this.lv.put(Integer.valueOf(paramInt), paramString);
    return this;
  }
  
  public int describeContents()
  {
    du localdu = CREATOR;
    return 0;
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    du localdu = CREATOR;
    du.a(this, paramParcel, paramInt);
  }
  
  public static final class a
    implements SafeParcelable
  {
    public static final dv CREATOR = new dv();
    final String lx;
    final int ly;
    final int versionCode;
    
    a(int paramInt1, String paramString, int paramInt2)
    {
      this.versionCode = paramInt1;
      this.lx = paramString;
      this.ly = paramInt2;
    }
    
    a(String paramString, int paramInt)
    {
      this.versionCode = 1;
      this.lx = paramString;
      this.ly = paramInt;
    }
    
    public int describeContents()
    {
      dv localdv = CREATOR;
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      dv localdv = CREATOR;
      dv.a(this, paramParcel, paramInt);
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\dt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */