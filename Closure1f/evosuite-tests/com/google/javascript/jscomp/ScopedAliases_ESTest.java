/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 10:14:51 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.PreprocessorSymbolTable;
import com.google.javascript.jscomp.ScopedAliases;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScopedAliases_ESTest extends ScopedAliases_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScopedAliases scopedAliases0 = new ScopedAliases((AbstractCompiler) null, (PreprocessorSymbolTable) null, (CompilerOptions.AliasTransformationHandler) null);
      Node node0 = new Node(0, 882, 0);
      // Undeclared exception!
      try { 
        scopedAliases0.hotSwapScript(node0, node0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.google.javascript.jscomp.ScopedAliases$Traversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ScopedAliases scopedAliases0 = new ScopedAliases((AbstractCompiler) null, (PreprocessorSymbolTable) null, (CompilerOptions.AliasTransformationHandler) null);
      Node node0 = new Node(Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        scopedAliases0.process(node0, node0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.google.javascript.jscomp.ScopedAliases$Traversal", e);
      }
  }
}
