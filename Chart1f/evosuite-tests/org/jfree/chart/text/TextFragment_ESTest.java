/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:32:04 GMT 2022
 */

package org.jfree.chart.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleContext;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.text.TextFragment;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextFragment_ESTest extends TextFragment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hashtable<Format.Field, Object> hashtable0 = new Hashtable<Format.Field, Object>();
      Font font0 = new Font(hashtable0);
      Color color0 = Color.BLUE;
      TextFragment textFragment0 = new TextFragment("Can't evaluate the year.", font0, color0, 0.0F);
      textFragment0.hashCode();
      assertEquals(0.0F, textFragment0.getBaselineOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Font font0 = Font.decode("");
      Color color0 = Color.DARK_GRAY;
      TextFragment textFragment0 = new TextFragment("", font0, color0);
      TextFragment textFragment1 = new TextFragment("", font0, color0, 1.0F);
      boolean boolean0 = textFragment0.equals(textFragment1);
      assertTrue(boolean0);
      assertEquals(1.0F, textFragment1.getBaselineOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Font font0 = new Font("Column key (", (byte)12, 53);
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getTextNonSelectionColor();
      TextFragment textFragment0 = new TextFragment("", font0, color0);
      // Undeclared exception!
      try { 
        textFragment0.calculateDimensions((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextFragment textFragment0 = new TextFragment("H");
      BufferedImage bufferedImage0 = new BufferedImage(2182, 4, 4);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      textFragment0.draw(graphics2D0, 0, 4, (TextAnchor) null, (-1960.4535F), 0.0F, 1.0);
      assertEquals(0.0F, textFragment0.getBaselineOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument();
      SimpleAttributeSet simpleAttributeSet0 = new SimpleAttributeSet();
      Font font0 = defaultStyledDocument0.getFont(simpleAttributeSet0);
      SystemColor systemColor0 = SystemColor.menu;
      TextFragment textFragment0 = new TextFragment("v.*oj&CT9bX$", font0, systemColor0);
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_RIGHT;
      // Undeclared exception!
      try { 
        textFragment0.draw((Graphics2D) null, 0.0F, 0.0F, textAnchor0, 0.0F, (-1062.0553F), 264.9345086);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument();
      SimpleAttributeSet simpleAttributeSet0 = new SimpleAttributeSet();
      Font font0 = defaultStyledDocument0.getFont(simpleAttributeSet0);
      SystemColor systemColor0 = SystemColor.menu;
      TextFragment textFragment0 = new TextFragment("v.*oj&CT9bX$", font0, systemColor0);
      textFragment0.getPaint();
      assertEquals(0.0F, textFragment0.getBaselineOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextFragment textFragment0 = new TextFragment("H");
      BufferedImage bufferedImage0 = new BufferedImage(2182, 4, 4);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      textFragment0.draw(graphics2D0, 0.0F, 0.0F, (TextAnchor) null, 2182, (-177.0F), (-3576.21581));
      assertEquals(0.0F, textFragment0.getBaselineOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StyleContext styleContext0 = new StyleContext();
      Font font0 = styleContext0.getFont("/", (-49987981), (-1469));
      Color color0 = Color.PINK;
      TextFragment textFragment0 = new TextFragment("/", font0, color0);
      textFragment0.getText();
      assertEquals(0.0F, textFragment0.getBaselineOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StyleContext styleContext0 = new StyleContext();
      Font font0 = styleContext0.getFont("!Z&|P\"5fg=(<l4H+", 12, 12);
      Font font1 = font0.deriveFont(0, 0.0F);
      TextFragment textFragment0 = new TextFragment("#=[xT<7eZ0=\"", font1);
      Font font2 = textFragment0.getFont();
      assertEquals(0.0F, textFragment0.getBaselineOffset(), 0.01F);
      assertEquals(0, font2.getSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StyleContext styleContext0 = new StyleContext();
      Font font0 = styleContext0.getFont("/", (-49987981), (-1469));
      Color color0 = Color.PINK;
      TextFragment textFragment0 = new TextFragment("/", font0, color0);
      Font font1 = textFragment0.getFont();
      assertEquals((-1469), font1.getSize());
      assertEquals(0.0F, textFragment0.getBaselineOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Font font0 = Font.decode("");
      Color color0 = Color.DARK_GRAY;
      TextFragment textFragment0 = new TextFragment("", font0, color0);
      TextFragment textFragment1 = new TextFragment("H", textFragment0.DEFAULT_FONT, color0, 1.0F);
      float float0 = textFragment1.getBaselineOffset();
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StyleContext styleContext0 = new StyleContext();
      StyleContext.NamedStyle styleContext_NamedStyle0 = styleContext0.new NamedStyle();
      Font font0 = styleContext0.getFont((AttributeSet) styleContext_NamedStyle0);
      SystemColor systemColor0 = SystemColor.infoText;
      TextFragment textFragment0 = new TextFragment("", font0, systemColor0, (-1.0F));
      float float0 = textFragment0.getBaselineOffset();
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextFragment textFragment0 = new TextFragment("H");
      BufferedImage bufferedImage0 = new BufferedImage(92, 92, 12);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      textFragment0.calculateDimensions(graphics2D0);
      assertEquals(0.0F, textFragment0.getBaselineOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Font font0 = Font.decode("");
      Color color0 = Color.DARK_GRAY;
      TextFragment textFragment0 = new TextFragment("~", font0, color0);
      TextAnchor textAnchor0 = TextAnchor.CENTER;
      // Undeclared exception!
      try { 
        textFragment0.calculateBaselineOffset((Graphics2D) null, textAnchor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TextFragment textFragment0 = null;
      try {
        textFragment0 = new TextFragment((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'text' argument.
         //
         verifyException("org.jfree.chart.text.TextFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Font font0 = new Font("bA7(QGR#G}-e", (-1150), (-1150));
      TextFragment textFragment0 = null;
      try {
        textFragment0 = new TextFragment("pt#0qex!V^H*<m", font0, (Paint) null, (-1150));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.text.TextFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TextFragment textFragment0 = null;
      try {
        textFragment0 = new TextFragment("C", (Font) null, (Paint) null, 0.0F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.text.TextFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Font font0 = TextFragment.DEFAULT_FONT;
      Color color0 = Color.BLUE;
      TextFragment textFragment0 = null;
      try {
        textFragment0 = new TextFragment((String) null, font0, color0, 0.0F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'text' argument.
         //
         verifyException("org.jfree.chart.text.TextFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TextFragment textFragment0 = new TextFragment("H");
      textFragment0.hashCode();
      assertEquals(0.0F, textFragment0.getBaselineOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Font font0 = Font.decode("");
      Color color0 = Color.DARK_GRAY;
      TextFragment textFragment0 = new TextFragment("~", font0, color0);
      TextFragment textFragment1 = new TextFragment("~", font0);
      boolean boolean0 = textFragment0.equals(textFragment1);
      assertFalse(boolean0);
      assertFalse(textFragment1.equals((Object)textFragment0));
      assertEquals(0.0F, textFragment1.getBaselineOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Font font0 = Font.decode("");
      Color color0 = Color.DARK_GRAY;
      TextFragment textFragment0 = new TextFragment("~", font0, color0);
      TextFragment textFragment1 = new TextFragment("H", textFragment0.DEFAULT_FONT, color0, (-0.70325375F));
      boolean boolean0 = textFragment0.equals(textFragment1);
      assertFalse(boolean0);
      assertEquals((-0.70325375F), textFragment1.getBaselineOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TextFragment textFragment0 = new TextFragment("");
      boolean boolean0 = textFragment0.equals("");
      assertFalse(boolean0);
      assertEquals(0.0F, textFragment0.getBaselineOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TextFragment textFragment0 = new TextFragment("");
      boolean boolean0 = textFragment0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(0.0F, textFragment0.getBaselineOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TextFragment textFragment0 = new TextFragment("H");
      boolean boolean0 = textFragment0.equals(textFragment0);
      assertEquals(0.0F, textFragment0.getBaselineOffset(), 0.01F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TextFragment textFragment0 = new TextFragment("H");
      BufferedImage bufferedImage0 = new BufferedImage(2182, 4, 4);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      float float0 = textFragment0.calculateBaselineOffset(graphics2D0, (TextAnchor) null);
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, textFragment0.getBaselineOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Font font0 = new Font((Map<? extends AttributedCharacterIterator.Attribute, ?>) null);
      TextFragment textFragment0 = null;
      try {
        textFragment0 = new TextFragment("D=M}B-;w}jHFnAd&]eU", font0, (Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.text.TextFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TextFragment textFragment0 = null;
      try {
        textFragment0 = new TextFragment("SerialDate.monthCodeToQuarter: invalid month code.", (Font) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.text.TextFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Font font0 = Font.decode("");
      Color color0 = Color.DARK_GRAY;
      TextFragment textFragment0 = new TextFragment("", font0, color0);
      TextFragment textFragment1 = new TextFragment("", textFragment0.DEFAULT_FONT);
      boolean boolean0 = textFragment0.equals(textFragment1);
      assertFalse(boolean0);
      assertEquals(0.0F, textFragment1.getBaselineOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TextFragment textFragment0 = new TextFragment("");
      textFragment0.getText();
      assertEquals(0.0F, textFragment0.getBaselineOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TextFragment textFragment0 = new TextFragment("");
      float float0 = textFragment0.getBaselineOffset();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Font font0 = Font.decode("");
      Color color0 = Color.DARK_GRAY;
      TextFragment textFragment0 = new TextFragment("", font0, color0);
      Font font1 = textFragment0.getFont();
      assertEquals(0.0F, textFragment0.getBaselineOffset(), 0.01F);
      assertEquals("", font1.getName());
  }
}
