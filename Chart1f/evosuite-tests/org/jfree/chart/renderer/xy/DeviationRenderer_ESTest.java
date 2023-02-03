/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 02:51:02 GMT 2022
 */

package org.jfree.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.DeviationRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.data.Range;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.gantt.XYTaskDataset;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.TimeTableXYDataset;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeviationRenderer_ESTest extends DeviationRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      XYItemRendererState xYItemRendererState0 = new XYItemRendererState(plotRenderingInfo0);
      GeneralPath generalPath0 = new GeneralPath();
      Rectangle2D rectangle2D0 = generalPath0.getBounds2D();
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      LogAxis logAxis0 = new LogAxis();
      deviationRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, rectangle2D0, combinedRangeXYPlot0, logAxis0, logAxis0, (XYDataset) null, 500, 10, true, (-386));
      assertEquals(0.5F, deviationRenderer0.getAlpha(), 0.01F);
      assertTrue(deviationRenderer0.getDrawSeriesLineAsPath());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      assertEquals(0.5F, deviationRenderer0.getAlpha(), 0.01F);
      
      deviationRenderer0.setAlpha(1.0F);
      assertEquals(1.0F, deviationRenderer0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      assertEquals(0.5F, deviationRenderer0.getAlpha(), 0.01F);
      
      deviationRenderer0.setAlpha(0.0F);
      float float0 = deviationRenderer0.getAlpha();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[2];
      MockDate mockDate0 = (MockDate)DateAxis.DEFAULT_ANCHOR_DATE;
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, (double) deviationRenderer0.ZERO, (double) deviationRenderer0.ZERO, (double) deviationRenderer0.ZERO, (-2210.1226), 0.0);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      oHLCDataItemArray0[1] = oHLCDataItem0;
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(deviationRenderer0.ZERO, oHLCDataItemArray0);
      Range range0 = deviationRenderer0.findRangeBounds(defaultOHLCDataset0);
      assertEquals(0.5F, deviationRenderer0.getAlpha(), 0.01F);
      assertTrue(deviationRenderer0.getDrawSeriesLineAsPath());
      assertEquals(0.0, range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      TimeSeries timeSeries0 = new TimeSeries(deviationRenderer0.ZERO, "$+0/T9*rcw^[", "");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      deviationRenderer0.findRangeBounds(timeSeriesCollection0);
      assertEquals(0.5F, deviationRenderer0.getAlpha(), 0.01F);
      assertTrue(deviationRenderer0.getDrawSeriesLineAsPath());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer(true, true);
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[5];
      ZoneInfo zoneInfo0 = (ZoneInfo)SegmentedTimeline.DEFAULT_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis("", zoneInfo0);
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(dateAxis0.DEFAULT_ANCHOR_DATE, 0.0, 0.0F, 2, 500, 2.0);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      OHLCDataItem oHLCDataItem1 = new OHLCDataItem(dateAxis0.DEFAULT_ANCHOR_DATE, (double) deviationRenderer0.ZERO, 0.05, (-1170.6872173659133), 1366.243, (double) deviationRenderer0.ZERO);
      oHLCDataItemArray0[1] = oHLCDataItem1;
      oHLCDataItemArray0[2] = oHLCDataItem0;
      oHLCDataItemArray0[3] = oHLCDataItemArray0[2];
      oHLCDataItemArray0[4] = oHLCDataItem0;
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(deviationRenderer0.ZERO, oHLCDataItemArray0);
      Range range0 = deviationRenderer0.findRangeBounds(defaultOHLCDataset0);
      assertEquals(0.5F, deviationRenderer0.getAlpha(), 0.01F);
      assertTrue(deviationRenderer0.getDrawSeriesLineAsPath());
      assertEquals(1170.7372173659132, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer(true, true);
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[5];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(deviationRenderer0.ZERO, oHLCDataItemArray0);
      // Undeclared exception!
      try { 
        deviationRenderer0.findRangeBounds(defaultOHLCDataset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.DefaultOHLCDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      DeviationRenderer.State deviationRenderer_State0 = new DeviationRenderer.State(plotRenderingInfo0);
      assertTrue(deviationRenderer_State0.getProcessVisibleItemsOnly());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      boolean boolean0 = deviationRenderer0.equals((Object) null);
      assertTrue(deviationRenderer0.getDrawSeriesLineAsPath());
      assertEquals(0.5F, deviationRenderer0.getAlpha(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      boolean boolean0 = deviationRenderer0.equals(deviationRenderer0);
      assertTrue(deviationRenderer0.getDrawSeriesLineAsPath());
      assertEquals(0.5F, deviationRenderer0.getAlpha(), 0.01F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer(false, true);
      DeviationRenderer deviationRenderer1 = new DeviationRenderer();
      boolean boolean0 = deviationRenderer0.equals(deviationRenderer1);
      assertTrue(deviationRenderer1.getDrawSeriesLineAsPath());
      assertEquals(0.5F, deviationRenderer1.getAlpha(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      XYTaskDataset xYTaskDataset0 = new XYTaskDataset(taskSeriesCollection0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      XYItemRendererState xYItemRendererState0 = deviationRenderer0.initialise((Graphics2D) null, rectangle0, (XYPlot) null, xYTaskDataset0, plotRenderingInfo0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0, "Rr/z_l3@Dr2");
      // Undeclared exception!
      try { 
        deviationRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, rectangle2D_Double0, (XYPlot) null, cyclicNumberAxis0, cyclicNumberAxis0, xYTaskDataset0, 97, 0, true, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.gantt.TaskSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      boolean boolean0 = deviationRenderer0.isLinePass(1);
      assertTrue(boolean0);
      assertEquals(0.5F, deviationRenderer0.getAlpha(), 0.01F);
      assertTrue(deviationRenderer0.getDrawSeriesLineAsPath());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer(false, true);
      deviationRenderer0.isLinePass((-1754));
      assertEquals(0.5F, deviationRenderer0.getAlpha(), 0.01F);
      assertTrue(deviationRenderer0.getDrawSeriesLineAsPath());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer(false, false);
      boolean boolean0 = deviationRenderer0.isItemPass(2);
      assertTrue(deviationRenderer0.getDrawSeriesLineAsPath());
      assertEquals(0.5F, deviationRenderer0.getAlpha(), 0.01F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      boolean boolean0 = deviationRenderer0.isItemPass(3);
      assertEquals(0.5F, deviationRenderer0.getAlpha(), 0.01F);
      assertTrue(deviationRenderer0.getDrawSeriesLineAsPath());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      // Undeclared exception!
      try { 
        deviationRenderer0.setAlpha(3.4028235E38F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires 'alpha' in the range 0.0 to 1.0.
         //
         verifyException("org.jfree.chart.renderer.xy.DeviationRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer(false, true);
      deviationRenderer0.setAlpha(0.0F);
      DeviationRenderer deviationRenderer1 = new DeviationRenderer();
      boolean boolean0 = deviationRenderer0.equals(deviationRenderer1);
      assertEquals(0.5F, deviationRenderer1.getAlpha(), 0.01F);
      assertEquals(0.0F, deviationRenderer0.getAlpha(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      // Undeclared exception!
      try { 
        deviationRenderer0.setAlpha((-652.287F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires 'alpha' in the range 0.0 to 1.0.
         //
         verifyException("org.jfree.chart.renderer.xy.DeviationRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer(false, true);
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      deviationRenderer0.findRangeBounds(timeTableXYDataset0);
      assertTrue(deviationRenderer0.getDrawSeriesLineAsPath());
      assertEquals(0.5F, deviationRenderer0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      deviationRenderer0.setDrawSeriesLineAsPath(true);
      assertTrue(deviationRenderer0.getDrawSeriesLineAsPath());
      assertEquals(0.5F, deviationRenderer0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer(false, true);
      int int0 = deviationRenderer0.getPassCount();
      assertEquals(3, int0);
      assertEquals(0.5F, deviationRenderer0.getAlpha(), 0.01F);
      assertTrue(deviationRenderer0.getDrawSeriesLineAsPath());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      float float0 = deviationRenderer0.getAlpha();
      assertEquals(0.5F, float0, 0.01F);
      assertTrue(deviationRenderer0.getDrawSeriesLineAsPath());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      XYTaskDataset xYTaskDataset0 = new XYTaskDataset(taskSeriesCollection0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      XYItemRendererState xYItemRendererState0 = deviationRenderer0.initialise((Graphics2D) null, rectangle0, (XYPlot) null, xYTaskDataset0, plotRenderingInfo0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0, "Rr/z_l3@Dr2");
      deviationRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, rectangle0, (XYPlot) null, cyclicNumberAxis0, cyclicNumberAxis0, xYTaskDataset0, 0, 0, false, 1211);
      assertTrue(deviationRenderer0.getDrawSeriesLineAsPath());
      assertFalse(xYItemRendererState0.getProcessVisibleItemsOnly());
      assertEquals(0.5F, deviationRenderer0.getAlpha(), 0.01F);
  }
}
