/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 23:21:20 GMT 2022
 */

package org.apache.commons.math3.analysis.integration;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.function.Gaussian;
import org.apache.commons.math3.analysis.function.Sinh;
import org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator;
import org.apache.commons.math3.analysis.integration.MidPointIntegrator;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MidPointIntegrator_ESTest extends MidPointIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MidPointIntegrator midPointIntegrator0 = new MidPointIntegrator();
      Gaussian gaussian0 = new Gaussian((-1.0), 1.0, 2608.0);
      double double0 = midPointIntegrator0.integrate(32, gaussian0, 0.0, 1.0E-15);
      assertEquals((-9.999999264885796E-16), double0, 0.01);
      
      double double1 = midPointIntegrator0.doIntegrate();
      assertEquals((-9.999999264885798E-16), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MidPointIntegrator midPointIntegrator0 = new MidPointIntegrator();
      try { 
        midPointIntegrator0.doIntegrate();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MidPointIntegrator midPointIntegrator0 = null;
      try {
        midPointIntegrator0 = new MidPointIntegrator(0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MidPointIntegrator midPointIntegrator0 = null;
      try {
        midPointIntegrator0 = new MidPointIntegrator(1881.2326637673102, 0.0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MidPointIntegrator midPointIntegrator0 = new MidPointIntegrator();
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = (double) 2632;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      midPointIntegrator0.setup(2632, polynomialFunction0, 1615.738626, 3127.0);
      // Undeclared exception!
      midPointIntegrator0.doIntegrate();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MidPointIntegrator midPointIntegrator0 = null;
      try {
        midPointIntegrator0 = new MidPointIntegrator(999, 1168);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1,168 is larger than, or equal to, the maximum (64)
         //
         verifyException("org.apache.commons.math3.analysis.integration.MidPointIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MidPointIntegrator midPointIntegrator0 = new MidPointIntegrator(3, 58);
      assertEquals(1.0E-6, BaseAbstractUnivariateIntegrator.DEFAULT_RELATIVE_ACCURACY, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MidPointIntegrator midPointIntegrator0 = null;
      try {
        midPointIntegrator0 = new MidPointIntegrator(0.0, 0.0, 1269, 3380);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3,380 is larger than, or equal to, the maximum (64)
         //
         verifyException("org.apache.commons.math3.analysis.integration.MidPointIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MidPointIntegrator midPointIntegrator0 = new MidPointIntegrator((-450), (-450), 2, 45);
      assertEquals(3, BaseAbstractUnivariateIntegrator.DEFAULT_MIN_ITERATIONS_COUNT);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      MidPointIntegrator midPointIntegrator0 = new MidPointIntegrator();
      Sinh sinh0 = new Sinh();
      midPointIntegrator0.setup(908, sinh0, 3, 908);
      double double0 = midPointIntegrator0.doIntegrate();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }
}
