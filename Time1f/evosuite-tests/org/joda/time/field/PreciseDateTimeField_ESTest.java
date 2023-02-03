/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:34:51 GMT 2022
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PreciseDateTimeField_ESTest extends PreciseDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((long) 1, (Chronology) buddhistChronology0);
      LocalTime localTime1 = localTime0.minusMillis(1);
      assertFalse(localTime1.equals((Object)localTime0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.halfdays();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.set(1129L, 24);
      assertEquals(24129L, long0);
      assertEquals(43199, preciseDateTimeField0.getMaximumValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.millis();
      DurationField durationField1 = buddhistChronology0.halfdays();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.set((-82738001L), 1);
      assertEquals(43199999, preciseDateTimeField0.getMaximumValue());
      assertEquals((-86399999L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.halfdays();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      int int0 = preciseDateTimeField0.get(1);
      assertEquals(0, int0);
      assertEquals(43199, preciseDateTimeField0.getMaximumValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.millis();
      DurationField durationField1 = buddhistChronology0.halfdays();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.addWrapField((-86399999L), 1);
      assertEquals(43199999, preciseDateTimeField0.getMaximumValue());
      assertEquals((-86399998L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      PreciseDateTimeField preciseDateTimeField0 = null;
      try {
        preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, (DurationField) null, unsupportedDurationField0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.halfdays();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      int int0 = preciseDateTimeField0.get(43052001L);
      assertEquals(43052, int0);
      assertEquals(43199, preciseDateTimeField0.getMaximumValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.halfdays();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      int int0 = preciseDateTimeField0.getMaximumValue();
      assertEquals(43199, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.halfdays();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      int int0 = preciseDateTimeField0.get((-1409L));
      assertEquals(43198, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      PreciseDateTimeField preciseDateTimeField0 = null;
      try {
        preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, millisDurationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The effective range must be at least 2
         //
         verifyException("org.joda.time.field.PreciseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DurationField durationField0 = buddhistChronology0.centuries();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      PreciseDateTimeField preciseDateTimeField0 = null;
      try {
        preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, millisDurationField0, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range duration field must be precise
         //
         verifyException("org.joda.time.field.PreciseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.halfdays();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.addWrapField((long) 1, (-148));
      assertEquals(43199, preciseDateTimeField0.getMaximumValue());
      assertEquals(43052001L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.halfdays();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      int int0 = preciseDateTimeField0.getRange();
      assertEquals(43200, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.halfdays();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      preciseDateTimeField0.getRangeDurationField();
      assertEquals(43200, preciseDateTimeField0.getRange());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.halfdays();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      // Undeclared exception!
      try { 
        preciseDateTimeField0.set(100L, (-148));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -148 for dayOfYear must be in the range [0,43199]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
