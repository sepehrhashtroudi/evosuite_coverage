/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:24:03 GMT 2022
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Month;
import org.jfree.data.time.Week;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultIntervalXYDataset_ESTest extends DefaultIntervalXYDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      double[][] doubleArray0 = new double[6][2];
      double[] doubleArray1 = new double[4];
      doubleArray0[1] = doubleArray1;
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.addSeries(">RL-vdB", doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'data' array must contain six arrays with equal length.
         //
         verifyException("org.jfree.data.xy.DefaultIntervalXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      MockDate mockDate0 = new MockDate((-1527), 6, 6, 6, (-494));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      double[][] doubleArray0 = new double[7][6];
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.addSeries(fixedMillisecond0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'data' array must have length == 6.
         //
         verifyException("org.jfree.data.xy.DefaultIntervalXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getX((-1278), 4073);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getItemCount(2185);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.DefaultIntervalXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getSeriesKey(1539);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.DefaultIntervalXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getYValue(1655, 1655);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1655, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getY((-3192), 2201);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getXValue((-1863), 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getStartYValue((-2145), (-1745));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getStartY((-16), 778);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getStartXValue((-2077), (-2077));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getStartX((-2014), (-2014));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getEndYValue((-9999), (-9999));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getEndY((-1368), 2630);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getEndXValue((-675), 395);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getEndX(0, 649);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getYValue((-505), (-546));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      int int0 = defaultIntervalXYDataset0.getSeriesCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getEndXValue(29, 29);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 29, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getEndYValue(0, 4066);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getXValue(1, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getStartXValue(1643, 1643);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1643, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      Object object0 = defaultIntervalXYDataset0.clone();
      boolean boolean0 = defaultIntervalXYDataset0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      boolean boolean0 = defaultIntervalXYDataset0.equals(defaultIntervalXYDataset0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      boolean boolean0 = defaultIntervalXYDataset0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      double[][] doubleArray0 = new double[6][2];
      double[] doubleArray1 = new double[4];
      doubleArray0[0] = doubleArray1;
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.addSeries(">RL-vdB", doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'data' array must contain six arrays with equal length.
         //
         verifyException("org.jfree.data.xy.DefaultIntervalXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      double[][] doubleArray0 = new double[6][2];
      defaultIntervalXYDataset0.addSeries(">RL-vdB", doubleArray0);
      assertEquals(1, defaultIntervalXYDataset0.getSeriesCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(347, (-3863), 347);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Week week0 = new Week(date0);
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.addSeries(week0, (double[][]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'data' is null.
         //
         verifyException("org.jfree.data.xy.DefaultIntervalXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      double[][] doubleArray0 = new double[7][1];
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.addSeries((Comparable) null, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'seriesKey' cannot be null.
         //
         verifyException("org.jfree.data.xy.DefaultIntervalXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      Month month0 = new Month();
      double[][] doubleArray0 = new double[3][4];
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.addSeries(month0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'data' array must have length == 6.
         //
         verifyException("org.jfree.data.xy.DefaultIntervalXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getItemCount(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.DefaultIntervalXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getItemCount((-111));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.DefaultIntervalXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getSeriesKey(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.DefaultIntervalXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getSeriesKey((-1444));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.DefaultIntervalXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getStartY(0, 0);
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
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getEndY(1194, 1194);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1194, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getEndX((-1472), (-1472));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getY(3179, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3179, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      defaultIntervalXYDataset0.hashCode();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getStartX(0, (-982));
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
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getStartYValue(841, 841);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 841, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getX(9, 9);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 9, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
