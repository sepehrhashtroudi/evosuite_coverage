/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:13:04 GMT 2022
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.DomainOrder;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.gantt.XYTaskDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.SimpleHistogramDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.SerialDate;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.CategoryTableXYDataset;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYBarDataset;
import org.jfree.data.xy.XYDatasetSelectionState;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractXYDataset_ESTest extends AbstractXYDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      XYBarDataset xYBarDataset0 = new XYBarDataset(histogramDataset0, (-1110.9199339530512));
      // Undeclared exception!
      try { 
        xYBarDataset0.getStartYValue((-2668), (-206));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      XYBarDataset xYBarDataset0 = new XYBarDataset(categoryTableXYDataset0, Double.NaN);
      // Undeclared exception!
      try { 
        xYBarDataset0.getXValue(1, 244);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 244, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, "", "+q/ipUP#~=");
      TimeZone timeZone0 = TimeZone.getTimeZone("zuu**nW5");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      XYDatasetSelectionState xYDatasetSelectionState0 = timeSeriesCollection0.getSelectionState();
      assertSame(timeSeriesCollection0, xYDatasetSelectionState0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection((XYSeries) null);
      DomainOrder domainOrder0 = xYSeriesCollection0.getDomainOrder();
      assertEquals("DomainOrder.ASCENDING", domainOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.getYValue(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.getXValue(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-4624), (-4624), (-4624), (-4624), 1931, (-4624));
      Day day0 = new Day(mockDate0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(day0);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection();
      simpleHistogramDataset0.setSelectionState(xYSeriesCollection0);
      assertEquals(0.5, xYSeriesCollection0.getIntervalPositionFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      XYTaskDataset xYTaskDataset0 = new XYTaskDataset(taskSeriesCollection0);
      XYDatasetSelectionState xYDatasetSelectionState0 = xYTaskDataset0.getSelectionState();
      assertNull(xYDatasetSelectionState0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      DomainOrder domainOrder0 = defaultTableXYDataset0.getDomainOrder();
      assertEquals("DomainOrder.NONE", domainOrder0.toString());
  }
}
