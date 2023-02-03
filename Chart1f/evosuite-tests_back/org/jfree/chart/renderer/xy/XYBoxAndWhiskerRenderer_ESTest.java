/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:18:14 GMT 2022
 */

package org.jfree.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JInternalFrame;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.renderer.xy.DeviationRenderer;
import org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.DefaultWindDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYBoxAndWhiskerRenderer_ESTest extends XYBoxAndWhiskerRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer(0.0);
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer1 = new XYBoxAndWhiskerRenderer();
      boolean boolean0 = xYBoxAndWhiskerRenderer0.equals(xYBoxAndWhiskerRenderer1);
      assertFalse(xYBoxAndWhiskerRenderer1.equals((Object)xYBoxAndWhiskerRenderer0));
      assertTrue(xYBoxAndWhiskerRenderer1.getFillBox());
      assertFalse(boolean0);
      assertEquals((-1.0), xYBoxAndWhiskerRenderer1.getBoxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      // Undeclared exception!
      try { 
        xYBoxAndWhiskerRenderer0.drawLowFarOut((-2077.544022031), (Graphics2D) null, 1.0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer", xYBoxAndWhiskerRenderer0.DEFAULT_VALUE_LABEL_FONT, combinedDomainCategoryPlot0, true);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(51, 613, (double) 10, 0.2, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      xYBoxAndWhiskerRenderer0.drawHighFarOut((-1770.6), graphics2D0, 2.0F, 0.0);
      assertEquals((-1.0), xYBoxAndWhiskerRenderer0.getBoxWidth(), 0.01);
      assertTrue(xYBoxAndWhiskerRenderer0.getFillBox());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      CompassPlot compassPlot0 = new CompassPlot();
      compassPlot0.setRoseHighlightPaint(xYBoxAndWhiskerRenderer0.DEFAULT_OUTLINE_PAINT);
      Paint paint0 = compassPlot0.getRoseHighlightPaint();
      xYBoxAndWhiskerRenderer0.setArtifactPaint(paint0);
      Color color0 = (Color)xYBoxAndWhiskerRenderer0.getArtifactPaint();
      assertTrue(xYBoxAndWhiskerRenderer0.getFillBox());
      assertEquals(128, color0.getGreen());
      assertEquals((-1.0), xYBoxAndWhiskerRenderer0.getBoxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      xYBoxAndWhiskerRenderer0.setBoxWidth(2391.357073140515);
      assertEquals(2391.357073140515, xYBoxAndWhiskerRenderer0.getBoxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      boolean boolean0 = xYBoxAndWhiskerRenderer0.equals(xYBoxAndWhiskerRenderer0);
      assertTrue(xYBoxAndWhiskerRenderer0.getFillBox());
      assertTrue(boolean0);
      assertEquals((-1.0), xYBoxAndWhiskerRenderer0.getBoxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer(0.0);
      double double0 = xYBoxAndWhiskerRenderer0.getBoxWidth();
      assertTrue(xYBoxAndWhiskerRenderer0.getFillBox());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      double double0 = xYBoxAndWhiskerRenderer0.getBoxWidth();
      assertEquals((-1.0), double0, 0.01);
      assertTrue(xYBoxAndWhiskerRenderer0.getFillBox());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      JInternalFrame jInternalFrame0 = new JInternalFrame("org.jfree.chart.renderer.xy.DeviationRenderer", true, true);
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0, (double) xYBoxAndWhiskerRenderer0.ZERO);
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        xYBoxAndWhiskerRenderer0.drawVerticalItem((Graphics2D) null, (XYItemRendererState) null, rectangle0, (XYPlot) null, cyclicNumberAxis0, cyclicNumberAxis0, histogramDataset0, 244, 0, true, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((Number) xYBoxAndWhiskerRenderer0.ZERO);
      MeterPlot meterPlot0 = new MeterPlot(defaultValueDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.renderer.category.GradientBarPainter", meterPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(270, 66);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.getGraphics();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 10, (-1), 1073741837, (-2635), 266, 10, false, false, false, false, true, false);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      DeviationRenderer deviationRenderer0 = new DeviationRenderer(false, false);
      Rectangle rectangle0 = new Rectangle((-520), (-520), 1024, 680);
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.CONTRACT;
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)meterPlot0.DEFAULT_INSETS.createAdjustedRectangle(rectangle0, lengthAdjustmentType0, lengthAdjustmentType0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection();
      DeviationRenderer.State deviationRenderer_State0 = (DeviationRenderer.State)deviationRenderer0.initialise(sunGraphics2D0, rectangle2D_Double0, (XYPlot) null, xYSeriesCollection0, plotRenderingInfo0);
      PeriodAxis periodAxis0 = new PeriodAxis("ZOOM_IN_RANGE");
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        xYBoxAndWhiskerRenderer0.drawItem(sunGraphics2D0, deviationRenderer_State0, rectangle2D_Double0, (XYPlot) null, periodAxis0, periodAxis0, defaultIntervalXYDataset0, 1817101548, (-2146950594), true, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      // Undeclared exception!
      try { 
        xYBoxAndWhiskerRenderer0.drawHighFarOut((-1598.502468), (Graphics2D) null, (-1598.502468), (-3342.876));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      Color color0 = (Color)xYBoxAndWhiskerRenderer0.getBoxPaint();
      assertEquals((-1.0), xYBoxAndWhiskerRenderer0.getBoxWidth(), 0.01);
      assertEquals((-16711936), color0.getRGB());
      assertTrue(xYBoxAndWhiskerRenderer0.getFillBox());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer(2494.770534461);
      double double0 = xYBoxAndWhiskerRenderer0.getBoxWidth();
      assertTrue(xYBoxAndWhiskerRenderer0.getFillBox());
      assertEquals(2494.770534461, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer((-201.804996136));
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer1 = new XYBoxAndWhiskerRenderer();
      boolean boolean0 = xYBoxAndWhiskerRenderer0.equals(xYBoxAndWhiskerRenderer1);
      assertFalse(boolean0);
      assertEquals((-1.0), xYBoxAndWhiskerRenderer1.getBoxWidth(), 0.01);
      assertFalse(xYBoxAndWhiskerRenderer1.equals((Object)xYBoxAndWhiskerRenderer0));
      assertTrue(xYBoxAndWhiskerRenderer1.getFillBox());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer(0.0);
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer1 = new XYBoxAndWhiskerRenderer();
      xYBoxAndWhiskerRenderer1.setBaseLegendTextFont(xYBoxAndWhiskerRenderer0.DEFAULT_VALUE_LABEL_FONT);
      boolean boolean0 = xYBoxAndWhiskerRenderer0.equals(xYBoxAndWhiskerRenderer1);
      assertFalse(boolean0);
      assertTrue(xYBoxAndWhiskerRenderer1.getFillBox());
      assertEquals((-1.0), xYBoxAndWhiskerRenderer1.getBoxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      CompassPlot compassPlot0 = new CompassPlot();
      JFreeChart jFreeChart0 = new JFreeChart(compassPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 1, (double) 1.0F, (double) 1.0F, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      boolean boolean0 = xYBoxAndWhiskerRenderer0.equals(graphics2D0);
      assertTrue(xYBoxAndWhiskerRenderer0.getFillBox());
      assertFalse(boolean0);
      assertEquals((-1.0), xYBoxAndWhiskerRenderer0.getBoxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = new JFreeChart("I<%BDv3<U,VL,9.Z8", xYBoxAndWhiskerRenderer0.DEFAULT_VALUE_LABEL_FONT, multiplePiePlot0, true);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1377, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 3, 0, 10, 0, 0, 0, true, true, true, true, true, false);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      XYItemRendererState xYItemRendererState0 = xYStepAreaRenderer0.initialise(graphics2D0, rectangle0, combinedDomainXYPlot0, defaultWindDataset0, plotRenderingInfo0);
      DateAxis dateAxis0 = new DateAxis("ZOOM_IN_RANGE");
      // Undeclared exception!
      try { 
        xYBoxAndWhiskerRenderer0.drawVerticalItem(graphics2D0, xYItemRendererState0, rectangle0, combinedDomainXYPlot0, dateAxis0, dateAxis0, defaultWindDataset0, 0, 10, true, 300);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.data.xy.DefaultWindDataset cannot be cast to org.jfree.data.statistics.BoxAndWhiskerXYDataset
         //
         verifyException("org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      XYItemRendererState xYItemRendererState0 = xYBoxAndWhiskerRenderer0.createState((PlotRenderingInfo) null);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      DateAxis dateAxis0 = new DateAxis("kKNdMUEcEDF+HU");
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      // Undeclared exception!
      try { 
        xYBoxAndWhiskerRenderer0.drawVerticalItem((Graphics2D) null, xYItemRendererState0, rectangle2D_Double0, (XYPlot) null, dateAxis0, dateAxis0, defaultWindDataset0, 1928, (-1814), false, 1928);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.data.xy.DefaultWindDataset cannot be cast to org.jfree.data.statistics.BoxAndWhiskerXYDataset
         //
         verifyException("org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      CompassPlot compassPlot0 = new CompassPlot();
      JFreeChart jFreeChart0 = new JFreeChart(compassPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 1, (double) 1.0F, (double) 1.0F, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      XYItemRendererState xYItemRendererState0 = xYBoxAndWhiskerRenderer0.createState(plotRenderingInfo0);
      DefaultCaret defaultCaret0 = new DefaultCaret();
      DateAxis dateAxis0 = new DateAxis("3[#/Xoh{0E1)]'");
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[0];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(0, oHLCDataItemArray0);
      // Undeclared exception!
      try { 
        xYBoxAndWhiskerRenderer0.drawHorizontalItem(graphics2D0, xYItemRendererState0, defaultCaret0, (XYPlot) null, dateAxis0, dateAxis0, defaultOHLCDataset0, 3073, 0, true, (-156));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.data.xy.DefaultOHLCDataset cannot be cast to org.jfree.data.statistics.BoxAndWhiskerXYDataset
         //
         verifyException("org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      xYBoxAndWhiskerRenderer0.setBoxPaint((Paint) null);
      Color color0 = (Color)xYBoxAndWhiskerRenderer0.lookupBoxPaint(0, 305);
      assertNotNull(color0);
      assertEquals((-1.0), xYBoxAndWhiskerRenderer0.getBoxWidth(), 0.01);
      assertEquals((-16776961), color0.getRGB());
      assertTrue(xYBoxAndWhiskerRenderer0.getFillBox());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer(0.0);
      // Undeclared exception!
      try { 
        xYBoxAndWhiskerRenderer0.setArtifactPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(2391.357073140515);
      Paint paint0 = candlestickRenderer0.getUpPaint();
      xYBoxAndWhiskerRenderer0.setArtifactPaint(paint0);
      assertEquals((-1.0), xYBoxAndWhiskerRenderer0.getBoxWidth(), 0.01);
      assertTrue(xYBoxAndWhiskerRenderer0.getFillBox());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      xYBoxAndWhiskerRenderer0.setBoxWidth((-579.13));
      assertEquals((-579.13), xYBoxAndWhiskerRenderer0.getBoxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer(0.0);
      xYBoxAndWhiskerRenderer0.setBoxWidth(0.0);
      assertTrue(xYBoxAndWhiskerRenderer0.getFillBox());
      assertEquals(0.0, xYBoxAndWhiskerRenderer0.getBoxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      Point point0 = new Point();
      // Undeclared exception!
      try { 
        xYBoxAndWhiskerRenderer0.drawEllipse(point0, (-1169.606), (Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      Point2D.Double point2D_Double0 = new Point2D.Double(2391.357073140515, 4.0);
      // Undeclared exception!
      try { 
        xYBoxAndWhiskerRenderer0.drawMultipleEllipse(point2D_Double0, 1.0, 1.0, (Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      xYBoxAndWhiskerRenderer0.setFillBox(true);
      assertTrue(xYBoxAndWhiskerRenderer0.getFillBox());
      assertEquals((-1.0), xYBoxAndWhiskerRenderer0.getBoxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      boolean boolean0 = xYBoxAndWhiskerRenderer0.getFillBox();
      assertTrue(boolean0);
      assertEquals((-1.0), xYBoxAndWhiskerRenderer0.getBoxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      Color color0 = (Color)xYBoxAndWhiskerRenderer0.getArtifactPaint();
      assertEquals((-16777216), color0.getRGB());
      assertTrue(xYBoxAndWhiskerRenderer0.getFillBox());
      assertEquals((-1.0), xYBoxAndWhiskerRenderer0.getBoxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      xYBoxAndWhiskerRenderer0.findRangeBounds((XYDataset) null);
      assertTrue(xYBoxAndWhiskerRenderer0.getFillBox());
      assertEquals((-1.0), xYBoxAndWhiskerRenderer0.getBoxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer1 = (XYBoxAndWhiskerRenderer)xYBoxAndWhiskerRenderer0.clone();
      boolean boolean0 = xYBoxAndWhiskerRenderer0.equals(xYBoxAndWhiskerRenderer1);
      assertTrue(xYBoxAndWhiskerRenderer1.getFillBox());
      assertTrue(boolean0);
      assertEquals((-1.0), xYBoxAndWhiskerRenderer1.getBoxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      Color color0 = (Color)xYBoxAndWhiskerRenderer0.lookupBoxPaint(0, 0);
      assertEquals((-1.0), xYBoxAndWhiskerRenderer0.getBoxWidth(), 0.01);
      assertEquals((-16711936), color0.getRGB());
      assertTrue(xYBoxAndWhiskerRenderer0.getFillBox());
  }
}