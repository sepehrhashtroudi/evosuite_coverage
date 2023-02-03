/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 00:12:09 GMT 2022
 */

package org.jfree.chart.imagemap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StandardToolTipTagFragmentGenerator_ESTest extends StandardToolTipTagFragmentGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StandardToolTipTagFragmentGenerator standardToolTipTagFragmentGenerator0 = new StandardToolTipTagFragmentGenerator();
      // Undeclared exception!
      try { 
        standardToolTipTagFragmentGenerator0.generateToolTipFragment((String) null);
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
      StandardToolTipTagFragmentGenerator standardToolTipTagFragmentGenerator0 = new StandardToolTipTagFragmentGenerator();
      String string0 = standardToolTipTagFragmentGenerator0.generateToolTipFragment("6e-7[LUW.%3c");
      assertEquals(" title=\"6e-7[LUW.%3c\" alt=\"\"", string0);
  }
}