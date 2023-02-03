/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 22:31:07 GMT 2023
 */

package com.google.javascript.jscomp.graph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.graph.DiGraph;
import com.google.javascript.jscomp.graph.LinkedDirectedGraph;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiGraph_ESTest extends DiGraph_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(0);
      LinkedDirectedGraph.LinkedDirectedGraphEdge<LinkedDirectedGraph.LinkedDirectedGraphNode<Integer, String>, Integer> linkedDirectedGraph_LinkedDirectedGraphEdge0 = new LinkedDirectedGraph.LinkedDirectedGraphEdge<LinkedDirectedGraph.LinkedDirectedGraphNode<Integer, String>, Integer>((DiGraph.DiGraphNode<LinkedDirectedGraph.LinkedDirectedGraphNode<Integer, String>, Integer>) null, integer0, (DiGraph.DiGraphNode<LinkedDirectedGraph.LinkedDirectedGraphNode<Integer, String>, Integer>) null);
      linkedDirectedGraph_LinkedDirectedGraphEdge0.setSource((DiGraph.DiGraphNode<LinkedDirectedGraph.LinkedDirectedGraphNode<Integer, String>, Integer>) null);
      assertEquals("black", linkedDirectedGraph_LinkedDirectedGraphEdge0.getColor());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      LinkedDirectedGraph.AnnotatedLinkedDirectedGraphEdge<LinkedDirectedGraph.AnnotatedLinkedDirectedGraphEdge<Object, Object>, Integer> linkedDirectedGraph_AnnotatedLinkedDirectedGraphEdge0 = new LinkedDirectedGraph.AnnotatedLinkedDirectedGraphEdge<LinkedDirectedGraph.AnnotatedLinkedDirectedGraphEdge<Object, Object>, Integer>((DiGraph.DiGraphNode<LinkedDirectedGraph.AnnotatedLinkedDirectedGraphEdge<Object, Object>, Integer>) null, integer0, (DiGraph.DiGraphNode<LinkedDirectedGraph.AnnotatedLinkedDirectedGraphEdge<Object, Object>, Integer>) null);
      DiGraph.DiGraphNode<LinkedDirectedGraph.AnnotatedLinkedDirectedGraphEdge<Object, Object>, Integer> diGraph_DiGraphNode0 = linkedDirectedGraph_AnnotatedLinkedDirectedGraphEdge0.getDestination();
      assertNull(diGraph_DiGraphNode0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedDirectedGraph<String, String> linkedDirectedGraph0 = null;
      try {
        linkedDirectedGraph0 = new LinkedDirectedGraph<String, String>(false, false);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Maps
         //
         verifyException("com.google.javascript.jscomp.graph.LinkedDirectedGraph", e);
      }
  }
}