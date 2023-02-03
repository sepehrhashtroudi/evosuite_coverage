/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 20:19:57 GMT 2022
 */

package org.apache.commons.lang3.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.concurrent.TimedSemaphore;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TimedSemaphore_ESTest extends TimedSemaphore_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      TimedSemaphore timedSemaphore0 = new TimedSemaphore((ScheduledExecutorService) null, 771L, timeUnit0, 1);
      timedSemaphore0.startTimer();
      timedSemaphore0.setLimit(1);
      timedSemaphore0.getAcquireCount();
      timedSemaphore0.getUnit();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      TimedSemaphore timedSemaphore0 = new TimedSemaphore(1805L, timeUnit0, 0);
      timedSemaphore0.acquire();
      timedSemaphore0.startTimer();
      timedSemaphore0.getPeriod();
      timedSemaphore0.isShutdown();
      timedSemaphore0.startTimer();
      timedSemaphore0.acquire();
      timedSemaphore0.getAcquireCount();
      timedSemaphore0.startTimer();
      timedSemaphore0.setLimit(2);
      timedSemaphore0.getAverageCallsPerPeriod();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      TimedSemaphore timedSemaphore0 = new TimedSemaphore(1712L, timeUnit0, 3090);
      timedSemaphore0.endOfPeriod();
      timedSemaphore0.shutdown();
      timedSemaphore0.setLimit(2905);
      timedSemaphore0.shutdown();
      timedSemaphore0.endOfPeriod();
      timedSemaphore0.shutdown();
      timedSemaphore0.getExecutorService();
      timedSemaphore0.endOfPeriod();
      timedSemaphore0.getAcquireCount();
      timedSemaphore0.isShutdown();
      timedSemaphore0.setLimit(1);
      timedSemaphore0.getLimit();
      // Undeclared exception!
      try { 
        timedSemaphore0.startTimer();
        fail("Expecting exception: RejectedExecutionException");
      
      } catch(RejectedExecutionException e) {
         //
         // Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@169e9996 rejected from java.util.concurrent.ScheduledThreadPoolExecutor@771f00fe[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor$AbortPolicy", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1655);
      scheduledThreadPoolExecutor0.isShutdown();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      TimedSemaphore timedSemaphore0 = new TimedSemaphore(scheduledThreadPoolExecutor0, 1655, timeUnit0, (-386));
      scheduledThreadPoolExecutor0.getActiveCount();
      timedSemaphore0.endOfPeriod();
      scheduledThreadPoolExecutor0.getTaskCount();
      scheduledThreadPoolExecutor0.prestartCoreThread();
      timedSemaphore0.shutdown();
      timedSemaphore0.setLimit(1655);
      timedSemaphore0.setLimit(1655);
      timedSemaphore0.getAvailablePermits();
      timedSemaphore0.getPeriod();
      timedSemaphore0.getAvailablePermits();
      timedSemaphore0.shutdown();
      timedSemaphore0.getAvailablePermits();
      timedSemaphore0.getAvailablePermits();
      timedSemaphore0.startTimer();
      timedSemaphore0.getLimit();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0);
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      TimedSemaphore timedSemaphore0 = new TimedSemaphore(scheduledThreadPoolExecutor0, 645L, timeUnit0, 0);
      timedSemaphore0.startTimer();
      scheduledThreadPoolExecutor0.allowsCoreThreadTimeOut();
      scheduledThreadPoolExecutor0.getLargestPoolSize();
      timedSemaphore0.shutdown();
      timedSemaphore0.getAcquireCount();
      scheduledThreadPoolExecutor0.shutdown();
      timedSemaphore0.getLimit();
      timedSemaphore0.shutdown();
      timedSemaphore0.getAvailablePermits();
      timedSemaphore0.shutdown();
      timedSemaphore0.getLastAcquiresPerPeriod();
      int int0 = 0;
      MockThread mockThread0 = new MockThread("9!>!u,-[_2V");
      TimeUnit timeUnit1 = TimeUnit.MINUTES;
      // Undeclared exception!
      try { 
        scheduledThreadPoolExecutor0.schedule((Runnable) mockThread0, 0L, timeUnit1);
        fail("Expecting exception: RejectedExecutionException");
      
      } catch(RejectedExecutionException e) {
         //
         // Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@677e7c6a rejected from java.util.concurrent.ScheduledThreadPoolExecutor@2f27dd14[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor$AbortPolicy", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      TimedSemaphore timedSemaphore0 = new TimedSemaphore(2123L, timeUnit0, 2485);
      timedSemaphore0.acquire();
      timedSemaphore0.endOfPeriod();
      timedSemaphore0.acquire();
      timedSemaphore0.shutdown();
      // Undeclared exception!
      try { 
        timedSemaphore0.acquire();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // TimedSemaphore is shut down!
         //
         verifyException("org.apache.commons.lang3.concurrent.TimedSemaphore", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      TimedSemaphore timedSemaphore0 = new TimedSemaphore(1L, timeUnit0, 2344);
      timedSemaphore0.startTimer();
      timedSemaphore0.shutdown();
      // Undeclared exception!
      try { 
        timedSemaphore0.acquire();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // TimedSemaphore is shut down!
         //
         verifyException("org.apache.commons.lang3.concurrent.TimedSemaphore", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      TimedSemaphore timedSemaphore0 = new TimedSemaphore(1579L, timeUnit0, (-864));
      timedSemaphore0.acquire();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      TimedSemaphore timedSemaphore0 = new TimedSemaphore(796L, timeUnit0, 0);
      timedSemaphore0.isShutdown();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(538);
      scheduledThreadPoolExecutor0.isTerminating();
      scheduledThreadPoolExecutor0.getQueue();
      scheduledThreadPoolExecutor0.getPoolSize();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      MockThread mockThread0 = new MockThread(threadGroup0, "");
      MockThread mockThread1 = new MockThread(threadGroup0, mockThread0, "");
      scheduledThreadPoolExecutor0.execute(mockThread1);
      scheduledThreadPoolExecutor0.purge();
      TimedSemaphore timedSemaphore0 = new TimedSemaphore(scheduledThreadPoolExecutor0, 1L, timeUnit0, 538);
      scheduledThreadPoolExecutor0.shutdownNow();
      scheduledThreadPoolExecutor0.prestartCoreThread();
      // Undeclared exception!
      try { 
        timedSemaphore0.startTimer();
        fail("Expecting exception: RejectedExecutionException");
      
      } catch(RejectedExecutionException e) {
         //
         // Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@1922f477 rejected from java.util.concurrent.ScheduledThreadPoolExecutor@5d191fdd[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 1]
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor$AbortPolicy", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(2629);
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      scheduledThreadPoolExecutor0.prestartCoreThread();
      TimedSemaphore timedSemaphore0 = new TimedSemaphore(scheduledThreadPoolExecutor0, 2629, timeUnit0, 2629);
      timedSemaphore0.setLimit((-1958));
      timedSemaphore0.shutdown();
      timedSemaphore0.getLastAcquiresPerPeriod();
      timedSemaphore0.getAcquireCount();
      int int0 = timedSemaphore0.getLastAcquiresPerPeriod();
      assertTrue(timedSemaphore0.isShutdown());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      TimedSemaphore timedSemaphore0 = null;
      try {
        timedSemaphore0 = new TimedSemaphore(0L, timeUnit0, (-329));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Time period must be greater 0!
         //
         verifyException("org.apache.commons.lang3.concurrent.TimedSemaphore", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      int int0 = 0;
      TimedSemaphore timedSemaphore0 = null;
      try {
        timedSemaphore0 = new TimedSemaphore((ScheduledExecutorService) null, 0L, timeUnit0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Time period must be greater 0!
         //
         verifyException("org.apache.commons.lang3.concurrent.TimedSemaphore", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ThreadPoolExecutor.DiscardPolicy threadPoolExecutor_DiscardPolicy0 = new ThreadPoolExecutor.DiscardPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0, threadPoolExecutor_DiscardPolicy0);
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      MockThread mockThread0 = new MockThread();
      mockThread0.getStackTrace();
      MockThread mockThread1 = new MockThread(threadGroup0, mockThread0, "'su5LH+gzZ6fK&]r", 1560L);
      MockThread.getAllStackTraces();
      int int0 = (-1200);
      mockThread1.getContextClassLoader();
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      mockThread1.setContextClassLoader(classLoader0);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor1 = null;
      try {
        scheduledThreadPoolExecutor1 = new ScheduledThreadPoolExecutor((-1200), threadFactory0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = 1;
      ThreadPoolExecutor.CallerRunsPolicy threadPoolExecutor_CallerRunsPolicy0 = new ThreadPoolExecutor.CallerRunsPolicy();
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      MockThread mockThread0 = new MockThread(threadGroup0, "e");
      MockThread mockThread1 = new MockThread(threadGroup0, mockThread0, "e", 1);
      int int1 = 0;
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      PriorityBlockingQueue<Runnable> priorityBlockingQueue0 = new PriorityBlockingQueue<Runnable>();
      ThreadFactory threadFactory0 = null;
      // Undeclared exception!
      try { 
        priorityBlockingQueue0.add(mockThread1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThread cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.concurrent.PriorityBlockingQueue", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      TimedSemaphore timedSemaphore0 = null;
      try {
        timedSemaphore0 = new TimedSemaphore(0L, timeUnit0, (-705));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Time period must be greater 0!
         //
         verifyException("org.apache.commons.lang3.concurrent.TimedSemaphore", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = (-3727);
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = null;
      try {
        scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor((-3727), threadFactory0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      TimedSemaphore timedSemaphore0 = null;
      try {
        timedSemaphore0 = new TimedSemaphore((ScheduledExecutorService) null, 0L, timeUnit0, (-2337));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Time period must be greater 0!
         //
         verifyException("org.apache.commons.lang3.concurrent.TimedSemaphore", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      int int0 = (-241);
      TimedSemaphore timedSemaphore0 = null;
      try {
        timedSemaphore0 = new TimedSemaphore((-2245L), timeUnit0, (-241));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Time period must be greater 0!
         //
         verifyException("org.apache.commons.lang3.concurrent.TimedSemaphore", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = (-2770);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = null;
      try {
        scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor((-2770), (RejectedExecutionHandler) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      TimedSemaphore timedSemaphore0 = new TimedSemaphore(1L, timeUnit0, 424);
      timedSemaphore0.acquire();
      timedSemaphore0.startTimer();
      timedSemaphore0.acquire();
      timedSemaphore0.acquire();
      timedSemaphore0.acquire();
      timedSemaphore0.startTimer();
      timedSemaphore0.acquire();
      timedSemaphore0.startTimer();
      timedSemaphore0.setLimit(424);
      timedSemaphore0.getAverageCallsPerPeriod();
      timedSemaphore0.getExecutorService();
      timedSemaphore0.shutdown();
      timedSemaphore0.endOfPeriod();
      timedSemaphore0.shutdown();
      timedSemaphore0.getAvailablePermits();
      timedSemaphore0.endOfPeriod();
      timedSemaphore0.getAcquireCount();
      timedSemaphore0.endOfPeriod();
      timedSemaphore0.shutdown();
      timedSemaphore0.getUnit();
      timedSemaphore0.setLimit(0);
      timedSemaphore0.setLimit(0);
      timedSemaphore0.shutdown();
      timedSemaphore0.getPeriod();
      timedSemaphore0.shutdown();
      timedSemaphore0.getPeriod();
      timedSemaphore0.getExecutorService();
      timedSemaphore0.getAvailablePermits();
      timedSemaphore0.endOfPeriod();
      timedSemaphore0.setLimit(424);
      assertTrue(timedSemaphore0.isShutdown());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      int int0 = 1;
      TimedSemaphore timedSemaphore0 = null;
      try {
        timedSemaphore0 = new TimedSemaphore(0L, timeUnit0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Time period must be greater 0!
         //
         verifyException("org.apache.commons.lang3.concurrent.TimedSemaphore", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = (-2837);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = null;
      try {
        scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor((-2837));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }
}
