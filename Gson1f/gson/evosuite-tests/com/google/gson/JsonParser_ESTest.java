/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 05 09:33:23 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonParser_ESTest extends JsonParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      JsonElement jsonElement0 = jsonParser0.parse("{}KEv_ V");
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      JsonElement jsonElement0 = jsonParser0.parse("");
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      JsonArray jsonArray0 = (JsonArray)jsonParser0.parse("[BQm]>`");
      assertEquals(1, jsonArray0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      StringReader stringReader0 = new StringReader(")g Adp!x");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      jsonParser0.parse(jsonReader0);
      JsonElement jsonElement0 = jsonParser0.parse((Reader) stringReader0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      StringReader stringReader0 = new StringReader("[Hv.T]p?ud'");
      JsonArray jsonArray0 = (JsonArray)jsonParser0.parse((Reader) stringReader0);
      assertEquals(1, jsonArray0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      StringReader stringReader0 = new StringReader("{}");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      jsonParser0.parse(jsonReader0);
      assertFalse(jsonReader0.isLenient());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      StringReader stringReader0 = new StringReader("");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      jsonParser0.parse(jsonReader0);
      assertFalse(jsonReader0.isLenient());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      StringReader stringReader0 = new StringReader("[Hv.T]p?ud'");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      jsonParser0.parse(jsonReader0);
      assertFalse(jsonReader0.isLenient());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      // Undeclared exception!
      try { 
        jsonParser0.parse("/");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      // Undeclared exception!
      try { 
        jsonParser0.parse((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // in == null
         //
         verifyException("com.google.gson.stream.JsonReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      StringReader stringReader0 = new StringReader("]]\"P]");
      try { 
        jsonParser0.parse((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected literal value near ]]\"P]
         //
         verifyException("com.google.gson.Streams", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      // Undeclared exception!
      try { 
        jsonParser0.parse((JsonReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      StringReader stringReader0 = new StringReader("L ");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      jsonReader0.close();
      // Undeclared exception!
      try { 
        jsonParser0.parse(jsonReader0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonReader is closed
         //
         verifyException("com.google.gson.stream.JsonReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      StringReader stringReader0 = new StringReader(")g Adp!x");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      jsonParser0.parse(jsonReader0);
      jsonParser0.parse(jsonReader0);
      // Undeclared exception!
      try { 
        jsonParser0.parse(jsonReader0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Streams", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      StringReader stringReader0 = new StringReader("/");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      // Undeclared exception!
      try { 
        jsonParser0.parse(jsonReader0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      StringReader stringReader0 = new StringReader("y?-D0C6,oK~Pf]pK(J");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      jsonParser0.parse(jsonReader0);
      try { 
        jsonParser0.parse(jsonReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected literal value near y?-D0C6,oK~Pf]pK(J
         //
         verifyException("com.google.gson.Streams", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      StringReader stringReader0 = new StringReader("y?-D0C6,oK~Pf]pK(J");
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)jsonParser0.parse((Reader) stringReader0);
      assertFalse(jsonPrimitive0.isNumber());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      try { 
        jsonParser0.parse("=cD+)o<gs_");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected literal value near =cD+)o<gs_
         //
         verifyException("com.google.gson.Streams", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      JsonElement jsonElement0 = jsonParser0.parse("nZ#uCAo%^&7>");
      assertFalse(jsonElement0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser();
      // Undeclared exception!
      try { 
        jsonParser0.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }
}
