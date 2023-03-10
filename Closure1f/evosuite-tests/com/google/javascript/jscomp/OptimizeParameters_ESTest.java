/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 09:58:48 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.OptimizeParameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OptimizeParameters_ESTest extends OptimizeParameters_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OptimizeParameters optimizeParameters0 = null;
      try {
        optimizeParameters0 = new OptimizeParameters((AbstractCompiler) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.google.javascript.jscomp.OptimizeParameters", e);
      }
  }
}
