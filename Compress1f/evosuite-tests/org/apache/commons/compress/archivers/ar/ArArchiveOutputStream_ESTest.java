/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 26 20:19:20 GMT 2023
 */

package org.apache.commons.compress.archivers.ar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArArchiveOutputStream_ESTest extends ArArchiveOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("c`S(f~LSDPA^R-L");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("c`S(f~LSDPA^R-L", (-4390), (-1820), (-1820), (-1820), (-4390));
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // length does not match entry (-4390 != 0
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[2];
      arArchiveOutputStream0.write(0);
      arArchiveOutputStream0.write(byteArray0, 2422, (-351));
      arArchiveOutputStream0.write(0);
      arArchiveOutputStream0.closeArchiveEntry();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(byteArray0, 288, (int) (byte) (-69));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(6);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(byteArray0, 47, 6);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("KWDx", "KWDx");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(byteArray0, (int) (byte) (-128), 12);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[4];
      try { 
        arArchiveOutputStream0.write(byteArray0, (int) (byte)0, (int) (byte)122);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      File file0 = MockFile.createTempFile("P(:blemOEO>&D d~d", "h%_j^$?sK@7ke_w2");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[4];
      try { 
        arArchiveOutputStream0.write(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write((-565));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(pipedOutputStream0);
      try { 
        arArchiveOutputStream0.write(2533);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("5Y zO^^@]1", 0);
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Ob");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      arArchiveOutputStream0.write(16384);
      arArchiveOutputStream0.close();
      try { 
        arArchiveOutputStream0.closeArchiveEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(6);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      arArchiveOutputStream0.closeArchiveEntry();
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(6);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[4];
      arArchiveOutputStream0.write(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("c`S(f~LSVDPA^R-L");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(">", (-1840700268));
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // size too long
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("c`S(f~LSVDPA^R-L");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("c`S(f~LSVDPA^R-L", (-1840700274), (-4390), (-4390), (-1840700274), (-1840700274));
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // filemode too long
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("c`4(:f~LS6DPA^R-L");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("V3", (byte)0, (byte)0, (-1840700254), (-1840700254), (byte)0);
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // groupid too long
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("c`S(f~LSDPA^R-L");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("c`S(f~LSDPA^R-L", (-1840700282), (-1840700282), (-1840700282), (-1840700282), (-1840700282));
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // userid too long
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("c`4(:f~LS6DPA^R-L");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("c`4(:f~LS6DPA^R-L", (-4390));
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // filename too long
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("c`S(f~LSVDPA^R-L");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("c`S(f~LSVDPA^R-L", 0L);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.putArchiveEntry((ArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(bufferedOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(" N~;xa|)", 14L);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // length does not match entry (14 != 0
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }
}
