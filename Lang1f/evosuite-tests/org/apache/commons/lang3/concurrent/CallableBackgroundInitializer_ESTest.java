/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 20:26:17 GMT 2022
 */

package org.apache.commons.lang3.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.concurrent.CallableBackgroundInitializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class CallableBackgroundInitializer_ESTest extends CallableBackgroundInitializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Callable<Delayed> callable0 = (Callable<Delayed>) mock(Callable.class, new ViolatedAssumptionAnswer());
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      forkJoinPool0.isShutdown();
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      forkJoinPool0.getParallelism();
      MockThread mockThread0 = new MockThread();
      MockThread mockThread1 = new MockThread(mockThread0);
      MockThread mockThread2 = new MockThread(threadGroup0, mockThread1);
      MockThread mockThread3 = new MockThread(mockThread2, "");
      forkJoinPool0.submit((Runnable) mockThread3);
      CallableBackgroundInitializer<Delayed> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Delayed>(callable0, forkJoinPool0);
      Callable<Callable<Integer>> callable1 = (Callable<Callable<Integer>>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable1).call();
      CallableBackgroundInitializer<Callable<Integer>> callableBackgroundInitializer1 = new CallableBackgroundInitializer<Callable<Integer>>(callable1, forkJoinPool0);
      callableBackgroundInitializer1.initialize();
      CallableBackgroundInitializer<Object> callableBackgroundInitializer2 = null;
      try {
        callableBackgroundInitializer2 = new CallableBackgroundInitializer<Object>((Callable<Object>) null, forkJoinPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Callable must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.CallableBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Callable<Runnable> callable0 = (Callable<Runnable>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<Runnable> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Runnable>(callable0);
      Callable<Object> callable1 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable1).call();
      CallableBackgroundInitializer<Object> callableBackgroundInitializer1 = new CallableBackgroundInitializer<Object>(callable1);
      callableBackgroundInitializer1.initialize();
      Callable<String> callable2 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable2).call();
      CallableBackgroundInitializer<String> callableBackgroundInitializer2 = new CallableBackgroundInitializer<String>(callable2);
      callableBackgroundInitializer2.initialize();
      CallableBackgroundInitializer<Delayed> callableBackgroundInitializer3 = null;
      try {
        callableBackgroundInitializer3 = new CallableBackgroundInitializer<Delayed>((Callable<Delayed>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Callable must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.CallableBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Callable<Callable<Callable<Integer>>> callable0 = (Callable<Callable<Callable<Integer>>>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      Thread thread0 = MockThread.currentThread();
      forkJoinPool0.execute((Runnable) thread0);
      CallableBackgroundInitializer<Callable<Callable<Integer>>> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Callable<Callable<Integer>>>(callable0, forkJoinPool0);
      callableBackgroundInitializer0.setExternalExecutor(forkJoinPool0);
      callableBackgroundInitializer0.initialize();
      Callable<ForkJoinTask<String>> callable1 = (Callable<ForkJoinTask<String>>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable1).call();
      CallableBackgroundInitializer<ForkJoinTask<String>> callableBackgroundInitializer1 = new CallableBackgroundInitializer<ForkJoinTask<String>>(callable1);
      callableBackgroundInitializer1.initialize();
      Callable<Object> callable2 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable2).call();
      CallableBackgroundInitializer<Object> callableBackgroundInitializer2 = new CallableBackgroundInitializer<Object>(callable2);
      callableBackgroundInitializer2.initialize();
      Callable<Delayed> callable3 = (Callable<Delayed>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable3).call();
      CallableBackgroundInitializer<Delayed> callableBackgroundInitializer3 = new CallableBackgroundInitializer<Delayed>(callable3);
      callableBackgroundInitializer3.initialize();
      Callable<Integer> callable4 = (Callable<Integer>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable4).call();
      CallableBackgroundInitializer<Integer> callableBackgroundInitializer4 = new CallableBackgroundInitializer<Integer>(callable4, forkJoinPool0);
      callableBackgroundInitializer4.initialize();
      CallableBackgroundInitializer<Callable<Integer>> callableBackgroundInitializer5 = null;
      try {
        callableBackgroundInitializer5 = new CallableBackgroundInitializer<Callable<Integer>>((Callable<Callable<Integer>>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Callable must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.CallableBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Callable<String> callable0 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      LinkedBlockingDeque<Runnable> linkedBlockingDeque0 = new LinkedBlockingDeque<Runnable>();
      ThreadPoolExecutor.CallerRunsPolicy threadPoolExecutor_CallerRunsPolicy0 = new ThreadPoolExecutor.CallerRunsPolicy();
      ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(1835, 1835, 1835, timeUnit0, linkedBlockingDeque0, threadPoolExecutor_CallerRunsPolicy0);
      CallableBackgroundInitializer<Object> callableBackgroundInitializer0 = null;
      try {
        callableBackgroundInitializer0 = new CallableBackgroundInitializer<Object>((Callable<Object>) null, threadPoolExecutor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Callable must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.CallableBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Callable<Delayed> callable0 = (Callable<Delayed>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(callable0).call();
      ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinPool_ForkJoinWorkerThreadFactory0 = ForkJoinPool.defaultForkJoinWorkerThreadFactory;
      MockThread mockThread0 = new MockThread((Runnable) null, "92\"Z :Nl#hE)R");
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = mockThread0.getUncaughtExceptionHandler();
      MockThread.setDefaultUncaughtExceptionHandler(thread_UncaughtExceptionHandler0);
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(1748, forkJoinPool_ForkJoinWorkerThreadFactory0, thread_UncaughtExceptionHandler0, false);
      CallableBackgroundInitializer<Delayed> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Delayed>(callable0, forkJoinPool0);
      Callable<Object> callable1 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null).when(callable1).call();
      CallableBackgroundInitializer<Object> callableBackgroundInitializer1 = new CallableBackgroundInitializer<Object>(callable1);
      callableBackgroundInitializer1.initialize();
      Callable<Integer> callable2 = (Callable<Integer>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable2).call();
      CallableBackgroundInitializer<Integer> callableBackgroundInitializer2 = new CallableBackgroundInitializer<Integer>(callable2);
      callableBackgroundInitializer2.initialize();
      Callable<String> callable3 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(callable3).call();
      CallableBackgroundInitializer<String> callableBackgroundInitializer3 = new CallableBackgroundInitializer<String>(callable3, forkJoinPool0);
      callableBackgroundInitializer3.initialize();
      callableBackgroundInitializer0.initialize();
      callableBackgroundInitializer1.initialize();
      Callable<ForkJoinTask<Runnable>> callable4 = (Callable<ForkJoinTask<Runnable>>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable4).call();
      CallableBackgroundInitializer<ForkJoinTask<Runnable>> callableBackgroundInitializer4 = new CallableBackgroundInitializer<ForkJoinTask<Runnable>>(callable4);
      callableBackgroundInitializer4.initialize();
      callableBackgroundInitializer3.initialize();
      callableBackgroundInitializer1.initialize();
      Delayed delayed0 = callableBackgroundInitializer0.initialize();
      assertNull(delayed0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Callable<Delayed> callable0 = (Callable<Delayed>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<Object> callableBackgroundInitializer0 = null;
      try {
        callableBackgroundInitializer0 = new CallableBackgroundInitializer<Object>((Callable<Object>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Callable must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.CallableBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Callable<String> callable0 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      CallableBackgroundInitializer<String> callableBackgroundInitializer0 = new CallableBackgroundInitializer<String>(callable0);
      callableBackgroundInitializer0.initialize();
      Callable<Delayed> callable1 = (Callable<Delayed>) mock(Callable.class, new ViolatedAssumptionAnswer());
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      LinkedTransferQueue<Runnable> linkedTransferQueue0 = new LinkedTransferQueue<Runnable>();
      ThreadPoolExecutor threadPoolExecutor0 = null;
      try {
        threadPoolExecutor0 = new ThreadPoolExecutor(0, 0, 0, timeUnit0, linkedTransferQueue0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Callable<Object> callable0 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<Object> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Object>(callable0, (ExecutorService) null);
      assertFalse(callableBackgroundInitializer0.isStarted());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Callable<String> callable0 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor.DiscardPolicy threadPoolExecutor_DiscardPolicy0 = new ThreadPoolExecutor.DiscardPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = null;
      try {
        scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor((-1), threadPoolExecutor_DiscardPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }
}
