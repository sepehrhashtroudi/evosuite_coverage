/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 02:20:19 GMT 2022
 */

package org.apache.commons.math3.optim.nonlinear.scalar;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ObjectiveFunction_ESTest extends ObjectiveFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[][] doubleArray0 = new double[1][8];
      double[] doubleArray1 = new double[1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 0, 0, unitSphereRandomVectorGenerator0);
      ObjectiveFunction objectiveFunction0 = new ObjectiveFunction(microsphereInterpolatingFunction0);
      MultivariateFunction multivariateFunction0 = objectiveFunction0.getObjectiveFunction();
      assertSame(multivariateFunction0, microsphereInterpolatingFunction0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectiveFunction objectiveFunction0 = new ObjectiveFunction((MultivariateFunction) null);
      MultivariateFunction multivariateFunction0 = objectiveFunction0.getObjectiveFunction();
      assertNull(multivariateFunction0);
  }
}
