/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 02:54:17 GMT 2022
 */

package org.jfree.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.AttributedCharacterIterator;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.XYToolTipGenerator;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.renderer.xy.SamplingXYLineRenderer;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer;
import org.jfree.chart.renderer.xy.XYDotRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.chart.title.CompositeTitle;
import org.jfree.chart.urls.XYURLGenerator;
import org.jfree.data.time.DateRange;
import org.jfree.data.time.TimeTableXYDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYDotRenderer_ESTest extends XYDotRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      XYDotRenderer xYDotRenderer1 = new XYDotRenderer();
      xYDotRenderer1.setDotHeight(2673);
      boolean boolean0 = xYDotRenderer0.equals(xYDotRenderer1);
      assertEquals(2673, xYDotRenderer1.getDotHeight());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      SamplingXYLineRenderer samplingXYLineRenderer0 = new SamplingXYLineRenderer();
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      XYItemRendererState xYItemRendererState0 = samplingXYLineRenderer0.initialise((Graphics2D) null, rectangle0, combinedDomainXYPlot0, (XYDataset) null, plotRenderingInfo0);
      DateAxis dateAxis0 = new DateAxis("7D#Vf&y0u|\"(IzC");
      // Undeclared exception!
      try { 
        xYDotRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, rectangle0, combinedDomainXYPlot0, dateAxis0, dateAxis0, (XYDataset) null, 0, 795, false, 795);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.XYDotRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = new JFreeChart((String) null, multiplePiePlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1, 39, 1, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false);
      Rectangle rectangle0 = chartPanel0.getVisibleRect();
      DateRange dateRange0 = DateAxis.DEFAULT_DATE_RANGE;
      ModuloAxis moduloAxis0 = new ModuloAxis("QK(", dateRange0);
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(moduloAxis0);
      TimeZone timeZone0 = TimeZone.getTimeZone("ZVe#^2)vhD TLOJ(");
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset(timeZone0);
      // Undeclared exception!
      try { 
        xYDotRenderer0.drawItem(graphics2D0, (XYItemRendererState) null, rectangle0, combinedRangeXYPlot0, moduloAxis0, moduloAxis0, timeTableXYDataset0, 10, (-1), false, 15);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      xYDotRenderer0.setDotHeight(774);
      XYDotRenderer xYDotRenderer1 = new XYDotRenderer();
      boolean boolean0 = xYDotRenderer0.equals(xYDotRenderer1);
      assertEquals(774, xYDotRenderer0.getDotHeight());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      xYDotRenderer0.setDotWidth(5);
      XYDotRenderer xYDotRenderer1 = new XYDotRenderer();
      boolean boolean0 = xYDotRenderer0.equals(xYDotRenderer1);
      assertEquals(5, xYDotRenderer0.getDotWidth());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      boolean boolean0 = xYDotRenderer0.equals(xYDotRenderer0);
      assertEquals(1, xYDotRenderer0.getDotWidth());
      assertTrue(boolean0);
      assertEquals(1, xYDotRenderer0.getDotHeight());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = AttributedCharacterIterator.Attribute.READING;
      boolean boolean0 = xYDotRenderer0.equals(attributedCharacterIterator_Attribute0);
      assertEquals(1, xYDotRenderer0.getDotHeight());
      assertFalse(boolean0);
      assertEquals(1, xYDotRenderer0.getDotWidth());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      xYDotRenderer0.getLegendItem(0, (-1528));
      assertEquals(1, xYDotRenderer0.getDotWidth());
      assertEquals(1, xYDotRenderer0.getDotHeight());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("SgOQfh}V");
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(logarithmicAxis0);
      xYDotRenderer0.setPlot(combinedRangeXYPlot0);
      xYDotRenderer0.getLegendItem((-357), (-5528));
      assertEquals(1, xYDotRenderer0.getDotHeight());
      assertEquals(1, xYDotRenderer0.getDotWidth());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      PolarPlot polarPlot0 = new PolarPlot();
      JFreeChart jFreeChart0 = new JFreeChart("Null 'shape' argument.", xYDotRenderer0.DEFAULT_VALUE_LABEL_FONT, polarPlot0, false);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      StackedXYAreaRenderer stackedXYAreaRenderer0 = new StackedXYAreaRenderer(26, (XYToolTipGenerator) null, (XYURLGenerator) null);
      BlockContainer blockContainer0 = new BlockContainer();
      CompositeTitle compositeTitle0 = new CompositeTitle(blockContainer0);
      Rectangle2D rectangle2D0 = compositeTitle0.getBounds();
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      DateAxis dateAxis0 = new DateAxis("9wK4JK,XIljg", timeZone0, locale0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(dateAxis0);
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      XYItemRendererState xYItemRendererState0 = stackedXYAreaRenderer0.initialise(graphics2D0, rectangle2D0, combinedDomainXYPlot0, timeTableXYDataset0, plotRenderingInfo0);
      // Undeclared exception!
      try { 
        xYDotRenderer0.drawItem(graphics2D0, xYItemRendererState0, rectangle2D0, combinedDomainXYPlot0, dateAxis0, dateAxis0, timeTableXYDataset0, 0, 5, false, 3);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      // Undeclared exception!
      try { 
        xYDotRenderer0.setLegendShape((Shape) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.renderer.xy.XYDotRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      // Undeclared exception!
      try { 
        xYDotRenderer0.setDotHeight((-2503));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires h > 0.
         //
         verifyException("org.jfree.chart.renderer.xy.XYDotRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      // Undeclared exception!
      try { 
        xYDotRenderer0.setDotWidth(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires w > 0.
         //
         verifyException("org.jfree.chart.renderer.xy.XYDotRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      XYDotRenderer xYDotRenderer1 = (XYDotRenderer)xYDotRenderer0.clone();
      boolean boolean0 = xYDotRenderer0.equals(xYDotRenderer1);
      assertEquals(1, xYDotRenderer1.getDotWidth());
      assertEquals(1, xYDotRenderer1.getDotHeight());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      int int0 = xYDotRenderer0.getDotHeight();
      assertEquals(1, int0);
      assertEquals(1, xYDotRenderer0.getDotWidth());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      int int0 = xYDotRenderer0.getDotWidth();
      assertEquals(1, int0);
      assertEquals(1, xYDotRenderer0.getDotHeight());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)xYDotRenderer0.getLegendShape();
      xYDotRenderer0.setLegendShape((Shape) rectangle2D_Double0);
      assertEquals(1, xYDotRenderer0.getDotWidth());
      assertEquals(1, xYDotRenderer0.getDotHeight());
      assertEquals(3.0, rectangle2D_Double0.getMaxY(), 0.01);
      assertEquals(3.0, rectangle2D_Double0.getMaxX(), 0.01);
  }
}
