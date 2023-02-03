/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 01:57:05 GMT 2022
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.SystemColor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.xy.ClusteredXYBarRenderer;
import org.jfree.chart.util.GradientPaintTransformType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.StandardGradientPaintTransformer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IntervalMarker_ESTest extends IntervalMarker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LogAxis logAxis0 = new LogAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(logAxis0);
      Paint paint0 = combinedDomainXYPlot0.getRangeMinorGridlinePaint();
      IntervalMarker intervalMarker0 = new IntervalMarker(2558.4204338, 2558.4204338, paint0);
      intervalMarker0.setEndValue(1.0E-8);
      Object object0 = intervalMarker0.clone();
      intervalMarker0.setEndValue(10);
      boolean boolean0 = intervalMarker0.equals(object0);
      assertEquals(10.0, intervalMarker0.getEndValue(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(100000.0, 1.0);
      IntervalMarker intervalMarker1 = new IntervalMarker(3211.049063144, 100000.0);
      boolean boolean0 = intervalMarker0.equals(intervalMarker1);
      assertFalse(boolean0);
      assertEquals(3211.049063144, intervalMarker1.getStartValue(), 0.01);
      assertEquals(100000.0, intervalMarker1.getEndValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(0.0, 0.0);
      double double0 = intervalMarker0.getStartValue();
      assertEquals(0.0, intervalMarker0.getEndValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LogAxis logAxis0 = new LogAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(logAxis0);
      Paint paint0 = combinedDomainXYPlot0.getRangeMinorGridlinePaint();
      IntervalMarker intervalMarker0 = new IntervalMarker((-188.77), (-1296.7), paint0);
      double double0 = intervalMarker0.getStartValue();
      assertEquals((-188.77), double0, 0.01);
      assertEquals((-1296.7), intervalMarker0.getEndValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(4113.672321908, (-3.0));
      GradientPaintTransformType gradientPaintTransformType0 = GradientPaintTransformType.CENTER_VERTICAL;
      StandardGradientPaintTransformer standardGradientPaintTransformer0 = new StandardGradientPaintTransformer(gradientPaintTransformType0);
      intervalMarker0.setGradientPaintTransformer(standardGradientPaintTransformer0);
      intervalMarker0.getGradientPaintTransformer();
      assertEquals((-3.0), intervalMarker0.getEndValue(), 0.01);
      assertEquals(4113.672321908, intervalMarker0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LogAxis logAxis0 = new LogAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(logAxis0);
      Paint paint0 = combinedDomainXYPlot0.getRangeMinorGridlinePaint();
      IntervalMarker intervalMarker0 = new IntervalMarker((-188.77), (-1296.7), paint0);
      intervalMarker0.setEndValue(0.0);
      double double0 = intervalMarker0.getEndValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Paint paint0 = meterPlot0.getTickLabelPaint();
      IntervalMarker intervalMarker0 = null;
      try {
        intervalMarker0 = new IntervalMarker(0.0, 4236.423758, paint0, meterPlot0.DEFAULT_OUTLINE_STROKE, meterPlot0.DEFAULT_OUTLINE_PAINT, meterPlot0.DEFAULT_OUTLINE_STROKE, 270);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'alpha' value must be in the range 0.0f to 1.0f
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IntervalMarker intervalMarker0 = null;
      try {
        intervalMarker0 = new IntervalMarker(1157.622048, 0.0, (Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.scrollbar;
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Stroke stroke0 = stackedAreaRenderer0.getItemOutlineStroke((-2118), (-2118), false);
      IntervalMarker intervalMarker0 = new IntervalMarker(5000.0, 2.5E11, systemColor0, stroke0, stackedAreaRenderer0.DEFAULT_VALUE_LABEL_PAINT, stackedAreaRenderer0.DEFAULT_STROKE, 0.0F);
      IntervalMarker intervalMarker1 = (IntervalMarker)intervalMarker0.clone();
      assertTrue(intervalMarker1.equals((Object)intervalMarker0));
      
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer();
      StandardGradientPaintTransformer standardGradientPaintTransformer0 = (StandardGradientPaintTransformer)clusteredXYBarRenderer0.getGradientPaintTransformer();
      intervalMarker1.setGradientPaintTransformer(standardGradientPaintTransformer0);
      boolean boolean0 = intervalMarker0.equals(intervalMarker1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LogAxis logAxis0 = new LogAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(logAxis0);
      Paint paint0 = combinedDomainXYPlot0.getRangeMinorGridlinePaint();
      IntervalMarker intervalMarker0 = new IntervalMarker(2558.4204338, 2558.4204338, paint0);
      Object object0 = intervalMarker0.clone();
      intervalMarker0.setEndValue(10);
      boolean boolean0 = intervalMarker0.equals(object0);
      assertEquals(10.0, intervalMarker0.getEndValue(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(0.4122673977118179, 0.4122673977118179);
      IntervalMarker intervalMarker1 = new IntervalMarker(3213.1363679331116, 0.4122673977118179);
      boolean boolean0 = intervalMarker0.equals(intervalMarker1);
      assertFalse(intervalMarker1.equals((Object)intervalMarker0));
      assertEquals(0.4122673977118179, intervalMarker1.getEndValue(), 0.01);
      assertFalse(boolean0);
      assertEquals(3213.1363679331116, intervalMarker1.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker((-188.77), 1.0F);
      boolean boolean0 = intervalMarker0.equals(intervalMarker0);
      assertEquals(1.0, intervalMarker0.getEndValue(), 0.01);
      assertTrue(boolean0);
      assertEquals((-188.77), intervalMarker0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.scrollbar;
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Stroke stroke0 = stackedAreaRenderer0.getItemOutlineStroke((-2118), (-2118), false);
      IntervalMarker intervalMarker0 = new IntervalMarker(5000.0, 2.5E11, systemColor0, stroke0, stackedAreaRenderer0.DEFAULT_VALUE_LABEL_PAINT, stackedAreaRenderer0.DEFAULT_STROKE, 0.0F);
      boolean boolean0 = intervalMarker0.equals("org.jfree.chart.plot.IntervalMarker");
      assertEquals(2.5E11, intervalMarker0.getEndValue(), 0.01);
      assertEquals(5000.0, intervalMarker0.getStartValue(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.scrollbar;
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Stroke stroke0 = stackedAreaRenderer0.getItemOutlineStroke((-2118), (-2118), false);
      IntervalMarker intervalMarker0 = new IntervalMarker(5000.0, 2.5E11, systemColor0, stroke0, stackedAreaRenderer0.DEFAULT_VALUE_LABEL_PAINT, stackedAreaRenderer0.DEFAULT_STROKE, 0.0F);
      double double0 = intervalMarker0.getStartValue();
      assertEquals(2.5E11, intervalMarker0.getEndValue(), 0.01);
      assertEquals(5000.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(0.0, 0.0);
      Object object0 = intervalMarker0.clone();
      assertTrue(object0.equals((Object)intervalMarker0));
      
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      intervalMarker0.setLabelAnchor(rectangleAnchor0);
      boolean boolean0 = intervalMarker0.equals(object0);
      assertFalse(object0.equals((Object)intervalMarker0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.scrollbar;
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Stroke stroke0 = stackedAreaRenderer0.getItemOutlineStroke((-2118), (-2118), false);
      IntervalMarker intervalMarker0 = new IntervalMarker(5000.0, 2.5E11, systemColor0, stroke0, stackedAreaRenderer0.DEFAULT_VALUE_LABEL_PAINT, stackedAreaRenderer0.DEFAULT_STROKE, 0.0F);
      intervalMarker0.getGradientPaintTransformer();
      assertEquals(2.5E11, intervalMarker0.getEndValue(), 0.01);
      assertEquals(5000.0, intervalMarker0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LogAxis logAxis0 = new LogAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(logAxis0);
      Paint paint0 = combinedDomainXYPlot0.getRangeMinorGridlinePaint();
      IntervalMarker intervalMarker0 = new IntervalMarker(2558.4204338, 2558.4204338, paint0);
      intervalMarker0.setStartValue(2558.4204338);
      assertEquals(2558.4204338, intervalMarker0.getEndValue(), 0.01);
      assertEquals(2558.4204338, intervalMarker0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.scrollbar;
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Stroke stroke0 = stackedAreaRenderer0.getItemOutlineStroke((-2118), (-2118), false);
      IntervalMarker intervalMarker0 = new IntervalMarker(5000.0, 2.5E11, systemColor0, stroke0, stackedAreaRenderer0.DEFAULT_VALUE_LABEL_PAINT, stackedAreaRenderer0.DEFAULT_STROKE, 0.0F);
      IntervalMarker intervalMarker1 = (IntervalMarker)intervalMarker0.clone();
      boolean boolean0 = intervalMarker0.equals(intervalMarker1);
      assertEquals(5000.0, intervalMarker1.getStartValue(), 0.01);
      assertTrue(boolean0);
      assertEquals(2.5E11, intervalMarker1.getEndValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.scrollbar;
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Stroke stroke0 = stackedAreaRenderer0.getItemOutlineStroke((-2118), (-2118), false);
      IntervalMarker intervalMarker0 = new IntervalMarker(5000.0, 2.5E11, systemColor0, stroke0, stackedAreaRenderer0.DEFAULT_VALUE_LABEL_PAINT, stackedAreaRenderer0.DEFAULT_STROKE, 0.0F);
      intervalMarker0.setEndValue((-3234.988552922533));
      double double0 = intervalMarker0.getEndValue();
      assertEquals((-3234.988552922533), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.scrollbar;
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Stroke stroke0 = stackedAreaRenderer0.getItemOutlineStroke((-2118), (-2118), false);
      IntervalMarker intervalMarker0 = new IntervalMarker(5000.0, 2.5E11, systemColor0, stroke0, stackedAreaRenderer0.DEFAULT_VALUE_LABEL_PAINT, stackedAreaRenderer0.DEFAULT_STROKE, 0.0F);
      double double0 = intervalMarker0.getEndValue();
      assertEquals(2.5E11, double0, 0.01);
      assertEquals(5000.0, intervalMarker0.getStartValue(), 0.01);
  }
}