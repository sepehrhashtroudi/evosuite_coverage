/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 23:17:18 GMT 2022
 */

package org.apache.commons.math3.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.TooManyIterationsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TooManyIterationsException_ESTest extends TooManyIterationsException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(847);
      TooManyIterationsException tooManyIterationsException0 = new TooManyIterationsException(integer0);
  }
}