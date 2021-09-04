package com.google.android.gms.common.data;

import java.util.Iterator;

public abstract class DataBuffer<T>
  implements Iterable<T>
{
  protected final d jf;
  
  protected DataBuffer(d paramd)
  {
    this.jf = paramd;
    if (this.jf != null) {
      this.jf.b(this);
    }
  }
  
  public void close()
  {
    this.jf.close();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public abstract T get(int paramInt);
  
  public int getCount()
  {
    return this.jf.getCount();
  }
  
  public boolean isClosed()
  {
    return this.jf.isClosed();
  }
  
  public Iterator<T> iterator()
  {
    return new a(this);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\data\DataBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */