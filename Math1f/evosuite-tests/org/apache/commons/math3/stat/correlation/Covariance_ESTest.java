/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:06:26 GMT 2022
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Covariance_ESTest extends Covariance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-2248.197512);
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, false);
      RealMatrix realMatrix0 = covariance0.computeCovarianceMatrix(diagonalMatrix0, false);
      assertEquals(2, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      Covariance covariance0 = null;
      try {
        covariance0 = new Covariance(doubleArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.linear.AbstractRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, false);
      Covariance covariance0 = new Covariance(diagonalMatrix0, false);
      int int0 = covariance0.getN();
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      covariance0.getCovarianceMatrix();
      assertEquals(0, covariance0.getN());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1663.6799;
      double double0 = covariance0.covariance(doubleArray0, doubleArray0, false);
      assertEquals(0, covariance0.getN());
      assertEquals(302731.4948070011, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[2][4];
      double[] doubleArray1 = new double[4];
      doubleArray1[3] = 1.0;
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = 1.0;
      Covariance covariance0 = new Covariance(doubleArray0);
      double double0 = covariance0.covariance(doubleArray1, doubleArray2, false);
      assertEquals((-0.0625), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 199;
      double double0 = covariance0.covariance(doubleArray0, doubleArray0);
      assertEquals(4950.125, double0, 0.01);
      assertEquals(0, covariance0.getN());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      double[][] doubleArray0 = new double[20][2];
      RealMatrix realMatrix0 = covariance0.computeCovarianceMatrix(doubleArray0, false);
      assertEquals(2, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      double[][] doubleArray0 = new double[5][2];
      RealMatrix realMatrix0 = covariance0.computeCovarianceMatrix(doubleArray0);
      assertEquals(0, covariance0.getN());
      assertEquals(2, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      // Undeclared exception!
      try { 
        covariance0.covariance((double[]) null, (double[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      Covariance covariance0 = new Covariance(diagonalMatrix0, true);
      // Undeclared exception!
      try { 
        covariance0.covariance((double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      double[][] doubleArray0 = new double[1][6];
      try { 
        covariance0.computeCovarianceMatrix(doubleArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample contains 1 observed points, at least 2 are required
         //
         verifyException("org.apache.commons.math3.stat.correlation.Covariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      double[][] doubleArray0 = new double[20][0];
      try { 
        covariance0.computeCovarianceMatrix(doubleArray0, true);
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
      Covariance covariance0 = new Covariance();
      double[][] doubleArray0 = new double[3][6];
      double[] doubleArray1 = new double[5];
      doubleArray0[1] = doubleArray1;
      try { 
        covariance0.computeCovarianceMatrix(doubleArray0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 5
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      // Undeclared exception!
      try { 
        covariance0.computeCovarianceMatrix((double[][]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      double[][] doubleArray0 = new double[0][5];
      // Undeclared exception!
      try { 
        covariance0.computeCovarianceMatrix(doubleArray0, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[][] doubleArray0 = new double[6][0];
      Covariance covariance0 = new Covariance();
      try { 
        covariance0.computeCovarianceMatrix(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.linear.AbstractRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      double[][] doubleArray0 = new double[7][7];
      double[] doubleArray1 = new double[6];
      doubleArray0[0] = doubleArray1;
      try { 
        covariance0.computeCovarianceMatrix(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 7
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      // Undeclared exception!
      try { 
        covariance0.computeCovarianceMatrix((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      double[][] doubleArray0 = new double[0][3];
      // Undeclared exception!
      try { 
        covariance0.computeCovarianceMatrix(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(78);
      // Undeclared exception!
      covariance0.computeCovarianceMatrix(diagonalMatrix0, true);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      // Undeclared exception!
      try { 
        covariance0.computeCovarianceMatrix((RealMatrix) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.correlation.Covariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      double[] doubleArray0 = new double[6];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.transpose();
      try { 
        covariance0.computeCovarianceMatrix(realMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample contains 1 observed points, at least 2 are required
         //
         verifyException("org.apache.commons.math3.stat.correlation.Covariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(199, 199);
      // Undeclared exception!
      covariance0.computeCovarianceMatrix(blockRealMatrix0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      try { 
        covariance0.computeCovarianceMatrix(array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.linear.AbstractRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      // Undeclared exception!
      try { 
        covariance0.computeCovarianceMatrix((RealMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.correlation.Covariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      Covariance covariance0 = null;
      try {
        covariance0 = new Covariance(doubleArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 1 rows and 3 columns.
         //
         verifyException("org.apache.commons.math3.stat.correlation.Covariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[][] doubleArray0 = new double[2][3];
      double[] doubleArray1 = new double[4];
      doubleArray0[0] = doubleArray1;
      Covariance covariance0 = null;
      try {
        covariance0 = new Covariance(doubleArray0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4 != 3
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Covariance covariance0 = null;
      try {
        covariance0 = new Covariance((double[][]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[][] doubleArray0 = new double[0][2];
      Covariance covariance0 = null;
      try {
        covariance0 = new Covariance(doubleArray0, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      Covariance covariance0 = null;
      try {
        covariance0 = new Covariance(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 1 rows and 9 columns.
         //
         verifyException("org.apache.commons.math3.stat.correlation.Covariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[][] doubleArray0 = new double[1][3];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      Covariance covariance0 = null;
      try {
        covariance0 = new Covariance(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.linear.AbstractRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[][] doubleArray0 = new double[2][3];
      double[] doubleArray1 = new double[7];
      doubleArray0[1] = doubleArray1;
      Covariance covariance0 = null;
      try {
        covariance0 = new Covariance(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 7
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Covariance covariance0 = null;
      try {
        covariance0 = new Covariance((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[][] doubleArray0 = new double[0][5];
      Covariance covariance0 = null;
      try {
        covariance0 = new Covariance(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(1, 1);
      Covariance covariance0 = null;
      try {
        covariance0 = new Covariance(array2DRowRealMatrix0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 1 rows and 1 columns.
         //
         verifyException("org.apache.commons.math3.stat.correlation.Covariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(4557, 4557);
      Covariance covariance0 = new Covariance(blockRealMatrix0, false);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, true);
      RealMatrix realMatrix0 = diagonalMatrix0.createMatrix(177, 177);
      Covariance covariance0 = new Covariance(realMatrix0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Covariance covariance0 = null;
      try {
        covariance0 = new Covariance((RealMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.correlation.Covariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      double[] doubleArray0 = new double[2];
      double double0 = covariance0.covariance(doubleArray0, doubleArray0, false);
      assertEquals(0, covariance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      double[] doubleArray0 = new double[2];
      double double0 = covariance0.covariance(doubleArray0, doubleArray0, true);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, covariance0.getN());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      double[] doubleArray0 = new double[1];
      try { 
        covariance0.covariance(doubleArray0, doubleArray0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample contains 1 observed points, at least 2 are required
         //
         verifyException("org.apache.commons.math3.stat.correlation.Covariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      Covariance covariance0 = new Covariance(array2DRowRealMatrix0);
      double[] doubleArray1 = new double[6];
      try { 
        covariance0.covariance(doubleArray0, doubleArray1, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9 != 6
         //
         verifyException("org.apache.commons.math3.stat.correlation.Covariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Covariance covariance0 = null;
      try {
        covariance0 = new Covariance((RealMatrix) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.correlation.Covariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[][] doubleArray0 = new double[2][3];
      Covariance covariance0 = new Covariance(doubleArray0, false);
      assertEquals(2, covariance0.getN());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.getSubMatrix(0, 0, 0, 0);
      Covariance covariance0 = null;
      try {
        covariance0 = new Covariance(realMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 1 rows and 1 columns.
         //
         verifyException("org.apache.commons.math3.stat.correlation.Covariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, false);
      Covariance covariance0 = new Covariance(diagonalMatrix0);
      double[] doubleArray1 = new double[2];
      try { 
        covariance0.covariance(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 7
         //
         verifyException("org.apache.commons.math3.stat.correlation.Covariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, false);
      Covariance covariance0 = new Covariance(diagonalMatrix0);
      double double0 = covariance0.covariance(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      double[] doubleArray0 = new double[2];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, false);
      RealMatrix realMatrix0 = covariance0.computeCovarianceMatrix(diagonalMatrix0, false);
      assertEquals(2, realMatrix0.getColumnDimension());
      
      RealMatrix realMatrix1 = covariance0.computeCovarianceMatrix(realMatrix0);
      assertNotSame(realMatrix1, realMatrix0);
      assertTrue(realMatrix1.equals((Object)realMatrix0));
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      double[][] doubleArray0 = new double[1][8];
      try { 
        covariance0.computeCovarianceMatrix(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample contains 1 observed points, at least 2 are required
         //
         verifyException("org.apache.commons.math3.stat.correlation.Covariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      int int0 = covariance0.getN();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, false);
      Covariance covariance0 = new Covariance(diagonalMatrix0);
      RealMatrix realMatrix0 = covariance0.getCovarianceMatrix();
      assertEquals(7, realMatrix0.getRowDimension());
  }
}