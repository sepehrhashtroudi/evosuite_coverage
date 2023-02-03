/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:41:01 GMT 2022
 */

package org.apache.commons.math3.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction;
import org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapter;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math3.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultivariateFunctionPenaltyAdapter_ESTest extends MultivariateFunctionPenaltyAdapter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = (-1.2390581549994408);
      MultivariateFunctionPenaltyAdapter multivariateFunctionPenaltyAdapter0 = new MultivariateFunctionPenaltyAdapter((MultivariateFunction) null, doubleArray0, doubleArray0, (-1.0), doubleArray0);
      double[] doubleArray1 = new double[7];
      double double0 = multivariateFunctionPenaltyAdapter0.value(doubleArray1);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 893.03404561;
      doubleArray0[1] = 1.0;
      MultivariateFunctionPenaltyAdapter multivariateFunctionPenaltyAdapter0 = new MultivariateFunctionPenaltyAdapter((MultivariateFunction) null, doubleArray0, doubleArray0, 0.0, doubleArray0);
      double[] doubleArray1 = new double[4];
      double double0 = multivariateFunctionPenaltyAdapter0.value(doubleArray1);
      assertEquals(894.03404561, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      Well44497b well44497b0 = new Well44497b((long) 1671);
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0, well44497b0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 1671, 1671, unitSphereRandomVectorGenerator0);
      microsphereInterpolatingFunction0.value(doubleArray1);
      microsphereInterpolatingFunction0.value(doubleArray0[0]);
      MultivariateFunctionPenaltyAdapter multivariateFunctionPenaltyAdapter0 = new MultivariateFunctionPenaltyAdapter(microsphereInterpolatingFunction0, doubleArray1, doubleArray1, 0.0, doubleArray1);
      multivariateFunctionPenaltyAdapter0.value(doubleArray1);
      multivariateFunctionPenaltyAdapter0.value(doubleArray1);
      multivariateFunctionPenaltyAdapter0.value(doubleArray1);
      // Undeclared exception!
      multivariateFunctionPenaltyAdapter0.value(doubleArray1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      MultivariateFunctionPenaltyAdapter multivariateFunctionPenaltyAdapter0 = new MultivariateFunctionPenaltyAdapter((MultivariateFunction) null, doubleArray0, doubleArray0, (-1.0), doubleArray0);
      double[] doubleArray1 = new double[7];
      // Undeclared exception!
      try { 
        multivariateFunctionPenaltyAdapter0.value(doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MultivariateFunctionPenaltyAdapter multivariateFunctionPenaltyAdapter0 = null;
      try {
        multivariateFunctionPenaltyAdapter0 = new MultivariateFunctionPenaltyAdapter((MultivariateFunction) null, (double[]) null, (double[]) null, (-1109.9582611), (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MultivariateFunctionPenaltyAdapter multivariateFunctionPenaltyAdapter0 = new MultivariateFunctionPenaltyAdapter((MultivariateFunction) null, doubleArray0, doubleArray0, (-1.0), doubleArray0);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-1.2390581549994408);
      double double0 = multivariateFunctionPenaltyAdapter0.value(doubleArray1);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = Double.NaN;
      MultivariateFunctionPenaltyAdapter multivariateFunctionPenaltyAdapter0 = null;
      try {
        multivariateFunctionPenaltyAdapter0 = new MultivariateFunctionPenaltyAdapter((MultivariateFunction) null, doubleArray0, doubleArray0, Double.NaN, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // \uFFFD is smaller than the minimum (\uFFFD)
         //
         verifyException("org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MultivariateFunctionPenaltyAdapter multivariateFunctionPenaltyAdapter0 = new MultivariateFunctionPenaltyAdapter((MultivariateFunction) null, doubleArray0, doubleArray0, (-1.0), doubleArray0);
      // Undeclared exception!
      try { 
        multivariateFunctionPenaltyAdapter0.value(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[10];
      MultivariateFunctionPenaltyAdapter multivariateFunctionPenaltyAdapter0 = null;
      try {
        multivariateFunctionPenaltyAdapter0 = new MultivariateFunctionPenaltyAdapter((MultivariateFunction) null, doubleArray0, doubleArray0, 0.0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 10
         //
         verifyException("org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      MultivariateFunctionPenaltyAdapter multivariateFunctionPenaltyAdapter0 = null;
      try {
        multivariateFunctionPenaltyAdapter0 = new MultivariateFunctionPenaltyAdapter((MultivariateFunction) null, doubleArray1, doubleArray0, (-38.53978795763084), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 2
         //
         verifyException("org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapter", e);
      }
  }
}
