/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 22:28:57 GMT 2022
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JViewport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.axis.AxisState;
import org.jfree.chart.axis.CategoryAnchor;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.WaferMapRenderer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.general.WaferMapDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CategoryAxis3D_ESTest extends CategoryAxis3D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      CategoryAnchor categoryAnchor0 = combinedDomainCategoryPlot0.getDomainGridlinePosition();
      Rectangle rectangle0 = new Rectangle((-1), 590);
      rectangle0.add((double) 300, (double) 200);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      double double0 = categoryAxis3D0.getCategoryJava2DCoordinate(categoryAnchor0, 10, 20, rectangle0, rectangleEdge0);
      assertEquals(156.82894736842107, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      CategoryAnchor categoryAnchor0 = combinedDomainCategoryPlot0.getDomainGridlinePosition();
      Rectangle rectangle0 = new Rectangle((-1), 590);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      double double0 = categoryAxis3D0.getCategoryJava2DCoordinate(categoryAnchor0, 10, 20, rectangle0, rectangleEdge0);
      assertEquals((-0.5227631578947368), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(590, (-961));
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer((Integer) 10, (Integer) 10);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, waferMapRenderer0);
      JFreeChart jFreeChart0 = new JFreeChart("Anthony Boulestreau", categoryAxis3D0.DEFAULT_TICK_LABEL_FONT, waferMapPlot0, false);
      Rectangle rectangle0 = new Rectangle((-1), 590);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(300, 10);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      AxisState axisState0 = categoryAxis3D0.draw(sunGraphics2D0, 0, rectangle0, rectangle2D_Float0, rectangleEdge0, plotRenderingInfo0);
      assertEquals((-8355712), sunGraphics2D0.eargb);
      assertEquals((-6.0), axisState0.getCursor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("<OM");
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", true, (-2538), 0.2);
      CategoryAnchor categoryAnchor0 = categoryPointerAnnotation0.getCategoryAnchor();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      RectangleEdge rectangleEdge0 = combinedRangeCategoryPlot0.getRangeAxisEdge(0);
      // Undeclared exception!
      try { 
        categoryAxis3D0.getCategoryJava2DCoordinate(categoryAnchor0, (-2538), (-2538), (Rectangle2D) null, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.CategoryAxis3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", true, 0.001, 0.0);
      CategoryAnchor categoryAnchor0 = categoryPointerAnnotation0.getCategoryAnchor();
      GeneralPath generalPath0 = new GeneralPath();
      Rectangle2D rectangle2D0 = generalPath0.getBounds2D();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      RectangleEdge rectangleEdge0 = combinedDomainCategoryPlot0.getRangeAxisEdge();
      // Undeclared exception!
      try { 
        categoryAxis3D0.getCategoryJava2DCoordinate(categoryAnchor0, 2513, 2513, rectangle2D0, rectangleEdge0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid category index: 2513
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D((String) null);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      RectangleEdge rectangleEdge0 = combinedDomainCategoryPlot0.getDomainAxisEdge(906);
      CategoryAnchor categoryAnchor0 = CategoryAnchor.END;
      RoundRectangle2D.Double roundRectangle2D_Double0 = new RoundRectangle2D.Double();
      Rectangle2D rectangle2D0 = roundRectangle2D_Double0.getBounds2D();
      double double0 = categoryAxis3D0.getCategoryJava2DCoordinate(categoryAnchor0, 0, 0, rectangle2D0, rectangleEdge0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 2.5E7, (-254.17096828832223), 0.2);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      RectangleEdge rectangleEdge0 = combinedDomainCategoryPlot0.getRangeAxisEdge((-2115));
      double double0 = categoryAxis3D0.getCategoryJava2DCoordinate((CategoryAnchor) null, 1, 1, rectangle2D_Double0, rectangleEdge0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      CategoryAnchor categoryAnchor0 = CategoryAnchor.START;
      JViewport jViewport0 = new JViewport();
      Rectangle rectangle0 = jViewport0.getViewRect();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      RectangleEdge rectangleEdge0 = combinedDomainCategoryPlot0.getRangeAxisEdge((-235));
      double double0 = categoryAxis3D0.getCategoryJava2DCoordinate(categoryAnchor0, 352, 352, rectangle0, rectangleEdge0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(590, 10);
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer();
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, waferMapRenderer0);
      JFreeChart jFreeChart0 = new JFreeChart("Anthony Boulestreau", categoryAxis3D0.DEFAULT_TICK_LABEL_FONT, waferMapPlot0, false);
      Rectangle rectangle0 = new Rectangle(0, 590);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(300, 10);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      AxisState axisState0 = categoryAxis3D0.draw(sunGraphics2D0, 768, rectangle0, rectangle0, rectangleEdge0, plotRenderingInfo0);
      assertEquals((-8355712), sunGraphics2D0.pixel);
      assertEquals(762.0, axisState0.getCursor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(590, 10);
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer();
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, waferMapRenderer0);
      JFreeChart jFreeChart0 = new JFreeChart("Anthony Boulestreau", categoryAxis3D0.DEFAULT_TICK_LABEL_FONT, waferMapPlot0, false);
      Rectangle rectangle0 = new Rectangle(0, 590);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(300, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        categoryAxis3D0.draw(graphics2D0, 768, rectangle0, rectangle0, rectangleEdge0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.CategoryAxis3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      CategoryAxis3D categoryAxis3D1 = (CategoryAxis3D)categoryAxis3D0.clone();
      assertEquals(1, categoryAxis3D1.getMaximumCategoryLabelLines());
  }
}