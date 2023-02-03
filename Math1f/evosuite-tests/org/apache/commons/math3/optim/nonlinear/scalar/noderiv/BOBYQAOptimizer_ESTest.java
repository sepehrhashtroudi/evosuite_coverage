/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 02:28:37 GMT 2022
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BOBYQAOptimizer_ESTest extends BOBYQAOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(1214, 1214, 1214);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[5];
      double[] doubleArray0 = new double[2];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[1] = (OptimizationData) initialGuess0;
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of interpolation points (1,214)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(0, 0, (-3657.039774118));
      OptimizationData[] optimizationDataArray0 = new OptimizationData[2];
      double[] doubleArray0 = new double[5];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[1] = (OptimizationData) initialGuess0;
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of interpolation points (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(3224);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[5];
      double[] doubleArray0 = new double[1];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[3] = (OptimizationData) initialGuess0;
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer((-693));
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer", e);
      }
  }
}
