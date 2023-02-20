/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 02:40:48 GMT 2023
 */

package org.apache.commons.jxpath.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;
import java.io.StringReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Iterator;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.stream.util.EventReaderDelegate;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.MapDynamicPropertyHandler;
import org.apache.commons.jxpath.XMLDocumentContainer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockArrayIndexOutOfBoundsException;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ValueUtils_ESTest extends ValueUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = ValueUtils.getValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockArrayIndexOutOfBoundsException mockArrayIndexOutOfBoundsException0 = new MockArrayIndexOutOfBoundsException("");
      // Undeclared exception!
      try { 
        ValueUtils.setValue((Object) "w/csYJ6N$sc6sB7>n", (PropertyDescriptor) null, (Object) mockArrayIndexOutOfBoundsException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueUtils.setValue((Object) "", (PropertyDescriptor) null, 0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) mapDynamicPropertyHandler0, (PropertyDescriptor) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("M(M");
      DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0, "M(M");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) xMLDocumentContainer0, (-383));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: M(M; org.w3c.dom.DOMException: INVALID_CHARACTER_ERR: An invalid or illegal XML character is specified. 
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      // Undeclared exception!
      try { 
        ValueUtils.getLength(xMLDocumentContainer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: null; org.w3c.dom.DOMException: NAMESPACE_ERR: An attempt is made to create or change an object in a way which is incorrect with regard to namespaces.
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<String> class0 = String.class;
      Object object0 = ValueUtils.getValue((Object) class0, (-1));
      // Undeclared exception!
      try { 
        ValueUtils.getIndexedPropertyLength(object0, (IndexedPropertyDescriptor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueUtils.getDynamicPropertyHandler((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueUtils.getCollectionHint((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Method method0 = ValueUtils.getAccessibleMethod((Method) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      Class class1 = (Class)ValueUtils.getValue((Object) class0);
      assertFalse(class1.isEnum());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      StreamSource streamSource0 = new StreamSource(stringReader0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) xMLDocumentContainer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: null; org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Premature end of file.
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) "", (PropertyDescriptor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IndexedPropertyDescriptor indexedPropertyDescriptor0 = new IndexedPropertyDescriptor("i9\"=q%GW1M", (Method) null, (Method) null, (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) null, (PropertyDescriptor) indexedPropertyDescriptor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot access property: null.i9\"=q%GW1M; No read method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      // Undeclared exception!
      try { 
        ValueUtils.getDynamicPropertyHandler(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot allocate dynamic property handler of class java.beans.IndexedPropertyDescriptor; java.beans.IndexedPropertyDescriptor
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<MapDynamicPropertyHandler> class0 = MapDynamicPropertyHandler.class;
      DynamicPropertyHandler dynamicPropertyHandler0 = ValueUtils.getDynamicPropertyHandler(class0);
      assertNotNull(dynamicPropertyHandler0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IndexedPropertyDescriptor indexedPropertyDescriptor0 = new IndexedPropertyDescriptor("Cannot remove ", (Method) null, (Method) null, (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.setValue((Object) null, (PropertyDescriptor) indexedPropertyDescriptor0, (-1), (Object) "Y;i8p(~msI }|f;,Gn");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot access property: null.Cannot remove ; No read method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ValueUtils valueUtils0 = new ValueUtils();
      PropertyDescriptor propertyDescriptor0 = new PropertyDescriptor("Cannot remove ", (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) valueUtils0, propertyDescriptor0, (-172));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot access property: org.apache.commons.jxpath.util.ValueUtils.Cannot remove ; No read method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PropertyDescriptor propertyDescriptor0 = new PropertyDescriptor("Cannot allocate XMLParser: ", (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.setValue((Object) null, propertyDescriptor0, (Object) "qryHX--oZ[z~C)[f*#q");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot modify property: null.Cannot allocate XMLParser: ; No write method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ValueUtils.setValue((Object) "Cannot allocate XMLParser: ", (-1), (Object) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ValueUtils.setValue((Object) null, 0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object object0 = ValueUtils.getValue((Object) null, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = ValueUtils.remove((Object) null, 1024);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        ValueUtils.remove(class0, (-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot remove java.lang.Class[-1]
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = ValueUtils.expandCollection((Object) null, 814);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueUtils.expandCollection("RFFcGX>cdZ", (-204));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.String into a collection of size -204
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Iterator iterator0 = ValueUtils.iterate((Object) null);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      Iterator iterator0 = ValueUtils.iterate(class0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = ValueUtils.getLength((Object) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      int int0 = ValueUtils.getLength(class0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IndexedPropertyDescriptor indexedPropertyDescriptor0 = new IndexedPropertyDescriptor("eSU*,7kq_9\"", (Method) null, (Method) null, (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.getIndexedPropertyLength(indexedPropertyDescriptor0, indexedPropertyDescriptor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No indexed read method for property eSU*,7kq_9\"
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Object> class0 = Object.class;
      int int0 = ValueUtils.getCollectionHint(class0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      int int0 = ValueUtils.getCollectionHint(class0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      int int0 = ValueUtils.getCollectionHint(class0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      boolean boolean0 = ValueUtils.isCollection(eventReaderDelegate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = ValueUtils.isCollection((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode((String) null);
      DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      // Undeclared exception!
      try { 
        ValueUtils.isCollection(xMLDocumentContainer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: null; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ValueUtils valueUtils0 = new ValueUtils();
      IndexedPropertyDescriptor indexedPropertyDescriptor0 = new IndexedPropertyDescriptor("Cannot remove ", (Method) null, (Method) null, (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) valueUtils0, (PropertyDescriptor) indexedPropertyDescriptor0, (-172));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot access property: org.apache.commons.jxpath.util.ValueUtils.Cannot remove ; No read method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }
}
