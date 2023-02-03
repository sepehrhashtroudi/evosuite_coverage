/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 02:22:01 GMT 2022
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.StrictChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.ONE;
      boolean boolean0 = hours0.isLessThan(hours1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.TWO;
      boolean boolean0 = hours1.isGreaterThan(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.hours(86400);
      Weeks weeks0 = hours0.toStandardWeeks();
      assertEquals(514, weeks0.getWeeks());
      assertEquals(86400, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Weeks weeks0 = hours0.MIN_VALUE.toStandardWeeks();
      assertEquals((-12782640), weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Hours hours0 = minutes0.toStandardHours();
      Seconds seconds0 = hours0.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.hours((-5115));
      Seconds seconds0 = hours0.ONE.toStandardSeconds();
      assertEquals((-5115), hours0.getHours());
      assertEquals(3600, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.hoursIn((ReadableInterval) null);
      Minutes minutes0 = hours0.toStandardMinutes();
      assertEquals(1, minutes0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Hours hours0 = weeks0.toStandardHours();
      Duration duration0 = hours0.toStandardDuration();
      assertEquals(604800000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Duration duration0 = hours0.toStandardDuration();
      assertEquals(0L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      Seconds seconds0 = duration0.toStandardSeconds();
      Hours hours0 = seconds0.toStandardHours();
      Duration duration1 = hours0.MIN_VALUE.toStandardDuration();
      assertEquals(0, hours0.getHours());
      assertEquals((-7730941132800000L), duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Days days0 = hours0.ONE.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.FIVE;
      Minutes minutes0 = days0.toStandardMinutes();
      Hours hours0 = minutes0.toStandardHours();
      Days days1 = hours0.toStandardDays();
      assertEquals(5, days1.getDays());
      assertEquals(120, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Weeks weeks0 = hours0.toStandardWeeks();
      Hours hours1 = Hours.standardHoursIn(weeks0);
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(2147483647L);
      Hours hours0 = Hours.hoursBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Hours hours1 = hours0.plus(hours0);
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Days days0 = minutes0.toStandardDays();
      Hours hours0 = days0.toStandardHours();
      Hours hours1 = hours0.plus(0);
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = hours0.plus(1);
      assertEquals((-2147483647), hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hours hours0 = Hours.parseHours("PT6H");
      assertEquals(6, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Days days0 = Days.SIX;
      Hours hours0 = days0.toStandardHours();
      Hours hours1 = hours0.SIX.negated();
      assertEquals((-6), hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Days days0 = Days.FIVE;
      Minutes minutes0 = days0.toStandardMinutes();
      Hours hours0 = minutes0.toStandardHours();
      Hours hours1 = hours0.multipliedBy(11);
      Hours hours2 = hours0.minus(hours1);
      assertEquals((-1200), hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Hours hours0 = Hours.hours(749);
      Hours hours1 = hours0.minus(749);
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = hours0.minus(365);
      assertEquals(2147483282, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      LocalDate localDate0 = LocalDate.fromCalendarFields(mockGregorianCalendar0);
      LocalDate localDate1 = localDate0.withEra(0);
      Hours hours0 = Hours.hoursBetween((ReadablePartial) localDate1, (ReadablePartial) localDate0);
      assertEquals(35308728, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((long) 4);
      LocalDate localDate1 = localDate0.plusWeeks(18);
      Hours hours0 = Hours.hoursBetween((ReadablePartial) localDate1, (ReadablePartial) localDate0);
      assertEquals((-3024), hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Instant instant0 = new Instant();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTime dateTime0 = instant0.toDateTime((Chronology) copticChronology0);
      DateTime dateTime1 = dateTime0.withMillis((-1160));
      Hours hours0 = Hours.hoursBetween((ReadableInstant) dateTime1, (ReadableInstant) instant0);
      assertEquals(386780, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      int int0 = hours0.getHours();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Hours hours0 = Hours.hours((-2457));
      int int0 = hours0.getHours();
      assertEquals((-2457), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Hours hours1 = hours0.EIGHT.dividedBy((-3198));
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Hours hours1 = hours0.MIN_VALUE.dividedBy(1606);
      Hours hours2 = hours0.plus(hours1);
      assertEquals((-1337157), hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      // Undeclared exception!
      try { 
        hours0.toStandardMinutes();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * 60
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Years years0 = Years.years(1246);
      // Undeclared exception!
      try { 
        Hours.standardHoursIn(years0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot convert period to duration as years is not precise in the period P1246Y
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      // Undeclared exception!
      try { 
        hours0.plus(hours0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2147483647 + 2147483647
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      // Undeclared exception!
      try { 
        hours0.negated();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      // Undeclared exception!
      try { 
        hours0.multipliedBy(365);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * 365
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Hours hours0 = Hours.hoursIn((ReadableInterval) null);
      Hours hours1 = Hours.MIN_VALUE;
      // Undeclared exception!
      try { 
        hours0.minus(hours1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      // Undeclared exception!
      try { 
        hours0.MIN_VALUE.minus(1753);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483648 + -1753
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hours.hoursBetween((ReadableInstant) null, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Hours hours1 = hours0.SEVEN.plus(5);
      assertEquals(12, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Hours hours0 = Hours.hours(0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      assertEquals("hours", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Hours hours0 = minutes0.toStandardHours();
      String string0 = hours0.THREE.toString();
      assertEquals("PT3H", string0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Hours hours0 = minutes0.toStandardHours();
      Hours hours1 = hours0.minus(292271029);
      assertEquals((-292271029), hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Hours hours1 = Hours.SEVEN;
      boolean boolean0 = hours0.isLessThan(hours1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Days days0 = Days.FOUR;
      Hours hours0 = days0.toStandardHours();
      boolean boolean0 = hours0.isLessThan((Hours) null);
      assertEquals(96, hours0.getHours());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      boolean boolean0 = hours0.isLessThan(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Hours hours1 = Hours.ONE;
      boolean boolean0 = hours0.isGreaterThan(hours1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Hours hours0 = Hours.hours(749);
      boolean boolean0 = hours0.isGreaterThan((Hours) null);
      assertEquals(749, hours0.getHours());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      boolean boolean0 = hours0.isGreaterThan(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = hours0.THREE.dividedBy(1);
      assertEquals(3, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = hours0.minus((Hours) null);
      assertEquals(1, hours1.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = hours0.plus((Hours) null);
      assertSame(hours0, hours1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = hours0.minus(hours0);
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Hours hours0 = Hours.parseHours((String) null);
      assertEquals(1, hours0.size());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hours.parseHours("u8)()-/tOa8r09_xz:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"u8)()-/tOa8r09_xz:\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Hours hours0 = Hours.hoursIn((ReadableInterval) null);
      // Undeclared exception!
      try { 
        hours0.dividedBy(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.Hours", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, periodType0, (Chronology) iSOChronology0);
      Duration duration0 = mutablePeriod0.toDurationTo((ReadableInstant) null);
      Interval interval0 = duration0.toIntervalFrom((ReadableInstant) null);
      Hours hours0 = Hours.hoursIn(interval0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(3687L);
      // Undeclared exception!
      try { 
        Hours.hoursBetween((ReadablePartial) localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 0);
      Hours hours0 = Hours.hoursBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Hours hours1 = hours0.ZERO.plus(7);
      assertEquals(7, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Hours hours0 = Hours.hours(5);
      assertEquals(5, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Hours hours1 = hours0.ONE.plus(hours0);
      assertEquals(4, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      Duration duration1 = duration0.withDurationAdded(10800000L, 3854);
      Seconds seconds0 = duration1.toStandardSeconds();
      Hours hours0 = seconds0.toStandardHours();
      Hours hours1 = hours0.dividedBy(3854);
      assertEquals(3, hours1.getHours());
      assertEquals(11562, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Hours hours1 = Hours.ONE;
      Hours hours2 = hours0.THREE.minus(hours1);
      assertEquals(2, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Hours hours0 = Hours.hours(1);
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = hours0.multipliedBy(1);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Hours hours0 = minutes0.toStandardHours();
      Minutes minutes1 = hours0.THREE.toStandardMinutes();
      assertEquals(0, hours0.getHours());
      assertEquals(180, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Hours hours0 = minutes0.toStandardHours();
      int int0 = hours0.getHours();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Hours hours0 = minutes0.toStandardHours();
      hours0.negated();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Hours hours0 = minutes0.toStandardHours();
      hours0.getPeriodType();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Days days0 = hours0.MIN_VALUE.toStandardDays();
      assertEquals((-89478485), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Hours hours1 = hours0.FIVE.multipliedBy(0);
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      StrictChronology strictChronology0 = StrictChronology.getInstance(gregorianChronology0);
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) strictChronology0);
      DateTime dateTime0 = mutableDateTime0.toDateTime();
      Hours hours0 = Hours.hoursBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      // Undeclared exception!
      try { 
        hours0.MIN_VALUE.toStandardSeconds();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: -2147483648 * 3600
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}