/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 02:19:42 GMT 2023
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
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NullPointer_ESTest extends NullPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, (QName) null);
      QName qName0 = nullPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, qName0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      NodePointer nodePointer1 = nullPointer0.createPath(jXPathContext0);
      assertEquals(Integer.MIN_VALUE, nodePointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("", "");
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.FRANCE;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, list0, locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      NodePointer nodePointer1 = nullPointer0.createChild(jXPathContext0, qName0, (-2937));
      assertEquals((-2937), nodePointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.US;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      nullPointer0.createPath(jXPathContext0, (Object) linkedList0);
      NodePointer nodePointer0 = nullPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
      assertTrue(nodePointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      // Undeclared exception!
      try { 
        nullPointer0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("", " - no such property");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      Locale locale0 = Locale.forLanguageTag("Pz#L@XDe5^}M4'");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0, (Object) locale0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $: - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("Fj;]21P}[F?oJD$~F");
      Locale locale0 = Locale.ITALY;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Fj;]21P}[F?oJD$~F", locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("B");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $B
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, (QName) null);
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0);
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
      Locale locale0 = Locale.CHINESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "J*~m[v Q)~`>aV|q");
      // Undeclared exception!
      try { 
        nullPointer0.createChild((JXPathContext) null, (QName) null, 0, (Object) nullPointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: id(J*~m[v Q)~`>aV|q)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, (QName) null);
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, (QName) null, (-3396), (Object) variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("Gt[@F<W+dDU\"Em", "Gt[@F<W+dDU\"Em");
      Locale locale0 = Locale.ENGLISH;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Gt[@F<W+dDU\"Em:Gt[@F<W+dDU\"Em'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, qName0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, qName0, (-541));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path $:/:[-540], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild((JXPathContext) null, qName0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("j)Oo0u(!k.e>@RXu:I", "j)Oo0u(!k.e>@RXu:I");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      Locale locale0 = Locale.ITALY;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'j)Oo0u(!k.e>@RXu:I:j)Oo0u(!k.e>@RXu:I'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.util.BasicTypeConverter", "org.apache.commons.jxpath.util.BasicTypeConverter");
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Locale locale0 = new Locale("", "<<unknown namespace>>", "");
      variablePointer0.setIndex(2445);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'org.apache.commons.jxpath.util.BasicTypeConverter:org.apache.commons.jxpath.util.BasicTypeConverter'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      String string0 = nullPointer0.asPath();
      assertEquals("null()", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      String string0 = nullPointer0.asPath();
      assertEquals("id()", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      // Undeclared exception!
      try { 
        nullPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: id()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("5-RKY!A?@Jtu");
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      NodePointer nodePointer1 = nullPointer0.createPath(jXPathContext0);
      assertFalse(nodePointer1.isAttribute());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("Gt[@F<W+dDU\"Em", "5-RKY!A?@Jtu");
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Gt[@F<W+dDU\"Em", locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      QName qName1 = nullPointer0.getName();
      assertSame(qName0, qName1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      QName qName0 = new QName("<<unknown namespace>>", "Fl}>]F*r777d$");
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "Fl}>]F*r777d$");
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("Gt[@F<W+dDU\"Em");
      Locale locale0 = new Locale("Gt[@F<W+dDU\"Em");
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      NullPointer nullPointer1 = new NullPointer(locale0, "<<unknown namespace>>");
      boolean boolean0 = nullPointer0.equals(nullPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "Fl}>]F*r777d$");
      QName qName0 = new QName("<<unknown namespace>>", "Fl}>]F*r777d$");
      NullPointer nullPointer1 = new NullPointer(qName0, locale0);
      boolean boolean0 = nullPointer0.equals(nullPointer1);
      assertFalse(boolean0);
      assertFalse(nullPointer1.equals((Object)nullPointer0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("Gt[@F<W+dDU\"Em", "5-RKY!A?@Jtu");
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Gt[@F<W+dDU\"Em", locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      NullPointer nullPointer1 = new NullPointer(qName0, locale0);
      boolean boolean0 = nullPointer0.equals(nullPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      NullPointer nullPointer0 = new NullPointer(locale0, "d");
      NullPointer nullPointer1 = new NullPointer(nullPointer0, (QName) null);
      boolean boolean0 = nullPointer0.equals(nullPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      NullPointer nullPointer0 = new NullPointer(locale0, "d");
      boolean boolean0 = nullPointer0.equals(nullPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("Gt[@F<W+dDU\"Em", "5-RKY!A?@Jtu");
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Gt[@F<W+dDU\"Em", locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      boolean boolean0 = nullPointer0.equals(nodePointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      NullPointer nullPointer0 = new NullPointer(locale0, "d");
      nullPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(locale0, "h7v=");
      QName qName0 = new QName("h7v=", "h7v=");
      NullPointer nullPointer1 = new NullPointer(nullPointer0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        nullPointer1.createPath(jXPathContext0, (Object) "h7v=");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: id(h7v=)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(locale0, "h7v=");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0, (Object) "h7v=");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: id(h7v=)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, (QName) null);
      int int0 = nullPointer0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QName qName0 = new QName("Gt[@F<W+dDU\"Em", "5-RKY!A?@Jtu");
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Gt[@F<W+dDU\"Em", locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      boolean boolean0 = nullPointer0.isActual();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, (QName) null);
      boolean boolean0 = nullPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("Gt[@F<W+dDU\"Em", "5-RKY!A?@Jtu");
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Gt[@F<W+dDU\"Em", locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) ":9dv~=");
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, qName0, 0, (Object) nodePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path 'Gt[@F<W+dDU\"Em'/Gt[@F<W+dDU\"Em:5-RKY!A?@Jtu[1], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, (QName) null);
      Object object0 = nullPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, (QName) null);
      boolean boolean0 = nullPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, (QName) null);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      assertFalse(propertyPointer0.isNode());
  }
}
