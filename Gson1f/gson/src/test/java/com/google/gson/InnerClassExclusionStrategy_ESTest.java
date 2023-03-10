/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 05 10:06:12 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.FieldAttributes;
import com.google.gson.InnerClassExclusionStrategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InnerClassExclusionStrategy_ESTest extends InnerClassExclusionStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InnerClassExclusionStrategy innerClassExclusionStrategy0 = new InnerClassExclusionStrategy();
      // Undeclared exception!
      try { 
        innerClassExclusionStrategy0.shouldSkipClass((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.InnerClassExclusionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InnerClassExclusionStrategy innerClassExclusionStrategy0 = new InnerClassExclusionStrategy();
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = innerClassExclusionStrategy0.shouldSkipClass(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InnerClassExclusionStrategy innerClassExclusionStrategy0 = new InnerClassExclusionStrategy();
      // Undeclared exception!
      try { 
        innerClassExclusionStrategy0.shouldSkipField((FieldAttributes) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.InnerClassExclusionStrategy", e);
      }
  }
}
