package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class c<T extends SafeParcelable>
  extends DataBuffer<T>
{
  private static final String[] jk = { "data" };
  private final Parcelable.Creator<T> jl;
  
  public c(d paramd, Parcelable.Creator<T> paramCreator)
  {
    super(paramd);
    this.jl = paramCreator;
  }
  
  public T p(int paramInt)
  {
    Object localObject = this.jf.e("data", paramInt, 0);
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall((byte[])localObject, 0, localObject.length);
    localParcel.setDataPosition(0);
    localObject = (SafeParcelable)this.jl.createFromParcel(localParcel);
    localParcel.recycle();
    return (T)localObject;
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\data\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */