/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:19:46 GMT 2022
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.statistics.SimpleHistogramBin;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.YIntervalDataItem;
import org.jfree.data.xy.YIntervalSeries;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class YIntervalSeries_ESTest extends YIntervalSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(mockDate0);
      yIntervalSeries0.add(2.0, 0, (-99.2045184553979), 1212.9);
      double double0 = yIntervalSeries0.getYValue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-1.0), 0.0, false, false);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(simpleHistogramBin0);
      yIntervalSeries0.add(1.7976931348623157E308, 1.7976931348623157E308, (-1.0), 1.7976931348623157E308);
      double double0 = yIntervalSeries0.getYValue(0);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(mockDate0);
      yIntervalSeries0.add(2.0, (-2036.01842), (-99.2045184553979), 1212.9);
      double double0 = yIntervalSeries0.getYValue(0);
      assertEquals((-2036.01842), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-1.0), 0.0, false, false);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(simpleHistogramBin0);
      yIntervalSeries0.add(0.0, 0.0, 0.0, 0.0);
      double double0 = yIntervalSeries0.getYLowValue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-13.038760337021744), 0.0, false, false);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(simpleHistogramBin0);
      yIntervalSeries0.add(1.7976931348623157E308, 1.7976931348623157E308, 1.7976931348623157E308, 1.7976931348623157E308);
      double double0 = yIntervalSeries0.getYLowValue(0);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-1.0), 0.0, true, true);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(simpleHistogramBin0);
      yIntervalSeries0.add(1.7976931348623157E308, 1.7976931348623157E308, (-1.0), 1.7976931348623157E308);
      double double0 = yIntervalSeries0.getYLowValue(0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3628L);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(millisecond0);
      yIntervalSeries0.add(0.0, 0.0, 0, 0.0);
      double double0 = yIntervalSeries0.getYHighValue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-1.0), 8.174810708723367, false, false);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(simpleHistogramBin0);
      yIntervalSeries0.add(8.174810708723367, 8.174810708723367, 8.174810708723367, 8.174810708723367);
      double double0 = yIntervalSeries0.getYHighValue(0);
      assertEquals(8.174810708723367, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-1.0), 0.0, false, false);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(simpleHistogramBin0);
      yIntervalSeries0.add(0.0, 0.0, 0.0, 0.0);
      Number number0 = yIntervalSeries0.getX(0);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-1.0), 8.174810708723367, true, true);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(simpleHistogramBin0);
      yIntervalSeries0.add(8.174810708723367, 8.174810708723367, 8.174810708723367, 8.174810708723367);
      Number number0 = yIntervalSeries0.getX(0);
      assertEquals(8.174810708723367, number0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(millisecond0, true, true);
      yIntervalSeries0.add(999, 999, 0, 437.03215455);
      Number number0 = yIntervalSeries0.getX(0);
      assertEquals(999.0, number0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hour hour0 = new Hour();
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(hour0, true, false);
      yIntervalSeries0.add(23, Double.POSITIVE_INFINITY, 0.0, 23);
      YIntervalDataItem yIntervalDataItem0 = (YIntervalDataItem)yIntervalSeries0.getDataItem(0);
      assertEquals(23.0, yIntervalDataItem0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Year year0 = new Year();
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(year0, true, true);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getYValue((-1430));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hour hour0 = new Hour();
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(hour0, true, false);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getYLowValue((-5055));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(0L, 0L);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(simpleTimePeriod0);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getYHighValue((-2186));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Week week0 = new Week(0, 0);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(week0);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getX((-153));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1416, 1416, 1416, (-746), (-746));
      Hour hour0 = new Hour(mockDate0);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(hour0, true, true);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getDataItem(1416);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1416, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YIntervalSeries yIntervalSeries0 = null;
      try {
        yIntervalSeries0 = new YIntervalSeries((Comparable) null, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      YIntervalSeries yIntervalSeries0 = null;
      try {
        yIntervalSeries0 = new YIntervalSeries((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(day0, false, false);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getDataItem((-1940));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-1.0), 0.0, false, false);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(simpleHistogramBin0);
      yIntervalSeries0.add(1.7976931348623157E308, 1.7976931348623157E308, 0, 1.7976931348623157E308);
      Number number0 = yIntervalSeries0.getX(0);
      assertEquals(1.7976931348623157E308, number0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(quarter0);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getYLowValue(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-1.0), 0.0, false, false);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(simpleHistogramBin0);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getYValue(87);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 87, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      Day day0 = new Day(date0);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(day0, false, true);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getYHighValue(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Hour hour0 = new Hour();
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(hour0);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getX(23);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 23, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
