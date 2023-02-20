/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 17:56:27 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckLevel_ESTest extends CheckLevel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CheckLevel[] checkLevelArray0 = CheckLevel.values();
      assertEquals(3, checkLevelArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.valueOf("OFF");
      assertEquals(CheckLevel.OFF, checkLevel0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      boolean boolean0 = checkLevel0.isOn();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.OFF;
      boolean boolean0 = checkLevel0.isOn();
      assertFalse(boolean0);
  }
}
