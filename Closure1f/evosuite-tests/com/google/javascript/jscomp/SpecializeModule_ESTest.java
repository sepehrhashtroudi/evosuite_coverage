/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 22:07:46 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.PassFactory;
import com.google.javascript.jscomp.SimpleFunctionAliasAnalysis;
import com.google.javascript.jscomp.SpecializeModule;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SpecializeModule_ESTest extends SpecializeModule_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SpecializeModule specializeModule0 = new SpecializeModule((AbstractCompiler) null, (PassFactory[]) null);
      Node node0 = new Node(0, 0, 0);
      // Undeclared exception!
      try { 
        specializeModule0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.SpecializeModule", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleFunctionAliasAnalysis simpleFunctionAliasAnalysis0 = new SimpleFunctionAliasAnalysis();
      SpecializeModule.SpecializationState specializeModule_SpecializationState0 = null;
      try {
        specializeModule_SpecializationState0 = new SpecializeModule.SpecializationState(simpleFunctionAliasAnalysis0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Sets
         //
         verifyException("com.google.javascript.jscomp.SpecializeModule$SpecializationState", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PassFactory[] passFactoryArray0 = new PassFactory[3];
      SpecializeModule specializeModule0 = new SpecializeModule((AbstractCompiler) null, passFactoryArray0);
      JSModule jSModule0 = new JSModule("crossModuleCodeMotion");
      // Undeclared exception!
      try { 
        specializeModule0.getDirectDependents(jSModule0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Sets
         //
         verifyException("com.google.javascript.jscomp.SpecializeModule", e);
      }
  }
}
