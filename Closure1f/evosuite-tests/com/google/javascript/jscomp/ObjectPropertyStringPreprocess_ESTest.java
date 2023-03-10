/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 09:40:45 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.ObjectPropertyStringPreprocess;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ObjectPropertyStringPreprocess_ESTest extends ObjectPropertyStringPreprocess_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectPropertyStringPreprocess objectPropertyStringPreprocess0 = new ObjectPropertyStringPreprocess((AbstractCompiler) null);
      Node node0 = new Node((-1920), (-1), 3);
      // Undeclared exception!
      try { 
        objectPropertyStringPreprocess0.process((Node) null, node0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.google.javascript.rhino.IR", e);
      }
  }
}
