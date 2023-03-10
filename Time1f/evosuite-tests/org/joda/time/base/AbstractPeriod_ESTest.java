/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:10:13 GMT 2022
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.Seconds;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractPeriod_ESTest extends AbstractPeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.days((-1611));
      Period period1 = period0.withMillis(17);
      boolean boolean0 = period1.equals(period0);
      assertFalse(boolean0);
      assertFalse(period0.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, (Chronology) null);
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.days((-3823));
      int int0 = period0.size();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      MutablePeriod mutablePeriod0 = new MutablePeriod(30585600000L, (Chronology) iSOChronology0);
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      boolean boolean0 = mutablePeriod0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.days(27);
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      boolean boolean0 = period0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      DurationFieldType durationFieldType0 = periodType0.getFieldType(0);
      Duration duration0 = Duration.standardMinutes(0);
      Days days0 = duration0.toStandardDays();
      Period period0 = days0.toPeriod();
      int int0 = period0.indexOf(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L);
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      int int0 = mutablePeriod0.indexOf(durationFieldType0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn((-2589)).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      // Undeclared exception!
      try { 
        mutablePeriod0.toString(periodFormatter0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Interval interval0 = localDate0.toInterval((DateTimeZone) null);
      Seconds seconds0 = Seconds.secondsIn(interval0);
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period0 = new Period(seconds0, periodType0);
      // Undeclared exception!
      try { 
        period0.getFieldType(500);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 500
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Duration duration0 = new Duration(100000L, 100000L);
      Instant instant0 = Instant.now();
      Period period0 = duration0.toPeriodTo((ReadableInstant) instant0);
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      int int0 = period0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(63158400000L);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(360);
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      MutableDateTime mutableDateTime0 = dateTime0.toMutableDateTime(dateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(duration0, mutableDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      int int0 = mutablePeriod0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.months(0);
      int[] intArray0 = period0.getValues();
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.hours((-2586));
      String string0 = period0.toString();
      assertEquals("PT-2586H", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Duration duration0 = new Duration(100000L, 100000L);
      Instant instant0 = Instant.now();
      Period period0 = duration0.toPeriodTo((ReadableInstant) instant0);
      DurationFieldType durationFieldType0 = period0.getFieldType(0);
      assertEquals("years", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      int int0 = period0.indexOf(durationFieldType0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(ethiopicChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1L), (-3145L), lenientChronology0);
      Period period0 = mutablePeriod0.toPeriod();
      period0.hashCode();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(623191204).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      MutablePeriod mutablePeriod0 = MutablePeriod.parse("FLB(l^(?3P[%T", periodFormatter0);
      MutablePeriod mutablePeriod1 = mutablePeriod0.toMutablePeriod();
      assertNotSame(mutablePeriod1, mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.days((-1611));
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(17).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = period0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.hours((-2586));
      Months months0 = Months.ELEVEN;
      boolean boolean0 = period0.equals(months0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = Period.days((-1611));
      Period period1 = period0.withMonths((-490));
      boolean boolean0 = period1.equals(period0);
      assertFalse(boolean0);
      assertFalse(period0.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.days((-1611));
      boolean boolean0 = period0.equals(period0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 0, (-2586), (-2586), 0, 0);
      PeriodType periodType0 = PeriodType.yearMonthDay();
      boolean boolean0 = period0.equals(periodType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.days((-1611));
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("P-1611D", string0);
  }
}
