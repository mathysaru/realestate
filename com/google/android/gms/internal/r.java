package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.ViewSwitcher;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;

public final class r
  extends ac.a
  implements ag, aq, bi, bl, bp.a, q
{
  private final aw dZ;
  private final a ea;
  private final s eb;
  
  public r(Context paramContext, x paramx, String paramString, aw paramaw, co paramco)
  {
    this.ea = new a(paramContext, paramx, paramString, paramco);
    this.dZ = paramaw;
    this.eb = new s(this);
    cn.o("Use AdRequest.Builder.addTestDevice(\"" + cm.l(paramContext) + "\") to get test ads on this device.");
    ci.i(paramContext);
  }
  
  private void I()
  {
    cn.o("Ad closing.");
    if (this.ea.eh != null) {}
    try
    {
      this.ea.eh.onAdClosed();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call AdListener.onAdClosed().", localRemoteException);
    }
  }
  
  private void J()
  {
    cn.o("Ad leaving application.");
    if (this.ea.eh != null) {}
    try
    {
      this.ea.eh.onAdLeftApplication();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call AdListener.onAdLeftApplication().", localRemoteException);
    }
  }
  
  private void K()
  {
    cn.o("Ad opening.");
    if (this.ea.eh != null) {}
    try
    {
      this.ea.eh.onAdOpened();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call AdListener.onAdOpened().", localRemoteException);
    }
  }
  
  private void L()
  {
    cn.o("Ad finished loading.");
    if (this.ea.eh != null) {}
    try
    {
      this.ea.eh.onAdLoaded();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call AdListener.onAdLoaded().", localRemoteException);
    }
  }
  
  private boolean M()
  {
    boolean bool = true;
    if (!ci.a(this.ea.ee.getPackageManager(), this.ea.ee.getPackageName(), "android.permission.INTERNET"))
    {
      if (!this.ea.ed.ex) {
        cm.a(this.ea.ec, this.ea.ed, "Missing internet permission in AndroidManifest.xml.");
      }
      bool = false;
    }
    if (!ci.h(this.ea.ee))
    {
      if (!this.ea.ed.ex) {
        cm.a(this.ea.ec, this.ea.ed, "Missing AdActivity with android:configChanges in AndroidManifest.xml.");
      }
      bool = false;
    }
    if (!bool) {
      this.ea.ec.setVisibility(0);
    }
    return bool;
  }
  
  private void N()
  {
    if (this.ea.ej == null) {
      cn.q("Ad state was null when trying to ping click URLs.");
    }
    do
    {
      return;
      cn.m("Pinging click URLs.");
      if (this.ea.ej.eW != null) {
        ci.a(this.ea.ee, this.ea.eg.hP, this.ea.ej.eW);
      }
    } while ((this.ea.ej.hA == null) || (this.ea.ej.hA.eW == null));
    au.a(this.ea.ee, this.ea.eg.hP, this.ea.ej, this.ea.adUnitId, false, this.ea.ej.hA.eW);
  }
  
  private void O()
  {
    if (this.ea.ej != null)
    {
      this.ea.ej.fU.destroy();
      this.ea.ej = null;
    }
  }
  
  private void a(int paramInt)
  {
    cn.q("Failed to load ad: " + paramInt);
    if (this.ea.eh != null) {}
    try
    {
      this.ea.eh.onAdFailedToLoad(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call AdListener.onAdFailedToLoad().", localRemoteException);
    }
  }
  
  private void b(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-2, -2);
    this.ea.ec.addView(paramView, localLayoutParams);
  }
  
  private void b(boolean paramBoolean)
  {
    if (this.ea.ej == null) {
      cn.q("Ad state was null when trying to ping impression URLs.");
    }
    do
    {
      return;
      cn.m("Pinging Impression URLs.");
      if (this.ea.ej.eX != null) {
        ci.a(this.ea.ee, this.ea.eg.hP, this.ea.ej.eX);
      }
      if ((this.ea.ej.hA != null) && (this.ea.ej.hA.eX != null)) {
        au.a(this.ea.ee, this.ea.eg.hP, this.ea.ej, this.ea.adUnitId, paramBoolean, this.ea.ej.hA.eX);
      }
    } while ((this.ea.ej.fm == null) || (this.ea.ej.fm.eT == null));
    au.a(this.ea.ee, this.ea.eg.hP, this.ea.ej, this.ea.adUnitId, paramBoolean, this.ea.ej.fm.eT);
  }
  
  /* Error */
  private boolean b(ce paramce)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 276	com/google/android/gms/internal/ce:gI	Z
    //   4: ifeq +50 -> 54
    //   7: aload_1
    //   8: getfield 280	com/google/android/gms/internal/ce:fn	Lcom/google/android/gms/internal/ax;
    //   11: invokeinterface 286 1 0
    //   16: invokestatic 291	com/google/android/gms/dynamic/c:b	(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;
    //   19: checkcast 293	android/view/View
    //   22: astore_1
    //   23: aload_0
    //   24: getfield 35	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   27: getfield 156	com/google/android/gms/internal/r$a:ec	Landroid/widget/ViewSwitcher;
    //   30: invokevirtual 297	android/widget/ViewSwitcher:getNextView	()Landroid/view/View;
    //   33: astore_2
    //   34: aload_2
    //   35: ifnull +14 -> 49
    //   38: aload_0
    //   39: getfield 35	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   42: getfield 156	com/google/android/gms/internal/r$a:ec	Landroid/widget/ViewSwitcher;
    //   45: aload_2
    //   46: invokevirtual 300	android/widget/ViewSwitcher:removeView	(Landroid/view/View;)V
    //   49: aload_0
    //   50: aload_1
    //   51: invokespecial 302	com/google/android/gms/internal/r:b	(Landroid/view/View;)V
    //   54: aload_0
    //   55: getfield 35	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   58: getfield 156	com/google/android/gms/internal/r$a:ec	Landroid/widget/ViewSwitcher;
    //   61: invokevirtual 306	android/widget/ViewSwitcher:getChildCount	()I
    //   64: iconst_1
    //   65: if_icmple +13 -> 78
    //   68: aload_0
    //   69: getfield 35	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   72: getfield 156	com/google/android/gms/internal/r$a:ec	Landroid/widget/ViewSwitcher;
    //   75: invokevirtual 309	android/widget/ViewSwitcher:showNext	()V
    //   78: aload_0
    //   79: getfield 35	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   82: getfield 178	com/google/android/gms/internal/r$a:ej	Lcom/google/android/gms/internal/ce;
    //   85: ifnull +70 -> 155
    //   88: aload_0
    //   89: getfield 35	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   92: getfield 156	com/google/android/gms/internal/r$a:ec	Landroid/widget/ViewSwitcher;
    //   95: invokevirtual 297	android/widget/ViewSwitcher:getNextView	()Landroid/view/View;
    //   98: astore_1
    //   99: aload_1
    //   100: instanceof 229
    //   103: ifeq +85 -> 188
    //   106: aload_1
    //   107: checkcast 229	com/google/android/gms/internal/cq
    //   110: aload_0
    //   111: getfield 35	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   114: getfield 128	com/google/android/gms/internal/r$a:ee	Landroid/content/Context;
    //   117: aload_0
    //   118: getfield 35	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   121: getfield 146	com/google/android/gms/internal/r$a:ed	Lcom/google/android/gms/internal/x;
    //   124: invokevirtual 312	com/google/android/gms/internal/cq:a	(Landroid/content/Context;Lcom/google/android/gms/internal/x;)V
    //   127: aload_0
    //   128: getfield 35	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   131: getfield 178	com/google/android/gms/internal/r$a:ej	Lcom/google/android/gms/internal/ce;
    //   134: getfield 280	com/google/android/gms/internal/ce:fn	Lcom/google/android/gms/internal/ax;
    //   137: ifnull +18 -> 155
    //   140: aload_0
    //   141: getfield 35	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   144: getfield 178	com/google/android/gms/internal/r$a:ej	Lcom/google/android/gms/internal/ce;
    //   147: getfield 280	com/google/android/gms/internal/ce:fn	Lcom/google/android/gms/internal/ax;
    //   150: invokeinterface 313 1 0
    //   155: aload_0
    //   156: getfield 35	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   159: getfield 156	com/google/android/gms/internal/r$a:ec	Landroid/widget/ViewSwitcher;
    //   162: iconst_0
    //   163: invokevirtual 173	android/widget/ViewSwitcher:setVisibility	(I)V
    //   166: iconst_1
    //   167: ireturn
    //   168: astore_1
    //   169: ldc_w 315
    //   172: aload_1
    //   173: invokestatic 98	com/google/android/gms/internal/cn:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   176: iconst_0
    //   177: ireturn
    //   178: astore_1
    //   179: ldc_w 317
    //   182: aload_1
    //   183: invokestatic 98	com/google/android/gms/internal/cn:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   186: iconst_0
    //   187: ireturn
    //   188: aload_1
    //   189: ifnull -62 -> 127
    //   192: aload_0
    //   193: getfield 35	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   196: getfield 156	com/google/android/gms/internal/r$a:ec	Landroid/widget/ViewSwitcher;
    //   199: aload_1
    //   200: invokevirtual 300	android/widget/ViewSwitcher:removeView	(Landroid/view/View;)V
    //   203: goto -76 -> 127
    //   206: astore_1
    //   207: ldc_w 319
    //   210: invokestatic 183	com/google/android/gms/internal/cn:q	(Ljava/lang/String;)V
    //   213: goto -58 -> 155
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	216	0	this	r
    //   0	216	1	paramce	ce
    //   33	13	2	localView	View
    // Exception table:
    //   from	to	target	type
    //   7	23	168	android/os/RemoteException
    //   49	54	178	java/lang/Throwable
    //   140	155	206	android/os/RemoteException
  }
  
  private bu.a c(v paramv)
  {
    ApplicationInfo localApplicationInfo = this.ea.ee.getApplicationInfo();
    try
    {
      PackageInfo localPackageInfo = this.ea.ee.getPackageManager().getPackageInfo(localApplicationInfo.packageName, 0);
      if ((!this.ea.ed.ex) && (this.ea.ec.getParent() != null))
      {
        localObject2 = new int[2];
        this.ea.ec.getLocationOnScreen((int[])localObject2);
        int j = localObject2[0];
        int k = localObject2[1];
        localObject2 = this.ea.ee.getResources().getDisplayMetrics();
        int m = this.ea.ec.getWidth();
        int n = this.ea.ec.getHeight();
        if ((this.ea.ec.isShown()) && (j + m > 0) && (k + n > 0) && (j <= ((DisplayMetrics)localObject2).widthPixels) && (k <= ((DisplayMetrics)localObject2).heightPixels))
        {
          i = 1;
          localObject2 = new Bundle(5);
          ((Bundle)localObject2).putInt("x", j);
          ((Bundle)localObject2).putInt("y", k);
          ((Bundle)localObject2).putInt("width", m);
          ((Bundle)localObject2).putInt("height", n);
          ((Bundle)localObject2).putInt("visible", i);
          return new bu.a((Bundle)localObject2, paramv, this.ea.ed, this.ea.adUnitId, localApplicationInfo, localPackageInfo, cf.al(), cf.hB, this.ea.eg);
        }
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject1 = null;
        continue;
        int i = 0;
        continue;
        Object localObject2 = null;
      }
    }
  }
  
  public void A()
  {
    J();
  }
  
  public void B()
  {
    if (this.ea.ed.ex) {
      O();
    }
    I();
  }
  
  public void C()
  {
    if (this.ea.ed.ex) {
      b(false);
    }
    K();
  }
  
  public void D()
  {
    y();
  }
  
  public void E()
  {
    B();
  }
  
  public void F()
  {
    A();
  }
  
  public void G()
  {
    C();
  }
  
  public void H()
  {
    if (this.ea.ej != null) {
      cn.q("Mediation adapter " + this.ea.ej.fo + " refreshed, but mediation adapters should never refresh.");
    }
    b(true);
    L();
  }
  
  public void a(ab paramab)
  {
    dm.w("setAdListener must be called on the main UI thread.");
    this.ea.eh = paramab;
  }
  
  public void a(ae paramae)
  {
    dm.w("setAppEventListener must be called on the main UI thread.");
    this.ea.ek = paramae;
  }
  
  public void a(ce paramce)
  {
    this.ea.ei = null;
    if (paramce.errorCode == -1) {
      return;
    }
    boolean bool;
    if (paramce.gB.extras != null)
    {
      bool = paramce.gB.extras.getBoolean("_noRefresh", false);
      if (!this.ea.ed.ex) {
        break label152;
      }
      ci.a(paramce.fU);
    }
    for (;;)
    {
      if ((paramce.errorCode == 3) && (paramce.hA != null) && (paramce.hA.eY != null))
      {
        cn.m("Pinging no fill URLs.");
        au.a(this.ea.ee, this.ea.eg.hP, paramce, this.ea.adUnitId, false, paramce.hA.eY);
      }
      if (paramce.errorCode == -2) {
        break label252;
      }
      a(paramce.errorCode);
      return;
      bool = false;
      break;
      label152:
      if (!bool) {
        if (paramce.fa > 0L) {
          this.eb.a(paramce.gB, paramce.fa);
        } else if ((paramce.hA != null) && (paramce.hA.fa > 0L)) {
          this.eb.a(paramce.gB, paramce.hA.fa);
        } else if ((!paramce.gI) && (paramce.errorCode == 2)) {
          this.eb.d(paramce.gB);
        }
      }
    }
    label252:
    if ((!this.ea.ed.ex) && (!b(paramce)))
    {
      a(0);
      return;
    }
    if ((this.ea.ej != null) && (this.ea.ej.fp != null)) {
      this.ea.ej.fp.a(null);
    }
    if (paramce.fp != null) {
      paramce.fp.a(this);
    }
    this.ea.ej = paramce;
    if (!this.ea.ed.ex) {
      b(false);
    }
    L();
  }
  
  public void a(String paramString1, String paramString2)
  {
    if (this.ea.ek != null) {}
    try
    {
      this.ea.ek.a(paramString1, paramString2);
      return;
    }
    catch (RemoteException paramString1)
    {
      cn.b("Could not call the AppEventListener.", paramString1);
    }
  }
  
  public boolean a(v paramv)
  {
    dm.w("loadAd must be called on the main UI thread.");
    if (this.ea.ei != null) {
      cn.q("An ad request is already in progress. Aborting.");
    }
    do
    {
      return false;
      if ((this.ea.ed.ex) && (this.ea.ej != null))
      {
        cn.q("An interstitial is already loading. Aborting.");
        return false;
      }
    } while (!M());
    cn.o("Starting ad request.");
    this.eb.cancel();
    bu.a locala = c(paramv);
    if (this.ea.ed.ex)
    {
      paramv = cq.a(this.ea.ee, this.ea.ed, false, false, this.ea.ef, this.ea.eg);
      paramv.aw().a(this, null, this, this, true);
      this.ea.ei = bp.a(this.ea.ee, locala, this.ea.ef, paramv, this.dZ, this);
      return true;
    }
    paramv = this.ea.ec.getNextView();
    if ((paramv instanceof cq))
    {
      paramv = (cq)paramv;
      paramv.a(this.ea.ee, this.ea.ed);
    }
    for (;;)
    {
      paramv.aw().a(this, this, this, this, false);
      break;
      if (paramv != null) {
        this.ea.ec.removeView(paramv);
      }
      paramv = cq.a(this.ea.ee, this.ea.ed, false, false, this.ea.ef, this.ea.eg);
      b(paramv);
    }
  }
  
  public void b(v paramv)
  {
    ViewParent localViewParent = this.ea.ec.getParent();
    if (((localViewParent instanceof View)) && (((View)localViewParent).isShown()) && (ci.am()))
    {
      a(paramv);
      return;
    }
    cn.o("Ad is not visible. Not refreshing ad.");
    this.eb.d(paramv);
  }
  
  public void destroy()
  {
    dm.w("destroy must be called on the main UI thread.");
    this.ea.eh = null;
    this.ea.ek = null;
    this.eb.cancel();
    stopLoading();
    if (this.ea.ec != null) {
      this.ea.ec.removeAllViews();
    }
    if ((this.ea.ej != null) && (this.ea.ej.fU != null)) {
      this.ea.ej.fU.destroy();
    }
  }
  
  public boolean isReady()
  {
    dm.w("isReady must be called on the main UI thread.");
    return (this.ea.ei == null) && (this.ea.ej != null);
  }
  
  public void pause()
  {
    dm.w("pause must be called on the main UI thread.");
    if (this.ea.ej != null) {
      ci.a(this.ea.ej.fU);
    }
  }
  
  public void resume()
  {
    dm.w("resume must be called on the main UI thread.");
    if (this.ea.ej != null) {
      ci.b(this.ea.ej.fU);
    }
  }
  
  public void showInterstitial()
  {
    dm.w("showInterstitial must be called on the main UI thread.");
    if (!this.ea.ed.ex)
    {
      cn.q("Cannot call showInterstitial on a banner ad.");
      return;
    }
    if (this.ea.ej == null)
    {
      cn.q("The interstitial has not loaded.");
      return;
    }
    if (this.ea.ej.fU.az())
    {
      cn.q("The interstitial is already showing.");
      return;
    }
    this.ea.ej.fU.i(true);
    if (this.ea.ej.gI) {
      try
      {
        this.ea.ej.fn.showInterstitial();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        cn.b("Could not show interstitial.", localRemoteException);
        O();
        return;
      }
    }
    bh localbh = new bh(this, this, this, this.ea.ej.fU, this.ea.ej.orientation, this.ea.eg);
    bf.a(this.ea.ee, localbh);
  }
  
  public void stopLoading()
  {
    dm.w("stopLoading must be called on the main UI thread.");
    if (this.ea.ej != null)
    {
      this.ea.ej.fU.stopLoading();
      this.ea.ej = null;
    }
    if (this.ea.ei != null) {
      this.ea.ei.cancel();
    }
  }
  
  public void y()
  {
    N();
  }
  
  public b z()
  {
    dm.w("getAdFrame must be called on the main UI thread.");
    return c.g(this.ea.ec);
  }
  
  private static final class a
  {
    public final String adUnitId;
    public final ViewSwitcher ec;
    public final x ed;
    public final Context ee;
    public final h ef;
    public final co eg;
    public ab eh;
    public cg ei;
    public ce ej;
    public ae ek;
    
    public a(Context paramContext, x paramx, String paramString, co paramco)
    {
      if (paramx.ex) {
        this.ec = null;
      }
      for (;;)
      {
        this.ed = paramx;
        this.adUnitId = paramString;
        this.ee = paramContext;
        this.ef = new h(g.a(paramco.hP, paramContext));
        this.eg = paramco;
        return;
        this.ec = new ViewSwitcher(paramContext);
        this.ec.setMinimumWidth(paramx.widthPixels);
        this.ec.setMinimumHeight(paramx.heightPixels);
        this.ec.setVisibility(4);
      }
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */