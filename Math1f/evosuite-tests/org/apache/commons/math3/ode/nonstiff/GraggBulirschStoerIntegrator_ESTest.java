/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 22:45:39 GMT 2022
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math3.analysis.solvers.BisectionSolver;
import org.apache.commons.math3.analysis.solvers.MullerSolver;
import org.apache.commons.math3.analysis.solvers.SecantSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.EquationsMapper;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerBounds;
import org.apache.commons.math3.ode.sampling.StepNormalizerMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GraggBulirschStoerIntegrator_ESTest extends GraggBulirschStoerIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 925.94621984785);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.addStepHandler(dummyStepHandler0);
      int int0 = (-4297);
      double double0 = 999.9;
      graggBulirschStoerIntegrator0.setOrderControl((-4297), 999.9, 885.543131272104);
      boolean boolean0 = true;
      int int1 = 1655;
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-4297), 1655, 0.11111095942313305);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      SecantSolver secantSolver0 = new SecantSolver((-4297), 1.2653534412384033);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 999.9, 0.0, (-4297), (UnivariateSolver) secantSolver0);
      graggBulirschStoerIntegrator0.setOrderControl((-4297), 0.11111095942313305, 0.0);
      EventFilter eventFilter1 = new EventFilter(eventFilter0, filterType0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.2653534412384033;
      doubleArray0[1] = 1.2653534412384033;
      doubleArray0[2] = (double) (-4297);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1.2653534412384033;
      doubleArray0[5] = 0.0;
      PolynomialSplineFunction polynomialSplineFunction0 = null;
      try {
        polynomialSplineFunction0 = new PolynomialSplineFunction(doubleArray0, (PolynomialFunction[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 999.9;
      doubleArray0[1] = 999.9;
      doubleArray0[2] = 999.9;
      doubleArray0[3] = (-1725.3282803);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(999.9, (-1725.3282803), doubleArray0, doubleArray0);
      double double0 = (-217.005);
      double double1 = 1.3142988156905172E207;
      graggBulirschStoerIntegrator0.setControlFactors((-1725.3282803), (-217.005), 1.3142988156905172E207, 999.9);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.getCompleteState();
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 999.9);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 4
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-1.0);
      doubleArray0[5] = 1.5707963267948966;
      doubleArray0[6] = (-1.0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-1.0), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors((-1.0), 1.133148431777954, (-1.0), 1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1627.4884715), (-1627.4884715), (-1627.4884715), (-1627.4884715));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1627.4884715);
      doubleArray0[1] = (-1627.4884715);
      graggBulirschStoerIntegrator0.vecRelativeTolerance = doubleArray0;
      graggBulirschStoerIntegrator0.setOrderControl((-150), (-2.260957518848075E-281), (-2972.5139661199937));
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) null, (-2.260957518848075E-281), (-2.260957518848075E-281), (-243));
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) null, (double) (-150), (-2.260957518848075E-281), 0, (UnivariateSolver) null);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.INCREMENT;
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.LAST;
      StepNormalizer stepNormalizer0 = new StepNormalizer(7.374944406615125E-186, fixedStepHandler0, stepNormalizerMode0, stepNormalizerBounds0);
      stepNormalizer0.init((-1627.4884715), doubleArray0, 0.0);
      stepNormalizer0.init((-1627.4884715), doubleArray0, 187.970988);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, (-243));
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) null, 836.0521586463, 4872.393171441869, 0, (UnivariateSolver) null);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 4, 526, (-1627.4884715));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-1627.4884715));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 2
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = 1.7976931348623157E308;
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.7976931348623157E308, (-1870.2), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.getTotalDimension();
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-1870.2));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = 4.809072216941908E-8;
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(956.73316162738, 4.809072216941908E-8, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.vecRelativeTolerance = doubleArray0;
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.getCompleteState();
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 4.809072216941908E-8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1964.9140866306), 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 4);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(18.91, 0.0, 8.48292035519895E-10, (-1242.64392273));
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.mainSetDimension = (-215);
      doubleArray0[0] = (-1242.64392273);
      graggBulirschStoerIntegrator0.vecAbsoluteTolerance = doubleArray0;
      graggBulirschStoerIntegrator0.scalAbsoluteTolerance = 18.91;
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((ExpandableStatefulODE) null, (-1242.64392273));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = 1.5458080768585205;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = null;
      try {
        graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.5458080768585205, 1.5458080768585205, (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = 1.0001;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 1.0001, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      boolean boolean0 = false;
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 0);
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 1.0001;
      doubleArray0[2] = 1.0001;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = 1.0001;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = (double) 0;
      expandableStatefulODE0.computeDerivatives(0.0, doubleArray0, doubleArray0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(70.6751602608262, 70.6751602608262, 0.0, 70.6751602608262);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, (-2275.3907121));
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.LAST;
      StepNormalizer stepNormalizer0 = new StepNormalizer(2858.3259326, fixedStepHandler0, stepNormalizerBounds0);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 0, 0, (-2275.3907121));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1239.825535396), (-1239.825535396), 1702.454102, (-8.939932297357388E-58));
      graggBulirschStoerIntegrator0.setControlFactors(0.0, 0.0, 1.0, 1257.8274172474921);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setMaxEvaluations(3135);
      graggBulirschStoerIntegrator0.setControlFactors(0.0, 615.0, 1631.11, 0.0);
      graggBulirschStoerIntegrator0.setControlFactors(742.0, 0.0, 742.0, 0.8);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.addStepHandler(dummyStepHandler0);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 3135);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-599.34), 0.6, 0.0, (-241.5421247408));
      graggBulirschStoerIntegrator0.getStepHandlers();
      graggBulirschStoerIntegrator0.clearStepHandlers();
      graggBulirschStoerIntegrator0.clearStepHandlers();
      graggBulirschStoerIntegrator0.scalRelativeTolerance = 1923.701;
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 4451);
      graggBulirschStoerIntegrator0.setControlFactors(0.6, 1923.701, (-1648.0), (-1648.0));
      graggBulirschStoerIntegrator0.setOrderControl((-3036), 1.4043786616805493E-54, 0.0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = 0.0;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(940.00650656, 5.900393284617182E-8, 5.900393284617182E-8, 0.0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      int int0 = 0;
      BisectionSolver bisectionSolver0 = new BisectionSolver((-354.0279), 0.0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 0.0, 0, (UnivariateSolver) bisectionSolver0);
      double double1 = (-992.0599);
      graggBulirschStoerIntegrator0.setControlFactors((-354.0279), (-992.0599), (-354.0279), (-536.7318251));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 4.980100072851796E-153);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, (-1.2116165315442256E-158), (-1.2116165315442256E-158));
      graggBulirschStoerIntegrator0.filterStep(0.0, true, true);
      graggBulirschStoerIntegrator0.setStepSizeControl(0.0, (-1069.0834413505677), 0.0, (-1.2116165315442256E-158));
      graggBulirschStoerIntegrator0.getStepHandlers();
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.INCREMENT;
      StepNormalizer stepNormalizer0 = new StepNormalizer(0.0, fixedStepHandler0, stepNormalizerMode0);
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-3448.01);
      doubleArray0[1] = (-1539.324638);
      doubleArray0[2] = (-1.2116165315442256E-158);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      stepNormalizer0.init((-3448.01), doubleArray0, 1406.203);
      graggBulirschStoerStepInterpolator0.storeTime((-1539.324638));
      // Undeclared exception!
      try { 
        stepNormalizer0.handleStep(graggBulirschStoerStepInterpolator0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = 1.426849365234375;
      double double1 = 0.0;
      double double2 = (-468.26077241);
      double double3 = 1631.512002;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.426849365234375, 0.0, (-468.26077241), 1631.512002);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.sanityChecks(expandableStatefulODE0, 1631.512002);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter1 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter1);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE1, 1631.512002);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double double0 = 0.9;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.9, 0.0, 0.0, 0.9);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 2.516456127166748;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.516456127166748, 2.516456127166748, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(475, 2.516456127166748, (-3.807794163054899E-8));
      assertEquals(2.516456127166748, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = 1467.1825817537458;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1467.1825817537458, 1467.1825817537458, 1467.1825817537458, 1467.1825817537458);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.sanityChecks(expandableStatefulODE0, 0.0);
      int int0 = 50;
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 50, 50, 1467.1825817537458);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(1467.1825817537458, fixedStepHandler0);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator0.setOrderControl(50, 1467.1825817537458, 1467.1825817537458);
      int int1 = 3;
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 50, 3, 50);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      double double1 = 0.01;
      MullerSolver mullerSolver0 = new MullerSolver(1.0E-10);
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = null;
      try {
        graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator(graggBulirschStoerStepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setOrderControl((-852), 0.3956514596939087, 0.3956514596939087);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double double0 = 1153.709;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2259.232487989), (-2259.232487989), (-2259.232487989), 1153.709);
      int int0 = (-953);
      int int1 = 3021;
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-953), 3021, 1.1910135746002197);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 3021);
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.resetInternalState();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1.1910135746002197);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double double0 = 2.147161515775941E-8;
      double[] doubleArray0 = new double[2];
      double double1 = 942.46;
      doubleArray0[0] = 942.46;
      doubleArray0[1] = 2.147161515775941E-8;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.147161515775941E-8, 2.147161515775941E-8, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.getEventHandlers();
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.FIRST;
      StepNormalizer stepNormalizer0 = new StepNormalizer(942.46, fixedStepHandler0, stepNormalizerBounds0);
      double[][] doubleArray1 = new double[6][5];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      boolean boolean0 = false;
      int int0 = 0;
      EquationsMapper equationsMapper0 = new EquationsMapper(0, 0);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[3];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      try { 
        equationsMapper0.insertEquationData(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 0
         //
         verifyException("org.apache.commons.math3.ode.EquationsMapper", e);
      }
  }
}
