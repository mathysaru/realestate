package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;

public class fo
{
  private String it;
  private String[] rA;
  private String rB;
  private String rC;
  private String rD;
  private String rE;
  private ArrayList<String> rF = new ArrayList();
  private String[] rG;
  
  public fo(Context paramContext)
  {
    this.rC = paramContext.getPackageName();
    this.rB = paramContext.getPackageName();
    this.rF.add("https://www.googleapis.com/auth/plus.login");
  }
  
  public fo Z(String paramString)
  {
    this.it = paramString;
    return this;
  }
  
  public fo d(String... paramVarArgs)
  {
    this.rF.clear();
    this.rF.addAll(Arrays.asList(paramVarArgs));
    return this;
  }
  
  public fo dg()
  {
    this.rF.clear();
    return this;
  }
  
  public fn dh()
  {
    if (this.it == null) {
      this.it = "<<default account>>";
    }
    String[] arrayOfString = (String[])this.rF.toArray(new String[this.rF.size()]);
    return new fn(this.it, arrayOfString, this.rG, this.rA, this.rB, this.rC, this.rD, this.rE);
  }
  
  public fo e(String... paramVarArgs)
  {
    this.rG = paramVarArgs;
    return this;
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\fo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */