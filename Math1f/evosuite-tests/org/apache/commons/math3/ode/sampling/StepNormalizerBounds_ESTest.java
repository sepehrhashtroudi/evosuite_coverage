/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 22:18:37 GMT 2022
 */

package org.apache.commons.math3.ode.sampling;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.ode.sampling.StepNormalizerBounds;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StepNormalizerBounds_ESTest extends StepNormalizerBounds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StepNormalizerBounds[] stepNormalizerBoundsArray0 = StepNormalizerBounds.values();
      assertEquals(4, stepNormalizerBoundsArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.valueOf("FIRST");
      assertEquals(StepNormalizerBounds.FIRST, stepNormalizerBounds0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.valueOf("LAST");
      assertFalse(stepNormalizerBounds0.firstIncluded());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.FIRST;
      boolean boolean0 = stepNormalizerBounds0.lastIncluded();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.NEITHER;
      boolean boolean0 = stepNormalizerBounds0.firstIncluded();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.BOTH;
      boolean boolean0 = stepNormalizerBounds0.lastIncluded();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.BOTH;
      boolean boolean0 = stepNormalizerBounds0.firstIncluded();
      assertTrue(boolean0);
  }
}
