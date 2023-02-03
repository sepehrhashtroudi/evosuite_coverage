/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 22:58:17 GMT 2022
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.ode.AbstractIntegrator;
import org.apache.commons.math3.ode.EquationsMapper;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ThreeEighthesStepInterpolator_ESTest extends ThreeEighthesStepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      double[] doubleArray0 = new double[4];
      threeEighthesStepInterpolator0.previousState = doubleArray0;
      // Undeclared exception!
      try { 
        threeEighthesStepInterpolator0.computeInterpolatedStateAndDerivatives((-1.8379759110070617), 2353.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      double[] doubleArray0 = new double[8];
      double[][] doubleArray1 = new double[4][7];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      EquationsMapper equationsMapper0 = expandableStatefulODE0.getPrimaryMapper();
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[3];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      threeEighthesStepInterpolator0.reinitialize((AbstractIntegrator) null, doubleArray0, doubleArray1, false, equationsMapper0, equationsMapperArray0);
      threeEighthesStepInterpolator0.computeInterpolatedStateAndDerivatives((-2915.0860582723), (-118.692918567969));
      assertEquals(Double.NaN, threeEighthesStepInterpolator0.getGlobalPreviousTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      threeEighthesStepInterpolator0.setSoftPreviousTime((-1422.5));
      StepInterpolator stepInterpolator0 = threeEighthesStepInterpolator0.doCopy();
      assertEquals(Double.NaN, stepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      threeEighthesStepInterpolator0.setInterpolatedTime(0.0);
      StepInterpolator stepInterpolator0 = threeEighthesStepInterpolator0.doCopy();
      assertNotSame(threeEighthesStepInterpolator0, stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      threeEighthesStepInterpolator0.setSoftCurrentTime(0.0);
      StepInterpolator stepInterpolator0 = threeEighthesStepInterpolator0.doCopy();
      assertTrue(stepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      threeEighthesStepInterpolator0.storeTime((-3677.864524037606));
      StepInterpolator stepInterpolator0 = threeEighthesStepInterpolator0.doCopy();
      assertEquals((-3677.864524037606), stepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      double[] doubleArray0 = new double[7];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(252.274602601491, 1002.503082915, doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[6][8];
      EquationsMapper equationsMapper0 = new EquationsMapper((-1), 1);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[1];
      equationsMapperArray0[0] = equationsMapper0;
      threeEighthesStepInterpolator0.reinitialize(highamHall54Integrator0, doubleArray0, doubleArray1, false, equationsMapper0, equationsMapperArray0);
      // Undeclared exception!
      try { 
        threeEighthesStepInterpolator0.doCopy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-1357.4484441142683));
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[2][5];
      EquationsMapper equationsMapper0 = new EquationsMapper(2, 2326);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[9];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      equationsMapperArray0[3] = equationsMapper0;
      equationsMapperArray0[4] = equationsMapper0;
      equationsMapperArray0[5] = equationsMapper0;
      equationsMapperArray0[6] = equationsMapper0;
      equationsMapperArray0[7] = equationsMapper0;
      equationsMapperArray0[8] = equationsMapperArray0[5];
      threeEighthesStepInterpolator0.reinitialize(classicalRungeKuttaIntegrator0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
      // Undeclared exception!
      try { 
        threeEighthesStepInterpolator0.computeInterpolatedStateAndDerivatives((-1208.6), (-1208.6));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator1 = new ThreeEighthesStepInterpolator(threeEighthesStepInterpolator0);
      assertEquals(Double.NaN, threeEighthesStepInterpolator1.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      double[] doubleArray0 = new double[0];
      threeEighthesStepInterpolator0.previousState = doubleArray0;
      // Undeclared exception!
      try { 
        threeEighthesStepInterpolator0.getInterpolatedSecondaryDerivatives(27);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = null;
      try {
        threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator((ThreeEighthesStepInterpolator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", e);
      }
  }
}
