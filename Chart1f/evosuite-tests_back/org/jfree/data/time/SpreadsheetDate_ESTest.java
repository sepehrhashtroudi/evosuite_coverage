/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 20:44:52 GMT 2022
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.jfree.data.time.SerialDate;
import org.jfree.data.time.SpreadsheetDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SpreadsheetDate_ESTest extends SpreadsheetDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1658);
      SerialDate serialDate0 = spreadsheetDate0.getNearestDayOfWeek(1);
      serialDate0.isInRange((SerialDate) spreadsheetDate0, serialDate0, (-1347));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1600);
      Date date0 = spreadsheetDate0.toDate();
      SerialDate serialDate0 = SerialDate.createInstance(date0);
      spreadsheetDate0.isInRange(serialDate0, serialDate0, 6);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1658);
      SerialDate serialDate0 = spreadsheetDate0.getNearestDayOfWeek(1);
      SpreadsheetDate spreadsheetDate1 = new SpreadsheetDate(1900);
      serialDate0.isInRange((SerialDate) spreadsheetDate0, (SerialDate) spreadsheetDate1, 2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1658);
      SpreadsheetDate spreadsheetDate1 = new SpreadsheetDate(3);
      spreadsheetDate1.isInRange((SerialDate) spreadsheetDate0, (SerialDate) spreadsheetDate0, 2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1600);
      Date date0 = spreadsheetDate0.toDate();
      SerialDate serialDate0 = SerialDate.createInstance(date0);
      serialDate0.isInRange((SerialDate) spreadsheetDate0, (SerialDate) spreadsheetDate0, 1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1658);
      SerialDate serialDate0 = spreadsheetDate0.getEndOfCurrentMonth(spreadsheetDate0);
      spreadsheetDate0.isInRange((SerialDate) spreadsheetDate0, serialDate0, 3);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1, 3, 2395);
      SerialDate serialDate0 = spreadsheetDate0.getFollowingDayOfWeek(3);
      serialDate0.isOnOrAfter(spreadsheetDate0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1, 3, 2395);
      SerialDate serialDate0 = spreadsheetDate0.getFollowingDayOfWeek(3);
      spreadsheetDate0.isAfter(serialDate0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1, 3, 2395);
      SerialDate serialDate0 = spreadsheetDate0.getFollowingDayOfWeek(3);
      spreadsheetDate0.isOnOrBefore(serialDate0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(116);
      SerialDate serialDate0 = SerialDate.getPreviousDayOfWeek(2, (SerialDate) spreadsheetDate0);
      spreadsheetDate0.isBefore(serialDate0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2017);
      SerialDate serialDate0 = SerialDate.getPreviousDayOfWeek(1, (SerialDate) spreadsheetDate0);
      spreadsheetDate0.isOn(serialDate0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1658);
      SpreadsheetDate spreadsheetDate1 = new SpreadsheetDate(1900);
      spreadsheetDate1.equals(spreadsheetDate0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(116);
      SerialDate serialDate0 = SerialDate.getPreviousDayOfWeek(2, (SerialDate) spreadsheetDate0);
      spreadsheetDate0.isOnOrBefore(serialDate0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2017);
      SerialDate serialDate0 = SerialDate.getPreviousDayOfWeek(1, (SerialDate) spreadsheetDate0);
      spreadsheetDate0.isAfter(serialDate0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(116);
      spreadsheetDate0.getYYYY();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(977);
      spreadsheetDate0.compareTo(spreadsheetDate0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2958465);
      SerialDate serialDate0 = SerialDate.createInstance(9999);
      spreadsheetDate0.compareTo(serialDate0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2014);
      SerialDate serialDate0 = spreadsheetDate0.getEndOfCurrentMonth(spreadsheetDate0);
      spreadsheetDate0.compareTo(serialDate0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1600);
      Date date0 = spreadsheetDate0.toDate();
      SerialDate serialDate0 = SerialDate.createInstance(date0);
      serialDate0.compare(spreadsheetDate0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(116);
      SerialDate serialDate0 = SerialDate.getPreviousDayOfWeek(2, (SerialDate) spreadsheetDate0);
      serialDate0.compare(spreadsheetDate0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2);
      // Undeclared exception!
      try { 
        spreadsheetDate0.isOnOrAfter((SerialDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2055);
      // Undeclared exception!
      try { 
        spreadsheetDate0.isOn((SerialDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1658);
      // Undeclared exception!
      try { 
        spreadsheetDate0.isInRange((SerialDate) null, (SerialDate) spreadsheetDate0, (-2852));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(821);
      // Undeclared exception!
      try { 
        spreadsheetDate0.isInRange((SerialDate) null, (SerialDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(936);
      // Undeclared exception!
      try { 
        spreadsheetDate0.isBefore((SerialDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(790);
      // Undeclared exception!
      try { 
        spreadsheetDate0.isAfter((SerialDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2375);
      // Undeclared exception!
      try { 
        spreadsheetDate0.compareTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(244);
      Instant instant0 = MockInstant.now();
      // Undeclared exception!
      try { 
        spreadsheetDate0.compareTo(instant0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.time.Instant cannot be cast to org.jfree.data.time.SerialDate
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(500);
      // Undeclared exception!
      try { 
        spreadsheetDate0.compare((SerialDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(6);
      SerialDate serialDate0 = SerialDate.addYears(1, spreadsheetDate0);
      spreadsheetDate0.isInRange(serialDate0, serialDate0, 3);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1658);
      spreadsheetDate0.isInRange((SerialDate) spreadsheetDate0, (SerialDate) spreadsheetDate0, 3);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = null;
      try {
        spreadsheetDate0 = new SpreadsheetDate(2958466);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // SpreadsheetDate: Serial must be in range 2 to 2958465.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = null;
      try {
        spreadsheetDate0 = new SpreadsheetDate((-4));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // SpreadsheetDate: Serial must be in range 2 to 2958465.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1, 3, 2395);
      spreadsheetDate0.isOnOrBefore(spreadsheetDate0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = null;
      try {
        spreadsheetDate0 = new SpreadsheetDate((-1261), 0, 2958465);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = null;
      try {
        spreadsheetDate0 = new SpreadsheetDate((-1036), (-1036), (-1036));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1600);
      spreadsheetDate0.toSerial();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(977);
      spreadsheetDate0.getMonth();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(977);
      spreadsheetDate0.getDayOfMonth();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(500);
      SpreadsheetDate spreadsheetDate1 = new SpreadsheetDate(2958465);
      SpreadsheetDate spreadsheetDate2 = new SpreadsheetDate(202);
      spreadsheetDate0.isInRange((SerialDate) spreadsheetDate2, (SerialDate) spreadsheetDate1, 182);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(349);
      SerialDate serialDate0 = SerialDate.getFollowingDayOfWeek(7, (SerialDate) spreadsheetDate0);
      serialDate0.isInRange((SerialDate) spreadsheetDate0, (SerialDate) spreadsheetDate0, (-1403));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1658);
      SerialDate serialDate0 = spreadsheetDate0.getNearestDayOfWeek(1);
      serialDate0.isInRange((SerialDate) spreadsheetDate0, serialDate0, 2);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(500);
      SpreadsheetDate spreadsheetDate1 = new SpreadsheetDate(2958465);
      boolean boolean0 = spreadsheetDate1.isInRange((SerialDate) spreadsheetDate0, (SerialDate) spreadsheetDate0, 2);
      assertFalse(boolean0);
      assertEquals(2958465, spreadsheetDate1.toSerial());
      assertEquals(31, spreadsheetDate1.getDayOfMonth());
      assertEquals(5, spreadsheetDate0.getMonth());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1600);
      spreadsheetDate0.isInRange((SerialDate) spreadsheetDate0, (SerialDate) spreadsheetDate0, 6);
      assertEquals(18, spreadsheetDate0.getDayOfMonth());
      assertEquals(1600, spreadsheetDate0.toSerial());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1600);
      Date date0 = spreadsheetDate0.toDate();
      SerialDate serialDate0 = SerialDate.createInstance(date0);
      boolean boolean0 = spreadsheetDate0.isInRange(serialDate0, serialDate0, 1);
      assertEquals(2014, serialDate0.getYYYY());
      assertEquals(18, spreadsheetDate0.getDayOfMonth());
      assertFalse(boolean0);
      assertEquals(14, serialDate0.getDayOfMonth());
      assertEquals(41684, serialDate0.toSerial());
      assertEquals(2, serialDate0.getMonth());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1600);
      boolean boolean0 = spreadsheetDate0.isInRange((SerialDate) spreadsheetDate0, (SerialDate) spreadsheetDate0, 1);
      assertEquals(18, spreadsheetDate0.getDayOfMonth());
      assertFalse(boolean0);
      assertEquals(1600, spreadsheetDate0.toSerial());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(31);
      SerialDate serialDate0 = SerialDate.createInstance(9999);
      boolean boolean0 = serialDate0.isInRange((SerialDate) spreadsheetDate0, (SerialDate) spreadsheetDate0);
      assertEquals(9999, serialDate0.toSerial());
      assertFalse(boolean0);
      assertEquals(30, spreadsheetDate0.getDayOfMonth());
      assertEquals(17, serialDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(977);
      SerialDate serialDate0 = SerialDate.addYears(2, spreadsheetDate0);
      boolean boolean0 = spreadsheetDate0.isInRange(serialDate0, serialDate0);
      assertEquals(1902, spreadsheetDate0.getYYYY());
      assertFalse(boolean0);
      assertEquals(3, serialDate0.getDayOfMonth());
      assertEquals(1904, serialDate0.getYYYY());
      assertEquals(9, serialDate0.getMonth());
      assertEquals(7, serialDate0.getDayOfWeek());
      assertEquals(3, spreadsheetDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1658);
      boolean boolean0 = spreadsheetDate0.isInRange((SerialDate) spreadsheetDate0, (SerialDate) spreadsheetDate0, 2);
      assertEquals(15, spreadsheetDate0.getDayOfMonth());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(977);
      boolean boolean0 = spreadsheetDate0.isOnOrAfter(spreadsheetDate0);
      assertTrue(boolean0);
      assertEquals(977, spreadsheetDate0.toSerial());
      assertEquals(3, spreadsheetDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(977);
      SerialDate serialDate0 = SerialDate.addYears(5, spreadsheetDate0);
      boolean boolean0 = spreadsheetDate0.isOnOrAfter(serialDate0);
      assertEquals(2803, serialDate0.toSerial());
      assertEquals(9, serialDate0.getMonth());
      assertEquals(1907, serialDate0.getYYYY());
      assertEquals(1902, spreadsheetDate0.getYYYY());
      assertEquals(3, spreadsheetDate0.getDayOfMonth());
      assertEquals(3, serialDate0.getDayOfMonth());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(977);
      boolean boolean0 = spreadsheetDate0.isAfter(spreadsheetDate0);
      assertFalse(boolean0);
      assertEquals(9, spreadsheetDate0.getMonth());
      assertEquals(3, spreadsheetDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(977);
      SerialDate serialDate0 = SerialDate.addYears(2, spreadsheetDate0);
      boolean boolean0 = spreadsheetDate0.isBefore(serialDate0);
      assertEquals(3, spreadsheetDate0.getDayOfMonth());
      assertEquals(9, serialDate0.getMonth());
      assertEquals(3, serialDate0.getDayOfMonth());
      assertTrue(boolean0);
      assertEquals(1904, serialDate0.getYYYY());
      assertEquals(9, spreadsheetDate0.getMonth());
      assertEquals(1708, serialDate0.toSerial());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(977);
      boolean boolean0 = spreadsheetDate0.isBefore(spreadsheetDate0);
      assertFalse(boolean0);
      assertEquals(3, spreadsheetDate0.getDayOfMonth());
      assertEquals(977, spreadsheetDate0.toSerial());
      assertEquals(9, spreadsheetDate0.getMonth());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(977);
      boolean boolean0 = spreadsheetDate0.isOn(spreadsheetDate0);
      assertEquals(9, spreadsheetDate0.getMonth());
      assertTrue(boolean0);
      assertEquals(3, spreadsheetDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(977);
      SerialDate serialDate0 = SerialDate.addYears(5, spreadsheetDate0);
      spreadsheetDate0.isOn(serialDate0);
      assertEquals(2803, serialDate0.toSerial());
      assertEquals(3, serialDate0.getDayOfMonth());
      assertEquals(1902, spreadsheetDate0.getYYYY());
      assertEquals(9, spreadsheetDate0.getMonth());
      assertEquals(9, serialDate0.getMonth());
      assertEquals(1907, serialDate0.getYYYY());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(977);
      spreadsheetDate0.equals(spreadsheetDate0);
      assertEquals(3, spreadsheetDate0.getDayOfMonth());
      assertEquals(977, spreadsheetDate0.toSerial());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(500);
      Object object0 = new Object();
      spreadsheetDate0.equals(object0);
      assertEquals(500, spreadsheetDate0.toSerial());
      assertEquals(14, spreadsheetDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2958465);
      SerialDate serialDate0 = SerialDate.createInstance(9999);
      boolean boolean0 = spreadsheetDate0.isInRange(serialDate0, serialDate0, 3);
      assertEquals(31, spreadsheetDate0.getDayOfMonth());
      assertEquals(9999, serialDate0.toSerial());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = null;
      try {
        spreadsheetDate0 = new SpreadsheetDate(2958465, 2, 2021);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid 'day' argument.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = null;
      try {
        spreadsheetDate0 = new SpreadsheetDate(0, 7, 3316);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid 'day' argument.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = null;
      try {
        spreadsheetDate0 = new SpreadsheetDate((-1409), 9982, 9982);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'month' argument must be in the range 1 to 12.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = null;
      try {
        spreadsheetDate0 = new SpreadsheetDate((-1881), (-294), 1905);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'month' argument must be in the range 1 to 12.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(977);
      assertEquals(1902, spreadsheetDate0.getYYYY());
      
      SerialDate serialDate0 = SerialDate.addYears(5, spreadsheetDate0);
      boolean boolean0 = spreadsheetDate0.equals(serialDate0);
      assertEquals(9, spreadsheetDate0.getMonth());
      assertFalse(serialDate0.equals((Object)spreadsheetDate0));
      assertEquals(2803, serialDate0.toSerial());
      assertEquals(3, spreadsheetDate0.getDayOfMonth());
      assertEquals(9, serialDate0.getMonth());
      assertEquals(1907, serialDate0.getYYYY());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(349);
      spreadsheetDate0.hashCode();
      assertEquals(349, spreadsheetDate0.toSerial());
      assertEquals(14, spreadsheetDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(977);
      int int0 = spreadsheetDate0.getDayOfWeek();
      assertEquals(3, spreadsheetDate0.getDayOfMonth());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(977);
      boolean boolean0 = spreadsheetDate0.isInRange((SerialDate) spreadsheetDate0, (SerialDate) spreadsheetDate0);
      assertEquals(3, spreadsheetDate0.getDayOfMonth());
      assertTrue(boolean0);
      assertEquals(977, spreadsheetDate0.toSerial());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1600);
      int int0 = spreadsheetDate0.compare(spreadsheetDate0);
      assertEquals(0, int0);
      assertEquals(18, spreadsheetDate0.getDayOfMonth());
  }
}
