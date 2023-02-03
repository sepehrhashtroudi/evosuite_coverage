/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:17:16 GMT 2022
 */

package org.apache.commons.math3.optimization;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizer;
import org.apache.commons.math3.optimization.MultivariateDifferentiableVectorOptimizer;
import org.apache.commons.math3.random.RandomVectorGenerator;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultivariateDifferentiableVectorMultiStartOptimizer_ESTest extends MultivariateDifferentiableVectorMultiStartOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultivariateDifferentiableVectorOptimizer multivariateDifferentiableVectorOptimizer0 = mock(MultivariateDifferentiableVectorOptimizer.class, new ViolatedAssumptionAnswer());
      int[] intArray0 = new int[4];
      Well1024a well1024a0 = new Well1024a(intArray0);
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0, well1024a0);
      MultivariateDifferentiableVectorMultiStartOptimizer multivariateDifferentiableVectorMultiStartOptimizer0 = null;
      try {
        multivariateDifferentiableVectorMultiStartOptimizer0 = new MultivariateDifferentiableVectorMultiStartOptimizer(multivariateDifferentiableVectorOptimizer0, 0, unitSphereRandomVectorGenerator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MultivariateDifferentiableVectorOptimizer multivariateDifferentiableVectorOptimizer0 = mock(MultivariateDifferentiableVectorOptimizer.class, new ViolatedAssumptionAnswer());
      MultivariateDifferentiableVectorMultiStartOptimizer multivariateDifferentiableVectorMultiStartOptimizer0 = null;
      try {
        multivariateDifferentiableVectorMultiStartOptimizer0 = new MultivariateDifferentiableVectorMultiStartOptimizer(multivariateDifferentiableVectorOptimizer0, (-5298), (RandomVectorGenerator) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MultivariateDifferentiableVectorOptimizer multivariateDifferentiableVectorOptimizer0 = mock(MultivariateDifferentiableVectorOptimizer.class, new ViolatedAssumptionAnswer());
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2013);
      MultivariateDifferentiableVectorMultiStartOptimizer multivariateDifferentiableVectorMultiStartOptimizer0 = new MultivariateDifferentiableVectorMultiStartOptimizer(multivariateDifferentiableVectorOptimizer0, 2013, unitSphereRandomVectorGenerator0);
      assertEquals(0, multivariateDifferentiableVectorMultiStartOptimizer0.getEvaluations());
  }
}
