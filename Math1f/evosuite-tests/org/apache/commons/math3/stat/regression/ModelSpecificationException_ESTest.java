/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:17:38 GMT 2022
 */

package org.apache.commons.math3.stat.regression;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.stat.regression.ModelSpecificationException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ModelSpecificationException_ESTest extends ModelSpecificationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.INVALID_BRACKETING_PARAMETERS;
      Object[] objectArray0 = new Object[0];
      ModelSpecificationException modelSpecificationException0 = new ModelSpecificationException(localizedFormats0, objectArray0);
  }
}
