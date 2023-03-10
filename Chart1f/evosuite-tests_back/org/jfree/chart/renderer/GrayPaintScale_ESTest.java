/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 02:38:43 GMT 2022
 */

package org.jfree.chart.renderer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.renderer.GrayPaintScale;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GrayPaintScale_ESTest extends GrayPaintScale_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 1.0, 217);
      GrayPaintScale grayPaintScale1 = new GrayPaintScale();
      boolean boolean0 = grayPaintScale1.equals(grayPaintScale0);
      assertEquals(255, grayPaintScale1.getAlpha());
      assertFalse(grayPaintScale0.equals((Object)grayPaintScale1));
      assertFalse(boolean0);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = new GrayPaintScale(0.0, 255);
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertFalse(boolean0);
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale0));
      assertEquals(255.0, grayPaintScale1.getUpperBound(), 0.01);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01);
      assertEquals(255, grayPaintScale1.getAlpha());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = new GrayPaintScale(255, 1052.29, 0);
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertEquals(0, grayPaintScale1.getAlpha());
      assertEquals(255.0, grayPaintScale1.getLowerBound(), 0.01);
      assertFalse(boolean0);
      assertEquals(1052.29, grayPaintScale1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1.0), 855.82, 1);
      Color color0 = (Color)grayPaintScale0.getPaint(855.82);
      assertEquals(33554431, color0.getRGB());
      assertEquals(855.82, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals((-1.0), grayPaintScale0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      Color color0 = (Color)grayPaintScale0.getPaint((-3587.5446687));
      assertEquals(255, grayPaintScale0.getAlpha());
      assertEquals((-16777216), color0.getRGB());
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-3235.820399019), 0.0, 0);
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals(0.0, double0, 0.01);
      assertEquals((-3235.820399019), grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(0, grayPaintScale0.getAlpha());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-2564.7265883524806), (-710.0338848348), 0);
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals((-710.0338848348), double0, 0.01);
      assertEquals((-2564.7265883524806), grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(0, grayPaintScale0.getAlpha());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(1.0, 2288.5062061021);
      double double0 = grayPaintScale0.getLowerBound();
      assertEquals(2288.5062061021, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals(255, grayPaintScale0.getAlpha());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-2564.7265883524806), (-710.0338848348), 0);
      double double0 = grayPaintScale0.getLowerBound();
      assertEquals((-710.0338848348), grayPaintScale0.getUpperBound(), 0.01);
      assertEquals((-2564.7265883524806), double0, 0.01);
      assertEquals(0, grayPaintScale0.getAlpha());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-2564.7265883524806), (-710.0338848348), 0);
      int int0 = grayPaintScale0.getAlpha();
      assertEquals(0, int0);
      assertEquals((-710.0338848348), grayPaintScale0.getUpperBound(), 0.01);
      assertEquals((-2564.7265883524806), grayPaintScale0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale(750.36233589694, 750.36233589694, 3312);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires lowerBound < upperBound.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 602.8067);
      GrayPaintScale grayPaintScale1 = new GrayPaintScale();
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01);
      assertEquals(255, grayPaintScale1.getAlpha());
      assertFalse(boolean0);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01);
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = new GrayPaintScale((-1711.659024920026), 0.0);
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertEquals((-1711.659024920026), grayPaintScale1.getLowerBound(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, grayPaintScale1.getUpperBound(), 0.01);
      assertEquals(255, grayPaintScale1.getAlpha());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 1.0, 206);
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale0);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(206, grayPaintScale0.getAlpha());
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 1.0, 206);
      GrayPaintScale grayPaintScale1 = new GrayPaintScale();
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertEquals(255, grayPaintScale1.getAlpha());
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01);
      assertFalse(boolean0);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01);
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale(1.0, 255.0, 1475);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires alpha in the range 0 to 255.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale((-811), (-471.89862812223737), (-811));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires alpha in the range 0 to 255.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(255, grayPaintScale0.getAlpha());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 1.0, 206);
      GrayPaintScale grayPaintScale1 = (GrayPaintScale)grayPaintScale0.clone();
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertTrue(boolean0);
      assertEquals(206, grayPaintScale1.getAlpha());
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 1.0, 206);
      grayPaintScale0.hashCode();
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(206, grayPaintScale0.getAlpha());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 1.0, 206);
      int int0 = grayPaintScale0.getAlpha();
      assertEquals(206, int0);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      double double0 = grayPaintScale0.getLowerBound();
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(255, grayPaintScale0.getAlpha());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 1.0, 206);
      Color color0 = (Color)grayPaintScale0.getPaint(206);
      boolean boolean0 = grayPaintScale0.equals(color0);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01);
      assertFalse(boolean0);
      assertEquals(206, grayPaintScale0.getAlpha());
      assertEquals((-822083585), color0.getRGB());
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale((-1887.47997764886), (-1887.47997764886));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires lowerBound < upperBound.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }
}
