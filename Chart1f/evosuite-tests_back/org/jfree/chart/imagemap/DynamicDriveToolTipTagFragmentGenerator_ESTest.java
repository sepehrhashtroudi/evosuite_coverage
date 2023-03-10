/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 00:12:44 GMT 2022
 */

package org.jfree.chart.imagemap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGenerator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynamicDriveToolTipTagFragmentGenerator_ESTest extends DynamicDriveToolTipTagFragmentGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DynamicDriveToolTipTagFragmentGenerator dynamicDriveToolTipTagFragmentGenerator0 = new DynamicDriveToolTipTagFragmentGenerator();
      // Undeclared exception!
      try { 
        dynamicDriveToolTipTagFragmentGenerator0.generateToolTipFragment((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'input' argument.
         //
         verifyException("org.jfree.chart.imagemap.ImageMapUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DynamicDriveToolTipTagFragmentGenerator dynamicDriveToolTipTagFragmentGenerator0 = new DynamicDriveToolTipTagFragmentGenerator("l`n3'Z", 818);
      String string0 = dynamicDriveToolTipTagFragmentGenerator0.generateToolTipFragment("l`n3'Z");
      assertEquals(" onMouseOver=\"return stm(['l`n3\\'Z','l`n3\\'Z'],Style[818]);\" onMouseOut=\"return htm();\"", string0);
  }
}
