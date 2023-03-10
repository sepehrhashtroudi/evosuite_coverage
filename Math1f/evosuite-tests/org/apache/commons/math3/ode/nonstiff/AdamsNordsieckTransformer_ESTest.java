/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 22:52:25 GMT 2022
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AdamsNordsieckTransformer_ESTest extends AdamsNordsieckTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AdamsNordsieckTransformer adamsNordsieckTransformer0 = AdamsNordsieckTransformer.getInstance(1);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 221.6;
      double[][] doubleArray1 = new double[7][1];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      doubleArray1[6] = doubleArray0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray1);
      // Undeclared exception!
      try { 
        adamsNordsieckTransformer0.updateHighOrderDerivativesPhase2(doubleArray0, doubleArray0, array2DRowRealMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AdamsNordsieckTransformer.getInstance(11);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AdamsNordsieckTransformer adamsNordsieckTransformer0 = AdamsNordsieckTransformer.getInstance(1);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 1;
      double[][] doubleArray1 = new double[3][1];
      Array2DRowRealMatrix array2DRowRealMatrix0 = adamsNordsieckTransformer0.initializeHighOrderDerivatives(1, doubleArray0, doubleArray1, doubleArray1);
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AdamsNordsieckTransformer adamsNordsieckTransformer0 = AdamsNordsieckTransformer.getInstance(1);
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      // Undeclared exception!
      try { 
        adamsNordsieckTransformer0.updateHighOrderDerivativesPhase1(array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AdamsNordsieckTransformer adamsNordsieckTransformer0 = AdamsNordsieckTransformer.getInstance(2);
      double[][] doubleArray0 = new double[9][5];
      // Undeclared exception!
      try { 
        adamsNordsieckTransformer0.initializeHighOrderDerivatives(2, (double[]) null, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AdamsNordsieckTransformer adamsNordsieckTransformer0 = AdamsNordsieckTransformer.getInstance(2);
      double[] doubleArray0 = new double[2];
      double[][] doubleArray1 = new double[6][3];
      // Undeclared exception!
      try { 
        adamsNordsieckTransformer0.initializeHighOrderDerivatives(0.0, doubleArray0, doubleArray1, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AdamsNordsieckTransformer adamsNordsieckTransformer0 = AdamsNordsieckTransformer.getInstance(1);
      double[] doubleArray0 = new double[9];
      double[][] doubleArray1 = new double[1][5];
      // Undeclared exception!
      try { 
        adamsNordsieckTransformer0.initializeHighOrderDerivatives(1560.9544107409358, doubleArray0, doubleArray1, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one row
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AdamsNordsieckTransformer adamsNordsieckTransformer0 = AdamsNordsieckTransformer.getInstance(2);
      int int0 = adamsNordsieckTransformer0.getNSteps();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AdamsNordsieckTransformer adamsNordsieckTransformer0 = AdamsNordsieckTransformer.getInstance(1);
      // Undeclared exception!
      try { 
        adamsNordsieckTransformer0.updateHighOrderDerivativesPhase1((Array2DRowRealMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }
}
