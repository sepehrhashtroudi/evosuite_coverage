/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:24:54 GMT 2022
 */

package org.apache.commons.math3.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NonLinearConjugateGradientOptimizer_ESTest extends NonLinearConjugateGradientOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.IdentityPreconditioner nonLinearConjugateGradientOptimizer_IdentityPreconditioner0 = new NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = nonLinearConjugateGradientOptimizer_IdentityPreconditioner0.precondition(doubleArray0, doubleArray0);
      double[] doubleArray2 = nonLinearConjugateGradientOptimizer_IdentityPreconditioner0.precondition(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray2);
  }
}
