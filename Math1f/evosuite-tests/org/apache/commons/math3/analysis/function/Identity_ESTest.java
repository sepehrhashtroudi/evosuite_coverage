/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 00:34:09 GMT 2022
 */

package org.apache.commons.math3.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.function.Identity;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Identity_ESTest extends Identity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Identity identity0 = new Identity();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(1307, 0, 0.0);
      DerivativeStructure derivativeStructure1 = DerivativeStructure.pow((-198.6296505975352), derivativeStructure0);
      DerivativeStructure derivativeStructure2 = new DerivativeStructure((-306.514006438), derivativeStructure1, 0.0, derivativeStructure0);
      DerivativeStructure derivativeStructure3 = derivativeStructure0.linearCombination(derivativeStructure1, derivativeStructure1, derivativeStructure1, derivativeStructure2, derivativeStructure2, derivativeStructure1, derivativeStructure1, derivativeStructure1);
      DerivativeStructure derivativeStructure4 = identity0.value(derivativeStructure3);
      assertFalse(derivativeStructure4.equals((Object)derivativeStructure2));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Identity identity0 = new Identity();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(0, 174, 174);
      DerivativeStructure derivativeStructure1 = identity0.value(derivativeStructure0);
      assertEquals(174, derivativeStructure1.getOrder());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Identity identity0 = new Identity();
      DerivativeStructure derivativeStructure0 = new DerivativeStructure(0, 0, (-2979), 0);
      DerivativeStructure derivativeStructure1 = identity0.value(derivativeStructure0);
      assertEquals(0, derivativeStructure1.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Identity identity0 = new Identity();
      double double0 = identity0.value((double) 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Identity identity0 = new Identity();
      double double0 = identity0.value((-3906.071065978984));
      assertEquals((-3906.071065978984), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Identity identity0 = new Identity();
      DerivativeStructure derivativeStructure0 = identity0.value((DerivativeStructure) null);
      assertNull(derivativeStructure0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Identity identity0 = new Identity();
      double double0 = identity0.value(3417.269620849);
      assertEquals(3417.269620849, double0, 0.01);
  }
}
