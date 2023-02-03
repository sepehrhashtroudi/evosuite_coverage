/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 23:55:43 GMT 2022
 */

package org.jfree.chart.urls;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.urls.StandardPieURLGenerator;
import org.jfree.data.jdbc.JDBCPieDataset;
import org.jfree.data.pie.DefaultPieDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StandardPieURLGenerator_ESTest extends StandardPieURLGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StandardPieURLGenerator standardPieURLGenerator0 = new StandardPieURLGenerator();
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      // Undeclared exception!
      try { 
        standardPieURLGenerator0.generateURL(defaultPieDataset0, (Comparable) null, 2103);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StandardPieURLGenerator standardPieURLGenerator0 = null;
      try {
        standardPieURLGenerator0 = new StandardPieURLGenerator((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'prefix' argument.
         //
         verifyException("org.jfree.chart.urls.StandardPieURLGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StandardPieURLGenerator standardPieURLGenerator0 = null;
      try {
        standardPieURLGenerator0 = new StandardPieURLGenerator((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'prefix' argument.
         //
         verifyException("org.jfree.chart.urls.StandardPieURLGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StandardPieURLGenerator standardPieURLGenerator0 = new StandardPieURLGenerator();
      StandardPieURLGenerator standardPieURLGenerator1 = new StandardPieURLGenerator();
      boolean boolean0 = standardPieURLGenerator0.equals(standardPieURLGenerator1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StandardPieURLGenerator standardPieURLGenerator0 = new StandardPieURLGenerator("yQ<J\"DMp68J*?i>C", "yQ<J\"DMp68J*?i>C", "yQ<J\"DMp68J*?i>C");
      StandardPieURLGenerator standardPieURLGenerator1 = new StandardPieURLGenerator("yQ<J\"DMp68J*?i>C", "yQ<J\"DMp68J*?i>C", "2~\ftQb5 $496z?");
      boolean boolean0 = standardPieURLGenerator0.equals(standardPieURLGenerator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StandardPieURLGenerator standardPieURLGenerator0 = new StandardPieURLGenerator();
      StandardPieURLGenerator standardPieURLGenerator1 = new StandardPieURLGenerator("}$.G*a]7M_QC", "9y(+!_Nq`cB]feKa");
      boolean boolean0 = standardPieURLGenerator0.equals(standardPieURLGenerator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StandardPieURLGenerator standardPieURLGenerator0 = new StandardPieURLGenerator("]L", "]L", (String) null);
      boolean boolean0 = standardPieURLGenerator0.equals("]L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StandardPieURLGenerator standardPieURLGenerator0 = new StandardPieURLGenerator("yQ<J\"DMp68J*?i>C", "yQ<J\"DMp68J*?i>C", "yQ<J\"DMp68J*?i>C");
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCPieDataset jDBCPieDataset0 = new JDBCPieDataset(connection0);
      String string0 = standardPieURLGenerator0.generateURL(jDBCPieDataset0, "2~\ftQb5 $496z?", (-1222));
      assertEquals("yQ<J\"DMp68J*?i>C&amp;yQ<J\"DMp68J*?i>C=java.lang.String%400000000007&amp;yQ<J\"DMp68J*?i>C=-1222", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StandardPieURLGenerator standardPieURLGenerator0 = new StandardPieURLGenerator("]L", "]L", (String) null);
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      String string0 = standardPieURLGenerator0.generateURL(defaultPieDataset0, "]L", 0);
      assertEquals("]L?]L=java.lang.String%400000000007", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StandardPieURLGenerator standardPieURLGenerator0 = null;
      try {
        standardPieURLGenerator0 = new StandardPieURLGenerator(">{ &`x97H(i", (String) null, ">{ &`x97H(i");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'categoryParameterName' argument.
         //
         verifyException("org.jfree.chart.urls.StandardPieURLGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StandardPieURLGenerator standardPieURLGenerator0 = null;
      try {
        standardPieURLGenerator0 = new StandardPieURLGenerator((String) null, (String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'prefix' argument.
         //
         verifyException("org.jfree.chart.urls.StandardPieURLGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StandardPieURLGenerator standardPieURLGenerator0 = new StandardPieURLGenerator();
      boolean boolean0 = standardPieURLGenerator0.equals(standardPieURLGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StandardPieURLGenerator standardPieURLGenerator0 = new StandardPieURLGenerator("G{5y,>");
      StandardPieURLGenerator standardPieURLGenerator1 = new StandardPieURLGenerator("G{5y,>", "pieIndex");
      boolean boolean0 = standardPieURLGenerator0.equals(standardPieURLGenerator1);
      assertFalse(boolean0);
  }
}
