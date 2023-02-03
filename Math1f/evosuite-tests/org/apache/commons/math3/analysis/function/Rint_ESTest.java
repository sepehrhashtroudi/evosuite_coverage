/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 00:21:25 GMT 2022
 */

package org.apache.commons.math3.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.analysis.function.Rint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Rint_ESTest extends Rint_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Rint rint0 = new Rint();
      double double0 = rint0.value(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Rint rint0 = new Rint();
      double double0 = rint0.value(808.64292197263);
      assertEquals(809.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Rint rint0 = new Rint();
      double double0 = rint0.value((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }
}