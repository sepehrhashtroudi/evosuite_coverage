/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 23:38:33 GMT 2022
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.SystemColor;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.AttributedCharacterIterator;
import java.util.HashMap;
import java.util.Map;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.util.RectangleInsets;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BlockBorder_ESTest extends BlockBorder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NaN);
      BufferedImage bufferedImage0 = new BufferedImage(305, 1, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      HashMap<AttributedCharacterIterator.Attribute, String> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, String>();
      Font font0 = Font.getFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) hashMap0);
      FontRenderContext fontRenderContext0 = new FontRenderContext(((SunGraphics2D) graphics2D0).transform, true, true);
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)font0.getMaxCharBounds(fontRenderContext0);
      blockBorder0.draw(graphics2D0, rectangle2D_Float0);
      assertEquals(22.0F, rectangle2D_Float0.width, 0.01F);
      assertEquals((-11.138672F), rectangle2D_Float0.y, 0.01F);
      assertEquals((-4.154296875), rectangle2D_Float0.getCenterY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder(Double.NaN, Double.NaN, Double.NaN, Double.NaN);
      BufferedImage bufferedImage0 = new BufferedImage(305, 1, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      HashMap<AttributedCharacterIterator.Attribute, String> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, String>();
      Font font0 = Font.getFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) hashMap0);
      FontRenderContext fontRenderContext0 = new FontRenderContext(((SunGraphics2D) graphics2D0).transform, true, true);
      Rectangle2D rectangle2D0 = font0.getMaxCharBounds(fontRenderContext0);
      blockBorder0.draw(graphics2D0, rectangle2D0);
      assertEquals((-11.138671875), rectangle2D0.getMinY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder(Double.POSITIVE_INFINITY, (-760.09288), (-760.09288), Double.NaN);
      BufferedImage bufferedImage0 = new BufferedImage(305, 1, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      HashMap<AttributedCharacterIterator.Attribute, String> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, String>();
      Font font0 = Font.getFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) hashMap0);
      FontRenderContext fontRenderContext0 = new FontRenderContext(((SunGraphics2D) graphics2D0).transform, true, true);
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)font0.getMaxCharBounds(fontRenderContext0);
      blockBorder0.draw(graphics2D0, rectangle2D_Float0);
      assertEquals(13.96875F, rectangle2D_Float0.height, 0.01F);
      assertEquals(2.830078125, rectangle2D_Float0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlockBorder blockBorder0 = BlockBorder.NONE;
      BufferedImage bufferedImage0 = new BufferedImage(305, 1, 1);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      HashMap<AttributedCharacterIterator.Attribute, String> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, String>();
      Font font0 = Font.getFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) hashMap0);
      FontRenderContext fontRenderContext0 = new FontRenderContext(sunGraphics2D0.transform, true, true);
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)font0.getMaxCharBounds(fontRenderContext0);
      blockBorder0.draw(sunGraphics2D0, rectangle2D_Float0);
      assertEquals(0, sunGraphics2D0.compositeState);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Color color0 = Color.LIGHT_GRAY;
      BlockBorder blockBorder0 = new BlockBorder((-1238.140133), 2509.31639948786, (-2086.3672974525807), (-2086.3672974525807), color0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BlockBorder blockBorder0 = BlockBorder.NONE;
      RectangleInsets rectangleInsets0 = blockBorder0.getInsets();
      assertEquals(0.0, rectangleInsets0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder((-1305.536259788552), (-1305.536259788552), (-1305.536259788552), (-1305.536259788552));
      RectangleInsets rectangleInsets0 = blockBorder0.getInsets();
      assertEquals((-1305.536259788552), rectangleInsets0.getBottom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder((-1.0), (-1.0), (-1.0), (-1.0));
      // Undeclared exception!
      try { 
        blockBorder0.draw((Graphics2D) null, (Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BlockBorder blockBorder0 = null;
      try {
        blockBorder0 = new BlockBorder((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RectangleInsets rectangleInsets0 = new RectangleInsets();
      BlockBorder blockBorder0 = null;
      try {
        blockBorder0 = new BlockBorder(rectangleInsets0, (Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder();
      BufferedImage bufferedImage0 = new BufferedImage(305, 1, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      RectangleInsets rectangleInsets0 = new RectangleInsets();
      BlockBorder blockBorder1 = new BlockBorder(rectangleInsets0, ((SunGraphics2D) graphics2D0).backgroundColor);
      boolean boolean0 = blockBorder0.equals(blockBorder1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder();
      Object object0 = new Object();
      boolean boolean0 = blockBorder0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder();
      boolean boolean0 = blockBorder0.equals(blockBorder0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder();
      BufferedImage bufferedImage0 = new BufferedImage(305, 1, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      BlockBorder blockBorder1 = new BlockBorder(((SunGraphics2D) graphics2D0).paint);
      boolean boolean0 = blockBorder0.equals(blockBorder1);
      assertFalse(blockBorder1.equals((Object)blockBorder0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder();
      BufferedImage bufferedImage0 = new BufferedImage(305, 1, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      HashMap<AttributedCharacterIterator.Attribute, String> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, String>();
      Font font0 = Font.getFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) hashMap0);
      FontRenderContext fontRenderContext0 = new FontRenderContext(((SunGraphics2D) graphics2D0).transform, true, true);
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)font0.getMaxCharBounds(fontRenderContext0);
      blockBorder0.draw(graphics2D0, rectangle2D_Float0);
      assertEquals(22.0F, rectangle2D_Float0.width, 0.01F);
      assertEquals((-11.138672F), rectangle2D_Float0.y, 0.01F);
      assertEquals((-4.154296875), rectangle2D_Float0.getCenterY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BlockBorder blockBorder0 = null;
      try {
        blockBorder0 = new BlockBorder(0.0, 0.0, (-1.0), (-1.0), (Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BlockBorder blockBorder0 = null;
      try {
        blockBorder0 = new BlockBorder((RectangleInsets) null, (Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'insets' argument.
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.controlDkShadow;
      BlockBorder blockBorder0 = new BlockBorder((-127.0), 0.0, (-127.0), (-127.0), systemColor0);
      BlockBorder blockBorder1 = new BlockBorder(0.0, (-760.09288), 0.0, (-760.09288), systemColor0);
      boolean boolean0 = blockBorder0.equals(blockBorder1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RectangleInsets rectangleInsets0 = new RectangleInsets(2396.835253, 2396.835253, 2396.835253, 2396.835253);
      StyleContext styleContext0 = new StyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(styleContext0);
      StyleContext.NamedStyle styleContext_NamedStyle0 = styleContext0.new NamedStyle();
      SimpleAttributeSet simpleAttributeSet0 = new SimpleAttributeSet(styleContext_NamedStyle0);
      Color color0 = defaultStyledDocument0.getBackground(simpleAttributeSet0);
      BlockBorder blockBorder0 = new BlockBorder(rectangleInsets0, color0);
      Paint paint0 = blockBorder0.getPaint();
      assertSame(color0, paint0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder();
      RectangleInsets rectangleInsets0 = blockBorder0.getInsets();
      assertEquals(1.0, rectangleInsets0.getBottom(), 0.01);
  }
}