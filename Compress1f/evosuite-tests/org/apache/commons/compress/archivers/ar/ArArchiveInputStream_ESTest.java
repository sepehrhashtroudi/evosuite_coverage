/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 26 20:20:34 GMT 2023
 */

package org.apache.commons.compress.archivers.ar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArArchiveInputStream_ESTest extends ArArchiveInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)105;
      boolean boolean0 = ArArchiveInputStream.matches(byteArray0, (byte)105);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byteArray0[0] = (byte)127;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(byteArrayInputStream0);
      try { 
        arArchiveInputStream0.getNextArEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // invalid header \u0000\u0000\u0000\u0000\u0000\u0000\u0000
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(sequenceInputStream0);
      byte[] byteArray0 = new byte[3];
      arArchiveInputStream0.read(byteArray0, (-735), (int) (byte) (-1));
      ArArchiveEntry arArchiveEntry0 = arArchiveInputStream0.getNextArEntry();
      assertNull(arArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(mockFileInputStream0);
      int int0 = arArchiveInputStream0.read((byte[]) null, (-715), (-715));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      byte[] byteArray0 = new byte[0];
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(pipedInputStream0);
      int int0 = arArchiveInputStream0.read(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)115);
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(byteArrayInputStream0);
      int int0 = arArchiveInputStream0.read(byteArray0);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)127;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(byteArrayInputStream0);
      int int0 = arArchiveInputStream0.read();
      assertEquals(127, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        arArchiveInputStream0.read((byte[]) null, (-1), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        arArchiveInputStream0.read(byteArray0, 0, (int) (byte)92);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(mockFileInputStream0);
      try { 
        arArchiveInputStream0.read((byte[]) null, 0, 4085);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        arArchiveInputStream0.read(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(pipedInputStream0);
      byte[] byteArray0 = new byte[7];
      try { 
        arArchiveInputStream0.read(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        arArchiveInputStream0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0);
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(bufferedInputStream0);
      try { 
        arArchiveInputStream0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArArchiveInputStream.matches((byte[]) null, 16);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        ArArchiveInputStream.matches(byteArray0, 2026);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(sequenceInputStream0);
      arArchiveInputStream0.read();
      ArArchiveEntry arArchiveEntry0 = arArchiveInputStream0.getNextArEntry();
      assertNull(arArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(mockFileInputStream0);
      try { 
        arArchiveInputStream0.getNextArEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // failed to read header
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(byteArrayInputStream0);
      try { 
        arArchiveInputStream0.getNextArEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // invalid header \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        arArchiveInputStream0.getNextArEntry();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(sequenceInputStream0);
      byte[] byteArray0 = new byte[3];
      int int0 = arArchiveInputStream0.read(byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = ArArchiveInputStream.matches(byteArray0, (byte) (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = ArArchiveInputStream.matches(byteArray0, 33);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 1428);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, bufferedInputStream0);
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(sequenceInputStream0);
      arArchiveInputStream0.read();
      try { 
        arArchiveInputStream0.getNextArEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // failed to read entry header
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(sequenceInputStream0);
      try { 
        arArchiveInputStream0.getNextEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // failed to read header
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(sequenceInputStream0);
      arArchiveInputStream0.read();
      ArchiveEntry archiveEntry0 = arArchiveInputStream0.getNextEntry();
      assertNull(archiveEntry0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        arArchiveInputStream0.getNextEntry();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
      }
  }
}
