/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 00:51:05 GMT 2022
 */

package org.apache.commons.math3.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Asinh;
import org.apache.commons.math3.analysis.function.Exp;
import org.apache.commons.math3.analysis.function.Identity;
import org.apache.commons.math3.analysis.function.Log1p;
import org.apache.commons.math3.analysis.function.Sinc;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BrentSolver_ESTest extends BrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver((-1496.6217));
      Exp exp0 = new Exp();
      double double0 = brentSolver0.solve(444, (UnivariateFunction) exp0, (-1496.6217), 1718.1772506760283);
      assertEquals((-1496.6217), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Asinh asinh0 = new Asinh();
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.solve(3924, (UnivariateFunction) asinh0, (-0.5), 0.0);
      double double0 = brentSolver0.doSolve();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(6.778630971946519, 6.778630971946519, 6.778630971946519);
      Sinc sinc0 = new Sinc();
      brentSolver0.solve(653, (UnivariateFunction) sinc0, 6.778630971946519);
      double double0 = brentSolver0.doSolve();
      assertEquals(6.778630971946519, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(1969.8702687);
      Asinh asinh0 = new Asinh();
      brentSolver0.solve(3948, (UnivariateFunction) asinh0, (-47.917495710822266), (double) 3948);
      double double0 = brentSolver0.doSolve();
      assertEquals((-47.917495710822266), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      try { 
        brentSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Identity identity0 = new Identity();
      double double0 = brentSolver0.solve(934, (UnivariateFunction) identity0, (-1.9259152432186477), (double) 934);
      assertEquals(2.220446049250313E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Identity identity0 = new Identity();
      double double0 = brentSolver0.solve(968, (UnivariateFunction) identity0, (-1.0), (double) 968);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver((-1496.6217));
      Exp exp0 = new Exp();
      // Undeclared exception!
      try { 
        brentSolver0.solve(390, (UnivariateFunction) exp0, 2630.11292964844);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [\uFFFD, \uFFFD], values: [\uFFFD, \uFFFD]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver((-1496.6217));
      Exp exp0 = new Exp();
      double double0 = brentSolver0.solve(390, (UnivariateFunction) exp0, (-1496.6217));
      assertEquals((-1496.6217), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Identity identity0 = new Identity();
      double double0 = brentSolver0.solve(934, (UnivariateFunction) identity0, (-0.812408133803957), (double) 934);
      assertEquals((-1.1102230246251565E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(Double.NaN, Double.NaN, 0.0);
      Log1p log1p0 = new Log1p();
      double double0 = brentSolver0.solve(2686, (UnivariateFunction) log1p0, Double.NaN, 0.0, (double) (-1134));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(1.5631615647329739E-7, 1.5);
      assertEquals(0.0, brentSolver0.getStartValue(), 0.01);
  }
}
