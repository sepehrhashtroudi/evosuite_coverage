/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 03 21:24:23 GMT 2023
 */

package com.google.gson.reflect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeToken_ESTest extends TypeToken_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TypeToken<Integer> typeToken0 = TypeToken.get(class0);
      Class<Object> class1 = Object.class;
      boolean boolean0 = typeToken0.isAssignableFrom(class1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<String> class0 = String.class;
      TypeToken<String> typeToken0 = TypeToken.get(class0);
      Class<Object> class1 = Object.class;
      TypeToken<Object> typeToken1 = TypeToken.get(class1);
      boolean boolean0 = typeToken0.isAssignableFrom(typeToken1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeToken.get((Class<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // type
         //
         verifyException("com.google.gson.reflect.TypeToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeToken.fromSuperclassTypeParameter((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // type
         //
         verifyException("com.google.gson.reflect.TypeToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TypeToken<Integer> typeToken0 = TypeToken.get(class0);
      boolean boolean0 = typeToken0.isAssignableFrom((Type) class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class0);
      Type type0 = typeToken0.getType();
      Class<Integer> class1 = Integer.class;
      TypeToken<Integer> typeToken1 = TypeToken.get(class1);
      boolean boolean0 = typeToken1.isAssignableFrom(type0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class0);
      String string0 = typeToken0.toString();
      assertEquals("java.lang.Object", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class0);
      boolean boolean0 = typeToken0.equals(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<String> class0 = String.class;
      TypeToken<String> typeToken0 = TypeToken.get(class0);
      boolean boolean0 = typeToken0.equals(typeToken0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class0);
      Class<String> class1 = String.class;
      TypeToken<String> typeToken1 = TypeToken.get(class1);
      boolean boolean0 = typeToken1.equals(typeToken0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TypeToken<Integer> typeToken0 = TypeToken.get(class0);
      boolean boolean0 = typeToken0.isAssignableFrom((Type) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        TypeToken.getSuperclassTypeParameter(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing type parameter.
         //
         verifyException("com.google.gson.reflect.TypeToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        TypeToken.getSuperclassTypeParameter(class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.reflect.TypeToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeToken.get((Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // type
         //
         verifyException("com.google.gson.reflect.TypeToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class0);
      Class<? super Object> class1 = typeToken0.getRawType();
      assertEquals(1, class1.getModifiers());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TypeToken<?> typeToken0 = TypeToken.get((Type) class0);
      assertNotNull(typeToken0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TypeToken<?> typeToken0 = TypeToken.fromSuperclassTypeParameter(class0);
      assertNotNull(typeToken0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class0);
      Class<String> class1 = String.class;
      TypeToken<String> typeToken1 = TypeToken.get(class1);
      boolean boolean0 = typeToken0.isAssignableFrom(typeToken1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class0);
      typeToken0.hashCode();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TypeToken<Integer> typeToken0 = TypeToken.get(class0);
      boolean boolean0 = typeToken0.isAssignableFrom(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class0);
      // Undeclared exception!
      try { 
        typeToken0.isAssignableFrom((TypeToken<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.reflect.TypeToken", e);
      }
  }
}