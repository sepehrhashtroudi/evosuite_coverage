/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:19:26 GMT 2022
 */

package org.apache.commons.math3.stat.regression;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.stat.regression.MillerUpdatingRegression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MillerUpdatingRegression_ESTest extends MillerUpdatingRegression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(8, true, 1306.6620981856347);
      int[] intArray0 = new int[9];
      try { 
        millerUpdatingRegression0.regress(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not enough data (0 rows) for this many predictors (9 predictors)
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(1, true);
      try { 
        millerUpdatingRegression0.regress(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not enough data (0 rows) for this many predictors (0 predictors)
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(8, false, 1306.6620981856347);
      double[] doubleArray0 = new double[8];
      double double0 = millerUpdatingRegression0.getDiagonalOfHatMatrix(doubleArray0);
      assertEquals(0L, millerUpdatingRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
      assertFalse(millerUpdatingRegression0.hasIntercept());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(208, false);
      double[][] doubleArray0 = new double[2][6];
      double[] doubleArray1 = new double[0];
      try { 
        millerUpdatingRegression0.addObservations(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 0
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(1, true);
      double[] doubleArray0 = new double[9];
      try { 
        millerUpdatingRegression0.addObservation(doubleArray0, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length of regressor array = 9 does not match the number of variables = 2 in the model
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(2, false, 3862.35774);
      double[] doubleArray0 = new double[4];
      try { 
        millerUpdatingRegression0.addObservation(doubleArray0, 3862.35774);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length of regressor array = 4 does not match the number of variables = 2 in the model
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(2, true);
      boolean boolean0 = millerUpdatingRegression0.hasIntercept();
      assertTrue(boolean0);
      assertEquals(0L, millerUpdatingRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(74, false);
      double[] doubleArray0 = new double[0];
      double double0 = millerUpdatingRegression0.getDiagonalOfHatMatrix(doubleArray0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0L, millerUpdatingRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(1079, false);
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (double) 1079;
      double double0 = millerUpdatingRegression0.getDiagonalOfHatMatrix(doubleArray0);
      assertEquals(0L, millerUpdatingRegression0.getN());
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertFalse(millerUpdatingRegression0.hasIntercept());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(270, false, 935.892081852);
      // Undeclared exception!
      millerUpdatingRegression0.getPartialCorrelations(0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(1, true, 0.0);
      // Undeclared exception!
      try { 
        millerUpdatingRegression0.getPartialCorrelations(588);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(1, true, 1);
      // Undeclared exception!
      try { 
        millerUpdatingRegression0.addObservation((double[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(255, true);
      try { 
        millerUpdatingRegression0.regress(231);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not enough data (0 rows) for this many predictors (231 predictors)
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = null;
      try {
        millerUpdatingRegression0 = new MillerUpdatingRegression((-159), false, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Regression model must include at least one regressor
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(1, true);
      int[] intArray0 = new int[9];
      try { 
        millerUpdatingRegression0.regress(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too many regressors (9) specified, only 2 in the model
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(2, true, 1038.715);
      int[] intArray0 = new int[2];
      try { 
        millerUpdatingRegression0.regress(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not enough data (0 rows) for this many predictors (3 predictors)
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(2, true);
      double[] doubleArray0 = new double[4];
      double double0 = millerUpdatingRegression0.getDiagonalOfHatMatrix(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
      assertTrue(millerUpdatingRegression0.hasIntercept());
      assertEquals(0L, millerUpdatingRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(255, true);
      double[] doubleArray0 = millerUpdatingRegression0.getPartialCorrelations(242);
      assertEquals(0L, millerUpdatingRegression0.getN());
      assertNotNull(doubleArray0);
      assertEquals(105, doubleArray0.length);
      assertTrue(millerUpdatingRegression0.hasIntercept());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(1079, false);
      millerUpdatingRegression0.clear();
      assertFalse(millerUpdatingRegression0.hasIntercept());
      assertEquals(0L, millerUpdatingRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(450, true, 450);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 450;
      double double0 = millerUpdatingRegression0.getDiagonalOfHatMatrix(doubleArray0);
      assertTrue(millerUpdatingRegression0.hasIntercept());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0L, millerUpdatingRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(234, false, 234);
      double[] doubleArray0 = new double[9];
      double[][] doubleArray1 = new double[9][7];
      doubleArray1[0] = doubleArray0;
      try { 
        millerUpdatingRegression0.addObservations(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not enough data (9 rows) for this many predictors (9 predictors)
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(206, true, Double.POSITIVE_INFINITY);
      double[][] doubleArray0 = new double[0][4];
      double[] doubleArray1 = new double[0];
      try { 
        millerUpdatingRegression0.addObservations(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(234, false, 234);
      double[] doubleArray0 = new double[9];
      double[][] doubleArray1 = new double[9][7];
      try { 
        millerUpdatingRegression0.addObservations(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length of regressor array = 7 does not match the number of variables = 234 in the model
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(284, true, 935.892081852);
      double[] doubleArray0 = millerUpdatingRegression0.getPartialCorrelations((-21));
      double[][] doubleArray1 = new double[5][0];
      try { 
        millerUpdatingRegression0.addObservations(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 0
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(178, true);
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[9];
      try { 
        millerUpdatingRegression0.addObservations(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 9
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(450, true, 450);
      double[] doubleArray0 = new double[4];
      try { 
        millerUpdatingRegression0.addObservations((double[][]) null, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 4
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(1257, true);
      double[] doubleArray0 = new double[5];
      try { 
        millerUpdatingRegression0.addObservation(doubleArray0, 1257.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length of regressor array = 5 does not match the number of variables = 1,258 in the model
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(1124, true, 0.0);
      // Undeclared exception!
      millerUpdatingRegression0.regress((-2997));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = null;
      try {
        millerUpdatingRegression0 = new MillerUpdatingRegression((-1), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Regression model must include at least one regressor
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(2, true, 2);
      try { 
        millerUpdatingRegression0.regress();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not enough data (0 rows) for this many predictors (3 predictors)
         //
         verifyException("org.apache.commons.math3.stat.regression.MillerUpdatingRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(54, false, 54);
      boolean boolean0 = millerUpdatingRegression0.hasIntercept();
      assertFalse(boolean0);
      assertEquals(0L, millerUpdatingRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(1079, false);
      int[] intArray0 = millerUpdatingRegression0.getOrderOfRegressors();
      assertEquals(1079, intArray0.length);
      assertEquals(0L, millerUpdatingRegression0.getN());
      assertFalse(millerUpdatingRegression0.hasIntercept());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MillerUpdatingRegression millerUpdatingRegression0 = new MillerUpdatingRegression(2, true, 1038.715);
      long long0 = millerUpdatingRegression0.getN();
      assertEquals(0L, long0);
      assertTrue(millerUpdatingRegression0.hasIntercept());
  }
}