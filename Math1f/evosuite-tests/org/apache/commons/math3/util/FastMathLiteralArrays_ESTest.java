/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 21:58:42 GMT 2022
 */

package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.util.FastMathLiteralArrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastMathLiteralArrays_ESTest extends FastMathLiteralArrays_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = FastMathLiteralArrays.loadExpIntB();
      assertEquals(1500, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = FastMathLiteralArrays.loadExpIntA();
      assertEquals(1500, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[][] doubleArray0 = FastMathLiteralArrays.loadLnMant();
      assertEquals(1024, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = FastMathLiteralArrays.loadExpFracB();
      assertEquals(1025, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = FastMathLiteralArrays.loadExpFracA();
      assertEquals(1025, doubleArray0.length);
  }
}
