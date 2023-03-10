/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:59:11 GMT 2022
 */

package org.jfree.chart.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.entity.LegendItemEntity;
import org.jfree.data.general.Dataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.MatrixSeries;
import org.jfree.data.xy.MatrixSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LegendItemEntity_ESTest extends LegendItemEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(rectangle0);
      MatrixSeries matrixSeries0 = new MatrixSeries("Requires 'ySamples' > 0", 2839, 0);
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection(matrixSeries0);
      legendItemEntity0.setDataset(matrixSeriesCollection0);
      Dataset dataset0 = legendItemEntity0.getDataset();
      assertSame(dataset0, matrixSeriesCollection0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LegendItemEntity legendItemEntity0 = null;
      try {
        legendItemEntity0 = new LegendItemEntity((Shape) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'area' argument.
         //
         verifyException("org.jfree.chart.entity.ChartEntity", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 0.0, 0.0, 0.0);
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(rectangle2D_Double0);
      LegendItemEntity legendItemEntity1 = new LegendItemEntity(line2D_Double0);
      HistogramDataset histogramDataset0 = new HistogramDataset();
      legendItemEntity1.setDataset(histogramDataset0);
      boolean boolean0 = legendItemEntity1.equals(legendItemEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(defaultCaret0);
      Object object0 = legendItemEntity0.clone();
      legendItemEntity0.setSeriesKey(0);
      boolean boolean0 = legendItemEntity0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(defaultCaret0);
      Object object0 = legendItemEntity0.clone();
      boolean boolean0 = legendItemEntity0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(defaultCaret0);
      boolean boolean0 = legendItemEntity0.equals(legendItemEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(defaultCaret0);
      boolean boolean0 = legendItemEntity0.equals(defaultCaret0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(defaultCaret0);
      String string0 = legendItemEntity0.toString();
      assertEquals("LegendItemEntity: seriesKey=null, dataset=null", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(defaultCaret0);
      Comparable comparable0 = legendItemEntity0.getSeriesKey();
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(defaultCaret0);
      legendItemEntity0.setSeriesKey(0);
      Comparable comparable0 = legendItemEntity0.getSeriesKey();
      assertEquals(0, comparable0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(defaultCaret0);
      Dataset dataset0 = legendItemEntity0.getDataset();
      assertNull(dataset0);
  }
}
