/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:37:56 GMT 2022
 */

package org.apache.commons.math3.random;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDKRandomGenerator_ESTest extends JDKRandomGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      // Undeclared exception!
      try { 
        jDKRandomGenerator0.setSeed((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.random.RandomGeneratorFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      int[] intArray0 = new int[1];
      jDKRandomGenerator0.setSeed(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      jDKRandomGenerator0.setSeed(0);
  }
}
