/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 02:40:16 GMT 2022
 */

package org.apache.commons.math3.optim;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleValueChecker_ESTest extends SimpleValueChecker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker((-1420.3822), 0.0);
      PointValuePair pointValuePair0 = new PointValuePair((double[]) null, 1298);
      boolean boolean0 = simpleValueChecker0.converged(1298, pointValuePair0, pointValuePair0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(0.0, 0.0, 985);
      double[] doubleArray0 = new double[2];
      PointValuePair pointValuePair0 = new PointValuePair(doubleArray0, 0.0, false);
      boolean boolean0 = simpleValueChecker0.converged(0, pointValuePair0, pointValuePair0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker((-384.7709874591), (-384.7709874591), 1);
      double[] doubleArray0 = new double[3];
      PointValuePair pointValuePair0 = new PointValuePair(doubleArray0, (-1746.25437445));
      boolean boolean0 = simpleValueChecker0.converged(1434, pointValuePair0, pointValuePair0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker((-1266.42218), 352.56431, 4428);
      double[] doubleArray0 = new double[9];
      PointValuePair pointValuePair0 = new PointValuePair(doubleArray0, (-1266.42218));
      PointValuePair pointValuePair1 = new PointValuePair(doubleArray0, 4428.0);
      boolean boolean0 = simpleValueChecker0.converged(2012, pointValuePair0, pointValuePair1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      PointValuePair pointValuePair0 = new PointValuePair(doubleArray0, 2147416009);
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(2147416009, 2147416009);
      boolean boolean0 = simpleValueChecker0.converged(2147416009, pointValuePair0, pointValuePair0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker((-1266.42218), 352.56431, 4428);
      double[] doubleArray0 = new double[9];
      PointValuePair pointValuePair0 = new PointValuePair(doubleArray0, (-1266.42218));
      boolean boolean0 = simpleValueChecker0.converged(2012, pointValuePair0, pointValuePair0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SimpleValueChecker simpleValueChecker0 = null;
      try {
        simpleValueChecker0 = new SimpleValueChecker((-1443), (-1443), (-1443));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,443 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.SimpleValueChecker", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker((-1266.42218), 352.56431, 4428);
      double[] doubleArray0 = new double[9];
      PointValuePair pointValuePair0 = new PointValuePair(doubleArray0, (-1266.42218));
      boolean boolean0 = simpleValueChecker0.converged(4428, pointValuePair0, pointValuePair0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(1.0, 3288.132464169);
      // Undeclared exception!
      try { 
        simpleValueChecker0.converged((-1895), (PointValuePair) null, (PointValuePair) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.SimpleValueChecker", e);
      }
  }
}
