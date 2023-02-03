/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 02:30:53 GMT 2022
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CMAESOptimizer_ESTest extends CMAESOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CMAESOptimizer.PopulationSize cMAESOptimizer_PopulationSize0 = null;
      try {
        cMAESOptimizer_PopulationSize0 = new CMAESOptimizer.PopulationSize(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$PopulationSize", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.33999999999999997;
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer((-3664), (-3664), false, 2661, (-3664), mersenneTwister0, true, (ConvergenceChecker<PointValuePair>) null);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[3];
      double[] doubleArray0 = new double[2];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) initialGuess0;
      double[] doubleArray1 = new double[5];
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray1);
      optimizationDataArray0[1] = (OptimizationData) simpleBounds0;
      try { 
        cMAESOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 2
         //
         verifyException("org.apache.commons.math3.optim.BaseMultivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c(0L);
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker((-1571), 0L);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer((-1571), 0.006, false, (-1571), (-1571), well19937c0, false, simpleValueChecker0);
      // Undeclared exception!
      try { 
        cMAESOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
      double[] doubleArray1 = cMAESOptimizer_Sigma0.getSigma();
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(362, 0, 362);
      double[] doubleArray0 = new double[1];
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(362, 362, false, 362, 0, mersenneTwister0, false, simpleValueChecker0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[9];
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) cMAESOptimizer_Sigma0;
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[2] = (OptimizationData) initialGuess0;
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      optimizationDataArray0[3] = (OptimizationData) simpleBounds0;
      cMAESOptimizer0.parseOptimizationData(optimizationDataArray0);
      assertNull(cMAESOptimizer0.getGoalType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(362, 0, 362);
      double[] doubleArray0 = new double[1];
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(362, 362, false, 362, 0, mersenneTwister0, false, simpleValueChecker0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[9];
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) cMAESOptimizer_Sigma0;
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[2] = (OptimizationData) initialGuess0;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.parseOptimizationData(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a(0);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(0, (-2023.602680053507), false, 0, 0, well44497a0, false, (ConvergenceChecker<PointValuePair>) null);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[3];
      CMAESOptimizer.PopulationSize cMAESOptimizer_PopulationSize0 = new CMAESOptimizer.PopulationSize(2510);
      optimizationDataArray0[1] = (OptimizationData) cMAESOptimizer_PopulationSize0;
      cMAESOptimizer0.parseOptimizationData(optimizationDataArray0);
      assertNull(cMAESOptimizer0.getGoalType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CMAESOptimizer.PopulationSize cMAESOptimizer_PopulationSize0 = null;
      try {
        cMAESOptimizer_PopulationSize0 = new CMAESOptimizer.PopulationSize((-2879));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,879 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$PopulationSize", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-1169.1354);
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = null;
      try {
        cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,169.135 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$Sigma", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer((-2879), 1657.37102691, false, 1612, 1612, (RandomGenerator) null, false, (ConvergenceChecker<PointValuePair>) null);
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsMeanHistory();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(362, 0, 362);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(362, 362, false, 362, 0, mersenneTwister0, false, simpleValueChecker0);
      List<Double> list0 = cMAESOptimizer0.getStatisticsFitnessHistory();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[5];
      Well44497b well44497b0 = new Well44497b(intArray0);
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(2888.0, 832, 1);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(832, 832, true, 832, 832, well44497b0, true, simplePointChecker0);
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsDHistory();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(362, 0, 362);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(362, 362, false, 362, 0, mersenneTwister0, false, simpleValueChecker0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[9];
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(362, 0, 362);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(362, 362, false, 362, 0, mersenneTwister0, false, simpleValueChecker0);
      List<Double> list0 = cMAESOptimizer0.getStatisticsSigmaHistory();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CMAESOptimizer.PopulationSize cMAESOptimizer_PopulationSize0 = new CMAESOptimizer.PopulationSize(1663);
      int int0 = cMAESOptimizer_PopulationSize0.getPopulationSize();
      assertEquals(1663, int0);
  }
}
