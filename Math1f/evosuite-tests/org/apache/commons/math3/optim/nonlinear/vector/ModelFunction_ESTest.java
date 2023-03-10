/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 02:15:14 GMT 2022
 */

package org.apache.commons.math3.optim.nonlinear.vector;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.differentiation.GradientFunction;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ModelFunction_ESTest extends ModelFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultivariateDifferentiableFunction multivariateDifferentiableFunction0 = mock(MultivariateDifferentiableFunction.class, new ViolatedAssumptionAnswer());
      GradientFunction gradientFunction0 = new GradientFunction(multivariateDifferentiableFunction0);
      ModelFunction modelFunction0 = new ModelFunction(gradientFunction0);
      MultivariateVectorFunction multivariateVectorFunction0 = modelFunction0.getModelFunction();
      assertSame(gradientFunction0, multivariateVectorFunction0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ModelFunction modelFunction0 = new ModelFunction((MultivariateVectorFunction) null);
      MultivariateVectorFunction multivariateVectorFunction0 = modelFunction0.getModelFunction();
      assertNull(multivariateVectorFunction0);
  }
}
