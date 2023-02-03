/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 20:33:47 GMT 2022
 */

package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Clock;
import java.time.Instant;
import java.time.chrono.JapaneseDate;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.DropMode;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.data.statistics.SimpleHistogramBin;
import org.jfree.data.statistics.SimpleHistogramDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.Second;
import org.jfree.data.time.SerialDate;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleHistogramDataset_ESTest extends SimpleHistogramDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = Integer.getInteger("qj^mbvW9", 29);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(integer0);
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 29);
      simpleHistogramDataset0.addBin(simpleHistogramBin0);
      simpleHistogramDataset0.addObservation(0.0);
      assertTrue(simpleHistogramDataset0.getAdjustForBinSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(integer0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.setSelected(0, 558, true, true);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 558, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(fixedMillisecond0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.setSelected((-707), (-707), true, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-840L));
      Millisecond millisecond0 = new Millisecond(mockDate0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(millisecond0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.setSelected(0, 53, true);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 53, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2779, 2779, 2779, 2779, 2779, 1318);
      Year year0 = new Year(mockDate0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(year0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.isSelected(2779, (-9999));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(millisecond0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getYValue(0, 0);
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
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-4349L), (-327L));
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(simpleTimePeriod0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getYValue((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Second second0 = new Second();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(second0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getY(0, (-18));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(3667L, 3667L);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(simpleTimePeriod0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getXValue((-5), (-5));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getX(1, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Clock clock0 = MockClock.systemUTC();
      JapaneseDate japaneseDate0 = MockJapaneseDate.now(clock0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(japaneseDate0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getStartYValue(30, 0);
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
      Millisecond millisecond0 = new Millisecond();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(millisecond0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getStartY(1, (-1506));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minute minute0 = new Minute();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(minute0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getStartXValue((-495), (-4126));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DropMode dropMode0 = DropMode.ON;
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(dropMode0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getStartX(110, 938);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 938, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Month month0 = new Month(date0, timeZone0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(month0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getEndYValue(1, (-254));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(5771);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(serialDate0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getEndY(3, 995);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 995, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Week week0 = new Week(mockDate0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(week0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getEndXValue(53, 53);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 53, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = Integer.getInteger("qj^mbvW9", 1);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(integer0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getEndX((-1258), 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Minute minute0 = new Minute(mockDate0, timeZone0);
      Day day0 = minute0.getDay();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(day0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.addObservations((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.statistics.SimpleHistogramDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(xYDataItem0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.addObservation(405.971928291922, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No bin.
         //
         verifyException("org.jfree.data.statistics.SimpleHistogramDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L, 4722L);
      Date date0 = Date.from(instant0);
      SerialDate serialDate0 = SerialDate.createInstance(date0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(serialDate0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getStartXValue(1900, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Week week0 = new Week();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(week0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getY(53, 53);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 53, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(fixedMillisecond0);
      SimpleHistogramDataset simpleHistogramDataset1 = new SimpleHistogramDataset(fixedMillisecond0);
      boolean boolean0 = simpleHistogramDataset0.equals(simpleHistogramDataset1);
      assertTrue(simpleHistogramDataset1.getAdjustForBinSize());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(fixedMillisecond0);
      boolean boolean0 = simpleHistogramDataset0.equals(simpleHistogramDataset0);
      assertTrue(simpleHistogramDataset0.getAdjustForBinSize());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Week week0 = new Week(mockDate0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(week0);
      boolean boolean0 = simpleHistogramDataset0.equals(week0);
      assertFalse(boolean0);
      assertTrue(simpleHistogramDataset0.getAdjustForBinSize());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(3647L, 3647L);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(simpleTimePeriod0);
      simpleHistogramDataset0.clearSelection();
      assertTrue(simpleHistogramDataset0.getAdjustForBinSize());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Integer integer0 = Integer.getInteger("qj^mbvW9", 1);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(integer0);
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 1);
      simpleHistogramDataset0.addBin(simpleHistogramBin0);
      simpleHistogramDataset0.setSelected(2000, 0, false);
      assertTrue(simpleHistogramDataset0.getAdjustForBinSize());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(xYDataItem0);
      simpleHistogramDataset0.clearObservations();
      assertTrue(simpleHistogramDataset0.getAdjustForBinSize());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Integer integer0 = Integer.getInteger("qj^mbvW9", 29);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(integer0);
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 29);
      simpleHistogramDataset0.addBin(simpleHistogramBin0);
      double[] doubleArray0 = new double[1];
      simpleHistogramDataset0.addObservations(doubleArray0);
      assertTrue(simpleHistogramDataset0.getAdjustForBinSize());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Integer integer0 = Integer.getInteger("qj^mbvW9", 1);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(integer0);
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 1);
      simpleHistogramDataset0.addBin(simpleHistogramBin0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 11;
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.addObservations(doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No bin.
         //
         verifyException("org.jfree.data.statistics.SimpleHistogramDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Integer integer0 = Integer.getInteger("qj^mbvW9", 29);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(integer0);
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 29);
      simpleHistogramDataset0.addBin(simpleHistogramBin0);
      simpleHistogramDataset0.addObservation(0.0, true);
      assertTrue(simpleHistogramDataset0.getAdjustForBinSize());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleHistogramDataset simpleHistogramDataset0 = null;
      try {
        simpleHistogramDataset0 = new SimpleHistogramDataset((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.statistics.SimpleHistogramDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(fixedMillisecond0);
      simpleHistogramDataset0.getDomainOrder();
      assertTrue(simpleHistogramDataset0.getAdjustForBinSize());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(fixedMillisecond0);
      boolean boolean0 = simpleHistogramDataset0.getAdjustForBinSize();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Year year0 = new Year();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(year0);
      simpleHistogramDataset0.fireSelectionEvent();
      assertTrue(simpleHistogramDataset0.getAdjustForBinSize());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Week week0 = new Week();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(week0);
      int int0 = simpleHistogramDataset0.getSeriesCount();
      assertTrue(simpleHistogramDataset0.getAdjustForBinSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Week week0 = new Week();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(week0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getEndX(53, (-635));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(fixedMillisecond0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getStartX(7, (-2888));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Clock clock0 = MockClock.systemUTC();
      JapaneseDate japaneseDate0 = MockJapaneseDate.now(clock0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(japaneseDate0);
      SimpleHistogramDataset simpleHistogramDataset1 = (SimpleHistogramDataset)simpleHistogramDataset0.clone();
      assertTrue(simpleHistogramDataset1.getAdjustForBinSize());
      assertNotSame(simpleHistogramDataset1, simpleHistogramDataset0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(fixedMillisecond0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.isSelected(212, 212);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 212, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Year year0 = new Year(305);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(year0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getStartYValue((-9999), (-4348));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DropMode dropMode0 = DropMode.ON;
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(dropMode0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.addObservation((double) 110);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No bin.
         //
         verifyException("org.jfree.data.statistics.SimpleHistogramDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(fixedMillisecond0);
      simpleHistogramDataset0.removeAllBins();
      assertTrue(simpleHistogramDataset0.getAdjustForBinSize());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Year year0 = new Year();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(year0);
      simpleHistogramDataset0.setAdjustForBinSize(true);
      assertTrue(simpleHistogramDataset0.getAdjustForBinSize());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Year year0 = new Year(305);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(year0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getEndY(28, (-9999));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(quarter0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getX((-735), Integer.MAX_VALUE);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2147483647, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(xYDataItem0);
      simpleHistogramDataset0.getSeriesKey(3671);
      assertTrue(simpleHistogramDataset0.getAdjustForBinSize());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-378), (-378), (-378), 0, (-378), (-378));
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Year year0 = new Year(mockDate0, timeZone0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(year0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getEndXValue(574, (-9999));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DropMode dropMode0 = DropMode.ON;
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(dropMode0);
      simpleHistogramDataset0.getItemCount(0);
      assertTrue(simpleHistogramDataset0.getAdjustForBinSize());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(fixedMillisecond0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getStartY(2865, 533);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 533, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Month month0 = new Month();
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(month0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.setSelected((-2849), (-2849), false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockDate mockDate0 = new MockDate(8, (-599), (-599));
      Week week0 = new Week(mockDate0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(week0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getEndYValue((-599), 4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Week week0 = new Week(mockDate0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(week0);
      // Undeclared exception!
      try { 
        simpleHistogramDataset0.getXValue(999, 53);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 53, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
