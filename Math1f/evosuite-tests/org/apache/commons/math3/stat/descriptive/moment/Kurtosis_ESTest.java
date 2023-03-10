/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:34:50 GMT 2022
 */

package org.apache.commons.math3.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math3.stat.descriptive.moment.Kurtosis;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Kurtosis_ESTest extends Kurtosis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Kurtosis kurtosis0 = new Kurtosis();
      double[] doubleArray0 = new double[1];
      double double0 = kurtosis0.evaluate(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Kurtosis kurtosis0 = new Kurtosis();
      Kurtosis kurtosis1 = new Kurtosis(kurtosis0);
      double[] doubleArray0 = new double[2];
      kurtosis1.incrementAll(doubleArray0);
      kurtosis1.increment((-1641.216));
      boolean boolean0 = kurtosis1.equals(kurtosis0);
      assertEquals(3L, kurtosis1.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = (-2919.5);
      doubleArray0[6] = (-3600.38);
      fourthMoment0.incrementAll(doubleArray0);
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      double double0 = kurtosis0.getResult();
      assertEquals((-0.4409715489982259), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[7];
      fourthMoment0.evaluate(doubleArray0);
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      long long0 = kurtosis0.getN();
      assertEquals(7L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      fourthMoment0.n = (-2041L);
      long long0 = kurtosis0.getN();
      assertEquals((-2041L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4.654720780112994E-8;
      double double0 = kurtosis0.evaluate(doubleArray0, 0, 6);
      assertEquals(6.000000000000002, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = (-2919.5);
      doubleArray0[6] = (-3600.38);
      fourthMoment0.incrementAll(doubleArray0);
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      Kurtosis kurtosis1 = kurtosis0.copy();
      assertEquals(7L, kurtosis1.getN());
      assertNotSame(kurtosis1, kurtosis0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[7];
      fourthMoment0.evaluate(doubleArray0);
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      Kurtosis kurtosis1 = kurtosis0.copy();
      assertNotSame(kurtosis1, kurtosis0);
      assertEquals(0.0, kurtosis1.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      fourthMoment0.n = (-2057L);
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      Kurtosis kurtosis1 = kurtosis0.copy();
      assertEquals((-2057L), kurtosis1.getN());
      assertNotSame(kurtosis1, kurtosis0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Kurtosis kurtosis0 = new Kurtosis((FourthMoment) null);
      // Undeclared exception!
      try { 
        kurtosis0.getResult();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Kurtosis", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Kurtosis kurtosis0 = new Kurtosis((FourthMoment) null);
      // Undeclared exception!
      try { 
        kurtosis0.getN();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Kurtosis", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      double[] doubleArray0 = new double[4];
      try { 
        kurtosis0.evaluate(doubleArray0, 189, (-2487));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length (-2,487)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      double[] doubleArray0 = new double[4];
      try { 
        kurtosis0.evaluate(doubleArray0, 924, 924);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      try { 
        kurtosis0.evaluate((double[]) null, 2384, 1925);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        Kurtosis.copy((Kurtosis) null, (Kurtosis) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Kurtosis kurtosis0 = new Kurtosis((FourthMoment) null);
      // Undeclared exception!
      try { 
        Kurtosis.copy(kurtosis0, kurtosis0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Kurtosis", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Kurtosis kurtosis0 = new Kurtosis((FourthMoment) null);
      // Undeclared exception!
      try { 
        kurtosis0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Kurtosis", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Kurtosis kurtosis0 = null;
      try {
        kurtosis0 = new Kurtosis((Kurtosis) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Kurtosis kurtosis0 = new Kurtosis((FourthMoment) null);
      Kurtosis kurtosis1 = null;
      try {
        kurtosis1 = new Kurtosis(kurtosis0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Kurtosis", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[7];
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      double double0 = kurtosis0.evaluate(doubleArray0, 1431655765, 1431655765);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      double[] doubleArray0 = new double[9];
      double double0 = kurtosis0.evaluate(doubleArray0, 3, 3);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Kurtosis kurtosis0 = new Kurtosis();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 2.0500353979930155E-8;
      kurtosis0.incrementAll(doubleArray0);
      double double0 = kurtosis0.getResult();
      assertEquals(5L, kurtosis0.getN());
      assertEquals(5.000000000000002, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      Kurtosis.copy(kurtosis0, kurtosis0);
      assertEquals(Double.NaN, kurtosis0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      double[] doubleArray0 = new double[4];
      double double0 = kurtosis0.evaluate(doubleArray0, 0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Kurtosis kurtosis0 = new Kurtosis();
      kurtosis0.clear();
      assertEquals(0L, kurtosis0.getN());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      kurtosis0.clear();
      assertEquals(Double.NaN, kurtosis0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      assertEquals(Double.NaN, kurtosis0.getResult(), 0.01);
      
      double[] doubleArray0 = new double[4];
      fourthMoment0.evaluate(doubleArray0);
      double double0 = kurtosis0.getResult();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Kurtosis kurtosis0 = new Kurtosis();
      double double0 = kurtosis0.getResult();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      kurtosis0.increment(0.0);
      assertEquals(0L, kurtosis0.getN());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Kurtosis kurtosis0 = new Kurtosis();
      long long0 = kurtosis0.getN();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      Kurtosis kurtosis1 = kurtosis0.copy();
      assertNotSame(kurtosis1, kurtosis0);
  }
}
