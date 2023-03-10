/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 02:21:02 GMT 2023
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BeanPointer_ESTest extends BeanPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Class<Short> class1 = Short.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      beanPointer0.setIndex(3358);
      BeanPointer beanPointer1 = new BeanPointer((NodePointer) null, (QName) null, locale0, (JXPathBeanInfo) null);
      boolean boolean0 = beanPointer1.equals(beanPointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Float> class0 = Float.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.CANADA_FRENCH;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, "]PJUoE", jXPathBasicBeanInfo0, locale0);
      QName qName0 = beanPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<BeanPointer> class0 = BeanPointer.class;
      Class<Integer> class1 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, (Object) null, jXPathBasicBeanInfo0);
      Object object0 = beanPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("bb?A^kgK)oA\"0u_d", (String) null);
      Class<Long> class0 = Long.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = new Locale("W`", "W`", "Cannot replace the root object");
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      // Undeclared exception!
      try { 
        beanPointer0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.JAPAN;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, locale0, jXPathBasicBeanInfo0, locale0);
      String string0 = beanPointer0.asPath();
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = new Locale("\"comment\"");
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      String string0 = beanPointer0.asPath();
      assertEquals("null()", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.UK;
      Class<Object> class0 = Object.class;
      Class<Byte> class1 = Byte.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPointer beanPointer0 = new BeanPointer(qName0, "%[", jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      Object object0 = new Object();
      BeanPointer beanPointer1 = new BeanPointer(propertyPointer0, qName0, object0, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPointer1.asPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.JXPathBasicBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("java.lang.Float@0000000007.0", "jva.lang.Double@0000000009.0");
      Class<Boolean> class0 = Boolean.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.CANADA_FRENCH;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "jva.lang.Double@0000000009.0", jXPathBasicBeanInfo0, locale0);
      String string0 = beanPointer0.asPath();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Class<Boolean> class0 = Boolean.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.JAPAN;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, boolean0, jXPathBasicBeanInfo0, locale0);
      String string0 = beanPointer0.asPath();
      assertEquals("true()", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("");
      Boolean boolean0 = Boolean.FALSE;
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.ITALIAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, boolean0, jXPathBasicBeanInfo0, locale0);
      String string0 = beanPointer0.asPath();
      assertEquals("false()", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("\"comment\"");
      Short short0 = new Short((short)98);
      Class<Boolean> class0 = Boolean.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = new Locale("\"comment\"");
      BeanPointer beanPointer0 = new BeanPointer(qName0, short0, jXPathBasicBeanInfo0, locale0);
      String string0 = beanPointer0.asPath();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("<HJbxqu", (String) null);
      Class<Integer> class0 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.JAPANESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      Object object0 = beanPointer0.clone();
      boolean boolean0 = beanPointer0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("");
      Boolean boolean0 = Boolean.FALSE;
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.ITALIAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, boolean0, jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer(qName0, beanPointer0.WHOLE_COLLECTION, jXPathBasicBeanInfo0, locale0);
      boolean boolean1 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("\"comment\"");
      Short short0 = new Short((short)98);
      Class<Boolean> class0 = Boolean.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = new Locale("\"comment\"");
      BeanPointer beanPointer0 = new BeanPointer(qName0, short0, jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer(qName0, short0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Class<Short> class1 = Short.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      beanPointer0.setIndex((-921));
      BeanPointer beanPointer1 = new BeanPointer((NodePointer) null, (QName) null, locale0, (JXPathBeanInfo) null);
      boolean boolean0 = beanPointer1.equals(beanPointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Class<Short> class1 = Short.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.JAPAN;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer((NodePointer) null, (QName) null, locale0, jXPathBasicBeanInfo0);
      beanPointer1.setIndex(3863);
      boolean boolean0 = beanPointer1.equals(beanPointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("java.lang.Float@0000000007.0", "java.lang.Float@0000000007.0");
      Class<Boolean> class0 = Boolean.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.CANADA_FRENCH;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "java.lang.Float@0000000007.0", jXPathBasicBeanInfo0, locale0);
      QName qName1 = new QName("java.lang.Float@0000000007.0");
      BeanPointer beanPointer1 = new BeanPointer(qName1, qName0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("\"comment\"");
      Short short0 = new Short((short)98);
      Class<Boolean> class0 = Boolean.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = new Locale("\"comment\"");
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer(qName0, short0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("java.lang.Float@0000000007.0", "java.lang.Float@0000000007.0");
      Class<Boolean> class0 = Boolean.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.CANADA_FRENCH;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "java.lang.Float@0000000007.0", jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Class<Short> class1 = Short.TYPE;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.KOREAN;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      BeanPointer beanPointer1 = new BeanPointer(propertyPointer0, (QName) null, locale0, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer1.equals(beanPointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Class<Short> class1 = Short.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.JAPAN;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer((NodePointer) null, (QName) null, locale0, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer1.equals(beanPointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName(".");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.US;
      BeanPointer beanPointer0 = new BeanPointer(qName0, ".", jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(".");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("\"comment\"");
      Short short0 = new Short((short)98);
      Class<Boolean> class0 = Boolean.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = new Locale("\"comment\"");
      BeanPointer beanPointer0 = new BeanPointer(qName0, short0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("bb?A^kgK)oA\"0u_d", "bb?A^kgK)oA\"0u_d");
      Class<Long> class0 = Long.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = new Locale("W`", "W`", "bb?A^kgK)oA\"0u_d");
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, "bb?A^kgK)oA\"0u_d", jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      Class<Boolean> class1 = Boolean.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = new Locale("/r=a/eB17#F");
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      beanPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("bb?A^kgK)oA\"0u_d", "bb?A^kgK)oA\"0u_d");
      Class<Long> class0 = Long.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = new Locale("W`", "W`", "bb?A^kgK)oA\"0u_d");
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Class<Short> class1 = Short.TYPE;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.KOREAN;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("java.lang.Float@0000000007.0", "jva.lang.Double@0000000009.0");
      Class<Boolean> class0 = Boolean.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.CANADA_FRENCH;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "jva.lang.Double@0000000009.0", jXPathBasicBeanInfo0, locale0);
      int int0 = beanPointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("bb?A^kgK)oA\"0u_d", "bb?A^kgK)oA\"0u_d");
      Class<Long> class0 = Long.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = new Locale("W`", "W`", "bb?A^kgK)oA\"0u_d");
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      Object object0 = beanPointer0.getBaseValue();
      assertSame(qName0, object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("bb?A^kgK)oA\"0u_d", "bb?A^kgK)oA\"0u_d");
      Class<Long> class0 = Long.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = new Locale("W`", "W`", "bb?A^kgK)oA\"0u_d");
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, "bb?A^kgK)oA\"0u_d", jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer1.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName("bb?A^kgK)oA\"0u_d", "bb?A^kgK)oA\"0u_d");
      Class<Long> class0 = Long.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = new Locale("W`", "W`", "bb?A^kgK)oA\"0u_d");
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      QName qName1 = beanPointer0.getName();
      assertSame(qName0, qName1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Class<Boolean> class0 = Boolean.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.JAPAN;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, boolean0, jXPathBasicBeanInfo0, locale0);
      boolean boolean1 = beanPointer0.isCollection();
      assertFalse(boolean1);
  }
}
