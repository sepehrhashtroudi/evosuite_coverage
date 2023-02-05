/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 05 07:17:04 GMT 2023
 */

package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ElementWrapper_ESTest extends ElementWrapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "YFY8zp?(#", "O}|lV.O2}-!0=nkO");
      String string0 = elementWrapper0.toString();
      assertEquals("O}|lV.O2}-!0=nkO", elementWrapper0.getWrapperNamespace());
      assertEquals("Wrapper: ROOT, matching: YFY8zp?(#", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "YFY8zp?(#", "O}|lV.O2}-!0=nkO");
      boolean boolean0 = elementWrapper0.matchesWrapper("YFY8zp?(#", (String) null);
      assertFalse(boolean0);
      assertEquals("YFY8zp?(#", elementWrapper0.getWrapperLocalName());
      assertEquals("O}|lV.O2}-!0=nkO", elementWrapper0.getWrapperNamespace());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "YFY8zp?(#", "O}|lV.O2}-!0=nkO");
      String string0 = elementWrapper0.getWrapperNamespace();
      assertEquals("YFY8zp?(#", elementWrapper0.getWrapperLocalName());
      assertTrue(elementWrapper0.isMatching());
      assertEquals("O}|lV.O2}-!0=nkO", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "", "");
      ElementWrapper elementWrapper1 = ElementWrapper.matchingWrapper(elementWrapper0, (String) null, "");
      assertFalse(elementWrapper1.isMatching());
      assertTrue(elementWrapper0.isMatching());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "", "");
      elementWrapper0.getWrapperNamespace();
      assertTrue(elementWrapper0.isMatching());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "", "");
      ElementWrapper elementWrapper1 = elementWrapper0.intermediateWrapper();
      String string0 = elementWrapper1.getWrapperLocalName();
      assertNull(string0);
      assertTrue(elementWrapper0.isMatching());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "", "");
      String string0 = elementWrapper0.getWrapperLocalName();
      assertNotNull(string0);
      assertTrue(elementWrapper0.isMatching());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "%ybWXg8f$oe<%", "%ybWXg8f$oe<%");
      ElementWrapper elementWrapper1 = elementWrapper0.intermediateWrapper();
      ElementWrapper elementWrapper2 = elementWrapper1.getParent();
      assertNotNull(elementWrapper2);
      assertTrue(elementWrapper2.isMatching());
      assertEquals("%ybWXg8f$oe<%", elementWrapper2.getWrapperNamespace());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "O}|lV.O2}-!0=nkO", "O}|lV.O2}-!0=nkO");
      ElementWrapper elementWrapper1 = elementWrapper0.intermediateWrapper();
      ElementWrapper elementWrapper2 = elementWrapper1.intermediateWrapper();
      ElementWrapper elementWrapper3 = elementWrapper2.getParent();
      assertTrue(elementWrapper0.isMatching());
      assertEquals("O}|lV.O2}-!0=nkO", elementWrapper0.getWrapperNamespace());
      assertNotNull(elementWrapper3);
      assertNotSame(elementWrapper3, elementWrapper2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "%ybWXg8f$oe<%", "%ybWXg8f$oe<%");
      ElementWrapper elementWrapper1 = ElementWrapper.matchingWrapper(elementWrapper0, "%ybWXg8f$oe<%", "%ybWXg8f$oe<%");
      String string0 = elementWrapper1.toString();
      assertEquals("Wrapper: branch, matching: %ybWXg8f$oe<%", string0);
      assertEquals("%ybWXg8f$oe<%", elementWrapper1.getWrapperNamespace());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "%ybWXg8f$oe<%", "%ybWXg8f$oe<%");
      ElementWrapper elementWrapper1 = elementWrapper0.intermediateWrapper();
      String string0 = elementWrapper1.toString();
      assertEquals("Wrapper: empty", string0);
      assertTrue(elementWrapper0.isMatching());
      assertEquals("%ybWXg8f$oe<%", elementWrapper0.getWrapperNamespace());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "", "");
      boolean boolean0 = elementWrapper0.matchesWrapper("", "#=[Er~Y!%a[");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "", "");
      boolean boolean0 = elementWrapper0.matchesWrapper("", (String) null);
      assertTrue(elementWrapper0.isMatching());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "%ybWXg8f$oe<%", "%ybWXg8f$oe<%");
      ElementWrapper elementWrapper1 = elementWrapper0.intermediateWrapper();
      boolean boolean0 = elementWrapper1.matchesWrapper("%ybWXg8f$oe<%", "%ybWXg8f$oe<%");
      assertTrue(boolean0);
      assertEquals("%ybWXg8f$oe<%", elementWrapper0.getWrapperNamespace());
      assertTrue(elementWrapper0.isMatching());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "Eo#}qk~rl`:kKcD\"!", "Eo#}qk~rl`:kKcD\"!");
      boolean boolean0 = elementWrapper0.matchesWrapper("", "");
      assertEquals("Eo#}qk~rl`:kKcD\"!", elementWrapper0.getWrapperNamespace());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "%ybWXg8f$oe<%", "%ybWXg8f$oe<%");
      boolean boolean0 = elementWrapper0.isMatching();
      assertEquals("%ybWXg8f$oe<%", elementWrapper0.getWrapperNamespace());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "%ybWXg8f$oe<%", "%ybWXg8f$oe<%");
      String string0 = elementWrapper0.getWrapperLocalName();
      assertNotNull(string0);
      assertEquals("%ybWXg8f$oe<%", elementWrapper0.getWrapperNamespace());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "%ybWXg8f$oe<%", "%ybWXg8f$oe<%");
      ElementWrapper elementWrapper1 = elementWrapper0.getParent();
      assertEquals("%ybWXg8f$oe<%", elementWrapper0.getWrapperNamespace());
      assertNull(elementWrapper1);
      assertTrue(elementWrapper0.isMatching());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, "%ybWXg8f$oe<%", "%ybWXg8f$oe<%");
      ElementWrapper elementWrapper1 = elementWrapper0.intermediateWrapper();
      boolean boolean0 = elementWrapper1.isMatching();
      assertTrue(elementWrapper0.isMatching());
      assertFalse(boolean0);
      assertEquals("%ybWXg8f$oe<%", elementWrapper0.getWrapperNamespace());
  }
}