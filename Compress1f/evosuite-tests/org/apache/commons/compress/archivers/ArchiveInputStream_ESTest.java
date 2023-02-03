/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 26 20:16:52 GMT 2023
 */

package org.apache.commons.compress.archivers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchiveInputStream_ESTest extends ArchiveInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(pipedInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(arArchiveInputStream0);
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(bufferedInputStream0, 0);
      // Undeclared exception!
      try { 
        tarArchiveInputStream0.getNextEntry();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CpioArchiveInputStream cpioArchiveInputStream0 = new CpioArchiveInputStream((InputStream) null);
      cpioArchiveInputStream0.close();
      try { 
        cpioArchiveInputStream0.getNextEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
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