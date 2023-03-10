/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:34:53 GMT 2022
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LenientChronology_ESTest extends LenientChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      lenientChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      DateTimeZone dateTimeZone0 = lenientChronology0.getZone();
      Chronology chronology0 = lenientChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, lenientChronology0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Instant instant0 = new Instant((-4227L));
      Chronology chronology0 = instant0.getChronology();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(chronology0);
      // Undeclared exception!
      try { 
        lenientChronology0.assemble((AssembledChronology.Fields) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.LenientChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("MPcai");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(zonedChronology0);
      Chronology chronology0 = lenientChronology0.withUTC();
      assertSame(chronology0, lenientChronology0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      boolean boolean0 = lenientChronology0.equals("LenientChronology[GJChronology[UTC]]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) null);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      boolean boolean0 = lenientChronology0.equals(lenientChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) null);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      LenientChronology lenientChronology1 = LenientChronology.getInstance(lenientChronology0);
      boolean boolean0 = lenientChronology0.equals(lenientChronology1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) null);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 37);
      Chronology chronology0 = lenientChronology0.withZone(dateTimeZone0);
      assertFalse(chronology0.equals((Object)lenientChronology0));
      assertNotSame(chronology0, lenientChronology0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) null);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      Chronology chronology0 = lenientChronology0.withZone((DateTimeZone) null);
      //  // Unstable assertion: assertNotSame(chronology0, lenientChronology0);
      //  // Unstable assertion: assertTrue(chronology0.equals((Object)lenientChronology0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Chronology chronology0 = lenientChronology0.withUTC();
      Chronology chronology1 = chronology0.withZone(fixedDateTimeZone0);
      assertSame(chronology1, chronology0);
      assertNotSame(chronology1, lenientChronology0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) null);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      LocalDateTime localDateTime0 = new LocalDateTime(0, 0, 0, 0, 37, (-493), 0, lenientChronology0);
      Chronology chronology0 = lenientChronology0.withUTC();
      assertNotSame(chronology0, lenientChronology0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        LenientChronology.getInstance((Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply a chronology
         //
         verifyException("org.joda.time.chrono.LenientChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      String string0 = lenientChronology0.toString();
      assertEquals("LenientChronology[ISOChronology[America/Edmonton]]", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) null);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      lenientChronology0.hashCode();
  }
}
