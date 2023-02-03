/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 02:19:49 GMT 2022
 */

package org.apache.commons.math3.optim.nonlinear.vector;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.differentiation.JacobianFunction;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ModelFunctionJacobian_ESTest extends ModelFunctionJacobian_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultivariateDifferentiableVectorFunction multivariateDifferentiableVectorFunction0 = mock(MultivariateDifferentiableVectorFunction.class, new ViolatedAssumptionAnswer());
      JacobianFunction jacobianFunction0 = new JacobianFunction(multivariateDifferentiableVectorFunction0);
      ModelFunctionJacobian modelFunctionJacobian0 = new ModelFunctionJacobian(jacobianFunction0);
      MultivariateMatrixFunction multivariateMatrixFunction0 = modelFunctionJacobian0.getModelFunctionJacobian();
      assertSame(jacobianFunction0, multivariateMatrixFunction0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ModelFunctionJacobian modelFunctionJacobian0 = new ModelFunctionJacobian((MultivariateMatrixFunction) null);
      MultivariateMatrixFunction multivariateMatrixFunction0 = modelFunctionJacobian0.getModelFunctionJacobian();
      assertNull(multivariateMatrixFunction0);
  }
}