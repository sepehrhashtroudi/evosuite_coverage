/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:28:24 GMT 2022
 */

package org.apache.commons.math3.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Variance_ESTest extends Variance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      variance0.incMoment = true;
      boolean boolean0 = variance0.isBiasCorrected();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 316.0556458;
      double[] doubleArray1 = new double[2];
      double double0 = variance0.evaluate(doubleArray1, doubleArray0, 0.0);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1959.0;
      secondMoment0.incrementAll(doubleArray0);
      variance0.setBiasCorrected(false);
      double double0 = variance0.getResult();
      assertEquals(719565.1875, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(true, secondMoment0);
      secondMoment0.n = (-4590L);
      double double0 = variance0.getResult();
      assertTrue(variance0.isBiasCorrected());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[2];
      secondMoment0.evaluate(doubleArray0);
      Variance variance0 = new Variance(secondMoment0);
      variance0.getN();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 1634.63644;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, 1279.1);
      assertEquals(3.646354829541829E-11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(true, secondMoment0);
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 1.0708593250394448E-7;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, 0.0);
      assertEquals((-1.8807911627219354E-37), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Variance variance0 = new Variance(true);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1120.681935143656;
      doubleArray0[1] = 235.8153;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0);
      assertEquals(112536.25055589329, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1959.0;
      double double0 = variance0.evaluate(doubleArray0, 396490.8257483056);
      assertEquals(959420.25, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      Variance variance0 = new Variance(false);
      double double0 = variance0.evaluate(doubleArray0, (-1258.5862538));
      assertEquals((-6.20881716410319E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1.0;
      double double0 = variance0.evaluate(doubleArray0);
      assertEquals(0.25, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[4];
      secondMoment0.incrementAll(doubleArray0);
      Variance variance1 = variance0.copy();
      assertTrue(variance1.isBiasCorrected());
      assertNotSame(variance1, variance0);
      assertEquals(4L, variance1.getN());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(true, secondMoment0);
      secondMoment0.n = (-4590L);
      Variance variance1 = variance0.copy();
      assertTrue(variance1.isBiasCorrected());
      assertEquals((-4590L), variance1.getN());
      assertNotSame(variance1, variance0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Variance variance0 = new Variance(true, (SecondMoment) null);
      // Undeclared exception!
      try { 
        variance0.getResult();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Variance variance0 = new Variance(true, (SecondMoment) null);
      // Undeclared exception!
      try { 
        variance0.getN();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(true, secondMoment0);
      double[] doubleArray0 = new double[2];
      try { 
        variance0.evaluate(doubleArray0, doubleArray0, (-2322), (-2322));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[0];
      try { 
        variance0.evaluate(doubleArray1, doubleArray0, 173, 173);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 0
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      try { 
        variance0.evaluate((double[]) null, (double[]) null, 0, (-818));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Variance variance0 = new Variance((SecondMoment) null);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, doubleArray0, 218, 218);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 218
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[2];
      try { 
        variance0.evaluate(doubleArray0, doubleArray0, 0.0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[9];
      try { 
        variance0.evaluate(doubleArray1, doubleArray0, (-2428.044180358756), 1403, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 9
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Variance variance0 = new Variance(false);
      try { 
        variance0.evaluate((double[]) null, (double[]) null, 0.0, 74, 74);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, doubleArray0, Double.NaN, 49, 2301);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 49
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[0];
      try { 
        variance0.evaluate(doubleArray0, doubleArray1, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 3
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[2];
      try { 
        variance0.evaluate(doubleArray0, (double[]) null, 1868.59246150449);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      // Undeclared exception!
      try { 
        variance0.evaluate((double[]) null, (double[]) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[4];
      try { 
        variance0.evaluate(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4 != 2
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Variance variance0 = new Variance(true);
      double[] doubleArray0 = new double[8];
      try { 
        variance0.evaluate(doubleArray0, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Variance variance0 = new Variance(true);
      // Undeclared exception!
      try { 
        variance0.evaluate((double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(true, secondMoment0);
      double[] doubleArray0 = new double[9];
      try { 
        variance0.evaluate(doubleArray0, (-911), (-911));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // start position (-911)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[3];
      try { 
        variance0.evaluate(doubleArray0, 6, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      try { 
        variance0.evaluate((double[]) null, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[6];
      try { 
        variance0.evaluate(doubleArray0, 860.995391336, (-1539), (-1539));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // start position (-1,539)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Variance variance0 = new Variance(true);
      double[] doubleArray0 = new double[0];
      try { 
        variance0.evaluate(doubleArray0, (-412.97712750844045), 1398, 1398);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Variance variance0 = new Variance(true);
      try { 
        variance0.evaluate((double[]) null, 667.8481, (-1120), 66);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[2];
      variance0.moment = null;
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Variance variance0 = new Variance(true);
      try { 
        Variance.copy(variance0, (Variance) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Variance variance0 = new Variance(true, (SecondMoment) null);
      // Undeclared exception!
      try { 
        Variance.copy(variance0, variance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Variance variance0 = new Variance(true, (SecondMoment) null);
      // Undeclared exception!
      try { 
        variance0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Variance variance0 = null;
      try {
        variance0 = new Variance((Variance) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Variance variance0 = new Variance((SecondMoment) null);
      Variance variance1 = null;
      try {
        variance1 = new Variance(variance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = 316.0556458;
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double double0 = variance0.evaluate(doubleArray0, doubleArray1, (-1.0), 1, 1);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Variance variance0 = new Variance();
      assertTrue(variance0.isBiasCorrected());
      
      double[] doubleArray0 = new double[7];
      variance0.setBiasCorrected(false);
      double double0 = variance0.evaluate(doubleArray0, Double.NaN, 1073741824, 1073741824);
      assertFalse(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[7];
      double double0 = variance0.evaluate(doubleArray0, Double.NaN, 1073741824, 1073741824);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[7];
      double double0 = variance0.evaluate(doubleArray0, (-1.0), 6, 1);
      assertEquals(0.0, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Variance variance0 = new Variance(true);
      double[] doubleArray0 = new double[2];
      double double0 = variance0.evaluate(doubleArray0, 1879048192, 1879048192);
      assertEquals(0.0, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      double double0 = variance0.evaluate(doubleArray0, 1, 1);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Variance variance0 = new Variance();
      try { 
        variance0.evaluate((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      variance0.clear();
      assertFalse(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double double0 = variance0.getResult();
      assertEquals(Double.NaN, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.increment((-1889.5));
      assertEquals(1L, variance0.getN());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      Variance.copy(variance0, variance0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      assertTrue(variance0.isBiasCorrected());
      
      double[] doubleArray0 = new double[4];
      variance0.setBiasCorrected(false);
      double double0 = variance0.evaluate(doubleArray0);
      assertFalse(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[1];
      double double0 = variance0.evaluate(doubleArray0, 2692.267829130237);
      assertEquals(0.0, double0, 0.01);
      assertFalse(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[3];
      double double0 = variance0.evaluate(doubleArray0, 1.34217729E8, 0, 0);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1531.7208;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[5];
      double double0 = variance0.evaluate(doubleArray0, 0, 0);
      assertFalse(variance0.isBiasCorrected());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.clear();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[7];
      variance0.setBiasCorrected(false);
      variance0.incrementAll(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(7L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[1];
      variance0.incrementAll(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(1L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Variance variance0 = new Variance(false);
      Variance variance1 = variance0.copy();
      variance0.equals(variance1);
      assertFalse(variance1.isBiasCorrected());
      assertEquals(Double.NaN, variance1.getResult(), 0.01);
      assertNotSame(variance1, variance0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      Variance variance1 = new Variance(variance0);
      assertTrue(variance1.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(true, secondMoment0);
      variance0.increment((-1.0));
      assertEquals(Double.NaN, variance0.getResult(), 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Variance variance0 = new Variance(true);
      boolean boolean0 = variance0.isBiasCorrected();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[1];
      try { 
        variance0.evaluate(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[4];
      try { 
        variance0.evaluate(doubleArray0, doubleArray0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.getN();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      // Undeclared exception!
      try { 
        variance0.evaluate((double[]) null, 1.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.moment.Variance", e);
      }
  }
}