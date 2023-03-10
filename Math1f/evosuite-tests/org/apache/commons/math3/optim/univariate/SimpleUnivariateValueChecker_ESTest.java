/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:08:22 GMT 2022
 */

package org.apache.commons.math3.optim.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker;
import org.apache.commons.math3.optim.univariate.UnivariatePointValuePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleUnivariateValueChecker_ESTest extends SimpleUnivariateValueChecker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleUnivariateValueChecker simpleUnivariateValueChecker0 = new SimpleUnivariateValueChecker((-1562.16), 0.0);
      UnivariatePointValuePair univariatePointValuePair0 = new UnivariatePointValuePair((-1562.16), (-1562.16));
      boolean boolean0 = simpleUnivariateValueChecker0.converged((-2444), univariatePointValuePair0, univariatePointValuePair0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleUnivariateValueChecker simpleUnivariateValueChecker0 = new SimpleUnivariateValueChecker(0.0, 0.0);
      UnivariatePointValuePair univariatePointValuePair0 = new UnivariatePointValuePair((-2035), 0.0);
      boolean boolean0 = simpleUnivariateValueChecker0.converged((-2035), univariatePointValuePair0, univariatePointValuePair0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleUnivariateValueChecker simpleUnivariateValueChecker0 = new SimpleUnivariateValueChecker((-1.0), (-1.0));
      UnivariatePointValuePair univariatePointValuePair0 = new UnivariatePointValuePair((-1), (-1.0));
      boolean boolean0 = simpleUnivariateValueChecker0.converged((-1), univariatePointValuePair0, univariatePointValuePair0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimpleUnivariateValueChecker simpleUnivariateValueChecker0 = new SimpleUnivariateValueChecker((-1912.385697900314), 2644.712530685454, 1836);
      UnivariatePointValuePair univariatePointValuePair0 = new UnivariatePointValuePair(2644.712530685454, 2644.712530685454);
      UnivariatePointValuePair univariatePointValuePair1 = new UnivariatePointValuePair((-1912.385697900314), (-1912.385697900314));
      boolean boolean0 = simpleUnivariateValueChecker0.converged(869, univariatePointValuePair1, univariatePointValuePair0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleUnivariateValueChecker simpleUnivariateValueChecker0 = new SimpleUnivariateValueChecker(0.0, 0.0, 1);
      UnivariatePointValuePair univariatePointValuePair0 = new UnivariatePointValuePair(1, 861);
      boolean boolean0 = simpleUnivariateValueChecker0.converged(861, univariatePointValuePair0, univariatePointValuePair0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimpleUnivariateValueChecker simpleUnivariateValueChecker0 = new SimpleUnivariateValueChecker((-3262.33105), (-3262.33105));
      // Undeclared exception!
      try { 
        simpleUnivariateValueChecker0.converged(297, (UnivariatePointValuePair) null, (UnivariatePointValuePair) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SimpleUnivariateValueChecker simpleUnivariateValueChecker0 = new SimpleUnivariateValueChecker(269.4195036544848, 269.4195036544848);
      UnivariatePointValuePair univariatePointValuePair0 = new UnivariatePointValuePair(269.4195036544848, 269.4195036544848);
      boolean boolean0 = simpleUnivariateValueChecker0.converged(308, univariatePointValuePair0, univariatePointValuePair0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SimpleUnivariateValueChecker simpleUnivariateValueChecker0 = new SimpleUnivariateValueChecker((-1912.385697900314), 2644.712530685454, 1836);
      UnivariatePointValuePair univariatePointValuePair0 = new UnivariatePointValuePair(2644.712530685454, 2644.712530685454);
      boolean boolean0 = simpleUnivariateValueChecker0.converged(1836, univariatePointValuePair0, univariatePointValuePair0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SimpleUnivariateValueChecker simpleUnivariateValueChecker0 = null;
      try {
        simpleUnivariateValueChecker0 = new SimpleUnivariateValueChecker(1.0, 1.0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SimpleUnivariateValueChecker simpleUnivariateValueChecker0 = new SimpleUnivariateValueChecker((-1912.385697900314), 2644.712530685454, 1836);
      UnivariatePointValuePair univariatePointValuePair0 = new UnivariatePointValuePair(2644.712530685454, 2644.712530685454);
      boolean boolean0 = simpleUnivariateValueChecker0.converged(869, univariatePointValuePair0, univariatePointValuePair0);
      assertTrue(boolean0);
  }
}
