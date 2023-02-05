/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 02:24:47 GMT 2023
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.NullElementPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NullElementPointer_ESTest extends NullElementPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName(",%T@FoJ<bG^E,4q^GL");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, (-97));
      NullElementPointer nullElementPointer1 = new NullElementPointer(variablePointer0, 2091);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertFalse(nullElementPointer1.equals((Object)nullElementPointer0));
      assertFalse(boolean0);
      assertEquals(2091, nullElementPointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) jXPathContext0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      NodePointer nodePointer1 = nullElementPointer0.createPath(jXPathContext0, (Object) nodePointer0);
      assertFalse(nodePointer1.isAttribute());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("l4blm!3Fm/");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, linkedList0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 1341);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "U,?`");
      NodePointer nodePointer1 = nullElementPointer0.createPath(jXPathContext0);
      assertEquals(1341, nodePointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) jXPathContext0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      NodePointer nodePointer1 = nullElementPointer0.createPath((JXPathContext) null);
      assertSame(nodePointer1, nodePointer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("Collection element does not exist: ", "Collection element does not exist: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 79);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) "Collection element does not exist: ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $Collection element does not exist: :Collection element does not exist: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "/.");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) basicVariables0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, (-587));
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath((JXPathContext) null, (Object) nullElementPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Index is less than 1: $:/.
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("Jrg(Fa|;1/9F,sl`K", "Jrg(Fa|;1/9F,sl`K");
      Locale locale0 = Locale.ROOT;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("Collection element does not exist: ", "/.");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 47);
      NodePointer nodePointer0 = nullElementPointer0.getValuePointer();
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath((JXPathContext) null, (Object) nodePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("[");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 0);
      Locale locale0 = new Locale("[");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '['
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 0);
      Locale locale0 = Locale.JAPAN;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("G\"@,11WukiYOH4#", "G\"@,11WukiYOH4#");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      variablePointer0.createPath((JXPathContext) null, (Object) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory did not assign a collection to variable 'G\"@,11WukiYOH4#:G\"@,11WukiYOH4#' for path: $G\"@,11WukiYOH4#:G\"@,11WukiYOH4#
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 93);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Kx{e2x~5mrVC(y,#", "Kx{e2x~5mrVC(y,#");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Kx{e2x~5mrVC(y,#:Kx{e2x~5mrVC(y,#'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 1908);
      NodePointer nodePointer0 = nullElementPointer0.getValuePointer();
      NullElementPointer nullElementPointer1 = new NullElementPointer(nodePointer0, (-203));
      String string0 = nullElementPointer1.asPath();
      assertEquals("[1909]/.[-202]", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 1908);
      String string0 = nullElementPointer0.asPath();
      assertEquals("[1909]", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("Collection element does not exist: ", "/.");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 47);
      nullElementPointer0.getName();
      assertEquals(47, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("Collection element does not exist: ", "/.");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 47);
      boolean boolean0 = nullElementPointer0.isContainer();
      assertEquals(47, nullElementPointer0.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("Collection element does not exist: ", "/.");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 47);
      String string0 = nullElementPointer0.asPath();
      assertEquals("$Collection element does not exist: :/.[48]", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("Collection element does not exist: ");
      Locale locale0 = new Locale("Collection element does not exist: ");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Collection element does not exist: ", locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 1024);
      String string0 = nullElementPointer0.asPath();
      assertEquals("'Collection element does not exist: '[1025]", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 1908);
      NullElementPointer nullElementPointer1 = new NullElementPointer(nullElementPointer0, 1908);
      String string0 = nullElementPointer1.asPath();
      assertEquals("[1909]/.[1909]", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, Integer.MIN_VALUE);
      String string0 = nullElementPointer0.asPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 1908);
      NullElementPointer nullElementPointer1 = new NullElementPointer((NodePointer) null, 1908);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertTrue(boolean0);
      assertEquals(1908, nullElementPointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 1908);
      NodePointer nodePointer0 = nullElementPointer0.getValuePointer();
      NullElementPointer nullElementPointer1 = new NullElementPointer(nodePointer0, 0);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertFalse(boolean0);
      assertEquals(1908, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 1908);
      NullElementPointer nullElementPointer1 = new NullElementPointer((NodePointer) null, 0);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertEquals(1908, nullElementPointer0.getIndex());
      assertFalse(boolean0);
      assertFalse(nullElementPointer1.equals((Object)nullElementPointer0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 1908);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer0);
      assertTrue(boolean0);
      assertEquals(1908, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 1908);
      boolean boolean0 = nullElementPointer0.equals((Object) null);
      assertEquals(1908, nullElementPointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("Jrg(Fa|;1/9F,sl`K", "Jrg(Fa|;1/9F,sl`K");
      Locale locale0 = Locale.ROOT;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 0);
      boolean boolean0 = nullElementPointer0.isCollection();
      assertEquals(0, nullElementPointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 1908);
      nullElementPointer0.hashCode();
      assertEquals(1908, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("Collection element does not exist: ", "Collection element does not exist: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 79);
      boolean boolean0 = nullElementPointer0.isLeaf();
      assertEquals(79, nullElementPointer0.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, (-166));
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullElementPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName("Collection element does not exist: ");
      Locale locale0 = new Locale("Collection element does not exist: ");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Collection element does not exist: ", locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 1024);
      nullElementPointer0.getBaseValue();
      assertEquals(1024, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QName qName0 = new QName("[");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, linkedList0, locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 1094);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) locale0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1094, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 1908);
      int int0 = nullElementPointer0.getLength();
      assertEquals(1908, nullElementPointer0.getIndex());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QName qName0 = new QName("[");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, linkedList0, locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 1094);
      boolean boolean0 = nullElementPointer0.isActual();
      assertFalse(boolean0);
      assertEquals(1094, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName("hyrgt50b_w0");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      nullElementPointer0.getPropertyPointer();
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("[");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, linkedList0, locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 1094);
      nullElementPointer0.getImmediateNode();
      assertEquals(1094, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 1908);
      NodePointer nodePointer0 = nullElementPointer0.getValuePointer();
      NullElementPointer nullElementPointer1 = new NullElementPointer(nodePointer0, 0);
      // Undeclared exception!
      try { 
        nullElementPointer1.setValue(nullElementPointer1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Collection element does not exist: [1909]/.[1]
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullElementPointer", e);
      }
  }
}
