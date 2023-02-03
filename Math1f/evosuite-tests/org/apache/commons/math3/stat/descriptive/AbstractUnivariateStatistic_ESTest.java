/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:24:26 GMT 2022
 */

package org.apache.commons.math3.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math3.stat.descriptive.moment.SemiVariance;
import org.apache.commons.math3.stat.descriptive.moment.Skewness;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Median;
import org.apache.commons.math3.stat.descriptive.rank.Min;
import org.apache.commons.math3.stat.descriptive.rank.Percentile;
import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.apache.commons.math3.stat.descriptive.summary.Sum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractUnivariateStatistic_ESTest extends AbstractUnivariateStatistic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (-861.3688);
      try { 
        variance0.evaluate(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // element 1 is negative: -861.369
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = Double.NaN;
      try { 
        sum0.evaluate(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // element 1 is NaN
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[4];
      try { 
        mean0.evaluate(doubleArray0, doubleArray0, (-758), (-758));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Product product0 = new Product();
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[9];
      try { 
        product0.evaluate(doubleArray0, doubleArray1, 1242, 1242);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9 != 2
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[2];
      try { 
        mean0.evaluate(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[1];
      try { 
        sum0.evaluate(doubleArray0, 1305, 141);
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
      StandardDeviation standardDeviation0 = new StandardDeviation();
      double[] doubleArray0 = new double[1];
      try { 
        standardDeviation0.evaluate(doubleArray0, (-151), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // start position (-151)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      Max max0 = new Max();
      max0.setData(doubleArray0, 0, 1);
      assertEquals(Double.NaN, max0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Max max0 = new Max();
      double[] doubleArray0 = new double[0];
      max0.setData(doubleArray0, 0, 0);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Percentile percentile0 = new Percentile();
      double[] doubleArray0 = new double[2];
      try { 
        percentile0.setData(doubleArray0, 2, 1141);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[8];
      double double0 = variance0.evaluate(doubleArray0, 0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[0];
      double double0 = sum0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SemiVariance semiVariance0 = new SemiVariance(true);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 788.0;
      double double0 = semiVariance0.evaluate(doubleArray0);
      assertEquals(38809.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Min min0 = new Min();
      min0.setData(doubleArray0);
      double double0 = min0.evaluate();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1634.4281);
      secondMoment0.setData(doubleArray0);
      double double0 = secondMoment0.evaluate();
      assertEquals(2337435.812310909, secondMoment0.getResult(), 0.01);
      assertEquals(2337435.812310909, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Product product0 = new Product();
      Product product1 = (Product)product0.copy();
      assertEquals(0L, product1.getN());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Product product0 = new Product();
      double[] doubleArray0 = new double[5];
      try { 
        product0.setData(doubleArray0, 85, 85);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Min min0 = new Min();
      min0.setData((double[]) null);
      assertEquals(0L, min0.getN());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1.0;
      double double0 = sum0.evaluate(doubleArray0, doubleArray0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[1];
      try { 
        sum0.evaluate(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 4
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Product product0 = new Product();
      try { 
        product0.evaluate((double[]) null, (double[]) null, 254, 254);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[4];
      try { 
        sum0.evaluate(doubleArray0, 409, (-962));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length (-962)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      Product product0 = new Product();
      try { 
        product0.setData(doubleArray0, 430, (-4332));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length (-4,332)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StandardDeviation standardDeviation0 = new StandardDeviation();
      double[] doubleArray0 = new double[3];
      try { 
        standardDeviation0.setData(doubleArray0, (-2507), 297);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // start position (-2,507)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Skewness skewness0 = new Skewness();
      try { 
        skewness0.setData((double[]) null, (-1511), 1);
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
      GeometricMean geometricMean0 = new GeometricMean();
      double[] doubleArray0 = geometricMean0.getData();
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Median median0 = new Median();
      try { 
        median0.evaluate((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Mean mean0 = new Mean();
      try { 
        mean0.evaluate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic", e);
      }
  }
}