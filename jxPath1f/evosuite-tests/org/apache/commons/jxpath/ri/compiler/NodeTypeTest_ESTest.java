/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 01:23:10 GMT 2023
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeTypeTest_ESTest extends NodeTypeTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      int int0 = nodeTypeTest0.getNodeType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1477));
      int int0 = nodeTypeTest0.getNodeType();
      assertEquals((-1477), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = NodeTypeTest.nodeTypeToString(3);
      assertEquals("comment", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = NodeTypeTest.nodeTypeToString(2);
      assertEquals("text", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = NodeTypeTest.nodeTypeToString((-1096));
      assertEquals("UNKNOWN", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = NodeTypeTest.nodeTypeToString(4);
      assertEquals("processing-instruction", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3);
      String string0 = nodeTypeTest0.toString();
      assertEquals("comment()", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String string0 = NodeTypeTest.nodeTypeToString(1);
      assertEquals("node", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      int int0 = nodeTypeTest0.getNodeType();
      assertEquals(2, int0);
  }
}
