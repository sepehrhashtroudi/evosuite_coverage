/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 22:40:13 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.MessageFormatter;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSError_ESTest extends JSError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DiagnosticType diagnosticType0 = DiagnosticType.warning("GH@)~`G", "cTff[|<-~");
      String[] stringArray0 = new String[8];
      JSError jSError0 = JSError.make("", 1073741824, 1073741824, diagnosticType0, stringArray0);
      JSError jSError1 = JSError.make("cTff[|<-~", 1073741824, 3164, jSError0.level, diagnosticType0, stringArray0);
      jSError1.hashCode();
      assertEquals(1073741824, jSError0.lineNumber);
      assertEquals(1073741824, jSError1.lineNumber);
      assertEquals(3164, jSError1.getCharno());
      assertEquals(1073741824, jSError0.getCharno());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DiagnosticType diagnosticType0 = DiagnosticType.error("h%eMys\"2", "h%eMys\"2");
      String[] stringArray0 = new String[2];
      JSError jSError0 = JSError.make(diagnosticType0, stringArray0);
      JSError jSError1 = JSError.make("&Z!Tk", 0, (-1), jSError0.level, diagnosticType0, stringArray0);
      boolean boolean0 = jSError0.equals(jSError1);
      assertFalse(boolean0);
      assertEquals((-1), jSError0.lineNumber);
      assertEquals((-1), jSError0.getCharno());
      assertEquals((-1), jSError1.getCharno());
      assertEquals(0, jSError1.lineNumber);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      DiagnosticType diagnosticType0 = DiagnosticType.error("@8\"KS_c", "],Lb:(`");
      String[] stringArray0 = new String[5];
      JSError jSError0 = JSError.make("],Lb:(`", (-3249), (-3249), checkLevel0, diagnosticType0, stringArray0);
      JSError jSError1 = JSError.make(diagnosticType0, stringArray0);
      boolean boolean0 = jSError0.equals(jSError1);
      assertFalse(boolean0);
      assertEquals(CheckLevel.WARNING, jSError0.getDefaultLevel());
      assertEquals((-3249), jSError0.getCharno());
      assertEquals((-3249), jSError0.lineNumber);
      assertEquals((-1), jSError1.getCharno());
      assertEquals((-1), jSError1.lineNumber);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      DiagnosticType diagnosticType0 = DiagnosticType.make("first new child has existing parent", checkLevel0, "");
      String[] stringArray0 = new String[2];
      JSError jSError0 = JSError.make("first new child has existing parent", 2, 2, diagnosticType0, stringArray0);
      JSError jSError1 = JSError.make("", 2411, 2, jSError0.level, diagnosticType0, stringArray0);
      boolean boolean0 = jSError1.equals(jSError0);
      assertEquals(2, jSError0.getCharno());
      assertEquals(2411, jSError1.lineNumber);
      assertFalse(boolean0);
      assertEquals(2, jSError1.getCharno());
      assertEquals(2, jSError0.lineNumber);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DiagnosticType diagnosticType0 = DiagnosticType.warning("GH@)~`G", "cTff[|<-~");
      String[] stringArray0 = new String[8];
      JSError jSError0 = JSError.make("GH@)~`G", 1073741824, (-1559), diagnosticType0.defaultLevel, diagnosticType0, stringArray0);
      String string0 = jSError0.toString();
      assertEquals("GH@)~`G. cTff[|<-~ at GH@)~`G line 1073741824 : -1559", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = new Node(2399, 2399, 2411);
      DiagnosticType diagnosticType0 = DiagnosticType.warning(",_mvfTM?Mb7nDgx<", "@8\"KS_c");
      String[] stringArray0 = new String[9];
      JSError.make("[YiLP.e$}0!l[(iXa", node0, diagnosticType0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DiagnosticType diagnosticType0 = AbstractCompiler.READ_ERROR;
      String[] stringArray0 = new String[2];
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node((-1), nodeArray0, 31, 31);
      JSError.make("JSC_READ_ERROR", node0, diagnosticType0.level, diagnosticType0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DiagnosticType diagnosticType0 = DiagnosticType.error("externExports", "externExports");
      String[] stringArray0 = new String[6];
      JSError jSError0 = JSError.make("", 0, 0, diagnosticType0, stringArray0);
      assertEquals(0, jSError0.getCharno());
      assertEquals(0, jSError0.lineNumber);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      DiagnosticType diagnosticType0 = AbstractCompiler.READ_ERROR;
      String[] stringArray0 = new String[1];
      JSError jSError0 = JSError.make((String) null, 0, 0, checkLevel0, diagnosticType0, stringArray0);
      assertEquals(0, jSError0.getCharno());
      assertEquals(0, jSError0.lineNumber);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = new Node(0, 0, 0);
      DiagnosticType diagnosticType0 = AbstractCompiler.READ_ERROR;
      String[] stringArray0 = new String[2];
      JSError.make(node0, diagnosticType0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      DiagnosticType diagnosticType0 = DiagnosticType.make("first new child has existing parent", checkLevel0, "");
      String[] stringArray0 = new String[2];
      Node node0 = new Node(0, 2, 2);
      JSError.make(node0, diagnosticType0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      DiagnosticType diagnosticType0 = DiagnosticType.disabled("8uOp:k$oHOre?Q_>W", "8uOp:k$oHOre?Q_>W");
      String[] stringArray0 = new String[1];
      JSError jSError0 = JSError.make("xterm-256color", 772, 772, checkLevel0, diagnosticType0, stringArray0);
      int int0 = jSError0.getLineNumber();
      assertEquals(CheckLevel.WARNING, jSError0.getDefaultLevel());
      assertEquals(772, int0);
      assertEquals(772, jSError0.getCharno());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DiagnosticType diagnosticType0 = DiagnosticType.error("5)#W8zr%AS", "5)#W8zr%AS");
      String[] stringArray0 = new String[7];
      JSError jSError0 = JSError.make(diagnosticType0, stringArray0);
      int int0 = jSError0.getLineNumber();
      assertEquals((-1), jSError0.getCharno());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = new Node(0, 0, 0);
      DiagnosticType diagnosticType0 = DiagnosticType.disabled((String) null, "");
      JSError jSError0 = JSError.make((String) null, node0, diagnosticType0, (String[]) null);
      jSError0.getCharno();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      DiagnosticType diagnosticType0 = DiagnosticType.make(". ", checkLevel0, "");
      String[] stringArray0 = new String[2];
      JSError jSError0 = JSError.make(". ", 2015, 31, diagnosticType0, stringArray0);
      int int0 = jSError0.getCharno();
      assertEquals(2015, jSError0.lineNumber);
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Node node0 = new Node(302, 8192, 8192);
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        JSError.make("", node0, (DiagnosticType) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.JSError", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DiagnosticType diagnosticType0 = AbstractCompiler.READ_ERROR;
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        JSError.make("'tJ^q][", (Node) null, diagnosticType0.level, diagnosticType0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.JSError", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        JSError.make("z:yJ", 0, 0, (DiagnosticType) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.JSError", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      // Undeclared exception!
      try { 
        JSError.make("i\"`1q", 1949, 1674, checkLevel0, (DiagnosticType) null, (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.JSError", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DiagnosticType diagnosticType0 = AbstractCompiler.READ_ERROR;
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        JSError.make((Node) null, diagnosticType0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.JSError", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        JSError.make((DiagnosticType) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.JSError", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Node node0 = new Node(0, 0, 0);
      DiagnosticType diagnosticType0 = DiagnosticType.disabled((String) null, "");
      JSError jSError0 = JSError.make((String) null, node0, diagnosticType0, (String[]) null);
      // Undeclared exception!
      try { 
        jSError0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.DiagnosticType", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Node node0 = new Node((-357));
      DiagnosticType diagnosticType0 = DiagnosticType.disabled("f&", "A>uvi)mH&~e4,j");
      JSError jSError0 = JSError.make(node0, diagnosticType0, (String[]) null);
      jSError0.hashCode();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Node node0 = new Node(0, 0, 0);
      DiagnosticType diagnosticType0 = DiagnosticType.disabled((String) null, "");
      DiagnosticType diagnosticType1 = DiagnosticType.make("", diagnosticType0.defaultLevel, "");
      JSError jSError0 = JSError.make("", node0, diagnosticType0, (String[]) null);
      JSError jSError1 = JSError.make("", node0, diagnosticType1, (String[]) null);
      jSError0.equals(jSError1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Node node0 = new Node(0, 0, 0);
      DiagnosticType diagnosticType0 = DiagnosticType.disabled((String) null, "");
      JSError jSError0 = JSError.make((String) null, node0, diagnosticType0, (String[]) null);
      JSError jSError1 = JSError.make("Null", node0, diagnosticType0.defaultLevel, diagnosticType0, (String[]) null);
      jSError0.equals(jSError1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Node node0 = new Node(0, 0, 0);
      DiagnosticType diagnosticType0 = DiagnosticType.disabled((String) null, "");
      JSError jSError0 = JSError.make("", node0, diagnosticType0, (String[]) null);
      JSError jSError1 = JSError.make("", node0, diagnosticType0, (String[]) null);
      // Undeclared exception!
      try { 
        jSError0.equals(jSError1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.DiagnosticType", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Node node0 = new Node(0, 0, 0);
      DiagnosticType diagnosticType0 = DiagnosticType.disabled((String) null, "");
      JSError jSError0 = JSError.make((String) null, node0, diagnosticType0, (String[]) null);
      JSError jSError1 = JSError.make("", node0, diagnosticType0, (String[]) null);
      jSError1.equals(jSError0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Node node0 = new Node(0);
      DiagnosticType diagnosticType0 = DiagnosticType.warning((String) null, "");
      JSError jSError0 = JSError.make(node0, diagnosticType0, (String[]) null);
      DiagnosticType diagnosticType1 = DiagnosticType.disabled("q1</M,[6ssT20", "Jj");
      JSError jSError1 = JSError.make((String) null, node0, diagnosticType1.level, diagnosticType0, (String[]) null);
      jSError1.equals(jSError0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Node node0 = new Node(0);
      DiagnosticType diagnosticType0 = DiagnosticType.warning((String) null, "Y1o");
      JSError jSError0 = JSError.make(node0, diagnosticType0, (String[]) null);
      DiagnosticType diagnosticType1 = DiagnosticType.disabled("q1</M,[6ssT20", "");
      JSError jSError1 = JSError.make(node0, diagnosticType1, (String[]) null);
      jSError1.equals(jSError0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = new Node(0);
      DiagnosticType diagnosticType0 = AbstractCompiler.READ_ERROR;
      JSError jSError0 = JSError.make((String) null, node0, diagnosticType0, (String[]) null);
      JSError jSError1 = JSError.make(node0, diagnosticType0, (String[]) null);
      jSError1.equals(jSError0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Node node0 = new Node(0);
      DiagnosticType diagnosticType0 = DiagnosticType.disabled((String) null, "");
      JSError jSError0 = JSError.make((String) null, node0, diagnosticType0, (String[]) null);
      String[] stringArray0 = new String[2];
      JSError jSError1 = JSError.make((String) null, (-2013265917), (-1), diagnosticType0, stringArray0);
      jSError0.equals(jSError1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DiagnosticType diagnosticType0 = DiagnosticType.warning("GH@)~`G", "cTff[|<-~");
      String[] stringArray0 = new String[8];
      JSError jSError0 = JSError.make("", 1073741824, 1073741824, diagnosticType0, stringArray0);
      JSError jSError1 = JSError.make("GH@)~`G", 1073741824, (-1559), diagnosticType0.defaultLevel, diagnosticType0, stringArray0);
      boolean boolean0 = jSError0.equals(jSError1);
      assertEquals(1073741824, jSError0.lineNumber);
      assertEquals((-1559), jSError1.getCharno());
      assertEquals(1073741824, jSError0.getCharno());
      assertEquals(1073741824, jSError1.lineNumber);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      DiagnosticType diagnosticType0 = DiagnosticType.make((String) null, checkLevel0, "");
      String[] stringArray0 = new String[7];
      JSError jSError0 = JSError.make("", 21, 3166, diagnosticType0, stringArray0);
      boolean boolean0 = jSError0.equals(stringArray0[0]);
      assertFalse(boolean0);
      assertEquals(3166, jSError0.getCharno());
      assertEquals(21, jSError0.lineNumber);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Node node0 = new Node(0);
      DiagnosticType diagnosticType0 = DiagnosticType.disabled((String) null, "");
      JSError jSError0 = JSError.make((String) null, node0, diagnosticType0, (String[]) null);
      jSError0.equals(jSError0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DiagnosticType diagnosticType0 = DiagnosticType.warning("GH@)~`G", "cTff[|<-~");
      String[] stringArray0 = new String[8];
      JSError jSError0 = JSError.make("", 1073741824, 1073741824, diagnosticType0, stringArray0);
      boolean boolean0 = jSError0.equals("");
      assertEquals(1073741824, jSError0.getCharno());
      assertFalse(boolean0);
      assertEquals(1073741824, jSError0.lineNumber);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Node node0 = new Node((-1));
      DiagnosticType diagnosticType0 = DiagnosticType.error("com.google.javascript.rhino.InputId", "com.google.javascript.rhino.InputId");
      String[] stringArray0 = new String[8];
      JSError jSError0 = JSError.make(node0, diagnosticType0, stringArray0);
      jSError0.getNodeLength();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      DiagnosticType diagnosticType0 = DiagnosticType.error("com.google.javascript.jscomp.AbstractMessageFormatter", "@8\"KS_c");
      String[] stringArray0 = new String[4];
      JSError jSError0 = JSError.make("s&&9m4+G", (-157), 301, checkLevel0, diagnosticType0, stringArray0);
      int int0 = jSError0.getNodeLength();
      assertEquals(0, int0);
      assertEquals(301, jSError0.getCharno());
      assertEquals((-157), jSError0.lineNumber);
      assertEquals(CheckLevel.WARNING, jSError0.getDefaultLevel());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Node node0 = new Node(0);
      DiagnosticType diagnosticType0 = DiagnosticType.warning((String) null, "");
      JSError jSError0 = JSError.make(node0, diagnosticType0, (String[]) null);
      jSError0.getNodeSourceOffset();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      DiagnosticType diagnosticType0 = DiagnosticType.error("com.google.javascript.jscomp.AbstractMessageFormatter", "@8\"KS_c");
      String[] stringArray0 = new String[4];
      JSError jSError0 = JSError.make("s&&9m4+G", (-157), 301, checkLevel0, diagnosticType0, stringArray0);
      int int0 = jSError0.getNodeSourceOffset();
      assertEquals(301, jSError0.getCharno());
      assertEquals((-1), int0);
      assertEquals(CheckLevel.WARNING, jSError0.getDefaultLevel());
      assertEquals((-157), jSError0.lineNumber);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DiagnosticType diagnosticType0 = DiagnosticType.warning("GH@)~`G", "cTff[|<-~");
      String[] stringArray0 = new String[8];
      JSError jSError0 = JSError.make("", 1073741824, 1073741824, diagnosticType0, stringArray0);
      String string0 = jSError0.toString();
      assertEquals("GH@)~`G. cTff[|<-~ at (unknown source) line 1073741824 : 1073741824", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      DiagnosticType diagnosticType0 = DiagnosticType.error("com.google.javascript.jscomp.AbstractMessageFormatter", "@8\"KS_c");
      String[] stringArray0 = new String[4];
      JSError jSError0 = JSError.make("s&&9m4+G", (-157), 301, checkLevel0, diagnosticType0, stringArray0);
      String string0 = jSError0.toString();
      assertEquals("com.google.javascript.jscomp.AbstractMessageFormatter. @8\"KS_c at s&&9m4+G line -157 : 301", string0);
      assertEquals(CheckLevel.WARNING, jSError0.getDefaultLevel());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Node node0 = new Node(54);
      DiagnosticType diagnosticType0 = AbstractCompiler.READ_ERROR;
      String[] stringArray0 = new String[2];
      JSError jSError0 = JSError.make(" [synthetic:", node0, diagnosticType0.defaultLevel, diagnosticType0, stringArray0);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      // Undeclared exception!
      try { 
        jSError0.format(checkLevel0, (MessageFormatter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.JSError", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Node node0 = new Node((-1));
      DiagnosticType diagnosticType0 = DiagnosticType.error("com.google.javascript.rhino.InputId", "com.google.javascript.rhino.InputId");
      String[] stringArray0 = new String[8];
      CheckLevel checkLevel0 = CheckLevel.OFF;
      JSError jSError0 = JSError.make("5.TpP$ .9usU/xa9r", node0, checkLevel0, diagnosticType0, stringArray0);
      jSError0.format(jSError0.level, (MessageFormatter) null);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DiagnosticType diagnosticType0 = DiagnosticType.error("com.google.javascript.jscomp.AbstractMessageFormatter", "@8\"KS_c");
      String[] stringArray0 = new String[4];
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(301, nodeArray0);
      JSError jSError0 = JSError.make((String) null, node0, diagnosticType0, stringArray0);
      // Undeclared exception!
      try { 
        jSError0.format(jSError0.level, (MessageFormatter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.JSError", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DiagnosticType diagnosticType0 = DiagnosticType.error(" : ", "");
      String[] stringArray0 = new String[5];
      JSError jSError0 = JSError.make(" : ", (Node) null, diagnosticType0, stringArray0);
      assertEquals((-1), jSError0.getCharno());
      assertEquals((-1), jSError0.lineNumber);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Node node0 = new Node((-1));
      DiagnosticType diagnosticType0 = DiagnosticType.error("com.google.javascript.rhino.InputId", "com.google.javascript.rhino.InputId");
      String[] stringArray0 = new String[8];
      JSError jSError0 = JSError.make(node0, diagnosticType0, stringArray0);
      jSError0.toString();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Node node0 = new Node(0, 0, 0);
      DiagnosticType diagnosticType0 = DiagnosticType.disabled((String) null, "");
      JSError jSError0 = JSError.make((String) null, node0, diagnosticType0, (String[]) null);
      jSError0.getLineNumber();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Node node0 = new Node(0);
      DiagnosticType diagnosticType0 = DiagnosticType.disabled((String) null, "");
      JSError jSError0 = JSError.make((String) null, node0, diagnosticType0, (String[]) null);
      jSError0.getCharno();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      DiagnosticType diagnosticType0 = DiagnosticType.error("com.google.javascript.jscomp.AbstractMessageFormatter", "@8\"KS_c");
      String[] stringArray0 = new String[4];
      JSError jSError0 = JSError.make("s&&9m4+G", (-157), 301, checkLevel0, diagnosticType0, stringArray0);
      jSError0.getType();
      assertEquals(301, jSError0.getCharno());
      assertEquals(CheckLevel.WARNING, jSError0.getDefaultLevel());
      assertEquals((-157), jSError0.lineNumber);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      DiagnosticType diagnosticType0 = DiagnosticType.make("$q>4", checkLevel0, "$q>4");
      String[] stringArray0 = new String[9];
      JSError jSError0 = JSError.make("$q>4", 128, 128, diagnosticType0, stringArray0);
      jSError0.getDefaultLevel();
      assertEquals(128, jSError0.getCharno());
      assertEquals(128, jSError0.lineNumber);
  }
}