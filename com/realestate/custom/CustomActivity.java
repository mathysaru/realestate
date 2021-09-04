package com.realestate.custom;

import android.app.ActionBar;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.realestate.utils.TouchEffect;

public class CustomActivity
  extends FragmentActivity
  implements View.OnClickListener
{
  public static final TouchEffect TOUCH = new TouchEffect();
  
  public void onClick(View paramView) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setupActionBar();
  }
  
  public View setClick(int paramInt)
  {
    View localView = findViewById(paramInt);
    if (localView != null) {
      localView.setOnClickListener(this);
    }
    return localView;
  }
  
  public View setTouchNClick(int paramInt)
  {
    View localView = setClick(paramInt);
    if (localView != null) {
      localView.setOnTouchListener(TOUCH);
    }
    return localView;
  }
  
  protected void setupActionBar()
  {
    ActionBar localActionBar = getActionBar();
    if (localActionBar == null) {
      return;
    }
    localActionBar.setDisplayShowTitleEnabled(true);
    localActionBar.setNavigationMode(0);
    localActionBar.setDisplayUseLogoEnabled(true);
    localActionBar.setLogo(2130837568);
    localActionBar.setBackgroundDrawable(getResources().getDrawable(2130837504));
    localActionBar.setDisplayHomeAsUpEnabled(true);
    localActionBar.setHomeButtonEnabled(true);
    localActionBar.setTitle(2131099674);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\realestate\custom\CustomActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */