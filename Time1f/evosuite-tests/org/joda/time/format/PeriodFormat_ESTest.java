/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 02:29:50 GMT 2022
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.format.PeriodFormat;
import org.joda.time.format.PeriodFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PeriodFormat_ESTest extends PeriodFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        PeriodFormat.wordBased((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      PeriodFormatter periodFormatter0 = PeriodFormat.wordBased(locale0);
      assertTrue(periodFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PeriodFormatter periodFormatter0 = PeriodFormat.wordBased();
      assertTrue(periodFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PeriodFormat periodFormat0 = new PeriodFormat();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PeriodFormatter periodFormatter0 = PeriodFormat.getDefault();
      assertTrue(periodFormatter0.isParser());
  }
}
