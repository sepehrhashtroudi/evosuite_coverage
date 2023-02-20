/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 02:15:02 GMT 2023
 */

package org.apache.commons.jxpath.ri.model.dynabeans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynaBeanPointerFactory_ESTest extends DynaBeanPointerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DynaBeanPointerFactory dynaBeanPointerFactory0 = new DynaBeanPointerFactory();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("2t}>o", "2t}>o");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dynaBeanPointerFactory0.createNodePointer((NodePointer) variablePointer0, qName0, object0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/DynaBean
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DynaBeanPointerFactory dynaBeanPointerFactory0 = new DynaBeanPointerFactory();
      QName qName0 = new QName("");
      Locale locale0 = new Locale("Index is less than 1: ", " 3&&;aW$");
      // Undeclared exception!
      try { 
        dynaBeanPointerFactory0.createNodePointer(qName0, (Object) "", locale0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/DynaBean
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DynaBeanPointerFactory dynaBeanPointerFactory0 = new DynaBeanPointerFactory();
      QName qName0 = new QName("", "");
      NodePointer nodePointer0 = dynaBeanPointerFactory0.createNodePointer((NodePointer) null, qName0, (Object) null);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DynaBeanPointerFactory dynaBeanPointerFactory0 = new DynaBeanPointerFactory();
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = dynaBeanPointerFactory0.createNodePointer(qName0, (Object) null, locale0);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DynaBeanPointerFactory dynaBeanPointerFactory0 = new DynaBeanPointerFactory();
      int int0 = dynaBeanPointerFactory0.getOrder();
      assertEquals(700, int0);
  }
}
