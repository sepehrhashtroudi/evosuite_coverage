/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 02:29:26 GMT 2022
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JSpinner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CategoryStepRenderer_ESTest extends CategoryStepRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      // Undeclared exception!
      try { 
        categoryStepRenderer0.drawLine((Graphics2D) null, categoryStepRenderer_State0, plotOrientation0, (-127.133244350553), (-23), 1546.52604257, 1266.9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.CategoryStepRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = (CategoryStepRenderer.State)categoryStepRenderer0.createState(plotRenderingInfo0);
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      JFreeChart jFreeChart0 = new JFreeChart(":Y", categoryStepRenderer0.DEFAULT_VALUE_LABEL_FONT, fastScatterPlot0, true);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(4260, 3179, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImageRenderingSource0.createGraphics2D();
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      categoryStepRenderer0.drawLine(sunGraphics2D0, categoryStepRenderer_State0, plotOrientation0, 2121.0, 10, 1.0F, 1411.616523166);
      assertFalse(categoryStepRenderer0.getStagger());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      categoryStepRenderer0.setPlot(combinedRangeCategoryPlot0);
      // Undeclared exception!
      try { 
        categoryStepRenderer0.getLegendItem(1070, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dataset' argument.
         //
         verifyException("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      boolean boolean0 = categoryStepRenderer0.getStagger();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Mofeed Shahin");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(logarithmicAxis0);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        categoryStepRenderer0.drawItem((Graphics2D) null, (CategoryItemRendererState) null, (Rectangle2D) null, combinedRangeCategoryPlot0, (CategoryAxis) null, logarithmicAxis0, taskSeriesCollection0, 500, 10, true, 500);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 500, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CategoryStepRenderer categoryStepRenderer1 = (CategoryStepRenderer)categoryStepRenderer0.clone();
      boolean boolean0 = categoryStepRenderer0.equals(categoryStepRenderer1);
      assertTrue(boolean0);
      assertFalse(categoryStepRenderer1.getStagger());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CategoryStepRenderer categoryStepRenderer1 = new CategoryStepRenderer(true);
      boolean boolean0 = categoryStepRenderer0.equals(categoryStepRenderer1);
      assertFalse(boolean0);
      assertTrue(categoryStepRenderer1.getStagger());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      boolean boolean0 = categoryStepRenderer0.equals(categoryStepRenderer0);
      assertTrue(boolean0);
      assertFalse(categoryStepRenderer0.getStagger());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      JSpinner jSpinner0 = new JSpinner();
      boolean boolean0 = categoryStepRenderer0.equals(jSpinner0);
      assertFalse(boolean0);
      assertTrue(categoryStepRenderer0.getStagger());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = new CategoryItemRendererState(plotRenderingInfo0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.2, 203);
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        categoryStepRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, rectangle2D_Double0, combinedDomainCategoryPlot0, categoryAxis0, cyclicNumberAxis0, defaultKeyedValues2DDataset0, (byte) (-95), (byte) (-95), true, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      JFreeChart jFreeChart0 = new JFreeChart(spiderWebPlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 1, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      categoryStepRenderer0.drawLine(graphics2D0, (CategoryStepRenderer.State) null, (PlotOrientation) null, 0.5F, (-1), 0.1, 10);
      assertTrue(categoryStepRenderer0.getStagger());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      categoryStepRenderer0.getLegendItem((byte) (-95), 0);
      assertTrue(categoryStepRenderer0.getStagger());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      boolean boolean0 = categoryStepRenderer0.getStagger();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      categoryStepRenderer0.setStagger(true);
      assertTrue(categoryStepRenderer0.getStagger());
  }
}
