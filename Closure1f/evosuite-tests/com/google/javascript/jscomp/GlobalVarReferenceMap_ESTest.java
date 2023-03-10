/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 17:19:05 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.GlobalVarReferenceMap;
import com.google.javascript.rhino.Node;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GlobalVarReferenceMap_ESTest extends GlobalVarReferenceMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GlobalVarReferenceMap.GlobalVarRefCleanupPass globalVarReferenceMap_GlobalVarRefCleanupPass0 = new GlobalVarReferenceMap.GlobalVarRefCleanupPass((AbstractCompiler) null);
      Node node0 = new Node((-929), 41, 5615);
      // Undeclared exception!
      try { 
        globalVarReferenceMap_GlobalVarRefCleanupPass0.hotSwapScript(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.GlobalVarReferenceMap$GlobalVarRefCleanupPass", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<CompilerInput> linkedList0 = new LinkedList<CompilerInput>();
      GlobalVarReferenceMap globalVarReferenceMap0 = null;
      try {
        globalVarReferenceMap0 = new GlobalVarReferenceMap(linkedList0, linkedList0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Maps
         //
         verifyException("com.google.javascript.jscomp.GlobalVarReferenceMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GlobalVarReferenceMap.GlobalVarRefCleanupPass globalVarReferenceMap_GlobalVarRefCleanupPass0 = new GlobalVarReferenceMap.GlobalVarRefCleanupPass((AbstractCompiler) null);
      globalVarReferenceMap_GlobalVarRefCleanupPass0.process((Node) null, (Node) null);
  }
}
