/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:45:36 GMT 2022
 */

package org.apache.commons.math3.optimization.fitting;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.optimization.fitting.WeightedObservedPoint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WeightedObservedPoint_ESTest extends WeightedObservedPoint_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(231.128070649649, 0.0, 0.0);
      double double0 = weightedObservedPoint0.getY();
      assertEquals(0.0, double0, 0.01);
      assertEquals(231.128070649649, weightedObservedPoint0.getWeight(), 0.01);
      assertEquals(0.0, weightedObservedPoint0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, 3754.4080154, 3754.4080154);
      double double0 = weightedObservedPoint0.getY();
      assertEquals(3754.4080154, weightedObservedPoint0.getX(), 0.01);
      assertEquals(0.0, weightedObservedPoint0.getWeight(), 0.01);
      assertEquals(3754.4080154, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(231.128070649649, 0.0, 0.0);
      double double0 = weightedObservedPoint0.getX();
      assertEquals(0.0, weightedObservedPoint0.getY(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(231.128070649649, weightedObservedPoint0.getWeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, (-1654.7415085929038), (-1654.7415085929038));
      double double0 = weightedObservedPoint0.getX();
      assertEquals((-1654.7415085929038), weightedObservedPoint0.getY(), 0.01);
      assertEquals(0.0, weightedObservedPoint0.getWeight(), 0.01);
      assertEquals((-1654.7415085929038), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, (-1654.7415085929038), (-1654.7415085929038));
      double double0 = weightedObservedPoint0.getWeight();
      assertEquals((-1654.7415085929038), weightedObservedPoint0.getY(), 0.01);
      assertEquals((-1654.7415085929038), weightedObservedPoint0.getX(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(1.0, 1.0, 0.0);
      double double0 = weightedObservedPoint0.getWeight();
      assertEquals(0.0, weightedObservedPoint0.getY(), 0.01);
      assertEquals(1.0, weightedObservedPoint0.getX(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, (-1654.7415085929038), (-1654.7415085929038));
      double double0 = weightedObservedPoint0.getY();
      assertEquals((-1654.7415085929038), weightedObservedPoint0.getX(), 0.01);
      assertEquals(0.0, weightedObservedPoint0.getWeight(), 0.01);
      assertEquals((-1654.7415085929038), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-3681.396524835553), 2635.6129748598, (-1.0));
      double double0 = weightedObservedPoint0.getX();
      assertEquals((-3681.396524835553), weightedObservedPoint0.getWeight(), 0.01);
      assertEquals(2635.6129748598, double0, 0.01);
      assertEquals((-1.0), weightedObservedPoint0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-1527.199581181), (-570.91231), 0.0);
      double double0 = weightedObservedPoint0.getWeight();
      assertEquals((-570.91231), weightedObservedPoint0.getX(), 0.01);
      assertEquals((-1527.199581181), double0, 0.01);
      assertEquals(0.0, weightedObservedPoint0.getY(), 0.01);
  }
}
