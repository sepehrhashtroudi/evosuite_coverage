/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:40:13 GMT 2022
 */

package org.apache.commons.math3.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.direct.SimplexOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimplexOptimizer_ESTest extends SimplexOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(Double.NaN, Double.NaN);
      assertNull(simplexOptimizer0.getGoalType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConvergenceChecker<PointValuePair> convergenceChecker0 = (ConvergenceChecker<PointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(convergenceChecker0);
      assertNull(simplexOptimizer0.getGoalType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer();
      assertNull(simplexOptimizer0.getGoalType());
  }
}
