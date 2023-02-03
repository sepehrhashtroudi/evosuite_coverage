/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:36:06 GMT 2022
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.NumberFormat;
import java.util.Hashtable;
import java.util.Locale;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.jdbc.JDBCPieDataset;
import org.jfree.data.pie.DefaultPieDataset;
import org.jfree.data.pie.PieDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.FixedMillisecond;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StandardPieSectionLabelGenerator_ESTest extends StandardPieSectionLabelGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator();
      AttributedString attributedString0 = new AttributedString("{0}");
      standardPieSectionLabelGenerator0.setAttributedLabel(39, attributedString0);
      AttributedString attributedString1 = standardPieSectionLabelGenerator0.getAttributedLabel(39);
      assertSame(attributedString1, attributedString0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      NumberFormat numberFormat0 = NumberFormat.getInstance(locale0);
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("", numberFormat0, numberFormat0);
      String string0 = standardPieSectionLabelGenerator0.generateSectionLabel((PieDataset) null, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("Y']u");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset(defaultStatisticalCategoryDataset0, tableOrder0, 1);
      String string0 = standardPieSectionLabelGenerator0.generateSectionLabel(categoryToPieDataset0, "Y']u");
      assertEquals("Y]u", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("");
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset(defaultBoxAndWhiskerCategoryDataset0, tableOrder0, 1261);
      String string0 = standardPieSectionLabelGenerator0.generateSectionLabel(categoryToPieDataset0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("[", numberFormat0, numberFormat0);
      Hashtable<AttributedCharacterIterator.Attribute, Object> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, Object>();
      AttributedString attributedString0 = new AttributedString("{0}", hashtable0);
      // Undeclared exception!
      try { 
        standardPieSectionLabelGenerator0.setAttributedLabel(Integer.MAX_VALUE, attributedString0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance(locale0);
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("a(~J<)-|m;7x/", numberFormat0, numberFormat0);
      // Undeclared exception!
      try { 
        standardPieSectionLabelGenerator0.setAttributedLabel((-1), (AttributedString) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator();
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      // Undeclared exception!
      try { 
        standardPieSectionLabelGenerator0.generateSectionLabel(defaultKeyedValuesDataset0, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("Gc)$[y^>@I", locale0);
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      defaultPieDataset0.insertValue(0, (Comparable) "Gc)$[y^>@I", (Number) integer0);
      // Undeclared exception!
      try { 
        standardPieSectionLabelGenerator0.generateSectionLabel(defaultPieDataset0, "Gc)$[y^>@I");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to org.jfree.data.SelectableValue
         //
         verifyException("org.jfree.data.pie.DefaultPieDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("7v2?%+*~u=_cb7D");
      // Undeclared exception!
      try { 
        standardPieSectionLabelGenerator0.generateAttributedSectionLabel((PieDataset) null, "7v2?%+*~u=_cb7D");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.labels.StandardPieSectionLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator();
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset(defaultKeyedValues0);
      // Undeclared exception!
      try { 
        standardPieSectionLabelGenerator0.generateAttributedSectionLabel(defaultPieDataset0, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = null;
      try {
        standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = null;
      try {
        standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("V0V\"", (Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = null;
      try {
        standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator((String) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelFormat' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractPieItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = null;
      try {
        standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("", (NumberFormat) null, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'numberFormat' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractPieItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = null;
      try {
        standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelFormat' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractPieItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("Gc)$[y^>@I", locale0);
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator(locale0);
      boolean boolean0 = standardPieSectionLabelGenerator0.equals(standardPieSectionLabelGenerator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("");
      AttributedString attributedString0 = new AttributedString("{0}");
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator("");
      standardPieSectionLabelGenerator0.setAttributedLabel(39, attributedString0);
      boolean boolean0 = standardPieSectionLabelGenerator0.equals(standardPieSectionLabelGenerator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("");
      boolean boolean0 = standardPieSectionLabelGenerator0.equals(standardPieSectionLabelGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("");
      boolean boolean0 = standardPieSectionLabelGenerator0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("");
      Object object0 = standardPieSectionLabelGenerator0.clone();
      boolean boolean0 = standardPieSectionLabelGenerator0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCPieDataset jDBCPieDataset0 = new JDBCPieDataset(connection0);
      AttributedString attributedString0 = standardPieSectionLabelGenerator0.generateAttributedSectionLabel(jDBCPieDataset0, "{0}");
      assertNull(attributedString0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("");
      AttributedString attributedString0 = standardPieSectionLabelGenerator0.getAttributedLabel(39);
      assertNull(attributedString0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("|{");
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset(defaultKeyedValues2DDataset0, tableOrder0, (-268));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1008L);
      // Undeclared exception!
      try { 
        standardPieSectionLabelGenerator0.generateSectionLabel(categoryToPieDataset0, fixedMillisecond0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      StandardPieSectionLabelGenerator standardPieSectionLabelGenerator0 = new StandardPieSectionLabelGenerator("Gc)$[y^>@I", locale0);
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      // Undeclared exception!
      try { 
        standardPieSectionLabelGenerator0.generateSectionLabel(defaultPieDataset0, "Gc)$[y^>@I");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The key (Gc)$[y^>@I) is not recognised.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }
}