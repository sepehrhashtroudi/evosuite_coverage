/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 18:27:56 GMT 2023
 */

package com.google.debugging.sourcemap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.debugging.sourcemap.Base64VLQ;
import java.io.File;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64VLQ_ESTest extends Base64VLQ_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64VLQ.encode((Appendable) null, 3241);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.debugging.sourcemap.Base64VLQ", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      // Undeclared exception!
      try { 
        Base64VLQ.encode(charBuffer1, 0);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.StringCharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
      // Undeclared exception!
      try { 
        Base64VLQ.encode(charBuffer0, 0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64VLQ.encode((Appendable) null, (-1395));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.debugging.sourcemap.Base64VLQ", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      mockFileWriter0.close();
      try { 
        Base64VLQ.encode(mockFileWriter0, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64VLQ.decode((Base64VLQ.CharIterator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.debugging.sourcemap.Base64VLQ", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, ";gXwWbW`Lf&iG)N");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Base64VLQ.encode(mockPrintStream0, (-171));
      assertEquals(2L, mockFile0.length());
  }
}
