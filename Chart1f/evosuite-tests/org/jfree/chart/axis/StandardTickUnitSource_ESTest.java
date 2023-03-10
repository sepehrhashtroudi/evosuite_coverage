/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 22:22:54 GMT 2022
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.DateTickUnitType;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.StandardTickUnitSource;
import org.jfree.chart.axis.TickUnit;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StandardTickUnitSource_ESTest extends StandardTickUnitSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StandardTickUnitSource standardTickUnitSource0 = new StandardTickUnitSource();
      TickUnit tickUnit0 = standardTickUnitSource0.getCeilingTickUnit(2810.67377);
      assertEquals(10000.0, tickUnit0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StandardTickUnitSource standardTickUnitSource0 = new StandardTickUnitSource();
      DateTickUnitType dateTickUnitType0 = DateTickUnitType.SECOND;
      DateFormat dateFormat0 = MockDateFormat.getInstance();
      DateTickUnit dateTickUnit0 = new DateTickUnit(dateTickUnitType0, 32, dateFormat0);
      TickUnit tickUnit0 = standardTickUnitSource0.getCeilingTickUnit((TickUnit) dateTickUnit0);
      assertEquals(100000.0, tickUnit0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StandardTickUnitSource standardTickUnitSource0 = new StandardTickUnitSource();
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(0.0);
      TickUnit tickUnit0 = standardTickUnitSource0.getCeilingTickUnit((TickUnit) numberTickUnit0);
      assertEquals(0.0, tickUnit0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StandardTickUnitSource standardTickUnitSource0 = new StandardTickUnitSource();
      TickUnit tickUnit0 = standardTickUnitSource0.getCeilingTickUnit(0.0);
      TickUnit tickUnit1 = standardTickUnitSource0.getLargerTickUnit(tickUnit0);
      assertTrue(tickUnit1.equals((Object)tickUnit0));
      assertEquals(0.0, tickUnit1.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StandardTickUnitSource standardTickUnitSource0 = new StandardTickUnitSource();
      // Undeclared exception!
      try { 
        standardTickUnitSource0.getLargerTickUnit((TickUnit) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.StandardTickUnitSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StandardTickUnitSource standardTickUnitSource0 = new StandardTickUnitSource();
      // Undeclared exception!
      try { 
        standardTickUnitSource0.getCeilingTickUnit((TickUnit) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.StandardTickUnitSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StandardTickUnitSource standardTickUnitSource0 = new StandardTickUnitSource();
      TickUnit tickUnit0 = standardTickUnitSource0.getCeilingTickUnit(10.0);
      TickUnit tickUnit1 = standardTickUnitSource0.getLargerTickUnit(tickUnit0);
      assertEquals(10.0, tickUnit1.getSize(), 0.01);
      assertTrue(tickUnit1.equals((Object)tickUnit0));
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StandardTickUnitSource standardTickUnitSource0 = new StandardTickUnitSource();
      boolean boolean0 = standardTickUnitSource0.equals(standardTickUnitSource0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StandardTickUnitSource standardTickUnitSource0 = new StandardTickUnitSource();
      Locale locale0 = Locale.JAPANESE;
      boolean boolean0 = standardTickUnitSource0.equals(locale0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      StandardTickUnitSource standardTickUnitSource0 = new StandardTickUnitSource();
      standardTickUnitSource0.hashCode();
  }
}
