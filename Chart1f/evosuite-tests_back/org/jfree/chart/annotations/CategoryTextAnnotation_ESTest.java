/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:55:27 GMT 2022
 */

package org.jfree.chart.annotations;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAnchor;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CategoryTextAnnotation_ESTest extends CategoryTextAnnotation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("hcxHL*e", "hcxHL*e", (-1.0));
      categoryTextAnnotation0.hashCode();
      assertEquals((-1.0), categoryTextAnnotation0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("", "", 1770.292702909);
      categoryTextAnnotation0.hashCode();
      assertEquals(1770.292702909, categoryTextAnnotation0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("s5-Ag^'n", "s5-Ag^'n", (-20.40854537711882));
      categoryTextAnnotation0.setValue(0.0);
      Object object0 = categoryTextAnnotation0.clone();
      categoryTextAnnotation0.setValue((-20.40854537711882));
      boolean boolean0 = categoryTextAnnotation0.equals(object0);
      assertEquals((-20.40854537711882), categoryTextAnnotation0.getValue(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("org.jfree.chart.util.Size2D", "org.jfree.chart.util.Size2D", 2.5E7);
      CategoryTextAnnotation categoryTextAnnotation1 = (CategoryTextAnnotation)categoryTextAnnotation0.clone();
      boolean boolean0 = categoryTextAnnotation0.equals(categoryTextAnnotation1);
      assertTrue(boolean0);
      assertEquals(2.5E7, categoryTextAnnotation1.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("]);\"", "]);\"", (-591.7990890392168), (-591.7990890392168));
      categoryPointerAnnotation0.setValue(742.8972);
      double double0 = categoryPointerAnnotation0.getValue();
      assertEquals(742.8972, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("]);\"", "]);\"", (-591.7990890392168), (-591.7990890392168));
      double double0 = categoryPointerAnnotation0.getValue();
      assertEquals((-591.7990890392168), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", (-2845.0), (-1159.114));
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      Point point0 = new Point(0, 10);
      Rectangle rectangle0 = new Rectangle(point0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("T'ww!");
      NumberAxis numberAxis0 = new NumberAxis("");
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        categoryPointerAnnotation0.draw((Graphics2D) null, combinedRangeCategoryPlot0, rectangle0, subCategoryAxis0, numberAxis0, 0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.annotations.CategoryTextAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("", "", 0.0);
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", 0.0, 0.0, 0.0);
      boolean boolean0 = categoryTextAnnotation0.equals(categoryPointerAnnotation0);
      assertFalse(boolean0);
      assertEquals(0.0, categoryPointerAnnotation0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("s5-Ag^'n", "s5-Ag^'n", 0.0);
      categoryTextAnnotation0.setValue((-14.798297721011313));
      Object object0 = categoryTextAnnotation0.clone();
      assertEquals((-14.798297721011313), categoryTextAnnotation0.getValue(), 0.01);
      
      categoryTextAnnotation0.setValue(0.0);
      boolean boolean0 = categoryTextAnnotation0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("]);\"", "]);\"", (-591.7990890392168), (-591.7990890392168));
      CategoryAnchor categoryAnchor0 = CategoryAnchor.START;
      Object object0 = categoryPointerAnnotation0.clone();
      assertTrue(object0.equals((Object)categoryPointerAnnotation0));
      
      categoryPointerAnnotation0.setCategoryAnchor(categoryAnchor0);
      boolean boolean0 = categoryPointerAnnotation0.equals(object0);
      assertFalse(object0.equals((Object)categoryPointerAnnotation0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("z$V0NX{b>+%>mf5V", "z$V0NX{b>+%>mf5V", 7.0);
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("}'NnR8]^", "z$V0NX{b>+%>mf5V", 1188.0, 20.0);
      boolean boolean0 = categoryTextAnnotation0.equals(categoryPointerAnnotation0);
      assertEquals(1188.0, categoryPointerAnnotation0.getValue(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("s5-Ag^'n", "s5-Ag^'n", 0.0);
      boolean boolean0 = categoryTextAnnotation0.equals(categoryTextAnnotation0);
      assertEquals(0.0, categoryTextAnnotation0.getValue(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("]@", "]@", 986L, 2104.64);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      String[] stringArray0 = new String[2];
      SymbolAxis symbolAxis0 = new SymbolAxis("]@", stringArray0);
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultStatisticalCategoryDataset0, categoryAxis0, symbolAxis0, statisticalLineAndShapeRenderer0);
      JFreeChart jFreeChart0 = new JFreeChart("]@", categoryPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        categoryPointerAnnotation0.draw((Graphics2D) null, categoryPlot0, (Rectangle2D) null, categoryAxis0, symbolAxis0, 2011552316, plotRenderingInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid category index: -1
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", 0.0, 1408.470569);
      // Undeclared exception!
      try { 
        categoryPointerAnnotation0.setCategoryAnchor((CategoryAnchor) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.annotations.CategoryTextAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation(":QW|_", ":QW|_", 0.0, 0.0);
      CategoryAnchor categoryAnchor0 = categoryPointerAnnotation0.getCategoryAnchor();
      categoryPointerAnnotation0.setCategoryAnchor(categoryAnchor0);
      assertEquals(0.0, categoryPointerAnnotation0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("org.jfree.data.category.CategoryToPieDataset", "org.jfree.data.category.CategoryToPieDataset", 0.0, 0.0);
      // Undeclared exception!
      try { 
        categoryPointerAnnotation0.setCategory((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'category' argument.
         //
         verifyException("org.jfree.chart.annotations.CategoryTextAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation(":QW|_", ":QW|_", 0.0, 0.0);
      Comparable comparable0 = categoryPointerAnnotation0.getCategory();
      categoryPointerAnnotation0.setCategory(comparable0);
      assertEquals(0.0, categoryPointerAnnotation0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CategoryTextAnnotation categoryTextAnnotation0 = null;
      try {
        categoryTextAnnotation0 = new CategoryTextAnnotation("Invalid category index: ", (Comparable) null, (-7.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'category' argument.
         //
         verifyException("org.jfree.chart.annotations.CategoryTextAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("s5-Ag^'n", "s5-Ag^'n", 0.0);
      double double0 = categoryTextAnnotation0.getValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("s5-Ag^'n", "s5-Ag^'n", 0.0);
      Comparable comparable0 = categoryTextAnnotation0.getCategory();
      boolean boolean0 = categoryTextAnnotation0.equals(comparable0);
      assertFalse(boolean0);
      assertEquals(0.0, categoryTextAnnotation0.getValue(), 0.01);
  }
}