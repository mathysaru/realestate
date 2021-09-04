package com.google.android.gms.internal;

import java.util.Map;

public final class af
  implements ai
{
  private final ag ey;
  
  public af(ag paramag)
  {
    this.ey = paramag;
  }
  
  public void a(cq paramcq, Map<String, String> paramMap)
  {
    paramcq = (String)paramMap.get("name");
    if (paramcq == null)
    {
      cn.q("App event with no name parameter.");
      return;
    }
    this.ey.a(paramcq, (String)paramMap.get("info"));
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */