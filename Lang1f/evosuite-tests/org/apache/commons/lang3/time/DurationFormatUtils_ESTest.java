/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 21:27:07 GMT 2022
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Clock;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.chrono.HijrahDate;
import java.time.chrono.MinguoDate;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.HashMap;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.function.BiFunction;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class DurationFormatUtils_ESTest extends DurationFormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = (String)DurationFormatUtils.y;
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("y");
      durationFormatUtils_Token0.getCount();
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.toString();
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.formatDurationISO(1);
      ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getDefault();
      DurationFormatUtils.formatPeriod(588L, 2499L, "y", true, timeZone0);
      DurationFormatUtils.formatDuration(2499L, "y", false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DurationFormatUtils.lexx("");
      DurationFormatUtils.formatDuration((-1533L), "", true);
      DurationFormatUtils.formatDuration((-1533L), "", true);
      DurationFormatUtils.formatDurationHMS(0L);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-3323L), "", true, timeZone0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Clock clock0 = MockClock.systemDefaultZone();
      MinguoDate minguoDate0 = MockMinguoDate.now(clock0);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(minguoDate0, 0);
      durationFormatUtils_Token0.toString();
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      durationFormatUtils_Token0.getValue();
      DurationFormatUtils.format(durationFormatUtils_TokenArray0, 13, 13, 0, 13, (-734), (-197), 0, true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[1];
      int int0 = 651;
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("|Ex0r|ySH", 651);
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, "|Ex0r|ySH");
      String string0 = durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.equals(string0);
      long long0 = 1321L;
      DurationFormatUtils.formatDuration(1321L, "");
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.formatDurationWords(1321L, true, true);
      durationFormatUtils_Token0.equals("|Ex0r|ySH");
      DurationFormatUtils.formatPeriodISO(1321L, 1321L);
      // Undeclared exception!
      DurationFormatUtils.lexx(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DurationFormatUtils.formatDurationWords(1L, false, false);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("0java.lang.StringBuilder@00000000090java.lang.StringBuilder@00000000100java.lang.StringBuilder@00000000110java.lang.StringBuilder@0000000012");
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.getValue();
      DurationFormatUtils.formatDurationHMS(1L);
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("0java.lang.StringBuilder@00000000090java.lang.StringBuilder@00000000100java.lang.StringBuilder@00000000110java.lang.StringBuilder@0000000012");
      String string0 = (String)DurationFormatUtils.S;
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("S");
      durationFormatUtils_Token1.increment();
      DurationFormatUtils.formatDurationWords(1L, true, false);
      durationFormatUtils_Token1.getValue();
      DurationFormatUtils.formatDurationISO(1L);
      DurationFormatUtils.formatDurationHMS((-3582L));
      durationFormatUtils_Token0.getValue();
      TimeZone timeZone0 = TimeZone.getDefault();
      DurationFormatUtils.formatPeriod((-3582L), 1L, "", false, timeZone0);
      DurationFormatUtils.format(durationFormatUtils_TokenArray0, (-1400), (-1), (-1400), (-1), 0, (-1), (-1), true);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = null;
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatPeriod(60000L, 530L, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Long long0 = new Long(0L);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(long0, (-2396));
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.formatDurationWords(0L, false, false);
      DurationFormatUtils.formatDurationHMS(0L);
      DurationFormatUtils.formatDurationHMS(0L);
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.getValue();
      DurationFormatUtils.formatDurationISO((-2421L));
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      ZoneId zoneId0 = zoneOffset0.normalized();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      DurationFormatUtils.formatPeriod(0L, 0L, ">C1AuHNxKi5", false, timeZone0);
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.equals(zoneOffset0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DurationFormatUtils.formatDuration(86400000L, "qh;G:");
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "qh;G:", 0, 0, (-1), 2791, 1004, 0, 0, 0, 0, 2791, 2686);
      simpleTimeZone0.getOffset((long) 2686);
      DurationFormatUtils.formatPeriod(0L, 86400000L, "java.lang.StringBuilder@0000000002", false, (TimeZone) simpleTimeZone0);
      DurationFormatUtils.formatPeriodISO(86400000L, 86400000L);
      DurationFormatUtils.formatDuration(0L, "qh;G:");
      DurationFormatUtils.formatDuration(0L, "qh;G:");
      DurationFormatUtils.formatDuration(0L, "java.lang.StringBuilder@0000000036", true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      // Undeclared exception!
      try { 
        DurationFormatUtils.format((DurationFormatUtils.Token[]) null, 854, 854, 0, (-2184), (-2184), 0, 1, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFormatUtils.formatDuration(727L, "", false);
      String string0 = (String)DurationFormatUtils.M;
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("M");
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.getValue();
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.formatDuration(727L, "k2N3i#4s", false);
      durationFormatUtils_Token0.increment();
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      DurationFormatUtils.formatDurationHMS(727L);
      durationFormatUtils_Token0.getCount();
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[4];
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("k2N3i#4s", 5);
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token1;
      durationFormatUtils_TokenArray0[2] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[3] = durationFormatUtils_Token0;
      DurationFormatUtils.format(durationFormatUtils_TokenArray0, 5, 83, 5, 5, 5, 0, 0, true);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFormatUtils.formatDurationISO(677L);
      DurationFormatUtils.formatPeriodISO(677L, 677L);
      TimeZone timeZone0 = TimeZone.getDefault();
      timeZone0.setRawOffset((-361));
      DurationFormatUtils.formatPeriod(677L, 534L, "", false, timeZone0);
      DurationFormatUtils.formatPeriod(677L, 534L, "", false, timeZone0);
      Locale locale0 = Locale.forLanguageTag("");
      // Undeclared exception!
      try { 
        timeZone0.getDisplayName(false, (-361), locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal style: -361
         //
         verifyException("java.util.TimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      DurationFormatUtils.formatDuration(649L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", false);
      DurationFormatUtils.formatDuration(649L, "java.lang.StringBuilder@00000000320java.lang.StringBuilder@00000000330java.lang.StringBuilder@00000000340java.lang.StringBuilder@00000000350java.lang.StringBuilder@00000000360java.lang.StringBuilder@00000000370java.lang.StringBuilder@0000000038649java.lang.StringBuilder@0000000039");
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("java.lang.StringBuilder@00000000320java.lang.StringBuilder@00000000330java.lang.StringBuilder@00000000340java.lang.StringBuilder@00000000350java.lang.StringBuilder@00000000360java.lang.StringBuilder@00000000370java.lang.StringBuilder@0000000038649java.lang.StringBuilder@0000000039", 0);
      durationFormatUtils_Token0.getCount();
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("java.lang.StringBuilder@00000000320java.lang.StringBuilder@00000000330java.lang.StringBuilder@00000000340java.lang.StringBuilder@00000000350java.lang.StringBuilder@00000000360java.lang.StringBuilder@00000000370java.lang.StringBuilder@0000000038649java.lang.StringBuilder@0000000039", 0);
      durationFormatUtils_Token1.toString();
      durationFormatUtils_Token1.toString();
      durationFormatUtils_Token1.toString();
      durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      durationFormatUtils_Token1.getCount();
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.formatDurationHMS(0L);
      durationFormatUtils_Token0.getCount();
      DurationFormatUtils.formatDurationISO(0L);
      DurationFormatUtils.formatDuration((long) 0, "]GLlyq$3a");
      DurationFormatUtils.formatDuration((long) 0, "", false);
      DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, "java.lang.StringBuilder@0000000073649java.lang.StringBuilder@00000000740java.lang.StringBuilder@0000000075649java.lang.StringBuilder@00000000760java.lang.StringBuilder@0000000077649java.lang.StringBuilder@00000000780java.lang.StringBuilder@0000000079649java.lang.StringBuilder@00000000800java.lang.StringBuilder@0000000081649java.lang.StringBuilder@00000000820java.lang.StringBuilder@0000000083649java.lang.StringBuilder@00000000840java.lang.StringBuilder@0000000085649java.lang.StringBuilder@00000000860java.lang.StringBuilder@0000000087649java.lang.StringBuilder@00000000880java.lang.StringBuilder@0000000089");
      DurationFormatUtils.formatDuration(649L, "P@N5>%h|3", false);
      durationFormatUtils_Token1.getValue();
      DurationFormatUtils.formatPeriodISO(0, 0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = (String)DurationFormatUtils.M;
      int int0 = 671;
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("M", 671);
      durationFormatUtils_Token0.increment();
      String string1 = durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.getValue();
      DurationFormatUtils.formatDurationHMS(671);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("M", 671);
      DurationFormatUtils.formatPeriodISO(671, (-3185L));
      DurationFormatUtils.formatDurationISO((-3185L));
      // Undeclared exception!
      DurationFormatUtils.formatDuration(1591L, string1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFormatUtils.formatDurationHMS(86400000L);
      DurationFormatUtils.formatDuration(86400000L, "24java.lang.StringBuilder@000000000800java.lang.StringBuilder@000000000900java.lang.StringBuilder@0000000010000", false);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("java.lang.StringBuilder@00000000240java.lang.StringBuilder@00000000251java.lang.StringBuilder@00000000260java.lang.StringBuilder@00000000271java.lang.StringBuilder@00000000280java.lang.StringBuilder@00000000291java.lang.StringBuilder@0000000030");
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.formatDurationHMS((-2424L));
      DurationFormatUtils.formatDurationISO(60000L);
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      DurationFormatUtils.formatDurationISO(86400000L);
      durationFormatUtils_Token0.toString();
      DurationFormatUtils.formatDuration(618L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[1];
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      DurationFormatUtils.format(durationFormatUtils_TokenArray0, 2537, 2537, 5, 0, 443, 0, 3159, true);
      DurationFormatUtils.formatDurationHMS(0L);
      String string0 = (String)DurationFormatUtils.d;
      DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, "d");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[3];
      String string0 = (String)DurationFormatUtils.d;
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("d", 0);
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token((Object) null, 659);
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token1;
      Locale locale0 = Locale.PRC;
      Chronology chronology0 = Chronology.ofLocale(locale0);
      HashMap<TemporalField, Long> hashMap0 = new HashMap<TemporalField, Long>();
      ResolverStyle resolverStyle0 = ResolverStyle.LENIENT;
      chronology0.resolveDate(hashMap0, resolverStyle0);
      DurationFormatUtils.Token durationFormatUtils_Token2 = new DurationFormatUtils.Token((Object) null);
      durationFormatUtils_TokenArray0[2] = durationFormatUtils_Token2;
      DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, durationFormatUtils_Token1);
      ChronoField chronoField0 = ChronoField.PROLEPTIC_MONTH;
      BiFunction<Object, Object, Long> biFunction0 = (BiFunction<Object, Object, Long>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      hashMap0.compute(chronoField0, biFunction0);
      ChronoField chronoField1 = ChronoField.HOUR_OF_DAY;
      Long long0 = new Long((-1505L));
      hashMap0.put(chronoField1, long0);
      String string1 = (String)DurationFormatUtils.H;
      durationFormatUtils_Token0.equals("H");
      String string2 = (String)DurationFormatUtils.y;
      DurationFormatUtils.Token durationFormatUtils_Token3 = new DurationFormatUtils.Token("y", 0);
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatDuration(0L, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HijrahDate hijrahDate0 = MockHijrahDate.now();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(hijrahDate0, 0);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
      durationFormatUtils_Token1.equals(hijrahDate0);
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.formatDurationHMS((-1792L));
      DurationFormatUtils.Token durationFormatUtils_Token2 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
      DurationFormatUtils.Token durationFormatUtils_Token3 = new DurationFormatUtils.Token(durationFormatUtils_Token2);
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-13L), "");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = null;
      // Undeclared exception!
      try { 
        DurationFormatUtils.lexx((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Long long0 = new Long((-359L));
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(long0);
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.formatDurationHMS(4040L);
      durationFormatUtils_Token0.getValue();
      DurationFormatUtils.formatDurationHMS((-1L));
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.equals("java.lang.Long@0000000022java.lang.Long@0000000022java.lang.Long@0000000022");
      DurationFormatUtils.formatDuration(1000L, "#Os k3ZJ_Y) JF;", false);
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      DurationFormatUtils.formatDuration(60000L, "0java.lang.StringBuilder@000000001900java.lang.StringBuilder@000000002000java.lang.StringBuilder@000000002199");
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("java.lang.StringBuilder@000000004260000java.lang.StringBuilder@00000000430java.lang.StringBuilder@000000004460000java.lang.StringBuilder@00000000450java.lang.StringBuilder@000000004660000java.lang.StringBuilder@00000000470java.lang.StringBuilder@0000000048");
      durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = (String)DurationFormatUtils.S;
      int int0 = 2278;
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("S", 2278);
      String string1 = durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.formatPeriodISO(0L, 0L);
      boolean boolean0 = true;
      DurationFormatUtils.formatDurationWords(0L, true, true);
      DurationFormatUtils.formatDuration((long) 2278, string1, true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatPeriod(0L, 0L, "E;SlS_M{:iNgS", true, (TimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(72, "?BKh2hfS");
      DurationFormatUtils.formatPeriod(1943L, 0L, "SZ%U#pu7mSs~", false, (TimeZone) simpleTimeZone0);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("57java.lang.StringBuilder@0000000007446395758java.lang.StringBuilder@0000000008");
      durationFormatUtils_Token0.getCount();
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[2];
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      durationFormatUtils_Token0.increment();
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token0;
      DurationFormatUtils.format(durationFormatUtils_TokenArray0, 1, 72, 0, 72, 1, 0, 5, false);
      durationFormatUtils_Token0.getValue();
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.getCount();
      durationFormatUtils_Token0.getCount();
      DurationFormatUtils.formatDurationISO(1696L);
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.formatDurationHMS(3600000L);
      DurationFormatUtils.format(durationFormatUtils_TokenArray0, 0, (-2235), 0, 5, 2, (-2235), 5, true);
      durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DurationFormatUtils.formatPeriod(0L, 2608L, "o[*");
      TimeZone timeZone0 = TimeZone.getDefault();
      DurationFormatUtils.formatPeriod(210L, 2608L, "0ruLJ.+e(8", true, timeZone0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DurationFormatUtils.formatDuration((-1L), "x?}4*1e|FV *@*M[", false);
      DurationFormatUtils.lexx("java.lang.StringBuilder@00000000040java.lang.StringBuilder@0000000005");
      TimeZone timeZone0 = TimeZone.getDefault();
      DurationFormatUtils.formatPeriod((-1L), 3600000L, "x?}4*1e|FV *@*M[", false, timeZone0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      DurationFormatUtils.formatDurationISO(3600000L);
      DurationFormatUtils.formatDurationWords(0L, true, true);
      // Undeclared exception!
      try { 
        DurationFormatUtils.Token.containsTokenWithValue((DurationFormatUtils.Token[]) null, durationFormatUtils0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      long long0 = 86400000L;
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatDuration(86400000L, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      DurationFormatUtils.formatDuration((-410L), "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(durationFormatUtils0, 0);
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
      durationFormatUtils_Token1.equals((Object) null);
      DurationFormatUtils.formatPeriod((long) 0, (long) 0, "");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      DurationFormatUtils.formatDurationWords(0L, false, true);
      DurationFormatUtils.formatDurationWords(0L, false, false);
      DurationFormatUtils.formatDuration(1923L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DurationFormatUtils.formatPeriod(60000L, 0L, "");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DurationFormatUtils.formatPeriod((-1L), (-1L), "org.apache.commons.lang3.time.DurationFormatUtils$Token", true, timeZone0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DurationFormatUtils.formatDurationISO(0L);
      DurationFormatUtils.formatDuration(1L, "org.apache.commons.lang3.time.DurationFormatUtils$Token");
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("org.apache.commons.lang3.time.DurationFormatUtils$Token", (-1));
      durationFormatUtils_Token0.equals("java.lang.StringBuilder@000000003400java.lang.StringBuilder@00000000350java.lang.StringBuilder@000000003600java.lang.StringBuilder@0000000037java.lang.StringBuilder@00000000380java.lang.StringBuilder@0000000039");
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("java.lang.StringBuilder@00000000160java.lang.StringBuilder@00000000170java.lang.StringBuilder@00000000180java.lang.StringBuilder@00000000190java.lang.StringBuilder@00000000200java.lang.StringBuilder@00000000210java.lang.StringBuilder@0000000022000java.lang.StringBuilder@0000000023");
      durationFormatUtils_Token1.increment();
      durationFormatUtils_Token1.increment();
      durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      DurationFormatUtils.formatDuration(0L, "");
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("org.apache.commons.lang3.time.DurationFormatUtils$Token");
      durationFormatUtils_Token1.toString();
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.toString();
      DurationFormatUtils.formatDurationWords((-1L), false, false);
      DurationFormatUtils.formatDuration((long) (-1), "As(CX=YUy:C0KO!");
      DurationFormatUtils.formatPeriodISO(0L, (-316L));
      DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, durationFormatUtils_Token1);
      DurationFormatUtils.formatDuration((-1L), " 1 second");
      DurationFormatUtils.formatDurationISO(1L);
      DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, "");
      DurationFormatUtils.formatPeriod(3608L, 3608L, "");
      DurationFormatUtils.formatPeriod((-316L), 0L, "");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(" \")ynyrU]vSDy_oS!eZ", 0);
      durationFormatUtils_Token0.getValue();
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[7];
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[2] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[3] = durationFormatUtils_Token0;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(mockGregorianCalendar0);
      durationFormatUtils_TokenArray0[4] = durationFormatUtils_Token1;
      durationFormatUtils_TokenArray0[5] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[6] = durationFormatUtils_Token0;
      String string0 = (String)DurationFormatUtils.M;
      DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, "M");
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      long long0 = (-1718L);
      String string0 = "";
      boolean boolean0 = true;
      String string1 = "oPd*RJYVPZ=ukwr)g[B";
      TimeZone timeZone0 = TimeZone.getTimeZone("oPd*RJYVPZ=ukwr)g[B");
      int int0 = (-1453);
      // Undeclared exception!
      try { 
        timeZone0.getDisplayName(true, (-1453));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal style: -1453
         //
         verifyException("java.util.TimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      DurationFormatUtils.formatDurationWords(0L, false, true);
      DurationFormatUtils.formatDuration(0L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true);
      DurationFormatUtils.formatDuration(0L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("[h");
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.formatPeriodISO(0L, 0L);
      DurationFormatUtils.formatDurationHMS(0L);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
      DurationFormatUtils.Token durationFormatUtils_Token2 = new DurationFormatUtils.Token("ti6$\"fsC8w-!xb)( Wf", 1295);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = (String)DurationFormatUtils.d;
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("d");
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.toString();
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("java.lang.String@0000000002java.lang.String@0000000002");
      durationFormatUtils_Token1.increment();
      durationFormatUtils_Token1.increment();
      durationFormatUtils_Token1.equals((Object) null);
      DurationFormatUtils.formatDuration((-148L), "java.lang.String@0000000002java.lang.String@0000000002");
      DurationFormatUtils.formatDurationISO(1067L);
      DurationFormatUtils.formatDuration(2750L, "java.lang.StringBuilder@0000000008-148java.lang.StringBuilder@0000000009java.lang.StringBuilder@0000000010", false);
      durationFormatUtils_Token1.equals("java.lang.String@0000000002java.lang.String@0000000002");
      DurationFormatUtils.formatDurationISO(2750L);
      DurationFormatUtils.formatDurationISO(2750L);
      durationFormatUtils_Token0.toString();
      DurationFormatUtils.formatPeriod((-1L), 144L, "N");
      DurationFormatUtils.formatPeriodISO(2088L, 0L);
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-148L), "? *&VfAP__.{N?fF");
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = (String)DurationFormatUtils.y;
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("y", (-836));
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.toString();
      String string1 = DurationFormatUtils.formatPeriod((long) (-836), (long) (-836), "");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0, 72);
      String string2 = DurationFormatUtils.formatDurationHMS(0L);
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      String string3 = DurationFormatUtils.formatDuration((long) (-836), "cU4^oU8}6");
      String string4 = DurationFormatUtils.formatPeriod((long) (-836), 0L, "/");
      //  // Unstable assertion: assertFalse(string4.equals((Object)string3));
      
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[3];
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token1;
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[2] = durationFormatUtils_Token0;
      String string5 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, (-2260), (-836), 0, 0, 0, (-2260), 0, false);
      //  // Unstable assertion: assertFalse(string5.equals((Object)string2));
      //  // Unstable assertion: assertTrue(string5.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      long long0 = (-1L);
      long long1 = 54L;
      String string0 = "";
      boolean boolean0 = true;
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1000, " ");
      // Undeclared exception!
      try { 
        simpleTimeZone0.setEndRule(1000, 1000, (-467), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal end month 1000
         //
         verifyException("java.util.SimpleTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DurationFormatUtils.formatDuration(946L, "");
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("", 803);
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[9];
      durationFormatUtils_Token0.increment();
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[2] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[3] = durationFormatUtils_Token0;
      durationFormatUtils_Token0.toString();
      durationFormatUtils_TokenArray0[4] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[5] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[6] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[7] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[8] = durationFormatUtils_Token0;
      DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, durationFormatUtils_Token0);
      DurationFormatUtils.lexx("");
      durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      SimpleTimeZone simpleTimeZone0 = null;
      try {
        simpleTimeZone0 = new SimpleTimeZone((-37), "prIE", 803, 803, 0, 1, 14, 0, 1899, (-1), (-37));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal start month 803
         //
         verifyException("java.util.SimpleTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = (String)DurationFormatUtils.y;
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("y");
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.increment();
      durationFormatUtils_Token0.getValue();
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.getValue();
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.toString();
      durationFormatUtils_Token0.toString();
      DurationFormatUtils.formatDuration(778L, "");
      durationFormatUtils_Token0.toString();
      DurationFormatUtils.formatDurationWords(778L, false, false);
      durationFormatUtils_Token0.getCount();
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.formatDurationWords(297L, true, true);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("java.lang.String@0000000002java.lang.String@0000000002java.lang.String@0000000002", 0);
      DurationFormatUtils.Token durationFormatUtils_Token2 = new DurationFormatUtils.Token("y");
      DurationFormatUtils.formatDurationWords(778L, false, true);
      DurationFormatUtils.formatDuration((long) 0, "z9Z-=ti8}oWe'hQAm^*");
      DurationFormatUtils.Token durationFormatUtils_Token3 = new DurationFormatUtils.Token("java.lang.String@0000000002java.lang.String@0000000002java.lang.String@0000000002");
      DurationFormatUtils.formatPeriodISO(297L, 778L);
      durationFormatUtils_Token2.getValue();
      DurationFormatUtils.Token durationFormatUtils_Token4 = new DurationFormatUtils.Token("0java.lang.StringBuilder@00000000370java.lang.StringBuilder@00000000380java.lang.StringBuilder@00000000390java.lang.StringBuilder@0000000040");
      assertFalse(durationFormatUtils_Token4.equals((Object)durationFormatUtils_Token3));
  }
}