/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 01:55:32 GMT 2022
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.SystemColor;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.event.MarkerChangeEvent;
import org.jfree.chart.event.MarkerChangeListener;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.pie.DefaultPieDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.statistics.SimpleHistogramBin;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Second;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Marker_ESTest extends Marker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      IntervalMarker intervalMarker0 = new IntervalMarker(1.0F, 0.2, categoryAxis0.DEFAULT_AXIS_LINE_PAINT);
      intervalMarker0.setAlpha(1.0F);
      assertEquals(1.0F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker((-370.19832170527));
      valueMarker0.setAlpha(0.0F);
      assertEquals(0.0F, valueMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      IntervalMarker intervalMarker0 = new IntervalMarker(1.0F, 0.2, categoryAxis0.DEFAULT_AXIS_LINE_PAINT);
      Stroke stroke0 = intervalMarker0.getOutlineStroke();
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
      assertNull(stroke0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(219.30734);
      Paint paint0 = valueMarker0.getLabelPaint();
      IntervalMarker intervalMarker0 = new IntervalMarker(219.30734, 0.0, paint0);
      Paint paint1 = intervalMarker0.getOutlinePaint();
      assertNull(paint1);
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer((-2532.37185926));
      Paint paint0 = candlestickRenderer0.getVolumePaint();
      IntervalMarker intervalMarker0 = new IntervalMarker((-2532.37185926), (-2532.37185926), paint0);
      intervalMarker0.setLabel("Q found at end of string.");
      intervalMarker0.getLabel();
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      Paint paint0 = combinedRangeCategoryPlot0.getBackgroundPaint();
      IntervalMarker intervalMarker0 = new IntervalMarker(470.394, 470.394, paint0, combinedRangeCategoryPlot0.DEFAULT_GRIDLINE_STROKE, paint0, combinedRangeCategoryPlot0.DEFAULT_OUTLINE_STROKE, 0.0F);
      float float0 = intervalMarker0.getAlpha();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Second second0 = new Second(mockDate0);
      CategoryMarker categoryMarker0 = new CategoryMarker(second0);
      categoryMarker0.equals(mockDate0);
      assertEquals(1.0F, categoryMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Null 'anchor' argument.");
      Paint paint0 = subCategoryAxis0.getSubLabelPaint();
      ValueMarker valueMarker0 = new ValueMarker(0.0, paint0, subCategoryAxis0.DEFAULT_AXIS_LINE_STROKE, subCategoryAxis0.DEFAULT_TICK_LABEL_PAINT, subCategoryAxis0.DEFAULT_AXIS_LINE_STROKE, 0.9F);
      Class<CategoryMarker> class0 = CategoryMarker.class;
      // Undeclared exception!
      try { 
        valueMarker0.getListeners(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [Lorg.jfree.chart.plot.CategoryMarker; cannot be cast to [Ljava.util.EventListener;
         //
         verifyException("javax.swing.event.EventListenerList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer((-2532.37185926));
      Paint paint0 = candlestickRenderer0.getVolumePaint();
      IntervalMarker intervalMarker0 = new IntervalMarker((-2532.37185926), (-2532.37185926), paint0);
      MarkerChangeEvent markerChangeEvent0 = new MarkerChangeEvent(intervalMarker0);
      intervalMarker0.notifyListeners(markerChangeEvent0);
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(0.0, 0.0);
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.EXPAND;
      intervalMarker0.setLabelOffsetType(lengthAdjustmentType0);
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      Paint paint0 = ringPlot0.getSeparatorPaint();
      ValueMarker valueMarker0 = new ValueMarker((-5422.026914532), paint0, ringPlot0.DEFAULT_OUTLINE_STROKE);
      ValueMarker valueMarker1 = (ValueMarker)valueMarker0.clone();
      assertEquals(1.0F, valueMarker1.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker((-5447.649275250703), (-5447.649275250703));
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(defaultMultiValueCategoryDataset0);
      intervalMarker0.setLabelPaint(spiderWebPlot0.DEFAULT_OUTLINE_PAINT);
      ValueMarker valueMarker0 = new ValueMarker(90.0);
      valueMarker0.equals(intervalMarker0);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker((-5447.649275250703), (-5447.649275250703));
      AreaRenderer areaRenderer0 = new AreaRenderer();
      intervalMarker0.setOutlineStroke(areaRenderer0.DEFAULT_OUTLINE_STROKE);
      ValueMarker valueMarker0 = new ValueMarker(90.0);
      valueMarker0.equals(intervalMarker0);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Color color0 = (Color)LegendTitle.DEFAULT_ITEM_PAINT;
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      IntervalMarker intervalMarker0 = new IntervalMarker(43.930287955, (double) stackedAreaRenderer0.ZERO, color0, stackedAreaRenderer0.DEFAULT_OUTLINE_STROKE, stackedAreaRenderer0.DEFAULT_PAINT, stackedAreaRenderer0.DEFAULT_OUTLINE_STROKE, 1);
      IntervalMarker intervalMarker1 = new IntervalMarker(3.0, (double) stackedAreaRenderer0.ZERO, color0);
      intervalMarker0.equals(intervalMarker1);
      assertEquals(0.8F, intervalMarker1.getAlpha(), 0.01F);
      assertEquals(1.0F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      Paint paint0 = stackedAreaRenderer0.getItemOutlinePaint((-1290), (-1290), false);
      ValueMarker valueMarker0 = new ValueMarker((-533.72333150575), paint0, stackedAreaRenderer0.DEFAULT_OUTLINE_STROKE);
      valueMarker0.setPaint(stackedAreaRenderer0.DEFAULT_PAINT);
      ValueMarker valueMarker1 = new ValueMarker((-839.1039643103378), stackedAreaRenderer0.DEFAULT_OUTLINE_PAINT, stackedAreaRenderer0.DEFAULT_STROKE);
      valueMarker0.equals(valueMarker1);
      assertEquals(1.0F, valueMarker1.getAlpha(), 0.01F);
      assertEquals(1.0F, valueMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(1.0E8, 1.0E8);
      ValueMarker valueMarker0 = new ValueMarker(1);
      valueMarker0.equals(intervalMarker0);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(1.0E8, 1.0E8);
      Paint paint0 = intervalMarker0.getLabelPaint();
      ValueMarker valueMarker0 = new ValueMarker((-4279.0));
      valueMarker0.equals(paint0);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker((-5447.649275250703), (-5447.649275250703));
      AreaRenderer areaRenderer0 = new AreaRenderer();
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(defaultMultiValueCategoryDataset0);
      intervalMarker0.addChangeListener(spiderWebPlot0);
      Paint paint0 = areaRenderer0.getItemOutlinePaint(10, 10, true);
      intervalMarker0.setPaint(paint0);
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(219.30734);
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      PiePlot3D piePlot3D0 = new PiePlot3D(defaultPieDataset0);
      PeriodAxis periodAxis0 = new PeriodAxis("");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(periodAxis0);
      CategoryMarker categoryMarker0 = new CategoryMarker(1.0F);
      valueMarker0.removeChangeListener(combinedDomainXYPlot0);
      categoryMarker0.removeChangeListener(piePlot3D0);
      assertEquals(1.0F, categoryMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker((-5447.649275250703), (-5447.649275250703));
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(defaultMultiValueCategoryDataset0);
      intervalMarker0.addChangeListener(spiderWebPlot0);
      ValueMarker valueMarker0 = new ValueMarker(90.0);
      MarkerChangeEvent markerChangeEvent0 = new MarkerChangeEvent(valueMarker0);
      intervalMarker0.notifyListeners(markerChangeEvent0);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(1320.9194228329, 5.0E10);
      intervalMarker0.removeChangeListener((MarkerChangeListener) null);
      intervalMarker0.addChangeListener((MarkerChangeListener) null);
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minute minute0 = new Minute();
      Second second0 = new Second((-1578), minute0);
      CategoryMarker categoryMarker0 = new CategoryMarker(second0);
      // Undeclared exception!
      try { 
        categoryMarker0.setLabelTextAnchor((TextAnchor) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(1.0E8, 1.0E8);
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_RIGHT;
      intervalMarker0.setLabelTextAnchor(textAnchor0);
      ValueMarker valueMarker0 = new ValueMarker(1);
      valueMarker0.equals(intervalMarker0);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker((-2339.3422705477155));
      // Undeclared exception!
      try { 
        valueMarker0.setLabelOffsetType((LengthAdjustmentType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'adj' argument.
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(998.8618427448457, 878.6936616513223);
      // Undeclared exception!
      try { 
        intervalMarker0.setLabelOffset((RectangleInsets) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'offset' argument.
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Color color0 = (Color)LegendTitle.DEFAULT_ITEM_PAINT;
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      IntervalMarker intervalMarker0 = new IntervalMarker(43.930287955, (double) stackedAreaRenderer0.ZERO, color0, stackedAreaRenderer0.DEFAULT_OUTLINE_STROKE, stackedAreaRenderer0.DEFAULT_PAINT, stackedAreaRenderer0.DEFAULT_OUTLINE_STROKE, 1);
      RectangleInsets rectangleInsets0 = Plot.DEFAULT_INSETS;
      intervalMarker0.setLabelOffset(rectangleInsets0);
      assertEquals(1.0F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(0.0);
      // Undeclared exception!
      try { 
        valueMarker0.setLabelAnchor((RectangleAnchor) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      CategoryMarker categoryMarker0 = new CategoryMarker(areaRenderer0.ZERO);
      categoryMarker0.setLabelAnchor(rectangleAnchor0);
      assertEquals(1.0F, categoryMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(154.5, 987.0);
      CategoryMarker categoryMarker0 = new CategoryMarker(simpleHistogramBin0);
      // Undeclared exception!
      try { 
        categoryMarker0.setLabelPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(0.0);
      // Undeclared exception!
      try { 
        valueMarker0.setLabelFont((Font) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Color color0 = (Color)LegendTitle.DEFAULT_ITEM_PAINT;
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Stroke stroke0 = stackedAreaRenderer0.lookupSeriesStroke(1);
      ValueMarker valueMarker0 = new ValueMarker((-282.02764211069), color0, stroke0);
      valueMarker0.setLabelFont(stackedAreaRenderer0.DEFAULT_VALUE_LABEL_FONT);
      assertEquals(1.0F, valueMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(51.8344);
      // Undeclared exception!
      try { 
        valueMarker0.setAlpha(4354.571F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'alpha' value must be in the range 0.0f to 1.0f
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker((-519.401), 2.5E-9);
      // Undeclared exception!
      try { 
        intervalMarker0.setAlpha((-1127.3176F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'alpha' value must be in the range 0.0f to 1.0f
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(0.0, 111.7263766);
      // Undeclared exception!
      try { 
        intervalMarker0.setStroke((Stroke) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(1.0E8, 1.0E8);
      Stroke stroke0 = intervalMarker0.getOutlineStroke();
      intervalMarker0.setStroke(stroke0);
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker((-519.401), (-519.401));
      // Undeclared exception!
      try { 
        intervalMarker0.setPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.textText;
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      PiePlot3D piePlot3D0 = new PiePlot3D(defaultPieDataset0);
      BasicStroke basicStroke0 = (BasicStroke)Axis.DEFAULT_AXIS_LINE_STROKE;
      ValueMarker valueMarker0 = null;
      try {
        valueMarker0 = new ValueMarker((-4813.93966), systemColor0, basicStroke0, piePlot3D0.DEFAULT_BACKGROUND_PAINT, piePlot3D0.DEFAULT_LABEL_OUTLINE_STROKE, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'alpha' value must be in the range 0.0f to 1.0f
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Color color0 = (Color)LegendTitle.DEFAULT_ITEM_PAINT;
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Stroke stroke0 = stackedAreaRenderer0.lookupSeriesStroke(1);
      CategoryMarker categoryMarker0 = null;
      try {
        categoryMarker0 = new CategoryMarker(stackedAreaRenderer0.ZERO, color0, stackedAreaRenderer0.DEFAULT_STROKE, stackedAreaRenderer0.DEFAULT_PAINT, stroke0, (-13.62793F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'alpha' value must be in the range 0.0f to 1.0f
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getTextSelectionColor();
      CategoryMarker categoryMarker0 = null;
      try {
        categoryMarker0 = new CategoryMarker((Comparable) null, color0, (Stroke) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      Stroke stroke0 = stackedAreaRenderer0.lookupSeriesStroke(234);
      ValueMarker valueMarker0 = null;
      try {
        valueMarker0 = new ValueMarker(0L, (Paint) null, stroke0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker((-519.401), 2.5E-9);
      intervalMarker0.getLabelAnchor();
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(1.0E8, 1.0E8);
      float float0 = intervalMarker0.getAlpha();
      assertEquals(0.8F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CategoryMarker categoryMarker0 = new CategoryMarker(2);
      categoryMarker0.getStroke();
      assertEquals(1.0F, categoryMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(2032.398584712, 2032.398584712);
      intervalMarker0.getLabelOffset();
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(0.0, 0.0);
      intervalMarker0.setOutlinePaint((Paint) null);
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Color color0 = (Color)LegendTitle.DEFAULT_ITEM_PAINT;
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Stroke stroke0 = stackedAreaRenderer0.lookupSeriesStroke(1);
      ValueMarker valueMarker0 = new ValueMarker((-282.02764211069), color0, stroke0);
      Class<CombinedRangeCategoryPlot> class0 = CombinedRangeCategoryPlot.class;
      valueMarker0.getListeners(class0);
      assertEquals(1.0F, valueMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(1.0E8, 1.0E8);
      intervalMarker0.getLabelOffsetType();
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CategoryMarker categoryMarker0 = new CategoryMarker(2);
      categoryMarker0.getLabel();
      assertEquals(1.0F, categoryMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(1.0E8, 1.0E8);
      intervalMarker0.setLabel("K6wq^*ET");
      ValueMarker valueMarker0 = new ValueMarker(1);
      valueMarker0.equals(intervalMarker0);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(1.0E8, 1.0E8);
      intervalMarker0.getOutlinePaint();
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker((-519.401), 2.5E-9);
      intervalMarker0.getPaint();
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(1.0E8, 1.0E8);
      intervalMarker0.getLabelTextAnchor();
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(2032.398584712, 2032.398584712);
      Font font0 = intervalMarker0.getLabelFont();
      assertEquals(9.0F, font0.getSize2D(), 0.01F);
      assertTrue(font0.isPlain());
      assertEquals(0.8F, intervalMarker0.getAlpha(), 0.01F);
      assertEquals("Tahoma", font0.getName());
  }
}