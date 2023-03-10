/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 06:41:32 GMT 2022
 */

package org.apache.commons.math3.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.HessenbergTransformer;
import org.apache.commons.math3.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HessenbergTransformer_ESTest extends HessenbergTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, false);
      HessenbergTransformer hessenbergTransformer0 = new HessenbergTransformer(diagonalMatrix0);
      hessenbergTransformer0.getHouseholderVectorsRef();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(101, 101);
      HessenbergTransformer hessenbergTransformer0 = new HessenbergTransformer(blockRealMatrix0);
      // Undeclared exception!
      hessenbergTransformer0.getPT();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      HessenbergTransformer hessenbergTransformer0 = new HessenbergTransformer(array2DRowRealMatrix0);
      // Undeclared exception!
      try { 
        hessenbergTransformer0.getPT();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(120);
      HessenbergTransformer hessenbergTransformer0 = new HessenbergTransformer(diagonalMatrix0);
      // Undeclared exception!
      hessenbergTransformer0.getP();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      HessenbergTransformer hessenbergTransformer0 = new HessenbergTransformer(array2DRowRealMatrix0);
      // Undeclared exception!
      try { 
        hessenbergTransformer0.getP();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      HessenbergTransformer hessenbergTransformer0 = new HessenbergTransformer(array2DRowRealMatrix0);
      // Undeclared exception!
      try { 
        hessenbergTransformer0.getH();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[2][6];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, false);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.createMatrix(1502, 1502);
      HessenbergTransformer hessenbergTransformer0 = new HessenbergTransformer(realMatrix0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HessenbergTransformer hessenbergTransformer0 = null;
      try {
        hessenbergTransformer0 = new HessenbergTransformer((RealMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.HessenbergTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      HessenbergTransformer hessenbergTransformer0 = null;
      try {
        hessenbergTransformer0 = new HessenbergTransformer(array2DRowRealMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2588.65384;
      doubleArray0[2] = (-0.17313915700768417);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, false);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      HessenbergTransformer hessenbergTransformer0 = new HessenbergTransformer(realMatrix0);
      RealMatrix realMatrix1 = hessenbergTransformer0.getP();
      assertEquals(9, realMatrix1.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2588.65384;
      doubleArray0[2] = (-0.17313915700768417);
      doubleArray0[3] = 1.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, false);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      HessenbergTransformer hessenbergTransformer0 = new HessenbergTransformer(realMatrix0);
      RealMatrix realMatrix1 = hessenbergTransformer0.getP();
      assertEquals(9, realMatrix1.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      HessenbergTransformer hessenbergTransformer0 = new HessenbergTransformer(diagonalMatrix0);
      hessenbergTransformer0.getH();
      RealMatrix realMatrix0 = hessenbergTransformer0.getH();
      assertEquals(6, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, false);
      HessenbergTransformer hessenbergTransformer0 = new HessenbergTransformer(diagonalMatrix0);
      hessenbergTransformer0.getPT();
      RealMatrix realMatrix0 = hessenbergTransformer0.getPT();
      assertNotNull(realMatrix0);
      assertEquals(5, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, false);
      HessenbergTransformer hessenbergTransformer0 = new HessenbergTransformer(diagonalMatrix0);
      RealMatrix realMatrix0 = hessenbergTransformer0.getPT();
      RealMatrix realMatrix1 = hessenbergTransformer0.getP();
      assertTrue(realMatrix1.equals((Object)realMatrix0));
      assertEquals(5, realMatrix1.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      HessenbergTransformer hessenbergTransformer0 = null;
      try {
        hessenbergTransformer0 = new HessenbergTransformer(array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // non square (10x1) matrix
         //
         verifyException("org.apache.commons.math3.linear.HessenbergTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      HessenbergTransformer hessenbergTransformer0 = new HessenbergTransformer(array2DRowRealMatrix0);
      double[][] doubleArray0 = hessenbergTransformer0.getHouseholderVectorsRef();
      assertEquals(0, doubleArray0.length);
  }
}
