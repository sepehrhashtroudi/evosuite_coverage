/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 01 21:20:28 GMT 2023
 */

package com.fasterxml.jackson.core.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.io.NumberOutput;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumberOutput_ESTest extends NumberOutput_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = NumberOutput.toString((-2147483648L));
      assertEquals("-2147483648", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = NumberOutput.toString(2147483647L);
      assertEquals("2147483647", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = NumberOutput.toString((-11L));
      assertEquals("-11", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = NumberOutput.toString(1L);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = NumberOutput.toString(11);
      assertEquals("11", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[4];
      int int0 = NumberOutput.outputLong(0L, charArray0, 0);
      assertEquals(1, int0);
      assertArrayEquals(new char[] {'0', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        NumberOutput.outputInt(1000000000, byteArray0, 993);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 993
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        NumberOutput.outputInt(10, byteArray0, (-1401));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1401
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberOutput.outputLong(1000L, byteArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[5];
      int int0 = NumberOutput.outputLong((-1L), charArray0, 0);
      assertEquals(2, int0);
      assertArrayEquals(new char[] {'-', '1', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        NumberOutput.outputInt(10, charArray0, (-5422));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5422
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        NumberOutput.outputInt(Integer.MIN_VALUE, charArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        NumberOutput.outputLong((-2147483648L), byteArray0, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[26];
      int int0 = NumberOutput.outputLong(2147483647L, charArray0, 0);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberOutput.outputLong(1000L, (char[]) null, (-2290));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberOutput.outputLong(0L, (byte[]) null, 21);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberOutput.outputInt(1495, (byte[]) null, 1495);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = NumberOutput.toString((-1));
      assertEquals("-1", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = NumberOutput.toString(0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[18];
      // Undeclared exception!
      try { 
        NumberOutput.outputLong(10000000000L, charArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        NumberOutput.outputLong((long) Integer.MIN_VALUE, charArray0, (-3106));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3106
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberOutput.outputInt(2147483646, (char[]) null, 12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberOutput.outputInt(640, (char[]) null, 640);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        NumberOutput.outputInt((-1636), charArray0, 3105);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3105
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = NumberOutput.toString((-9223372036854775808L));
      assertEquals("-9223372036854775808", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = NumberOutput.toString(10000000000L);
      assertEquals("10000000000", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = NumberOutput.toString((-1873));
      assertEquals("-1873", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberOutput.outputLong(9223372036854775794L, byteArray0, 13);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 29
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      // Undeclared exception!
      try { 
        NumberOutput.outputLong((-9223372036854775798L), byteArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = NumberOutput.outputLong((long) (-1), byteArray0, 0);
      assertEquals(2, int0);
      assertArrayEquals(new byte[] {(byte)45, (byte)49}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        NumberOutput.outputLong(2147483647L, byteArray0, (int) (byte)4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        NumberOutput.outputLong((-9223372036854775808L), charArray0, (-2147483646));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        NumberOutput.outputInt((-2147483645), byteArray0, (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        NumberOutput.outputInt(282, byteArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      int int0 = NumberOutput.outputInt(1000000, byteArray0, 0);
      //  // Unstable assertion: assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        NumberOutput.outputInt(Integer.MIN_VALUE, byteArray0, (int) (byte)116);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 116
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = NumberOutput.outputInt((-1), byteArray0, 0);
      assertEquals(2, int0);
      assertArrayEquals(new byte[] {(byte)45, (byte)49}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        NumberOutput.outputInt(1000000, charArray0, (int) (byte)48);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 48
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberOutput.outputInt((int) (byte)0, (char[]) null, (int) (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        NumberOutput.outputInt(1000000000, charArray0, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[7];
      int int0 = NumberOutput.outputLong((-41L), charArray0, 2);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '-', '4', '1', '\u0000', '\u0000'}, charArray0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = NumberOutput.toString(476.663548);
      assertEquals("476.663548", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NumberOutput numberOutput0 = new NumberOutput();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        NumberOutput.outputInt(2471, byteArray0, 0);
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        NumberOutput.outputInt(2721, charArray0, 4);
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }
}