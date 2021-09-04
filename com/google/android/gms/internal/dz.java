package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class dz
  implements SafeParcelable
{
  public static final ea CREATOR = new ea();
  private final int iM;
  private final HashMap<String, HashMap<String, dw.a<?, ?>>> lJ;
  private final ArrayList<a> lK;
  private final String lL;
  
  dz(int paramInt, ArrayList<a> paramArrayList, String paramString)
  {
    this.iM = paramInt;
    this.lK = null;
    this.lJ = b(paramArrayList);
    this.lL = ((String)dm.e(paramString));
    bC();
  }
  
  public dz(Class<? extends dw> paramClass)
  {
    this.iM = 1;
    this.lK = null;
    this.lJ = new HashMap();
    this.lL = paramClass.getCanonicalName();
  }
  
  private static HashMap<String, HashMap<String, dw.a<?, ?>>> b(ArrayList<a> paramArrayList)
  {
    HashMap localHashMap = new HashMap();
    int j = paramArrayList.size();
    int i = 0;
    while (i < j)
    {
      a locala = (a)paramArrayList.get(i);
      localHashMap.put(locala.className, locala.bG());
      i += 1;
    }
    return localHashMap;
  }
  
  public HashMap<String, dw.a<?, ?>> H(String paramString)
  {
    return (HashMap)this.lJ.get(paramString);
  }
  
  public void a(Class<? extends dw> paramClass, HashMap<String, dw.a<?, ?>> paramHashMap)
  {
    this.lJ.put(paramClass.getCanonicalName(), paramHashMap);
  }
  
  public boolean b(Class<? extends dw> paramClass)
  {
    return this.lJ.containsKey(paramClass.getCanonicalName());
  }
  
  public void bC()
  {
    Iterator localIterator1 = this.lJ.keySet().iterator();
    while (localIterator1.hasNext())
    {
      Object localObject = (String)localIterator1.next();
      localObject = (HashMap)this.lJ.get(localObject);
      Iterator localIterator2 = ((HashMap)localObject).keySet().iterator();
      while (localIterator2.hasNext()) {
        ((dw.a)((HashMap)localObject).get((String)localIterator2.next())).a(this);
      }
    }
  }
  
  public void bD()
  {
    Iterator localIterator1 = this.lJ.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str1 = (String)localIterator1.next();
      HashMap localHashMap1 = (HashMap)this.lJ.get(str1);
      HashMap localHashMap2 = new HashMap();
      Iterator localIterator2 = localHashMap1.keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str2 = (String)localIterator2.next();
        localHashMap2.put(str2, ((dw.a)localHashMap1.get(str2)).bs());
      }
      this.lJ.put(str1, localHashMap2);
    }
  }
  
  ArrayList<a> bE()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.lJ.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new a(str, (HashMap)this.lJ.get(str)));
    }
    return localArrayList;
  }
  
  public String bF()
  {
    return this.lL;
  }
  
  public int describeContents()
  {
    ea localea = CREATOR;
    return 0;
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator1 = this.lJ.keySet().iterator();
    while (localIterator1.hasNext())
    {
      Object localObject = (String)localIterator1.next();
      localStringBuilder.append((String)localObject).append(":\n");
      localObject = (HashMap)this.lJ.get(localObject);
      Iterator localIterator2 = ((HashMap)localObject).keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str = (String)localIterator2.next();
        localStringBuilder.append("  ").append(str).append(": ");
        localStringBuilder.append(((HashMap)localObject).get(str));
      }
    }
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ea localea = CREATOR;
    ea.a(this, paramParcel, paramInt);
  }
  
  public static class a
    implements SafeParcelable
  {
    public static final eb CREATOR = new eb();
    final String className;
    final ArrayList<dz.b> lM;
    final int versionCode;
    
    a(int paramInt, String paramString, ArrayList<dz.b> paramArrayList)
    {
      this.versionCode = paramInt;
      this.className = paramString;
      this.lM = paramArrayList;
    }
    
    a(String paramString, HashMap<String, dw.a<?, ?>> paramHashMap)
    {
      this.versionCode = 1;
      this.className = paramString;
      this.lM = a(paramHashMap);
    }
    
    private static ArrayList<dz.b> a(HashMap<String, dw.a<?, ?>> paramHashMap)
    {
      if (paramHashMap == null) {
        return null;
      }
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramHashMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localArrayList.add(new dz.b(str, (dw.a)paramHashMap.get(str)));
      }
      return localArrayList;
    }
    
    HashMap<String, dw.a<?, ?>> bG()
    {
      HashMap localHashMap = new HashMap();
      int j = this.lM.size();
      int i = 0;
      while (i < j)
      {
        dz.b localb = (dz.b)this.lM.get(i);
        localHashMap.put(localb.lN, localb.lO);
        i += 1;
      }
      return localHashMap;
    }
    
    public int describeContents()
    {
      eb localeb = CREATOR;
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      eb localeb = CREATOR;
      eb.a(this, paramParcel, paramInt);
    }
  }
  
  public static class b
    implements SafeParcelable
  {
    public static final dy CREATOR = new dy();
    final String lN;
    final dw.a<?, ?> lO;
    final int versionCode;
    
    b(int paramInt, String paramString, dw.a<?, ?> parama)
    {
      this.versionCode = paramInt;
      this.lN = paramString;
      this.lO = parama;
    }
    
    b(String paramString, dw.a<?, ?> parama)
    {
      this.versionCode = 1;
      this.lN = paramString;
      this.lO = parama;
    }
    
    public int describeContents()
    {
      dy localdy = CREATOR;
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      dy localdy = CREATOR;
      dy.a(this, paramParcel, paramInt);
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\dz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */