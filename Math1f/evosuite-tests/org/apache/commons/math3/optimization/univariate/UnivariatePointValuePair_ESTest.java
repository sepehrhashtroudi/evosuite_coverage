/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:51:33 GMT 2022
 */

package org.apache.commons.math3.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnivariatePointValuePair_ESTest extends UnivariatePointValuePair_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnivariatePointValuePair univariatePointValuePair0 = new UnivariatePointValuePair(0.0, 0.0);
      double double0 = univariatePointValuePair0.getValue();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, univariatePointValuePair0.getPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnivariatePointValuePair univariatePointValuePair0 = new UnivariatePointValuePair(1.0, 1.0);
      double double0 = univariatePointValuePair0.getValue();
      assertEquals(1.0, double0, 0.01);
      assertEquals(1.0, univariatePointValuePair0.getPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UnivariatePointValuePair univariatePointValuePair0 = new UnivariatePointValuePair(0.0, 0.0);
      double double0 = univariatePointValuePair0.getPoint();
      assertEquals(0.0, univariatePointValuePair0.getValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UnivariatePointValuePair univariatePointValuePair0 = new UnivariatePointValuePair(1.0, 1.0);
      double double0 = univariatePointValuePair0.getPoint();
      assertEquals(1.0, univariatePointValuePair0.getValue(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UnivariatePointValuePair univariatePointValuePair0 = new UnivariatePointValuePair((-834.38), (-834.38));
      double double0 = univariatePointValuePair0.getPoint();
      assertEquals((-834.38), double0, 0.01);
      assertEquals((-834.38), univariatePointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UnivariatePointValuePair univariatePointValuePair0 = new UnivariatePointValuePair((-834.38), (-834.38));
      double double0 = univariatePointValuePair0.getValue();
      assertEquals((-834.38), double0, 0.01);
      assertEquals((-834.38), univariatePointValuePair0.getPoint(), 0.01);
  }
}
