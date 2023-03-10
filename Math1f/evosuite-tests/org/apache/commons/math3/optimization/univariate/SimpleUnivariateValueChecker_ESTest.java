/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:51:24 GMT 2022
 */

package org.apache.commons.math3.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optimization.univariate.SimpleUnivariateValueChecker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleUnivariateValueChecker_ESTest extends SimpleUnivariateValueChecker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleUnivariateValueChecker simpleUnivariateValueChecker0 = null;
      try {
        simpleUnivariateValueChecker0 = new SimpleUnivariateValueChecker(926.24448394872, 0.0, (-1623));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,623 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.univariate.SimpleUnivariateValueChecker", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleUnivariateValueChecker simpleUnivariateValueChecker0 = new SimpleUnivariateValueChecker((-3204.295531714641), (-3204.295531714641), 27);
      assertEquals((-3204.295531714641), simpleUnivariateValueChecker0.getAbsoluteThreshold(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleUnivariateValueChecker simpleUnivariateValueChecker0 = new SimpleUnivariateValueChecker();
      assertEquals(2.2250738585072014E-306, simpleUnivariateValueChecker0.getAbsoluteThreshold(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimpleUnivariateValueChecker simpleUnivariateValueChecker0 = new SimpleUnivariateValueChecker(27, 27);
      assertEquals(27.0, simpleUnivariateValueChecker0.getRelativeThreshold(), 0.01);
  }
}
