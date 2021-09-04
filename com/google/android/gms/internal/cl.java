package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class cl
  extends cg
{
  private final String hM;
  private final String hN;
  private final Context mContext;
  
  public cl(Context paramContext, String paramString1, String paramString2)
  {
    this.mContext = paramContext;
    this.hM = paramString1;
    this.hN = paramString2;
  }
  
  public void ac()
  {
    try
    {
      cn.p("Pinging URL: " + this.hN);
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(this.hN).openConnection();
      try
      {
        ci.a(this.mContext, this.hM, true, localHttpURLConnection);
        int i = localHttpURLConnection.getResponseCode();
        if ((i < 200) || (i >= 300)) {
          cn.q("Received non-success response code " + i + " from pinging URL: " + this.hN);
        }
        return;
      }
      finally
      {
        localHttpURLConnection.disconnect();
      }
      return;
    }
    catch (IOException localIOException)
    {
      cn.q("Error while pinging URL: " + this.hN + ". " + localIOException.getMessage());
    }
  }
  
  public void onStop() {}
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */