/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:34:21 GMT 2022
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYDataItem_ESTest extends XYDataItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(Double.NaN, (-1117.6199040501772));
      int int0 = xYDataItem0.compareTo(xYDataItem0);
      assertEquals((-1117.6199040501772), xYDataItem0.getYValue(), 0.01);
      assertEquals(Double.NaN, xYDataItem0.getXValue(), 0.01);
      assertFalse(xYDataItem0.isSelected());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      double double0 = xYDataItem0.getYValue();
      assertEquals(0.0, double0, 0.01);
      assertFalse(xYDataItem0.isSelected());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Float float0 = new Float(734.6716F);
      XYDataItem xYDataItem0 = new XYDataItem((Number) float0, (Number) float0);
      double double0 = xYDataItem0.getYValue();
      assertFalse(xYDataItem0.isSelected());
      assertEquals(734.6715698242188, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-3975.750713972072), (-3975.750713972072));
      xYDataItem0.setY((Number) null);
      xYDataItem0.getY();
      assertFalse(xYDataItem0.isSelected());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Double double0 = new Double(1033.288256962);
      XYDataItem xYDataItem0 = new XYDataItem((Number) double0, (Number) double0);
      xYDataItem0.getY();
      assertFalse(xYDataItem0.isSelected());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      xYDataItem0.getY();
      assertFalse(xYDataItem0.isSelected());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-1.0), (-1.0));
      xYDataItem0.getY();
      assertFalse(xYDataItem0.isSelected());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      xYDataItem0.getXValue();
      assertFalse(xYDataItem0.isSelected());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Double double0 = new Double(1033.288256962);
      XYDataItem xYDataItem0 = new XYDataItem((Number) double0, (Number) double0);
      xYDataItem0.getXValue();
      assertFalse(xYDataItem0.isSelected());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, (-1547.13));
      Number number0 = xYDataItem0.getX();
      assertFalse(xYDataItem0.isSelected());
      assertEquals((-1547.13), xYDataItem0.getYValue(), 0.01);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(Double.NaN, (-1117.6199040501772));
      Number number0 = xYDataItem0.getX();
      assertEquals(Double.NaN, number0);
      assertEquals((-1117.6199040501772), xYDataItem0.getYValue(), 0.01);
      assertFalse(xYDataItem0.isSelected());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(891.830467142, (-895.30576904));
      Number number0 = xYDataItem0.getX();
      assertEquals((-895.30576904), xYDataItem0.getYValue(), 0.01);
      assertFalse(xYDataItem0.isSelected());
      assertEquals(891.830467142, number0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(Double.NaN, (-1117.6199040501772));
      double double0 = xYDataItem0.getYValue();
      assertFalse(xYDataItem0.isSelected());
      assertEquals((-1117.6199040501772), double0, 0.01);
      assertEquals(Double.NaN, xYDataItem0.getXValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-101));
      XYDataItem xYDataItem0 = new XYDataItem((Number) byte0, (Number) byte0);
      xYDataItem0.getX();
      assertFalse(xYDataItem0.isSelected());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Float float0 = new Float((-1239.614931402));
      XYDataItem xYDataItem0 = new XYDataItem((Number) float0, (Number) float0);
      xYDataItem0.getXValue();
      assertFalse(xYDataItem0.isSelected());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Double double0 = new Double(657.251328815144);
      XYDataItem xYDataItem0 = new XYDataItem((Number) double0, (Number) double0);
      xYDataItem0.hashCode();
      assertFalse(xYDataItem0.isSelected());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-1.0), (-1.0));
      xYDataItem0.setY((Number) null);
      xYDataItem0.hashCode();
      assertFalse(xYDataItem0.isSelected());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Double double0 = new Double(657.251328815144);
      XYDataItem xYDataItem0 = new XYDataItem((Number) double0, (Number) double0);
      Object object0 = xYDataItem0.clone();
      xYDataItem0.setSelected(true);
      boolean boolean0 = xYDataItem0.equals(object0);
      assertTrue(xYDataItem0.isSelected());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 1892.2060040682163);
      Object object0 = xYDataItem0.clone();
      assertEquals(1892.2060040682163, xYDataItem0.getYValue(), 0.01);
      
      xYDataItem0.setY(0.0);
      boolean boolean0 = xYDataItem0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Double double0 = new Double(657.251328815144);
      XYDataItem xYDataItem0 = new XYDataItem((Number) double0, (Number) double0);
      XYDataItem xYDataItem1 = new XYDataItem((-2104.49418527), 657.251328815144);
      boolean boolean0 = xYDataItem0.equals(xYDataItem1);
      assertEquals(657.251328815144, xYDataItem1.getYValue(), 0.01);
      assertFalse(boolean0);
      assertFalse(xYDataItem1.isSelected());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Double double0 = new Double(657.251328815144);
      XYDataItem xYDataItem0 = new XYDataItem((Number) double0, (Number) double0);
      XYDataItem xYDataItem1 = (XYDataItem)xYDataItem0.clone();
      boolean boolean0 = xYDataItem0.equals(xYDataItem1);
      assertTrue(boolean0);
      assertFalse(xYDataItem1.isSelected());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, (-1547.13));
      boolean boolean0 = xYDataItem0.equals(xYDataItem0);
      assertEquals(0.0, xYDataItem0.getXValue(), 0.01);
      assertTrue(boolean0);
      assertEquals((-1547.13), xYDataItem0.getYValue(), 0.01);
      assertFalse(xYDataItem0.isSelected());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Integer integer0 = new Integer(321);
      XYDataItem xYDataItem0 = new XYDataItem((Number) integer0, (Number) integer0);
      boolean boolean0 = xYDataItem0.equals("[321.0, 321.0]");
      assertFalse(xYDataItem0.isSelected());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-1.0), (-1.0));
      Byte byte0 = new Byte((byte)8);
      XYDataItem xYDataItem1 = new XYDataItem((Number) byte0, (Number) byte0);
      int int0 = xYDataItem0.compareTo(xYDataItem1);
      assertFalse(xYDataItem1.isSelected());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-1.0), (-1.0));
      XYDataItem xYDataItem1 = new XYDataItem((-214.445072), (-1.0));
      int int0 = xYDataItem0.compareTo(xYDataItem1);
      assertEquals(1, int0);
      assertEquals((-1.0), xYDataItem1.getYValue(), 0.01);
      assertFalse(xYDataItem1.isSelected());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Integer integer0 = new Integer(321);
      XYDataItem xYDataItem0 = new XYDataItem((Number) integer0, (Number) integer0);
      int int0 = xYDataItem0.compareTo("");
      assertEquals(1, int0);
      assertFalse(xYDataItem0.isSelected());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-3975.750713972072), (-3975.750713972072));
      assertEquals((-3975.750713972072), xYDataItem0.getYValue(), 0.01);
      
      xYDataItem0.setY((Number) null);
      double double0 = xYDataItem0.getYValue();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XYDataItem xYDataItem0 = null;
      try {
        xYDataItem0 = new XYDataItem((Number) null, (Number) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'x' argument.
         //
         verifyException("org.jfree.data.xy.XYDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Double double0 = new Double(657.251328815144);
      XYDataItem xYDataItem0 = new XYDataItem((Number) double0, (Number) double0);
      assertFalse(xYDataItem0.isSelected());
      
      xYDataItem0.setSelected(true);
      boolean boolean0 = xYDataItem0.isSelected();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Double double0 = new Double(657.251328815144);
      XYDataItem xYDataItem0 = new XYDataItem((Number) double0, (Number) double0);
      boolean boolean0 = xYDataItem0.isSelected();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-1.3831066980513458), (-1.3831066980513458));
      String string0 = xYDataItem0.toString();
      assertEquals("[-1.3831066980513458, -1.3831066980513458]", string0);
      assertFalse(xYDataItem0.isSelected());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Double double0 = new Double(657.251328815144);
      XYDataItem xYDataItem0 = new XYDataItem((Number) double0, (Number) double0);
      int int0 = xYDataItem0.compareTo(xYDataItem0);
      assertFalse(xYDataItem0.isSelected());
      assertEquals(0, int0);
  }
}
