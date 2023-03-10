/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:08:53 GMT 2022
 */

package org.apache.commons.math3.stat.correlation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.stat.correlation.Covariance;
import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PearsonsCorrelation_ESTest extends PearsonsCorrelation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[4][2];
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(doubleArray0);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(blockRealMatrix0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[2][3];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[] doubleArray0 = new double[2];
      double double0 = pearsonsCorrelation0.correlation(doubleArray0, doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, true);
      double[][] doubleArray1 = new double[7][1];
      doubleArray1[0] = doubleArray0;
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(diagonalMatrix0);
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.correlation(doubleArray1[0], doubleArray1[1]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4 != 1
         //
         verifyException("org.apache.commons.math3.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(diagonalMatrix0);
      RealMatrix realMatrix0 = pearsonsCorrelation0.getCorrelationStandardErrors();
      assertEquals(8, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 1 rows and 1 columns.
         //
         verifyException("org.apache.commons.math3.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      RealMatrix realMatrix0 = array2DRowRealMatrix0.createMatrix(2, 2);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(realMatrix0, 2);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(diagonalMatrix0);
      RealMatrix realMatrix0 = pearsonsCorrelation0.getCorrelationMatrix();
      assertEquals(8, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-704.3799);
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(diagonalMatrix0);
      double double0 = pearsonsCorrelation0.correlation(doubleArray0, doubleArray0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.getCorrelationStandardErrors();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.getCorrelationPValues();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom (-2)
         //
         verifyException("org.apache.commons.math3.distribution.TDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(918);
      // Undeclared exception!
      pearsonsCorrelation0.covarianceToCorrelation(diagonalMatrix0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      double[][] doubleArray0 = new double[4][4];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.covarianceToCorrelation(array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.linear.AbstractRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.covarianceToCorrelation((RealMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.correlation((double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[][] doubleArray0 = new double[9][1];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 1
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.computeCorrelationMatrix((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(doubleArray0);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.computeCorrelationMatrix((RealMatrix) blockRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient dimension 1, must be at least 2
         //
         verifyException("org.apache.commons.math3.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(1066, 726);
      // Undeclared exception!
      pearsonsCorrelation0.computeCorrelationMatrix((RealMatrix) array2DRowRealMatrix0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.computeCorrelationMatrix((RealMatrix) array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.linear.AbstractRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.computeCorrelationMatrix((RealMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[][] doubleArray0 = new double[8][5];
      double[] doubleArray1 = new double[6];
      doubleArray0[0] = doubleArray1;
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 5
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[][] doubleArray0 = new double[0][1];
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation((Covariance) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, false);
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(diagonalMatrix0, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.linear.AbstractRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(array2DRowRealMatrix0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // row index (1)
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) null, 295);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(243);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(diagonalMatrix0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.correlation(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient dimension 0, must be at least 2
         //
         verifyException("org.apache.commons.math3.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(diagonalMatrix0);
      RealMatrix realMatrix0 = pearsonsCorrelation0.computeCorrelationMatrix((RealMatrix) diagonalMatrix0);
      RealMatrix realMatrix1 = pearsonsCorrelation0.covarianceToCorrelation(realMatrix0);
      assertFalse(realMatrix1.equals((Object)realMatrix0));
      assertEquals(8, realMatrix1.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 3 rows and 1 columns.
         //
         verifyException("org.apache.commons.math3.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient dimension 1, must be at least 2
         //
         verifyException("org.apache.commons.math3.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[9];
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.correlation(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 9
         //
         verifyException("org.apache.commons.math3.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(diagonalMatrix0);
      RealMatrix realMatrix0 = pearsonsCorrelation0.getCorrelationPValues();
      RealMatrix realMatrix1 = pearsonsCorrelation0.covarianceToCorrelation(realMatrix0);
      assertNotSame(realMatrix1, realMatrix0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(covariance0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // covariance matrix
         //
         verifyException("org.apache.commons.math3.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[][] doubleArray0 = new double[2][6];
      Covariance covariance0 = new Covariance(doubleArray0);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(covariance0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, true);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(diagonalMatrix0);
      double[][] doubleArray1 = new double[7][1];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      doubleArray1[6] = doubleArray0;
      RealMatrix realMatrix0 = pearsonsCorrelation0.computeCorrelationMatrix(doubleArray1);
      assertEquals(4, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(707);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(diagonalMatrix0, 707);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      RealMatrix realMatrix0 = pearsonsCorrelation0.getCorrelationMatrix();
      assertNull(realMatrix0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[][] doubleArray0 = new double[0][8];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }
}
