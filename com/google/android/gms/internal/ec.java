package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ec
  extends dw
  implements SafeParcelable
{
  public static final ed CREATOR = new ed();
  private final int iM;
  private final dz lH;
  private final Parcel lP;
  private final int lQ;
  private int lR;
  private int lS;
  private final String mClassName;
  
  ec(int paramInt, Parcel paramParcel, dz paramdz)
  {
    this.iM = paramInt;
    this.lP = ((Parcel)dm.e(paramParcel));
    this.lQ = 2;
    this.lH = paramdz;
    if (this.lH == null) {}
    for (this.mClassName = null;; this.mClassName = this.lH.bF())
    {
      this.lR = 2;
      return;
    }
  }
  
  private ec(SafeParcelable paramSafeParcelable, dz paramdz, String paramString)
  {
    this.iM = 1;
    this.lP = Parcel.obtain();
    paramSafeParcelable.writeToParcel(this.lP, 0);
    this.lQ = 1;
    this.lH = ((dz)dm.e(paramdz));
    this.mClassName = ((String)dm.e(paramString));
    this.lR = 2;
  }
  
  public static <T extends dw,  extends SafeParcelable> ec a(T paramT)
  {
    String str = paramT.getClass().getCanonicalName();
    dz localdz = b(paramT);
    return new ec((SafeParcelable)paramT, localdz, str);
  }
  
  private static void a(dz paramdz, dw paramdw)
  {
    Object localObject = paramdw.getClass();
    if (!paramdz.b((Class)localObject))
    {
      HashMap localHashMap = paramdw.bp();
      paramdz.a((Class)localObject, paramdw.bp());
      localObject = localHashMap.keySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramdw = (dw.a)localHashMap.get((String)((Iterator)localObject).next());
        Class localClass = paramdw.bx();
        if (localClass != null) {
          try
          {
            a(paramdz, (dw)localClass.newInstance());
          }
          catch (InstantiationException paramdz)
          {
            throw new IllegalStateException("Could not instantiate an object of type " + paramdw.bx().getCanonicalName(), paramdz);
          }
          catch (IllegalAccessException paramdz)
          {
            throw new IllegalStateException("Could not access object of type " + paramdw.bx().getCanonicalName(), paramdz);
          }
        }
      }
    }
  }
  
  private void a(StringBuilder paramStringBuilder, int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Unknown type = " + paramInt);
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      paramStringBuilder.append(paramObject);
      return;
    case 7: 
      paramStringBuilder.append("\"").append(ei.I(paramObject.toString())).append("\"");
      return;
    case 8: 
      paramStringBuilder.append("\"").append(ef.b((byte[])paramObject)).append("\"");
      return;
    case 9: 
      paramStringBuilder.append("\"").append(ef.c((byte[])paramObject));
      paramStringBuilder.append("\"");
      return;
    case 10: 
      ej.a(paramStringBuilder, (HashMap)paramObject);
      return;
    }
    throw new IllegalArgumentException("Method does not accept concrete type.");
  }
  
  private void a(StringBuilder paramStringBuilder, dw.a<?, ?> parama, Parcel paramParcel, int paramInt)
  {
    switch (parama.bo())
    {
    default: 
      throw new IllegalArgumentException("Unknown field out type = " + parama.bo());
    case 0: 
      b(paramStringBuilder, parama, a(parama, Integer.valueOf(a.f(paramParcel, paramInt))));
      return;
    case 1: 
      b(paramStringBuilder, parama, a(parama, a.h(paramParcel, paramInt)));
      return;
    case 2: 
      b(paramStringBuilder, parama, a(parama, Long.valueOf(a.g(paramParcel, paramInt))));
      return;
    case 3: 
      b(paramStringBuilder, parama, a(parama, Float.valueOf(a.i(paramParcel, paramInt))));
      return;
    case 4: 
      b(paramStringBuilder, parama, a(parama, Double.valueOf(a.j(paramParcel, paramInt))));
      return;
    case 5: 
      b(paramStringBuilder, parama, a(parama, a.k(paramParcel, paramInt)));
      return;
    case 6: 
      b(paramStringBuilder, parama, a(parama, Boolean.valueOf(a.c(paramParcel, paramInt))));
      return;
    case 7: 
      b(paramStringBuilder, parama, a(parama, a.l(paramParcel, paramInt)));
      return;
    case 8: 
    case 9: 
      b(paramStringBuilder, parama, a(parama, a.o(paramParcel, paramInt)));
      return;
    case 10: 
      b(paramStringBuilder, parama, a(parama, b(a.n(paramParcel, paramInt))));
      return;
    }
    throw new IllegalArgumentException("Method does not accept concrete type.");
  }
  
  private void a(StringBuilder paramStringBuilder, String paramString, dw.a<?, ?> parama, Parcel paramParcel, int paramInt)
  {
    paramStringBuilder.append("\"").append(paramString).append("\":");
    if (parama.bz())
    {
      a(paramStringBuilder, parama, paramParcel, paramInt);
      return;
    }
    b(paramStringBuilder, parama, paramParcel, paramInt);
  }
  
  private void a(StringBuilder paramStringBuilder, HashMap<String, dw.a<?, ?>> paramHashMap, Parcel paramParcel)
  {
    paramHashMap = b(paramHashMap);
    paramStringBuilder.append('{');
    int j = a.j(paramParcel);
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.i(paramParcel);
      Map.Entry localEntry = (Map.Entry)paramHashMap.get(Integer.valueOf(a.y(k)));
      if (localEntry != null)
      {
        if (i != 0) {
          paramStringBuilder.append(",");
        }
        a(paramStringBuilder, (String)localEntry.getKey(), (dw.a)localEntry.getValue(), paramParcel, k);
        i = 1;
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    paramStringBuilder.append('}');
  }
  
  private static dz b(dw paramdw)
  {
    dz localdz = new dz(paramdw.getClass());
    a(localdz, paramdw);
    localdz.bD();
    localdz.bC();
    return localdz;
  }
  
  public static HashMap<String, String> b(Bundle paramBundle)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, paramBundle.getString(str));
    }
    return localHashMap;
  }
  
  private static HashMap<Integer, Map.Entry<String, dw.a<?, ?>>> b(HashMap<String, dw.a<?, ?>> paramHashMap)
  {
    HashMap localHashMap = new HashMap();
    paramHashMap = paramHashMap.entrySet().iterator();
    while (paramHashMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramHashMap.next();
      localHashMap.put(Integer.valueOf(((dw.a)localEntry.getValue()).bw()), localEntry);
    }
    return localHashMap;
  }
  
  private void b(StringBuilder paramStringBuilder, dw.a<?, ?> parama, Parcel paramParcel, int paramInt)
  {
    if (parama.bu())
    {
      paramStringBuilder.append("[");
      switch (parama.bo())
      {
      default: 
        throw new IllegalStateException("Unknown field type out.");
      case 0: 
        ee.a(paramStringBuilder, a.q(paramParcel, paramInt));
      }
      for (;;)
      {
        paramStringBuilder.append("]");
        return;
        ee.a(paramStringBuilder, a.s(paramParcel, paramInt));
        continue;
        ee.a(paramStringBuilder, a.r(paramParcel, paramInt));
        continue;
        ee.a(paramStringBuilder, a.t(paramParcel, paramInt));
        continue;
        ee.a(paramStringBuilder, a.u(paramParcel, paramInt));
        continue;
        ee.a(paramStringBuilder, a.v(paramParcel, paramInt));
        continue;
        ee.a(paramStringBuilder, a.p(paramParcel, paramInt));
        continue;
        ee.a(paramStringBuilder, a.w(paramParcel, paramInt));
        continue;
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
        paramParcel = a.z(paramParcel, paramInt);
        int i = paramParcel.length;
        paramInt = 0;
        while (paramInt < i)
        {
          if (paramInt > 0) {
            paramStringBuilder.append(",");
          }
          paramParcel[paramInt].setDataPosition(0);
          a(paramStringBuilder, parama.bB(), paramParcel[paramInt]);
          paramInt += 1;
        }
      }
    }
    switch (parama.bo())
    {
    default: 
      throw new IllegalStateException("Unknown field type out");
    case 0: 
      paramStringBuilder.append(a.f(paramParcel, paramInt));
      return;
    case 1: 
      paramStringBuilder.append(a.h(paramParcel, paramInt));
      return;
    case 2: 
      paramStringBuilder.append(a.g(paramParcel, paramInt));
      return;
    case 3: 
      paramStringBuilder.append(a.i(paramParcel, paramInt));
      return;
    case 4: 
      paramStringBuilder.append(a.j(paramParcel, paramInt));
      return;
    case 5: 
      paramStringBuilder.append(a.k(paramParcel, paramInt));
      return;
    case 6: 
      paramStringBuilder.append(a.c(paramParcel, paramInt));
      return;
    case 7: 
      parama = a.l(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(ei.I(parama)).append("\"");
      return;
    case 8: 
      parama = a.o(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(ef.b(parama)).append("\"");
      return;
    case 9: 
      parama = a.o(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(ef.c(parama));
      paramStringBuilder.append("\"");
      return;
    case 10: 
      parama = a.n(paramParcel, paramInt);
      paramParcel = parama.keySet();
      paramParcel.size();
      paramStringBuilder.append("{");
      paramParcel = paramParcel.iterator();
      for (paramInt = 1; paramParcel.hasNext(); paramInt = 0)
      {
        String str = (String)paramParcel.next();
        if (paramInt == 0) {
          paramStringBuilder.append(",");
        }
        paramStringBuilder.append("\"").append(str).append("\"");
        paramStringBuilder.append(":");
        paramStringBuilder.append("\"").append(ei.I(parama.getString(str))).append("\"");
      }
      paramStringBuilder.append("}");
      return;
    }
    paramParcel = a.y(paramParcel, paramInt);
    paramParcel.setDataPosition(0);
    a(paramStringBuilder, parama.bB(), paramParcel);
  }
  
  private void b(StringBuilder paramStringBuilder, dw.a<?, ?> parama, Object paramObject)
  {
    if (parama.bt())
    {
      b(paramStringBuilder, parama, (ArrayList)paramObject);
      return;
    }
    a(paramStringBuilder, parama.bn(), paramObject);
  }
  
  private void b(StringBuilder paramStringBuilder, dw.a<?, ?> parama, ArrayList<?> paramArrayList)
  {
    paramStringBuilder.append("[");
    int j = paramArrayList.size();
    int i = 0;
    while (i < j)
    {
      if (i != 0) {
        paramStringBuilder.append(",");
      }
      a(paramStringBuilder, parama.bn(), paramArrayList.get(i));
      i += 1;
    }
    paramStringBuilder.append("]");
  }
  
  protected Object D(String paramString)
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }
  
  protected boolean E(String paramString)
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }
  
  public Parcel bH()
  {
    switch (this.lR)
    {
    }
    for (;;)
    {
      return this.lP;
      this.lS = b.k(this.lP);
      b.C(this.lP, this.lS);
      this.lR = 2;
      continue;
      b.C(this.lP, this.lS);
      this.lR = 2;
    }
  }
  
  dz bI()
  {
    switch (this.lQ)
    {
    default: 
      throw new IllegalStateException("Invalid creation type: " + this.lQ);
    case 0: 
      return null;
    case 1: 
      return this.lH;
    }
    return this.lH;
  }
  
  public HashMap<String, dw.a<?, ?>> bp()
  {
    if (this.lH == null) {
      return null;
    }
    return this.lH.H(this.mClassName);
  }
  
  public int describeContents()
  {
    ed localed = CREATOR;
    return 0;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public String toString()
  {
    dm.a(this.lH, "Cannot convert to JSON on client side.");
    Parcel localParcel = bH();
    localParcel.setDataPosition(0);
    StringBuilder localStringBuilder = new StringBuilder(100);
    a(localStringBuilder, this.lH.H(this.mClassName), localParcel);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ed localed = CREATOR;
    ed.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */