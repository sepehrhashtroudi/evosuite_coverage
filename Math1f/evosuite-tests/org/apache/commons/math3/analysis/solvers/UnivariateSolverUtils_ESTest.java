/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 00:47:19 GMT 2022
 */

package org.apache.commons.math3.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Abs;
import org.apache.commons.math3.analysis.function.Acos;
import org.apache.commons.math3.analysis.function.Asinh;
import org.apache.commons.math3.analysis.function.Atanh;
import org.apache.commons.math3.analysis.function.Exp;
import org.apache.commons.math3.analysis.function.Expm1;
import org.apache.commons.math3.analysis.function.Floor;
import org.apache.commons.math3.analysis.function.Identity;
import org.apache.commons.math3.analysis.function.Logistic;
import org.apache.commons.math3.analysis.function.Logit;
import org.apache.commons.math3.analysis.function.Power;
import org.apache.commons.math3.analysis.function.Rint;
import org.apache.commons.math3.analysis.function.Signum;
import org.apache.commons.math3.analysis.function.Sinc;
import org.apache.commons.math3.analysis.function.Ulp;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math3.analysis.solvers.AllowedSolution;
import org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver;
import org.apache.commons.math3.analysis.solvers.IllinoisSolver;
import org.apache.commons.math3.analysis.solvers.PegasusSolver;
import org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnivariateSolverUtils_ESTest extends UnivariateSolverUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = UnivariateSolverUtils.isSequence((-1175.428895), 937.0, (-1607.291));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = UnivariateSolverUtils.isSequence((-41.6866), (-4683.313), (-4683.313));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Signum signum0 = new Signum();
      assertNotNull(signum0);
      
      boolean boolean0 = UnivariateSolverUtils.isBracketing(signum0, 0.0, 0.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = UnivariateSolverUtils.midpoint((-4683.313), 20.0);
      assertEquals((-2331.6565), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Asinh asinh0 = new Asinh();
      assertNotNull(asinh0);
      
      try { 
        UnivariateSolverUtils.bracket((UnivariateFunction) asinh0, 0.5, (-736.503714), (-736.503714), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sinc sinc0 = new Sinc(false);
      assertNotNull(sinc0);
      
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2640.8292214);
      assertNotNull(regulaFalsiSolver0);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2640.8292214, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, regulaFalsiSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01);
      
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      try { 
        UnivariateSolverUtils.forceSide(1275, sinc0, regulaFalsiSolver0, 0.8414709848078965, 1289.62911, 1289.62911, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of iterations=1,276, maximum iterations=1,275, initial=0.841, lower bound=1,289.629, upper bound=1,289.629, final a value=1,289.629, final b value=1,289.629, f(a)=0.001, f(b)=0.001
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Ulp ulp0 = new Ulp();
      assertNotNull(ulp0);
      
      double double0 = UnivariateSolverUtils.solve((UnivariateFunction) ulp0, 0.0, 56.845396030576, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Rint rint0 = new Rint();
      assertNotNull(rint0);
      
      double double0 = UnivariateSolverUtils.solve((UnivariateFunction) rint0, 0.0, 20.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      assertNotNull(sinc0);
      
      double double0 = UnivariateSolverUtils.solve((UnivariateFunction) sinc0, (-59.69026041820608), 827.1116747970965);
      assertEquals((-59.69026041820608), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = UnivariateSolverUtils.midpoint(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Atanh atanh0 = new Atanh();
      assertNotNull(atanh0);
      
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1910.67984), (-2586.719), (-531.705584958));
      assertNotNull(pegasusSolver0);
      assertEquals((-2586.719), pegasusSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals((-1910.67984), pegasusSolver0.getRelativeAccuracy(), 0.01);
      assertEquals((-531.705584958), pegasusSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01);
      
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = UnivariateSolverUtils.forceSide(2980, atanh0, pegasusSolver0, 0, 0.0, 3.141592653589793, allowedSolution0);
      assertEquals(0.0, double0, 0.01);
      assertEquals((-2586.719), pegasusSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals((-1910.67984), pegasusSolver0.getRelativeAccuracy(), 0.01);
      assertEquals((-531.705584958), pegasusSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      try { 
        UnivariateSolverUtils.verifySequence(10.0, (-2429.020478395019), (-2429.020478395019));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [10, -2,429.02]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      assertNotNull(sinc0);
      
      // Undeclared exception!
      try { 
        UnivariateSolverUtils.verifyBracketing(sinc0, 0.0, (-2741.715));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -2,741.715]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (-2156.662793023612);
      doubleArray0[2] = (-1622.0120629834);
      doubleArray0[3] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(5, doubleArray0.length);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, (-2156.662793023612), (-1622.0120629834), (-1.0), 0.0}, doubleArray0, 0.01);
      assertEquals(3, polynomialFunction0.degree());
      
      // Undeclared exception!
      UnivariateSolverUtils.solve((UnivariateFunction) polynomialFunction0, (-2156.662793023612), (-478.31), (-1622.0120629834));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Identity identity0 = new Identity();
      assertNotNull(identity0);
      
      // Undeclared exception!
      try { 
        UnivariateSolverUtils.solve((UnivariateFunction) identity0, 0.0, (-1023.201584), 1616.45);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -511.601]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      assertNotNull(expm1_0);
      
      // Undeclared exception!
      try { 
        UnivariateSolverUtils.solve((UnivariateFunction) expm1_0, 0.5, 0.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.5, 0.5]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      assertNotNull(sinc0);
      
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 20.0);
      assertNotNull(regulaFalsiSolver0);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(1.0E-15, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01);
      assertEquals(20.0, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.0, regulaFalsiSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01);
      
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        UnivariateSolverUtils.forceSide(124, sinc0, regulaFalsiSolver0, 0.0, (-855.5027742005853), 0.0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: convergence failed
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Ulp ulp0 = new Ulp();
      assertNotNull(ulp0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        UnivariateSolverUtils.forceSide(0, ulp0, (BracketedUnivariateSolver<UnivariateFunction>) null, (-1723.59864260808), (-1723.59864260808), (-1058.1), allowedSolution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Logit logit0 = new Logit(1792.1119555284, 0.0);
      assertNotNull(logit0);
      
      // Undeclared exception!
      try { 
        UnivariateSolverUtils.bracket((UnivariateFunction) logit0, 1792.1119555284, 0.0, Double.POSITIVE_INFINITY, 209);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1,791.112 out of [1,792.112, 0] range
         //
         verifyException("org.apache.commons.math3.analysis.function.Logit", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 3002.281457;
      doubleArray0[3] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(6, doubleArray0.length);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {3002.281457, 0.0, 0.0, 1.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(3, polynomialFunction0.degree());
      
      // Undeclared exception!
      UnivariateSolverUtils.bracket((UnivariateFunction) polynomialFunction0, 1.0, 0.0, 4133.9558708);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-702.0);
      doubleArray0[1] = (-961.421);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      assertEquals(3, doubleArray0.length);
      assertNotNull(polynomialFunctionLagrangeForm0);
      assertArrayEquals(new double[] {(-702.0), (-961.421), 0.0}, doubleArray0, 0.01);
      assertEquals(2, polynomialFunctionLagrangeForm0.degree());
      
      UnivariateSolverUtils.verifyBracketing(polynomialFunctionLagrangeForm0, 0.0, 0.5);
      assertEquals(3, doubleArray0.length);
      assertArrayEquals(new double[] {(-702.0), (-961.421), 0.0}, doubleArray0, 0.01);
      assertEquals(2, polynomialFunctionLagrangeForm0.degree());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UnivariateSolverUtils.verifyInterval(0.5, 94.0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      try { 
        UnivariateSolverUtils.verifyInterval(0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Power power0 = new Power(10.0);
      assertNotNull(power0);
      
      boolean boolean0 = UnivariateSolverUtils.isBracketing(power0, 10.0, 0.5);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Rint rint0 = new Rint();
      assertNotNull(rint0);
      
      boolean boolean0 = UnivariateSolverUtils.isBracketing(rint0, (-169.175), 5668.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      try { 
        UnivariateSolverUtils.bracket((UnivariateFunction) null, 1668.3426, 1668.3426, 1668.3426, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UnivariateSolverUtils.verifySequence((-2421.663287609599), Double.NaN, 0.0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      try { 
        UnivariateSolverUtils.verifyBracketing((UnivariateFunction) null, 2.0, 2094.7649445681413);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = UnivariateSolverUtils.isSequence((-837.141538), 10.0, 10.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = UnivariateSolverUtils.isSequence((-2652.0465), (-41.6866), 165.58512627);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = UnivariateSolverUtils.isSequence((-990.7633353281188), (-990.7633353281188), (-990.7633353281188));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Rint rint0 = new Rint();
      assertNotNull(rint0);
      
      boolean boolean0 = UnivariateSolverUtils.isBracketing(rint0, (-347.041), (-1041.3));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Ulp ulp0 = new Ulp();
      assertNotNull(ulp0);
      
      try { 
        UnivariateSolverUtils.verifyBracketing(ulp0, (-270.6051100952136), 1701.13154648361);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-270.605, 1,701.132], values: [0, 0]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Logistic logistic0 = new Logistic((-262.82), 630.055, 120.0, (-262.82), 0.0, 1193.5904799633038);
      assertNotNull(logistic0);
      
      boolean boolean0 = UnivariateSolverUtils.isBracketing(logistic0, 120.0, 1193.5904799633038);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      try { 
        UnivariateSolverUtils.isBracketing((UnivariateFunction) null, 1.7270287031459572E-134, 0.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 3002.281457;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(6, doubleArray0.length);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {3002.281457, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      
      try { 
        UnivariateSolverUtils.bracket((UnivariateFunction) polynomialFunction0, 1.0, 0.0, 4133.9558708);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of iterations=4,133, maximum iterations=2,147,483,647, initial=1, lower bound=0, upper bound=4,133.956, final a value=0, final b value=4,133.956, f(a)=3,002.281, f(b)=3,002.281
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Logistic logistic0 = new Logistic((-262.82), 630.055, 120.0, (-262.82), 0.0, 1193.5904799633038);
      assertNotNull(logistic0);
      
      double[] doubleArray0 = UnivariateSolverUtils.bracket((UnivariateFunction) logistic0, 0.5, (-629.045714011), 1193.5904799633038, 52);
      assertEquals(2, doubleArray0.length);
      assertNotNull(doubleArray0);
      assertArrayEquals(new double[] {(-0.5), 1.5}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Floor floor0 = new Floor();
      assertNotNull(floor0);
      
      try { 
        UnivariateSolverUtils.bracket((UnivariateFunction) floor0, 1.0, 1.0, 1.0, (-952));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -952
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Abs abs0 = new Abs();
      assertNotNull(abs0);
      
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      assertNotNull(pegasusSolver0);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01);
      
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      try { 
        UnivariateSolverUtils.forceSide(42, abs0, pegasusSolver0, 2466.657, (-1.0), 756.50501, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of iterations=42, maximum iterations=42, initial=2,466.657, lower bound=-1, upper bound=756.505, final a value=2,466.657, final b value=756.505, f(a)=2,466.657, f(b)=756.505
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Atanh atanh0 = new Atanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1910.67984), (-2586.719), (-531.705584958));
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      try { 
        UnivariateSolverUtils.forceSide(2980, atanh0, pegasusSolver0, 76.9055, 0.0, 3.141592653589793, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of iterations=2,980, maximum iterations=2,980, initial=76.906, lower bound=0, upper bound=3.142, final a value=0, final b value=3.142, f(a)=0, f(b)=\uFFFD
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 20.0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        UnivariateSolverUtils.forceSide(124, sinc0, regulaFalsiSolver0, 0.0, (-846.0), (-37.48626297072842), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-20, -37.486]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Exp exp0 = new Exp();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(931.41007, (-1052.62468));
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = UnivariateSolverUtils.forceSide(252, exp0, illinoisSolver0, 404.0, 0.0, 0.0, allowedSolution0);
      assertEquals(404.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 20.0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = UnivariateSolverUtils.forceSide(124, sinc0, regulaFalsiSolver0, 0.0, (-846.0), 0.0, allowedSolution0);
      assertEquals((-60.0), regulaFalsiSolver0.getMin(), 0.01);
      assertEquals((-59.69026041820608), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      try { 
        UnivariateSolverUtils.solve((UnivariateFunction) null, (-429.81), 0.5, 0.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      try { 
        UnivariateSolverUtils.solve((UnivariateFunction) null, (-1.0), (-2186.79));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateSolverUtils.solve((UnivariateFunction) polynomialFunction0, 118.0, 897.64097816496);
      assertEquals(507.82048908248, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double double0 = UnivariateSolverUtils.midpoint(642.4557941279928, 642.4557941279928);
      assertEquals(642.4557941279928, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Acos acos0 = new Acos();
      // Undeclared exception!
      try { 
        UnivariateSolverUtils.bracket((UnivariateFunction) acos0, 0.0, 0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }
}
