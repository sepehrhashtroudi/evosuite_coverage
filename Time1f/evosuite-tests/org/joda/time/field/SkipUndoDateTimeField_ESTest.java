/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:23:45 GMT 2022
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.SkipDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SkipUndoDateTimeField_ESTest extends SkipUndoDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField((Chronology) null, dateTimeField0);
      int int0 = skipUndoDateTimeField0.get(59);
      assertEquals(0, skipUndoDateTimeField0.getMinimumValue());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField(islamicChronology0, dateTimeField0, 1);
      long long0 = skipUndoDateTimeField0.set((long) 0, 1);
      assertEquals(1, skipUndoDateTimeField0.getMinimumValue());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, (-849), 1, 0);
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField(gJChronology0, offsetDateTimeField0, (-1402));
      int int0 = skipUndoDateTimeField0.get((-962L));
      assertEquals((-848), int0);
      assertEquals(1, skipUndoDateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField(buddhistChronology0, dateTimeField0, 1);
      // Undeclared exception!
      try { 
        skipUndoDateTimeField0.set(121L, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for weekOfWeekyear must be in the range [1,52]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DurationField durationField0 = buddhistChronology0.millis();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      SkipUndoDateTimeField skipUndoDateTimeField0 = null;
      try {
        skipUndoDateTimeField0 = new SkipUndoDateTimeField(buddhistChronology0, unsupportedDateTimeField0, (-66));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // weekOfWeekyear field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SkipUndoDateTimeField skipUndoDateTimeField0 = null;
      try {
        skipUndoDateTimeField0 = new SkipUndoDateTimeField((Chronology) null, (DateTimeField) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.joda.time.field.DelegatedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      SkipUndoDateTimeField skipUndoDateTimeField0 = null;
      try {
        skipUndoDateTimeField0 = new SkipUndoDateTimeField(julianChronology0, (DateTimeField) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.joda.time.field.DelegatedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField((Chronology) null, dateTimeField0, 1);
      int int0 = skipUndoDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDate localDate0 = LocalDate.now();
      DateTimeField dateTimeField0 = localDate0.getField(0);
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField(iSOChronology0, dateTimeField0);
      int int0 = skipUndoDateTimeField0.getMinimumValue();
      assertEquals((-292275053), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDate localDate0 = LocalDate.now();
      DateTimeField dateTimeField0 = localDate0.getField(0);
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField(iSOChronology0, dateTimeField0);
      long long0 = skipUndoDateTimeField0.set((long) 0, 0);
      assertEquals((-292275053), skipUndoDateTimeField0.getMinimumValue());
      assertEquals((-62198755200000L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField((Chronology) null, dateTimeField0);
      long long0 = skipUndoDateTimeField0.set(0L, 1);
      assertEquals(0, skipUndoDateTimeField0.getMinimumValue());
      assertEquals(1000L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDate localDate0 = LocalDate.now();
      DateTimeField dateTimeField0 = localDate0.getField(0);
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField(iSOChronology0, dateTimeField0);
      int int0 = skipUndoDateTimeField0.get((-62198755200000L));
      assertEquals(0, int0);
      assertEquals((-292275053), skipUndoDateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfHalfday();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(gJChronology0, dateTimeField0);
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField(gJChronology0, skipDateTimeField0, 0);
      int int0 = skipUndoDateTimeField0.getMinimumValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField(ethiopicChronology0, dateTimeField0, (-1031));
      int int0 = skipUndoDateTimeField0.get(0);
      assertEquals(60, int0);
      assertEquals(0, skipUndoDateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DurationField durationField0 = buddhistChronology0.minutes();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      SkipUndoDateTimeField skipUndoDateTimeField0 = null;
      try {
        skipUndoDateTimeField0 = new SkipUndoDateTimeField(buddhistChronology0, unsupportedDateTimeField0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // era field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDateTimeField", e);
      }
  }
}
