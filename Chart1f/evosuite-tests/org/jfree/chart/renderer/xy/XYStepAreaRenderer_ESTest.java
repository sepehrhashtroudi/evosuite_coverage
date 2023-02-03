/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:16:59 GMT 2022
 */

package org.jfree.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import javax.swing.JInternalFrame;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.labels.StandardXYZToolTipGenerator;
import org.jfree.chart.labels.SymbolicXYItemLabelGenerator;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.CyclicXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.urls.StandardXYURLGenerator;
import org.jfree.chart.urls.StandardXYZURLGenerator;
import org.jfree.chart.urls.TimeSeriesURLGenerator;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYStepAreaRenderer_ESTest extends XYStepAreaRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 0.0, 10, 3);
      double double0 = XYStepAreaRenderer.restrictValueToDataArea(2, combinedRangeXYPlot0, rectangle2D_Double0);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(periodAxis0);
      JInternalFrame jInternalFrame0 = new JInternalFrame("PoK?x4uw", false, false, true);
      Color color0 = Color.DARK_GRAY;
      LineBorder lineBorder0 = new LineBorder(color0);
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) jInternalFrame0, (Border) lineBorder0, 2012, 0, 1, 1341);
      double double0 = XYStepAreaRenderer.restrictValueToDataArea(0.0, combinedDomainXYPlot0, rectangle0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StandardXYToolTipGenerator standardXYToolTipGenerator0 = StandardXYToolTipGenerator.getTimeSeriesInstance();
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator();
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer((-887), standardXYToolTipGenerator0, standardXYURLGenerator0);
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(1.0F, 0.0, (double) xYStepAreaRenderer0.ZERO, 0.0);
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      double double0 = XYStepAreaRenderer.restrictValueToDataArea((double) xYStepAreaRenderer0.ZERO, combinedRangeXYPlot0, rectangle2D0);
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertEquals(0.0, double0, 0.01);
      assertFalse(xYStepAreaRenderer0.getPlotArea());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer();
      AffineTransform affineTransform0 = AffineTransform.getQuadrantRotateInstance(1);
      AffineTransformOp affineTransformOp0 = new AffineTransformOp(affineTransform0, 2);
      BufferedImage bufferedImage0 = new BufferedImage(3, 1, 1);
      Rectangle2D rectangle2D0 = affineTransformOp0.getBounds2D(bufferedImage0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      XYItemRendererState xYItemRendererState0 = xYSplineRenderer0.initialise((Graphics2D) null, rectangle2D0, (XYPlot) null, defaultXYDataset0, plotRenderingInfo0);
      ModuloAxis moduloAxis0 = new ModuloAxis("", (Range) null);
      // Undeclared exception!
      try { 
        xYStepAreaRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, rectangle2D0, combinedDomainXYPlot0, moduloAxis0, moduloAxis0, defaultXYDataset0, 0, 10, true, (-2264));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.DefaultXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      Size2D size2D0 = new Size2D(1.0F, (-204.75722513616));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 10, (-1377.26), rectangleAnchor0);
      double double0 = XYStepAreaRenderer.restrictValueToDataArea(0.0, xYPlot0, rectangle2D0);
      assertEquals((-1479.6386125680801), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SymbolicXYItemLabelGenerator symbolicXYItemLabelGenerator0 = new SymbolicXYItemLabelGenerator();
      StandardXYZURLGenerator standardXYZURLGenerator0 = new StandardXYZURLGenerator();
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(3, symbolicXYItemLabelGenerator0, standardXYZURLGenerator0);
      boolean boolean0 = xYStepAreaRenderer0.getShapesVisible();
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertTrue(boolean0);
      assertTrue(xYStepAreaRenderer0.getPlotArea());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      xYStepAreaRenderer0.setRangeBase(568);
      double double0 = xYStepAreaRenderer0.getRangeBase();
      assertEquals(568.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator();
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator();
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(0, standardXYZToolTipGenerator0, timeSeriesURLGenerator0);
      xYStepAreaRenderer0.setRangeBase((-2718.344));
      double double0 = xYStepAreaRenderer0.getRangeBase();
      assertEquals((-2718.344), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StandardXYToolTipGenerator standardXYToolTipGenerator0 = StandardXYToolTipGenerator.getTimeSeriesInstance();
      StandardXYZURLGenerator standardXYZURLGenerator0 = new StandardXYZURLGenerator();
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(61, standardXYToolTipGenerator0, standardXYZURLGenerator0);
      boolean boolean0 = xYStepAreaRenderer0.getPlotArea();
      assertFalse(boolean0);
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertFalse(xYStepAreaRenderer0.isOutline());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      NumberAxis numberAxis0 = new NumberAxis();
      CyclicXYItemRenderer cyclicXYItemRenderer0 = new CyclicXYItemRenderer(37);
      XYPlot xYPlot0 = new XYPlot(defaultTableXYDataset0, numberAxis0, numberAxis0, cyclicXYItemRenderer0);
      // Undeclared exception!
      try { 
        XYStepAreaRenderer.restrictValueToDataArea((-4098.043251934), xYPlot0, (Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.XYStepAreaRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer((-860));
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      DecimalFormat decimalFormat0 = new DecimalFormat();
      BoxAndWhiskerXYToolTipGenerator boxAndWhiskerXYToolTipGenerator0 = new BoxAndWhiskerXYToolTipGenerator("", mockSimpleDateFormat0, decimalFormat0);
      CyclicXYItemRenderer cyclicXYItemRenderer0 = new CyclicXYItemRenderer(4371, boxAndWhiskerXYToolTipGenerator0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      XYItemRendererState xYItemRendererState0 = cyclicXYItemRenderer0.initialise((Graphics2D) null, rectangle2D_Double0, (XYPlot) null, defaultTableXYDataset0, plotRenderingInfo0);
      PeriodAxis periodAxis0 = new PeriodAxis("g/o{&f1\"|");
      // Undeclared exception!
      try { 
        xYStepAreaRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, rectangle2D_Double0, (XYPlot) null, periodAxis0, periodAxis0, defaultTableXYDataset0, 2, 3, true, 144);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.XYStepAreaRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      XYStepAreaRenderer xYStepAreaRenderer1 = new XYStepAreaRenderer();
      xYStepAreaRenderer1.setRangeBase(2967.310764464);
      boolean boolean0 = xYStepAreaRenderer0.equals(xYStepAreaRenderer1);
      assertEquals(2967.310764464, xYStepAreaRenderer1.getRangeBase(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      XYStepAreaRenderer xYStepAreaRenderer1 = new XYStepAreaRenderer();
      boolean boolean0 = xYStepAreaRenderer0.equals(xYStepAreaRenderer1);
      assertTrue(boolean0);
      assertTrue(xYStepAreaRenderer1.getPlotArea());
      assertFalse(xYStepAreaRenderer1.getShapesVisible());
      assertFalse(xYStepAreaRenderer1.isOutline());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      XYStepAreaRenderer xYStepAreaRenderer1 = new XYStepAreaRenderer(0);
      boolean boolean0 = xYStepAreaRenderer0.equals(xYStepAreaRenderer1);
      assertFalse(boolean0);
      assertTrue(xYStepAreaRenderer0.getPlotArea());
      assertFalse(xYStepAreaRenderer1.isOutline());
      assertFalse(xYStepAreaRenderer1.getShapesVisible());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      Point point0 = gridBagLayout0.getLayoutOrigin();
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      Rectangle rectangle0 = new Rectangle(point0);
      boolean boolean0 = xYStepAreaRenderer0.equals(rectangle0);
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertFalse(boolean0);
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertTrue(xYStepAreaRenderer0.getPlotArea());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      boolean boolean0 = xYStepAreaRenderer0.equals(xYStepAreaRenderer0);
      assertTrue(xYStepAreaRenderer0.getPlotArea());
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertTrue(boolean0);
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(11);
      XYStepAreaRenderer xYStepAreaRenderer1 = new XYStepAreaRenderer(3);
      boolean boolean0 = xYStepAreaRenderer0.equals(xYStepAreaRenderer1);
      assertFalse(boolean0);
      assertTrue(xYStepAreaRenderer1.getPlotArea());
      assertFalse(xYStepAreaRenderer1.isOutline());
      assertTrue(xYStepAreaRenderer1.getShapesVisible());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SymbolicXYItemLabelGenerator symbolicXYItemLabelGenerator0 = new SymbolicXYItemLabelGenerator();
      TimeSeriesURLGenerator timeSeriesURLGenerator0 = new TimeSeriesURLGenerator();
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(1, symbolicXYItemLabelGenerator0, timeSeriesURLGenerator0);
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertTrue(xYStepAreaRenderer0.getShapesVisible());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      Point point0 = gridBagLayout0.getLayoutOrigin();
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      Rectangle rectangle0 = new Rectangle(point0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        xYStepAreaRenderer0.initialise((Graphics2D) null, rectangle0, (XYPlot) null, (XYDataset) null, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.AbstractXYItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      boolean boolean0 = xYStepAreaRenderer0.getPlotArea();
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      assertTrue(xYStepAreaRenderer0.getPlotArea());
      
      xYStepAreaRenderer0.setPlotArea(false);
      assertFalse(xYStepAreaRenderer0.getPlotArea());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      xYStepAreaRenderer0.setShapesFilled(true);
      boolean boolean0 = xYStepAreaRenderer0.isShapesFilled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      XYStepAreaRenderer xYStepAreaRenderer1 = (XYStepAreaRenderer)xYStepAreaRenderer0.clone();
      assertTrue(xYStepAreaRenderer1.getPlotArea());
      assertFalse(xYStepAreaRenderer1.isOutline());
      assertFalse(xYStepAreaRenderer1.getShapesVisible());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      boolean boolean0 = xYStepAreaRenderer0.isOutline();
      assertTrue(xYStepAreaRenderer0.getPlotArea());
      assertFalse(boolean0);
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      xYStepAreaRenderer0.isShapesFilled();
      assertTrue(xYStepAreaRenderer0.getPlotArea());
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertFalse(xYStepAreaRenderer0.isOutline());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      boolean boolean0 = xYStepAreaRenderer0.getShapesVisible();
      assertFalse(boolean0);
      assertTrue(xYStepAreaRenderer0.getPlotArea());
      assertFalse(xYStepAreaRenderer0.isOutline());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      assertFalse(xYStepAreaRenderer0.isOutline());
      
      xYStepAreaRenderer0.setOutline(true);
      boolean boolean0 = xYStepAreaRenderer0.isOutline();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      xYStepAreaRenderer0.setShapesVisible(false);
      assertTrue(xYStepAreaRenderer0.getPlotArea());
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertFalse(xYStepAreaRenderer0.isOutline());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      double double0 = xYStepAreaRenderer0.getRangeBase();
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertEquals(0.0, double0, 0.01);
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertTrue(xYStepAreaRenderer0.getPlotArea());
  }
}