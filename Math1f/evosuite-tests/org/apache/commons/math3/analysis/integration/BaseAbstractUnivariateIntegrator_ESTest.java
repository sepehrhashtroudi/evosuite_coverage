/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 23:25:34 GMT 2022
 */

package org.apache.commons.math3.analysis.integration;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Asinh;
import org.apache.commons.math3.analysis.function.Exp;
import org.apache.commons.math3.analysis.function.Power;
import org.apache.commons.math3.analysis.function.Sigmoid;
import org.apache.commons.math3.analysis.function.Sqrt;
import org.apache.commons.math3.analysis.function.Tan;
import org.apache.commons.math3.analysis.function.Tanh;
import org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator;
import org.apache.commons.math3.analysis.integration.MidPointIntegrator;
import org.apache.commons.math3.analysis.integration.RombergIntegrator;
import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;
import org.apache.commons.math3.analysis.integration.TrapezoidIntegrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseAbstractUnivariateIntegrator_ESTest extends BaseAbstractUnivariateIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MidPointIntegrator midPointIntegrator0 = new MidPointIntegrator();
      Exp exp0 = new Exp();
      double double0 = midPointIntegrator0.integrate(155, exp0, (-2990.342), (-942.606052));
      assertEquals(1.0E-15, midPointIntegrator0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(3, midPointIntegrator0.getMinimalIterationCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      simpsonIntegrator0.getMin();
      assertEquals(3, simpsonIntegrator0.getMinimalIterationCount());
      assertEquals(1.0E-15, simpsonIntegrator0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      Sigmoid sigmoid0 = new Sigmoid();
      double double0 = trapezoidIntegrator0.integrate(638, sigmoid0, 380.0131327041, 2070.27842326394);
      assertEquals(1690.2652905598402, double0, 0.01);
      
      double double1 = trapezoidIntegrator0.getMin();
      assertEquals(1.0E-15, trapezoidIntegrator0.getAbsoluteAccuracy(), 0.01);
      assertEquals(3, trapezoidIntegrator0.getMinimalIterationCount());
      assertEquals(380.0131327041, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      Exp exp0 = new Exp();
      simpsonIntegrator0.setup(64, exp0, (-2173.744060971885), 64);
      double double0 = simpsonIntegrator0.getMin();
      assertEquals((-2173.744060971885), double0, 0.01);
      assertEquals(1.0E-15, simpsonIntegrator0.getAbsoluteAccuracy(), 0.01);
      assertEquals(3, simpsonIntegrator0.getMinimalIterationCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MidPointIntegrator midPointIntegrator0 = new MidPointIntegrator();
      midPointIntegrator0.getMax();
      assertEquals(3, midPointIntegrator0.getMinimalIterationCount());
      assertEquals(1.0E-15, midPointIntegrator0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      assertEquals(1.0E-6, simpsonIntegrator0.getRelativeAccuracy(), 0.01);
      
      Tanh tanh0 = new Tanh();
      double double0 = simpsonIntegrator0.integrate(64, tanh0, 5.0, 64);
      assertEquals(58.99993853685205, double0, 0.01);
      
      int int0 = simpsonIntegrator0.getIterations();
      assertEquals(3, simpsonIntegrator0.getMinimalIterationCount());
      assertEquals(1.0E-15, simpsonIntegrator0.getAbsoluteAccuracy(), 0.01);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      Sigmoid sigmoid0 = new Sigmoid();
      double double0 = trapezoidIntegrator0.integrate(638, sigmoid0, 380.0131327041, 2070.27842326394);
      assertEquals(1690.2652905598402, double0, 0.01);
      
      int int0 = trapezoidIntegrator0.getEvaluations();
      assertEquals(9, int0);
      assertEquals(3, trapezoidIntegrator0.getMinimalIterationCount());
      assertEquals(1.0E-6, trapezoidIntegrator0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, trapezoidIntegrator0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IterativeLegendreGaussIntegrator iterativeLegendreGaussIntegrator0 = new IterativeLegendreGaussIntegrator(732, 732, 0.0);
      double double0 = iterativeLegendreGaussIntegrator0.getAbsoluteAccuracy();
      assertEquals(0.0, double0, 0.01);
      assertEquals(732.0, iterativeLegendreGaussIntegrator0.getRelativeAccuracy(), 0.01);
      assertEquals(3, iterativeLegendreGaussIntegrator0.getMinimalIterationCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IterativeLegendreGaussIntegrator iterativeLegendreGaussIntegrator0 = new IterativeLegendreGaussIntegrator(205, 205, 70.0);
      double double0 = iterativeLegendreGaussIntegrator0.getAbsoluteAccuracy();
      assertEquals(70.0, double0, 0.01);
      assertEquals(205.0, iterativeLegendreGaussIntegrator0.getRelativeAccuracy(), 0.01);
      assertEquals(3, iterativeLegendreGaussIntegrator0.getMinimalIterationCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IterativeLegendreGaussIntegrator iterativeLegendreGaussIntegrator0 = new IterativeLegendreGaussIntegrator(205, 205, 70.0);
      Tan tan0 = new Tan();
      iterativeLegendreGaussIntegrator0.setup(205, tan0, (-3514.6725), 1.0E-6);
      double double0 = iterativeLegendreGaussIntegrator0.computeObjectiveValue((-484.19));
      assertEquals((-0.404909291123119), double0, 0.01);
      assertEquals(3, iterativeLegendreGaussIntegrator0.getMinimalIterationCount());
      assertEquals(70.0, iterativeLegendreGaussIntegrator0.getAbsoluteAccuracy(), 0.01);
      assertEquals(205.0, iterativeLegendreGaussIntegrator0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      Power power0 = new Power(1.0E-15);
      try { 
        simpsonIntegrator0.setup(0, power0, 1874, (-2837.22));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,874, -2,837.22]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      try { 
        rombergIntegrator0.setup(0, (UnivariateFunction) null, 0, (-3174.674327975823));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      Sqrt sqrt0 = new Sqrt();
      try { 
        rombergIntegrator0.integrate(0, sqrt0, 3256.0, 3256.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,256, 3,256]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      try { 
        trapezoidIntegrator0.integrate(64, (UnivariateFunction) null, 1010.91517, 1010.91517);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IterativeLegendreGaussIntegrator iterativeLegendreGaussIntegrator0 = new IterativeLegendreGaussIntegrator(Integer.MAX_VALUE, Integer.MAX_VALUE, 1.0E-15);
      Asinh asinh0 = new Asinh();
      // Undeclared exception!
      try { 
        iterativeLegendreGaussIntegrator0.integrate(1, asinh0, 0.0, Integer.MAX_VALUE);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      try { 
        trapezoidIntegrator0.computeObjectiveValue((-1483.832801));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IterativeLegendreGaussIntegrator iterativeLegendreGaussIntegrator0 = new IterativeLegendreGaussIntegrator(2863, 2863, (-555.15862));
      double double0 = iterativeLegendreGaussIntegrator0.getAbsoluteAccuracy();
      assertEquals(2863.0, iterativeLegendreGaussIntegrator0.getRelativeAccuracy(), 0.01);
      assertEquals((-555.15862), double0, 0.01);
      assertEquals(3, iterativeLegendreGaussIntegrator0.getMinimalIterationCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MidPointIntegrator midPointIntegrator0 = new MidPointIntegrator();
      int int0 = midPointIntegrator0.getMinimalIterationCount();
      assertEquals(3, int0);
      assertEquals(1.0E-6, midPointIntegrator0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, midPointIntegrator0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = null;
      try {
        trapezoidIntegrator0 = new TrapezoidIntegrator(2021, 2021);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2,021 is smaller than, or equal to, the minimum (2,021)
         //
         verifyException("org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = null;
      try {
        rombergIntegrator0 = new RombergIntegrator(Integer.MAX_VALUE, 1.0E-15, 0, 64);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      simpsonIntegrator0.getEvaluations();
      assertEquals(3, simpsonIntegrator0.getMinimalIterationCount());
      assertEquals(1.0E-15, simpsonIntegrator0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-6, simpsonIntegrator0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      Tanh tanh0 = new Tanh();
      try { 
        simpsonIntegrator0.integrate(22, tanh0, 1.0E-6, 64);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (22) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator", e);
      }
  }
}
