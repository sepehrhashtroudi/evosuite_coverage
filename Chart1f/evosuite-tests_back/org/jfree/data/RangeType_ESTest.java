/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 19:59:00 GMT 2022
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.RangeType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RangeType_ESTest extends RangeType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RangeType rangeType0 = RangeType.FULL;
      RangeType rangeType1 = RangeType.NEGATIVE;
      boolean boolean0 = rangeType0.equals(rangeType1);
      assertFalse(boolean0);
      assertFalse(rangeType1.equals((Object)rangeType0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RangeType rangeType0 = RangeType.POSITIVE;
      String string0 = rangeType0.toString();
      assertEquals("RangeType.POSITIVE", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RangeType rangeType0 = RangeType.NEGATIVE;
      boolean boolean0 = rangeType0.equals("org.jfr7e.data.RangeType");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RangeType rangeType0 = RangeType.NEGATIVE;
      boolean boolean0 = rangeType0.equals(rangeType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RangeType rangeType0 = RangeType.NEGATIVE;
      RangeType rangeType1 = RangeType.POSITIVE;
      boolean boolean0 = rangeType0.equals(rangeType1);
      assertFalse(boolean0);
      assertFalse(rangeType1.equals((Object)rangeType0));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RangeType rangeType0 = RangeType.NEGATIVE;
      rangeType0.hashCode();
  }
}
