package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

public final class bq
  extends cg
  implements br.a, cr.a
{
  private final aw dZ;
  private final Object eJ = new Object();
  private ap eK;
  private final cq fG;
  private final bp.a gm;
  private final bu.a gn;
  private final h go;
  private cg gp;
  private bw gq;
  private boolean gr = false;
  private an gs;
  private at gt;
  private final Context mContext;
  
  public bq(Context paramContext, bu.a parama, h paramh, cq paramcq, aw paramaw, bp.a parama1)
  {
    this.dZ = paramaw;
    this.gm = parama1;
    this.fG = paramcq;
    this.mContext = paramContext;
    this.gn = parama;
    this.go = paramh;
  }
  
  private void a(bu parambu, long paramLong)
    throws bq.a
  {
    this.gs = new an(this.mContext, parambu, this.dZ, this.eK);
    this.gt = this.gs.a(paramLong, 60000L);
    switch (this.gt.fl)
    {
    default: 
      throw new a("Unexpected mediation result: " + this.gt.fl, 0);
    case 1: 
      throw new a("No fill from any mediation ad networks.", 3);
    }
  }
  
  private void ad()
    throws bq.a
  {
    if (this.gq.errorCode == -3) {}
    do
    {
      return;
      if (TextUtils.isEmpty(this.gq.gG)) {
        throw new a("No fill from ad server.", 3);
      }
    } while (!this.gq.gI);
    try
    {
      this.eK = new ap(this.gq.gG);
      return;
    }
    catch (JSONException localJSONException)
    {
      throw new a("Could not parse mediation config: " + this.gq.gG, 0);
    }
  }
  
  private void b(long paramLong)
    throws bq.a
  {
    cm.hO.post(new Runnable()
    {
      public void run()
      {
        for (;;)
        {
          synchronized (bq.a(bq.this))
          {
            if (bq.c(bq.this).errorCode != -2) {
              return;
            }
            bq.d(bq.this).aw().a(bq.this);
            if (bq.c(bq.this).errorCode == -3)
            {
              cn.p("Loading URL in WebView: " + bq.c(bq.this).fW);
              bq.d(bq.this).loadUrl(bq.c(bq.this).fW);
              return;
            }
          }
          cn.p("Loading HTML in WebView.");
          bq.d(bq.this).loadDataWithBaseURL(ci.j(bq.c(bq.this).fW), bq.c(bq.this).gG, "text/html", "UTF-8", null);
        }
      }
    });
    d(paramLong);
  }
  
  private void c(long paramLong)
    throws bq.a
  {
    do
    {
      if (!e(paramLong)) {
        throw new a("Timed out waiting for ad response.", 2);
      }
    } while (this.gq == null);
    this.gp = null;
    if ((this.gq.errorCode != -2) && (this.gq.errorCode != -3)) {
      throw new a("There was a problem getting an ad response. ErrorCode: " + this.gq.errorCode, this.gq.errorCode);
    }
  }
  
  private void d(long paramLong)
    throws bq.a
  {
    do
    {
      if (!e(paramLong)) {
        throw new a("Timed out waiting for WebView to finish loading.", 2);
      }
    } while (!this.gr);
  }
  
  private boolean e(long paramLong)
    throws bq.a
  {
    paramLong = 60000L - (SystemClock.elapsedRealtime() - paramLong);
    if (paramLong <= 0L) {
      return false;
    }
    try
    {
      this.eJ.wait(paramLong);
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new a("Ad request cancelled.", -1);
    }
  }
  
  public void a(bw parambw)
  {
    synchronized (this.eJ)
    {
      cn.m("Received ad response.");
      this.gq = parambw;
      this.eJ.notify();
      return;
    }
  }
  
  public void a(cq arg1)
  {
    synchronized (this.eJ)
    {
      cn.m("WebView finished loading.");
      this.gr = true;
      this.eJ.notify();
      return;
    }
  }
  
  public void ac()
  {
    for (;;)
    {
      long l;
      synchronized (this.eJ)
      {
        cn.m("AdLoaderBackgroundTask started.");
        final Object localObject1 = this.go.g().a(this.mContext);
        localObject1 = new bu(this.gn, (String)localObject1);
        int i = -2;
        try
        {
          l = SystemClock.elapsedRealtime();
          this.gp = br.a(this.mContext, (bu)localObject1, this);
          if (this.gp != null) {
            continue;
          }
          throw new a("Could not start the ad request service.", 0);
        }
        catch (a locala)
        {
          i = locala.getErrorCode();
          if (i == 3) {
            continue;
          }
        }
        if (i != -1) {
          break label397;
        }
        cn.o(locala.getMessage());
        this.gq = new bw(i);
        cm.hO.post(new Runnable()
        {
          public void run()
          {
            bq.this.onStop();
          }
        });
        v localv = ((bu)localObject1).gB;
        cq localcq = this.fG;
        List localList1 = this.gq.eW;
        List localList2 = this.gq.eX;
        List localList3 = this.gq.gK;
        int j = this.gq.orientation;
        l = this.gq.fa;
        String str2 = ((bu)localObject1).gE;
        boolean bool = this.gq.gI;
        if (this.gt == null) {
          break label408;
        }
        localObject1 = this.gt.fm;
        if (this.gt == null) {
          break label414;
        }
        localax = this.gt.fn;
        if (this.gt == null) {
          break label420;
        }
        str1 = this.gt.fo;
        ap localap = this.eK;
        if (this.gt == null) {
          break label426;
        }
        localar = this.gt.fp;
        localObject1 = new ce(localv, localcq, localList1, i, localList2, localList3, j, l, str2, bool, (ao)localObject1, localax, str1, localap, localar, this.gq.gJ, this.gq.gH);
        cm.hO.post(new Runnable()
        {
          public void run()
          {
            synchronized (bq.a(bq.this))
            {
              bq.b(bq.this).a(localObject1);
              return;
            }
          }
        });
        return;
        c(l);
        ad();
        if (this.gq.gI) {
          a((bu)localObject1, l);
        }
      }
      b(l);
      continue;
      label397:
      cn.q(localax.getMessage());
      continue;
      label408:
      Object localObject3 = null;
      continue;
      label414:
      ax localax = null;
      continue;
      label420:
      String str1 = null;
      continue;
      label426:
      ar localar = null;
    }
  }
  
  public void onStop()
  {
    synchronized (this.eJ)
    {
      if (this.gp != null) {
        this.gp.cancel();
      }
      this.fG.stopLoading();
      ci.a(this.fG);
      if (this.gs != null) {
        this.gs.cancel();
      }
      return;
    }
  }
  
  private static final class a
    extends Exception
  {
    private final int gw;
    
    public a(String paramString, int paramInt)
    {
      super();
      this.gw = paramInt;
    }
    
    public int getErrorCode()
    {
      return this.gw;
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */