/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:48:04 GMT 2022
 */

package org.apache.commons.math3.random;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.StableRandomGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StableRandomGenerator_ESTest extends StableRandomGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c(1437L);
      StableRandomGenerator stableRandomGenerator0 = new StableRandomGenerator(well19937c0, 1.5707963267948966, 0);
      double double0 = stableRandomGenerator0.nextNormalizedDouble();
      assertEquals(2.3315423727436113, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b(1L);
      StableRandomGenerator stableRandomGenerator0 = new StableRandomGenerator(well44497b0, 1.1050280679513555E-116, (-1.0));
      double double0 = stableRandomGenerator0.nextNormalizedDouble();
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b(0);
      StableRandomGenerator stableRandomGenerator0 = new StableRandomGenerator(well44497b0, 2.680137967689915E-304, 1.0008761540741556E-7);
      double double0 = stableRandomGenerator0.nextNormalizedDouble();
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      
      double double1 = stableRandomGenerator0.nextNormalizedDouble();
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b(1606L);
      StableRandomGenerator stableRandomGenerator0 = new StableRandomGenerator(well44497b0, 1.0, 0.0);
      well44497b0.index = (-4015);
      // Undeclared exception!
      try { 
        stableRandomGenerator0.nextNormalizedDouble();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4015
         //
         verifyException("org.apache.commons.math3.random.Well44497b", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b(1606L);
      StableRandomGenerator stableRandomGenerator0 = new StableRandomGenerator(well44497b0, 1.0, 0.0);
      double double0 = stableRandomGenerator0.nextNormalizedDouble();
      assertEquals(4.497258279989382, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b();
      StableRandomGenerator stableRandomGenerator0 = new StableRandomGenerator(well44497b0, 1, 1);
      stableRandomGenerator0.nextNormalizedDouble();
      double double0 = stableRandomGenerator0.nextNormalizedDouble();
      assertEquals((-1.0226305975165462), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      StableRandomGenerator stableRandomGenerator0 = new StableRandomGenerator(well19937c0, 2.0, 1.0);
      double double0 = stableRandomGenerator0.nextNormalizedDouble();
      assertEquals(0.17784800247183, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      StableRandomGenerator stableRandomGenerator0 = null;
      try {
        stableRandomGenerator0 = new StableRandomGenerator(well19937c0, 1.5707963267948966, 1.5707963267948966);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1.571 out of [-1, 1] range
         //
         verifyException("org.apache.commons.math3.random.StableRandomGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a(1471);
      StableRandomGenerator stableRandomGenerator0 = null;
      try {
        stableRandomGenerator0 = new StableRandomGenerator(well44497a0, 2.0, (-886.697507057));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -886.698 out of [-1, 1] range
         //
         verifyException("org.apache.commons.math3.random.StableRandomGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a();
      StableRandomGenerator stableRandomGenerator0 = null;
      try {
        stableRandomGenerator0 = new StableRandomGenerator(well1024a0, 2649.5812805448745, 2649.5812805448745);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2,649.581 out of (0, 2] range
         //
         verifyException("org.apache.commons.math3.random.StableRandomGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      StableRandomGenerator stableRandomGenerator0 = null;
      try {
        stableRandomGenerator0 = new StableRandomGenerator(well19937c0, (-5354L), (-5354L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -5,354 out of (0, 2] range
         //
         verifyException("org.apache.commons.math3.random.StableRandomGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StableRandomGenerator stableRandomGenerator0 = null;
      try {
        stableRandomGenerator0 = new StableRandomGenerator((RandomGenerator) null, (-975.9368379885912), (-975.9368379885912));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.random.StableRandomGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a();
      StableRandomGenerator stableRandomGenerator0 = new StableRandomGenerator(well1024a0, 0.8954198541765782, 0.0);
      double double0 = stableRandomGenerator0.nextNormalizedDouble();
      assertEquals(1.7066874640211482, double0, 0.01);
  }
}
