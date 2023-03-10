/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:53:22 GMT 2022
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.labels.MultipleXYSeriesLabelGenerator;
import org.jfree.data.jdbc.JDBCXYDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.SimpleHistogramDataset;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.TimePeriodValuesCollection;
import org.jfree.data.time.TimeTableXYDataset;
import org.jfree.data.xy.CategoryTableXYDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultipleXYSeriesLabelGenerator_ESTest extends MultipleXYSeriesLabelGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator();
      DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset0 = new DefaultBoxAndWhiskerXYDataset("{0}");
      multipleXYSeriesLabelGenerator0.addSeriesLabel(0, "java.lang.String@0000000006");
      multipleXYSeriesLabelGenerator0.addSeriesLabel(0, "Null 'format' argument.");
      String string0 = multipleXYSeriesLabelGenerator0.generateLabel(defaultBoxAndWhiskerXYDataset0, 0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator("");
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset("{0}");
      String string0 = multipleXYSeriesLabelGenerator0.generateLabel(simpleHistogramDataset0, (-1207));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator();
      DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset0 = new DefaultBoxAndWhiskerXYDataset("{0}");
      Object[] objectArray0 = multipleXYSeriesLabelGenerator0.createItemArray(defaultBoxAndWhiskerXYDataset0, 0);
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator();
      DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset0 = new DefaultBoxAndWhiskerXYDataset((Comparable) null);
      // Undeclared exception!
      try { 
        multipleXYSeriesLabelGenerator0.generateLabel(defaultBoxAndWhiskerXYDataset0, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator("Null 'dataset' argument.");
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        multipleXYSeriesLabelGenerator0.generateLabel(categoryTableXYDataset0, 778);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 778, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator("FyfM{'u");
      DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset0 = new DefaultBoxAndWhiskerXYDataset("FyfM{'u");
      // Undeclared exception!
      try { 
        multipleXYSeriesLabelGenerator0.generateLabel(defaultBoxAndWhiskerXYDataset0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator("");
      // Undeclared exception!
      try { 
        multipleXYSeriesLabelGenerator0.createItemArray((XYDataset) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.labels.MultipleXYSeriesLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator();
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      // Undeclared exception!
      try { 
        multipleXYSeriesLabelGenerator0.createItemArray(timeTableXYDataset0, 2618);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2618, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("{0}");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      // Undeclared exception!
      try { 
        multipleXYSeriesLabelGenerator0.createItemArray(timePeriodValuesCollection0, 127);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index 'series' out of range.
         //
         verifyException("org.jfree.data.time.TimePeriodValuesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator("-?Ag[");
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        multipleXYSeriesLabelGenerator0.createItemArray(histogramDataset0, (-1709));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator("sHEF.o'");
      Object object0 = multipleXYSeriesLabelGenerator0.clone();
      boolean boolean0 = multipleXYSeriesLabelGenerator0.equals(object0);
      assertNotSame(object0, multipleXYSeriesLabelGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator("");
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator1 = new MultipleXYSeriesLabelGenerator("{0}");
      boolean boolean0 = multipleXYSeriesLabelGenerator0.equals(multipleXYSeriesLabelGenerator1);
      assertFalse(multipleXYSeriesLabelGenerator1.equals((Object)multipleXYSeriesLabelGenerator0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator("");
      boolean boolean0 = multipleXYSeriesLabelGenerator0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator("sHEF.o'");
      boolean boolean0 = multipleXYSeriesLabelGenerator0.equals(multipleXYSeriesLabelGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator();
      multipleXYSeriesLabelGenerator0.addSeriesLabel(454, "{0}");
      Object object0 = multipleXYSeriesLabelGenerator0.clone();
      assertNotSame(object0, multipleXYSeriesLabelGenerator0);
      assertTrue(object0.equals((Object)multipleXYSeriesLabelGenerator0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator();
      Object object0 = multipleXYSeriesLabelGenerator0.clone();
      assertTrue(object0.equals((Object)multipleXYSeriesLabelGenerator0));
      
      multipleXYSeriesLabelGenerator0.clearSeriesLabels(454);
      boolean boolean0 = multipleXYSeriesLabelGenerator0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator();
      // Undeclared exception!
      try { 
        multipleXYSeriesLabelGenerator0.generateLabel((XYDataset) null, 100);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dataset' argument.
         //
         verifyException("org.jfree.chart.labels.MultipleXYSeriesLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = null;
      try {
        multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'format' argument.
         //
         verifyException("org.jfree.chart.labels.MultipleXYSeriesLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator("");
      multipleXYSeriesLabelGenerator0.hashCode();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator("");
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      // Undeclared exception!
      try { 
        multipleXYSeriesLabelGenerator0.generateLabel(jDBCXYDataset0, (-1068));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1068
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }
}
