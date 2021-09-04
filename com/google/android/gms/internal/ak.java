package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Map;

public final class ak
  implements ai
{
  private static int a(DisplayMetrics paramDisplayMetrics, Map<String, String> paramMap, String paramString, int paramInt)
  {
    paramMap = (String)paramMap.get(paramString);
    int i = paramInt;
    if (paramMap != null) {}
    try
    {
      i = cm.a(paramDisplayMetrics, Integer.parseInt(paramMap));
      return i;
    }
    catch (NumberFormatException paramDisplayMetrics)
    {
      cn.q("Could not parse " + paramString + " in a video GMSG: " + paramMap);
    }
    return paramInt;
  }
  
  public void a(cq paramcq, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("action");
    if (str == null)
    {
      cn.q("Action missing from video GMSG.");
      return;
    }
    Object localObject = paramcq.au();
    if (localObject == null)
    {
      cn.q("Could not get ad overlay for a video GMSG.");
      return;
    }
    boolean bool1 = "new".equalsIgnoreCase(str);
    boolean bool2 = "position".equalsIgnoreCase(str);
    int i;
    int j;
    if ((bool1) || (bool2))
    {
      paramcq = paramcq.getContext().getResources().getDisplayMetrics();
      i = a(paramcq, paramMap, "x", 0);
      j = a(paramcq, paramMap, "y", 0);
      int k = a(paramcq, paramMap, "w", -1);
      int m = a(paramcq, paramMap, "h", -1);
      if ((bool1) && (((bf)localObject).Q() == null))
      {
        ((bf)localObject).c(i, j, k, m);
        return;
      }
      ((bf)localObject).b(i, j, k, m);
      return;
    }
    localObject = ((bf)localObject).Q();
    if (localObject == null)
    {
      bj.a(paramcq, "no_video_view", null);
      return;
    }
    if ("click".equalsIgnoreCase(str))
    {
      paramcq = paramcq.getContext().getResources().getDisplayMetrics();
      i = a(paramcq, paramMap, "x", 0);
      j = a(paramcq, paramMap, "y", 0);
      long l = SystemClock.uptimeMillis();
      paramcq = MotionEvent.obtain(l, l, 0, i, j, 0);
      ((bj)localObject).b(paramcq);
      paramcq.recycle();
      return;
    }
    if ("controls".equalsIgnoreCase(str))
    {
      paramcq = (String)paramMap.get("enabled");
      if (paramcq == null)
      {
        cn.q("Enabled parameter missing from controls video GMSG.");
        return;
      }
      ((bj)localObject).f(Boolean.parseBoolean(paramcq));
      return;
    }
    if ("currentTime".equalsIgnoreCase(str))
    {
      paramcq = (String)paramMap.get("time");
      if (paramcq == null)
      {
        cn.q("Time parameter missing from currentTime video GMSG.");
        return;
      }
      try
      {
        ((bj)localObject).seekTo((int)(Float.parseFloat(paramcq) * 1000.0F));
        return;
      }
      catch (NumberFormatException paramMap)
      {
        cn.q("Could not parse time parameter from currentTime video GMSG: " + paramcq);
        return;
      }
    }
    if ("hide".equalsIgnoreCase(str))
    {
      ((bj)localObject).setVisibility(4);
      return;
    }
    if ("load".equalsIgnoreCase(str))
    {
      ((bj)localObject).Z();
      return;
    }
    if ("pause".equalsIgnoreCase(str))
    {
      ((bj)localObject).pause();
      return;
    }
    if ("play".equalsIgnoreCase(str))
    {
      ((bj)localObject).play();
      return;
    }
    if ("show".equalsIgnoreCase(str))
    {
      ((bj)localObject).setVisibility(0);
      return;
    }
    if ("src".equalsIgnoreCase(str))
    {
      ((bj)localObject).i((String)paramMap.get("src"));
      return;
    }
    cn.q("Unknown video action: " + str);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */