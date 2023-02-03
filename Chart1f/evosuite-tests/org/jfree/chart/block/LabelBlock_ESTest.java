/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 23:41:51 GMT 2022
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.text.AttributedCharacterIterator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.block.LabelBlock;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.text.TextBlockAnchor;
import org.jfree.chart.util.RectangleAnchor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LabelBlock_ESTest extends LabelBlock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hashtable<AttributedCharacterIterator.Attribute, Integer> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, Integer>();
      Font font0 = new Font(hashtable0);
      LabelBlock labelBlock0 = new LabelBlock("org.jfree.chart.block.LabelBlock", font0);
      Object object0 = labelBlock0.clone();
      boolean boolean0 = labelBlock0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.infoText;
      LabelBlock labelBlock0 = new LabelBlock("", (Font) null, systemColor0);
      SystemColor systemColor1 = (SystemColor)labelBlock0.getPaint();
      assertEquals(0, systemColor1.getBlue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("Null 'heightType' argument.");
      labelBlock0.setURLText("Null 'heightType' argument.");
      String string0 = labelBlock0.getURLText();
      assertEquals("Null 'heightType' argument.", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("");
      labelBlock0.setToolTipText("9WHD`=Q");
      String string0 = labelBlock0.getToolTipText();
      assertEquals("9WHD`=Q", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("ee");
      labelBlock0.setToolTipText("");
      String string0 = labelBlock0.getToolTipText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.infoText;
      LabelBlock labelBlock0 = new LabelBlock("", (Font) null, systemColor0);
      Font font0 = labelBlock0.getFont();
      assertNull(font0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument();
      AttributeSet attributeSet0 = SimpleAttributeSet.EMPTY;
      Font font0 = defaultStyledDocument0.getFont(attributeSet0);
      AffineTransform affineTransform0 = AffineTransform.getQuadrantRotateInstance((-1));
      Font font1 = font0.deriveFont((-720), affineTransform0);
      Color color0 = Color.pink;
      LabelBlock labelBlock0 = new LabelBlock("PI5*0M", font1, color0);
      Font font2 = labelBlock0.getFont();
      assertFalse(font2.isBold());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<AttributedCharacterIterator.Attribute, String> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, String>();
      Font font0 = Font.getFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) hashMap0);
      Font font1 = font0.deriveFont(10, (float) 10);
      LabelBlock labelBlock0 = new LabelBlock("M,H'b; iOU", font1);
      Font font2 = labelBlock0.getFont();
      assertFalse(font2.isTransformed());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Font font0 = new Font("", 2250, (-759));
      LabelBlock labelBlock0 = new LabelBlock("", font0);
      Font font1 = labelBlock0.getFont();
      assertFalse(font1.isItalic());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("?~DVX&Z;o0m");
      Rectangle rectangle0 = new Rectangle((short)1600, (short)1, (short) (-1), (short)1);
      // Undeclared exception!
      try { 
        labelBlock0.draw((Graphics2D) null, (Rectangle2D) rectangle0, (Object) labelBlock0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.text;
      LabelBlock labelBlock0 = null;
      try {
        labelBlock0 = new LabelBlock("1f'>'=", (Font) null, systemColor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.text.TextLine", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LabelBlock labelBlock0 = null;
      try {
        labelBlock0 = new LabelBlock("Null 'values' argument.", (Font) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.text.TextLine", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LabelBlock labelBlock0 = null;
      try {
        labelBlock0 = new LabelBlock((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'text' argument.
         //
         verifyException("org.jfree.chart.text.TextUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("Null 'paint' argument.");
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      // Undeclared exception!
      try { 
        labelBlock0.arrange((Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.LabelBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hashtable<AttributedCharacterIterator.Attribute, Integer> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, Integer>();
      Font font0 = new Font(hashtable0);
      LabelBlock labelBlock0 = new LabelBlock("org.jfree.chart.block.LabelBlock", font0);
      LabelBlock labelBlock1 = (LabelBlock)labelBlock0.clone();
      assertTrue(labelBlock1.equals((Object)labelBlock0));
      
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_LEFT;
      labelBlock1.setContentAlignmentPoint(textBlockAnchor0);
      boolean boolean0 = labelBlock0.equals(labelBlock1);
      assertFalse(labelBlock1.equals((Object)labelBlock0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hashtable<AttributedCharacterIterator.Attribute, Integer> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, Integer>();
      Font font0 = new Font(hashtable0);
      LabelBlock labelBlock0 = new LabelBlock("org.jfree.chart.block.LabelBlock", font0);
      Object object0 = labelBlock0.clone();
      assertTrue(object0.equals((Object)labelBlock0));
      
      Color color0 = Color.cyan;
      labelBlock0.setPaint(color0);
      boolean boolean0 = labelBlock0.equals(object0);
      assertFalse(object0.equals((Object)labelBlock0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hashtable<AttributedCharacterIterator.Attribute, Integer> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, Integer>();
      Font font0 = new Font(hashtable0);
      Font font1 = Font.decode("org.jfree.chart.block.LabelBlock");
      LabelBlock labelBlock0 = new LabelBlock("org.jfree.chart.block.LabelBlock", font0);
      LabelBlock labelBlock1 = new LabelBlock("org.jfree.chart.block.LabelBlock", font1, labelBlock0.DEFAULT_PAINT);
      boolean boolean0 = labelBlock0.equals(labelBlock1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hashtable<AttributedCharacterIterator.Attribute, Integer> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, Integer>();
      Font font0 = new Font(hashtable0);
      AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = AttributedCharacterIterator.Attribute.READING;
      LabelBlock labelBlock0 = new LabelBlock("org.jfree.chart.blok.LabelBlock", font0);
      boolean boolean0 = labelBlock0.equals(attributedCharacterIterator_Attribute0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("JDBCCategoryDataset.executeQuery() : insufficient columns returned from the database.");
      // Undeclared exception!
      try { 
        labelBlock0.setContentAlignmentPoint((TextBlockAnchor) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.block.LabelBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("", (Font) null);
      // Undeclared exception!
      try { 
        labelBlock0.setPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.block.LabelBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("Null 'anchor' argument.");
      Color color0 = Color.blue;
      labelBlock0.setPaint(color0);
      Font font0 = Font.decode("Null 'anchor' argument.");
      labelBlock0.setFont(font0);
      assertEquals(12.0F, font0.getSize2D(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("Null 'anchor' argument.");
      // Undeclared exception!
      try { 
        labelBlock0.setFont((Font) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.block.LabelBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Hashtable<AttributedCharacterIterator.Attribute, Integer> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, Integer>();
      Font font0 = new Font(hashtable0);
      LabelBlock labelBlock0 = new LabelBlock("org.jfree.chart.blok.LabelBlock", font0);
      TextBlockAnchor textBlockAnchor0 = labelBlock0.getContentAlignmentPoint();
      assertEquals("TextBlockAnchor.CENTER", textBlockAnchor0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Hashtable<AttributedCharacterIterator.Attribute, Integer> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, Integer>();
      Font font0 = new Font(hashtable0);
      LabelBlock labelBlock0 = new LabelBlock("org.jfree.chart.blok.LabelBlock", font0);
      String string0 = labelBlock0.getToolTipText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Hashtable<AttributedCharacterIterator.Attribute, Integer> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, Integer>();
      Font font0 = new Font(hashtable0);
      LabelBlock labelBlock0 = new LabelBlock("org.jfree.chart.blok.LabelBlock", font0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      labelBlock0.setTextAnchor(rectangleAnchor0);
      assertEquals(0.0, labelBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Hashtable<AttributedCharacterIterator.Attribute, Integer> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, Integer>();
      Font font0 = new Font(hashtable0);
      LabelBlock labelBlock0 = new LabelBlock("org.jfree.chart.blok.LabelBlock", font0);
      RectangleAnchor rectangleAnchor0 = labelBlock0.getTextAnchor();
      assertEquals("RectangleAnchor.CENTER", rectangleAnchor0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("Null 'anchor' argument.");
      String string0 = labelBlock0.getURLText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-2913), (-2913));
      LabelBlock labelBlock0 = new LabelBlock("q4`}");
      // Undeclared exception!
      try { 
        labelBlock0.draw((Graphics2D) null, (Rectangle2D) rectangle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }
}
