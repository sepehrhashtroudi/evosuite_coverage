/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 01:01:17 GMT 2022
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JScrollPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.needle.WindNeedle;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlotState;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.RingPlot;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.pie.DefaultPieDataset;
import org.jfree.data.pie.PieDataset;
import org.jfree.data.time.Minute;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RingPlot_ESTest extends RingPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      RingPlot ringPlot0 = new RingPlot(defaultKeyedValuesDataset0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Paint paint0 = combinedDomainXYPlot0.getDomainCrosshairPaint();
      ringPlot0.setSeparatorPaint(paint0);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      WindNeedle windNeedle0 = new WindNeedle();
      windNeedle0.setOutlinePaint(ringPlot0.DEFAULT_LABEL_PAINT);
      Paint paint0 = windNeedle0.getOutlinePaint();
      ringPlot0.setSeparatorPaint(paint0);
      Color color0 = (Color)ringPlot0.getSeparatorPaint();
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals((-16777216), color0.getRGB());
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      ringPlot0.setSeparatorsVisible(true);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      assertTrue(ringPlot0.getSeparatorsVisible());
      
      ringPlot0.setSeparatorsVisible(false);
      boolean boolean0 = ringPlot0.getSeparatorsVisible();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      
      ringPlot0.setSectionDepth(0.0);
      double double0 = ringPlot0.getLabelLinkDepth();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      ringPlot0.setSectionDepth((-565.0));
      double double0 = ringPlot0.getLabelLinkDepth();
      assertEquals((-565.0), ringPlot0.getSectionDepth(), 0.01);
      assertEquals((-282.5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      
      ringPlot0.setInnerSeparatorExtension(0.0);
      double double0 = ringPlot0.getInnerSeparatorExtension();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      ringPlot0.setInnerSeparatorExtension((-2.147483648E9));
      double double0 = ringPlot0.getInnerSeparatorExtension();
      assertEquals((-2.147483648E9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      JFreeChart jFreeChart0 = new JFreeChart((String) null, ringPlot0.DEFAULT_LABEL_FONT, ringPlot0, false);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 764);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        ringPlot0.initialise(graphics2D0, (Rectangle2D) null, (PiePlot) null, (Integer) ((SunGraphics2D) graphics2D0).transformState, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.PiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      RingPlot ringPlot1 = new RingPlot(defaultKeyedValuesDataset0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        ringPlot1.initialise((Graphics2D) null, rectangle2D0, ringPlot0, (Integer) ringPlot0.MINIMUM_WIDTH_TO_DRAW, plotRenderingInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dataset' argument.
         //
         verifyException("org.jfree.data.general.DatasetUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot((PieDataset) null);
      JScrollPane jScrollPane0 = new JScrollPane();
      Rectangle rectangle0 = jScrollPane0.getViewportBorderBounds();
      Ellipse2D.Double ellipse2D_Double0 = (Ellipse2D.Double)Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      JFreeChart jFreeChart0 = new JFreeChart(ringPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      PiePlotState piePlotState0 = ringPlot0.initialise((Graphics2D) null, rectangle2D0, ringPlot0, (Integer) 1, plotRenderingInfo0);
      // Undeclared exception!
      try { 
        ringPlot0.drawItem((Graphics2D) null, 3695, rectangle0, piePlotState0, 555);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.RingPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      RingPlot ringPlot0 = new RingPlot(defaultPieDataset0);
      double double0 = ringPlot0.getSectionDepth();
      assertEquals(0.2, double0, 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      Minute minute0 = new Minute();
      PeriodAxis periodAxis0 = new PeriodAxis(",l=", minute0, minute0);
      ringPlot0.setSeparatorStroke(periodAxis0.DEFAULT_TICK_MARK_STROKE);
      RingPlot ringPlot1 = new RingPlot();
      boolean boolean0 = ringPlot0.equals(ringPlot1);
      assertTrue(ringPlot1.getSeparatorsVisible());
      assertEquals(0.2, ringPlot1.getSectionDepth(), 0.01);
      assertFalse(ringPlot1.equals((Object)ringPlot0));
      assertEquals(0.2, ringPlot1.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot1.getInnerSeparatorExtension(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      RingPlot ringPlot1 = new RingPlot();
      boolean boolean0 = ringPlot0.equals(ringPlot1);
      assertEquals(0.2, ringPlot1.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot1.getOuterSeparatorExtension(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.2, ringPlot1.getSectionDepth(), 0.01);
      assertTrue(ringPlot1.getSeparatorsVisible());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      boolean boolean0 = ringPlot0.equals(ringPlot0);
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      boolean boolean0 = ringPlot0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      // Undeclared exception!
      try { 
        ringPlot0.setSeparatorPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.plot.RingPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      // Undeclared exception!
      try { 
        ringPlot0.setSeparatorStroke((Stroke) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.plot.RingPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      double double0 = ringPlot0.getInnerSeparatorExtension();
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertEquals(0.2, double0, 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot((PieDataset) null);
      BasicStroke basicStroke0 = (BasicStroke)ringPlot0.getSeparatorStroke();
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
      assertEquals(2, basicStroke0.getEndCap());
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot((PieDataset) null);
      double double0 = ringPlot0.getOuterSeparatorExtension();
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, double0, 0.01);
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot((PieDataset) null);
      boolean boolean0 = ringPlot0.getSeparatorsVisible();
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot((PieDataset) null);
      Color color0 = (Color)ringPlot0.getSeparatorPaint();
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertEquals(128, color0.getGreen());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      double double0 = ringPlot0.getLabelLinkDepth();
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot((PieDataset) null);
      ringPlot0.setOuterSeparatorExtension(0.2);
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
  }
}