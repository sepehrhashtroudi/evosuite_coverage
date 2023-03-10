/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 01:50:26 GMT 2023
 */

package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AttributeContext_ESTest extends AttributeContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      boolean boolean0 = attributeContext0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) fileSystemHandling0);
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Simultaneous operations: should not request pointer list while iterating over an EvalContext");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, nodeNameTest0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      AttributeContext attributeContext0 = new AttributeContext(evalContext0, nodeNameTest0);
      attributeContext0.nextNode();
      attributeContext0.getCurrentNodePointer();
      assertEquals(1, attributeContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, nodeNameTest0);
      AttributeContext attributeContext0 = new AttributeContext(descendantContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        attributeContext0.setPosition(666);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer((-16));
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Expression[] expressionArray0 = new Expression[5];
      Constant constant0 = new Constant("");
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationNegate0, coreOperationNegate0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThanOrEqual0, constant0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      expressionArray0[1] = (Expression) coreOperationLessThanOrEqual0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[2] = (Expression) coreOperationUnion0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, coreOperationAdd0);
      AttributeContext attributeContext0 = new AttributeContext(predicateContext0, nodeNameTest0);
      // Undeclared exception!
      attributeContext0.setPosition(115);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName(":_d", "yVA..LN$VTMRAlY\"9");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      AttributeContext attributeContext0 = new AttributeContext(namespaceContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        attributeContext0.setPosition(1734);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.AttributeContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("dM", "dM");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "dM");
      AttributeContext attributeContext0 = new AttributeContext(nodeSetContext0, nodeNameTest0);
      nodeSetContext0.getSingleNodePointer();
      // Undeclared exception!
      try { 
        attributeContext0.setPosition(1);
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
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "");
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AttributeContext attributeContext0 = new AttributeContext(rootContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        attributeContext0.setPosition(842);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        attributeContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.AttributeContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(550);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeTypeTest0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(ancestorContext0, basicNodeSet0);
      QName qName0 = new QName("sum");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AttributeContext attributeContext0 = new AttributeContext(nodeSetContext0, nodeNameTest0);
      attributeContext0.getValue();
      // Undeclared exception!
      try { 
        attributeContext0.nextNode();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "");
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      AttributeContext attributeContext0 = new AttributeContext(rootContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        attributeContext0.nextNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) fileSystemHandling0);
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeNameTest0);
      boolean boolean0 = attributeContext0.nextNode();
      assertEquals(1, attributeContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2503);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      attributeContext0.nextNode();
      boolean boolean0 = attributeContext0.nextNode();
      assertEquals(2, attributeContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeNameTest0);
      attributeContext0.reset();
      assertFalse(attributeContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("b](EU3z/J%&OIZe");
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, processingInstructionTest0);
      attributeContext0.nextNode();
      boolean boolean0 = attributeContext0.setPosition(973);
      assertEquals(2, attributeContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) fileSystemHandling0);
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Simultaneous operations: should not request pointer list while iterating over an EvalContext");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, nodeNameTest0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      AttributeContext attributeContext0 = new AttributeContext(evalContext0, nodeNameTest0);
      boolean boolean0 = attributeContext0.setPosition(975);
      assertEquals(4, attributeContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) fileSystemHandling0);
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Simultaneous operations: should not request pointer list while iterating over an EvalContext");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeNameTest0);
      boolean boolean0 = attributeContext0.setPosition(Integer.MIN_VALUE);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("dM", "dM");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "dM");
      AttributeContext attributeContext0 = new AttributeContext(nodeSetContext0, nodeNameTest0);
      NodePointer nodePointer0 = attributeContext0.getCurrentNodePointer();
      assertNull(nodePointer0);
  }
}
