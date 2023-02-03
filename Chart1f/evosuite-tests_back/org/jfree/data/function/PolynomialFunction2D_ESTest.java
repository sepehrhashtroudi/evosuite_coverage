/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 20:18:53 GMT 2022
 */

package org.jfree.data.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.function.PolynomialFunction2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolynomialFunction2D_ESTest extends PolynomialFunction2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      PolynomialFunction2D polynomialFunction2D1 = new PolynomialFunction2D(doubleArray0);
      boolean boolean0 = polynomialFunction2D0.equals(polynomialFunction2D1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = 782.3998029;
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      double double0 = polynomialFunction2D0.getValue(3371.278583426344);
      assertEquals(8.892380050059042E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1817.28868117307);
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      double double0 = polynomialFunction2D0.getValue(497.675118410396);
      assertEquals((-1817.28868117307), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      int int0 = polynomialFunction2D0.getOrder();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      int int0 = polynomialFunction2D0.getOrder();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      double[] doubleArray1 = polynomialFunction2D0.getCoefficients();
      assertNotSame(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[19];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      Object object0 = new Object();
      boolean boolean0 = polynomialFunction2D0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[19];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      double double0 = polynomialFunction2D0.getValue((-1670252219));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PolynomialFunction2D polynomialFunction2D0 = null;
      try {
        polynomialFunction2D0 = new PolynomialFunction2D((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'coefficients' argument
         //
         verifyException("org.jfree.data.function.PolynomialFunction2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[19];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      int int0 = polynomialFunction2D0.getOrder();
      assertEquals(18, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[19];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      double[] doubleArray1 = polynomialFunction2D0.getCoefficients();
      assertNotSame(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[19];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      polynomialFunction2D0.hashCode();
  }
}