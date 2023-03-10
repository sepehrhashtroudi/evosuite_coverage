/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 23:59:05 GMT 2022
 */

package org.jfree.chart.urls;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.urls.TimeSeriesURLGenerator;
import org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.DefaultWindDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeriesURLGenerator_ESTest extends TimeSeriesURLGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator(mockSimpleDateFormat0, "org.jfree.chart.urls.TimeSeriesURLGenerator", "", "");
      String string0 = timeSeriesURLGenerator0.getSeriesParameterName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getTimeInstance();
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator(dateFormat0, "", "=", "");
      String string0 = timeSeriesURLGenerator0.getPrefix();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getInstance();
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator(dateFormat0, "?b#C", "", "");
      String string0 = timeSeriesURLGenerator0.getItemParameterName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator();
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      // Undeclared exception!
      try { 
        timeSeriesURLGenerator0.generateURL(defaultWindDataset0, 951, 951);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid series index: 951
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getInstance();
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator(dateFormat0, "org.jfree.data.general.DefaultHeatMapDataset", "Null 'period' argument.", ")8Yq?7{\" a~7kh4;A");
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[4];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset("Null 'period' argument.", oHLCDataItemArray0);
      // Undeclared exception!
      try { 
        timeSeriesURLGenerator0.generateURL(defaultOHLCDataset0, 0, 1675);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1675
         //
         verifyException("org.jfree.data.xy.DefaultOHLCDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator();
      TimeSeriesURLGenerator timeSeriesURLGenerator1 = new TimeSeriesURLGenerator();
      boolean boolean0 = timeSeriesURLGenerator0.equals(timeSeriesURLGenerator1);
      assertTrue(boolean0);
      assertEquals("series", timeSeriesURLGenerator1.getSeriesParameterName());
      assertEquals("index.html", timeSeriesURLGenerator1.getPrefix());
      assertEquals("item", timeSeriesURLGenerator1.getItemParameterName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator(mockSimpleDateFormat0, "B", "B", "B");
      TimeSeriesURLGenerator timeSeriesURLGenerator1 = new TimeSeriesURLGenerator();
      boolean boolean0 = timeSeriesURLGenerator0.equals(timeSeriesURLGenerator1);
      assertEquals("item", timeSeriesURLGenerator1.getItemParameterName());
      assertEquals("series", timeSeriesURLGenerator1.getSeriesParameterName());
      assertEquals("index.html", timeSeriesURLGenerator1.getPrefix());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator();
      boolean boolean0 = timeSeriesURLGenerator0.equals(timeSeriesURLGenerator0);
      assertEquals("index.html", timeSeriesURLGenerator0.getPrefix());
      assertEquals("series", timeSeriesURLGenerator0.getSeriesParameterName());
      assertTrue(boolean0);
      assertEquals("item", timeSeriesURLGenerator0.getItemParameterName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getInstance();
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator(dateFormat0, "?b#C", "?b#C", "?b#C");
      boolean boolean0 = timeSeriesURLGenerator0.equals(dateFormat0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getInstance();
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator(dateFormat0, "org.jfree.data.general.DefaultHeatMapDataset", "Null 'period' argument.", ")8Yq?7{\" a~7kh4;A");
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[4];
      MockDate mockDate0 = new MockDate();
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, 2.0, 949.7441, 0.0, 2.0, 0.0);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset("Null 'period' argument.", oHLCDataItemArray0);
      String string0 = timeSeriesURLGenerator0.generateURL(defaultOHLCDataset0, 1351, 0);
      assertEquals("org.jfree.data.general.DefaultHeatMapDataset?Null 'period' argument.=java.lang.String%400000000005&amp;)8Yq?7{\" a~7kh4;A=2%2F14%2F14+8%3A21+PM", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getInstance();
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator(dateFormat0, "org.jfree.data.general.DefaultHeatMapDataset", "Null 'period' argument.", ")8Yq?7{\" a~7kh4;A");
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[4];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset((Comparable) null, oHLCDataItemArray0);
      // Undeclared exception!
      try { 
        timeSeriesURLGenerator0.generateURL(defaultOHLCDataset0, 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.DefaultOHLCDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getInstance();
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator(dateFormat0, "?b#C", "?b#C", "?b#C");
      DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset0 = new DefaultBoxAndWhiskerXYDataset("?b#C");
      // Undeclared exception!
      try { 
        timeSeriesURLGenerator0.generateURL(defaultBoxAndWhiskerXYDataset0, 3042, 3042);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3042, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = null;
      try {
        timeSeriesURLGenerator0 = new TimeSeriesURLGenerator(mockSimpleDateFormat0, "item", ":mKt^*Z]/'", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'itemParameterName' argument.
         //
         verifyException("org.jfree.chart.urls.TimeSeriesURLGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getInstance();
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = null;
      try {
        timeSeriesURLGenerator0 = new TimeSeriesURLGenerator(dateFormat0, "K!S_oc+hc5a", (String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'seriesParameterName' argument.
         //
         verifyException("org.jfree.chart.urls.TimeSeriesURLGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getDateTimeInstance();
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = null;
      try {
        timeSeriesURLGenerator0 = new TimeSeriesURLGenerator(dateFormat0, (String) null, (String) null, "HgkiQjI.h'20?BoF9>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'prefix' argument.
         //
         verifyException("org.jfree.chart.urls.TimeSeriesURLGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = null;
      try {
        timeSeriesURLGenerator0 = new TimeSeriesURLGenerator((DateFormat) null, (String) null, "Null 'dateFormat' argument.", "Null 'dateFormat' argument.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dateFormat' argument.
         //
         verifyException("org.jfree.chart.urls.TimeSeriesURLGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getInstance();
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator(dateFormat0, "?b#C", "?b#C", "?b#C");
      String string0 = timeSeriesURLGenerator0.getItemParameterName();
      assertEquals("?b#C", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator();
      String string0 = timeSeriesURLGenerator0.getSeriesParameterName();
      assertEquals("series", string0);
      assertEquals("item", timeSeriesURLGenerator0.getItemParameterName());
      assertEquals("index.html", timeSeriesURLGenerator0.getPrefix());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator();
      DateFormat dateFormat0 = timeSeriesURLGenerator0.getDateFormat();
      TimeSeriesURLGenerator timeSeriesURLGenerator1 = new TimeSeriesURLGenerator(dateFormat0, "index.html", "index.html", "index.html");
      boolean boolean0 = timeSeriesURLGenerator0.equals(timeSeriesURLGenerator1);
      assertFalse(boolean0);
      assertEquals("item", timeSeriesURLGenerator0.getItemParameterName());
      assertEquals("series", timeSeriesURLGenerator0.getSeriesParameterName());
      assertEquals("index.html", timeSeriesURLGenerator0.getPrefix());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator();
      String string0 = timeSeriesURLGenerator0.getPrefix();
      assertEquals("index.html", string0);
      assertEquals("item", timeSeriesURLGenerator0.getItemParameterName());
      assertEquals("series", timeSeriesURLGenerator0.getSeriesParameterName());
  }
}
