/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 02:08:01 GMT 2023
 */

package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DOMNamespaceIterator_ESTest extends DOMNamespaceIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("~Oz+?;^w4S0", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("<<unknown namespace>>");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      dOMNamespaceIterator0.setPosition(Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        dOMNamespaceIterator0.getNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2147483647, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("~Oz+?;^w4S0", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("<<unknown namespace>>");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
      
      dOMNamespaceIterator0.getNodePointer();
      int int0 = dOMNamespaceIterator0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("~Oz+?;^w4S0", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("<<unknown namespace>>");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      dOMNamespaceIterator0.setPosition((-902));
      int int0 = dOMNamespaceIterator0.getPosition();
      assertEquals((-902), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("5HqVaXNwcbzjHG", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = null;
      try {
        dOMNamespaceIterator0 = new DOMNamespaceIterator(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 5HqVaXNwcbzjHG:null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DOMNamespaceIterator dOMNamespaceIterator0 = null;
      try {
        dOMNamespaceIterator0 = new DOMNamespaceIterator((NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("U!=B}oeM0F@j4W#Ap");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = null;
      try {
        dOMNamespaceIterator0 = new DOMNamespaceIterator(variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'U!=B}oeM0F@j4W#Ap'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("{object of type ");
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "{object of type ", locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = null;
      try {
        dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("xmlns", "xmlns");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      iIOMetadataNode0.setAttribute("xmlns", "<<unknown namespace>>");
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
      
      boolean boolean0 = dOMNamespaceIterator0.setPosition(1);
      assertEquals(1, dOMNamespaceIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("~Oz+?;^w4S0", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("<<unknown namespace>>");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
      
      boolean boolean0 = dOMNamespaceIterator0.setPosition((short)1);
      assertEquals(1, dOMNamespaceIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("~Oz+?;^w4S0", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("<<unknown namespace>>");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      dOMNamespaceIterator0.setPosition((-901));
      // Undeclared exception!
      try { 
        dOMNamespaceIterator0.getNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("v`W@h[&#IS:hms:ehn", "v`W@h[&#IS:hms:ehn");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("<<unknown namespace>>");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      dOMNamespaceIterator0.getNodePointer();
      // Undeclared exception!
      try { 
        dOMNamespaceIterator0.getNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("xmlns", "xmlns");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("<<unknown namespace>>");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      iIOMetadataNode0.setAttribute("xmlns", "<<unknown namespace>>");
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      NodePointer nodePointer1 = dOMNamespaceIterator0.getNodePointer();
      assertEquals(0, dOMNamespaceIterator0.getPosition());
      assertNotNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("xmlhs", "xmlhs");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      iIOMetadataNode0.setAttribute("xmlhs", "<<unknown namespace>>");
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("njlul:lTg", "njlul:lTg");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      iIOMetadataNode0.setAttribute("njlul:lTg", "http://www.w3.org/XML/1998/namespace");
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, basicVariables0, locale0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("<<unknown namespace>>");
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, iIOMetadataNode0);
      NodePointer nodePointer2 = nodePointer1.createAttribute((JXPathContext) null, qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer2);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("ley'N5$,gt=g", "ley'N5$,gt=g");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      int int0 = dOMNamespaceIterator0.getPosition();
      assertEquals(0, int0);
  }
}