/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 00:48:47 GMT 2022
 */

package org.apache.commons.math3.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Acosh;
import org.apache.commons.math3.analysis.function.Atanh;
import org.apache.commons.math3.analysis.function.Ceil;
import org.apache.commons.math3.analysis.function.Cos;
import org.apache.commons.math3.analysis.function.Gaussian;
import org.apache.commons.math3.analysis.function.HarmonicOscillator;
import org.apache.commons.math3.analysis.function.Identity;
import org.apache.commons.math3.analysis.function.Log10;
import org.apache.commons.math3.analysis.function.Rint;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.analysis.function.Tan;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.analysis.solvers.AllowedSolution;
import org.apache.commons.math3.analysis.solvers.IllinoisSolver;
import org.apache.commons.math3.analysis.solvers.PegasusSolver;
import org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2, (UnivariateFunction) ceil0, 0.0, 1.0E-6, allowedSolution0);
      assertEquals(5.0E-7, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-583.6349));
      Gaussian gaussian0 = new Gaussian();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(481, (UnivariateFunction) gaussian0, 0.0, (double) 481, 3439.63103583261, allowedSolution0);
      assertEquals(3439.63103583261, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(481.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3230.7220488639014), (-2216.43563053826));
      Sin sin0 = new Sin();
      double double0 = pegasusSolver0.solve(156, (UnivariateFunction) sin0, 0.0, 0.0, (-2216.43563053826));
      assertEquals((-2216.43563053826), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-583.6349));
      Gaussian gaussian0 = new Gaussian();
      double double0 = illinoisSolver0.solve(481, (UnivariateFunction) gaussian0, (-583.6349), 0.0, (-583.6349));
      assertEquals((-583.6349), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-583.6349), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-90), (-2870.75680067));
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      illinoisSolver0.solve(1974, (UnivariateFunction) polynomialFunction0, 0.0, (-2485.8229), 5.413787584811744E-15, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(5.413787584811744E-15, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(661.15893, Double.NaN, 661.15893);
      Rint rint0 = new Rint();
      illinoisSolver0.solve(453, (UnivariateFunction) rint0, (double) (-3224), 661.15893, 3895.404419922);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(3895.404419922, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.13188940025747797, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 3503.0, (-657.34925813343));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-3789.7), (-374.9997517754301), 1.0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(233, (UnivariateFunction) harmonicOscillator0, 3503.0, 0.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,503, 0]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2655.25648202);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2, (UnivariateFunction) null, 2655.25648202, (double) 2, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(4, (UnivariateFunction) tan0, 4.0, 1830.5910000000001, 419.0724277, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (4) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Identity identity0 = new Identity();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2, (UnivariateFunction) identity0, (double) 2, 0.5, 0.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2, 0.5]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(4803.20451964, (-868.28757822143));
      Acosh acosh0 = new Acosh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(229, (UnivariateFunction) acosh0, (double) 0, 215.1349, (double) 229, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 215.135], values: [\uFFFD, 6.064]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2609.3455327142, 2609.3455327142);
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-2895), (UnivariateFunction) polynomialFunction0, Double.POSITIVE_INFINITY, 0.0, 2609.3455327142);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,895) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0, 1.0E-6);
      Ceil ceil0 = new Ceil();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1164, (UnivariateFunction) ceil0, (double) 1164, 1.0, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,164, 1]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(3, (UnivariateFunction) null, (double) 3, (-1.0), 6.283185307179586);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cos cos0 = new Cos();
      illinoisSolver0.setup(4, cos0, 4, 1.0E-14, 0.0);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [4, 0]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-320.598625312636));
      Atanh atanh0 = new Atanh();
      pegasusSolver0.setup(25, atanh0, 25, 188.82743224737064, 2044.98);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [25, 188.827], values: [\uFFFD, \uFFFD]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1644.086079807015);
      Sin sin0 = new Sin();
      double double0 = illinoisSolver0.solve(1986829644, (UnivariateFunction) sin0, 1.0, 1644.086079807015, (double) 1986829644);
      assertEquals(1644.086079807015, illinoisSolver0.getMax(), 0.01);
      assertEquals(814.1211347125026, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 4;
      doubleArray0[1] = (double) 4;
      doubleArray0[3] = (double) 4;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(547, (UnivariateFunction) polynomialFunction0, (-3.141592653589793), 2876.829011698466, allowedSolution0);
      assertEquals(1436.8437095224378, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-0.6823278038280193), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 4;
      doubleArray0[2] = (-3.141592653589793);
      doubleArray0[3] = (double) 4;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(547, (UnivariateFunction) polynomialFunction0, (-3.141592653589793), 2876.829011698466, allowedSolution0);
      assertEquals(1436.8437095224378, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-0.7953651764007592), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (double) 4;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(547, (UnivariateFunction) polynomialFunction0, (-3.141592653589793), 2876.829011698466, allowedSolution0);
      assertEquals(1436.8437095224378, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-5.286585283291802E-6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(5, (UnivariateFunction) log10_0, 1.0E-6, (double) 5, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (5) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(650, (UnivariateFunction) tan0, (-696.69350529), (double) 5, 290.4, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(290.4, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-554.4911037680065), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0E-15, 1.0E-6, (-681.34199272065));
      Gaussian gaussian0 = new Gaussian(3064, (-1492.1134), 0.5);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(3064, (UnivariateFunction) gaussian0, (double) 3064, 0.0, allowedSolution0);
      assertEquals(3064.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(3064.0, double0, 0.01);
  }
}
