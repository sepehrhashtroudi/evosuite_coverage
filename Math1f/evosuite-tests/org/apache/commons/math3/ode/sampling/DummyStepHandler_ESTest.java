/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 22:20:16 GMT 2022
 */

package org.apache.commons.math3.ode.sampling;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
import org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DummyStepHandler_ESTest extends DummyStepHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      double[] doubleArray0 = new double[0];
      dummyStepHandler0.init((-243.71055558905), doubleArray0, (-243.71055558905));
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      NordsieckStepInterpolator nordsieckStepInterpolator0 = new NordsieckStepInterpolator();
      dummyStepHandler0.handleStep(nordsieckStepInterpolator0, true);
      assertEquals(Double.NaN, nordsieckStepInterpolator0.getGlobalPreviousTime(), 0.01);
  }
}