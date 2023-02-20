/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 02:19:05 GMT 2023
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CollectionPointerFactory_ESTest extends CollectionPointerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CollectionPointerFactory collectionPointerFactory0 = new CollectionPointerFactory();
      QName qName0 = new QName("f(9e$>Xa:q[mE$6L>", "U{rd-");
      Locale locale0 = Locale.forLanguageTag("3&L(");
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
      NodePointer nodePointer0 = collectionPointerFactory0.createNodePointer((NodePointer) null, qName0, (Object) list0);
      assertTrue(nodePointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CollectionPointerFactory collectionPointerFactory0 = new CollectionPointerFactory();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory", "org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory");
      Object object0 = new Object();
      NodePointer nodePointer0 = collectionPointerFactory0.createNodePointer(qName0, object0, (Locale) null);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CollectionPointerFactory collectionPointerFactory0 = new CollectionPointerFactory();
      QName qName0 = new QName("|a", "|a");
      Locale locale0 = Locale.JAPANESE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, collectionPointerFactory0, locale0);
      NodePointer nodePointer1 = collectionPointerFactory0.createNodePointer(nodePointer0, qName0, (Object) set0);
      assertEquals(10, collectionPointerFactory0.getOrder());
      assertNotNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CollectionPointerFactory collectionPointerFactory0 = new CollectionPointerFactory();
      QName qName0 = new QName("|a", "|a");
      Locale locale0 = Locale.JAPANESE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      NodePointer nodePointer0 = collectionPointerFactory0.createNodePointer(qName0, (Object) set0, locale0);
      NodePointer nodePointer1 = collectionPointerFactory0.createNodePointer(nodePointer0, qName0, (Object) nodePointer0);
      assertNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CollectionPointerFactory collectionPointerFactory0 = new CollectionPointerFactory();
      int int0 = collectionPointerFactory0.getOrder();
      assertEquals(10, int0);
  }
}