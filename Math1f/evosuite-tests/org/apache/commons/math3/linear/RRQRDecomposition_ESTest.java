/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 06:48:12 GMT 2022
 */

package org.apache.commons.math3.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RRQRDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RRQRDecomposition_ESTest extends RRQRDecomposition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = 1.8576309291617257E302;
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, false);
      RRQRDecomposition rRQRDecomposition0 = new RRQRDecomposition(diagonalMatrix0, 1.1833801727262375E9);
      int int0 = rRQRDecomposition0.getRank(1.8576309291617257E302);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      RRQRDecomposition rRQRDecomposition0 = new RRQRDecomposition(diagonalMatrix0);
      double[][] doubleArray1 = new double[1][9];
      // Undeclared exception!
      try { 
        rRQRDecomposition0.performHouseholderReflection(155, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, true);
      RRQRDecomposition rRQRDecomposition0 = new RRQRDecomposition(diagonalMatrix0);
      double[][] doubleArray1 = new double[5][0];
      rRQRDecomposition0.performHouseholderReflection(0, doubleArray1);
      assertEquals(5, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, false);
      RRQRDecomposition rRQRDecomposition0 = new RRQRDecomposition(diagonalMatrix0, 1.1833801727262375E9);
      // Undeclared exception!
      try { 
        rRQRDecomposition0.performHouseholderReflection((-4699), (double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[16];
      doubleArray0[2] = 1.0;
      doubleArray0[4] = (-0.5);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0, arrayRealVector0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector1);
      RRQRDecomposition rRQRDecomposition0 = new RRQRDecomposition(realMatrix0);
      int int0 = rRQRDecomposition0.getRank((-113.17991));
      assertEquals(3, int0);
      
      int int1 = rRQRDecomposition0.getRank(0.0);
      assertEquals(3, int1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RRQRDecomposition rRQRDecomposition0 = new RRQRDecomposition(array2DRowRealMatrix0);
      double[][] doubleArray1 = new double[0][5];
      rRQRDecomposition0.decompose(doubleArray1);
      // Undeclared exception!
      try { 
        rRQRDecomposition0.getP();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.linear.AbstractRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(24, 24);
      RRQRDecomposition rRQRDecomposition0 = new RRQRDecomposition(array2DRowRealMatrix0);
      double[][] doubleArray0 = new double[0][8];
      // Undeclared exception!
      rRQRDecomposition0.decompose(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      RRQRDecomposition rRQRDecomposition0 = new RRQRDecomposition(diagonalMatrix0, 0.0);
      // Undeclared exception!
      try { 
        rRQRDecomposition0.decompose((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.RRQRDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 4501.78;
      doubleArray0[1] = (-963.9);
      doubleArray0[3] = 933.1979364307;
      doubleArray0[4] = 2195.772398523;
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, true);
      RRQRDecomposition rRQRDecomposition0 = new RRQRDecomposition(diagonalMatrix0, 4110.24);
      double[][] doubleArray1 = new double[2][3];
      // Undeclared exception!
      try { 
        rRQRDecomposition0.decompose(doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(3578);
      RRQRDecomposition rRQRDecomposition0 = new RRQRDecomposition(diagonalMatrix0, 0.0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, true);
      RRQRDecomposition rRQRDecomposition0 = null;
      try {
        rRQRDecomposition0 = new RRQRDecomposition(diagonalMatrix0, 727.836391535383);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.linear.AbstractRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(663);
      RRQRDecomposition rRQRDecomposition0 = new RRQRDecomposition(diagonalMatrix0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      RRQRDecomposition rRQRDecomposition0 = null;
      try {
        rRQRDecomposition0 = new RRQRDecomposition(array2DRowRealMatrix0);
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
      RRQRDecomposition rRQRDecomposition0 = null;
      try {
        rRQRDecomposition0 = new RRQRDecomposition((RealMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.QRDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, true);
      RRQRDecomposition rRQRDecomposition0 = new RRQRDecomposition(diagonalMatrix0);
      rRQRDecomposition0.getP();
      RealMatrix realMatrix0 = rRQRDecomposition0.getP();
      assertEquals(1, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-2037.72594810402);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      RRQRDecomposition rRQRDecomposition0 = new RRQRDecomposition(realMatrix0, (-2037.72594810402));
      int int0 = rRQRDecomposition0.getRank(1208.7);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, true);
      RRQRDecomposition rRQRDecomposition0 = new RRQRDecomposition(diagonalMatrix0);
      rRQRDecomposition0.getP();
      DecompositionSolver decompositionSolver0 = rRQRDecomposition0.getSolver();
      assertFalse(decompositionSolver0.isNonSingular());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RRQRDecomposition rRQRDecomposition0 = null;
      try {
        rRQRDecomposition0 = new RRQRDecomposition((RealMatrix) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.QRDecomposition", e);
      }
  }
}
