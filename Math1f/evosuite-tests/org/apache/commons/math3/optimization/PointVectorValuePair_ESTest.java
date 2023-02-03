/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:16:16 GMT 2022
 */

package org.apache.commons.math3.optimization;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PointVectorValuePair_ESTest extends PointVectorValuePair_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      PointVectorValuePair pointVectorValuePair0 = new PointVectorValuePair(doubleArray0, doubleArray0, false);
      double[] doubleArray1 = pointVectorValuePair0.getValueRef();
      assertSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      PointVectorValuePair pointVectorValuePair0 = new PointVectorValuePair(doubleArray0, doubleArray0, false);
      double[] doubleArray1 = pointVectorValuePair0.getValue();
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PointVectorValuePair pointVectorValuePair0 = new PointVectorValuePair((double[]) null, (double[]) null);
      double[] doubleArray0 = pointVectorValuePair0.getPointRef();
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      PointVectorValuePair pointVectorValuePair0 = new PointVectorValuePair(doubleArray0, doubleArray0, false);
      double[] doubleArray1 = pointVectorValuePair0.getPointRef();
      assertArrayEquals(new double[] {}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      PointVectorValuePair pointVectorValuePair0 = new PointVectorValuePair(doubleArray0, doubleArray0, false);
      double[] doubleArray1 = pointVectorValuePair0.getPoint();
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PointVectorValuePair pointVectorValuePair0 = new PointVectorValuePair((double[]) null, (double[]) null, true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PointVectorValuePair pointVectorValuePair0 = new PointVectorValuePair(doubleArray0, doubleArray0, true);
      double[] doubleArray1 = pointVectorValuePair0.getValueRef();
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PointVectorValuePair pointVectorValuePair0 = new PointVectorValuePair((double[]) null, (double[]) null);
      double[] doubleArray0 = pointVectorValuePair0.getValue();
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PointVectorValuePair pointVectorValuePair0 = new PointVectorValuePair(doubleArray0, doubleArray0);
      double[] doubleArray1 = pointVectorValuePair0.getValue();
      assertEquals(8, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PointVectorValuePair pointVectorValuePair0 = new PointVectorValuePair((double[]) null, (double[]) null);
      double[] doubleArray0 = pointVectorValuePair0.getPoint();
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PointVectorValuePair pointVectorValuePair0 = new PointVectorValuePair(doubleArray0, doubleArray0);
      double[] doubleArray1 = pointVectorValuePair0.getPoint();
      assertEquals(8, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PointVectorValuePair pointVectorValuePair0 = new PointVectorValuePair(doubleArray0, doubleArray0);
      double[] doubleArray1 = pointVectorValuePair0.getPointRef();
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PointVectorValuePair pointVectorValuePair0 = new PointVectorValuePair((double[]) null, (double[]) null);
      double[] doubleArray0 = pointVectorValuePair0.getValueRef();
      assertNull(doubleArray0);
  }
}
