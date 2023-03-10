/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 22:06:21 GMT 2022
 */

package org.jfree.chart.annotations;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYImageAnnotation;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.PolarItemRenderer;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.data.jdbc.JDBCPieDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYImageAnnotation_ESTest extends XYImageAnnotation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation(0.5F, 10, bufferedImage0);
      XYImageAnnotation xYImageAnnotation1 = new XYImageAnnotation(1.0F, 15, bufferedImage0, rectangleAnchor0);
      boolean boolean0 = xYImageAnnotation1.equals(xYImageAnnotation0);
      assertEquals(15.0, xYImageAnnotation1.getY(), 0.01);
      assertFalse(boolean0);
      assertEquals(1.0, xYImageAnnotation1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1.0), "org.jfree.chart.annotations.XYImageAnnotation");
      PolarPlot polarPlot0 = new PolarPlot((XYDataset) null, cyclicNumberAxis0, (PolarItemRenderer) null);
      JFreeChart jFreeChart0 = new JFreeChart(polarPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 90);
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation((-3447.234989337528), 0.0, bufferedImage0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(cyclicNumberAxis0);
      SystemColor systemColor0 = SystemColor.text;
      BevelBorder bevelBorder0 = new BevelBorder(10, systemColor0, systemColor0, systemColor0, systemColor0);
      JSeparator jSeparator0 = new JSeparator();
      Rectangle rectangle0 = bevelBorder0.getInteriorRectangle((Component) jSeparator0, 10, 0, 10, 90);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      PeriodAxis periodAxis0 = new PeriodAxis("Null 'image' argument.");
      xYImageAnnotation0.draw(graphics2D0, combinedDomainXYPlot0, rectangle0, cyclicNumberAxis0, periodAxis0, 0, plotRenderingInfo0);
      assertEquals((-3447.234989337528), xYImageAnnotation0.getX(), 0.01);
      assertEquals(0.0, xYImageAnnotation0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation(0.0, 0.0, bufferedImage0, rectangleAnchor0);
      double double0 = xYImageAnnotation0.getY();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, xYImageAnnotation0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCPieDataset jDBCPieDataset0 = new JDBCPieDataset(connection0);
      RingPlot ringPlot0 = new RingPlot(jDBCPieDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("6o5a3QJfSSS@.d|+", ringPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, (-49.65588003), 90.0, chartRenderingInfo0);
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation((-1376.55), (-1376.55), bufferedImage0);
      double double0 = xYImageAnnotation0.getY();
      assertEquals((-1376.55), double0, 0.01);
      assertEquals((-1376.55), xYImageAnnotation0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation(0.0, 0.0, bufferedImage0, rectangleAnchor0);
      double double0 = xYImageAnnotation0.getX();
      assertEquals(0.0, xYImageAnnotation0.getY(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation(54.1452, 54.1452, bufferedImage0, rectangleAnchor0);
      double double0 = xYImageAnnotation0.getX();
      assertEquals(54.1452, xYImageAnnotation0.getY(), 0.01);
      assertEquals(54.1452, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation(54.1452, 54.1452, bufferedImage0, rectangleAnchor0);
      bufferedImage0.setAccelerationPriority(0.0F);
      xYImageAnnotation0.getImage();
      assertEquals(54.1452, xYImageAnnotation0.getX(), 0.01);
      assertEquals(54.1452, xYImageAnnotation0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation(54.1452, 54.1452, bufferedImage0, rectangleAnchor0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        xYImageAnnotation0.draw(graphics2D0, (XYPlot) null, defaultCaret0, numberAxis3D0, numberAxis3D0, 1024, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.annotations.XYImageAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM;
      XYImageAnnotation xYImageAnnotation0 = null;
      try {
        xYImageAnnotation0 = new XYImageAnnotation((-3104.548773473825), (-3104.548773473825), (Image) null, rectangleAnchor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'image' argument.
         //
         verifyException("org.jfree.chart.annotations.XYImageAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation(1.0F, 1.0F, bufferedImage0);
      XYImageAnnotation xYImageAnnotation1 = new XYImageAnnotation(1.0F, 15, bufferedImage0, rectangleAnchor0);
      boolean boolean0 = xYImageAnnotation1.equals(xYImageAnnotation0);
      assertFalse(boolean0);
      assertEquals(1.0, xYImageAnnotation1.getX(), 0.01);
      assertEquals(15.0, xYImageAnnotation1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation(54.1452, 54.1452, bufferedImage0, rectangleAnchor0);
      XYImageAnnotation xYImageAnnotation1 = new XYImageAnnotation(1.0F, 15, bufferedImage0, rectangleAnchor0);
      boolean boolean0 = xYImageAnnotation1.equals(xYImageAnnotation0);
      assertFalse(boolean0);
      assertEquals(1.0, xYImageAnnotation1.getX(), 0.01);
      assertEquals(15.0, xYImageAnnotation1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation(54.1452, 54.1452, bufferedImage0, rectangleAnchor0);
      boolean boolean0 = xYImageAnnotation0.equals(xYImageAnnotation0);
      assertTrue(boolean0);
      assertEquals(54.1452, xYImageAnnotation0.getX(), 0.01);
      assertEquals(54.1452, xYImageAnnotation0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation(54.1452, 54.1452, bufferedImage0, rectangleAnchor0);
      boolean boolean0 = xYImageAnnotation0.equals(multiplePiePlot0);
      assertEquals(54.1452, xYImageAnnotation0.getX(), 0.01);
      assertEquals(54.1452, xYImageAnnotation0.getY(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "org.jfree.chart.annotations.XYImageAnnotation");
      PolarPlot polarPlot0 = new PolarPlot((XYDataset) null, cyclicNumberAxis0, (PolarItemRenderer) null);
      JFreeChart jFreeChart0 = new JFreeChart(polarPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 90);
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation((-3447.234989337528), 0.0, bufferedImage0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(cyclicNumberAxis0);
      SystemColor systemColor0 = SystemColor.text;
      xYImageAnnotation0.setToolTipText("");
      BevelBorder bevelBorder0 = new BevelBorder(10, systemColor0, systemColor0, systemColor0, systemColor0);
      JSeparator jSeparator0 = new JSeparator();
      Rectangle rectangle0 = bevelBorder0.getInteriorRectangle((Component) jSeparator0, 10, 0, 10, 90);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      xYImageAnnotation0.draw(graphics2D0, combinedDomainXYPlot0, rectangle0, cyclicNumberAxis0, cyclicNumberAxis0, 90, plotRenderingInfo0);
      assertEquals(0.0, xYImageAnnotation0.getY(), 0.01);
      assertEquals((-3447.234989337528), xYImageAnnotation0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      XYImageAnnotation xYImageAnnotation0 = null;
      try {
        xYImageAnnotation0 = new XYImageAnnotation(1.0F, 54.1452, bufferedImage0, (RectangleAnchor) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.annotations.XYImageAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XYImageAnnotation xYImageAnnotation0 = null;
      try {
        xYImageAnnotation0 = new XYImageAnnotation(2092.20581, 3208.144454149311, (Image) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'image' argument.
         //
         verifyException("org.jfree.chart.annotations.XYImageAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation(54.1452, 54.1452, bufferedImage0, rectangleAnchor0);
      xYImageAnnotation0.getImage();
      assertEquals(54.1452, xYImageAnnotation0.getX(), 0.01);
      assertEquals(54.1452, xYImageAnnotation0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation(54.1452, 54.1452, bufferedImage0, rectangleAnchor0);
      XYImageAnnotation xYImageAnnotation1 = (XYImageAnnotation)xYImageAnnotation0.clone();
      boolean boolean0 = xYImageAnnotation1.equals(xYImageAnnotation0);
      assertTrue(boolean0);
      assertEquals(54.1452, xYImageAnnotation1.getY(), 0.01);
      assertEquals(54.1452, xYImageAnnotation1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "org.jfree.chart.annotations.XYImageAnnotation");
      PolarPlot polarPlot0 = new PolarPlot((XYDataset) null, cyclicNumberAxis0, (PolarItemRenderer) null);
      JFreeChart jFreeChart0 = new JFreeChart(polarPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 90);
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation((-3447.234989337528), 0.0, bufferedImage0);
      double double0 = xYImageAnnotation0.getX();
      assertEquals((-3447.234989337528), double0, 0.01);
      assertEquals(0.0, xYImageAnnotation0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation(54.1452, 54.1452, bufferedImage0, rectangleAnchor0);
      xYImageAnnotation0.getImageAnchor();
      assertEquals(54.1452, xYImageAnnotation0.getX(), 0.01);
      assertEquals(54.1452, xYImageAnnotation0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation(54.1452, 54.1452, bufferedImage0, rectangleAnchor0);
      double double0 = xYImageAnnotation0.getY();
      assertEquals(54.1452, double0, 0.01);
      assertEquals(54.1452, xYImageAnnotation0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1.0), "org.jfree.chart.annotations.XYImageAnnotation");
      PolarPlot polarPlot0 = new PolarPlot((XYDataset) null, cyclicNumberAxis0, (PolarItemRenderer) null);
      JFreeChart jFreeChart0 = new JFreeChart(polarPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 90);
      XYImageAnnotation xYImageAnnotation0 = new XYImageAnnotation((-3447.234989337528), 0.0, bufferedImage0);
      xYImageAnnotation0.hashCode();
      assertEquals((-3447.234989337528), xYImageAnnotation0.getX(), 0.01);
      assertEquals(0.0, xYImageAnnotation0.getY(), 0.01);
  }
}
