/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:31:10 GMT 2022
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xy.XYInterval;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYInterval_ESTest extends XYInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-2495.632859), (-2495.632859), (-2495.632859), (-2495.632859), (-2495.632859));
      XYInterval xYInterval1 = new XYInterval((-2495.632859), (-2495.632859), (-2495.632859), (-2495.632859), 743.28242327322);
      boolean boolean0 = xYInterval1.equals(xYInterval0);
      assertEquals((-2495.632859), xYInterval1.getYLow(), 0.01);
      assertEquals((-2495.632859), xYInterval0.getYHigh(), 0.01);
      assertEquals((-2495.632859), xYInterval1.getXLow(), 0.01);
      assertEquals((-2495.632859), xYInterval1.getXHigh(), 0.01);
      assertFalse(boolean0);
      assertEquals((-2495.632859), xYInterval1.getY(), 0.01);
      assertFalse(xYInterval0.equals((Object)xYInterval1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, 0.0);
      XYInterval xYInterval1 = new XYInterval(0.0, 0.0, 0.0, (-2482.823), (-244.83488075724));
      boolean boolean0 = xYInterval1.equals(xYInterval0);
      assertEquals(0.0, xYInterval1.getY(), 0.01);
      assertEquals(0.0, xYInterval1.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval1.getXLow(), 0.01);
      assertFalse(boolean0);
      assertEquals((-244.83488075724), xYInterval1.getYHigh(), 0.01);
      assertEquals((-2482.823), xYInterval1.getYLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, 0.0);
      XYInterval xYInterval1 = new XYInterval(0.0, 0.0, (-1834.6241298), (-1834.6241298), (-1834.6241298));
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertEquals(0.0, xYInterval1.getXHigh(), 0.01);
      assertEquals((-1834.6241298), xYInterval1.getYHigh(), 0.01);
      assertEquals((-1834.6241298), xYInterval1.getY(), 0.01);
      assertEquals((-1834.6241298), xYInterval1.getYLow(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, xYInterval1.getXLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-32.2803063557399), (-327.82), 701.62, (-32.2803063557399), (-32.2803063557399));
      XYInterval xYInterval1 = new XYInterval((-32.2803063557399), (-2047.1162097), (-2047.1162097), (-32.2803063557399), (-32.2803063557399));
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertEquals((-32.2803063557399), xYInterval1.getYHigh(), 0.01);
      assertEquals(701.62, xYInterval0.getY(), 0.01);
      assertFalse(boolean0);
      assertEquals((-32.2803063557399), xYInterval1.getXLow(), 0.01);
      assertEquals((-32.2803063557399), xYInterval1.getYLow(), 0.01);
      assertEquals((-327.82), xYInterval0.getXHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(2035.386, 2035.386, 2035.386, 2035.386, 547.5478);
      XYInterval xYInterval1 = new XYInterval((-1.0), 2194.725548161193, 2194.725548161193, 2035.386, 2035.386);
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertEquals(547.5478, xYInterval0.getYHigh(), 0.01);
      assertEquals(2035.386, xYInterval1.getYLow(), 0.01);
      assertEquals(2194.725548161193, xYInterval1.getXHigh(), 0.01);
      assertFalse(boolean0);
      assertEquals(2194.725548161193, xYInterval1.getY(), 0.01);
      assertEquals((-1.0), xYInterval1.getXLow(), 0.01);
      assertEquals(2035.386, xYInterval0.getYLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(1.0, 1.0, 0.0, 1987.476865253027, 1.0);
      double double0 = xYInterval0.getYLow();
      assertEquals(1.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(1.0, xYInterval0.getXLow(), 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals(1987.476865253027, double0, 0.01);
      assertEquals(1.0, xYInterval0.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-1969.0389036127), (-1270.065272763076), (-1270.065272763076), (-645.7), (-1969.0389036127));
      double double0 = xYInterval0.getYLow();
      assertEquals((-1270.065272763076), xYInterval0.getY(), 0.01);
      assertEquals((-1270.065272763076), xYInterval0.getXHigh(), 0.01);
      assertEquals((-1969.0389036127), xYInterval0.getYHigh(), 0.01);
      assertEquals((-645.7), double0, 0.01);
      assertEquals((-1969.0389036127), xYInterval0.getXLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 1631.669, 1631.669, 1631.669, 1631.669);
      double double0 = xYInterval0.getYHigh();
      assertEquals(0.0, xYInterval0.getXLow(), 0.01);
      assertEquals(1631.669, xYInterval0.getY(), 0.01);
      assertEquals(1631.669, xYInterval0.getYLow(), 0.01);
      assertEquals(1631.669, xYInterval0.getXHigh(), 0.01);
      assertEquals(1631.669, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, (-1.0));
      double double0 = xYInterval0.getYHigh();
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals(0.0, xYInterval0.getXLow(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-1719.420159212), 0.0, 1.0, 0.0, 0.0);
      double double0 = xYInterval0.getY();
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
      assertEquals((-1719.420159212), xYInterval0.getXLow(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-1969.0389036127), (-1270.065272763076), (-1270.065272763076), (-645.7), (-1969.0389036127));
      double double0 = xYInterval0.getY();
      assertEquals((-1969.0389036127), xYInterval0.getXLow(), 0.01);
      assertEquals((-645.7), xYInterval0.getYLow(), 0.01);
      assertEquals((-1969.0389036127), xYInterval0.getYHigh(), 0.01);
      assertEquals((-1270.065272763076), double0, 0.01);
      assertEquals((-1270.065272763076), xYInterval0.getXHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, (-1.0));
      double double0 = xYInterval0.getXLow();
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals((-1.0), xYInterval0.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(1.0, 1.0, 0.0, 1987.476865253027, 1.0);
      double double0 = xYInterval0.getXLow();
      assertEquals(1987.476865253027, xYInterval0.getYLow(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals(1.0, xYInterval0.getYHigh(), 0.01);
      assertEquals(1.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(1.0, 1.0, 0.0, 1987.476865253027, 1.0);
      double double0 = xYInterval0.getXHigh();
      assertEquals(1.0, double0, 0.01);
      assertEquals(1987.476865253027, xYInterval0.getYLow(), 0.01);
      assertEquals(1.0, xYInterval0.getYHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals(1.0, xYInterval0.getXLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-410.2673), (-410.2673), (-410.2673), (-410.2673), (-410.2673));
      double double0 = xYInterval0.getXHigh();
      assertEquals((-410.2673), xYInterval0.getYHigh(), 0.01);
      assertEquals((-410.2673), double0, 0.01);
      assertEquals((-410.2673), xYInterval0.getY(), 0.01);
      assertEquals((-410.2673), xYInterval0.getXLow(), 0.01);
      assertEquals((-410.2673), xYInterval0.getYLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-2495.632859), (-2495.632859), (-2495.632859), (-2495.632859), (-2495.632859));
      XYInterval xYInterval1 = new XYInterval((-2495.632859), (-2495.632859), (-2495.632859), (-2495.632859), 743.28242327322);
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertEquals((-2495.632859), xYInterval1.getYLow(), 0.01);
      assertFalse(xYInterval1.equals((Object)xYInterval0));
      assertEquals((-2495.632859), xYInterval1.getXHigh(), 0.01);
      assertEquals((-2495.632859), xYInterval0.getYHigh(), 0.01);
      assertFalse(boolean0);
      assertEquals((-2495.632859), xYInterval1.getXLow(), 0.01);
      assertEquals((-2495.632859), xYInterval1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, 0.0);
      XYInterval xYInterval1 = new XYInterval(0.0, 0.0, 0.0, (-2482.823), (-244.83488075724));
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertEquals(0.0, xYInterval1.getXHigh(), 0.01);
      assertFalse(boolean0);
      assertEquals((-244.83488075724), xYInterval1.getYHigh(), 0.01);
      assertEquals((-2482.823), xYInterval1.getYLow(), 0.01);
      assertEquals(0.0, xYInterval1.getXLow(), 0.01);
      assertEquals(0.0, xYInterval1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-1719.420159212), 0.0, 0.0, 0.0, 0.0);
      XYInterval xYInterval1 = new XYInterval((-1719.420159212), 0.0, 1.0, 0.0, 0.0);
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertEquals(0.0, xYInterval1.getYLow(), 0.01);
      assertEquals(0.0, xYInterval1.getYHigh(), 0.01);
      assertEquals(1.0, xYInterval1.getY(), 0.01);
      assertEquals(0.0, xYInterval1.getXHigh(), 0.01);
      assertFalse(xYInterval1.equals((Object)xYInterval0));
      assertFalse(boolean0);
      assertEquals((-1719.420159212), xYInterval1.getXLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-410.2673), (-410.2673), (-410.2673), (-410.2673), (-410.2673));
      XYInterval xYInterval1 = new XYInterval((-410.2673), 0.0, (-410.2673), 0.0, (-410.2673));
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertEquals((-410.2673), xYInterval1.getYHigh(), 0.01);
      assertEquals(0.0, xYInterval1.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval1.getYLow(), 0.01);
      assertEquals((-410.2673), xYInterval1.getXLow(), 0.01);
      assertEquals((-410.2673), xYInterval1.getY(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, (-1.0));
      XYInterval xYInterval1 = new XYInterval(128.37495, 0.0, 1.0, 276.1273, (-1.0));
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertFalse(boolean0);
      assertEquals(1.0, xYInterval1.getY(), 0.01);
      assertEquals((-1.0), xYInterval1.getYHigh(), 0.01);
      assertEquals(0.0, xYInterval1.getXHigh(), 0.01);
      assertEquals(128.37495, xYInterval1.getXLow(), 0.01);
      assertEquals(276.1273, xYInterval1.getYLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, (-1.0));
      XYInterval xYInterval1 = new XYInterval(0.0, 0.0, 0.0, 0.0, (-1.0));
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertEquals(0.0, xYInterval1.getXHigh(), 0.01);
      assertTrue(boolean0);
      assertEquals((-1.0), xYInterval1.getYHigh(), 0.01);
      assertEquals(0.0, xYInterval1.getY(), 0.01);
      assertEquals(0.0, xYInterval1.getYLow(), 0.01);
      assertEquals(0.0, xYInterval1.getXLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-1969.0389036127), (-1270.065272763076), (-1270.065272763076), (-645.7), (-1969.0389036127));
      boolean boolean0 = xYInterval0.equals(xYInterval0);
      assertEquals((-1969.0389036127), xYInterval0.getYHigh(), 0.01);
      assertEquals((-1270.065272763076), xYInterval0.getY(), 0.01);
      assertTrue(boolean0);
      assertEquals((-645.7), xYInterval0.getYLow(), 0.01);
      assertEquals((-1270.065272763076), xYInterval0.getXHigh(), 0.01);
      assertEquals((-1969.0389036127), xYInterval0.getXLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-1719.420159212), 0.0, 0.0, 0.0, 0.0);
      boolean boolean0 = xYInterval0.equals((Object) null);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYHigh(), 0.01);
      assertEquals((-1719.420159212), xYInterval0.getXLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-1719.420159212), 0.0, 0.0, 0.0, 0.0);
      double double0 = xYInterval0.getYHigh();
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals((-1719.420159212), xYInterval0.getXLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-1719.420159212), 0.0, 0.0, 0.0, 0.0);
      double double0 = xYInterval0.getY();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, xYInterval0.getYHigh(), 0.01);
      assertEquals((-1719.420159212), xYInterval0.getXLow(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-1719.420159212), 0.0, 0.0, 0.0, 0.0);
      double double0 = xYInterval0.getXLow();
      assertEquals((-1719.420159212), double0, 0.01);
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-1719.420159212), 0.0, 0.0, 0.0, 0.0);
      double double0 = xYInterval0.getXHigh();
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1719.420159212), xYInterval0.getXLow(), 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals(0.0, xYInterval0.getYHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-1719.420159212), 0.0, 0.0, 0.0, 0.0);
      double double0 = xYInterval0.getYLow();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals(0.0, xYInterval0.getYHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals((-1719.420159212), xYInterval0.getXLow(), 0.01);
  }
}
