/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 02:09:41 GMT 2022
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.IntervalBarRenderer;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.category.SlidingCategoryDataset;
import org.jfree.data.statistics.BoxAndWhiskerItem;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IntervalBarRenderer_ESTest extends IntervalBarRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.util.Rotation", spiderWebPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false, true, false, false, false);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 1.0, (double) 1.0F, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = intervalBarRenderer0.createState(plotRenderingInfo0);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      Number[][] numberArray0 = new Number[2][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      intervalBarRenderer0.drawInterval(graphics2D0, categoryItemRendererState0, (Rectangle2D) null, combinedDomainCategoryPlot0, (CategoryAxis) null, cyclicNumberAxis0, defaultIntervalCategoryDataset0, 0, (-1231), false);
      assertTrue(intervalBarRenderer0.getAutoPopulateSeriesStroke());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      BoxAndWhiskerItem boxAndWhiskerItem0 = new BoxAndWhiskerItem(3.0, 0.2, 1.0, 1660.428, 1.0, 743.7277, 3722.0, 0.0, (List) null);
      defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem0, (Comparable) 3.0, (Comparable) 3.0);
      Range range0 = intervalBarRenderer0.findRangeBounds((CategoryDataset) defaultBoxAndWhiskerCategoryDataset0);
      assertEquals(743.7277, range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      double[][] doubleArray0 = new double[9][1];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-2248.976);
      doubleArray0[0] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = intervalBarRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0);
      assertEquals((-1124.488), range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset((CategoryDataset) null, 4356, 5);
      // Undeclared exception!
      try { 
        intervalBarRenderer0.findRangeBounds((CategoryDataset) slidingCategoryDataset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.category.SlidingCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      Number[][] numberArray0 = new Number[9][9];
      Number[] numberArray1 = new Number[3];
      numberArray0[5] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        intervalBarRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      IntervalBarRenderer intervalBarRenderer1 = new IntervalBarRenderer();
      boolean boolean0 = intervalBarRenderer0.equals(intervalBarRenderer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      boolean boolean0 = intervalBarRenderer0.equals(intervalBarRenderer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      boolean boolean0 = intervalBarRenderer0.equals("5t/?13@\u0000C@JD!");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.util.Rotation", spiderWebPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false, true, false, false, false);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 1.0, (double) 1.0F, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = intervalBarRenderer0.createState(plotRenderingInfo0);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(15, "ZOOM_IN_DOMAIN");
      Number[][] numberArray0 = new Number[9][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      intervalBarRenderer0.drawItem(graphics2D0, categoryItemRendererState0, (Rectangle2D) null, combinedDomainCategoryPlot0, (CategoryAxis) null, cyclicNumberAxis0, defaultIntervalCategoryDataset0, (-1), (-2837), true, 10);
      assertEquals(500, ValueAxis.MAXIMUM_TICK_COUNT);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(810.995716436, 1.0F, 0.2, 1.0F);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot((ValueAxis) null);
      CategoryAxis categoryAxis0 = new CategoryAxis("ys/");
      // Undeclared exception!
      try { 
        intervalBarRenderer0.drawItem((Graphics2D) null, categoryStepRenderer_State0, rectangle2D_Double0, combinedRangeCategoryPlot0, categoryAxis0, (ValueAxis) null, defaultMultiValueCategoryDataset0, 0, 10, true, 500);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset(defaultMultiValueCategoryDataset0, (-2283), (-1));
      Range range0 = intervalBarRenderer0.findRangeBounds((CategoryDataset) slidingCategoryDataset0);
      assertNull(range0);
  }
}