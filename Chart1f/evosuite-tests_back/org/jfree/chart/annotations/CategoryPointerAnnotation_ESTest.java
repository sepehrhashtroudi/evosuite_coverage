/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:59:07 GMT 2022
 */

package org.jfree.chart.annotations;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.SystemColor;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CategoryPointerAnnotation_ESTest extends CategoryPointerAnnotation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", (-1292.7117), 0.0);
      SystemColor systemColor0 = SystemColor.menu;
      categoryPointerAnnotation0.setArrowPaint(systemColor0);
      categoryPointerAnnotation0.hashCode();
      assertEquals(3.0, categoryPointerAnnotation0.getLabelOffset(), 0.01);
      assertEquals(30.0, categoryPointerAnnotation0.getBaseRadius(), 0.01);
      assertEquals(10.0, categoryPointerAnnotation0.getTipRadius(), 0.01);
      assertEquals(0.0, categoryPointerAnnotation0.getAngle(), 0.01);
      assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getArrowWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", (-1292.7117), 0.0);
      categoryPointerAnnotation0.setArrowWidth((-1292.7117));
      categoryPointerAnnotation0.hashCode();
      assertEquals((-1292.7117), categoryPointerAnnotation0.getArrowWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", 1762.0, (-1.0));
      assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
      
      categoryPointerAnnotation0.setArrowLength((-1.0));
      categoryPointerAnnotation0.hashCode();
      assertEquals((-1.0), categoryPointerAnnotation0.getArrowLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", (-1803.0), 0.0);
      categoryPointerAnnotation0.setArrowLength(4241.6149);
      categoryPointerAnnotation0.hashCode();
      assertEquals(4241.6149, categoryPointerAnnotation0.getArrowLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation(":O.Fcr+u3DK6jjAVg", ":O.Fcr+u3DK6jjAVg", 2258.968, 1690.5912764035627);
      categoryPointerAnnotation0.setBaseRadius((-507.1979123833027));
      categoryPointerAnnotation0.hashCode();
      assertEquals((-507.1979123833027), categoryPointerAnnotation0.getBaseRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", 0.0, 0.0);
      categoryPointerAnnotation0.setTipRadius((-1752.308958767));
      categoryPointerAnnotation0.hashCode();
      assertEquals((-1752.308958767), categoryPointerAnnotation0.getTipRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("Sf[|/5", "Sf[|/5", (-538.23279227326), 0L);
      categoryPointerAnnotation0.setArrowLength(565.66043891733);
      Object object0 = categoryPointerAnnotation0.clone();
      boolean boolean0 = categoryPointerAnnotation0.equals(object0);
      assertEquals(565.66043891733, categoryPointerAnnotation0.getArrowLength(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("Sf[|/5", "Sf[|/5", (-538.23279227326), 0L);
      categoryPointerAnnotation0.setBaseRadius(549.1294495698604);
      Object object0 = categoryPointerAnnotation0.clone();
      boolean boolean0 = categoryPointerAnnotation0.equals(object0);
      assertEquals(549.1294495698604, categoryPointerAnnotation0.getBaseRadius(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", 0.0, 0.0);
      categoryPointerAnnotation0.setTipRadius(30.0);
      Object object0 = categoryPointerAnnotation0.clone();
      boolean boolean0 = categoryPointerAnnotation0.equals(object0);
      assertEquals(30.0, categoryPointerAnnotation0.getTipRadius(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", (-1803.0), 0.0);
      SystemColor systemColor0 = SystemColor.inactiveCaptionText;
      categoryPointerAnnotation0.setArrowPaint(systemColor0);
      categoryPointerAnnotation0.getArrowPaint();
      assertEquals(30.0, categoryPointerAnnotation0.getBaseRadius(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getLabelOffset(), 0.01);
      assertEquals(10.0, categoryPointerAnnotation0.getTipRadius(), 0.01);
      assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getArrowWidth(), 0.01);
      assertEquals(0.0, categoryPointerAnnotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", (-995.05372), 1968.01);
      assertEquals(10.0, categoryPointerAnnotation0.getTipRadius(), 0.01);
      
      categoryPointerAnnotation0.setTipRadius(0.0);
      double double0 = categoryPointerAnnotation0.getTipRadius();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("ZX<]9[(qyzR(m6y)CB", "ZX<]9[(qyzR(m6y)CB", (-2667.3379070388605), (-2667.3379070388605));
      categoryPointerAnnotation0.setTipRadius((-2667.3379070388605));
      double double0 = categoryPointerAnnotation0.getTipRadius();
      assertEquals((-2667.3379070388605), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", (-495.3776602357), (-495.3776602357));
      assertEquals(3.0, categoryPointerAnnotation0.getLabelOffset(), 0.01);
      
      categoryPointerAnnotation0.setLabelOffset(0.0);
      double double0 = categoryPointerAnnotation0.getLabelOffset();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", (-495.3776602357), (-495.3776602357));
      assertEquals(30.0, categoryPointerAnnotation0.getBaseRadius(), 0.01);
      
      categoryPointerAnnotation0.setBaseRadius(0.0);
      double double0 = categoryPointerAnnotation0.getBaseRadius();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation(":O.Fcr+u3DK6jjAVg", ":O.Fcr+u3DK6jjAVg", 2258.968, 1690.5912764035627);
      categoryPointerAnnotation0.setBaseRadius((-507.1979123833027));
      double double0 = categoryPointerAnnotation0.getBaseRadius();
      assertEquals((-507.1979123833027), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", 0.0, 0.025);
      assertEquals(3.0, categoryPointerAnnotation0.getArrowWidth(), 0.01);
      
      categoryPointerAnnotation0.setArrowWidth(0.0);
      double double0 = categoryPointerAnnotation0.getArrowWidth();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", (-1292.7117), 0.0);
      categoryPointerAnnotation0.setArrowWidth((-1292.7117));
      double double0 = categoryPointerAnnotation0.getArrowWidth();
      assertEquals((-1292.7117), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("b7", "b7", 0.0, 0.0);
      assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
      
      categoryPointerAnnotation0.setArrowLength(0.0);
      double double0 = categoryPointerAnnotation0.getArrowLength();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", 1762.0, (-1.0));
      assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
      
      categoryPointerAnnotation0.setArrowLength((-1.0));
      double double0 = categoryPointerAnnotation0.getArrowLength();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("b7", "b7", 0.0, 0.0);
      double double0 = categoryPointerAnnotation0.getAngle();
      assertEquals(0.0, double0, 0.01);
      assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getArrowWidth(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getLabelOffset(), 0.01);
      assertEquals(10.0, categoryPointerAnnotation0.getTipRadius(), 0.01);
      assertEquals(30.0, categoryPointerAnnotation0.getBaseRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", (-495.3776602357), (-495.3776602357));
      double double0 = categoryPointerAnnotation0.getAngle();
      assertEquals(10.0, categoryPointerAnnotation0.getTipRadius(), 0.01);
      assertEquals((-495.3776602357), double0, 0.01);
      assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getArrowWidth(), 0.01);
      assertEquals(30.0, categoryPointerAnnotation0.getBaseRadius(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getLabelOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("Range", "Range", 0.0, 0.0);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      Rectangle rectangle0 = new Rectangle();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("v4iAYE2Fo");
      LogAxis logAxis0 = new LogAxis();
      // Undeclared exception!
      try { 
        categoryPointerAnnotation0.draw((Graphics2D) null, (CategoryPlot) combinedRangeCategoryPlot0, (Rectangle2D) rectangle0, (CategoryAxis) subCategoryAxis0, (ValueAxis) logAxis0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.annotations.CategoryPointerAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = null;
      try {
        categoryPointerAnnotation0 = new CategoryPointerAnnotation((String) null, 10.0, 3.0, 525.2394);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'text' argument.
         //
         verifyException("org.jfree.chart.annotations.TextAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", 200.0, (-3244.62));
      CategoryPointerAnnotation categoryPointerAnnotation1 = (CategoryPointerAnnotation)categoryPointerAnnotation0.clone();
      boolean boolean0 = categoryPointerAnnotation0.equals(categoryPointerAnnotation1);
      assertEquals(10.0, categoryPointerAnnotation1.getTipRadius(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation1.getLabelOffset(), 0.01);
      assertTrue(boolean0);
      assertEquals(5.0, categoryPointerAnnotation1.getArrowLength(), 0.01);
      assertEquals((-3244.62), categoryPointerAnnotation1.getAngle(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation1.getArrowWidth(), 0.01);
      assertEquals(30.0, categoryPointerAnnotation1.getBaseRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("}", "}", 200.0, (-3244.62));
      CategoryPointerAnnotation categoryPointerAnnotation1 = (CategoryPointerAnnotation)categoryPointerAnnotation0.clone();
      categoryPointerAnnotation1.setBaseRadius(0.0);
      boolean boolean0 = categoryPointerAnnotation0.equals(categoryPointerAnnotation1);
      assertEquals(0.0, categoryPointerAnnotation1.getBaseRadius(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(30.0, 1000000.0);
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", xYDataItem0, 1000000.0, 30.0);
      CategoryPointerAnnotation categoryPointerAnnotation1 = new CategoryPointerAnnotation("", 3.0, 5159.030325989, 30.0);
      boolean boolean0 = categoryPointerAnnotation0.equals(categoryPointerAnnotation1);
      assertEquals(3.0, categoryPointerAnnotation1.getLabelOffset(), 0.01);
      assertEquals(30.0, categoryPointerAnnotation1.getBaseRadius(), 0.01);
      assertEquals(10.0, categoryPointerAnnotation1.getTipRadius(), 0.01);
      assertFalse(boolean0);
      assertEquals(30.0, categoryPointerAnnotation1.getAngle(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation1.getArrowWidth(), 0.01);
      assertEquals(5.0, categoryPointerAnnotation1.getArrowLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("bmsV", "bmsV", 0.0, 1.5707963267948966);
      boolean boolean0 = categoryPointerAnnotation0.equals("bmsV");
      assertEquals(30.0, categoryPointerAnnotation0.getBaseRadius(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getLabelOffset(), 0.01);
      assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
      assertEquals(1.5707963267948966, categoryPointerAnnotation0.getAngle(), 0.01);
      assertEquals(10.0, categoryPointerAnnotation0.getTipRadius(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getArrowWidth(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", 200.0, (-3244.62));
      boolean boolean0 = categoryPointerAnnotation0.equals(categoryPointerAnnotation0);
      assertEquals(3.0, categoryPointerAnnotation0.getArrowWidth(), 0.01);
      assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
      assertEquals(30.0, categoryPointerAnnotation0.getBaseRadius(), 0.01);
      assertTrue(boolean0);
      assertEquals(3.0, categoryPointerAnnotation0.getLabelOffset(), 0.01);
      assertEquals((-3244.62), categoryPointerAnnotation0.getAngle(), 0.01);
      assertEquals(10.0, categoryPointerAnnotation0.getTipRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("i:ra_<;px;B", "i:ra_<;px;B", (-2529.03752), (-2529.03752));
      Object object0 = categoryPointerAnnotation0.clone();
      categoryPointerAnnotation0.setLabelOffset((-2529.03752));
      boolean boolean0 = categoryPointerAnnotation0.equals(object0);
      assertEquals((-2529.03752), categoryPointerAnnotation0.getLabelOffset(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", (-4167.786360588007), 1780.7698196635);
      // Undeclared exception!
      try { 
        categoryPointerAnnotation0.setArrowPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.annotations.CategoryPointerAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", "X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", 3.4028234663852886E38, 3.4028234663852886E38);
      // Undeclared exception!
      try { 
        categoryPointerAnnotation0.setArrowStroke((Stroke) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' not permitted.
         //
         verifyException("org.jfree.chart.annotations.CategoryPointerAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", (-1803.0), 0.0);
      double double0 = categoryPointerAnnotation0.getArrowWidth();
      assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
      assertEquals(30.0, categoryPointerAnnotation0.getBaseRadius(), 0.01);
      assertEquals(3.0, double0, 0.01);
      assertEquals(10.0, categoryPointerAnnotation0.getTipRadius(), 0.01);
      assertEquals(0.0, categoryPointerAnnotation0.getAngle(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getLabelOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("i:ra_<;px;B", "i:ra_<;px;B", (-2529.03752), (-2529.03752));
      double double0 = categoryPointerAnnotation0.getArrowLength();
      assertEquals(3.0, categoryPointerAnnotation0.getArrowWidth(), 0.01);
      assertEquals((-2529.03752), categoryPointerAnnotation0.getAngle(), 0.01);
      assertEquals(30.0, categoryPointerAnnotation0.getBaseRadius(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getLabelOffset(), 0.01);
      assertEquals(10.0, categoryPointerAnnotation0.getTipRadius(), 0.01);
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", "X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", 3.4028234663852886E38, 3.4028234663852886E38);
      categoryPointerAnnotation0.setLabelOffset((-1913.0018209615148));
      double double0 = categoryPointerAnnotation0.getLabelOffset();
      assertEquals((-1913.0018209615148), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", "X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", 3.4028234663852886E38, 3.4028234663852886E38);
      double double0 = categoryPointerAnnotation0.getLabelOffset();
      assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
      assertEquals(10.0, categoryPointerAnnotation0.getTipRadius(), 0.01);
      assertEquals(3.4028234663852886E38, categoryPointerAnnotation0.getAngle(), 0.01);
      assertEquals(30.0, categoryPointerAnnotation0.getBaseRadius(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getArrowWidth(), 0.01);
      assertEquals(3.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("ZX<]9[(qyzR(m6y)CB", "ZX<]9[(qyzR(m6y)CB", (-2667.3379070388605), (-2667.3379070388605));
      double double0 = categoryPointerAnnotation0.getTipRadius();
      assertEquals(30.0, categoryPointerAnnotation0.getBaseRadius(), 0.01);
      assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
      assertEquals((-2667.3379070388605), categoryPointerAnnotation0.getAngle(), 0.01);
      assertEquals(10.0, double0, 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getArrowWidth(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getLabelOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", "X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", 3.4028234663852886E38, 3.4028234663852886E38);
      double double0 = categoryPointerAnnotation0.getAngle();
      assertEquals(10.0, categoryPointerAnnotation0.getTipRadius(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getArrowWidth(), 0.01);
      assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
      assertEquals(3.4028234663852886E38, double0, 0.01);
      assertEquals(30.0, categoryPointerAnnotation0.getBaseRadius(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getLabelOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("ZX<]9[(qyzR(m6y)CB", "ZX<]9[(qyzR(m6y)CB", (-2667.3379070388605), (-2667.3379070388605));
      double double0 = categoryPointerAnnotation0.getBaseRadius();
      assertEquals((-2667.3379070388605), categoryPointerAnnotation0.getAngle(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getArrowWidth(), 0.01);
      assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
      assertEquals(30.0, double0, 0.01);
      assertEquals(10.0, categoryPointerAnnotation0.getTipRadius(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getLabelOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("i:ra_<;px;B", "i:ra_<;px;B", (-2529.03752), (-2529.03752));
      BasicStroke basicStroke0 = (BasicStroke)categoryPointerAnnotation0.getArrowStroke();
      categoryPointerAnnotation0.setArrowStroke(basicStroke0);
      assertEquals(3.0, categoryPointerAnnotation0.getArrowWidth(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getLabelOffset(), 0.01);
      assertEquals(10.0, categoryPointerAnnotation0.getTipRadius(), 0.01);
      assertEquals(30.0, categoryPointerAnnotation0.getBaseRadius(), 0.01);
      assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
      assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
      assertEquals((-2529.03752), categoryPointerAnnotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("i:ra_<;px;B", "i:ra_<;px;B", (-2529.03752), (-2529.03752));
      categoryPointerAnnotation0.setAngle((-2529.03752));
      assertEquals(3.0, categoryPointerAnnotation0.getArrowWidth(), 0.01);
      assertEquals(30.0, categoryPointerAnnotation0.getBaseRadius(), 0.01);
      assertEquals(3.0, categoryPointerAnnotation0.getLabelOffset(), 0.01);
      assertEquals(10.0, categoryPointerAnnotation0.getTipRadius(), 0.01);
      assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
      assertEquals((-2529.03752), categoryPointerAnnotation0.getAngle(), 0.01);
  }
}