/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:01:59 GMT 2022
 */

package org.jfree.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.sql.Connection;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.DeviationRenderer;
import org.jfree.chart.renderer.xy.XYErrorRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.chart.renderer.xy.XYLine3DRenderer;
import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.data.Range;
import org.jfree.data.jdbc.JDBCXYDataset;
import org.jfree.data.time.DynamicTimeSeriesCollection;
import org.jfree.data.time.Minute;
import org.jfree.data.xy.CategoryTableXYDataset;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYErrorRenderer_ESTest extends XYErrorRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      XYItemRendererState xYItemRendererState0 = xYStepAreaRenderer0.initialise((Graphics2D) null, (Rectangle2D) null, combinedDomainXYPlot0, categoryTableXYDataset0, (PlotRenderingInfo) null);
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      String[] stringArray0 = new String[6];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      xYErrorRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, (Rectangle2D) null, combinedRangeXYPlot0, symbolAxis0, symbolAxis0, categoryTableXYDataset0, 0, 1, false, 10);
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
      assertTrue(xYErrorRenderer0.getDrawXError());
      assertTrue(xYErrorRenderer0.getDrawYError());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      Stroke stroke0 = spiderWebPlot0.getSeriesOutlineStroke((-1347));
      xYErrorRenderer0.setErrorStroke(stroke0);
      BasicStroke basicStroke0 = (BasicStroke)xYErrorRenderer0.getErrorStroke();
      assertEquals(1, basicStroke0.getEndCap());
      assertTrue(xYErrorRenderer0.getDrawXError());
      assertTrue(xYErrorRenderer0.getDrawYError());
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      XYLine3DRenderer xYLine3DRenderer0 = new XYLine3DRenderer();
      Paint paint0 = xYLine3DRenderer0.getWallPaint();
      xYErrorRenderer0.setErrorPaint(paint0);
      Color color0 = (Color)xYErrorRenderer0.getErrorPaint();
      assertTrue(xYErrorRenderer0.getDrawYError());
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
      assertTrue(xYErrorRenderer0.getDrawXError());
      assertEquals(221, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      assertTrue(xYErrorRenderer0.getDrawXError());
      
      xYErrorRenderer0.setDrawXError(false);
      boolean boolean0 = xYErrorRenderer0.getDrawXError();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
      
      xYErrorRenderer0.setCapLength(0.0);
      double double0 = xYErrorRenderer0.getCapLength();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      xYErrorRenderer0.setCapLength((-3577));
      double double0 = xYErrorRenderer0.getCapLength();
      assertEquals((-3577.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset((Connection) null);
      xYErrorRenderer0.findRangeBounds(jDBCXYDataset0);
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
      assertTrue(xYErrorRenderer0.getDrawYError());
      assertTrue(xYErrorRenderer0.getDrawXError());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new DynamicTimeSeriesCollection(0, 0);
      xYErrorRenderer0.findRangeBounds(dynamicTimeSeriesCollection0);
      assertTrue(xYErrorRenderer0.getDrawYError());
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
      assertTrue(xYErrorRenderer0.getDrawXError());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      XYSeries xYSeries0 = new XYSeries(xYErrorRenderer0.ZERO, false, false);
      xYSeries0.add(0.001, (-2166.3745));
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection(xYSeries0);
      Range range0 = xYErrorRenderer0.findDomainBounds(xYSeriesCollection0);
      assertTrue(xYErrorRenderer0.getDrawXError());
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
      assertTrue(xYErrorRenderer0.getDrawYError());
      assertEquals(1.0, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(xYErrorRenderer0.ZERO, (OHLCDataItem[]) null);
      // Undeclared exception!
      try { 
        xYErrorRenderer0.findRangeBounds(defaultOHLCDataset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.DefaultOHLCDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new DynamicTimeSeriesCollection(2664, 2664);
      // Undeclared exception!
      try { 
        xYErrorRenderer0.findDomainBounds(dynamicTimeSeriesCollection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.DynamicTimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      MockDate mockDate0 = new MockDate(0, 1, 1, 0, (-3416), (-3416));
      Minute minute0 = new Minute(mockDate0);
      DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new DynamicTimeSeriesCollection(0, 0, minute0);
      // Undeclared exception!
      try { 
        xYErrorRenderer0.findDomainBounds(dynamicTimeSeriesCollection0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.jfree.data.time.DynamicTimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      XYItemRendererState xYItemRendererState0 = xYStepAreaRenderer0.initialise((Graphics2D) null, (Rectangle2D) null, combinedDomainXYPlot0, categoryTableXYDataset0, (PlotRenderingInfo) null);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      // Undeclared exception!
      try { 
        xYErrorRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, (Rectangle2D) null, combinedDomainXYPlot0, cyclicNumberAxis0, cyclicNumberAxis0, categoryTableXYDataset0, (-1196), (-1196), false, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      XYErrorRenderer xYErrorRenderer1 = (XYErrorRenderer)xYErrorRenderer0.clone();
      boolean boolean0 = xYErrorRenderer0.equals(xYErrorRenderer1);
      assertEquals(4.0, xYErrorRenderer1.getCapLength(), 0.01);
      assertTrue(xYErrorRenderer1.getDrawYError());
      assertTrue(xYErrorRenderer1.getDrawXError());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      Object object0 = xYErrorRenderer0.clone();
      xYErrorRenderer0.setCapLength((-3577));
      boolean boolean0 = xYErrorRenderer0.equals(object0);
      assertEquals((-3577.0), xYErrorRenderer0.getCapLength(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      Object object0 = xYErrorRenderer0.clone();
      xYErrorRenderer0.setDrawYError(false);
      boolean boolean0 = xYErrorRenderer0.equals(object0);
      assertFalse(boolean0);
      assertFalse(xYErrorRenderer0.getDrawYError());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      boolean boolean0 = xYErrorRenderer0.equals((Object) null);
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
      assertFalse(boolean0);
      assertTrue(xYErrorRenderer0.getDrawYError());
      assertTrue(xYErrorRenderer0.getDrawXError());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      boolean boolean0 = xYErrorRenderer0.equals(xYErrorRenderer0);
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
      assertTrue(boolean0);
      assertTrue(xYErrorRenderer0.getDrawXError());
      assertTrue(xYErrorRenderer0.getDrawYError());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      Object object0 = xYErrorRenderer0.clone();
      assertTrue(object0.equals((Object)xYErrorRenderer0));
      
      xYErrorRenderer0.setErrorStroke(xYErrorRenderer0.DEFAULT_OUTLINE_STROKE);
      boolean boolean0 = xYErrorRenderer0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      XYItemRendererState xYItemRendererState0 = xYStepAreaRenderer0.initialise((Graphics2D) null, (Rectangle2D) null, combinedDomainXYPlot0, categoryTableXYDataset0, (PlotRenderingInfo) null);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      // Undeclared exception!
      try { 
        xYErrorRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, (Rectangle2D) null, combinedDomainXYPlot0, cyclicNumberAxis0, cyclicNumberAxis0, categoryTableXYDataset0, 10, 10, true, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 10, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      XYItemRendererState xYItemRendererState0 = deviationRenderer0.initialise((Graphics2D) null, defaultCaret0, (XYPlot) null, (XYDataset) null, plotRenderingInfo0);
      String[] stringArray0 = new String[9];
      SymbolAxis symbolAxis0 = new SymbolAxis("!w~#~f0", stringArray0);
      xYErrorRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, defaultCaret0, (XYPlot) null, symbolAxis0, symbolAxis0, (XYDataset) null, (-1), (-1717986918), true, 0);
      assertTrue(xYErrorRenderer0.getDrawXError());
      assertTrue(xYErrorRenderer0.getDrawYError());
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      XYItemRendererState xYItemRendererState0 = xYStepAreaRenderer0.initialise((Graphics2D) null, (Rectangle2D) null, combinedDomainXYPlot0, categoryTableXYDataset0, (PlotRenderingInfo) null);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      xYErrorRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, (Rectangle2D) null, combinedDomainXYPlot0, cyclicNumberAxis0, cyclicNumberAxis0, categoryTableXYDataset0, (-1), 1310, false, (-2072));
      assertTrue(xYErrorRenderer0.getDrawYError());
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
      assertTrue(xYErrorRenderer0.getDrawXError());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      xYErrorRenderer0.findRangeBounds(categoryTableXYDataset0);
      assertTrue(xYErrorRenderer0.getDrawYError());
      assertTrue(xYErrorRenderer0.getDrawXError());
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      xYErrorRenderer0.findRangeBounds((XYDataset) null);
      assertTrue(xYErrorRenderer0.getDrawXError());
      assertTrue(xYErrorRenderer0.getDrawYError());
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      xYErrorRenderer0.findDomainBounds(categoryTableXYDataset0);
      assertTrue(xYErrorRenderer0.getDrawXError());
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
      assertTrue(xYErrorRenderer0.getDrawYError());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      xYErrorRenderer0.findDomainBounds((XYDataset) null);
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
      assertTrue(xYErrorRenderer0.getDrawXError());
      assertTrue(xYErrorRenderer0.getDrawYError());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      assertTrue(xYErrorRenderer0.getDrawYError());
      
      xYErrorRenderer0.setDrawYError(false);
      boolean boolean0 = xYErrorRenderer0.getDrawYError();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      assertTrue(xYErrorRenderer0.getDrawYError());
      
      xYErrorRenderer0.setDrawYError(true);
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
      assertTrue(xYErrorRenderer0.getDrawXError());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      xYErrorRenderer0.setDrawXError(false);
      XYErrorRenderer xYErrorRenderer1 = new XYErrorRenderer();
      boolean boolean0 = xYErrorRenderer0.equals(xYErrorRenderer1);
      assertFalse(boolean0);
      assertFalse(xYErrorRenderer0.getDrawXError());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      assertTrue(xYErrorRenderer0.getDrawXError());
      
      xYErrorRenderer0.setDrawXError(true);
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
      assertTrue(xYErrorRenderer0.getDrawYError());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      Paint paint0 = xYErrorRenderer0.getErrorPaint();
      assertTrue(xYErrorRenderer0.getDrawXError());
      assertNull(paint0);
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
      assertTrue(xYErrorRenderer0.getDrawYError());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      boolean boolean0 = xYErrorRenderer0.getDrawYError();
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
      assertTrue(xYErrorRenderer0.getDrawXError());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      Stroke stroke0 = xYErrorRenderer0.getErrorStroke();
      assertTrue(xYErrorRenderer0.getDrawXError());
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
      assertNull(stroke0);
      assertTrue(xYErrorRenderer0.getDrawYError());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      boolean boolean0 = xYErrorRenderer0.getDrawXError();
      assertTrue(boolean0);
      assertTrue(xYErrorRenderer0.getDrawYError());
      assertEquals(4.0, xYErrorRenderer0.getCapLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      double double0 = xYErrorRenderer0.getCapLength();
      assertEquals(4.0, double0, 0.01);
      assertTrue(xYErrorRenderer0.getDrawXError());
      assertTrue(xYErrorRenderer0.getDrawYError());
  }
}