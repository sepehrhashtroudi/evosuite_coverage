/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 00:38:42 GMT 2022
 */

package org.apache.commons.math3.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.analysis.function.Subtract;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Subtract_ESTest extends Subtract_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Subtract subtract0 = new Subtract();
      double double0 = subtract0.value(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Subtract subtract0 = new Subtract();
      double double0 = subtract0.value((-1895.078914), (-3044.1));
      assertEquals(1149.021086, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Subtract subtract0 = new Subtract();
      double double0 = subtract0.value((-1895.078914), 0.0);
      assertEquals((-1895.078914), double0, 0.01);
  }
}
