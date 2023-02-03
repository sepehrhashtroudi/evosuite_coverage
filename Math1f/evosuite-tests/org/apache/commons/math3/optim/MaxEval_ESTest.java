/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:09:06 GMT 2022
 */

package org.apache.commons.math3.optim;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optim.MaxEval;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MaxEval_ESTest extends MaxEval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MaxEval maxEval0 = new MaxEval(2044);
      assertEquals(2044, maxEval0.getMaxEval());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MaxEval maxEval0 = null;
      try {
        maxEval0 = new MaxEval((-36));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -36 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.MaxEval", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MaxEval maxEval0 = MaxEval.unlimited();
      int int0 = maxEval0.getMaxEval();
      assertEquals(Integer.MAX_VALUE, int0);
  }
}