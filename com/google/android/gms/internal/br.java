package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

public final class br
{
  public static cg a(Context paramContext, bu parambu, a parama)
  {
    if (parambu.eg.hS) {
      return b(paramContext, parambu, parama);
    }
    return c(paramContext, parambu, parama);
  }
  
  private static cg b(Context paramContext, bu parambu, a parama)
  {
    cn.m("Fetching ad response from local ad request service.");
    paramContext = new bs.a(paramContext, parambu, parama);
    paramContext.start();
    return paramContext;
  }
  
  private static cg c(Context paramContext, bu parambu, a parama)
  {
    cn.m("Fetching ad response from remote ad request service.");
    if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramContext) != 0)
    {
      cn.q("Failed to connect to remote ad request service.");
      return null;
    }
    return new bs.b(paramContext, parambu, parama);
  }
  
  public static abstract interface a
  {
    public abstract void a(bw parambw);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */