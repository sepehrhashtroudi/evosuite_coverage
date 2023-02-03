/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 00:35:36 GMT 2022
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.SortOrder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SortOrder_ESTest extends SortOrder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SortOrder sortOrder0 = SortOrder.ASCENDING;
      SortOrder sortOrder1 = SortOrder.DESCENDING;
      boolean boolean0 = sortOrder0.equals(sortOrder1);
      assertFalse(sortOrder1.equals((Object)sortOrder0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      String string0 = sortOrder0.toString();
      assertEquals("SortOrder.DESCENDING", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      boolean boolean0 = sortOrder0.equals("u97`j?_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      boolean boolean0 = sortOrder0.equals(sortOrder0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      sortOrder0.hashCode();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      SortOrder sortOrder1 = SortOrder.ASCENDING;
      boolean boolean0 = sortOrder0.equals(sortOrder1);
      assertFalse(boolean0);
      assertFalse(sortOrder1.equals((Object)sortOrder0));
  }
}