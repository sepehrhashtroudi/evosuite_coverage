/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 22:04:21 GMT 2022
 */

package org.jfree.chart.annotations;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYBoxAnnotation;
import org.jfree.chart.annotations.XYPointerAnnotation;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYBoxAnnotation_ESTest extends XYBoxAnnotation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation((-1.0), (-1.0), (-1.0), (-1334.865));
      xYBoxAnnotation0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation(3520.185067, 3520.185067, 3520.185067, 3520.185067);
      XYBoxAnnotation xYBoxAnnotation1 = new XYBoxAnnotation(3520.185067, 1.0F, 1.0F, 10);
      boolean boolean0 = xYBoxAnnotation0.equals(xYBoxAnnotation1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Stroke stroke0 = combinedDomainXYPlot0.getDomainGridlineStroke();
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation(0.0, 0.0, 0.0, 0.0, stroke0, combinedDomainXYPlot0.DEFAULT_CROSSHAIR_PAINT, combinedDomainXYPlot0.DEFAULT_BACKGROUND_PAINT);
      XYBoxAnnotation xYBoxAnnotation1 = new XYBoxAnnotation((-1.0), 500000.0, 0.0, 303.626230665);
      boolean boolean0 = xYBoxAnnotation0.equals(xYBoxAnnotation1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      Stroke stroke0 = combinedRangeCategoryPlot0.getDomainGridlineStroke();
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation(0.0, 435.4362, 0.0, 50000.0, stroke0, combinedRangeCategoryPlot0.DEFAULT_OUTLINE_PAINT);
      XYPlot xYPlot0 = new XYPlot();
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      JFreeChart jFreeChart0 = new JFreeChart(fastScatterPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, (-335), 986, 986, 0, 1809, 0, true, false, true, true, true, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      Rectangle2D rectangle2D0 = plotRenderingInfo0.getDataArea();
      LogAxis logAxis0 = new LogAxis();
      // Undeclared exception!
      try { 
        xYBoxAnnotation0.draw((Graphics2D) null, xYPlot0, rectangle2D0, logAxis0, logAxis0, 0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.annotations.XYBoxAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation(3520.185067, 3520.185067, 3520.185067, 3520.185067);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Stroke stroke0 = combinedDomainXYPlot0.getRangeCrosshairStroke();
      XYBoxAnnotation xYBoxAnnotation1 = new XYBoxAnnotation(3520.185067, 3520.185067, 3520.185067, 3520.185067, stroke0, combinedDomainXYPlot0.DEFAULT_GRIDLINE_PAINT);
      boolean boolean0 = xYBoxAnnotation0.equals(xYBoxAnnotation1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation(3520.185067, 3520.185067, 3520.185067, 3520.185067);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Stroke stroke0 = combinedDomainXYPlot0.getRangeCrosshairStroke();
      XYBoxAnnotation xYBoxAnnotation1 = new XYBoxAnnotation(3520.185067, 3520.185067, 3520.185067, 1001.0, stroke0, combinedDomainXYPlot0.DEFAULT_GRIDLINE_PAINT);
      boolean boolean0 = xYBoxAnnotation0.equals(xYBoxAnnotation1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation((-534.6840132553064), (-534.6840132553064), (-534.6840132553064), 0.05);
      XYBoxAnnotation xYBoxAnnotation1 = new XYBoxAnnotation((-534.6840132553064), (-534.6840132553064), 1670.07900244735, (-534.6840132553064));
      boolean boolean0 = xYBoxAnnotation0.equals(xYBoxAnnotation1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation((-1.4296050402324463), (-2085.67), (-1.1390506448448168), (-1.1390506448448168));
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      Stroke stroke0 = defaultPolarItemRenderer0.getItemOutlineStroke(2146631264, 32, true);
      XYBoxAnnotation xYBoxAnnotation1 = new XYBoxAnnotation((-1.4296050402324463), 1.0, (-1.1390506448448168), (-1.4296050402324463), stroke0, defaultPolarItemRenderer0.DEFAULT_VALUE_LABEL_PAINT, defaultPolarItemRenderer0.DEFAULT_VALUE_LABEL_PAINT);
      boolean boolean0 = xYBoxAnnotation0.equals(xYBoxAnnotation1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation((-534.6840132553064), 0.75, (-534.6840132553064), 0.05);
      XYBoxAnnotation xYBoxAnnotation1 = new XYBoxAnnotation(0.75, 0.75, 1670.07900244735, (-534.6840132553064));
      boolean boolean0 = xYBoxAnnotation0.equals(xYBoxAnnotation1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("8)}6");
      Stroke stroke0 = periodAxis0.getMinorTickMarkStroke();
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation((-1.0), (-1.0), (-1.0), 1252.21746803, stroke0, periodAxis0.DEFAULT_AXIS_LINE_PAINT, periodAxis0.DEFAULT_TICK_LABEL_PAINT);
      Object object0 = xYBoxAnnotation0.clone();
      boolean boolean0 = xYBoxAnnotation0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("8)}6");
      Stroke stroke0 = periodAxis0.getMinorTickMarkStroke();
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation((-1.0), (-1.0), (-1.0), 1252.21746803, stroke0, periodAxis0.DEFAULT_AXIS_LINE_PAINT, periodAxis0.DEFAULT_TICK_LABEL_PAINT);
      boolean boolean0 = xYBoxAnnotation0.equals("8)}6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("8)}6");
      Stroke stroke0 = periodAxis0.getMinorTickMarkStroke();
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation((-1.0), (-1.0), (-1.0), 1252.21746803, stroke0, periodAxis0.DEFAULT_AXIS_LINE_PAINT, periodAxis0.DEFAULT_TICK_LABEL_PAINT);
      boolean boolean0 = xYBoxAnnotation0.equals(xYBoxAnnotation0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYPointerAnnotation xYPointerAnnotation0 = new XYPointerAnnotation("S9xN=rQ(", 3066.7426, 0.0, 1236.753160349412);
      Stroke stroke0 = xYPointerAnnotation0.getOutlineStroke();
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation(753.085, 753.085, 3066.7426, 3066.7426, stroke0, xYPointerAnnotation0.DEFAULT_PAINT);
      boolean boolean0 = xYBoxAnnotation0.equals(xYPointerAnnotation0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PolarPlot polarPlot0 = new PolarPlot();
      Stroke stroke0 = polarPlot0.getRadiusGridlineStroke();
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation(154.042007693, 0.6428571428571429, 0.6428571428571429, 1.0, stroke0, polarPlot0.DEFAULT_OUTLINE_PAINT, polarPlot0.DEFAULT_OUTLINE_PAINT);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(10, 1.0F);
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(cyclicNumberAxis0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      DateAxis dateAxis0 = new DateAxis();
      // Undeclared exception!
      try { 
        xYBoxAnnotation0.draw((Graphics2D) null, combinedRangeXYPlot0, rectangle2D_Double0, dateAxis0, cyclicNumberAxis0, (-1099930649), (PlotRenderingInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.annotations.XYBoxAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation(3520.185067, 3520.185067, 3520.185067, 3520.185067);
      xYBoxAnnotation0.hashCode();
  }
}
