/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 02:17:44 GMT 2022
 */

package org.joda.time;

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
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.ScaledDurationField;
import org.joda.time.field.UnsupportedDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DurationField_ESTest extends DurationField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      String string0 = millisDurationField0.toString();
      assertEquals("DurationField[millis]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.subtract(604800L, 604800L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.subtract(0L, 1060L);
      assertEquals((-1060L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.subtract(0L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      boolean boolean0 = millisDurationField0.isSupported();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.centuryOfEra();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, 1);
      DurationField durationField0 = offsetDateTimeField0.getRangeDurationField();
      boolean boolean0 = durationField0.isSupported();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.hours();
      boolean boolean0 = durationField0.isPrecise();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.weeks();
      boolean boolean0 = durationField0.isPrecise();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.halfdays();
      long long0 = durationField0.getValueAsLong((-1762L), (-1762L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getValueAsLong(569L, (-478L));
      assertEquals(569L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getValueAsLong((long) (-1), 816L);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.hours();
      long long0 = durationField0.getValueAsLong((long) 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.MINUTES_TYPE;
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1);
      long long0 = preciseDurationField0.getValueAsLong((long) 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getValueAsLong((long) (-1855));
      assertEquals((-1855L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.weekyears();
      int int0 = durationField0.getValue(31556952000L, (long) 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getValue(1239L, 1239L);
      assertEquals(1239, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getValue((-955L), 0L);
      assertEquals((-955), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getValue(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getValue(569L);
      assertEquals(569, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getValue((-1475L));
      assertEquals((-1475), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      long long0 = unsupportedDurationField0.getUnitMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getUnitMillis();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DurationFieldType durationFieldType0 = millisDurationField0.getType();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-2732L));
      long long0 = preciseDurationField0.getUnitMillis();
      assertEquals((-2732L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DurationFieldType durationFieldType0 = millisDurationField0.getType();
      assertEquals("millis", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-2172L));
      String string0 = preciseDurationField0.getName();
      assertEquals("millis", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.millis();
      long long0 = durationField0.getMillis(0L, (-2055L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.millis();
      long long0 = durationField0.getMillis(3377L, (long) 1);
      assertEquals(3377L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.weeks();
      long long0 = durationField0.getMillis((-1532L), (long) 1);
      assertEquals((-926553600000L), long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis(834L);
      assertEquals(834L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis((-1456L));
      assertEquals((-1456L), long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis(0, 1526L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis(533, 86400000L);
      assertEquals(533L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.weeks();
      long long0 = durationField0.getMillis((-1360), (long) 1226);
      assertEquals((-822528000000L), long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-272));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.seconds();
      Hours hours0 = Hours.FOUR;
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, (-272));
      long long0 = scaledDurationField0.getMillis(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.weekyears();
      long long0 = durationField0.getMillis(1);
      assertEquals(31556952000L, long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis((-1623));
      assertEquals((-1623L), long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.hours();
      long long0 = durationField0.getDifferenceAsLong(0L, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getDifferenceAsLong(308L, (-1L));
      assertEquals(309L, long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getDifferenceAsLong((-1L), 0L);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.hours();
      int int0 = durationField0.getDifference(1, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getDifference(0L, (-721L));
      assertEquals(721, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getDifference((-1055L), 10000L);
      assertEquals((-11055), int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.add(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 546L);
      long long0 = preciseDurationField0.add((-1L), 546L);
      assertEquals(298115L, long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.weekyears();
      long long0 = durationField0.add((long) 1, (-1671L));
      assertEquals((-52731300367999L), long0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.add(10800000L, 778);
      assertEquals(10800778L, long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 546L);
      long long0 = preciseDurationField0.add(546L, (-1901));
      assertEquals((-1037400L), long0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.subtract(0L, 1953L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // millis field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      DurationField durationField0 = durationFieldType0.getField((Chronology) null);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, (-2706));
      // Undeclared exception!
      try { 
        scaledDurationField0.subtract((-1204L), (-2706));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -732241631 for year must be in the range [-292275054,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.subtract((long) 1, 1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // hours field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      // Undeclared exception!
      try { 
        millisDurationField0.subtract((-9223372036854775808L), 91);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -9223372036854775808 + -91
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0L);
      // Undeclared exception!
      try { 
        preciseDurationField0.getValueAsLong(0L, 0L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.PreciseDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      // Undeclared exception!
      try { 
        millisDurationField0.getValue((-9223372036854775808L), (-934L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -9223372036854775808
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.getValue(2147483647L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // millis field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      // Undeclared exception!
      try { 
        millisDurationField0.getValue(30672000000L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 30672000000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.eras();
      // Undeclared exception!
      try { 
        durationField0.getMillis((-1968L), 0L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.getMillis(0, (-736L));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // millis field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.getDifferenceAsLong(0L, 812L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // months field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.minutes();
      // Undeclared exception!
      try { 
        durationField0.getDifference(0L, (-13300230668400000L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The subtrahend instant is below the supported minimum of 0001-01-01T00:00:00.000Z (BuddhistChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      // Undeclared exception!
      try { 
        millisDurationField0.getDifference(1, 31556952000L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -31556951999
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.years();
      // Undeclared exception!
      try { 
        durationField0.add(180L, 1209600000L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1209601969 for year must be in the range [-292275054,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Years years0 = Years.TWO;
      DurationFieldType durationFieldType0 = years0.getFieldType();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.add((long) (byte) (-19), (-2135));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // years field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.hours();
      long long0 = durationField0.subtract((long) 1, (-4574L));
      assertEquals(16466400001L, long0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.subtract(0L, Integer.MIN_VALUE);
      assertEquals(2147483648L, long0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.minutes();
      long long0 = durationField0.subtract((long) (-321), 1);
      assertEquals((-60321L), long0);
  }
}