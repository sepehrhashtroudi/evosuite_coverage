/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 00:24:31 GMT 2022
 */

package org.apache.commons.math3.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.analysis.function.Signum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Signum_ESTest extends Signum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Signum signum0 = new Signum();
      double double0 = signum0.value(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Signum signum0 = new Signum();
      double double0 = signum0.value(1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Signum signum0 = new Signum();
      double double0 = signum0.value((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }
}
