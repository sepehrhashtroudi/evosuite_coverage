/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:22:03 GMT 2022
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xy.Vector;
import org.jfree.data.xy.VectorDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VectorDataItem_ESTest extends VectorDataItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem((-175.787), (-175.787), (-175.787), (-1.0));
      assertEquals((-175.787), vectorDataItem0.getYValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(0.0, 0.0, 0.0, 0.0);
      double double0 = vectorDataItem0.getYValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(0.0, 3436.1448, (-465.172), 0.0);
      double double0 = vectorDataItem0.getYValue();
      assertEquals(3436.1448, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(0.0, 0.0, 0.0, 0.0);
      double double0 = vectorDataItem0.getXValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(542.32595343, 542.32595343, (-1701.06), (-1701.06));
      double double0 = vectorDataItem0.getXValue();
      assertEquals(542.32595343, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(0.0, 0.0, 0.0, 0.0);
      double double0 = vectorDataItem0.getVectorY();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(1686.152773428, 1686.152773428, 1686.152773428, 664.3478);
      double double0 = vectorDataItem0.getVectorY();
      assertEquals(664.3478, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(1473.756318157328, 0.0, 0.0, 0.0);
      double double0 = vectorDataItem0.getVectorX();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(3539.2, 3539.2, 3539.2, 0.0);
      double double0 = vectorDataItem0.getVectorX();
      assertEquals(3539.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem((-79.0), (-79.0), (-79.0), 1.0);
      Vector vector0 = vectorDataItem0.getVector();
      assertEquals((-79.0), vector0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(1473.756318157328, 0.0, 0.0, 0.0);
      Vector vector0 = vectorDataItem0.getVector();
      assertEquals(0.0, vector0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem((-1409.465632317633), Double.NaN, Double.NaN, (-1409.465632317633));
      Vector vector0 = vectorDataItem0.getVector();
      assertEquals(Double.NaN, vector0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem((-81.77560563766713), (-81.77560563766713), (-81.77560563766713), (-81.77560563766713));
      double double0 = vectorDataItem0.getVectorY();
      assertEquals((-81.77560563766713), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem((-81.77560563766713), (-81.77560563766713), (-81.77560563766713), (-81.77560563766713));
      double double0 = vectorDataItem0.getVectorX();
      assertEquals((-81.77560563766713), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem((-81.77560563766713), (-81.77560563766713), (-81.77560563766713), (-81.77560563766713));
      double double0 = vectorDataItem0.getXValue();
      assertEquals((-81.77560563766713), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem((-81.77560563766713), (-81.77560563766713), (-81.77560563766713), (-81.77560563766713));
      double double0 = vectorDataItem0.getYValue();
      assertEquals((-81.77560563766713), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem((-81.77560563766713), (-81.77560563766713), (-81.77560563766713), (-81.77560563766713));
      Vector vector0 = vectorDataItem0.getVector();
      assertEquals((-81.77560563766713), vector0.getX(), 0.01);
  }
}
