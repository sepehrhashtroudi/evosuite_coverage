/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 02:26:58 GMT 2022
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PowellOptimizer_ESTest extends PowellOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(532.8595692, 0.0, (ConvergenceChecker<PointValuePair>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(0.0, (-2554.188));
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(0.0, 0.0, simpleValueChecker0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(1.883511811213715E-8, (-4.813899778443457E-9));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(0.0, 2087.24);
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(2.0, 0.0, 1863.77543469802, 1863.77543469802, simplePointChecker0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>((-3752.240108041333), (-1.0));
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer((-3752.240108041333), 1615.83, (-294.50577088), 0.0, simplePointChecker0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3,752.24 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker((-2554.5), 3302.8166);
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(3302.8166, 3302.8166, (-2554.5), 3302.8166, simpleValueChecker0);
      assertNull(powellOptimizer0.getGoalType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(1129.481537216669, 1129.481537216669, 1129.481537216669, 1129.481537216669);
      // Undeclared exception!
      try { 
        powellOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker((-6055.46567098989), 4.9E-324, 369);
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(6312.0, 351.3190022310522, simpleValueChecker0);
      assertNull(powellOptimizer0.getGoalType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(273.75, 273.75);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[1];
      double[] doubleArray0 = new double[3];
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) simpleBounds0;
      // Undeclared exception!
      try { 
        powellOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // constraint
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(212.35, 0.0, 0.0, 212.35);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(0.0, 0.0, (-48.58), 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(1.0, 1.0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[4];
      double[] doubleArray0 = new double[5];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[3] = (OptimizationData) initialGuess0;
      try { 
        powellOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback", e);
      }
  }
}