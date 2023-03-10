/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:29:34 GMT 2022
 */

package org.apache.commons.math3.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.optimization.linear.LinearObjectiveFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinearObjectiveFunction_ESTest extends LinearObjectiveFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 3.0);
      LinearObjectiveFunction linearObjectiveFunction1 = new LinearObjectiveFunction(doubleArray0, 4813.22241735926);
      boolean boolean0 = linearObjectiveFunction0.equals(linearObjectiveFunction1);
      assertFalse(boolean0);
      assertFalse(linearObjectiveFunction1.equals((Object)linearObjectiveFunction0));
      assertEquals(4813.22241735926, linearObjectiveFunction1.getConstantTerm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0, 0.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0);
      linearObjectiveFunction0.hashCode();
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2081.530113331145));
      linearObjectiveFunction0.hashCode();
      assertEquals((-2081.530113331145), linearObjectiveFunction0.getConstantTerm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      double double0 = linearObjectiveFunction0.getValue(doubleArray0);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 901.543);
      double double0 = linearObjectiveFunction0.getValue(doubleArray0);
      assertEquals(901.543, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0.0);
      double double0 = linearObjectiveFunction0.getValue((RealVector) arrayRealVector0);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 882.6262638479657);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      double double0 = linearObjectiveFunction0.getValue((RealVector) arrayRealVector0);
      assertEquals(882.6262638479657, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0.0);
      double double0 = linearObjectiveFunction0.getConstantTerm();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction((RealVector) null, 1.0E-12);
      double double0 = linearObjectiveFunction0.getConstantTerm();
      assertEquals(1.0E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction((RealVector) null, 2755.1482164616887);
      linearObjectiveFunction0.getCoefficients();
      assertEquals(2755.1482164616887, linearObjectiveFunction0.getConstantTerm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, 0, 0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0);
      double[] doubleArray1 = new double[3];
      // Undeclared exception!
      try { 
        linearObjectiveFunction0.getValue(doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 3
         //
         verifyException("org.apache.commons.math3.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 661.5879351622);
      // Undeclared exception!
      try { 
        linearObjectiveFunction0.getValue((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction((RealVector) null, 360.40544296);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        linearObjectiveFunction0.getValue(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-0.5));
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, false);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, arrayRealVector0);
      // Undeclared exception!
      try { 
        linearObjectiveFunction0.getValue((RealVector) arrayRealVector1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 12
         //
         verifyException("org.apache.commons.math3.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(1996, 1996);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 2.0);
      // Undeclared exception!
      try { 
        linearObjectiveFunction0.getValue((RealVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinearObjectiveFunction linearObjectiveFunction0 = null;
      try {
        linearObjectiveFunction0 = new LinearObjectiveFunction((double[]) null, (-1450.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1.0));
      LinearObjectiveFunction linearObjectiveFunction1 = new LinearObjectiveFunction(doubleArray0, (-1.0));
      boolean boolean0 = linearObjectiveFunction0.equals(linearObjectiveFunction1);
      assertTrue(boolean0);
      assertEquals((-1.0), linearObjectiveFunction1.getConstantTerm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2081.530113331145));
      Object object0 = new Object();
      boolean boolean0 = linearObjectiveFunction0.equals(object0);
      assertEquals((-2081.530113331145), linearObjectiveFunction0.getConstantTerm(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1.0));
      boolean boolean0 = linearObjectiveFunction0.equals(linearObjectiveFunction0);
      assertTrue(boolean0);
      assertEquals((-1.0), linearObjectiveFunction0.getConstantTerm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2081.530113331145));
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      LinearObjectiveFunction linearObjectiveFunction1 = new LinearObjectiveFunction(arrayRealVector0, (-2081.530113331145));
      boolean boolean0 = linearObjectiveFunction0.equals(linearObjectiveFunction1);
      assertEquals((-2081.530113331145), linearObjectiveFunction1.getConstantTerm(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-0.5));
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, false);
      double double0 = linearObjectiveFunction0.getValue((RealVector) arrayRealVector0);
      assertEquals((-0.5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2081.530113331145));
      double double0 = linearObjectiveFunction0.getValue(doubleArray0);
      assertEquals((-2081.530113331145), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction((RealVector) null, 2755.1482164616887);
      // Undeclared exception!
      try { 
        linearObjectiveFunction0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 200.0);
      RealVector realVector0 = linearObjectiveFunction0.getCoefficients();
      LinearObjectiveFunction linearObjectiveFunction1 = new LinearObjectiveFunction(realVector0, 1.0);
      boolean boolean0 = linearObjectiveFunction0.equals(linearObjectiveFunction1);
      assertFalse(linearObjectiveFunction1.equals((Object)linearObjectiveFunction0));
      assertEquals(1.0, linearObjectiveFunction1.getConstantTerm(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2081.530113331145));
      double double0 = linearObjectiveFunction0.getConstantTerm();
      assertEquals((-2081.530113331145), double0, 0.01);
  }
}
