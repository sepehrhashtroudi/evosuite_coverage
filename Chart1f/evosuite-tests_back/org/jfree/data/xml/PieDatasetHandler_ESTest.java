/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 19:53:10 GMT 2022
 */

package org.jfree.data.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.pie.PieDataset;
import org.jfree.data.xml.PieDatasetHandler;
import org.junit.runner.RunWith;
import org.xml.sax.SAXException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.helpers.AttributesImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PieDatasetHandler_ESTest extends PieDatasetHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PieDatasetHandler pieDatasetHandler0 = new PieDatasetHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl0);
      pieDatasetHandler0.startElement("+o#c%Nn", "Item", "Item", attributes2Impl0);
      try { 
        pieDatasetHandler0.startElement("2yx`yuo", "@", "2yx`yuo", attributes2Impl0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Expecting <Key> but found 2yx`yuo
         //
         verifyException("org.jfree.data.xml.KeyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PieDatasetHandler pieDatasetHandler0 = new PieDatasetHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl0);
      pieDatasetHandler0.startElement("PieDataset", "PieDataset", "PieDataset", attributes2Impl0);
      Short short0 = new Short((short)1120);
      pieDatasetHandler0.addItem("U$N*IBewTZf9;_K", short0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PieDatasetHandler pieDatasetHandler0 = new PieDatasetHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl0);
      pieDatasetHandler0.startElement("PieDataset", "PieDataset", "PieDataset", attributes2Impl0);
      PieDataset pieDataset0 = pieDatasetHandler0.getDataset();
      assertNotNull(pieDataset0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PieDatasetHandler pieDatasetHandler0 = new PieDatasetHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      // Undeclared exception!
      try { 
        pieDatasetHandler0.startElement("<'Mk*-h&'nFf`@&Zm", " _w[4wB?&{@>", (String) null, attributes2Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PieDatasetHandler pieDatasetHandler0 = new PieDatasetHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl0);
      pieDatasetHandler0.startElement("Item", "Item", "Item", attributes2Impl0);
      try { 
        pieDatasetHandler0.endElement("H]Km\"qZZ.=6Z&Q", "Item", "rnRDN");
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Expecting </Key> but found rnRDN
         //
         verifyException("org.jfree.data.xml.KeyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PieDatasetHandler pieDatasetHandler0 = new PieDatasetHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      pieDatasetHandler0.startElement("@,flYe5", (String) null, "Item", attributesImpl0);
      // Undeclared exception!
      try { 
        pieDatasetHandler0.endElement("Item", "~IZOCM}$`R(~", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xml.KeyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PieDatasetHandler pieDatasetHandler0 = new PieDatasetHandler();
      pieDatasetHandler0.endElement((String) null, (String) null, "@,flYe5");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PieDatasetHandler pieDatasetHandler0 = new PieDatasetHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      pieDatasetHandler0.startElement("PieDavaset", "Ws*XaPF=#%TF2+&GF", "PieDavaset", attributes2Impl0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PieDatasetHandler pieDatasetHandler0 = new PieDatasetHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      pieDatasetHandler0.startElement("Null 'info' argument.", "Null 'info' argument.", "Item", attributes2Impl0);
      try { 
        pieDatasetHandler0.startElement("Item", "Null 'info' argument.", "Null 'info' argument.", attributes2Impl0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Expecting <Key> but found Null 'info' argument.
         //
         verifyException("org.jfree.data.xml.KeyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PieDatasetHandler pieDatasetHandler0 = new PieDatasetHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      pieDatasetHandler0.startElement("2>w{6^9XJ+9 2xT$9<<", "2>w{6^9XJ+9 2xT$9<<", "PieDataset", attributes2Impl0);
      Short short0 = new Short((short)10);
      // Undeclared exception!
      try { 
        pieDatasetHandler0.addItem((Comparable) null, short0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PieDatasetHandler pieDatasetHandler0 = new PieDatasetHandler();
      PieDataset pieDataset0 = pieDatasetHandler0.getDataset();
      assertNull(pieDataset0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PieDatasetHandler pieDatasetHandler0 = new PieDatasetHandler();
      Float float0 = new Float((-33.6723272068938));
      // Undeclared exception!
      try { 
        pieDatasetHandler0.addItem("_", float0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xml.PieDatasetHandler", e);
      }
  }
}
