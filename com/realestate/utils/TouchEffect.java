package com.realestate.utils;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class TouchEffect
  implements View.OnTouchListener
{
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      paramMotionEvent = paramView.getBackground();
      paramMotionEvent.mutate();
      paramMotionEvent.setAlpha(150);
      paramView.setBackgroundDrawable(paramMotionEvent);
    }
    for (;;)
    {
      return false;
      if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
      {
        paramMotionEvent = paramView.getBackground();
        paramMotionEvent.setAlpha(255);
        paramView.setBackgroundDrawable(paramMotionEvent);
      }
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\realestate\utils\TouchEffect.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */