/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 00:01:47 GMT 2022
 */

package org.apache.commons.math3.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.function.Inverse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Inverse_ESTest extends Inverse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(1, 1, (-165.89));
      DerivativeStructure derivativeStructure1 = inverse0.value(derivativeStructure0);
      assertEquals(1, derivativeStructure1.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(0, 0, Double.POSITIVE_INFINITY);
      DerivativeStructure derivativeStructure1 = inverse0.value(derivativeStructure0);
      assertEquals(0, derivativeStructure1.getOrder());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      double double0 = inverse0.value(Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      double double0 = inverse0.value((-687.977511633577));
      assertEquals((-0.001453535883208649), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      // Undeclared exception!
      try { 
        inverse0.value((DerivativeStructure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.function.Inverse", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(1009, 0, 131, 391.0);
      DerivativeStructure derivativeStructure1 = inverse0.value(derivativeStructure0);
      assertEquals(1009, derivativeStructure1.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      double double0 = inverse0.value(669.548646313445);
      assertEquals(0.0014935434572320174, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      UnivariateFunction univariateFunction0 = inverse0.derivative();
      assertNotNull(univariateFunction0);
  }
}
