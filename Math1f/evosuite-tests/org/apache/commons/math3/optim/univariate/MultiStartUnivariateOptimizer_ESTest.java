/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:05:46 GMT 2022
 */

package org.apache.commons.math3.optim.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.univariate.BrentOptimizer;
import org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer;
import org.apache.commons.math3.optim.univariate.SearchInterval;
import org.apache.commons.math3.optim.univariate.UnivariateOptimizer;
import org.apache.commons.math3.optim.univariate.UnivariatePointValuePair;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiStartUnivariateOptimizer_ESTest extends MultiStartUnivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(70, 2.2602433110285232E-7);
      Well19937a well19937a0 = new Well19937a((long) 70);
      MultiStartUnivariateOptimizer multiStartUnivariateOptimizer0 = new MultiStartUnivariateOptimizer(brentOptimizer0, 70, well19937a0);
      // Undeclared exception!
      try { 
        multiStartUnivariateOptimizer0.optimize((OptimizationData[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.BaseOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(4703.2029196, 4703.2029196);
      Well19937c well19937c0 = new Well19937c(0);
      MultiStartUnivariateOptimizer multiStartUnivariateOptimizer0 = new MultiStartUnivariateOptimizer(brentOptimizer0, 2178, well19937c0);
      // Undeclared exception!
      try { 
        multiStartUnivariateOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a((long) 1);
      MultiStartUnivariateOptimizer multiStartUnivariateOptimizer0 = null;
      try {
        multiStartUnivariateOptimizer0 = new MultiStartUnivariateOptimizer((UnivariateOptimizer) null, 1, well19937a0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(1154.3, 703.383006);
      ISAACRandom iSAACRandom0 = new ISAACRandom(443);
      MultiStartUnivariateOptimizer multiStartUnivariateOptimizer0 = new MultiStartUnivariateOptimizer(brentOptimizer0, 443, iSAACRandom0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[1];
      SearchInterval searchInterval0 = new SearchInterval((-2477.28262434657), 703.383006, (-2477.28262434657));
      optimizationDataArray0[0] = (OptimizationData) searchInterval0;
      // Undeclared exception!
      try { 
        multiStartUnivariateOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state
         //
         verifyException("org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(70, 70);
      Well19937a well19937a0 = new Well19937a((long) 70);
      MultiStartUnivariateOptimizer multiStartUnivariateOptimizer0 = new MultiStartUnivariateOptimizer(brentOptimizer0, 70, well19937a0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[2];
      MaxEval maxEval0 = new MaxEval(70);
      optimizationDataArray0[0] = (OptimizationData) maxEval0;
      // Undeclared exception!
      try { 
        multiStartUnivariateOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state
         //
         verifyException("org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(1966.0, 1966.0);
      Well44497b well44497b0 = new Well44497b(1715);
      MultiStartUnivariateOptimizer multiStartUnivariateOptimizer0 = new MultiStartUnivariateOptimizer(brentOptimizer0, 1715, well44497b0);
      // Undeclared exception!
      try { 
        multiStartUnivariateOptimizer0.getOptima();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no optimum computed yet
         //
         verifyException("org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(784.2640250681147, 784.2640250681147, (ConvergenceChecker<UnivariatePointValuePair>) null);
      Well19937a well19937a0 = new Well19937a();
      MultiStartUnivariateOptimizer multiStartUnivariateOptimizer0 = null;
      try {
        multiStartUnivariateOptimizer0 = new MultiStartUnivariateOptimizer(brentOptimizer0, 0, well19937a0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(2178.34688372864, 2178.34688372864);
      Well44497a well44497a0 = new Well44497a(0);
      MultiStartUnivariateOptimizer multiStartUnivariateOptimizer0 = new MultiStartUnivariateOptimizer(brentOptimizer0, 4002, well44497a0);
      int int0 = multiStartUnivariateOptimizer0.getEvaluations();
      assertEquals(0, int0);
  }
}
