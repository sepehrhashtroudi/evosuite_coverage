/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 22:19:27 GMT 2023
 */

package com.google.javascript.jscomp.deps;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.deps.JsFileLineParser;
import com.google.javascript.jscomp.deps.JsFileParser;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsFileLineParser_ESTest extends JsFileLineParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JsFileParser jsFileParser0 = new JsFileParser((ErrorManager) null);
      jsFileParser0.setShortcutMode(true);
      assertFalse(jsFileParser0.didParseSucceed());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JsFileParser jsFileParser0 = new JsFileParser((ErrorManager) null);
      StringReader stringReader0 = new StringReader("Winzdow");
      jsFileParser0.doParse(" [synthetic:", stringReader0);
      boolean boolean0 = jsFileParser0.didParseSucceed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JsFileParser jsFileParser0 = new JsFileParser((ErrorManager) null);
      // Undeclared exception!
      try { 
        jsFileParser0.parseJsStringArray("E]k?_OuJ=");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.google.javascript.jscomp.deps.JsFileLineParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JsFileParser jsFileParser0 = new JsFileParser((ErrorManager) null);
      // Undeclared exception!
      try { 
        jsFileParser0.parseJsString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JsFileParser jsFileParser0 = new JsFileParser((ErrorManager) null);
      StringReader stringReader0 = new StringReader(" - ");
      stringReader0.close();
      // Undeclared exception!
      try { 
        jsFileParser0.doParse(" - ", stringReader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.deps.JsFileLineParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JsFileParser jsFileParser0 = new JsFileParser((ErrorManager) null);
      jsFileParser0.shortcutMode = true;
      StringReader stringReader0 = new StringReader("*inzdoV");
      // Undeclared exception!
      try { 
        jsFileParser0.doParse("[asynthetic:", stringReader0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/CharMatcher
         //
         verifyException("com.google.javascript.jscomp.deps.JsFileParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JsFileParser jsFileParser0 = new JsFileParser((ErrorManager) null);
      StringReader stringReader0 = new StringReader("//");
      jsFileParser0.doParse("//", stringReader0);
      assertTrue(jsFileParser0.didParseSucceed());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JsFileParser jsFileParser0 = new JsFileParser((ErrorManager) null);
      boolean boolean0 = jsFileParser0.didParseSucceed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JsFileLineParser.ParseException jsFileLineParser_ParseException0 = new JsFileLineParser.ParseException((String) null, false);
      boolean boolean0 = jsFileLineParser_ParseException0.isFatal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      JsFileParser jsFileParser0 = new JsFileParser((ErrorManager) null);
      try { 
        jsFileParser0.parseJsString(" - ");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Syntax error in JS String literal
         //
         verifyException("com.google.javascript.jscomp.deps.JsFileLineParser", e);
      }
  }
}
