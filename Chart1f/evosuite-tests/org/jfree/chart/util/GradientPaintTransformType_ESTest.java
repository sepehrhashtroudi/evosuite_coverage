/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 00:26:38 GMT 2022
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.GradientPaintTransformType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GradientPaintTransformType_ESTest extends GradientPaintTransformType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GradientPaintTransformType gradientPaintTransformType0 = GradientPaintTransformType.CENTER_VERTICAL;
      GradientPaintTransformType gradientPaintTransformType1 = GradientPaintTransformType.VERTICAL;
      boolean boolean0 = gradientPaintTransformType0.equals(gradientPaintTransformType1);
      assertFalse(boolean0);
      assertFalse(gradientPaintTransformType1.equals((Object)gradientPaintTransformType0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GradientPaintTransformType gradientPaintTransformType0 = GradientPaintTransformType.VERTICAL;
      GradientPaintTransformType gradientPaintTransformType1 = GradientPaintTransformType.HORIZONTAL;
      boolean boolean0 = gradientPaintTransformType0.equals(gradientPaintTransformType1);
      assertFalse(gradientPaintTransformType1.equals((Object)gradientPaintTransformType0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GradientPaintTransformType gradientPaintTransformType0 = GradientPaintTransformType.VERTICAL;
      boolean boolean0 = gradientPaintTransformType0.equals(gradientPaintTransformType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GradientPaintTransformType gradientPaintTransformType0 = GradientPaintTransformType.VERTICAL;
      boolean boolean0 = gradientPaintTransformType0.equals("GradientPaintTransformType.VERTICAL");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GradientPaintTransformType gradientPaintTransformType0 = GradientPaintTransformType.VERTICAL;
      gradientPaintTransformType0.hashCode();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GradientPaintTransformType gradientPaintTransformType0 = GradientPaintTransformType.VERTICAL;
      String string0 = gradientPaintTransformType0.toString();
      assertEquals("GradientPaintTransformType.VERTICAL", string0);
  }
}