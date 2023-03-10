/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 19:51:06 GMT 2022
 */

package org.jfree.data.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.EmptyStackException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xml.ItemHandler;
import org.jfree.data.xml.KeyHandler;
import org.jfree.data.xml.RootHandler;
import org.junit.runner.RunWith;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KeyHandler_ESTest extends KeyHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      ItemHandler itemHandler0 = new ItemHandler(rootHandler0, rootHandler0);
      KeyHandler keyHandler0 = new KeyHandler(rootHandler0, itemHandler0);
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        keyHandler0.characters(charArray0, (-253), (-3656));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      KeyHandler keyHandler0 = new KeyHandler(rootHandler0, (ItemHandler) null);
      try { 
        keyHandler0.endElement("Series", "Series", "");
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Expecting </Key> but found 
         //
         verifyException("org.jfree.data.xml.KeyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      ItemHandler itemHandler0 = new ItemHandler(rootHandler0, rootHandler0);
      KeyHandler keyHandler0 = new KeyHandler(rootHandler0, itemHandler0);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      try { 
        keyHandler0.startElement("Value", ")B0nzD6A1nn3", ")B0nzD6A1nn3", attributesImpl0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Expecting <Key> but found )B0nzD6A1nn3
         //
         verifyException("org.jfree.data.xml.KeyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      ItemHandler itemHandler0 = new ItemHandler(rootHandler0, rootHandler0);
      KeyHandler keyHandler0 = new KeyHandler(rootHandler0, itemHandler0);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      try { 
        keyHandler0.startElement("", "Expecting <Value> but found ", "", attributesImpl0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Expecting <Key> but found 
         //
         verifyException("org.jfree.data.xml.KeyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      ItemHandler itemHandler0 = new ItemHandler(rootHandler0, rootHandler0);
      KeyHandler keyHandler0 = new KeyHandler(rootHandler0, itemHandler0);
      keyHandler0.clearCurrentText();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      rootHandler0.pushSubHandler((DefaultHandler) null);
      ItemHandler itemHandler0 = new ItemHandler(rootHandler0, rootHandler0);
      KeyHandler keyHandler0 = new KeyHandler(rootHandler0, itemHandler0);
      keyHandler0.endElement("Expecting </Key> but found ", "Expecting <Key> but found ", "Key");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ItemHandler itemHandler0 = new ItemHandler((RootHandler) null, (DefaultHandler) null);
      KeyHandler keyHandler0 = new KeyHandler((RootHandler) null, itemHandler0);
      String string0 = keyHandler0.getCurrentText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      ItemHandler itemHandler0 = new ItemHandler(rootHandler0, rootHandler0);
      KeyHandler keyHandler0 = new KeyHandler(rootHandler0, itemHandler0);
      // Undeclared exception!
      try { 
        keyHandler0.startElement("", "d", (String) null, (Attributes) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      ItemHandler itemHandler0 = new ItemHandler(rootHandler0, rootHandler0);
      KeyHandler keyHandler0 = new KeyHandler(rootHandler0, itemHandler0);
      // Undeclared exception!
      try { 
        keyHandler0.endElement("", "", "Key");
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      ItemHandler itemHandler0 = new ItemHandler(rootHandler0, rootHandler0);
      KeyHandler keyHandler0 = new KeyHandler(rootHandler0, itemHandler0);
      // Undeclared exception!
      try { 
        keyHandler0.characters((char[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      ItemHandler itemHandler0 = new ItemHandler(rootHandler0, rootHandler0);
      KeyHandler keyHandler0 = new KeyHandler(rootHandler0, itemHandler0);
      char[] charArray0 = new char[3];
      keyHandler0.characters(charArray0, 1, 1);
      String string0 = keyHandler0.getCurrentText();
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ItemHandler itemHandler0 = new ItemHandler((RootHandler) null, (DefaultHandler) null);
      KeyHandler keyHandler0 = new KeyHandler((RootHandler) null, itemHandler0);
      // Undeclared exception!
      try { 
        keyHandler0.endElement("Key", "Key", "Key");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xml.KeyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ItemHandler itemHandler0 = new ItemHandler((RootHandler) null, (DefaultHandler) null);
      KeyHandler keyHandler0 = new KeyHandler((RootHandler) null, itemHandler0);
      keyHandler0.startElement("Key", "Key", "Key", (Attributes) null);
  }
}
