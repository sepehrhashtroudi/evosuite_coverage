/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 02:22:32 GMT 2022
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.util.Vector;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.Hour;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LevelRenderer_ESTest extends LevelRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setItemMargin(135.0);
      levelRenderer0.hashCode();
      assertEquals(135.0, levelRenderer0.getItemMargin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      LevelRenderer levelRenderer1 = (LevelRenderer)levelRenderer0.clone();
      levelRenderer1.setItemMargin((-458.174));
      boolean boolean0 = levelRenderer0.equals(levelRenderer1);
      assertEquals((-458.174), levelRenderer1.getItemMargin(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setItemMargin((-4328.4854763722));
      SegmentedTimeline segmentedTimeline0 = SegmentedTimeline.newFifteenMinuteTimeline();
      SegmentedTimeline.Segment segmentedTimeline_Segment0 = segmentedTimeline0.getSegment(0L);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      // Undeclared exception!
      try { 
        levelRenderer0.getItemMiddle(segmentedTimeline_Segment0, 900000L, (CategoryDataset) null, subCategoryAxis0, (Rectangle2D) null, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = categoryStepRenderer0.createState(plotRenderingInfo0);
      JTable jTable0 = new JTable((Vector) null, (Vector) null);
      Rectangle rectangle0 = jTable0.getCellRect(5, (-2073), false);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot((CategoryAxis) null);
      DateAxis dateAxis0 = new DateAxis();
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      // Undeclared exception!
      try { 
        levelRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, rectangle0, combinedDomainCategoryPlot0, (CategoryAxis) null, dateAxis0, defaultMultiValueCategoryDataset0, 0, 0, true, 500);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      Hour hour0 = new Hour();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("Copy");
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      PeriodAxis periodAxis0 = new PeriodAxis(":y#\"N=", hour0, hour0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(periodAxis0);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge();
      levelRenderer0.getItemMiddle(hour0, hour0, defaultKeyedValues2DDataset0, categoryAxis3D0, rectangle2D_Double0, rectangleEdge0);
      assertEquals(1.0, levelRenderer0.getMaximumItemWidth(), 0.01);
      assertEquals(0.2, levelRenderer0.getItemMargin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(numberAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("o2!z9o;|;dwx)y;&X", combinedRangeCategoryPlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 10, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      RoundRectangle2D.Double roundRectangle2D_Double0 = new RoundRectangle2D.Double(10, 1.0F, 2.0F, 0.0, 10, 0.5F);
      Rectangle2D rectangle2D0 = roundRectangle2D_Double0.getBounds2D();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        levelRenderer0.initialise(graphics2D0, rectangle2D0, combinedRangeCategoryPlot0, defaultBoxAndWhiskerCategoryDataset0, plotRenderingInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setMaximumItemWidth((-237.461888658));
      double double0 = levelRenderer0.getMaximumItemWidth();
      assertEquals((-237.461888658), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      double double0 = levelRenderer0.calculateSeriesWidth(0.2, categoryAxis3D0, 7, 7);
      assertEquals(1.0, levelRenderer0.getMaximumItemWidth(), 0.01);
      assertEquals(0.002040816326530612, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setItemMargin(2616.0);
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      double double0 = levelRenderer0.calculateSeriesWidth(2616.0, categoryAxis0, 84, 84);
      assertEquals(2616.0, levelRenderer0.getItemMargin(), 0.01);
      assertEquals((-969.6180272108844), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      double[][] doubleArray0 = new double[1][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        levelRenderer0.initialise((Graphics2D) null, (Rectangle2D) null, combinedDomainCategoryPlot0, defaultIntervalCategoryDataset0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset(taskSeriesCollection0, 0, 0);
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("HorizontalAlignment.RIGHT");
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(taskSeriesCollection0);
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.urls.TimeSeriesURLGenerator", levelRenderer0.DEFAULT_VALUE_LABEL_FONT, multiplePiePlot0, true);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0);
      Rectangle2D rectangle2D0 = chartPanel0.getScreenDataArea(10, 10);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      // Undeclared exception!
      try { 
        levelRenderer0.getItemMiddle((Comparable) null, (Comparable) null, slidingGanttCategoryDataset0, categoryAxis3D0, rectangle2D0, rectangleEdge0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
         verifyException("org.jfree.data.gantt.TaskSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-924.78084773));
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(cyclicNumberAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("NMYmu1y]7*3%\"g.M-", levelRenderer0.DEFAULT_VALUE_LABEL_FONT, combinedRangeXYPlot0, false);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 1285, 0.2, (-1805.21), chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset(taskSeriesCollection0, (-1), 10);
      // Undeclared exception!
      try { 
        levelRenderer0.drawItem(graphics2D0, (CategoryItemRendererState) null, defaultCaret0, combinedDomainCategoryPlot0, categoryAxis0, cyclicNumberAxis0, slidingGanttCategoryDataset0, 10, 1, true, (-975));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.LevelRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      // Undeclared exception!
      try { 
        levelRenderer0.calculateSeriesWidth(0.0, (CategoryAxis) null, (-1004), (-1004));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.LevelRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      JTable jTable0 = new JTable();
      Rectangle rectangle0 = jTable0.getCellRect(0, 2106, false);
      double[][] doubleArray0 = new double[7][6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CategoryItemRendererState categoryItemRendererState0 = categoryStepRenderer0.createState((PlotRenderingInfo) null);
      // Undeclared exception!
      try { 
        levelRenderer0.calculateItemWidth((CategoryPlot) null, rectangle0, defaultIntervalCategoryDataset0, categoryItemRendererState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      Point point0 = new Point();
      Line2D.Double line2D_Double0 = new Line2D.Double(point0, point0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      double[][] doubleArray0 = new double[1][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = new CategoryItemRendererState(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        levelRenderer0.calculateItemWidth(combinedDomainCategoryPlot0, rectangle0, defaultIntervalCategoryDataset0, categoryItemRendererState0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      ChartPanel chartPanel0 = new ChartPanel((JFreeChart) null, true);
      PlotOrientation plotOrientation0 = chartPanel0.getOrientation();
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(23.079157F, 23.079157F, 102.0F, 1.0F);
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = levelRenderer0.createState(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        levelRenderer0.calculateBarW0((CategoryPlot) null, plotOrientation0, rectangle2D0, categoryAxis3D0, categoryItemRendererState0, 680, 768);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.LevelRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      double double0 = levelRenderer0.getItemMargin();
      assertEquals(0.2, double0, 0.01);
      assertEquals(1.0, levelRenderer0.getMaximumItemWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      LevelRenderer levelRenderer1 = (LevelRenderer)levelRenderer0.clone();
      boolean boolean0 = levelRenderer0.equals(levelRenderer1);
      assertEquals(1.0, levelRenderer1.getMaximumItemWidth(), 0.01);
      assertEquals(0.2, levelRenderer1.getItemMargin(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      boolean boolean0 = levelRenderer0.equals("EP<S>F~n?|m5ajhQ&");
      assertEquals(0.2, levelRenderer0.getItemMargin(), 0.01);
      assertEquals(1.0, levelRenderer0.getMaximumItemWidth(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      boolean boolean0 = levelRenderer0.equals(levelRenderer0);
      assertTrue(boolean0);
      assertEquals(0.2, levelRenderer0.getItemMargin(), 0.01);
      assertEquals(1.0, levelRenderer0.getMaximumItemWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      Object object0 = levelRenderer0.clone();
      levelRenderer0.setItemMargin((-458.174));
      boolean boolean0 = levelRenderer0.equals(object0);
      assertEquals((-458.174), levelRenderer0.getItemMargin(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      String[] stringArray0 = new String[7];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultStatisticalCategoryDataset0, categoryAxis3D0, symbolAxis0, levelRenderer0);
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float(0.0F, (-507.0F), 2.0F, 1.0F, 10, 0.0F);
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        levelRenderer0.drawItem((Graphics2D) null, categoryStepRenderer_State0, rectangle2D0, categoryPlot0, categoryAxis3D0, symbolAxis0, defaultStatisticalCategoryDataset0, 500, 10, false, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 500, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
      Rectangle rectangle0 = new Rectangle();
      CategoryItemRendererState categoryItemRendererState0 = levelRenderer0.createState((PlotRenderingInfo) null);
      int[] intArray0 = new int[6];
      categoryItemRendererState0.setVisibleSeriesArray(intArray0);
      double double0 = levelRenderer0.calculateBarW0(combinedDomainCategoryPlot0, plotOrientation0, rectangle0, categoryAxis0, categoryItemRendererState0, 56, (-1801));
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(1.0, levelRenderer0.getMaximumItemWidth(), 0.01);
      assertEquals(0.2, levelRenderer0.getItemMargin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField(combinedDomainCategoryPlot0);
      JScrollPane jScrollPane0 = new JScrollPane(jFormattedTextField0);
      Rectangle rectangle0 = jScrollPane0.getViewportBorderBounds();
      CategoryItemRendererState categoryItemRendererState0 = new CategoryItemRendererState((PlotRenderingInfo) null);
      // Undeclared exception!
      try { 
        levelRenderer0.calculateBarW0(combinedDomainCategoryPlot0, plotOrientation0, rectangle0, categoryAxis0, categoryItemRendererState0, 56, (-1801));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid category index: -1801
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      JScrollPane jScrollPane0 = new JScrollPane();
      Rectangle rectangle0 = jScrollPane0.getViewportBorderBounds();
      CategoryItemRendererState categoryItemRendererState0 = levelRenderer0.createState((PlotRenderingInfo) null);
      // Undeclared exception!
      try { 
        levelRenderer0.calculateBarW0(combinedDomainCategoryPlot0, plotOrientation0, rectangle0, categoryAxis0, categoryItemRendererState0, 56, (-1801));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid category index: -1801
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      String[] stringArray0 = new String[7];
      defaultStatisticalCategoryDataset0.add(1351.51614088, 1351.51614088, (Comparable) true, (Comparable) 0.05);
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultStatisticalCategoryDataset0, categoryAxis3D0, symbolAxis0, levelRenderer0);
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float(0.0F, (-507.0F), 2.0F, 1.0F, 10, 0.0F);
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      levelRenderer0.calculateItemWidth(categoryPlot0, rectangle2D0, defaultStatisticalCategoryDataset0, categoryStepRenderer_State0);
      assertEquals(1.7999999999999998, categoryStepRenderer_State0.getBarWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      String[] stringArray0 = new String[7];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultStatisticalCategoryDataset0, categoryAxis3D0, symbolAxis0, levelRenderer0);
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float(0.0F, (-507.0F), 2.0F, 1.0F, 10, 0.0F);
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      levelRenderer0.calculateItemWidth(categoryPlot0, rectangle2D0, defaultStatisticalCategoryDataset0, categoryStepRenderer_State0);
      assertEquals(1.7999999999999998, categoryStepRenderer_State0.getBarWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      assertEquals(1.0, levelRenderer0.getMaximumItemWidth(), 0.01);
      
      levelRenderer0.setMaximumItemWidth(0.0);
      double double0 = levelRenderer0.getMaximumItemWidth();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setItemMargin((-458.174));
      double double0 = levelRenderer0.getItemMargin();
      assertEquals((-458.174), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      double double0 = levelRenderer0.getMaximumItemWidth();
      assertEquals(0.2, levelRenderer0.getItemMargin(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      double double0 = levelRenderer0.calculateSeriesWidth(0.0, categoryAxis3D0, 270, 270);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.2, levelRenderer0.getItemMargin(), 0.01);
      assertEquals(1.0, levelRenderer0.getMaximumItemWidth(), 0.01);
  }
}
