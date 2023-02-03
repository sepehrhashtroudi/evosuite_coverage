/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 23:26:29 GMT 2022
 */

package org.jfree.chart.event;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.event.ChartChangeEventType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ChartChangeEventType_ESTest extends ChartChangeEventType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChartChangeEventType chartChangeEventType0 = ChartChangeEventType.DATASET_UPDATED;
      ChartChangeEventType chartChangeEventType1 = ChartChangeEventType.NEW_DATASET;
      boolean boolean0 = chartChangeEventType0.equals(chartChangeEventType1);
      assertFalse(chartChangeEventType1.equals((Object)chartChangeEventType0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChartChangeEventType chartChangeEventType0 = ChartChangeEventType.GENERAL;
      String string0 = chartChangeEventType0.toString();
      assertEquals("ChartChangeEventType.GENERAL", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ChartChangeEventType chartChangeEventType0 = ChartChangeEventType.GENERAL;
      boolean boolean0 = chartChangeEventType0.equals("t");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ChartChangeEventType chartChangeEventType0 = ChartChangeEventType.GENERAL;
      boolean boolean0 = chartChangeEventType0.equals(chartChangeEventType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ChartChangeEventType chartChangeEventType0 = ChartChangeEventType.GENERAL;
      chartChangeEventType0.hashCode();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ChartChangeEventType chartChangeEventType0 = ChartChangeEventType.GENERAL;
      ChartChangeEventType chartChangeEventType1 = ChartChangeEventType.DATASET_UPDATED;
      boolean boolean0 = chartChangeEventType0.equals(chartChangeEventType1);
      assertFalse(chartChangeEventType1.equals((Object)chartChangeEventType0));
      assertFalse(boolean0);
  }
}
