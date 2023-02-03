/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:42:37 GMT 2022
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StandardCategoryItemLabelGenerator_ESTest extends StandardCategoryItemLabelGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator();
      double[][] doubleArray0 = new double[7][2];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      String string0 = standardCategoryItemLabelGenerator0.generateLabel(defaultIntervalCategoryDataset0, 0, 0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("", numberFormat0);
      double[][] doubleArray0 = new double[1][2];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      String string0 = standardCategoryItemLabelGenerator0.generateLabel(defaultIntervalCategoryDataset0, 0, 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("You are trying to add data where the time period class is ", numberFormat0);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        standardCategoryItemLabelGenerator0.generateLabel(taskSeriesCollection0, 3863, 3863);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3863, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = null;
      try {
        standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator(":3uIoc9(8:s9", (NumberFormat) null, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'formatter' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractCategoryItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = null;
      try {
        standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("", (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'formatter' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractCategoryItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getDateInstance(0);
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = null;
      try {
        standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator((String) null, dateFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelFormat' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractCategoryItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getTimeInstance();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("Null 'labelFormat' argument.", dateFormat0);
      boolean boolean0 = standardCategoryItemLabelGenerator0.equals(standardCategoryItemLabelGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance(locale0);
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("DefaultIntervalCategoryDataset.setValue: unrecognised category.", numberFormat0, numberFormat0);
      boolean boolean0 = standardCategoryItemLabelGenerator0.equals("DefaultIntervalCategoryDataset.setValue: unrecognised category.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("pE", numberFormat0, numberFormat0);
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((Number[][]) null, (Number[][]) null);
      // Undeclared exception!
      try { 
        standardCategoryItemLabelGenerator0.generateLabel(defaultIntervalCategoryDataset0, 1, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        standardCategoryItemLabelGenerator0.generateLabel(defaultCategoryDataset0, (-1634), 999);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.US;
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance(locale0);
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("~}wrqqs:", numberFormat0);
      double[][] doubleArray0 = new double[1][9];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        standardCategoryItemLabelGenerator0.generateLabel(defaultIntervalCategoryDataset0, 20, 20);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'row' argument is out of bounds.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getTimeInstance();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("@ad2^s@LEzl~lE", dateFormat0);
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator1 = new StandardCategoryItemLabelGenerator();
      boolean boolean0 = standardCategoryItemLabelGenerator0.equals(standardCategoryItemLabelGenerator1);
      assertFalse(boolean0);
  }
}
