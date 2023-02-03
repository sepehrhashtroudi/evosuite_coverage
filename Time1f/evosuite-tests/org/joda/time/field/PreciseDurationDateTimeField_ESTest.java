/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:22:49 GMT 2022
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PreciseDurationDateTimeField_ESTest extends PreciseDurationDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.minutes();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, durationField0);
      long long0 = preciseDateTimeField0.roundCeiling(2849L);
      assertEquals(2849L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      LocalDate localDate0 = LocalDate.parse("", dateTimeFormatter0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.minutes();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, durationField0);
      long long0 = preciseDateTimeField0.set((long) 1, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.minutes();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, durationField0);
      preciseDateTimeField0.set(1L, 1);
      assertEquals(0, preciseDateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.minutes();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, durationField0);
      preciseDateTimeField0.set((-361L), 1);
      assertEquals(0, preciseDateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.minutes();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, durationField0);
      long long0 = preciseDateTimeField0.roundCeiling((-361L));
      assertEquals((-361L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.minutes();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, durationField0);
      int int0 = preciseDateTimeField0.getMaximumValueForSet(1, 1);
      assertEquals(59999, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.minutes();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, durationField0);
      // Undeclared exception!
      try { 
        preciseDateTimeField0.set((-1455L), 2147483623);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2147483623 for dayOfWeek must be in the range [0,59999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.minutes();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, durationField0);
      long long0 = preciseDateTimeField0.roundFloor(1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.minutes();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, durationField0);
      DurationField durationField1 = preciseDateTimeField0.getDurationField();
      assertEquals("DurationField[millis]", durationField1.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.minutes();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, durationField0);
      long long0 = preciseDateTimeField0.getUnitMillis();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.minutes();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      int int0 = preciseDateTimeField0.getMinimumValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.minutes();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, durationField0);
      boolean boolean0 = preciseDateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.minutes();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, durationField0);
      long long0 = preciseDateTimeField0.remainder(185L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.minutes();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, durationField0);
      long long0 = preciseDateTimeField0.remainder((-366L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.minutes();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, durationField0);
      long long0 = preciseDateTimeField0.roundCeiling(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.minutes();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, durationField0);
      long long0 = preciseDateTimeField0.roundFloor((-2894L));
      assertEquals((-2894L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.eras();
      PreciseDateTimeField preciseDateTimeField0 = null;
      try {
        preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The unit milliseconds must be at least 1
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.years();
      PreciseDateTimeField preciseDateTimeField0 = null;
      try {
        preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unit duration field must be precise
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }
}
