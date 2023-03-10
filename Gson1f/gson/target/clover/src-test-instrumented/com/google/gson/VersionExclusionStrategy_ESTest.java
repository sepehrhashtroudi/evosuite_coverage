/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 05 09:37:28 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.FieldAttributes;
import com.google.gson.VersionExclusionStrategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VersionExclusionStrategy_ESTest extends VersionExclusionStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VersionExclusionStrategy versionExclusionStrategy0 = new VersionExclusionStrategy(0.0);
      // Undeclared exception!
      try { 
        versionExclusionStrategy0.shouldSkipField((FieldAttributes) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.VersionExclusionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VersionExclusionStrategy versionExclusionStrategy0 = new VersionExclusionStrategy(1487.28);
      // Undeclared exception!
      try { 
        versionExclusionStrategy0.shouldSkipClass((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.VersionExclusionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VersionExclusionStrategy versionExclusionStrategy0 = new VersionExclusionStrategy(0.0);
      Class<Object> class0 = Object.class;
      boolean boolean0 = versionExclusionStrategy0.shouldSkipClass(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VersionExclusionStrategy versionExclusionStrategy0 = null;
      try {
        versionExclusionStrategy0 = new VersionExclusionStrategy((-1572.6744261002));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // condition failed: false
         //
         verifyException("com.google.gson.Preconditions", e);
      }
  }
}
