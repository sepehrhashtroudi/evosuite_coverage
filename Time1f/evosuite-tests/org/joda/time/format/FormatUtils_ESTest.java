/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 02:42:23 GMT 2022
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.format.FormatUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FormatUtils_ESTest extends FormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FormatUtils.createErrorMessage("i", 1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FormatUtils.createErrorMessage("", 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FormatUtils.calculateDigitCount(100L);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FormatUtils.calculateDigitCount(0L);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(27);
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, 19);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, 100);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (long) 10);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("2147483648");
      FormatUtils.appendUnpaddedInteger(stringBuffer0, 100L);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-17L), (-4071));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FormatUtils.parseTwoDigits("?m", 0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.writeUnpaddedInteger((Writer) null, 1465L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.writeUnpaddedInteger((Writer) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.writePaddedInteger((Writer) null, 0L, (-6));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.parseTwoDigits("2147483648", (-1551));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.parseTwoDigits((String) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.createErrorMessage((String) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.appendUnpaddedInteger((StringBuffer) null, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.appendPaddedInteger((StringBuffer) null, 1914L, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FormatUtils.calculateDigitCount(1000L);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FormatUtils.calculateDigitCount(10);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (-2263));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(">Us?}_huaSJ");
      FormatUtils.appendUnpaddedInteger(stringBuffer0, (-1));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.writePaddedInteger((Writer) null, 1644, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      FormatUtils.writePaddedInteger((Writer) stringWriter0, 576, 13411819);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(10);
      FormatUtils.writePaddedInteger((Writer) stringWriter0, 10, 10);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      FormatUtils.writePaddedInteger((Writer) stringWriter0, 0, 1160);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-1), 0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, 15, 15);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("_H@M");
      FormatUtils.appendPaddedInteger(stringBuffer0, 1, 1955);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.appendPaddedInteger((StringBuffer) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (-4795), 0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FormatUtils.createErrorMessage("org.joda.time.format.FormatUtils", 4);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FormatUtils.createErrorMessage("org.joda.time.format.FormatUtils", 2596);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FormatUtils.createErrorMessage("/5`bva<ot@sYJ3?", (-1));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.createErrorMessage("", (-3695));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FormatUtils.calculateDigitCount((-31L));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FormatUtils.calculateDigitCount((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FormatUtils.calculateDigitCount((-3146L));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, 0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(27);
      FormatUtils.appendUnpaddedInteger(stringBuffer0, 18);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("");
      FormatUtils.appendUnpaddedInteger(stringBuffer0, (-1306L));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      FormatUtils.appendUnpaddedInteger(stringBuffer0, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.appendUnpaddedInteger((StringBuffer) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("\" is too short");
      FormatUtils.appendUnpaddedInteger(stringBuffer0, 1160);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.writePaddedInteger((Writer) null, 13411779, 13411779);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      FormatUtils.writePaddedInteger((Writer) stringWriter0, 661L, 13421772);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(">Us?}_huaSJ");
      FormatUtils.appendPaddedInteger(stringBuffer0, (-9223372036854775808L), 0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      // Undeclared exception!
      FormatUtils.appendPaddedInteger(stringBuffer0, 1073741824, 1073741824);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(860);
      FormatUtils.appendPaddedInteger(stringBuffer0, 860, 860);
      assertEquals(860, stringBuffer0.length());
      assertEquals("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000860", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.appendPaddedInteger((StringBuffer) null, 10, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("\" is too short");
      FormatUtils.appendPaddedInteger(stringBuffer0, 26L, 0);
      assertEquals(16, stringBuffer0.length());
      assertEquals("\" is too short26", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int int0 = FormatUtils.parseTwoDigits("/5`bva<ot@sYJ3?", 0);
      assertEquals((-5), int0);
  }
}
