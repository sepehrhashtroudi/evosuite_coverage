/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:32:37 GMT 2022
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 0, 0, 0, 0, (-2052), (-2052), 0);
      int[] intArray0 = gJChronology0.get((ReadablePeriod) mutablePeriod0, (long) (-2052), (-12219292800000L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertArrayEquals(new int[] {(-387), (-2), (-2), (-2), (-23), (-59), (-57), (-948)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone0, (-62101441567998L), 2);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(2, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.gregorianToJulianByYear(3276L);
      assertEquals(1123203276L, long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.gregorianToJulianByYear((-12219292801043L));
      assertEquals((-12218428801043L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      gJChronology0.getGregorianCutover();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        gJChronology0.assemble((AssembledChronology.Fields) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      try { 
        gJChronology0.getDateTimeMillis(91, 12, (-1442), (-2284), 0, 512, 512);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2284 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      try { 
        gJChronology0.getDateTimeMillis(4597, 2880, (-1750), 10125000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2880 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone(dateTimeZone0);
      assertNotSame(gJChronology1, gJChronology0);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone(dateTimeZone0);
      assertEquals(1, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      int[] intArray0 = gJChronology0.get((ReadablePartial) monthDay0, 0L);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertArrayEquals(new int[] {1, 1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null, (-1931));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -1931
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      // Undeclared exception!
      try { 
        GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 0
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      int int0 = gJChronology0.getMinimumDaysInFirstWeek();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis(0, (-2098), 63, 63);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2098 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      try { 
        gJChronology0.getDateTimeMillis(1L, 0, 0, 14, (-651));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -651 for millisOfSecond must be in the range [0,999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      gJChronology0.assemble(assembledChronology_Fields0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Instant instant0 = Instant.now();
      DateTimeZone dateTimeZone0 = instant0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, 0L, 1);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[UTC,cutover=1970-01-01,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[America/Edmonton,cutover=1970-01-01T00:00:00.001Z,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      GJChronology gJChronology1 = GJChronology.getInstance();
      boolean boolean0 = gJChronology0.equals(gJChronology1);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      boolean boolean0 = gJChronology0.equals(gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      boolean boolean0 = gJChronology0.equals((Object) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (-2656L), 1);
      long long0 = gJChronology0.getDateTimeMillis(1, 1, 1, 1, 1, 13, 409);
      assertEquals((-62135738694591L), long0);
      assertEquals(1, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0, 1);
      try { 
        gJChronology0.getDateTimeMillis(0, 0, 1, 1, 1, 1, (-958));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -958 for millisOfSecond must be in the range [0,999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(2, 2, 2, 2);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-62101441567998L), long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withUTC();
      assertNotSame(gJChronology1, gJChronology0);
      assertEquals(1, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1645L);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0);
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone((DateTimeZone) null);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, (-12219292800000L), 649);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 649
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 0, 0, 0, 0, (-2052), (-2052), 0);
      int[] intArray0 = gJChronology0.get((ReadablePeriod) mutablePeriod0, (long) (-2052), (long) 0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 2, 52}, intArray0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      gJChronology0.hashCode();
      assertEquals(1, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      long long0 = gJChronology0.julianToGregorianByYear((-815L));
      assertEquals(1, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-1123200815L), long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.gregorianToJulianByWeekyear(2346L);
      assertEquals(1209602346L, long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      Instant instant0 = gJChronology0.getGregorianCutover();
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      assertEquals(1, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(1L, instant0.getMillis());
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.julianToGregorianByWeekyear(1821L);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-1209598179L), long0);
  }
}
