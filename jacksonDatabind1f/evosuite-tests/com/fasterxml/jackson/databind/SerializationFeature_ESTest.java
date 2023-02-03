/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 16 05:38:53 GMT 2023
 */

package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SerializationFeature_ESTest extends SerializationFeature_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SerializationFeature[] serializationFeatureArray0 = SerializationFeature.values();
      assertEquals(18, serializationFeatureArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SerializationFeature serializationFeature0 = SerializationFeature.valueOf("WRITE_DATES_AS_TIMESTAMPS");
      assertEquals(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, serializationFeature0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SerializationFeature serializationFeature0 = SerializationFeature.valueOf("WRITE_ENUMS_USING_TO_STRING");
      assertFalse(serializationFeature0.enabledByDefault());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SerializationFeature serializationFeature0 = SerializationFeature.WRAP_ROOT_VALUE;
      boolean boolean0 = serializationFeature0.enabledByDefault();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SerializationFeature serializationFeature0 = SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;
      boolean boolean0 = serializationFeature0.enabledByDefault();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SerializationFeature serializationFeature0 = SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;
      int int0 = serializationFeature0.getMask();
      assertEquals(64, int0);
  }
}
