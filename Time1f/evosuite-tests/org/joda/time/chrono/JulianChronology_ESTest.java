/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:29:45 GMT 2022
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JulianChronology_ESTest extends JulianChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      julianChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      Chronology chronology0 = julianChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, julianChronology0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2403));
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      boolean boolean0 = julianChronology0.isLeapYear((-3043));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      int int0 = julianChronology0.getMinYear();
      assertEquals((-292269054), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null, 2);
      long long0 = julianChronology0.getDateMidnightMillis(2, 2, 2);
      assertEquals((-62101468800000L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      long long0 = julianChronology0.getAverageMillisPerYearDividedByTwo();
      assertEquals(15778800000L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4144);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      long long0 = julianChronology0.getAverageMillisPerMonth();
      assertEquals(2629800000L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      long long0 = julianChronology0.calculateFirstDayOfYearMillis(4218);
      assertEquals(70942608000000L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = JulianChronology.adjustYearForSet((-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = JulianChronology.adjustYearForSet(4);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        julianChronology0.assemble((AssembledChronology.Fields) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JulianChronology julianChronology0 = null;
      try {
        julianChronology0 = new JulianChronology((Chronology) null, (Object) null, 1647);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 1647
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      JulianChronology julianChronology0 = new JulianChronology(islamicChronology0, islamicChronology0, 1);
      int int0 = julianChronology0.getDayOfYear(1);
      assertEquals(353, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      JulianChronology julianChronology0 = new JulianChronology(islamicChronology0, islamicChronology0, 1);
      long long0 = julianChronology0.getAverageMillisPerYear();
      assertEquals(31557600000L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      long long0 = julianChronology0.calculateFirstDayOfYearMillis(1761);
      assertEquals((-6594393600000L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4144);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      boolean boolean0 = julianChronology0.isLeapYear(4144);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Chronology chronology0 = julianChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, julianChronology0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      // Undeclared exception!
      try { 
        JulianChronology.getInstance(dateTimeZone0, 1323);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 1323
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null, 2);
      long long0 = julianChronology0.getApproxMillisAtEpochDividedByTwo();
      assertEquals(31083663600000L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        JulianChronology.adjustYearForSet(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for year is not supported
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = JulianChronology.adjustYearForSet((-292269054));
      assertEquals((-292269053), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      try { 
        julianChronology0.getDateMidnightMillis(6, (-2339), (-2339));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2339 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4144);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      Chronology chronology0 = julianChronology0.withUTC();
      assertFalse(chronology0.equals((Object)julianChronology0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Chronology chronology0 = julianChronology0.withZone(fixedDateTimeZone0);
      assertNotSame(chronology0, julianChronology0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4144);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      int int0 = julianChronology0.getMaxYear();
      assertEquals(292272992, int0);
  }
}
