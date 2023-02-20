/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 02:22:32 GMT 2023
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NullPropertyPointer_ESTest extends NullPropertyPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      nullPropertyPointer0.setNameAttributeValue((String) null);
      String string0 = nullPropertyPointer0.getPropertyName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      
      nullPropertyPointer0.setPropertyName("");
      String string0 = nullPropertyPointer0.getPropertyName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("EuzmGp&Zj4ht)]k^^^");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "EuzmGp&Zj4ht)]k^^^");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) basicVariables0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.createPath(jXPathContext0, (Object) basicVariables0);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("ki Y%", "&quot;");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, linkedList0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.createPath((JXPathContext) null);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("EuzmGp&Zj4ht)]k^^^");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "EuzmGp&Zj4ht)]k^^^");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) basicVariables0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.createPath(jXPathContext0);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("FI?hSKA_", "FI?hSKA_");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      variablePointer0.createPath((JXPathContext) null, (Object) variablePointer0);
      NodePointer nodePointer0 = nullPropertyPointer0.createChild((JXPathContext) null, qName0, 0, (Object) null);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      assertEquals(0, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("FI?hSKA_", "FI?hSKA_");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      variablePointer0.createPath((JXPathContext) null, (Object) variablePointer0);
      nullPropertyPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE, (Object) "<<unknown namespace>>");
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("EuzmGp&Zj4ht)]k^^^");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "EuzmGp&Zj4ht)]k^^^");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) basicVariables0);
      nodePointer0.setAttribute(true);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) basicVariables0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      nullPropertyPointer0.setNameAttributeValue("Zub59Tc/2qZ@d>*,;");
      // Undeclared exception!
      try { 
        nullPropertyPointer0.setValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("EuzmGp&Zj4ht)]k^^^");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "EuzmGp&Zj4ht)]k^^^");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) basicVariables0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.setIndex(1915);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0, (Object) basicVariables0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn org.apache.commons.jxpath.BasicVariables into a collection of size 1916
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      Pointer pointer0 = jXPathContext0.getNamespaceContextPointer();
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0, (Object) pointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: id()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Locale locale0 = Locale.US;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath((JXPathContext) null, (Object) nullPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("FI?hSKA_", "FI?hSKA_");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory did not assign a collection to variable 'FI?hSKA_:FI?hSKA_' for path: $FI?hSKA_:FI?hSKA_
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = new Locale("&=UHEg/NMA", "");
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      QName qName0 = new QName("", "");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(nullPointer0, qName0, "");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, qName0, nodePointer0, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.JXPathBasicBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("FI?hSKA_", "FI?hSKA_");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild((JXPathContext) null, qName0, (-1577), (Object) "FI?hSKA_");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory did not assign a collection to variable 'FI?hSKA_:FI?hSKA_' for path: $FI?hSKA_:FI?hSKA_
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      QName qName0 = propertyPointer0.getName();
      // Undeclared exception!
      try { 
        propertyPointer0.createChild((JXPathContext) null, qName0, 95, (Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = new QName("<<unknown namespace>>");
      Class<Integer> class0 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) beanPointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild(jXPathContext0, qName0, (-375), (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("EuzmGp&Zj4ht)]k^^^");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "EuzmGp&Zj4ht)]k^^^");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) basicVariables0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild(jXPathContext0, qName0, 32767);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn org.apache.commons.jxpath.BasicVariables into a collection of size 32768
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("FI?hSKA_", "FI?hSKA_");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory did not assign a collection to variable 'FI?hSKA_:FI?hSKA_' for path: $FI?hSKA_:FI?hSKA_
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) "");
      QName qName0 = new QName("c3dXm+D)i", "c3dXm+D)i");
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild(jXPathContext0, qName0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(":l0zOJ4<qQ@mcg", ":l0zOJ4<qQ@mcg");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) variablePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild(jXPathContext0, qName0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':l0zOJ4<qQ@mcg::l0zOJ4<qQ@mcg'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      nullPropertyPointer0.setNameAttributeValue("/*");
      // Undeclared exception!
      try { 
        nullPropertyPointer0.asPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("9'e", "9'e");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      variablePointer0.setIndex(103);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '9'e:9'e'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      String string0 = nullPropertyPointer0.asPath();
      assertEquals("/*", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      assertFalse(nullPropertyPointer0.isCollection());
      
      nullPropertyPointer0.setIndex(0);
      boolean boolean0 = nullPropertyPointer0.isCollection();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = new Locale("&=UHEg/NMA", "");
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      QName qName0 = new QName("", "");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(nullPointer0, qName0, "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: id()/:/*
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("3F3,Pm]D", "+f]L6XJqGFN>P5");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '3F3,Pm]D:+f]L6XJqGFN>P5'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      nullPropertyPointer0.getValuePointer();
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("9'e", "9'e");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      String string0 = nullPropertyPointer0.getPropertyName();
      assertEquals("*", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QName qName0 = new QName("xH'>f\"~:y9.R8", "xH'>f\"~:y9.R8");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.setNameAttributeValue("<<unknown namespace>>");
      nullPropertyPointer0.setPropertyName("\"local-name\"");
      nullPropertyPointer0.asPath();
      assertEquals("\"local-name\"", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("9'e", "9'e");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      nullPropertyPointer0.setNameAttributeValue("9'e");
      nullPropertyPointer0.setIndex((-1600));
      // Undeclared exception!
      try { 
        nullPropertyPointer0.setValue("9'e");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property $9'e:9'e[@name='9&apos;e'][-1599], path does not match a changeable location
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      nullPropertyPointer0.setIndex(0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.setValue("<<unknown namespace>>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property /*[1], the target object is null
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName("xH'>f\"~:y9.8", "xH'>f\"~:y9.8");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      boolean boolean0 = nullPropertyPointer0.isCollection();
      assertFalse(boolean0);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("EuzmGp&Zj4ht)]k^^^");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "EuzmGp&Zj4ht)]k^^^");
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      Class<NullPointer> class0 = NullPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, nullPointer0, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0, (Object) basicVariables0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property: $EuzmGp&Zj4ht)]k^^^/* - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("FI?hSKA_", "FI?hSKA_");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath((JXPathContext) null, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'FI?hSKA_:FI?hSKA_'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      QName qName0 = new QName(", the target object is null", "");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "<w<yLJ", locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild(jXPathContext0, qName0, 551, (Object) list0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: '<w<yLJ'/*
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(propertyPointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.setValue(propertyPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property null()/*, the target object is null
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("FI?hSKA_", "FI?hSKA_");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      boolean boolean0 = nullPropertyPointer0.isActualProperty();
      assertFalse(boolean0);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      int int0 = nullPropertyPointer0.getPropertyCount();
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      int int0 = nullPropertyPointer0.getLength();
      assertEquals(0, int0);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      QName qName0 = new QName("khe");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.setPropertyIndex(Integer.MIN_VALUE);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      QName qName0 = new QName("xH'>f\"~:y9.R8", "xH'>f\"~:y9.R8");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      boolean boolean0 = nullPropertyPointer0.isActual();
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      QName qName0 = new QName("p", "p");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        propertyPointer0.createChild(jXPathContext0, qName0, (-846));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("FI?hSKA_", "FI?hSKA_");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.getBaseValue();
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      nullPropertyPointer0.getImmediateNode();
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      String[] stringArray0 = nullPropertyPointer0.getPropertyNames();
      assertEquals(0, stringArray0.length);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      boolean boolean0 = nullPropertyPointer0.isLeaf();
      assertTrue(boolean0);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("FI?hSKA_", "FI?hSKA_");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE, (Object) "<<unknown namespace>>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'FI?hSKA_:FI?hSKA_'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("FI?hSKA_", "FI?hSKA_");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      boolean boolean0 = nullPropertyPointer0.isContainer();
      assertTrue(boolean0);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }
}
