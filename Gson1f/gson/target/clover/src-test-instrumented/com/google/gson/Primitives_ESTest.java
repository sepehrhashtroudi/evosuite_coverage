/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 05 09:34:37 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Primitives;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Primitives_ESTest extends Primitives_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<String> class1 = Primitives.unwrap(class0);
      assertSame(class1, class0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Primitives.wrap((Class<String>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // condition failed: false
         //
         verifyException("com.google.gson.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Primitives.unwrap((Class<Short>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // condition failed: false
         //
         verifyException("com.google.gson.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        Primitives.isWrapperType((Class<?>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // condition failed: false
         //
         verifyException("com.google.gson.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Short> class1 = Primitives.unwrap(class0);
      assertEquals(1041, class1.getModifiers());
      assertNotNull(class1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Short> class1 = Primitives.wrap(class0);
      Class<Short> class2 = Primitives.wrap(class1);
      assertFalse(class2.isPrimitive());
      assertNotNull(class2);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = Primitives.isWrapperType(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      boolean boolean0 = Primitives.isWrapperType(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Integer> class1 = Primitives.unwrap(class0);
      assertEquals("int", class1.toString());
  }
}
