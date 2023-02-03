/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 02:11:39 GMT 2022
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.jdbc.JDBCXYDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LayeredBarRenderer_ESTest extends LayeredBarRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("Fsc; #'y_Wiz;");
      NumberAxis numberAxis0 = new NumberAxis();
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultBoxAndWhiskerCategoryDataset0, categoryAxis3D0, numberAxis0, layeredBarRenderer0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      rectangle2D_Float0.setFrame((double) 1.0F, (double) 0.0F, 1.0E-8, 551.40661403);
      // Undeclared exception!
      try { 
        layeredBarRenderer0.calculateBarWidth(categoryPlot0, rectangle2D_Float0, defaultBoxAndWhiskerCategoryDataset0, (CategoryItemRendererState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.LayeredBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      layeredBarRenderer0.setSeriesBarWidth(0, 0);
      double double0 = layeredBarRenderer0.getSeriesBarWidth(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      Rectangle2D rectangle2D0 = chartRenderingInfo0.getChartArea();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("Index ");
      PeriodAxis periodAxis0 = new PeriodAxis("Index ");
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawVerticalItem((Graphics2D) null, (CategoryItemRendererState) null, rectangle2D0, categoryPlot0, extendedCategoryAxis0, periodAxis0, (CategoryDataset) null, (-2808), 500, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.LayeredBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset((Connection) null);
      NumberAxis3D numberAxis3D0 = new NumberAxis3D(">]b+`@nD2nE{_");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((double) layeredBarRenderer0.ZERO, "");
      XYLineAndShapeRenderer xYLineAndShapeRenderer0 = new XYLineAndShapeRenderer(false, true);
      XYPlot xYPlot0 = new XYPlot(jDBCXYDataset0, numberAxis3D0, cyclicNumberAxis0, xYLineAndShapeRenderer0);
      JFreeChart jFreeChart0 = new JFreeChart("IL]_ ", layeredBarRenderer0.DEFAULT_VALUE_LABEL_FONT, xYPlot0, true);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(57, 500);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      AffineTransformOp affineTransformOp0 = new AffineTransformOp(((SunGraphics2D) graphics2D0).transform, ((SunGraphics2D) graphics2D0).hints);
      Rectangle2D rectangle2D0 = affineTransformOp0.getBounds2D(bufferedImage0);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawVerticalItem(graphics2D0, categoryStepRenderer_State0, rectangle2D0, combinedDomainCategoryPlot0, categoryAxis0, numberAxis3D0, defaultMultiValueCategoryDataset0, 0, 500, true);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset((Connection) null);
      NumberAxis3D numberAxis3D0 = new NumberAxis3D(">]b+`@nD2nE{_");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((double) layeredBarRenderer0.ZERO, "");
      XYLineAndShapeRenderer xYLineAndShapeRenderer0 = new XYLineAndShapeRenderer(false, true);
      XYPlot xYPlot0 = new XYPlot(jDBCXYDataset0, numberAxis3D0, cyclicNumberAxis0, xYLineAndShapeRenderer0);
      JFreeChart jFreeChart0 = new JFreeChart("IL]_ ", layeredBarRenderer0.DEFAULT_VALUE_LABEL_FONT, xYPlot0, true);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(57, 500);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      AffineTransformOp affineTransformOp0 = new AffineTransformOp(((SunGraphics2D) graphics2D0).transform, ((SunGraphics2D) graphics2D0).hints);
      Rectangle2D rectangle2D0 = affineTransformOp0.getBounds2D(bufferedImage0);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawVerticalItem(graphics2D0, categoryStepRenderer_State0, rectangle2D0, combinedDomainCategoryPlot0, categoryAxis0, numberAxis3D0, defaultMultiValueCategoryDataset0, (-11), 500, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      RingPlot ringPlot0 = new RingPlot();
      JFreeChart jFreeChart0 = new JFreeChart(ringPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 1.0, 3822.5355283697, (ChartRenderingInfo) null);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = new CategoryItemRendererState(plotRenderingInfo0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(cyclicNumberAxis0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      double[][] doubleArray0 = new double[5][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawItem(graphics2D0, categoryItemRendererState0, (Rectangle2D) null, combinedRangeCategoryPlot0, subCategoryAxis0, cyclicNumberAxis0, defaultIntervalCategoryDataset0, 10, 15, true, 2747);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.getValue(): series index out of range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("^t~n#");
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawHorizontalItem((Graphics2D) null, categoryStepRenderer_State0, (Rectangle2D) null, categoryPlot0, categoryAxis0, numberAxis3D0, taskSeriesCollection0, 0, (-1624), false);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("#=%^:uP T?}CU!XtkE&", categoryPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 0, 0, 244, 0, 0, (-969), true, false, false, false, true, false, false);
      Rectangle2D rectangle2D0 = chartPanel0.getScreenDataArea();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = categoryStepRenderer0.createState(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        layeredBarRenderer0.calculateBarWidth(categoryPlot0, rectangle2D0, jDBCCategoryDataset0, categoryItemRendererState0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("");
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawItem((Graphics2D) null, categoryStepRenderer_State0, (Rectangle2D) null, categoryPlot0, categoryAxis0, numberAxis3D0, taskSeriesCollection0, 4023, (-978), false, (-1624));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4023, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      Rectangle2D rectangle2D0 = chartRenderingInfo0.getChartArea();
      layeredBarRenderer0.calculateBarWidth(categoryPlot0, rectangle2D0, (CategoryDataset) null, (CategoryItemRendererState) null);
      assertTrue(layeredBarRenderer0.getBaseSeriesVisible());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      layeredBarRenderer0.setSeriesBarWidth(22, 22);
      double double0 = layeredBarRenderer0.getSeriesBarWidth(22);
      assertEquals(22.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      double double0 = layeredBarRenderer0.getSeriesBarWidth(2361);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      // Undeclared exception!
      try { 
        layeredBarRenderer0.setSeriesBarWidth((-481), Double.NaN);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}
