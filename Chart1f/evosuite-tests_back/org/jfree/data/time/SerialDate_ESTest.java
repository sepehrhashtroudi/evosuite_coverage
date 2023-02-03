/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:09:24 GMT 2022
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.SerialDate;
import org.jfree.data.time.SpreadsheetDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SerialDate_ESTest extends SerialDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(13);
      SerialDate serialDate0 = spreadsheetDate0.getNearestDayOfWeek(2);
      assertEquals(15, serialDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = SerialDate.isLeapYear((-32));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      boolean boolean0 = SerialDate.isLeapYear((-2471));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = SerialDate.weekdayCodeToString(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(1142);
      int int0 = serialDate0.toSerial();
      assertEquals(15, serialDate0.getDayOfMonth());
      assertEquals(1142, int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(1900);
      serialDate0.toDate();
      assertEquals(14, serialDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      int int0 = SerialDate.leapYearCount(5469);
      assertEquals(866, int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      int int0 = SerialDate.lastDayOfMonth(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(2409);
      serialDate0.isOnOrBefore(serialDate0);
      assertEquals(5, serialDate0.getDayOfMonth());
      assertEquals(1, serialDate0.getDayOfWeek());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(2409);
      SerialDate serialDate1 = SerialDate.addMonths(6, serialDate0);
      boolean boolean0 = serialDate1.isOnOrBefore(serialDate0);
      assertEquals(2593, serialDate1.toSerial());
      assertEquals(5, serialDate1.getDayOfMonth());
      assertEquals(2409, serialDate0.toSerial());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(13);
      spreadsheetDate0.isOnOrAfter(spreadsheetDate0);
      assertEquals(12, spreadsheetDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(13);
      SerialDate serialDate1 = SerialDate.addMonths(5, serialDate0);
      boolean boolean0 = serialDate0.isOn(serialDate1);
      assertEquals(164, serialDate1.toSerial());
      assertEquals(12, serialDate0.getDayOfMonth());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(13);
      spreadsheetDate0.isInRange((SerialDate) spreadsheetDate0, (SerialDate) spreadsheetDate0, 3);
      assertEquals(1900, spreadsheetDate0.getYYYY());
      assertEquals(12, spreadsheetDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(826);
      spreadsheetDate0.isInRange((SerialDate) spreadsheetDate0, (SerialDate) spreadsheetDate0, 7);
      assertEquals(5, spreadsheetDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(13);
      spreadsheetDate0.isInRange((SerialDate) spreadsheetDate0, (SerialDate) spreadsheetDate0);
      assertEquals(12, spreadsheetDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(1947);
      SerialDate serialDate1 = SerialDate.addYears(1947, serialDate0);
      serialDate1.isInRange(serialDate0, serialDate0);
      assertEquals(713075, serialDate1.toSerial());
      assertEquals(3852, serialDate1.getYYYY());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(13);
      SerialDate serialDate0 = SerialDate.addDays(3, spreadsheetDate0);
      boolean boolean0 = spreadsheetDate0.isBefore(serialDate0);
      assertEquals(15, serialDate0.getDayOfMonth());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(13);
      spreadsheetDate0.isBefore(spreadsheetDate0);
      assertEquals(12, spreadsheetDate0.getDayOfMonth());
      assertEquals(1, spreadsheetDate0.getMonth());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(9);
      SerialDate serialDate0 = SerialDate.addYears(9, spreadsheetDate0);
      serialDate0.isAfter(spreadsheetDate0);
      assertEquals(8, spreadsheetDate0.getDayOfMonth());
      assertEquals(3296, serialDate0.toSerial());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2927);
      spreadsheetDate0.isAfter(spreadsheetDate0);
      assertEquals(5, spreadsheetDate0.getDayOfMonth());
      assertEquals(1, spreadsheetDate0.getMonth());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(2471);
      int int0 = serialDate0.getYYYY();
      assertEquals(6, serialDate0.getDayOfMonth());
      assertEquals(1906, int0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1061L);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      serialDate0.getMonth();
      assertEquals(25569, serialDate0.toSerial());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(929);
      int int0 = serialDate0.getDayOfWeek();
      assertEquals(17, serialDate0.getDayOfMonth());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1061L);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      serialDate0.getDayOfMonth();
      assertEquals(25569, serialDate0.toSerial());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(13);
      spreadsheetDate0.compare(spreadsheetDate0);
      assertEquals(12, spreadsheetDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(9);
      SerialDate serialDate0 = SerialDate.addYears(9, spreadsheetDate0);
      int int0 = serialDate0.compare(spreadsheetDate0);
      assertEquals(3287, int0);
      assertEquals(8, serialDate0.getDayOfMonth());
      assertEquals(8, spreadsheetDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.weekdayCodeToString((-3452));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3452
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.stringToWeekdayCode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.stringToMonthCode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.monthCodeToString(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // SerialDate.monthCodeToString: month outside valid range.
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.lastDayOfMonth((-270), (-270));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -270
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      // Undeclared exception!
      try { 
        serialDate0.isOnOrBefore((SerialDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(1355);
      // Undeclared exception!
      try { 
        serialDate0.isOnOrAfter((SerialDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(2409);
      // Undeclared exception!
      try { 
        serialDate0.isInRange(serialDate0, (SerialDate) null, 9999);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2);
      // Undeclared exception!
      try { 
        spreadsheetDate0.getPreviousDayOfWeek(2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // SpreadsheetDate: Serial must be in range 2 to 2958465.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(929);
      // Undeclared exception!
      try { 
        serialDate0.getFollowingDayOfWeek(1444);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid day-of-the-week code.
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1530);
      // Undeclared exception!
      try { 
        spreadsheetDate0.getEndOfCurrentMonth((SerialDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.createInstance((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2958465, 2958465, 3497);
      // Undeclared exception!
      try { 
        SerialDate.createInstance((Date) mockDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.createInstance((-3678));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // SpreadsheetDate: Serial must be in range 2 to 2958465.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.addYears(523, (SerialDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(3278);
      // Undeclared exception!
      try { 
        SerialDate.addYears(9999, spreadsheetDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.addMonths((-1663), (SerialDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(13);
      // Undeclared exception!
      try { 
        SerialDate.addMonths((-3), spreadsheetDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.addDays(1001, (SerialDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2812);
      // Undeclared exception!
      try { 
        SerialDate.addDays(2958465, spreadsheetDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // SpreadsheetDate: Serial must be in range 2 to 2958465.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(2409);
      SerialDate serialDate1 = SerialDate.getNearestDayOfWeek(6, serialDate0);
      boolean boolean0 = serialDate0.isOnOrAfter(serialDate1);
      assertEquals(7, serialDate1.getDayOfMonth());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.getNearestDayOfWeek(1144, (SerialDate) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid day-of-the-week code.
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2927);
      SerialDate serialDate0 = SerialDate.getFollowingDayOfWeek(1, (SerialDate) spreadsheetDate0);
      assertEquals(5, serialDate0.getDayOfMonth());
      assertEquals(1, serialDate0.getMonth());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(713);
      SerialDate serialDate1 = SerialDate.getFollowingDayOfWeek(2, serialDate0);
      assertEquals(16, serialDate1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.getFollowingDayOfWeek(1, (SerialDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2927);
      SerialDate serialDate0 = SerialDate.getPreviousDayOfWeek(2, (SerialDate) spreadsheetDate0);
      assertEquals(5, spreadsheetDate0.getDayOfMonth());
      assertEquals(30, serialDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(117);
      SerialDate serialDate0 = SerialDate.getPreviousDayOfWeek(4, (SerialDate) spreadsheetDate0);
      assertEquals(25, serialDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.getPreviousDayOfWeek(4, (SerialDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      int int0 = SerialDate.lastDayOfMonth(12, 12);
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidMonthCode(12);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidMonthCode(4);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidMonthCode((-187));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      String[] stringArray0 = SerialDate.getMonths(false);
      assertEquals(13, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidWeekdayCode(2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidWeekdayCode(1698);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidWeekdayCode(6);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(13);
      SerialDate serialDate0 = SerialDate.addDays(3, spreadsheetDate0);
      int int0 = spreadsheetDate0.compare(serialDate0);
      assertEquals(15, serialDate0.getDayOfMonth());
      assertEquals(1900, serialDate0.getYYYY());
      assertEquals((-3), int0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      int int0 = SerialDate.leapYearCount(3);
      assertEquals((-459), int0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      String string0 = SerialDate.relativeToString(1);
      assertEquals("Following", string0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      String string0 = SerialDate.relativeToString(0);
      assertEquals("Nearest", string0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      String string0 = SerialDate.relativeToString(154);
      assertEquals("ERROR : Relative To String", string0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      String string0 = SerialDate.weekInMonthToString(2213);
      assertEquals("SerialDate.weekInMonthToString(): invalid code.", string0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      String string0 = SerialDate.weekInMonthToString(2);
      assertEquals("Second", string0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      String string0 = SerialDate.weekInMonthToString(3);
      assertEquals("Third", string0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = SerialDate.weekInMonthToString(0);
      assertEquals("Last", string0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(1997);
      SerialDate serialDate1 = serialDate0.getFollowingDayOfWeek(5);
      assertEquals(22, serialDate1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(154);
      // Undeclared exception!
      try { 
        SerialDate.getFollowingDayOfWeek(1745, (SerialDate) spreadsheetDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid day-of-the-week code.
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(2409);
      SerialDate serialDate1 = SerialDate.addMonths(6, serialDate0);
      SerialDate serialDate2 = serialDate1.getPreviousDayOfWeek(2);
      assertEquals(4, serialDate2.getDayOfMonth());
      assertEquals(2593, serialDate1.toSerial());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(59);
      // Undeclared exception!
      try { 
        SerialDate.getPreviousDayOfWeek(59, (SerialDate) spreadsheetDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid day-of-the-week code.
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(59);
      SerialDate serialDate0 = SerialDate.addYears(3084, spreadsheetDate0);
      assertEquals(1126467, serialDate0.toSerial());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      boolean boolean0 = SerialDate.isLeapYear(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidWeekInMonthCode(9999);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidWeekInMonthCode(2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidWeekInMonthCode(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidWeekInMonthCode(3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidWeekInMonthCode(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      int int0 = SerialDate.stringToMonthCode("July");
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      int int0 = SerialDate.stringToMonthCode("The 'month' argument must be in the range 1 to 12.");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      int int0 = SerialDate.stringToMonthCode("2");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      int int0 = SerialDate.stringToMonthCode("");
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.monthCodeToQuarter(1900);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // SerialDate.monthCodeToQuarter: invalid month code.
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      int int0 = SerialDate.monthCodeToQuarter(12);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      int int0 = SerialDate.monthCodeToQuarter(11);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      int int0 = SerialDate.monthCodeToQuarter(7);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      int int0 = SerialDate.monthCodeToQuarter(6);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      int int0 = SerialDate.monthCodeToQuarter(4);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      int int0 = SerialDate.monthCodeToQuarter(3);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      int int0 = SerialDate.monthCodeToQuarter(2);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      int int0 = SerialDate.monthCodeToQuarter(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.monthCodeToString((-1736387343), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // SerialDate.monthCodeToString: month outside valid range.
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = SerialDate.monthCodeToString(12);
      assertEquals("December", string0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = SerialDate.monthCodeToString(11, true);
      assertEquals("Nov", string0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidMonthCode(9);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String string0 = SerialDate.monthCodeToString(7);
      assertEquals("July", string0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      String string0 = SerialDate.monthCodeToString(6, false);
      assertEquals("June", string0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3, 1261, 1573);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      String string0 = serialDate0.toString();
      assertEquals("22-May-2012", string0);
      assertEquals(41051, serialDate0.toSerial());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidMonthCode(3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidMonthCode(2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidMonthCode(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      String[] stringArray0 = SerialDate.getMonths(true);
      assertEquals(13, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      int int0 = SerialDate.stringToWeekdayCode("Wednesday");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      int int0 = SerialDate.stringToWeekdayCode("");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      int int0 = SerialDate.stringToWeekdayCode("%B'Byk^;O.");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.getNearestDayOfWeek(7, (SerialDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(13);
      SerialDate serialDate0 = SerialDate.getNearestDayOfWeek(6, (SerialDate) spreadsheetDate0);
      assertEquals(12, serialDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidWeekdayCode(4);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidWeekdayCode(3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      boolean boolean0 = SerialDate.isValidWeekdayCode(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(1952);
      // Undeclared exception!
      try { 
        serialDate0.getNearestDayOfWeek(1292);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid day-of-the-week code.
         //
         verifyException("org.jfree.data.time.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(2409);
      String string0 = serialDate0.toString();
      assertEquals("5-August-1906", string0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(13);
      spreadsheetDate0.setDescription((String) null);
      assertEquals(12, spreadsheetDate0.getDayOfMonth());
      assertEquals(1900, spreadsheetDate0.getYYYY());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2927);
      SerialDate serialDate0 = spreadsheetDate0.getEndOfCurrentMonth(spreadsheetDate0);
      assertEquals(2953, serialDate0.toSerial());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(13);
      spreadsheetDate0.getDescription();
      assertEquals(12, spreadsheetDate0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(1952);
      SerialDate serialDate1 = serialDate0.getFollowingDayOfWeek(5);
      assertEquals(11, serialDate1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      String[] stringArray0 = SerialDate.getMonths();
      assertEquals(13, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      String string0 = SerialDate.weekdayCodeToString(2);
      assertEquals("Monday", string0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerialDate.createInstance(0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }
}
