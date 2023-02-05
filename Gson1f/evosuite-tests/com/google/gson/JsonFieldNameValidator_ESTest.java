/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 03 21:59:50 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonFieldNameValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonFieldNameValidator_ESTest extends JsonFieldNameValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JsonFieldNameValidator jsonFieldNameValidator0 = new JsonFieldNameValidator();
      // Undeclared exception!
      try { 
        jsonFieldNameValidator0.validate("$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // $ is not a valid JSON field name.
         //
         verifyException("com.google.gson.JsonFieldNameValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JsonFieldNameValidator jsonFieldNameValidator0 = new JsonFieldNameValidator();
      // Undeclared exception!
      try { 
        jsonFieldNameValidator0.validate("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // condition failed: false
         //
         verifyException("com.google.gson.Preconditions", e);
      }
  }
}