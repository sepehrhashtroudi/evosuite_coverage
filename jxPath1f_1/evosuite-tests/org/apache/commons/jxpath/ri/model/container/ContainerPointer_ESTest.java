/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 02:04:17 GMT 2023
 */

package org.apache.commons.jxpath.ri.model.container;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.PipedInputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.Locale;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.Container;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.XMLDocumentContainer;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.NodePointerFactory;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.container.ContainerPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;
import org.w3c.dom.Node;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ContainerPointer_ESTest extends ContainerPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      ContainerPointer containerPointer1 = new ContainerPointer((Container) null, locale0);
      assertTrue(containerPointer1.equals((Object)containerPointer0));
      
      containerPointer1.setIndex(0);
      boolean boolean0 = containerPointer0.equals(containerPointer1);
      assertFalse(containerPointer1.equals((Object)containerPointer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      containerPointer0.setIndex(87);
      containerPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      boolean boolean0 = containerPointer0.testNode((NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      NodePointer nodePointer0 = containerPointer0.namespacePointer("");
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      NodeIterator nodeIterator0 = containerPointer0.namespaceIterator();
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      NodePointer nodePointer0 = containerPointer0.getImmediateValuePointer();
      nodePointer0.setAttribute(true);
      NodePointer nodePointer1 = containerPointer0.getImmediateValuePointer();
      assertSame(nodePointer1, nodePointer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      Object object0 = containerPointer0.getImmediateNode();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      Object object0 = containerPointer0.getBaseValue();
      assertSame(object0, xMLDocumentContainer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(nodePointer0, xMLDocumentContainer0);
      variablePointer0.setIndex(1);
      int int0 = containerPointer0.compareChildNodePointers(nodePointer0, variablePointer0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      ContainerPointer containerPointer1 = new ContainerPointer(containerPointer0, (Container) null);
      containerPointer1.setIndex(0);
      int int0 = containerPointer0.compareChildNodePointers(containerPointer1, containerPointer0);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      NodeIterator nodeIterator0 = containerPointer0.childIterator(nodeTypeTest0, true, containerPointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = Locale.PRC;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-508));
      NodeIterator nodeIterator0 = containerPointer0.childIterator(nodeTypeTest0, true, (NodePointer) null);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource((Node) null);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, (Locale) null);
      NodeIterator nodeIterator0 = containerPointer0.attributeIterator((QName) null);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.jxpath.ri.model.container.ContainerPointer", "org.apache.commons.jxpath.ri.model.container.ContainerPointer");
      StreamSource streamSource0 = new StreamSource(mockFile0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = Locale.KOREAN;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      QName qName0 = new QName("A:;");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      // Undeclared exception!
      try { 
        containerPointer0.testNode(nodeNameTest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: file:/home/sepehr/masters/d4j-test-generation/evosuite_coverage/jxPath1f/org.apache.commons.jxpath.ri.model.container.ContainerPointer/org.apache.commons.jxpath.ri.model.container.ContainerPointer; java.io.FileNotFoundException: /home/sepehr/masters/d4j-test-generation/evosuite_coverage/jxPath1f/org.apache.commons.jxpath.ri.model.container.ContainerPointer/org.apache.commons.jxpath.ri.model.container.ContainerPointer (No such file or directory)
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      SAXSource sAXSource0 = new SAXSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(nodePointer0, xMLDocumentContainer0);
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 4019, 4019);
      // Undeclared exception!
      try { 
        containerPointer0.setValue(byteArrayInputStream0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("xAa7WKJa@a^", "xAa7WKJa@a^", 0, "xAa7WKJa@a^", uRLStreamHandler0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.namespacePointer("glk]nj0j{s?ZGO(wc`");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: <<undefined source>>; Cannot read XML from: null; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      ContainerPointer containerPointer0 = new ContainerPointer((NodePointer) null, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.namespaceIterator();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: <<undefined source>>; Cannot read XML from: ftp://ftp.someFakeButWellFormedURL.org/fooExample; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("GTn");
      URL uRL0 = mockFile0.toURL();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.KOREAN;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.isLeaf();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: <<undefined source>>; Cannot read XML from: file:/home/sepehr/masters/d4j-test-generation/evosuite_coverage/jxPath1f/GTn; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      // Undeclared exception!
      try { 
        containerPointer0.isLeaf();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      StreamSource streamSource0 = new StreamSource(pipedInputStream0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = Locale.ITALY;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.isCollection();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: null; java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.GERMAN;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.getNamespaceURI("<<undefined source>>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: <<undefined source>>; Cannot read XML from: ftp://ftp.someFakeButWellFormedURL.org/fooExample; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      // Undeclared exception!
      try { 
        containerPointer0.getNamespaceURI((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      URL uRL0 = MockURI.toURL(uRI0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, (Locale) null);
      // Undeclared exception!
      try { 
        containerPointer0.getLength();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: <<undefined source>>; Cannot read XML from: file:/tmp/foo.bar; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".xjfPqU5?", ".xjfPqU5?");
      StreamSource streamSource0 = new StreamSource(mockFile0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = new Locale(".xjfPqU5?");
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.getImmediateValuePointer();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: file:/home/sepehr/masters/d4j-test-generation/evosuite_coverage/jxPath1f/.xjfPqU5%3F/.xjfPqU5%3F; java.io.FileNotFoundException: /home/sepehr/masters/d4j-test-generation/evosuite_coverage/jxPath1f/.xjfPqU5?/.xjfPqU5? (No such file or directory)
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.CANADA_FRENCH;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: <<undefined source>>; Cannot read XML from: file://some/fake/but/wellformed/url; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.container.ContainerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("3Z~");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      URL uRL0 = MockURL.getHttpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(nodeNameTest0, false, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: <<undefined source>>; Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("");
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, (Locale) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(16809983);
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(nodeTypeTest0, true, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SAXSource sAXSource0 = new SAXSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      QName qName0 = new QName("<<unknown namespace>>");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, containerPointer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(processingInstructionTest0, false, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.container.ContainerPointer cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.CHINESE;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.attributeIterator((QName) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: <<undefined source>>; Cannot read XML from: ftp://ftp.someFakeButWellFormedURL.org/fooExample; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      containerPointer0.setIndex(87);
      Object object0 = containerPointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      containerPointer0.setIndex((-1598));
      Object object0 = containerPointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      int int0 = containerPointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      QName qName0 = containerPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      Object object0 = containerPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      ContainerPointer containerPointer1 = new ContainerPointer(containerPointer0, (Container) null);
      String string0 = containerPointer1.asPath();
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      String string0 = containerPointer0.asPath();
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      containerPointer0.setIndex(Integer.MAX_VALUE);
      ContainerPointer containerPointer1 = new ContainerPointer(containerPointer0, (Container) null);
      boolean boolean0 = containerPointer0.equals(containerPointer1);
      assertFalse(boolean0);
      assertFalse(containerPointer1.equals((Object)containerPointer0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      ContainerPointer containerPointer1 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.equals(containerPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.GERMAN;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      boolean boolean0 = containerPointer0.equals(xMLDocumentContainer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.equals(containerPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      URL uRL0 = MockURL.getFtpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      ContainerPointer containerPointer1 = new ContainerPointer(xMLDocumentContainer0, (Locale) null);
      boolean boolean0 = containerPointer0.equals(containerPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      containerPointer0.getNodeValue();
      String string0 = containerPointer0.getNamespaceURI((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      containerPointer0.setIndex(0);
      Object object0 = containerPointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      boolean boolean0 = containerPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      boolean boolean0 = containerPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      int int0 = containerPointer0.compareChildNodePointers(variablePointer0, variablePointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "3ZB_P<f2");
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(nodeNameTest0, true, containerPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      boolean boolean0 = containerPointer0.isContainer();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      // Undeclared exception!
      try { 
        containerPointer0.setValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.container.ContainerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      containerPointer0.namespacePointer("<<unknown namespace>>");
      NodePointer nodePointer0 = containerPointer0.getImmediateValuePointer();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      boolean boolean0 = containerPointer0.testNode(nodeTypeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.namespaceIterator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", e);
      }
  }
}
