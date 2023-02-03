/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 23:06:23 GMT 2022
 */

package org.jfree.chart.title;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.SystemColor;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.text.AttributedCharacterIterator;
import java.util.HashMap;
import javax.swing.Box;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.text.DefaultCaret;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.title.LegendGraphic;
import org.jfree.chart.util.GradientPaintTransformer;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.jfree.data.xy.XYDatasetTableModel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LegendGraphic_ESTest extends LegendGraphic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[2];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Rectangle2D rectangle2D0 = polygon0.getBounds2D();
      SystemColor systemColor0 = SystemColor.text;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D0, systemColor0);
      legendGraphic0.hashCode();
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(0, 1);
      SystemColor systemColor0 = SystemColor.activeCaptionBorder;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.setLinePaint(systemColor0);
      legendGraphic0.getLinePaint();
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      Color color0 = Color.GRAY;
      LegendGraphic legendGraphic0 = new LegendGraphic(defaultCaret0, color0);
      legendGraphic0.arrangeNN((Graphics2D) null);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-2.147483648E9), (-2.147483648E9), (-2.147483648E9), (-2.147483648E9));
      SystemColor systemColor0 = SystemColor.inactiveCaptionBorder;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D_Double0, systemColor0);
      // Undeclared exception!
      try { 
        legendGraphic0.draw((Graphics2D) null, (Rectangle2D) rectangle2D_Double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Box box0 = Box.createVerticalBox();
      Rectangle rectangle0 = box0.getBounds((Rectangle) null);
      Color color0 = Color.pink;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel();
      boolean boolean0 = legendGraphic0.equals(xYDatasetTableModel0);
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertFalse(boolean0);
      assertTrue(legendGraphic0.isShapeVisible());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      Color color0 = Color.GRAY;
      LegendGraphic legendGraphic0 = new LegendGraphic(defaultCaret0, color0);
      Size2D size2D0 = legendGraphic0.arrange((Graphics2D) null);
      assertEquals(4.0, size2D0.height, 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(4.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      Color color0 = Color.GRAY;
      LegendGraphic legendGraphic0 = new LegendGraphic(defaultCaret0, color0);
      Range range0 = new Range(0.0, 0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-1888.8280569953001), range0);
      // Undeclared exception!
      try { 
        legendGraphic0.arrange((Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.LegendGraphic", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-842.43F), (-842.43F), 498.07187F, (-592.0F));
      SystemColor systemColor0 = SystemColor.textText;
      LegendGraphic legendGraphic0 = new LegendGraphic(line2D_Float0, systemColor0);
      // Undeclared exception!
      try { 
        legendGraphic0.setShapeLocation((RectangleAnchor) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'location' argument.
         //
         verifyException("org.jfree.chart.title.LegendGraphic", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getTextNonSelectionColor();
      LegendGraphic legendGraphic0 = new LegendGraphic(defaultCaret0, color0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      legendGraphic0.setShapeLocation(rectangleAnchor0);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-42), (-2899));
      Color color0 = Color.GREEN;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      legendGraphic0.setShapeAnchor(rectangleAnchor0);
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(243, 1037.31586169079, 243, 1037.31586169079);
      LegendGraphic legendGraphic0 = null;
      try {
        legendGraphic0 = new LegendGraphic(rectangle2D_Double0, (Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'fillPaint' argument.
         //
         verifyException("org.jfree.chart.title.LegendGraphic", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JEditorPane jEditorPane0 = new JEditorPane();
      Color color0 = jEditorPane0.getDisabledTextColor();
      LegendGraphic legendGraphic0 = null;
      try {
        legendGraphic0 = new LegendGraphic((Shape) null, color0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.title.LegendGraphic", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      Color color0 = Color.GRAY;
      LegendGraphic legendGraphic0 = new LegendGraphic(defaultCaret0, color0);
      LegendGraphic legendGraphic1 = (LegendGraphic)legendGraphic0.clone();
      assertEquals(2.0, legendGraphic1.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic1.getContentYOffset(), 0.01);
      assertTrue(legendGraphic1.isShapeVisible());
      assertTrue(legendGraphic1.isShapeFilled());
      assertNotSame(legendGraphic1, legendGraphic0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Point point0 = new Point();
      Line2D.Float line2D_Float0 = new Line2D.Float(point0, point0);
      Color color0 = Color.orange;
      LegendGraphic legendGraphic0 = new LegendGraphic(line2D_Float0, color0);
      legendGraphic0.setLine(line2D_Float0);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Color color0 = Color.darkGray;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D_Float0, color0);
      boolean boolean0 = legendGraphic0.isShapeFilled();
      assertTrue(legendGraphic0.isShapeVisible());
      assertTrue(boolean0);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-42), (-2899));
      Color color0 = Color.GREEN;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      legendGraphic0.getOutlineStroke();
      assertTrue(legendGraphic0.isShapeVisible());
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(0, 1);
      SystemColor systemColor0 = SystemColor.activeCaptionBorder;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.setFillPaint(systemColor0);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double(0.0, (-7.27054));
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Double0, point2D_Double0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Color color0 = new Color(0, true);
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      legendGraphic0.getLinePaint();
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
      assertTrue(legendGraphic0.isShapeFilled());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double(0.0, (-7.27054));
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Double0, point2D_Double0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Color color0 = new Color(0, true);
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      legendGraphic0.getShape();
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, 469.9, 2.0, 469.9);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getBorderSelectionColor();
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      legendGraphic0.getOutlinePaint();
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-3635.901F), (-3635.901F), 2178.511F, 2178.511F);
      SystemColor systemColor0 = SystemColor.scrollbar;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D_Float0, systemColor0);
      legendGraphic0.setShape(rectangle2D_Float0);
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double(0.0, (-7.27054));
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Double0, point2D_Double0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Color color0 = new Color(0, true);
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      boolean boolean0 = legendGraphic0.isShapeVisible();
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(boolean0);
      assertTrue(legendGraphic0.isShapeFilled());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double(0.0, (-7.27054));
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Double0, point2D_Double0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Color color0 = new Color(0, true);
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      legendGraphic0.setLineVisible(true);
      assertTrue(legendGraphic0.isLineVisible());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-42), (-2899));
      Color color0 = Color.GREEN;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      legendGraphic0.setOutlineStroke((Stroke) null);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
      assertTrue(legendGraphic0.isShapeFilled());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(331, (-522));
      SystemColor systemColor0 = SystemColor.text;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.getShapeAnchor();
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 2138.0F, 0.0F, 1.0F);
      Box box0 = new Box(0);
      Rectangle rectangle0 = box0.getVisibleRect();
      Rectangle2D rectangle2D0 = rectangle2D_Float0.createUnion(rectangle0);
      Color color0 = new Color(0, 0, 0, 0);
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D0, color0);
      legendGraphic0.getLine();
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double(0.0, (-7.27054));
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Double0, point2D_Double0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Color color0 = new Color(0, true);
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      legendGraphic0.getFillPaint();
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      Color color0 = Color.GRAY;
      LegendGraphic legendGraphic0 = new LegendGraphic(defaultCaret0, color0);
      legendGraphic0.getLineStroke();
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-842.43F), (-842.43F), 498.07187F, (-592.0F));
      SystemColor systemColor0 = SystemColor.textText;
      LegendGraphic legendGraphic0 = new LegendGraphic(line2D_Float0, systemColor0);
      legendGraphic0.setShapeOutlineVisible(false);
      assertTrue(legendGraphic0.isShapeVisible());
      assertFalse(legendGraphic0.isShapeOutlineVisible());
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AffineTransform affineTransform0 = new AffineTransform(0.0F, 4759.0F, 0.0F, 0.0F, 0.0F, 4759.0F);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(4759.0F, 0.0F, 0.0F, 0.0F);
      Shape shape0 = affineTransform0.createTransformedShape(rectangle2D_Float0);
      Color color0 = Color.cyan;
      LegendGraphic legendGraphic0 = new LegendGraphic(shape0, color0);
      legendGraphic0.isShapeOutlineVisible();
      assertTrue(legendGraphic0.isShapeVisible());
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double(0.0, (-7.27054));
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Double0, point2D_Double0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Color color0 = new Color(0, true);
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      GradientPaintTransformer gradientPaintTransformer0 = legendGraphic0.getFillPaintTransformer();
      legendGraphic0.setFillPaintTransformer(gradientPaintTransformer0);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, 106.22458273591, 1306.5947300622, 0.0);
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      SystemColor systemColor0 = SystemColor.textHighlightText;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D0, systemColor0);
      legendGraphic0.getShapeLocation();
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(0, 1);
      SystemColor systemColor0 = SystemColor.activeCaptionBorder;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.setOutlinePaint(systemColor0);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HashMap<AttributedCharacterIterator.Attribute, GradientPaint> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, GradientPaint>(1953);
      Font font0 = new Font(hashMap0);
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance((double) 1953, 0.5, 0.5);
      FontRenderContext fontRenderContext0 = new FontRenderContext(affineTransform0, true, true);
      Rectangle2D rectangle2D0 = font0.getMaxCharBounds(fontRenderContext0);
      Color color0 = Color.PINK;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D0, color0);
      legendGraphic0.setShapeVisible(true);
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Color color0 = Color.darkGray;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D_Float0, color0);
      assertTrue(legendGraphic0.isShapeFilled());
      
      legendGraphic0.setShapeFilled(false);
      boolean boolean0 = legendGraphic0.isShapeFilled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, 469.9, 2.0, 469.9);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getBorderSelectionColor();
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      legendGraphic0.isLineVisible();
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
      assertTrue(legendGraphic0.isShapeFilled());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-1242.0), (-1242.0), (-766.21471775474), 3440.6838126);
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument();
      JTextPane jTextPane0 = new JTextPane(defaultStyledDocument0);
      Color color0 = jTextPane0.getDisabledTextColor();
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      GradientPaint gradientPaint0 = new GradientPaint(0, (-825.0F), color0, 0.0F, 0, color0);
      // Undeclared exception!
      try { 
        legendGraphic0.draw((Graphics2D) null, (Rectangle2D) rectangle2D_Double0, (Object) gradientPaint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }
}