/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:57:29 GMT 2022
 */

package org.apache.commons.math3.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.UnivariateStatistic;
import org.apache.commons.math3.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SynchronizedDescriptiveStatistics_ESTest extends SynchronizedDescriptiveStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics(10);
      synchronizedDescriptiveStatistics0.windowSize = 0;
      int int0 = synchronizedDescriptiveStatistics0.getWindowSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics(1);
      int int0 = synchronizedDescriptiveStatistics0.getWindowSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      synchronizedDescriptiveStatistics0.addValue((-1));
      double[] doubleArray0 = synchronizedDescriptiveStatistics0.getValues();
      assertArrayEquals(new double[] {(-1.0)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics(134217729);
      synchronizedDescriptiveStatistics0.addValue((-4599.9185304));
      synchronizedDescriptiveStatistics0.getStandardDeviation();
      assertEquals(134217729, synchronizedDescriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics(31);
      synchronizedDescriptiveStatistics0.addValue(1825.1258527);
      synchronizedDescriptiveStatistics0.addValue(0.0);
      synchronizedDescriptiveStatistics0.getStandardDeviation();
      assertEquals(31, synchronizedDescriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      synchronizedDescriptiveStatistics0.addValue((-1));
      long long0 = synchronizedDescriptiveStatistics0.getN();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      synchronizedDescriptiveStatistics0.addValue(0.0);
      double double0 = synchronizedDescriptiveStatistics0.getElement(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics(31);
      synchronizedDescriptiveStatistics0.addValue(1825.1258527);
      double double0 = synchronizedDescriptiveStatistics0.getElement(0);
      assertEquals(1825.1258527, double0, 0.01);
      assertEquals(31, synchronizedDescriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      synchronizedDescriptiveStatistics0.addValue((-1));
      double double0 = synchronizedDescriptiveStatistics0.getElement(0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics(10);
      assertEquals(10, synchronizedDescriptiveStatistics0.getWindowSize());
      
      synchronizedDescriptiveStatistics0.windowSize = 0;
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics1 = synchronizedDescriptiveStatistics0.copy();
      assertEquals(0, synchronizedDescriptiveStatistics1.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics(134217729);
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics1 = synchronizedDescriptiveStatistics0.copy();
      assertNotSame(synchronizedDescriptiveStatistics1, synchronizedDescriptiveStatistics0);
      assertEquals(134217729, synchronizedDescriptiveStatistics1.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      SecondMoment secondMoment0 = new SecondMoment();
      secondMoment0.increment((-1));
      double double0 = synchronizedDescriptiveStatistics0.apply(secondMoment0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics(1);
      Product product0 = new Product();
      synchronizedDescriptiveStatistics0.apply(product0);
      assertEquals(1, synchronizedDescriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      UnivariateStatistic univariateStatistic0 = synchronizedDescriptiveStatistics0.getMeanImpl();
      synchronizedDescriptiveStatistics0.addValue((-1));
      double double0 = synchronizedDescriptiveStatistics0.apply(univariateStatistic0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      synchronizedDescriptiveStatistics0.setMaxImpl((UnivariateStatistic) null);
      // Undeclared exception!
      try { 
        synchronizedDescriptiveStatistics0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      try { 
        synchronizedDescriptiveStatistics0.setWindowSize(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // window size must be positive (0)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.DescriptiveStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        SynchronizedDescriptiveStatistics.copy((SynchronizedDescriptiveStatistics) null, (SynchronizedDescriptiveStatistics) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics(1236);
      synchronizedDescriptiveStatistics0.setSumsqImpl((UnivariateStatistic) null);
      // Undeclared exception!
      try { 
        SynchronizedDescriptiveStatistics.copy(synchronizedDescriptiveStatistics0, synchronizedDescriptiveStatistics0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.DescriptiveStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics((-1));
      synchronizedDescriptiveStatistics0.setSumImpl((UnivariateStatistic) null);
      // Undeclared exception!
      try { 
        synchronizedDescriptiveStatistics0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.DescriptiveStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      // Undeclared exception!
      try { 
        synchronizedDescriptiveStatistics0.apply((UnivariateStatistic) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = null;
      try {
        synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics((SynchronizedDescriptiveStatistics) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics(31);
      synchronizedDescriptiveStatistics0.setSumImpl((UnivariateStatistic) null);
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics1 = null;
      try {
        synchronizedDescriptiveStatistics1 = new SynchronizedDescriptiveStatistics(synchronizedDescriptiveStatistics0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.DescriptiveStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = null;
      try {
        synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // window size must be positive (0)
         //
         verifyException("org.apache.commons.math3.stat.descriptive.DescriptiveStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      long long0 = synchronizedDescriptiveStatistics0.getN();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      synchronizedDescriptiveStatistics0.setWindowSize((-1));
      assertEquals((-1), DescriptiveStatistics.INFINITE_WINDOW);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics(1236);
      SynchronizedDescriptiveStatistics.copy(synchronizedDescriptiveStatistics0, synchronizedDescriptiveStatistics0);
      assertEquals(1236, synchronizedDescriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics1 = new SynchronizedDescriptiveStatistics(synchronizedDescriptiveStatistics0);
      assertEquals((-1), synchronizedDescriptiveStatistics1.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      // Undeclared exception!
      try { 
        synchronizedDescriptiveStatistics0.getElement(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      synchronizedDescriptiveStatistics0.toString();
      assertEquals((-1), synchronizedDescriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics1 = synchronizedDescriptiveStatistics0.copy();
      assertEquals((-1), synchronizedDescriptiveStatistics1.getWindowSize());
      assertNotSame(synchronizedDescriptiveStatistics1, synchronizedDescriptiveStatistics0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      int int0 = synchronizedDescriptiveStatistics0.getWindowSize();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      synchronizedDescriptiveStatistics0.clear();
      assertEquals((-1), synchronizedDescriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      synchronizedDescriptiveStatistics0.getValues();
      assertEquals((-1), synchronizedDescriptiveStatistics0.getWindowSize());
  }
}