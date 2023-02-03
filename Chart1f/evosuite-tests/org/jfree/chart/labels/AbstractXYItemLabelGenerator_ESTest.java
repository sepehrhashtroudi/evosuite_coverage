/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:48:15 GMT 2022
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JSpinner;
import javax.swing.JTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.labels.AbstractXYItemLabelGenerator;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.gantt.XYTaskDataset;
import org.jfree.data.time.DynamicTimeSeriesCollection;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.TimePeriodValuesCollection;
import org.jfree.data.time.TimeTableXYDataset;
import org.jfree.data.time.Year;
import org.jfree.data.xy.DefaultHighLowDataset;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.YIntervalSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractXYItemLabelGenerator_ESTest extends AbstractXYItemLabelGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getDateInstance();
      Locale locale0 = Locale.JAPANESE;
      DateFormat dateFormat1 = MockDateFormat.getTimeInstance(0, locale0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("null", dateFormat0, dateFormat1);
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getInstance();
      Locale locale0 = Locale.CHINESE;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("", dateFormat0, numberFormat0);
      NumberFormat numberFormat1 = abstractXYItemLabelGenerator0.getYFormat();
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
      assertTrue(numberFormat1.isParseIntegerOnly());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance();
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      numberFormat0.setMinimumFractionDigits(92);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("Null 'yFormat' argument.", dateFormat0, numberFormat0);
      DecimalFormat decimalFormat0 = (DecimalFormat)abstractXYItemLabelGenerator0.getYFormat();
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
      assertEquals("#,##0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", decimalFormat0.toLocalizedPattern());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getDateInstance(0);
      JSpinner jSpinner0 = new JSpinner();
      JSpinner.NumberEditor jSpinner_NumberEditor0 = new JSpinner.NumberEditor(jSpinner0, "iDXLB/}[`z^SUVDz&`V");
      DecimalFormat decimalFormat0 = jSpinner_NumberEditor0.getFormat();
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("`^Fqww:jiSgx)`~xC", dateFormat0, decimalFormat0);
      DecimalFormat decimalFormat1 = (DecimalFormat)abstractXYItemLabelGenerator0.getYFormat();
      assertEquals("iDXLB/}[`z^SUVDz&`V", decimalFormat1.getPositivePrefix());
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance(1, 1);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("", dateFormat0, dateFormat0);
      abstractXYItemLabelGenerator0.getYDateFormat();
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat("QNy3");
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("QNy3", decimalFormat0, decimalFormat0);
      abstractXYItemLabelGenerator0.getXFormat();
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance(locale0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("", numberFormat0, numberFormat0);
      abstractXYItemLabelGenerator0.getXFormat();
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat();
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("QNy3", decimalFormat0, decimalFormat0);
      decimalFormat0.setMaximumIntegerDigits((-2352));
      abstractXYItemLabelGenerator0.getXFormat();
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("{2}", locale0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("{2}", numberFormat0, mockSimpleDateFormat0);
      NumberFormat numberFormat1 = abstractXYItemLabelGenerator0.getXFormat();
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
      assertTrue(numberFormat1.isParseIntegerOnly());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getDateInstance(0);
      JSpinner jSpinner0 = new JSpinner();
      JSpinner.NumberEditor jSpinner_NumberEditor0 = new JSpinner.NumberEditor(jSpinner0, "iDXLB/}[`z^SUVDz&`V");
      DecimalFormat decimalFormat0 = jSpinner_NumberEditor0.getFormat();
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("`^Fqww:jiSgx)`~xC", dateFormat0, decimalFormat0);
      abstractXYItemLabelGenerator0.getXDateFormat();
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getInstance();
      Locale locale0 = Locale.CHINESE;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("", dateFormat0, numberFormat0);
      abstractXYItemLabelGenerator0.getFormatString();
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat("QNy3");
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("QNy3", decimalFormat0, decimalFormat0);
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      Date[] dateArray0 = new Date[5];
      dateArray0[0] = (Date) mockDate0;
      double[] doubleArray0 = new double[3];
      DefaultHighLowDataset defaultHighLowDataset0 = new DefaultHighLowDataset(year0, dateArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      Object[] objectArray0 = abstractXYItemLabelGenerator0.createItemArray(defaultHighLowDataset0, (-9999), 0);
      assertEquals(3, objectArray0.length);
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance(locale0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("", numberFormat0, numberFormat0);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      XYTaskDataset xYTaskDataset0 = new XYTaskDataset(taskSeriesCollection0);
      // Undeclared exception!
      try { 
        abstractXYItemLabelGenerator0.generateLabelString(xYTaskDataset0, 0, Integer.MAX_VALUE);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat("zj(ZQE{.njz/");
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("zj(ZQE{.njz/", decimalFormat0, decimalFormat0);
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      Date[] dateArray0 = new Date[5];
      dateArray0[0] = (Date) mockDate0;
      double[] doubleArray0 = new double[3];
      DefaultHighLowDataset defaultHighLowDataset0 = new DefaultHighLowDataset(year0, dateArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        abstractXYItemLabelGenerator0.generateLabelString(defaultHighLowDataset0, (-1739), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator();
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        abstractXYItemLabelGenerator0.generateLabelString(defaultIntervalXYDataset0, 4693, 4693);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.DefaultIntervalXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("Null 'xFormat' argument.");
      NumberFormat numberFormat0 = NumberFormat.getInstance(locale0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("", numberFormat0, numberFormat0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("", "Null 'xFormat' argument.", (String) null);
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      // Undeclared exception!
      try { 
        abstractXYItemLabelGenerator0.generateLabelString(timePeriodValuesCollection0, 0, (-2120));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.US;
      NumberFormat numberFormat0 = NumberFormat.getInstance(locale0);
      DateFormat dateFormat0 = MockDateFormat.getTimeInstance(0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("CXz62", numberFormat0, dateFormat0);
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        abstractXYItemLabelGenerator0.createItemArray(yIntervalSeriesCollection0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.YIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(203, "");
      DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new DynamicTimeSeriesCollection(0, 23, simpleTimeZone0);
      // Undeclared exception!
      try { 
        abstractXYItemLabelGenerator0.createItemArray(dynamicTimeSeriesCollection0, 1, 90);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.jfree.data.time.DynamicTimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = null;
      try {
        abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("Null 'series' argument.", (NumberFormat) null, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'xFormat' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractXYItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance(0, 0, locale0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("Bu", numberFormat0, dateFormat0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator1 = (AbstractXYItemLabelGenerator)abstractXYItemLabelGenerator0.clone();
      assertNotSame(abstractXYItemLabelGenerator1, abstractXYItemLabelGenerator0);
      assertEquals("null", abstractXYItemLabelGenerator1.getNullYString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance(0, 0, locale0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("P", numberFormat0, dateFormat0);
      NumberFormat numberFormat1 = NumberFormat.getInstance();
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator1 = new AbstractXYItemLabelGenerator("P", numberFormat0, numberFormat1);
      boolean boolean0 = abstractXYItemLabelGenerator0.equals(abstractXYItemLabelGenerator1);
      assertEquals("null", abstractXYItemLabelGenerator1.getNullYString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance(0, 0, locale0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("Bu", numberFormat0, dateFormat0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator1 = new AbstractXYItemLabelGenerator("Bu", numberFormat0, numberFormat0);
      boolean boolean0 = abstractXYItemLabelGenerator0.equals(abstractXYItemLabelGenerator1);
      assertFalse(boolean0);
      assertEquals("null", abstractXYItemLabelGenerator1.getNullYString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      DecimalFormat decimalFormat0 = new DecimalFormat();
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance(0, 0, locale0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("P", decimalFormat0, dateFormat0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator1 = new AbstractXYItemLabelGenerator("P", dateFormat0, decimalFormat0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator2 = (AbstractXYItemLabelGenerator)abstractXYItemLabelGenerator1.clone();
      boolean boolean0 = abstractXYItemLabelGenerator0.equals(abstractXYItemLabelGenerator2);
      assertFalse(boolean0);
      assertEquals("null", abstractXYItemLabelGenerator2.getNullYString());
      assertTrue(abstractXYItemLabelGenerator2.equals((Object)abstractXYItemLabelGenerator1));
      assertNotSame(abstractXYItemLabelGenerator2, abstractXYItemLabelGenerator1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator();
      Locale locale0 = Locale.CHINESE;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance(0, 0, locale0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator1 = new AbstractXYItemLabelGenerator("Bu", numberFormat0, dateFormat0);
      boolean boolean0 = abstractXYItemLabelGenerator0.equals(abstractXYItemLabelGenerator1);
      assertFalse(boolean0);
      assertEquals("null", abstractXYItemLabelGenerator1.getNullYString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator();
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator1 = (AbstractXYItemLabelGenerator)abstractXYItemLabelGenerator0.clone();
      boolean boolean0 = abstractXYItemLabelGenerator0.equals(abstractXYItemLabelGenerator1);
      assertTrue(boolean0);
      assertNotSame(abstractXYItemLabelGenerator1, abstractXYItemLabelGenerator0);
      assertEquals("null", abstractXYItemLabelGenerator1.getNullYString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator();
      boolean boolean0 = abstractXYItemLabelGenerator0.equals(abstractXYItemLabelGenerator0);
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator();
      DateFormat dateFormat0 = DateFormat.getTimeInstance();
      boolean boolean0 = abstractXYItemLabelGenerator0.equals(dateFormat0);
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat("QNy3");
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("QNy3", decimalFormat0, decimalFormat0);
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      Date[] dateArray0 = new Date[5];
      dateArray0[0] = (Date) mockDate0;
      double[] doubleArray0 = new double[3];
      DefaultHighLowDataset defaultHighLowDataset0 = new DefaultHighLowDataset(year0, dateArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      abstractXYItemLabelGenerator0.generateLabelString(defaultHighLowDataset0, (-1739), 0);
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getDateTimeInstance();
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = null;
      try {
        abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("", dateFormat0, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'yFormat' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractXYItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getDateInstance();
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = null;
      try {
        abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("", (NumberFormat) null, dateFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'xFormat' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractXYItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = null;
      try {
        abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator((String) null, (DateFormat) null, (DateFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'formatString' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractXYItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator();
      String string0 = abstractXYItemLabelGenerator0.getNullYString();
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance();
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("}{p6O*mOvyZJ*/.w", numberFormat0, numberFormat0);
      // Undeclared exception!
      try { 
        abstractXYItemLabelGenerator0.generateLabelString((XYDataset) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.labels.AbstractXYItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator();
      abstractXYItemLabelGenerator0.getYDateFormat();
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator();
      NumberFormat numberFormat0 = abstractXYItemLabelGenerator0.getXFormat();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Object[][] objectArray0 = new Object[4][3];
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = (Object) timeZone0;
      objectArray1[1] = (Object) numberFormat0;
      objectArray0[0] = objectArray1;
      JTable jTable0 = new JTable(objectArray0, objectArray0[0]);
      Locale locale0 = jTable0.getLocale();
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset(timeZone0, locale0);
      // Undeclared exception!
      try { 
        abstractXYItemLabelGenerator0.createItemArray(timeTableXYDataset0, 2, 715);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance(0, 0, locale0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("Bu", numberFormat0, dateFormat0);
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator1 = new AbstractXYItemLabelGenerator("Bu", dateFormat0, numberFormat0);
      boolean boolean0 = abstractXYItemLabelGenerator0.equals(abstractXYItemLabelGenerator1);
      assertFalse(boolean0);
      assertEquals("null", abstractXYItemLabelGenerator1.getNullYString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator();
      abstractXYItemLabelGenerator0.hashCode();
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator();
      abstractXYItemLabelGenerator0.getFormatString();
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator();
      abstractXYItemLabelGenerator0.getXDateFormat();
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator("WA_-v-\"Kf~6>vD5pm", (DateFormat) null, (DateFormat) null);
      // Undeclared exception!
      try { 
        abstractXYItemLabelGenerator0.createItemArray((XYDataset) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.labels.AbstractXYItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      AbstractXYItemLabelGenerator abstractXYItemLabelGenerator0 = new AbstractXYItemLabelGenerator();
      NumberFormat numberFormat0 = abstractXYItemLabelGenerator0.getYFormat();
      numberFormat0.setMaximumIntegerDigits((-2014565503));
      abstractXYItemLabelGenerator0.getYFormat();
      assertEquals("null", abstractXYItemLabelGenerator0.getNullYString());
  }
}