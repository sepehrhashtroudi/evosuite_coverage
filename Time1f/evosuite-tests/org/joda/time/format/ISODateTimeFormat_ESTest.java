/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 02:23:59 GMT 2022
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ISODateTimeFormat_ESTest extends ISODateTimeFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.yearMonthDay();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>(0, 1429.0F);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      linkedHashSet0.add(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedHashSet0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid ISO8601 format for fields: []
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.millisOfSecond();
      linkedHashSet0.add(dateTimeFieldType1);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, false);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, false);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, false);
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.weekOfWeekyear();
      linkedHashSet0.add(dateTimeFieldType1);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      linkedList0.add(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedList0, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid format for fields: [yearOfCentury]
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, true);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, false, false);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, false);
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      linkedList0.addFirst(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, false);
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedList0, true, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields((Collection<DateTimeFieldType>) null, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ISODateTimeFormat.Constants iSODateTimeFormat_Constants0 = new ISODateTimeFormat.Constants();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyearWeekDay();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyear();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.yearMonth();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateElementParser();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.timeNoMillis();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTTimeNoMillis();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.year();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localDateOptionalTimeParser();
      assertFalse(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinute();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTTime();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTimeParser();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.tTime();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localTimeParser();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTime();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDate();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTimeNoMillis();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyearWeek();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hour();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecond();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTime();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTimeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ISODateTimeFormat iSODateTimeFormat0 = new ISODateTimeFormat();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateOptionalTimeParser();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.time();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDate();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDate();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.timeElementParser();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinuteSecondMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinute();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTime();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDate();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondFraction();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinuteSecondFraction();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.tTimeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.date();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDate();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTime();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateParser();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTimeNoMillis();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTime();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHour();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinuteSecond();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.timeParser();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localDateParser();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }
}
