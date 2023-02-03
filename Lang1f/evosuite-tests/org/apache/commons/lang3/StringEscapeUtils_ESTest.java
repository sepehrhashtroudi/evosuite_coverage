/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 19:47:44 GMT 2022
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang3.StringEscapeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class StringEscapeUtils_ESTest extends StringEscapeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringEscapeUtils.CsvUnescaper stringEscapeUtils_CsvUnescaper0 = new StringEscapeUtils.CsvUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      stringEscapeUtils_CsvUnescaper0.translate((CharSequence) "\"!", (Writer) stringWriter0);
      assertEquals("\"!", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringEscapeUtils.CsvUnescaper stringEscapeUtils_CsvUnescaper0 = (StringEscapeUtils.CsvUnescaper)StringEscapeUtils.UNESCAPE_CSV;
      // Undeclared exception!
      try { 
        stringEscapeUtils_CsvUnescaper0.translate((CharSequence) " ", 0, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.StringEscapeUtils$CsvUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringEscapeUtils.CsvUnescaper stringEscapeUtils_CsvUnescaper0 = new StringEscapeUtils.CsvUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        stringEscapeUtils_CsvUnescaper0.translate((CharSequence) "nf{", (-992), (Writer) stringWriter0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // CsvUnescaper should never reach the [1] index
         //
         verifyException("org.apache.commons.lang3.StringEscapeUtils$CsvUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringEscapeUtils.CsvEscaper stringEscapeUtils_CsvEscaper0 = new StringEscapeUtils.CsvEscaper();
      StringWriter stringWriter0 = new StringWriter(34);
      // Undeclared exception!
      try { 
        stringEscapeUtils_CsvEscaper0.translate((CharSequence) "[&&A`'W_O(DC2", (-7), (Writer) stringWriter0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // CsvEscaper should never reach the [1] index
         //
         verifyException("org.apache.commons.lang3.StringEscapeUtils$CsvEscaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringEscapeUtils.CsvUnescaper stringEscapeUtils_CsvUnescaper0 = new StringEscapeUtils.CsvUnescaper();
      StringWriter stringWriter0 = new StringWriter(0);
      int int0 = stringEscapeUtils_CsvUnescaper0.translate((CharSequence) "tAx.<", 0, (Writer) stringWriter0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringEscapeUtils.CsvEscaper stringEscapeUtils_CsvEscaper0 = new StringEscapeUtils.CsvEscaper();
      StringWriter stringWriter0 = new StringWriter();
      stringEscapeUtils_CsvEscaper0.translate((CharSequence) "tKD\"W", 0, (Writer) stringWriter0);
      assertEquals("\"tKD\"\"W\"", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJson((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeEcmaScript("\u00B8");
      String string1 = StringEscapeUtils.unescapeJson(string0);
      assertEquals("\u00B8", string1);
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml4((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml4("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml3((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml3("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeEcmaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "";
      String string1 = StringEscapeUtils.unescapeEcmaScript(string0);
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeCsv((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeCsv("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJson((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJson("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml4((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml3((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeEcmaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeEcmaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeCsv((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeCsv("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = "W\\uecd";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJson(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Less than 4 hex digits in unicode value: '\\uecd' due to end of CharSequence
         //
         verifyException("org.apache.commons.lang3.text.translate.UnicodeUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = "\\u";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Less than 4 hex digits in unicode value: '\\u' due to end of CharSequence
         //
         verifyException("org.apache.commons.lang3.text.translate.UnicodeUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = "1\\u";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeEcmaScript(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Less than 4 hex digits in unicode value: '\\u' due to end of CharSequence
         //
         verifyException("org.apache.commons.lang3.text.translate.UnicodeUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeCsv("\"");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringEscapeUtils.CsvUnescaper stringEscapeUtils_CsvUnescaper0 = new StringEscapeUtils.CsvUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      stringEscapeUtils_CsvUnescaper0.translate((CharSequence) "\"/", (Writer) stringWriter0);
      assertEquals("\"/", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeCsv("\"l\"\"8<DWSG2>67\"");
      assertEquals("l\"8<DWSG2>67", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeCsv("l\"8<DWSG2>67");
      assertEquals("\"l\"\"8<DWSG2>67\"", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeCsv("g<B{?AgwHyr}xr0x>*+");
      assertEquals("g<B{?AgwHyr}xr0x>*+", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeEcmaScript("&amp;larr;");
      assertEquals("&amp;larr;", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("g<B{?AgwHyr}xr0x>*+");
      assertEquals("g<B{?AgwHyr}xr0x>*+", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("g<B{?AgwHyr}xr0x>*+");
      assertEquals("g<B{?AgwHyr}xr0x>*+", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJson("g<B{?AgwHyr}xr0x>*+");
      assertEquals("g<B{?AgwHyr}xr0x>*+", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("&quot;/");
      assertEquals("&amp;quot;/", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml4("&larr;");
      assertEquals("\u2190", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml3("&amp;larr;");
      assertEquals("&larr;", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("\u00B8");
      assertEquals("\u00B8", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml3("&larr;");
      assertEquals("&amp;larr;", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml4("\"/");
      assertEquals("&quot;/", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJson("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringEscapeUtils.CsvUnescaper stringEscapeUtils_CsvUnescaper0 = new StringEscapeUtils.CsvUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        stringEscapeUtils_CsvUnescaper0.translate((CharSequence) "&quot;/", 100, (Writer) stringWriter0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // CsvUnescaper should never reach the [1] index
         //
         verifyException("org.apache.commons.lang3.StringEscapeUtils$CsvUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringEscapeUtils.CsvEscaper stringEscapeUtils_CsvEscaper0 = new StringEscapeUtils.CsvEscaper();
      StringWriter stringWriter0 = new StringWriter(54);
      // Undeclared exception!
      try { 
        stringEscapeUtils_CsvEscaper0.translate((CharSequence) null, 54, (Writer) stringWriter0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // CsvEscaper should never reach the [1] index
         //
         verifyException("org.apache.commons.lang3.StringEscapeUtils$CsvEscaper", e);
      }
  }
}