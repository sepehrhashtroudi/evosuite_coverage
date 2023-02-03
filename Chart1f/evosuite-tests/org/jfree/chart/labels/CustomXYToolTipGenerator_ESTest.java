/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:46:26 GMT 2022
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JRadioButtonMenuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.labels.CustomXYToolTipGenerator;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYDatasetTableModel;
import org.jfree.data.xy.XYIntervalSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CustomXYToolTipGenerator_ESTest extends CustomXYToolTipGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      ArrayList<CustomXYToolTipGenerator> arrayList0 = new ArrayList<CustomXYToolTipGenerator>();
      customXYToolTipGenerator0.addToolTipSeries(arrayList0);
      String string0 = customXYToolTipGenerator0.getToolTipText(0, 0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      boolean boolean0 = customXYToolTipGenerator0.equals(customXYToolTipGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      Vector<String> vector0 = new Vector<String>();
      vector0.add("");
      customXYToolTipGenerator0.addToolTipSeries(vector0);
      String string0 = customXYToolTipGenerator0.getToolTipText(0, 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      ArrayList<CustomXYToolTipGenerator> arrayList0 = new ArrayList<CustomXYToolTipGenerator>();
      customXYToolTipGenerator0.addToolTipSeries(arrayList0);
      arrayList0.add(customXYToolTipGenerator0);
      customXYToolTipGenerator0.addToolTipSeries(arrayList0);
      int int0 = customXYToolTipGenerator0.getToolTipCount(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      Stack<Object> stack0 = new Stack<Object>();
      customXYToolTipGenerator0.addToolTipSeries(stack0);
      int int0 = customXYToolTipGenerator0.getListCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("a?sov>z8H\"a:B;2");
      customXYToolTipGenerator0.addToolTipSeries(arrayList0);
      arrayList0.add("org.jfree.data.resources.DataPackageResources");
      customXYToolTipGenerator0.addToolTipSeries(arrayList0);
      String string0 = customXYToolTipGenerator0.generateToolTip((XYDataset) null, 1, 1);
      assertNotNull(string0);
      assertEquals("org.jfree.data.resources.DataPackageResources", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      LinkedList<CustomXYToolTipGenerator> linkedList0 = new LinkedList<CustomXYToolTipGenerator>();
      customXYToolTipGenerator0.addToolTipSeries(linkedList0);
      // Undeclared exception!
      try { 
        customXYToolTipGenerator0.getToolTipText(0, (-523));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -523, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      Stack<XYDatasetTableModel> stack0 = new Stack<XYDatasetTableModel>();
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel();
      stack0.add(xYDatasetTableModel0);
      customXYToolTipGenerator0.addToolTipSeries(stack0);
      // Undeclared exception!
      try { 
        customXYToolTipGenerator0.getToolTipText(0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      Vector<Object> vector0 = new Vector<Object>();
      customXYToolTipGenerator0.addToolTipSeries(vector0);
      // Undeclared exception!
      try { 
        customXYToolTipGenerator0.getToolTipText(0, (-90));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -90
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      // Undeclared exception!
      try { 
        customXYToolTipGenerator0.getToolTipCount(2960);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2960, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      // Undeclared exception!
      try { 
        customXYToolTipGenerator0.getToolTipCount((-1117));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      LinkedList<JRadioButtonMenuItem> linkedList0 = new LinkedList<JRadioButtonMenuItem>();
      customXYToolTipGenerator0.addToolTipSeries(linkedList0);
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        customXYToolTipGenerator0.generateToolTip(xYIntervalSeriesCollection0, 0, (-54));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -54, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      LinkedList<JRadioButtonMenuItem> linkedList0 = new LinkedList<JRadioButtonMenuItem>();
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem();
      linkedList0.add(jRadioButtonMenuItem0);
      customXYToolTipGenerator0.addToolTipSeries(linkedList0);
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        customXYToolTipGenerator0.generateToolTip(xYIntervalSeriesCollection0, 0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      // Undeclared exception!
      try { 
        customXYToolTipGenerator0.generateToolTip((XYDataset) null, (-3119), 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("a?sov>z8H\"a:B;2");
      customXYToolTipGenerator0.addToolTipSeries(arrayList0);
      customXYToolTipGenerator0.addToolTipSeries(arrayList0);
      String string0 = customXYToolTipGenerator0.getToolTipText(1, 0);
      assertEquals("a?sov>z8H\"a:B;2", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      customXYToolTipGenerator0.addToolTipSeries((List) null);
      String string0 = customXYToolTipGenerator0.getToolTipText(0, 0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      String string0 = customXYToolTipGenerator0.getToolTipText(1, 1);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      ArrayList<CustomXYToolTipGenerator> arrayList0 = new ArrayList<CustomXYToolTipGenerator>();
      customXYToolTipGenerator0.addToolTipSeries(arrayList0);
      customXYToolTipGenerator0.addToolTipSeries(arrayList0);
      int int0 = customXYToolTipGenerator0.getToolTipCount(1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      int int0 = customXYToolTipGenerator0.getListCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      Vector<String> vector0 = new Vector<String>(168, 2355);
      vector0.add((String) null);
      vector0.add("");
      Object object0 = customXYToolTipGenerator0.clone();
      customXYToolTipGenerator0.addToolTipSeries(vector0);
      customXYToolTipGenerator0.addToolTipSeries(vector0);
      boolean boolean0 = customXYToolTipGenerator0.equals(object0);
      assertFalse(customXYToolTipGenerator0.equals((Object)object0));
      assertFalse(boolean0);
      assertTrue(object0.equals((Object)customXYToolTipGenerator0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      Vector<String> vector0 = new Vector<String>(168, 2355);
      customXYToolTipGenerator0.addToolTipSeries(vector0);
      vector0.add("");
      Object object0 = customXYToolTipGenerator0.clone();
      boolean boolean0 = customXYToolTipGenerator0.equals(object0);
      assertNotSame(object0, customXYToolTipGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      boolean boolean0 = customXYToolTipGenerator0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      LinkedList<JRadioButtonMenuItem> linkedList0 = new LinkedList<JRadioButtonMenuItem>();
      customXYToolTipGenerator0.addToolTipSeries(linkedList0);
      String string0 = customXYToolTipGenerator0.getToolTipText(0, 182);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      Object object0 = customXYToolTipGenerator0.clone();
      Stack<Object> stack0 = new Stack<Object>();
      stack0.add((Object) customXYToolTipGenerator0);
      customXYToolTipGenerator0.addToolTipSeries(stack0);
      // Undeclared exception!
      try { 
        customXYToolTipGenerator0.equals(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      customXYToolTipGenerator0.addToolTipSeries((List) null);
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      String string0 = customXYToolTipGenerator0.generateToolTip(defaultIntervalXYDataset0, 0, 0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      customXYToolTipGenerator0.addToolTipSeries((List) null);
      int int0 = customXYToolTipGenerator0.getToolTipCount(0);
      assertEquals(0, int0);
  }
}
