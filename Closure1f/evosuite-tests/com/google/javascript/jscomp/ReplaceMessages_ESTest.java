/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 22:22:45 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.EmptyMessageBundle;
import com.google.javascript.jscomp.JsMessage;
import com.google.javascript.jscomp.MessageBundle;
import com.google.javascript.jscomp.ReplaceMessages;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReplaceMessages_ESTest extends ReplaceMessages_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.LEGACY;
      ReplaceMessages replaceMessages0 = null;
      try {
        replaceMessages0 = new ReplaceMessages((AbstractCompiler) null, (MessageBundle) null, false, jsMessage_Style0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ReplaceMessages", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.CLOSURE;
      ReplaceMessages replaceMessages0 = null;
      try {
        replaceMessages0 = new ReplaceMessages((AbstractCompiler) null, emptyMessageBundle0, true, jsMessage_Style0, true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Maps
         //
         verifyException("com.google.javascript.jscomp.JsMessageVisitor", e);
      }
  }
}
