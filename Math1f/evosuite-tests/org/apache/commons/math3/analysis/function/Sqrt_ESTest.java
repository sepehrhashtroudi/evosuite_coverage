/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 00:28:39 GMT 2022
 */

package org.apache.commons.math3.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.function.Sqrt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sqrt_ESTest extends Sqrt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Sqrt sqrt0 = new Sqrt();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(27, 0, (-2.0));
      DerivativeStructure derivativeStructure1 = sqrt0.value(derivativeStructure0);
      assertNotSame(derivativeStructure0, derivativeStructure1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Sqrt sqrt0 = new Sqrt();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(0, 0);
      DerivativeStructure derivativeStructure1 = sqrt0.value(derivativeStructure0);
      assertEquals(0.0, derivativeStructure1.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Sqrt sqrt0 = new Sqrt();
      double double0 = sqrt0.value(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Sqrt sqrt0 = new Sqrt();
      // Undeclared exception!
      try { 
        sqrt0.value((DerivativeStructure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.function.Sqrt", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Sqrt sqrt0 = new Sqrt();
      UnivariateFunction univariateFunction0 = sqrt0.derivative();
      assertNotNull(univariateFunction0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Sqrt sqrt0 = new Sqrt();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(1, 1);
      DerivativeStructure derivativeStructure1 = sqrt0.value(derivativeStructure0);
      assertEquals(1, derivativeStructure1.getOrder());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Sqrt sqrt0 = new Sqrt();
      double double0 = sqrt0.value((double) 1);
      assertEquals(1.0, double0, 0.01);
  }
}
