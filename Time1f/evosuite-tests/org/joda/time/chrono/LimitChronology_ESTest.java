/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:44:05 GMT 2022
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LimitChronology_ESTest extends LimitChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((long) 1, (Chronology) buddhistChronology0);
      LocalDate localDate1 = localDate0.withYear(1);
      assertNotSame(localDate0, localDate1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(lenientChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      limitChronology0.checkLimits(0L, (String) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTime dateTime0 = new DateTime(0L, (Chronology) iSOChronology0);
      Period period0 = Period.years(93);
      DateTime dateTime1 = dateTime0.minus((ReadablePeriod) period0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(iSOChronology0, dateTime1, dateTime0);
      DateTime dateTime2 = limitChronology0.getUpperLimit();
      assertNotSame(dateTime1, dateTime2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1225);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withDayOfMonth(1);
      LimitChronology limitChronology0 = LimitChronology.getInstance(islamicChronology0, dateTime1, dateTime0);
      DateTime dateTime2 = limitChronology0.getUpperLimit();
      assertNotSame(dateTime1, dateTime2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(buddhistChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      long long0 = limitChronology0.getDateTimeMillis(1, 1, 1, 1);
      assertEquals((-79271540767999L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(buddhistChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      Chronology chronology0 = limitChronology0.withZone(dateTimeZone0);
      //  // Unstable assertion: assertNotSame(chronology0, limitChronology0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(buddhistChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      DateTime dateTime0 = limitChronology0.getLowerLimit();
      assertNull(dateTime0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(buddhistChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      DateTime dateTime0 = limitChronology0.getUpperLimit();
      assertNull(dateTime0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(buddhistChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      String string0 = limitChronology0.toString();
      assertEquals("LimitChronology[BuddhistChronology[America/Edmonton], NoLimit, NoLimit]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Instant instant0 = GJChronology.DEFAULT_CUTOVER;
      DateTime dateTime0 = instant0.toDateTime();
      DateTime dateTime1 = dateTime0.withMillisOfDay(1);
      LimitChronology limitChronology0 = LimitChronology.getInstance(gJChronology0, dateTime1, dateTime0);
      limitChronology0.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(buddhistChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      boolean boolean0 = limitChronology0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((long) 1, (Chronology) buddhistChronology0);
      // Undeclared exception!
      try { 
        localDate0.withWeekyear((-2571));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (BuddhistChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(buddhistChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      limitChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(gregorianChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      Chronology chronology0 = limitChronology0.withUTC();
      Chronology chronology1 = limitChronology0.withUTC();
      assertNotSame(chronology1, limitChronology0);
      assertSame(chronology1, chronology0);
      assertNotNull(chronology1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(lenientChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      Chronology chronology0 = limitChronology0.withZone((DateTimeZone) null);
      assertNotSame(chronology0, limitChronology0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTime dateTime0 = DateTime.parse("", dateTimeFormatter0);
      // Undeclared exception!
      try { 
        LimitChronology.getInstance(copticChronology0, dateTime0, dateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The lower limit must be come before than the upper limit
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTime dateTime0 = new DateTime((Object) null, (Chronology) null);
      // Undeclared exception!
      try { 
        LimitChronology.getInstance((Chronology) null, dateTime0, dateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply a chronology
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Object) null, islamicChronology0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LimitChronology limitChronology0 = LimitChronology.getInstance(iSOChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
      int[] intArray0 = limitChronology0.get((ReadablePeriod) period0, 0L, (long) (-1955));
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, (-1), (-955)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(iSOChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      Minutes minutes0 = Minutes.MIN_VALUE;
      long long0 = limitChronology0.add((ReadablePeriod) minutes0, 2053L, (-2525));
      assertEquals(325343772672002053L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Instant instant0 = GJChronology.DEFAULT_CUTOVER;
      DateTime dateTime0 = instant0.toDateTime();
      DateTime dateTime1 = dateTime0.withMillisOfDay(1);
      LimitChronology limitChronology0 = LimitChronology.getInstance(gJChronology0, dateTime1, dateTime0);
      try { 
        limitChronology0.getDateTimeMillis(46, 0, 0, 1, (-2043), (-1881), (-2834));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2043 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTime dateTime0 = new DateTime(0L, (Chronology) iSOChronology0);
      Period period0 = Period.years(93);
      DateTime dateTime1 = dateTime0.minus((ReadablePeriod) period0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(iSOChronology0, dateTime1, dateTime0);
      Chronology chronology0 = limitChronology0.withUTC();
      assertSame(chronology0, limitChronology0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(buddhistChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      limitChronology0.hashCode();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(buddhistChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      try { 
        limitChronology0.getDateTimeMillis(1, 1, (-648), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -648 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTime dateTime0 = new DateTime(0L, (Chronology) iSOChronology0);
      Period period0 = Period.years(93);
      DateTime dateTime1 = dateTime0.minus((ReadablePeriod) period0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(iSOChronology0, dateTime1, dateTime0);
      try { 
        limitChronology0.getDateTimeMillis(0L, 93, 93, 34, 93);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant is above the supported maximum of 1970-01-01T00:00:00.000Z (ISOChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }
}
