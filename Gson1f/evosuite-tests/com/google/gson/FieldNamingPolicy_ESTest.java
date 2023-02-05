/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 03 21:41:29 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldNamingPolicy_ESTest extends FieldNamingPolicy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FieldNamingPolicy[] fieldNamingPolicyArray0 = FieldNamingPolicy.values();
      assertEquals(4, fieldNamingPolicyArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.valueOf("UPPER_CAMEL_CASE");
      assertEquals(FieldNamingPolicy.UPPER_CAMEL_CASE, fieldNamingPolicy0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES;
      FieldNamingStrategy2 fieldNamingStrategy2_0 = fieldNamingPolicy0.getFieldNamingPolicy();
      assertNotNull(fieldNamingStrategy2_0);
  }
}