/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 05 10:05:39 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.GenericArrayTypeImpl;
import com.google.gson.ParameterizedTypeHandlerMap;
import com.google.gson.ParameterizedTypeImpl;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParameterizedTypeHandlerMap_ESTest extends ParameterizedTypeHandlerMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ParameterizedTypeHandlerMap<ParameterizedTypeHandlerMap<Integer>> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<ParameterizedTypeHandlerMap<Integer>>();
      ParameterizedTypeHandlerMap<Integer> parameterizedTypeHandlerMap1 = new ParameterizedTypeHandlerMap<Integer>();
      Class<Object> class0 = Object.class;
      parameterizedTypeHandlerMap0.registerForTypeHierarchy((Class<?>) class0, parameterizedTypeHandlerMap1);
      Class<Integer> class1 = Integer.class;
      parameterizedTypeHandlerMap0.registerForTypeHierarchy((Class<?>) class1, parameterizedTypeHandlerMap1);
      parameterizedTypeHandlerMap0.registerIfAbsent(parameterizedTypeHandlerMap0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ParameterizedTypeHandlerMap<String> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<String>();
      // Undeclared exception!
      try { 
        parameterizedTypeHandlerMap0.registerIfAbsent((ParameterizedTypeHandlerMap<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.ParameterizedTypeHandlerMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ParameterizedTypeHandlerMap<GenericArrayTypeImpl> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<GenericArrayTypeImpl>();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(type0).toString();
      Type[] typeArray0 = new Type[6];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(type0, typeArray0, type0);
      GenericArrayTypeImpl genericArrayTypeImpl0 = new GenericArrayTypeImpl(parameterizedTypeImpl0);
      // Undeclared exception!
      try { 
        parameterizedTypeHandlerMap0.getHandlerFor(genericArrayTypeImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.
         //
         verifyException("com.google.gson.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ParameterizedTypeHandlerMap<ParameterizedTypeHandlerMap<Integer>> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<ParameterizedTypeHandlerMap<Integer>>();
      ParameterizedTypeHandlerMap<Integer> parameterizedTypeHandlerMap1 = new ParameterizedTypeHandlerMap<Integer>();
      Class<Object> class0 = Object.class;
      parameterizedTypeHandlerMap0.registerForTypeHierarchy((Class<?>) class0, parameterizedTypeHandlerMap1);
      Class<Integer> class1 = Integer.class;
      parameterizedTypeHandlerMap0.registerForTypeHierarchy((Class<?>) class1, parameterizedTypeHandlerMap1);
      // Undeclared exception!
      try { 
        parameterizedTypeHandlerMap0.copyOf();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The specified type handler for type class java.lang.Object hides the previously registered type hierarchy handler for class java.lang.Integer. Gson does not allow this.
         //
         verifyException("com.google.gson.ParameterizedTypeHandlerMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GenericArrayTypeImpl genericArrayTypeImpl0 = new GenericArrayTypeImpl((Type) null);
      ParameterizedTypeHandlerMap<ParameterizedTypeImpl> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<ParameterizedTypeImpl>();
      boolean boolean0 = parameterizedTypeHandlerMap0.hasSpecificHandlerFor(genericArrayTypeImpl0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<ParameterizedTypeImpl> class0 = ParameterizedTypeImpl.class;
      Class<String> class1 = String.class;
      ParameterizedTypeHandlerMap<ParameterizedTypeImpl> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<ParameterizedTypeImpl>();
      Type[] typeArray0 = new Type[9];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(class0, typeArray0, typeArray0[2]);
      parameterizedTypeHandlerMap0.register(class1, parameterizedTypeImpl0);
      boolean boolean0 = parameterizedTypeHandlerMap0.hasSpecificHandlerFor(class1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<ParameterizedTypeImpl> class0 = ParameterizedTypeImpl.class;
      Class<String> class1 = String.class;
      ParameterizedTypeHandlerMap<ParameterizedTypeImpl> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<ParameterizedTypeImpl>();
      Type[] typeArray0 = new Type[9];
      typeArray0[7] = (Type) class0;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(class0, typeArray0, typeArray0[8]);
      parameterizedTypeHandlerMap0.register(typeArray0[7], parameterizedTypeImpl0);
      parameterizedTypeHandlerMap0.register(class1, parameterizedTypeImpl0);
      String string0 = parameterizedTypeHandlerMap0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<ParameterizedTypeImpl> class0 = ParameterizedTypeImpl.class;
      ParameterizedTypeHandlerMap<ParameterizedTypeImpl> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<ParameterizedTypeImpl>();
      Type[] typeArray0 = new Type[9];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(class0, typeArray0, typeArray0[8]);
      parameterizedTypeHandlerMap0.register(typeArray0[7], parameterizedTypeImpl0);
      // Undeclared exception!
      try { 
        parameterizedTypeHandlerMap0.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.
         //
         verifyException("com.google.gson.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ParameterizedTypeHandlerMap<String> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<String>();
      Class<Object> class0 = Object.class;
      parameterizedTypeHandlerMap0.registerForTypeHierarchy((Class<?>) class0, "com.google.gson.GenericArrayTypeImpl@2");
      ParameterizedTypeHandlerMap<String> parameterizedTypeHandlerMap1 = parameterizedTypeHandlerMap0.copyOf();
      assertNotSame(parameterizedTypeHandlerMap1, parameterizedTypeHandlerMap0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn("gJWDxK%c({").when(type0).toString();
      ParameterizedTypeHandlerMap<String> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<String>();
      parameterizedTypeHandlerMap0.registerIfAbsent(type0, "com.google.gson.GenericArrayTypeImpl@2");
      ParameterizedTypeHandlerMap<String> parameterizedTypeHandlerMap1 = parameterizedTypeHandlerMap0.copyOf();
      assertNotSame(parameterizedTypeHandlerMap1, parameterizedTypeHandlerMap0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ParameterizedTypeHandlerMap<GenericArrayTypeImpl> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<GenericArrayTypeImpl>();
      GenericArrayTypeImpl genericArrayTypeImpl0 = new GenericArrayTypeImpl(class0);
      parameterizedTypeHandlerMap0.registerForTypeHierarchy((Class<?>) class0, genericArrayTypeImpl0);
      GenericArrayTypeImpl genericArrayTypeImpl1 = parameterizedTypeHandlerMap0.getHandlerFor(genericArrayTypeImpl0);
      assertNull(genericArrayTypeImpl1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ParameterizedTypeHandlerMap<String> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<String>();
      Class<Object> class0 = Object.class;
      parameterizedTypeHandlerMap0.registerForTypeHierarchy((Class<?>) class0, "com.google.gson.GenericArrayTypeImpl@2");
      GenericArrayTypeImpl genericArrayTypeImpl0 = new GenericArrayTypeImpl(class0);
      String string0 = parameterizedTypeHandlerMap0.getHandlerFor(genericArrayTypeImpl0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<ParameterizedTypeImpl> class0 = ParameterizedTypeImpl.class;
      Class<String> class1 = String.class;
      ParameterizedTypeHandlerMap<ParameterizedTypeImpl> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<ParameterizedTypeImpl>();
      Type[] typeArray0 = new Type[9];
      typeArray0[8] = (Type) class1;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(class0, typeArray0, typeArray0[2]);
      parameterizedTypeHandlerMap0.register(class1, parameterizedTypeImpl0);
      ParameterizedTypeImpl parameterizedTypeImpl1 = parameterizedTypeHandlerMap0.getHandlerFor(typeArray0[8]);
      assertSame(parameterizedTypeImpl1, parameterizedTypeImpl0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      ParameterizedTypeHandlerMap<ParameterizedTypeHandlerMap<Integer>> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<ParameterizedTypeHandlerMap<Integer>>();
      ParameterizedTypeHandlerMap<Integer> parameterizedTypeHandlerMap1 = new ParameterizedTypeHandlerMap<Integer>();
      parameterizedTypeHandlerMap0.register(type0, parameterizedTypeHandlerMap1);
      parameterizedTypeHandlerMap0.registerIfAbsent(type0, parameterizedTypeHandlerMap1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ParameterizedTypeHandlerMap<GenericArrayTypeImpl> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<GenericArrayTypeImpl>();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      parameterizedTypeHandlerMap0.makeUnmodifiable();
      GenericArrayTypeImpl genericArrayTypeImpl0 = new GenericArrayTypeImpl(type0);
      Type[] typeArray0 = new Type[0];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(genericArrayTypeImpl0, typeArray0, genericArrayTypeImpl0);
      // Undeclared exception!
      try { 
        parameterizedTypeHandlerMap0.registerIfAbsent((Type) parameterizedTypeImpl0, genericArrayTypeImpl0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Attempted to modify an unmodifiable map.
         //
         verifyException("com.google.gson.ParameterizedTypeHandlerMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ParameterizedTypeHandlerMap<ParameterizedTypeHandlerMap<Integer>> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<ParameterizedTypeHandlerMap<Integer>>();
      ParameterizedTypeHandlerMap<ParameterizedTypeHandlerMap<Integer>> parameterizedTypeHandlerMap1 = new ParameterizedTypeHandlerMap<ParameterizedTypeHandlerMap<Integer>>();
      ParameterizedTypeHandlerMap<Integer> parameterizedTypeHandlerMap2 = new ParameterizedTypeHandlerMap<Integer>();
      Class<Object> class0 = Object.class;
      parameterizedTypeHandlerMap1.registerForTypeHierarchy((Class<?>) class0, parameterizedTypeHandlerMap2);
      parameterizedTypeHandlerMap0.registerIfAbsent(parameterizedTypeHandlerMap1);
      assertFalse(parameterizedTypeHandlerMap1.equals((Object)parameterizedTypeHandlerMap0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ParameterizedTypeHandlerMap<ParameterizedTypeHandlerMap<Integer>> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<ParameterizedTypeHandlerMap<Integer>>();
      ParameterizedTypeHandlerMap<ParameterizedTypeHandlerMap<Integer>> parameterizedTypeHandlerMap1 = new ParameterizedTypeHandlerMap<ParameterizedTypeHandlerMap<Integer>>();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[7];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(type0, typeArray0, type0);
      GenericArrayTypeImpl genericArrayTypeImpl0 = new GenericArrayTypeImpl(parameterizedTypeImpl0);
      ParameterizedTypeHandlerMap<Integer> parameterizedTypeHandlerMap2 = new ParameterizedTypeHandlerMap<Integer>();
      parameterizedTypeHandlerMap1.register(genericArrayTypeImpl0, parameterizedTypeHandlerMap2);
      parameterizedTypeHandlerMap0.registerIfAbsent(parameterizedTypeHandlerMap1);
      assertFalse(parameterizedTypeHandlerMap1.equals((Object)parameterizedTypeHandlerMap0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ParameterizedTypeHandlerMap<ParameterizedTypeHandlerMap<Integer>> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<ParameterizedTypeHandlerMap<Integer>>();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[7];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(type0, typeArray0, type0);
      GenericArrayTypeImpl genericArrayTypeImpl0 = new GenericArrayTypeImpl(parameterizedTypeImpl0);
      ParameterizedTypeHandlerMap<Integer> parameterizedTypeHandlerMap1 = new ParameterizedTypeHandlerMap<Integer>();
      parameterizedTypeHandlerMap0.register(genericArrayTypeImpl0, parameterizedTypeHandlerMap1);
      parameterizedTypeHandlerMap0.registerIfAbsent(parameterizedTypeHandlerMap0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ParameterizedTypeHandlerMap<GenericArrayTypeImpl> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<GenericArrayTypeImpl>();
      GenericArrayTypeImpl genericArrayTypeImpl0 = parameterizedTypeHandlerMap0.getHandlerFor(class0);
      ParameterizedTypeHandlerMap<Object> parameterizedTypeHandlerMap1 = new ParameterizedTypeHandlerMap<Object>();
      parameterizedTypeHandlerMap1.registerIfAbsent((Type) null, (Object) null);
      parameterizedTypeHandlerMap1.register((Type) null, genericArrayTypeImpl0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ParameterizedTypeHandlerMap<String> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<String>();
      parameterizedTypeHandlerMap0.makeUnmodifiable();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        parameterizedTypeHandlerMap0.register(class0, "com.google.gson.GenericArrayTypeImpl");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Attempted to modify an unmodifiable map.
         //
         verifyException("com.google.gson.ParameterizedTypeHandlerMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ParameterizedTypeHandlerMap<Integer> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<Integer>();
      Class<GenericArrayTypeImpl> class0 = GenericArrayTypeImpl.class;
      Class<Integer> class1 = Integer.class;
      Integer integer0 = new Integer((-1));
      parameterizedTypeHandlerMap0.registerForTypeHierarchy((Class<?>) class1, integer0);
      parameterizedTypeHandlerMap0.registerForTypeHierarchy((Class<?>) class0, (Integer) null);
      String string0 = parameterizedTypeHandlerMap0.toString();
      assertEquals("{mapForTypeHierarchy:{GenericArrayTypeImpl:null,Integer:-1},map:{}", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ParameterizedTypeHandlerMap<GenericArrayTypeImpl> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<GenericArrayTypeImpl>();
      Class<Object> class0 = Object.class;
      Class<Integer> class1 = Integer.class;
      GenericArrayTypeImpl genericArrayTypeImpl0 = new GenericArrayTypeImpl(class0);
      parameterizedTypeHandlerMap0.registerForTypeHierarchy((Class<?>) class1, genericArrayTypeImpl0);
      // Undeclared exception!
      try { 
        parameterizedTypeHandlerMap0.registerForTypeHierarchy((Class<?>) class0, genericArrayTypeImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The specified type handler for type class java.lang.Object hides the previously registered type hierarchy handler for class java.lang.Integer. Gson does not allow this.
         //
         verifyException("com.google.gson.ParameterizedTypeHandlerMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ParameterizedTypeHandlerMap<Class<GenericArrayTypeImpl>> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<Class<GenericArrayTypeImpl>>();
      Class<Integer> class0 = Integer.class;
      Class<GenericArrayTypeImpl> class1 = GenericArrayTypeImpl.class;
      parameterizedTypeHandlerMap0.registerForTypeHierarchy((Class<?>) class0, class1);
      parameterizedTypeHandlerMap0.registerForTypeHierarchy((Class<?>) class0, class1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ParameterizedTypeHandlerMap<Integer> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<Integer>();
      parameterizedTypeHandlerMap0.makeUnmodifiable();
      Class<Integer> class0 = Integer.class;
      Integer integer0 = new Integer(3719);
      // Undeclared exception!
      try { 
        parameterizedTypeHandlerMap0.registerForTypeHierarchy((Class<?>) class0, integer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Attempted to modify an unmodifiable map.
         //
         verifyException("com.google.gson.ParameterizedTypeHandlerMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ParameterizedTypeHandlerMap<AbstractMap.SimpleEntry<Object, Integer>> parameterizedTypeHandlerMap0 = new ParameterizedTypeHandlerMap<AbstractMap.SimpleEntry<Object, Integer>>();
      parameterizedTypeHandlerMap0.makeUnmodifiable();
      // Undeclared exception!
      try { 
        parameterizedTypeHandlerMap0.registerIfAbsent((ParameterizedTypeHandlerMap<AbstractMap.SimpleEntry<Object, Integer>>) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Attempted to modify an unmodifiable map.
         //
         verifyException("com.google.gson.ParameterizedTypeHandlerMap", e);
      }
  }
}
