/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 01:14:07 GMT 2023
 */

package org.apache.commons.jxpath.ri;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.ri.Parser;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.TreeCompiler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Constant constant0 = (Constant)Parser.parseExpression("\"ceiling\"", treeCompiler0);
      assertFalse(constant0.computeContextDependent());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      Parser.parseExpression("(iX.X(7.", treeCompiler0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        Parser.parseExpression((String) null, treeCompiler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        Parser.parseExpression("~", treeCompiler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '~'. Invalid symbol '~' - expression incomplete
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        Parser.parseExpression("{({`^", treeCompiler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '{({`^'. Invalid symbol '{' at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        Parser.parseExpression("dJ,c4vPH~@>7-?Ms", treeCompiler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'dJ,c4vPH~@>7-?Ms'. Syntax error after: 'd'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Parser parser0 = new Parser();
  }
}