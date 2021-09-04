package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

public final class s
{
  private final Runnable el;
  private v em;
  private boolean en = false;
  
  public s(final r paramr)
  {
    this.el = new Runnable()
    {
      private final WeakReference<r> eo = new WeakReference(paramr);
      
      public void run()
      {
        s.a(s.this, false);
        r localr = (r)this.eo.get();
        if (localr != null) {
          localr.b(s.a(s.this));
        }
      }
    };
  }
  
  public void a(v paramv, long paramLong)
  {
    if (this.en)
    {
      cn.q("An ad refresh is already scheduled.");
      return;
    }
    cn.o("Scheduling ad refresh " + paramLong + " milliseconds from now.");
    this.em = paramv;
    this.en = true;
    cm.hO.postDelayed(this.el, paramLong);
  }
  
  public void cancel()
  {
    cm.hO.removeCallbacks(this.el);
  }
  
  public void d(v paramv)
  {
    a(paramv, 60000L);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */