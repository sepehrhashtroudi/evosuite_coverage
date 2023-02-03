/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:43:24 GMT 2022
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JComponent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.jfree.chart.labels.StandardXYZToolTipGenerator;
import org.jfree.data.xy.DefaultXYZDataset;
import org.jfree.data.xy.MatrixSeries;
import org.jfree.data.xy.MatrixSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYZDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StandardXYZToolTipGenerator_ESTest extends StandardXYZToolTipGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator();
      MatrixSeries matrixSeries0 = new MatrixSeries("{0}: ({1}, {2}, {3})", 14, 0);
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection(matrixSeries0);
      // Undeclared exception!
      try { 
        standardXYZToolTipGenerator0.generateToolTip((XYZDataset) matrixSeriesCollection0, 0, 461);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.jfree.data.xy.MatrixSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance();
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("", dateFormat0, dateFormat0, dateFormat0);
      NumberFormat numberFormat0 = standardXYZToolTipGenerator0.getZFormat();
      assertNull(numberFormat0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance(locale0);
      NumberFormat numberFormat1 = NumberFormat.getIntegerInstance(locale0);
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("", numberFormat0, numberFormat0, numberFormat1);
      DecimalFormat decimalFormat0 = (DecimalFormat)standardXYZToolTipGenerator0.getZFormat();
      assertEquals(1, decimalFormat0.getMultiplier());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = JComponent.getDefaultLocale();
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance();
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("org.jfree.data.xy.AbstractXYZDataset", numberFormat0, numberFormat0, numberFormat1);
      NumberFormat numberFormat2 = standardXYZToolTipGenerator0.getZFormat();
      assertFalse(numberFormat2.isParseIntegerOnly());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat("TableOrder.BY_ROW");
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("TableOrder.BY_ROW", decimalFormat0, decimalFormat0, decimalFormat0);
      NumberFormat numberFormat0 = standardXYZToolTipGenerator0.getZFormat();
      assertEquals(0, numberFormat0.getMinimumIntegerDigits());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getDateTimeInstance();
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("{0}: ({1}, {2}, {3})", dateFormat0, dateFormat0, dateFormat0);
      DateFormat dateFormat1 = standardXYZToolTipGenerator0.getZDateFormat();
      assertSame(dateFormat0, dateFormat1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator();
      // Undeclared exception!
      try { 
        standardXYZToolTipGenerator0.generateToolTip((XYZDataset) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.labels.StandardXYZToolTipGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator();
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection();
      // Undeclared exception!
      try { 
        standardXYZToolTipGenerator0.generateToolTip((XYZDataset) matrixSeriesCollection0, 0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator();
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      // Undeclared exception!
      try { 
        standardXYZToolTipGenerator0.generateToolTip((XYZDataset) defaultXYZDataset0, 3331, 3331);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.DefaultXYZDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getDateInstance();
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("", dateFormat0, dateFormat0, dateFormat0);
      // Undeclared exception!
      try { 
        standardXYZToolTipGenerator0.generateLabelString((XYDataset) null, (-1194), (-1194));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.labels.StandardXYZToolTipGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("py=9(45/<z&oU\"", numberFormat0, numberFormat0, numberFormat0);
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection();
      // Undeclared exception!
      try { 
        standardXYZToolTipGenerator0.generateLabelString(matrixSeriesCollection0, 0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance();
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("h=ToIF4", numberFormat0, numberFormat0, numberFormat0);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection();
      // Undeclared exception!
      try { 
        standardXYZToolTipGenerator0.generateLabelString(xYSeriesCollection0, (-1742), (-1742));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.data.xy.XYSeriesCollection cannot be cast to org.jfree.data.xy.XYZDataset
         //
         verifyException("org.jfree.chart.labels.StandardXYZToolTipGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator();
      MatrixSeries matrixSeries0 = new MatrixSeries("{0}: ({1}, {2}, {3})", 14, 0);
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection(matrixSeries0);
      // Undeclared exception!
      try { 
        standardXYZToolTipGenerator0.generateLabelString(matrixSeriesCollection0, 0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.jfree.data.xy.MatrixSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("", mockSimpleDateFormat0, mockSimpleDateFormat0, mockSimpleDateFormat0);
      // Undeclared exception!
      try { 
        standardXYZToolTipGenerator0.createItemArray((XYZDataset) null, (-1224), (-1224));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.labels.StandardXYZToolTipGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator();
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection();
      // Undeclared exception!
      try { 
        standardXYZToolTipGenerator0.createItemArray(matrixSeriesCollection0, 0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getDateTimeInstance();
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("{0}: ({1}, {2}, {3})", dateFormat0, dateFormat0, dateFormat0);
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection();
      // Undeclared exception!
      try { 
        standardXYZToolTipGenerator0.createItemArray(matrixSeriesCollection0, 6, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index outside valid range.
         //
         verifyException("org.jfree.data.xy.MatrixSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator();
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      // Undeclared exception!
      try { 
        standardXYZToolTipGenerator0.generateLabelString(defaultXYZDataset0, (-1), 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.DefaultXYZDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance();
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("", dateFormat0, dateFormat0, dateFormat0);
      Object object0 = standardXYZToolTipGenerator0.clone();
      boolean boolean0 = standardXYZToolTipGenerator0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance();
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("", dateFormat0, dateFormat0, dateFormat0);
      DecimalFormat decimalFormat0 = new DecimalFormat();
      StandardXYZToolTipGenerator standardXYZToolTipGenerator1 = new StandardXYZToolTipGenerator("{0}: ({1}, {2}, {3})", decimalFormat0, decimalFormat0, decimalFormat0);
      boolean boolean0 = standardXYZToolTipGenerator0.equals(standardXYZToolTipGenerator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator();
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      boolean boolean0 = standardXYZToolTipGenerator0.equals(defaultXYZDataset0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = null;
      try {
        standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("UE%TRcD", (DateFormat) null, (DateFormat) null, (DateFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'zFormat' argument.
         //
         verifyException("org.jfree.chart.labels.StandardXYZToolTipGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance();
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("", dateFormat0, dateFormat0, dateFormat0);
      boolean boolean0 = standardXYZToolTipGenerator0.equals(standardXYZToolTipGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat();
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = null;
      try {
        standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("3odn-$o", decimalFormat0, decimalFormat0, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'zFormat' argument.
         //
         verifyException("org.jfree.chart.labels.StandardXYZToolTipGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator();
      DateFormat dateFormat0 = standardXYZToolTipGenerator0.getZDateFormat();
      assertNull(dateFormat0);
  }
}
