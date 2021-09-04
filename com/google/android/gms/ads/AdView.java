package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.internal.aa;
import com.google.android.gms.internal.ac;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.t;
import com.google.android.gms.internal.u;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;
import com.google.android.gms.internal.z;

public final class AdView
  extends ViewGroup
{
  private AdSize c;
  private final av dS = new av();
  private AdListener dT;
  private ac dU;
  private String dV;
  private a dW;
  
  public AdView(Context paramContext)
  {
    super(paramContext);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    try
    {
      paramAttributeSet = new aa(paramContext, paramAttributeSet);
      this.c = paramAttributeSet.getAdSize();
      this.dV = paramAttributeSet.getAdUnitId();
      if (isInEditMode()) {
        cm.b(this, new x(paramContext, this.c), "Ads by Google");
      }
      return;
    }
    catch (IllegalArgumentException paramAttributeSet)
    {
      cm.a(this, new x(paramContext, AdSize.BANNER), paramAttributeSet.getMessage());
    }
  }
  
  private void c(String paramString)
    throws RemoteException
  {
    if ((this.c == null) || (this.dV == null)) {
      d(paramString);
    }
    paramString = getContext();
    this.dU = u.a(paramString, new x(paramString, this.c), this.dV, this.dS);
    if (this.dT != null) {
      this.dU.a(new t(this.dT));
    }
    if (this.dW != null) {
      this.dU.a(new z(this.dW));
    }
    x();
  }
  
  private void d(String paramString)
  {
    if (this.dU == null) {
      throw new IllegalStateException("The ad size and ad unit ID must be set on AdView before " + paramString + " is called.");
    }
  }
  
  private void x()
  {
    try
    {
      b localb = this.dU.z();
      if (localb == null) {
        return;
      }
      addView((View)c.b(localb));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Failed to get an ad frame.", localRemoteException);
    }
  }
  
  public void destroy()
  {
    try
    {
      if (this.dU != null) {
        this.dU.destroy();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Failed to destroy AdView.", localRemoteException);
    }
  }
  
  public AdListener getAdListener()
  {
    return this.dT;
  }
  
  public AdSize getAdSize()
  {
    return this.c;
  }
  
  public String getAdUnitId()
  {
    return this.dV;
  }
  
  public void loadAd(AdRequest paramAdRequest)
  {
    try
    {
      if (this.dU == null) {
        c("loadAd");
      }
      if (this.dU.a(new v(getContext(), paramAdRequest))) {
        this.dS.c(paramAdRequest.v());
      }
      return;
    }
    catch (RemoteException paramAdRequest)
    {
      cn.b("Failed to load ad.", paramAdRequest);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = getChildAt(0);
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      int i = localView.getMeasuredWidth();
      int j = localView.getMeasuredHeight();
      paramInt1 = (paramInt3 - paramInt1 - i) / 2;
      paramInt2 = (paramInt4 - paramInt2 - j) / 2;
      localView.layout(paramInt1, paramInt2, i + paramInt1, j + paramInt2);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    Object localObject = getChildAt(0);
    int j;
    if ((localObject != null) && (((View)localObject).getVisibility() != 8))
    {
      measureChild((View)localObject, paramInt1, paramInt2);
      j = ((View)localObject).getMeasuredWidth();
      i = ((View)localObject).getMeasuredHeight();
    }
    for (;;)
    {
      j = Math.max(j, getSuggestedMinimumWidth());
      i = Math.max(i, getSuggestedMinimumHeight());
      setMeasuredDimension(resolveSize(j, paramInt1), resolveSize(i, paramInt2));
      return;
      if (this.c != null)
      {
        localObject = getContext();
        j = this.c.getWidthInPixels((Context)localObject);
        i = this.c.getHeightInPixels((Context)localObject);
      }
      else
      {
        j = 0;
      }
    }
  }
  
  public void pause()
  {
    try
    {
      if (this.dU != null) {
        this.dU.pause();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Failed to call pause.", localRemoteException);
    }
  }
  
  public void resume()
  {
    try
    {
      if (this.dU != null) {
        this.dU.resume();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Failed to call resume.", localRemoteException);
    }
  }
  
  public void setAdListener(AdListener paramAdListener)
  {
    try
    {
      this.dT = paramAdListener;
      ac localac;
      if (this.dU != null)
      {
        localac = this.dU;
        if (paramAdListener == null) {
          break label38;
        }
      }
      label38:
      for (paramAdListener = new t(paramAdListener);; paramAdListener = null)
      {
        localac.a(paramAdListener);
        return;
      }
      return;
    }
    catch (RemoteException paramAdListener)
    {
      cn.b("Failed to set the AdListener.", paramAdListener);
    }
  }
  
  public void setAdSize(AdSize paramAdSize)
  {
    if (this.c != null) {
      throw new IllegalStateException("The ad size can only be set once on AdView.");
    }
    this.c = paramAdSize;
    requestLayout();
  }
  
  public void setAdUnitId(String paramString)
  {
    if (this.dV != null) {
      throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }
    this.dV = paramString;
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\ads\AdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */