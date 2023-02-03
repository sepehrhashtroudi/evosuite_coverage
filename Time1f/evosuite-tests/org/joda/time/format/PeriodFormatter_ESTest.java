/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 02:34:44 GMT 2022
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PeriodFormatter_ESTest extends PeriodFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      StringBuffer stringBuffer0 = new StringBuffer();
      Minutes minutes0 = Minutes.ONE;
      Seconds seconds0 = minutes0.toStandardSeconds();
      periodFormatter0.printTo(stringBuffer0, (ReadablePeriod) seconds0);
      assertEquals(1, seconds0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, (PeriodParser) null);
      PeriodType periodType0 = PeriodType.weeks();
      PeriodFormatter periodFormatter1 = periodFormatter0.withParseType(periodType0);
      assertNotSame(periodFormatter1, periodFormatter0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PeriodFormatterBuilder.Composite periodFormatterBuilder_Composite0 = new PeriodFormatterBuilder.Composite(linkedList0);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Composite0, (PeriodParser) null);
      Locale locale0 = Locale.ITALIAN;
      PeriodFormatter periodFormatter1 = periodFormatter0.withLocale(locale0);
      assertNotSame(periodFormatter1, periodFormatter0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("G@\"\"7~:jH@9Ca");
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      Minutes minutes0 = Minutes.TWO;
      String string0 = periodFormatter0.print(minutes0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("V<qR<:Gb_Lx-g");
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      MutablePeriod mutablePeriod0 = periodFormatter0.parseMutablePeriod("V<qR<:Gb_Lx-g");
      int int0 = periodFormatter0.parseInto(mutablePeriod0, "V<qR<:Gb_Lx-g", (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, (PeriodType) null, (Chronology) null);
      int int0 = periodFormatter0.parseInto(mutablePeriod0, "A3", (-1052));
      assertEquals(1051, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal(",.pP");
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodFormatterBuilder_Literal0);
      Days days0 = Days.FOUR;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      int int0 = periodFormatter0.parseInto(mutablePeriod0, "jq'4-:", 23034375);
      assertEquals((-23034376), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodFormatterBuilder_Literal0);
      PeriodPrinter periodPrinter0 = periodFormatter0.getPrinter();
      assertNull(periodPrinter0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PeriodFormatterBuilder.Composite periodFormatterBuilder_Composite0 = new PeriodFormatterBuilder.Composite(linkedList0);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Composite0, (PeriodParser) null);
      PeriodParser periodParser0 = periodFormatter0.getParser();
      assertNull(periodParser0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      PeriodType periodType0 = PeriodType.months();
      PeriodType periodType1 = periodType0.withMonthsRemoved();
      PeriodFormatter periodFormatter1 = periodFormatter0.withParseType(periodType1);
      PeriodType periodType2 = periodFormatter1.getParseType();
      assertNotNull(periodType2);
      assertNotSame(periodFormatter0, periodFormatter1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PeriodFormatterBuilder.Composite periodFormatterBuilder_Composite0 = new PeriodFormatterBuilder.Composite(linkedList0);
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodFormatterBuilder_Composite0);
      LocalDate localDate0 = new LocalDate(1097L, (Chronology) null);
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      PeriodType periodType0 = days0.getPeriodType();
      PeriodFormatter periodFormatter1 = periodFormatter0.withParseType(periodType0);
      Locale locale0 = Locale.UK;
      PeriodFormatter periodFormatter2 = periodFormatter1.withLocale(locale0);
      PeriodType periodType1 = periodFormatter2.getParseType();
      assertNotSame(periodFormatter2, periodFormatter1);
      assertNotNull(periodType1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PeriodFormatterBuilder.Composite periodFormatterBuilder_Composite0 = new PeriodFormatterBuilder.Composite(linkedList0);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Composite0, periodFormatterBuilder_Composite0);
      Locale locale0 = Locale.FRENCH;
      PeriodFormatter periodFormatter1 = periodFormatter0.withLocale(locale0);
      Locale locale1 = periodFormatter1.getLocale();
      assertNotNull(locale1);
      assertNotSame(periodFormatter0, periodFormatter1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal(";=zM");
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodFormatterBuilder_Literal0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      Hours hours0 = Hours.SIX;
      // Undeclared exception!
      try { 
        periodFormatter0.printTo(stringBuffer0, (ReadablePeriod) hours0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("7HK3}~glMf>O");
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      StringBuffer stringBuffer0 = new StringBuffer(973);
      // Undeclared exception!
      try { 
        periodFormatter0.printTo(stringBuffer0, (ReadablePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period must not be null
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      Hours hours0 = Hours.hours(3286);
      // Undeclared exception!
      try { 
        periodFormatter0.printTo((Writer) null, (ReadablePeriod) hours0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.PeriodFormatterBuilder$Literal", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("!V");
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      MockFileWriter mockFileWriter0 = new MockFileWriter("n@=9q]@zHu#EdH@|", true);
      mockFileWriter0.close();
      Months months0 = Months.months(89);
      try { 
        periodFormatter0.printTo((Writer) mockFileWriter0, (ReadablePeriod) months0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PeriodFormatterBuilder.Composite periodFormatterBuilder_Composite0 = new PeriodFormatterBuilder.Composite(linkedList0);
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodFormatterBuilder_Composite0);
      LocalDate localDate0 = new LocalDate(1097L, (Chronology) null);
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      // Undeclared exception!
      try { 
        periodFormatter0.print(days0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PeriodFormatterBuilder.Composite periodFormatterBuilder_Composite0 = new PeriodFormatterBuilder.Composite(linkedList0);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Composite0, periodFormatterBuilder_Composite0);
      Hours hours0 = Hours.FOUR;
      // Undeclared exception!
      try { 
        periodFormatter0.print(hours0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.PeriodFormatterBuilder$Composite", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal((String) null);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      // Undeclared exception!
      try { 
        periodFormatter0.print((ReadablePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period must not be null
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PeriodFormatterBuilder.Composite periodFormatterBuilder_Composite0 = new PeriodFormatterBuilder.Composite(linkedList0);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Composite0, periodFormatterBuilder_Composite0);
      // Undeclared exception!
      try { 
        periodFormatter0.parsePeriod("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.PeriodFormatterBuilder$Composite", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "%fJ#7b)&mD!)";
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("");
      PeriodFormatterBuilder.Separator periodFormatterBuilder_Separator0 = new PeriodFormatterBuilder.Separator("%fJ#7b)&mD!)", "%fJ#7b)&mD!)", stringArray0, periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, false, false);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Separator0, periodFormatterBuilder_Separator0);
      periodFormatterBuilder_Separator0.finish(periodFormatterBuilder_Literal0, periodFormatterBuilder_Separator0);
      // Undeclared exception!
      try { 
        periodFormatter0.parsePeriod("org.joda.time.chrono.BasicSingleEraDateTimeField");
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("21W");
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      // Undeclared exception!
      try { 
        periodFormatter0.parsePeriod((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.PeriodFormatterBuilder$Literal", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("!V");
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      // Undeclared exception!
      try { 
        periodFormatter0.parsePeriod("CJX-yJ%(g-o.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"CJX-yJ%(g-o.\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("");
      PeriodFormatterBuilder.Separator periodFormatterBuilder_Separator0 = new PeriodFormatterBuilder.Separator("", "", (String[]) null, periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, true, true);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Separator0, periodFormatterBuilder_Separator0);
      // Undeclared exception!
      try { 
        periodFormatter0.parseMutablePeriod("org.joda.time.chrono.IslamicChronology$LeapYearPatternType");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PeriodFormatterBuilder.Composite periodFormatterBuilder_Composite0 = new PeriodFormatterBuilder.Composite(linkedList0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "{Uq,PnNfx^(d\"";
      stringArray0[1] = "s7{@)";
      stringArray0[2] = "{Uq,PnNfx^(d\"";
      stringArray0[3] = "s7{@)";
      stringArray0[4] = "s7{@)";
      stringArray0[5] = "{Uq,PnNfx^(d\"";
      stringArray0[6] = "{Uq,PnNfx^(d\"";
      PeriodFormatterBuilder.Separator periodFormatterBuilder_Separator0 = new PeriodFormatterBuilder.Separator("s7{@)", "{Uq,PnNfx^(d\"", stringArray0, periodFormatterBuilder_Composite0, periodFormatterBuilder_Composite0, true, false);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Composite0, periodFormatterBuilder_Separator0);
      Weeks weeks0 = Weeks.TWO;
      PeriodType periodType0 = weeks0.getPeriodType();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, periodType0, (Chronology) gregorianChronology0);
      // Undeclared exception!
      try { 
        periodFormatter0.parseInto(mutablePeriod0, "{Uq,PnNfx^(d\"", 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.PeriodFormatterBuilder$Composite", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      MutablePeriod mutablePeriod0 = periodFormatter0.parseMutablePeriod("");
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal((String) null);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      PeriodPrinter periodPrinter0 = periodFormatter0.getPrinter();
      assertSame(periodFormatterBuilder_Literal0, periodPrinter0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("V<qR<:Gb_Lx-g");
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      PeriodParser periodParser0 = periodFormatter0.getParser();
      assertSame(periodFormatterBuilder_Literal0, periodParser0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      Locale locale0 = periodFormatter0.getLocale();
      assertNull(locale0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, (PeriodParser) null);
      // Undeclared exception!
      try { 
        periodFormatter0.parseMutablePeriod("=tucKQV>");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Parsing not supported
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      // Undeclared exception!
      try { 
        periodFormatter0.parseMutablePeriod("org.joda.time.field.DelegatedDurationField");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.field.DelegatedDur...\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("-");
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      // Undeclared exception!
      try { 
        periodFormatter0.parseMutablePeriod("ikL.miTuJoy9L&BD;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"ikL.miTuJoy9L&BD;\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Period must not be null";
      stringArray0[1] = "Period must not be null";
      stringArray0[2] = "Period must not be null";
      stringArray0[3] = "Period must not be null";
      stringArray0[4] = "Period must not be null";
      stringArray0[5] = "Period must not be null";
      stringArray0[6] = "Period must not be null";
      stringArray0[7] = "Period must not be null";
      stringArray0[8] = "Period must not be null";
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("Period must not be null");
      PeriodFormatterBuilder.Separator periodFormatterBuilder_Separator0 = new PeriodFormatterBuilder.Separator("Period must not be null", "Period must not be null", stringArray0, (PeriodPrinter) null, periodFormatterBuilder_Literal0, true, true);
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodFormatterBuilder_Separator0);
      // Undeclared exception!
      try { 
        periodFormatter0.parseInto((ReadWritablePeriod) null, "", (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period must not be null
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("3+\"pK");
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodFormatterBuilder_Literal0);
      StringWriter stringWriter0 = new StringWriter(31);
      MutablePeriod mutablePeriod0 = new MutablePeriod((-461L), (PeriodType) null, (Chronology) null);
      Hours hours0 = Hours.standardHoursIn(mutablePeriod0);
      Seconds seconds0 = hours0.toStandardSeconds();
      Days days0 = Days.standardDaysIn(seconds0);
      // Undeclared exception!
      try { 
        periodFormatter0.printTo((Writer) stringWriter0, (ReadablePeriod) days0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      PeriodType periodType0 = PeriodType.yearMonthDay();
      PeriodFormatter periodFormatter1 = periodFormatter0.withParseType(periodType0);
      PeriodFormatter periodFormatter2 = periodFormatter1.withParseType(periodType0);
      assertNotSame(periodFormatter2, periodFormatter0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      Locale locale0 = Locale.KOREA;
      PeriodFormatter periodFormatter1 = periodFormatter0.withLocale(locale0);
      periodFormatter1.withLocale((Locale) null);
      assertNotSame(periodFormatter1, periodFormatter0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      boolean boolean0 = periodFormatter0.isParser();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      boolean boolean0 = periodFormatter0.isPrinter();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal(",.pP");
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodFormatterBuilder_Literal0);
      boolean boolean0 = periodFormatter0.isPrinter();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      Period period0 = periodFormatter0.parsePeriod("");
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      PeriodType periodType0 = PeriodType.years();
      DateTime dateTime0 = new DateTime((long) 0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, dateTime0, periodType0);
      // Undeclared exception!
      try { 
        periodFormatter0.parseInto(mutablePeriod0, (String) null, (-1880));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.PeriodFormatterBuilder$Literal", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      PeriodType periodType0 = periodFormatter0.getParseType();
      assertNull(periodType0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      Minutes minutes0 = Minutes.ONE;
      Period period0 = minutes0.toPeriod();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      periodFormatter0.printTo((Writer) charArrayWriter0, (ReadablePeriod) period0);
      assertTrue(periodFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      Locale locale0 = Locale.UK;
      PeriodFormatter periodFormatter1 = periodFormatter0.withLocale(locale0);
      PeriodFormatter periodFormatter2 = periodFormatter1.withLocale(locale0);
      assertNotSame(periodFormatter2, periodFormatter0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PeriodFormatterBuilder.Composite periodFormatterBuilder_Composite0 = new PeriodFormatterBuilder.Composite(linkedList0);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Composite0, periodFormatterBuilder_Composite0);
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      Years years0 = Years.years(0);
      // Undeclared exception!
      try { 
        periodFormatter0.printTo(stringBuffer0, (ReadablePeriod) years0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.PeriodFormatterBuilder$Composite", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      Period period0 = Period.hours(0);
      String string0 = periodFormatter0.print(period0);
      assertEquals("", string0);
  }
}
