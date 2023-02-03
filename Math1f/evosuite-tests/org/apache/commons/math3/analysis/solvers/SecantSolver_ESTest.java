/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 00:41:46 GMT 2022
 */

package org.apache.commons.math3.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Cos;
import org.apache.commons.math3.analysis.function.Gaussian;
import org.apache.commons.math3.analysis.function.Inverse;
import org.apache.commons.math3.analysis.function.Sigmoid;
import org.apache.commons.math3.analysis.function.Signum;
import org.apache.commons.math3.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SecantSolver_ESTest extends SecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(0.0);
      Sigmoid sigmoid0 = new Sigmoid(1.0, (-1.0));
      try { 
        secantSolver0.solve(2419, (UnivariateFunction) sigmoid0, (-1421.0), 1.0, 2337.2312893);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (2,419) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      Gaussian gaussian0 = new Gaussian();
      secantSolver0.setup(3397, gaussian0, (-846.5242603), 3397, (-846.5242603));
      double double0 = secantSolver0.doSolve();
      assertEquals((-846.5242603), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(0.0);
      Sigmoid sigmoid0 = new Sigmoid(1.0, (-1.0));
      secantSolver0.solve(2419, (UnivariateFunction) sigmoid0, (-1.0), 1.0, 2337.2312893);
      double double0 = secantSolver0.doSolve();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      try { 
        secantSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      Cos cos0 = new Cos();
      double double0 = secantSolver0.solve(21, (UnivariateFunction) cos0, 0.0, (double) 21, (-2.8067789530744847));
      assertEquals(17.278759594743864, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(0.0);
      Sigmoid sigmoid0 = new Sigmoid(1.0, (-1.917346940931293));
      secantSolver0.solve(2419, (UnivariateFunction) sigmoid0, (-1.917346940931293), 1.0, 2337.2312893);
      double double0 = secantSolver0.doSolve();
      assertEquals((-0.650942428873205), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(0.0);
      Sigmoid sigmoid0 = new Sigmoid(1.2264227867126465, (-1.0));
      double double0 = secantSolver0.solve(2419, (UnivariateFunction) sigmoid0, (-1.0), 1.2264227867126465, 2337.2312893);
      assertEquals(0.20410162856646433, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      Gaussian gaussian0 = new Gaussian();
      double double0 = secantSolver0.solve(3409, (UnivariateFunction) gaussian0, 0.0, 531.7999689963334, 531.7999689963334);
      assertEquals(531.7999689963334, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      Gaussian gaussian0 = new Gaussian();
      secantSolver0.setup(3409, gaussian0, 3409, 3409, 3409);
      double double0 = secantSolver0.doSolve();
      assertEquals(3409.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver((-3717.0), (-3717.0));
      Signum signum0 = new Signum();
      secantSolver0.setup(5, signum0, 766.9376569685, 766.9376569685, 1641.7292749213989);
      // Undeclared exception!
      try { 
        secantSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [766.938, 766.938]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver((-4735.964442653054));
      Inverse inverse0 = new Inverse();
      secantSolver0.setup(120, inverse0, (-1675), (-438.0), 0.0);
      try { 
        secantSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1,675, -438], values: [-0.001, -0.002]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }
}
