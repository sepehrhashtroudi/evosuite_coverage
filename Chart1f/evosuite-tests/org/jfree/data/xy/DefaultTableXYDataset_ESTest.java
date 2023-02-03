/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:44:03 GMT 2022
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.event.SeriesChangeEvent;
import org.jfree.data.general.SeriesChangeInfo;
import org.jfree.data.general.SeriesChangeType;
import org.jfree.data.time.Second;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYSeries;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultTableXYDataset_ESTest extends DefaultTableXYDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getStartYValue((-33), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getItemCount(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index outside valid range.
         //
         verifyException("org.jfree.data.xy.DefaultTableXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      defaultTableXYDataset0.setIntervalPositionFactor(0);
      assertEquals(0.0, defaultTableXYDataset0.getIntervalPositionFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      boolean boolean0 = defaultTableXYDataset0.isAutoPrune();
      assertTrue(boolean0);
      assertFalse(defaultTableXYDataset0.isAutoWidth());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.setIntervalWidth((-828.4168274710415));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'w' argument.
         //
         verifyException("org.jfree.data.xy.IntervalXYDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getY(1, 3205);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getX((-2953), (-2953));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(false);
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getStartY((-2577), (-2577));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getStartX(0, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(false);
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getEndY(0, 30);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(false);
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getEndX(59, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 59, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      defaultTableXYDataset0.getDomainBounds(false);
      assertFalse(defaultTableXYDataset0.isAutoWidth());
      assertFalse(defaultTableXYDataset0.isAutoPrune());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      defaultTableXYDataset0.prune();
      assertFalse(defaultTableXYDataset0.isAutoPrune());
      assertFalse(defaultTableXYDataset0.isAutoWidth());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getSeries(1099);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index outside valid range.
         //
         verifyException("org.jfree.data.xy.DefaultTableXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getSeries((-840));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index outside valid range.
         //
         verifyException("org.jfree.data.xy.DefaultTableXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      defaultTableXYDataset0.updateXPoints();
      assertTrue(defaultTableXYDataset0.isAutoPrune());
      assertFalse(defaultTableXYDataset0.isAutoWidth());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      defaultTableXYDataset0.updateXPoints();
      assertFalse(defaultTableXYDataset0.isAutoWidth());
      assertFalse(defaultTableXYDataset0.isAutoPrune());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(false);
      defaultTableXYDataset0.getSeriesCount();
      assertFalse(defaultTableXYDataset0.isAutoPrune());
      assertFalse(defaultTableXYDataset0.isAutoWidth());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getX(9999, (-457));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 9999, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(false);
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getY((-3333), (-6492));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      boolean boolean0 = defaultTableXYDataset0.isAutoWidth();
      assertFalse(boolean0);
      assertFalse(defaultTableXYDataset0.isAutoPrune());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      defaultTableXYDataset0.getIntervalPositionFactor();
      assertTrue(defaultTableXYDataset0.isAutoPrune());
      assertFalse(defaultTableXYDataset0.isAutoWidth());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      defaultTableXYDataset0.getIntervalWidth();
      assertFalse(defaultTableXYDataset0.isAutoWidth());
      assertFalse(defaultTableXYDataset0.isAutoPrune());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(false);
      defaultTableXYDataset0.getDomainBounds(true);
      assertFalse(defaultTableXYDataset0.isAutoPrune());
      assertFalse(defaultTableXYDataset0.isAutoWidth());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      defaultTableXYDataset0.hashCode();
      assertFalse(defaultTableXYDataset0.isAutoWidth());
      assertTrue(defaultTableXYDataset0.isAutoPrune());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      defaultTableXYDataset0.hashCode();
      assertFalse(defaultTableXYDataset0.isAutoPrune());
      assertFalse(defaultTableXYDataset0.isAutoWidth());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      DefaultTableXYDataset defaultTableXYDataset1 = new DefaultTableXYDataset();
      boolean boolean0 = defaultTableXYDataset0.equals(defaultTableXYDataset1);
      assertFalse(defaultTableXYDataset1.isAutoPrune());
      assertFalse(boolean0);
      assertFalse(defaultTableXYDataset1.isAutoWidth());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      DefaultTableXYDataset defaultTableXYDataset1 = new DefaultTableXYDataset(true);
      boolean boolean0 = defaultTableXYDataset0.equals(defaultTableXYDataset1);
      assertTrue(boolean0);
      assertFalse(defaultTableXYDataset1.isAutoWidth());
      assertTrue(defaultTableXYDataset1.isAutoPrune());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      boolean boolean0 = defaultTableXYDataset0.equals(defaultTableXYDataset0);
      assertFalse(defaultTableXYDataset0.isAutoWidth());
      assertTrue(boolean0);
      assertTrue(defaultTableXYDataset0.isAutoPrune());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      boolean boolean0 = defaultTableXYDataset0.equals("0:+V*n%M");
      assertFalse(defaultTableXYDataset0.isAutoWidth());
      assertFalse(boolean0);
      assertFalse(defaultTableXYDataset0.isAutoPrune());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      SeriesChangeType seriesChangeType0 = SeriesChangeType.UPDATE;
      SeriesChangeInfo seriesChangeInfo0 = new SeriesChangeInfo(seriesChangeType0, 1, 1);
      SeriesChangeEvent seriesChangeEvent0 = new SeriesChangeEvent(defaultTableXYDataset0, seriesChangeInfo0);
      defaultTableXYDataset0.seriesChanged(seriesChangeEvent0);
      assertTrue(defaultTableXYDataset0.isAutoPrune());
      assertFalse(defaultTableXYDataset0.isAutoWidth());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      boolean boolean0 = defaultTableXYDataset0.canPrune((Number) null);
      assertFalse(defaultTableXYDataset0.isAutoWidth());
      assertTrue(defaultTableXYDataset0.isAutoPrune());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(false);
      Second second0 = new Second();
      defaultTableXYDataset0.removeAllValuesForX(second0.FIRST_SECOND_IN_MINUTE);
      assertFalse(defaultTableXYDataset0.isAutoPrune());
      assertFalse(defaultTableXYDataset0.isAutoWidth());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.removeSeries(242);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index outside valid range.
         //
         verifyException("org.jfree.data.xy.DefaultTableXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.removeSeries(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.removeSeries((-2274));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index outside valid range.
         //
         verifyException("org.jfree.data.xy.DefaultTableXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(false);
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.removeSeries((XYSeries) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.data.xy.DefaultTableXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      XYSeries xYSeries0 = new XYSeries(year0);
      defaultTableXYDataset0.removeSeries(xYSeries0);
      assertFalse(defaultTableXYDataset0.isAutoWidth());
      assertFalse(defaultTableXYDataset0.isAutoPrune());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      defaultTableXYDataset0.removeAllSeries();
      assertTrue(defaultTableXYDataset0.isAutoPrune());
      assertFalse(defaultTableXYDataset0.isAutoWidth());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      defaultTableXYDataset0.getItemCount();
      assertFalse(defaultTableXYDataset0.isAutoPrune());
      assertFalse(defaultTableXYDataset0.isAutoWidth());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      DefaultTableXYDataset defaultTableXYDataset1 = (DefaultTableXYDataset)defaultTableXYDataset0.clone();
      assertTrue(defaultTableXYDataset1.isAutoPrune());
      assertTrue(defaultTableXYDataset1.equals((Object)defaultTableXYDataset0));
      assertFalse(defaultTableXYDataset1.isAutoWidth());
      assertNotSame(defaultTableXYDataset1, defaultTableXYDataset0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(false);
      Second second0 = new Second();
      XYSeries xYSeries0 = new XYSeries(second0, false, false);
      defaultTableXYDataset0.addSeries(xYSeries0);
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.removeAllValuesForX(second0.LAST_SECOND_IN_MINUTE);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.addSeries((XYSeries) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.data.xy.DefaultTableXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      Week week0 = new Week((-1219), (-1219));
      XYSeries xYSeries0 = new XYSeries(week0);
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.addSeries(xYSeries0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot accept XYSeries that allow duplicate values. Use XYSeries(seriesName, <sort>, false) constructor.
         //
         verifyException("org.jfree.data.xy.DefaultTableXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      boolean boolean0 = defaultTableXYDataset0.isAutoPrune();
      assertFalse(boolean0);
      assertFalse(defaultTableXYDataset0.isAutoWidth());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getStartX((-959), (-959));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      assertFalse(defaultTableXYDataset0.isAutoWidth());
      
      defaultTableXYDataset0.setAutoWidth(true);
      assertTrue(defaultTableXYDataset0.isAutoWidth());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      defaultTableXYDataset0.getDomainUpperBound(true);
      assertFalse(defaultTableXYDataset0.isAutoWidth());
      assertFalse(defaultTableXYDataset0.isAutoPrune());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      assertFalse(defaultTableXYDataset0.isAutoWidth());
      
      defaultTableXYDataset0.setIntervalWidth(29);
      assertFalse(defaultTableXYDataset0.isAutoPrune());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.setIntervalPositionFactor((-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument 'd' outside valid range.
         //
         verifyException("org.jfree.data.xy.IntervalXYDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      defaultTableXYDataset0.getDomainLowerBound(false);
      assertFalse(defaultTableXYDataset0.isAutoWidth());
      assertTrue(defaultTableXYDataset0.isAutoPrune());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getStartY(29, 29);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 29, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getEndY((-2690), 51);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getSeriesKey(12);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index outside valid range.
         //
         verifyException("org.jfree.data.xy.DefaultTableXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      // Undeclared exception!
      try { 
        defaultTableXYDataset0.getEndX((-2325), (-2325));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}