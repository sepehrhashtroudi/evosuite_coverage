/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:11:17 GMT 2022
 */

package org.jfree.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.CenterArrangement;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.ClusteredXYBarRenderer;
import org.jfree.chart.renderer.xy.GradientXYBarPainter;
import org.jfree.chart.renderer.xy.StackedXYBarRenderer;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.chart.title.CompositeTitle;
import org.jfree.chart.title.Title;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GradientXYBarPainter_ESTest extends GradientXYBarPainter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter((-1.0), (-1.0), (-1.0));
      GradientXYBarPainter gradientXYBarPainter1 = new GradientXYBarPainter((-1.0), (-808.0), (-1.0));
      boolean boolean0 = gradientXYBarPainter0.equals(gradientXYBarPainter1);
      assertFalse(boolean0);
      assertFalse(gradientXYBarPainter1.equals((Object)gradientXYBarPainter0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter();
      GradientXYBarPainter gradientXYBarPainter1 = new GradientXYBarPainter(286.62331524641, 286.62331524641, 286.62331524641);
      boolean boolean0 = gradientXYBarPainter0.equals(gradientXYBarPainter1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter();
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer((-3735.92), true);
      PiePlot3D piePlot3D0 = new PiePlot3D();
      JFreeChart jFreeChart0 = new JFreeChart("SJ6V^Kp3", piePlot3D0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, (-2763), 0, (-2763), 0, 0, 0, false, true, false, false, true, true, false);
      Dimension dimension0 = new Dimension(10, 420);
      Rectangle rectangle0 = new Rectangle(dimension0);
      Rectangle rectangle1 = chartPanel0.getBounds(rectangle0);
      Rectangle2D rectangle2D0 = piePlot3D0.DEFAULT_INSETS.createInsetRectangle((Rectangle2D) rectangle1);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      // Undeclared exception!
      try { 
        gradientXYBarPainter0.paintBar((Graphics2D) null, clusteredXYBarRenderer0, (-2763), 3, true, rectangle2D0, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.GradientXYBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter();
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer((-3735.92), true);
      PiePlot3D piePlot3D0 = new PiePlot3D();
      Dimension dimension0 = new Dimension(10, 420);
      Rectangle rectangle0 = new Rectangle(dimension0);
      Rectangle2D rectangle2D0 = piePlot3D0.DEFAULT_INSETS.createInsetRectangle((Rectangle2D) rectangle0);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      // Undeclared exception!
      try { 
        gradientXYBarPainter0.paintBar((Graphics2D) null, clusteredXYBarRenderer0, (-2763), 3, true, rectangle2D0, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.GradientXYBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter();
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer((-3735.92), true);
      PiePlot3D piePlot3D0 = new PiePlot3D();
      JFreeChart jFreeChart0 = new JFreeChart("SJ6V^Kp3", piePlot3D0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, (-2763), 0, (-2763), 0, 0, 0, false, true, false, false, true, true, false);
      Dimension dimension0 = new Dimension(10, 420);
      Rectangle rectangle0 = new Rectangle(dimension0);
      Rectangle rectangle1 = chartPanel0.getBounds(rectangle0);
      Rectangle2D rectangle2D0 = piePlot3D0.DEFAULT_INSETS.createInsetRectangle((Rectangle2D) rectangle1);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge();
      // Undeclared exception!
      try { 
        gradientXYBarPainter0.paintBar((Graphics2D) null, clusteredXYBarRenderer0, (-2763), 3, true, rectangle2D0, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.GradientXYBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter(0L, 0L, 0L);
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImageRenderingSource0.createGraphics2D();
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(701.3057F, 1, (-2108.549F), 701.3057F);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      gradientXYBarPainter0.paintBarShadow(sunGraphics2D0, stackedXYBarRenderer0, 2019, 0, false, rectangle2D_Float0, rectangleEdge0, false);
      assertEquals((-8355712), sunGraphics2D0.pixel);
      assertEquals((-8355712), sunGraphics2D0.eargb);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter();
      PiePlot3D piePlot3D0 = new PiePlot3D();
      Dimension dimension0 = new Dimension(10, 420);
      Rectangle rectangle0 = new Rectangle(dimension0);
      Rectangle2D rectangle2D0 = piePlot3D0.DEFAULT_INSETS.createInsetRectangle((Rectangle2D) rectangle0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge();
      XYBarRenderer xYBarRenderer0 = new XYBarRenderer();
      // Undeclared exception!
      try { 
        gradientXYBarPainter0.paintBarShadow((Graphics2D) null, xYBarRenderer0, (-1073741824), 0, true, rectangle2D0, rectangleEdge0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.GradientXYBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter();
      XYBarRenderer xYBarRenderer0 = new XYBarRenderer();
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      CategoryPlot categoryPlot0 = new CategoryPlot();
      RectangleEdge rectangleEdge0 = categoryPlot0.getDomainAxisEdge();
      arc2D_Double0.x = 2861.65669832;
      // Undeclared exception!
      try { 
        gradientXYBarPainter0.paintBarShadow((Graphics2D) null, xYBarRenderer0, (-1079), 0, true, arc2D_Double0, rectangleEdge0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.GradientXYBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter();
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer();
      RoundRectangle2D.Double roundRectangle2D_Double0 = new RoundRectangle2D.Double(0.1, (-2267.635558204121), (-680.8215056187), 2383.8666350407902, (-680.8215056187), (-3039.764646369324));
      CenterArrangement centerArrangement0 = new CenterArrangement();
      BlockContainer blockContainer0 = new BlockContainer(centerArrangement0);
      CompositeTitle compositeTitle0 = new CompositeTitle(blockContainer0);
      // Undeclared exception!
      try { 
        gradientXYBarPainter0.paintBarShadow((Graphics2D) null, stackedXYBarRenderer0, 1903, 1903, true, roundRectangle2D_Double0, compositeTitle0.DEFAULT_POSITION, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.GradientXYBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter();
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImageRenderingSource0.createGraphics2D();
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(701.3057F, 1, (-2108.549F), 0.0F);
      RectangleEdge rectangleEdge0 = Title.DEFAULT_POSITION;
      gradientXYBarPainter0.paintBarShadow(sunGraphics2D0, stackedXYBarRenderer0, (-1157), 1, false, rectangle2D_Float0, rectangleEdge0, true);
      assertEquals((-8355712), sunGraphics2D0.pixel);
      assertEquals((-8355712), sunGraphics2D0.eargb);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter();
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer((-3735.92), true);
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)clusteredXYBarRenderer0.lookupLegendShape(1024);
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      NumberAxis numberAxis0 = new NumberAxis("ZOOM_IN_DOMAIN");
      XYPlot xYPlot0 = new XYPlot(defaultTableXYDataset0, numberAxis0, numberAxis0, clusteredXYBarRenderer0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge();
      // Undeclared exception!
      try { 
        gradientXYBarPainter0.paintBar((Graphics2D) null, clusteredXYBarRenderer0, (-2763), 3, true, rectangle2D_Double0, rectangleEdge0);
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
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter();
      GradientXYBarPainter gradientXYBarPainter1 = new GradientXYBarPainter();
      boolean boolean0 = gradientXYBarPainter0.equals(gradientXYBarPainter1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter(4704.3, (-42.751067), 4704.3);
      GradientXYBarPainter gradientXYBarPainter1 = new GradientXYBarPainter((-836.7741329276221), 0.0, (-836.7741329276221));
      boolean boolean0 = gradientXYBarPainter0.equals(gradientXYBarPainter1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter((-1049.56), (-1049.56), (-1049.56));
      GradientXYBarPainter gradientXYBarPainter1 = new GradientXYBarPainter((-1049.56), (-144.0958908), 1.0);
      boolean boolean0 = gradientXYBarPainter0.equals(gradientXYBarPainter1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter();
      boolean boolean0 = gradientXYBarPainter0.equals(gradientXYBarPainter0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter(0L, (-201.44277), 0.8);
      boolean boolean0 = gradientXYBarPainter0.equals(fileSystemHandling0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter(5.0E-9, 2.5E11, 2.5E11);
      XYBarRenderer xYBarRenderer0 = new XYBarRenderer((-234.768211263812));
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      // Undeclared exception!
      try { 
        gradientXYBarPainter0.paintBarShadow((Graphics2D) null, xYBarRenderer0, 0, 0, true, rectangle0, rectangleEdge0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.GradientXYBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter(5.0E-9, 2.5E11, 2.5E11);
      XYBarRenderer xYBarRenderer0 = new XYBarRenderer((-234.768211263812));
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      // Undeclared exception!
      try { 
        gradientXYBarPainter0.paintBarShadow((Graphics2D) null, xYBarRenderer0, 0, 0, false, rectangle0, rectangleEdge0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.GradientXYBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter(225.0, 225.0, 225.0);
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      PiePlot piePlot0 = new PiePlot(defaultKeyedValuesDataset0);
      JFreeChart jFreeChart0 = new JFreeChart(piePlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer();
      RoundRectangle2D.Double roundRectangle2D_Double0 = new RoundRectangle2D.Double();
      gradientXYBarPainter0.paintBarShadow(sunGraphics2D0, stackedXYBarRenderer0, 10, 10, false, roundRectangle2D_Double0, (RectangleEdge) null, true);
      assertEquals((-8355712), sunGraphics2D0.eargb);
      assertEquals((-8355712), sunGraphics2D0.pixel);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter(0L, (-201.44277), 0.8);
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImageRenderingSource0.createGraphics2D();
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(701.3057F, 1, (-2108.549F), 0.0F);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      gradientXYBarPainter0.paintBarShadow(sunGraphics2D0, stackedXYBarRenderer0, (-1157), 1, false, rectangle2D_Float0, rectangleEdge0, true);
      assertEquals((-8355712), sunGraphics2D0.eargb);
      assertEquals((-8355712), sunGraphics2D0.pixel);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter();
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
      gradientXYBarPainter0.paintBar((Graphics2D) null, stackedXYBarRenderer0, 79, (-2098399504), false, rectangle2D_Float0, (RectangleEdge) null);
      assertEquals(0.0, stackedXYBarRenderer0.getMargin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter();
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer();
      RoundRectangle2D.Double roundRectangle2D_Double0 = new RoundRectangle2D.Double(0.1, 1903, 0.1, (double) stackedXYBarRenderer0.ZERO, 1903, (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      // Undeclared exception!
      try { 
        gradientXYBarPainter0.paintBar((Graphics2D) null, stackedXYBarRenderer0, 1903, 1903, true, roundRectangle2D_Double0, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.GradientXYBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter(225.0, 225.0, 225.0);
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      PiePlot piePlot0 = new PiePlot(defaultKeyedValuesDataset0);
      JFreeChart jFreeChart0 = new JFreeChart(piePlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer();
      CompositeTitle compositeTitle0 = new CompositeTitle();
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)compositeTitle0.getBounds();
      gradientXYBarPainter0.paintBar(sunGraphics2D0, stackedXYBarRenderer0, (-951), 420, false, rectangle2D_Float0, compositeTitle0.DEFAULT_POSITION);
      assertEquals(2, sunGraphics2D0.paintState);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter(0L, (-201.44277), 0.8);
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImageRenderingSource0.createGraphics2D();
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(701.3057F, 1, (-2108.549F), 0.0F);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      gradientXYBarPainter0.paintBar(sunGraphics2D0, stackedXYBarRenderer0, 1, (-4722), false, rectangle2D_Float0, rectangleEdge0);
      assertEquals(2, sunGraphics2D0.paintState);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GradientXYBarPainter gradientXYBarPainter0 = new GradientXYBarPainter((-1049.56), (-1049.56), (-1049.56));
      gradientXYBarPainter0.hashCode();
  }
}
