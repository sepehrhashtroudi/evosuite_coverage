/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 23:22:40 GMT 2022
 */

package org.apache.commons.math3.analysis.integration;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.function.Floor;
import org.apache.commons.math3.analysis.function.Power;
import org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator;
import org.apache.commons.math3.analysis.integration.MidPointIntegrator;
import org.apache.commons.math3.analysis.integration.TrapezoidIntegrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TrapezoidIntegrator_ESTest extends TrapezoidIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      MidPointIntegrator midPointIntegrator0 = new MidPointIntegrator();
      double double0 = trapezoidIntegrator0.stage(midPointIntegrator0, 64);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      Floor floor0 = new Floor();
      trapezoidIntegrator0.integrate(64, floor0, (-1195.0325936), 64);
      double double0 = trapezoidIntegrator0.doIntegrate();
      assertEquals((-712612.4479775999), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      // Undeclared exception!
      try { 
        trapezoidIntegrator0.stage((BaseAbstractUnivariateIntegrator) null, 867);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.integration.TrapezoidIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      Power power0 = new Power(3902.862618106316);
      trapezoidIntegrator0.setup(Integer.MAX_VALUE, power0, 687.6005, 3902.862618106316);
      // Undeclared exception!
      trapezoidIntegrator0.doIntegrate();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = null;
      try {
        trapezoidIntegrator0 = new TrapezoidIntegrator((-3090), 3117);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3,090 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = null;
      try {
        trapezoidIntegrator0 = new TrapezoidIntegrator((-3016.0), 0, 0, 565);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      Power power0 = new Power(3902.862618106316);
      trapezoidIntegrator0.setup(239, power0, 687.6005, 3902.862618106316);
      try { 
        trapezoidIntegrator0.doIntegrate();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (239) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      Power power0 = new Power(1.0E-6);
      trapezoidIntegrator0.setup(239, power0, 687.6005, Integer.MAX_VALUE);
      double double0 = trapezoidIntegrator0.doIntegrate();
      assertEquals(2.1475254779555035E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = null;
      try {
        trapezoidIntegrator0 = new TrapezoidIntegrator(3, 1456);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1,456 is larger than, or equal to, the maximum (64)
         //
         verifyException("org.apache.commons.math3.analysis.integration.TrapezoidIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator(3, 64);
      assertEquals(1.0E-15, trapezoidIntegrator0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = null;
      try {
        trapezoidIntegrator0 = new TrapezoidIntegrator((-2061.309574314039), 0.0, 4, 2287);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2,287 is larger than, or equal to, the maximum (64)
         //
         verifyException("org.apache.commons.math3.analysis.integration.TrapezoidIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator(1.1984128162292276E269, 1.1984128162292276E269, 3, 4);
      assertEquals(1.1984128162292276E269, trapezoidIntegrator0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      try { 
        trapezoidIntegrator0.stage(trapezoidIntegrator0, (-2054114792));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator", e);
      }
  }
}