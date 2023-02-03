/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:28:56 GMT 2022
 */

package org.apache.commons.math3.stat.inference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WilcoxonSignedRankTest_ESTest extends WilcoxonSignedRankTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WilcoxonSignedRankTest wilcoxonSignedRankTest0 = new WilcoxonSignedRankTest();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 469.26691704176733;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 469.26691704176733;
      doubleArray1[1] = 469.26691704176733;
      doubleArray1[2] = (-850.453068826524);
      doubleArray1[3] = 469.26691704176733;
      double double0 = wilcoxonSignedRankTest0.wilcoxonSignedRankTest(doubleArray0, doubleArray1, false);
      assertEquals(0.8551321405847059, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.REMOVED;
      TiesStrategy tiesStrategy0 = TiesStrategy.SEQUENTIAL;
      WilcoxonSignedRankTest wilcoxonSignedRankTest0 = new WilcoxonSignedRankTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = 2755.0827398289953;
      double double0 = wilcoxonSignedRankTest0.wilcoxonSignedRankTest(doubleArray0, doubleArray1, true);
      assertEquals(0.4375, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WilcoxonSignedRankTest wilcoxonSignedRankTest0 = new WilcoxonSignedRankTest();
      double[] doubleArray0 = new double[9];
      wilcoxonSignedRankTest0.wilcoxonSignedRankTest(doubleArray0, doubleArray0, true);
      // Undeclared exception!
      wilcoxonSignedRankTest0.wilcoxonSignedRankTest(doubleArray0, doubleArray0, true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.REMOVED;
      TiesStrategy tiesStrategy0 = TiesStrategy.SEQUENTIAL;
      WilcoxonSignedRankTest wilcoxonSignedRankTest0 = new WilcoxonSignedRankTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[6];
      try { 
        wilcoxonSignedRankTest0.wilcoxonSignedRankTest(doubleArray0, doubleArray1, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 9
         //
         verifyException("org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TiesStrategy tiesStrategy0 = TiesStrategy.AVERAGE;
      WilcoxonSignedRankTest wilcoxonSignedRankTest0 = new WilcoxonSignedRankTest((NaNStrategy) null, tiesStrategy0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        wilcoxonSignedRankTest0.wilcoxonSignedRank(doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.ranking.NaturalRanking", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.MINIMAL;
      TiesStrategy tiesStrategy0 = TiesStrategy.RANDOM;
      WilcoxonSignedRankTest wilcoxonSignedRankTest0 = new WilcoxonSignedRankTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-4210.3838209893);
      double[] doubleArray1 = new double[6];
      double double0 = wilcoxonSignedRankTest0.wilcoxonSignedRank(doubleArray0, doubleArray1);
      assertEquals(15.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WilcoxonSignedRankTest wilcoxonSignedRankTest0 = new WilcoxonSignedRankTest();
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[1];
      try { 
        wilcoxonSignedRankTest0.wilcoxonSignedRank(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 1
         //
         verifyException("org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WilcoxonSignedRankTest wilcoxonSignedRankTest0 = new WilcoxonSignedRankTest();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      try { 
        wilcoxonSignedRankTest0.wilcoxonSignedRankTest(doubleArray0, doubleArray1, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.FIXED;
      TiesStrategy tiesStrategy0 = TiesStrategy.SEQUENTIAL;
      WilcoxonSignedRankTest wilcoxonSignedRankTest0 = new WilcoxonSignedRankTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[0];
      try { 
        wilcoxonSignedRankTest0.wilcoxonSignedRank(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.MAXIMAL;
      TiesStrategy tiesStrategy0 = TiesStrategy.AVERAGE;
      WilcoxonSignedRankTest wilcoxonSignedRankTest0 = new WilcoxonSignedRankTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[2];
      try { 
        wilcoxonSignedRankTest0.wilcoxonSignedRankTest(doubleArray0, (double[]) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.FIXED;
      TiesStrategy tiesStrategy0 = TiesStrategy.SEQUENTIAL;
      WilcoxonSignedRankTest wilcoxonSignedRankTest0 = new WilcoxonSignedRankTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[4];
      double double0 = wilcoxonSignedRankTest0.wilcoxonSignedRankTest(doubleArray0, doubleArray0, false);
      assertEquals(0.044609718024939515, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.FAILED;
      TiesStrategy tiesStrategy0 = TiesStrategy.SEQUENTIAL;
      WilcoxonSignedRankTest wilcoxonSignedRankTest0 = new WilcoxonSignedRankTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[7];
      doubleArray0[6] = Double.NaN;
      // Undeclared exception!
      try { 
        wilcoxonSignedRankTest0.wilcoxonSignedRank(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // NaN is not allowed
         //
         verifyException("org.apache.commons.math3.stat.ranking.NaturalRanking", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WilcoxonSignedRankTest wilcoxonSignedRankTest0 = new WilcoxonSignedRankTest();
      try { 
        wilcoxonSignedRankTest0.wilcoxonSignedRank((double[]) null, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest", e);
      }
  }
}
