/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:47:49 GMT 2022
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.xy.IntervalXYDelegate;
import org.jfree.data.xy.Vector;
import org.jfree.data.xy.VectorSeries;
import org.jfree.data.xy.VectorSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VectorSeriesCollection_ESTest extends VectorSeriesCollection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      MockDate mockDate0 = new MockDate(1, 1, 1, (-3295), (-3295), 44);
      Hour hour0 = new Hour(mockDate0);
      Minute minute0 = new Minute((-3295), hour0);
      VectorSeries vectorSeries0 = new VectorSeries(minute0, true, false);
      vectorSeriesCollection0.addSeries(vectorSeries0);
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getVector(0, 31);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 31, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getSeries(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.VectorSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      MockDate mockDate0 = new MockDate(1, 1, 1, (-3295), (-3295), 35);
      Hour hour0 = new Hour(mockDate0);
      Minute minute0 = new Minute((-3295), hour0);
      VectorSeries vectorSeries0 = new VectorSeries(minute0, true, false);
      IntervalXYDelegate intervalXYDelegate0 = new IntervalXYDelegate(vectorSeriesCollection0);
      vectorSeriesCollection0.addChangeListener(intervalXYDelegate0);
      vectorSeries0.add((-3295), (-473.54120312439), 0, 0);
      vectorSeries0.add(0.0, (-3295), 0, 0);
      vectorSeriesCollection0.addSeries(vectorSeries0);
      assertNull(vectorSeries0.getDescription());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      MockDate mockDate0 = new MockDate(0L);
      Hour hour0 = new Hour(mockDate0);
      VectorSeries vectorSeries0 = new VectorSeries(hour0, true, true);
      vectorSeriesCollection0.addSeries(vectorSeries0);
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getVectorXValue(0, 87);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 87, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      MockDate mockDate0 = new MockDate((-1476), 1800, 1800);
      TimeZone timeZone0 = TimeZone.getTimeZone("org.jfree.data.xy.VectorSeriesCollection");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Month month0 = new Month(mockDate0, timeZone0, locale0);
      VectorSeries vectorSeries0 = new VectorSeries(month0);
      vectorSeriesCollection0.addSeries(vectorSeries0);
      int int0 = vectorSeriesCollection0.indexOf(vectorSeries0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      MockDate mockDate0 = new MockDate(1, 1, 1, (-3295), (-3295), 44);
      Hour hour0 = new Hour(mockDate0);
      Minute minute0 = new Minute((-3295), hour0);
      VectorSeries vectorSeries0 = new VectorSeries(minute0, true, false);
      vectorSeries0.add((-3295), (-473.54120312439), 0, 0);
      vectorSeriesCollection0.addSeries(vectorSeries0);
      Vector vector0 = vectorSeriesCollection0.getVector(0, 0);
      assertEquals(0.0, vector0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      MockDate mockDate0 = new MockDate(1, 1, 1, (-3295), (-3295), 44);
      Hour hour0 = new Hour(mockDate0);
      Minute minute0 = new Minute((-3295), hour0);
      VectorSeries vectorSeries0 = new VectorSeries(minute0, true, false);
      vectorSeriesCollection0.addSeries(vectorSeries0);
      int int0 = vectorSeriesCollection0.getSeriesCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getYValue((-2364), (-2364));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getY((-9999), (-1310));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getXValue((-360), (-360));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getX(0, (-1));
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
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getVectorYValue((-1339), (-549));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getSeries((-1419));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.VectorSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getItemCount((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.VectorSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getXValue(0, 9999);
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
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      boolean boolean0 = vectorSeriesCollection0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.indexOf((VectorSeries) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.data.xy.VectorSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      MockDate mockDate0 = new MockDate(0L);
      Hour hour0 = new Hour(mockDate0);
      VectorSeries vectorSeries0 = new VectorSeries(hour0, true, true);
      int int0 = vectorSeriesCollection0.indexOf(vectorSeries0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getSeries(181);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.VectorSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      VectorSeries vectorSeries0 = new VectorSeries((byte)0, true, true);
      vectorSeriesCollection0.addSeries(vectorSeries0);
      vectorSeriesCollection0.removeAllSeries();
      assertEquals(0, vectorSeriesCollection0.getSeriesCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      MockDate mockDate0 = new MockDate(1, 1, 1, (-3295), (-3295), 44);
      Hour hour0 = new Hour(mockDate0);
      Minute minute0 = new Minute((-3295), hour0);
      VectorSeries vectorSeries0 = new VectorSeries(minute0, true, false);
      vectorSeriesCollection0.addSeries(vectorSeries0);
      boolean boolean0 = vectorSeriesCollection0.removeSeries(vectorSeries0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.removeSeries((VectorSeries) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.data.xy.VectorSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      VectorSeries vectorSeries0 = new VectorSeries((byte)0, true, true);
      boolean boolean0 = vectorSeriesCollection0.removeSeries(vectorSeries0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.addSeries((VectorSeries) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.data.xy.VectorSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getVectorXValue((-1), (-3588));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getVectorYValue(957, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 957, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getSeriesKey((-276));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.VectorSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getY(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getYValue(3058, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3058, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getX((-1075), (-378));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getVector((-1), 31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      int int0 = vectorSeriesCollection0.getSeriesCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      Object object0 = vectorSeriesCollection0.clone();
      boolean boolean0 = vectorSeriesCollection0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, vectorSeriesCollection0);
  }
}
