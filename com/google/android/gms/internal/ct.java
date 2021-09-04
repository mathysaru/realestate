package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public final class ct
  extends cr
{
  public ct(cq paramcq, boolean paramBoolean)
  {
    super(paramcq, paramBoolean);
  }
  
  private static WebResourceResponse b(Context paramContext, String paramString1, String paramString2)
    throws IOException
  {
    paramString2 = (HttpURLConnection)new URL(paramString2).openConnection();
    try
    {
      ci.a(paramContext, paramString1, true, paramString2);
      paramString2.connect();
      paramContext = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(ci.a(new InputStreamReader(paramString2.getInputStream())).getBytes("UTF-8")));
      return paramContext;
    }
    finally
    {
      paramString2.disconnect();
    }
  }
  
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    try
    {
      if (!"mraid.js".equalsIgnoreCase(new File(paramString).getName())) {
        return super.shouldInterceptRequest(paramWebView, paramString);
      }
      if (!(paramWebView instanceof cq))
      {
        cn.q("Tried to intercept request from a WebView that wasn't an AdWebView.");
        return super.shouldInterceptRequest(paramWebView, paramString);
      }
      Object localObject = (cq)paramWebView;
      ((cq)localObject).aw().S();
      if (((cq)localObject).av().ex)
      {
        cn.p("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_interstitial.js)");
        return b(((cq)localObject).getContext(), this.fG.ay().hP, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
      }
      if (((cq)localObject).az())
      {
        cn.p("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js)");
        return b(((cq)localObject).getContext(), this.fG.ay().hP, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
      }
      cn.p("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_banner.js)");
      localObject = b(((cq)localObject).getContext(), this.fG.ay().hP, "http://media.admob.com/mraid/v1/mraid_app_banner.js");
      return (WebResourceResponse)localObject;
    }
    catch (IOException localIOException)
    {
      cn.q("Could not fetching MRAID JS. " + localIOException.getMessage());
    }
    return super.shouldInterceptRequest(paramWebView, paramString);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */