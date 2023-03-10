/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 05 09:31:30 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.DelegatingJsonElementVisitor;
import com.google.gson.JsonElementVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DelegatingJsonElementVisitor_ESTest extends DelegatingJsonElementVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DelegatingJsonElementVisitor delegatingJsonElementVisitor0 = null;
      try {
        delegatingJsonElementVisitor0 = new DelegatingJsonElementVisitor((JsonElementVisitor) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // condition failed: false
         //
         verifyException("com.google.gson.Preconditions", e);
      }
  }
}
