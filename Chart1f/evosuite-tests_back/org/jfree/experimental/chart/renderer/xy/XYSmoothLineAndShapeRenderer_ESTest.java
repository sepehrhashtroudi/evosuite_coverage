/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:49:37 GMT 2022
 */

package org.jfree.experimental.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.XYCrosshairState;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.SamplingXYLineRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.jdbc.JDBCXYDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.experimental.chart.renderer.xy.XYSmoothLineAndShapeRenderer;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYSmoothLineAndShapeRenderer_ESTest extends XYSmoothLineAndShapeRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double(2628.73077, 2115.0);
      // Undeclared exception!
      try { 
        XYSmoothLineAndShapeRenderer.getBezierCurve((Point2D.Double) null, (Point2D.Double) null, point2D_Double0, (Point2D.Double) null, 2628.73077, (-1756));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.experimental.chart.renderer.xy.XYSmoothLineAndShapeRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double();
      Point2D.Double point2D_Double1 = new Point2D.Double(30.0, 0.2);
      // Undeclared exception!
      try { 
        XYSmoothLineAndShapeRenderer.getBezierCurve(point2D_Double0, point2D_Double1, point2D_Double0, point2D_Double1, 0.0, (-775));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.experimental.chart.renderer.xy.XYSmoothLineAndShapeRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double();
      Point2D.Double point2D_Double1 = new Point2D.Double();
      Point2D.Double[] point2D_DoubleArray0 = XYSmoothLineAndShapeRenderer.getBezierCurve(point2D_Double1, point2D_Double0, point2D_Double0, point2D_Double1, 12.0, 9999);
      assertEquals(10000, point2D_DoubleArray0.length);
      assertEquals(0.0, point2D_Double1.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYSmoothLineAndShapeRenderer xYSmoothLineAndShapeRenderer0 = new XYSmoothLineAndShapeRenderer();
      String[] stringArray0 = new String[3];
      SymbolAxis symbolAxis0 = new SymbolAxis("[CJ%${F,g`6w", stringArray0);
      HistogramDataset histogramDataset0 = new HistogramDataset();
      LogAxis logAxis0 = new LogAxis("[CJ%${F,g`6w");
      ChartPanel chartPanel0 = new ChartPanel((JFreeChart) null);
      Rectangle rectangle0 = chartPanel0.getVisibleRect();
      // Undeclared exception!
      try { 
        xYSmoothLineAndShapeRenderer0.drawPrimaryLine((XYItemRendererState) null, (Graphics2D) null, (XYPlot) null, histogramDataset0, 10, 1153, (-3946), true, symbolAxis0, logAxis0, rectangle0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1153, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double();
      XYSmoothLineAndShapeRenderer.getBezierCurve(point2D_Double0, point2D_Double0, point2D_Double0, point2D_Double0, 0.0, 9999);
      // Undeclared exception!
      XYSmoothLineAndShapeRenderer.getBezierCurve(point2D_Double0, point2D_Double0, point2D_Double0, point2D_Double0, 12.0, 9999);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double();
      // Undeclared exception!
      try { 
        XYSmoothLineAndShapeRenderer.getBezierCurve(point2D_Double0, point2D_Double0, point2D_Double0, point2D_Double0, (-4183.0), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.jfree.experimental.chart.renderer.xy.XYSmoothLineAndShapeRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYSmoothLineAndShapeRenderer xYSmoothLineAndShapeRenderer0 = new XYSmoothLineAndShapeRenderer();
      SamplingXYLineRenderer samplingXYLineRenderer0 = new SamplingXYLineRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      Rectangle2D rectangle2D0 = plotRenderingInfo0.getDataArea();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      XYItemRendererState xYItemRendererState0 = samplingXYLineRenderer0.initialise((Graphics2D) null, rectangle2D0, (XYPlot) null, jDBCXYDataset0, plotRenderingInfo0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(10, "\"&");
      // Undeclared exception!
      try { 
        xYSmoothLineAndShapeRenderer0.drawPrimaryLine(xYItemRendererState0, (Graphics2D) null, (XYPlot) null, jDBCXYDataset0, 281, 10, 10, false, cyclicNumberAxis0, cyclicNumberAxis0, rectangle2D0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 10, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double();
      XYSmoothLineAndShapeRenderer.getControlPoints(point2D_Double0, point2D_Double0, point2D_Double0, point2D_Double0, point2D_Double0, point2D_Double0, 3100.6594904698945);
      Point2D.Double[] point2D_DoubleArray0 = XYSmoothLineAndShapeRenderer.getBezierCurve(point2D_Double0, point2D_Double0, point2D_Double0, point2D_Double0, Double.NaN, 0);
      assertEquals(1, point2D_DoubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double();
      // Undeclared exception!
      try { 
        XYSmoothLineAndShapeRenderer.getControlPoints((Point2D.Double) null, point2D_Double0, (Point2D.Double) null, (Point2D.Double) null, point2D_Double0, point2D_Double0, (-3834.385543550774));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.experimental.chart.renderer.xy.XYSmoothLineAndShapeRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      LogAxis logAxis0 = new LogAxis();
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      XYItemRendererState xYItemRendererState0 = xYSplineRenderer0.initialise((Graphics2D) null, rectangle2D_Float0, xYPlot0, (XYDataset) null, plotRenderingInfo0);
      XYSmoothLineAndShapeRenderer xYSmoothLineAndShapeRenderer0 = new XYSmoothLineAndShapeRenderer();
      // Undeclared exception!
      try { 
        xYSmoothLineAndShapeRenderer0.drawPrimaryLine(xYItemRendererState0, (Graphics2D) null, xYPlot0, (XYDataset) null, 16, 500, 1164, false, logAxis0, logAxis0, rectangle2D_Float0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.experimental.chart.renderer.xy.XYSmoothLineAndShapeRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XYSmoothLineAndShapeRenderer xYSmoothLineAndShapeRenderer0 = new XYSmoothLineAndShapeRenderer();
      CompassPlot compassPlot0 = new CompassPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", compassPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 30, (double) 1.0F, (-2426.08841502348), (ChartRenderingInfo) null);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      DateAxis dateAxis0 = new DateAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(dateAxis0);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection();
      AffineTransformOp affineTransformOp0 = new AffineTransformOp(((SunGraphics2D) graphics2D0).transform, ((SunGraphics2D) graphics2D0).hints);
      Rectangle2D rectangle2D0 = affineTransformOp0.getBounds2D(bufferedImage0);
      XYCrosshairState xYCrosshairState0 = new XYCrosshairState();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      xYSmoothLineAndShapeRenderer0.drawSecondaryPass(graphics2D0, combinedDomainXYPlot0, xYSeriesCollection0, 62, 0, 62, dateAxis0, rectangle2D0, dateAxis0, xYCrosshairState0, standardEntityCollection0);
      assertTrue(xYSmoothLineAndShapeRenderer0.getAutoPopulateSeriesStroke());
  }
}
