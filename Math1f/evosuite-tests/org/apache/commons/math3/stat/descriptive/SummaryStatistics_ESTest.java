/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:56:36 GMT 2022
 */

package org.apache.commons.math3.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.stat.descriptive.StatisticalSummary;
import org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.apache.commons.math3.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math3.stat.descriptive.moment.Skewness;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;
import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.apache.commons.math3.stat.descriptive.summary.Sum;
import org.apache.commons.math3.stat.descriptive.summary.SumOfLogs;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SummaryStatistics_ESTest extends SummaryStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      Skewness skewness0 = new Skewness();
      summaryStatistics0.setMeanImpl(skewness0);
      SummaryStatistics summaryStatistics1 = summaryStatistics0.copy();
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertEquals(0L, summaryStatistics1.getN());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue((-1.0));
      summaryStatistics0.hashCode();
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue((-519.7727217550956));
      summaryStatistics0.getVarianceImpl();
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      Sum sum0 = new Sum();
      summaryStatistics0.setVarianceImpl(sum0);
      summaryStatistics0.getVariance();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue((-872.78986236028));
      summaryStatistics0.addValue((-1348.726777));
      summaryStatistics0.getVariance();
      assertEquals(2L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setSumsqImpl((StorelessUnivariateStatistic) null);
      summaryStatistics0.getSumsqImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(4.0);
      summaryStatistics0.getSumsq();
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue((-813.5));
      summaryStatistics0.getSummary();
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      Product product0 = new Product();
      summaryStatistics0.setSumLogImpl(product0);
      summaryStatistics0.getSumOfLogs();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(0.0);
      summaryStatistics0.getSumOfLogs();
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(235.6517739457099);
      summaryStatistics0.getSumImpl();
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(16.5747134489843);
      double double0 = summaryStatistics0.getSum();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals(16.5747134489843, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue((-1.0));
      double double0 = summaryStatistics0.getSum();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue((-872.78986236028));
      summaryStatistics0.addValue((-1348.726777));
      double double0 = summaryStatistics0.getStandardDeviation();
      assertEquals(2L, summaryStatistics0.getN());
      assertEquals(336.53821975874905, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue((-813.5));
      summaryStatistics0.getSecondMoment();
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue((-872.78986236028));
      summaryStatistics0.addValue((-1348.726777));
      summaryStatistics0.getSecondMoment();
      assertEquals(2L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(2249.22);
      summaryStatistics0.getPopulationVariance();
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(187.2074824655796);
      long long0 = summaryStatistics0.getN();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setMinImpl((StorelessUnivariateStatistic) null);
      summaryStatistics0.getMinImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue((-519.7727217550956));
      summaryStatistics0.getMinImpl();
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumsqImpl();
      summaryStatistics0.setMinImpl(storelessUnivariateStatistic0);
      summaryStatistics0.getMin();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(235.6517739457099);
      double double0 = summaryStatistics0.getMin();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals(235.6517739457099, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue((-813.5));
      double double0 = summaryStatistics0.getMin();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals((-813.5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setMeanImpl((StorelessUnivariateStatistic) null);
      summaryStatistics0.getMeanImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(0.0);
      summaryStatistics0.getMeanImpl();
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      summaryStatistics0.setMeanImpl(sumOfLogs0);
      summaryStatistics0.getMean();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(16.5747134489843);
      double double0 = summaryStatistics0.getMean();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals(16.5747134489843, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue((-813.5));
      double double0 = summaryStatistics0.getMean();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals((-813.5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setMaxImpl((StorelessUnivariateStatistic) null);
      summaryStatistics0.getMaxImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(0.0);
      summaryStatistics0.getMaxImpl();
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(0.0);
      double double0 = summaryStatistics0.getMax();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(16.5747134489843);
      double double0 = summaryStatistics0.getMax();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals(16.5747134489843, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue((-119.7));
      double double0 = summaryStatistics0.getMax();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals((-119.7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      summaryStatistics0.setGeoMeanImpl(sumOfLogs0);
      summaryStatistics0.getGeometricMean();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(8.129668418580916);
      double double0 = summaryStatistics0.getGeometricMean();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals(8.129668418580914, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setGeoMeanImpl((StorelessUnivariateStatistic) null);
      summaryStatistics0.getGeoMeanImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue((-519.7727217550956));
      summaryStatistics0.copy();
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setMeanImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        summaryStatistics0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(Double.NaN);
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumLogImpl();
      try { 
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1 values have been added before statistic is configured
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(1424.7734);
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      try { 
        summaryStatistics0.setSumLogImpl(sumOfLogs0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1 values have been added before statistic is configured
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getMinImpl();
      summaryStatistics0.addValue(2.0);
      try { 
        summaryStatistics0.setMinImpl(storelessUnivariateStatistic0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1 values have been added before statistic is configured
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(0.0);
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getGeoMeanImpl();
      try { 
        summaryStatistics0.setMeanImpl(storelessUnivariateStatistic0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1 values have been added before statistic is configured
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      Max max0 = new Max();
      summaryStatistics0.addValue(2249.22);
      try { 
        summaryStatistics0.setMaxImpl(max0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1 values have been added before statistic is configured
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      Min min0 = new Min();
      summaryStatistics0.addValue(187.2074824655796);
      try { 
        summaryStatistics0.setGeoMeanImpl(min0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1 values have been added before statistic is configured
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setSumsqImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        summaryStatistics0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setMinImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        summaryStatistics0.getSummary();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setSumLogImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        summaryStatistics0.getSumOfLogs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setMaxImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        summaryStatistics0.getMax();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setSumLogImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        summaryStatistics0.getGeometricMean();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      summaryStatistics1.setMaxImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        summaryStatistics0.equals(summaryStatistics1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      try { 
        SummaryStatistics.copy(summaryStatistics0, (SummaryStatistics) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SecondMoment secondMoment0 = new SecondMoment();
      summaryStatistics0.setSumLogImpl(secondMoment0);
      // Undeclared exception!
      try { 
        SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.stat.descriptive.moment.SecondMoment cannot be cast to org.apache.commons.math3.stat.descriptive.summary.SumOfLogs
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setVarianceImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        summaryStatistics0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StandardDeviation standardDeviation0 = new StandardDeviation(false);
      summaryStatistics0.setSumLogImpl(standardDeviation0);
      // Undeclared exception!
      try { 
        summaryStatistics0.copy();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.stat.descriptive.moment.StandardDeviation cannot be cast to org.apache.commons.math3.stat.descriptive.summary.SumOfLogs
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setSumLogImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        summaryStatistics0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = null;
      try {
        summaryStatistics0 = new SummaryStatistics((SummaryStatistics) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setGeoMeanImpl((StorelessUnivariateStatistic) null);
      SummaryStatistics summaryStatistics1 = null;
      try {
        summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      summaryStatistics0.setVarianceImpl(sumOfLogs0);
      SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      double double0 = summaryStatistics0.getStandardDeviation();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(Double.NaN);
      double double0 = summaryStatistics0.getStandardDeviation();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getSum();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getSumOfLogs();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getSumsq();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      long long0 = summaryStatistics0.getN();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
      summaryStatistics0.addValue(0.0);
      SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getMaxImpl();
      summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic0);
      SummaryStatistics summaryStatistics1 = summaryStatistics0.copy();
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertEquals(0L, summaryStatistics1.getN());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getGeoMeanImpl();
      summaryStatistics0.setMeanImpl(storelessUnivariateStatistic0);
      SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      
      Variance variance0 = new Variance();
      variance0.increment(Double.NaN);
      summaryStatistics1.setVarianceImpl(variance0);
      boolean boolean0 = summaryStatistics1.equals(summaryStatistics0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      
      Skewness skewness0 = new Skewness();
      summaryStatistics1.setSumsqImpl(skewness0);
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      summaryStatistics0.addValue(Double.NaN);
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertEquals(1L, summaryStatistics0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertEquals(0L, summaryStatistics1.getN());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      summaryStatistics1.addValue(0.0);
      boolean boolean0 = summaryStatistics1.equals(summaryStatistics0);
      assertEquals(1L, summaryStatistics1.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getVarianceImpl();
      boolean boolean0 = summaryStatistics0.equals(storelessUnivariateStatistic0);
      assertEquals(0L, summaryStatistics0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(Double.NaN);
      SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
      assertEquals(1L, summaryStatistics0.getN());
      
      summaryStatistics0.clear();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.clear();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(Double.NaN);
      summaryStatistics0.addValue(Double.NaN);
      summaryStatistics0.toString();
      assertEquals(2L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setGeoMeanImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        summaryStatistics0.addValue(609.4696821818);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue((-813.5));
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumsqImpl();
      try { 
        summaryStatistics0.setSumImpl(storelessUnivariateStatistic0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1 values have been added before statistic is configured
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumsqImpl();
      summaryStatistics0.setMeanImpl(storelessUnivariateStatistic0);
      SummaryStatistics summaryStatistics1 = new SummaryStatistics();
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertFalse(boolean0);
      assertEquals(0L, summaryStatistics1.getN());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getMaxImpl();
      summaryStatistics0.setSumImpl(storelessUnivariateStatistic0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getMeanImpl();
      summaryStatistics0.setSumLogImpl(storelessUnivariateStatistic0);
      SummaryStatistics summaryStatistics1 = null;
      try {
        summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.stat.descriptive.moment.Mean cannot be cast to org.apache.commons.math3.stat.descriptive.summary.SumOfLogs
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = summaryStatistics0.copy();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getMaxImpl();
      assertTrue(summaryStatistics0.equals((Object)summaryStatistics1));
      
      summaryStatistics0.setSumImpl(storelessUnivariateStatistic0);
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumLogImpl();
      summaryStatistics0.setSumsqImpl(storelessUnivariateStatistic0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setMeanImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.hashCode();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumImpl();
      summaryStatistics0.addValue((-63.705704));
      try { 
        summaryStatistics0.setSumsqImpl(storelessUnivariateStatistic0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1 values have been added before statistic is configured
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumLogImpl();
      summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic0);
      SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      summaryStatistics0.addValue((-813.5));
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertEquals(1L, summaryStatistics0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StatisticalSummary statisticalSummary0 = summaryStatistics0.getSummary();
      assertEquals(0L, statisticalSummary0.getN());
  }
}
