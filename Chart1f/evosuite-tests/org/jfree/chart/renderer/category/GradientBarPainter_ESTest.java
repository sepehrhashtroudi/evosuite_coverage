/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 02:26:35 GMT 2022
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.LookupOp;
import java.awt.image.ShortLookupTable;
import java.text.AttributedCharacterIterator;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import javax.swing.JInternalFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GradientBarPainter;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.IntervalBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.Title;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.UnitType;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GradientBarPainter_ESTest extends GradientBarPainter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter((-253.71), 2000000.0, (-253.71));
      GradientBarPainter gradientBarPainter1 = new GradientBarPainter();
      boolean boolean0 = gradientBarPainter0.equals(gradientBarPainter1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      JFreeChart jFreeChart0 = new JFreeChart(thermometerPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 912);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      short[] shortArray0 = new short[7];
      ShortLookupTable shortLookupTable0 = new ShortLookupTable(2, shortArray0);
      LookupOp lookupOp0 = new LookupOp(shortLookupTable0, (RenderingHints) null);
      Rectangle rectangle0 = (Rectangle)lookupOp0.getBounds2D(bufferedImage0);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      gradientBarPainter0.paintBar(sunGraphics2D0, statisticalBarRenderer0, (-60), 295, false, rectangle0, rectangleEdge0);
      assertEquals(2, sunGraphics2D0.paintState);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter((-135.2372534987143), (-135.2372534987143), (-135.2372534987143));
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StringCharacterIterator stringCharacterIterator0 = new StringCharacterIterator("Requires p > 0.", 0);
      AffineTransform affineTransform0 = AffineTransform.getQuadrantRotateInstance(419, (double) statisticalBarRenderer0.ZERO, (double) 419);
      FontRenderContext fontRenderContext0 = new FontRenderContext(affineTransform0, false, false);
      Rectangle2D rectangle2D0 = statisticalBarRenderer0.DEFAULT_VALUE_LABEL_FONT.getStringBounds((CharacterIterator) stringCharacterIterator0, 0, 3, fontRenderContext0);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      // Undeclared exception!
      try { 
        gradientBarPainter0.paintBar((Graphics2D) null, statisticalBarRenderer0, (-1764), (-1764), true, rectangle2D0, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.GradientBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      JFreeChart jFreeChart0 = new JFreeChart(thermometerPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 921);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      Rectangle rectangle0 = new Rectangle(0, 0);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      RectangleEdge rectangleEdge0 = combinedRangeCategoryPlot0.getDomainAxisEdge(1);
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      gradientBarPainter0.paintBar(sunGraphics2D0, ganttRenderer0, (short)62, 2285, false, rectangle0, rectangleEdge0);
      assertEquals(2, sunGraphics2D0.paintState);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter(0.580276463893942, (-213.5), (-213.5));
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      JFreeChart jFreeChart0 = new JFreeChart(thermometerPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 921);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      short[] shortArray0 = new short[7];
      ShortLookupTable shortLookupTable0 = new ShortLookupTable(2, shortArray0);
      LookupOp lookupOp0 = new LookupOp(shortLookupTable0, (RenderingHints) null);
      Rectangle2D rectangle2D0 = lookupOp0.getBounds2D(bufferedImage0);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      RectangleEdge rectangleEdge0 = combinedRangeCategoryPlot0.getDomainAxisEdge(1);
      gradientBarPainter0.paintBar(graphics2D0, statisticalBarRenderer0, (-60), 295, false, rectangle2D0, rectangleEdge0);
      assertFalse(statisticalBarRenderer0.isDrawBarOutline());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(15, 1637.2617F, 10, (-1877.04F), Float.POSITIVE_INFINITY, 0.0F, 1);
      String[] stringArray0 = new String[0];
      SymbolAxis symbolAxis0 = new SymbolAxis("4Jg", stringArray0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(symbolAxis0);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge();
      // Undeclared exception!
      try { 
        gradientBarPainter0.paintBarShadow((Graphics2D) null, groupedStackedBarRenderer0, 15, 0, true, arc2D_Float0, rectangleEdge0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.GradientBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter((-135.2372534987143), (-135.2372534987143), (-135.2372534987143));
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      UnitType unitType0 = UnitType.ABSOLUTE;
      RectangleInsets rectangleInsets0 = new RectangleInsets(unitType0, (-135.2372534987143), 2500000.0, 350.36, 419);
      StringCharacterIterator stringCharacterIterator0 = new StringCharacterIterator("Requires p > 0.", 0);
      AffineTransform affineTransform0 = AffineTransform.getQuadrantRotateInstance(419, (double) statisticalBarRenderer0.ZERO, (double) 419);
      FontRenderContext fontRenderContext0 = new FontRenderContext(affineTransform0, false, false);
      Rectangle2D rectangle2D0 = statisticalBarRenderer0.DEFAULT_VALUE_LABEL_FONT.getStringBounds((CharacterIterator) stringCharacterIterator0, 0, 0, fontRenderContext0);
      Rectangle2D rectangle2D1 = rectangleInsets0.createInsetRectangle(rectangle2D0);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      // Undeclared exception!
      try { 
        gradientBarPainter0.paintBarShadow((Graphics2D) null, statisticalBarRenderer0, 419, 419, true, rectangle2D1, rectangleEdge0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.GradientBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter(0.0, (-213.5), (-213.5));
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      JFreeChart jFreeChart0 = new JFreeChart(thermometerPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 921);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      short[] shortArray0 = new short[7];
      sunGraphics2D0.strokeHint = (int) (short) (-221);
      ShortLookupTable shortLookupTable0 = new ShortLookupTable(2, shortArray0);
      LookupOp lookupOp0 = new LookupOp(shortLookupTable0, (RenderingHints) null);
      Rectangle rectangle0 = (Rectangle)lookupOp0.getBounds2D(bufferedImage0);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      RectangleEdge rectangleEdge0 = combinedRangeCategoryPlot0.getDomainAxisEdge(1);
      // Undeclared exception!
      try { 
        gradientBarPainter0.paintBar(sunGraphics2D0, statisticalBarRenderer0, (-60), 295, false, rectangle0, rectangleEdge0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      GradientBarPainter gradientBarPainter1 = new GradientBarPainter(0.0, 0.0, 0.0);
      boolean boolean0 = gradientBarPainter0.equals(gradientBarPainter1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      GradientBarPainter gradientBarPainter1 = new GradientBarPainter();
      boolean boolean0 = gradientBarPainter0.equals(gradientBarPainter1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      boolean boolean0 = gradientBarPainter0.equals(gradientBarPainter0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = AttributedCharacterIterator.Attribute.LANGUAGE;
      boolean boolean0 = gradientBarPainter0.equals(attributedCharacterIterator_Attribute0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter(0.0, 0.0, 0.0);
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(0.0, 0.7712088460762058);
      RectangleInsets rectangleInsets0 = Title.DEFAULT_PADDING;
      JInternalFrame jInternalFrame0 = new JInternalFrame();
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      Rectangle2D rectangle2D0 = rectangleInsets0.createOutsetRectangle((Rectangle2D) rectangle0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge(0);
      // Undeclared exception!
      try { 
        gradientBarPainter0.paintBarShadow((Graphics2D) null, barRenderer3D0, 0, 0, true, rectangle2D0, rectangleEdge0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.GradientBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter(0.0, 0.0, 0.0);
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(0.0, 0.0);
      RectangleInsets rectangleInsets0 = Title.DEFAULT_PADDING;
      JInternalFrame jInternalFrame0 = new JInternalFrame();
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      Rectangle2D rectangle2D0 = rectangleInsets0.createOutsetRectangle((Rectangle2D) rectangle0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge();
      // Undeclared exception!
      try { 
        gradientBarPainter0.paintBarShadow((Graphics2D) null, barRenderer3D0, (-30), (-30), false, rectangle2D0, rectangleEdge0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.GradientBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      Rectangle rectangle0 = new Rectangle((-2399), (-2139055863), 1167, 1167);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      // Undeclared exception!
      try { 
        gradientBarPainter0.paintBarShadow((Graphics2D) null, stackedBarRenderer0, 274, (-195225778), true, rectangle0, rectangleEdge0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.GradientBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter(0.0, 0.0, 0.0);
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(0.0, 0.0);
      JInternalFrame jInternalFrame0 = new JInternalFrame();
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      LegendTitle legendTitle0 = new LegendTitle(combinedDomainXYPlot0);
      // Undeclared exception!
      try { 
        gradientBarPainter0.paintBarShadow((Graphics2D) null, barRenderer3D0, 0, 0, false, rectangle0, legendTitle0.DEFAULT_POSITION, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.GradientBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter(0.0, (-213.5), (-213.5));
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      JFreeChart jFreeChart0 = new JFreeChart(thermometerPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 921);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      short[] shortArray0 = new short[7];
      ShortLookupTable shortLookupTable0 = new ShortLookupTable(2, shortArray0);
      LookupOp lookupOp0 = new LookupOp(shortLookupTable0, (RenderingHints) null);
      Rectangle rectangle0 = (Rectangle)lookupOp0.getBounds2D(bufferedImage0);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      RectangleEdge rectangleEdge0 = combinedRangeCategoryPlot0.getDomainAxisEdge(1);
      gradientBarPainter0.paintBarShadow(sunGraphics2D0, statisticalBarRenderer0, (-195225778), 186, false, rectangle0, rectangleEdge0, false);
      assertEquals((-8355712), sunGraphics2D0.pixel);
      assertEquals((-8355712), sunGraphics2D0.eargb);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter(0.0, (-213.5), (-213.5));
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      JFreeChart jFreeChart0 = new JFreeChart(thermometerPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 912);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      short[] shortArray0 = new short[7];
      ShortLookupTable shortLookupTable0 = new ShortLookupTable(2, shortArray0);
      LookupOp lookupOp0 = new LookupOp(shortLookupTable0, (RenderingHints) null);
      Rectangle rectangle0 = (Rectangle)lookupOp0.getBounds2D(bufferedImage0);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      gradientBarPainter0.paintBarShadow(sunGraphics2D0, statisticalBarRenderer0, 1269, 18, false, rectangle0, rectangleEdge0, true);
      assertEquals((-8355712), sunGraphics2D0.pixel);
      assertEquals((-8355712), sunGraphics2D0.eargb);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      RoundRectangle2D.Double roundRectangle2D_Double0 = new RoundRectangle2D.Double();
      gradientBarPainter0.paintBar((Graphics2D) null, intervalBarRenderer0, (-634), 19, true, roundRectangle2D_Double0, (RectangleEdge) null);
      assertFalse(intervalBarRenderer0.getAutoPopulateSeriesFillPaint());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      gradientBarPainter0.hashCode();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter((-135.2372534987143), (-135.2372534987143), (-135.2372534987143));
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      UnitType unitType0 = UnitType.ABSOLUTE;
      RectangleInsets rectangleInsets0 = new RectangleInsets(unitType0, (-135.2372534987143), 2500000.0, 2500000.0, 419);
      StringCharacterIterator stringCharacterIterator0 = new StringCharacterIterator("Requires p > 0.", 0);
      AffineTransform affineTransform0 = AffineTransform.getQuadrantRotateInstance(419, (double) statisticalBarRenderer0.ZERO, (double) 419);
      FontRenderContext fontRenderContext0 = new FontRenderContext(affineTransform0, false, false);
      Rectangle2D rectangle2D0 = statisticalBarRenderer0.DEFAULT_VALUE_LABEL_FONT.getStringBounds((CharacterIterator) stringCharacterIterator0, 0, 3, fontRenderContext0);
      Rectangle2D rectangle2D1 = rectangleInsets0.createInsetRectangle(rectangle2D0);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      // Undeclared exception!
      try { 
        gradientBarPainter0.paintBarShadow((Graphics2D) null, statisticalBarRenderer0, 419, 419, true, rectangle2D1, rectangleEdge0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.GradientBarPainter", e);
      }
  }
}
