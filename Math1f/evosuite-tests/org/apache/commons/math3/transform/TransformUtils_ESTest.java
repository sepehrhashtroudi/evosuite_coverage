/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:33:45 GMT 2022
 */

package org.apache.commons.math3.transform;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.transform.TransformUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TransformUtils_ESTest extends TransformUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[2][9];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      try { 
        TransformUtils.createComplexArray(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9 != 0
         //
         verifyException("org.apache.commons.math3.transform.TransformUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[0][8];
      try { 
        TransformUtils.createComplexArray(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 2
         //
         verifyException("org.apache.commons.math3.transform.TransformUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex[] complexArray0 = new Complex[5];
      Complex complex0 = Complex.valueOf((-1923.849119037), 1911.7);
      complexArray0[0] = complex0;
      Complex complex1 = Complex.NaN;
      complexArray0[1] = complex1;
      // Undeclared exception!
      try { 
        TransformUtils.scaleArray(complexArray0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.transform.TransformUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = TransformUtils.scaleArray(doubleArray0, 1911.7);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex[] complexArray0 = new Complex[0];
      Complex[] complexArray1 = TransformUtils.scaleArray(complexArray0, 412.5055);
      assertSame(complexArray0, complexArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = TransformUtils.scaleArray(doubleArray0, (-2321.9211475));
      assertSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = TransformUtils.exactLog2(1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex[] complexArray0 = new Complex[0];
      double[][] doubleArray0 = TransformUtils.createRealImaginaryArray(complexArray0);
      Complex[] complexArray1 = TransformUtils.createComplexArray(doubleArray0);
      assertNotSame(complexArray1, complexArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        TransformUtils.scaleArray((double[]) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.transform.TransformUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        TransformUtils.createRealImaginaryArray((Complex[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.transform.TransformUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        TransformUtils.createComplexArray((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.transform.TransformUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      try { 
        TransformUtils.exactLog2(84);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 84 is not a power of 2, consider padding for fix
         //
         verifyException("org.apache.commons.math3.transform.TransformUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = TransformUtils.exactLog2(4);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[][] doubleArray0 = new double[2][8];
      double[] doubleArray1 = new double[5];
      doubleArray0[1] = doubleArray1;
      try { 
        TransformUtils.createComplexArray(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 8
         //
         verifyException("org.apache.commons.math3.transform.TransformUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[][] doubleArray0 = new double[3][2];
      try { 
        TransformUtils.createComplexArray(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 2
         //
         verifyException("org.apache.commons.math3.transform.TransformUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.I;
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      double[][] doubleArray0 = TransformUtils.createRealImaginaryArray(complexArray0);
      assertEquals(2, doubleArray0.length);
      
      Complex[] complexArray1 = TransformUtils.createComplexArray(doubleArray0);
      assertEquals(4, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.I;
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      Complex[] complexArray1 = TransformUtils.scaleArray(complexArray0, 1322.29259346);
      assertEquals(4, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = TransformUtils.scaleArray(doubleArray0, 0.0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
  }
}
