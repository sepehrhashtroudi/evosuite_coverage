/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 01 20:52:29 GMT 2023
 */

package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonParseException_ESTest extends JsonParseException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("", (-696L), 1, 10);
      JsonParseException jsonParseException0 = new JsonParseException("", jsonLocation0);
      JsonParseException jsonParseException1 = new JsonParseException("*q", jsonLocation0, jsonParseException0);
      assertFalse(jsonParseException1.equals((Object)jsonParseException0));
  }
}
