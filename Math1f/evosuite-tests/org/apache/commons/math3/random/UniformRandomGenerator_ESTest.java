/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:59:25 GMT 2022
 */

package org.apache.commons.math3.random;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.UniformRandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UniformRandomGenerator_ESTest extends UniformRandomGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UniformRandomGenerator uniformRandomGenerator0 = new UniformRandomGenerator((RandomGenerator) null);
      // Undeclared exception!
      try { 
        uniformRandomGenerator0.nextNormalizedDouble();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.random.UniformRandomGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c((-227L));
      UniformRandomGenerator uniformRandomGenerator0 = new UniformRandomGenerator(well19937c0);
      well19937c0.index = 1381310;
      // Undeclared exception!
      try { 
        uniformRandomGenerator0.nextNormalizedDouble();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1381310
         //
         verifyException("org.apache.commons.math3.random.Well19937c", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      UniformRandomGenerator uniformRandomGenerator0 = new UniformRandomGenerator(jDKRandomGenerator0);
      uniformRandomGenerator0.nextNormalizedDouble();
      uniformRandomGenerator0.nextNormalizedDouble();
      uniformRandomGenerator0.nextNormalizedDouble();
      uniformRandomGenerator0.nextNormalizedDouble();
      double double0 = uniformRandomGenerator0.nextNormalizedDouble();
      assertEquals((-0.34641016151377535), double0, 0.01);
      
      uniformRandomGenerator0.nextNormalizedDouble();
      double double1 = uniformRandomGenerator0.nextNormalizedDouble();
      assertEquals(0.34641016151377535, double1, 0.01);
  }
}
