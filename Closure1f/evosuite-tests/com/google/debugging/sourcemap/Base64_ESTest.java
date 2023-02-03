/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 23:25:44 GMT 2023
 */

package com.google.debugging.sourcemap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.debugging.sourcemap.Base64;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64_ESTest extends Base64_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char char0 = Base64.toBase64(0);
      assertEquals('A', char0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char char0 = Base64.toBase64(62);
      assertEquals('+', char0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      char char0 = Base64.toBase64(59);
      assertEquals('7', char0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = Base64.fromBase64('A');
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.fromBase64('\uFFFF');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 65535
         //
         verifyException("com.google.debugging.sourcemap.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = Base64.fromBase64('K');
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.fromBase64(']');
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // invalid char
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String string0 = Base64.base64EncodeInt((-1769));
      assertEquals("///5Fw", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.toBase64(709);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // value out of range:709
         //
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.toBase64((-2442));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // value out of range:-2442
         //
      }
  }
}
