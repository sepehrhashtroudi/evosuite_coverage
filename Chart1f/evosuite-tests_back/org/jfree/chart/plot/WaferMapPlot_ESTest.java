/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 01:16:45 GMT 2022
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.math.BigInteger;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.WaferMapRenderer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.data.general.WaferMapDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WaferMapPlot_ESTest extends WaferMapPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot((WaferMapDataset) null, (WaferMapRenderer) null);
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.JFreeChart", waferMapPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      Rectangle rectangle0 = new Rectangle(0, 1, (-1), 0);
      waferMapPlot0.drawWaferEdge(graphics2D0, rectangle0);
      assertTrue(waferMapPlot0.isOutlineVisible());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Rectangle2D rectangle2D0 = waferMapPlot0.DEFAULT_INSETS.createOutsetRectangle((Rectangle2D) rectangle2D_Double0);
      Ellipse2D ellipse2D0 = waferMapPlot0.getWaferEdge(rectangle2D0);
      assertEquals(4.0, ellipse2D0.getMaxY(), 0.01);
      assertEquals(4.0, ellipse2D0.getMaxX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      Rectangle rectangle0 = new Rectangle(10, 0);
      Ellipse2D.Double ellipse2D_Double0 = (Ellipse2D.Double)waferMapPlot0.getWaferEdge(rectangle0);
      assertEquals(5.0, ellipse2D_Double0.getMaxX(), 0.01);
      assertEquals(0.0, ellipse2D_Double0.width, 0.01);
      assertEquals(0.0, ellipse2D_Double0.height, 0.01);
      assertEquals(0.0, ellipse2D_Double0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      Rectangle rectangle0 = new Rectangle(10, (-2262));
      rectangle0.add((-2262), 35);
      Ellipse2D.Double ellipse2D_Double0 = (Ellipse2D.Double)waferMapPlot0.getWaferEdge(rectangle0);
      assertEquals((-2262.0), ellipse2D_Double0.getMaxX(), 0.01);
      assertEquals(35.0, ellipse2D_Double0.getCenterY(), 0.01);
      assertEquals(0.0, ellipse2D_Double0.height, 0.01);
      assertEquals(0.0, ellipse2D_Double0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(252, 252);
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer(252, 27);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, waferMapRenderer0);
      JInternalFrame jInternalFrame0 = new JInternalFrame("", false, false);
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      Ellipse2D.Double ellipse2D_Double0 = (Ellipse2D.Double)waferMapPlot0.getWaferEdge(rectangle0);
      assertEquals(0.0, ellipse2D_Double0.y, 0.01);
      assertEquals(0.0, ellipse2D_Double0.x, 0.01);
      assertEquals(0.0, ellipse2D_Double0.width, 0.01);
      assertEquals(0.0, ellipse2D_Double0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      Rectangle rectangle0 = new Rectangle(10, (-2262));
      Ellipse2D.Double ellipse2D_Double0 = (Ellipse2D.Double)waferMapPlot0.getWaferEdge(rectangle0);
      assertEquals((-1126.0), ellipse2D_Double0.getMaxX(), 0.01);
      assertEquals((-1131.0), ellipse2D_Double0.getCenterY(), 0.01);
      assertEquals(0.0, ellipse2D_Double0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      WaferMapDataset waferMapDataset0 = new WaferMapDataset((-676), (-676), bigInteger0);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, (WaferMapRenderer) null);
      WaferMapDataset waferMapDataset1 = waferMapPlot0.getDataset();
      assertSame(waferMapDataset0, waferMapDataset1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(0, 0);
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer(integer0, integer0);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, waferMapRenderer0);
      WaferMapDataset waferMapDataset1 = waferMapPlot0.getDataset();
      assertSame(waferMapDataset1, waferMapDataset0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Short short0 = new Short((short) (-1));
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(1476, 1476, short0);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      WaferMapDataset waferMapDataset1 = waferMapPlot0.getDataset();
      assertSame(waferMapDataset0, waferMapDataset1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer();
      // Undeclared exception!
      try { 
        waferMapPlot0.setRenderer(waferMapRenderer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.WaferMapRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      // Undeclared exception!
      try { 
        waferMapPlot0.getWaferEdge((Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.WaferMapPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(709, 0);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      // Undeclared exception!
      try { 
        waferMapPlot0.drawWaferEdge((Graphics2D) null, (Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.WaferMapPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      WaferMapDataset waferMapDataset0 = waferMapPlot0.getDataset();
      assertNull(waferMapDataset0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot((WaferMapDataset) null, (WaferMapRenderer) null);
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.JFreeChart", waferMapPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      waferMapPlot0.drawWaferEdge(graphics2D0, rectangle0);
      assertEquals(0.5F, waferMapPlot0.getBackgroundImageAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot((WaferMapDataset) null, (WaferMapRenderer) null);
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.JFreeChart", waferMapPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(10, 350.0F, Float.NEGATIVE_INFINITY, (-636.9369F));
      // Undeclared exception!
      try { 
        waferMapPlot0.drawChipGrid(graphics2D0, rectangle2D_Float0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.WaferMapPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot((WaferMapDataset) null, (WaferMapRenderer) null);
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.JFreeChart", waferMapPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(10, 350.0F, 0, (-636.9369F));
      // Undeclared exception!
      try { 
        waferMapPlot0.drawChipGrid(graphics2D0, rectangle2D_Float0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.WaferMapPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot((WaferMapDataset) null, (WaferMapRenderer) null);
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.JFreeChart", waferMapPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      // Undeclared exception!
      try { 
        waferMapPlot0.drawChipGrid(graphics2D0, rectangle2D_Float0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.WaferMapPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      Point point0 = new Point(10, 15);
      Dimension dimension0 = new Dimension(15, (-1968526677));
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.NO_CHANGE;
      Rectangle2D rectangle2D0 = waferMapPlot0.DEFAULT_INSETS.createAdjustedRectangle(rectangle0, lengthAdjustmentType0, lengthAdjustmentType0);
      Rectangle2D rectangle2D1 = waferMapPlot0.DEFAULT_INSETS.createInsetRectangle(rectangle2D0);
      PlotState plotState0 = new PlotState();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      waferMapPlot0.draw((Graphics2D) null, rectangle2D1, point0, plotState0, plotRenderingInfo0);
      assertEquals(10.0, point0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      waferMapPlot0.setRenderer((WaferMapRenderer) null);
      assertFalse(waferMapPlot0.isSubplot());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(0, 0);
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer(integer0, integer0);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, waferMapRenderer0);
      waferMapPlot0.setRenderer(waferMapRenderer0);
      assertEquals(10, Plot.MINIMUM_HEIGHT_TO_DRAW);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      waferMapPlot0.setDataset((WaferMapDataset) null);
      assertEquals(1.0F, Plot.DEFAULT_BACKGROUND_ALPHA, 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset((-1583), 207);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      waferMapPlot0.setDataset(waferMapDataset0);
      assertTrue(waferMapPlot0.isOutlineVisible());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Integer integer0 = new Integer(822);
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer(integer0, integer0);
      WaferMapPlot waferMapPlot0 = null;
      try {
        waferMapPlot0 = new WaferMapPlot((WaferMapDataset) null, waferMapRenderer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.WaferMapRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset((-1583), 207);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      RendererChangeEvent rendererChangeEvent0 = new RendererChangeEvent(waferMapDataset0);
      waferMapPlot0.rendererChanged(rendererChangeEvent0);
      assertFalse(WaferMapPlot.DEFAULT_CROSSHAIR_VISIBLE);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset((-1583), 207);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      String string0 = waferMapPlot0.getPlotType();
      assertEquals("WMAP_Plot", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset((-1583), 207);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      // Undeclared exception!
      try { 
        waferMapPlot0.getLegendItems();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.WaferMapPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset((-1583), 207);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer();
      waferMapPlot0.setRenderer(waferMapRenderer0);
      LegendItemCollection legendItemCollection0 = waferMapPlot0.getLegendItems();
      assertEquals(0, legendItemCollection0.getItemCount());
  }
}
