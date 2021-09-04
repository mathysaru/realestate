package com.google.android.gms.internal;

public class gk
{
  private final byte[] uu = new byte['Ā'];
  private int uv;
  private int uw;
  
  public gk(byte[] paramArrayOfByte)
  {
    int j = 0;
    while (j < 256)
    {
      this.uu[j] = ((byte)j);
      j += 1;
    }
    int k = 0;
    j = 0;
    while (j < 256)
    {
      k = k + this.uu[j] + paramArrayOfByte[(j % paramArrayOfByte.length)] & 0xFF;
      int i = this.uu[j];
      this.uu[j] = this.uu[k];
      this.uu[k] = i;
      j += 1;
    }
    this.uv = 0;
    this.uw = 0;
  }
  
  public void f(byte[] paramArrayOfByte)
  {
    int m = this.uv;
    int k = this.uw;
    int j = 0;
    while (j < paramArrayOfByte.length)
    {
      m = m + 1 & 0xFF;
      k = k + this.uu[m] & 0xFF;
      int i = this.uu[m];
      this.uu[m] = this.uu[k];
      this.uu[k] = i;
      paramArrayOfByte[j] = ((byte)(paramArrayOfByte[j] ^ this.uu[(this.uu[m] + this.uu[k] & 0xFF)]));
      j += 1;
    }
    this.uv = m;
    this.uw = k;
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\gk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */