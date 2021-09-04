package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class bz
  extends by.a
{
  private static final Object gL = new Object();
  private static bz gM;
  private final al gN;
  private final Context mContext;
  
  private bz(Context paramContext, al paramal)
  {
    this.mContext = paramContext;
    this.gN = paramal;
  }
  
  private static bw a(Context paramContext, final al paramal, final bu parambu)
  {
    cn.m("Starting ad request from service.");
    paramal.init();
    cd localcd = new cd(paramContext);
    if (localcd.hs == -1)
    {
      cn.m("Device is offline.");
      return new bw(2);
    }
    final cb localcb = new cb();
    paramal = ca.a(parambu, localcd, paramal.a(250L));
    if (paramal == null) {
      return new bw(0);
    }
    cm.hO.post(new Runnable()
    {
      public void run()
      {
        cq localcq = cq.a(this.gO, new x(), false, false, null, parambu.eg);
        localcq.setWillNotDraw(true);
        localcb.b(localcq);
        cr localcr = localcq.aw();
        localcr.a("/invalidRequest", localcb.gU);
        localcr.a("/loadAdURL", localcb.gV);
        localcr.a("/log", ah.eE);
        cn.m("Getting the ad request URL.");
        localcq.loadDataWithBaseURL("http://googleads.g.doubleclick.net", "<!DOCTYPE html><html><head><script src=\"http://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.js\"></script><script>AFMA_buildAdURL(" + paramal + ");</script></head><body></body></html>", "text/html", "UTF-8", null);
      }
    });
    paramal = localcb.aj();
    if (TextUtils.isEmpty(paramal)) {
      return new bw(localcb.getErrorCode());
    }
    return a(paramContext, parambu.eg.hP, paramal);
  }
  
  private static bw a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      localcc = new cc();
      paramString2 = new URL(paramString2);
      i = 0;
    }
    catch (IOException paramContext)
    {
      try
      {
        for (;;)
        {
          cc localcc;
          int i;
          ci.a(paramContext, paramString1, false, localHttpURLConnection);
          int j = localHttpURLConnection.getResponseCode();
          Map localMap = localHttpURLConnection.getHeaderFields();
          if ((j >= 200) && (j < 300))
          {
            paramContext = paramString2.toString();
            paramString1 = ci.a(new InputStreamReader(localHttpURLConnection.getInputStream()));
            a(paramContext, localMap, paramString1, j);
            localcc.a(paramContext, localMap, paramString1);
            paramContext = localcc.ak();
            return paramContext;
          }
          a(paramString2.toString(), localMap, null, j);
          if ((j >= 300) && (j < 400))
          {
            paramString2 = localHttpURLConnection.getHeaderField("Location");
            if (TextUtils.isEmpty(paramString2))
            {
              cn.q("No location header to follow redirect.");
              paramContext = new bw(0);
              return paramContext;
            }
            paramString2 = new URL(paramString2);
            i += 1;
            if (i > 5)
            {
              cn.q("Too many redirects.");
              paramContext = new bw(0);
              return paramContext;
            }
          }
          else
          {
            cn.q("Received error HTTP response code: " + j);
            paramContext = new bw(0);
            return paramContext;
          }
          localcc.d(localMap);
          localHttpURLConnection.disconnect();
        }
      }
      finally
      {
        HttpURLConnection localHttpURLConnection;
        localHttpURLConnection.disconnect();
      }
      paramContext = paramContext;
      cn.q("Error while connecting to ad server: " + paramContext.getMessage());
      return new bw(2);
    }
    localHttpURLConnection = (HttpURLConnection)paramString2.openConnection();
  }
  
  public static bz a(Context paramContext, al paramal)
  {
    synchronized (gL)
    {
      if (gM == null) {
        gM = new bz(paramContext.getApplicationContext(), paramal);
      }
      paramContext = gM;
      return paramContext;
    }
  }
  
  private static void a(String paramString1, Map<String, List<String>> paramMap, String paramString2, int paramInt)
  {
    if (cn.k(2))
    {
      cn.p("Http Response: {\n  URL:\n    " + paramString1 + "\n  Headers:");
      if (paramMap != null)
      {
        paramString1 = paramMap.keySet().iterator();
        while (paramString1.hasNext())
        {
          Object localObject = (String)paramString1.next();
          cn.p("    " + (String)localObject + ":");
          localObject = ((List)paramMap.get(localObject)).iterator();
          while (((Iterator)localObject).hasNext())
          {
            String str = (String)((Iterator)localObject).next();
            cn.p("      " + str);
          }
        }
      }
      cn.p("  Body:");
      if (paramString2 != null)
      {
        int i = 0;
        while (i < Math.min(paramString2.length(), 100000))
        {
          cn.p(paramString2.substring(i, Math.min(paramString2.length(), i + 1000)));
          i += 1000;
        }
      }
      cn.p("    null");
      cn.p("  Response Code:\n    " + paramInt + "\n}");
    }
  }
  
  public bw a(bu parambu)
  {
    return a(this.mContext, this.gN, parambu);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */