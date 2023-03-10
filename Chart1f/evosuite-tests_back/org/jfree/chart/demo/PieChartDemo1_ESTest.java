/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 23:22:45 GMT 2022
 */

package org.jfree.chart.demo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.demo.PieChartDemo1;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PieChartDemo1_ESTest extends PieChartDemo1_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChartPanel chartPanel0 = (ChartPanel)PieChartDemo1.createDemoPanel();
      assertTrue(chartPanel0.isMouseWheelEnabled());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        PieChartDemo1.main(stringArray0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PieChartDemo1 pieChartDemo1_0 = null;
      try {
        pieChartDemo1_0 = new PieChartDemo1(",right=");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
