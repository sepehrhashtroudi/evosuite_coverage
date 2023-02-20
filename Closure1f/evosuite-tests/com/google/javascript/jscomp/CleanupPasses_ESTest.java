/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 17:34:59 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CleanupPasses;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.PassConfig;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CleanupPasses_ESTest extends CleanupPasses_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CleanupPasses.MemoizedScopeCleanupPass cleanupPasses_MemoizedScopeCleanupPass0 = new CleanupPasses.MemoizedScopeCleanupPass((AbstractCompiler) null);
      Node node0 = new Node(1581, 1581, 1581);
      // Undeclared exception!
      try { 
        cleanupPasses_MemoizedScopeCleanupPass0.hotSwapScript(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CleanupPasses$MemoizedScopeCleanupPass", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CleanupPasses.MemoizedScopeCleanupPass cleanupPasses_MemoizedScopeCleanupPass0 = new CleanupPasses.MemoizedScopeCleanupPass((AbstractCompiler) null);
      Node node0 = new Node(1581, 1581, 1581);
      cleanupPasses_MemoizedScopeCleanupPass0.process(node0, node0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CleanupPasses cleanupPasses0 = new CleanupPasses((CompilerOptions) null);
      // Undeclared exception!
      try { 
        cleanupPasses0.getOptimizations();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/ImmutableList
         //
         verifyException("com.google.javascript.jscomp.CleanupPasses", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CleanupPasses cleanupPasses0 = new CleanupPasses((CompilerOptions) null);
      PassConfig.State passConfig_State0 = cleanupPasses0.getIntermediateState();
      assertNull(passConfig_State0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CleanupPasses cleanupPasses0 = new CleanupPasses((CompilerOptions) null);
      // Undeclared exception!
      try { 
        cleanupPasses0.getChecks();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.google.javascript.jscomp.CleanupPasses", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CleanupPasses cleanupPasses0 = new CleanupPasses((CompilerOptions) null);
      cleanupPasses0.setIntermediateState((PassConfig.State) null);
  }
}
