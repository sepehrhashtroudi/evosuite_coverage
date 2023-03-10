/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 22:35:11 GMT 2022
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.ObjectInput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import org.apache.commons.math3.ode.EquationsMapper;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GraggBulirschStoerStepInterpolator_ESTest extends GraggBulirschStoerStepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[][] doubleArray1 = new double[4][0];
      EquationsMapper equationsMapper0 = new EquationsMapper(4, 0);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[3];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
      MockFile mockFile0 = new MockFile((File) null, "B[,0oxDFU-~Xjf");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      graggBulirschStoerStepInterpolator0.writeExternal(objectOutputStream0);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getGlobalCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-2349.43030705);
      double[][] doubleArray1 = new double[6][7];
      EquationsMapper equationsMapper0 = new EquationsMapper(5, 0);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[2];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
      graggBulirschStoerStepInterpolator0.computeCoefficients(5, Double.NaN);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[6][4];
      EquationsMapper equationsMapper0 = new EquationsMapper((-1021), 105);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[1];
      equationsMapperArray0[0] = equationsMapper0;
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
      StepInterpolator stepInterpolator0 = graggBulirschStoerStepInterpolator0.doCopy();
      assertEquals(Double.NaN, stepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator0.readExternal((ObjectInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator0.computeInterpolatedStateAndDerivatives((-1771.6007445743298), 16.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[][] doubleArray1 = new double[0][2];
      EquationsMapper equationsMapper0 = new EquationsMapper(1, 1417);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[8];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      equationsMapperArray0[3] = equationsMapper0;
      equationsMapperArray0[4] = equationsMapper0;
      equationsMapperArray0[5] = equationsMapper0;
      equationsMapperArray0[6] = equationsMapper0;
      equationsMapperArray0[7] = equationsMapper0;
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator(graggBulirschStoerStepInterpolator0);
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator1.computeInterpolatedStateAndDerivatives((-1237.459970068), 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[4][3];
      EquationsMapper equationsMapper0 = new EquationsMapper(0, 0);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[5];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      equationsMapperArray0[3] = equationsMapper0;
      equationsMapperArray0[4] = equationsMapper0;
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, false, equationsMapper0, equationsMapperArray0);
      // Undeclared exception!
      graggBulirschStoerStepInterpolator0.computeCoefficients(1644, (-1396.9609964045767));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[7][4];
      EquationsMapper equationsMapper0 = new EquationsMapper((-4782), (-4782));
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[5];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = null;
      try {
        graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, false, equationsMapper0, equationsMapperArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = null;
      try {
        graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator(graggBulirschStoerStepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator0.writeExternal(objectOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[][] doubleArray1 = new double[4][0];
      EquationsMapper equationsMapper0 = new EquationsMapper(4, 0);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[3];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
      graggBulirschStoerStepInterpolator0.computeInterpolatedStateAndDerivatives(0.0, 4);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getGlobalPreviousTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[3][9];
      EquationsMapper equationsMapper0 = new EquationsMapper(397, 397);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[4];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      equationsMapperArray0[3] = equationsMapper0;
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
      double double0 = graggBulirschStoerStepInterpolator0.estimateError(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[4][1];
      doubleArray1[0] = doubleArray0;
      EquationsMapper equationsMapper0 = new EquationsMapper(1262, 1262);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[4];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      equationsMapperArray0[3] = equationsMapper0;
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
      graggBulirschStoerStepInterpolator0.computeCoefficients(0, 3.0);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[3][9];
      EquationsMapper equationsMapper0 = new EquationsMapper(397, 397);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[4];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      equationsMapperArray0[3] = equationsMapper0;
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
      graggBulirschStoerStepInterpolator0.computeCoefficients((-4), 0.0);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator0.computeCoefficients(1923, 392.04);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[3][9];
      EquationsMapper equationsMapper0 = new EquationsMapper(397, 397);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[4];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      equationsMapperArray0[3] = equationsMapper0;
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator0.computeCoefficients(4, 397);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[9][5];
      EquationsMapper equationsMapper0 = new EquationsMapper((-2708), 5);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[5];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      equationsMapperArray0[3] = equationsMapper0;
      equationsMapperArray0[4] = equationsMapper0;
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, false, equationsMapper0, equationsMapperArray0);
      StepInterpolator stepInterpolator0 = graggBulirschStoerStepInterpolator0.doCopy();
      assertEquals(Double.NaN, stepInterpolator0.getPreviousTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[9][5];
      EquationsMapper equationsMapper0 = new EquationsMapper((-2708), 5);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[5];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = null;
      try {
        graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, false, equationsMapper0, equationsMapperArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator0.doCopy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator", e);
      }
  }
}
