/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 23:07:55 GMT 2022
 */

package org.apache.commons.math3.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.MathIllegalNumberException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumberIsTooSmallException_ESTest extends NumberIsTooSmallException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.NOT_POSITIVE_SCALE;
      NumberIsTooSmallException numberIsTooSmallException0 = new NumberIsTooSmallException(localizedFormats0, (Number) null, (Number) null, false);
      numberIsTooSmallException0.getMin();
      assertFalse(numberIsTooSmallException0.getBoundIsAllowed());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.OBJECT_TRANSFORMATION;
      Double double0 = new Double((-1321.404469208371));
      NumberIsTooSmallException numberIsTooSmallException0 = new NumberIsTooSmallException(localizedFormats0, double0, double0, true);
      numberIsTooSmallException0.getMin();
      assertTrue(numberIsTooSmallException0.getBoundIsAllowed());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.INFINITE_BOUND;
      Integer integer0 = MathIllegalNumberException.INTEGER_ZERO;
      NumberIsTooSmallException numberIsTooSmallException0 = new NumberIsTooSmallException(localizedFormats0, integer0, integer0, false);
      numberIsTooSmallException0.getMin();
      assertFalse(numberIsTooSmallException0.getBoundIsAllowed());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Double double0 = new Double(1.0);
      NumberIsTooSmallException numberIsTooSmallException0 = new NumberIsTooSmallException(double0, double0, false);
      numberIsTooSmallException0.getMin();
      assertFalse(numberIsTooSmallException0.getBoundIsAllowed());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer(19);
      NumberIsTooSmallException numberIsTooSmallException0 = new NumberIsTooSmallException(integer0, integer0, false);
      boolean boolean0 = numberIsTooSmallException0.getBoundIsAllowed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Float float0 = new Float(1140.2F);
      NumberIsTooSmallException numberIsTooSmallException0 = new NumberIsTooSmallException(float0, float0, true);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.REAL_FORMAT;
      Float float0 = new Float((-4.1752340345120595));
      NumberIsTooSmallException numberIsTooSmallException0 = new NumberIsTooSmallException(localizedFormats0, float0, float0, true);
      boolean boolean0 = numberIsTooSmallException0.getBoundIsAllowed();
      assertTrue(boolean0);
  }
}
