/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 22:03:24 GMT 2022
 */

package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.util.IterationEvent;
import org.apache.commons.math3.util.IterationListener;
import org.apache.commons.math3.util.IterationManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IterationManager_ESTest extends IterationManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Incrementor.MaxCountExceededCallback incrementor_MaxCountExceededCallback0 = mock(Incrementor.MaxCountExceededCallback.class, new ViolatedAssumptionAnswer());
      IterationManager iterationManager0 = new IterationManager(0, incrementor_MaxCountExceededCallback0);
      int int0 = iterationManager0.getMaxIterations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(481);
      int int0 = iterationManager0.getMaxIterations();
      assertEquals(481, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager((-478));
      try { 
        iterationManager0.incrementIterationCount();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-478) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(0);
      IterationEvent iterationEvent0 = new IterationEvent(iterationManager0, 90);
      iterationManager0.addIterationListener((IterationListener) null);
      // Undeclared exception!
      try { 
        iterationManager0.fireTerminationEvent(iterationEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.IterationManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Incrementor.MaxCountExceededCallback incrementor_MaxCountExceededCallback0 = mock(Incrementor.MaxCountExceededCallback.class, new ViolatedAssumptionAnswer());
      IterationManager iterationManager0 = new IterationManager((-1), incrementor_MaxCountExceededCallback0);
      IterationEvent iterationEvent0 = new IterationEvent(iterationManager0, (-1));
      iterationManager0.addIterationListener((IterationListener) null);
      // Undeclared exception!
      try { 
        iterationManager0.fireIterationStartedEvent(iterationEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.IterationManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(481);
      IterationEvent iterationEvent0 = new IterationEvent(iterationManager0, 0);
      iterationManager0.addIterationListener((IterationListener) null);
      // Undeclared exception!
      try { 
        iterationManager0.fireIterationPerformedEvent(iterationEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.IterationManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(0);
      Object object0 = new Object();
      iterationManager0.addIterationListener((IterationListener) null);
      IterationEvent iterationEvent0 = new IterationEvent(object0, 2);
      // Undeclared exception!
      try { 
        iterationManager0.fireInitializationEvent(iterationEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.IterationManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IterationManager iterationManager0 = null;
      try {
        iterationManager0 = new IterationManager(0, (Incrementor.MaxCountExceededCallback) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.Incrementor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager((-478));
      IterationListener iterationListener0 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.addIterationListener(iterationListener0);
      IterationEvent iterationEvent0 = new IterationEvent(iterationManager0, (-478));
      iterationManager0.fireTerminationEvent(iterationEvent0);
      assertEquals((-478), iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(481);
      IterationEvent iterationEvent0 = new IterationEvent(iterationManager0, 0);
      IterationListener iterationListener0 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.addIterationListener(iterationListener0);
      iterationManager0.fireIterationStartedEvent(iterationEvent0);
      assertEquals(481, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(481);
      IterationEvent iterationEvent0 = new IterationEvent(iterationManager0, 0);
      IterationListener iterationListener0 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.addIterationListener(iterationListener0);
      iterationManager0.fireIterationPerformedEvent(iterationEvent0);
      assertEquals(481, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager((-478));
      IterationListener iterationListener0 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.addIterationListener(iterationListener0);
      IterationEvent iterationEvent0 = new IterationEvent(iterationManager0, (-478));
      iterationManager0.fireInitializationEvent(iterationEvent0);
      assertEquals((-478), iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(481);
      iterationManager0.incrementIterationCount();
      iterationManager0.getIterations();
      assertEquals(481, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(481);
      iterationManager0.resetIterationCount();
      assertEquals(481, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(481);
      IterationListener iterationListener0 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.removeIterationListener(iterationListener0);
      assertEquals(481, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager((-478));
      int int0 = iterationManager0.getMaxIterations();
      assertEquals((-478), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Incrementor.MaxCountExceededCallback incrementor_MaxCountExceededCallback0 = mock(Incrementor.MaxCountExceededCallback.class, new ViolatedAssumptionAnswer());
      IterationManager iterationManager0 = new IterationManager((-1), incrementor_MaxCountExceededCallback0);
      iterationManager0.getIterations();
      assertEquals((-1), iterationManager0.getMaxIterations());
  }
}
