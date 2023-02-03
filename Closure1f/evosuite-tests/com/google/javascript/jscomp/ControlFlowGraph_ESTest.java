/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 22:35:39 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ControlFlowGraph_ESTest extends ControlFlowGraph_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Node node0 = new Node((-13), (-13), (-13));
      // Undeclared exception!
      try { 
        ControlFlowGraph.isEnteringNewCfgNode(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ControlFlowGraph<String> controlFlowGraph0 = null;
      try {
        controlFlowGraph0 = new ControlFlowGraph<String>("com.oogle.javascriD.jscom0.ControlFlwraph", false, false);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Maps
         //
         verifyException("com.google.javascript.jscomp.graph.LinkedDirectedGraph", e);
      }
  }
}