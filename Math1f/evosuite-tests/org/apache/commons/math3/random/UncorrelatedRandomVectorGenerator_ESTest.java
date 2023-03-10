/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:42:45 GMT 2022
 */

package org.apache.commons.math3.random;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.random.GaussianRandomGenerator;
import org.apache.commons.math3.random.NormalizedRandomGenerator;
import org.apache.commons.math3.random.StableRandomGenerator;
import org.apache.commons.math3.random.UncorrelatedRandomVectorGenerator;
import org.apache.commons.math3.random.UniformRandomGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well44497b;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UncorrelatedRandomVectorGenerator_ESTest extends UncorrelatedRandomVectorGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator(0, (NormalizedRandomGenerator) null);
      double[] doubleArray0 = uncorrelatedRandomVectorGenerator0.nextVector();
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b();
      GaussianRandomGenerator gaussianRandomGenerator0 = new GaussianRandomGenerator(well44497b0);
      UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator(3748, gaussianRandomGenerator0);
      uncorrelatedRandomVectorGenerator0.nextVector();
      // Undeclared exception!
      uncorrelatedRandomVectorGenerator0.nextVector();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator(doubleArray0, doubleArray0, (NormalizedRandomGenerator) null);
      // Undeclared exception!
      try { 
        uncorrelatedRandomVectorGenerator0.nextVector();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.random.UncorrelatedRandomVectorGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a((long) 449);
      well19937a0.index = (-1925);
      UniformRandomGenerator uniformRandomGenerator0 = new UniformRandomGenerator(well19937a0);
      UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator(449, uniformRandomGenerator0);
      // Undeclared exception!
      try { 
        uncorrelatedRandomVectorGenerator0.nextVector();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1925
         //
         verifyException("org.apache.commons.math3.random.Well19937a", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a();
      StableRandomGenerator stableRandomGenerator0 = new StableRandomGenerator(well44497a0, 0.6366197723675814, 0.6366197723675814);
      UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = null;
      try {
        uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator((double[]) null, (double[]) null, stableRandomGenerator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.random.UncorrelatedRandomVectorGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[6];
      Well1024a well1024a0 = new Well1024a(intArray0);
      UniformRandomGenerator uniformRandomGenerator0 = new UniformRandomGenerator(well1024a0);
      UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = null;
      try {
        uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator((-922), uniformRandomGenerator0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.random.UncorrelatedRandomVectorGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      Well512a well512a0 = new Well512a();
      GaussianRandomGenerator gaussianRandomGenerator0 = new GaussianRandomGenerator(well512a0);
      UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = null;
      try {
        uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator(doubleArray0, doubleArray1, gaussianRandomGenerator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 7
         //
         verifyException("org.apache.commons.math3.random.UncorrelatedRandomVectorGenerator", e);
      }
  }
}
