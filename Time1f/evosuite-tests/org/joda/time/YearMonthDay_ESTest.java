/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:15:13 GMT 2022
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonthDay;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2312L));
      YearMonthDay yearMonthDay0 = YearMonthDay.fromDateFields(mockDate0);
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusMonths((-1005));
      assertEquals(1886, yearMonthDay1.getYear());
      assertEquals(3, yearMonthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(1L);
      YearMonthDay yearMonthDay1 = yearMonthDay0.withYear(0);
      assertEquals(0, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) julianChronology0);
      YearMonthDay yearMonthDay1 = yearMonthDay0.withYear(1);
      assertEquals(1, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(562L);
      YearMonthDay yearMonthDay1 = yearMonthDay0.withMonthOfYear(1);
      assertEquals(1, yearMonthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((DateTimeZone) null);
      Interval interval0 = yearMonthDay0.toInterval();
      assertEquals(1392447600000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      YearMonthDay yearMonthDay0 = new YearMonthDay(0L, (Chronology) iSOChronology0);
      YearMonthDay yearMonthDay1 = yearMonthDay0.withDayOfMonth(3);
      Interval interval0 = yearMonthDay1.toInterval();
      assertEquals((-2480400000L), interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonthDay yearMonthDay0 = new YearMonthDay(dateTimeZone0);
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtMidnight();
      assertEquals(1392361200000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((DateTimeZone) null);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeField dateTimeField0 = yearMonthDay0.getField(0, (Chronology) ethiopicChronology0);
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) julianChronology0);
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withFieldAdded(durationFieldType0, 2);
      assertEquals(2016, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonthDay yearMonthDay0 = new YearMonthDay(dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      // Undeclared exception!
      try { 
        yearMonthDay0.withField(dateTimeFieldType0, (-1987));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'yearOfCentury' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-3168), 0, (-3168));
      YearMonthDay yearMonthDay0 = YearMonthDay.fromDateFields(mockDate0);
      // Undeclared exception!
      try { 
        yearMonthDay0.withDayOfMonth(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for dayOfMonth must be in the range [1,30]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) islamicChronology0);
      YearMonthDay yearMonthDay1 = new YearMonthDay(yearMonthDay0, (int[]) null);
      // Undeclared exception!
      try { 
        yearMonthDay1.withDayOfMonth((-1037));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.BasePartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      YearMonthDay yearMonthDay0 = new YearMonthDay(772L, (Chronology) julianChronology0);
      int[] intArray0 = new int[4];
      YearMonthDay yearMonthDay1 = new YearMonthDay(yearMonthDay0, intArray0);
      Instant instant0 = new Instant(1015L);
      Chronology chronology0 = instant0.getChronology();
      // Undeclared exception!
      try { 
        yearMonthDay1.withChronologyRetainFields(chronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must not be smaller than 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = new YearMonthDay(yearMonthDay0, (int[]) null);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) null);
      // Undeclared exception!
      try { 
        yearMonthDay1.withChronologyRetainFields(ethiopicChronology0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.BasePartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      YearMonthDay yearMonthDay0 = YearMonthDay.fromCalendarFields(calendar0);
      int[] intArray0 = new int[4];
      YearMonthDay yearMonthDay1 = new YearMonthDay(yearMonthDay0, intArray0);
      // Undeclared exception!
      try { 
        yearMonthDay1.toInterval();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      int[] intArray0 = new int[0];
      YearMonthDay yearMonthDay1 = new YearMonthDay(yearMonthDay0, intArray0);
      // Undeclared exception!
      try { 
        yearMonthDay1.toInterval();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.joda.time.base.BasePartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.US;
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      YearMonthDay yearMonthDay0 = YearMonthDay.fromCalendarFields(calendar0);
      // Undeclared exception!
      try { 
        yearMonthDay0.getFieldType((-3488));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(0L);
      // Undeclared exception!
      try { 
        yearMonthDay0.getField(0, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-772), 0, 0, (-772));
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        YearMonthDay.fromCalendarFields(mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay((YearMonthDay) null, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.BasePartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay((YearMonthDay) null, (Chronology) islamicChronology0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.BasePartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object object0 = new Object();
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: java.lang.Object
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay((-4979), (-1868), (-1868), copticChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1868 for monthOfYear must not be smaller than 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay((-148), 2, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for dayOfMonth must not be smaller than 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((DateTimeZone) null);
      YearMonthDay yearMonthDay1 = yearMonthDay0.withPeriodAdded((ReadablePeriod) null, (-1218));
      assertEquals(1, YearMonthDay.MONTH_OF_YEAR);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((-7448L));
      // Undeclared exception!
      try { 
        yearMonthDay0.getField(1098, (Chronology) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 1098
         //
         verifyException("org.joda.time.YearMonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtMidnight(dateTimeZone0);
      assertEquals(1392361200000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((DateTimeZone) null);
      int int0 = yearMonthDay0.getDayOfMonth();
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonthDay yearMonthDay0 = new YearMonthDay(dateTimeZone0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = yearMonthDay0.getFieldTypes();
      assertEquals(3, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) islamicChronology0);
      yearMonthDay0.toLocalDate();
      assertEquals(1435, yearMonthDay0.getYear());
      assertEquals(13, yearMonthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      YearMonthDay yearMonthDay0 = new YearMonthDay(0L, (Chronology) iSOChronology0);
      int int0 = yearMonthDay0.size();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(12, 12, 12);
      assertEquals(3, yearMonthDay0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) islamicChronology0);
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusMonths((-4909));
      assertEquals(5, yearMonthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonthDay yearMonthDay0 = new YearMonthDay(dateTimeZone0);
      YearMonthDay yearMonthDay1 = yearMonthDay0.withYear((-56));
      int int0 = yearMonthDay1.getYear();
      assertEquals((-56), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonthDay yearMonthDay0 = new YearMonthDay(dateTimeZone0);
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtCurrentTime(dateTimeZone0);
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Interval interval0 = yearMonthDay0.toInterval((DateTimeZone) null);
      assertEquals(1392447600000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, 0L, 1);
      YearMonthDay yearMonthDay0 = new YearMonthDay((Object) null, gJChronology0);
      int int0 = yearMonthDay0.getYear();
      assertEquals(2014, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      YearMonthDay yearMonthDay0 = new YearMonthDay((-1029L), (Chronology) islamicChronology0);
      DateTimeFieldType dateTimeFieldType0 = yearMonthDay0.getFieldType(2);
      assertEquals("dayOfMonth", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 5);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      YearMonthDay yearMonthDay0 = new YearMonthDay(5, 5, 5, ethiopicChronology0);
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtCurrentTime(dateTimeZone0);
      Interval interval0 = new Interval((ReadablePeriod) null, dateTime0);
      Days days0 = Days.daysIn(interval0);
      Minutes minutes0 = days0.toStandardMinutes();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withPeriodAdded(minutes0, 1);
      assertNotSame(yearMonthDay1, yearMonthDay0);
      assertEquals((-61757091518680L), interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      YearMonthDay yearMonthDay0 = new YearMonthDay(0L, (Chronology) iSOChronology0);
      int int0 = yearMonthDay0.getMonthOfYear();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(367L);
      Interval interval0 = new Interval(1, 1);
      Period period0 = interval0.toPeriod();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minus(period0);
      assertNotSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((DateTimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (-5667L), 2);
      Period period0 = new Period((-1755L), 1, gJChronology0);
      YearMonthDay yearMonthDay1 = yearMonthDay0.withPeriodAdded(period0, 0);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      java.time.Instant instant0 = MockInstant.ofEpochMilli((-1480L));
      Date date0 = Date.from(instant0);
      YearMonthDay yearMonthDay0 = YearMonthDay.fromDateFields(date0);
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusDays((-1055));
      assertEquals(10, yearMonthDay1.getDayOfMonth());
      assertEquals(1967, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) islamicChronology0);
      YearMonthDay yearMonthDay1 = yearMonthDay0.withChronologyRetainFields(islamicChronology0);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      YearMonthDay yearMonthDay0 = new YearMonthDay(772L, (Chronology) julianChronology0);
      Instant instant0 = new Instant(1015L);
      Chronology chronology0 = instant0.getChronology();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withChronologyRetainFields(chronology0);
      assertNotSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonthDay.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.YearMonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonthDay.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.YearMonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(63158400000L);
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusDays((-187));
      assertEquals(6, yearMonthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((-567L));
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusYears((-2283));
      assertEquals(4252, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Integer integer0 = new Integer((-868));
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay((Object) integer0, (Chronology) gregorianChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: java.lang.Integer
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) islamicChronology0);
      // Undeclared exception!
      try { 
        yearMonthDay0.withMonthOfYear((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      YearMonthDay yearMonthDay0 = new YearMonthDay(0L, (Chronology) iSOChronology0);
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtCurrentTime();
      assertEquals((-13118680L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      int[] intArray0 = new int[9];
      YearMonthDay yearMonthDay1 = new YearMonthDay(yearMonthDay0, intArray0);
      // Undeclared exception!
      try { 
        yearMonthDay1.toInterval((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) islamicChronology0);
      YearMonthDay yearMonthDay1 = new YearMonthDay(yearMonthDay0, (Chronology) islamicChronology0);
      assertEquals(13, yearMonthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(0L);
      Years years0 = Years.yearsBetween((ReadablePartial) yearMonthDay0, (ReadablePartial) yearMonthDay0);
      YearMonthDay yearMonthDay1 = yearMonthDay0.plus(years0);
      assertNotSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) islamicChronology0);
      String string0 = yearMonthDay0.toString();
      assertEquals("1435-04-13", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      YearMonthDay yearMonthDay0 = new YearMonthDay(0L, (Chronology) iSOChronology0);
      assertEquals(12, yearMonthDay0.getMonthOfYear());
      assertEquals(3, yearMonthDay0.size());
      
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtMidnight();
      assertEquals((-61200000L), dateTime0.getMillis());
      assertEquals(31, yearMonthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) copticChronology0);
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusYears(0);
      assertEquals(3, yearMonthDay1.size());
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((Object) null);
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusMonths(1143);
      assertEquals(5, yearMonthDay1.getMonthOfYear());
      assertEquals(3, yearMonthDay0.size());
  }
}