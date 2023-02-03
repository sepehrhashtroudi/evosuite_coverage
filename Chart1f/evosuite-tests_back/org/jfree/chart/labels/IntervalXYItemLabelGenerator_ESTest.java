/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:37:35 GMT 2022
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.labels.IntervalXYItemLabelGenerator;
import org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.SimpleHistogramDataset;
import org.jfree.data.time.Month;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.CategoryTableXYDataset;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.MatrixSeries;
import org.jfree.data.xy.MatrixSeriesCollection;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.XIntervalSeriesCollection;
import org.jfree.data.xy.XYBarDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IntervalXYItemLabelGenerator_ESTest extends IntervalXYItemLabelGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator();
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[8];
      MockDate mockDate0 = new MockDate(775L);
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, 775L, (-467.4568758702), 775L, 775L, (-467.4568758702));
      oHLCDataItemArray0[0] = oHLCDataItem0;
      oHLCDataItemArray0[1] = oHLCDataItemArray0[0];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset("{5} - {6}", oHLCDataItemArray0);
      String string0 = intervalXYItemLabelGenerator0.generateLabel(defaultOHLCDataset0, 1, 1);
      assertEquals("775 - 775", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0, 0);
      Month month0 = new Month(mockDate0);
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[2];
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, 0, 0, 0, 0, 0);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(month0, oHLCDataItemArray0);
      DateFormat dateFormat0 = MockDateFormat.getInstance();
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator("", dateFormat0, dateFormat0);
      String string0 = intervalXYItemLabelGenerator0.generateLabel(defaultOHLCDataset0, 0, 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator();
      // Undeclared exception!
      try { 
        intervalXYItemLabelGenerator0.generateLabel((XYDataset) null, 244, 244);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.labels.IntervalXYItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator();
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        intervalXYItemLabelGenerator0.generateLabel(histogramDataset0, 1542, 2190);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1542, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator();
      // Undeclared exception!
      try { 
        intervalXYItemLabelGenerator0.createItemArray((XYDataset) null, (-246), 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.labels.IntervalXYItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      DateFormat dateFormat0 = MockDateFormat.getDateInstance();
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator("", numberFormat0, dateFormat0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset("{5} - {6}");
      // Undeclared exception!
      try { 
        intervalXYItemLabelGenerator0.createItemArray(simpleHistogramDataset0, 1125, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator();
      DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset0 = new DefaultBoxAndWhiskerXYDataset("{5} - {6}");
      // Undeclared exception!
      try { 
        intervalXYItemLabelGenerator0.createItemArray(defaultBoxAndWhiskerXYDataset0, 0, (-663));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = null;
      try {
        intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator("J&I$'^|ey+p=A|Dt Yp", (NumberFormat) null, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'xFormat' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractXYItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getInstance();
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = null;
      try {
        intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator("\u0003", (NumberFormat) null, dateFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'xFormat' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractXYItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = null;
      try {
        intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator("", mockSimpleDateFormat0, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'yFormat' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractXYItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("9}", locale0);
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = null;
      try {
        intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator((String) null, mockSimpleDateFormat0, mockSimpleDateFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'formatString' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractXYItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      NumberFormat numberFormat0 = mockSimpleDateFormat0.getNumberFormat();
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator("", numberFormat0, numberFormat0);
      assertEquals("", intervalXYItemLabelGenerator0.getFormatString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance();
      DateFormat dateFormat0 = DateFormat.getInstance();
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator("SnH$-VN&Flq3e?eI/", numberFormat0, dateFormat0);
      boolean boolean0 = intervalXYItemLabelGenerator0.equals("SnH$-VN&Flq3e?eI/");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator();
      boolean boolean0 = intervalXYItemLabelGenerator0.equals(intervalXYItemLabelGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator();
      SpinnerNumberModel spinnerNumberModel0 = new SpinnerNumberModel((-2583), (-2583), 3797, 3797);
      JSpinner jSpinner0 = new JSpinner(spinnerNumberModel0);
      JSpinner.NumberEditor jSpinner_NumberEditor0 = new JSpinner.NumberEditor(jSpinner0, "{5} - {6}");
      DecimalFormat decimalFormat0 = jSpinner_NumberEditor0.getFormat();
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator1 = new IntervalXYItemLabelGenerator("{5} - {6}", decimalFormat0, (DateFormat) null);
      boolean boolean0 = intervalXYItemLabelGenerator0.equals(intervalXYItemLabelGenerator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator();
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[8];
      MockDate mockDate0 = new MockDate(775L);
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, 775L, 775L, 775L, 775L, 775L);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset("{5} - {6}", oHLCDataItemArray0);
      XYBarDataset xYBarDataset0 = new XYBarDataset(defaultOHLCDataset0, 0.0);
      Object[] objectArray0 = intervalXYItemLabelGenerator0.createItemArray(xYBarDataset0, (-2317), 0);
      assertEquals(7, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator();
      MatrixSeries matrixSeries0 = new MatrixSeries("", 8, 0);
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection(matrixSeries0);
      // Undeclared exception!
      try { 
        intervalXYItemLabelGenerator0.createItemArray(matrixSeriesCollection0, 0, 1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.jfree.data.xy.MatrixSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateFormat dateFormat0 = DateFormat.getTimeInstance(0, locale0);
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator("", dateFormat0, dateFormat0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection((TimeSeries) null);
      // Undeclared exception!
      try { 
        intervalXYItemLabelGenerator0.generateLabel(timeSeriesCollection0, 0, (-3097));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'series' argument is out of bounds (0).
         //
         verifyException("org.jfree.data.time.TimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getDateInstance();
      Locale locale0 = Locale.JAPAN;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator("u_d2zay", dateFormat0, numberFormat0);
      XIntervalSeriesCollection xIntervalSeriesCollection0 = new XIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        intervalXYItemLabelGenerator0.createItemArray(xIntervalSeriesCollection0, 23, 23);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.XIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance();
      DateFormat dateFormat0 = DateFormat.getInstance();
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator("SnH$-VN&Flq3e?eI/", numberFormat0, dateFormat0);
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        intervalXYItemLabelGenerator0.generateLabel(categoryTableXYDataset0, (-1452), (-1452));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator();
      Object object0 = intervalXYItemLabelGenerator0.clone();
      assertNotSame(object0, intervalXYItemLabelGenerator0);
  }
}