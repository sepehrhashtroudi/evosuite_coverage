/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 23:31:00 GMT 2022
 */

package org.jfree.chart.event;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Stroke;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.event.MarkerChangeEvent;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.Plot;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MarkerChangeEvent_ESTest extends MarkerChangeEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Color color0 = (Color)Plot.DEFAULT_BACKGROUND_PAINT;
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      Stroke stroke0 = combinedDomainXYPlot0.getRangeMinorGridlineStroke();
      IntervalMarker intervalMarker0 = new IntervalMarker(260.24362, 260.24362, color0, stroke0, combinedDomainXYPlot0.DEFAULT_BACKGROUND_PAINT, combinedDomainXYPlot0.DEFAULT_GRIDLINE_STROKE, 0.0F);
      MarkerChangeEvent markerChangeEvent0 = new MarkerChangeEvent(intervalMarker0);
      IntervalMarker intervalMarker1 = (IntervalMarker)markerChangeEvent0.getMarker();
      assertEquals(260.24362, intervalMarker1.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MarkerChangeEvent markerChangeEvent0 = null;
      try {
        markerChangeEvent0 = new MarkerChangeEvent((Marker) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker((-184.1240665), (-184.1240665));
      MarkerChangeEvent markerChangeEvent0 = new MarkerChangeEvent(intervalMarker0);
      Marker marker0 = markerChangeEvent0.getMarker();
      assertSame(intervalMarker0, marker0);
  }
}