/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 20:34:39 GMT 2022
 */

package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.Regression;
import org.jfree.data.time.DynamicTimeSeriesCollection;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.TimePeriodValuesCollection;
import org.jfree.data.time.TimeTableXYDataset;
import org.jfree.data.time.Year;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Regression_ESTest extends Regression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new DynamicTimeSeriesCollection(227, 2);
      // Undeclared exception!
      try { 
        Regression.getPowerRegression((XYDataset) dynamicTimeSeriesCollection0, 227);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.DynamicTimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[2][7];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = (-1514.9964303378065);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = Regression.getPowerRegression(doubleArray0);
      assertFalse(doubleArray2.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[2][7];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 56.32367;
      doubleArray0[1] = doubleArray1;
      double[] doubleArray2 = Regression.getPowerRegression(doubleArray0);
      assertFalse(doubleArray2.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[4];
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, (-3562.9041679593), (-3562.9041679593), 1.7976931348623157E308, (-1802.0), (-890.35083));
      oHLCDataItemArray0[0] = oHLCDataItem0;
      oHLCDataItemArray0[1] = oHLCDataItemArray0[0];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(fixedMillisecond0, oHLCDataItemArray0);
      // Undeclared exception!
      try { 
        Regression.getOLSRegression((XYDataset) defaultOHLCDataset0, (-2272));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.DefaultOHLCDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Year year0 = new Year();
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[2];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(year0, oHLCDataItemArray0);
      // Undeclared exception!
      try { 
        Regression.getOLSRegression((XYDataset) defaultOHLCDataset0, 45);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.DefaultOHLCDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[2][7];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 56.32367;
      doubleArray1[1] = (-1514.9964303378065);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = Regression.getOLSRegression(doubleArray0);
      assertArrayEquals(new double[] {0.0, (-26.898041806185685)}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Regression.getPowerRegression((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[4][1];
      // Undeclared exception!
      try { 
        Regression.getPowerRegression(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        Regression.getPowerRegression((XYDataset) histogramDataset0, 1563);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1563, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        Regression.getPowerRegression((XYDataset) histogramDataset0, (-2059));
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
        Regression.getPolynomialRegression(histogramDataset0, 1971, 1971);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1971, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Regression.getOLSRegression((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[2][7];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      // Undeclared exception!
      try { 
        Regression.getOLSRegression(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        Regression.getOLSRegression((XYDataset) histogramDataset0, 19);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 19, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        Regression.getOLSRegression((XYDataset) histogramDataset0, (-1571));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      // Undeclared exception!
      try { 
        Regression.getPolynomialRegression(timeTableXYDataset0, 218, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[4];
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, (-3562.9041679593), (-3562.9041679593), 1.7976931348623157E308, Double.NEGATIVE_INFINITY, 1.7976931348623157E308);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      oHLCDataItemArray0[1] = oHLCDataItem0;
      oHLCDataItemArray0[2] = oHLCDataItem0;
      oHLCDataItemArray0[3] = oHLCDataItemArray0[0];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(fixedMillisecond0, oHLCDataItemArray0);
      // Undeclared exception!
      try { 
        Regression.getPolynomialRegression(defaultOHLCDataset0, (-2272), (-239));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("GxS2Mg7=~NUCitp");
      Locale locale0 = Locale.ITALIAN;
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset(timeZone0, locale0);
      // Undeclared exception!
      try { 
        Regression.getPolynomialRegression(timeTableXYDataset0, 4007, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not enough data.
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Regression.getPolynomialRegression((XYDataset) null, 12, 4139);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dataset' argument.
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[4];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(fixedMillisecond0, oHLCDataItemArray0);
      // Undeclared exception!
      try { 
        Regression.getPolynomialRegression(defaultOHLCDataset0, (-2272), (-239));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.DefaultOHLCDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[4];
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, (-3562.9041679593), (-3562.9041679593), 1.7976931348623157E308, Double.NEGATIVE_INFINITY, 1.7976931348623157E308);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      oHLCDataItemArray0[1] = oHLCDataItem0;
      oHLCDataItemArray0[2] = oHLCDataItemArray0[0];
      oHLCDataItemArray0[3] = oHLCDataItem0;
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(fixedMillisecond0, oHLCDataItemArray0);
      double[] doubleArray0 = Regression.getPowerRegression((XYDataset) defaultOHLCDataset0, (-2272));
      assertEquals(2, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new DynamicTimeSeriesCollection(227, 0);
      // Undeclared exception!
      try { 
        Regression.getPowerRegression((XYDataset) dynamicTimeSeriesCollection0, 227);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not enough data.
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      // Undeclared exception!
      try { 
        Regression.getPowerRegression(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not enough data.
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[4];
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, (-3562.9041679593), (-3562.9041679593), 1.7976931348623157E308, Double.NEGATIVE_INFINITY, 1.7976931348623157E308);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      oHLCDataItemArray0[1] = oHLCDataItem0;
      oHLCDataItemArray0[2] = oHLCDataItem0;
      oHLCDataItemArray0[3] = oHLCDataItemArray0[2];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(fixedMillisecond0, oHLCDataItemArray0);
      double[] doubleArray0 = Regression.getOLSRegression((XYDataset) defaultOHLCDataset0, (-2272));
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0, "0]", "0]");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      // Undeclared exception!
      try { 
        Regression.getOLSRegression((XYDataset) timePeriodValuesCollection0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not enough data.
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      // Undeclared exception!
      try { 
        Regression.getOLSRegression(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not enough data.
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[][] doubleArray0 = new double[3][7];
      double[] doubleArray1 = Regression.getOLSRegression(doubleArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray1, 0.01);
  }
}
