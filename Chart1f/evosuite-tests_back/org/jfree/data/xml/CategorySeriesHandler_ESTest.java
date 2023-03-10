/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 19:49:16 GMT 2022
 */

package org.jfree.data.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.EmptyStackException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xml.CategoryDatasetHandler;
import org.jfree.data.xml.CategorySeriesHandler;
import org.jfree.data.xml.RootHandler;
import org.junit.runner.RunWith;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.Attributes2Impl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CategorySeriesHandler_ESTest extends CategorySeriesHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CategoryDatasetHandler categoryDatasetHandler0 = new CategoryDatasetHandler();
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(categoryDatasetHandler0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      categorySeriesHandler0.startElement("-P?LZ%3bh8Rh{qf", "Item", "Item", attributes2Impl0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler((RootHandler) null);
      // Undeclared exception!
      try { 
        categorySeriesHandler0.startElement((String) null, (String) null, "Item", (Attributes) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xml.CategorySeriesHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(rootHandler0);
      Byte byte0 = new Byte((byte) (-15));
      // Undeclared exception!
      try { 
        categorySeriesHandler0.addItem((Comparable) null, byte0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(rootHandler0);
      categorySeriesHandler0.setSeriesKey("");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CategoryDatasetHandler categoryDatasetHandler0 = new CategoryDatasetHandler();
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(categoryDatasetHandler0);
      // Undeclared exception!
      try { 
        categorySeriesHandler0.endElement("Item", "R`ADRo#N-ZJC/", "Item");
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(rootHandler0);
      categorySeriesHandler0.endElement((String) null, (String) null, "");
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(rootHandler0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      try { 
        categorySeriesHandler0.startElement(";^CxE4).CIe", "", "go8.J", attributes2Impl0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Expecting <Series> or <Item> tag...found go8.J
         //
         verifyException("org.jfree.data.xml.CategorySeriesHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CategoryDatasetHandler categoryDatasetHandler0 = new CategoryDatasetHandler();
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(categoryDatasetHandler0);
      Integer integer0 = new Integer(1965);
      categorySeriesHandler0.addItem(integer0, integer0);
      // Undeclared exception!
      try { 
        categorySeriesHandler0.endElement("\tem", "\tem", "\tem");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xml.CategoryDatasetHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CategoryDatasetHandler categoryDatasetHandler0 = new CategoryDatasetHandler();
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(categoryDatasetHandler0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      categorySeriesHandler0.startElement((String) null, "Series", "Series", attributes2Impl0);
  }
}
