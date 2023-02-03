/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 00:55:08 GMT 2022
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.SystemColor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.renderer.xy.HighLowRenderer;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ValueMarker_ESTest extends ValueMarker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(0.0);
      Object object0 = valueMarker0.clone();
      valueMarker0.setValue(3597.02);
      boolean boolean0 = valueMarker0.equals(object0);
      assertEquals(3597.02, valueMarker0.getValue(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(0.0);
      double double0 = valueMarker0.getValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(45.0);
      double double0 = valueMarker0.getValue();
      assertEquals(45.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      StackedXYAreaRenderer stackedXYAreaRenderer0 = new StackedXYAreaRenderer();
      ValueMarker valueMarker0 = null;
      try {
        valueMarker0 = new ValueMarker(0.0, systemColor0, (Stroke) null, stackedXYAreaRenderer0.DEFAULT_OUTLINE_PAINT, stackedXYAreaRenderer0.DEFAULT_STROKE, 533.6F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HighLowRenderer highLowRenderer0 = new HighLowRenderer();
      ValueMarker valueMarker0 = null;
      try {
        valueMarker0 = new ValueMarker(0.0, (Paint) null, highLowRenderer0.DEFAULT_OUTLINE_STROKE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer();
      Paint paint0 = candlestickRenderer0.getItemLabelPaint((-2241), (-2241), false);
      ValueMarker valueMarker0 = new ValueMarker(2136.94043849985, paint0, candlestickRenderer0.DEFAULT_STROKE, candlestickRenderer0.DEFAULT_OUTLINE_PAINT, candlestickRenderer0.DEFAULT_STROKE, 0);
      assertEquals(2136.94043849985, valueMarker0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Color color0 = (Color)SpiderWebPlot.DEFAULT_LABEL_OUTLINE_PAINT;
      BasicStroke basicStroke0 = new BasicStroke();
      ValueMarker valueMarker0 = new ValueMarker((-238.0), color0, basicStroke0);
      Object object0 = valueMarker0.clone();
      valueMarker0.setValue((-2474.0));
      boolean boolean0 = valueMarker0.equals(object0);
      assertEquals((-2474.0), valueMarker0.getValue(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Color color0 = (Color)SpiderWebPlot.DEFAULT_LABEL_OUTLINE_PAINT;
      BasicStroke basicStroke0 = new BasicStroke();
      ValueMarker valueMarker0 = new ValueMarker((-238.0), color0, basicStroke0);
      ValueMarker valueMarker1 = (ValueMarker)valueMarker0.clone();
      boolean boolean0 = valueMarker0.equals(valueMarker1);
      assertTrue(boolean0);
      assertEquals((-238.0), valueMarker1.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Color color0 = (Color)SpiderWebPlot.DEFAULT_LABEL_OUTLINE_PAINT;
      BasicStroke basicStroke0 = new BasicStroke();
      ValueMarker valueMarker0 = new ValueMarker((-238.0), color0, basicStroke0);
      boolean boolean0 = valueMarker0.equals(valueMarker0);
      assertTrue(boolean0);
      assertEquals((-238.0), valueMarker0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Color color0 = (Color)SpiderWebPlot.DEFAULT_LABEL_OUTLINE_PAINT;
      BasicStroke basicStroke0 = new BasicStroke();
      ValueMarker valueMarker0 = new ValueMarker((-238.0), color0, basicStroke0);
      boolean boolean0 = valueMarker0.equals(basicStroke0);
      assertEquals((-238.0), valueMarker0.getValue(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Color color0 = (Color)SpiderWebPlot.DEFAULT_LABEL_OUTLINE_PAINT;
      BasicStroke basicStroke0 = new BasicStroke();
      ValueMarker valueMarker0 = new ValueMarker((-238.0), color0, basicStroke0);
      double double0 = valueMarker0.getValue();
      assertEquals((-238.0), double0, 0.01);
  }
}
