/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 22:33:54 GMT 2022
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DormandPrince853Integrator_ESTest extends DormandPrince853Integrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.mainSetDimension = (-3126);
      double[][] doubleArray1 = new double[0][7];
      dormandPrince853Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray0, (-0.16624879837036133));
      assertEquals(8, dormandPrince853Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 3727.0432, 0.902267575263977);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 1283.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      dormandPrince853Integrator0.sanityChecks(expandableStatefulODE0, 1283.0);
      double[][] doubleArray0 = new double[18][4];
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.estimateError(doubleArray0, doubleArray0[1], doubleArray0[5], 12.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      int int0 = dormandPrince853Integrator0.getOrder();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[0][7];
      double double0 = dormandPrince853Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray0, (-0.16624879837036133));
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 1283.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      dormandPrince853Integrator0.sanityChecks(expandableStatefulODE0, 1283.0);
      double[][] doubleArray0 = new double[18][4];
      double[] doubleArray1 = new double[1];
      dormandPrince853Integrator0.vecAbsoluteTolerance = doubleArray0[3];
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.estimateError(doubleArray0, doubleArray1, doubleArray0[5], 12.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 1283.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 1396.767711);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = null;
      try {
        dormandPrince853Integrator0 = new DormandPrince853Integrator(1272.4917, 1272.4917, (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }
}