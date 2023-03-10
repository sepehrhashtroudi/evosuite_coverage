/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 02:33:33 GMT 2022
 */

package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.net.BCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BCodec_ESTest extends BCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BCodec bCodec0 = new BCodec("");
      String string0 = bCodec0.getEncoding();
      assertEquals("B", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.getDefaultCharset();
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BCodec bCodec0 = new BCodec("");
      String string0 = bCodec0.getDefaultCharset();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.encode("UTF-8", "UTF-8");
      assertEquals("=?UTF-8?B?VVRGLTg=?=", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = bCodec0.doEncoding(byteArray0);
      assertArrayEquals(new byte[] {(byte)65, (byte)65, (byte)65, (byte)61}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BCodec bCodec0 = new BCodec("RFC 1522 violation: charset not specified");
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = bCodec0.doEncoding(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      byte[] byteArray0 = new byte[7];
      byteArray0[5] = (byte)100;
      byte[] byteArray1 = bCodec0.doDecoding(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BCodec bCodec0 = new BCodec((String) null);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = bCodec0.doDecoding(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.decode("=?UTF-8?B??=");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      try { 
        bCodec0.encode("=?UTF-8?B?Pz0=?=", "P");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // P
         //
         verifyException("org.apache.commons.codec.net.BCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BCodec bCodec0 = new BCodec("RFC 1522 violation: charset not specified");
      try { 
        bCodec0.encode("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // RFC 1522 violation: charset not specified
         //
         verifyException("org.apache.commons.codec.net.BCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BCodec bCodec0 = new BCodec((String) null);
      // Undeclared exception!
      try { 
        bCodec0.encode(":I");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BCodec bCodec0 = new BCodec((String) null);
      // Undeclared exception!
      try { 
        bCodec0.encode((Object) "+yjVA^t4PB]3G_|0m4<");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BCodec bCodec0 = new BCodec("");
      try { 
        bCodec0.decode("B");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // RFC 1522 violation: malformed encoded content
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.decode("=?UTF-8?B?YGZESmogL094VSZwLmNvaV0s?=");
      assertEquals("`fDJj /OxU&p.coi],", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.encode("?=");
      assertEquals("=?UTF-8?B?Pz0=?=", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BCodec bCodec0 = new BCodec((String) null);
      // Undeclared exception!
      try { 
        bCodec0.encode("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BCodec bCodec0 = new BCodec((String) null);
      String string0 = bCodec0.getDefaultCharset();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      Object object0 = new Object();
      try { 
        bCodec0.decode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type java.lang.Object cannot be decoded using BCodec
         //
         verifyException("org.apache.commons.codec.net.BCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BCodec bCodec0 = new BCodec((String) null);
      Object object0 = bCodec0.decode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      Object object0 = new Object();
      try { 
        bCodec0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type java.lang.Object cannot be encoded using BCodec
         //
         verifyException("org.apache.commons.codec.net.BCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      Object object0 = bCodec0.encode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BCodec bCodec0 = new BCodec((String) null);
      String string0 = bCodec0.decode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.encode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.encode((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      byte[] byteArray0 = bCodec0.doDecoding((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      Object object0 = bCodec0.decode((Object) "=?UTF-8?B?NjVbWFF2a3R9Y30kMzRNc2VEbQ==?=");
      assertEquals("65[XQvkt}c}$34MseDm", object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      byte[] byteArray0 = bCodec0.doEncoding((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      assertEquals("UTF-8", bCodec0.getDefaultCharset());
      
      Object object0 = bCodec0.encode((Object) "65[XQvkt}c}$34MseDm");
      assertEquals("=?UTF-8?B?NjVbWFF2a3R9Y30kMzRNc2VEbQ==?=", object0);
      assertNotNull(object0);
  }
}
