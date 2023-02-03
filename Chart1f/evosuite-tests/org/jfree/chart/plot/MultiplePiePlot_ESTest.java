/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 01:21:53 GMT 2022
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiplePiePlot_ESTest extends MultiplePiePlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultBoxAndWhiskerCategoryDataset0);
      ChartPanel chartPanel0 = new ChartPanel((JFreeChart) null, false);
      Rectangle rectangle0 = chartPanel0.getVisibleRect();
      multiplePiePlot0.setLegendItemShape(rectangle0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      multiplePiePlot0.setAggregatedItemsPaint(spiderWebPlot0.DEFAULT_LABEL_OUTLINE_PAINT);
      Color color0 = (Color)multiplePiePlot0.getAggregatedItemsPaint();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      assertEquals(0, color0.getGreen());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.setLimit(12);
      double double0 = multiplePiePlot0.getLimit();
      assertEquals(12.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultBoxAndWhiskerCategoryDataset0);
      multiplePiePlot0.getDataset();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[8];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      // Undeclared exception!
      try { 
        multiplePiePlot0.getLegendItems();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      Point point0 = new Point((-2222), 365);
      PlotState plotState0 = new PlotState();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        multiplePiePlot0.draw((Graphics2D) null, (Rectangle2D) null, point0, plotState0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.setDrawingSupplier((DrawingSupplier) null);
      // Undeclared exception!
      try { 
        multiplePiePlot0.clone();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'object' argument.
         //
         verifyException("org.jfree.chart.util.ObjectUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.setDataset((CategoryDataset) null);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultBoxAndWhiskerCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("", multiplePiePlot0);
      boolean boolean0 = multiplePiePlot0.equals(jFreeChart0);
      assertFalse(boolean0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultKeyedValues2DDataset0);
      multiplePiePlot0.setLimit(796.6359516503924);
      multiplePiePlot0.getLegendItems();
      assertEquals(796.6359516503924, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.getLegendItems();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 2, 52, 15, 12, 12, 2014, false, false, false, false, true, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 52, 1.0E-5, 5.0E7, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      Rectangle2D rectangle2D0 = chartPanel0.getScreenDataArea(1, 10);
      Point point0 = new Point(200, 10);
      PlotState plotState0 = new PlotState();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      multiplePiePlot0.draw(graphics2D0, rectangle2D0, point0, plotState0, plotRenderingInfo0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      // Undeclared exception!
      try { 
        multiplePiePlot0.setLegendItemShape((Shape) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot((CategoryDataset) null);
      // Undeclared exception!
      try { 
        multiplePiePlot0.setAggregatedItemsPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      // Undeclared exception!
      try { 
        multiplePiePlot0.setAggregatedItemsKey((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultKeyedValues2DDataset0);
      multiplePiePlot0.setAggregatedItemsKey("");
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot((CategoryDataset) null);
      // Undeclared exception!
      try { 
        multiplePiePlot0.setDataExtractOrder((TableOrder) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'order' argument
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultBoxAndWhiskerCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("", multiplePiePlot0);
      // Undeclared exception!
      try { 
        multiplePiePlot0.setPieChart(jFreeChart0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'pieChart' argument must be a chart based on a PiePlot.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultCategoryDataset0);
      // Undeclared exception!
      try { 
        multiplePiePlot0.setPieChart((JFreeChart) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'pieChart' argument.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      multiplePiePlot0.setPieChart(jFreeChart0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultBoxAndWhiskerCategoryDataset0);
      multiplePiePlot0.setDataset(defaultBoxAndWhiskerCategoryDataset0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      double double0 = multiplePiePlot0.getLimit();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      MultiplePiePlot multiplePiePlot1 = (MultiplePiePlot)multiplePiePlot0.clone();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertTrue(boolean0);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
      assertNotSame(multiplePiePlot1, multiplePiePlot0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      Ellipse2D.Double ellipse2D_Double0 = (Ellipse2D.Double)multiplePiePlot0.getLegendItemShape();
      assertEquals(4.0, ellipse2D_Double0.getMaxY(), 0.01);
      assertEquals(0.0, ellipse2D_Double0.getCenterX(), 0.01);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.getDataset();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      Comparable comparable0 = multiplePiePlot0.getAggregatedItemsKey();
      assertEquals("Other", comparable0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      TableOrder tableOrder0 = multiplePiePlot0.getDataExtractOrder();
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      String string0 = multiplePiePlot0.getPlotType();
      assertEquals("Multiple Pie Plot", string0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultCategoryDataset0);
      multiplePiePlot0.getLegendItems();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }
}