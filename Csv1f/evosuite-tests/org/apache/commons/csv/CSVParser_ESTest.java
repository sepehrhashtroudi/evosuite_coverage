/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 22:17:43 GMT 2022
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CSVParser_ESTest extends CSVParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("4fTO9O");
      stringReader0.close();
      CSVParser cSVParser0 = new CSVParser(stringReader0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        cSVParser0.forEach(consumer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Stream closed
         //
         verifyException("org.apache.commons.csv.CSVParser$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = new CSVParser("Q", cSVFormat0);
      Iterator<CSVRecord> iterator0 = cSVParser0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = new CSVParser("", cSVFormat0);
      List<CSVRecord> list0 = cSVParser0.getRecords();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("&wf.gV");
      CSVParser cSVParser0 = new CSVParser(stringReader0);
      stringReader0.close();
      try { 
        cSVParser0.getRecords();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("]+R!x1!K=;uYe^Gl9");
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = new CSVParser(stringReader0, cSVFormat0);
      stringReader0.close();
      try { 
        cSVParser0.getRecord();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CSVParser cSVParser0 = null;
      try {
        cSVParser0 = new CSVParser("8U41v)O0", (CSVFormat) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.csv.CSVParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[4];
      CSVFormat cSVFormat0 = new CSVFormat('\'', '\'', '\'', '/', true, true, "T[U{^Y^w)w<Ra`>#=$I", stringArray0);
      CSVParser cSVParser0 = null;
      try {
        cSVParser0 = new CSVParser("T[U{^Y^w)w<Ra`>#=$I", cSVFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The encapsulator character and the delimiter cannot be the same (\"'\")
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("uu&XTzBwG>O");
      CSVParser cSVParser0 = null;
      try {
        cSVParser0 = new CSVParser(stringReader0, (CSVFormat) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.csv.CSVParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      String[] stringArray0 = new String[3];
      CSVFormat cSVFormat0 = new CSVFormat('0', '}', 'r', '0', false, false, "^6\"3:", stringArray0);
      CSVParser cSVParser0 = null;
      try {
        cSVParser0 = new CSVParser(stringReader0, cSVFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The escape character and the delimiter cannot be the same (\"0\")
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      stringReader0.close();
      CSVParser cSVParser0 = null;
      try {
        cSVParser0 = new CSVParser(stringReader0, cSVFormat1);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVParser cSVParser0 = new CSVParser("No more CSV records available", cSVFormat1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVParser cSVParser0 = new CSVParser("", cSVFormat1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\n");
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = new CSVParser(stringReader0, cSVFormat0);
      cSVParser0.getRecord();
      int int0 = cSVParser0.getLineNumber();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("pFad%Ti+WZ}M!");
      String[] stringArray0 = new String[2];
      CSVFormat cSVFormat0 = new CSVFormat('i', 'A', 'A', 'A', false, false, "pFad%Ti+WZ}M!", stringArray0);
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('M');
      CSVParser cSVParser0 = new CSVParser(stringReader0, cSVFormat1);
      CSVRecord cSVRecord0 = cSVParser0.getRecord();
      assertNotNull(cSVRecord0);
      assertEquals("[pFad%T, +WZ}M!]", cSVRecord0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("&wf.gV");
      CSVParser cSVParser0 = new CSVParser(stringReader0);
      List<CSVRecord> list0 = cSVParser0.getRecords();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CSVParser cSVParser0 = null;
      try {
        cSVParser0 = new CSVParser((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVParser cSVParser0 = new CSVParser("No more CSV records available", cSVFormat0);
      int int0 = cSVParser0.getLineNumber();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = new CSVParser("#}zVZ", cSVFormat0);
      Consumer<CSVRecord> consumer0 = (Consumer<CSVRecord>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cSVParser0.forEach(consumer0);
      CSVRecord cSVRecord0 = cSVParser0.getRecord();
      assertNull(cSVRecord0);
  }
}
