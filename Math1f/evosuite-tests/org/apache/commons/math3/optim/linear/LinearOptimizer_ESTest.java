/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:01:26 GMT 2022
 */

package org.apache.commons.math3.optim.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.linear.LinearConstraint;
import org.apache.commons.math3.optim.linear.LinearConstraintSet;
import org.apache.commons.math3.optim.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optim.linear.NonNegativeConstraint;
import org.apache.commons.math3.optim.linear.Relationship;
import org.apache.commons.math3.optim.linear.SimplexSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinearOptimizer_ESTest extends LinearOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(919.6549256, 21, 21);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 21);
      optimizationDataArray0[2] = (OptimizationData) linearObjectiveFunction0;
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      LinearConstraintSet linearConstraintSet0 = new LinearConstraintSet(linkedList0);
      optimizationDataArray0[4] = (OptimizationData) linearConstraintSet0;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(optimizationDataArray0);
      assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-1.0), 18);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      NonNegativeConstraint nonNegativeConstraint0 = new NonNegativeConstraint(true);
      optimizationDataArray0[4] = (OptimizationData) nonNegativeConstraint0;
      simplexSolver0.parseOptimizationData(optimizationDataArray0);
      boolean boolean0 = simplexSolver0.isRestrictedToNonNegative();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      boolean boolean0 = simplexSolver0.isRestrictedToNonNegative();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(5038.59328309, 0, 0.0);
      LinearObjectiveFunction linearObjectiveFunction0 = simplexSolver0.getFunction();
      assertNull(linearObjectiveFunction0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-1.0), 18);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(18);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0.0);
      optimizationDataArray0[0] = (OptimizationData) linearObjectiveFunction0;
      simplexSolver0.parseOptimizationData(optimizationDataArray0);
      LinearObjectiveFunction linearObjectiveFunction1 = simplexSolver0.getFunction();
      assertEquals(0.0, linearObjectiveFunction1.getConstantTerm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(1.0, 0, 0.0);
      double[] doubleArray0 = new double[4];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[6];
      optimizationDataArray0[0] = (OptimizationData) linearObjectiveFunction0;
      simplexSolver0.parseOptimizationData(optimizationDataArray0);
      LinearObjectiveFunction linearObjectiveFunction1 = simplexSolver0.getFunction();
      assertSame(linearObjectiveFunction1, linearObjectiveFunction0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(1.0, 0, 0.0);
      double[] doubleArray0 = new double[4];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-19.033618360295236));
      OptimizationData[] optimizationDataArray0 = new OptimizationData[6];
      optimizationDataArray0[0] = (OptimizationData) linearObjectiveFunction0;
      simplexSolver0.parseOptimizationData(optimizationDataArray0);
      LinearObjectiveFunction linearObjectiveFunction1 = simplexSolver0.getFunction();
      assertSame(linearObjectiveFunction1, linearObjectiveFunction0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0, 7);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[9];
      LinearConstraint[] linearConstraintArray0 = new LinearConstraint[0];
      LinearConstraintSet linearConstraintSet0 = new LinearConstraintSet(linearConstraintArray0);
      optimizationDataArray0[5] = (OptimizationData) linearConstraintSet0;
      simplexSolver0.parseOptimizationData(optimizationDataArray0);
      Collection<LinearConstraint> collection0 = simplexSolver0.getConstraints();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(2414.6628442617, 1, 2414.6628442617);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[4];
      double[] doubleArray0 = new double[2];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) initialGuess0;
      double[] doubleArray1 = new double[9];
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray1);
      optimizationDataArray0[1] = (OptimizationData) simpleBounds0;
      // Undeclared exception!
      try { 
        simplexSolver0.parseOptimizationData(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9 != 2
         //
         verifyException("org.apache.commons.math3.optim.BaseMultivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(1661.1898503, (-2153), 1661.1898503);
      // Undeclared exception!
      try { 
        simplexSolver0.parseOptimizationData((OptimizationData[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.BaseOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(314.9857, 2, 314.9857);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[8];
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 2;
      doubleArray0[3] = 314.9857;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, false);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0.0);
      optimizationDataArray0[3] = (OptimizationData) linearObjectiveFunction0;
      LinearConstraint[] linearConstraintArray0 = new LinearConstraint[1];
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 2);
      linearConstraintArray0[0] = linearConstraint0;
      LinearConstraintSet linearConstraintSet0 = new LinearConstraintSet(linearConstraintArray0);
      optimizationDataArray0[7] = (OptimizationData) linearConstraintSet0;
      // Undeclared exception!
      try { 
        simplexSolver0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optim.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(1.0, 0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[5];
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(239);
      optimizationDataArray0[1] = (OptimizationData) simpleBounds0;
      double[] doubleArray0 = new double[8];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[2] = (OptimizationData) initialGuess0;
      // Undeclared exception!
      try { 
        simplexSolver0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 239 != 8
         //
         verifyException("org.apache.commons.math3.optim.BaseMultivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(1.0, 0, 0.0);
      // Undeclared exception!
      try { 
        simplexSolver0.getConstraints();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OptimizationData[] optimizationDataArray0 = new OptimizationData[1];
      NonNegativeConstraint nonNegativeConstraint0 = new NonNegativeConstraint(true);
      optimizationDataArray0[0] = (OptimizationData) nonNegativeConstraint0;
      // Undeclared exception!
      try { 
        simplexSolver0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }
}
