/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 10:04:47 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CheckMissingGetCssName;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckMissingGetCssName_ESTest extends CheckMissingGetCssName_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckMissingGetCssName checkMissingGetCssName0 = new CheckMissingGetCssName((AbstractCompiler) null, checkLevel0, "");
      SyntheticAst syntheticAst0 = new SyntheticAst("AF/GMnXsRK8y.>9`F");
      Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) null);
      // Undeclared exception!
      try { 
        checkMissingGetCssName0.process((Node) null, node0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Predicate
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckMissingGetCssName checkMissingGetCssName0 = new CheckMissingGetCssName((AbstractCompiler) null, checkLevel0, "JSC_MISSING_GETCSSNAME");
      SyntheticAst syntheticAst0 = new SyntheticAst("JSC_MISSING_GETCSSNAME");
      Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) null);
      // Undeclared exception!
      try { 
        checkMissingGetCssName0.visit((NodeTraversal) null, (Node) null, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CheckMissingGetCssName", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckMissingGetCssName checkMissingGetCssName0 = null;
      try {
        checkMissingGetCssName0 = new CheckMissingGetCssName((AbstractCompiler) null, checkLevel0, "9?c5?p{QRp+=WzN?Z");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 10
         // \\b(?:9?c5?p{QRp+=WzN?Z)
         //           ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckMissingGetCssName checkMissingGetCssName0 = new CheckMissingGetCssName((AbstractCompiler) null, checkLevel0, "C_MISSING_ETCSNAME");
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, checkMissingGetCssName0);
      SyntheticAst syntheticAst0 = new SyntheticAst("C_MISSING_ETCSNAME");
      Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) null);
      checkMissingGetCssName0.visit(nodeTraversal0, node0, node0);
  }
}
