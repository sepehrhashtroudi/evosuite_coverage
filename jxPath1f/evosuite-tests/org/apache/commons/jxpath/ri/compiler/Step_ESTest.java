/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 01:36:52 GMT 2023
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Step_ESTest extends Step_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(100);
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step(100, nodeTypeTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals(100, step0.getAxis());
      assertEquals("UNKNOWN::UNKNOWN()[null]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("TMIa{");
      Step step0 = new Step(13, processingInstructionTest0, (Expression[]) null);
      step0.getPredicates();
      assertEquals(13, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(0, nodeTypeTest0, expressionArray0);
      step0.getPredicates();
      assertEquals(0, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Step step0 = new Step(1703, (NodeTest) null, (Expression[]) null);
      step0.getNodeTest();
      assertEquals(1703, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(0, nodeTypeTest0, expressionArray0);
      int int0 = step0.getAxis();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-31));
      Step step0 = new Step((-31), nodeTypeTest0, (Expression[]) null);
      int int0 = step0.getAxis();
      assertEquals((-31), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(47, expressionArray0);
      expressionArray0[4] = (Expression) coreFunction0;
      Step step0 = new Step((-967), (NodeTest) null, expressionArray0);
      // Undeclared exception!
      step0.toString();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3);
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual((Expression) null, (Expression) null);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      Step step0 = new Step(3, nodeTypeTest0, expressionArray0);
      // Undeclared exception!
      try { 
        step0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = Step.axisToString(100);
      assertEquals("UNKNOWN", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = Step.axisToString(3);
      assertEquals("parent", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = Step.axisToString(1);
      assertEquals("self", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = Step.axisToString(13);
      assertEquals("descendant-or-self", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("TMIa{");
      Step step0 = new Step(13, processingInstructionTest0, (Expression[]) null);
      int int0 = step0.getAxis();
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("LNv{>", "namespace");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      step0.getPredicates();
      assertEquals(0, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = Step.axisToString(12);
      assertEquals("preceding-sibling", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = Step.axisToString(11);
      assertEquals("following-sibling", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = Step.axisToString(10);
      assertEquals("ancestor-or-self", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = Step.axisToString(9);
      assertEquals("descendant", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = Step.axisToString(8);
      assertEquals("following", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = Step.axisToString(7);
      assertEquals("preceding", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = Step.axisToString(6);
      assertEquals("namespace", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = Step.axisToString(5);
      assertEquals("attribute", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = Step.axisToString(4);
      assertEquals("ancestor", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = Step.axisToString(2);
      assertEquals("child", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Step step0 = new Step(13, nodeTypeTest0, (Expression[]) null);
      String string0 = step0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1642));
      Step step0 = new Step(13, nodeTypeTest0, (Expression[]) null);
      String string0 = step0.toString();
      assertEquals("descendant-or-self::UNKNOWN()", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("TMIa{");
      Step step0 = new Step(13, processingInstructionTest0, (Expression[]) null);
      String string0 = step0.toString();
      assertEquals("descendant-or-self::processing-instruction('TMIa{')", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(3, nodeNameTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("parent:::", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-934));
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("self::UNKNOWN()", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[3];
      Step step0 = new Step(1, nodeNameTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("self::[null][null][null]", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(5, processingInstructionTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("@processing-instruction('')", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step(2, (NodeTest) null, expressionArray0);
      String string0 = step0.toString();
      assertEquals("null[null]", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QName qName0 = new QName("LNv{>", "namespace");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[1];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      boolean boolean0 = step0.isContextDependent();
      assertTrue(boolean0);
      assertEquals(0, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[5];
      Short short0 = new Short((short) (-1027));
      Constant constant0 = new Constant(short0);
      expressionArray0[0] = (Expression) constant0;
      Step step0 = new Step(103, nodeNameTest0, expressionArray0);
      // Undeclared exception!
      try { 
        step0.isContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Step", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-934));
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      boolean boolean0 = step0.isContextDependent();
      assertFalse(boolean0);
      assertEquals(1, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("TMIa{");
      Step step0 = new Step(13, processingInstructionTest0, (Expression[]) null);
      boolean boolean0 = step0.isContextDependent();
      assertFalse(boolean0);
      assertEquals(13, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("TMIa{");
      Step step0 = new Step(13, processingInstructionTest0, (Expression[]) null);
      step0.getNodeTest();
      assertEquals(13, step0.getAxis());
  }
}
