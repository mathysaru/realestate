package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class ch
{
  private static final ThreadFactory hF = new ThreadFactory()
  {
    private final AtomicInteger hI = new AtomicInteger(1);
    
    public Thread newThread(Runnable paramAnonymousRunnable)
    {
      return new Thread(paramAnonymousRunnable, "AdWorker #" + this.hI.getAndIncrement());
    }
  };
  private static final ThreadPoolExecutor hG = new ThreadPoolExecutor(0, 10, 65L, TimeUnit.SECONDS, new SynchronousQueue(true), hF);
  
  public static void execute(Runnable paramRunnable)
  {
    try
    {
      hG.execute(new Runnable()
      {
        public void run()
        {
          Process.setThreadPriority(10);
          this.hH.run();
        }
      });
      return;
    }
    catch (RejectedExecutionException paramRunnable)
    {
      cn.b("Too many background threads already running. Aborting task.", paramRunnable);
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */