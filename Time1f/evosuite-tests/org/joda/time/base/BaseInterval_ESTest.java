/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:12:03 GMT 2022
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseInterval_ESTest extends BaseInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Interval interval0 = new Interval((Object) null);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      Interval interval0 = new Interval((ReadablePeriod) null, mutableDateTime0);
      long long0 = interval0.getStartMillis();
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      long long0 = mutableInterval0.getEndMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      DateTime dateTime0 = mutableInterval0.getEnd();
      Instant instant0 = Instant.now();
      Interval interval0 = new Interval(dateTime0, instant0);
      long long0 = interval0.getEndMillis();
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Interval interval0 = new Interval((-1L), (-1L));
      long long0 = interval0.getEndMillis();
      assertEquals((-1L), long0);
      assertEquals((-1L), interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Duration duration0 = minutes0.toStandardDuration();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateTime dateTime0 = new DateTime(1577L, (Chronology) julianChronology0);
      Interval interval0 = new Interval(duration0, dateTime0);
      interval0.getChronology();
      assertEquals((-128849018818423L), interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      long long0 = mutableInterval0.getStartMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableInterval.parse("YearWeekDay");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: YearWeekDay
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Duration duration0 = new Duration(0L, 0L);
      Interval interval0 = duration0.toIntervalFrom((ReadableInstant) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      MutableInterval mutableInterval0 = new MutableInterval(interval0, buddhistChronology0);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTime dateTime0 = new DateTime((-1L), (Chronology) buddhistChronology0);
      Interval interval0 = new Interval(dateTime0, (ReadablePeriod) null);
      assertEquals((-1L), interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTime dateTime0 = new DateTime((-1L), (Chronology) buddhistChronology0);
      Months months0 = Months.monthsBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      Interval interval0 = new Interval(dateTime0, months0);
      long long0 = interval0.getStartMillis();
      assertEquals((-1L), long0);
      assertEquals((-1L), interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, (ReadableInstant) null);
      assertEquals(1392409281320L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Duration duration0 = new Duration((Object) null);
      Interval interval0 = new Interval((ReadableInstant) null, duration0);
      assertEquals(1392409281320L, interval0.getEndMillis());
      
      MutableInterval mutableInterval0 = new MutableInterval(interval0);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      Seconds seconds0 = Seconds.ZERO;
      Hours hours0 = Hours.standardHoursIn(seconds0);
      Interval interval0 = new Interval(hours0, mutableDateTime0);
      Interval interval1 = interval0.withPeriodBeforeEnd(seconds0);
      assertTrue(interval1.equals((Object)interval0));
  }
}
