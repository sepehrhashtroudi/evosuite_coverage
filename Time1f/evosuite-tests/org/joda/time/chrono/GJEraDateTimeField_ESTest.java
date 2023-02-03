/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:42:34 GMT 2022
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.chrono.BasicChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GJEraDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GJEraDateTimeField_ESTest extends GJEraDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(gregorianChronology0);
      String string0 = gJEraDateTimeField0.getAsText((-62167219200000L));
      assertEquals("BC", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(copticChronology0);
      long long0 = gJEraDateTimeField0.set(0L, "AD", (Locale) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(copticChronology0);
      long long0 = gJEraDateTimeField0.set((-495L), "AD", (Locale) null);
      assertEquals((-495L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      long long0 = gJEraDateTimeField0.set((long) 0, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(912);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      Locale locale0 = Locale.CHINESE;
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(buddhistChronology0, dateTimeZone0, islamicChronology_LeapYearPatternType0);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      String string0 = gJEraDateTimeField0.getAsText(1, locale0);
      assertEquals("\u516C\u5143", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(copticChronology0);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.set((long) 7, "|R*SW_?Y`Y8[", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"|R*SW_?Y`Y8[\" for era is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(ethiopicChronology0);
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.set((-2247L), (String) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(copticChronology0);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.set((long) 1, (-17));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -17 for era must be in the range [0,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField((BasicChronology) null);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.set(0L, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField((BasicChronology) null);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.roundHalfFloor((-720L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField((BasicChronology) null);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.roundHalfEven(504L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField((BasicChronology) null);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.roundHalfCeiling(9223372036854775807L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField((BasicChronology) null);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.roundFloor(112);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField((BasicChronology) null);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.roundCeiling(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(gJChronology0);
      IslamicChronology islamicChronology0 = new IslamicChronology(strictChronology0, "", (IslamicChronology.LeapYearPatternType) null);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.get(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(1, 1);
      IslamicChronology islamicChronology0 = new IslamicChronology(buddhistChronology0, buddhistChronology0, islamicChronology_LeapYearPatternType0);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      long long0 = gJEraDateTimeField0.roundFloor(1);
      assertEquals((-42496531200000L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(ethiopicChronology0);
      long long0 = gJEraDateTimeField0.roundFloor((-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(copticChronology0);
      long long0 = gJEraDateTimeField0.set((long) 7, 0);
      assertEquals((-106412227199993L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(copticChronology0);
      long long0 = gJEraDateTimeField0.set((long) 1, 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(912);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(buddhistChronology0, dateTimeZone0, islamicChronology_LeapYearPatternType0);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      int int0 = gJEraDateTimeField0.get(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(ethiopicChronology0);
      int int0 = gJEraDateTimeField0.get((-9223372036854775808L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(gregorianChronology0);
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.getAsText(55, locale0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 55
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(copticChronology0);
      long long0 = gJEraDateTimeField0.roundCeiling((-106412227199999L));
      assertEquals((-53174534400000L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(ethiopicChronology0);
      long long0 = gJEraDateTimeField0.roundCeiling(1);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(1, 1);
      IslamicChronology islamicChronology0 = new IslamicChronology(buddhistChronology0, buddhistChronology0, islamicChronology_LeapYearPatternType0);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.set((-9223372036854775808L), "\u516C\u5143", locale0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -301245869 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(gregorianChronology0);
      DurationField durationField0 = gJEraDateTimeField0.getRangeDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(1, 1);
      IslamicChronology islamicChronology0 = new IslamicChronology(buddhistChronology0, buddhistChronology0, islamicChronology_LeapYearPatternType0);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      long long0 = gJEraDateTimeField0.roundHalfCeiling((-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(1, 1);
      IslamicChronology islamicChronology0 = new IslamicChronology(buddhistChronology0, buddhistChronology0, islamicChronology_LeapYearPatternType0);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      Locale locale0 = Locale.PRC;
      long long0 = gJEraDateTimeField0.set((long) 3, "\u516C\u5143", locale0);
      assertEquals(3L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(1, 1);
      IslamicChronology islamicChronology0 = new IslamicChronology(buddhistChronology0, buddhistChronology0, islamicChronology_LeapYearPatternType0);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      DurationField durationField0 = gJEraDateTimeField0.getDurationField();
      assertTrue(durationField0.isPrecise());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(1, 1);
      IslamicChronology islamicChronology0 = new IslamicChronology(buddhistChronology0, buddhistChronology0, islamicChronology_LeapYearPatternType0);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      int int0 = gJEraDateTimeField0.getMinimumValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(1, 1);
      IslamicChronology islamicChronology0 = new IslamicChronology(buddhistChronology0, buddhistChronology0, islamicChronology_LeapYearPatternType0);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      int int0 = gJEraDateTimeField0.getMaximumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(copticChronology0);
      long long0 = gJEraDateTimeField0.roundHalfEven((-486L));
      assertEquals((-53174534400000L), long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(1, 1);
      IslamicChronology islamicChronology0 = new IslamicChronology(buddhistChronology0, buddhistChronology0, islamicChronology_LeapYearPatternType0);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      Locale locale0 = Locale.PRC;
      int int0 = gJEraDateTimeField0.getMaximumTextLength(locale0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(copticChronology0);
      boolean boolean0 = gJEraDateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(copticChronology0);
      long long0 = gJEraDateTimeField0.roundHalfFloor(1);
      assertEquals((-53174534400000L), long0);
  }
}