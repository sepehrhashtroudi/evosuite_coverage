/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:11:23 GMT 2022
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.DefaultKeyedValues2D;
import org.jfree.data.KeyedValues;
import org.jfree.data.Values2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataUtilities_ESTest extends DataUtilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      defaultKeyedValues0.setValue(comparable1, 657.0364451);
      defaultKeyedValues0.addValue(comparable0, 2162.8);
      KeyedValues keyedValues0 = DataUtilities.getCumulativePercentages(defaultKeyedValues0);
      assertEquals(2, keyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(false);
      int[] intArray0 = new int[8];
      intArray0[0] = 18;
      double double0 = DataUtilities.calculateRowTotal((Values2D) defaultKeyedValues2D0, 18, intArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      int[] intArray0 = new int[1];
      intArray0[0] = 1;
      double double0 = DataUtilities.calculateColumnTotal((Values2D) defaultKeyedValues2D0, 1, intArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[7][0];
      double[][] doubleArray1 = new double[1][8];
      boolean boolean0 = DataUtilities.equal(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[0][3];
      Number[][] numberArray0 = DataUtilities.createNumberArray2D(doubleArray0);
      assertEquals(0, numberArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[0][2];
      double[][] doubleArray1 = DataUtilities.clone(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Float float0 = new Float(1977.2F);
      defaultKeyedValues2D0.setValue(float0, float0, float0);
      double double0 = DataUtilities.calculateColumnTotal((Values2D) defaultKeyedValues2D0, 0);
      assertEquals(1977.199951171875, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        DataUtilities.calculateRowTotal((Values2D) defaultKeyedValues2D0, (-3800), (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.DataUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      int[] intArray0 = new int[7];
      intArray0[0] = (-1);
      // Undeclared exception!
      try { 
        DataUtilities.calculateRowTotal((Values2D) defaultKeyedValues2D0, (-1), intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Byte byte0 = new Byte((byte)1);
      defaultKeyedValues2D0.setValue(byte0, byte0, byte0);
      // Undeclared exception!
      try { 
        DataUtilities.calculateRowTotal((Values2D) defaultKeyedValues2D0, (-18));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(false);
      // Undeclared exception!
      try { 
        DataUtilities.calculateColumnTotal((Values2D) defaultKeyedValues2D0, 0, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.DataUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      int[] intArray0 = new int[1];
      Long long0 = new Long(3564);
      defaultKeyedValues2D0.setValue(long0, long0, long0);
      // Undeclared exception!
      try { 
        DataUtilities.calculateColumnTotal((Values2D) defaultKeyedValues2D0, 3564, intArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3564, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      defaultKeyedValues2D0.setValue(0.0, (-226.62119), 0.0);
      // Undeclared exception!
      try { 
        DataUtilities.calculateColumnTotal((Values2D) defaultKeyedValues2D0, (-417));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      defaultKeyedValues0.setValue(comparable0, (Number) null);
      KeyedValues keyedValues0 = DataUtilities.getCumulativePercentages(defaultKeyedValues0);
      assertEquals(1, keyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        DataUtilities.getCumulativePercentages((KeyedValues) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'data' argument.
         //
         verifyException("org.jfree.data.DataUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      KeyedValues keyedValues0 = DataUtilities.getCumulativePercentages(defaultKeyedValues0);
      assertTrue(keyedValues0.equals((Object)defaultKeyedValues0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        DataUtilities.createNumberArray2D((double[][]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'data' argument.
         //
         verifyException("org.jfree.data.DataUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[][] doubleArray0 = new double[13][3];
      Number[][] numberArray0 = DataUtilities.createNumberArray2D(doubleArray0);
      assertEquals(13, numberArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      Number[] numberArray0 = DataUtilities.createNumberArray(doubleArray0);
      assertEquals(5, numberArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        DataUtilities.createNumberArray((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'data' argument.
         //
         verifyException("org.jfree.data.DataUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Number[] numberArray0 = DataUtilities.createNumberArray(doubleArray0);
      assertEquals(0, numberArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(false);
      int[] intArray0 = new int[8];
      intArray0[1] = (-3283);
      // Undeclared exception!
      try { 
        DataUtilities.calculateRowTotal((Values2D) defaultKeyedValues2D0, 18, intArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 18, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        DataUtilities.calculateRowTotal((Values2D) null, (-1510), intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'data' argument.
         //
         verifyException("org.jfree.data.DataUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      Byte byte0 = new Byte((byte)1);
      defaultKeyedValues2D0.setValue(byte0, byte0, byte0);
      double double0 = DataUtilities.calculateRowTotal((Values2D) defaultKeyedValues2D0, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Double double0 = new Double((-1.0));
      defaultKeyedValues2D0.addValue(double0, double0, double0);
      // Undeclared exception!
      try { 
        DataUtilities.calculateRowTotal((Values2D) defaultKeyedValues2D0, 23);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 23, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        DataUtilities.calculateRowTotal((Values2D) null, 1048);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'data' argument.
         //
         verifyException("org.jfree.data.DataUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(false);
      double double0 = DataUtilities.calculateRowTotal((Values2D) defaultKeyedValues2D0, (-3283));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      int[] intArray0 = new int[2];
      intArray0[1] = (-3);
      // Undeclared exception!
      try { 
        DataUtilities.calculateColumnTotal((Values2D) defaultKeyedValues2D0, 3271, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        DataUtilities.calculateColumnTotal((Values2D) null, 0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'data' argument.
         //
         verifyException("org.jfree.data.DataUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Double double0 = new Double((-1.0));
      defaultKeyedValues2D0.addValue(double0, double0, double0);
      double double1 = DataUtilities.calculateColumnTotal((Values2D) defaultKeyedValues2D0, 0);
      assertEquals((-1.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      defaultKeyedValues2D0.setValue((-197.8619416941979), 0.0, 0.0);
      // Undeclared exception!
      try { 
        DataUtilities.calculateColumnTotal((Values2D) defaultKeyedValues2D0, 3271);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3271, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        DataUtilities.calculateColumnTotal((Values2D) null, (-1380));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'data' argument.
         //
         verifyException("org.jfree.data.DataUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      double double0 = DataUtilities.calculateColumnTotal((Values2D) defaultKeyedValues2D0, 3271);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        DataUtilities.clone((double[][]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'source' argument.
         //
         verifyException("org.jfree.data.DataUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[][] doubleArray0 = new double[13][3];
      double[][] doubleArray1 = DataUtilities.clone(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[][] doubleArray0 = new double[6][7];
      double[][] doubleArray1 = new double[6][5];
      boolean boolean0 = DataUtilities.equal(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[][] doubleArray0 = new double[13][3];
      double[][] doubleArray1 = new double[8][5];
      boolean boolean0 = DataUtilities.equal(doubleArray1, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[][] doubleArray0 = new double[1][8];
      boolean boolean0 = DataUtilities.equal(doubleArray0, (double[][]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean boolean0 = DataUtilities.equal((double[][]) null, (double[][]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[][] doubleArray0 = new double[1][8];
      boolean boolean0 = DataUtilities.equal((double[][]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      boolean boolean0 = DataUtilities.equal(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }
}
