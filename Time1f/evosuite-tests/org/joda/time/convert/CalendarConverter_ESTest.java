/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:11:39 GMT 2022
 */

package org.joda.time.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.convert.CalendarConverter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CalendarConverter_ESTest extends CalendarConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(98);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(60, 1386, 12);
      Chronology chronology0 = calendarConverter0.getChronology((Object) mockGregorianCalendar0, dateTimeZone0);
      long long0 = calendarConverter0.getInstantMillis(mockGregorianCalendar0, chronology0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      Chronology chronology0 = calendarConverter0.getChronology((Object) locale0, (DateTimeZone) null);
      long long0 = calendarConverter0.getInstantMillis(mockGregorianCalendar0, chronology0);
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      mockGregorianCalendar0.getWeekYear();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      long long0 = calendarConverter0.getInstantMillis(mockGregorianCalendar0, gJChronology0);
      assertEquals((-62167478400000L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CalendarConverter calendarConverter0 = CalendarConverter.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      // Undeclared exception!
      try { 
        calendarConverter0.getInstantMillis((Object) null, zonedChronology0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.CalendarConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        calendarConverter0.getChronology((Object) null, dateTimeZone0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.CalendarConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      // Undeclared exception!
      try { 
        calendarConverter0.getChronology((Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.CalendarConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CalendarConverter calendarConverter0 = CalendarConverter.INSTANCE;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        calendarConverter0.getChronology(object0, (Chronology) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Calendar
         //
         verifyException("org.joda.time.convert.CalendarConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      Class<?> class0 = calendarConverter0.getSupportedType();
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CalendarConverter calendarConverter0 = CalendarConverter.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(98);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      ZonedDateTime zonedDateTime0 = mockGregorianCalendar0.toZonedDateTime();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      Chronology chronology0 = calendarConverter0.getChronology((Object) gregorianCalendar0, dateTimeZone0);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CalendarConverter calendarConverter0 = CalendarConverter.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(98);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Chronology chronology0 = calendarConverter0.getChronology((Object) mockGregorianCalendar0, dateTimeZone0);
      Chronology chronology1 = calendarConverter0.getChronology((Object) mockGregorianCalendar0, chronology0);
      assertSame(chronology1, chronology0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.ROOT;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      Chronology chronology0 = calendarConverter0.getChronology((Object) mockGregorianCalendar0, (Chronology) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        calendarConverter0.getInstantMillis(timeZone0, (Chronology) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // sun.util.calendar.ZoneInfo cannot be cast to java.util.Calendar
         //
         verifyException("org.joda.time.convert.CalendarConverter", e);
      }
  }
}
