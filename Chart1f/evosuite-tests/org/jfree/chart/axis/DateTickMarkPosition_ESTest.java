/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 22:22:18 GMT 2022
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.DateTickMarkPosition;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTickMarkPosition_ESTest extends DateTickMarkPosition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTickMarkPosition dateTickMarkPosition0 = DateTickMarkPosition.END;
      DateTickMarkPosition dateTickMarkPosition1 = DateTickMarkPosition.START;
      boolean boolean0 = dateTickMarkPosition1.equals(dateTickMarkPosition0);
      assertFalse(dateTickMarkPosition0.equals((Object)dateTickMarkPosition1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTickMarkPosition dateTickMarkPosition0 = DateTickMarkPosition.START;
      String string0 = dateTickMarkPosition0.toString();
      assertEquals("DateTickMarkPosition.START", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTickMarkPosition dateTickMarkPosition0 = DateTickMarkPosition.END;
      boolean boolean0 = dateTickMarkPosition0.equals("&g/9-DNjNo?PT#'6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTickMarkPosition dateTickMarkPosition0 = DateTickMarkPosition.END;
      boolean boolean0 = dateTickMarkPosition0.equals(dateTickMarkPosition0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTickMarkPosition dateTickMarkPosition0 = DateTickMarkPosition.END;
      DateTickMarkPosition dateTickMarkPosition1 = DateTickMarkPosition.START;
      boolean boolean0 = dateTickMarkPosition0.equals(dateTickMarkPosition1);
      assertFalse(boolean0);
      assertFalse(dateTickMarkPosition1.equals((Object)dateTickMarkPosition0));
  }
}
