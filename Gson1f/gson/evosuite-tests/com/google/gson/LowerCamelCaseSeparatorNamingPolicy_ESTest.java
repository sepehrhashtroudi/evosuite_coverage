/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 05 09:34:04 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.LowerCamelCaseSeparatorNamingPolicy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LowerCamelCaseSeparatorNamingPolicy_ESTest extends LowerCamelCaseSeparatorNamingPolicy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LowerCamelCaseSeparatorNamingPolicy lowerCamelCaseSeparatorNamingPolicy0 = new LowerCamelCaseSeparatorNamingPolicy("com.google.gson.LowerCamelCaseSeparatorNamingPolicy");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LowerCamelCaseSeparatorNamingPolicy lowerCamelCaseSeparatorNamingPolicy0 = null;
      try {
        lowerCamelCaseSeparatorNamingPolicy0 = new LowerCamelCaseSeparatorNamingPolicy((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // condition failed: false
         //
         verifyException("com.google.gson.Preconditions", e);
      }
  }
}
