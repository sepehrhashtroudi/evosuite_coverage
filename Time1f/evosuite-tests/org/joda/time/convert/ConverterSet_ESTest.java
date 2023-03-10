/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:01:55 GMT 2022
 */

package org.joda.time.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Duration;
import org.joda.time.MutablePeriod;
import org.joda.time.convert.CalendarConverter;
import org.joda.time.convert.Converter;
import org.joda.time.convert.ConverterSet;
import org.joda.time.convert.LongConverter;
import org.joda.time.convert.NullConverter;
import org.joda.time.convert.ReadableDurationConverter;
import org.joda.time.convert.ReadableInstantConverter;
import org.joda.time.convert.ReadableIntervalConverter;
import org.joda.time.convert.ReadablePartialConverter;
import org.joda.time.convert.ReadablePeriodConverter;
import org.joda.time.convert.StringConverter;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConverterSet_ESTest extends ConverterSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Converter[] converterArray0 = new Converter[1];
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      // Undeclared exception!
      try { 
        converterSet0.remove(17, converterArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ConverterSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<String> class0 = String.class;
      NullConverter nullConverter0 = NullConverter.INSTANCE;
      ConverterSet.Entry converterSet_Entry0 = new ConverterSet.Entry(class0, nullConverter0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Converter[] converterArray0 = new Converter[0];
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      int int0 = converterSet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Converter[] converterArray0 = new Converter[4];
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      converterArray0[3] = (Converter) stringConverter0;
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      Class<String> class0 = String.class;
      Converter converter0 = converterSet0.select(class0);
      assertSame(converter0, stringConverter0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConverterSet converterSet0 = new ConverterSet((Converter[]) null);
      // Undeclared exception!
      try { 
        converterSet0.size();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ConverterSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Converter[] converterArray0 = new Converter[3];
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        converterSet0.select(class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ConverterSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConverterSet converterSet0 = new ConverterSet((Converter[]) null);
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      // Undeclared exception!
      try { 
        converterSet0.remove(stringConverter0, (Converter[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ConverterSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Converter[] converterArray0 = new Converter[0];
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      // Undeclared exception!
      try { 
        converterSet0.remove((Converter) null, converterArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.joda.time.convert.ConverterSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConverterSet converterSet0 = new ConverterSet((Converter[]) null);
      // Undeclared exception!
      try { 
        converterSet0.remove(1, (Converter[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ConverterSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Converter[] converterArray0 = new Converter[1];
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      // Undeclared exception!
      try { 
        converterSet0.remove((-3296), converterArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3296
         //
         verifyException("org.joda.time.convert.ConverterSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Converter[] converterArray0 = new Converter[7];
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      Converter[] converterArray1 = new Converter[4];
      // Undeclared exception!
      try { 
        converterSet0.copyInto(converterArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Converter[] converterArray0 = new Converter[2];
      LongConverter longConverter0 = new LongConverter();
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      // Undeclared exception!
      try { 
        converterSet0.add(longConverter0, converterArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ConverterSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Converter[] converterArray0 = new Converter[0];
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      // Undeclared exception!
      try { 
        converterSet0.add((Converter) null, converterArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.joda.time.convert.ConverterSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Converter[] converterArray0 = new Converter[0];
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      // Undeclared exception!
      try { 
        converterSet0.remove(0, converterArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ConverterSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(1350).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      MutablePeriod mutablePeriod0 = MutablePeriod.parse("{HvG#", periodFormatter0);
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Converter[] converterArray0 = new Converter[9];
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      converterArray0[1] = (Converter) stringConverter0;
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      ConverterSet converterSet1 = converterSet0.remove(stringConverter0, converterArray0);
      // Undeclared exception!
      try { 
        converterSet1.remove(8, converterArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ConverterSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Converter[] converterArray0 = new Converter[0];
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      CalendarConverter calendarConverter0 = new CalendarConverter();
      ConverterSet converterSet1 = converterSet0.remove(calendarConverter0, (Converter[]) null);
      assertSame(converterSet0, converterSet1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Converter[] converterArray0 = new Converter[3];
      ReadableIntervalConverter readableIntervalConverter0 = new ReadableIntervalConverter();
      converterArray0[1] = (Converter) readableIntervalConverter0;
      CalendarConverter calendarConverter0 = new CalendarConverter();
      converterArray0[2] = (Converter) calendarConverter0;
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      ConverterSet converterSet1 = converterSet0.remove(0, converterArray0);
      ConverterSet converterSet2 = converterSet1.add(calendarConverter0, converterArray0);
      ConverterSet converterSet3 = converterSet2.remove(0, converterArray0);
      ConverterSet converterSet4 = converterSet3.remove(readableIntervalConverter0, converterArray0);
      assertSame(converterSet4, converterSet3);
      assertSame(converterSet2, converterSet1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Converter[] converterArray0 = new Converter[9];
      ReadableDurationConverter readableDurationConverter0 = new ReadableDurationConverter();
      converterArray0[0] = (Converter) readableDurationConverter0;
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      converterArray0[1] = (Converter) stringConverter0;
      ReadableIntervalConverter readableIntervalConverter0 = ReadableIntervalConverter.INSTANCE;
      converterArray0[2] = (Converter) readableIntervalConverter0;
      ReadableIntervalConverter readableIntervalConverter1 = new ReadableIntervalConverter();
      converterArray0[4] = (Converter) readableIntervalConverter1;
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      ConverterSet converterSet1 = converterSet0.add(converterArray0[4], converterArray0);
      assertNotSame(converterSet1, converterSet0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Converter[] converterArray0 = new Converter[5];
      ReadablePartialConverter readablePartialConverter0 = ReadablePartialConverter.INSTANCE;
      converterArray0[0] = (Converter) readablePartialConverter0;
      CalendarConverter calendarConverter0 = new CalendarConverter();
      converterArray0[1] = (Converter) calendarConverter0;
      ReadablePeriodConverter readablePeriodConverter0 = ReadablePeriodConverter.INSTANCE;
      converterArray0[2] = (Converter) readablePeriodConverter0;
      ReadableInstantConverter readableInstantConverter0 = new ReadableInstantConverter();
      converterArray0[3] = (Converter) readableInstantConverter0;
      ReadableIntervalConverter readableIntervalConverter0 = ReadableIntervalConverter.INSTANCE;
      converterArray0[4] = (Converter) readableIntervalConverter0;
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      ConverterSet converterSet1 = converterSet0.add(converterArray0[4], (Converter[]) null);
      assertSame(converterSet1, converterSet0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Converter[] converterArray0 = new Converter[3];
      ReadableIntervalConverter readableIntervalConverter0 = new ReadableIntervalConverter();
      converterArray0[1] = (Converter) readableIntervalConverter0;
      CalendarConverter calendarConverter0 = new CalendarConverter();
      converterArray0[2] = (Converter) calendarConverter0;
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      ConverterSet converterSet1 = converterSet0.remove(converterArray0[2], converterArray0);
      ConverterSet converterSet2 = converterSet1.remove(0, converterArray0);
      ConverterSet converterSet3 = converterSet2.add(calendarConverter0, converterArray0);
      assertNotSame(converterSet3, converterSet2);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Converter[] converterArray0 = new Converter[0];
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      Class<Object> class0 = Object.class;
      converterSet0.select(class0);
      Converter converter0 = converterSet0.select(class0);
      assertNull(converter0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Duration duration0 = new Duration((Object) null);
      assertEquals(0L, duration0.getStandardMinutes());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Converter[] converterArray0 = new Converter[3];
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      int int0 = converterSet0.size();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Converter[] converterArray0 = new Converter[0];
      ConverterSet converterSet0 = new ConverterSet(converterArray0);
      converterSet0.copyInto(converterArray0);
      assertEquals(0, converterArray0.length);
  }
}
