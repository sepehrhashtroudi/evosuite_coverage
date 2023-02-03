/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:02:25 GMT 2022
 */

package org.apache.commons.math3.optim.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.optim.linear.LinearConstraint;
import org.apache.commons.math3.optim.linear.Relationship;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinearConstraint_ESTest extends LinearConstraint_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, (-355.5657048), relationship0, doubleArray0, (-2808.0));
      linearConstraint0.hashCode();
      assertEquals((-2452.4342952), linearConstraint0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 1048.2863);
      LinearConstraint linearConstraint1 = new LinearConstraint(doubleArray0, relationship0, 0.0);
      boolean boolean0 = linearConstraint0.equals(linearConstraint1);
      assertFalse(linearConstraint1.equals((Object)linearConstraint0));
      assertEquals(0.0, linearConstraint1.getValue(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(arrayRealVector0, (-597.8), relationship0, arrayRealVector0, 0.0);
      double double0 = linearConstraint0.getValue();
      assertEquals(597.8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(arrayRealVector0, 1.0, relationship0, arrayRealVector0, (-2.0));
      double double0 = linearConstraint0.getValue();
      assertEquals((-3.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 2834.195724, relationship0, doubleArray0, 2834.195724);
      linearConstraint0.getCoefficients();
      assertEquals(0.0, linearConstraint0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Relationship relationship0 = Relationship.EQ;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      RealVector realVector0 = RealVector.unmodifiableRealVector(arrayRealVector0);
      LinearConstraint linearConstraint0 = new LinearConstraint(realVector0, relationship0, 0.0);
      // Undeclared exception!
      try { 
        linearConstraint0.hashCode();
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // unsupported operation
         //
         verifyException("org.apache.commons.math3.linear.RealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint((RealVector) null, relationship0, 0.0);
      // Undeclared exception!
      try { 
        linearConstraint0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.linear.LinearConstraint", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint((RealVector) null, relationship0, (-31.313198002435414));
      LinearConstraint linearConstraint1 = new LinearConstraint(doubleArray0, 0.0, relationship0, doubleArray0, (-31.313198002435414));
      // Undeclared exception!
      try { 
        linearConstraint0.equals(linearConstraint1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.linear.LinearConstraint", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = null;
      try {
        linearConstraint0 = new LinearConstraint((double[]) null, relationship0, (-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = null;
      try {
        linearConstraint0 = new LinearConstraint((double[]) null, 0.0, relationship0, (double[]) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.linear.LinearConstraint", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      Relationship relationship0 = Relationship.LEQ;
      double[] doubleArray1 = new double[4];
      LinearConstraint linearConstraint0 = null;
      try {
        linearConstraint0 = new LinearConstraint(doubleArray0, 0.0, relationship0, doubleArray1, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math3.optim.linear.LinearConstraint", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      Relationship relationship0 = Relationship.LEQ;
      ArrayRealVector arrayRealVector1 = new ArrayRealVector((RealVector) arrayRealVector0, arrayRealVector0);
      LinearConstraint linearConstraint0 = null;
      try {
        linearConstraint0 = new LinearConstraint(arrayRealVector0, 803.015622266, relationship0, arrayRealVector1, 803.015622266);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 2
         //
         verifyException("org.apache.commons.math3.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = null;
      try {
        linearConstraint0 = new LinearConstraint((RealVector) null, (-2573.0), relationship0, (RealVector) null, (-2573.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.linear.LinearConstraint", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = doubleArray0[3];
      doubleArray0[5] = doubleArray0[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(arrayRealVector0, 0.0, relationship0, arrayRealVector0, (double) doubleArray0[3]);
      LinearConstraint linearConstraint1 = new LinearConstraint((RealVector) null, relationship0, 0.0);
      boolean boolean0 = linearConstraint0.equals(linearConstraint1);
      assertFalse(boolean0);
      assertEquals(0.0, linearConstraint0.getValue(), 0.01);
      assertEquals(0.0, linearConstraint1.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 2834.195724, relationship0, doubleArray0, 2834.195724);
      LinearConstraint linearConstraint1 = new LinearConstraint(doubleArray0, 2834.195724, relationship0, doubleArray0, 2834.195724);
      boolean boolean0 = linearConstraint0.equals(linearConstraint1);
      assertEquals(0.0, linearConstraint1.getValue(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 0.0);
      Relationship relationship1 = Relationship.GEQ;
      LinearConstraint linearConstraint1 = new LinearConstraint(doubleArray0, 749.59632, relationship1, doubleArray0, 0.0);
      boolean boolean0 = linearConstraint1.equals(linearConstraint0);
      assertFalse(boolean0);
      assertEquals(0.0, linearConstraint0.getValue(), 0.01);
      assertEquals((-749.59632), linearConstraint1.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 2834.195724, relationship0, doubleArray0, 2834.195724);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      boolean boolean0 = linearConstraint0.equals(arrayRealVector0);
      assertFalse(boolean0);
      assertEquals(0.0, linearConstraint0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 2834.195724, relationship0, doubleArray0, 2834.195724);
      boolean boolean0 = linearConstraint0.equals(linearConstraint0);
      assertTrue(boolean0);
      assertEquals(0.0, linearConstraint0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 2834.195724, relationship0, doubleArray0, 2834.195724);
      double double0 = linearConstraint0.getValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint((RealVector) null, relationship0, 0.9);
      linearConstraint0.getCoefficients();
      assertEquals(0.9, linearConstraint0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 0.0);
      LinearConstraint linearConstraint1 = new LinearConstraint(doubleArray0, 749.59632, relationship0, doubleArray0, 0.0);
      boolean boolean0 = linearConstraint1.equals(linearConstraint0);
      assertEquals((-749.59632), linearConstraint1.getValue(), 0.01);
      assertFalse(boolean0);
      assertFalse(linearConstraint0.equals((Object)linearConstraint1));
      assertEquals(0.0, linearConstraint0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 2834.195724, relationship0, doubleArray0, 2834.195724);
      linearConstraint0.getRelationship();
      assertEquals(0.0, linearConstraint0.getValue(), 0.01);
  }
}
