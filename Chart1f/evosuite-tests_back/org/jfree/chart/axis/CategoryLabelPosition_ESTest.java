/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 22:33:42 GMT 2022
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CategoryLabelPosition;
import org.jfree.chart.axis.CategoryLabelWidthType;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.text.TextBlockAnchor;
import org.jfree.chart.util.RectangleAnchor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CategoryLabelPosition_ESTest extends CategoryLabelPosition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_RIGHT;
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_RIGHT;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 0.0, categoryLabelWidthType0, 0.0F);
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 0.0, categoryLabelWidthType0, 1.0F);
      boolean boolean0 = categoryLabelPosition0.equals(categoryLabelPosition1);
      assertFalse(categoryLabelPosition1.equals((Object)categoryLabelPosition0));
      assertEquals(0.0, categoryLabelPosition1.getAngle(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_CENTER;
      TextAnchor textAnchor0 = TextAnchor.CENTER;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, (-547.7301348273), categoryLabelWidthType0, 104.8F);
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, categoryLabelWidthType0, 0.0F);
      boolean boolean0 = categoryLabelPosition0.equals(categoryLabelPosition1);
      assertFalse(boolean0);
      assertEquals(0.0, categoryLabelPosition1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_RIGHT;
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_RIGHT;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 0.0, categoryLabelWidthType0, 0.0F);
      float float0 = categoryLabelPosition0.getWidthRatio();
      assertEquals(0.0, categoryLabelPosition0.getAngle(), 0.01);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_RIGHT;
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_LEFT;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 553.0971012581, categoryLabelWidthType0, (-1.0F));
      float float0 = categoryLabelPosition0.getWidthRatio();
      assertEquals(553.0971012581, categoryLabelPosition0.getAngle(), 0.01);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_RIGHT;
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_CENTER;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 1.0, categoryLabelWidthType0, 1.0F);
      double double0 = categoryLabelPosition0.getAngle();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_CENTER;
      TextAnchor textAnchor0 = TextAnchor.CENTER;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, (-547.7301348273), categoryLabelWidthType0, 104.8F);
      double double0 = categoryLabelPosition0.getAngle();
      assertEquals((-547.7301348273), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_CENTER;
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_CENTER;
      CategoryLabelPosition categoryLabelPosition0 = null;
      try {
        categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, (-1.0), (CategoryLabelWidthType) null, 0.0F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'widthType' argument.
         //
         verifyException("org.jfree.chart.axis.CategoryLabelPosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      TextAnchor textAnchor0 = TextAnchor.CENTER;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelPosition categoryLabelPosition0 = null;
      try {
        categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, (TextBlockAnchor) null, textAnchor0, (-837.61130271501), categoryLabelWidthType0, 1.0F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelAnchor' argument.
         //
         verifyException("org.jfree.chart.axis.CategoryLabelPosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_LEFT;
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_CENTER;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelPosition categoryLabelPosition0 = null;
      try {
        categoryLabelPosition0 = new CategoryLabelPosition((RectangleAnchor) null, textBlockAnchor0, textAnchor0, 0.0, categoryLabelWidthType0, (-3390.5F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'categoryAnchor' argument.
         //
         verifyException("org.jfree.chart.axis.CategoryLabelPosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition();
      boolean boolean0 = categoryLabelPosition0.equals(categoryLabelPosition1);
      assertTrue(boolean0);
      assertEquals(0.0, categoryLabelPosition1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_CENTER;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0);
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, categoryLabelWidthType0, 0.0F);
      boolean boolean0 = categoryLabelPosition0.equals(categoryLabelPosition1);
      assertFalse(boolean0);
      assertEquals(0.0, categoryLabelPosition1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_LEFT;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0);
      CategoryLabelWidthType categoryLabelWidthType0 = categoryLabelPosition0.getWidthType();
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, categoryLabelWidthType0, 0.0F);
      boolean boolean0 = categoryLabelPosition0.equals(categoryLabelPosition1);
      assertFalse(boolean0);
      assertEquals(0.0, categoryLabelPosition1.getAngle(), 0.01);
      assertFalse(categoryLabelPosition1.equals((Object)categoryLabelPosition0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_RIGHT;
      TextAnchor textAnchor0 = TextAnchor.BASELINE_CENTER;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 2350.1, categoryLabelWidthType0, (-1.0F));
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0);
      boolean boolean0 = categoryLabelPosition0.equals(categoryLabelPosition1);
      assertEquals(0.0, categoryLabelPosition1.getAngle(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, categoryLabelWidthType0, (-1.0F));
      TextAnchor textAnchor0 = categoryLabelPosition0.getRotationAnchor();
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, (-1.0F), categoryLabelWidthType0, (-1.0F));
      boolean boolean0 = categoryLabelPosition0.equals(categoryLabelPosition1);
      assertEquals((-1.0), categoryLabelPosition1.getAngle(), 0.01);
      assertFalse(categoryLabelPosition1.equals((Object)categoryLabelPosition0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, categoryLabelWidthType0, (-1.0F));
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition();
      boolean boolean0 = categoryLabelPosition0.equals(categoryLabelPosition1);
      assertEquals(0.0, categoryLabelPosition1.getAngle(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      boolean boolean0 = categoryLabelPosition0.equals(categoryLabelPosition0);
      assertEquals(0.0, categoryLabelPosition0.getAngle(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_CENTER;
      CategoryLabelPosition categoryLabelPosition0 = null;
      try {
        categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, (CategoryLabelWidthType) null, 0.0F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'widthType' argument.
         //
         verifyException("org.jfree.chart.axis.CategoryLabelPosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_RIGHT;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      CategoryLabelPosition categoryLabelPosition0 = null;
      try {
        categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, (TextAnchor) null, 40.85, categoryLabelWidthType0, (-0.39938545F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rotationAnchor' argument.
         //
         verifyException("org.jfree.chart.axis.CategoryLabelPosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      TextBlockAnchor textBlockAnchor0 = categoryLabelPosition0.getLabelAnchor();
      boolean boolean0 = categoryLabelPosition0.equals(textBlockAnchor0);
      assertFalse(boolean0);
      assertEquals(0.0, categoryLabelPosition0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      categoryLabelPosition0.hashCode();
      assertEquals(0.0, categoryLabelPosition0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      RectangleAnchor rectangleAnchor0 = categoryLabelPosition0.getCategoryAnchor();
      TextAnchor textAnchor0 = categoryLabelPosition0.getRotationAnchor();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER_LEFT;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 0.0, categoryLabelWidthType0, 0.0F);
      boolean boolean0 = categoryLabelPosition0.equals(categoryLabelPosition1);
      assertFalse(boolean0);
      assertEquals(0.0, categoryLabelPosition1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM;
      CategoryLabelPosition categoryLabelPosition0 = null;
      try {
        categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, (TextBlockAnchor) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelAnchor' argument.
         //
         verifyException("org.jfree.chart.axis.CategoryLabelPosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      float float0 = categoryLabelPosition0.getWidthRatio();
      assertEquals(0.0, categoryLabelPosition0.getAngle(), 0.01);
      assertEquals(0.95F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      double double0 = categoryLabelPosition0.getAngle();
      assertEquals(0.0, double0, 0.01);
  }
}
