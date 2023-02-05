/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 01:44:28 GMT 2023
 */

package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParentContext_ESTest extends ParentContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName((String) null, "");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, "", nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, (NodeTest) null);
      ParentContext parentContext0 = new ParentContext(descendantContext0, (NodeTest) null);
      parentContext0.next();
      parentContext0.getCurrentNodePointer();
      assertEquals(2, evalContext0.getPosition());
      assertEquals((-1), parentContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName((String) null, "");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, "", nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, (NodeTest) null);
      ParentContext parentContext0 = new ParentContext(descendantContext0, (NodeTest) null);
      parentContext0.nextNode();
      parentContext0.getCurrentNodePointer();
      assertEquals(1, descendantContext0.getPosition());
      assertEquals(1, parentContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("\"following-sibling::\"");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, nodeTypeTest0);
      ParentContext parentContext0 = new ParentContext(descendantContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        parentContext0.nextNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: \"following-sibling::\"
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      EvalContext[] evalContextArray0 = new EvalContext[3];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      ParentContext parentContext0 = new ParentContext(unionContext0, (NodeTest) null);
      // Undeclared exception!
      try { 
        parentContext0.nextNode();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ParentContext parentContext0 = new ParentContext((EvalContext) null, (NodeTest) null);
      // Undeclared exception!
      try { 
        parentContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.ParentContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(initialContext0, basicNodeSet0);
      ParentContext parentContext0 = new ParentContext(nodeSetContext0, (NodeTest) null);
      nodeSetContext0.nextNode();
      // Undeclared exception!
      try { 
        parentContext0.nextNode();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.ParentContext", (String) null);
      unionContext0.setPosition((-1085));
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      ParentContext parentContext0 = new ParentContext(unionContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        parentContext0.nextNode();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("_>Mqo>XU]", "_>Mqo>XU]");
      Integer integer0 = new Integer(2946);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, integer0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction((-9), expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreFunction0, coreFunction0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(nameAttributeTest0, coreFunction0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationDivide0, coreOperationDivide0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationAdd0, coreOperationAdd0);
      PredicateContext predicateContext0 = new PredicateContext(evalContext0, coreOperationNotEqual0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "_>Mqo>XU]");
      ParentContext parentContext0 = new ParentContext(predicateContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        parentContext0.nextNode();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, "rBmY", (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("NSjXK6:q", "rBmY");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "j,ZTC$ewF9");
      ParentContext parentContext0 = new ParentContext(evalContext0, nodeNameTest0);
      boolean boolean0 = parentContext0.nextNode();
      boolean boolean1 = parentContext0.nextNode();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(initialContext0, basicNodeSet0);
      ParentContext parentContext0 = new ParentContext(nodeSetContext0, (NodeTest) null);
      int int0 = parentContext0.getDocumentOrder();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("`#*+-0~wz@_fvgY)P6");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, false);
      SelfContext selfContext0 = new SelfContext(precedingOrFollowingContext0, processingInstructionTest0);
      ParentContext parentContext0 = new ParentContext(selfContext0, processingInstructionTest0);
      boolean boolean0 = parentContext0.setPosition(1);
      assertEquals(1, parentContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      boolean boolean0 = parentContext0.setPosition((-5952));
      assertEquals((-5952), parentContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      parentContext0.reset();
      assertEquals((-1), parentContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      NodePointer nodePointer0 = parentContext0.getCurrentNodePointer();
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.ParentContext", (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      ParentContext parentContext0 = new ParentContext(unionContext0, nodeNameTest0);
      int int0 = parentContext0.getCurrentPosition();
      assertEquals(1, int0);
  }
}