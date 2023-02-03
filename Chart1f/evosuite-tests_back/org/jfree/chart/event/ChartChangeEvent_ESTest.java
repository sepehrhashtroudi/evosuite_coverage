/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 23:24:59 GMT 2022
 */

package org.jfree.chart.event;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Font;
import java.text.AttributedCharacterIterator;
import java.time.format.FormatStyle;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.Annotation;
import org.jfree.chart.event.AnnotationChangeEvent;
import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.event.ChartChangeEventType;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.WaferMapPlot;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ChartChangeEvent_ESTest extends ChartChangeEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = AttributedCharacterIterator.Attribute.LANGUAGE;
      RendererChangeEvent rendererChangeEvent0 = new RendererChangeEvent(attributedCharacterIterator_Attribute0, false);
      rendererChangeEvent0.setType((ChartChangeEventType) null);
      ChartChangeEventType chartChangeEventType0 = rendererChangeEvent0.getType();
      assertNull(chartChangeEventType0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AnnotationChangeEvent annotationChangeEvent0 = new AnnotationChangeEvent("6eUdtZ)H=zO{@@", (Annotation) null);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      jFreeChart0.setBorderVisible(true);
      annotationChangeEvent0.setChart(jFreeChart0);
      JFreeChart jFreeChart1 = annotationChangeEvent0.getChart();
      assertTrue(jFreeChart1.isBorderVisible());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FormatStyle formatStyle0 = FormatStyle.SHORT;
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartChangeEventType chartChangeEventType0 = ChartChangeEventType.NEW_DATASET;
      ChartChangeEvent chartChangeEvent0 = new ChartChangeEvent(formatStyle0, jFreeChart0, chartChangeEventType0);
      JFreeChart jFreeChart1 = chartChangeEvent0.getChart();
      assertSame(jFreeChart0, jFreeChart1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      MeterPlot meterPlot0 = new MeterPlot();
      JFreeChart jFreeChart0 = new JFreeChart(meterPlot0);
      ChartChangeEventType chartChangeEventType0 = ChartChangeEventType.DATASET_UPDATED;
      jFreeChart0.setBackgroundImageAlpha(0.0F);
      ChartChangeEvent chartChangeEvent0 = new ChartChangeEvent(locale0, jFreeChart0, chartChangeEventType0);
      JFreeChart jFreeChart1 = chartChangeEvent0.getChart();
      assertFalse(jFreeChart1.isBorderVisible());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PolarPlot polarPlot0 = new PolarPlot();
      PlotChangeEvent plotChangeEvent0 = new PlotChangeEvent(polarPlot0);
      JFreeChart jFreeChart0 = new JFreeChart(polarPlot0);
      plotChangeEvent0.setChart(jFreeChart0);
      jFreeChart0.setAntiAlias(false);
      JFreeChart jFreeChart1 = plotChangeEvent0.getChart();
      assertEquals(1, jFreeChart1.getSubtitleCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Font font0 = SpiderWebPlot.DEFAULT_LABEL_FONT;
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", font0, waferMapPlot0, false);
      ChartChangeEventType chartChangeEventType0 = ChartChangeEventType.DATASET_UPDATED;
      ChartChangeEvent chartChangeEvent0 = null;
      try {
        chartChangeEvent0 = new ChartChangeEvent((Object) null, jFreeChart0, chartChangeEventType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartChangeEvent chartChangeEvent0 = null;
      try {
        chartChangeEvent0 = new ChartChangeEvent((Object) null, jFreeChart0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ChartChangeEvent chartChangeEvent0 = null;
      try {
        chartChangeEvent0 = new ChartChangeEvent((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      ChartChangeEvent chartChangeEvent0 = new ChartChangeEvent(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RendererChangeEvent rendererChangeEvent0 = new RendererChangeEvent("");
      JFreeChart jFreeChart0 = rendererChangeEvent0.getChart();
      assertNull(jFreeChart0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      CompassPlot compassPlot0 = new CompassPlot();
      JFreeChart jFreeChart0 = new JFreeChart("'maxX' cannot be INF or NaN.", compassPlot0);
      ChartChangeEvent chartChangeEvent0 = new ChartChangeEvent(object0, jFreeChart0);
      ChartChangeEventType chartChangeEventType0 = chartChangeEvent0.getType();
      assertEquals("ChartChangeEventType.GENERAL", chartChangeEventType0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RendererChangeEvent rendererChangeEvent0 = new RendererChangeEvent("");
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = new JFreeChart(multiplePiePlot0);
      rendererChangeEvent0.setChart(jFreeChart0);
      jFreeChart0.setBackgroundImageAlignment((-262));
      JFreeChart jFreeChart1 = rendererChangeEvent0.getChart();
      assertSame(jFreeChart1, jFreeChart0);
  }
}