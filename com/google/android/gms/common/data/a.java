package com.google.android.gms.common.data;

import com.google.android.gms.internal.dm;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a<T>
  implements Iterator<T>
{
  private final DataBuffer<T> jg;
  private int jh;
  
  public a(DataBuffer<T> paramDataBuffer)
  {
    this.jg = ((DataBuffer)dm.e(paramDataBuffer));
    this.jh = -1;
  }
  
  public boolean hasNext()
  {
    return this.jh < this.jg.getCount() - 1;
  }
  
  public T next()
  {
    if (!hasNext()) {
      throw new NoSuchElementException("Cannot advance the iterator beyond " + this.jh);
    }
    DataBuffer localDataBuffer = this.jg;
    int i = this.jh + 1;
    this.jh = i;
    return (T)localDataBuffer.get(i);
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\data\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */