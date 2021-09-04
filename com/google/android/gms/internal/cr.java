package com.google.android.gms.internal;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.net.UrlQuerySanitizer.ParameterValuePair;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class cr
  extends WebViewClient
{
  private final Object eJ = new Object();
  private ag ey;
  protected final cq fG;
  private final HashMap<String, ai> hZ = new HashMap();
  private q ia;
  private bi ib;
  private a ic;
  private boolean id = false;
  private boolean ie;
  private bl jdField_if;
  
  public cr(cq paramcq, boolean paramBoolean)
  {
    this.fG = paramcq;
    this.ie = paramBoolean;
  }
  
  private void a(bh parambh)
  {
    bf.a(this.fG.getContext(), parambh);
  }
  
  private static boolean b(Uri paramUri)
  {
    paramUri = paramUri.getScheme();
    return ("http".equalsIgnoreCase(paramUri)) || ("https".equalsIgnoreCase(paramUri));
  }
  
  private void c(Uri paramUri)
  {
    String str = paramUri.getPath();
    ai localai = (ai)this.hZ.get(str);
    if (localai != null)
    {
      HashMap localHashMap = new HashMap();
      Object localObject = new UrlQuerySanitizer();
      ((UrlQuerySanitizer)localObject).setAllowUnregisteredParamaters(true);
      ((UrlQuerySanitizer)localObject).setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
      ((UrlQuerySanitizer)localObject).parseUrl(paramUri.toString());
      paramUri = ((UrlQuerySanitizer)localObject).getParameterList().iterator();
      while (paramUri.hasNext())
      {
        localObject = (UrlQuerySanitizer.ParameterValuePair)paramUri.next();
        localHashMap.put(((UrlQuerySanitizer.ParameterValuePair)localObject).mParameter, ((UrlQuerySanitizer.ParameterValuePair)localObject).mValue);
      }
      if (cn.k(2))
      {
        cn.p("Received GMSG: " + str);
        paramUri = localHashMap.keySet().iterator();
        while (paramUri.hasNext())
        {
          str = (String)paramUri.next();
          cn.p("  " + str + ": " + (String)localHashMap.get(str));
        }
      }
      localai.a(this.fG, localHashMap);
      return;
    }
    cn.q("No GMSG handler found for GMSG: " + paramUri);
  }
  
  public final void S()
  {
    synchronized (this.eJ)
    {
      this.id = false;
      this.ie = true;
      final bf localbf = this.fG.au();
      if (localbf != null)
      {
        if (!cm.ar()) {
          cm.hO.post(new Runnable()
          {
            public void run()
            {
              localbf.S();
            }
          });
        }
      }
      else {
        return;
      }
      localbf.S();
    }
  }
  
  public final void a(be parambe)
  {
    bi localbi = null;
    boolean bool = this.fG.az();
    q localq;
    if ((bool) && (!this.fG.av().ex))
    {
      localq = null;
      if (!bool) {
        break label69;
      }
    }
    for (;;)
    {
      a(new bh(parambe, localq, localbi, this.jdField_if, this.fG.ay()));
      return;
      localq = this.ia;
      break;
      label69:
      localbi = this.ib;
    }
  }
  
  public final void a(a parama)
  {
    this.ic = parama;
  }
  
  public void a(q paramq, bi parambi, ag paramag, bl parambl, boolean paramBoolean)
  {
    a("/appEvent", new af(paramag));
    a("/canOpenURLs", ah.ez);
    a("/click", ah.eA);
    a("/close", ah.eB);
    a("/customClose", ah.eC);
    a("/httpTrack", ah.eD);
    a("/log", ah.eE);
    a("/open", ah.eF);
    a("/touch", ah.eG);
    a("/video", ah.eH);
    this.ia = paramq;
    this.ib = parambi;
    this.ey = paramag;
    this.jdField_if = parambl;
    j(paramBoolean);
  }
  
  public final void a(String paramString, ai paramai)
  {
    this.hZ.put(paramString, paramai);
  }
  
  public final void a(boolean paramBoolean, int paramInt)
  {
    if ((this.fG.az()) && (!this.fG.av().ex)) {}
    for (q localq = null;; localq = this.ia)
    {
      a(new bh(localq, this.ib, this.jdField_if, this.fG, paramBoolean, paramInt, this.fG.ay()));
      return;
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    bi localbi = null;
    boolean bool = this.fG.az();
    q localq;
    if ((bool) && (!this.fG.av().ex))
    {
      localq = null;
      if (!bool) {
        break label85;
      }
    }
    for (;;)
    {
      a(new bh(localq, localbi, this.ey, this.jdField_if, this.fG, paramBoolean, paramInt, paramString, this.fG.ay()));
      return;
      localq = this.ia;
      break;
      label85:
      localbi = this.ib;
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    bi localbi = null;
    boolean bool = this.fG.az();
    q localq;
    if ((bool) && (!this.fG.av().ex))
    {
      localq = null;
      if (!bool) {
        break label87;
      }
    }
    for (;;)
    {
      a(new bh(localq, localbi, this.ey, this.jdField_if, this.fG, paramBoolean, paramInt, paramString1, paramString2, this.fG.ay()));
      return;
      localq = this.ia;
      break;
      label87:
      localbi = this.ib;
    }
  }
  
  public boolean aD()
  {
    synchronized (this.eJ)
    {
      boolean bool = this.ie;
      return bool;
    }
  }
  
  public final void j(boolean paramBoolean)
  {
    this.id = paramBoolean;
  }
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (this.ic != null)
    {
      this.ic.a(this.fG);
      this.ic = null;
    }
  }
  
  public final void reset()
  {
    synchronized (this.eJ)
    {
      this.hZ.clear();
      this.ia = null;
      this.ib = null;
      this.ic = null;
      this.ey = null;
      this.id = false;
      this.ie = false;
      this.jdField_if = null;
      return;
    }
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    cn.p("AdWebView shouldOverrideUrlLoading: " + paramString);
    Uri localUri = Uri.parse(paramString);
    if (("gmsg".equalsIgnoreCase(localUri.getScheme())) && ("mobileads.google.com".equalsIgnoreCase(localUri.getHost()))) {
      c(localUri);
    }
    for (;;)
    {
      return true;
      if ((this.id) && (b(localUri))) {
        return super.shouldOverrideUrlLoading(paramWebView, paramString);
      }
      if (!this.fG.willNotDraw())
      {
        try
        {
          h localh = this.fG.ax();
          paramWebView = localUri;
          if (localh != null)
          {
            paramWebView = localUri;
            if (localh.a(localUri)) {
              paramWebView = localh.a(localUri, this.fG.getContext());
            }
          }
        }
        catch (i paramWebView)
        {
          for (;;)
          {
            cn.q("Unable to append parameter to URL: " + paramString);
            paramWebView = localUri;
          }
        }
        a(new be("android.intent.action.VIEW", paramWebView.toString(), null, null, null, null, null));
      }
      else
      {
        cn.q("AdWebView unable to handle URL: " + paramString);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(cq paramcq);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */