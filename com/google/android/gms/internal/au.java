package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class au
{
  public static List<String> a(JSONObject paramJSONObject, String paramString)
    throws JSONException
  {
    paramJSONObject = paramJSONObject.optJSONArray(paramString);
    if (paramJSONObject != null)
    {
      paramString = new ArrayList(paramJSONObject.length());
      int i = 0;
      while (i < paramJSONObject.length())
      {
        paramString.add(paramJSONObject.getString(i));
        i += 1;
      }
      return Collections.unmodifiableList(paramString);
    }
    return null;
  }
  
  public static void a(Context paramContext, String paramString1, ce paramce, String paramString2, boolean paramBoolean, List<String> paramList)
  {
    if (paramBoolean) {}
    for (String str1 = "1";; str1 = "0")
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str2 = ((String)localIterator.next()).replaceAll("@gw_adlocid@", paramString2).replaceAll("@gw_adnetrefresh@", str1).replaceAll("@gw_qdata@", paramce.hA.eZ).replaceAll("@gw_sdkver@", paramString1).replaceAll("@gw_sessid@", cf.hB).replaceAll("@gw_seqnum@", paramce.gE);
        paramList = str2;
        if (paramce.fm != null) {
          paramList = str2.replaceAll("@gw_adnetid@", paramce.fm.eP).replaceAll("@gw_allocid@", paramce.fm.eR);
        }
        new cl(paramContext, paramString1, paramList).start();
      }
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */