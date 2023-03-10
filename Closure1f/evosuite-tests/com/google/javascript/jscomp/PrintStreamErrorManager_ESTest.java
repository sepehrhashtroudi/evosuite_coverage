/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 17:30:38 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.MessageFormatter;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrintStreamErrorManager_ESTest extends PrintStreamErrorManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("]A?SM@=8``2)l{1Pv", "H#!{2OY#MIclJ'.l;s");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      PrintStreamErrorManager printStreamErrorManager0 = null;
      try {
        printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.google.javascript.jscomp.LightweightMessageFormatter
         //
         verifyException("com.google.javascript.jscomp.ErrorFormat$4", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      PrintStreamErrorManager printStreamErrorManager0 = null;
      try {
        printStreamErrorManager0 = new PrintStreamErrorManager((MessageFormatter) null, mockPrintStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Sets
         //
         verifyException("com.google.javascript.jscomp.BasicErrorManager", e);
      }
  }
}
