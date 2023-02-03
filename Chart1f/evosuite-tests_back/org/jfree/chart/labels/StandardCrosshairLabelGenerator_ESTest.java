/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:40:24 GMT 2022
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.labels.StandardCrosshairLabelGenerator;
import org.jfree.chart.plot.Crosshair;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StandardCrosshairLabelGenerator_ESTest extends StandardCrosshairLabelGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat("8p^: B");
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("O", decimalFormat0);
      NumberFormat numberFormat0 = standardCrosshairLabelGenerator0.getNumberFormat();
      assertEquals(0, numberFormat0.getMinimumFractionDigits());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance(locale0);
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("org.jfree.data.KeyedObjects", numberFormat0);
      NumberFormat numberFormat1 = standardCrosshairLabelGenerator0.getNumberFormat();
      assertEquals(Integer.MAX_VALUE, numberFormat1.getMaximumIntegerDigits());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("{0}", numberFormat0);
      numberFormat0.setMaximumIntegerDigits(0);
      DecimalFormat decimalFormat0 = (DecimalFormat)standardCrosshairLabelGenerator0.getNumberFormat();
      assertFalse(decimalFormat0.isDecimalSeparatorAlwaysShown());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("You are trying to add data where the time period class ", numberFormat0);
      NumberFormat numberFormat1 = standardCrosshairLabelGenerator0.getNumberFormat();
      assertSame(numberFormat0, numberFormat1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance(locale0);
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("", numberFormat0);
      String string0 = standardCrosshairLabelGenerator0.getLabelTemplate();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator();
      Crosshair crosshair0 = new Crosshair(Double.NaN);
      String string0 = standardCrosshairLabelGenerator0.generateLabel(crosshair0);
      assertEquals("\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = new Locale("", "", "");
      NumberFormat numberFormat0 = NumberFormat.getInstance(locale0);
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("", numberFormat0);
      Crosshair crosshair0 = new Crosshair();
      String string0 = standardCrosshairLabelGenerator0.generateLabel(crosshair0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator();
      // Undeclared exception!
      try { 
        standardCrosshairLabelGenerator0.generateLabel((Crosshair) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.labels.StandardCrosshairLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("p9M2{.Ze!BK4?%q$K", numberFormat0);
      Crosshair crosshair0 = new Crosshair(2812.123572555446);
      // Undeclared exception!
      try { 
        standardCrosshairLabelGenerator0.generateLabel(crosshair0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator();
      NumberFormat numberFormat0 = standardCrosshairLabelGenerator0.getNumberFormat();
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator1 = new StandardCrosshairLabelGenerator("", numberFormat0);
      boolean boolean0 = standardCrosshairLabelGenerator0.equals(standardCrosshairLabelGenerator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator();
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator1 = new StandardCrosshairLabelGenerator();
      boolean boolean0 = standardCrosshairLabelGenerator0.equals(standardCrosshairLabelGenerator1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator();
      Locale locale0 = Locale.GERMAN;
      boolean boolean0 = standardCrosshairLabelGenerator0.equals(locale0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator();
      boolean boolean0 = standardCrosshairLabelGenerator0.equals(standardCrosshairLabelGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = null;
      try {
        standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("DefaultIntervalCategoryDataset.setCategoryKeys(): null category not permitted.", (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'numberFormat' argument.
         //
         verifyException("org.jfree.chart.labels.StandardCrosshairLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat();
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = null;
      try {
        standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator((String) null, decimalFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelTemplate' argument.
         //
         verifyException("org.jfree.chart.labels.StandardCrosshairLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("Null 'labelTemplate' argument.");
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("{K9sI#WXu_W3A6U8C", choiceFormat0);
      Crosshair crosshair0 = new Crosshair();
      // Undeclared exception!
      try { 
        standardCrosshairLabelGenerator0.generateLabel(crosshair0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("java.text.ChoiceFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = new Locale("", "", "");
      NumberFormat numberFormat0 = NumberFormat.getInstance(locale0);
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("", numberFormat0);
      standardCrosshairLabelGenerator0.hashCode();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("Null 'labelTemplate' argument.");
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("{K9sI#WXu_W3A6U8C", choiceFormat0);
      String string0 = standardCrosshairLabelGenerator0.getLabelTemplate();
      assertEquals("{K9sI#WXu_W3A6U8C", string0);
  }
}
