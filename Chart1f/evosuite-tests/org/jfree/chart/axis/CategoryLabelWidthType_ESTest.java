/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 22:50:46 GMT 2022
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CategoryLabelWidthType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CategoryLabelWidthType_ESTest extends CategoryLabelWidthType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelWidthType categoryLabelWidthType1 = CategoryLabelWidthType.CATEGORY;
      boolean boolean0 = categoryLabelWidthType0.equals(categoryLabelWidthType1);
      assertFalse(categoryLabelWidthType1.equals((Object)categoryLabelWidthType0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      String string0 = categoryLabelWidthType0.toString();
      assertEquals("CategoryLabelWidthType.CATEGORY", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      boolean boolean0 = categoryLabelWidthType0.equals("CategoryLabelWidthType.CATEGORY");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      boolean boolean0 = categoryLabelWidthType0.equals(categoryLabelWidthType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      CategoryLabelWidthType categoryLabelWidthType1 = CategoryLabelWidthType.RANGE;
      boolean boolean0 = categoryLabelWidthType0.equals(categoryLabelWidthType1);
      assertFalse(categoryLabelWidthType1.equals((Object)categoryLabelWidthType0));
      assertFalse(boolean0);
  }
}