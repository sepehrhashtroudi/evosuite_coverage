/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 22:43:43 GMT 2022
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.AxisCollection;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.title.Title;
import org.jfree.chart.util.RectangleEdge;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AxisCollection_ESTest extends AxisCollection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AxisCollection axisCollection0 = new AxisCollection();
      NumberAxis numberAxis0 = new NumberAxis();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      axisCollection0.add(numberAxis0, rectangleEdge0);
      List list0 = axisCollection0.getAxesAtTop();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AxisCollection axisCollection0 = new AxisCollection();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge();
      axisCollection0.add(categoryAxis0, rectangleEdge0);
      List list0 = axisCollection0.getAxesAtLeft();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AxisCollection axisCollection0 = new AxisCollection();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      PeriodAxis periodAxis0 = new PeriodAxis("");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(periodAxis0);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge();
      axisCollection0.add(numberAxis3D0, rectangleEdge0);
      List list0 = axisCollection0.getAxesAtBottom();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AxisCollection axisCollection0 = new AxisCollection();
      DateAxis dateAxis0 = new DateAxis();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      RectangleEdge rectangleEdge0 = combinedDomainCategoryPlot0.getRangeAxisEdge(500);
      axisCollection0.add(dateAxis0, rectangleEdge0);
      List list0 = axisCollection0.getAxesAtRight();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AxisCollection axisCollection0 = new AxisCollection();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      // Undeclared exception!
      try { 
        axisCollection0.add(numberAxis3D0, (RectangleEdge) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'edge' argument.
         //
         verifyException("org.jfree.chart.axis.AxisCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AxisCollection axisCollection0 = new AxisCollection();
      RectangleEdge rectangleEdge0 = Title.DEFAULT_POSITION;
      // Undeclared exception!
      try { 
        axisCollection0.add((Axis) null, rectangleEdge0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'axis' argument.
         //
         verifyException("org.jfree.chart.axis.AxisCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AxisCollection axisCollection0 = new AxisCollection();
      List list0 = axisCollection0.getAxesAtBottom();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AxisCollection axisCollection0 = new AxisCollection();
      List list0 = axisCollection0.getAxesAtTop();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AxisCollection axisCollection0 = new AxisCollection();
      List list0 = axisCollection0.getAxesAtRight();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      AxisCollection axisCollection0 = new AxisCollection();
      List list0 = axisCollection0.getAxesAtLeft();
      assertTrue(list0.isEmpty());
  }
}
