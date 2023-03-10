/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 22:28:04 GMT 2022
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.general.ValueDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.time.DateRange;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ModuloAxis_ESTest extends ModuloAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XYSeries xYSeries0 = new XYSeries("Y", true);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection(xYSeries0);
      xYSeries0.addOrUpdate(1195.3003, 1195.3003);
      Range range0 = xYSeriesCollection0.getDomainBounds(false);
      ModuloAxis moduloAxis0 = new ModuloAxis("Y", range0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(moduloAxis0);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge(1101);
      // Undeclared exception!
      try { 
        moduloAxis0.lengthToJava2D(1195.3003, (Rectangle2D) null, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.ModuloAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = ValueAxis.DEFAULT_RANGE;
      ModuloAxis moduloAxis0 = new ModuloAxis("BMR2/@fc", range0);
      moduloAxis0.resizeRange((double) 10, (double) 2.0F);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      JFreeChart jFreeChart0 = new JFreeChart("jgK|a||_N20U$", meterPlot0);
      LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
      double double0 = moduloAxis0.lengthToJava2D(1735.0, rectangle2D_Double0, legendTitle0.DEFAULT_POSITION);
      assertEquals(1.0, moduloAxis0.getDisplayEnd(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, (-669.2));
      Number[][] numberArray0 = new Number[1][7];
      Number[] numberArray1 = new Number[6];
      numberArray1[0] = (Number) 8.0;
      numberArray0[0] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      Range range0 = stackedBarRenderer3D0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0);
      ModuloAxis moduloAxis0 = new ModuloAxis("", range0);
      moduloAxis0.resizeRange(270.0, 0.0);
      CategoryPlot categoryPlot0 = new CategoryPlot();
      RectangleEdge rectangleEdge0 = categoryPlot0.getRangeAxisEdge(500);
      // Undeclared exception!
      try { 
        moduloAxis0.lengthToJava2D((-1179.9952000647), (Rectangle2D) null, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.ModuloAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("n*|x`<TXcz", (Range) null);
      moduloAxis0.resizeRange((-700.5), (-700.5));
      assertEquals(90.0, moduloAxis0.getDisplayEnd(), 0.01);
      assertTrue(moduloAxis0.isAutoRange());
      assertEquals(270.0, moduloAxis0.getDisplayStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, (-669.2));
      Number[][] numberArray0 = new Number[1][7];
      Number[] numberArray1 = new Number[6];
      numberArray1[0] = (Number) 8.0;
      numberArray0[0] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      Range range0 = stackedBarRenderer3D0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0);
      ModuloAxis moduloAxis0 = new ModuloAxis("", range0);
      moduloAxis0.resizeRange(270.0, 0.0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(2.0F, 0.0F, 270.0, 0.0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge(500);
      double double0 = moduloAxis0.java2DToValue(1.0, rectangle2D_Double0, rectangleEdge0);
      assertFalse(moduloAxis0.isAutoRange());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("BSRZc", range0);
      moduloAxis0.resizeRange((double) 10, (-775.77904196));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      JFreeChart jFreeChart0 = new JFreeChart("jgK|a||_N20U$", meterPlot0);
      rectangle2D_Double0.setRect((double) 10.0F, 1746.20802, 2.5, 4631.6933);
      LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
      RectangleEdge rectangleEdge0 = legendTitle0.getLegendItemGraphicEdge();
      double double0 = moduloAxis0.valueToJava2D((-221.2693), rectangle2D_Double0, rectangleEdge0);
      assertFalse(moduloAxis0.isAutoRange());
      assertEquals(3853.1772537913894, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("BSRZc", range0);
      moduloAxis0.resizeRange((double) 10, (-775.77904196));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      JFreeChart jFreeChart0 = new JFreeChart("jgK|a||_N20U$", meterPlot0);
      rectangle2D_Double0.setRect((double) 10.0F, 1746.20802, 2.5, 4631.6933);
      LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
      double double0 = moduloAxis0.valueToJava2D(4631.6933, rectangle2D_Double0, legendTitle0.DEFAULT_POSITION);
      assertFalse(moduloAxis0.isAutoRange());
      assertEquals(10.186808548999997, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("BSRZc", range0);
      moduloAxis0.resizeRange((double) 10, (-770.555931332499));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      rectangle2D_Double0.height = (-337.4593957);
      JFreeChart jFreeChart0 = new JFreeChart("jgK|a||_N20U$", meterPlot0);
      LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
      RectangleEdge rectangleEdge0 = legendTitle0.getLegendItemGraphicEdge();
      double double0 = moduloAxis0.valueToJava2D(3.0F, rectangle2D_Double0, rectangleEdge0);
      assertFalse(moduloAxis0.isAutoRange());
      assertEquals((-7.849456991877872E16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = ValueAxis.DEFAULT_RANGE;
      ModuloAxis moduloAxis0 = new ModuloAxis("BMR2/@fc", range0);
      moduloAxis0.resizeRange((double) 10, (double) 2.0F);
      JFreeChart jFreeChart0 = new JFreeChart("jgK|a||_N20U$", meterPlot0);
      LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(10, 0.5F, 0.5F, 0.0F);
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      double double0 = moduloAxis0.valueToJava2D(10, rectangle2D0, legendTitle0.DEFAULT_POSITION);
      assertFalse(moduloAxis0.isAutoRange());
      assertEquals(10.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYSeries xYSeries0 = new XYSeries("Y", true);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection(xYSeries0);
      xYSeries0.addOrUpdate(1195.3003, 1195.3003);
      Range range0 = xYSeriesCollection0.getDomainBounds(false);
      ModuloAxis moduloAxis0 = new ModuloAxis("Y", range0);
      moduloAxis0.setDisplayRange(1101, (-441.8080808788));
      assertEquals(Double.NaN, moduloAxis0.getDisplayEnd(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("BSRZc", range0);
      moduloAxis0.resizeRange((double) 10, (double) 1.0F);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      JFreeChart jFreeChart0 = new JFreeChart("jgK|a~#||_N\u0000U", meterPlot0);
      LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
      double double0 = moduloAxis0.valueToJava2D((-222.02551833125727), rectangle2D_Double0, legendTitle0.DEFAULT_POSITION);
      assertFalse(moduloAxis0.isAutoRange());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot((ValueDataset) null);
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis((String) null, range0);
      moduloAxis0.autoAdjustRange();
      assertEquals(100.0, moduloAxis0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = ValueAxis.DEFAULT_RANGE;
      ModuloAxis moduloAxis0 = new ModuloAxis("BMR2/@fc", range0);
      JFreeChart jFreeChart0 = new JFreeChart("jgK|a||_N20U$", meterPlot0);
      LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(10, 0.5F, 0.5F, 0.0F);
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      double double0 = moduloAxis0.valueToJava2D(10, rectangle2D0, legendTitle0.DEFAULT_POSITION);
      assertEquals(10.751396648044693, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("BSRZc", range0);
      moduloAxis0.resizeRange((double) 10, (-775.77904196));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      JFreeChart jFreeChart0 = new JFreeChart("jgK|a||_N20U$", meterPlot0);
      rectangle2D_Double0.setRect((double) 10.0F, 1746.20802, 2.5, 4631.6933);
      LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
      double double0 = moduloAxis0.lengthToJava2D(270, rectangle2D_Double0, legendTitle0.DEFAULT_POSITION);
      assertFalse(moduloAxis0.isAutoRange());
      assertEquals(6.750000000000008, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Color color0 = (Color)XYTextAnnotation.DEFAULT_PAINT;
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(color0, color0, color0, color0);
      Number[][] numberArray0 = new Number[3][1];
      Number[] numberArray1 = new Number[1];
      numberArray1[0] = (Number) waterfallBarRenderer0.ZERO;
      numberArray0[0] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((String[]) null, numberArray0, numberArray0);
      Range range0 = waterfallBarRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0);
      ModuloAxis moduloAxis0 = new ModuloAxis("|] qo-xth00sx", range0);
      Rectangle rectangle0 = new Rectangle(192, 500);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      RectangleEdge rectangleEdge0 = combinedRangeCategoryPlot0.getDomainAxisEdge(304);
      double double0 = moduloAxis0.lengthToJava2D(1.0E-8, rectangle0, rectangleEdge0);
      assertEquals((-1.0666666666666668E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("1:^h@~U`OA.B%v $lP", range0);
      assertEquals(90.0, moduloAxis0.getDisplayEnd(), 0.01);
      
      moduloAxis0.setDisplayRange(0.0, 1.0F);
      double double0 = moduloAxis0.getDisplayStart();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      ModuloAxis moduloAxis0 = new ModuloAxis("`r\rO~R&lFt6?KV4O.Y", (Range) null);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      AxisLocation axisLocation0 = AxisLocation.TOP_OR_LEFT;
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      RectangleEdge rectangleEdge0 = Plot.resolveDomainAxisLocation(axisLocation0, plotOrientation0);
      // Undeclared exception!
      try { 
        moduloAxis0.valueToJava2D((double) scatterRenderer0.ZERO, rectangle2D_Float0, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.ModuloAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("Z?\bM.B2>gk5q#N", (Range) null);
      // Undeclared exception!
      try { 
        moduloAxis0.setDisplayRange(538.6982, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.ModuloAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("-6uNe%e", (Range) null);
      // Undeclared exception!
      try { 
        moduloAxis0.resizeRange(2608.247907792, 2608.247907792);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.ModuloAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("org.jfree.chart.axis.ExtendedCategoryAxis", (Range) null);
      // Undeclared exception!
      try { 
        moduloAxis0.resizeRange(1.7976931348623157E308);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.ModuloAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("bjdE`", (Range) null);
      ModuloAxis moduloAxis1 = new ModuloAxis("", moduloAxis0.DEFAULT_RANGE);
      // Undeclared exception!
      try { 
        moduloAxis0.equals(moduloAxis1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.ModuloAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("akIg.S ", range0);
      ModuloAxis moduloAxis1 = new ModuloAxis("akIg.S ", range0);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      DateAxis dateAxis0 = new DateAxis("6Z|TH'<J|hyMecp");
      ModuloAxis moduloAxis2 = new ModuloAxis("akIg.S ", (Range) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("1:^h@~U`OA.B%v $lP", range0);
      Object object0 = moduloAxis0.clone();
      moduloAxis0.resizeRange(1850.5120952010222);
      boolean boolean0 = moduloAxis0.equals(object0);
      assertFalse(moduloAxis0.isAutoRange());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("akIg.S ", range0);
      ModuloAxis moduloAxis1 = new ModuloAxis("akIg.S ", range0);
      boolean boolean0 = moduloAxis0.equals(moduloAxis1);
      assertTrue(boolean0);
      assertEquals(270.0, moduloAxis1.getDisplayStart(), 0.01);
      assertEquals(90.0, moduloAxis1.getDisplayEnd(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("akIg.S ", range0);
      boolean boolean0 = moduloAxis0.equals(moduloAxis0);
      assertEquals(90.0, moduloAxis0.getDisplayEnd(), 0.01);
      assertTrue(boolean0);
      assertEquals(270.0, moduloAxis0.getDisplayStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("BSRZc", range0);
      boolean boolean0 = moduloAxis0.equals(range0);
      assertEquals(90.0, moduloAxis0.getDisplayEnd(), 0.01);
      assertFalse(boolean0);
      assertEquals(270.0, moduloAxis0.getDisplayStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("BSRZc", range0);
      moduloAxis0.resizeRange((double) 10, (-770.555931332499));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      JFreeChart jFreeChart0 = new JFreeChart("jgK|a||_N20U$", meterPlot0);
      LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
      double double0 = moduloAxis0.lengthToJava2D(2.0, rectangle2D_Double0, legendTitle0.DEFAULT_POSITION);
      assertFalse(moduloAxis0.isAutoRange());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Range range0 = ValueAxis.DEFAULT_RANGE;
      ModuloAxis moduloAxis0 = new ModuloAxis("~{#", range0);
      moduloAxis0.resizeRange(0.0, 0.0);
      assertEquals(270.0, moduloAxis0.getDisplayStart(), 0.01);
      assertEquals(90.0, moduloAxis0.getDisplayEnd(), 0.01);
      assertTrue(moduloAxis0.isAutoRange());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateRange dateRange0 = DateAxis.DEFAULT_DATE_RANGE;
      ModuloAxis moduloAxis0 = new ModuloAxis("G!N,:~V$YciO", dateRange0);
      moduloAxis0.setDisplayRange(2.0E8, 2777.4956594977675);
      moduloAxis0.resizeRange(2485.3185672054);
      assertEquals(1.1837061555436321, moduloAxis0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("BSRZc", range0);
      moduloAxis0.resizeRange((double) 10, (-770.555931332499));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      JFreeChart jFreeChart0 = new JFreeChart("jgK|a||_N20U$", meterPlot0);
      LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
      double double0 = moduloAxis0.java2DToValue(1.0, rectangle2D_Double0, legendTitle0.DEFAULT_POSITION);
      assertFalse(moduloAxis0.isAutoRange());
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("BSRZc", range0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      JFreeChart jFreeChart0 = new JFreeChart("BSRZc", meterPlot0);
      LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
      double double0 = moduloAxis0.java2DToValue(1.0, rectangle2D_Double0, legendTitle0.DEFAULT_POSITION);
      assertEquals(270.0, moduloAxis0.getDisplayStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(90.0, moduloAxis0.getDisplayEnd(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Range range0 = ValueAxis.DEFAULT_RANGE;
      ModuloAxis moduloAxis0 = new ModuloAxis("Can't evaluate the week.", range0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 0.0F, 0.0F, 500);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      double double0 = moduloAxis0.valueToJava2D((-5567.400734057112), rectangle2D_Float0, rectangleEdge0);
      assertEquals((-249.72272082992052), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      Range range0 = defaultMultiValueCategoryDataset0.getRangeBounds(true);
      ModuloAxis moduloAxis0 = new ModuloAxis("0?WX'Wj[*", range0);
      Point2D.Float point2D_Float0 = new Point2D.Float(500, (-3235.33F));
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D_Float0, point2D_Float0);
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      double double0 = moduloAxis0.valueToJava2D(1145.548, rectangle2D0, (RectangleEdge) null);
      assertEquals(270.0, moduloAxis0.getDisplayStart(), 0.01);
      assertEquals(90.0, moduloAxis0.getDisplayEnd(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("BSRZc", range0);
      moduloAxis0.resizeRange((double) 10, (-775.77904196));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      JFreeChart jFreeChart0 = new JFreeChart("jgK|a||_N20U$", meterPlot0);
      LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
      RectangleEdge rectangleEdge0 = legendTitle0.getLegendItemGraphicEdge();
      double double0 = moduloAxis0.valueToJava2D((-221.2693), rectangle2D_Double0, rectangleEdge0);
      assertEquals(24.220958040000028, moduloAxis0.getLowerBound(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("BSRZc", range0);
      moduloAxis0.resizeRange((double) 10, (-770.555931332499));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      JFreeChart jFreeChart0 = new JFreeChart("jgK|a||_N20U$", meterPlot0);
      LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
      RectangleEdge rectangleEdge0 = legendTitle0.getLegendItemGraphicEdge();
      double double0 = moduloAxis0.valueToJava2D((-221.2693), rectangle2D_Double0, rectangleEdge0);
      assertFalse(moduloAxis0.isAutoRange());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("e= @<.Mw", (Range) null);
      // Undeclared exception!
      try { 
        moduloAxis0.autoAdjustRange();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'range' argument.
         //
         verifyException("org.jfree.chart.axis.ValueAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      Range range0 = defaultMultiValueCategoryDataset0.getRangeBounds(true);
      ModuloAxis moduloAxis0 = new ModuloAxis("0?WX'Wj[*", range0);
      double double0 = moduloAxis0.getDisplayEnd();
      assertEquals(90.0, double0, 0.01);
      assertEquals(270.0, moduloAxis0.getDisplayStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      Range range0 = defaultMultiValueCategoryDataset0.getRangeBounds(true);
      ModuloAxis moduloAxis0 = new ModuloAxis("0?WX'Wj[*", range0);
      double double0 = moduloAxis0.getDisplayStart();
      assertEquals(90.0, moduloAxis0.getDisplayEnd(), 0.01);
      assertEquals(270.0, double0, 0.01);
  }
}
