/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:45:35 GMT 2022
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JComponent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.labels.HighLowItemLabelGenerator;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.DefaultHighLowDataset;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HighLowItemLabelGenerator_ESTest extends HighLowItemLabelGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getDateInstance();
      ChoiceFormat choiceFormat0 = new ChoiceFormat("h,;^");
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator(dateFormat0, choiceFormat0);
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset("h,;^", (OHLCDataItem[]) null);
      // Undeclared exception!
      try { 
        highLowItemLabelGenerator0.generateToolTip(defaultOHLCDataset0, (-2020), 3218);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.DefaultOHLCDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getTimeInstance(0);
      ChoiceFormat choiceFormat0 = new ChoiceFormat("Requires start >= 0.");
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator(dateFormat0, choiceFormat0);
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      HighLowItemLabelGenerator highLowItemLabelGenerator1 = new HighLowItemLabelGenerator(dateFormat0, numberFormat0);
      boolean boolean0 = highLowItemLabelGenerator0.equals(highLowItemLabelGenerator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = JComponent.getDefaultLocale();
      DateFormat dateFormat0 = MockDateFormat.getDateInstance(0, locale0);
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance(locale0);
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator(dateFormat0, numberFormat0);
      HighLowItemLabelGenerator highLowItemLabelGenerator1 = new HighLowItemLabelGenerator();
      boolean boolean0 = highLowItemLabelGenerator0.equals(highLowItemLabelGenerator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      boolean boolean0 = highLowItemLabelGenerator0.equals(highLowItemLabelGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      boolean boolean0 = highLowItemLabelGenerator0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      Object object0 = highLowItemLabelGenerator0.clone();
      boolean boolean0 = highLowItemLabelGenerator0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, highLowItemLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(1, hour0);
      Second second0 = new Second(1, minute0);
      Date[] dateArray0 = new Date[5];
      MockDate mockDate0 = new MockDate(0);
      dateArray0[0] = (Date) mockDate0;
      double[] doubleArray0 = new double[8];
      DefaultHighLowDataset defaultHighLowDataset0 = new DefaultHighLowDataset(second0, dateArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      String string0 = highLowItemLabelGenerator0.generateToolTip(defaultHighLowDataset0, 1, 0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(1, hour0);
      Second second0 = new Second(1, minute0);
      Date[] dateArray0 = new Date[5];
      double[] doubleArray0 = new double[8];
      DefaultHighLowDataset defaultHighLowDataset0 = new DefaultHighLowDataset(second0, dateArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        highLowItemLabelGenerator0.generateToolTip(defaultHighLowDataset0, 1, 585);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 585
         //
         verifyException("org.jfree.data.xy.DefaultHighLowDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      String string0 = highLowItemLabelGenerator0.generateToolTip(timeSeriesCollection0, 2179, 382);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", locale0);
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = null;
      try {
        highLowItemLabelGenerator0 = new HighLowItemLabelGenerator(mockSimpleDateFormat0, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'numberFormatter' argument.
         //
         verifyException("org.jfree.chart.labels.HighLowItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = null;
      try {
        highLowItemLabelGenerator0 = new HighLowItemLabelGenerator((DateFormat) null, numberFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dateFormatter' argument.
         //
         verifyException("org.jfree.chart.labels.HighLowItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      String string0 = highLowItemLabelGenerator0.generateLabel(timeSeriesCollection0, 382, 382);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      highLowItemLabelGenerator0.hashCode();
  }
}