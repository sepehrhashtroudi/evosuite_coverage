/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 07:24:49 GMT 2022
 */

package org.apache.commons.math3.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.linear.IllConditionedOperatorException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IllConditionedOperatorException_ESTest extends IllConditionedOperatorException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IllConditionedOperatorException illConditionedOperatorException0 = new IllConditionedOperatorException(1.0);
  }
}
