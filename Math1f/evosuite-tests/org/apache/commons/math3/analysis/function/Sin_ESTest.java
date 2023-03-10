/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 00:33:27 GMT 2022
 */

package org.apache.commons.math3.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.function.Sin;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sin_ESTest extends Sin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Sin sin0 = new Sin();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(1, 1, 1);
      DerivativeStructure derivativeStructure1 = sin0.value(derivativeStructure0);
      assertEquals(1, derivativeStructure1.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Sin sin0 = new Sin();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(1, 1, 0, (-1.5707963267948966));
      DerivativeStructure derivativeStructure1 = sin0.value(derivativeStructure0);
      assertEquals(1, derivativeStructure1.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Sin sin0 = new Sin();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(0, 0);
      DerivativeStructure derivativeStructure1 = derivativeStructure0.log10();
      DerivativeStructure derivativeStructure2 = sin0.value(derivativeStructure1);
      assertEquals(Double.NaN, derivativeStructure2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Sin sin0 = new Sin();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(0, 0);
      DerivativeStructure derivativeStructure1 = sin0.value(derivativeStructure0);
      assertNotSame(derivativeStructure0, derivativeStructure1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Sin sin0 = new Sin();
      double double0 = sin0.value(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Sin sin0 = new Sin();
      double double0 = sin0.value((-2023.98489));
      assertEquals((-0.716813200247346), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Sin sin0 = new Sin();
      // Undeclared exception!
      try { 
        sin0.value((DerivativeStructure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.function.Sin", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Sin sin0 = new Sin();
      double double0 = sin0.value(0.7853981633974483);
      assertEquals(0.7071067811865475, double0, 0.01);
  }
}
