/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 02:19:23 GMT 2022
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.sql.Connection;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.table.JTableHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.DefaultDrawingSupplier;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StatisticalLineAndShapeRenderer_ESTest extends StatisticalLineAndShapeRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Panel panel0 = new Panel();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      JScrollPane jScrollPane0 = new JScrollPane(panel0);
      JViewport jViewport0 = jScrollPane0.getViewport();
      Rectangle rectangle0 = jViewport0.getViewRect();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      ModuloAxis moduloAxis0 = new ModuloAxis("", (Range) null);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.drawItem((Graphics2D) null, categoryStepRenderer_State0, rectangle0, (CategoryPlot) null, categoryAxis0, moduloAxis0, defaultStatisticalCategoryDataset0, 133, (-2479), false, 10);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 133, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = categoryStepRenderer0.createState(plotRenderingInfo0);
      JTable jTable0 = new JTable();
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      Rectangle rectangle0 = jTableHeader0.getHeaderRect((-2346));
      CategoryPlot categoryPlot0 = new CategoryPlot();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      statisticalLineAndShapeRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, rectangle0, categoryPlot0, categoryAxis0, (ValueAxis) null, (CategoryDataset) null, 5, 0, false, (-327));
      assertEquals(2.0, statisticalLineAndShapeRenderer0.getItemLabelAnchorOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      BasicStroke basicStroke0 = (BasicStroke)Axis.DEFAULT_TICK_MARK_STROKE;
      statisticalLineAndShapeRenderer0.setErrorIndicatorStroke(basicStroke0);
      Stroke stroke0 = statisticalLineAndShapeRenderer0.getErrorIndicatorStroke();
      assertSame(stroke0, basicStroke0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer();
      Paint paint0 = candlestickRenderer0.getBaseFillPaint();
      statisticalLineAndShapeRenderer0.setErrorIndicatorPaint(paint0);
      Color color0 = (Color)statisticalLineAndShapeRenderer0.getErrorIndicatorPaint();
      assertEquals(255, color0.getRed());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Number[][] numberArray0 = new Number[0][5];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      DateAxis dateAxis0 = new DateAxis("D 6AS'v kY}xzs");
      defaultCategoryDataset0.addValue(1815.12521921169, (Comparable) dateAxis0.DEFAULT_DATE_TICK_UNIT, (Comparable) 500);
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds(defaultCategoryDataset0);
      assertEquals(1815.12521921169, range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      jDBCCategoryDataset0.addValue((Number) statisticalLineAndShapeRenderer0.ZERO, (Comparable) statisticalLineAndShapeRenderer0.ZERO, (Comparable) statisticalLineAndShapeRenderer0.ZERO);
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds(jDBCCategoryDataset0);
      assertEquals(0.0, range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 3.0;
      doubleArray0[0] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
      assertEquals(0.0, range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      double[][] doubleArray0 = new double[6][7];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (-578.06);
      doubleArray0[0] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
      assertEquals((-289.03), range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, false);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(1.0, (-2065.20345239), (Comparable) statisticalLineAndShapeRenderer0.ZERO, (Comparable) statisticalLineAndShapeRenderer0.ZERO);
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.findRangeBounds(defaultStatisticalCategoryDataset0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (2066.20345239) <= upper (-2064.20345239).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Number[][] numberArray0 = new Number[2][2];
      Number[] numberArray1 = new Number[7];
      numberArray0[0] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)AbstractRenderer.DEFAULT_SHAPE;
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1083.2388877781), (-1.0), "");
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.drawItem((Graphics2D) null, (CategoryItemRendererState) null, rectangle0, combinedDomainCategoryPlot0, extendedCategoryAxis0, cyclicNumberAxis0, defaultStatisticalCategoryDataset0, 10, (-3945), true, 1497);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      DefaultDrawingSupplier defaultDrawingSupplier0 = new DefaultDrawingSupplier();
      Stroke stroke0 = defaultDrawingSupplier0.getNextStroke();
      statisticalLineAndShapeRenderer0.setErrorIndicatorStroke(stroke0);
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer1 = new StatisticalLineAndShapeRenderer(false, false);
      boolean boolean0 = statisticalLineAndShapeRenderer1.equals(statisticalLineAndShapeRenderer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Object object0 = statisticalLineAndShapeRenderer0.clone();
      assertTrue(object0.equals((Object)statisticalLineAndShapeRenderer0));
      
      statisticalLineAndShapeRenderer0.setErrorIndicatorPaint(((AbstractRenderer) object0).DEFAULT_OUTLINE_PAINT);
      boolean boolean0 = statisticalLineAndShapeRenderer0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer1 = new StatisticalLineAndShapeRenderer(false, false);
      boolean boolean0 = statisticalLineAndShapeRenderer1.equals(statisticalLineAndShapeRenderer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      boolean boolean0 = statisticalLineAndShapeRenderer0.equals(statisticalLineAndShapeRenderer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      boolean boolean0 = statisticalLineAndShapeRenderer0.equals(defaultStatisticalCategoryDataset0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, false);
      Paint paint0 = statisticalLineAndShapeRenderer0.getErrorIndicatorPaint();
      assertNull(paint0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Stroke stroke0 = statisticalLineAndShapeRenderer0.getErrorIndicatorStroke();
      assertNull(stroke0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      String[] stringArray0 = new String[8];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      statisticalLineAndShapeRenderer0.hashCode();
  }
}
