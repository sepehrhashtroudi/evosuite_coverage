/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 21:33:32 GMT 2022
 */

package org.apache.commons.math3.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.genetics.InvalidRepresentationException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InvalidRepresentationException_ESTest extends InvalidRepresentationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.ARGUMENT_OUTSIDE_DOMAIN;
      Object[] objectArray0 = new Object[6];
      InvalidRepresentationException invalidRepresentationException0 = new InvalidRepresentationException(localizedFormats0, objectArray0);
  }
}