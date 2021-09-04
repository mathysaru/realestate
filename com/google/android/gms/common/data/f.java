package com.google.android.gms.common.data;

import java.util.ArrayList;

public abstract class f<T>
  extends DataBuffer<T>
{
  private boolean jA = false;
  private ArrayList<Integer> jB;
  
  protected f(d paramd)
  {
    super(paramd);
  }
  
  private void aN()
  {
    for (;;)
    {
      int i;
      try
      {
        if (!this.jA)
        {
          int j = this.jf.getCount();
          this.jB = new ArrayList();
          if (j > 0)
          {
            this.jB.add(Integer.valueOf(0));
            String str2 = getPrimaryDataMarkerColumn();
            i = this.jf.q(0);
            Object localObject1 = this.jf.c(str2, 0, i);
            i = 1;
            if (i < j)
            {
              int k = this.jf.q(i);
              String str1 = this.jf.c(str2, i, k);
              if (str1.equals(localObject1)) {
                break label145;
              }
              this.jB.add(Integer.valueOf(i));
              localObject1 = str1;
              break label145;
            }
          }
          this.jA = true;
        }
        else
        {
          return;
        }
      }
      finally {}
      label145:
      i += 1;
    }
  }
  
  private int u(int paramInt)
  {
    if ((paramInt < 0) || (paramInt == this.jB.size())) {
      return 0;
    }
    if (paramInt == this.jB.size() - 1) {
      return this.jf.getCount() - ((Integer)this.jB.get(paramInt)).intValue();
    }
    return ((Integer)this.jB.get(paramInt + 1)).intValue() - ((Integer)this.jB.get(paramInt)).intValue();
  }
  
  protected abstract T a(int paramInt1, int paramInt2);
  
  public final T get(int paramInt)
  {
    aN();
    return (T)a(t(paramInt), u(paramInt));
  }
  
  public int getCount()
  {
    aN();
    return this.jB.size();
  }
  
  protected abstract String getPrimaryDataMarkerColumn();
  
  int t(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.jB.size())) {
      throw new IllegalArgumentException("Position " + paramInt + " is out of bounds for this buffer");
    }
    return ((Integer)this.jB.get(paramInt)).intValue();
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\data\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */