/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:24:01 GMT 2022
 */

package org.apache.commons.math3.stat.inference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.stat.inference.GTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GTest_ESTest extends GTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[1];
      long[] longArray1 = new long[7];
      // Undeclared exception!
      try { 
        gTest0.gTestDataSetsComparison(longArray0, longArray1, 1.0E-5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // shape (0)
         //
         verifyException("org.apache.commons.math3.distribution.GammaDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[0];
      try { 
        gTest0.gTestDataSetsComparison(longArray0, longArray0, (double) 0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // out of bounds significance level 0, must be between 0 and 0.5
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[7];
      long[] longArray1 = new long[3];
      try { 
        gTest0.gDataSetsComparison(longArray0, longArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 3
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[1];
      long[] longArray1 = new long[2];
      try { 
        gTest0.gDataSetsComparison(longArray0, longArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 2
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GTest gTest0 = new GTest();
      double[] doubleArray0 = new double[1];
      long[] longArray0 = new long[0];
      try { 
        gTest0.gTest(doubleArray0, longArray0, (-537.3894));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // out of bounds significance level -537.389, must be between 0 and 0.5
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GTest gTest0 = new GTest();
      double[] doubleArray0 = new double[5];
      long[] longArray0 = new long[2];
      try { 
        gTest0.gTest(doubleArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 2
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GTest gTest0 = new GTest();
      double double0 = gTest0.rootLogLikelihoodRatio(1L, 1L, 1L, 2285L);
      assertEquals(3.4534225088396187, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GTest gTest0 = new GTest();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 4607182418800019697L;
      doubleArray0[1] = (double) 4607182418800019697L;
      doubleArray0[2] = (double) 4607182418800019697L;
      doubleArray0[3] = (double) 4607182418800019697L;
      long[] longArray0 = new long[4];
      longArray0[0] = 4607182418800019697L;
      longArray0[1] = 4589168020290544312L;
      longArray0[2] = 4607182418800019697L;
      longArray0[3] = 4607182418800019697L;
      double double0 = gTest0.gTestIntrinsic(doubleArray0, longArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GTest gTest0 = new GTest();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 4607182418800019697L;
      doubleArray0[1] = (double) 4607182418800019697L;
      doubleArray0[2] = (double) 4607182418800019697L;
      doubleArray0[3] = (double) 4607182418800019697L;
      long[] longArray0 = new long[4];
      longArray0[0] = 4607182418800019697L;
      longArray0[1] = 4607182418800019697L;
      longArray0[2] = 4607182418800019697L;
      longArray0[3] = 4607182418800019697L;
      double double0 = gTest0.gTestIntrinsic(doubleArray0, longArray0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[3];
      longArray0[0] = 2059L;
      longArray0[1] = 6L;
      longArray0[2] = 2474L;
      double double0 = gTest0.gTestDataSetsComparison(longArray0, longArray0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = 4607182418800019697L;
      longArray0[1] = 4607182418800019697L;
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 4607182418800019697L;
      doubleArray0[1] = (double) 4607182418800019697L;
      doubleArray0[2] = (double) 4607182418800019697L;
      doubleArray0[3] = (double) 4607182418800019697L;
      longArray0[2] = 4607182418800019697L;
      longArray0[3] = 4607182418800019697L;
      GTest gTest0 = new GTest();
      double double0 = gTest0.gTest(doubleArray0, longArray0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[9];
      longArray0[0] = 1860L;
      longArray0[1] = 670L;
      longArray0[2] = 2141L;
      longArray0[3] = 4208363204685324176L;
      longArray0[4] = 770L;
      longArray0[5] = 375L;
      longArray0[6] = 1L;
      longArray0[7] = 2492L;
      longArray0[8] = 267L;
      double double0 = gTest0.gDataSetsComparison(longArray0, longArray0);
      assertEquals(3737.7773806615737, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[4];
      longArray0[0] = 715L;
      longArray0[1] = 1L;
      longArray0[2] = 6956L;
      longArray0[3] = 2102L;
      double double0 = gTest0.gDataSetsComparison(longArray0, longArray0);
      assertEquals((-8.681055874149024E-12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[3];
      longArray0[0] = 2414L;
      longArray0[1] = 2414L;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 2414L;
      doubleArray0[1] = (double) 2414L;
      doubleArray0[2] = (double) 2414L;
      longArray0[2] = 4607182418800018775L;
      double double0 = gTest0.g(doubleArray0, longArray0);
      assertEquals(1.0123014442858394E19, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GTest gTest0 = new GTest();
      // Undeclared exception!
      try { 
        gTest0.rootLogLikelihoodRatio(100L, 689L, 689L, (-2944L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,944 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GTest gTest0 = new GTest();
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        gTest0.gTestIntrinsic(doubleArray0, (long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[6];
      longArray0[0] = (-1454L);
      try { 
        gTest0.gTestDataSetsComparison(longArray0, longArray0, 4.374453193350831E-4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,454 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GTest gTest0 = new GTest();
      // Undeclared exception!
      try { 
        gTest0.gTestDataSetsComparison((long[]) null, (long[]) null, 0.5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[2];
      longArray0[0] = (-2047L);
      try { 
        gTest0.gTestDataSetsComparison(longArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,047 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        gTest0.gTestDataSetsComparison(longArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // shape (-0.5)
         //
         verifyException("org.apache.commons.math3.distribution.GammaDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GTest gTest0 = new GTest();
      // Undeclared exception!
      try { 
        gTest0.gTestDataSetsComparison((long[]) null, (long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[2];
      // Undeclared exception!
      try { 
        gTest0.gTest((double[]) null, longArray0, 0.5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GTest gTest0 = new GTest();
      double[] doubleArray0 = new double[5];
      long[] longArray0 = new long[5];
      try { 
        gTest0.gTest(doubleArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GTest gTest0 = new GTest();
      double[] doubleArray0 = new double[2];
      long[] longArray0 = new long[3];
      try { 
        gTest0.gTest(doubleArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 3
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[7];
      longArray0[4] = (-1904L);
      try { 
        gTest0.gDataSetsComparison(longArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,904 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[5];
      // Undeclared exception!
      try { 
        gTest0.gDataSetsComparison(longArray0, (long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[6];
      double[] doubleArray0 = new double[6];
      try { 
        gTest0.g(doubleArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GTest gTest0 = new GTest();
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        gTest0.g(doubleArray0, (long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[5];
      long[] longArray1 = new long[5];
      longArray1[0] = 2958L;
      try { 
        gTest0.gDataSetsComparison(longArray0, longArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed counts are both zero for entry 0
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[3];
      longArray0[0] = 2414L;
      longArray0[1] = 2414L;
      longArray0[2] = 4607182418800018775L;
      double double0 = gTest0.gDataSetsComparison(longArray0, longArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[3];
      long[] longArray1 = new long[5];
      try { 
        gTest0.gDataSetsComparison(longArray0, longArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 5
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GTest gTest0 = new GTest();
      double[] doubleArray0 = new double[3];
      long[] longArray0 = new long[4];
      try { 
        gTest0.g(doubleArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 4
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[8];
      try { 
        gTest0.gTestDataSetsComparison(longArray0, longArray0, 1066.4924297609582);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // out of bounds significance level 1,066.492, must be between 0 and 0.5
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[6];
      try { 
        gTest0.gTestDataSetsComparison(longArray0, longArray0, (-504.5));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // out of bounds significance level -504.5, must be between 0 and 0.5
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GTest gTest0 = new GTest();
      double double0 = gTest0.rootLogLikelihoodRatio(0L, 2492L, 1L, 1L);
      assertEquals((-3.8562023435408057), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GTest gTest0 = new GTest();
      double double0 = gTest0.rootLogLikelihoodRatio(2368L, 911L, 2368L, 911L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GTest gTest0 = new GTest();
      // Undeclared exception!
      try { 
        gTest0.rootLogLikelihoodRatio(2047L, 2047L, 0L, 0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero not allowed here
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GTest gTest0 = new GTest();
      // Undeclared exception!
      try { 
        gTest0.rootLogLikelihoodRatio(0L, 0L, 1L, 1L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero not allowed here
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[7];
      long[] longArray1 = new long[9];
      try { 
        gTest0.gTestDataSetsComparison(longArray0, longArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 9
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = 4607182418800019697L;
      longArray0[1] = 4607182418800019697L;
      long[] longArray1 = new long[4];
      longArray1[2] = 4607182418800019697L;
      longArray1[3] = 4607182418800019697L;
      GTest gTest0 = new GTest();
      double double0 = gTest0.gTestDataSetsComparison(longArray1, longArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[4];
      longArray0[0] = 4607182418800019697L;
      longArray0[1] = 4607182418800019697L;
      longArray0[2] = 4607182418800019697L;
      longArray0[3] = 4607182418800019697L;
      boolean boolean0 = gTest0.gTestDataSetsComparison(longArray0, longArray0, 3.149267215638608E-187);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      long[] longArray0 = new long[2];
      GTest gTest0 = new GTest();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 3871L;
      doubleArray0[1] = (double) 3871L;
      boolean boolean0 = gTest0.gTest(doubleArray0, longArray0, Double.NaN);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GTest gTest0 = new GTest();
      double[] doubleArray0 = new double[6];
      long[] longArray0 = new long[5];
      try { 
        gTest0.gTest(doubleArray0, longArray0, 3055.735);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // out of bounds significance level 3,055.735, must be between 0 and 0.5
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      long[] longArray0 = new long[2];
      GTest gTest0 = new GTest();
      double[] doubleArray0 = new double[2];
      try { 
        gTest0.gTest(doubleArray0, longArray0, Double.NaN);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[7];
      double[] doubleArray0 = new double[17];
      try { 
        gTest0.gTest(doubleArray0, longArray0, (double) 0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // out of bounds significance level 0, must be between 0 and 0.5
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GTest gTest0 = new GTest();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 3871L;
      doubleArray0[1] = (double) 3871L;
      long[] longArray0 = new long[2];
      longArray0[0] = 3871L;
      longArray0[1] = 3871L;
      double double0 = gTest0.g(doubleArray0, longArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[5];
      double[] doubleArray0 = new double[3];
      try { 
        gTest0.gTestIntrinsic(doubleArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 5
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GTest gTest0 = new GTest();
      double[] doubleArray0 = new double[0];
      long[] longArray0 = new long[4];
      try { 
        gTest0.g(doubleArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 2
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      GTest gTest0 = new GTest();
      long[] longArray0 = new long[4];
      double[] doubleArray0 = new double[4];
      try { 
        gTest0.gTestIntrinsic(doubleArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      GTest gTest0 = new GTest();
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        gTest0.gTest(doubleArray0, (long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.inference.GTest", e);
      }
  }
}
