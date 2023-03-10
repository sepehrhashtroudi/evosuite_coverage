/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 01:41:43 GMT 2023
 */

package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NamespaceContext_ESTest extends NamespaceContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("wYlXua3Crgd$-Fq3#");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(nodeSetContext0, nodeNameTest0, false, false);
      NamespaceContext namespaceContext0 = new NamespaceContext(childContext0, nodeNameTest0);
      boolean boolean0 = namespaceContext0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("fp7xZh-}9?X@s+");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext(nodeSetContext0, nodeNameTest0);
      AncestorContext ancestorContext0 = new AncestorContext(parentContext0, false, nodeNameTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(ancestorContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        namespaceContext0.setPosition(2034);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.NamespaceContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("wYlXua3Crgd$-Fq3#");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(nodeSetContext0, nodeNameTest0, false, false);
      nodeSetContext0.getSingleNodePointer();
      NamespaceContext namespaceContext0 = new NamespaceContext(childContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        namespaceContext0.nextNode();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("Teh#j", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      boolean boolean0 = namespaceContext0.nextNode();
      assertEquals(1, namespaceContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-239));
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeTypeTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(ancestorContext0, nodeTypeTest0);
      boolean boolean0 = namespaceContext0.nextNode();
      assertEquals(1, namespaceContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("*");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "*");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        namespaceContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.NamespaceContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(34);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeTypeTest0);
      boolean boolean0 = namespaceContext0.setPosition(34);
      assertEquals(1, namespaceContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("<L3alI");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, nodeNameTest0);
      namespaceContext0.nextNode();
      boolean boolean0 = namespaceContext0.nextNode();
      assertEquals(2, namespaceContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("Sl#r96)Y5Dfz^q>#F", "Sl#r96)Y5Dfz^q>#F");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      boolean boolean0 = namespaceContext0.setPosition(Integer.MIN_VALUE);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("B6mVir|p$i@}a%5h");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "B6mVir|p$i@}a%5h");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      namespaceContext0.reset();
      assertEquals(0, namespaceContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("wYlXua3Crgd$-Fq3#");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(nodeSetContext0, nodeNameTest0, false, false);
      NamespaceContext namespaceContext0 = new NamespaceContext(childContext0, nodeNameTest0);
      NodePointer nodePointer0 = namespaceContext0.getCurrentNodePointer();
      assertNull(nodePointer0);
  }
}
