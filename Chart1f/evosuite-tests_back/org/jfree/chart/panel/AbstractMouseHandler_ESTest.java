/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 23:09:07 GMT 2022
 */

package org.jfree.chart.panel;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.event.MouseEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.panel.AbstractMouseHandler;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractMouseHandler_ESTest extends AbstractMouseHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractMouseHandler abstractMouseHandler0 = new AbstractMouseHandler();
      abstractMouseHandler0.setModifier((-2490));
      int int0 = abstractMouseHandler0.getModifier();
      assertEquals((-2490), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AbstractMouseHandler abstractMouseHandler0 = new AbstractMouseHandler();
      abstractMouseHandler0.mouseClicked((MouseEvent) null);
      assertEquals(0, abstractMouseHandler0.getModifier());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AbstractMouseHandler abstractMouseHandler0 = new AbstractMouseHandler();
      abstractMouseHandler0.mouseExited((MouseEvent) null);
      assertEquals(0, abstractMouseHandler0.getModifier());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AbstractMouseHandler abstractMouseHandler0 = new AbstractMouseHandler();
      abstractMouseHandler0.mouseMoved((MouseEvent) null);
      assertEquals(0, abstractMouseHandler0.getModifier());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AbstractMouseHandler abstractMouseHandler0 = new AbstractMouseHandler();
      abstractMouseHandler0.mousePressed((MouseEvent) null);
      assertEquals(0, abstractMouseHandler0.getModifier());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AbstractMouseHandler abstractMouseHandler0 = new AbstractMouseHandler();
      abstractMouseHandler0.setModifier(587);
      int int0 = abstractMouseHandler0.getModifier();
      assertEquals(587, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AbstractMouseHandler abstractMouseHandler0 = new AbstractMouseHandler();
      abstractMouseHandler0.mouseReleased((MouseEvent) null);
      assertEquals(0, abstractMouseHandler0.getModifier());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AbstractMouseHandler abstractMouseHandler0 = new AbstractMouseHandler();
      abstractMouseHandler0.mouseEntered((MouseEvent) null);
      assertEquals(0, abstractMouseHandler0.getModifier());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AbstractMouseHandler abstractMouseHandler0 = new AbstractMouseHandler();
      int int0 = abstractMouseHandler0.getModifier();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      AbstractMouseHandler abstractMouseHandler0 = new AbstractMouseHandler();
      abstractMouseHandler0.mouseDragged((MouseEvent) null);
      assertEquals(0, abstractMouseHandler0.getModifier());
  }
}
