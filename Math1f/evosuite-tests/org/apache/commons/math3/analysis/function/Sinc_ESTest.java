/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 00:30:10 GMT 2022
 */

package org.apache.commons.math3.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.function.Sinc;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sinc_ESTest extends Sinc_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(1817, 0, 0.006);
      DerivativeStructure derivativeStructure1 = sinc0.value(derivativeStructure0);
      assertEquals(0.9999940000108, derivativeStructure1.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Sinc sinc0 = new Sinc(true);
      double double0 = sinc0.value((-9.250999892681514E-5));
      assertEquals(0.99999998592249, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      double double0 = sinc0.value(0.006);
      assertEquals(0.9999940000108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(628, 0, 0, 628);
      DerivativeStructure derivativeStructure1 = sinc0.value(derivativeStructure0);
      assertEquals((-11), derivativeStructure1.getExponent());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(2, 0, 2);
      DerivativeStructure derivativeStructure1 = new DerivativeStructure(0.0, derivativeStructure0, 0.0, derivativeStructure0);
      DerivativeStructure derivativeStructure2 = derivativeStructure1.log10();
      DerivativeStructure derivativeStructure3 = sinc0.value(derivativeStructure2);
      assertEquals(Double.NaN, derivativeStructure3.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sinc sinc0 = new Sinc(true);
      double double0 = sinc0.value(1957.183);
      assertEquals((-8.843543878338077E-5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Sinc sinc0 = new Sinc(false);
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(0, 750, (-3074.593238588942));
      // Undeclared exception!
      sinc0.value(derivativeStructure0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Sinc sinc0 = new Sinc(true);
      // Undeclared exception!
      try { 
        sinc0.value((DerivativeStructure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.function.Sinc", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Sinc sinc0 = new Sinc(true);
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(0, 2);
      DerivativeStructure derivativeStructure1 = sinc0.value(derivativeStructure0);
      assertEquals(1.0, derivativeStructure1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(0, 120);
      DerivativeStructure derivativeStructure1 = sinc0.value(derivativeStructure0);
      DerivativeStructure derivativeStructure2 = sinc0.value(derivativeStructure1);
      assertEquals(0.8414709848078965, derivativeStructure2.getReal(), 0.01);
      assertEquals(1.0, derivativeStructure1.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      UnivariateFunction univariateFunction0 = sinc0.derivative();
      assertNotNull(univariateFunction0);
  }
}
