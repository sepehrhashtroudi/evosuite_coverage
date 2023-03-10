/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 22:18:20 GMT 2022
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.csv.Token;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Token_ESTest extends Token_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Token token0 = new Token();
      token0.content = null;
      // Undeclared exception!
      try { 
        token0.reset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.csv.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Token token0 = new Token();
      Token token1 = token0.reset();
      assertSame(token0, token1);
  }
}
