package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;

public abstract class b
{
  protected final d jf;
  protected final int ji;
  private final int jj;
  
  public b(d paramd, int paramInt)
  {
    this.jf = ((d)dm.e(paramd));
    if ((paramInt >= 0) && (paramInt < paramd.getCount())) {}
    for (boolean bool = true;; bool = false)
    {
      dm.k(bool);
      this.ji = paramInt;
      this.jj = paramd.q(this.ji);
      return;
    }
  }
  
  protected void a(String paramString, CharArrayBuffer paramCharArrayBuffer)
  {
    this.jf.a(paramString, this.ji, this.jj, paramCharArrayBuffer);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof b))
    {
      paramObject = (b)paramObject;
      bool1 = bool2;
      if (dl.equal(Integer.valueOf(((b)paramObject).ji), Integer.valueOf(this.ji)))
      {
        bool1 = bool2;
        if (dl.equal(Integer.valueOf(((b)paramObject).jj), Integer.valueOf(this.jj)))
        {
          bool1 = bool2;
          if (((b)paramObject).jf == this.jf) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  protected boolean getBoolean(String paramString)
  {
    return this.jf.d(paramString, this.ji, this.jj);
  }
  
  protected byte[] getByteArray(String paramString)
  {
    return this.jf.e(paramString, this.ji, this.jj);
  }
  
  protected int getInteger(String paramString)
  {
    return this.jf.b(paramString, this.ji, this.jj);
  }
  
  protected long getLong(String paramString)
  {
    return this.jf.a(paramString, this.ji, this.jj);
  }
  
  protected String getString(String paramString)
  {
    return this.jf.c(paramString, this.ji, this.jj);
  }
  
  public int hashCode()
  {
    return dl.hashCode(new Object[] { Integer.valueOf(this.ji), Integer.valueOf(this.jj), this.jf });
  }
  
  public boolean isDataValid()
  {
    return !this.jf.isClosed();
  }
  
  protected Uri u(String paramString)
  {
    return this.jf.f(paramString, this.ji, this.jj);
  }
  
  protected boolean v(String paramString)
  {
    return this.jf.g(paramString, this.ji, this.jj);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\data\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */