/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 02:38:46 GMT 2023
 */

package org.apache.commons.jxpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.MapDynamicPropertyHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MapDynamicPropertyHandler_ESTest extends MapDynamicPropertyHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      // Undeclared exception!
      try { 
        mapDynamicPropertyHandler0.setProperty((Object) null, "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      // Undeclared exception!
      try { 
        mapDynamicPropertyHandler0.getPropertyNames((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      // Undeclared exception!
      try { 
        mapDynamicPropertyHandler0.getPropertyNames("X");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      // Undeclared exception!
      try { 
        mapDynamicPropertyHandler0.getProperty("Zz\u0006p\"b]$(T/+s&s", "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        mapDynamicPropertyHandler0.setProperty(object0, "", "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      // Undeclared exception!
      try { 
        mapDynamicPropertyHandler0.getProperty((Object) null, "|;nO\"k{L");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }
}