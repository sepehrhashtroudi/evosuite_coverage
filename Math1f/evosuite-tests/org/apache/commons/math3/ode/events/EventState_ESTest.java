/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 22:24:31 GMT 2022
 */

package org.apache.commons.math3.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.analysis.solvers.IllinoisSolver;
import org.apache.commons.math3.analysis.solvers.MullerSolver;
import org.apache.commons.math3.analysis.solvers.MullerSolver2;
import org.apache.commons.math3.analysis.solvers.RiddersSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.EventState;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EventState_ESTest extends EventState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(1469.8789028).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver mullerSolver0 = new MullerSolver((-799), (-799));
      EventState eventState0 = new EventState(eventFilter0, (-2651.7), (-2651.7), (-799), mullerSolver0);
      double[] doubleArray0 = new double[8];
      eventFilter0.init(0.0, doubleArray0, 0.0);
      eventState0.stepAccepted((-799), doubleArray0);
      assertEquals(Double.NEGATIVE_INFINITY, eventState0.getEventTime(), 0.01);
      assertEquals((-2651.7), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals((-799), eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-631.6825006));
      EventState eventState0 = new EventState(eventFilter0, (-631.6825006), (-631.6825006), (-241), illinoisSolver0);
      NordsieckStepInterpolator nordsieckStepInterpolator0 = new NordsieckStepInterpolator();
      // Undeclared exception!
      try { 
        eventState0.evaluateStep(nordsieckStepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.events.EventState", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver mullerSolver0 = new MullerSolver(0.0, 0);
      EventState eventState0 = new EventState(eventFilter0, 0.5, 0.5, 0, mullerSolver0);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(Double.NEGATIVE_INFINITY, eventState0.getEventTime(), 0.01);
      assertEquals(0.5, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      EventState eventState0 = new EventState((EventHandler) null, (-552.4632098930522), (-552.4632098930522), 259, mullerSolver0);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(Double.NEGATIVE_INFINITY, eventState0.getEventTime(), 0.01);
      assertEquals(259, int0);
      assertEquals((-552.4632098930522), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 0.0, 1660, bracketingNthOrderBrentSolver0);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(0.0, double0, 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, eventState0.getEventTime(), 0.01);
      assertEquals(1660, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver((-1535.64), 0.0);
      EventState eventState0 = new EventState((EventHandler) null, (-1535.64), (-1535.64), (-1653), brentSolver0);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(Double.NEGATIVE_INFINITY, eventState0.getEventTime(), 0.01);
      assertEquals((-1535.64), double0, 0.01);
      assertEquals((-1653), eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 0.0, 1660, bracketingNthOrderBrentSolver0);
      eventState0.getEventHandler();
      assertEquals(1660, eventState0.getMaxIterationCount());
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver((-1097.32211245), (-3232.02208));
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 0.0, 0, riddersSolver0);
      double double0 = eventState0.getConvergence();
      assertEquals(0, eventState0.getMaxIterationCount());
      assertEquals(Double.NEGATIVE_INFINITY, eventState0.getEventTime(), 0.01);
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-112.024955618), 0.0);
      EventState eventState0 = new EventState((EventHandler) null, 0.0, Double.POSITIVE_INFINITY, (-1026), illinoisSolver0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        eventState0.stepAccepted(1180.401403, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.events.EventState", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 0.0, 1660, bracketingNthOrderBrentSolver0);
      NordsieckStepInterpolator nordsieckStepInterpolator0 = new NordsieckStepInterpolator();
      // Undeclared exception!
      try { 
        eventState0.reinitializeBegin(nordsieckStepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.events.EventState", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      double[] doubleArray0 = new double[1];
      EventState eventState0 = new EventState(eventFilter0, 2279.83276011959, 2279.83276011959, 183, mullerSolver2_0);
      boolean boolean0 = eventState0.reset(Double.NaN, doubleArray0);
      assertEquals(2279.83276011959, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, eventState0.getEventTime(), 0.01);
      assertFalse(boolean0);
      assertEquals(183, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2((-64), (-64));
      EventState eventState0 = new EventState(eventFilter0, 0.0, 0.0, (-64), mullerSolver2_0);
      boolean boolean0 = eventState0.stop();
      assertEquals(Double.NEGATIVE_INFINITY, eventState0.getEventTime(), 0.01);
      assertEquals((-64), eventState0.getMaxIterationCount());
      assertFalse(boolean0);
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-231.899612)).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver mullerSolver0 = new MullerSolver((-799), (-799));
      EventState eventState0 = new EventState(eventFilter0, (-2651.7), (-2651.7), (-799), mullerSolver0);
      double[] doubleArray0 = new double[8];
      eventFilter0.init(0.0, doubleArray0, 0.0);
      eventState0.stepAccepted((-799), doubleArray0);
      assertEquals((-2651.7), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, eventState0.getEventTime(), 0.01);
      assertEquals((-799), eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      double[] doubleArray0 = new double[1];
      eventFilter0.init(2279.83276011959, doubleArray0, 2279.83276011959);
      EventState eventState0 = new EventState(eventFilter0, 2279.83276011959, 2279.83276011959, 183, mullerSolver2_0);
      eventState0.stepAccepted(Double.NaN, doubleArray0);
      assertEquals(183, eventState0.getMaxIterationCount());
      assertEquals(Double.NEGATIVE_INFINITY, eventState0.getEventTime(), 0.01);
      assertEquals(2279.83276011959, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      EventState eventState0 = new EventState(eventFilter0, 2279.83276011959, 2279.83276011959, 183, mullerSolver2_0);
      double double0 = eventState0.getEventTime();
      assertEquals(183, eventState0.getMaxIterationCount());
      assertEquals(2279.83276011959, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver mullerSolver0 = new MullerSolver((-799), (-799));
      EventState eventState0 = new EventState(eventFilter0, (-2651.7), (-2651.7), (-799), mullerSolver0);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals((-2651.7), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals((-799), int0);
      assertEquals(Double.NEGATIVE_INFINITY, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-631.6825006));
      EventState eventState0 = new EventState(eventFilter0, (-631.6825006), (-631.6825006), (-241), illinoisSolver0);
      eventState0.getEventHandler();
      assertEquals((-631.6825006), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, eventState0.getEventTime(), 0.01);
      assertEquals((-241), eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      EventState eventState0 = new EventState(eventFilter0, 2279.83276011959, 2279.83276011959, 183, mullerSolver2_0);
      double double0 = eventState0.getConvergence();
      assertEquals(2279.83276011959, double0, 0.01);
      assertEquals(183, eventState0.getMaxIterationCount());
      assertEquals(Double.NEGATIVE_INFINITY, eventState0.getEventTime(), 0.01);
      assertEquals(2279.83276011959, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      EventState eventState0 = new EventState(eventFilter0, 2279.83276011959, 2279.83276011959, 183, mullerSolver2_0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      eventState0.setExpandable(expandableStatefulODE0);
      NordsieckStepInterpolator nordsieckStepInterpolator0 = new NordsieckStepInterpolator();
      // Undeclared exception!
      try { 
        eventState0.reinitializeBegin(nordsieckStepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      EventState eventState0 = new EventState(eventFilter0, 2279.83276011959, 2279.83276011959, 183, mullerSolver2_0);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(2279.83276011959, double0, 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, eventState0.getEventTime(), 0.01);
      assertEquals(183, eventState0.getMaxIterationCount());
  }
}
