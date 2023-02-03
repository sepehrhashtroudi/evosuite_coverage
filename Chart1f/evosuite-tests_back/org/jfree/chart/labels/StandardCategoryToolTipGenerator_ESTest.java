/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:41:53 GMT 2022
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.time.chrono.ThaiBuddhistEra;
import java.util.Locale;
import javax.swing.JComponent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StandardCategoryToolTipGenerator_ESTest extends StandardCategoryToolTipGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getTimeInstance();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("/:H?Q", dateFormat0);
      double[][] doubleArray0 = new double[8][3];
      double[] doubleArray1 = new double[7];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray1;
      doubleArray0[3] = doubleArray0[2];
      doubleArray0[4] = doubleArray0[0];
      doubleArray0[5] = doubleArray0[4];
      doubleArray0[6] = doubleArray0[2];
      doubleArray0[7] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      String string0 = standardCategoryToolTipGenerator0.generateToolTip(defaultIntervalCategoryDataset0, 3, 3);
      assertEquals("/:H?Q", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = JComponent.getDefaultLocale();
      DateFormat dateFormat0 = MockDateFormat.getTimeInstance(1, locale0);
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("", dateFormat0);
      double[][] doubleArray0 = new double[6][8];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      String string0 = standardCategoryToolTipGenerator0.generateToolTip(defaultIntervalCategoryDataset0, 1, 1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      String[] stringArray0 = new String[3];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      // Undeclared exception!
      try { 
        standardCategoryToolTipGenerator0.generateToolTip(defaultIntervalCategoryDataset0, 1, (-322));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getDateInstance(0);
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("9|S&_", dateFormat0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      // Undeclared exception!
      try { 
        standardCategoryToolTipGenerator0.generateToolTip(jDBCCategoryDataset0, 0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      // Undeclared exception!
      try { 
        standardCategoryToolTipGenerator0.generateToolTip((CategoryDataset) null, (-5), (-5));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dataset' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractCategoryItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = null;
      try {
        standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("org.jfree.chart.labels.StandardCategoryToolTipGenerator", (DateFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'formatter' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractCategoryItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("");
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("", choiceFormat0);
      assertEquals("", standardCategoryToolTipGenerator0.getLabelFormat());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      Object object0 = standardCategoryToolTipGenerator0.clone();
      boolean boolean0 = standardCategoryToolTipGenerator0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      boolean boolean0 = standardCategoryToolTipGenerator0.equals(standardCategoryToolTipGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      ThaiBuddhistEra thaiBuddhistEra0 = ThaiBuddhistEra.BE;
      boolean boolean0 = standardCategoryToolTipGenerator0.equals(thaiBuddhistEra0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getDateInstance();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("R!gDYfMF:(se<hAp", dateFormat0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      // Undeclared exception!
      try { 
        standardCategoryToolTipGenerator0.generateToolTip(jDBCCategoryDataset0, (-3330), (-3330));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = null;
      try {
        standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator((String) null, decimalFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelFormat' argument.
         //
         verifyException("org.jfree.chart.labels.AbstractCategoryItemLabelGenerator", e);
      }
  }
}
