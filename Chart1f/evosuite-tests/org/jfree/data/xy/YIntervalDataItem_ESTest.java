/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:14:41 GMT 2022
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xy.YIntervalDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class YIntervalDataItem_ESTest extends YIntervalDataItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem((-1.0), (-1.0), (-1.0), (-1.0));
      assertEquals((-1.0), yIntervalDataItem0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(0.0, 0.0, 1430.8, 0.0);
      double double0 = yIntervalDataItem0.getYValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem((-770.530177438), 874.600067, 874.600067, (-770.530177438));
      double double0 = yIntervalDataItem0.getYValue();
      assertEquals(874.600067, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(0.0, 2426.1776921, 0.0, 2426.1776921);
      double double0 = yIntervalDataItem0.getYLowValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(0.0, 0.0, 1430.8, 0.0);
      double double0 = yIntervalDataItem0.getYLowValue();
      assertEquals(1430.8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(81.4335641951884, (-2173.2352203), 0.0, 0.0);
      double double0 = yIntervalDataItem0.getYHighValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(262.4483, (-5625.677237497964), 262.4483, 262.4483);
      double double0 = yIntervalDataItem0.getYHighValue();
      assertEquals(262.4483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(1.0, 1.0, (-3481.093085998131), (-3481.093085998131));
      Double double0 = yIntervalDataItem0.getX();
      assertEquals(1.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(Double.NaN, 0.0, 287.4, 0.0);
      Double double0 = yIntervalDataItem0.getX();
      assertEquals(Double.NaN, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(0.0, 0.0, 1430.8, 0.0);
      Double double0 = yIntervalDataItem0.getX();
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem((-770.530177438), 874.600067, 874.600067, (-770.530177438));
      Double double0 = yIntervalDataItem0.getX();
      assertEquals((-770.530177438), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem((-250.7840894956903), (-250.7840894956903), (-250.7840894956903), (-250.7840894956903));
      double double0 = yIntervalDataItem0.getYHighValue();
      assertEquals((-250.7840894956903), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem((-250.7840894956903), (-250.7840894956903), (-250.7840894956903), (-250.7840894956903));
      double double0 = yIntervalDataItem0.getYLowValue();
      assertEquals((-250.7840894956903), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem((-250.7840894956903), (-250.7840894956903), (-250.7840894956903), (-250.7840894956903));
      double double0 = yIntervalDataItem0.getYValue();
      assertEquals((-250.7840894956903), double0, 0.01);
  }
}
