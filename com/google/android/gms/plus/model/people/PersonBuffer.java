package com.google.android.gms.plus.model.people;

import android.os.Bundle;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.c;
import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.fv;
import com.google.android.gms.internal.gg;

public final class PersonBuffer
  extends DataBuffer<Person>
{
  private final c<fv> tt;
  
  public PersonBuffer(d paramd)
  {
    super(paramd);
    if ((paramd.aM() != null) && (paramd.aM().getBoolean("com.google.android.gms.plus.IsSafeParcelable", false)))
    {
      this.tt = new c(paramd, fv.CREATOR);
      return;
    }
    this.tt = null;
  }
  
  public Person get(int paramInt)
  {
    if (this.tt != null) {
      return (Person)this.tt.p(paramInt);
    }
    return new gg(this.jf, paramInt);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\plus\model\people\PersonBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */