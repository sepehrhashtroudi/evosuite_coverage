/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 00:22:48 GMT 2022
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Paint;
import java.awt.SystemColor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.PaintUtilities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PaintUtilities_ESTest extends PaintUtilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Color color0 = new Color(0.0F, 0.0F, 0.0F, 0.0F);
      String string0 = PaintUtilities.colorToString(color0);
      assertEquals("#000000", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.control;
      Color color0 = PaintUtilities.stringToColor("LIGHT_GRAY");
      boolean boolean0 = PaintUtilities.equal(systemColor0, color0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        PaintUtilities.colorToString((Color) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.PaintUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Color color0 = PaintUtilities.stringToColor((String) null);
      assertEquals(0, color0.getGreen());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Color color0 = PaintUtilities.stringToColor("is ");
      assertEquals(0, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.desktop;
      PaintUtilities.colorToString(systemColor0);
      Color color0 = PaintUtilities.stringToColor("is ");
      assertEquals(0, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.window;
      PaintUtilities.colorToString(systemColor0);
      String string0 = PaintUtilities.colorToString(systemColor0);
      assertEquals("WHITE", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.window;
      boolean boolean0 = PaintUtilities.equal(systemColor0, (Paint) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = PaintUtilities.equal((Paint) null, (Paint) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.window;
      boolean boolean0 = PaintUtilities.equal((Paint) null, systemColor0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.desktop;
      GradientPaint gradientPaint0 = new GradientPaint((-976.8795F), (-1481.4F), systemColor0, (-1481.4F), (-1481.4F), systemColor0, true);
      boolean boolean0 = PaintUtilities.equal(gradientPaint0, gradientPaint0);
      assertTrue(boolean0);
  }
}
