package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;

public final class bk
  extends FrameLayout
  implements View.OnClickListener
{
  private final Activity fD;
  private final ImageButton gk;
  
  public bk(Activity paramActivity, int paramInt)
  {
    super(paramActivity);
    this.fD = paramActivity;
    setOnClickListener(this);
    this.gk = new ImageButton(paramActivity);
    this.gk.setImageResource(17301527);
    this.gk.setBackgroundColor(0);
    this.gk.setOnClickListener(this);
    this.gk.setPadding(0, 0, 0, 0);
    paramInt = cm.a(paramActivity, paramInt);
    addView(this.gk, new FrameLayout.LayoutParams(paramInt, paramInt, 17));
  }
  
  public void d(boolean paramBoolean)
  {
    ImageButton localImageButton = this.gk;
    if (paramBoolean) {}
    for (int i = 4;; i = 0)
    {
      localImageButton.setVisibility(i);
      return;
    }
  }
  
  public void onClick(View paramView)
  {
    this.fD.finish();
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */