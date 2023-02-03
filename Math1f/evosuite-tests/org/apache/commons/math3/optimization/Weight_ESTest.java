/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:44:05 GMT 2022
 */

package org.apache.commons.math3.optimization;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.Weight;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Weight_ESTest extends Weight_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Weight weight0 = new Weight(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      Weight weight0 = new Weight(array2DRowRealMatrix0);
      RealMatrix realMatrix0 = weight0.getWeight();
      assertEquals(1, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(4259, 4259);
      Weight weight0 = new Weight(blockRealMatrix0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      Weight weight0 = null;
      try {
        weight0 = new Weight(array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one row
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Weight weight0 = null;
      try {
        weight0 = new Weight((RealMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.Weight", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      Weight weight0 = null;
      try {
        weight0 = new Weight(array2DRowRealMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[][] doubleArray0 = new double[6][7];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      Weight weight0 = null;
      try {
        weight0 = new Weight(array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // non square (7x6) matrix
         //
         verifyException("org.apache.commons.math3.optimization.Weight", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Weight weight0 = null;
      try {
        weight0 = new Weight((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(3282, 3282);
      Weight weight0 = new Weight(blockRealMatrix0);
      // Undeclared exception!
      weight0.getWeight();
  }
}
