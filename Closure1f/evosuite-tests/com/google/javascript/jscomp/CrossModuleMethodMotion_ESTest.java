/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 17:52:54 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CrossModuleMethodMotion;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CrossModuleMethodMotion_ESTest extends CrossModuleMethodMotion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CrossModuleMethodMotion.IdGenerator crossModuleMethodMotion_IdGenerator0 = new CrossModuleMethodMotion.IdGenerator();
      boolean boolean0 = crossModuleMethodMotion_IdGenerator0.hasGeneratedAnyIds();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CrossModuleMethodMotion.IdGenerator crossModuleMethodMotion_IdGenerator0 = new CrossModuleMethodMotion.IdGenerator();
      int int0 = crossModuleMethodMotion_IdGenerator0.newId();
      assertEquals(0, int0);
      
      boolean boolean0 = crossModuleMethodMotion_IdGenerator0.hasGeneratedAnyIds();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CrossModuleMethodMotion.IdGenerator crossModuleMethodMotion_IdGenerator0 = new CrossModuleMethodMotion.IdGenerator();
      CrossModuleMethodMotion crossModuleMethodMotion0 = null;
      try {
        crossModuleMethodMotion0 = new CrossModuleMethodMotion((AbstractCompiler) null, crossModuleMethodMotion_IdGenerator0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CrossModuleMethodMotion", e);
      }
  }
}
