/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:06:55 GMT 2022
 */

package org.joda.time.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.convert.ReadablePeriodConverter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReadablePeriodConverter_ESTest extends ReadablePeriodConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReadablePeriodConverter readablePeriodConverter0 = ReadablePeriodConverter.INSTANCE;
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2496), (-2496), 0, 0, (-2021), (-1), (-3773), 1282);
      // Undeclared exception!
      try { 
        readablePeriodConverter0.setInto((ReadWritablePeriod) null, mutablePeriod0, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadablePeriodConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReadablePeriodConverter readablePeriodConverter0 = ReadablePeriodConverter.INSTANCE;
      DateTime dateTime0 = new DateTime(30617280288L);
      Hours hours0 = Hours.hoursBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(julianChronology0, dateTimeZone0);
      StrictChronology strictChronology0 = StrictChronology.getInstance(zonedChronology0);
      Minutes minutes0 = hours0.toStandardMinutes();
      PeriodType periodType0 = readablePeriodConverter0.getPeriodType(minutes0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1453L), 0, periodType0, strictChronology0);
      Hours hours1 = Hours.FOUR;
      // Undeclared exception!
      try { 
        readablePeriodConverter0.setInto(mutablePeriod0, hours1, strictChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ReadablePeriodConverter readablePeriodConverter0 = new ReadablePeriodConverter();
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        readablePeriodConverter0.setInto(mutablePeriod0, "g%ODvc;$M(\"1L", copticChronology0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.joda.time.ReadablePeriod
         //
         verifyException("org.joda.time.convert.ReadablePeriodConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReadablePeriodConverter readablePeriodConverter0 = ReadablePeriodConverter.INSTANCE;
      // Undeclared exception!
      try { 
        readablePeriodConverter0.getPeriodType((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadablePeriodConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ReadablePeriodConverter readablePeriodConverter0 = new ReadablePeriodConverter();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        readablePeriodConverter0.getPeriodType(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.joda.time.ReadablePeriod
         //
         verifyException("org.joda.time.convert.ReadablePeriodConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ReadablePeriodConverter readablePeriodConverter0 = new ReadablePeriodConverter();
      Class<?> class0 = readablePeriodConverter0.getSupportedType();
      assertFalse(class0.isArray());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ReadablePeriodConverter readablePeriodConverter0 = ReadablePeriodConverter.INSTANCE;
      DateTime dateTime0 = new DateTime(30617280288L);
      Hours hours0 = Hours.hoursBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(julianChronology0, dateTimeZone0);
      StrictChronology strictChronology0 = StrictChronology.getInstance(zonedChronology0);
      Minutes minutes0 = hours0.toStandardMinutes();
      PeriodType periodType0 = readablePeriodConverter0.getPeriodType(minutes0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1453L), 0, periodType0, strictChronology0);
      readablePeriodConverter0.setInto(mutablePeriod0, hours0, strictChronology0);
      assertEquals(1, hours0.size());
  }
}