/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 09:47:44 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.CodingConventions;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GoogleCodingConvention_ESTest extends GoogleCodingConvention_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      googleCodingConvention0.isConstant("$<&P2qan[FXx");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      googleCodingConvention0.isValidEnumKey("D");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CodingConventions.Proxy codingConventions_Proxy0 = new CodingConventions.Proxy((CodingConvention) null);
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention(codingConventions_Proxy0);
      googleCodingConvention0.isConstant("V\"]");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      Node node0 = new Node(302);
      // Undeclared exception!
      try { 
        googleCodingConvention0.isVarArgsParameter(node0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // STAR is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      // Undeclared exception!
      try { 
        googleCodingConvention0.isVarArgsParameter((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.GoogleCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      // Undeclared exception!
      try { 
        googleCodingConvention0.isValidEnumKey((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      Node node0 = new Node((-1));
      // Undeclared exception!
      try { 
        googleCodingConvention0.isOptionalParameter(node0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // ERROR is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      Node node0 = new Node((-201));
      // Undeclared exception!
      try { 
        googleCodingConvention0.isOptionalParameter(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -201
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      // Undeclared exception!
      try { 
        googleCodingConvention0.isExported("_", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodingConventions$Proxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      // Undeclared exception!
      try { 
        googleCodingConvention0.isConstantKey((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      // Undeclared exception!
      try { 
        googleCodingConvention0.isConstant((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.GoogleCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      googleCodingConvention0.isConstantKey("opt_");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      // Undeclared exception!
      try { 
        googleCodingConvention0.isPrivate("4ko2_");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodingConventions$Proxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      googleCodingConvention0.isPrivate("6)6eGX[fA*}JO:+^`");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      googleCodingConvention0.isConstantKey("R");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      googleCodingConvention0.isConstantKey("");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      googleCodingConvention0.isConstant("Ksn$(;3KV&HTl/>/9/");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      googleCodingConvention0.isConstant("");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CodingConventions.Proxy codingConventions_Proxy0 = new CodingConventions.Proxy((CodingConvention) null);
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention(codingConventions_Proxy0);
      googleCodingConvention0.isConstant("PG$");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CodingConventions.Proxy codingConventions_Proxy0 = new CodingConventions.Proxy((CodingConvention) null);
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention(codingConventions_Proxy0);
      // Undeclared exception!
      try { 
        googleCodingConvention0.isOptionalParameter((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.GoogleCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      googleCodingConvention0.isValidEnumKey("_");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      Node node0 = new Node(524288, 1171, 1171);
      // Undeclared exception!
      try { 
        googleCodingConvention0.isVarArgsParameter(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 524288
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = null;
      try {
        googleCodingConvention0 = new GoogleCodingConvention();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/javascript/rhino/jstype/FunctionType
         //
         verifyException("com.google.javascript.jscomp.GoogleCodingConvention", e);
      }
  }
}
