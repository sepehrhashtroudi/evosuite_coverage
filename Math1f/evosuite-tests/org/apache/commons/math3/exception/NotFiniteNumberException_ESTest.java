/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 23:05:56 GMT 2022
 */

package org.apache.commons.math3.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NotFiniteNumberException_ESTest extends NotFiniteNumberException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.UNABLE_TO_PERFORM_QR_DECOMPOSITION_ON_JACOBIAN;
      Float float0 = new Float((-1674.4));
      Object[] objectArray0 = new Object[0];
      NotFiniteNumberException notFiniteNumberException0 = new NotFiniteNumberException(localizedFormats0, float0, objectArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Byte byte0 = new Byte((byte)0);
      NotFiniteNumberException notFiniteNumberException0 = new NotFiniteNumberException(byte0, objectArray0);
  }
}
