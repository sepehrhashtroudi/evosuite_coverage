/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 02:34:18 GMT 2023
 */

package org.apache.commons.jxpath.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Enumeration;
import org.apache.commons.jxpath.xml.DocumentContainer;
import org.apache.commons.jxpath.xml.XMLParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DocumentContainer_ESTest extends DocumentContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      String string0 = "org.apache.commons.jxpath.xml.JDOMParser";
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "org.apache.commons.jxpath.xml.JDOMParser");
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        documentContainer0.parseXML(sequenceInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported XML model: org.apache.commons.jxpath.xml.JDOMParser
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "";
      DocumentContainer documentContainer0 = null;
      try {
        documentContainer0 = new DocumentContainer((URL) null, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // XML URL is null
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DocumentContainer.registerXMLParser(".+!`z+S<O+4[%_", "/^*'Cc>|wA`{u");
      URL uRL0 = MockURL.getFileExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      // Undeclared exception!
      try { 
        documentContainer0.setValue(".+!`z+S<O+4[%_");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "r?mf#s|3rhjyL+");
      // Undeclared exception!
      try { 
        documentContainer0.setValue(uRL0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DocumentContainer.registerXMLParser((String) null, "Mpg<y.");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "\\f";
      DocumentContainer documentContainer0 = null;
      try {
        documentContainer0 = new DocumentContainer((URL) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // XML URL is null
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      documentContainer0.setExpandEntityReferences(false);
      documentContainer0.setCoalescing(false);
      // Undeclared exception!
      try { 
        documentContainer0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "");
      // Undeclared exception!
      try { 
        documentContainer0.parseXML((InputStream) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported XML model: El5J&[
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      String string0 = "";
      URL uRL1 = MockURL.URL(uRL0, "");
      DocumentContainer documentContainer0 = new DocumentContainer(uRL1, "");
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      // Undeclared exception!
      try { 
        documentContainer0.parseXML(mockFileInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported XML model: El5J&[
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "";
      URI uRI0 = MockURI.aHttpURI;
      URL uRL0 = MockURI.toURL(uRI0);
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "El5J&[");
      documentContainer0.setIgnoringComments(false);
      DocumentContainer.registerXMLParser("", (XMLParser) documentContainer0);
      // Undeclared exception!
      try { 
        documentContainer0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: http://foo.bar; Could not find: foo.bar
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URL uRL0 = null;
      DocumentContainer documentContainer0 = null;
      try {
        documentContainer0 = new DocumentContainer((URL) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // XML URL is null
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile("", "");
      MockFile mockFile1 = new MockFile(mockFile0, "");
      URL uRL0 = mockFile1.toURL();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      DocumentContainer.registerXMLParser((String) null, (XMLParser) documentContainer0);
      // Undeclared exception!
      try { 
        documentContainer0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: file:/; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "ikCY0TUC&=J:#2_l7 B";
      try { 
        MockURL.URL("ikCY0TUC&=J:#2_l7 B", "ikCY0TUC&=J:#2_l7 B", 0, "ikCY0TUC&=J:#2_l7 B");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // unknown protocol: ikcy0tuc&=j:#2_l7 b
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "org.apache.commons.jxpath.xml.DocumentContainer");
      boolean boolean0 = false;
      documentContainer0.setValidating(false);
      DocumentContainer.registerXMLParser("v~H68^:`L7I/hXQL", (XMLParser) documentContainer0);
      DocumentContainer.registerXMLParser("JDOM", (XMLParser) documentContainer0);
      DocumentContainer.registerXMLParser("", "DOM");
      // Undeclared exception!
      try { 
        MockURL.openStream(uRL0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "1eN'6?c^\"r7Yw'N}I,6";
      try { 
        MockURL.URL("1eN'6?c^\"r7Yw'N}I,6");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: 1eN'6?c^\"r7Yw'N}I,6
         //
         verifyException("java.net.URL", e);
      }
  }
}
