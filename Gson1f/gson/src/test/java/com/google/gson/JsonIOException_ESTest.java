/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 05 10:03:45 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.JsonIOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonIOException_ESTest extends JsonIOException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JsonIOException jsonIOException0 = new JsonIOException("jq4HX;_vcW?|sSokU");
      JsonIOException jsonIOException1 = new JsonIOException(jsonIOException0);
      assertFalse(jsonIOException1.equals((Object)jsonIOException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JsonIOException jsonIOException0 = new JsonIOException("jq4HX;_vcW?|sSokU");
      JsonIOException jsonIOException1 = new JsonIOException("", jsonIOException0);
      assertFalse(jsonIOException1.equals((Object)jsonIOException0));
  }
}
