/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:21:53 GMT 2022
 */

package org.apache.commons.math3.stat.regression;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OLSMultipleLinearRegression_ESTest extends OLSMultipleLinearRegression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        oLSMultipleLinearRegression0.newSampleData(doubleArray0, 4209, (-1311));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != -5,513,790
         //
         verifyException("org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 100.0;
      oLSMultipleLinearRegression0.newYSampleData(doubleArray0);
      double double0 = oLSMultipleLinearRegression0.calculateTotalSumOfSquares();
      assertEquals(7500.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[][] doubleArray0 = new double[7][0];
      double[] doubleArray1 = new double[5];
      doubleArray0[0] = doubleArray1;
      // Undeclared exception!
      try { 
        oLSMultipleLinearRegression0.newXSampleData(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 5
         //
         verifyException("org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[][] doubleArray0 = new double[0][7];
      // Undeclared exception!
      try { 
        oLSMultipleLinearRegression0.newXSampleData(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[3][4];
      try { 
        oLSMultipleLinearRegression0.newSampleData(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not enough data (3 rows) for this many predictors (4 predictors)
         //
         verifyException("org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[][] doubleArray0 = new double[0][3];
      try { 
        oLSMultipleLinearRegression0.newSampleData((double[]) null, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      // Undeclared exception!
      try { 
        oLSMultipleLinearRegression0.newSampleData((double[]) null, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[8];
      oLSMultipleLinearRegression0.newYSampleData(doubleArray1);
      oLSMultipleLinearRegression0.newXSampleData(doubleArray0);
      // Undeclared exception!
      try { 
        oLSMultipleLinearRegression0.calculateResidualSumOfSquares();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 1
         //
         verifyException("org.apache.commons.math3.linear.QRDecomposition$Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[] doubleArray0 = new double[9];
      double[][] doubleArray1 = new double[9][2];
      oLSMultipleLinearRegression0.newSampleData(doubleArray0, doubleArray1);
      // Undeclared exception!
      try { 
        oLSMultipleLinearRegression0.calculateResidualSumOfSquares();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix is singular
         //
         verifyException("org.apache.commons.math3.linear.QRDecomposition$Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[][] doubleArray0 = new double[4][7];
      oLSMultipleLinearRegression0.newXSampleData(doubleArray0);
      double[] doubleArray1 = new double[8];
      oLSMultipleLinearRegression0.newYSampleData(doubleArray1);
      try { 
        oLSMultipleLinearRegression0.calculateRSquared();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 4
         //
         verifyException("org.apache.commons.math3.linear.QRDecomposition$Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      // Undeclared exception!
      try { 
        oLSMultipleLinearRegression0.calculateHat();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[][] doubleArray0 = new double[1][7];
      oLSMultipleLinearRegression0.newXSampleData(doubleArray0);
      // Undeclared exception!
      try { 
        oLSMultipleLinearRegression0.calculateBetaVariance();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // row index (7)
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[][] doubleArray0 = new double[11][7];
      oLSMultipleLinearRegression0.newXSampleData(doubleArray0);
      // Undeclared exception!
      try { 
        oLSMultipleLinearRegression0.calculateBetaVariance();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix is singular
         //
         verifyException("org.apache.commons.math3.linear.LUDecomposition$Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[8];
      oLSMultipleLinearRegression0.newYSampleData(doubleArray1);
      oLSMultipleLinearRegression0.newXSampleData(doubleArray0);
      // Undeclared exception!
      try { 
        oLSMultipleLinearRegression0.calculateBeta();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 1
         //
         verifyException("org.apache.commons.math3.linear.QRDecomposition$Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      // Undeclared exception!
      try { 
        oLSMultipleLinearRegression0.calculateBeta();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[8];
      oLSMultipleLinearRegression0.newYSampleData(doubleArray1);
      oLSMultipleLinearRegression0.newXSampleData(doubleArray0);
      try { 
        oLSMultipleLinearRegression0.calculateAdjustedRSquared();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 1
         //
         verifyException("org.apache.commons.math3.linear.QRDecomposition$Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[][] doubleArray0 = new double[1][7];
      oLSMultipleLinearRegression0.setNoIntercept(true);
      double[] doubleArray1 = new double[1];
      oLSMultipleLinearRegression0.newYSampleData(doubleArray1);
      oLSMultipleLinearRegression0.newXSampleData(doubleArray0);
      try { 
        oLSMultipleLinearRegression0.calculateAdjustedRSquared();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix is singular
         //
         verifyException("org.apache.commons.math3.linear.QRDecomposition$Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      // Undeclared exception!
      try { 
        oLSMultipleLinearRegression0.calculateResidualSumOfSquares();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[][] doubleArray0 = new double[1][7];
      oLSMultipleLinearRegression0.setNoIntercept(true);
      oLSMultipleLinearRegression0.newXSampleData(doubleArray0);
      // Undeclared exception!
      try { 
        oLSMultipleLinearRegression0.calculateAdjustedRSquared();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.QRDecomposition$Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      oLSMultipleLinearRegression0.setNoIntercept(true);
      // Undeclared exception!
      try { 
        oLSMultipleLinearRegression0.calculateTotalSumOfSquares();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[][] doubleArray0 = new double[14][7];
      oLSMultipleLinearRegression0.newXSampleData(doubleArray0);
      // Undeclared exception!
      oLSMultipleLinearRegression0.calculateHat();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[][] doubleArray0 = new double[4][7];
      oLSMultipleLinearRegression0.newXSampleData(doubleArray0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)oLSMultipleLinearRegression0.calculateHat();
      assertFalse(array2DRowRealMatrix0.isTransposable());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      // Undeclared exception!
      try { 
        oLSMultipleLinearRegression0.calculateBetaVariance();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      // Undeclared exception!
      try { 
        oLSMultipleLinearRegression0.calculateRSquared();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OLSMultipleLinearRegression oLSMultipleLinearRegression0 = new OLSMultipleLinearRegression();
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[10][7];
      try { 
        oLSMultipleLinearRegression0.newSampleData(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 10
         //
         verifyException("org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression", e);
      }
  }
}