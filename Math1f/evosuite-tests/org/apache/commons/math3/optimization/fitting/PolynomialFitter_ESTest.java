/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:45:55 GMT 2022
 */

package org.apache.commons.math3.optimization.fitting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.apache.commons.math3.optimization.fitting.PolynomialFitter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolynomialFitter_ESTest extends PolynomialFitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      PointVectorValuePair pointVectorValuePair0 = mock(PointVectorValuePair.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(pointVectorValuePair0).getPointRef();
      PointVectorValuePair pointVectorValuePair1 = mock(PointVectorValuePair.class, new ViolatedAssumptionAnswer());
      doReturn((double[]) null).when(pointVectorValuePair1).getPointRef();
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(pointVectorValuePair0, pointVectorValuePair1).when(differentiableMultivariateVectorOptimizer0).optimize(anyInt() , any(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      PolynomialFitter polynomialFitter0 = new PolynomialFitter(differentiableMultivariateVectorOptimizer0);
      polynomialFitter0.fit();
      double[] doubleArray1 = new double[9];
      double[] doubleArray2 = polynomialFitter0.fit(doubleArray1);
      assertNull(doubleArray2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PointVectorValuePair pointVectorValuePair0 = mock(PointVectorValuePair.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(pointVectorValuePair0).getPointRef();
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(pointVectorValuePair0).when(differentiableMultivariateVectorOptimizer0).optimize(anyInt() , any(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      PolynomialFitter polynomialFitter0 = new PolynomialFitter(differentiableMultivariateVectorOptimizer0);
      double[] doubleArray1 = polynomialFitter0.fit(doubleArray0);
      assertSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      PointVectorValuePair pointVectorValuePair0 = mock(PointVectorValuePair.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(pointVectorValuePair0).getPointRef();
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(pointVectorValuePair0).when(differentiableMultivariateVectorOptimizer0).optimize(anyInt() , any(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      PolynomialFitter polynomialFitter0 = new PolynomialFitter(differentiableMultivariateVectorOptimizer0);
      double[] doubleArray1 = new double[9];
      double[] doubleArray2 = polynomialFitter0.fit(doubleArray1);
      assertArrayEquals(new double[] {}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PointVectorValuePair pointVectorValuePair0 = mock(PointVectorValuePair.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(pointVectorValuePair0).getPointRef();
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(pointVectorValuePair0).when(differentiableMultivariateVectorOptimizer0).optimize(anyInt() , any(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      PolynomialFitter polynomialFitter0 = new PolynomialFitter((-2007), differentiableMultivariateVectorOptimizer0);
      double[] doubleArray1 = polynomialFitter0.fit((-2007), doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      PointVectorValuePair pointVectorValuePair0 = mock(PointVectorValuePair.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(pointVectorValuePair0).getPointRef();
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(pointVectorValuePair0).when(differentiableMultivariateVectorOptimizer0).optimize(anyInt() , any(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      PolynomialFitter polynomialFitter0 = new PolynomialFitter((-2007), differentiableMultivariateVectorOptimizer0);
      double[] doubleArray1 = new double[15];
      double[] doubleArray2 = polynomialFitter0.fit((-2007), doubleArray1);
      assertSame(doubleArray0, doubleArray2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PointVectorValuePair pointVectorValuePair0 = mock(PointVectorValuePair.class, new ViolatedAssumptionAnswer());
      doReturn((double[]) null).when(pointVectorValuePair0).getPointRef();
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(pointVectorValuePair0).when(differentiableMultivariateVectorOptimizer0).optimize(anyInt() , any(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      PolynomialFitter polynomialFitter0 = new PolynomialFitter(differentiableMultivariateVectorOptimizer0);
      double[] doubleArray0 = polynomialFitter0.fit();
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      PointVectorValuePair pointVectorValuePair0 = mock(PointVectorValuePair.class, new ViolatedAssumptionAnswer());
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn((PointVectorValuePair) null).when(differentiableMultivariateVectorOptimizer0).optimize(anyInt() , any(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      PolynomialFitter polynomialFitter0 = new PolynomialFitter(differentiableMultivariateVectorOptimizer0);
      // Undeclared exception!
      try { 
        polynomialFitter0.fit();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.fitting.CurveFitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn((PointVectorValuePair) null).when(differentiableMultivariateVectorOptimizer0).optimize(anyInt() , any(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      PolynomialFitter polynomialFitter0 = new PolynomialFitter((-2360), differentiableMultivariateVectorOptimizer0);
      // Undeclared exception!
      try { 
        polynomialFitter0.fit((-2360), (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.fitting.CurveFitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      PolynomialFitter polynomialFitter0 = new PolynomialFitter((-1600), differentiableMultivariateVectorOptimizer0);
      // Undeclared exception!
      try { 
        polynomialFitter0.fit();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.fitting.PolynomialFitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PointVectorValuePair pointVectorValuePair0 = mock(PointVectorValuePair.class, new ViolatedAssumptionAnswer());
      doReturn((double[]) null).when(pointVectorValuePair0).getPointRef();
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(pointVectorValuePair0).when(differentiableMultivariateVectorOptimizer0).optimize(anyInt() , any(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      PolynomialFitter polynomialFitter0 = new PolynomialFitter((-2007), differentiableMultivariateVectorOptimizer0);
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = polynomialFitter0.fit((-2007), doubleArray0);
      assertNull(doubleArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn((PointVectorValuePair) null).when(differentiableMultivariateVectorOptimizer0).optimize(anyInt() , any(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      PolynomialFitter polynomialFitter0 = new PolynomialFitter(1393, differentiableMultivariateVectorOptimizer0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        polynomialFitter0.fit(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.fitting.CurveFitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn((PointVectorValuePair) null).when(differentiableMultivariateVectorOptimizer0).optimize(anyInt() , any(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      PolynomialFitter polynomialFitter0 = new PolynomialFitter(differentiableMultivariateVectorOptimizer0);
      // Undeclared exception!
      try { 
        polynomialFitter0.fit();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.fitting.CurveFitter", e);
      }
  }
}