/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 07:10:44 GMT 2022
 */

package org.apache.commons.math3.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.linear.NonSymmetricMatrixException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NonSymmetricMatrixException_ESTest extends NonSymmetricMatrixException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException(0, 0, 0);
      double double0 = nonSymmetricMatrixException0.getThreshold();
      assertEquals(0, nonSymmetricMatrixException0.getColumn());
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, nonSymmetricMatrixException0.getRow());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException((-3790), (-1318), (-3790));
      double double0 = nonSymmetricMatrixException0.getThreshold();
      assertEquals((-3790.0), double0, 0.01);
      assertEquals((-3790), nonSymmetricMatrixException0.getRow());
      assertEquals((-1318), nonSymmetricMatrixException0.getColumn());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException(0, 0, 0);
      int int0 = nonSymmetricMatrixException0.getRow();
      assertEquals(0, nonSymmetricMatrixException0.getColumn());
      assertEquals(0, int0);
      assertEquals(0.0, nonSymmetricMatrixException0.getThreshold(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException((-3790), (-1318), (-3790));
      int int0 = nonSymmetricMatrixException0.getRow();
      assertEquals((-3790.0), nonSymmetricMatrixException0.getThreshold(), 0.01);
      assertEquals((-3790), int0);
      assertEquals((-1318), nonSymmetricMatrixException0.getColumn());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException(0, 0, 0);
      int int0 = nonSymmetricMatrixException0.getColumn();
      assertEquals(0, int0);
      assertEquals(0, nonSymmetricMatrixException0.getRow());
      assertEquals(0.0, nonSymmetricMatrixException0.getThreshold(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException(2083, (-899), 2083);
      int int0 = nonSymmetricMatrixException0.getColumn();
      assertEquals(2083.0, nonSymmetricMatrixException0.getThreshold(), 0.01);
      assertEquals((-899), int0);
      assertEquals(2083, nonSymmetricMatrixException0.getRow());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException(30, 30, 30);
      double double0 = nonSymmetricMatrixException0.getThreshold();
      assertEquals(30, nonSymmetricMatrixException0.getRow());
      assertEquals(30, nonSymmetricMatrixException0.getColumn());
      assertEquals(30.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException(30, 30, 30);
      int int0 = nonSymmetricMatrixException0.getColumn();
      assertEquals(30, int0);
      assertEquals(30, nonSymmetricMatrixException0.getRow());
      assertEquals(30.0, nonSymmetricMatrixException0.getThreshold(), 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException(30, 30, 30);
      int int0 = nonSymmetricMatrixException0.getRow();
      assertEquals(30.0, nonSymmetricMatrixException0.getThreshold(), 0.01);
      assertEquals(30, int0);
      assertEquals(30, nonSymmetricMatrixException0.getColumn());
  }
}