/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 20:27:32 GMT 2022
 */

package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.statistics.MeanAndStandardDeviation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MeanAndStandardDeviation_ESTest extends MeanAndStandardDeviation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation(1.0, 0.0);
      assertEquals(1.0, meanAndStandardDeviation0.getMeanValue(), 0.01);
      assertEquals(0.0, meanAndStandardDeviation0.getStandardDeviationValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Float float0 = new Float(0.0);
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) float0, (Number) float0);
      double double0 = meanAndStandardDeviation0.getStandardDeviationValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Float float0 = new Float((-2498.725496087));
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) float0, (Number) float0);
      double double0 = meanAndStandardDeviation0.getStandardDeviationValue();
      assertEquals((-2498.7255859375), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) null, (Number) null);
      Number number0 = meanAndStandardDeviation0.getStandardDeviation();
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Double double0 = new Double((-1048.7899158));
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) double0, (Number) double0);
      Number number0 = meanAndStandardDeviation0.getStandardDeviation();
      assertEquals((-1048.7899158), number0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Float float0 = new Float(0.0);
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) float0, (Number) float0);
      Number number0 = meanAndStandardDeviation0.getStandardDeviation();
      assertEquals(0.0F, number0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation(1.0, 1.0);
      Number number0 = meanAndStandardDeviation0.getStandardDeviation();
      assertEquals(1.0, number0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation(0.0, 2462.0);
      double double0 = meanAndStandardDeviation0.getMeanValue();
      assertEquals(0.0, double0, 0.01);
      assertEquals(2462.0, meanAndStandardDeviation0.getStandardDeviationValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation(1.0, 1.0);
      double double0 = meanAndStandardDeviation0.getMeanValue();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Float float0 = new Float(0.0);
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) float0, (Number) float0);
      Number number0 = meanAndStandardDeviation0.getMean();
      assertEquals(0.0F, number0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Byte byte0 = new Byte((byte)56);
      Long long0 = new Long((byte)56);
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) byte0, (Number) long0);
      Number number0 = meanAndStandardDeviation0.getMean();
      assertEquals((byte)56, number0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-1));
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) byte0, (Number) byte0);
      Number number0 = meanAndStandardDeviation0.getMean();
      assertEquals((byte) (-1), number0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((-1.0), (-1.0));
      MeanAndStandardDeviation meanAndStandardDeviation1 = new MeanAndStandardDeviation((-1.0), (-2299.6491318217163));
      boolean boolean0 = meanAndStandardDeviation1.equals(meanAndStandardDeviation0);
      assertFalse(boolean0);
      assertEquals((-1.0), meanAndStandardDeviation1.getMeanValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = new Integer(2269);
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) integer0, (Number) integer0);
      MeanAndStandardDeviation meanAndStandardDeviation1 = new MeanAndStandardDeviation((Number) integer0, (Number) integer0);
      boolean boolean0 = meanAndStandardDeviation0.equals(meanAndStandardDeviation1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((-1.0), (-1.0));
      boolean boolean0 = meanAndStandardDeviation0.equals("[-1.0, -2299.6491318217163]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) null, (Number) null);
      boolean boolean0 = meanAndStandardDeviation0.equals(meanAndStandardDeviation0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Integer integer0 = new Integer(2269);
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) integer0, (Number) integer0);
      MeanAndStandardDeviation meanAndStandardDeviation1 = new MeanAndStandardDeviation((double) integer0, (double) 2269);
      boolean boolean0 = meanAndStandardDeviation0.equals(meanAndStandardDeviation1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = new Integer(2269);
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) integer0, (Number) integer0);
      double double0 = meanAndStandardDeviation0.getStandardDeviationValue();
      assertEquals(2269.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) null, (Number) null);
      double double0 = meanAndStandardDeviation0.getStandardDeviationValue();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((-1.0), (-1.0));
      double double0 = meanAndStandardDeviation0.getMeanValue();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) null, (Number) null);
      double double0 = meanAndStandardDeviation0.getMeanValue();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) null, (Number) null);
      Number number0 = meanAndStandardDeviation0.getMean();
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((-1.0), (-1.0));
      String string0 = meanAndStandardDeviation0.toString();
      assertEquals("[-1.0, -1.0]", string0);
  }
}
