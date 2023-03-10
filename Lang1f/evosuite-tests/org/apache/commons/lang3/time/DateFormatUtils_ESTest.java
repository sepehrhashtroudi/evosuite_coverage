/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 21:19:02 GMT 2022
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class DateFormatUtils_ESTest extends DateFormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1062, 0, 0, (-1665), 3600000, 1);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      String string0 = DateFormatUtils.formatUTC(date0, "9&");
      assertEquals("9&", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = DateFormatUtils.formatUTC(0L, "'T'HH:mm:ssZZ");
      assertEquals("T00:00:00+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate(361L);
      TimeZone timeZone0 = TimeZone.getTimeZone("yyyy-MM-ddZZ");
      String string0 = DateFormatUtils.format((Date) mockDate0, "yyyy-MM-dd'T'HH:mm:ss", timeZone0);
      assertEquals("1970-01-01T00:00:00", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      String string0 = DateFormatUtils.format((Date) mockDate0, "yyyy-MM-ddZZ");
      assertEquals("2014-02-14+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1294), "E");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      Locale locale0 = Locale.ITALY;
      String string0 = DateFormatUtils.format((Calendar) mockGregorianCalendar0, "E", (TimeZone) simpleTimeZone0, locale0);
      assertEquals("ven", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      String string0 = DateFormatUtils.format(calendar0, "0:%(<|{{4<19700=", timeZone0);
      assertEquals("0:%(<|{{4<19700=", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      try { 
        DateFormatUtils.formatUTC((Date) null, "", locale0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        DateFormatUtils.formatUTC((Date) null, "0:%(<|{{4<19700=", locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-144), (-144), 0);
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try { 
        DateFormatUtils.formatUTC((Date) mockDate0, (String) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      try { 
        DateFormatUtils.formatUTC((Date) null, "&ItkgnVIa", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      // Undeclared exception!
      try { 
        DateFormatUtils.formatUTC((Date) mockDate0, "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Clock clock0 = MockClock.systemUTC();
      Instant instant0 = MockInstant.now(clock0);
      Date date0 = Date.from(instant0);
      // Undeclared exception!
      try { 
        DateFormatUtils.formatUTC(date0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1929L);
      // Undeclared exception!
      try { 
        DateFormatUtils.formatUTC((Date) mockDate0, "AG-C^N6eu7la?+$[");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        DateFormatUtils.formatUTC(1L, "", locale0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.UK;
      // Undeclared exception!
      try { 
        DateFormatUtils.formatUTC((-1L), (String) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        DateFormatUtils.formatUTC(1L, "ba0yRvKBR", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateFormatUtils.formatUTC((-415L), "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateFormatUtils.formatUTC(404L, "?3)Mb73");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1);
      Locale locale0 = Locale.CANADA;
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Date) mockDate0, "", (TimeZone) null, locale0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREAN;
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Date) null, "0:%(<|{{4<19700=", timeZone0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockDate mockDate0 = new MockDate(20, 0, 20);
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Date) mockDate0, (String) null, timeZone0, (Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
      Locale locale0 = Locale.KOREA;
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Date) null, "D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++\" ; gave up at index 83
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Date) mockDate0, "", timeZone0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockDate mockDate0 = new MockDate(39, 39, 39, 39, 39);
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Date) mockDate0, (String) null, (TimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-909), (-909), 0, 1356, 1356, 1356);
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Date) mockDate0, ".R8?}gq2b R2+/", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Date) mockDate0, "", locale0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Date) null, "HH:mm:ss", locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-3615), 0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        DateFormatUtils.format(date0, (String) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1815), (-1815), 0, 430, 0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        DateFormatUtils.format(date0, " locale does not support dates before 1868 AD)\nUnparseable date: \"", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockDate mockDate0 = new MockDate(39, 0, 0, 39, 0, 0);
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Date) mockDate0, "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-650L));
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Date) mockDate0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Date) mockDate0, "FastDateParser[");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2903, "0q#,4>P$x4)@P");
      Locale locale0 = Locale.GERMAN;
      // Undeclared exception!
      try { 
        DateFormatUtils.format(calendar0, "", (TimeZone) simpleTimeZone0, locale0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Calendar) null, "yyyy-MM-ddZZ", timeZone0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      TimeZone timeZone0 = TimeZone.getTimeZone("yyyy-MM-ddZZ");
      // Undeclared exception!
      try { 
        DateFormatUtils.format(calendar0, (String) null, timeZone0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(60, "");
      Locale locale0 = Locale.JAPAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0, locale0);
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Calendar) mockGregorianCalendar0, "", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-13), "HH:mm:ssZZ");
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Calendar) mockGregorianCalendar0, (String) null, (TimeZone) simpleTimeZone0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(5, "iej;&.JQ9:Y", 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Calendar) mockGregorianCalendar0, "iej;&.JQ9:Y", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      // Undeclared exception!
      try { 
        DateFormatUtils.format(calendar0, "", locale0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Calendar) null, "yyyy-MM-dd", locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      Locale locale0 = Locale.forLanguageTag("yyyy-MM-ddZZ");
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Calendar) mockGregorianCalendar0, (String) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1294), "E");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Calendar) mockGregorianCalendar0, "org.apache.commons.lang3.time.FastDatePrinter", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Calendar) mockGregorianCalendar0, "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Calendar) null, "yyyy-MM-dd'T'HH:mm:ss");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2845), (-2845), (-2845), (-2845), (-2845));
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Calendar) mockGregorianCalendar0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        DateFormatUtils.format(calendar0, ";b'ob");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        DateFormatUtils.format(125L, "", (TimeZone) null, locale0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      // Undeclared exception!
      try { 
        DateFormatUtils.format((-1985L), (String) null, (TimeZone) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINESE;
      // Undeclared exception!
      try { 
        DateFormatUtils.format((-3645L), "a{nqvv~74", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateFormatUtils.format(1L, "", (TimeZone) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateFormatUtils.format(1887L, (String) null, (TimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateFormatUtils.format(694L, "4ivxQ", (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateFormatUtils.format(1L, "", (Locale) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      // Undeclared exception!
      try { 
        DateFormatUtils.format(0L, (String) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      // Undeclared exception!
      try { 
        DateFormatUtils.format((-2633L), "GMT", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateFormatUtils.format((-608L), "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateFormatUtils.format(0L, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateFormatUtils.format(2490L, "o!XTW*b,A~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Clock clock0 = MockClock.systemUTC();
      Instant instant0 = MockInstant.now(clock0);
      Date date0 = Date.from(instant0);
      TimeZone timeZone0 = TimeZone.getTimeZone("HH:mm:ss");
      Locale locale0 = Locale.KOREA;
      String string0 = DateFormatUtils.format(date0, "HH:mm:ss", timeZone0, locale0);
      assertEquals("20:21:21", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1);
      Locale locale0 = Locale.GERMAN;
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Calendar) mockGregorianCalendar0, "\":#?3G!b2T", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-9), (-9), (-9));
      String string0 = DateFormatUtils.format((Calendar) mockGregorianCalendar0, "yyyy-MM-dd'T'HH:mm:ss");
      assertEquals("0011-03-22T00:00:00", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      String string0 = DateFormatUtils.formatUTC(0L, "0:%(<|{{4<19700=", locale0);
      assertEquals("0:%(<|{{4<19700=", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      MockDate mockDate0 = new MockDate(3600000, 3600000, 3600000, 3600000, 3600000);
      String string0 = DateFormatUtils.format((Date) mockDate0, "0:%(<|{{4<19700=", locale0);
      assertEquals("0:%(<|{{4<19700=", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DateFormatUtils dateFormatUtils0 = new DateFormatUtils();
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      String string0 = DateFormatUtils.format((long) 13, "0:%(<|{{4<19700=", timeZone0);
      assertEquals("0:%(<|{{4<19700=", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREAN;
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      String string0 = DateFormatUtils.format(calendar0, "0:%(<|{{4<19700=", locale0);
      assertEquals("0:%(<|{{4<19700=", string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Date) null, "yyyy-MM-dd'T'HH:mm:ss", (TimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String string0 = DateFormatUtils.format(0L, "0:%(<|{{4<19700=");
      assertEquals("0:%(<|{{4<19700=", string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      String string0 = DateFormatUtils.format((long) 3600000, "0:%(<|{{4<19700=", locale0);
      assertEquals("0:%(<|{{4<19700=", string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREAN;
      String string0 = DateFormatUtils.format(0L, "S:%(<|{{4<yH=", timeZone0, locale0);
      assertEquals("0:%(<|{{4<19700=", string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateFormatUtils.formatUTC((-1L), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      MockDate mockDate0 = new MockDate(3600000, 3600000, 13, 3600000, 3600000);
      String string0 = DateFormatUtils.formatUTC((Date) mockDate0, "0:%(<|{{4<19700=", locale0);
      assertEquals("0:%(<|{{4<19700=", string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateFormatUtils.formatUTC((Date) null, "}+)");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Date) null, "HH:mm:ss");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        DateFormatUtils.format((Calendar) null, "'T'HH:mm:ssZZ", timeZone0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter$TwoDigitNumberField", e);
      }
  }
}
