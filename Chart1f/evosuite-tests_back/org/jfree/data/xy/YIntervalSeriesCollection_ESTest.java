/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:35:15 GMT 2022
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Second;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.YIntervalSeries;
import org.jfree.data.xy.YIntervalSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class YIntervalSeriesCollection_ESTest extends YIntervalSeriesCollection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.removeSeries(1268);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds.
         //
         verifyException("org.jfree.data.xy.YIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getStartX(2369, 2027);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2369, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      Minute minute0 = new Minute();
      Second second0 = new Second((-7), minute0);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(second0, false, false);
      yIntervalSeriesCollection0.addSeries(yIntervalSeries0);
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getEndXValue(0, 1302);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1302, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getYValue(1017, (-1898));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1017, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getY(2184, (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2184, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getX(0, 0);
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
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getStartYValue(1, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getStartY(1125, (-2999));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1125, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getEndYValue(216, (-115));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 216, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getEndY((-4204), (-1150));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getEndX(4998, 4998);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4998, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getSeries(305);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.YIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getStartX((-112), (-112));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      int int0 = yIntervalSeriesCollection0.getSeriesCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getEndX((-2536), (-2536));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      boolean boolean0 = yIntervalSeriesCollection0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      yIntervalSeriesCollection0.removeAllSeries();
      assertEquals(0, yIntervalSeriesCollection0.getSeriesCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.removeSeries((YIntervalSeries) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.data.xy.YIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      MockDate mockDate0 = new MockDate(0L);
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.ITALIAN;
      Year year0 = new Year(mockDate0, timeZone0, locale0);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(year0, true, false);
      yIntervalSeriesCollection0.removeSeries(yIntervalSeries0);
      assertFalse(yIntervalSeries0.getAllowDuplicateXValues());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.removeSeries(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds.
         //
         verifyException("org.jfree.data.xy.YIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.removeSeries((-9999));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds.
         //
         verifyException("org.jfree.data.xy.YIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getSeries((-1699));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.YIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.addSeries((YIntervalSeries) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.data.xy.YIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getTimeZone("Series index out of bounds.");
      Week week0 = new Week(mockDate0, timeZone0);
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(week0, false, false);
      yIntervalSeriesCollection0.addSeries(yIntervalSeries0);
      yIntervalSeriesCollection0.removeAllSeries();
      assertEquals(0, yIntervalSeriesCollection0.getSeriesCount());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getY((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getEndY(773, 773);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 773, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getStartY((-2362), 1259);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getEndYValue((-145), (-145));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getItemCount(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.YIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      Object object0 = yIntervalSeriesCollection0.clone();
      boolean boolean0 = yIntervalSeriesCollection0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, yIntervalSeriesCollection0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getYValue((-748), (-748));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getSeriesKey(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.YIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getStartYValue((-3), 1335);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        yIntervalSeriesCollection0.getX((-1299), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}