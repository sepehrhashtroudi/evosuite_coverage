/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 22:34:29 GMT 2022
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.chart.axis.MonthDateFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MonthDateFormat_ESTest extends MonthDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("FRANCE:");
      MockDate mockDate0 = new MockDate();
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(timeZone0);
      FieldPosition fieldPosition0 = new FieldPosition(0);
      // Undeclared exception!
      try { 
        monthDateFormat0.format((Date) mockDate0, (StringBuffer) null, fieldPosition0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.MonthDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("X");
      Locale locale0 = Locale.ITALY;
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(timeZone0, locale0, 6, true, false);
      boolean[] booleanArray0 = new boolean[3];
      MonthDateFormat monthDateFormat1 = new MonthDateFormat(timeZone0, locale0, 6, booleanArray0, monthDateFormat0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      FieldPosition fieldPosition0 = new FieldPosition((-3093));
      // Undeclared exception!
      try { 
        monthDateFormat1.format(date0, stringBuffer0, fieldPosition0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.jfree.chart.axis.MonthDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("@:");
      Locale locale0 = Locale.ITALY;
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(timeZone0, locale0, 6, true, true);
      boolean[] booleanArray0 = new boolean[17];
      MonthDateFormat monthDateFormat1 = new MonthDateFormat(timeZone0, locale0, 6, booleanArray0, monthDateFormat0);
      monthDateFormat1.setCalendar((Calendar) null);
      // Undeclared exception!
      try { 
        monthDateFormat0.equals(monthDateFormat1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      MonthDateFormat monthDateFormat0 = null;
      try {
        monthDateFormat0 = new MonthDateFormat((TimeZone) null, locale0, 6, true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = null;
      try {
        monthDateFormat0 = new MonthDateFormat((TimeZone) null, (Locale) null, (-460), false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'locale' argument.
         //
         verifyException("org.jfree.chart.axis.MonthDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = null;
      try {
        monthDateFormat0 = new MonthDateFormat((TimeZone) null, 3168);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = null;
      try {
        monthDateFormat0 = new MonthDateFormat((TimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = null;
      try {
        monthDateFormat0 = new MonthDateFormat((Locale) null, 2613);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'locale' argument.
         //
         verifyException("org.jfree.chart.axis.MonthDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = new MonthDateFormat();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(163, 163, 0, 163, 163, 1);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      StringBuffer stringBuffer0 = new StringBuffer();
      FieldPosition fieldPosition0 = new FieldPosition(0);
      monthDateFormat0.format(date0, stringBuffer0, fieldPosition0);
      assertEquals("O", stringBuffer0.toString());
      assertEquals(1, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("");
      boolean[] booleanArray0 = new boolean[2];
      DateFormat dateFormat0 = MockDateFormat.getTimeInstance();
      MonthDateFormat monthDateFormat0 = null;
      try {
        monthDateFormat0 = new MonthDateFormat((TimeZone) null, locale0, (-257), booleanArray0, dateFormat0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2642, "org.jfree.data.time.Quarter");
      DateFormat dateFormat0 = DateFormat.getDateInstance();
      MonthDateFormat monthDateFormat0 = null;
      try {
        monthDateFormat0 = new MonthDateFormat(simpleTimeZone0, (Locale) null, 3, (boolean[]) null, dateFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'locale' argument.
         //
         verifyException("org.jfree.chart.axis.MonthDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(locale0);
      assertTrue(monthDateFormat0.isLenient());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = new MonthDateFormat();
      MonthDateFormat monthDateFormat1 = new MonthDateFormat();
      boolean boolean0 = monthDateFormat1.equals(monthDateFormat0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("SerialDate.weekInMonthToString(): invalid code.");
      Locale locale0 = Locale.KOREAN;
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(timeZone0, locale0, 1305, false, false);
      MonthDateFormat monthDateFormat1 = new MonthDateFormat();
      boolean boolean0 = monthDateFormat0.equals(monthDateFormat1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("X");
      Locale locale0 = Locale.ITALY;
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(timeZone0, locale0, 6, true, false);
      boolean[] booleanArray0 = new boolean[3];
      MonthDateFormat monthDateFormat1 = new MonthDateFormat(timeZone0, locale0, 6, booleanArray0, monthDateFormat0);
      boolean boolean0 = monthDateFormat0.equals(monthDateFormat1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = new MonthDateFormat();
      boolean boolean0 = monthDateFormat0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = new MonthDateFormat();
      boolean boolean0 = monthDateFormat0.equals(monthDateFormat0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.UK;
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(locale0, 4);
      MockDate mockDate0 = new MockDate(4, 4, (-90), 4, 4, 4);
      StringBuffer stringBuffer0 = new StringBuffer();
      monthDateFormat0.format((Date) mockDate0, stringBuffer0, (FieldPosition) null);
      assertEquals(6, stringBuffer0.length());
      assertEquals("Janu04", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "0fG]");
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(simpleTimeZone0, 0);
      MonthDateFormat monthDateFormat1 = new MonthDateFormat();
      boolean boolean0 = monthDateFormat0.equals(monthDateFormat1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[9];
      MonthDateFormat.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = null;
      try {
        monthDateFormat0 = new MonthDateFormat((Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'locale' argument.
         //
         verifyException("org.jfree.chart.axis.MonthDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = new MonthDateFormat();
      ParsePosition parsePosition0 = new ParsePosition((-787));
      Date date0 = monthDateFormat0.parse("", parsePosition0);
      assertNull(date0);
  }
}
