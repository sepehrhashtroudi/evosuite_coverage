/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:43:39 GMT 2022
 */

package org.apache.commons.math3.random;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well44497b;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BitsStreamGenerator_ESTest extends BitsStreamGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom();
      try { 
        iSAACRandom0.nextLong((-4435567798854367253L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -4,435,567,798,854,367,253 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.random.BitsStreamGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(16);
      int int0 = mersenneTwister0.nextInt(2184);
      assertEquals(1452, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom();
      try { 
        iSAACRandom0.nextInt(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.random.BitsStreamGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom();
      byte[] byteArray0 = new byte[3];
      iSAACRandom0.nextBytes(byteArray0);
      assertArrayEquals(new byte[] {(byte)6, (byte)85, (byte)50}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(16);
      int[] intArray0 = new int[2];
      mersenneTwister0.setSeed(intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom(3289L);
      iSAACRandom0.setSeed(3289L);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(913L);
      mersenneTwister0.setSeed(0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a(551);
      long long0 = well44497a0.nextLong(1L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[19];
      Well512a well512a0 = new Well512a(intArray0);
      long long0 = well512a0.nextLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[18];
      Well512a well512a0 = new Well512a(intArray0);
      int int0 = well512a0.nextInt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom();
      double double0 = iSAACRandom0.nextGaussian();
      assertEquals((-1.176815673602442), double0, 0.01);
      
      int int0 = iSAACRandom0.nextInt();
      assertEquals(1501046743, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(913L);
      double double0 = mersenneTwister0.nextGaussian();
      assertEquals(1.426284946800705, double0, 0.01);
      
      long long0 = mersenneTwister0.nextLong();
      assertEquals((-4435567798854367253L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[19];
      Well512a well512a0 = new Well512a(intArray0);
      float float0 = well512a0.nextFloat();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a();
      well19937a0.index = 2295;
      // Undeclared exception!
      try { 
        well19937a0.nextLong(81L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2295
         //
         verifyException("org.apache.commons.math3.random.Well19937a", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a((-461));
      well44497a0.index = (-461);
      // Undeclared exception!
      try { 
        well44497a0.nextLong();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -461
         //
         verifyException("org.apache.commons.math3.random.Well44497a", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a(1763L);
      well1024a0.index = 1036;
      // Undeclared exception!
      try { 
        well1024a0.nextInt(8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1036
         //
         verifyException("org.apache.commons.math3.random.Well1024a", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[4];
      Well512a well512a0 = new Well512a(intArray0);
      well512a0.index = 460;
      // Undeclared exception!
      try { 
        well512a0.nextInt();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 460
         //
         verifyException("org.apache.commons.math3.random.Well512a", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Well512a well512a0 = new Well512a((-1613L));
      well512a0.index = (-1211);
      // Undeclared exception!
      try { 
        well512a0.nextGaussian();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1211
         //
         verifyException("org.apache.commons.math3.random.Well512a", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b();
      well44497b0.index = (-2147483647);
      // Undeclared exception!
      try { 
        well44497b0.nextFloat();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147483647
         //
         verifyException("org.apache.commons.math3.random.Well44497b", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b(1689);
      well44497b0.index = (-871);
      // Undeclared exception!
      try { 
        well44497b0.nextDouble();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -871
         //
         verifyException("org.apache.commons.math3.random.Well44497b", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(710L);
      // Undeclared exception!
      try { 
        mersenneTwister0.nextBytes((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.random.BitsStreamGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a(0);
      byte[] byteArray0 = new byte[4];
      well44497a0.index = 3836;
      // Undeclared exception!
      try { 
        well44497a0.nextBytes(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3836
         //
         verifyException("org.apache.commons.math3.random.Well44497a", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      well19937c0.index = 893;
      // Undeclared exception!
      try { 
        well19937c0.nextBoolean();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 893
         //
         verifyException("org.apache.commons.math3.random.Well19937c", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom();
      iSAACRandom0.clear();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(8691791132075152054L);
      long long0 = mersenneTwister0.nextLong(8691791132075152054L);
      assertEquals(7255732897488154475L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a(0L);
      try { 
        well1024a0.nextLong(0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.random.BitsStreamGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[18];
      ISAACRandom iSAACRandom0 = new ISAACRandom(intArray0);
      int int0 = iSAACRandom0.nextInt(1289242367);
      assertEquals(153044675, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a(0);
      try { 
        well1024a0.nextInt((-918));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -918 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.random.BitsStreamGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int[] intArray0 = new int[18];
      ISAACRandom iSAACRandom0 = new ISAACRandom(intArray0);
      double double0 = iSAACRandom0.nextGaussian();
      assertEquals((-0.3655064004836672), double0, 0.01);
      
      double double1 = iSAACRandom0.nextGaussian();
      assertEquals((-0.2900671754348562), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = new int[0];
      Well44497a well44497a0 = new Well44497a(intArray0);
      byte[] byteArray0 = new byte[17];
      well44497a0.nextBytes(byteArray0);
      assertEquals(17, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(0);
      byte[] byteArray0 = new byte[8];
      mersenneTwister0.nextBytes(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-84), (byte)10, (byte)127, (byte) (-116), (byte)47, (byte) (-86), (byte) (-60), (byte) (-105)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[6];
      Well44497a well44497a0 = new Well44497a(intArray0);
      int int0 = well44497a0.nextInt(1);
      assertEquals(0, int0);
      
      boolean boolean0 = well44497a0.nextBoolean();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(0);
      mersenneTwister0.setSeed(0L);
      boolean boolean0 = mersenneTwister0.nextBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(0);
      float float0 = mersenneTwister0.nextFloat();
      assertEquals(0.54881346F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a((long) 255);
      int int0 = well44497a0.nextInt();
      assertEquals((-1451916401), int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int[] intArray0 = new int[6];
      Well44497a well44497a0 = new Well44497a(intArray0);
      double double0 = well44497a0.nextDouble();
      assertEquals(0.12180280139477295, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(16);
      long long0 = mersenneTwister0.nextLong();
      assertEquals(4118993386250157294L, long0);
  }
}