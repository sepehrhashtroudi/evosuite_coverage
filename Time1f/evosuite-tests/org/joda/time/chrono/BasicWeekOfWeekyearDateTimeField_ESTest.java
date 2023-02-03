/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:22:50 GMT 2022
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BasicChronology;
import org.joda.time.chrono.BasicDayOfYearDateTimeField;
import org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField;
import org.joda.time.chrono.BasicWeekyearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicWeekOfWeekyearDateTimeField_ESTest extends BasicWeekOfWeekyearDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.minutes();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(copticChronology0, durationField0);
      int int0 = basicWeekOfWeekyearDateTimeField0.getMaximumValueForSet(30, 52);
      assertEquals(52, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = new IslamicChronology(gregorianChronology0, gregorianChronology0, islamicChronology_LeapYearPatternType0);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0, 1);
      DurationField durationField0 = copticChronology0.seconds();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(islamicChronology0, durationField0);
      long long0 = basicWeekOfWeekyearDateTimeField0.roundFloor(53);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 455L);
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, preciseDurationField0);
      long long0 = basicWeekOfWeekyearDateTimeField0.roundFloor(17L);
      assertEquals((-150L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.hours();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(copticChronology0, durationField0);
      long long0 = basicWeekOfWeekyearDateTimeField0.roundCeiling((-2845L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 455L);
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, preciseDurationField0);
      long long0 = basicWeekOfWeekyearDateTimeField0.roundCeiling((-150L));
      assertEquals((-150L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 455L);
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, preciseDurationField0);
      long long0 = basicWeekOfWeekyearDateTimeField0.remainder(34);
      assertEquals(184L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = copticChronology0.minutes();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(gregorianChronology0, durationField0);
      DurationField durationField1 = basicWeekOfWeekyearDateTimeField0.getRangeDurationField();
      assertNotNull(durationField1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 455L);
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, preciseDurationField0);
      // Undeclared exception!
      try { 
        basicWeekOfWeekyearDateTimeField0.getMaximumValueForSet((-1593L), 209);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, millisDurationField0);
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        basicWeekOfWeekyearDateTimeField0.getMaximumValue((ReadablePartial) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1);
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(ethiopicChronology0, preciseDurationField0);
      // Undeclared exception!
      try { 
        basicWeekOfWeekyearDateTimeField0.getMaximumValue((ReadablePartial) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, millisDurationField0);
      // Undeclared exception!
      try { 
        basicWeekOfWeekyearDateTimeField0.getMaximumValue(1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 455L);
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, preciseDurationField0);
      // Undeclared exception!
      try { 
        basicWeekOfWeekyearDateTimeField0.get(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = null;
      try {
        basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(copticChronology0, (DurationField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, millisDurationField0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(basicDayOfYearDateTimeField0, dateTimeFieldType0, (-4040));
      DurationField durationField0 = offsetDateTimeField0.getRangeDurationField();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = null;
      try {
        basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(copticChronology0, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unit duration field must be precise
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DurationField durationField0 = copticChronology0.days();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(islamicChronology0, durationField0);
      int int0 = basicWeekOfWeekyearDateTimeField0.getMaximumValue((-2133L));
      assertEquals(51, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.hours();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(copticChronology0, durationField0);
      int int0 = basicWeekOfWeekyearDateTimeField0.get(1);
      assertEquals(17, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(julianChronology0);
      DurationField durationField0 = basicWeekyearDateTimeField0.getLeapDurationField();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(copticChronology0, durationField0);
      int int0 = basicWeekOfWeekyearDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(copticChronology0, millisDurationField0);
      Partial partial0 = new Partial(copticChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial1 = partial0.with(dateTimeFieldType0, 1);
      // Undeclared exception!
      try { 
        basicWeekOfWeekyearDateTimeField0.addWrapPartial(partial1, (-565), (int[]) null, 1922);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.hours();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(copticChronology0, durationField0);
      LocalDateTime localDateTime0 = new LocalDateTime(999L, (Chronology) copticChronology0);
      int[] intArray0 = new int[6];
      int int0 = basicWeekOfWeekyearDateTimeField0.getMaximumValue((ReadablePartial) localDateTime0, intArray0);
      assertEquals(53, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.hours();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(copticChronology0, durationField0);
      LocalDateTime localDateTime0 = new LocalDateTime(999L, (Chronology) copticChronology0);
      int int0 = basicWeekOfWeekyearDateTimeField0.getMaximumValue((ReadablePartial) localDateTime0);
      assertEquals(53, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 455L);
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, preciseDurationField0);
      LocalTime localTime0 = new LocalTime((-150L));
      int int0 = basicWeekOfWeekyearDateTimeField0.getMaximumValue((ReadablePartial) localTime0);
      assertEquals(53, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 455L);
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, preciseDurationField0);
      int int0 = basicWeekOfWeekyearDateTimeField0.getMaximumValue();
      assertEquals(53, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime(999L, (Chronology) copticChronology0);
      LocalDateTime localDateTime1 = localDateTime0.withWeekOfWeekyear(1);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 455L);
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, preciseDurationField0);
      long long0 = basicWeekOfWeekyearDateTimeField0.roundCeiling(207025L);
      assertEquals(207330L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 455L);
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, preciseDurationField0);
      long long0 = basicWeekOfWeekyearDateTimeField0.roundFloor(455L);
      assertEquals(305L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 455L);
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, preciseDurationField0);
      long long0 = basicWeekOfWeekyearDateTimeField0.remainder(305L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 455L);
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, preciseDurationField0);
      // Undeclared exception!
      try { 
        basicWeekOfWeekyearDateTimeField0.getRangeDurationField();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", e);
      }
  }
}
