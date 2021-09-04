package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;

public final class an
{
  private final aw dZ;
  private final bu eI;
  private final Object eJ = new Object();
  private final ap eK;
  private boolean eL = false;
  private as eM;
  private final Context mContext;
  
  public an(Context paramContext, bu parambu, aw paramaw, ap paramap)
  {
    this.mContext = paramContext;
    this.eI = parambu;
    this.dZ = paramaw;
    this.eK = paramap;
  }
  
  public at a(long paramLong1, long paramLong2)
  {
    cn.m("Starting mediation.");
    Object localObject2 = this.eK.eU.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      ao localao = (ao)((Iterator)localObject2).next();
      cn.o("Trying mediation network: " + localao.eP);
      Iterator localIterator = localao.eQ.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        synchronized (this.eJ)
        {
          if (this.eL)
          {
            localObject2 = new at(-1);
            return (at)localObject2;
          }
          this.eM = new as(this.mContext, str, this.dZ, this.eK, localao, this.eI.gB, this.eI.ed);
          ??? = this.eM.b(paramLong1, paramLong2);
          if (((at)???).fl == 0)
          {
            cn.m("Adapter succeeded.");
            return (at)???;
          }
        }
        if (((at)???).fn != null) {
          cm.hO.post(new Runnable()
          {
            public void run()
            {
              try
              {
                localObject1.fn.destroy();
                return;
              }
              catch (RemoteException localRemoteException)
              {
                cn.b("Could not destroy mediation adapter.", localRemoteException);
              }
            }
          });
        }
      }
    }
    return new at(1);
  }
  
  public void cancel()
  {
    synchronized (this.eJ)
    {
      this.eL = true;
      if (this.eM != null) {
        this.eM.cancel();
      }
      return;
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */