/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 17:16:47 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.jscomp.UseSite;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UseSite_ESTest extends UseSite_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UseSite useSite0 = new UseSite((Node) null, (Scope) null, (JSModule) null);
      // Undeclared exception!
      try { 
        useSite0.equals(useSite0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.UseSite", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Node node0 = new Node((-261), (-261), (-261));
      JSModule jSModule0 = new JSModule("KD:o/H!");
      UseSite useSite0 = new UseSite(node0, (Scope) null, jSModule0);
      SyntheticAst syntheticAst0 = new SyntheticAst("KD:o/H!");
      Node node1 = syntheticAst0.getAstRoot((AbstractCompiler) null);
      UseSite useSite1 = new UseSite(node1, (Scope) null, jSModule0);
      useSite0.equals(useSite1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Node node0 = new Node((-261), (-261), (-261));
      JSModule jSModule0 = new JSModule("KD:o/H!");
      UseSite useSite0 = new UseSite(node0, (Scope) null, jSModule0);
      useSite0.equals(useSite0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Node node0 = new Node((-261), (-261), (-261));
      JSModule jSModule0 = new JSModule("KD:o/H!");
      UseSite useSite0 = new UseSite(node0, (Scope) null, jSModule0);
      useSite0.equals("KD:o/H!");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Node node0 = new Node((-261), (-261), (-261));
      JSModule jSModule0 = new JSModule("KD:o/H!");
      UseSite useSite0 = new UseSite(node0, (Scope) null, jSModule0);
      useSite0.hashCode();
  }
}
