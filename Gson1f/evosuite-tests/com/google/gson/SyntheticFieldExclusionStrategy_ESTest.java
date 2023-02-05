/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 03 21:34:16 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.FieldAttributes;
import com.google.gson.SyntheticFieldExclusionStrategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SyntheticFieldExclusionStrategy_ESTest extends SyntheticFieldExclusionStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SyntheticFieldExclusionStrategy syntheticFieldExclusionStrategy0 = new SyntheticFieldExclusionStrategy(true);
      // Undeclared exception!
      try { 
        syntheticFieldExclusionStrategy0.shouldSkipField((FieldAttributes) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.SyntheticFieldExclusionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SyntheticFieldExclusionStrategy syntheticFieldExclusionStrategy0 = new SyntheticFieldExclusionStrategy(false);
      boolean boolean0 = syntheticFieldExclusionStrategy0.shouldSkipField((FieldAttributes) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SyntheticFieldExclusionStrategy syntheticFieldExclusionStrategy0 = new SyntheticFieldExclusionStrategy(false);
      Class<Object> class0 = Object.class;
      boolean boolean0 = syntheticFieldExclusionStrategy0.shouldSkipClass(class0);
      assertFalse(boolean0);
  }
}
