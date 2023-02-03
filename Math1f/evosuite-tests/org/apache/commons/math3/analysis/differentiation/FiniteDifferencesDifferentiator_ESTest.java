/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 23:57:33 GMT 2022
 */

package org.apache.commons.math3.analysis.differentiation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.UnivariateMatrixFunction;
import org.apache.commons.math3.analysis.UnivariateVectorFunction;
import org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator;
import org.apache.commons.math3.analysis.function.Atanh;
import org.apache.commons.math3.analysis.interpolation.HermiteInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FiniteDifferencesDifferentiator_ESTest extends FiniteDifferencesDifferentiator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FiniteDifferencesDifferentiator finiteDifferencesDifferentiator0 = new FiniteDifferencesDifferentiator(255, 183.1, Double.NEGATIVE_INFINITY, 1.0);
      assertEquals(183.1, finiteDifferencesDifferentiator0.getStepSize(), 0.01);
      assertEquals(255, finiteDifferencesDifferentiator0.getNbPoints());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FiniteDifferencesDifferentiator finiteDifferencesDifferentiator0 = null;
      try {
        finiteDifferencesDifferentiator0 = new FiniteDifferencesDifferentiator(136, (-1257.0223830737007), 136, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,257.022 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FiniteDifferencesDifferentiator finiteDifferencesDifferentiator0 = null;
      try {
        finiteDifferencesDifferentiator0 = new FiniteDifferencesDifferentiator(1021, 1021, 1021, 1021);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1,041,420 is larger than, or equal to, the maximum (0)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FiniteDifferencesDifferentiator finiteDifferencesDifferentiator0 = null;
      try {
        finiteDifferencesDifferentiator0 = new FiniteDifferencesDifferentiator(0, (-1083.046014161347), (-584.113724403), (-2439.5145728987045));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,083.046 is smaller than, or equal to, the minimum (1)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FiniteDifferencesDifferentiator finiteDifferencesDifferentiator0 = null;
      try {
        finiteDifferencesDifferentiator0 = new FiniteDifferencesDifferentiator(1396, Double.POSITIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // \u221E is larger than, or equal to, the maximum (\u221E)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FiniteDifferencesDifferentiator finiteDifferencesDifferentiator0 = null;
      try {
        finiteDifferencesDifferentiator0 = new FiniteDifferencesDifferentiator(130, (-265.9891506392814));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -265.989 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FiniteDifferencesDifferentiator finiteDifferencesDifferentiator0 = null;
      try {
        finiteDifferencesDifferentiator0 = new FiniteDifferencesDifferentiator((-1), 0.006);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0.006 is smaller than, or equal to, the minimum (1)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FiniteDifferencesDifferentiator finiteDifferencesDifferentiator0 = new FiniteDifferencesDifferentiator(3723, 3723);
      UnivariateMatrixFunction univariateMatrixFunction0 = mock(UnivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      finiteDifferencesDifferentiator0.differentiate(univariateMatrixFunction0);
      assertEquals(3723, finiteDifferencesDifferentiator0.getNbPoints());
      assertEquals(3723.0, finiteDifferencesDifferentiator0.getStepSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FiniteDifferencesDifferentiator finiteDifferencesDifferentiator0 = new FiniteDifferencesDifferentiator(3723, 3723);
      double double0 = finiteDifferencesDifferentiator0.getStepSize();
      assertEquals(3723.0, double0, 0.01);
      assertEquals(3723, finiteDifferencesDifferentiator0.getNbPoints());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FiniteDifferencesDifferentiator finiteDifferencesDifferentiator0 = new FiniteDifferencesDifferentiator(3723, 3723);
      int int0 = finiteDifferencesDifferentiator0.getNbPoints();
      assertEquals(3723.0, finiteDifferencesDifferentiator0.getStepSize(), 0.01);
      assertEquals(3723, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FiniteDifferencesDifferentiator finiteDifferencesDifferentiator0 = new FiniteDifferencesDifferentiator(3723, 3723);
      HermiteInterpolator hermiteInterpolator0 = new HermiteInterpolator();
      finiteDifferencesDifferentiator0.differentiate((UnivariateVectorFunction) hermiteInterpolator0);
      assertEquals(3723.0, finiteDifferencesDifferentiator0.getStepSize(), 0.01);
      assertEquals(3723, finiteDifferencesDifferentiator0.getNbPoints());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FiniteDifferencesDifferentiator finiteDifferencesDifferentiator0 = new FiniteDifferencesDifferentiator(3723, 3723);
      Atanh atanh0 = new Atanh();
      finiteDifferencesDifferentiator0.differentiate((UnivariateFunction) atanh0);
      assertEquals(3723.0, finiteDifferencesDifferentiator0.getStepSize(), 0.01);
      assertEquals(3723, finiteDifferencesDifferentiator0.getNbPoints());
  }
}
