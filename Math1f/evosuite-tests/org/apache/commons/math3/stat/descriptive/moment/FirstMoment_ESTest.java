/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:26:24 GMT 2022
 */

package org.apache.commons.math3.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.stat.descriptive.moment.FirstMoment;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FirstMoment_ESTest extends FirstMoment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      firstMoment0.n = (-7495L);
      firstMoment0.increment(Double.NaN);
      assertEquals((-7494L), firstMoment0.getN());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      firstMoment0.increment(0.0);
      double double0 = firstMoment0.getResult();
      assertEquals(1L, firstMoment0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      firstMoment0.increment(1.0);
      double double0 = firstMoment0.getResult();
      assertEquals(1L, firstMoment0.getN());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1801.6);
      firstMoment0.evaluate(doubleArray0);
      double double0 = firstMoment0.getResult();
      assertEquals((-1801.6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      double[] doubleArray0 = new double[1];
      firstMoment0.evaluate(doubleArray0);
      long long0 = firstMoment0.getN();
      assertEquals(0.0, firstMoment0.getResult(), 0.01);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1801.6);
      firstMoment0.evaluate(doubleArray0);
      firstMoment0.copy();
      assertEquals((-1801.6), firstMoment0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      firstMoment0.increment(0.0);
      firstMoment0.copy();
      assertEquals(1L, firstMoment0.getN());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      assertEquals(0L, firstMoment0.getN());
      
      firstMoment0.n = (-7495L);
      FirstMoment firstMoment1 = firstMoment0.copy();
      assertNotSame(firstMoment0, firstMoment1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      try { 
        FirstMoment.copy((FirstMoment) null, (FirstMoment) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FirstMoment firstMoment0 = null;
      try {
        firstMoment0 = new FirstMoment((FirstMoment) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      FirstMoment.copy(firstMoment0, firstMoment0);
      assertEquals(0L, firstMoment0.getN());
      assertEquals(Double.NaN, firstMoment0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      firstMoment0.increment(0L);
      firstMoment0.increment(1752.97821);
      assertEquals(2L, firstMoment0.getN());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      double double0 = firstMoment0.getResult();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0L, firstMoment0.getN());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      long long0 = firstMoment0.getN();
      assertEquals(0L, long0);
      assertEquals(Double.NaN, firstMoment0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      FirstMoment firstMoment1 = new FirstMoment(firstMoment0);
      firstMoment1.n = (-2363L);
      long long0 = firstMoment1.getN();
      assertEquals((-2363L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      FirstMoment firstMoment1 = firstMoment0.copy();
      assertEquals(Double.NaN, firstMoment1.getResult(), 0.01);
      assertEquals(0L, firstMoment1.getN());
      assertNotSame(firstMoment1, firstMoment0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      firstMoment0.clear();
      assertEquals(0L, firstMoment0.getN());
      assertEquals(Double.NaN, firstMoment0.getResult(), 0.01);
  }
}
