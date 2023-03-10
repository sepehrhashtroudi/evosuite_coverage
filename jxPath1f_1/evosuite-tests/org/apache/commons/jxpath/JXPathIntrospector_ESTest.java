/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 02:27:10 GMT 2023
 */

package org.apache.commons.jxpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Date;
import java.sql.Time;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.MapDynamicPropertyHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JXPathIntrospector_ESTest extends JXPathIntrospector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      JXPathBeanInfo jXPathBeanInfo0 = JXPathIntrospector.getBeanInfo(class0);
      assertTrue(jXPathBeanInfo0.isAtomic());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Date> class0 = Date.class;
      // Undeclared exception!
      try { 
        JXPathIntrospector.registerDynamicClass((Class) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.JXPathIntrospector", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<MapDynamicPropertyHandler> class0 = MapDynamicPropertyHandler.class;
      JXPathBeanInfo jXPathBeanInfo0 = JXPathIntrospector.getBeanInfo(class0);
      //  // Unstable assertion: assertTrue(jXPathBeanInfo0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<MapDynamicPropertyHandler> class0 = MapDynamicPropertyHandler.class;
      Class<JXPathBasicBeanInfo> class1 = JXPathBasicBeanInfo.class;
      JXPathIntrospector.registerDynamicClass(class1, class0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Time> class0 = Time.class;
      JXPathIntrospector.registerAtomicClass(class0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JXPathIntrospector jXPathIntrospector0 = new JXPathIntrospector();
  }
}
