/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 03 21:58:38 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.FieldAttributes;
import com.google.gson.NullExclusionStrategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NullExclusionStrategy_ESTest extends NullExclusionStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NullExclusionStrategy nullExclusionStrategy0 = new NullExclusionStrategy();
      Class<Object> class0 = Object.class;
      boolean boolean0 = nullExclusionStrategy0.shouldSkipClass(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NullExclusionStrategy nullExclusionStrategy0 = new NullExclusionStrategy();
      boolean boolean0 = nullExclusionStrategy0.shouldSkipField((FieldAttributes) null);
      assertFalse(boolean0);
  }
}
