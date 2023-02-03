/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:33:49 GMT 2022
 */

package org.apache.commons.math3.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.stat.descriptive.moment.FirstMoment;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Mean_ESTest extends Mean_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      Mean mean0 = new Mean(firstMoment0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1602.9717942;
      double double0 = mean0.evaluate(doubleArray0, doubleArray0);
      assertEquals(1602.9717942, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.NaN;
      double double0 = mean0.evaluate(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.increment(0.0);
      double double0 = mean0.getResult();
      assertEquals(1L, mean0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = 1.0;
      mean0.incrementAll(doubleArray0);
      double double0 = mean0.getResult();
      assertEquals(6L, mean0.getN());
      assertEquals(0.16666666666666669, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      firstMoment0.m1 = (-2544.0);
      Mean mean0 = new Mean(firstMoment0);
      double double0 = mean0.getResult();
      assertEquals((-2544.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[5];
      mean0.incrementAll(doubleArray0);
      long long0 = mean0.getN();
      assertEquals(5L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      Mean mean0 = new Mean(firstMoment0);
      firstMoment0.n = (-2644281811660520851L);
      long long0 = mean0.getN();
      assertEquals((-2644281811660520851L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (double) 3635;
      double double0 = mean0.evaluate(doubleArray0, doubleArray1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      Mean mean0 = new Mean(firstMoment0);
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 5.865827662008209E-8;
      double double0 = mean0.evaluate(doubleArray0, 1, 1);
      assertEquals(5.865827662008209E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (-3553.0406982311);
      double double0 = mean0.evaluate(doubleArray0, 1, 1);
      assertEquals((-3553.0406982311), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-3225.12570681);
      mean0.incrementAll(doubleArray0);
      mean0.copy();
      assertEquals(5L, mean0.getN());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      Mean mean0 = new Mean(firstMoment0);
      double[] doubleArray0 = new double[6];
      firstMoment0.incrementAll(doubleArray0);
      Mean mean1 = mean0.copy();
      assertEquals(6L, mean1.getN());
      assertNotSame(mean1, mean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.moment = null;
      // Undeclared exception!
      try { 
        mean0.getN();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Mean", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[4];
      try { 
        mean0.evaluate(doubleArray0, doubleArray0, 0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      Mean mean0 = new Mean(firstMoment0);
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[6];
      try { 
        mean0.evaluate(doubleArray1, doubleArray0, 2117, 1571);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 6
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      Mean mean0 = new Mean(firstMoment0);
      try { 
        mean0.evaluate((double[]) null, (double[]) null, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      Mean mean0 = new Mean(firstMoment0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        mean0.evaluate(doubleArray0, doubleArray0, (-1344), 2297);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1344
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      Mean mean0 = new Mean(firstMoment0);
      double[] doubleArray0 = new double[0];
      try { 
        mean0.evaluate(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      Mean mean0 = new Mean(firstMoment0);
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[0];
      try { 
        mean0.evaluate(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 7
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Mean mean0 = new Mean();
      // Undeclared exception!
      try { 
        mean0.evaluate((double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Mean", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      Mean mean0 = new Mean(firstMoment0);
      double[] doubleArray0 = new double[9];
      try { 
        mean0.evaluate(doubleArray0, (-3396), (-1156));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // start position (-3,396)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[3];
      try { 
        mean0.evaluate(doubleArray0, 52, 52);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      Mean mean0 = new Mean(firstMoment0);
      try { 
        mean0.evaluate((double[]) null, (-4144), (-2597));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Mean mean0 = new Mean();
      try { 
        Mean.copy(mean0, (Mean) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      // Undeclared exception!
      try { 
        Mean.copy(mean0, mean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Mean", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.moment = null;
      // Undeclared exception!
      try { 
        mean0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Mean", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Mean mean0 = null;
      try {
        mean0 = new Mean((Mean) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      Mean mean1 = null;
      try {
        mean1 = new Mean(mean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Mean", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[5];
      double double0 = mean0.evaluate(doubleArray0, 1, 1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Mean mean0 = new Mean();
      Mean.copy(mean0, mean0);
      assertEquals(Double.NaN, mean0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      // Undeclared exception!
      try { 
        mean0.getResult();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Mean", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 388.953701;
      double double0 = mean0.evaluate(doubleArray0, doubleArray0, 1, 1);
      assertEquals(388.953701, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[9];
      double double0 = mean0.evaluate(doubleArray0, 0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.clear();
      assertEquals(Double.NaN, mean0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      mean0.clear();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      mean0.increment(180.1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[4];
      try { 
        mean0.evaluate(doubleArray0, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Mean mean0 = new Mean();
      Mean mean1 = mean0.copy();
      mean1.equals(mean0);
      assertNotSame(mean1, mean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      Mean mean0 = new Mean(firstMoment0);
      Mean mean1 = new Mean(mean0);
      assertTrue(mean1.equals((Object)mean0));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      // Undeclared exception!
      try { 
        mean0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Mean", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      Mean mean0 = new Mean(firstMoment0);
      long long0 = mean0.getN();
      assertEquals(0L, long0);
  }
}
