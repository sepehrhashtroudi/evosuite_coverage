/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 20:25:36 GMT 2022
 */

package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;
import org.jfree.data.time.Day;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.Second;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.SpreadsheetDate;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HistogramDataset_ESTest extends HistogramDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1644);
      Day day0 = new Day(spreadsheetDate0);
      double[] doubleArray0 = new double[9];
      histogramDataset0.addSeries((Comparable) day0, doubleArray0, 1);
      // Undeclared exception!
      try { 
        histogramDataset0.getStartY(0, (-1666));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) 9999;
      histogramDataset0.addSeries((Comparable) 9999.0, doubleArray0, 425);
      Number number0 = histogramDataset0.getX(0, 2);
      assertEquals(58.817647058823525, number0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1644);
      Day day0 = new Day(spreadsheetDate0);
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) 9999;
      histogramDataset0.addSeries((Comparable) day0, doubleArray0, 1);
      Number number0 = histogramDataset0.getX(0, 0);
      assertEquals(4999.5, number0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HistogramDataset histogramDataset0 = new HistogramDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-127L), 0);
      histogramDataset0.addSeries((Comparable) simpleTimePeriod0, doubleArray0, 654, (double) 1, (double) 59);
      Comparable comparable0 = histogramDataset0.getSeriesKey(0);
      assertNotNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1644);
      Day day0 = new Day(spreadsheetDate0);
      double[] doubleArray0 = new double[9];
      histogramDataset0.addSeries((Comparable) day0, doubleArray0, 1);
      int int0 = histogramDataset0.getSeriesCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HistogramDataset histogramDataset0 = new HistogramDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-2593L), 16);
      histogramDataset0.addSeries((Comparable) simpleTimePeriod0, doubleArray0, 411);
      Number number0 = histogramDataset0.getEndY(0, 0);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      MockDate mockDate0 = new MockDate((-1), (-1), 433);
      Quarter quarter0 = new Quarter(mockDate0);
      double[] doubleArray0 = new double[2];
      histogramDataset0.addSeries((Comparable) quarter0, doubleArray0, 433);
      Number number0 = histogramDataset0.getEndX(0, 30);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      MockDate mockDate0 = new MockDate((-1), (-1), 433);
      Quarter quarter0 = new Quarter(mockDate0);
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (double) 433;
      histogramDataset0.addSeries((Comparable) quarter0, doubleArray0, 433);
      Number number0 = histogramDataset0.getEndX(0, 30);
      assertEquals(31.0, number0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getY(14, 14);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 14, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getY((-1), 47);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getX(0, 2);
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
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getStartY(0, (-444));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getStartX(1644, 1648);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1644, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getSeriesKey((-5045));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getItemCount(0);
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
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getEndY(212, 212);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 212, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getEndY((-1462), 3603);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getEndX((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getBins(212);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 212, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getBins((-2315));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      MockDate mockDate0 = new MockDate((-1), (-1), 433);
      Quarter quarter0 = new Quarter(mockDate0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      histogramDataset0.addSeries((Comparable) quarter0, doubleArray0, 2958465);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      Week week0 = new Week(1, 3);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 53;
      histogramDataset0.addSeries((Comparable) week0, doubleArray0, 1, Double.NEGATIVE_INFINITY, 1.0);
      assertEquals(1, Week.FIRST_WEEK_IN_YEAR);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      Integer integer0 = Integer.valueOf(0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        histogramDataset0.addSeries((Comparable) integer0, doubleArray0, (-1919), (double) 0, (-517.9860182));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'bins' value must be at least 1.
         //
         verifyException("org.jfree.data.statistics.HistogramDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      int int0 = histogramDataset0.getSeriesCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      HistogramDataset histogramDataset1 = (HistogramDataset)histogramDataset0.clone();
      HistogramType histogramType0 = HistogramType.SCALE_AREA_TO_1;
      histogramDataset1.setType(histogramType0);
      boolean boolean0 = histogramDataset0.equals(histogramDataset1);
      assertFalse(histogramDataset1.equals((Object)histogramDataset0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      boolean boolean0 = histogramDataset0.equals(histogramDataset0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1644);
      Day day0 = new Day(spreadsheetDate0);
      boolean boolean0 = histogramDataset0.equals(day0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      Year year0 = new Year(643);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        histogramDataset0.addSeries((Comparable) year0, doubleArray0, 4527);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null or zero length 'values' argument.
         //
         verifyException("org.jfree.data.statistics.HistogramDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      XYDataItem xYDataItem0 = new XYDataItem((double) 0, (-0.20095030481915832));
      // Undeclared exception!
      try { 
        histogramDataset0.addSeries((Comparable) xYDataItem0, (double[]) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null or zero length 'values' argument.
         //
         verifyException("org.jfree.data.statistics.HistogramDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      MockDate mockDate0 = new MockDate();
      Second second0 = new Second(mockDate0);
      // Undeclared exception!
      try { 
        histogramDataset0.addSeries((Comparable) second0, (double[]) null, (-4547), (double) (-4547), (-1266.6776));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'values' argument.
         //
         verifyException("org.jfree.data.statistics.HistogramDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.addSeries((Comparable) null, (double[]) null, 4184, 0.0, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.statistics.HistogramDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.setType((HistogramType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'type' argument
         //
         verifyException("org.jfree.data.statistics.HistogramDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      Object object0 = histogramDataset0.clone();
      boolean boolean0 = histogramDataset0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, histogramDataset0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      HistogramType histogramType0 = histogramDataset0.getType();
      assertEquals("FREQUENCY", histogramType0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getItemCount((-2813));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getStartX((-1), (-3265));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1644);
      Day day0 = new Day(spreadsheetDate0);
      double[] doubleArray0 = new double[9];
      histogramDataset0.addSeries((Comparable) day0, doubleArray0, 1);
      histogramDataset0.clone();
      assertEquals(1, histogramDataset0.getSeriesCount());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getX((-4647), (-4647));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HistogramDataset histogramDataset0 = new HistogramDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-127L), 0);
      histogramDataset0.addSeries((Comparable) simpleTimePeriod0, doubleArray0, 654, (double) 1, (double) 59);
      Number number0 = histogramDataset0.getEndY(0, 0);
      assertEquals(3.0, number0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getSeriesKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        histogramDataset0.getEndX(0, 30);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
