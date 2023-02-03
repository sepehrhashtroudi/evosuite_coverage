/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 06:02:35 GMT 2022
 */

package org.apache.commons.math3.random;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractWell_ESTest extends AbstractWell_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a();
      well44497a0.setSeed((-2717L));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a((-5580L));
      well44497a0.setSeed((int[]) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a((-1647L));
      int[] intArray0 = new int[5];
      well44497a0.setSeed(intArray0);
      assertEquals(5, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c(3141);
      well19937c0.setSeed(0L);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a(255);
      well1024a0.setSeed(1024);
  }
}
