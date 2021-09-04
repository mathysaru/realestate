package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ao
{
  public final String eP;
  public final List<String> eQ;
  public final String eR;
  public final String eS;
  public final List<String> eT;
  
  public ao(JSONObject paramJSONObject)
    throws JSONException
  {
    this.eP = paramJSONObject.getString("id");
    JSONArray localJSONArray = paramJSONObject.getJSONArray("adapters");
    ArrayList localArrayList = new ArrayList(localJSONArray.length());
    int i = 0;
    while (i < localJSONArray.length())
    {
      localArrayList.add(localJSONArray.getString(i));
      i += 1;
    }
    this.eQ = Collections.unmodifiableList(localArrayList);
    this.eR = paramJSONObject.optString("allocation_id", null);
    this.eT = au.a(paramJSONObject, "imp_urls");
    paramJSONObject = paramJSONObject.optJSONObject("data");
    if (paramJSONObject != null) {}
    for (paramJSONObject = paramJSONObject.toString();; paramJSONObject = null)
    {
      this.eS = paramJSONObject;
      return;
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */