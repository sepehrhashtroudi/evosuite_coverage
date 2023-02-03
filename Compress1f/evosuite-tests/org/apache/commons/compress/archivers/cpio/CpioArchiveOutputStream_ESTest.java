/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 26 20:22:07 GMT 2023
 */

package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CpioArchiveOutputStream_ESTest extends CpioArchiveOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile(",RC Rrp~Q[(j-7");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0, (short)2);
      cpioArchiveOutputStream0.write(1202);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.write((byte[]) null, 0, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      cpioArchiveOutputStream0.close();
      byte[] byteArray0 = new byte[7];
      try { 
        cpioArchiveOutputStream0.write(byteArray0, 65280, (-1312));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.write(50);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("8Mw*J-+`");
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.putNextEntry(cpioArchiveEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("85>+!$m[bx)pqQ5Fb7!", false);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.putArchiveEntry((ArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.finish();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(dataOutputStream0);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.closeArchiveEntry();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 16371);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(bufferedOutputStream0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 16371);
      cpioArchiveOutputStream0.putNextEntry(cpioArchiveEntry0);
      try { 
        cpioArchiveOutputStream0.finish();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // invalid entry size (expected 16371 but got 0 bytes)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("CtBxNh|B]");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("CtBxNh|B]");
      cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
      cpioArchiveOutputStream0.closeArchiveEntry();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 16348);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(bufferedOutputStream0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 16348);
      cpioArchiveOutputStream0.putNextEntry(cpioArchiveEntry0);
      try { 
        cpioArchiveOutputStream0.closeArchiveEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // invalid entry size (expected 16348 but got 0 bytes)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      File file0 = MockFile.createTempFile("Unknown header type", "Unknown header type");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockFileOutputStream0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("01UiI/96'N%", 0L);
      cpioArchiveOutputStream0.putNextEntry(cpioArchiveEntry0);
      try { 
        cpioArchiveOutputStream0.putNextEntry(cpioArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // duplicate entry: 01UiI/96'N%
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Unknown header type", "Unknown header type");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockFileOutputStream0);
      cpioArchiveOutputStream0.close();
      cpioArchiveOutputStream0.close();
      assertEquals(124L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 16384);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(bufferedOutputStream0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      cpioArchiveOutputStream0.putNextEntry(cpioArchiveEntry0);
      byte[] byteArray0 = new byte[6];
      try { 
        cpioArchiveOutputStream0.write(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // attempt to write past end of STORED entry
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 16348);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(bufferedOutputStream0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 16348);
      cpioArchiveOutputStream0.putNextEntry(cpioArchiveEntry0);
      byte[] byteArray0 = new byte[6];
      cpioArchiveOutputStream0.write(byteArray0);
      assertEquals(6, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("070702");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[4];
      cpioArchiveOutputStream0.write(byteArray0, (int) (byte)0, (int) (byte)0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile(",RC Rrp~Q[(j-7");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0, (short)2);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.write(byteArray0, (int) (byte)0, 4096);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("cH9,RB8?)G ", true);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.write(byteArray0, 2002, (-1471));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.write(byteArray0, (int) (byte) (-18), (int) (byte)6);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("vtBNh|BC");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("vtBNh|BC");
      cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
      try { 
        cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // duplicate entry: vtBNh|BC
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Prq+&EI)c:`}h", true);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
      try {
        cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockFileOutputStream0, (short) (-101));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
      try {
        cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null, (short)7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
      try {
        cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0, (short)6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null, (short)4);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
      try {
        cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0, (short)3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0, (short)2);
      cpioArchiveOutputStream0.close();
      assertEquals("0707020000000000000000000000000000000000000001ffffffff00000000000000000000000000000000000000000000000b00000000TRAILER!!!\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(124, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("070702");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Stream closed", 1119L);
      cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
      try { 
        cpioArchiveOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // invalid entry size (expected 1119 but got 0 bytes)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(pipedOutputStream0);
      try { 
        cpioArchiveOutputStream0.write(31);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream(" but got ");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      MockFile mockFile0 = new MockFile("");
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(mockFile0);
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.putArchiveEntry(tarArchiveEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0, (short)8);
      cpioArchiveOutputStream0.finish();
      assertEquals(38, byteArrayOutputStream0.size());
      assertEquals("q\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\uFFFD\uFFFD\uFFFD\uFFFD\u0000\u000B\u0000\u0000\u0000\u0000TRAILER!!!\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 16348);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(bufferedOutputStream0);
      byte[] byteArray0 = new byte[6];
      try { 
        cpioArchiveOutputStream0.write(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no current CPIO entry
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }
}