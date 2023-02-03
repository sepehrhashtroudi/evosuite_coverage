/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 20:48:24 GMT 2022
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormatSymbols;
import java.util.TimeZone;
import javax.swing.table.JTableHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.Range;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimePeriod;
import org.jfree.data.time.TimePeriodAnchor;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.TimePeriodValuesCollection;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimePeriodValuesCollection_ESTest extends TimePeriodValuesCollection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Day day0 = new Day();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(day0);
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getEndX(0, (-232));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getXValue(0, 212);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 212, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2L);
      Minute minute0 = new Minute(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(minute0, "tWf\".KGS^", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getStartX(minute0.FIRST_MINUTE_IN_HOUR, (-1188));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      timePeriodValues0.add((TimePeriod) hour0, (Number) 0);
      Number number0 = timePeriodValuesCollection0.getY(0, 0);
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Year year0 = new Year();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(year0, "TimePeriodAnchor unknown.", "TimePeriodAnchor unknown.");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      Comparable comparable0 = timePeriodValuesCollection0.getSeriesKey(0);
      assertSame(year0, comparable0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      int int0 = timePeriodValuesCollection0.getSeriesCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      timePeriodValues0.add((TimePeriod) hour0, 0.0);
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      TimePeriodValues timePeriodValues1 = timePeriodValuesCollection0.getSeries(0);
      assertNull(timePeriodValues1.getDescription());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      int int0 = timePeriodValuesCollection0.getItemCount(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      timePeriodValues0.add((TimePeriod) hour0, 0.0);
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      int int0 = timePeriodValuesCollection0.getItemCount(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      timePeriodValues0.add((TimePeriod) hour0, (Number) 0);
      Number number0 = timePeriodValuesCollection0.getEndY(0, 0);
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", ",ljI7h(C");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      timePeriodValues0.add((TimePeriod) hour0, (Number) 0);
      Number number0 = timePeriodValuesCollection0.getEndX(0, 0);
      assertEquals(1392409281320L, number0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.removeSeries(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index 'series' out of range.
         //
         verifyException("org.jfree.data.time.TimePeriodValuesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1L);
      Year year0 = new Year(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(year0, "", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getY((-9999), 9999);
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
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getX(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "Msm]Yp", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getStartY(0, 23);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 23, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getStartX(559, 559);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 559, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getEndY((-1213), (-621));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getEndX(1083, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1083, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      timePeriodValues0.add((TimePeriod) hour0, (Number) 0);
      Range range0 = timePeriodValuesCollection0.getDomainBounds(true);
      assertEquals(1.39240928132E12, range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      timePeriodValues0.add((TimePeriod) hour0, (Number) 0);
      Range range0 = timePeriodValuesCollection0.getDomainBounds(false);
      assertEquals(0.0, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Day day0 = new Day();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(day0, "rI~p+12B", "u1`NYfGe#A]$$H'");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      Range range0 = timePeriodValuesCollection0.getDomainBounds(true);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      timePeriodValuesCollection0.removeSeries(timePeriodValues0);
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      TimePeriodValues timePeriodValues1 = timePeriodValuesCollection0.getSeries(0);
      assertEquals((-1), timePeriodValues1.getMinMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockDate mockDate0 = new MockDate(12, 2569, 2569, (-122), 2569);
      Hour hour0 = new Hour(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0);
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getSeries((-122));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index 'series' out of range.
         //
         verifyException("org.jfree.data.time.TimePeriodValuesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getSeries(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index 'series' out of range.
         //
         verifyException("org.jfree.data.time.TimePeriodValuesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Day day0 = new Day();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(day0, "u-g`Dm+U^\"#M>O", "u-g`Dm+U^\"#M>O");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      int int0 = timePeriodValuesCollection0.getSeriesCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", ",ljI7h(C");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getY(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      Object object0 = timePeriodValuesCollection0.clone();
      boolean boolean0 = timePeriodValuesCollection0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      TimePeriodValuesCollection timePeriodValuesCollection1 = new TimePeriodValuesCollection();
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.START;
      timePeriodValuesCollection0.setXPosition(timePeriodAnchor0);
      boolean boolean0 = timePeriodValuesCollection0.equals(timePeriodValuesCollection1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      JTableHeader jTableHeader0 = new JTableHeader();
      boolean boolean0 = timePeriodValuesCollection0.equals(jTableHeader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      TimePeriodValuesCollection timePeriodValuesCollection1 = new TimePeriodValuesCollection();
      Object object0 = timePeriodValuesCollection1.clone();
      Year year0 = new Year();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(year0);
      timePeriodValuesCollection0.addSeries(timePeriodValues0);
      boolean boolean0 = timePeriodValuesCollection0.equals(object0);
      assertTrue(object0.equals((Object)timePeriodValuesCollection1));
      assertFalse(object0.equals((Object)timePeriodValuesCollection0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      timePeriodValues0.add((TimePeriod) hour0, (Number) 0);
      double double0 = timePeriodValuesCollection0.getDomainUpperBound(false);
      assertEquals(1.39240928132E12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      double double0 = timePeriodValuesCollection0.getDomainUpperBound(false);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      timePeriodValues0.add((TimePeriod) hour0, 0.0);
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      double double0 = timePeriodValuesCollection0.getDomainLowerBound(true);
      assertEquals(1.39240928132E12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2L);
      Minute minute0 = new Minute(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(minute0, "tWf\".KGS^", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      double double0 = timePeriodValuesCollection0.getDomainLowerBound(true);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      timePeriodValues0.add((TimePeriod) hour0, 0.0);
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      DateFormatSymbols dateFormatSymbols0 = new DateFormatSymbols();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeZone0);
      TimePeriodAnchor timePeriodAnchor0 = timeSeriesCollection0.getXPosition();
      timePeriodValuesCollection0.setXPosition(timePeriodAnchor0);
      Number number0 = timePeriodValuesCollection0.getX(0, 0);
      assertEquals(1392409281320L, number0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      timePeriodValues0.add((TimePeriod) hour0, 0.0);
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      Number number0 = timePeriodValuesCollection0.getX(0, 0);
      assertEquals(1392409281320L, number0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection((TimePeriodValues) null);
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.removeSeries((TimePeriodValues) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.data.time.TimePeriodValuesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.addSeries((TimePeriodValues) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.data.time.TimePeriodValuesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getSeriesKey((-1208));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index 'series' out of range.
         //
         verifyException("org.jfree.data.time.TimePeriodValuesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.setXPosition((TimePeriodAnchor) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'position' argument.
         //
         verifyException("org.jfree.data.time.TimePeriodValuesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getEndY(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getSeriesKey(273);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index 'series' out of range.
         //
         verifyException("org.jfree.data.time.TimePeriodValuesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getItemCount(2600);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index 'series' out of range.
         //
         verifyException("org.jfree.data.time.TimePeriodValuesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "XMsm]Yp", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      assertEquals(1, timePeriodValuesCollection0.getSeriesCount());
      
      timePeriodValuesCollection0.removeSeries(0);
      assertEquals(0, timePeriodValuesCollection0.getSeriesCount());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getX((-611), (-611));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2L);
      Minute minute0 = new Minute(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(minute0, "tWf\".KGS^", "");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      timePeriodValuesCollection0.getXPosition();
      assertEquals(1, timePeriodValuesCollection0.getSeriesCount());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      // Undeclared exception!
      try { 
        timePeriodValuesCollection0.getStartY((-151), 1896);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
