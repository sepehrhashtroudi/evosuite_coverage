/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 22:22:23 GMT 2022
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import org.apache.commons.csv.CSVFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CSVFormat_ESTest extends CSVFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = cSVFormat0.withEscape('+');
      CSVFormat cSVFormat2 = cSVFormat1.withDelimiter('c');
      assertTrue(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('+', cSVFormat1.getEscape());
      assertEquals('\"', cSVFormat2.getEncapsulator());
      assertEquals('c', cSVFormat2.getDelimiter());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals(',', cSVFormat1.getDelimiter());
      assertEquals('+', cSVFormat2.getEscape());
      assertFalse(cSVFormat1.isCommentingEnabled());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withEncapsulator('4');
      CSVFormat cSVFormat2 = cSVFormat1.withEmptyLinesIgnored(true);
      CSVFormat cSVFormat3 = cSVFormat2.withCommentStart('\'');
      String[] stringArray0 = new String[8];
      String string0 = cSVFormat3.format(stringArray0);
      assertEquals('\'', cSVFormat3.getCommentStart());
      assertEquals('\t', cSVFormat3.getDelimiter());
      assertEquals('4', cSVFormat3.getEncapsulator());
      assertTrue(cSVFormat2.isEmptyLinesIgnored());
      assertEquals("44", string0);
      assertEquals('\\', cSVFormat3.getEscape());
      assertFalse(cSVFormat3.isSurroundingSpacesIgnored());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[4];
      CSVFormat cSVFormat0 = new CSVFormat('l', '3', '3', '5', true, true, (String) null, stringArray0);
      try { 
        cSVFormat0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The comment start character and the encapsulator cannot be the same (\"3\")
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = cSVFormat0.MYSQL.withSurroundingSpacesIgnored(true);
      String[] stringArray0 = new String[2];
      CSVFormat cSVFormat2 = cSVFormat1.withHeader(stringArray0);
      assertEquals('\t', cSVFormat2.getDelimiter());
      assertTrue(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('\uFFFE', cSVFormat1.getEncapsulator());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\\', cSVFormat2.getEscape());
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isCommentingEnabled());
      assertEquals('\\', cSVFormat1.getEscape());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('d');
      CSVFormat cSVFormat2 = cSVFormat1.withSurroundingSpacesIgnored(false);
      assertEquals('d', cSVFormat2.getCommentStart());
      assertEquals('\\', cSVFormat2.getEscape());
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('d', cSVFormat1.getCommentStart());
      assertEquals('\t', cSVFormat2.getDelimiter());
      assertFalse(cSVFormat2.isSurroundingSpacesIgnored());
      assertEquals('\uFFFE', cSVFormat1.getEncapsulator());
      assertEquals('\\', cSVFormat1.getEscape());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('\'');
      CSVFormat cSVFormat2 = cSVFormat1.withLineSeparator("'");
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertEquals('\\', cSVFormat2.getEscape());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\uFFFE', cSVFormat1.getEncapsulator());
      assertEquals('\'', cSVFormat1.getCommentStart());
      assertEquals('\'', cSVFormat2.getCommentStart());
      assertEquals('\t', cSVFormat2.getDelimiter());
      assertEquals('\\', cSVFormat1.getEscape());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('2');
      CSVFormat cSVFormat2 = cSVFormat1.withEscape('Y');
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('Y', cSVFormat2.getEscape());
      assertEquals('\t', cSVFormat2.getDelimiter());
      assertEquals('\uFFFE', cSVFormat1.getEncapsulator());
      assertEquals('\\', cSVFormat1.getEscape());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('2', cSVFormat2.getCommentStart());
      assertEquals('2', cSVFormat1.getCommentStart());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = cSVFormat0.TDF.withEncapsulator('V');
      assertTrue(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertEquals('\uFFFE', cSVFormat1.getCommentStart());
      assertEquals('V', cSVFormat1.getEncapsulator());
      assertTrue(cSVFormat1.isSurroundingSpacesIgnored());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('`');
      CSVFormat cSVFormat2 = cSVFormat1.withHeader((String[]) null);
      CSVFormat cSVFormat3 = cSVFormat2.withEncapsulator('^');
      assertFalse(cSVFormat3.isSurroundingSpacesIgnored());
      assertEquals(',', cSVFormat3.getDelimiter());
      assertEquals('\uFFFE', cSVFormat3.getEscape());
      assertEquals('^', cSVFormat3.getEncapsulator());
      assertFalse(cSVFormat3.isEmptyLinesIgnored());
      assertEquals('`', cSVFormat3.getCommentStart());
      assertEquals('\"', cSVFormat2.getEncapsulator());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('1');
      CSVFormat cSVFormat2 = cSVFormat1.withEmptyLinesIgnored(false);
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertEquals(',', cSVFormat2.getDelimiter());
      assertEquals(',', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('\"', cSVFormat2.getEncapsulator());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertEquals('1', cSVFormat1.getCommentStart());
      assertEquals('1', cSVFormat2.getCommentStart());
      assertFalse(cSVFormat2.isEmptyLinesIgnored());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVFormat cSVFormat1 = cSVFormat0.TDF.withDelimiter('N');
      assertTrue(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('N', cSVFormat1.getDelimiter());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertEquals('\uFFFE', cSVFormat1.getCommentStart());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertTrue(cSVFormat1.isSurroundingSpacesIgnored());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('`');
      CSVFormat cSVFormat2 = cSVFormat1.withDelimiter('`');
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertTrue(cSVFormat2.isCommentingEnabled());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('`', cSVFormat1.getCommentStart());
      assertEquals('`', cSVFormat2.getDelimiter());
      assertEquals(',', cSVFormat1.getDelimiter());
      assertEquals('\"', cSVFormat2.getEncapsulator());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.RFC4180.withCommentStart('\uFFFE');
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertFalse(cSVFormat1.isCommentingEnabled());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertEquals(',', cSVFormat1.getDelimiter());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = cSVFormat0.TDF.withCommentStart('E');
      boolean boolean0 = cSVFormat1.isSurroundingSpacesIgnored();
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertEquals('E', cSVFormat1.getCommentStart());
      assertTrue(cSVFormat1.isEmptyLinesIgnored());
      assertTrue(boolean0);
      assertEquals('\"', cSVFormat1.getEncapsulator());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      boolean boolean0 = cSVFormat0.isEscaping();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      boolean boolean0 = cSVFormat0.isEscaping();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      boolean boolean0 = cSVFormat0.isEncapsulating();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      boolean boolean0 = cSVFormat0.isEncapsulating();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      boolean boolean0 = cSVFormat0.isEmptyLinesIgnored();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.TDF.withLineSeparator((String) null);
      cSVFormat1.getLineSeparator();
      assertTrue(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertEquals('\uFFFE', cSVFormat1.getCommentStart());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertTrue(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('\t', cSVFormat1.getDelimiter());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withLineSeparator("");
      cSVFormat1.getLineSeparator();
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('\\', cSVFormat1.getEscape());
      assertEquals('\uFFFE', cSVFormat1.getEncapsulator());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\uFFFE', cSVFormat1.getCommentStart());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      String[] stringArray0 = cSVFormat0.getHeader();
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      String[] stringArray0 = new String[3];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      cSVFormat1.getHeader();
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\uFFFE', cSVFormat1.getCommentStart());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertEquals(',', cSVFormat1.getDelimiter());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      cSVFormat1.getHeader();
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertFalse(cSVFormat1.isCommentingEnabled());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals(',', cSVFormat1.getDelimiter());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[6];
      CSVFormat cSVFormat0 = new CSVFormat('0', 't', '0', 't', true, true, "KmdX`4p9rvu", stringArray0);
      CSVFormat cSVFormat1 = cSVFormat0.MYSQL.withEscape('4');
      char char0 = cSVFormat1.getEscape();
      assertEquals('4', char0);
      assertEquals('t', cSVFormat0.getEncapsulator());
      assertEquals('0', cSVFormat0.getCommentStart());
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\uFFFE', cSVFormat1.getEncapsulator());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertFalse(cSVFormat1.isCommentingEnabled());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[5];
      CSVFormat cSVFormat0 = new CSVFormat('B', 'B', 'B', 'm', true, true, "", stringArray0);
      char char0 = cSVFormat0.getEscape();
      assertTrue(cSVFormat0.isEmptyLinesIgnored());
      assertTrue(cSVFormat0.isSurroundingSpacesIgnored());
      assertEquals('B', cSVFormat0.getDelimiter());
      assertEquals('B', cSVFormat0.getEncapsulator());
      assertEquals('B', cSVFormat0.getCommentStart());
      assertEquals('m', char0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withEncapsulator('9');
      char char0 = cSVFormat1.getEncapsulator();
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('\\', cSVFormat1.getEscape());
      assertEquals('9', char0);
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\uFFFE', cSVFormat1.getCommentStart());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withEncapsulator('Q');
      char char0 = cSVFormat1.getEncapsulator();
      assertEquals('\uFFFE', cSVFormat1.getCommentStart());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('Q', char0);
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\\', cSVFormat1.getEscape());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      char char0 = cSVFormat0.getDelimiter();
      assertEquals(',', char0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[9];
      CSVFormat cSVFormat0 = new CSVFormat('0', '0', '0', '0', false, true, "!EsHU", stringArray0);
      char char0 = cSVFormat0.getDelimiter();
      assertTrue(cSVFormat0.isEmptyLinesIgnored());
      assertEquals('0', cSVFormat0.getEscape());
      assertFalse(cSVFormat0.isSurroundingSpacesIgnored());
      assertEquals('0', char0);
      assertEquals('0', cSVFormat0.getCommentStart());
      assertEquals('0', cSVFormat0.getEncapsulator());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('8');
      char char0 = cSVFormat1.getCommentStart();
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\\', cSVFormat1.getEscape());
      assertEquals('8', char0);
      assertEquals('\uFFFE', cSVFormat1.getEncapsulator());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('U');
      char char0 = cSVFormat1.getCommentStart();
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertEquals('U', char0);
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals(',', cSVFormat1.getDelimiter());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      String[] stringArray0 = new String[0];
      String string0 = cSVFormat0.format(stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[8];
      CSVFormat cSVFormat0 = new CSVFormat('v', 'v', 'v', 'T', false, false, "opdCe", stringArray0);
      // Undeclared exception!
      try { 
        cSVFormat0.EXCEL.parse((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      // Undeclared exception!
      try { 
        cSVFormat0.format((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.csv.CSVPrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      boolean boolean0 = cSVFormat0.isCommentingEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      boolean boolean0 = cSVFormat0.isSurroundingSpacesIgnored();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      char char0 = cSVFormat0.getEscape();
      assertEquals('\uFFFE', char0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      String string0 = cSVFormat0.getLineSeparator();
      assertEquals("\n", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      char char0 = cSVFormat0.getEncapsulator();
      assertEquals('\"', char0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      boolean boolean0 = cSVFormat0.isEmptyLinesIgnored();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      char char0 = cSVFormat0.getCommentStart();
      assertEquals('\uFFFE', char0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String[] stringArray0 = new String[6];
      CSVFormat cSVFormat0 = new CSVFormat('S', 'I', 'I', 'L', false, false, "p\"&hpZul&+2H,:sW!", stringArray0);
      char char0 = cSVFormat0.getDelimiter();
      assertFalse(cSVFormat0.isSurroundingSpacesIgnored());
      assertEquals('I', cSVFormat0.getCommentStart());
      assertEquals('S', char0);
      assertEquals('L', cSVFormat0.getEscape());
      assertEquals('I', cSVFormat0.getEncapsulator());
      assertFalse(cSVFormat0.isEmptyLinesIgnored());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String[] stringArray0 = new String[6];
      CSVFormat cSVFormat0 = new CSVFormat('S', 'I', 'I', 'L', false, false, "p\"&hpZul&+2H,:sW!", stringArray0);
      String string0 = cSVFormat0.toString();
      assertEquals("Delimiter=<S> Escape=<L> Encapsulator=<I> CommentStart=<I>", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      String string0 = cSVFormat0.TDF.toString();
      assertEquals("Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('d');
      boolean boolean0 = cSVFormat1.isCommentingEnabled();
      assertEquals('\uFFFE', cSVFormat1.getEncapsulator());
      assertEquals('\\', cSVFormat1.getEscape());
      assertEquals('d', cSVFormat1.getCommentStart());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertFalse(cSVFormat0.isCommentingEnabled());
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertTrue(boolean0);
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      String string0 = cSVFormat0.MYSQL.toString();
      assertEquals("Delimiter=<\t> Escape=<\\>", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVFormat cSVFormat1 = cSVFormat0.withEscape('V');
      CSVFormat cSVFormat2 = cSVFormat1.withEncapsulator('P');
      CSVFormat cSVFormat3 = cSVFormat2.withCommentStart('V');
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        cSVFormat3.format(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The comment start and the escape character cannot be the same (\"V\")
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      cSVFormat0.MYSQL.validate();
      assertEquals(',', cSVFormat0.getDelimiter());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String[] stringArray0 = new String[4];
      CSVFormat cSVFormat0 = new CSVFormat('e', 'S', 'e', 'U', false, false, "D0oWj", stringArray0);
      StringReader stringReader0 = new StringReader("\"<2T~y{p,jl(");
      // Undeclared exception!
      try { 
        cSVFormat0.parse(stringReader0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The comment start character and the delimiter cannot be the same (\"e\")
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = cSVFormat0.withDelimiter('#');
      CSVFormat cSVFormat2 = cSVFormat1.withEscape('#');
      StringReader stringReader0 = new StringReader("");
      // Undeclared exception!
      try { 
        cSVFormat2.parse(stringReader0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The escape character and the delimiter cannot be the same (\"#\")
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      StringReader stringReader0 = new StringReader("ev");
      CSVFormat cSVFormat1 = cSVFormat0.withDelimiter('\"');
      // Undeclared exception!
      try { 
        cSVFormat1.parse(stringReader0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The encapsulator character and the delimiter cannot be the same (\"\"\")
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      String[] stringArray0 = new String[2];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      assertEquals(',', cSVFormat1.getDelimiter());
      assertTrue(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\uFFFE', cSVFormat1.getCommentStart());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVFormat cSVFormat1 = cSVFormat0.withSurroundingSpacesIgnored(true);
      CSVFormat cSVFormat2 = cSVFormat1.withEscape('y');
      assertTrue(cSVFormat1.isSurroundingSpacesIgnored());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals(',', cSVFormat2.getDelimiter());
      assertEquals(',', cSVFormat1.getDelimiter());
      assertEquals('\uFFFE', cSVFormat2.getCommentStart());
      assertEquals('\"', cSVFormat2.getEncapsulator());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertEquals('y', cSVFormat2.getEscape());
      assertEquals('\uFFFE', cSVFormat1.getCommentStart());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      StringReader stringReader0 = new StringReader("ev");
      cSVFormat0.RFC4180.parse(stringReader0);
      assertEquals('\"', cSVFormat0.getEncapsulator());
      assertFalse(cSVFormat0.isCommentingEnabled());
      assertEquals(',', cSVFormat0.getDelimiter());
  }
}