/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:00:24 GMT 2022
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.SpreadsheetDate;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Month_ESTest extends Month_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Month month0 = new Month();
      RegularTimePeriod regularTimePeriod0 = month0.next();
      int int0 = month0.compareTo(regularTimePeriod0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Month month0 = new Month();
      MockDate mockDate0 = new MockDate();
      Month month1 = new Month(mockDate0);
      int int0 = month0.compareTo(month1);
      assertEquals(0, int0);
      assertEquals(24170L, month1.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate(131L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.TAIWAN;
      Month month0 = new Month(mockDate0, timeZone0, locale0);
      Month month1 = (Month)month0.previous();
      assertNotNull(month1);
      
      int int0 = month0.compareTo(month1);
      assertEquals(1, int0);
      assertEquals(12, month1.getMonth());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1436), (-1436), 46, (-1494), (-1436), (-1494));
      TimeZone timeZone0 = TimeZone.getTimeZone("v?&sSG(");
      Locale locale0 = new Locale("v?&sSG(", "v?&sSG(", "v?&sSG(");
      Month month0 = new Month(mockDate0, timeZone0, locale0);
      month0.hashCode();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Month month0 = new Month();
      MockDate mockDate0 = new MockDate(0L);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1314, "U?'");
      Month month1 = new Month(mockDate0, simpleTimeZone0);
      boolean boolean0 = month0.equals(month1);
      assertFalse(boolean0);
      assertEquals(23641L, month1.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1398), 1800, (-1398), (-1398), 45, 655);
      Month month0 = new Month(mockDate0);
      String string0 = month0.toString();
      assertEquals(1, month0.getMonth());
      assertEquals("January 648", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = new Locale("T(9qK73GD(n]jt,L/", "T(9qK73GD(n]jt,L/", "T(9qK73GD(n]jt,L/");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      TimeZone timeZone0 = TimeZone.getDefault();
      Month month0 = new Month(date0, timeZone0, locale0);
      long long0 = month0.getSerialIndex();
      assertEquals(18994L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1398), 1800, (-1398), (-1398), 45, 655);
      Month month0 = new Month(mockDate0);
      RegularTimePeriod regularTimePeriod0 = month0.next();
      assertEquals(7778L, regularTimePeriod0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate(9223372036854775807L);
      Month month0 = new Month(mockDate0);
      RegularTimePeriod regularTimePeriod0 = month0.previous();
      assertEquals(3507347935L, regularTimePeriod0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      System.setCurrentTimeMillis((-653L));
      Month month0 = Month.parseMonth("February 2014");
      assertEquals(24170L, month0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Month month0 = new Month(2, (-1482));
      int int0 = month0.getYearValue();
      assertEquals((-17782L), month0.getSerialIndex());
      assertEquals((-1482), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Month month0 = new Month(2, (-1482));
      Year year0 = month0.getYear();
      assertEquals((-17782L), month0.getSerialIndex());
      assertEquals((-1482), year0.getYear());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(9999);
      Date date0 = spreadsheetDate0.toDate();
      Month month0 = new Month(date0);
      System.setCurrentTimeMillis(0L);
      Year year0 = month0.getYear();
      assertEquals(2014, year0.getYear());
      assertEquals(2, month0.getMonth());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Month month0 = new Month();
      System.setCurrentTimeMillis((-653L));
      Year year0 = month0.getYear();
      assertEquals("2014", year0.toString());
      assertEquals(2, month0.getMonth());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Month month0 = new Month(2, (-1482));
      long long0 = month0.getSerialIndex();
      assertEquals((-17782L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Month month0 = new Month();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2378), 0, 0, (-2378), (-1));
      month0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=2014,MONTH=1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=28,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=-2378,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Month month0 = new Month();
      System.setCurrentTimeMillis((-653L));
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      month0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=28,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Month month0 = new Month(mockDate0);
      month0.getLastMillisecond();
      assertEquals(23641L, month0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-288), (-288), (-288), 1, (-269));
      Month month0 = new Month(mockDate0);
      long long0 = month0.getLastMillisecond();
      assertEquals((-12079769340000L), long0);
      assertEquals(3, month0.getMonth());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockDate mockDate0 = new MockDate(52, 0, 0, 213, 0, 9999);
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Month month0 = new Month(mockDate0, timeZone0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      month0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1952,MONTH=0,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=1,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockDate mockDate0 = new MockDate(37, (-96), 12, 12, (-2303));
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.forLanguageTag("e&uP:D~J\"");
      Month month0 = new Month(mockDate0, timeZone0, locale0);
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      calendar0.setTimeInMillis((-9999));
      month0.getFirstMillisecond(calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1929,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=1,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Month month0 = new Month(mockDate0);
      month0.getFirstMillisecond();
      assertEquals(1, month0.getMonth());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Month month0 = new Month();
      long long0 = month0.getFirstMillisecond();
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = new Locale("T(9qK73GD(n]jt,L/", "T(9qK73GD(n]jt,L/", "T(9qK73GD(n]jt,L/");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      TimeZone timeZone0 = TimeZone.getDefault();
      Month month0 = new Month(date0, timeZone0, locale0);
      month0.getFirstMillisecond();
      assertEquals(18994L, month0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Month month0 = new Month();
      // Undeclared exception!
      try { 
        month0.peg((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockDate mockDate0 = new MockDate(9999, 9999, 0, 9999, 2477);
      Month month0 = new Month(mockDate0);
      // Undeclared exception!
      try { 
        month0.getYear();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Year constructor: year (12733) outside valid range.
         //
         verifyException("org.jfree.data.time.Year", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Month month0 = new Month();
      // Undeclared exception!
      try { 
        month0.getLastMillisecond((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Month", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Month month0 = new Month();
      // Undeclared exception!
      try { 
        month0.getFirstMillisecond((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "z", 0, 0, 0, 0, 0, 0, 0, 0, 9999);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Month month0 = null;
      try {
        month0 = new Month(date0, simpleTimeZone0, (Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1878), (-1878), 32, (-3302), (-1878));
      Month month0 = null;
      try {
        month0 = new Month(mockDate0, (TimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Month month0 = null;
      try {
        month0 = new Month((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Month month0 = null;
      try {
        month0 = new Month(8, (Year) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Month", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Year year0 = new Year();
      Month month0 = new Month(12, year0);
      assertEquals(24180L, month0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Month month0 = new Month(mockDate0, timeZone0);
      int int0 = month0.getYearValue();
      assertEquals(1, month0.getMonth());
      assertEquals(1970, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-119), (-119), (-119));
      Month month0 = new Month(mockDate0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(12, 12, (-119), 12, 12, 12);
      month0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1770,MONTH=9,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=1,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1398), 1800, (-1398), (-1398), 45, 655);
      Month month0 = new Month(mockDate0);
      int int0 = month0.getMonth();
      assertEquals(1, int0);
      assertEquals(648, month0.getYearValue());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Month month0 = new Month(date0);
      month0.peg(mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1582,MONTH=9,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=31,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Month month0 = new Month();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      month0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=28,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        Month.parseMonth("g)PLL '<-gb$j('");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't evaluate the month.
         //
         verifyException("org.jfree.data.time.Month", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        Month.parseMonth("Pjp7G53");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't evaluate the year.
         //
         verifyException("org.jfree.data.time.Month", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        Month.parseMonth("7 $");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't evaluate the month.
         //
         verifyException("org.jfree.data.time.Month", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        Month.parseMonth(" ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Month month0 = Month.parseMonth((String) null);
      assertNull(month0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Month month0 = new Month();
      MockDate mockDate0 = new MockDate(0L);
      Day day0 = new Day(mockDate0);
      int int0 = month0.compareTo(day0);
      assertEquals(0, int0);
      assertEquals(24170L, month0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Month month0 = new Month();
      RegularTimePeriod regularTimePeriod0 = month0.previous();
      RegularTimePeriod regularTimePeriod1 = regularTimePeriod0.previous();
      assertNotNull(regularTimePeriod1);
      
      int int0 = ((Month) regularTimePeriod1).compareTo(regularTimePeriod0);
      assertEquals(24168L, regularTimePeriod1.getSerialIndex());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Month month0 = new Month();
      int int0 = month0.compareTo("February 2014");
      assertEquals(1, int0);
      assertEquals(24170L, month0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      System.setCurrentTimeMillis(323L);
      Month month0 = new Month();
      Month month1 = new Month(1, 1);
      boolean boolean0 = month0.equals(month1);
      assertEquals(13L, month1.getSerialIndex());
      assertFalse(month1.equals((Object)month0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Month month0 = new Month();
      Month month1 = Month.parseMonth("February 2014");
      boolean boolean0 = month1.equals(month0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Month month0 = new Month();
      RegularTimePeriod regularTimePeriod0 = month0.previous();
      boolean boolean0 = ((Month) regularTimePeriod0).equals(month0);
      assertFalse(month0.equals((Object)regularTimePeriod0));
      assertFalse(boolean0);
      assertEquals(24169L, regularTimePeriod0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Month month0 = new Month();
      boolean boolean0 = month0.equals(month0);
      assertEquals(24170L, month0.getSerialIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Month month0 = new Month();
      Object object0 = new Object();
      boolean boolean0 = month0.equals(object0);
      assertEquals(24170L, month0.getSerialIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Month month0 = new Month();
      RegularTimePeriod regularTimePeriod0 = month0.previous();
      RegularTimePeriod regularTimePeriod1 = regularTimePeriod0.previous();
      assertNotNull(regularTimePeriod1);
      
      RegularTimePeriod regularTimePeriod2 = regularTimePeriod1.next();
      assertEquals(24169L, regularTimePeriod2.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Month month0 = new Month(1, 1);
      RegularTimePeriod regularTimePeriod0 = month0.previous();
      assertNull(regularTimePeriod0);
      assertEquals(13L, month0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Month month0 = null;
      try {
        month0 = new Month(1092, (Year) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Month outside valid range.
         //
         verifyException("org.jfree.data.time.Month", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Year year0 = new Year();
      Month month0 = null;
      try {
        month0 = new Month(0, year0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Month outside valid range.
         //
         verifyException("org.jfree.data.time.Month", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Month month0 = null;
      try {
        month0 = new Month(1990, (-1454));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Month outside valid range.
         //
         verifyException("org.jfree.data.time.Month", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Month month0 = new Month();
      RegularTimePeriod regularTimePeriod0 = month0.next();
      int int0 = ((Month) regularTimePeriod0).compareTo(regularTimePeriod0);
      assertEquals(0, int0);
      assertEquals(24171L, regularTimePeriod0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Month month0 = null;
      try {
        month0 = new Month(0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Month outside valid range.
         //
         verifyException("org.jfree.data.time.Month", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Month month0 = new Month();
      month0.getLastMillisecond();
      assertEquals(24170L, month0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Month month0 = new Month();
      String string0 = month0.toString();
      assertEquals(24170L, month0.getSerialIndex());
      assertEquals("February 2014", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Month month0 = new Month();
      month0.hashCode();
  }
}
