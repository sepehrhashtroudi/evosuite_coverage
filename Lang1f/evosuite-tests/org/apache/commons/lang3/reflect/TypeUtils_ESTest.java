/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 19:57:08 GMT 2022
 */

package org.apache.commons.lang3.reflect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;
import org.apache.commons.lang3.reflect.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TypeUtils_ESTest extends TypeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn((Type) null).when(parameterizedType0).getRawType();
      // Undeclared exception!
      try { 
        TypeUtils.getRawType(parameterizedType0, class0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Wait... What!? Type of rawType: null
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Type[] typeArray0 = new Type[9];
      // Undeclared exception!
      try { 
        TypeUtils.getRawType(typeArray0[6], class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: null
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Type[] typeArray0 = new Type[9];
      Class<?> class1 = TypeUtils.getRawType(class0, class0);
      Class<?> class2 = TypeUtils.getRawType(class1, typeArray0[1]);
      assertFalse(class2.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Type[] typeArray0 = new Type[2];
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(wildcardType0).getUpperBounds();
      Type[] typeArray1 = TypeUtils.getImplicitUpperBounds(wildcardType0);
      assertEquals(1, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<String> class0 = String.class;
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = (Type) class0;
      typeArray0[1] = (Type) class0;
      typeArray0[2] = typeArray0[1];
      typeArray0[3] = (Type) class0;
      typeArray0[4] = (Type) class0;
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(parameterizedType0).getActualTypeArguments();
      doReturn(class0).when(parameterizedType0).getOwnerType();
      doReturn(class0, typeArray0[4]).when(parameterizedType0).getRawType();
      Map<TypeVariable<?>, Type> map0 = TypeUtils.determineTypeArguments(class0, parameterizedType0);
      TypeUtils.isInstance(map0, class0);
      TypeUtils typeUtils0 = new TypeUtils();
      ParameterizedType parameterizedType1 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      TypeUtils.getRawType(class0, class0);
      ParameterizedType parameterizedType2 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0[4], (Type) null).when(parameterizedType2).getRawType();
      // Undeclared exception!
      try { 
        TypeUtils.getTypeArguments(parameterizedType2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Wait... What!? Type of rawType: null
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn(class0, class0, class0, class0, class0).when(parameterizedType0).getRawType();
      Type[] typeArray0 = new Type[9];
      Class<?> class1 = TypeUtils.getRawType(class0, class0);
      typeArray0[0] = (Type) class1;
      typeArray0[1] = (Type) parameterizedType0;
      typeArray0[2] = (Type) class0;
      typeArray0[3] = (Type) class0;
      typeArray0[4] = (Type) parameterizedType0;
      typeArray0[5] = (Type) class0;
      typeArray0[6] = (Type) parameterizedType0;
      typeArray0[7] = (Type) class0;
      typeArray0[8] = (Type) class0;
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(wildcardType0).getUpperBounds();
      Type[] typeArray1 = TypeUtils.getImplicitUpperBounds(wildcardType0);
      assertEquals(0, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.normalizeUpperBounds((Type[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(type0).toString();
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      // Undeclared exception!
      try { 
        TypeUtils.normalizeUpperBounds(typeArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // found an unhandled type: null
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(type0).toString();
      // Undeclared exception!
      try { 
        TypeUtils.isInstance("", type0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // found an unhandled type: null
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.getTypeArguments((ParameterizedType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      doReturn((Type[]) null).when(wildcardType0).getUpperBounds();
      // Undeclared exception!
      try { 
        TypeUtils.getImplicitUpperBounds(wildcardType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Type[] typeArray0 = new Type[7];
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(type0).toString();
      typeArray0[0] = type0;
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(wildcardType0).getUpperBounds();
      // Undeclared exception!
      try { 
        TypeUtils.getImplicitUpperBounds(wildcardType0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // found an unhandled type: null
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      doReturn((Type[]) null).when(wildcardType0).getLowerBounds();
      // Undeclared exception!
      try { 
        TypeUtils.getImplicitLowerBounds(wildcardType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        TypeUtils.determineTypeArguments(class0, (ParameterizedType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn((Type) null).when(parameterizedType0).getRawType();
      // Undeclared exception!
      try { 
        TypeUtils.determineTypeArguments(class0, parameterizedType0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Wait... What!? Type of rawType: null
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<String> class0 = String.class;
      Type type0 = TypeUtils.getArrayComponentType(class0);
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      Type type1 = TypeUtils.getArrayComponentType(type0);
      assertNull(type1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = TypeUtils.isArrayType((Type) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = TypeUtils.isArrayType(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn((Type) null).when(parameterizedType0).getRawType();
      // Undeclared exception!
      try { 
        TypeUtils.getRawType(parameterizedType0, parameterizedType0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Wait... What!? Type of rawType: null
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn(class0, class0, class0, class0, class0).when(parameterizedType0).getRawType();
      Type[] typeArray0 = new Type[9];
      Class<?> class1 = TypeUtils.getRawType(class0, class0);
      typeArray0[0] = (Type) class1;
      typeArray0[1] = (Type) parameterizedType0;
      typeArray0[2] = (Type) class0;
      typeArray0[3] = (Type) class0;
      typeArray0[4] = (Type) parameterizedType0;
      typeArray0[5] = (Type) class0;
      typeArray0[6] = (Type) parameterizedType0;
      typeArray0[7] = (Type) class0;
      typeArray0[8] = (Type) class0;
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray1).when(wildcardType0).getLowerBounds();
      Type[] typeArray2 = TypeUtils.getImplicitLowerBounds(wildcardType0);
      assertNotSame(typeArray2, typeArray1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Type[] typeArray0 = new Type[2];
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(wildcardType0).getLowerBounds();
      Type[] typeArray1 = TypeUtils.getImplicitLowerBounds(wildcardType0);
      assertEquals(2, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Type[] typeArray0 = new Type[0];
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray1).when(wildcardType0).getUpperBounds();
      Type[] typeArray2 = TypeUtils.getImplicitUpperBounds(wildcardType0);
      assertSame(typeArray1, typeArray0);
      assertEquals(1, typeArray2.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Type[] typeArray0 = new Type[1];
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertSame(typeArray1, typeArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = TypeUtils.isInstance((Object) null, type0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = TypeUtils.isInstance((Object) null, (Type) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Object> class1 = Object.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) class0, (Class<?>) class1);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = (Type) class0;
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(parameterizedType0).getActualTypeArguments();
      doReturn(typeArray0[0]).when(parameterizedType0).getOwnerType();
      doReturn(class0, class0).when(parameterizedType0).getRawType();
      Type[] typeArray1 = new Type[9];
      Class<?> class1 = TypeUtils.getRawType(class0, class0);
      typeArray1[6] = (Type) parameterizedType0;
      ParameterizedType parameterizedType1 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray1).when(parameterizedType1).getActualTypeArguments();
      doReturn(typeArray1[6]).when(parameterizedType1).getOwnerType();
      doReturn(class1, typeArray0[0]).when(parameterizedType1).getRawType();
      Map<TypeVariable<?>, Type> map0 = TypeUtils.determineTypeArguments(class1, parameterizedType1);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Type[] typeArray0 = new Type[1];
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(parameterizedType0).getActualTypeArguments();
      doReturn(typeArray0[0]).when(parameterizedType0).getOwnerType();
      doReturn(class0, class0).when(parameterizedType0).getRawType();
      Map<TypeVariable<?>, Type> map0 = TypeUtils.determineTypeArguments(class0, parameterizedType0);
      assertNotNull(map0);
      
      boolean boolean0 = TypeUtils.typesSatisfyVariables(map0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        TypeUtils.getTypeArguments((Type) null, class0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // found an unhandled type: null
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn(class0, class0).when(parameterizedType0).getRawType();
      Type[] typeArray0 = new Type[9];
      Class<?> class1 = TypeUtils.getRawType(class0, class0);
      typeArray0[0] = (Type) class1;
      typeArray0[1] = (Type) parameterizedType0;
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertEquals(1, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = TypeUtils.isAssignable((Type) null, (Type) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<String> class0 = String.class;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = (Type) class0;
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertEquals(1, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(type0).toString();
      // Undeclared exception!
      try { 
        TypeUtils.isAssignable(type0, type0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // found an unhandled type: null
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[9];
      typeArray0[1] = (Type) parameterizedType0;
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertEquals(1, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<String> class0 = String.class;
      boolean boolean0 = TypeUtils.isAssignable(class0, (Type) null);
      assertFalse(boolean0);
  }
}
