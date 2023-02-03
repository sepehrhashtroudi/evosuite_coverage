/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 01:19:15 GMT 2022
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.text.AttributedCharacterIterator;
import javax.swing.JScrollPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlotRenderingInfo_ESTest extends PlotRenderingInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Font font0 = CompassPlot.DEFAULT_LABEL_FONT;
      CategoryPlot categoryPlot0 = new CategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.plot.PlotRenderingInfo", font0, categoryPlot0, true);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false, false, true, true, false);
      ChartRenderingInfo chartRenderingInfo1 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo1 = chartRenderingInfo1.getPlotInfo();
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo1);
      plotRenderingInfo0.clone();
      assertEquals(1, plotRenderingInfo0.getSubplotCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Font font0 = CompassPlot.DEFAULT_LABEL_FONT;
      CategoryPlot categoryPlot0 = new CategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.plot.PlotRenderingInfo", font0, categoryPlot0, true);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false, false, true, true, false);
      ChartRenderingInfo chartRenderingInfo1 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo1 = chartRenderingInfo1.getPlotInfo();
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo1);
      Point2D.Double point2D_Double0 = new Point2D.Double(0, 0);
      int int0 = plotRenderingInfo0.getSubplotIndex(point2D_Double0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Font font0 = CompassPlot.DEFAULT_LABEL_FONT;
      CategoryPlot categoryPlot0 = new CategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.plot.PlotRenderingInfo", font0, categoryPlot0, true);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false, false, true, true, false);
      ChartRenderingInfo chartRenderingInfo1 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo1 = chartRenderingInfo1.getPlotInfo();
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo1);
      PlotRenderingInfo plotRenderingInfo2 = plotRenderingInfo0.getSubplotInfo(0);
      assertEquals(0, plotRenderingInfo2.getSubplotCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Font font0 = SpiderWebPlot.DEFAULT_LABEL_FONT;
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      JFreeChart jFreeChart0 = new JFreeChart("JdbcXYDataset: swallowing exception.", font0, spiderWebPlot0, true);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo0);
      PlotRenderingInfo plotRenderingInfo1 = plotRenderingInfo0.getSubplotInfo(0);
      assertSame(plotRenderingInfo1, plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float();
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      plotRenderingInfo0.setPlotArea(rectangle2D0);
      Rectangle2D rectangle2D1 = plotRenderingInfo0.getPlotArea();
      assertEquals(0.0, rectangle2D1.getMinY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(274.1, 274.1, 274.1, 0.0);
      plotRenderingInfo0.setPlotArea(rectangle2D_Double0);
      Rectangle2D rectangle2D0 = plotRenderingInfo0.getPlotArea();
      assertEquals(274.1, rectangle2D0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Number[][] numberArray0 = new Number[5][6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("zc<nF*NpXwg,J2{Ly,");
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultIntervalCategoryDataset0, subCategoryAxis0, (ValueAxis) null, defaultCategoryItemRenderer0);
      JFreeChart jFreeChart0 = new JFreeChart("zc<nF*NpXwg,J2{Ly,", categoryPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, true, true, true, false, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      JScrollPane jScrollPane0 = new JScrollPane(chartPanel0);
      Rectangle rectangle0 = jScrollPane0.getViewportBorderBounds();
      plotRenderingInfo0.setPlotArea(rectangle0);
      Rectangle2D rectangle2D0 = plotRenderingInfo0.getPlotArea();
      assertSame(rectangle2D0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      ChartRenderingInfo chartRenderingInfo0 = plotRenderingInfo0.getOwner();
      assertNull(chartRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      plotRenderingInfo0.setDataArea((Rectangle2D) null);
      Rectangle2D rectangle2D0 = plotRenderingInfo0.getDataArea();
      assertNull(rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      int[] intArray0 = new int[0];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Rectangle rectangle0 = polygon0.getBounds();
      plotRenderingInfo0.setDataArea(rectangle0);
      Rectangle2D rectangle2D0 = plotRenderingInfo0.getDataArea();
      assertEquals(0.0, rectangle2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Dimension dimension0 = new Dimension(10, 10);
      Rectangle rectangle0 = new Rectangle(dimension0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      plotRenderingInfo0.setDataArea(rectangle0);
      Rectangle2D rectangle2D0 = plotRenderingInfo0.getDataArea();
      assertEquals(10.0, rectangle2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Line2D.Double line2D_Double0 = new Line2D.Double((-452.488), (-452.488), (-452.488), (-452.488));
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      plotRenderingInfo0.setDataArea(rectangle2D0);
      Rectangle2D rectangle2D1 = plotRenderingInfo0.getDataArea();
      assertSame(rectangle2D1, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        plotRenderingInfo0.getSubplotInfo((-327));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo0);
      plotRenderingInfo0.setDataArea((Rectangle2D) null);
      Point2D.Double point2D_Double0 = new Point2D.Double(0, 0);
      // Undeclared exception!
      try { 
        plotRenderingInfo0.getSubplotIndex(point2D_Double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.PlotRenderingInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      int int0 = plotRenderingInfo0.getSubplotCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        plotRenderingInfo0.clone();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float();
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      plotRenderingInfo0.setPlotArea(rectangle2D0);
      Object object0 = plotRenderingInfo0.clone();
      assertNotSame(object0, plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      PlotRenderingInfo plotRenderingInfo1 = (PlotRenderingInfo)plotRenderingInfo0.clone();
      assertTrue(plotRenderingInfo1.equals((Object)plotRenderingInfo0));
      
      plotRenderingInfo1.addSubplotInfo(plotRenderingInfo0);
      boolean boolean0 = plotRenderingInfo0.equals(plotRenderingInfo1);
      assertFalse(boolean0);
      assertFalse(plotRenderingInfo1.equals((Object)plotRenderingInfo0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Object object0 = plotRenderingInfo0.clone();
      assertTrue(object0.equals((Object)plotRenderingInfo0));
      
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float();
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      plotRenderingInfo0.setPlotArea(rectangle2D0);
      boolean boolean0 = plotRenderingInfo0.equals(object0);
      assertFalse(object0.equals((Object)plotRenderingInfo0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Object object0 = plotRenderingInfo0.clone();
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)plotRenderingInfo0.getDataArea();
      rectangle2D_Double0.x = 206.3;
      boolean boolean0 = plotRenderingInfo0.equals(object0);
      assertFalse(boolean0);
      assertFalse(object0.equals((Object)plotRenderingInfo0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Object object0 = plotRenderingInfo0.clone();
      boolean boolean0 = plotRenderingInfo0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      boolean boolean0 = plotRenderingInfo0.equals(plotRenderingInfo0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = AttributedCharacterIterator.Attribute.INPUT_METHOD_SEGMENT;
      boolean boolean0 = plotRenderingInfo0.equals(attributedCharacterIterator_Attribute0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        plotRenderingInfo0.getSubplotIndex((Point2D) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'source' argument.
         //
         verifyException("org.jfree.chart.plot.PlotRenderingInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      plotRenderingInfo0.setDataArea((Rectangle2D) null);
      Object object0 = plotRenderingInfo0.clone();
      assertNotSame(object0, plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Rectangle2D rectangle2D0 = plotRenderingInfo0.getPlotArea();
      assertNull(rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      ChartRenderingInfo chartRenderingInfo1 = plotRenderingInfo0.getOwner();
      assertSame(chartRenderingInfo0, chartRenderingInfo1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        plotRenderingInfo0.getSubplotInfo(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}