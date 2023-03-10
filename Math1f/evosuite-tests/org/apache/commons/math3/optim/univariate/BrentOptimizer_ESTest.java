/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:07:41 GMT 2022
 */

package org.apache.commons.math3.optim.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.univariate.BrentOptimizer;
import org.apache.commons.math3.optim.univariate.UnivariatePointValuePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BrentOptimizer_ESTest extends BrentOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(1.0, 1.0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[8];
      MaxEval maxEval0 = MaxEval.unlimited();
      optimizationDataArray0[3] = (OptimizationData) maxEval0;
      brentOptimizer0.parseOptimizationData(optimizationDataArray0);
      // Undeclared exception!
      try { 
        brentOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.univariate.UnivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConvergenceChecker<UnivariatePointValuePair> convergenceChecker0 = (ConvergenceChecker<UnivariatePointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(5.0, 0.5039018405998233, convergenceChecker0);
      ConvergenceChecker<UnivariatePointValuePair> convergenceChecker1 = brentOptimizer0.getConvergenceChecker();
      BrentOptimizer brentOptimizer1 = null;
      try {
        brentOptimizer1 = new BrentOptimizer(5.0, 0.0, convergenceChecker1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.univariate.BrentOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer(0.0, 0.0, (ConvergenceChecker<UnivariatePointValuePair>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.univariate.BrentOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer(5112.53172909198, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.univariate.BrentOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(0.5725290959264155, 0.5725290959264155);
      // Undeclared exception!
      try { 
        brentOptimizer0.doOptimize();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer((-2440.4696100847236), (-2440.4696100847236));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,440.47 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.univariate.BrentOptimizer", e);
      }
  }
}
