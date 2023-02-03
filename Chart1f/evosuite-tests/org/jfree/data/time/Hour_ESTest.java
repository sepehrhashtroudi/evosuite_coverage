/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:10:34 GMT 2022
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.RegularTimePeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Hour_ESTest extends Hour_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hour hour0 = new Hour();
      RegularTimePeriod regularTimePeriod0 = hour0.previous();
      int int0 = ((Hour) regularTimePeriod0).compareTo(hour0);
      assertEquals((-1), int0);
      assertEquals(20, hour0.getHour());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour();
      Hour hour1 = new Hour(date0);
      int int0 = hour0.compareTo(hour1);
      assertEquals(16115, int0);
      assertEquals(20, hour0.getHour());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hour hour0 = new Hour();
      Hour hour1 = (Hour)hour0.previous();
      boolean boolean0 = hour1.equals(hour0);
      assertEquals(19, hour1.getHour());
      assertFalse(hour0.equals((Object)hour1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(821, day0);
      long long0 = hour0.getSerialIndex();
      assertEquals(1000469L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(821, day0);
      Hour hour1 = (Hour)hour0.next();
      assertEquals(54, hour1.getHour());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1927);
      Day day0 = new Day(mockDate0);
      Hour hour0 = new Hour(1927, day0);
      Hour hour1 = (Hour)hour0.previous();
      assertEquals((-122), hour1.getHour());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Hour hour0 = new Hour(mockDate0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-6940), 0, 23, 0);
      hour0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=2014,MONTH=1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=14,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=1,HOUR=11,HOUR_OF_DAY=20,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1144, 0, 0, (-106), (-106));
      Hour hour0 = new Hour(mockDate0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-106), 2588, (-1792), (-106), 2817, 23);
      mockGregorianCalendar0.getWeekYear();
      hour0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3043,MONTH=11,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=26,DAY_OF_YEAR=275,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      hour0.getLastMillisecond();
      assertEquals(0, hour0.getHour());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      int int0 = hour0.getHour();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(182, day0);
      int int0 = hour0.getHour();
      assertEquals((-74), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hour hour0 = new Hour();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3580), (-525), (-468), (-22), (-525));
      hour0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=2014,MONTH=1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=14,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=-22,HOUR_OF_DAY=20,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      System.setCurrentTimeMillis((-35L));
      Hour hour0 = new Hour();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "", 0, 0, 0, 23, 0, 0, 659, 365, 659);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      hour0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=0,dstSavings=659,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=23,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=659,endTime=365,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hour hour0 = new Hour();
      hour0.getFirstMillisecond();
      assertEquals(20, hour0.getHour());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 1, 1, 20, 1994);
      Hour hour0 = new Hour(mockDate0);
      long long0 = hour0.getFirstMillisecond();
      assertEquals(5, hour0.getHour());
      assertEquals((-2174582760000L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hour hour0 = new Hour();
      hour0.getDay();
      assertEquals(20, hour0.getHour());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-732L));
      TimeZone timeZone0 = TimeZone.getDefault();
      Hour hour0 = new Hour(mockDate0, timeZone0);
      hour0.getDay();
      assertEquals(23, hour0.getHour());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1144, 0, 0, (-106), (-106));
      Hour hour0 = new Hour(mockDate0);
      // Undeclared exception!
      try { 
        hour0.peg((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Hour", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hour.parseHour((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Hour", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(2068, day0);
      // Undeclared exception!
      try { 
        hour0.getLastMillisecond((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Hour", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Hour hour0 = new Hour();
      // Undeclared exception!
      try { 
        hour0.getFirstMillisecond((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Hour", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Hour hour0 = null;
      try {
        hour0 = new Hour((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'time' argument.
         //
         verifyException("org.jfree.data.time.Hour", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-1084L), 3563L);
      Date date0 = Date.from(instant0);
      TimeZone timeZone0 = TimeZone.getDefault();
      Hour hour0 = new Hour(date0, timeZone0);
      long long0 = hour0.getLastMillisecond();
      assertEquals(23, hour0.getHour());
      assertEquals((-1084000L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      hour0.getDay();
      assertEquals(0, hour0.getHour());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      Locale locale0 = Locale.forLanguageTag("");
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      hour0.peg(calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=1,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=0,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      hour0.getYear();
      assertEquals(0, hour0.getHour());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      Locale locale0 = Locale.forLanguageTag("");
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      hour0.getFirstMillisecond(calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=1,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      int int0 = hour0.getMonth();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      hour0.getDayOfMonth();
      assertEquals(0, hour0.getHour());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      Locale locale0 = Locale.forLanguageTag("");
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      hour0.getLastMillisecond(calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=1,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=0,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Hour hour0 = Hour.parseHour("[0,1/1/1970]");
      assertNull(hour0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Hour hour0 = new Hour();
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Minute minute0 = new Minute(mockDate0, timeZone0);
      int int0 = hour0.compareTo(minute0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      Hour hour1 = new Hour();
      int int0 = hour0.compareTo(hour1);
      assertEquals((-16115), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      Locale locale0 = Locale.forLanguageTag("");
      int int0 = hour0.compareTo(locale0);
      assertEquals(1, int0);
      assertEquals(0, hour0.getHour());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Hour hour0 = new Hour();
      RegularTimePeriod regularTimePeriod0 = hour0.previous();
      Hour hour1 = (Hour)hour0.previous();
      boolean boolean0 = hour1.equals(regularTimePeriod0);
      assertEquals(19, hour1.getHour());
      assertTrue(boolean0);
      assertFalse(hour1.equals((Object)hour0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Hour hour0 = new Hour();
      boolean boolean0 = hour0.equals(hour0);
      assertTrue(boolean0);
      assertEquals(20, hour0.getHour());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      hour0.equals(date0);
      assertEquals(0, hour0.getHour());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      Hour hour1 = (Hour)hour0.next();
      assertEquals(1, hour1.getHour());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Hour hour0 = new Hour();
      Hour hour1 = (Hour)hour0.previous();
      boolean boolean0 = hour0.equals(hour1);
      assertEquals(19, hour1.getHour());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Hour hour0 = null;
      try {
        hour0 = new Hour(date0, (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'zone' argument.
         //
         verifyException("org.jfree.data.time.Hour", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("2kXbU/I6m fL&Df");
      Hour hour0 = null;
      try {
        hour0 = new Hour((Date) null, timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'time' argument.
         //
         verifyException("org.jfree.data.time.Hour", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Hour hour0 = null;
      try {
        hour0 = new Hour(19, (Day) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'day' argument.
         //
         verifyException("org.jfree.data.time.Hour", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      Hour hour1 = (Hour)hour0.previous();
      Hour hour2 = (Hour)hour1.next();
      assertEquals(0, hour2.getHour());
      assertEquals(23, hour1.getHour());
      assertNotNull(hour2);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      hour0.getFirstMillisecond();
      assertEquals(0, hour0.getHour());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Hour hour0 = null;
      try {
        hour0 = new Hour((-37), (-37), (-37), (-37));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Hour hour0 = new Hour();
      long long0 = hour0.getLastMillisecond();
      assertEquals(1392409281320L, long0);
      assertEquals(20, hour0.getHour());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1144, 1144, 1144, (-106), (-106));
      Hour hour0 = new Hour(mockDate0);
      hour0.hashCode();
      assertEquals(12, hour0.getHour());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Hour hour0 = new Hour();
      String string0 = hour0.toString();
      assertEquals("[20,14/2/2014]", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Hour hour0 = new Hour();
      int int0 = hour0.getHour();
      assertEquals(20, int0);
  }
}
