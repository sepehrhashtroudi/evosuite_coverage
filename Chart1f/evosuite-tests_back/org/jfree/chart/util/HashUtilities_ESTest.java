/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 00:19:04 GMT 2022
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.SystemColor;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.GapContent;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StringContent;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.HashUtilities;
import org.junit.runner.RunWith;
import sun.awt.SunHints;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HashUtilities_ESTest extends HashUtilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[5] = (double) (-1109104025);
      int int0 = HashUtilities.hashCodeForDoubleArray(doubleArray0);
      assertEquals(2005785782, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 160;
      doubleArray0[4] = (double) 1107;
      int int0 = HashUtilities.hashCodeForDoubleArray(doubleArray0);
      assertEquals((-1224371715), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GapContent gapContent0 = new GapContent();
      StyleContext styleContext0 = new StyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(gapContent0, styleContext0);
      StyledEditorKit styledEditorKit0 = new StyledEditorKit();
      MutableAttributeSet mutableAttributeSet0 = styledEditorKit0.getInputAttributes();
      Color color0 = defaultStyledDocument0.getBackground(mutableAttributeSet0);
      GradientPaint gradientPaint0 = new GradientPaint(160, 1386.84F, color0, 1107, 1386.84F, color0);
      int int0 = HashUtilities.hashCodeForPaint(gradientPaint0);
      assertEquals((-1109104025), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = HashUtilities.hashCodeForPaint((Paint) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SunHints.Key sunHints_Key0 = (SunHints.Key)RenderingHints.KEY_DITHERING;
      HashUtilities.hashCode(371, (Object) sunHints_Key0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashUtilities.hashCode(1, (Object) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashUtilities.hashCode(0, (Comparable) "");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashUtilities.hashCode((-2294), (Comparable) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashUtilities.hashCode((-3097), "1LA's:`\";&p.q*");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashUtilities.hashCode(450, (String) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicStroke basicStroke0 = new BasicStroke();
      HashUtilities.hashCode(0, (Stroke) basicStroke0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashUtilities.hashCode(18, (Stroke) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashUtilities.hashCode(18, true);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashUtilities.hashCode(371, false);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = HashUtilities.hashCodeForDoubleArray((double[]) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringContent stringContent0 = new StringContent(115);
      StyleContext styleContext0 = new StyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(stringContent0, styleContext0);
      AttributeSet attributeSet0 = SimpleAttributeSet.EMPTY;
      SimpleAttributeSet simpleAttributeSet0 = new SimpleAttributeSet(attributeSet0);
      Color color0 = defaultStyledDocument0.getForeground(simpleAttributeSet0);
      GradientPaint gradientPaint0 = new GradientPaint(0, (-1885.5746F), color0, 1091, (-1.0F), color0, true);
      HashUtilities.hashCode(1091, (Paint) gradientPaint0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.inactiveCaptionBorder;
      int int0 = HashUtilities.hashCodeForPaint(systemColor0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashUtilities.hashCode(641, 1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashUtilities hashUtilities0 = new HashUtilities();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashUtilities.hashCode(371, (-1050.265320468352));
  }
}
