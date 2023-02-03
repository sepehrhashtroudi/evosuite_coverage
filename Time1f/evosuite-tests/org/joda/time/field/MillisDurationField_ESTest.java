/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:15:39 GMT 2022
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.UnsupportedDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MillisDurationField_ESTest extends MillisDurationField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getValueAsLong(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getValueAsLong((-1115L), (-1115L));
      assertEquals((-1115L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getValueAsLong(484L);
      assertEquals(484L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getValueAsLong((-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getValue(0L, 0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getValue((-1115L), 0L);
      assertEquals((-1115), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getValue(203L);
      assertEquals(203, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getValue((-842L));
      assertEquals((-842), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis(0L, (-1382L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis(1000000000000000000L, 7L);
      assertEquals(1000000000000000000L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis(2059L);
      assertEquals(2059L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis((-251L));
      assertEquals((-251L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis(0, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis(292272992, (long) 292272992);
      assertEquals(292272992L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis(2932);
      assertEquals(2932L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getDifferenceAsLong(2484L, 1L);
      assertEquals(2483L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getDifferenceAsLong(0L, 1213L);
      assertEquals((-1213L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getDifference(1L, 0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getDifference((-2217L), (-1419L));
      assertEquals((-798), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.add(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.add((-3926L), (-274L));
      assertEquals((-4200L), long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.add((long) 0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.add((-5175L), (-3286));
      assertEquals((-8461L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      // Undeclared exception!
      try { 
        millisDurationField0.getValue(9999998257L, 0L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 9999998257
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      // Undeclared exception!
      try { 
        millisDurationField0.getValue(31622400000L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 31622400000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      // Undeclared exception!
      try { 
        millisDurationField0.getDifference((-1L), 26607895200000L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -26607895200001
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      // Undeclared exception!
      try { 
        millisDurationField0.compareTo((DurationField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.MillisDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getUnitMillis();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      boolean boolean0 = millisDurationField0.equals(millisDurationField0);
      assertEquals(1L, millisDurationField0.getUnitMillis());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      boolean boolean0 = millisDurationField0.equals(buddhistChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      int int0 = millisDurationField0.compareTo((DurationField) unsupportedDurationField0);
      assertEquals(1, int0);
      assertEquals(1L, millisDurationField0.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.weeks();
      int int0 = millisDurationField0.compareTo(durationField0);
      assertEquals((-1), int0);
      assertTrue(millisDurationField0.isSupported());
      assertEquals(1L, millisDurationField0.getUnitMillis());
      assertTrue(millisDurationField0.isPrecise());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      String string0 = millisDurationField0.getName();
      assertEquals("millis", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis((-162));
      assertEquals((-162L), long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis((-162), (long) 2059);
      assertEquals((-162L), long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis((-6L), (-6L));
      assertEquals((-6L), long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      millisDurationField0.hashCode();
      assertEquals(1L, millisDurationField0.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getDifferenceAsLong(0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.add((-1L), 950L);
      assertEquals(949L, long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      boolean boolean0 = millisDurationField0.isPrecise();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.add(2221L, (-162));
      assertEquals(2059L, long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getValueAsLong((long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.compareTo((DurationField) millisDurationField0);
      assertEquals(0, int0);
      assertEquals(1L, millisDurationField0.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      boolean boolean0 = millisDurationField0.isSupported();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getValue(2059L, 2221L);
      assertEquals(2059, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      Integer integer0 = new Integer(0);
      int int0 = millisDurationField0.getValue((long) integer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      String string0 = millisDurationField0.toString();
      assertEquals("DurationField[millis]", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getDifference(1L, 1L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getValueAsLong((long) 2059, 2059L);
      assertEquals(2059L, long0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DurationFieldType durationFieldType0 = millisDurationField0.getType();
      assertEquals("millis", durationFieldType0.toString());
  }
}
