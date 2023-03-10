/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 00:02:31 GMT 2022
 */

package org.apache.commons.math3.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.function.Expm1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Expm1_ESTest extends Expm1_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(0, 273, (-1589.26951298611));
      DerivativeStructure derivativeStructure1 = DerivativeStructure.hypot(derivativeStructure0, derivativeStructure0);
      DerivativeStructure derivativeStructure2 = new DerivativeStructure((-1.7335469415174996E-8), derivativeStructure1, 0, derivativeStructure0);
      DerivativeStructure derivativeStructure3 = expm1_0.value(derivativeStructure2);
      assertNotSame(derivativeStructure0, derivativeStructure3);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(0, 0, 1.0);
      DerivativeStructure derivativeStructure1 = expm1_0.value(derivativeStructure0);
      assertFalse(derivativeStructure1.equals((Object)derivativeStructure0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(1, 1);
      DerivativeStructure derivativeStructure1 = expm1_0.value(derivativeStructure0);
      assertEquals(0.0, derivativeStructure1.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      double double0 = expm1_0.value(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      double double0 = expm1_0.value((-1.0));
      assertEquals((-0.6321205588285577), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      double double0 = expm1_0.value(1025.4);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      try { 
        expm1_0.value((DerivativeStructure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.function.Expm1", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      UnivariateFunction univariateFunction0 = expm1_0.derivative();
      assertNotNull(univariateFunction0);
  }
}
