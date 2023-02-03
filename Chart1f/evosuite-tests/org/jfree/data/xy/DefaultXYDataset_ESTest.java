/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:22:57 GMT 2022
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.DomainOrder;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.xy.DefaultXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultXYDataset_ESTest extends DefaultXYDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      MockDate mockDate0 = new MockDate(0, 0, 2000, 1712, 150);
      Minute minute0 = new Minute(mockDate0);
      double[][] doubleArray0 = new double[2][9];
      defaultXYDataset0.addSeries(minute0, doubleArray0);
      defaultXYDataset0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      MockDate mockDate0 = new MockDate(0, 0, 2000, 1712, 152);
      Minute minute0 = new Minute(mockDate0);
      double[][] doubleArray0 = new double[2][9];
      double[] doubleArray1 = new double[4];
      doubleArray0[1] = doubleArray1;
      // Undeclared exception!
      try { 
        defaultXYDataset0.addSeries(minute0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'data' array must contain two arrays with equal length.
         //
         verifyException("org.jfree.data.xy.DefaultXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      Month month0 = new Month();
      double[][] doubleArray0 = new double[0][7];
      // Undeclared exception!
      try { 
        defaultXYDataset0.addSeries(month0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'data' array must have length == 2.
         //
         verifyException("org.jfree.data.xy.DefaultXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      MockDate mockDate0 = new MockDate(0, 0, 2000, 1712, 152);
      Minute minute0 = new Minute(mockDate0);
      double[][] doubleArray0 = new double[2][9];
      defaultXYDataset0.addSeries(minute0, doubleArray0);
      double double0 = defaultXYDataset0.getXValue(0, 3);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      // Undeclared exception!
      try { 
        defaultXYDataset0.getItemCount(223);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.DefaultXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      // Undeclared exception!
      try { 
        defaultXYDataset0.getSeriesKey(1895);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.DefaultXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      MockDate mockDate0 = new MockDate(0, 0, 2000, 1712, 152);
      Minute minute0 = new Minute(mockDate0);
      double[][] doubleArray0 = new double[2][9];
      defaultXYDataset0.addSeries(minute0, doubleArray0);
      // Undeclared exception!
      try { 
        defaultXYDataset0.getY(0, 59);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 59
         //
         verifyException("org.jfree.data.xy.DefaultXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      MockDate mockDate0 = new MockDate(0, 0, 2000, 1712, 152);
      Minute minute0 = new Minute(mockDate0);
      double[][] doubleArray0 = new double[2][9];
      defaultXYDataset0.addSeries(minute0, doubleArray0);
      int int0 = defaultXYDataset0.getSeriesCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      // Undeclared exception!
      try { 
        defaultXYDataset0.getYValue(0, (-1040));
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
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      // Undeclared exception!
      try { 
        defaultXYDataset0.getY(0, 0);
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
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      // Undeclared exception!
      try { 
        defaultXYDataset0.getXValue((-1990), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      // Undeclared exception!
      try { 
        defaultXYDataset0.getX(1052, 1052);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1052, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      int int0 = defaultXYDataset0.indexOf(1712.0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      // Undeclared exception!
      try { 
        defaultXYDataset0.getXValue(170, 212);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 170, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      // Undeclared exception!
      try { 
        defaultXYDataset0.getYValue((-92), 198);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      double[][] doubleArray0 = new double[2][9];
      defaultXYDataset0.addSeries(minute0, doubleArray0);
      defaultXYDataset0.clone();
      assertEquals(1, defaultXYDataset0.getSeriesCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      Object object0 = defaultXYDataset0.clone();
      boolean boolean0 = defaultXYDataset0.equals(object0);
      assertNotSame(object0, defaultXYDataset0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      boolean boolean0 = defaultXYDataset0.equals(defaultXYDataset0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      Object object0 = new Object();
      boolean boolean0 = defaultXYDataset0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      MockDate mockDate0 = new MockDate(0, 0, 2000, 1712, 152);
      Minute minute0 = new Minute(mockDate0);
      double[][] doubleArray0 = new double[2][9];
      defaultXYDataset0.addSeries(minute0, doubleArray0);
      defaultXYDataset0.removeSeries(minute0);
      assertEquals(0, defaultXYDataset0.getSeriesCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      MockDate mockDate0 = new MockDate(0, 0, 2000, 1712, 152);
      Minute minute0 = new Minute(mockDate0);
      defaultXYDataset0.removeSeries(minute0);
      assertEquals(10, minute0.getHourValue());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      MockDate mockDate0 = new MockDate(0, 0, 2000, 1712, 152);
      Minute minute0 = new Minute(mockDate0);
      double[][] doubleArray0 = new double[2][9];
      double[] doubleArray1 = new double[4];
      doubleArray0[0] = doubleArray1;
      // Undeclared exception!
      try { 
        defaultXYDataset0.addSeries(minute0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'data' array must contain two arrays with equal length.
         //
         verifyException("org.jfree.data.xy.DefaultXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(0, hour0);
      Day day0 = minute0.getDay();
      double[][] doubleArray0 = new double[5][1];
      // Undeclared exception!
      try { 
        defaultXYDataset0.addSeries(day0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'data' array must have length == 2.
         //
         verifyException("org.jfree.data.xy.DefaultXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      Hour hour0 = new Hour();
      // Undeclared exception!
      try { 
        defaultXYDataset0.addSeries(hour0, (double[][]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'data' is null.
         //
         verifyException("org.jfree.data.xy.DefaultXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      double[][] doubleArray0 = new double[5][1];
      // Undeclared exception!
      try { 
        defaultXYDataset0.addSeries((Comparable) null, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'seriesKey' cannot be null.
         //
         verifyException("org.jfree.data.xy.DefaultXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      double[][] doubleArray0 = new double[2][9];
      defaultXYDataset0.addSeries(minute0, doubleArray0);
      int int0 = defaultXYDataset0.getItemCount(0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      // Undeclared exception!
      try { 
        defaultXYDataset0.getItemCount(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.DefaultXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      // Undeclared exception!
      try { 
        defaultXYDataset0.getItemCount((-2402));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.DefaultXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      // Undeclared exception!
      try { 
        defaultXYDataset0.getSeriesKey(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.DefaultXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      // Undeclared exception!
      try { 
        defaultXYDataset0.getSeriesKey((-2233));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.DefaultXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      DomainOrder domainOrder0 = defaultXYDataset0.getDomainOrder();
      assertEquals("DomainOrder.NONE", domainOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      double[][] doubleArray0 = new double[2][9];
      defaultXYDataset0.addSeries(minute0, doubleArray0);
      Comparable comparable0 = defaultXYDataset0.getSeriesKey(0);
      assertNotNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      int int0 = defaultXYDataset0.getSeriesCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      // Undeclared exception!
      try { 
        defaultXYDataset0.getX((-1031), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
