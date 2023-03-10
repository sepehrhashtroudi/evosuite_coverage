/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 19:54:08 GMT 2022
 */

package org.apache.commons.lang3.reflect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.lang3.reflect.ConstructorUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstructorUtils_ESTest extends ConstructorUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Constructor<Object> constructor0 = ConstructorUtils.getMatchingAccessibleConstructor(class0, (Class<?>[]) null);
      constructor0.setAccessible(true);
      Constructor<Object> constructor1 = ConstructorUtils.getAccessibleConstructor(constructor0);
      assertEquals(1, constructor1.getModifiers());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Annotation>[] classArray0 = (Class<Annotation>[]) Array.newInstance(Class.class, 2);
      Constructor<Object> constructor0 = ConstructorUtils.getAccessibleConstructor(class0, (Class<?>[]) classArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 2);
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeExactConstructor((Class<Object>) null, objectArray0, (Class<?>[]) classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeExactConstructor(class0, objectArray0, (Class<?>[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      try { 
        ConstructorUtils.invokeConstructor(class0, (Object[]) classArray0, (Class<?>[]) classArray0);
        fail("Expecting exception: InvocationTargetException");
      
      } catch(InvocationTargetException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Object[] objectArray0 = new Object[6];
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeConstructor(class0, objectArray0, (Class<?>[]) classArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeConstructor((Class<Integer>) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConstructorUtils.getMatchingAccessibleConstructor((Class<Object>) null, (Class<?>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 0);
      // Undeclared exception!
      try { 
        ConstructorUtils.getAccessibleConstructor((Class<String>) null, (Class<?>[]) classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      Constructor<String> constructor0 = ConstructorUtils.getMatchingAccessibleConstructor(class0, (Class<?>[]) classArray0);
      assertNotNull(constructor0);
      assertEquals("public java.lang.String(byte[])", constructor0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 6);
      Constructor<Object> constructor0 = ConstructorUtils.getMatchingAccessibleConstructor(class0, (Class<?>[]) classArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Constructor<Object> constructor0 = ConstructorUtils.getMatchingAccessibleConstructor(class0, (Class<?>[]) null);
      Constructor<Object> constructor1 = ConstructorUtils.getAccessibleConstructor(constructor0);
      assertFalse(constructor1.isVarArgs());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[7];
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 7);
      try { 
        ConstructorUtils.invokeExactConstructor(class0, objectArray0, (Class<?>[]) classArray0);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // No such accessible constructor on object: java.lang.Object
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Class<Object> class0 = Object.class;
      Object object0 = ConstructorUtils.invokeExactConstructor(class0, (Object[]) classArray0, (Class<?>[]) classArray0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      try { 
        ConstructorUtils.invokeConstructor(class0, (Object[]) null, (Class<?>[]) classArray0);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // No such accessible constructor on object: java.lang.Object
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Class<Object> class0 = Object.class;
      Object object0 = ConstructorUtils.invokeConstructor(class0, (Object[]) classArray0, (Class<?>[]) classArray0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<String> class0 = String.class;
      try { 
        ConstructorUtils.invokeConstructor(class0, objectArray0);
        fail("Expecting exception: InvocationTargetException");
      
      } catch(InvocationTargetException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Constructor<Object> constructor0 = ConstructorUtils.getAccessibleConstructor((Constructor<Object>) null);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
      try { 
        ConstructorUtils.invokeExactConstructor(class0, objectArray0);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // No such accessible constructor on object: java.lang.String
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = ConstructorUtils.invokeExactConstructor(class0, (Object[]) null, (Class<?>[]) null);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeExactConstructor((Class<String>) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Class<String> class0 = String.class;
      String string0 = ConstructorUtils.invokeExactConstructor(class0, (Object[]) classArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeConstructor((Class<Object>) null, (Object[]) null, (Class<?>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      try { 
        ConstructorUtils.invokeConstructor(class0, (Object[]) null);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // No such accessible constructor on object: java.lang.Integer
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Class<Object> class0 = Object.class;
      Object object0 = ConstructorUtils.invokeConstructor(class0, (Object[]) classArray0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ConstructorUtils constructorUtils0 = new ConstructorUtils();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<String> class0 = String.class;
      Constructor<String> constructor0 = ConstructorUtils.getAccessibleConstructor(class0, (Class<?>[]) null);
      assertEquals(1, constructor0.getModifiers());
  }
}
