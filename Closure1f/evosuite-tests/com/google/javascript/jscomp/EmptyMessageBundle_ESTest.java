/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 17:36:07 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.EmptyMessageBundle;
import com.google.javascript.jscomp.JsMessage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmptyMessageBundle_ESTest extends EmptyMessageBundle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      JsMessage.IdGenerator jsMessage_IdGenerator0 = emptyMessageBundle0.idGenerator();
      assertNull(jsMessage_IdGenerator0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      // Undeclared exception!
      try { 
        emptyMessageBundle0.getAllMessages();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/ImmutableList
         //
         verifyException("com.google.javascript.jscomp.EmptyMessageBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      JsMessage jsMessage0 = emptyMessageBundle0.getMessage("");
      assertNull(jsMessage0);
  }
}
