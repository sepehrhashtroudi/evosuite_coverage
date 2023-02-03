/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 22:47:31 GMT 2022
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectInput;
import java.io.ObjectOutputStream;
import org.apache.commons.math3.ode.EquationsMapper;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerStepInterpolator;
import org.apache.commons.math3.ode.nonstiff.GillStepInterpolator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RungeKuttaStepInterpolator_ESTest extends RungeKuttaStepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EulerStepInterpolator eulerStepInterpolator0 = new EulerStepInterpolator();
      double[] doubleArray0 = new double[8];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[1][9];
      EquationsMapper equationsMapper0 = new EquationsMapper(0, (-1));
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[6];
      // Undeclared exception!
      try { 
        eulerStepInterpolator0.reinitialize(dormandPrince853Integrator0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GillStepInterpolator gillStepInterpolator0 = new GillStepInterpolator();
      // Undeclared exception!
      try { 
        gillStepInterpolator0.readExternal((ObjectInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MidpointStepInterpolator midpointStepInterpolator0 = new MidpointStepInterpolator();
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.0);
      double[] doubleArray0 = new double[4];
      double[][] doubleArray1 = new double[6][1];
      doubleArray1[0] = doubleArray0;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(867).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      EquationsMapper equationsMapper0 = expandableStatefulODE0.getPrimaryMapper();
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[7];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      equationsMapperArray0[3] = equationsMapper0;
      equationsMapperArray0[4] = equationsMapper0;
      equationsMapperArray0[5] = equationsMapper0;
      equationsMapperArray0[6] = equationsMapper0;
      midpointStepInterpolator0.reinitialize(midpointIntegrator0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
      midpointStepInterpolator0.shift();
      MockPrintStream mockPrintStream0 = new MockPrintStream("~|gI&ohV{6C");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        midpointStepInterpolator0.writeExternal(objectOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MidpointStepInterpolator midpointStepInterpolator0 = new MidpointStepInterpolator();
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.0);
      double[] doubleArray0 = new double[4];
      double[][] doubleArray1 = new double[6][1];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(867).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      EquationsMapper equationsMapper0 = expandableStatefulODE0.getPrimaryMapper();
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[7];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      equationsMapperArray0[3] = equationsMapper0;
      equationsMapperArray0[4] = equationsMapper0;
      equationsMapperArray0[5] = equationsMapper0;
      equationsMapperArray0[6] = equationsMapper0;
      midpointStepInterpolator0.reinitialize(midpointIntegrator0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("~|gI&ohV{6C");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        midpointStepInterpolator0.writeExternal(objectOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MidpointStepInterpolator midpointStepInterpolator0 = new MidpointStepInterpolator();
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.0);
      double[] doubleArray0 = new double[4];
      double[][] doubleArray1 = new double[6][1];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(867).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      EquationsMapper equationsMapper0 = expandableStatefulODE0.getPrimaryMapper();
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[7];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      equationsMapperArray0[3] = equationsMapper0;
      equationsMapperArray0[4] = equationsMapper0;
      equationsMapperArray0[5] = equationsMapper0;
      equationsMapperArray0[6] = equationsMapper0;
      midpointStepInterpolator0.reinitialize(midpointIntegrator0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
      midpointStepInterpolator0.shift();
      MidpointStepInterpolator midpointStepInterpolator1 = new MidpointStepInterpolator(midpointStepInterpolator0);
      assertTrue(midpointStepInterpolator1.isForward());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MidpointStepInterpolator midpointStepInterpolator0 = new MidpointStepInterpolator();
      MidpointStepInterpolator midpointStepInterpolator1 = new MidpointStepInterpolator(midpointStepInterpolator0);
      assertTrue(midpointStepInterpolator1.isForward());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MidpointStepInterpolator midpointStepInterpolator0 = new MidpointStepInterpolator();
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.0);
      double[] doubleArray0 = new double[4];
      double[][] doubleArray1 = new double[6][1];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(867).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      EquationsMapper equationsMapper0 = expandableStatefulODE0.getPrimaryMapper();
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[7];
      // Undeclared exception!
      try { 
        midpointStepInterpolator0.reinitialize(midpointIntegrator0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EulerStepInterpolator eulerStepInterpolator0 = new EulerStepInterpolator();
      // Undeclared exception!
      try { 
        eulerStepInterpolator0.shift();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator", e);
      }
  }
}
