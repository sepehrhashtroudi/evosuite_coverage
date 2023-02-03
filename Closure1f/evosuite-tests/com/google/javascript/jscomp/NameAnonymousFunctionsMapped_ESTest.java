/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 22:36:18 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.NameAnonymousFunctionsMapped;
import com.google.javascript.jscomp.VariableMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NameAnonymousFunctionsMapped_ESTest extends NameAnonymousFunctionsMapped_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NameAnonymousFunctionsMapped nameAnonymousFunctionsMapped0 = null;
      try {
        nameAnonymousFunctionsMapped0 = new NameAnonymousFunctionsMapped((AbstractCompiler) null, (VariableMap) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Maps
         //
         verifyException("com.google.javascript.jscomp.NameAnonymousFunctionsMapped", e);
      }
  }
}