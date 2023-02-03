/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 00:47:12 GMT 2022
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.Size2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Size2D_ESTest extends Size2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Size2D size2D0 = new Size2D();
      Size2D size2D1 = new Size2D(0.0, 4851.71898249);
      boolean boolean0 = size2D0.equals(size2D1);
      assertEquals(0.0, size2D1.width, 0.01);
      assertEquals(0.0, size2D0.height, 0.01);
      assertFalse(boolean0);
      assertFalse(size2D1.equals((Object)size2D0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Size2D size2D0 = new Size2D(1364.5064359533, (-3837.65877762922));
      Size2D size2D1 = new Size2D();
      boolean boolean0 = size2D0.equals(size2D1);
      assertFalse(boolean0);
      assertEquals(1364.5064359533, size2D0.width, 0.01);
      assertEquals((-3837.65877762922), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Size2D size2D0 = new Size2D();
      size2D0.setWidth((-588.44783827));
      size2D0.toString();
      assertEquals((-588.44783827), size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Size2D size2D0 = new Size2D((-1.0), (-1.0));
      assertEquals((-1.0), size2D0.height, 0.01);
      
      size2D0.setHeight(1.0);
      double double0 = size2D0.getWidth();
      assertEquals(1.0, size2D0.height, 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Size2D size2D0 = new Size2D(936.4715, 936.4715);
      double double0 = size2D0.getWidth();
      assertEquals(936.4715, size2D0.height, 0.01);
      assertEquals(936.4715, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Size2D size2D0 = new Size2D();
      size2D0.height = 2148.5249371;
      double double0 = size2D0.getHeight();
      assertEquals(2148.5249371, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Size2D size2D0 = new Size2D();
      size2D0.setHeight((-1560.5964910384487));
      double double0 = size2D0.getHeight();
      assertEquals((-1560.5964910384487), size2D0.height, 0.01);
      assertEquals((-1560.5964910384487), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Size2D size2D0 = new Size2D();
      Size2D size2D1 = new Size2D(1683.8881034388346, 0.0);
      size2D0.setHeight(1683.8881034388346);
      size2D0.setWidth(1683.8881034388346);
      boolean boolean0 = size2D0.equals(size2D1);
      assertEquals(1683.8881034388346, size2D0.width, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Size2D size2D0 = new Size2D();
      Size2D size2D1 = new Size2D(1683.8881034388346, 0.0);
      size2D0.setWidth(1683.8881034388346);
      boolean boolean0 = size2D0.equals(size2D1);
      assertEquals(1683.8881034388346, size2D0.width, 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Size2D size2D0 = new Size2D();
      boolean boolean0 = size2D0.equals((Object) null);
      assertEquals(0.0, size2D0.width, 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Size2D size2D0 = new Size2D();
      boolean boolean0 = size2D0.equals(size2D0);
      assertEquals(0.0, size2D0.height, 0.01);
      assertEquals(0.0, size2D0.width, 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Size2D size2D0 = new Size2D();
      Size2D size2D1 = new Size2D(1683.8881034388346, 0.0);
      boolean boolean0 = size2D0.equals(size2D1);
      assertEquals(0.0, size2D1.height, 0.01);
      assertFalse(size2D1.equals((Object)size2D0));
      assertEquals(0.0, size2D0.width, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Size2D size2D0 = new Size2D();
      Size2D size2D1 = (Size2D)size2D0.clone();
      assertEquals(0.0, size2D1.height, 0.01);
      assertEquals(0.0, size2D1.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Size2D size2D0 = new Size2D(0.0, 0.0);
      double double0 = size2D0.getWidth();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Size2D size2D0 = new Size2D();
      double double0 = size2D0.getHeight();
      assertEquals(0.0, size2D0.width, 0.01);
      assertEquals(0.0, double0, 0.01);
  }
}