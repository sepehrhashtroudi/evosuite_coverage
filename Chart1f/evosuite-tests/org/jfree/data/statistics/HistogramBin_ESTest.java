/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 20:26:55 GMT 2022
 */

package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.statistics.HistogramBin;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HistogramBin_ESTest extends HistogramBin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-1282.0), 705.62579002);
      HistogramBin histogramBin1 = new HistogramBin((-1282.0), (-1282.0));
      histogramBin1.incrementCount();
      boolean boolean0 = histogramBin0.equals(histogramBin1);
      assertEquals(1, histogramBin1.getCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-3689.062387904), (-3689.062387904));
      HistogramBin histogramBin1 = new HistogramBin(0.0, 0.0);
      boolean boolean0 = histogramBin1.equals(histogramBin0);
      assertFalse(boolean0);
      assertEquals(0, histogramBin1.getCount());
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(0.0, 0.0);
      double double0 = histogramBin0.getStartBoundary();
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(1234.9573665614, 1234.9573665614);
      double double0 = histogramBin0.getStartBoundary();
      assertEquals(0, histogramBin0.getCount());
      assertEquals(1234.9573665614, double0, 0.01);
      assertEquals(1234.9573665614, histogramBin0.getEndBoundary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(2264.97, 2264.97);
      double double0 = histogramBin0.getEndBoundary();
      assertEquals(0, histogramBin0.getCount());
      assertEquals(2264.97, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(2264.97, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-1063.3879596977629), (-1063.3879596977629));
      double double0 = histogramBin0.getEndBoundary();
      assertEquals((-1063.3879596977629), double0, 0.01);
      assertEquals((-1063.3879596977629), histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(0.0, 0.0);
      histogramBin0.incrementCount();
      int int0 = histogramBin0.getCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(0.0, 1007.79993181144);
      double double0 = histogramBin0.getBinWidth();
      assertEquals(1007.79993181144, double0, 0.01);
      assertEquals(0.0, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-10.856406618626151), (-10.856406618626151));
      HistogramBin histogramBin1 = new HistogramBin((-10.856406618626151), (-10.856406618626151));
      boolean boolean0 = histogramBin1.equals(histogramBin0);
      assertTrue(boolean0);
      assertEquals(0.0, histogramBin1.getBinWidth(), 0.01);
      assertEquals(0, histogramBin1.getCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-16.129), (-16.129));
      HistogramBin histogramBin1 = new HistogramBin((-16.129), 0);
      boolean boolean0 = histogramBin0.equals(histogramBin1);
      assertEquals((-16.129), histogramBin1.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin1.getCount());
      assertFalse(histogramBin1.equals((Object)histogramBin0));
      assertFalse(boolean0);
      assertEquals(0.0, histogramBin1.getEndBoundary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-10.856406618626151), (-10.856406618626151));
      HistogramBin histogramBin1 = new HistogramBin(0.0, 0.0);
      boolean boolean0 = histogramBin0.equals(histogramBin1);
      assertFalse(boolean0);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(0, histogramBin1.getCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(2264.97, 2264.97);
      Object object0 = new Object();
      boolean boolean0 = histogramBin0.equals(object0);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-16.129), (-16.129));
      boolean boolean0 = histogramBin0.equals((Object) null);
      assertEquals(0, histogramBin0.getCount());
      assertFalse(boolean0);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(0.0, 0.0);
      boolean boolean0 = histogramBin0.equals(histogramBin0);
      assertTrue(boolean0);
      assertEquals(0.0, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HistogramBin histogramBin0 = null;
      try {
        histogramBin0 = new HistogramBin(1.0, (-89.85));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HistogramBin():  startBoundary > endBoundary.
         //
         verifyException("org.jfree.data.statistics.HistogramBin", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(0.0, 0.0);
      HistogramBin histogramBin1 = (HistogramBin)histogramBin0.clone();
      assertEquals(0, histogramBin1.getCount());
      assertEquals(0.0, histogramBin1.getStartBoundary(), 0.01);
      assertEquals(0.0, histogramBin1.getBinWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(0.0, 0.0);
      double double0 = histogramBin0.getEndBoundary();
      assertEquals(0.0, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-10.856406618626151), (-10.856406618626151));
      double double0 = histogramBin0.getBinWidth();
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-10.856406618626151), (-10.856406618626151));
      double double0 = histogramBin0.getStartBoundary();
      assertEquals((-10.856406618626151), histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals((-10.856406618626151), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(0.0, 0.0);
      histogramBin0.incrementCount();
      HistogramBin histogramBin1 = new HistogramBin(0.0, 0.0);
      boolean boolean0 = histogramBin0.equals(histogramBin1);
      assertEquals(1, histogramBin0.getCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-16.129), (-16.129));
      int int0 = histogramBin0.getCount();
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(0, int0);
  }
}