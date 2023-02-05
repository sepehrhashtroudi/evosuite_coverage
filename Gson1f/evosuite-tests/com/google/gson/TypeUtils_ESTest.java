/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 03 21:37:51 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.GenericArrayTypeImpl;
import com.google.gson.ParameterizedTypeImpl;
import com.google.gson.TypeUtils;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeUtils_ESTest extends TypeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<GenericArrayTypeImpl> class0 = GenericArrayTypeImpl.class;
      Class<?> class1 = TypeUtils.toRawClass(class0);
      assertFalse(class1.isEnum());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GenericArrayTypeImpl genericArrayTypeImpl0 = new GenericArrayTypeImpl((Type) null);
      Type[] typeArray0 = new Type[5];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(genericArrayTypeImpl0, typeArray0, (Type) null);
      Type type0 = TypeUtils.getActualTypeForFirstTypeVariable(parameterizedTypeImpl0);
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.wrapWithArray((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<?> class1 = TypeUtils.wrapWithArray(class0);
      Type type0 = TypeUtils.getActualTypeForFirstTypeVariable(class1);
      Type[] typeArray0 = new Type[0];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(type0, typeArray0, class1);
      // Undeclared exception!
      try { 
        TypeUtils.getActualTypeForFirstTypeVariable(parameterizedTypeImpl0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.gson.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.toRawClass((Type) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.
         //
         verifyException("com.google.gson.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<?> class1 = TypeUtils.wrapWithArray(class0);
      Type type0 = TypeUtils.getActualTypeForFirstTypeVariable(class1);
      Type[] typeArray0 = new Type[0];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(type0, typeArray0, class1);
      Class<?> class2 = TypeUtils.toRawClass(parameterizedTypeImpl0);
      assertFalse(class2.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<?> class1 = TypeUtils.wrapWithArray(class0);
      GenericArrayTypeImpl genericArrayTypeImpl0 = new GenericArrayTypeImpl(class1);
      Class<?> class2 = TypeUtils.toRawClass(genericArrayTypeImpl0);
      assertFalse(class2.isEnum());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = TypeUtils.isArray((Type) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<?> class1 = TypeUtils.wrapWithArray(class0);
      boolean boolean0 = TypeUtils.isArray(class1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<?> class1 = TypeUtils.wrapWithArray(class0);
      GenericArrayTypeImpl genericArrayTypeImpl0 = new GenericArrayTypeImpl(class1);
      boolean boolean0 = TypeUtils.isArray(genericArrayTypeImpl0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.getActualTypeForFirstTypeVariable((Type) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.
         //
         verifyException("com.google.gson.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<?> class1 = TypeUtils.wrapWithArray(class0);
      GenericArrayTypeImpl genericArrayTypeImpl0 = new GenericArrayTypeImpl(class1);
      Class class2 = (Class)TypeUtils.getActualTypeForFirstTypeVariable(genericArrayTypeImpl0);
      assertFalse(class2.isInterface());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<GenericArrayTypeImpl> class0 = GenericArrayTypeImpl.class;
      Class<?> class1 = TypeUtils.wrapWithArray(class0);
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(class1, (Type[]) null, class0);
      // Undeclared exception!
      try { 
        TypeUtils.getActualTypeForFirstTypeVariable(parameterizedTypeImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.TypeUtils", e);
      }
  }
}
