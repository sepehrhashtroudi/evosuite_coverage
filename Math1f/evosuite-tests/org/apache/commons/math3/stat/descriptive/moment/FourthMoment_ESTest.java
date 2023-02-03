/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:38:47 GMT 2022
 */

package org.apache.commons.math3.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.stat.descriptive.moment.FourthMoment;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FourthMoment_ESTest extends FourthMoment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      fourthMoment0.increment(153.0);
      fourthMoment0.increment(4.0);
      fourthMoment0.increment(4.0);
      assertEquals(1.0952986688888888E8, fourthMoment0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      FourthMoment.copy(fourthMoment0, fourthMoment0);
      assertEquals(Double.NaN, fourthMoment0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      fourthMoment0.increment((-833.8798));
      double double0 = fourthMoment0.getResult();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      fourthMoment0.increment(153.0);
      fourthMoment0.increment(4.0);
      double double0 = fourthMoment0.getResult();
      assertEquals(6.1610550125E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      assertEquals(Double.NaN, fourthMoment0.getResult(), 0.01);
      
      fourthMoment0.increment(0.0);
      fourthMoment0.copy();
      assertEquals(0.0, fourthMoment0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FourthMoment fourthMoment0 = null;
      try {
        fourthMoment0 = new FourthMoment((FourthMoment) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      try { 
        FourthMoment.copy((FourthMoment) null, (FourthMoment) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      fourthMoment0.increment(Double.NaN);
      fourthMoment0.increment(Double.NaN);
      assertEquals(Double.NaN, fourthMoment0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      fourthMoment0.clear();
      assertEquals(Double.NaN, fourthMoment0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      FourthMoment fourthMoment1 = fourthMoment0.copy();
      assertEquals(Double.NaN, fourthMoment1.getResult(), 0.01);
      assertNotSame(fourthMoment1, fourthMoment0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      FourthMoment fourthMoment1 = new FourthMoment(fourthMoment0);
      assertEquals(Double.NaN, fourthMoment1.getResult(), 0.01);
  }
}
