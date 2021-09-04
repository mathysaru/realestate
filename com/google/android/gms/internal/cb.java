package com.google.android.gms.internal;

import java.util.Map;

public final class cb
{
  private final Object eJ = new Object();
  private cq fG;
  private String gT;
  public final ai gU = new ai()
  {
    public void a(cq arg1, Map<String, String> paramAnonymousMap)
    {
      synchronized (cb.a(cb.this))
      {
        String str = (String)paramAnonymousMap.get("type");
        paramAnonymousMap = (String)paramAnonymousMap.get("errors");
        cn.q("Invalid " + str + " request error: " + paramAnonymousMap);
        cb.a(cb.this, 1);
        cb.a(cb.this).notify();
        return;
      }
    }
  };
  public final ai gV = new ai()
  {
    public void a(cq arg1, Map<String, String> paramAnonymousMap)
    {
      synchronized (cb.a(cb.this))
      {
        paramAnonymousMap = (String)paramAnonymousMap.get("url");
        if (paramAnonymousMap == null)
        {
          cn.q("URL missing in loadAdUrl GMSG.");
          return;
        }
        cb.a(cb.this, paramAnonymousMap);
        cb.a(cb.this).notify();
        return;
      }
    }
  };
  private int gw = -2;
  
  public String aj()
  {
    synchronized (this.eJ)
    {
      while (this.gT == null)
      {
        int i = this.gw;
        if (i == -2) {
          try
          {
            this.eJ.wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            cn.q("Ad request service was interrupted.");
            return null;
          }
        }
      }
      String str = this.gT;
      return str;
    }
  }
  
  public void b(cq paramcq)
  {
    synchronized (this.eJ)
    {
      this.fG = paramcq;
      return;
    }
  }
  
  public int getErrorCode()
  {
    synchronized (this.eJ)
    {
      int i = this.gw;
      return i;
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */