/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 02:33:00 GMT 2022
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NelderMeadSimplex_ESTest extends NelderMeadSimplex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[2][1];
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0, (-686.7000203968228), (-686.7000203968228), (-686.7000203968228), (-686.7000203968228));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // equal vertices 1 and 0 in simplex configuration
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[0][4];
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0, Double.NaN, (-2663.02729228342), (-2559.33116), (-2559.33116));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // simplex must contain at least one point
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0, 0.0, 0.0, 0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[0][7];
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // simplex must contain at least one point
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[9][0];
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 8
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0, 1301.14141402, 0.0, 0.5, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // equal vertices 0 and {1} in simplex configuration
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex((double[]) null, (-419.0), (-419.0), (-419.0), (-419.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero not allowed here
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(3588, 3588, 0.0, 3588, 1.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex(0, 0, 0, 0, (-3611.3367501102334), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero not allowed here
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex((-238), (-1463.5), 6.283185307179586, (-1463.5), 1379.3221636, 1379.3221636);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(1545, Double.NaN, (-1714.1176126320574), 1545, 0.0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex(0, 0, 0, 310.1130234712385, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero not allowed here
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(750, 750);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex(0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero not allowed here
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex((-227), (-227));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(1245);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero not allowed here
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0);
      assertEquals(0, nelderMeadSimplex0.getDimension());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(24, 3106.8149336767433, 3106.8149336767433, 3106.8149336767433, 3106.8149336767433, Double.NaN);
      assertEquals(24, nelderMeadSimplex0.getDimension());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(9, (-1.0), 3934.1963997729, 3934.1963997729, 9);
      assertEquals(9, nelderMeadSimplex0.getDimension());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(1, 1);
      assertEquals(1, nelderMeadSimplex0.getDimension());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-971.5486686);
      doubleArray0[1] = (-285.4);
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0, 1945.59160706072, 2607.8347, 0.0, 1945.59160706072);
      assertEquals(2, nelderMeadSimplex0.getDimension());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0, 0.0, 0.0, 0.0, 0.0);
      assertEquals(0, nelderMeadSimplex0.getDimension());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex((double[][]) null, 0.0, 570.256094, 0.0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex((-1931), (-1931), (-1931), Double.POSITIVE_INFINITY, (-1931));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = null;
      try {
        nelderMeadSimplex0 = new NelderMeadSimplex((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(13);
      assertEquals(13, nelderMeadSimplex0.getDimension());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-676.9998049498412);
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0);
      nelderMeadSimplex0.build(doubleArray0);
      Comparator<PointValuePair> comparator0 = (Comparator<PointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nelderMeadSimplex0.iterate((MultivariateFunction) null, comparator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex", e);
      }
  }
}
