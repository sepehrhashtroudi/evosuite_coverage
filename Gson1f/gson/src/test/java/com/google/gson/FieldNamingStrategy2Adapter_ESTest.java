/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 05 09:59:23 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.FieldAttributes;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.FieldNamingStrategy2Adapter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldNamingStrategy2Adapter_ESTest extends FieldNamingStrategy2Adapter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FieldNamingStrategy2Adapter fieldNamingStrategy2Adapter0 = null;
      try {
        fieldNamingStrategy2Adapter0 = new FieldNamingStrategy2Adapter((FieldNamingStrategy) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // condition failed: false
         //
         verifyException("com.google.gson.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FieldNamingStrategy fieldNamingStrategy0 = mock(FieldNamingStrategy.class, new ViolatedAssumptionAnswer());
      FieldNamingStrategy2Adapter fieldNamingStrategy2Adapter0 = new FieldNamingStrategy2Adapter(fieldNamingStrategy0);
      // Undeclared exception!
      try { 
        fieldNamingStrategy2Adapter0.translateName((FieldAttributes) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.FieldNamingStrategy2Adapter", e);
      }
  }
}