/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:02:17 GMT 2022
 */

package org.jfree.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.renderer.xy.DefaultXYItemRenderer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultXYItemRenderer_ESTest extends DefaultXYItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultXYItemRenderer defaultXYItemRenderer0 = new DefaultXYItemRenderer();
      assertTrue(defaultXYItemRenderer0.getDataBoundsIncludesVisibleSeriesOnly());
  }
}
