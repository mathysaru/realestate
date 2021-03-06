package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class dl
{
  public static a d(Object paramObject)
  {
    return new a(paramObject, null);
  }
  
  public static boolean equal(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public static int hashCode(Object... paramVarArgs)
  {
    return Arrays.hashCode(paramVarArgs);
  }
  
  public static final class a
  {
    private final List<String> lj;
    private final Object lk;
    
    private a(Object paramObject)
    {
      this.lk = dm.e(paramObject);
      this.lj = new ArrayList();
    }
    
    public a a(String paramString, Object paramObject)
    {
      this.lj.add((String)dm.e(paramString) + "=" + String.valueOf(paramObject));
      return this;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(100).append(this.lk.getClass().getSimpleName()).append('{');
      int j = this.lj.size();
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append((String)this.lj.get(i));
        if (i < j - 1) {
          localStringBuilder.append(", ");
        }
        i += 1;
      }
      return '}';
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */