/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 23:12:23 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.IgnoreCajaProperties;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IgnoreCajaProperties_ESTest extends IgnoreCajaProperties_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IgnoreCajaProperties ignoreCajaProperties0 = new IgnoreCajaProperties((AbstractCompiler) null);
      Node node0 = new Node(0);
      // Undeclared exception!
      try { 
        ignoreCajaProperties0.process(node0, (Node) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Predicate
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }
}
