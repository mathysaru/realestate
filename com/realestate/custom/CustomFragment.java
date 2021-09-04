package com.realestate.custom;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;

public class CustomFragment
  extends Fragment
  implements View.OnClickListener
{
  public void onClick(View paramView) {}
  
  public View setTouchNClick(View paramView)
  {
    paramView.setOnClickListener(this);
    paramView.setOnTouchListener(CustomActivity.TOUCH);
    return paramView;
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\realestate\custom\CustomFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */