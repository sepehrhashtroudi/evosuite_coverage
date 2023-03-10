/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:05:42 GMT 2022
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasePartial_ESTest extends BasePartial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      MonthDay monthDay0 = new MonthDay((Object) null, zonedChronology0);
      assertEquals(2, monthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 1731, 1681, (-567), (-1));
      MonthDay monthDay0 = MonthDay.fromCalendarFields(mockGregorianCalendar0);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      String string0 = monthDay0.toString("z$", locale0);
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      String string0 = monthDay0.toString((String) null);
      assertEquals("--02-14", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.UK;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(calendar0);
      assertEquals(2, yearMonth0.getMonthOfYear());
      
      int int0 = yearMonth0.getValue(0);
      assertEquals(2014, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1370, 1370, 710, 1370, 1370, (-1076));
      YearMonth yearMonth0 = YearMonth.fromDateFields(mockDate0);
      Locale locale0 = Locale.ROOT;
      try { 
        yearMonth0.toString("8-,!]q&d8", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((-501L));
      // Undeclared exception!
      try { 
        yearMonth0.toString("U");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      int[] intArray0 = monthDay0.getValues();
      assertArrayEquals(new int[] {2, 14}, intArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.UK;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(calendar0);
      Chronology chronology0 = yearMonth0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      GJChronology gJChronology0 = GJChronology.getInstance();
      YearMonth yearMonth1 = yearMonth0.withChronologyRetainFields(gJChronology0);
      assertEquals(2014, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.UK;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(calendar0);
      // Undeclared exception!
      try { 
        yearMonth0.getValue(54);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 54
         //
         verifyException("org.joda.time.base.BasePartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((-501L));
      MutablePeriod mutablePeriod0 = new MutablePeriod(1, 1, 0, 0, (-394), 2046, 0, (-394));
      YearMonth yearMonth1 = yearMonth0.minus(mutablePeriod0);
      assertNotSame(yearMonth1, yearMonth0);
  }
}
