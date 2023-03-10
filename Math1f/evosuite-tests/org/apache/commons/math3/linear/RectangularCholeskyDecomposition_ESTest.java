/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 06:43:14 GMT 2022
 */

package org.apache.commons.math3.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RectangularCholeskyDecomposition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RectangularCholeskyDecomposition_ESTest extends RectangularCholeskyDecomposition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(466, 466);
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition(blockRealMatrix0, (-0.09088450866185192));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = null;
      try {
        rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition((RealMatrix) null, 699.4572685422);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.RectangularCholeskyDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = null;
      try {
        rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition(array2DRowRealMatrix0, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.RectangularCholeskyDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(3316, 1206);
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition(blockRealMatrix0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = null;
      try {
        rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition((RealMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.RectangularCholeskyDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = null;
      try {
        rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition(array2DRowRealMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.RectangularCholeskyDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 1615.5447;
      doubleArray0[2] = (-2472.8);
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = null;
      try {
        rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition(diagonalMatrix0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,472.8 is smaller than, or equal to, the minimum (0): not positive definite matrix: value -2,472.8 at index 2
         //
         verifyException("org.apache.commons.math3.linear.RectangularCholeskyDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[6] = 2914.6347928551954;
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, false);
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition(diagonalMatrix0, 1286.81);
      assertEquals(1, rectangularCholeskyDecomposition0.getRank());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = 511.532289;
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, false);
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = null;
      try {
        rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition(diagonalMatrix0, 1286.81);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 511.532 is smaller than, or equal to, the minimum (1,286.81): not positive definite matrix: value 511.532 at index 2
         //
         verifyException("org.apache.commons.math3.linear.RectangularCholeskyDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 100.83609964;
      doubleArray0[1] = (-3399.37331004508);
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = null;
      try {
        rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition(diagonalMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3,399.373 is smaller than, or equal to, the minimum (0): not positive definite matrix: value -3,399.373 at index 1
         //
         verifyException("org.apache.commons.math3.linear.RectangularCholeskyDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(doubleArray0);
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition(blockRealMatrix0, (-1.0));
      RealMatrix realMatrix0 = rectangularCholeskyDecomposition0.getRootMatrix();
      assertEquals(1, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[6] = 1.0;
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition(diagonalMatrix0);
      int int0 = rectangularCholeskyDecomposition0.getRank();
      assertEquals(1, int0);
  }
}
