package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class cq
  extends WebView
  implements DownloadListener
{
  private final Object eJ = new Object();
  private x fg;
  private final h go;
  private final cr hT;
  private final MutableContextWrapper hU;
  private final co hV;
  private bf hW;
  private boolean hX;
  private boolean hY;
  
  private cq(MutableContextWrapper paramMutableContextWrapper, x paramx, boolean paramBoolean1, boolean paramBoolean2, h paramh, co paramco)
  {
    super(paramMutableContextWrapper);
    this.hU = paramMutableContextWrapper;
    this.fg = paramx;
    this.hX = paramBoolean1;
    this.go = paramh;
    this.hV = paramco;
    setBackgroundColor(0);
    paramx = getSettings();
    paramx.setJavaScriptEnabled(true);
    paramx.setSavePassword(false);
    ci.a(paramMutableContextWrapper, paramco.hP, paramx);
    if (Build.VERSION.SDK_INT >= 17)
    {
      ck.a(getContext(), paramx);
      setDownloadListener(this);
      if (Build.VERSION.SDK_INT < 11) {
        break label168;
      }
      this.hT = new ct(this, paramBoolean2);
      label116:
      setWebViewClient(this.hT);
      if (Build.VERSION.SDK_INT < 14) {
        break label185;
      }
      setWebChromeClient(new cu(this));
    }
    for (;;)
    {
      aA();
      return;
      if (Build.VERSION.SDK_INT < 11) {
        break;
      }
      cj.a(getContext(), paramx);
      break;
      label168:
      this.hT = new cr(this, paramBoolean2);
      break label116;
      label185:
      if (Build.VERSION.SDK_INT >= 11) {
        setWebChromeClient(new cs(this));
      }
    }
  }
  
  public static cq a(Context paramContext, x paramx, boolean paramBoolean1, boolean paramBoolean2, h paramh, co paramco)
  {
    return new cq(new MutableContextWrapper(paramContext), paramx, paramBoolean1, paramBoolean2, paramh, paramco);
  }
  
  private void aA()
  {
    for (;;)
    {
      synchronized (this.eJ)
      {
        if ((this.hX) || (this.fg.ex))
        {
          if (Build.VERSION.SDK_INT < 14)
          {
            cn.m("Disabling hardware acceleration on an overlay.");
            aB();
            return;
          }
          cn.m("Enabling hardware acceleration on an overlay.");
          aC();
        }
      }
      if (Build.VERSION.SDK_INT < 18)
      {
        cn.m("Disabling hardware acceleration on an AdView.");
        aB();
      }
      else
      {
        cn.m("Enabling hardware acceleration on an AdView.");
        aC();
      }
    }
  }
  
  private void aB()
  {
    synchronized (this.eJ)
    {
      if ((!this.hY) && (Build.VERSION.SDK_INT >= 11)) {
        cj.c(this);
      }
      this.hY = true;
      return;
    }
  }
  
  private void aC()
  {
    synchronized (this.eJ)
    {
      if ((this.hY) && (Build.VERSION.SDK_INT >= 11)) {
        cj.d(this);
      }
      this.hY = false;
      return;
    }
  }
  
  public void a(Context paramContext, x paramx)
  {
    synchronized (this.eJ)
    {
      this.hU.setBaseContext(paramContext);
      this.hW = null;
      this.fg = paramx;
      this.hX = false;
      ci.b(this);
      loadUrl("about:blank");
      this.hT.reset();
      return;
    }
  }
  
  public void a(bf parambf)
  {
    synchronized (this.eJ)
    {
      this.hW = parambf;
      return;
    }
  }
  
  public void a(String paramString, Map<String, ?> paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("javascript:AFMA_ReceiveMessage('");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    if (paramMap != null) {}
    try
    {
      paramString = ci.l(paramMap).toString();
      localStringBuilder.append(",");
      localStringBuilder.append(paramString);
      localStringBuilder.append(");");
      cn.p("Dispatching AFMA event: " + localStringBuilder);
      loadUrl(localStringBuilder.toString());
      return;
    }
    catch (JSONException paramString)
    {
      cn.q("Could not convert AFMA event parameters to JSON.");
    }
  }
  
  public void as()
  {
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.hV.hP);
    a("onhide", localHashMap);
  }
  
  public void at()
  {
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.hV.hP);
    a("onshow", localHashMap);
  }
  
  public bf au()
  {
    synchronized (this.eJ)
    {
      bf localbf = this.hW;
      return localbf;
    }
  }
  
  public x av()
  {
    synchronized (this.eJ)
    {
      x localx = this.fg;
      return localx;
    }
  }
  
  public cr aw()
  {
    return this.hT;
  }
  
  public h ax()
  {
    return this.go;
  }
  
  public co ay()
  {
    return this.hV;
  }
  
  public boolean az()
  {
    synchronized (this.eJ)
    {
      boolean bool = this.hX;
      return bool;
    }
  }
  
  public void i(boolean paramBoolean)
  {
    synchronized (this.eJ)
    {
      this.hX = paramBoolean;
      aA();
      return;
    }
  }
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      paramString2 = new Intent("android.intent.action.VIEW");
      paramString2.setDataAndType(Uri.parse(paramString1), paramString4);
      getContext().startActivity(paramString2);
      return;
    }
    catch (ActivityNotFoundException paramString2)
    {
      cn.m("Couldn't find an Activity to view url/mimetype: " + paramString1 + " / " + paramString4);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int j = Integer.MAX_VALUE;
    for (;;)
    {
      int i;
      int m;
      int k;
      synchronized (this.eJ)
      {
        if ((isInEditMode()) || (this.hX))
        {
          super.onMeasure(paramInt1, paramInt2);
          return;
        }
        int n = View.MeasureSpec.getMode(paramInt1);
        i = View.MeasureSpec.getSize(paramInt1);
        m = View.MeasureSpec.getMode(paramInt2);
        k = View.MeasureSpec.getSize(paramInt2);
        if (n == Integer.MIN_VALUE) {
          break label242;
        }
        if (n != 1073741824) {
          break label235;
        }
        break label242;
        if ((this.fg.widthPixels > paramInt1) || (this.fg.heightPixels > paramInt2))
        {
          cn.q("Not enough space to show ad. Needs " + this.fg.widthPixels + "x" + this.fg.heightPixels + ", but only has " + i + "x" + k);
          if (getVisibility() != 8) {
            setVisibility(4);
          }
          setMeasuredDimension(0, 0);
          return;
        }
      }
      if (getVisibility() != 8) {
        setVisibility(0);
      }
      setMeasuredDimension(this.fg.widthPixels, this.fg.heightPixels);
      continue;
      label235:
      paramInt1 = Integer.MAX_VALUE;
      break label244;
      label242:
      paramInt1 = i;
      label244:
      if (m != Integer.MIN_VALUE)
      {
        paramInt2 = j;
        if (m != 1073741824) {}
      }
      else
      {
        paramInt2 = k;
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.go != null) {
      this.go.a(paramMotionEvent);
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setContext(Context paramContext)
  {
    this.hU.setBaseContext(paramContext);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */