/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:49:26 GMT 2022
 */

package org.apache.commons.math3.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.function.Acos;
import org.apache.commons.math3.analysis.function.Exp;
import org.apache.commons.math3.analysis.function.Log;
import org.apache.commons.math3.analysis.function.Log1p;
import org.apache.commons.math3.analysis.function.Logistic;
import org.apache.commons.math3.optimization.univariate.BaseUnivariateOptimizer;
import org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnivariateMultiStartOptimizer_ESTest extends UnivariateMultiStartOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Well512a well512a0 = new Well512a();
      BaseUnivariateOptimizer<Log> baseUnivariateOptimizer0 = (BaseUnivariateOptimizer<Log>) mock(BaseUnivariateOptimizer.class, new ViolatedAssumptionAnswer());
      UnivariateMultiStartOptimizer<Log> univariateMultiStartOptimizer0 = new UnivariateMultiStartOptimizer<Log>(baseUnivariateOptimizer0, 34, well512a0);
      // Undeclared exception!
      try { 
        univariateMultiStartOptimizer0.getOptima();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no optimum computed yet
         //
         verifyException("org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a();
      BaseUnivariateOptimizer<Exp> baseUnivariateOptimizer0 = (BaseUnivariateOptimizer<Exp>) mock(BaseUnivariateOptimizer.class, new ViolatedAssumptionAnswer());
      UnivariateMultiStartOptimizer<Exp> univariateMultiStartOptimizer0 = null;
      try {
        univariateMultiStartOptimizer0 = new UnivariateMultiStartOptimizer<Exp>(baseUnivariateOptimizer0, 0, well1024a0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BaseUnivariateOptimizer<Log1p> baseUnivariateOptimizer0 = (BaseUnivariateOptimizer<Log1p>) mock(BaseUnivariateOptimizer.class, new ViolatedAssumptionAnswer());
      UnivariateMultiStartOptimizer<Log1p> univariateMultiStartOptimizer0 = null;
      try {
        univariateMultiStartOptimizer0 = new UnivariateMultiStartOptimizer<Log1p>(baseUnivariateOptimizer0, (-1020), (RandomGenerator) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Well512a well512a0 = new Well512a(1913);
      UnivariateMultiStartOptimizer<Exp> univariateMultiStartOptimizer0 = null;
      try {
        univariateMultiStartOptimizer0 = new UnivariateMultiStartOptimizer<Exp>((BaseUnivariateOptimizer<Exp>) null, 209, well512a0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BaseUnivariateOptimizer<Logistic> baseUnivariateOptimizer0 = (BaseUnivariateOptimizer<Logistic>) mock(BaseUnivariateOptimizer.class, new ViolatedAssumptionAnswer());
      Well512a well512a0 = new Well512a(1913);
      UnivariateMultiStartOptimizer<Logistic> univariateMultiStartOptimizer0 = new UnivariateMultiStartOptimizer<Logistic>(baseUnivariateOptimizer0, 1913, well512a0);
      int int0 = univariateMultiStartOptimizer0.getMaxEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BaseUnivariateOptimizer<Acos> baseUnivariateOptimizer0 = (BaseUnivariateOptimizer<Acos>) mock(BaseUnivariateOptimizer.class, new ViolatedAssumptionAnswer());
      Well1024a well1024a0 = new Well1024a();
      UnivariateMultiStartOptimizer<Acos> univariateMultiStartOptimizer0 = new UnivariateMultiStartOptimizer<Acos>(baseUnivariateOptimizer0, 183, well1024a0);
      int int0 = univariateMultiStartOptimizer0.getEvaluations();
      assertEquals(0, int0);
  }
}