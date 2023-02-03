/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 22:50:11 GMT 2022
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.time.chrono.HijrahEra;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.AxisState;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.PeriodAxisLabelInfo;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.GrayPaintScale;
import org.jfree.chart.renderer.PaintScale;
import org.jfree.chart.renderer.WaferMapRenderer;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYShapeRenderer;
import org.jfree.chart.title.PaintScaleLegend;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.Range;
import org.jfree.data.general.WaferMapDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PeriodAxis_ESTest extends PeriodAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis(";)~1N");
      ChartPanel chartPanel0 = new ChartPanel((JFreeChart) null);
      Rectangle rectangle0 = chartPanel0.getVisibleRect();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("ZOOM_IN_BOTH");
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultStatisticalCategoryDataset0, subCategoryAxis0, periodAxis0, boxAndWhiskerRenderer0);
      RectangleEdge rectangleEdge0 = categoryPlot0.getRangeAxisEdge();
      double double0 = periodAxis0.java2DToValue(0, rectangle0, rectangleEdge0);
      assertEquals(2.0, periodAxis0.getUpperBound(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("tv__RA+G");
      Rectangle rectangle0 = new Rectangle(821, (-4236));
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      rectangle0.add(821, 2);
      double double0 = periodAxis0.java2DToValue(2, rectangle0, rectangleEdge0);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      periodAxis0.resizeRange2(3417.244, 3849.359);
      double double0 = periodAxis0.java2DToValue(3417.244, (Rectangle2D) null, (RectangleEdge) null);
      assertEquals((-1.315035E7), periodAxis0.getLowerBound(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis((String) null);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0F, 90.0, 0.05, 2.0F);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(periodAxis0);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge();
      double double0 = periodAxis0.valueToJava2D((-2624.311697265), rectangle2D_Double0, rectangleEdge0);
      assertEquals(2.0, periodAxis0.getUpperBound(), 0.01);
      assertEquals((-131.21558486325), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(0.0);
      Paint paint0 = candlestickRenderer0.getBasePaint();
      periodAxis0.setMinorTickMarkPaint(paint0);
      Color color0 = (Color)periodAxis0.getMinorTickMarkPaint();
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals((-16776961), color0.getRGB());
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = (MockDate)DateAxis.DEFAULT_ANCHOR_DATE;
      Month month0 = new Month(mockDate0);
      ZoneInfo zoneInfo0 = (ZoneInfo)SegmentedTimeline.DEFAULT_TIME_ZONE;
      Locale locale0 = Locale.FRENCH;
      PeriodAxis periodAxis0 = new PeriodAxis("", month0, month0, zoneInfo0, locale0);
      periodAxis0.setMinorTickMarksVisible(true);
      assertTrue(periodAxis0.isMinorTickMarksVisible());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = (MockDate)DateAxis.DEFAULT_ANCHOR_DATE;
      Month month0 = new Month(mockDate0);
      ZoneInfo zoneInfo0 = (ZoneInfo)SegmentedTimeline.DEFAULT_TIME_ZONE;
      Locale locale0 = Locale.FRENCH;
      PeriodAxis periodAxis0 = new PeriodAxis("", month0, month0, zoneInfo0, locale0);
      periodAxis0.autoAdjustRange();
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Month month0 = new Month();
      PeriodAxis periodAxis0 = new PeriodAxis("D", month0, month0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      Rectangle2D rectangle2D0 = chartRenderingInfo0.getChartArea();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge();
      periodAxis0.drawTickMarksVertical((Graphics2D) null, (AxisState) null, rectangle2D0, rectangleEdge0);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeCategoryPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 17, 17, 10, 0, 0, 318, true, false, true, true, true, false);
      Rectangle rectangle0 = chartPanel0.getVisibleRect();
      XYShapeRenderer xYShapeRenderer0 = new XYShapeRenderer();
      PaintScale paintScale0 = xYShapeRenderer0.getPaintScale();
      PaintScaleLegend paintScaleLegend0 = new PaintScaleLegend(paintScale0, periodAxis0);
      double double0 = periodAxis0.valueToJava2D(50000.0, rectangle0, paintScaleLegend0.DEFAULT_POSITION);
      assertFalse(periodAxis0.isAutoRange());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      Class<HijrahEra> class0 = HijrahEra.class;
      periodAxis0.setMajorTickTimePeriodClass(class0);
      periodAxis0.getMajorTickTimePeriodClass();
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      // Undeclared exception!
      try { 
        periodAxis0.setRange((Range) null, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      JViewport jViewport0 = new JViewport();
      Rectangle rectangle0 = jViewport0.getViewRect();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        periodAxis0.draw((Graphics2D) null, (-1633), rectangle0, rectangle0, (RectangleEdge) null, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.ValueAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("Wld<k|i3.C");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(periodAxis0);
      Class<CategoryPlot> class0 = CategoryPlot.class;
      periodAxis0.setAutoRangeTimePeriodClass(class0);
      // Undeclared exception!
      try { 
        periodAxis0.autoAdjustRange();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)SegmentedTimeline.DEFAULT_TIME_ZONE;
      Locale locale0 = Locale.ITALIAN;
      PeriodAxis periodAxis0 = null;
      try {
        periodAxis0 = new PeriodAxis((String) null, (RegularTimePeriod) null, (RegularTimePeriod) null, zoneInfo0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PeriodAxis periodAxis0 = null;
      try {
        periodAxis0 = new PeriodAxis("org.jfree.chart.axis.PeriodAxis", (RegularTimePeriod) null, (RegularTimePeriod) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = (MockDate)DateAxis.DEFAULT_ANCHOR_DATE;
      Month month0 = new Month(mockDate0);
      ZoneInfo zoneInfo0 = (ZoneInfo)SegmentedTimeline.DEFAULT_TIME_ZONE;
      Locale locale0 = Locale.FRENCH;
      PeriodAxis periodAxis0 = new PeriodAxis("", month0, month0, zoneInfo0, locale0);
      periodAxis0.configure();
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("org.jfree.data.event.SeriesChangeListener");
      periodAxis0.setRange(periodAxis0.DEFAULT_RANGE, false, true);
      assertEquals(2.0, periodAxis0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(0, year0);
      PeriodAxis periodAxis0 = new PeriodAxis("", week0, year0);
      PeriodAxis periodAxis1 = (PeriodAxis)periodAxis0.clone();
      assertNotSame(periodAxis1, periodAxis0);
      assertEquals(0.0F, periodAxis1.getMinorTickMarkInsideLength(), 0.01F);
      assertTrue(periodAxis1.equals((Object)periodAxis0));
      assertEquals(2.0F, periodAxis1.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("tv__RA+G");
      periodAxis0.hashCode();
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("tv__RA+G");
      boolean boolean0 = periodAxis0.equals("tv__RA+G");
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("org.jfree.chart.renderer.category.StackedBarRenderer");
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[3];
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(date0, 0.0, 0.05, (-3245.1235256), (-2112.0513368027), (-3245.1235256));
      oHLCDataItemArray0[0] = oHLCDataItem0;
      oHLCDataItemArray0[1] = oHLCDataItem0;
      oHLCDataItemArray0[2] = oHLCDataItem0;
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(2.0F, oHLCDataItemArray0);
      XYPlot xYPlot0 = null;
      try {
        xYPlot0 = new XYPlot(defaultOHLCDataset0, periodAxis0, periodAxis0, (XYItemRenderer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("tv__RA+G");
      Rectangle rectangle0 = new Rectangle(821, (-4236));
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      double double0 = periodAxis0.java2DToValue(2, rectangle0, rectangleEdge0);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(1.39240928132E12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis(",qmg");
      RoundRectangle2D.Double roundRectangle2D_Double0 = new RoundRectangle2D.Double(2.0F, (-2813.4998246564855), 1.0E-8, 0.0, 0.05, 1.0E-8);
      Rectangle2D rectangle2D0 = roundRectangle2D_Double0.getBounds2D();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      periodAxis0.lengthToJava2D(1406.8342, rectangle2D0, rectangleEdge0);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("tv__RA+G");
      Rectangle rectangle0 = new Rectangle(821, (-4236));
      double double0 = periodAxis0.valueToJava2D(0.0, rectangle0, (RectangleEdge) null);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("tv__RA+G");
      Rectangle rectangle0 = new Rectangle(821, 1);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      double double0 = periodAxis0.valueToJava2D((-627.7860274089803), rectangle0, rectangleEdge0);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis(";)~1N");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("ZOOM_IN_BOTH");
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultStatisticalCategoryDataset0, subCategoryAxis0, periodAxis0, boxAndWhiskerRenderer0);
      RectangleEdge rectangleEdge0 = categoryPlot0.getRangeAxisEdge();
      // Undeclared exception!
      try { 
        periodAxis0.valueToJava2D(0.0, (Rectangle2D) null, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(0, year0);
      PeriodAxis periodAxis0 = new PeriodAxis("", week0, year0);
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(1247, (-496));
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer((-496), 2437);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, waferMapRenderer0);
      JFreeChart jFreeChart0 = new JFreeChart(waferMapPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1129, 2437, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((double) waferMapRenderer0.ZERO, (-9999), (-1852.0), 1247);
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(periodAxis0);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge();
      AxisSpace axisSpace0 = periodAxis0.reserveSpace(graphics2D0, waferMapPlot0, rectangle0, rectangleEdge0, (AxisSpace) null);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(1.0, periodAxis0.getUpperBound(), 0.01);
      assertTrue(periodAxis0.isAutoRange());
      assertEquals(36.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(0.0, periodAxis0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis(",r=");
      // Undeclared exception!
      try { 
        periodAxis0.setMinorTickMarkPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("pwIUa 4");
      // Undeclared exception!
      try { 
        periodAxis0.setMinorTickMarkStroke((Stroke) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      Stroke stroke0 = thermometerPlot0.getThermometerStroke();
      periodAxis0.setMinorTickMarkStroke(stroke0);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("tv__RA+G");
      Class<Hour> class0 = Hour.class;
      periodAxis0.setMinorTickTimePeriodClass(class0);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("domainValueEnd (");
      // Undeclared exception!
      try { 
        periodAxis0.setTimeZone((TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'zone' argument.
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("9a)f#");
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      periodAxis0.setTimeZone(timeZone0);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      // Undeclared exception!
      try { 
        periodAxis0.setLast((RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'last' argument.
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("org.jfree.data.event.SeriesChangeListener");
      DateAxis dateAxis0 = new DateAxis("kIHF7l");
      Date date0 = dateAxis0.getMinimumDate();
      Year year0 = new Year(date0);
      periodAxis0.setLast(year0);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("B^>r{,F3yDS^hiTyE");
      // Undeclared exception!
      try { 
        periodAxis0.setFirst((RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'first' argument.
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(0, year0);
      PeriodAxis periodAxis0 = new PeriodAxis("", week0, year0);
      periodAxis0.setFirst(week0);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis((String) null);
      PeriodAxis periodAxis1 = new PeriodAxis((String) null);
      assertEquals(2.0F, periodAxis1.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, periodAxis1.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1402), (-1094), (-1402));
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-205), "'}:j1%bzNw%nL", 276, 0, 0, 0, 276, 0, 0, 1);
      Month month0 = new Month(mockDate0, simpleTimeZone0);
      PeriodAxis periodAxis0 = null;
      try {
        periodAxis0 = new PeriodAxis("u;b0C>A>G", month0, month0, simpleTimeZone0, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'locale' argument.
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Week week0 = new Week(1954, 0);
      Locale locale0 = Locale.GERMANY;
      PeriodAxis periodAxis0 = null;
      try {
        periodAxis0 = new PeriodAxis("iTK~qw&jw'9O*H", week0, week0, (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'timeZone' argument.
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3875L);
      ZoneInfo zoneInfo0 = (ZoneInfo)SegmentedTimeline.DEFAULT_TIME_ZONE;
      Quarter quarter0 = new Quarter(mockDate0, zoneInfo0);
      PeriodAxis periodAxis0 = new PeriodAxis("D{`", quarter0, quarter0);
      PiePlot3D piePlot3D0 = new PiePlot3D();
      JFreeChart jFreeChart0 = new JFreeChart("D{`", piePlot3D0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(4, 1, (double) 10, 235.0, (ChartRenderingInfo) null);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Object[] objectArray0 = new Object[1];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 4);
      JTable jTable0 = new JTable(defaultTableModel0);
      Rectangle rectangle0 = jTable0.getCellRect(120, 15, true);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        periodAxis0.draw(graphics2D0, 2749.0, rectangle2D_Double0, rectangle0, rectangleEdge0, plotRenderingInfo0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      PeriodAxis periodAxis0 = new PeriodAxis("", quarter0, quarter0);
      periodAxis0.getRange();
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour((-1339), day0);
      SimpleTimeZone simpleTimeZone0 = (SimpleTimeZone)SegmentedTimeline.NO_DST_TIME_ZONE;
      Locale locale0 = Locale.GERMAN;
      PeriodAxis periodAxis0 = new PeriodAxis("", hour0, day0, simpleTimeZone0, locale0);
      periodAxis0.getTimeZone();
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("org.jfree.data.time.Month");
      periodAxis0.getLabelInfo();
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      periodAxis0.getAutoRangeTimePeriodClass();
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      periodAxis0.getMajorTickTimePeriodClass();
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Month month0 = new Month();
      PeriodAxis periodAxis0 = new PeriodAxis("D", month0, month0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      Rectangle2D rectangle2D0 = chartRenderingInfo0.getChartArea();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge();
      periodAxis0.refreshTicks((Graphics2D) null, (AxisState) null, rectangle2D0, rectangleEdge0);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("?= NH,iTV?");
      periodAxis0.getMinorTickTimePeriodClass();
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      PeriodAxis periodAxis0 = new PeriodAxis("", quarter0, quarter0);
      periodAxis0.setMinorTickMarksVisible(false);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertFalse(periodAxis0.isMinorTickMarksVisible());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("?= NH,iTV?");
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      PaintScaleLegend paintScaleLegend0 = new PaintScaleLegend(grayPaintScale0, periodAxis0);
      periodAxis0.configure();
      assertEquals(2.0, periodAxis0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("tv__RA+G");
      float float0 = periodAxis0.getMinorTickMarkInsideLength();
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("tv__RA+G");
      periodAxis0.getFirst();
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("tv__RA+G");
      boolean boolean0 = periodAxis0.isMinorTickMarksVisible();
      assertFalse(boolean0);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("Null 'timeZone' argument.");
      periodAxis0.getLast();
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("org.jfree.data.event.SeriesChangeListener");
      float float0 = periodAxis0.getMinorTickMarkOutsideLength();
      assertEquals(2.0F, float0, 0.01F);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      PeriodAxisLabelInfo[] periodAxisLabelInfoArray0 = new PeriodAxisLabelInfo[3];
      periodAxis0.setLabelInfo(periodAxisLabelInfoArray0);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockDate mockDate0 = (MockDate)DateAxis.DEFAULT_ANCHOR_DATE;
      Month month0 = new Month(mockDate0);
      ZoneInfo zoneInfo0 = (ZoneInfo)SegmentedTimeline.DEFAULT_TIME_ZONE;
      Locale locale0 = Locale.FRENCH;
      PeriodAxis periodAxis0 = new PeriodAxis("", month0, month0, zoneInfo0, locale0);
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      
      periodAxis0.setMinorTickMarkOutsideLength(3.0F);
      assertEquals(3.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("?= NH,iTV?");
      BasicStroke basicStroke0 = (BasicStroke)periodAxis0.getMinorTickMarkStroke();
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
      assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis(";)~1N");
      periodAxis0.getLocale();
      assertEquals(2.0F, periodAxis0.getMinorTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, periodAxis0.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MockDate mockDate0 = (MockDate)DateAxis.DEFAULT_ANCHOR_DATE;
      Month month0 = new Month(mockDate0);
      ZoneInfo zoneInfo0 = (ZoneInfo)SegmentedTimeline.DEFAULT_TIME_ZONE;
      Locale locale0 = Locale.FRENCH;
      PeriodAxis periodAxis0 = new PeriodAxis("", month0, month0, zoneInfo0, locale0);
      periodAxis0.setMinorTickMarkInsideLength((-2314.006F));
      float float0 = periodAxis0.getMinorTickMarkInsideLength();
      assertEquals((-2314.006F), float0, 0.01F);
  }
}
