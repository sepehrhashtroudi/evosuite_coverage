/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 02:41:11 GMT 2022
 */

package org.jfree.chart.renderer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Point2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.renderer.Outlier;
import org.jfree.chart.renderer.OutlierList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OutlierList_ESTest extends OutlierList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Outlier outlier0 = new Outlier(0.0, 0.0, 0.0);
      OutlierList outlierList0 = new OutlierList(outlier0);
      outlierList0.updateAveragedOutlier();
      outlierList0.add(outlier0);
      outlierList0.add(outlier0);
      outlierList0.updateAveragedOutlier();
      assertEquals(Double.NaN, outlier0.getY(), 0.01);
      assertEquals(Double.NaN, outlier0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Outlier outlier0 = new Outlier((-1.0), (-1.0), 776.0822263);
      OutlierList outlierList0 = new OutlierList(outlier0);
      outlierList0.isOverlapped(outlier0);
      assertFalse(outlierList0.isMultiple());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Outlier outlier0 = new Outlier(1.0, 1.0, 1.0);
      OutlierList outlierList0 = new OutlierList(outlier0);
      assertFalse(outlierList0.isMultiple());
      
      outlierList0.setMultiple(true);
      boolean boolean0 = outlierList0.isMultiple();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Outlier outlier0 = new Outlier(0.0, 0.0, 0.0);
      OutlierList outlierList0 = new OutlierList(outlier0);
      outlierList0.add(outlier0);
      outlierList0.getItemCount();
      assertFalse(outlierList0.isMultiple());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutlierList outlierList0 = new OutlierList((Outlier) null);
      outlierList0.getAveragedOutlier();
      assertFalse(outlierList0.isMultiple());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Outlier outlier0 = new Outlier(0.0, 0.0, 0.0);
      OutlierList outlierList0 = new OutlierList(outlier0);
      outlierList0.updateAveragedOutlier();
      outlierList0.getAveragedOutlier();
      assertEquals(Double.NaN, outlier0.getX(), 0.01);
      assertEquals(Double.NaN, outlier0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Outlier outlier0 = new Outlier((-1.0), (-1.0), 776.0822263);
      OutlierList outlierList0 = new OutlierList(outlier0);
      outlierList0.getAveragedOutlier();
      assertFalse(outlierList0.isMultiple());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Outlier outlier0 = new Outlier(0.0, (-1.0), (-1.0));
      OutlierList outlierList0 = new OutlierList(outlier0);
      outlierList0.getAveragedOutlier();
      assertFalse(outlierList0.isMultiple());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutlierList outlierList0 = new OutlierList((Outlier) null);
      // Undeclared exception!
      try { 
        outlierList0.updateAveragedOutlier();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.OutlierList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Outlier outlier0 = new Outlier(0.0, 0.0, (-1347.9442068));
      OutlierList outlierList0 = new OutlierList(outlier0);
      outlier0.setPoint((Point2D) null);
      // Undeclared exception!
      try { 
        outlierList0.isOverlapped(outlier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Outlier outlier0 = new Outlier((-1.0), (-1.0), 776.0822263);
      OutlierList outlierList0 = new OutlierList(outlier0);
      outlierList0.setAveragedOutlier(outlier0);
      assertFalse(outlierList0.isMultiple());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Outlier outlier0 = new Outlier(0.0, 0.0, 0.0);
      OutlierList outlierList0 = new OutlierList(outlier0);
      outlierList0.getAveragedOutlier();
      assertFalse(outlierList0.isMultiple());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Outlier outlier0 = new Outlier(0.0, 0.0, (-1347.9442068));
      OutlierList outlierList0 = new OutlierList(outlier0);
      outlierList0.getItemCount();
      assertFalse(outlierList0.isMultiple());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutlierList outlierList0 = new OutlierList((Outlier) null);
      boolean boolean0 = outlierList0.isOverlapped((Outlier) null);
      assertFalse(outlierList0.isMultiple());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutlierList outlierList0 = new OutlierList((Outlier) null);
      boolean boolean0 = outlierList0.isMultiple();
      assertFalse(boolean0);
  }
}
