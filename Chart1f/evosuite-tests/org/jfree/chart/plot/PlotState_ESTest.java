/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 00:51:43 GMT 2022
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.plot.PlotState;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlotState_ESTest extends PlotState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlotState plotState0 = new PlotState();
      Map map0 = plotState0.getSharedAxisStates();
      assertEquals(0, map0.size());
  }
}