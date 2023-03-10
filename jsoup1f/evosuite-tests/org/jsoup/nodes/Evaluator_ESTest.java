/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 01:04:04 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Evaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Evaluator_ESTest extends Evaluator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Evaluator.Class evaluator_Class0 = new Evaluator.Class("");
      // Undeclared exception!
      try { 
        evaluator_Class0.matches((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Evaluator$Class", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Evaluator.IndexGreaterThan evaluator_IndexGreaterThan0 = new Evaluator.IndexGreaterThan((-4432));
      // Undeclared exception!
      try { 
        evaluator_IndexGreaterThan0.matches((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Evaluator$IndexGreaterThan", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Evaluator.IndexEquals evaluator_IndexEquals0 = new Evaluator.IndexEquals((-1));
      // Undeclared exception!
      try { 
        evaluator_IndexEquals0.matches((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Evaluator$IndexEquals", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Evaluator.AllElements evaluator_AllElements0 = new Evaluator.AllElements();
      boolean boolean0 = evaluator_AllElements0.matches((Element) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Evaluator.AttributeWithValueContaining evaluator_AttributeWithValueContaining0 = null;
      try {
        evaluator_AttributeWithValueContaining0 = new Evaluator.AttributeWithValueContaining("DGwM;}UprN<s_7w", "DGwM;}UprN<s_7w");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang/Validate
         //
         verifyException("org.jsoup.nodes.Evaluator$AttributeKeyPair", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Evaluator.AllElements evaluator_AllElements0 = new Evaluator.AllElements();
      boolean boolean0 = evaluator_AllElements0.matches((Element) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Evaluator.AttributeWithValueNot evaluator_AttributeWithValueNot0 = null;
      try {
        evaluator_AttributeWithValueNot0 = new Evaluator.AttributeWithValueNot("6", "6");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang/Validate
         //
         verifyException("org.jsoup.nodes.Evaluator$AttributeKeyPair", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Evaluator.Attribute evaluator_Attribute0 = new Evaluator.Attribute(">W@7(g");
      // Undeclared exception!
      try { 
        evaluator_Attribute0.matches((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Evaluator$Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Evaluator.Tag evaluator_Tag0 = new Evaluator.Tag("jz1o1[}G6O~~/");
      // Undeclared exception!
      try { 
        evaluator_Tag0.matches((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Evaluator$Tag", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Evaluator.AttributeWithValueStarting evaluator_AttributeWithValueStarting0 = null;
      try {
        evaluator_AttributeWithValueStarting0 = new Evaluator.AttributeWithValueStarting((String) null, (String) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang/Validate
         //
         verifyException("org.jsoup.nodes.Evaluator$AttributeKeyPair", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Evaluator.AttributeWithValueEnding evaluator_AttributeWithValueEnding0 = null;
      try {
        evaluator_AttributeWithValueEnding0 = new Evaluator.AttributeWithValueEnding(">EJ", ">EJ");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang/Validate
         //
         verifyException("org.jsoup.nodes.Evaluator$AttributeKeyPair", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Evaluator.AttributeWithValue evaluator_AttributeWithValue0 = null;
      try {
        evaluator_AttributeWithValue0 = new Evaluator.AttributeWithValue("ffF]?S78GQ*yv", "ffF]?S78GQ*yv");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang/Validate
         //
         verifyException("org.jsoup.nodes.Evaluator$AttributeKeyPair", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Evaluator.IndexLessThan evaluator_IndexLessThan0 = new Evaluator.IndexLessThan(0);
      // Undeclared exception!
      try { 
        evaluator_IndexLessThan0.matches((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Evaluator$IndexLessThan", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Evaluator.Id evaluator_Id0 = new Evaluator.Id("org.jsoup.nodes.Element");
      // Undeclared exception!
      try { 
        evaluator_Id0.matches((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Evaluator$Id", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Evaluator.Class evaluator_Class0 = new Evaluator.Class("7-n^MK7?&X+'~Z(#");
      // Undeclared exception!
      try { 
        evaluator_Class0.matches((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Evaluator$Class", e);
      }
  }
}
