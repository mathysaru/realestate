package com.google.android.gms.internal;

public abstract class cg
{
  private final Runnable el = new Runnable()
  {
    public final void run()
    {
      cg.a(cg.this, Thread.currentThread());
      cg.this.ac();
    }
  };
  private volatile Thread hD;
  
  public abstract void ac();
  
  public final void cancel()
  {
    onStop();
    if (this.hD != null) {
      this.hD.interrupt();
    }
  }
  
  public abstract void onStop();
  
  public final void start()
  {
    ch.execute(this.el);
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */