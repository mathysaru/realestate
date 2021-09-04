package com.google.android.gms.appstate;

import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;

public final class a
  implements AppState
{
  private final int iu;
  private final String iv;
  private final byte[] iw;
  private final boolean ix;
  private final String iy;
  private final byte[] iz;
  
  public a(AppState paramAppState)
  {
    this.iu = paramAppState.getKey();
    this.iv = paramAppState.getLocalVersion();
    this.iw = paramAppState.getLocalData();
    this.ix = paramAppState.hasConflict();
    this.iy = paramAppState.getConflictVersion();
    this.iz = paramAppState.getConflictData();
  }
  
  static int a(AppState paramAppState)
  {
    return dl.hashCode(new Object[] { Integer.valueOf(paramAppState.getKey()), paramAppState.getLocalVersion(), paramAppState.getLocalData(), Boolean.valueOf(paramAppState.hasConflict()), paramAppState.getConflictVersion(), paramAppState.getConflictData() });
  }
  
  static boolean a(AppState paramAppState, Object paramObject)
  {
    boolean bool2 = true;
    boolean bool1;
    if (!(paramObject instanceof AppState)) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramAppState == paramObject);
      paramObject = (AppState)paramObject;
      if ((!dl.equal(Integer.valueOf(((AppState)paramObject).getKey()), Integer.valueOf(paramAppState.getKey()))) || (!dl.equal(((AppState)paramObject).getLocalVersion(), paramAppState.getLocalVersion())) || (!dl.equal(((AppState)paramObject).getLocalData(), paramAppState.getLocalData())) || (!dl.equal(Boolean.valueOf(((AppState)paramObject).hasConflict()), Boolean.valueOf(paramAppState.hasConflict()))) || (!dl.equal(((AppState)paramObject).getConflictVersion(), paramAppState.getConflictVersion()))) {
        break;
      }
      bool1 = bool2;
    } while (dl.equal(((AppState)paramObject).getConflictData(), paramAppState.getConflictData()));
    return false;
  }
  
  static String b(AppState paramAppState)
  {
    return dl.d(paramAppState).a("Key", Integer.valueOf(paramAppState.getKey())).a("LocalVersion", paramAppState.getLocalVersion()).a("LocalData", paramAppState.getLocalData()).a("HasConflict", Boolean.valueOf(paramAppState.hasConflict())).a("ConflictVersion", paramAppState.getConflictVersion()).a("ConflictData", paramAppState.getConflictData()).toString();
  }
  
  public AppState aE()
  {
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public byte[] getConflictData()
  {
    return this.iz;
  }
  
  public String getConflictVersion()
  {
    return this.iy;
  }
  
  public int getKey()
  {
    return this.iu;
  }
  
  public byte[] getLocalData()
  {
    return this.iw;
  }
  
  public String getLocalVersion()
  {
    return this.iv;
  }
  
  public boolean hasConflict()
  {
    return this.ix;
  }
  
  public int hashCode()
  {
    return a(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return b(this);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\appstate\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */