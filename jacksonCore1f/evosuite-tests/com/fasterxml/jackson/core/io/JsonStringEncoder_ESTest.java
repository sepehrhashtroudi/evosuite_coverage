/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 01 21:22:26 GMT 2023
 */

package com.fasterxml.jackson.core.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.io.JsonStringEncoder;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonStringEncoder_ESTest extends JsonStringEncoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JsonStringEncoder jsonStringEncoder0 = new JsonStringEncoder();
      byte[] byteArray0 = jsonStringEncoder0.quoteAsUTF8("4|{lg>8\"g80f(P?\"");
      assertEquals(18, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonStringEncoder jsonStringEncoder0 = new JsonStringEncoder();
      char[] charArray0 = jsonStringEncoder0.quoteAsString("4|{lg>8\"g80f(P?\"");
      assertEquals(18, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = JsonStringEncoder._convertSurrogate(48, 56320);
      assertEquals((-56508416), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonStringEncoder jsonStringEncoder0 = JsonStringEncoder.getInstance();
      // Undeclared exception!
      try { 
        jsonStringEncoder0.quoteAsUTF8((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.io.JsonStringEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonStringEncoder jsonStringEncoder0 = JsonStringEncoder.getInstance();
      // Undeclared exception!
      try { 
        jsonStringEncoder0.quoteAsString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.io.JsonStringEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonStringEncoder jsonStringEncoder0 = JsonStringEncoder.getInstance();
      // Undeclared exception!
      try { 
        jsonStringEncoder0.encodeAsUTF8((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.io.JsonStringEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = JsonStringEncoder._convertSurrogate(57343, 57343);
      assertEquals(2162687, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        JsonStringEncoder._convertSurrogate((-2943), (-2943));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Broken surrogate pair: first char 0xfffff481, second 0xfffff481; illegal combination
         //
         verifyException("com.fasterxml.jackson.core.io.JsonStringEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonStringEncoder jsonStringEncoder0 = JsonStringEncoder.getInstance();
      String string0 = "";
      jsonStringEncoder0.encodeAsUTF8("");
      jsonStringEncoder0.encodeAsUTF8("R4U01M`]V-");
      jsonStringEncoder0.quoteAsString("47jz91");
      jsonStringEncoder0.quoteAsString("");
      jsonStringEncoder0.quoteAsUTF8("");
      // Undeclared exception!
      try { 
        JsonStringEncoder._convertSurrogate(1327, 65536);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Broken surrogate pair: first char 0x52f, second 0x10000; illegal combination
         //
         verifyException("com.fasterxml.jackson.core.io.JsonStringEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonStringEncoder jsonStringEncoder0 = new JsonStringEncoder();
      byte[] byteArray0 = jsonStringEncoder0.encodeAsUTF8("j");
      assertEquals(1, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)106}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonStringEncoder jsonStringEncoder0 = new JsonStringEncoder();
      byte[] byteArray0 = jsonStringEncoder0.quoteAsUTF8("RBF1~s@_/<\"s'p");
      assertEquals(15, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonStringEncoder jsonStringEncoder0 = JsonStringEncoder.getInstance();
      jsonStringEncoder0.quoteAsUTF8("Ft/(1AHBit+5i");
      jsonStringEncoder0.encodeAsUTF8("PA~yB=|*UOKn5wP)");
      JsonStringEncoder jsonStringEncoder1 = JsonStringEncoder.getInstance();
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, 2000);
      jsonStringEncoder1._byteBuilder = byteArrayBuilder0;
      jsonStringEncoder0.encodeAsUTF8("Broken surrogate pair: first char 0x");
      jsonStringEncoder0.quoteAsString("Ft/(1AHBit+5i");
      jsonStringEncoder1.quoteAsUTF8("PA~yB=|*UOKn5wP)");
      // Undeclared exception!
      try { 
        JsonStringEncoder._illegalSurrogate(733);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character point (0x2dd) to output
         //
         verifyException("com.fasterxml.jackson.core.io.JsonStringEncoder", e);
      }
  }
}
