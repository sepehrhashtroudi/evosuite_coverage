/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 22:46:35 GMT 2022
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
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.GillStepInterpolator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GillStepInterpolator_ESTest extends GillStepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GillStepInterpolator gillStepInterpolator0 = new GillStepInterpolator();
      gillStepInterpolator0.setSoftPreviousTime(0.0);
      StepInterpolator stepInterpolator0 = gillStepInterpolator0.doCopy();
      assertNotSame(gillStepInterpolator0, stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GillStepInterpolator gillStepInterpolator0 = new GillStepInterpolator();
      gillStepInterpolator0.setSoftPreviousTime((-1.0));
      GillStepInterpolator gillStepInterpolator1 = (GillStepInterpolator)gillStepInterpolator0.doCopy();
      assertEquals(Double.NaN, gillStepInterpolator1.getGlobalPreviousTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GillStepInterpolator gillStepInterpolator0 = new GillStepInterpolator();
      gillStepInterpolator0.storeTime(0.0);
      StepInterpolator stepInterpolator0 = gillStepInterpolator0.doCopy();
      assertFalse(stepInterpolator0.equals((Object)gillStepInterpolator0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GillStepInterpolator gillStepInterpolator0 = new GillStepInterpolator();
      gillStepInterpolator0.storeTime((-3.0));
      GillStepInterpolator gillStepInterpolator1 = (GillStepInterpolator)gillStepInterpolator0.doCopy();
      assertEquals(Double.NaN, gillStepInterpolator1.getGlobalPreviousTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GillStepInterpolator gillStepInterpolator0 = new GillStepInterpolator();
      double[] doubleArray0 = new double[5];
      double[][] doubleArray1 = new double[3][2];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      EquationsMapper equationsMapper0 = expandableStatefulODE0.getPrimaryMapper();
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[8];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      equationsMapperArray0[3] = equationsMapper0;
      equationsMapperArray0[4] = equationsMapper0;
      equationsMapperArray0[5] = equationsMapperArray0[0];
      equationsMapperArray0[6] = equationsMapper0;
      equationsMapperArray0[7] = equationsMapper0;
      gillStepInterpolator0.reinitialize((AbstractIntegrator) null, doubleArray0, doubleArray1, false, equationsMapper0, equationsMapperArray0);
      // Undeclared exception!
      try { 
        gillStepInterpolator0.doCopy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GillStepInterpolator gillStepInterpolator0 = new GillStepInterpolator();
      GillStepInterpolator gillStepInterpolator1 = new GillStepInterpolator(gillStepInterpolator0);
      assertFalse(gillStepInterpolator1.equals((Object)gillStepInterpolator0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GillStepInterpolator gillStepInterpolator0 = new GillStepInterpolator();
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(2971.4, 0.0, 2971.4, 0.0);
      double[] doubleArray0 = new double[9];
      double[][] doubleArray1 = new double[8][7];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      EquationsMapper equationsMapper0 = new EquationsMapper((-1450), 1742);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[9];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      equationsMapperArray0[3] = equationsMapper0;
      equationsMapperArray0[4] = equationsMapper0;
      equationsMapperArray0[5] = equationsMapperArray0[0];
      equationsMapperArray0[6] = equationsMapper0;
      equationsMapperArray0[7] = equationsMapper0;
      equationsMapperArray0[8] = equationsMapper0;
      gillStepInterpolator0.reinitialize(dormandPrince54Integrator0, doubleArray0, doubleArray1, false, equationsMapper0, equationsMapperArray0);
      // Undeclared exception!
      try { 
        gillStepInterpolator0.getInterpolatedState();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GillStepInterpolator gillStepInterpolator0 = new GillStepInterpolator();
      double[] doubleArray0 = new double[9];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(193.4723851595201, (-210.48001681129), doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[8][8];
      EquationsMapper equationsMapper0 = new EquationsMapper(1827, 1827);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[5];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      equationsMapperArray0[3] = equationsMapper0;
      equationsMapperArray0[4] = equationsMapper0;
      gillStepInterpolator0.reinitialize(graggBulirschStoerIntegrator0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
      gillStepInterpolator0.previousState = doubleArray0;
      // Undeclared exception!
      try { 
        gillStepInterpolator0.computeInterpolatedStateAndDerivatives((-3.7999795083850525E-8), 2405.05);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GillStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GillStepInterpolator gillStepInterpolator0 = new GillStepInterpolator();
      double[] doubleArray0 = new double[3];
      gillStepInterpolator0.previousState = doubleArray0;
      // Undeclared exception!
      try { 
        gillStepInterpolator0.computeInterpolatedStateAndDerivatives((-3.7999795083850525E-8), 2405.05);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GillStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GillStepInterpolator gillStepInterpolator0 = new GillStepInterpolator();
      double[] doubleArray0 = new double[2];
      gillStepInterpolator0.previousState = doubleArray0;
      // Undeclared exception!
      try { 
        gillStepInterpolator0.getInterpolatedSecondaryState(3924);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GillStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GillStepInterpolator gillStepInterpolator0 = null;
      try {
        gillStepInterpolator0 = new GillStepInterpolator((GillStepInterpolator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", e);
      }
  }
}