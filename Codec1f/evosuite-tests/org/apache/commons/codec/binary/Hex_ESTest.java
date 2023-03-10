/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 02:35:34 GMT 2022
 */

package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.binary.Hex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Hex_ESTest extends Hex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hex hex0 = new Hex();
      Object object0 = new Object();
      try { 
        hex0.decode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.Object cannot be cast to [C
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Hex.toDigit('9', 0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = Hex.encodeHex(byteArray0);
      assertArrayEquals(new char[] {}, charArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Hex hex0 = new Hex();
      byte[] byteArray1 = hex0.encode(byteArray0);
      byte[] byteArray2 = hex0.decode(byteArray1);
      assertArrayEquals(new byte[] {(byte)48, (byte)48, (byte)48, (byte)48}, byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = Hex.decodeHex(charArray0);
      Hex hex0 = new Hex();
      byte[] byteArray1 = hex0.decode(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      try { 
        Hex.toDigit('M', 3);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Illegal hexadecimal charcter M at index 3
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hex hex0 = new Hex();
      // Undeclared exception!
      try { 
        hex0.encode((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hex hex0 = new Hex();
      // Undeclared exception!
      try { 
        hex0.encode((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.decodeHex((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hex hex0 = new Hex();
      // Undeclared exception!
      try { 
        hex0.decode((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      char[] charArray0 = Hex.encodeHex(byteArray0);
      byte[] byteArray1 = Hex.decodeHex(charArray0);
      assertArrayEquals(new char[] {'0', '0', '0', '0'}, charArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[3];
      try { 
        Hex.decodeHex(charArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Odd number of characters.
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hex hex0 = new Hex();
      Object object0 = hex0.encode((Object) "");
      try { 
        hex0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // [C cannot be cast to [B
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hex hex0 = new Hex();
      Object object0 = hex0.encode((Object) "Zy<52'(!9lx=4|M?`");
      Object object1 = hex0.decode(object0);
      assertFalse(object1.equals((Object)object0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hex hex0 = new Hex();
      try { 
        hex0.decode((Object) "S_=@g+WV&-|kIWZDR-");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Illegal hexadecimal charcter S at index 0
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hex hex0 = new Hex();
      byte[] byteArray0 = new byte[1];
      try { 
        hex0.decode(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Odd number of characters.
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = Hex.decodeHex(charArray0);
      Hex hex0 = new Hex();
      byte[] byteArray1 = hex0.encode(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Hex hex0 = new Hex();
      // Undeclared exception!
      try { 
        hex0.decode((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
