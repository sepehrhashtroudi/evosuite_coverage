/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:25:37 GMT 2022
 */

package org.apache.commons.math3.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics;
import org.apache.commons.math3.stat.descriptive.StatisticalSummary;
import org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues;
import org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.apache.commons.math3.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math3.stat.descriptive.moment.Skewness;
import org.apache.commons.math3.stat.descriptive.summary.SumOfLogs;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AggregateSummaryStatistics_ESTest extends AggregateSummaryStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(0.0);
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics(summaryStatistics0);
      double double0 = aggregateSummaryStatistics0.getVariance();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      summaryStatistics0.addValue(7.92177143584738E-8);
      double double0 = aggregateSummaryStatistics0.getSumsq();
      assertEquals(6.275446268180747E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      Skewness skewness0 = new Skewness();
      summaryStatistics0.setSumsqImpl(skewness0);
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-167.0275249558194);
      skewness0.incrementAll(doubleArray0);
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics(summaryStatistics0, summaryStatistics0);
      double double0 = aggregateSummaryStatistics0.getSumsq();
      assertEquals((-2.8284271247461903), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      summaryStatistics0.addValue(7.92177143584738E-8);
      StatisticalSummary statisticalSummary0 = aggregateSummaryStatistics0.getSummary();
      assertEquals(7.92177143584738E-8, statisticalSummary0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      summaryStatistics0.addValue(7.92177143584738E-8);
      double double0 = aggregateSummaryStatistics0.getSumOfLogs();
      assertEquals((-16.351065896993227), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      summaryStatistics0.addValue(7.92177143584738E-8);
      double double0 = aggregateSummaryStatistics0.getSum();
      assertEquals(7.92177143584738E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      summaryStatistics0.addValue((-0.46751034670242775));
      double double0 = aggregateSummaryStatistics0.getSum();
      assertEquals((-0.46751034670242775), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      summaryStatistics0.addValue(7.92177143584738E-8);
      double double0 = aggregateSummaryStatistics0.getStandardDeviation();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(0.0);
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics(summaryStatistics0);
      double double0 = aggregateSummaryStatistics0.getSecondMoment();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      summaryStatistics0.addValue(7.92177143584738E-8);
      long long0 = aggregateSummaryStatistics0.getN();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics(summaryStatistics0, summaryStatistics0);
      summaryStatistics0.addValue(0.0);
      double double0 = aggregateSummaryStatistics0.getMin();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      summaryStatistics0.addValue(7.92177143584738E-8);
      double double0 = aggregateSummaryStatistics0.getMin();
      assertEquals(7.92177143584738E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      summaryStatistics0.addValue((-0.46751034670242775));
      double double0 = aggregateSummaryStatistics0.getMin();
      assertEquals((-0.46751034670242775), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics(summaryStatistics0, summaryStatistics0);
      GeometricMean geometricMean0 = new GeometricMean();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = geometricMean0.getSumLogImpl();
      summaryStatistics0.setMeanImpl(storelessUnivariateStatistic0);
      double double0 = aggregateSummaryStatistics0.getMean();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      summaryStatistics0.addValue(7.92177143584738E-8);
      double double0 = aggregateSummaryStatistics0.getMean();
      assertEquals(7.92177143584738E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics(summaryStatistics0, summaryStatistics0);
      summaryStatistics0.setMaxImpl(sumOfLogs0);
      double double0 = aggregateSummaryStatistics0.getMax();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      summaryStatistics0.addValue((-0.46751034670242775));
      double double0 = aggregateSummaryStatistics0.getMax();
      assertEquals((-0.46751034670242775), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      summaryStatistics0.setGeoMeanImpl(sumOfLogs0);
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics(summaryStatistics0, summaryStatistics0);
      double double0 = aggregateSummaryStatistics0.getGeometricMean();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics(summaryStatistics0, summaryStatistics0);
      SecondMoment secondMoment0 = new SecondMoment();
      Mean mean0 = new Mean(secondMoment0);
      double[] doubleArray0 = new double[1];
      secondMoment0.incrementAll(doubleArray0);
      summaryStatistics0.setSumLogImpl(mean0);
      double double0 = aggregateSummaryStatistics0.getGeometricMean();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      LinkedList<SummaryStatistics> linkedList0 = new LinkedList<SummaryStatistics>();
      summaryStatistics0.addValue(0.0);
      linkedList0.add(summaryStatistics0);
      StatisticalSummaryValues statisticalSummaryValues0 = AggregateSummaryStatistics.aggregate(linkedList0);
      assertEquals(1L, statisticalSummaryValues0.getN());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      summaryStatistics0.setMaxImpl(sumOfLogs0);
      LinkedList<SummaryStatistics> linkedList0 = new LinkedList<SummaryStatistics>();
      linkedList0.add(summaryStatistics0);
      StatisticalSummaryValues statisticalSummaryValues0 = AggregateSummaryStatistics.aggregate(linkedList0);
      assertEquals(Double.NaN, statisticalSummaryValues0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      LinkedList<SummaryStatistics> linkedList0 = new LinkedList<SummaryStatistics>();
      summaryStatistics0.addValue((-0.46751034670242775));
      linkedList0.add(summaryStatistics0);
      StatisticalSummaryValues statisticalSummaryValues0 = AggregateSummaryStatistics.aggregate(linkedList0);
      assertEquals((-0.46751034670242775), statisticalSummaryValues0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics(summaryStatistics0, summaryStatistics0);
      summaryStatistics0.setVarianceImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        aggregateSummaryStatistics0.getVariance();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics(summaryStatistics0, summaryStatistics0);
      summaryStatistics0.setMinImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        aggregateSummaryStatistics0.getSummary();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setSumImpl((StorelessUnivariateStatistic) null);
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics(summaryStatistics0, summaryStatistics0);
      // Undeclared exception!
      try { 
        aggregateSummaryStatistics0.getSum();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics(summaryStatistics0, summaryStatistics0);
      summaryStatistics0.setGeoMeanImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        aggregateSummaryStatistics0.getGeometricMean();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics(summaryStatistics0, summaryStatistics0);
      summaryStatistics0.setVarianceImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        aggregateSummaryStatistics0.createContributingStatistics();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedList<SummaryStatistics> linkedList0 = new LinkedList<SummaryStatistics>();
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      linkedList0.add(summaryStatistics0);
      summaryStatistics0.setMaxImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        AggregateSummaryStatistics.aggregate(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setSumImpl((StorelessUnivariateStatistic) null);
      AggregateSummaryStatistics aggregateSummaryStatistics0 = null;
      try {
        aggregateSummaryStatistics0 = new AggregateSummaryStatistics(summaryStatistics0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics((SummaryStatistics) null, (SummaryStatistics) null);
      assertEquals(Double.NaN, aggregateSummaryStatistics0.getSecondMoment(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics(summaryStatistics0, summaryStatistics0);
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumImpl();
      summaryStatistics0.setSumLogImpl(storelessUnivariateStatistic0);
      // Undeclared exception!
      try { 
        aggregateSummaryStatistics0.createContributingStatistics();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.stat.descriptive.summary.Sum cannot be cast to org.apache.commons.math3.stat.descriptive.summary.SumOfLogs
         //
         verifyException("org.apache.commons.math3.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      long long0 = aggregateSummaryStatistics0.getN();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics((SummaryStatistics) null);
      double double0 = aggregateSummaryStatistics0.getMean();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      double double0 = aggregateSummaryStatistics0.getSum();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      boolean boolean0 = summaryStatistics0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      LinkedList<SummaryStatistics> linkedList0 = new LinkedList<SummaryStatistics>();
      summaryStatistics0.addValue(7.92177143584738E-8);
      linkedList0.add(summaryStatistics0);
      StatisticalSummaryValues statisticalSummaryValues0 = AggregateSummaryStatistics.aggregate(linkedList0);
      assertEquals(7.92177143584738E-8, statisticalSummaryValues0.getSum(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      LinkedList<SummaryStatistics> linkedList0 = new LinkedList<SummaryStatistics>();
      summaryStatistics0.addValue(7.92177143584738E-8);
      linkedList0.add(summaryStatistics0);
      linkedList0.add(summaryStatistics0);
      StatisticalSummaryValues statisticalSummaryValues0 = AggregateSummaryStatistics.aggregate(linkedList0);
      assertEquals(1.584354287169476E-7, statisticalSummaryValues0.getSum(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      LinkedList<SummaryStatistics> linkedList0 = new LinkedList<SummaryStatistics>();
      linkedList0.add(summaryStatistics0);
      linkedList0.add(summaryStatistics0);
      StatisticalSummaryValues statisticalSummaryValues0 = AggregateSummaryStatistics.aggregate(linkedList0);
      assertEquals(0.0, statisticalSummaryValues0.getSum(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StatisticalSummaryValues statisticalSummaryValues0 = AggregateSummaryStatistics.aggregate((Collection<SummaryStatistics>) null);
      assertNull(statisticalSummaryValues0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedList<SummaryStatistics> linkedList0 = new LinkedList<SummaryStatistics>();
      StatisticalSummaryValues statisticalSummaryValues0 = AggregateSummaryStatistics.aggregate(linkedList0);
      assertNull(statisticalSummaryValues0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      SummaryStatistics summaryStatistics0 = aggregateSummaryStatistics0.createContributingStatistics();
      summaryStatistics0.addValue(7.92177143584738E-8);
      double double0 = aggregateSummaryStatistics0.getMax();
      assertEquals(7.92177143584738E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      double double0 = aggregateSummaryStatistics0.getSumOfLogs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      double double0 = aggregateSummaryStatistics0.getSumsq();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      AggregateSummaryStatistics aggregateSummaryStatistics0 = new AggregateSummaryStatistics();
      StatisticalSummary statisticalSummary0 = aggregateSummaryStatistics0.getSummary();
      assertEquals(Double.NaN, statisticalSummary0.getMax(), 0.01);
  }
}