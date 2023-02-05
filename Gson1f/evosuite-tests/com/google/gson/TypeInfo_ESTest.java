/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 03 21:50:27 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.TypeInfo;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeInfo_ESTest extends TypeInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TypeInfo typeInfo0 = null;
      try {
        typeInfo0 = new TypeInfo((Type) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.
         //
         verifyException("com.google.gson.TypeUtils", e);
      }
  }
}