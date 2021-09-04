package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ap
{
  public final List<ao> eU;
  public final long eV;
  public final List<String> eW;
  public final List<String> eX;
  public final List<String> eY;
  public final String eZ;
  public final long fa;
  
  public ap(String paramString)
    throws JSONException
  {
    paramString = new JSONObject(paramString);
    if (cn.k(2)) {
      cn.p("Mediation Response JSON: " + paramString.toString(2));
    }
    JSONArray localJSONArray = paramString.getJSONArray("ad_networks");
    ArrayList localArrayList = new ArrayList(localJSONArray.length());
    int i = 0;
    while (i < localJSONArray.length())
    {
      localArrayList.add(new ao(localJSONArray.getJSONObject(i)));
      i += 1;
    }
    this.eU = Collections.unmodifiableList(localArrayList);
    this.eZ = paramString.getString("qdata");
    paramString = paramString.optJSONObject("settings");
    if (paramString != null)
    {
      this.eV = paramString.optLong("ad_network_timeout_millis", -1L);
      this.eW = au.a(paramString, "click_urls");
      this.eX = au.a(paramString, "imp_urls");
      this.eY = au.a(paramString, "nofill_urls");
      long l = paramString.optLong("refresh", -1L);
      if (l > 0L) {}
      for (l = 1000L * l;; l = -1L)
      {
        this.fa = l;
        return;
      }
    }
    this.eV = -1L;
    this.eW = null;
    this.eX = null;
    this.eY = null;
    this.fa = -1L;
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */