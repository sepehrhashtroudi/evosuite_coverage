/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 23:56:43 GMT 2022
 */

package org.apache.commons.math3.analysis.differentiation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.GradientFunction;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GradientFunction_ESTest extends GradientFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultivariateDifferentiableFunction multivariateDifferentiableFunction0 = mock(MultivariateDifferentiableFunction.class, new ViolatedAssumptionAnswer());
      doReturn((DerivativeStructure) null).when(multivariateDifferentiableFunction0).value(any(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[].class));
      GradientFunction gradientFunction0 = new GradientFunction(multivariateDifferentiableFunction0);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = gradientFunction0.value(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MultivariateDifferentiableFunction multivariateDifferentiableFunction0 = mock(MultivariateDifferentiableFunction.class, new ViolatedAssumptionAnswer());
      doReturn((DerivativeStructure) null).when(multivariateDifferentiableFunction0).value(any(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[].class));
      GradientFunction gradientFunction0 = new GradientFunction(multivariateDifferentiableFunction0);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        gradientFunction0.value(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.GradientFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DerivativeStructure derivativeStructure0 = mock(DerivativeStructure.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(derivativeStructure0).getPartialDerivative(any(int[].class));
      MultivariateDifferentiableFunction multivariateDifferentiableFunction0 = mock(MultivariateDifferentiableFunction.class, new ViolatedAssumptionAnswer());
      doReturn(derivativeStructure0).when(multivariateDifferentiableFunction0).value(any(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[].class));
      GradientFunction gradientFunction0 = new GradientFunction(multivariateDifferentiableFunction0);
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = gradientFunction0.value(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }
}