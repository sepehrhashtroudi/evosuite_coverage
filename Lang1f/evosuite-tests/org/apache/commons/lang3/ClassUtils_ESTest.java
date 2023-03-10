/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 21:30:52 GMT 2022
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang3.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class ClassUtils_ESTest extends ClassUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      Class<?>[] classArray1 = ClassUtils.toClass(classArray0);
      boolean boolean0 = ClassUtils.isAssignable(classArray1, classArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("L)/");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("Double");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[HIcAaPqst^TCZu=Q9");
      assertEquals("HIcAaPqst^TCZu=Q9[]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      assertNull(class1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Float> class0 = Float.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      String string0 = ClassUtils.getPackageName(class1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("className must not be null.");
      assertEquals("classNamemustnotbenull", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("short", false);
      assertFalse(class0.isEnum());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("org.apache.commons.lang3.ClassUtils", false);
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "org.apache.commons.lang3.ClassUtils");
      assertEquals(1, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Object> class0 = Object.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getShortClassName("[");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getShortCanonicalName("[java.lang.Float");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Double> class0 = Double.class;
      Class<Float>[] classArray0 = (Class<Float>[]) Array.newInstance(Class.class, 8);
      // Undeclared exception!
      try { 
        ClassUtils.getPublicMethod(class0, (String) null, classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 2);
      Class<Long> class0 = Long.class;
      try { 
        ClassUtils.getPublicMethod(class0, "className must not be null.", classArray0);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getClass((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang3.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getClass((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang3.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        ClassUtils.getClass(classLoader0, (String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang3.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      try { 
        ClassUtils.getClass("`Wn@T9mDl_:3I8]@", false);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.getClass(classLoader0, "java.lang", true);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      try { 
        ClassUtils.getClass((ClassLoader) null, ",MZ|-'vf{mW\"LaP", false);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Character> class0 = Character.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      Class<?> class2 = ClassUtils.primitiveToWrapper(class1);
      assertEquals("class java.lang.Character", class2.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<?> class0 = ClassUtils.primitiveToWrapper((Class<?>) null);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Boolean> class1 = Boolean.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Float>[] classArray0 = (Class<Float>[]) Array.newInstance(Class.class, 4);
      boolean boolean0 = ClassUtils.isAssignable(classArray0[0], classArray0[0], true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = ClassUtils.isPrimitiveWrapper(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      boolean boolean0 = ClassUtils.isPrimitiveWrapper(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("Long");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("java.lang");
      assertEquals("java", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Long> class0 = Long.class;
      String string0 = ClassUtils.getPackageName(class0);
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      String string0 = ClassUtils.getShortClassName(class0);
      assertEquals("Boolean", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("2Mqq@mz}");
      assertEquals("2Mqq@mz}", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getPackageCanonicalName("[java.lang.Short");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      String string0 = ClassUtils.getPackageCanonicalName(objectArray0[0], "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Long long0 = new Long(0L);
      String string0 = ClassUtils.getPackageCanonicalName((Object) long0, "A+=fGTf(Fe'\"b");
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) null, "[");
      assertEquals("[", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
      String string0 = ClassUtils.getShortCanonicalName((Object) classUtils0, "");
      assertEquals("ClassUtils", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.toClass((Object[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      try { 
        ClassUtils.getClass("2Mqq@mz}[]");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      try { 
        ClassUtils.getClass((ClassLoader) null, "java.vm");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "double", true);
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.wrappersToPrimitives((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.primitivesToWrappers((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
      assertFalse(class1.isInterface());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertEquals(1, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Class<Character>[] classArray0 = (Class<Character>[]) Array.newInstance(Class.class, 3);
      Class<Character> class0 = Character.class;
      classArray0[0] = class0;
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertNotNull(classArray1);
      
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Float> class1 = Float.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Long> class1 = Long.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Short>[] classArray0 = (Class<Short>[]) Array.newInstance(Class.class, 7);
      classArray0[0] = class0;
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertNotNull(classArray1);
      
      boolean boolean0 = ClassUtils.isAssignable(classArray1, classArray0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = ClassUtils.isPrimitiveOrWrapper(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Class<Long> class0 = Long.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      boolean boolean0 = ClassUtils.isPrimitiveOrWrapper(class1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Class<Float>[] classArray0 = (Class<Float>[]) Array.newInstance(Class.class, 4);
      boolean boolean0 = ClassUtils.isPrimitiveOrWrapper(classArray0[0]);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = ClassUtils.isPrimitiveOrWrapper(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      assertNotNull(classArray0);
      
      Class<String>[] classArray1 = (Class<String>[]) Array.newInstance(Class.class, 2);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Class<String> class0 = String.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      List<Class<?>> list2 = ClassUtils.convertClassNamesToClasses(list1);
      assertEquals(3, list2.size());
      assertTrue(list2.equals((Object)list0));
      assertNotNull(list2);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      List<String> list0 = ClassUtils.convertClassesToClassNames((List<Class<?>>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Class<ClassUtils> class0 = ClassUtils.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertEquals(0, list1.size());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllInterfaces((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      assertEquals(2, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getPackageName("[");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      String string0 = ClassUtils.getPackageName(objectArray0[3], (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Object object0 = new Object();
      objectArray0[2] = object0;
      String string0 = ClassUtils.getPackageName(objectArray0[2], (String) null);
      assertNotNull(string0);
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      String string0 = ClassUtils.getSimpleName((Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Float float0 = new Float((-4963.039F));
      String string0 = ClassUtils.getSimpleName((Object) float0, "");
      assertEquals("Float", string0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      String string0 = ClassUtils.getSimpleName(class0);
      assertEquals("float", string0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("$");
      assertEquals(".", string0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[java.lang.Float");
      assertEquals("Float[]", string0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "{");
      assertEquals("{", string0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Class<Character> class0 = Character.class;
      String string0 = ClassUtils.getShortClassName((Object) class0, (String) null);
      assertEquals("Class", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getClass((ClassLoader) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang3.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) classUtils0;
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertNotNull(classArray1);
      
      boolean boolean0 = ClassUtils.isAssignable(classArray1, classArray0, false);
      assertNotSame(classArray1, classArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      Class<ClassUtils> class0 = ClassUtils.class;
      String string0 = ClassUtils.getShortCanonicalName(class0);
      assertEquals("ClassUtils", string0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Class<Long> class0 = Long.class;
      String string0 = ClassUtils.getPackageCanonicalName(class0);
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<String> class1 = String.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Class<Long> class0 = Long.class;
      Class<String> class1 = String.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1);
      assertFalse(boolean0);
  }
}
