/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:34:39 GMT 2022
 */

package org.apache.commons.math3.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.direct.PowellOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PowellOptimizer_ESTest extends PowellOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConvergenceChecker<PointValuePair> convergenceChecker0 = (ConvergenceChecker<PointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(3.4439717236742845E-8, 0.0, convergenceChecker0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.direct.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConvergenceChecker<PointValuePair> convergenceChecker0 = (ConvergenceChecker<PointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer((-760.0), 1.0E-15, convergenceChecker0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -760 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.direct.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(760.07012, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.direct.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer((-5.137101580464648), (-5.137101580464648));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -5.137 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.direct.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConvergenceChecker<PointValuePair> convergenceChecker0 = (ConvergenceChecker<PointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(1075.971, (-0.33333333333333287), 0.0, (-1198.468), convergenceChecker0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -0.333 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.direct.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConvergenceChecker<PointValuePair> convergenceChecker0 = (ConvergenceChecker<PointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(0.0, 0.0, 2069.0, 0.49999999999999994, convergenceChecker0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.direct.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConvergenceChecker<PointValuePair> convergenceChecker0 = (ConvergenceChecker<PointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(2569.0, 2569.0, 0.0, 0.0, convergenceChecker0);
      assertNull(powellOptimizer0.getGoalType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConvergenceChecker<PointValuePair> convergenceChecker0 = (ConvergenceChecker<PointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(2332.9, 2.0, convergenceChecker0);
      assertNull(powellOptimizer0.getGoalType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(2.0, 2.0, 2.0, 2.0);
      assertNull(powellOptimizer0.getGoalType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(0.0, 0.0, 0.0, 0.09090909090909091);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.direct.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(762.0782468747252, (-3365.3788643692674), 762.0782468747252, (-3365.3788643692674));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3,365.379 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.direct.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(2707.7345406755594, 2707.7345406755594);
      assertNull(powellOptimizer0.getGoalType());
  }
}