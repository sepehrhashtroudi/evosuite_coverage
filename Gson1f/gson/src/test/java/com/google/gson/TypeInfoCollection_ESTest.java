/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 05 09:58:10 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.ParameterizedTypeImpl;
import com.google.gson.TypeInfoCollection;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeInfoCollection_ESTest extends TypeInfoCollection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TypeInfoCollection typeInfoCollection0 = null;
      try {
        typeInfoCollection0 = new TypeInfoCollection((Type) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Collection objects need to be parameterized unless you use a custom serializer. Use the com.google.gson.reflect.TypeToken to extract the ParameterizedType.
         //
         verifyException("com.google.gson.TypeInfoCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Type[] typeArray0 = new Type[6];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl((Type) null, typeArray0, typeArray0[3]);
      TypeInfoCollection typeInfoCollection0 = null;
      try {
        typeInfoCollection0 = new TypeInfoCollection(parameterizedTypeImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.
         //
         verifyException("com.google.gson.TypeUtils", e);
      }
  }
}