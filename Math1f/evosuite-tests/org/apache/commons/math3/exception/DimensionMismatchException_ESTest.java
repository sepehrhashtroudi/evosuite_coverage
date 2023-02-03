/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 23:08:33 GMT 2022
 */

package org.apache.commons.math3.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DimensionMismatchException_ESTest extends DimensionMismatchException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.INVALID_REGRESSION_ARRAY;
      DimensionMismatchException dimensionMismatchException0 = new DimensionMismatchException(localizedFormats0, (-1), (-1));
      int int0 = dimensionMismatchException0.getDimension();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.HOLE_BETWEEN_MODELS_TIME_RANGES;
      DimensionMismatchException dimensionMismatchException0 = new DimensionMismatchException(localizedFormats0, 144, 144);
      int int0 = dimensionMismatchException0.getDimension();
      assertEquals(144, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DimensionMismatchException dimensionMismatchException0 = new DimensionMismatchException(0, 0);
      int int0 = dimensionMismatchException0.getDimension();
      assertEquals(0, int0);
  }
}
