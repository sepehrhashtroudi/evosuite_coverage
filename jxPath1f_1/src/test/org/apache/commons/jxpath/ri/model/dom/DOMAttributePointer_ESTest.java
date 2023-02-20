/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 02:06:18 GMT 2023
 */

package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer;
import org.apache.commons.jxpath.util.TypeConverter;
import org.apache.commons.jxpath.util.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DOMAttributePointer_ESTest extends DOMAttributePointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("").when(attr0).getLocalName();
      doReturn("").when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      String string0 = dOMAttributePointer0.asPath();
      assertEquals("$/@:", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.PackageFunctions", "org.apache.commons.jxpath.PackageFunctions");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(attr0).getLocalName();
      doReturn("English").when(attr0).getNodeName();
      doReturn("<<unknown namespace>>").when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, attr0);
      QName qName1 = dOMAttributePointer0.getName();
      assertFalse(qName1.equals((Object)qName0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, (Attr) null);
      Object object0 = dOMAttributePointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, (Attr) null);
      Object object0 = dOMAttributePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.setValue(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("XOWA[+Af");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, (Attr) null);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.setValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("5V&'e");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.setValue(variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '5V&'e'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr0);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(dOMAttributePointer0).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.setValue(dOMAttributePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn((Element) null).when(attr0).getOwnerElement();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, (Attr) null);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "*x4MXL~j@rY7>Zy");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(attr0).getNodeName();
      doReturn((String) null).when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.getNamespaceURI();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      variablePointer0.setIndex(39);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.PackageFunctions", "org.apache.commons.jxpath.PackageFunctions");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("m9M'1R\"p2z?m6h]fe").when(attr0).getValue();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, attr0);
      Object object0 = dOMAttributePointer0.getValue();
      assertNotNull(object0);
      assertEquals("m9M'1R\"p2z?m6h]fe", object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(attr0).getValue();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr0);
      Object object0 = dOMAttributePointer0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(";Bh!", "META-INF/services/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(attr0).getNodeName();
      doReturn((String) null).when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.getName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr0);
      Object object0 = dOMAttributePointer0.clone();
      boolean boolean0 = dOMAttributePointer0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      boolean boolean0 = dOMAttributePointer0.equals(qName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr0);
      boolean boolean0 = dOMAttributePointer0.equals(dOMAttributePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, (QName) null);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      Attr attr1 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer1 = new DOMAttributePointer(variablePointer0, attr1);
      boolean boolean0 = dOMAttributePointer0.equals(dOMAttributePointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, (QName) null);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("").when(attr0).getLocalName();
      doReturn("").when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      String string0 = dOMAttributePointer0.asPath();
      assertEquals("$null/@:", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn((short)0).when(attr0).getNodeType();
      QName qName0 = new QName(")& 4=2gi\"hk");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, attr0, (Locale) null);
      Attr attr1 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(attr1).getNodeName();
      doReturn((String) null).when(attr1).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, attr1);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.asPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("", "FFg`");
      Locale locale0 = Locale.ITALIAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("%MEwptn").when(attr0).getLocalName();
      doReturn("<<unknown namespace>>").when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, attr0);
      String string0 = dOMAttributePointer0.asPath();
      assertEquals("/@<<unknown namespace>>:%MEwptn", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, (QName) null);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      boolean boolean0 = dOMAttributePointer0.testNode(nodeTypeTest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr0);
      QName qName0 = new QName("c7Ogfn`o");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "|v|9nH.3#0+");
      boolean boolean0 = dOMAttributePointer0.testNode(nodeNameTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.ITALIAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, attr0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      boolean boolean0 = dOMAttributePointer0.testNode(nodeTypeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("ujc*civWygcP4:<", "ujc*civWygcP4:<");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      boolean boolean0 = dOMAttributePointer0.testNode((NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.ITALIAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(attr0).getSpecified();
      doReturn("").when(attr0).getValue();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, attr0);
      Object object0 = dOMAttributePointer0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("", "FFg`");
      Locale locale0 = Locale.ITALIAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(attr0).getSpecified();
      doReturn("").when(attr0).getValue();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, attr0);
      Object object0 = dOMAttributePointer0.getValue();
      assertNotNull(object0);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(attr0).getValue();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr0);
      dOMAttributePointer0.setValue(dOMAttributePointer0);
      assertFalse(dOMAttributePointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("").when(attr0).getNodeName();
      doReturn((String) null).when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      String string0 = dOMAttributePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName("", "FFg`");
      Locale locale0 = Locale.ITALIAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("<<unknown namespace>>").when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, attr0);
      String string0 = dOMAttributePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, (QName) null);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      int int0 = dOMAttributePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer").when(attr0).toString();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr0);
      Object object0 = dOMAttributePointer0.getImmediateNode();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(attr0).toString();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      Object object0 = dOMAttributePointer0.getBaseValue();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer").when(attr0).getLocalName();
      doReturn("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer").when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr0);
      String string0 = dOMAttributePointer0.asPath();
      assertEquals("@org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer:org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr0);
      boolean boolean0 = dOMAttributePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      Element element0 = mock(Element.class, new ViolatedAssumptionAnswer());
      doReturn(attr0).when(element0).removeAttributeNode(any(org.w3c.dom.Attr.class));
      Attr attr1 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn(element0).when(attr1).getOwnerElement();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr1);
      dOMAttributePointer0.remove();
      assertTrue(dOMAttributePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr0);
      boolean boolean0 = dOMAttributePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      QName qName0 = new QName("E&Rxnx|:;T#-tC5", "<R3;+lV7zy");
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      int int0 = dOMAttributePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr0);
      boolean boolean0 = dOMAttributePointer0.isActual();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr0);
      dOMAttributePointer0.hashCode();
  }
}