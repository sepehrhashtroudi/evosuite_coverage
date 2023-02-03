/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 22:57:44 GMT 2022
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CategoryAnchor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CategoryAnchor_ESTest extends CategoryAnchor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CategoryAnchor categoryAnchor0 = CategoryAnchor.MIDDLE;
      CategoryAnchor categoryAnchor1 = CategoryAnchor.START;
      boolean boolean0 = categoryAnchor0.equals(categoryAnchor1);
      assertFalse(categoryAnchor1.equals((Object)categoryAnchor0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CategoryAnchor categoryAnchor0 = CategoryAnchor.MIDDLE;
      String string0 = categoryAnchor0.toString();
      assertEquals("CategoryAnchor.MIDDLE", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CategoryAnchor categoryAnchor0 = CategoryAnchor.MIDDLE;
      Object object0 = new Object();
      boolean boolean0 = categoryAnchor0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CategoryAnchor categoryAnchor0 = CategoryAnchor.START;
      boolean boolean0 = categoryAnchor0.equals(categoryAnchor0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CategoryAnchor categoryAnchor0 = CategoryAnchor.MIDDLE;
      CategoryAnchor categoryAnchor1 = CategoryAnchor.END;
      boolean boolean0 = categoryAnchor0.equals(categoryAnchor1);
      assertFalse(categoryAnchor1.equals((Object)categoryAnchor0));
      assertFalse(boolean0);
  }
}