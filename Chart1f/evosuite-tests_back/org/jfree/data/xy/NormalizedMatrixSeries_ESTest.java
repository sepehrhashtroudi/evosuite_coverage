/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:37:44 GMT 2022
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xy.NormalizedMatrixSeries;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NormalizedMatrixSeries_ESTest extends NormalizedMatrixSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("", 8, 23);
      normalizedMatrixSeries0.setScaleFactor(3141.05926632347);
      normalizedMatrixSeries0.update(0, 8, 3141.05926632347);
      normalizedMatrixSeries0.getItem(8);
      assertEquals(3141.05926632347, normalizedMatrixSeries0.getScaleFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("", 92, 0);
      assertEquals(1.0, normalizedMatrixSeries0.getScaleFactor(), 0.01);
      
      normalizedMatrixSeries0.setScaleFactor(0.0);
      double double0 = normalizedMatrixSeries0.getScaleFactor();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("R+2s|>kR%|", 1, 1);
      normalizedMatrixSeries0.setScaleFactor((-1786.84482));
      double double0 = normalizedMatrixSeries0.getScaleFactor();
      assertEquals((-1786.84482), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("", 8, 23);
      double[][] doubleArray0 = new double[4][4];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (double) 23;
      doubleArray1[8] = (double) 8;
      doubleArray0[0] = doubleArray1;
      normalizedMatrixSeries0.data = doubleArray0;
      normalizedMatrixSeries0.update(0, 8, 1.0);
      Number number0 = normalizedMatrixSeries0.getItem(0);
      assertEquals((-3.2857142857142856), number0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("", 8, 23);
      normalizedMatrixSeries0.data = null;
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.update(0, 8, 3141.0592663235);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.MatrixSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries(")Wz\"v@0d]v0(G", 3, 3);
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.update(1662, 4962, 1777.65063859);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1662
         //
         verifyException("org.jfree.data.xy.MatrixSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("V2!5tkayzw[M<x,", 212, 4);
      normalizedMatrixSeries0.data = null;
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.getItem((-1322));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.MatrixSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("#UlVIV", 1, 1);
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.getItem(2896);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2896
         //
         verifyException("org.jfree.data.xy.MatrixSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("org.jfree.data.general.SeriesChangeInfo", 5111, 0);
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.getItem(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.jfree.data.xy.MatrixSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("<tY7>Jc-'m#ZphZ|@`", 274, 274);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = null;
      try {
        normalizedMatrixSeries0 = new NormalizedMatrixSeries("r;/av", 1896, (-213));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.MatrixSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = null;
      try {
        normalizedMatrixSeries0 = new NormalizedMatrixSeries((String) null, 2217, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = null;
      try {
        normalizedMatrixSeries0 = new NormalizedMatrixSeries("org.jfree.data.category.DefaultCategoryDataset", 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("", 8, 23);
      normalizedMatrixSeries0.zeroAll();
      assertEquals(1.0, normalizedMatrixSeries0.getScaleFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("", 8, 23);
      normalizedMatrixSeries0.setScaleFactor(3141.05926632347);
      normalizedMatrixSeries0.getItem(8);
      assertEquals(3141.05926632347, normalizedMatrixSeries0.getScaleFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("", 8, 23);
      double double0 = normalizedMatrixSeries0.getScaleFactor();
      assertEquals(1.0, double0, 0.01);
  }
}
