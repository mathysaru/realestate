package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.dynamic.c;

public final class as
  implements at.a
{
  private final aw dZ;
  private final Object eJ = new Object();
  private final v em;
  private final String fd;
  private final long fe;
  private final ao ff;
  private final x fg;
  private ax fh;
  private int fi = -2;
  private final Context mContext;
  
  public as(Context paramContext, String paramString, aw paramaw, ap paramap, ao paramao, v paramv, x paramx)
  {
    this.mContext = paramContext;
    this.fd = paramString;
    this.dZ = paramaw;
    if (paramap.eV != -1L) {}
    for (long l = paramap.eV;; l = 10000L)
    {
      this.fe = l;
      this.ff = paramao;
      this.em = paramv;
      this.fg = paramx;
      return;
    }
  }
  
  private ax P()
  {
    cn.o("Instantiating mediation adapter: " + this.fd);
    try
    {
      ax localax = this.dZ.g(this.fd);
      return localax;
    }
    catch (RemoteException localRemoteException)
    {
      cn.a("Could not instantiate mediation adapter: " + this.fd, localRemoteException);
    }
    return null;
  }
  
  private void a(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    for (;;)
    {
      if (this.fi != -2) {
        return;
      }
      b(paramLong1, paramLong2, paramLong3, paramLong4);
    }
  }
  
  private void a(ar paramar)
  {
    try
    {
      if (this.fg.ex)
      {
        this.fh.a(c.g(this.mContext), this.em, this.ff.eS, paramar);
        return;
      }
      this.fh.a(c.g(this.mContext), this.fg, this.em, this.ff.eS, paramar);
      return;
    }
    catch (RemoteException paramar)
    {
      cn.b("Could not request ad from mediation adapter.", paramar);
      d(5);
    }
  }
  
  private void b(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    long l = SystemClock.elapsedRealtime();
    paramLong1 = paramLong2 - (l - paramLong1);
    paramLong2 = paramLong4 - (l - paramLong3);
    if ((paramLong1 <= 0L) || (paramLong2 <= 0L))
    {
      cn.o("Timed out waiting for adapter.");
      this.fi = 3;
      return;
    }
    try
    {
      this.eJ.wait(Math.min(paramLong1, paramLong2));
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      this.fi = -1;
    }
  }
  
  public at b(long paramLong1, long paramLong2)
  {
    synchronized (this.eJ)
    {
      long l = SystemClock.elapsedRealtime();
      final Object localObject2 = new ar();
      cm.hO.post(new Runnable()
      {
        public void run()
        {
          synchronized (as.a(as.this))
          {
            if (as.b(as.this) != -2) {
              return;
            }
            as.a(as.this, as.c(as.this));
            if (as.d(as.this) == null)
            {
              as.this.d(4);
              return;
            }
          }
          localObject2.a(as.this);
          as.a(as.this, localObject2);
        }
      });
      a(l, this.fe, paramLong1, paramLong2);
      localObject2 = new at(this.ff, this.fh, this.fd, (ar)localObject2, this.fi);
      return (at)localObject2;
    }
  }
  
  public void cancel()
  {
    synchronized (this.eJ)
    {
      try
      {
        if (this.fh != null) {
          this.fh.destroy();
        }
        this.fi = -1;
        this.eJ.notify();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          cn.b("Could not destroy mediation adapter.", localRemoteException);
        }
      }
    }
  }
  
  public void d(int paramInt)
  {
    synchronized (this.eJ)
    {
      this.fi = paramInt;
      this.eJ.notify();
      return;
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */