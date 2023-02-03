/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 22:32:49 GMT 2023
 */

package com.google.javascript.jscomp.graph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.graph.DiGraph;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal;
import com.google.javascript.jscomp.graph.GraphColoring;
import com.google.javascript.jscomp.graph.LinkedDirectedGraph;
import java.util.LinkedHashSet;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FixedPointGraphTraversal_ESTest extends FixedPointGraphTraversal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FixedPointGraphTraversal.EdgeCallback<String, LinkedDirectedGraph.AnnotatedLinkedDirectedGraphNode<String, Object>> fixedPointGraphTraversal_EdgeCallback0 = (FixedPointGraphTraversal.EdgeCallback<String, LinkedDirectedGraph.AnnotatedLinkedDirectedGraphNode<String, Object>>) mock(FixedPointGraphTraversal.EdgeCallback.class, new ViolatedAssumptionAnswer());
      FixedPointGraphTraversal<String, LinkedDirectedGraph.AnnotatedLinkedDirectedGraphNode<String, Object>> fixedPointGraphTraversal0 = FixedPointGraphTraversal.newTraversal((FixedPointGraphTraversal.EdgeCallback<String, LinkedDirectedGraph.AnnotatedLinkedDirectedGraphNode<String, Object>>) fixedPointGraphTraversal_EdgeCallback0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      // Undeclared exception!
      try { 
        fixedPointGraphTraversal0.computeFixedPoint((DiGraph<String, LinkedDirectedGraph.AnnotatedLinkedDirectedGraphNode<String, Object>>) null, (Set<String>) linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.graph.FixedPointGraphTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FixedPointGraphTraversal.EdgeCallback<GraphColoring.Color, GraphColoring.Color> fixedPointGraphTraversal_EdgeCallback0 = (FixedPointGraphTraversal.EdgeCallback<GraphColoring.Color, GraphColoring.Color>) mock(FixedPointGraphTraversal.EdgeCallback.class, new ViolatedAssumptionAnswer());
      FixedPointGraphTraversal<GraphColoring.Color, GraphColoring.Color> fixedPointGraphTraversal0 = new FixedPointGraphTraversal<GraphColoring.Color, GraphColoring.Color>(fixedPointGraphTraversal_EdgeCallback0);
      // Undeclared exception!
      try { 
        fixedPointGraphTraversal0.computeFixedPoint((DiGraph<GraphColoring.Color, GraphColoring.Color>) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Sets
         //
         verifyException("com.google.javascript.jscomp.graph.FixedPointGraphTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FixedPointGraphTraversal.EdgeCallback<Integer, Integer> fixedPointGraphTraversal_EdgeCallback0 = (FixedPointGraphTraversal.EdgeCallback<Integer, Integer>) mock(FixedPointGraphTraversal.EdgeCallback.class, new ViolatedAssumptionAnswer());
      FixedPointGraphTraversal<Integer, Integer> fixedPointGraphTraversal0 = new FixedPointGraphTraversal<Integer, Integer>(fixedPointGraphTraversal_EdgeCallback0);
      Integer integer0 = new Integer(717);
      // Undeclared exception!
      try { 
        fixedPointGraphTraversal0.computeFixedPoint((DiGraph<Integer, Integer>) null, integer0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Sets
         //
         verifyException("com.google.javascript.jscomp.graph.FixedPointGraphTraversal", e);
      }
  }
}
