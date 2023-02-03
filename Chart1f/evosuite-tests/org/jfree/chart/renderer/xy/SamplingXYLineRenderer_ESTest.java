/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 02:55:11 GMT 2022
 */

package org.jfree.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.labels.XYItemLabelGenerator;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.SamplingXYLineRenderer;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.data.Range;
import org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset;
import org.jfree.data.xy.VectorSeriesCollection;
import org.jfree.data.xy.YIntervalSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SamplingXYLineRenderer_ESTest extends SamplingXYLineRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SamplingXYLineRenderer samplingXYLineRenderer0 = new SamplingXYLineRenderer();
      Rectangle rectangle0 = new Rectangle(0, (-912), 0, (-912));
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      XYPlot xYPlot0 = new XYPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      XYItemRendererState xYItemRendererState0 = samplingXYLineRenderer0.initialise((Graphics2D) null, rectangle0, xYPlot0, yIntervalSeriesCollection0, plotRenderingInfo0);
      xYItemRendererState0.startSeriesPass(yIntervalSeriesCollection0, (-912), 1, (-1361), (-2308), (-1823));
      assertEquals(1, xYItemRendererState0.getFirstItemIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SamplingXYLineRenderer samplingXYLineRenderer0 = new SamplingXYLineRenderer();
      StandardXYItemLabelGenerator standardXYItemLabelGenerator0 = new StandardXYItemLabelGenerator();
      samplingXYLineRenderer0.setSeriesItemLabelGenerator(3504, (XYItemLabelGenerator) standardXYItemLabelGenerator0, true);
      Object object0 = samplingXYLineRenderer0.clone();
      // Undeclared exception!
      samplingXYLineRenderer0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SamplingXYLineRenderer samplingXYLineRenderer0 = new SamplingXYLineRenderer();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      JFreeChart jFreeChart0 = new JFreeChart(spiderWebPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(55, 10, 0.4, 0.4, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      XYItemRendererState xYItemRendererState0 = new XYItemRendererState((PlotRenderingInfo) null);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-2242.18F), 0.0F, 10, (-2242.18F));
      DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset0 = new DefaultBoxAndWhiskerXYDataset(0.1);
      ModuloAxis moduloAxis0 = new ModuloAxis("CiT<O1?Wpy)5u", (Range) null);
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("org.jfree.chart.renderer.xy.SamplingXYLineRenderer");
      // Undeclared exception!
      try { 
        samplingXYLineRenderer0.drawItem(graphics2D0, xYItemRendererState0, rectangle2D_Float0, (XYPlot) null, moduloAxis0, numberAxis3D0, defaultBoxAndWhiskerXYDataset0, (-570), 0, false, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.SamplingXYLineRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SamplingXYLineRenderer samplingXYLineRenderer0 = new SamplingXYLineRenderer();
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      XYBarRenderer xYBarRenderer0 = new XYBarRenderer();
      XYPlot xYPlot0 = new XYPlot(yIntervalSeriesCollection0, (ValueAxis) null, (ValueAxis) null, xYBarRenderer0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      XYItemRendererState xYItemRendererState0 = samplingXYLineRenderer0.initialise((Graphics2D) null, (Rectangle2D) null, xYPlot0, yIntervalSeriesCollection0, plotRenderingInfo0);
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        samplingXYLineRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, (Rectangle2D) null, xYPlot0, (ValueAxis) null, (ValueAxis) null, vectorSeriesCollection0, 1740, 151, false, (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1740, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SamplingXYLineRenderer.State samplingXYLineRenderer_State0 = new SamplingXYLineRenderer.State((PlotRenderingInfo) null);
      assertTrue(samplingXYLineRenderer_State0.getProcessVisibleItemsOnly());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SamplingXYLineRenderer samplingXYLineRenderer0 = new SamplingXYLineRenderer();
      Object object0 = samplingXYLineRenderer0.clone();
      boolean boolean0 = samplingXYLineRenderer0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, samplingXYLineRenderer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SamplingXYLineRenderer samplingXYLineRenderer0 = new SamplingXYLineRenderer();
      boolean boolean0 = samplingXYLineRenderer0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SamplingXYLineRenderer samplingXYLineRenderer0 = new SamplingXYLineRenderer();
      boolean boolean0 = samplingXYLineRenderer0.equals(samplingXYLineRenderer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SamplingXYLineRenderer samplingXYLineRenderer0 = new SamplingXYLineRenderer();
      Object object0 = samplingXYLineRenderer0.clone();
      assertTrue(object0.equals((Object)samplingXYLineRenderer0));
      
      samplingXYLineRenderer0.setBaseLegendTextFont(samplingXYLineRenderer0.DEFAULT_VALUE_LABEL_FONT);
      boolean boolean0 = samplingXYLineRenderer0.equals(object0);
      assertFalse(object0.equals((Object)samplingXYLineRenderer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SamplingXYLineRenderer samplingXYLineRenderer0 = new SamplingXYLineRenderer();
      Rectangle rectangle0 = new Rectangle(0, (-912), 0, (-912));
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      XYPlot xYPlot0 = new XYPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      XYItemRendererState xYItemRendererState0 = samplingXYLineRenderer0.initialise((Graphics2D) null, rectangle0, xYPlot0, yIntervalSeriesCollection0, plotRenderingInfo0);
      // Undeclared exception!
      try { 
        samplingXYLineRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, rectangle0, xYPlot0, (ValueAxis) null, (ValueAxis) null, yIntervalSeriesCollection0, (-912), 5, false, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SamplingXYLineRenderer samplingXYLineRenderer0 = new SamplingXYLineRenderer();
      int int0 = samplingXYLineRenderer0.getPassCount();
      assertEquals(1, int0);
  }
}