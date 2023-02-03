/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:40:48 GMT 2022
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.jfree.data.Range;
import org.jfree.data.xy.CategoryTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CategoryTableXYDataset_ESTest extends CategoryTableXYDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.getStartY(0, 4591);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4591, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.setIntervalPositionFactor(0.0);
      assertEquals(0.0, categoryTableXYDataset0.getIntervalPositionFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.setIntervalWidth(849.6720104535905);
      boolean boolean0 = categoryTableXYDataset0.isAutoWidth();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(0.0, 0.0, "Can't evaluate the year.");
      Number number0 = categoryTableXYDataset0.getY(0, 0);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add((double) 0, 2042.1815729448626, "OL.YtT/#8=>fZ8/Z");
      Number number0 = categoryTableXYDataset0.getY(0, 0);
      assertEquals(2042.1815729448626, number0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(0.0, 0.0, "");
      Number number0 = categoryTableXYDataset0.getX(0, 0);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(1.0, (-2414.4768), "'_@K_bDo7dM655M!5O");
      Number number0 = categoryTableXYDataset0.getX(0, 0);
      assertEquals(1.0, number0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add((-5.5248071009991975), (-2414.4768), "'_@K_bDo7dM655M!5O");
      Number number0 = categoryTableXYDataset0.getX(0, 0);
      assertEquals((-5.5248071009991975), number0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      Long long0 = new Long(0);
      categoryTableXYDataset0.add((Number) long0, (Number) long0, "", false);
      Number number0 = categoryTableXYDataset0.getStartY(0, 0);
      assertEquals(0L, number0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(1.0, (-2414.4768), "'_@K_bDo7dM655M!5O");
      Number number0 = categoryTableXYDataset0.getStartY(0, 0);
      assertEquals((-2414.4768), number0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(0.0, 0.0, "Can't evaluate the year.");
      categoryTableXYDataset0.setIntervalWidth(0.0);
      Number number0 = categoryTableXYDataset0.getStartX(0, 0);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(0.0, 0.0, "Can't evaluate the year.");
      Number number0 = categoryTableXYDataset0.getStartX(0, 0);
      assertEquals((-0.5), number0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(2.0, 2.0, "1%v$.2+-H4[M4d-'t2.");
      Number number0 = categoryTableXYDataset0.getStartX((-4603), 0);
      assertEquals(1.5, number0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add((-518.97842), (-334.567859627095), "");
      Number number0 = categoryTableXYDataset0.getStartX(0, 0);
      assertEquals((-519.47842), number0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(0.0, 0.0, "");
      Comparable comparable0 = categoryTableXYDataset0.getSeriesKey(0);
      assertEquals("", comparable0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(Double.NaN, Double.NaN, "(L");
      int int0 = categoryTableXYDataset0.getSeriesCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      categoryTableXYDataset0.add((Number) integer0, (Number) integer0, "org.jfree.data.ComparableObjectItem", false);
      int int0 = categoryTableXYDataset0.getItemCount(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(2.0, 2.0, "1%v$.2+-H4[M4d-'t2.");
      int int0 = categoryTableXYDataset0.getItemCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.setIntervalWidth(0.0);
      double double0 = categoryTableXYDataset0.getIntervalWidth();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      categoryTableXYDataset0.add((Number) integer0, (Number) integer0, "", false);
      Number number0 = categoryTableXYDataset0.getEndY(0, 0);
      assertEquals((-30000), number0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(0.0, 0.0, "");
      Number number0 = categoryTableXYDataset0.getEndY(0, 0);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(0.0, 146.346027, "Unrecognised rowKey: ");
      Number number0 = categoryTableXYDataset0.getEndX((-1), 0);
      assertEquals(0.5, number0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(0.0, 0.0, "");
      categoryTableXYDataset0.setIntervalWidth(2167);
      Number number0 = categoryTableXYDataset0.getEndX(213, 0);
      assertEquals(1083.5, number0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      categoryTableXYDataset0.add((Number) integer0, (Number) integer0, "", false);
      Number number0 = categoryTableXYDataset0.getEndX(0, 0);
      assertEquals((-29999.5), number0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(0.0, 0.0, "Can't evaluate the year.");
      categoryTableXYDataset0.setIntervalWidth(0.0);
      categoryTableXYDataset0.getDomainUpperBound(true);
      assertEquals(0.0, categoryTableXYDataset0.getIntervalWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(1.0, (-2414.4768), "'_@K_bDo7dM655M!5O");
      double double0 = categoryTableXYDataset0.getDomainUpperBound(true);
      assertEquals(1.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      categoryTableXYDataset0.add((Number) integer0, (Number) integer0, "org.jfree.data.ComparableObjectItem", false);
      double double0 = categoryTableXYDataset0.getDomainUpperBound(false);
      assertEquals((-30000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(0.0, 0.0, "'*8+[u|K&");
      double double0 = categoryTableXYDataset0.getDomainLowerBound(false);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      BigInteger bigInteger0 = BigInteger.TEN;
      categoryTableXYDataset0.add((Number) bigInteger0, (Number) bigInteger0, "", true);
      double double0 = categoryTableXYDataset0.getDomainLowerBound(true);
      assertEquals(9.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      categoryTableXYDataset0.add((Number) integer0, (Number) integer0, "org.jfree.data.ComparableObjectItem", false);
      double double0 = categoryTableXYDataset0.getDomainLowerBound(false);
      assertEquals((-30000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(0.0, 0.0, "");
      Range range0 = categoryTableXYDataset0.getDomainBounds(false);
      assertEquals(0.0, range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      categoryTableXYDataset0.add((Number) integer0, (Number) integer0, "", false);
      Range range0 = categoryTableXYDataset0.getDomainBounds(false);
      assertEquals((-30000.0), range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.remove((Number) null, "d^!qo]LkRB", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.add(0.0, 0.0, "'b#5lH&YjPH5&N{#ARs");
      Float float0 = new Float((float) 2810);
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.remove((Number) float0, "'b#5lH&YjPH5&N{#ARs", true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Float cannot be cast to java.lang.Double
         //
         verifyException("java.lang.Double", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.remove((-203.45472), (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      BigInteger bigInteger0 = BigInteger.TEN;
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      categoryTableXYDataset0.add((Number) bigInteger0, (Number) integer0, "", false);
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.remove((-2.147483648E9), "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Double cannot be cast to java.math.BigInteger
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.getY(0, (-3498));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.getX((-508), (-508));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.getStartY((-3079), (-3079));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.getStartX(0, 31);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 31, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.getSeriesKey((-1940));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.getEndY((-1452), (-3521));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.getEndX(17, 17);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 17, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.add((Number) null, (Number) null, "yzYZ[NbC{}~ jf]5", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      Integer integer0 = new Integer(0);
      categoryTableXYDataset0.add(0.0, 0.0, "Can't evaluate the year.");
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.add((Number) integer0, (Number) integer0, "? WBW()Y", true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Double
         //
         verifyException("java.lang.Double", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.add(0.0, 0.0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      Integer integer0 = new Integer(0);
      categoryTableXYDataset0.add((Number) integer0, (Number) integer0, "'_@K_bDo7dM655M!5O", false);
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.add((double) 0, (-2414.4768), "'_@K_bDo7dM655M!5O");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Double cannot be cast to java.lang.Integer
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      Range range0 = categoryTableXYDataset0.getDomainBounds(false);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      categoryTableXYDataset0.remove((Number) integer0, "5g@rN<-z4^", true);
      assertEquals(1.0, categoryTableXYDataset0.getIntervalWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      BigInteger bigInteger0 = BigInteger.TEN;
      categoryTableXYDataset0.add((Number) bigInteger0, (Number) bigInteger0, "", true);
      Range range0 = categoryTableXYDataset0.getDomainBounds(true);
      assertEquals(1.0, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      double double0 = categoryTableXYDataset0.getIntervalPositionFactor();
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      boolean boolean0 = categoryTableXYDataset0.isAutoWidth();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      double double0 = categoryTableXYDataset0.getIntervalWidth();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      int int0 = categoryTableXYDataset0.getSeriesCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      int int0 = categoryTableXYDataset0.getItemCount(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      int int0 = categoryTableXYDataset0.getItemCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.getX(274, 274);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 274, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.setIntervalWidth(0.0);
      Object object0 = categoryTableXYDataset0.clone();
      categoryTableXYDataset0.setAutoWidth(true);
      boolean boolean0 = categoryTableXYDataset0.equals(object0);
      assertEquals(0.0, categoryTableXYDataset0.getIntervalWidth(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      Object object0 = new Object();
      boolean boolean0 = categoryTableXYDataset0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      boolean boolean0 = categoryTableXYDataset0.equals(categoryTableXYDataset0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      MockRandom mockRandom0 = new MockRandom();
      BigInteger bigInteger0 = new BigInteger(373, mockRandom0);
      categoryTableXYDataset0.remove((Number) bigInteger0, "", false);
      assertEquals((byte)0, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      categoryTableXYDataset0.add((Number) integer0, (Number) integer0, "", false);
      Number number0 = categoryTableXYDataset0.getEndY(0, 0);
      assertEquals(400, number0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.remove((double) 0, "");
      assertEquals(0, categoryTableXYDataset0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.getSeriesKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.getEndY(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.setIntervalWidth((-1214));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'w' argument.
         //
         verifyException("org.jfree.data.xy.IntervalXYDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.getStartX(0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.setIntervalPositionFactor((-3198.462823655367));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument 'd' outside valid range.
         //
         verifyException("org.jfree.data.xy.IntervalXYDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.getEndX((-4988), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      // Undeclared exception!
      try { 
        categoryTableXYDataset0.getY((-918), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      CategoryTableXYDataset categoryTableXYDataset1 = (CategoryTableXYDataset)categoryTableXYDataset0.clone();
      assertTrue(categoryTableXYDataset1.equals((Object)categoryTableXYDataset0));
      
      categoryTableXYDataset1.add(0.8, (double) 1620, "org.jfree.data.xy.CategoryTableXYDataset");
      boolean boolean0 = categoryTableXYDataset0.equals(categoryTableXYDataset1);
      assertFalse(boolean0);
  }
}
