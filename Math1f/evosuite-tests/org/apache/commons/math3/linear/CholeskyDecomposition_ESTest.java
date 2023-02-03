/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 21:07:21 GMT 2022
 */

package org.apache.commons.math3.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.CholeskyDecomposition;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CholeskyDecomposition_ESTest extends CholeskyDecomposition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1561.7485;
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      CholeskyDecomposition choleskyDecomposition0 = new CholeskyDecomposition(diagonalMatrix0, 1561.7485, (-1233.0));
      double double0 = choleskyDecomposition0.getDeterminant();
      assertEquals(1561.7484999999997, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      CholeskyDecomposition choleskyDecomposition0 = new CholeskyDecomposition(array2DRowRealMatrix0);
      // Undeclared exception!
      try { 
        choleskyDecomposition0.getLT();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(4626);
      CholeskyDecomposition choleskyDecomposition0 = new CholeskyDecomposition(diagonalMatrix0, 1.0E-15, 1.0E-15);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CholeskyDecomposition choleskyDecomposition0 = null;
      try {
        choleskyDecomposition0 = new CholeskyDecomposition((RealMatrix) null, 0.0, (-590.4));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      CholeskyDecomposition choleskyDecomposition0 = null;
      try {
        choleskyDecomposition0 = new CholeskyDecomposition(array2DRowRealMatrix0, (-3.5997360512765566E-9), (-712.501531922432));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CholeskyDecomposition choleskyDecomposition0 = null;
      try {
        choleskyDecomposition0 = new CholeskyDecomposition((RealMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      CholeskyDecomposition choleskyDecomposition0 = null;
      try {
        choleskyDecomposition0 = new CholeskyDecomposition(array2DRowRealMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, false);
      CholeskyDecomposition choleskyDecomposition0 = new CholeskyDecomposition(diagonalMatrix0, (-1837.19943), (-881.175542));
      assertEquals(Double.NaN, choleskyDecomposition0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(6, 6);
      CholeskyDecomposition choleskyDecomposition0 = null;
      try {
        choleskyDecomposition0 = new CholeskyDecomposition(array2DRowRealMatrix0, 6, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (6): not positive definite matrix: value 0 at index 0
         //
         verifyException("org.apache.commons.math3.linear.CholeskyDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(2053, 3948);
      CholeskyDecomposition choleskyDecomposition0 = null;
      try {
        choleskyDecomposition0 = new CholeskyDecomposition(array2DRowRealMatrix0, (-804.32112), (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // non square (2,053x3,948) matrix
         //
         verifyException("org.apache.commons.math3.linear.CholeskyDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      CholeskyDecomposition choleskyDecomposition0 = new CholeskyDecomposition(diagonalMatrix0, 1561.7485, (-1233.0));
      double double0 = choleskyDecomposition0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      CholeskyDecomposition choleskyDecomposition0 = new CholeskyDecomposition(diagonalMatrix0, 1561.7485, (-1233.0));
      choleskyDecomposition0.getLT();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)choleskyDecomposition0.getLT();
      assertFalse(array2DRowRealMatrix0.isTransposable());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      CholeskyDecomposition choleskyDecomposition0 = new CholeskyDecomposition(diagonalMatrix0, 1561.7485, (-1233.0));
      choleskyDecomposition0.getL();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)choleskyDecomposition0.getL();
      assertFalse(array2DRowRealMatrix0.isTransposable());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 72.41960122;
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      CholeskyDecomposition choleskyDecomposition0 = null;
      try {
        choleskyDecomposition0 = new CholeskyDecomposition(diagonalMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0): not positive definite matrix: value 0 at index 1
         //
         verifyException("org.apache.commons.math3.linear.CholeskyDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1696.1);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      CholeskyDecomposition choleskyDecomposition0 = null;
      try {
        choleskyDecomposition0 = new CholeskyDecomposition(realMatrix0, (-3968.30343519), (-1696.1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // non symmetric matrix: the difference between entries at (0,4) and (4,0) is larger than -3,968.303
         //
         verifyException("org.apache.commons.math3.linear.CholeskyDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.createMatrix(1341, 1341);
      CholeskyDecomposition choleskyDecomposition0 = new CholeskyDecomposition(realMatrix0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      CholeskyDecomposition choleskyDecomposition0 = null;
      try {
        choleskyDecomposition0 = new CholeskyDecomposition(array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // non square (3x1) matrix
         //
         verifyException("org.apache.commons.math3.linear.CholeskyDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      CholeskyDecomposition choleskyDecomposition0 = new CholeskyDecomposition(diagonalMatrix0, 1561.7485, (-1233.0));
      DecompositionSolver decompositionSolver0 = choleskyDecomposition0.getSolver();
      assertTrue(decompositionSolver0.isNonSingular());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      CholeskyDecomposition choleskyDecomposition0 = new CholeskyDecomposition(array2DRowRealMatrix0);
      // Undeclared exception!
      try { 
        choleskyDecomposition0.getL();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }
}