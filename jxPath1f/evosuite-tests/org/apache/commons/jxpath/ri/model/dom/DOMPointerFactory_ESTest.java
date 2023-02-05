/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 02:08:35 GMT 2023
 */

package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DOMPointerFactory_ESTest extends DOMPointerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DOMPointerFactory dOMPointerFactory0 = new DOMPointerFactory();
      QName qName0 = new QName("H]?YO4VG)@.&Vn2", "H]?YO4VG)@.&Vn2");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("<<unknown namespace>>");
      NodePointer nodePointer0 = dOMPointerFactory0.createNodePointer((NodePointer) null, qName0, (Object) iIOMetadataNode0);
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DOMPointerFactory dOMPointerFactory0 = new DOMPointerFactory();
      QName qName0 = new QName("H]?YO4VG)@.&Vn2", "H]?YO4VG)@.&Vn2");
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = dOMPointerFactory0.createNodePointer(qName0, (Object) "H]?YO4VG)@.&Vn2", locale0);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DOMPointerFactory dOMPointerFactory0 = new DOMPointerFactory();
      QName qName0 = new QName("].");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, locale0, locale0);
      dOMPointerFactory0.createNodePointer(nodePointer0, qName0, (Object) "<<unknown namespace>>");
      assertEquals(100, dOMPointerFactory0.getOrder());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DOMPointerFactory dOMPointerFactory0 = new DOMPointerFactory();
      QName qName0 = new QName("].");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = dOMPointerFactory0.createNodePointer(qName0, (Object) iIOMetadataNode0, locale0);
      NodePointer nodePointer1 = dOMPointerFactory0.createNodePointer(nodePointer0, qName0, (Object) iIOMetadataNode0);
      assertFalse(nodePointer1.isRoot());
      assertNotNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DOMPointerFactory dOMPointerFactory0 = new DOMPointerFactory();
      int int0 = dOMPointerFactory0.getOrder();
      assertEquals(100, int0);
  }
}