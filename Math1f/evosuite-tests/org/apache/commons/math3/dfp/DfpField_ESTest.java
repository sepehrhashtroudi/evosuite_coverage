/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 21:21:09 GMT 2022
 */

package org.apache.commons.math3.dfp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.dfp.DfpField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DfpField_ESTest extends DfpField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DfpField dfpField0 = null;
      try {
        dfpField0 = new DfpField(Integer.MAX_VALUE);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.dfp.Dfp", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DfpField dfpField0 = new DfpField((-1677));
  }
}
