/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:58:44 GMT 2022
 */

package org.apache.commons.math3.ml.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.ml.clustering.DoublePoint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DoublePoint_ESTest extends DoublePoint_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DoublePoint doublePoint0 = new DoublePoint((double[]) null);
      double[] doubleArray0 = doublePoint0.getPoint();
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      double[] doubleArray1 = doublePoint0.getPoint();
      assertArrayEquals(new double[] {}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoublePoint doublePoint0 = null;
      try {
        doublePoint0 = new DoublePoint((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ml.clustering.DoublePoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[22];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      boolean boolean0 = doublePoint0.equals("[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[22];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      boolean boolean0 = doublePoint0.equals(doublePoint0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[22];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      String string0 = doublePoint0.toString();
      assertEquals("[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[10];
      DoublePoint doublePoint0 = new DoublePoint(intArray0);
      double[] doubleArray0 = doublePoint0.getPoint();
      assertEquals(10, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[22];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      doublePoint0.hashCode();
  }
}
