package com.google.android.gms.internal;

import java.util.Map;

public final class aj
  implements ai
{
  private static boolean a(Map<String, String> paramMap)
  {
    return "1".equals(paramMap.get("custom_close"));
  }
  
  private static int b(Map<String, String> paramMap)
  {
    paramMap = (String)paramMap.get("o");
    if (paramMap != null)
    {
      if ("p".equalsIgnoreCase(paramMap)) {
        return ci.ao();
      }
      if ("l".equalsIgnoreCase(paramMap)) {
        return ci.an();
      }
    }
    return -1;
  }
  
  public void a(cq paramcq, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("a");
    if (str == null)
    {
      cn.q("Action missing from an open GMSG.");
      return;
    }
    cr localcr = paramcq.aw();
    if ("expand".equalsIgnoreCase(str))
    {
      if (paramcq.az())
      {
        cn.q("Cannot expand WebView that is already expanded.");
        return;
      }
      localcr.a(a(paramMap), b(paramMap));
      return;
    }
    if ("webapp".equalsIgnoreCase(str))
    {
      paramcq = (String)paramMap.get("u");
      if (paramcq != null)
      {
        localcr.a(a(paramMap), b(paramMap), paramcq);
        return;
      }
      localcr.a(a(paramMap), b(paramMap), (String)paramMap.get("html"), (String)paramMap.get("baseurl"));
      return;
    }
    localcr.a(new be((String)paramMap.get("i"), (String)paramMap.get("u"), (String)paramMap.get("m"), (String)paramMap.get("p"), (String)paramMap.get("c"), (String)paramMap.get("f"), (String)paramMap.get("e")));
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */