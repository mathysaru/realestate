package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

public final class ah
{
  public static final ai eA = new ai()
  {
    public void a(cq paramAnonymouscq, Map<String, String> paramAnonymousMap)
    {
      str = (String)paramAnonymousMap.get("u");
      if (str == null)
      {
        cn.q("URL missing from click GMSG.");
        return;
      }
      paramAnonymousMap = Uri.parse(str);
      try
      {
        Object localObject = paramAnonymouscq.ax();
        if ((localObject == null) || (!((h)localObject).a(paramAnonymousMap))) {
          break label111;
        }
        localObject = ((h)localObject).a(paramAnonymousMap, paramAnonymouscq.getContext());
        paramAnonymousMap = (Map<String, String>)localObject;
      }
      catch (i locali)
      {
        for (;;)
        {
          cn.q("Unable to append parameter to URL: " + str);
        }
      }
      paramAnonymousMap = paramAnonymousMap.toString();
      new cl(paramAnonymouscq.getContext(), paramAnonymouscq.ay().hP, paramAnonymousMap).start();
    }
  };
  public static final ai eB = new ai()
  {
    public void a(cq paramAnonymouscq, Map<String, String> paramAnonymousMap)
    {
      paramAnonymouscq = paramAnonymouscq.au();
      if (paramAnonymouscq == null)
      {
        cn.q("A GMSG tried to close something that wasn't an overlay.");
        return;
      }
      paramAnonymouscq.close();
    }
  };
  public static final ai eC = new ai()
  {
    public void a(cq paramAnonymouscq, Map<String, String> paramAnonymousMap)
    {
      paramAnonymouscq = paramAnonymouscq.au();
      if (paramAnonymouscq == null)
      {
        cn.q("A GMSG tried to use a custom close button on something that wasn't an overlay.");
        return;
      }
      paramAnonymouscq.d("1".equals(paramAnonymousMap.get("custom_close")));
    }
  };
  public static final ai eD = new ai()
  {
    public void a(cq paramAnonymouscq, Map<String, String> paramAnonymousMap)
    {
      paramAnonymousMap = (String)paramAnonymousMap.get("u");
      if (paramAnonymousMap == null)
      {
        cn.q("URL missing from httpTrack GMSG.");
        return;
      }
      new cl(paramAnonymouscq.getContext(), paramAnonymouscq.ay().hP, paramAnonymousMap).start();
    }
  };
  public static final ai eE = new ai()
  {
    public void a(cq paramAnonymouscq, Map<String, String> paramAnonymousMap)
    {
      cn.o("Received log message: " + (String)paramAnonymousMap.get("string"));
    }
  };
  public static final ai eF = new aj();
  public static final ai eG = new ai()
  {
    public void a(cq paramAnonymouscq, Map<String, String> paramAnonymousMap)
    {
      String str1 = (String)paramAnonymousMap.get("tx");
      String str2 = (String)paramAnonymousMap.get("ty");
      paramAnonymousMap = (String)paramAnonymousMap.get("td");
      try
      {
        int i = Integer.parseInt(str1);
        int j = Integer.parseInt(str2);
        int k = Integer.parseInt(paramAnonymousMap);
        paramAnonymouscq = paramAnonymouscq.ax();
        if (paramAnonymouscq != null) {
          paramAnonymouscq.g().a(i, j, k);
        }
        return;
      }
      catch (NumberFormatException paramAnonymouscq)
      {
        cn.q("Could not parse touch parameters from gmsg.");
      }
    }
  };
  public static final ai eH = new ak();
  public static final ai ez = new ai()
  {
    public void a(cq paramAnonymouscq, Map<String, String> paramAnonymousMap)
    {
      paramAnonymousMap = (String)paramAnonymousMap.get("urls");
      if (paramAnonymousMap == null)
      {
        cn.q("URLs missing in canOpenURLs GMSG.");
        return;
      }
      String[] arrayOfString = paramAnonymousMap.split(",");
      HashMap localHashMap = new HashMap();
      PackageManager localPackageManager = paramAnonymouscq.getContext().getPackageManager();
      int j = arrayOfString.length;
      int i = 0;
      if (i < j)
      {
        String str1 = arrayOfString[i];
        paramAnonymousMap = str1.split(";", 2);
        String str2 = paramAnonymousMap[0].trim();
        if (paramAnonymousMap.length > 1)
        {
          paramAnonymousMap = paramAnonymousMap[1].trim();
          label97:
          if (localPackageManager.resolveActivity(new Intent(paramAnonymousMap, Uri.parse(str2)), 65536) == null) {
            break label149;
          }
        }
        label149:
        for (boolean bool = true;; bool = false)
        {
          localHashMap.put(str1, Boolean.valueOf(bool));
          i += 1;
          break;
          paramAnonymousMap = "android.intent.action.VIEW";
          break label97;
        }
      }
      paramAnonymouscq.a("openableURLs", localHashMap);
    }
  };
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */