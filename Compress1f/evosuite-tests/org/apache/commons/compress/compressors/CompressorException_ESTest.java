/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 26 20:02:06 GMT 2023
 */

package org.apache.commons.compress.compressors;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.compressors.CompressorException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CompressorException_ESTest extends CompressorException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CompressorException compressorException0 = new CompressorException("4\"");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CompressorException compressorException0 = new CompressorException();
      CompressorException compressorException1 = new CompressorException(compressorException0);
      assertFalse(compressorException1.equals((Object)compressorException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CompressorException compressorException0 = new CompressorException();
      CompressorException compressorException1 = new CompressorException("", compressorException0);
      assertFalse(compressorException1.equals((Object)compressorException0));
  }
}
