/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:01:04 GMT 2022
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PipedReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.ZoneInfoCompiler;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZoneInfoCompiler_ESTest extends ZoneInfoCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream0, hashMap0);
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = ZoneInfoCompiler.parseOptional("\nZoneChar: ");
      assertEquals("\nZoneChar: ", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("OI7");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream0, (Map<String, DateTimeZone>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.test("HEe>_%\"+o758y", (DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseYear((String) null, 1705);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseTime((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseOptional((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseMonth((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseDayOfWeek("=UMsLBjd-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"=UMsLBjd-\" for dayOfWeek is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      // Undeclared exception!
      try { 
        zoneInfoCompiler0.parseDataFile((BufferedReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      PipedReader pipedReader0 = new PipedReader(17);
      BufferedReader bufferedReader0 = new BufferedReader(pipedReader0, 823);
      try { 
        zoneInfoCompiler0.parseDataFile(bufferedReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile((File) null, "");
      File[] fileArray0 = new File[7];
      // Undeclared exception!
      try { 
        zoneInfoCompiler0.compile(mockFile0, fileArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File file0 = MockFile.createTempFile("&n=T-H", "sv7.zlT");
      File[] fileArray0 = new File[8];
      fileArray0[0] = file0;
      MockFile mockFile0 = new MockFile(file0, "W>XWiK");
      fileArray0[1] = (File) mockFile0;
      try { 
        zoneInfoCompiler0.compile(file0, fileArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      StringReader stringReader0 = new StringReader("-cf?yb3(wV)2B/L\u0001");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("M");
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = null;
      try {
        zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"M\" for monthOfYear is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("", "");
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[6];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Unknown line: ");
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-94);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      stringArray0[0] = "Unknown line: ";
      stringArray0[1] = "ivqY'h+!";
      stringArray0[2] = "cQ5%jYQPtQgo\"";
      stringArray0[3] = "";
      stringArray0[4] = "2lrM";
      stringArray0[5] = "|PMIi$8/J+yS";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[6];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Unknown line: ");
      byte[] byteArray0 = new byte[9];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      stringArray0[0] = "Unknown line: ";
      stringArray0[1] = "ivqY'h+!";
      stringArray0[2] = "cQ5%jYQPtQgo\"";
      stringArray0[3] = "";
      stringArray0[4] = "2lrM";
      stringArray0[5] = "|PMIi$8/J+yS";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File file0 = MockFile.createTempFile("-verbose", ",2gy&}$4");
      File[] fileArray0 = new File[2];
      fileArray0[0] = file0;
      fileArray0[1] = file0;
      try { 
        zoneInfoCompiler0.compile(file0, fileArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination is not a directory: /tmp/-verbose0,2gy&}$4
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("\"d#7tu6");
      File[] fileArray0 = new File[0];
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile(mockFile0, fileArray0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      boolean boolean0 = ZoneInfoCompiler.test("A)3{h", dateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('s');
      assertEquals('s', char0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('g');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('W');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('U');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('{');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseTime("0VX^%LsHriMh.I9]");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseTime("-Duqin<m9dy]h:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -Duqin<m9dy]h:
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = ZoneInfoCompiler.parseOptional("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseYear("mC:ST$?<69x", 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"mc:st$?<69x\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZoneInfoCompiler.getLenientISOChronology();
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseTime("'{bHS!2jsD<(S6:%");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // '{bHS!2jsD<(S6:%
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear1 = ZoneInfoCompiler.getStartOfYear();
      assertSame(zoneInfoCompiler_DateTimeOfYear1, zoneInfoCompiler_DateTimeOfYear0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[5];
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseDayOfWeek((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseMonth("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\" for monthOfYear is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile((File) null, "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile(mockFile0, (File[]) null);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean boolean0 = ZoneInfoCompiler.verbose();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      String string0 = zoneInfoCompiler_DateTimeOfYear0.toString();
      assertEquals("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      zoneInfoCompiler_DateTimeOfYear0.addRecurring(dateTimeZoneBuilder0, "~AQfY(-rZ/s>", 35, 35, 35);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      zoneInfoCompiler_DateTimeOfYear0.addCutover(dateTimeZoneBuilder0, (-830));
  }
}