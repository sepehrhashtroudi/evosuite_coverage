/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:07:40 GMT 2022
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseDuration_ESTest extends BaseDuration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Duration duration0 = Duration.millis(0L);
      Instant instant0 = new Instant(0L);
      Interval interval0 = duration0.toIntervalTo(instant0);
      assertEquals(0L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Duration duration0 = weeks0.toStandardDuration();
      Interval interval0 = duration0.toIntervalTo((ReadableInstant) null);
      assertEquals(1392409281320L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Duration duration0 = Duration.standardDays(0L);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Instant instant0 = gJChronology0.getGregorianCutover();
      Interval interval0 = duration0.toIntervalTo(instant0);
      assertEquals((-12219292800000L), interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Duration duration0 = minutes0.toStandardDuration();
      Instant instant0 = Instant.now();
      Instant instant1 = instant0.withMillis(0L);
      MutableDateTime mutableDateTime0 = instant1.toMutableDateTime();
      Interval interval0 = duration0.toIntervalFrom(mutableDateTime0);
      assertEquals(0L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Duration duration0 = seconds0.toStandardDuration();
      DateTime dateTime0 = new DateTime((-42521587200000L), (DateTimeZone) null);
      Interval interval0 = duration0.toIntervalFrom(dateTime0);
      assertEquals((-42521587200000L), interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(2069L);
      long long0 = duration0.getMillis();
      assertEquals(2069000L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes((-996L));
      long long0 = duration0.getMillis();
      assertEquals((-59760000L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Duration duration0 = Duration.standardHours(15778800000L);
      Minutes minutes0 = Minutes.ZERO;
      PeriodType periodType0 = minutes0.getPeriodType();
      // Undeclared exception!
      try { 
        duration0.toPeriodTo((ReadableInstant) null, periodType0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 946728000000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTime dateTime0 = new DateTime(5, 5, 2, 4, 2);
      Duration duration0 = new Duration(mutableDateTime0, dateTime0);
      PeriodType periodType0 = PeriodType.millis();
      // Undeclared exception!
      try { 
        duration0.toPeriodFrom((ReadableInstant) dateTime0, periodType0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -63391279529320
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Duration duration0 = Duration.standardHours(1367L);
      Duration duration1 = duration0.withDurationAdded((ReadableDuration) duration0, 153692453);
      // Undeclared exception!
      try { 
        duration1.toPeriod((PeriodType) null, (Chronology) null);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 210097584618
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      Duration duration0 = weeks0.toStandardDuration();
      PeriodType periodType0 = PeriodType.minutes();
      // Undeclared exception!
      try { 
        duration0.toPeriod(periodType0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 21646635161760
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      Duration duration1 = duration0.withMillis((-1317L));
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        duration1.toIntervalFrom(mutableDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Duration duration0 = Duration.parse((String) null);
      long long0 = duration0.getMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Duration duration0 = new Duration((-1633L));
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((-1633L), (Chronology) gJChronology0);
      DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime();
      duration0.toPeriodTo((ReadableInstant) dateTime0);
      assertEquals((-1L), duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Duration duration0 = weeks0.toStandardDuration();
      Interval interval0 = duration0.toIntervalFrom((ReadableInstant) null);
      assertEquals(1392409281320L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      Duration duration0 = new Duration(mutableDateTime0, dateTime0);
      Months months0 = Months.TWO;
      PeriodType periodType0 = months0.getPeriodType();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      duration0.toPeriod(periodType0, (Chronology) buddhistChronology0);
      assertEquals(0L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Instant instant0 = Instant.now();
      Duration duration0 = new Duration(instant0, instant0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      duration0.toPeriod((Chronology) buddhistChronology0);
      assertEquals(0L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Days days0 = weeks0.toStandardDays();
      Duration duration0 = weeks0.toStandardDuration();
      Minutes minutes0 = days0.toStandardMinutes();
      PeriodType periodType0 = minutes0.getPeriodType();
      Period period0 = duration0.toPeriod(periodType0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Duration duration0 = Duration.standardHours(339L);
      Years years0 = Years.ONE;
      PeriodType periodType0 = years0.getPeriodType();
      duration0.toPeriodTo((ReadableInstant) dateTime0, periodType0);
      assertEquals(339L, duration0.getStandardHours());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-2208L));
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) null);
      // Undeclared exception!
      try { 
        duration0.toIntervalTo(mutableDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Duration duration0 = new Duration(3, 4);
      assertEquals(1L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-2208L));
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) null);
      PeriodType periodType0 = PeriodType.seconds();
      duration0.toPeriodFrom((ReadableInstant) mutableDateTime0, periodType0);
      assertEquals((-190771200000L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Duration duration0 = new Duration((-1633L));
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      duration0.toPeriodFrom((ReadableInstant) mutableDateTime0);
      assertEquals((-1L), duration0.getStandardSeconds());
  }
}
