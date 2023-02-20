/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 18:15:15 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.SourceInformationAnnotator;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SourceInformationAnnotator_ESTest extends SourceInformationAnnotator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SourceInformationAnnotator sourceInformationAnnotator0 = new SourceInformationAnnotator("} +", false);
      Node node0 = new Node(38);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, sourceInformationAnnotator0);
      // Undeclared exception!
      try { 
        sourceInformationAnnotator0.visit(nodeTraversal0, node0, (Node) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // NAME is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Node node0 = new Node(33);
      SourceInformationAnnotator sourceInformationAnnotator0 = new SourceInformationAnnotator((String) null, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, sourceInformationAnnotator0);
      Node node1 = new Node(33);
      // Undeclared exception!
      try { 
        sourceInformationAnnotator0.visit(nodeTraversal0, node0, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.SourceInformationAnnotator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SourceInformationAnnotator sourceInformationAnnotator0 = new SourceInformationAnnotator("TD^iH*", true);
      Node node0 = new Node(3026);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator((AbstractCompiler) null, (SyntacticScopeCreator.RedeclarationHandler) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, sourceInformationAnnotator0, syntacticScopeCreator0);
      // Undeclared exception!
      try { 
        sourceInformationAnnotator0.visit(nodeTraversal0, node0, (Node) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.google.javascript.jscomp.SourceInformationAnnotator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SourceInformationAnnotator sourceInformationAnnotator0 = new SourceInformationAnnotator("com.google.javascript.jscomp.SymbolTable$ThisRefCollector", true);
      // Undeclared exception!
      try { 
        sourceInformationAnnotator0.setOriginalName((Node) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SourceInformationAnnotator sourceInformationAnnotator0 = new SourceInformationAnnotator((String) null, true);
      Node node0 = new Node(98);
      sourceInformationAnnotator0.setOriginalName(node0, "A");
      sourceInformationAnnotator0.setOriginalName(node0, "com.google.javascript.jscomp.InlineFunctions$CallVisitor");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SourceInformationAnnotator sourceInformationAnnotator0 = new SourceInformationAnnotator((String) null, true);
      Node node0 = new Node(33);
      sourceInformationAnnotator0.setOriginalName(node0, "");
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SourceInformationAnnotator sourceInformationAnnotator0 = new SourceInformationAnnotator((String) null, true);
      Node node0 = new Node(33);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, sourceInformationAnnotator0);
      // Undeclared exception!
      try { 
        sourceInformationAnnotator0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.SourceInformationAnnotator", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Node node0 = new Node(65);
      SourceInformationAnnotator sourceInformationAnnotator0 = new SourceInformationAnnotator((String) null, true);
      sourceInformationAnnotator0.visit((NodeTraversal) null, node0, node0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Node node0 = new Node(105);
      SourceInformationAnnotator sourceInformationAnnotator0 = new SourceInformationAnnotator("", false);
      // Undeclared exception!
      try { 
        sourceInformationAnnotator0.visit((NodeTraversal) null, node0, (Node) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Predicate
         //
         verifyException("com.google.javascript.jscomp.SourceInformationAnnotator", e);
      }
  }
}
