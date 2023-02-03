/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 00:04:07 GMT 2022
 */

package org.jfree.chart.needle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.needle.LineNeedle;
import org.junit.runner.RunWith;
import sun.awt.SunHints;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LineNeedle_ESTest extends LineNeedle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0, (-1935), 0.0, 2891.0);
      Point point0 = new Point(0, 0);
      lineNeedle0.drawNeedle((Graphics2D) null, rectangle2D_Double0, point0, 1.7307473217081168);
      assertEquals(0.0, rectangle2D_Double0.getMinX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      Line2D.Double line2D_Double0 = new Line2D.Double(819.662, 2891, 2891, 0);
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)line2D_Double0.getBounds2D();
      lineNeedle0.drawNeedle((Graphics2D) null, rectangle2D_Double0, (Point2D) null, (-1919));
      assertEquals(0.0, rectangle2D_Double0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      Color color0 = Color.pink;
      GradientPaint gradientPaint0 = new GradientPaint((-1965.256F), 0.0F, color0, 0.0F, 0.0F, color0);
      lineNeedle0.setOutlinePaint(gradientPaint0);
      int[] intArray0 = new int[9];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Rectangle rectangle0 = polygon0.getBounds();
      // Undeclared exception!
      try { 
        lineNeedle0.drawNeedle((Graphics2D) null, rectangle0, (Point2D) null, (-840.351832434065));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.needle.MeterNeedle", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      LineNeedle lineNeedle1 = new LineNeedle();
      boolean boolean0 = lineNeedle0.equals(lineNeedle1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      boolean boolean0 = lineNeedle0.equals(lineNeedle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      SunHints.Key sunHints_Key0 = (SunHints.Key)RenderingHints.KEY_COLOR_RENDERING;
      boolean boolean0 = lineNeedle0.equals(sunHints_Key0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Point point0 = new Point(0, 0);
      lineNeedle0.drawNeedle((Graphics2D) null, rectangle2D_Double0, point0, 0);
      assertEquals(0.0, rectangle2D_Double0.getCenterY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Point point0 = new Point(0, 0);
      lineNeedle0.drawNeedle((Graphics2D) null, rectangle2D_Double0, point0, (-1935));
      assertEquals(0, point0.y);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      Object object0 = lineNeedle0.clone();
      assertTrue(object0.equals((Object)lineNeedle0));
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      lineNeedle0.hashCode();
  }
}