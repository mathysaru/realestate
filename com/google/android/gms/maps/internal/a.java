package com.google.android.gms.maps.internal;

public final class a
{
  public static Boolean a(byte paramByte)
  {
    switch (paramByte)
    {
    default: 
      return null;
    case 1: 
      return Boolean.TRUE;
    }
    return Boolean.FALSE;
  }
  
  public static byte b(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      if (paramBoolean.booleanValue()) {
        return 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\internal\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */