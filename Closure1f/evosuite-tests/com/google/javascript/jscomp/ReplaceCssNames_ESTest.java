/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 22:21:25 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.ReplaceCssNames;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReplaceCssNames_ESTest extends ReplaceCssNames_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>(1529);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>(0);
      ReplaceCssNames replaceCssNames0 = null;
      try {
        replaceCssNames0 = new ReplaceCssNames((AbstractCompiler) null, hashMap0, linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ReplaceCssNames", e);
      }
  }
}