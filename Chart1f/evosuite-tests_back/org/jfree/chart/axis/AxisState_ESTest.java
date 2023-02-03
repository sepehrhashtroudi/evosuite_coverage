/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 22:14:25 GMT 2022
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.AxisState;
import org.jfree.chart.util.RectangleEdge;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AxisState_ESTest extends AxisState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AxisState axisState0 = new AxisState();
      axisState0.setTicks((List) null);
      axisState0.getTicks();
      assertEquals(0.0, axisState0.getCursor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AxisState axisState0 = new AxisState(924.6384512);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) axisState0);
      axisState0.setTicks(linkedList0);
      axisState0.getTicks();
      assertEquals(924.6384512, axisState0.getCursor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AxisState axisState0 = new AxisState();
      axisState0.setMax(143.4238999078141);
      double double0 = axisState0.getMax();
      assertEquals(143.4238999078141, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AxisState axisState0 = new AxisState();
      axisState0.setMax((-428.469875288));
      double double0 = axisState0.getMax();
      assertEquals((-428.469875288), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AxisState axisState0 = new AxisState();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      axisState0.moveCursor(1560.9, rectangleEdge1);
      double double0 = axisState0.getCursor();
      assertEquals(1560.9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AxisState axisState0 = new AxisState();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      axisState0.moveCursor(2121.885, rectangleEdge0);
      double double0 = axisState0.getCursor();
      assertEquals((-2121.885), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AxisState axisState0 = new AxisState();
      axisState0.cursorUp(1391.301);
      assertEquals((-1391.301), axisState0.getCursor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AxisState axisState0 = new AxisState();
      axisState0.cursorRight((-222.3732200000004));
      assertEquals((-222.3732200000004), axisState0.getCursor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AxisState axisState0 = new AxisState(924.6384512);
      axisState0.cursorLeft(924.6384512);
      assertEquals(0.0, axisState0.getCursor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AxisState axisState0 = new AxisState(924.6384512);
      axisState0.cursorDown(0.0);
      assertEquals(924.6384512, axisState0.getCursor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AxisState axisState0 = new AxisState();
      axisState0.moveCursor(0.030316711537647256, (RectangleEdge) null);
      assertEquals(0.0, axisState0.getCursor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AxisState axisState0 = new AxisState();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      axisState0.moveCursor(0.0, rectangleEdge0);
      assertEquals(0.0, axisState0.getCursor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AxisState axisState0 = new AxisState();
      axisState0.setCursor((-39.87145));
      assertEquals((-39.87145), axisState0.getCursor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AxisState axisState0 = new AxisState();
      double double0 = axisState0.getMax();
      assertEquals(0.0, axisState0.getCursor(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AxisState axisState0 = new AxisState();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      axisState0.moveCursor((-39.87145), rectangleEdge0);
      assertEquals(39.87145, axisState0.getCursor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AxisState axisState0 = new AxisState();
      double double0 = axisState0.getCursor();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AxisState axisState0 = new AxisState();
      List list0 = axisState0.getTicks();
      axisState0.setTicks(list0);
      assertEquals(0.0, axisState0.getCursor(), 0.01);
  }
}