/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 18:11:05 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.VariableReferenceCheck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VariableReferenceCheck_ESTest extends VariableReferenceCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      VariableReferenceCheck variableReferenceCheck0 = null;
      try {
        variableReferenceCheck0 = new VariableReferenceCheck((AbstractCompiler) null, checkLevel0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Sets
         //
         verifyException("com.google.javascript.jscomp.VariableReferenceCheck", e);
      }
  }
}
