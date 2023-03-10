/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:15:12 GMT 2022
 */

package org.apache.commons.math3.stat.ranking;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.NaturalRanking;
import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NaturalRanking_ESTest extends NaturalRanking_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.MINIMAL;
      NaturalRanking naturalRanking0 = new NaturalRanking(naNStrategy0);
      assertEquals(NaNStrategy.MINIMAL, naturalRanking0.getNanStrategy());
      
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = Double.NaN;
      double[] doubleArray1 = naturalRanking0.rank(doubleArray0);
      assertArrayEquals(new double[] {1.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.REMOVED;
      NaturalRanking naturalRanking0 = new NaturalRanking(naNStrategy0, (RandomGenerator) null);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = Double.NaN;
      doubleArray0[5] = Double.NaN;
      double[] doubleArray1 = naturalRanking0.rank(doubleArray0);
      assertArrayEquals(new double[] {1.0, 2.0, 4.0, 1.0, 1.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.MINIMAL;
      NaturalRanking naturalRanking0 = new NaturalRanking(naNStrategy0);
      // Undeclared exception!
      try { 
        naturalRanking0.rank((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.ranking.NaturalRanking", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.FIXED;
      ISAACRandom iSAACRandom0 = new ISAACRandom((-1783L));
      NaturalRanking naturalRanking0 = new NaturalRanking(naNStrategy0, iSAACRandom0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        naturalRanking0.rank(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.stat.ranking.NaturalRanking", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.MAXIMAL;
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      NaturalRanking naturalRanking0 = new NaturalRanking(naNStrategy0, mersenneTwister0);
      assertEquals(NaNStrategy.MAXIMAL, naturalRanking0.getNanStrategy());
      
      double[] doubleArray0 = new double[5];
      doubleArray0[3] = Double.NaN;
      double[] doubleArray1 = naturalRanking0.rank(doubleArray0);
      assertArrayEquals(new double[] {2.0, 4.0, 4.0, 5.0, 1.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.REMOVED;
      TiesStrategy tiesStrategy0 = TiesStrategy.MAXIMUM;
      NaturalRanking naturalRanking0 = new NaturalRanking(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.NaN;
      double[] doubleArray1 = naturalRanking0.rank(doubleArray0);
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.FIXED;
      TiesStrategy tiesStrategy0 = TiesStrategy.MINIMUM;
      NaturalRanking naturalRanking0 = new NaturalRanking(naNStrategy0, tiesStrategy0);
      assertEquals(NaNStrategy.FIXED, naturalRanking0.getNanStrategy());
      
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = Double.NaN;
      double[] doubleArray1 = naturalRanking0.rank(doubleArray0);
      assertArrayEquals(new double[] {1.0, 1.0, 1.0, 1.0, Double.NaN, 1.0, 1.0, 1.0, 1.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TiesStrategy tiesStrategy0 = TiesStrategy.SEQUENTIAL;
      NaturalRanking naturalRanking0 = new NaturalRanking(tiesStrategy0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1.0);
      double[] doubleArray1 = naturalRanking0.rank(doubleArray0);
      assertArrayEquals(new double[] {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.FIXED;
      TiesStrategy tiesStrategy0 = TiesStrategy.MINIMUM;
      NaturalRanking naturalRanking0 = new NaturalRanking(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = naturalRanking0.rank(doubleArray0);
      assertEquals(NaNStrategy.FIXED, naturalRanking0.getNanStrategy());
      assertArrayEquals(new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NaturalRanking naturalRanking0 = new NaturalRanking((RandomGenerator) null);
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = Double.NaN;
      // Undeclared exception!
      try { 
        naturalRanking0.rank(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // NaN is not allowed
         //
         verifyException("org.apache.commons.math3.stat.ranking.NaturalRanking", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NaturalRanking naturalRanking0 = new NaturalRanking();
      assertEquals(TiesStrategy.AVERAGE, naturalRanking0.getTiesStrategy());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.FIXED;
      TiesStrategy tiesStrategy0 = TiesStrategy.MINIMUM;
      NaturalRanking naturalRanking0 = new NaturalRanking(naNStrategy0, tiesStrategy0);
      NaNStrategy naNStrategy1 = naturalRanking0.getNanStrategy();
      assertEquals(NaNStrategy.FIXED, naNStrategy1);
      assertEquals(TiesStrategy.MINIMUM, naturalRanking0.getTiesStrategy());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.REMOVED;
      TiesStrategy tiesStrategy0 = TiesStrategy.MAXIMUM;
      NaturalRanking naturalRanking0 = new NaturalRanking(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = naturalRanking0.rank(doubleArray0);
      assertEquals(NaNStrategy.REMOVED, naturalRanking0.getNanStrategy());
      assertArrayEquals(new double[] {2.0, 2.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.MAXIMAL;
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      NaturalRanking naturalRanking0 = new NaturalRanking(naNStrategy0, mersenneTwister0);
      TiesStrategy tiesStrategy0 = naturalRanking0.getTiesStrategy();
      assertEquals(TiesStrategy.RANDOM, tiesStrategy0);
      assertEquals(NaNStrategy.MAXIMAL, naturalRanking0.getNanStrategy());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.MINIMAL;
      NaturalRanking naturalRanking0 = new NaturalRanking(naNStrategy0);
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = naturalRanking0.rank(doubleArray0);
      assertArrayEquals(new double[] {2.5, 2.5, 2.5, 2.5}, doubleArray1, 0.01);
      assertEquals(NaNStrategy.MINIMAL, naturalRanking0.getNanStrategy());
  }
}
