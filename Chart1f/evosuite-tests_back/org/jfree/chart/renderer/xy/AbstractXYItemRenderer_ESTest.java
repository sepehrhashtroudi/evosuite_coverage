/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:09:14 GMT 2022
 */

package org.jfree.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.XYAnnotation;
import org.jfree.chart.annotations.XYBoxAnnotation;
import org.jfree.chart.annotations.XYShapeAnnotation;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.AnnotationChangeEvent;
import org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator;
import org.jfree.chart.labels.BubbleXYItemLabelGenerator;
import org.jfree.chart.labels.HighLowItemLabelGenerator;
import org.jfree.chart.labels.IntervalXYItemLabelGenerator;
import org.jfree.chart.labels.MultipleXYSeriesLabelGenerator;
import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.labels.StandardXYZToolTipGenerator;
import org.jfree.chart.labels.XYItemLabelGenerator;
import org.jfree.chart.labels.XYSeriesLabelGenerator;
import org.jfree.chart.labels.XYToolTipGenerator;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.CrosshairState;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.renderer.xy.ClusteredXYBarRenderer;
import org.jfree.chart.renderer.xy.CyclicXYItemRenderer;
import org.jfree.chart.renderer.xy.DefaultXYItemRenderer;
import org.jfree.chart.renderer.xy.DeviationRenderer;
import org.jfree.chart.renderer.xy.HighLowRenderer;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer2;
import org.jfree.chart.renderer.xy.StackedXYBarRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.VectorRenderer;
import org.jfree.chart.renderer.xy.WindItemRenderer;
import org.jfree.chart.renderer.xy.XYAreaRenderer;
import org.jfree.chart.renderer.xy.XYBlockRenderer;
import org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer;
import org.jfree.chart.renderer.xy.XYBubbleRenderer;
import org.jfree.chart.renderer.xy.XYDotRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.chart.renderer.xy.XYLine3DRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYShapeRenderer;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.renderer.xy.XYStepRenderer;
import org.jfree.chart.renderer.xy.YIntervalRenderer;
import org.jfree.chart.urls.CustomXYURLGenerator;
import org.jfree.chart.urls.StandardXYZURLGenerator;
import org.jfree.chart.urls.XYURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.data.Range;
import org.jfree.data.jdbc.JDBCXYDataset;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.TimePeriodValuesCollection;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.DefaultWindDataset;
import org.jfree.data.xy.XYBarDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractXYItemRenderer_ESTest extends AbstractXYItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StackedXYAreaRenderer2 stackedXYAreaRenderer2_0 = new StackedXYAreaRenderer2((XYToolTipGenerator) null, (XYURLGenerator) null);
      MultipleXYSeriesLabelGenerator multipleXYSeriesLabelGenerator0 = new MultipleXYSeriesLabelGenerator("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator");
      stackedXYAreaRenderer2_0.setLegendItemLabelGenerator(multipleXYSeriesLabelGenerator0);
      assertEquals(2.0, stackedXYAreaRenderer2_0.getItemLabelAnchorOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYAreaRenderer xYAreaRenderer0 = new XYAreaRenderer();
      Locale locale0 = Locale.JAPANESE;
      NumberFormat numberFormat0 = NumberFormat.getInstance(locale0);
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("w", numberFormat0, numberFormat0, numberFormat0);
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(2.0, false, standardXYZToolTipGenerator0);
      XYSeriesLabelGenerator xYSeriesLabelGenerator0 = candlestickRenderer0.getLegendItemLabelGenerator();
      xYAreaRenderer0.setLegendItemURLGenerator(xYSeriesLabelGenerator0);
      assertTrue(xYAreaRenderer0.getDataBoundsIncludesVisibleSeriesOnly());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HighLowRenderer highLowRenderer0 = new HighLowRenderer();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(5172.39F);
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 10, 0, 0, 1, (-1), 1, false, true, false, true, true, false, true);
      chartRenderingInfo0.setRenderingSource(chartPanel0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      XYItemRendererState xYItemRendererState0 = highLowRenderer0.initialise((Graphics2D) null, rectangle2D_Double0, (XYPlot) null, timePeriodValuesCollection0, plotRenderingInfo0);
      assertTrue(xYItemRendererState0.getProcessVisibleItemsOnly());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StandardXYZURLGenerator standardXYZURLGenerator0 = new StandardXYZURLGenerator();
      StackedXYAreaRenderer2 stackedXYAreaRenderer2_0 = new StackedXYAreaRenderer2((XYToolTipGenerator) null, standardXYZURLGenerator0);
      StandardXYItemRenderer standardXYItemRenderer0 = new StandardXYItemRenderer(1, (XYToolTipGenerator) null, standardXYZURLGenerator0);
      BufferedImage bufferedImage0 = new BufferedImage(1, 3, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      // Undeclared exception!
      try { 
        standardXYItemRenderer0.fillDomainGridBand(graphics2D0, (XYPlot) null, (ValueAxis) null, rectangle2D_Double0, 3822.70230983535, (double) stackedXYAreaRenderer2_0.ZERO);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.AbstractXYItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer();
      XYURLGenerator xYURLGenerator0 = stackedXYBarRenderer0.getURLGenerator(3600, 3600, false);
      assertNull(xYURLGenerator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(Double.NEGATIVE_INFINITY);
      XYURLGenerator xYURLGenerator0 = candlestickRenderer0.getSeriesURLGenerator(10);
      assertNull(xYURLGenerator0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYAreaRenderer xYAreaRenderer0 = new XYAreaRenderer(301);
      LegendItemCollection legendItemCollection0 = xYAreaRenderer0.getLegendItems();
      assertEquals(0, legendItemCollection0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StandardXYItemRenderer standardXYItemRenderer0 = new StandardXYItemRenderer();
      LegendItem legendItem0 = standardXYItemRenderer0.getLegendItem(1061, (-7));
      assertNull(legendItem0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer();
      XYToolTipGenerator xYToolTipGenerator0 = candlestickRenderer0.getBaseToolTipGenerator();
      assertNotNull(xYToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYAreaRenderer xYAreaRenderer0 = new XYAreaRenderer();
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      boolean boolean0 = xYAreaRenderer0.equals(xYDotRenderer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BoxAndWhiskerXYToolTipGenerator boxAndWhiskerXYToolTipGenerator0 = new BoxAndWhiskerXYToolTipGenerator();
      CyclicXYItemRenderer cyclicXYItemRenderer0 = new CyclicXYItemRenderer(0, boxAndWhiskerXYToolTipGenerator0, (XYURLGenerator) null);
      // Undeclared exception!
      try { 
        cyclicXYItemRenderer0.setSeriesURLGenerator((-2494), (XYURLGenerator) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      // Undeclared exception!
      try { 
        xYBoxAndWhiskerRenderer0.setLegendItemLabelGenerator((XYSeriesLabelGenerator) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.xy.AbstractXYItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer();
      DrawingSupplier drawingSupplier0 = clusteredXYBarRenderer0.getDrawingSupplier();
      assertNull(drawingSupplier0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      XYBarDataset xYBarDataset0 = new XYBarDataset(defaultTableXYDataset0, (double) xYBoxAndWhiskerRenderer0.ZERO);
      Range range0 = xYBoxAndWhiskerRenderer0.findRangeBounds((XYDataset) xYBarDataset0, true);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      Range range0 = xYStepAreaRenderer0.findRangeBounds((XYDataset) null, true);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      StackedXYAreaRenderer stackedXYAreaRenderer0 = new StackedXYAreaRenderer(892, (XYToolTipGenerator) null, customXYURLGenerator0);
      stackedXYAreaRenderer0.setBaseURLGenerator((XYURLGenerator) customXYURLGenerator0, true);
      assertFalse(stackedXYAreaRenderer0.getUseFillPaint());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HighLowRenderer highLowRenderer0 = new HighLowRenderer();
      StandardXYZURLGenerator standardXYZURLGenerator0 = new StandardXYZURLGenerator();
      highLowRenderer0.setSeriesURLGenerator(88, (XYURLGenerator) standardXYZURLGenerator0, true);
      assertEquals(2.0, highLowRenderer0.getTickLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer();
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      Locale locale0 = Locale.GERMANY;
      DateFormat dateFormat0 = DateFormat.getTimeInstance(0, locale0);
      StandardXYToolTipGenerator standardXYToolTipGenerator0 = new StandardXYToolTipGenerator("0.0", numberFormat0, dateFormat0);
      xYSplineRenderer0.setBaseToolTipGenerator((XYToolTipGenerator) standardXYToolTipGenerator0, true);
      assertFalse(xYSplineRenderer0.getBaseItemLabelsVisible());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer(false, false);
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator();
      deviationRenderer0.setSeriesToolTipGenerator(1, (XYToolTipGenerator) standardXYZToolTipGenerator0, true);
      assertFalse(deviationRenderer0.getUseOutlinePaint());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer(false, false);
      Range range0 = deviationRenderer0.findDomainBounds((XYDataset) null);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StackedXYAreaRenderer2 stackedXYAreaRenderer2_0 = new StackedXYAreaRenderer2();
      Locale locale0 = Locale.GERMANY;
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance(locale0);
      StandardXYToolTipGenerator standardXYToolTipGenerator0 = new StandardXYToolTipGenerator(".", numberFormat0, (DateFormat) null);
      stackedXYAreaRenderer2_0.setBaseToolTipGenerator((XYToolTipGenerator) standardXYToolTipGenerator0);
      assertTrue(stackedXYAreaRenderer2_0.getBaseCreateEntities());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      xYBoxAndWhiskerRenderer0.setPlot((XYPlot) null);
      assertFalse(xYBoxAndWhiskerRenderer0.getAutoPopulateSeriesOutlinePaint());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer();
      xYStepRenderer0.setBaseURLGenerator((XYURLGenerator) null);
      assertEquals(2, xYStepRenderer0.getPassCount());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer(1936.0335717798);
      CrosshairState crosshairState0 = new CrosshairState(true);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
      // Undeclared exception!
      try { 
        stackedXYBarRenderer0.updateCrosshairValues(crosshairState0, 1936.0335717798, 0.1, (-2469), 0, 1936.0335717798, (-502.6869537086), plotOrientation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.AbstractXYItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer();
      CandlestickRenderer candlestickRenderer1 = (CandlestickRenderer)candlestickRenderer0.clone();
      assertEquals(1, candlestickRenderer1.getPassCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      WindItemRenderer windItemRenderer0 = new WindItemRenderer();
      BubbleXYItemLabelGenerator bubbleXYItemLabelGenerator0 = new BubbleXYItemLabelGenerator();
      windItemRenderer0.setBaseItemLabelGenerator((XYItemLabelGenerator) bubbleXYItemLabelGenerator0, true);
      WindItemRenderer windItemRenderer1 = (WindItemRenderer)windItemRenderer0.clone();
      assertEquals(1, windItemRenderer1.getPassCount());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SymbolAxis symbolAxis0 = new SymbolAxis("hqT}", stringArray0);
      XYAreaRenderer xYAreaRenderer0 = new XYAreaRenderer(500);
      XYPlot xYPlot0 = xYAreaRenderer0.getPlot();
      IntervalMarker intervalMarker0 = new IntervalMarker(500, 0.05, xYPlot0.DEFAULT_BACKGROUND_PAINT);
      Object[][] objectArray0 = new Object[2][9];
      objectArray0[1] = (Object[]) stringArray0;
      JTable jTable0 = new JTable(objectArray0, objectArray0[1]);
      Rectangle rectangle0 = jTable0.getCellRect(1, 5, true);
      xYAreaRenderer0.drawDomainMarker((Graphics2D) null, (XYPlot) null, symbolAxis0, intervalMarker0, rectangle0);
      assertEquals(24.0, rectangle0.getCenterY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StackedXYAreaRenderer stackedXYAreaRenderer0 = new StackedXYAreaRenderer();
      XYPlot xYPlot0 = new XYPlot();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("");
      Rectangle rectangle0 = new Rectangle(138, 2);
      Rectangle2D rectangle2D0 = xYPlot0.DEFAULT_INSETS.createInsetRectangle((Rectangle2D) rectangle0, true, false);
      stackedXYAreaRenderer0.drawRangeLine((Graphics2D) null, xYPlot0, numberAxis3D0, rectangle2D0, 4169.808209699, xYPlot0.DEFAULT_CROSSHAIR_PAINT, (Stroke) null);
      assertEquals(0.0F, numberAxis3D0.getTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Rectangle rectangle0 = new Rectangle();
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer();
      HighLowRenderer highLowRenderer0 = new HighLowRenderer();
      NumberAxis numberAxis0 = new NumberAxis();
      candlestickRenderer0.drawDomainLine((Graphics2D) null, combinedDomainXYPlot0, numberAxis0, rectangle0, Double.POSITIVE_INFINITY, numberAxis0.DEFAULT_AXIS_LABEL_PAINT, highLowRenderer0.DEFAULT_STROKE);
      assertEquals(0.0, combinedDomainXYPlot0.getDomainCrosshairValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      CompassPlot compassPlot0 = new CompassPlot();
      JFreeChart jFreeChart0 = new JFreeChart("LR9OB-4", xYBoxAndWhiskerRenderer0.DEFAULT_VALUE_LABEL_FONT, compassPlot0, true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(91, 1, 1, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      XYLine3DRenderer xYLine3DRenderer0 = new XYLine3DRenderer();
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer(202.2);
      GeneralPath generalPath0 = new GeneralPath();
      Rectangle2D rectangle2D0 = generalPath0.getBounds2D();
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1167.29638768626, (double) xYLine3DRenderer0.ZERO);
      Object[][][] objectArray0 = new Object[0][2][0];
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset(objectArray0);
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      XYItemRendererState xYItemRendererState0 = clusteredXYBarRenderer0.createState(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        stackedXYBarRenderer0.hitTest((-2825.163406391878), 10, graphics2D0, rectangle2D0, combinedRangeXYPlot0, cyclicNumberAxis0, cyclicNumberAxis0, defaultWindDataset0, 91, 837, xYItemRendererState0, false);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 91, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HighLowRenderer highLowRenderer0 = new HighLowRenderer();
      LegendItem legendItem0 = highLowRenderer0.getLegendItem(1484, 4);
      assertNull(legendItem0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      YIntervalRenderer yIntervalRenderer0 = new YIntervalRenderer();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(yIntervalRenderer0.ZERO);
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      XYBarDataset xYBarDataset0 = new XYBarDataset(timePeriodValuesCollection0, (double) yIntervalRenderer0.ZERO);
      Range range0 = yIntervalRenderer0.findRangeBounds(xYBarDataset0);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer();
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer((double) candlestickRenderer0.ZERO);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(stackedXYBarRenderer0.ZERO);
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection(timePeriodValues0);
      Range range0 = stackedXYBarRenderer0.findDomainBounds((XYDataset) timePeriodValuesCollection0, false);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer((-972.4496769037), true, (XYToolTipGenerator) null);
      Range range0 = candlestickRenderer0.findDomainBounds((XYDataset) null, true);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer();
      stackedXYBarRenderer0.removeAnnotations();
      assertEquals(2.0, stackedXYBarRenderer0.getItemLabelAnchorOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      XYBlockRenderer xYBlockRenderer0 = new XYBlockRenderer();
      StackedXYAreaRenderer2 stackedXYAreaRenderer2_0 = new StackedXYAreaRenderer2();
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation((double) stackedXYAreaRenderer2_0.ZERO, (double) xYBlockRenderer0.ZERO, 2.0, 2.0);
      Layer layer0 = Layer.BACKGROUND;
      xYBlockRenderer0.addAnnotation((XYAnnotation) xYBoxAnnotation0, layer0);
      assertFalse(xYBlockRenderer0.getBaseItemLabelsVisible());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer(0.0);
      Layer layer0 = Layer.FOREGROUND;
      // Undeclared exception!
      try { 
        xYBoxAndWhiskerRenderer0.addAnnotation((XYAnnotation) null, layer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'annotation' argument.
         //
         verifyException("org.jfree.chart.renderer.xy.AbstractXYItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      XYBubbleRenderer xYBubbleRenderer0 = new XYBubbleRenderer(0);
      xYBubbleRenderer0.setBaseURLGenerator((XYURLGenerator) null, false);
      assertEquals(0, XYBubbleRenderer.SCALE_ON_BOTH_AXES);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      XYAreaRenderer xYAreaRenderer0 = new XYAreaRenderer();
      xYAreaRenderer0.setSeriesURLGenerator(436, (XYURLGenerator) null, false);
      assertFalse(xYAreaRenderer0.getAutoPopulateSeriesFillPaint());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CyclicXYItemRenderer cyclicXYItemRenderer0 = new CyclicXYItemRenderer((-1620));
      StandardXYToolTipGenerator standardXYToolTipGenerator0 = StandardXYToolTipGenerator.getTimeSeriesInstance();
      cyclicXYItemRenderer0.setBaseToolTipGenerator((XYToolTipGenerator) standardXYToolTipGenerator0, false);
      assertEquals(1, StandardXYItemRenderer.SHAPES);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer((-2570.79601039381), false, (XYToolTipGenerator) null);
      candlestickRenderer0.setSeriesToolTipGenerator(0, (XYToolTipGenerator) null, false);
      assertEquals(7.2E7, candlestickRenderer0.getMaxCandleWidthInMilliseconds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      XYShapeRenderer xYShapeRenderer0 = new XYShapeRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      CyclicXYItemRenderer cyclicXYItemRenderer0 = new CyclicXYItemRenderer(0);
      Shape shape0 = cyclicXYItemRenderer0.getLegendLine();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      xYShapeRenderer0.addEntity(standardEntityCollection0, shape0, jDBCXYDataset0, 0, 1, false, 1.0E-100, (-1285.90439));
      assertEquals(1, standardEntityCollection0.getEntityCount());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      XYLine3DRenderer xYLine3DRenderer0 = new XYLine3DRenderer();
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      xYLine3DRenderer0.setBaseItemLabelGenerator((XYItemLabelGenerator) highLowItemLabelGenerator0, false);
      assertTrue(xYLine3DRenderer0.getAutoPopulateSeriesStroke());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StandardXYItemLabelGenerator standardXYItemLabelGenerator0 = new StandardXYItemLabelGenerator();
      XYShapeRenderer xYShapeRenderer0 = new XYShapeRenderer();
      xYShapeRenderer0.setSeriesItemLabelGenerator(1050, (XYItemLabelGenerator) standardXYItemLabelGenerator0, true);
      assertTrue(xYShapeRenderer0.getDataBoundsIncludesVisibleSeriesOnly());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      XYLineAndShapeRenderer xYLineAndShapeRenderer0 = new XYLineAndShapeRenderer(false, true);
      xYLineAndShapeRenderer0.setSeriesItemLabelGenerator(1, (XYItemLabelGenerator) null, false);
      assertFalse(xYLineAndShapeRenderer0.getBaseLinesVisible());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      XYItemLabelGenerator xYItemLabelGenerator0 = xYDotRenderer0.getItemLabelGenerator(1, 0, false);
      assertNull(xYItemLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      WindItemRenderer windItemRenderer0 = new WindItemRenderer();
      XYToolTipGenerator xYToolTipGenerator0 = windItemRenderer0.getBaseToolTipGenerator();
      assertNull(xYToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultXYItemRenderer defaultXYItemRenderer0 = new DefaultXYItemRenderer();
      defaultXYItemRenderer0.setSeriesURLGenerator(3165, (XYURLGenerator) null);
      assertFalse(defaultXYItemRenderer0.getAutoPopulateSeriesOutlinePaint());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer(0);
      XYToolTipGenerator xYToolTipGenerator0 = stackedXYBarRenderer0.getSeriesToolTipGenerator(0);
      assertNull(xYToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      VectorRenderer vectorRenderer0 = new VectorRenderer();
      vectorRenderer0.annotationChanged((AnnotationChangeEvent) null);
      assertTrue(vectorRenderer0.getAutoPopulateSeriesShape());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CyclicXYItemRenderer cyclicXYItemRenderer0 = new CyclicXYItemRenderer((-11));
      cyclicXYItemRenderer0.setLegendItemToolTipGenerator((XYSeriesLabelGenerator) null);
      assertEquals(8, StandardXYItemRenderer.DISCONTINUOUS);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer();
      XYSeriesLabelGenerator xYSeriesLabelGenerator0 = deviationRenderer0.getLegendItemLabelGenerator();
      deviationRenderer0.setLegendItemLabelGenerator(xYSeriesLabelGenerator0);
      assertTrue(deviationRenderer0.getBaseShapesVisible());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HighLowRenderer highLowRenderer0 = new HighLowRenderer();
      XYSeriesLabelGenerator xYSeriesLabelGenerator0 = highLowRenderer0.getLegendItemToolTipGenerator();
      assertNull(xYSeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DeviationRenderer deviationRenderer0 = new DeviationRenderer(false, false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      XYItemRendererState xYItemRendererState0 = deviationRenderer0.createState(plotRenderingInfo0);
      assertEquals(0, xYItemRendererState0.getFirstItemIndex());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      XYAreaRenderer xYAreaRenderer0 = new XYAreaRenderer((-187), (XYToolTipGenerator) null, (XYURLGenerator) null);
      XYBoxAnnotation xYBoxAnnotation0 = new XYBoxAnnotation(2, 0.0, (-1.0), 530.8643679453);
      boolean boolean0 = xYAreaRenderer0.removeAnnotation(xYBoxAnnotation0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getDateTimeInstance();
      StandardXYToolTipGenerator standardXYToolTipGenerator0 = new StandardXYToolTipGenerator("K", dateFormat0, dateFormat0);
      StandardXYItemRenderer standardXYItemRenderer0 = new StandardXYItemRenderer(0, standardXYToolTipGenerator0);
      standardXYItemRenderer0.setSeriesToolTipGenerator(1, (XYToolTipGenerator) standardXYToolTipGenerator0);
      assertTrue(standardXYItemRenderer0.getAutoPopulateSeriesPaint());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer();
      XYURLGenerator xYURLGenerator0 = candlestickRenderer0.getBaseURLGenerator();
      assertNull(xYURLGenerator0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1812.0);
      StackedXYAreaRenderer stackedXYAreaRenderer0 = new StackedXYAreaRenderer(500);
      XYPlot xYPlot0 = null;
      try {
        xYPlot0 = new XYPlot(defaultWindDataset0, cyclicNumberAxis0, cyclicNumberAxis0, stackedXYAreaRenderer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.data.xy.DefaultWindDataset cannot be cast to org.jfree.data.xy.TableXYDataset
         //
         verifyException("org.jfree.chart.renderer.xy.StackedXYAreaRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HighLowRenderer highLowRenderer0 = new HighLowRenderer();
      XYItemLabelGenerator xYItemLabelGenerator0 = highLowRenderer0.getSeriesItemLabelGenerator(0);
      assertNull(xYItemLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      XYItemLabelGenerator xYItemLabelGenerator0 = xYDotRenderer0.getBaseItemLabelGenerator();
      assertNull(xYItemLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(401);
      candlestickRenderer0.setBaseItemLabelGenerator((XYItemLabelGenerator) null);
      assertTrue(candlestickRenderer0.getDataBoundsIncludesVisibleSeriesOnly());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer((-972.4496769037), true, (XYToolTipGenerator) null);
      DateFormat dateFormat0 = MockDateFormat.getInstance();
      IntervalXYItemLabelGenerator intervalXYItemLabelGenerator0 = new IntervalXYItemLabelGenerator("", dateFormat0, dateFormat0);
      candlestickRenderer0.setSeriesItemLabelGenerator(78, (XYItemLabelGenerator) intervalXYItemLabelGenerator0);
      assertEquals(1, CandlestickRenderer.WIDTHMETHOD_SMALLEST);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      XYBlockRenderer xYBlockRenderer0 = new XYBlockRenderer();
      int int0 = xYBlockRenderer0.getPassCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CyclicXYItemRenderer cyclicXYItemRenderer0 = new CyclicXYItemRenderer((-1620));
      XYSeriesLabelGenerator xYSeriesLabelGenerator0 = cyclicXYItemRenderer0.getLegendItemURLGenerator();
      assertNull(xYSeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      XYAreaRenderer xYAreaRenderer0 = new XYAreaRenderer(301);
      XYShapeRenderer xYShapeRenderer0 = new XYShapeRenderer();
      XYShapeAnnotation xYShapeAnnotation0 = new XYShapeAnnotation(xYShapeRenderer0.DEFAULT_SHAPE, xYAreaRenderer0.DEFAULT_OUTLINE_STROKE, xYShapeRenderer0.DEFAULT_VALUE_LABEL_PAINT, (Paint) null);
      xYAreaRenderer0.addAnnotation((XYAnnotation) xYShapeAnnotation0);
      assertTrue(xYAreaRenderer0.getAutoPopulateSeriesShape());
  }
}