package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import java.lang.ref.WeakReference;

public class es
{
  protected em mz;
  protected a np;
  
  private es(em paramem, int paramInt)
  {
    this.mz = paramem;
    Q(paramInt);
  }
  
  public static es a(em paramem, int paramInt)
  {
    if (ek.bK()) {
      return new b(paramem, paramInt);
    }
    return new es(paramem, paramInt);
  }
  
  protected void Q(int paramInt)
  {
    this.np = new a(paramInt, new Binder(), null);
  }
  
  public void bX()
  {
    this.mz.a(this.np.nq, this.np.ca());
  }
  
  public Bundle bY()
  {
    return this.np.ca();
  }
  
  public IBinder bZ()
  {
    return this.np.nq;
  }
  
  public void e(View paramView) {}
  
  public void setGravity(int paramInt)
  {
    this.np.gravity = paramInt;
  }
  
  public static final class a
  {
    public int bottom = 0;
    public int gravity;
    public int left = 0;
    public IBinder nq;
    public int nr = -1;
    public int right = 0;
    public int top = 0;
    
    private a(int paramInt, IBinder paramIBinder)
    {
      this.gravity = paramInt;
      this.nq = paramIBinder;
    }
    
    public Bundle ca()
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("popupLocationInfo.gravity", this.gravity);
      localBundle.putInt("popupLocationInfo.displayId", this.nr);
      localBundle.putInt("popupLocationInfo.left", this.left);
      localBundle.putInt("popupLocationInfo.top", this.top);
      localBundle.putInt("popupLocationInfo.right", this.right);
      localBundle.putInt("popupLocationInfo.bottom", this.bottom);
      return localBundle;
    }
  }
  
  private static final class b
    extends es
    implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener
  {
    private boolean mK = false;
    private WeakReference<View> ns;
    
    protected b(em paramem, int paramInt)
    {
      super(paramInt, null);
    }
    
    private void f(View paramView)
    {
      int j = -1;
      int i = j;
      if (ek.bO())
      {
        localObject = paramView.getDisplay();
        i = j;
        if (localObject != null) {
          i = ((Display)localObject).getDisplayId();
        }
      }
      Object localObject = paramView.getWindowToken();
      int[] arrayOfInt = new int[2];
      paramView.getLocationInWindow(arrayOfInt);
      j = paramView.getWidth();
      int k = paramView.getHeight();
      this.np.nr = i;
      this.np.nq = ((IBinder)localObject);
      this.np.left = arrayOfInt[0];
      this.np.top = arrayOfInt[1];
      this.np.right = (arrayOfInt[0] + j);
      this.np.bottom = (arrayOfInt[1] + k);
      if (this.mK)
      {
        bX();
        this.mK = false;
      }
    }
    
    protected void Q(int paramInt)
    {
      this.np = new es.a(paramInt, null, null);
    }
    
    public void bX()
    {
      if (this.np.nq != null)
      {
        super.bX();
        return;
      }
      if (this.ns != null) {}
      for (boolean bool = true;; bool = false)
      {
        this.mK = bool;
        return;
      }
    }
    
    public void e(View paramView)
    {
      this.mz.bT();
      Object localObject2;
      Object localObject1;
      if (this.ns != null)
      {
        localObject2 = (View)this.ns.get();
        Context localContext = this.mz.getContext();
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = localObject2;
          if ((localContext instanceof Activity)) {
            localObject1 = ((Activity)localContext).getWindow().getDecorView();
          }
        }
        if (localObject1 != null)
        {
          ((View)localObject1).removeOnAttachStateChangeListener(this);
          localObject1 = ((View)localObject1).getViewTreeObserver();
          if (!ek.bN()) {
            break label186;
          }
          ((ViewTreeObserver)localObject1).removeOnGlobalLayoutListener(this);
        }
      }
      for (;;)
      {
        this.ns = null;
        localObject2 = this.mz.getContext();
        localObject1 = paramView;
        if (paramView == null)
        {
          localObject1 = paramView;
          if ((localObject2 instanceof Activity))
          {
            localObject1 = ((Activity)localObject2).findViewById(16908290);
            paramView = (View)localObject1;
            if (localObject1 == null) {
              paramView = ((Activity)localObject2).getWindow().getDecorView();
            }
            ep.c("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view.");
            localObject1 = paramView;
          }
        }
        if (localObject1 == null) {
          break;
        }
        f((View)localObject1);
        this.ns = new WeakReference(localObject1);
        ((View)localObject1).addOnAttachStateChangeListener(this);
        ((View)localObject1).getViewTreeObserver().addOnGlobalLayoutListener(this);
        return;
        label186:
        ((ViewTreeObserver)localObject1).removeGlobalOnLayoutListener(this);
      }
      ep.d("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
    }
    
    public void onGlobalLayout()
    {
      if (this.ns == null) {}
      View localView;
      do
      {
        return;
        localView = (View)this.ns.get();
      } while (localView == null);
      f(localView);
    }
    
    public void onViewAttachedToWindow(View paramView)
    {
      f(paramView);
    }
    
    public void onViewDetachedFromWindow(View paramView)
    {
      this.mz.bT();
      paramView.removeOnAttachStateChangeListener(this);
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\es.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */