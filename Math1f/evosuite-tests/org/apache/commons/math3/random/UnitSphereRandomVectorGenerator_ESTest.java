/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:46:45 GMT 2022
 */

package org.apache.commons.math3.random;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnitSphereRandomVectorGenerator_ESTest extends UnitSphereRandomVectorGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      double[] doubleArray0 = unitSphereRandomVectorGenerator0.nextVector();
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a(412);
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(412, well19937a0);
      unitSphereRandomVectorGenerator0.nextVector();
      unitSphereRandomVectorGenerator0.nextVector();
      unitSphereRandomVectorGenerator0.nextVector();
      unitSphereRandomVectorGenerator0.nextVector();
      unitSphereRandomVectorGenerator0.nextVector();
      unitSphereRandomVectorGenerator0.nextVector();
      unitSphereRandomVectorGenerator0.nextVector();
      unitSphereRandomVectorGenerator0.nextVector();
      unitSphereRandomVectorGenerator0.nextVector();
      unitSphereRandomVectorGenerator0.nextVector();
      unitSphereRandomVectorGenerator0.nextVector();
      unitSphereRandomVectorGenerator0.nextVector();
      double[] doubleArray0 = unitSphereRandomVectorGenerator0.nextVector();
      assertEquals(412, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(1762, (RandomGenerator) null);
      // Undeclared exception!
      try { 
        unitSphereRandomVectorGenerator0.nextVector();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Well512a well512a0 = new Well512a((long) 449);
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(449, well512a0);
      well512a0.index = 449;
      // Undeclared exception!
      try { 
        unitSphereRandomVectorGenerator0.nextVector();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 449
         //
         verifyException("org.apache.commons.math3.random.Well512a", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator((-4397), jDKRandomGenerator0);
      // Undeclared exception!
      try { 
        unitSphereRandomVectorGenerator0.nextVector();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.random.UnitSphereRandomVectorGenerator", e);
      }
  }
}
