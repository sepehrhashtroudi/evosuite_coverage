/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 01 21:13:26 GMT 2023
 */

package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonProcessingException_ESTest extends JsonProcessingException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JsonLocation jsonLocation0 = JsonLocation.NA;
      JsonProcessingException jsonProcessingException0 = new JsonProcessingException("", jsonLocation0);
      JsonProcessingException jsonProcessingException1 = new JsonProcessingException((String) null, jsonLocation0, jsonProcessingException0);
      assertFalse(jsonProcessingException1.equals((Object)jsonProcessingException0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonProcessingException jsonProcessingException0 = new JsonProcessingException((Throwable) null);
      String string0 = jsonProcessingException0.getOriginalMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("", 1L, 0, 0);
      JsonProcessingException jsonProcessingException0 = new JsonProcessingException("", jsonLocation0);
      String string0 = jsonProcessingException0.getOriginalMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonLocation jsonLocation0 = JsonLocation.NA;
      JsonProcessingException jsonProcessingException0 = new JsonProcessingException(" at ", jsonLocation0);
      String string0 = jsonProcessingException0.getMessageSuffix();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonProcessingException jsonProcessingException0 = new JsonProcessingException("");
      String string0 = jsonProcessingException0.getMessage();
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("", (-1821L), 0L, 105, 0);
      JsonProcessingException jsonProcessingException0 = new JsonProcessingException("", jsonLocation0);
      JsonLocation jsonLocation1 = jsonProcessingException0.getLocation();
      assertEquals((-1821L), jsonLocation1.getByteOffset());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("yyE38{", 0L, 2178L, 0, 0);
      JsonProcessingException jsonProcessingException0 = new JsonProcessingException("yyE38{", jsonLocation0);
      JsonLocation jsonLocation1 = jsonProcessingException0.getLocation();
      assertEquals(2178L, jsonLocation1.getCharOffset());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      JsonLocation jsonLocation0 = new JsonLocation(object0, 1252L, 827L, 0, 124);
      JsonProcessingException jsonProcessingException0 = new JsonProcessingException((String) null, jsonLocation0);
      JsonLocation jsonLocation1 = jsonProcessingException0.getLocation();
      assertEquals(827L, jsonLocation1.getCharOffset());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonProcessingException jsonProcessingException0 = new JsonProcessingException((Throwable) null);
      JsonLocation jsonLocation0 = JsonLocation.NA;
      jsonProcessingException0._location = jsonLocation0;
      JsonLocation jsonLocation1 = jsonProcessingException0.getLocation();
      assertEquals((-1), jsonLocation1.getLineNr());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("yyE38{", 0L, 2178L, 0, 0);
      JsonProcessingException jsonProcessingException0 = new JsonProcessingException("yyE38{", jsonLocation0);
      String string0 = jsonProcessingException0.getMessage();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("I>Ck9M;4y!");
      JsonProcessingException jsonProcessingException0 = new JsonProcessingException(mockThrowable0);
      String string0 = jsonProcessingException0.getMessage();
      assertEquals("N/A", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("I>Ck9M;4y!");
      JsonProcessingException jsonProcessingException0 = new JsonProcessingException(mockThrowable0);
      JsonLocation jsonLocation0 = jsonProcessingException0.getLocation();
      assertNull(jsonLocation0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonLocation jsonLocation0 = JsonLocation.NA;
      JsonProcessingException jsonProcessingException0 = new JsonProcessingException((String) null, jsonLocation0);
      String string0 = jsonProcessingException0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonProcessingException jsonProcessingException0 = new JsonProcessingException("=a", (Throwable) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonProcessingException jsonProcessingException0 = new JsonProcessingException("j");
      String string0 = jsonProcessingException0.getOriginalMessage();
      assertEquals("j", string0);
  }
}