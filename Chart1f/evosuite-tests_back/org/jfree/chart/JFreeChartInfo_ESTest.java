/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:34:35 GMT 2022
 */

package org.jfree.chart;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.JFreeChartInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JFreeChartInfo_ESTest extends JFreeChartInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JFreeChartInfo jFreeChartInfo0 = new JFreeChartInfo();
      assertEquals("LGPL", jFreeChartInfo0.getLicenceName());
  }
}
