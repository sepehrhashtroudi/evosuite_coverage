/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:54:04 GMT 2022
 */

package org.apache.commons.math3.ml.distance;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.ml.distance.EuclideanDistance;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EuclideanDistance_ESTest extends EuclideanDistance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EuclideanDistance euclideanDistance0 = new EuclideanDistance();
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 1.0;
      double[] doubleArray1 = new double[2];
      double double0 = euclideanDistance0.compute(doubleArray1, doubleArray0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EuclideanDistance euclideanDistance0 = new EuclideanDistance();
      // Undeclared exception!
      try { 
        euclideanDistance0.compute((double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EuclideanDistance euclideanDistance0 = new EuclideanDistance();
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[6];
      // Undeclared exception!
      try { 
        euclideanDistance0.compute(doubleArray1, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EuclideanDistance euclideanDistance0 = new EuclideanDistance();
      double[] doubleArray0 = new double[1];
      double double0 = euclideanDistance0.compute(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }
}