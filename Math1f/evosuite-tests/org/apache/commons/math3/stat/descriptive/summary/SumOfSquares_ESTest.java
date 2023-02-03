/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:47:46 GMT 2022
 */

package org.apache.commons.math3.stat.descriptive.summary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.stat.descriptive.summary.SumOfSquares;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SumOfSquares_ESTest extends SumOfSquares_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      sumOfSquares0.increment(1468.807);
      double double0 = sumOfSquares0.getResult();
      assertEquals(2157394.003249, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      sumOfSquares0.increment((-1983.1055287));
      long long0 = sumOfSquares0.getN();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (-546.9306601);
      double double0 = sumOfSquares0.evaluate(doubleArray0, 1, 1);
      assertEquals(0.0, sumOfSquares0.getResult(), 0.01);
      assertEquals(299133.1469574217, double0, 0.01);
      assertEquals(0L, sumOfSquares0.getN());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      sumOfSquares0.increment((-1983.1055287));
      sumOfSquares0.copy();
      assertEquals(1L, sumOfSquares0.getN());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      double[] doubleArray0 = new double[0];
      try { 
        sumOfSquares0.evaluate(doubleArray0, (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // start position (-1)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      double[] doubleArray0 = new double[0];
      try { 
        sumOfSquares0.evaluate(doubleArray0, 4842, 4842);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      try { 
        sumOfSquares0.evaluate((double[]) null, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      try { 
        SumOfSquares.copy(sumOfSquares0, (SumOfSquares) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SumOfSquares sumOfSquares0 = null;
      try {
        sumOfSquares0 = new SumOfSquares((SumOfSquares) null);
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
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      double[] doubleArray0 = new double[9];
      double double0 = sumOfSquares0.evaluate(doubleArray0, 1, 1);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0L, sumOfSquares0.getN());
      assertEquals(0.0, sumOfSquares0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      SumOfSquares.copy(sumOfSquares0, sumOfSquares0);
      assertEquals(0L, sumOfSquares0.getN());
      assertEquals(0.0, sumOfSquares0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      double[] doubleArray0 = new double[26];
      sumOfSquares0.setData(doubleArray0);
      double double0 = sumOfSquares0.evaluate();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, sumOfSquares0.getResult(), 0.01);
      assertEquals(0L, sumOfSquares0.getN());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      SumOfSquares sumOfSquares1 = new SumOfSquares(sumOfSquares0);
      assertEquals(0L, sumOfSquares1.getN());
      assertEquals(0.0, sumOfSquares1.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      sumOfSquares0.clear();
      assertEquals(0.0, sumOfSquares0.getResult(), 0.01);
      assertEquals(0L, sumOfSquares0.getN());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      double double0 = sumOfSquares0.getResult();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0L, sumOfSquares0.getN());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      SumOfSquares sumOfSquares1 = sumOfSquares0.copy();
      assertEquals(0L, sumOfSquares1.getN());
      assertNotSame(sumOfSquares1, sumOfSquares0);
      assertEquals(0.0, sumOfSquares1.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      long long0 = sumOfSquares0.getN();
      assertEquals(0L, long0);
      assertEquals(0.0, sumOfSquares0.getResult(), 0.01);
  }
}
