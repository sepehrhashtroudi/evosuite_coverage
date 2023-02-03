/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:51:09 GMT 2022
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.ReadablePeriod;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeOfDay_ESTest extends TimeOfDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(2339L);
      DateTimeFieldType dateTimeFieldType0 = timeOfDay0.getFieldType(1);
      // Undeclared exception!
      try { 
        timeOfDay0.withField(dateTimeFieldType0, (-1227));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1227 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      TimeOfDay timeOfDay0 = new TimeOfDay((Chronology) iSOChronology0);
      TimeOfDay timeOfDay1 = timeOfDay0.minusSeconds(1000);
      assertEquals(41, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withField(dateTimeFieldType0, 3);
      assertEquals(3, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      TimeOfDay timeOfDay0 = new TimeOfDay(3, 3, ethiopicChronology0);
      TimeOfDay timeOfDay1 = timeOfDay0.withChronologyRetainFields(ethiopicChronology0);
      assertSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(1351L);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      TimeOfDay timeOfDay1 = timeOfDay0.withChronologyRetainFields(julianChronology0);
      assertNotSame(timeOfDay1, timeOfDay0);
      assertEquals(0, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(2);
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(175L);
      DateTimeUtils.MillisProvider dateTimeUtils_MillisProvider0 = mock(DateTimeUtils.MillisProvider.class, new ViolatedAssumptionAnswer());
      doReturn((long)1).when(dateTimeUtils_MillisProvider0).getMillis();
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_MillisProvider0);
      DateTime dateTime0 = timeOfDay0.toDateTimeToday(dateTimeZone0);
      assertEquals((-7199825L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(2, 2);
      Months months0 = Months.ONE;
      TimeOfDay timeOfDay1 = timeOfDay0.plus(months0);
      assertEquals(2, timeOfDay1.getHourOfDay());
      assertNotSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      int int0 = timeOfDay0.getMinuteOfHour();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      int int0 = timeOfDay0.getMillisOfSecond();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("9%S`jg");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      TimeOfDay timeOfDay0 = new TimeOfDay(0L, (Chronology) julianChronology0);
      int int0 = timeOfDay0.getHourOfDay();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeZone timeZone0 = TimeZone.getTimeZone("dayOfYear");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      DateTimeField dateTimeField0 = timeOfDay0.getField(1, (Chronology) islamicChronology0);
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(0L, (Chronology) ethiopicChronology0);
      int int0 = timeOfDay0.getSecondOfMinute();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay((-2919L), (Chronology) null);
      TimeOfDay timeOfDay1 = timeOfDay0.plusMinutes(1);
      assertEquals(0, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, (-637), (-637), 17, 28265625, 2);
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(mockDate0);
      int int0 = timeOfDay0.getSecondOfMinute();
      assertEquals(2, int0);
      assertEquals(0, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 2, 3);
      TimeOfDay timeOfDay0 = TimeOfDay.fromCalendarFields(mockGregorianCalendar0);
      assertEquals(0, timeOfDay0.getSecondOfMinute());
      assertEquals(0, timeOfDay0.getHourOfDay());
      assertEquals(0, timeOfDay0.getMillisOfSecond());
      assertEquals(0, timeOfDay0.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      int[] intArray0 = new int[3];
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, intArray0);
      // Undeclared exception!
      try { 
        timeOfDay1.withHourOfDay(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      // Undeclared exception!
      try { 
        timeOfDay0.withField(dateTimeFieldType0, 1332);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'dayOfMonth' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(mockDate0);
      int[] intArray0 = new int[0];
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, intArray0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      try { 
        timeOfDay1.withChronologyRetainFields(gregorianChronology0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay((-4922L));
      TimeOfDay timeOfDay1 = timeOfDay0.minusMillis(1);
      assertEquals(77, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[9];
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay((TimeOfDay) null, intArray0);
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
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay((TimeOfDay) null, (Chronology) buddhistChronology0);
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
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay((-1), (-1), 2, 2, buddhistChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for hourOfDay must not be smaller than 0
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(14, 14, (-1531), 14);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1531 for secondOfMinute must not be smaller than 0
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) null);
      TimeOfDay timeOfDay0 = new TimeOfDay((-1093L), (Chronology) ethiopicChronology0);
      int int0 = timeOfDay0.size();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) null);
      TimeOfDay timeOfDay0 = new TimeOfDay((-1093L), (Chronology) ethiopicChronology0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = timeOfDay0.getFieldTypes();
      assertEquals(4, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(1, 1, 1, (Chronology) null);
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      // Undeclared exception!
      try { 
        timeOfDay0.withFieldAdded(durationFieldType0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'centuries' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((Object) null);
      // Undeclared exception!
      try { 
        timeOfDay0.withSecondOfMinute(614);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 614 for secondOfMinute must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2434));
      TimeOfDay timeOfDay0 = new TimeOfDay(dateTimeZone0);
      int int0 = timeOfDay0.getMillisOfSecond();
      assertEquals(886, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(3494L, (Chronology) lenientChronology0);
      TimeOfDay timeOfDay1 = timeOfDay0.withSecondOfMinute(1);
      assertEquals(1, timeOfDay1.getSecondOfMinute());
      assertEquals(0, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay((Object) null, julianChronology0);
      DateTimeFieldType dateTimeFieldType0 = timeOfDay0.getFieldType(3);
      assertEquals("millisOfSecond", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-748L));
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(mockDate0);
      DateTime dateTime0 = timeOfDay0.toDateTimeToday();
      assertEquals(1392447599252L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 2, 3, 0);
      assertEquals(0, timeOfDay0.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay(2, 2, 2, 2, julianChronology0);
      assertEquals(2, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      TimeOfDay timeOfDay0 = new TimeOfDay(dateTimeZone0);
      // Undeclared exception!
      try { 
        timeOfDay0.getFieldType((-3042));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(62L);
      int int0 = timeOfDay0.getMinuteOfHour();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(12, 1, 0);
      assertEquals(3, TimeOfDay.MILLIS_OF_SECOND);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(31449600000L, (Chronology) null);
      TimeOfDay timeOfDay1 = timeOfDay0.withHourOfDay(1);
      assertEquals(1, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2434));
      TimeOfDay timeOfDay0 = new TimeOfDay(dateTimeZone0);
      int[] intArray0 = new int[3];
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, intArray0);
      // Undeclared exception!
      try { 
        timeOfDay1.getMillisOfSecond();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.joda.time.base.BasePartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      TimeOfDay timeOfDay1 = timeOfDay0.withPeriodAdded((ReadablePeriod) null, (-23));
      assertEquals(0, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withField(dateTimeFieldType0, 0);
      TimeOfDay timeOfDay2 = timeOfDay1.withMinuteOfHour(1);
      assertEquals(1, timeOfDay2.getMinuteOfHour());
      assertEquals(0, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-748L));
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(mockDate0);
      // Undeclared exception!
      try { 
        timeOfDay0.getField((-1481), (Chronology) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -1481
         //
         verifyException("org.joda.time.TimeOfDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeOfDay.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.TimeOfDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeOfDay.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.TimeOfDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(12, (-1347));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1347 for minuteOfHour must not be smaller than 0
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(mockDate0);
      timeOfDay0.MIDNIGHT.toString();
      assertEquals(320, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) null, 3);
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(0, 2858, ethiopicChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2858 for minuteOfHour must not be larger than 59
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((DateTimeZone) null);
      TimeOfDay timeOfDay1 = timeOfDay0.plusSeconds(1000);
      assertEquals(1, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.minusMinutes(13);
      assertEquals(8, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      assertEquals(4, timeOfDay0.size());
      
      TimeOfDay timeOfDay1 = timeOfDay0.plusMillis(0);
      assertSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      Hours hours0 = Hours.MAX_VALUE;
      // Undeclared exception!
      try { 
        timeOfDay0.plus(hours0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147483636 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay((-903), 12, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -903 for hourOfDay must not be smaller than 0
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2434));
      TimeOfDay timeOfDay0 = new TimeOfDay(dateTimeZone0);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, (Chronology) islamicChronology0);
      assertEquals(4, timeOfDay1.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(dateTimeFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(2);
      DateTime dateTime0 = timeOfDay0.toDateTimeToday(dateTimeZone0);
      assertEquals(1392376881320L, dateTime0.getMillis());
      assertEquals(4, timeOfDay0.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      TimeOfDay timeOfDay0 = TimeOfDay.fromCalendarFields(mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        timeOfDay0.withMillisOfSecond(1085);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1085 for millisOfSecond must be in the range [0,999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(dateTimeFieldType0, iSOChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-748L));
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(mockDate0);
      assertEquals(23, timeOfDay0.getHourOfDay());
      
      timeOfDay0.toLocalTime();
      assertEquals(252, timeOfDay0.getMillisOfSecond());
      assertEquals(4, timeOfDay0.size());
      assertEquals(59, timeOfDay0.getMinuteOfHour());
      assertEquals(59, timeOfDay0.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.plusHours(988);
      assertEquals(4, timeOfDay1.getHourOfDay());
      assertEquals(4, timeOfDay1.size());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(1, 1, (-460), buddhistChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -460 for secondOfMinute must not be smaller than 0
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.withMinuteOfHour(3);
      assertEquals(4, timeOfDay0.size());
      assertEquals(3, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((DateTimeZone) null);
      Minutes minutes0 = Minutes.THREE;
      Days days0 = Days.standardDaysIn(minutes0);
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.minus(days0);
      assertEquals(4, timeOfDay1.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay((Chronology) islamicChronology0);
      // Undeclared exception!
      try { 
        timeOfDay0.MIDNIGHT.withHourOfDay((-2738));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2738 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay((long) 0);
      assertEquals(4, timeOfDay0.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 2, 2, 1429, 12);
      TimeOfDay timeOfDay0 = TimeOfDay.fromCalendarFields(mockGregorianCalendar0);
      TimeOfDay timeOfDay1 = timeOfDay0.minusHours(2);
      assertEquals(0, timeOfDay1.getSecondOfMinute());
      assertEquals(4, timeOfDay0.size());
      assertEquals(11, timeOfDay1.getHourOfDay());
      assertEquals(0, timeOfDay1.getMillisOfSecond());
      assertEquals(12, timeOfDay1.getMinuteOfHour());
  }
}
