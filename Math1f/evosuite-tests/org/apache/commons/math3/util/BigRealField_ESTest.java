/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 21:45:21 GMT 2022
 */

package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.RoundingMode;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.util.BigReal;
import org.apache.commons.math3.util.BigRealField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BigRealField_ESTest extends BigRealField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigRealField bigRealField0 = BigRealField.getInstance();
      Class<? extends FieldElement<BigReal>> class0 = bigRealField0.getRuntimeClass();
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BigRealField bigRealField0 = BigRealField.getInstance();
      BigReal bigReal0 = bigRealField0.getZero();
      assertEquals(RoundingMode.HALF_UP, bigReal0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BigRealField bigRealField0 = BigRealField.getInstance();
      BigReal bigReal0 = bigRealField0.getOne();
      assertEquals(64, bigReal0.getScale());
  }
}
