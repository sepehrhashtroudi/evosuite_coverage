/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 26 20:04:28 GMT 2023
 */

package org.apache.commons.compress.compressors.gzip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GzipCompressorOutputStream_ESTest extends GzipCompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("qds+?$y!tB{FI% 5d%");
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0);
      gzipCompressorOutputStream0.close();
      try { 
        gzipCompressorOutputStream0.write((-1500));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // write beyond end of stream
         //
         verifyException("java.util.zip.DeflaterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        gzipCompressorOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0);
      mockFileOutputStream0.close();
      try { 
        gzipCompressorOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GzipCompressorOutputStream gzipCompressorOutputStream0 = null;
      try {
        gzipCompressorOutputStream0 = new GzipCompressorOutputStream((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.DeflaterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = null;
      try {
        gzipCompressorOutputStream0 = new GzipCompressorOutputStream(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0);
      gzipCompressorOutputStream0.write(0);
  }
}
