/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 22:11:52 GMT 2022
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.util.RectangleEdge;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AxisSpace_ESTest extends AxisSpace_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setRight((-2733.379896984));
      axisSpace0.toString();
      assertEquals((-2733.379896984), axisSpace0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      
      axisSpace0.setLeft((-2733.379896984));
      axisSpace0.toString();
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      
      axisSpace0.setBottom((-1.0));
      axisSpace0.hashCode();
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      axisSpace0.add(197.88, rectangleEdge1);
      axisSpace0.toString();
      assertEquals(197.88, axisSpace0.getBottom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setTop((-197.88));
      axisSpace0.hashCode();
      assertEquals((-197.88), axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      AxisSpace axisSpace1 = new AxisSpace();
      assertEquals(0.0, axisSpace1.getRight(), 0.01);
      
      axisSpace1.setRight((-1.0));
      boolean boolean0 = axisSpace1.equals(axisSpace0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Object object0 = axisSpace0.clone();
      axisSpace0.setBottom((-555.423345617));
      boolean boolean0 = axisSpace0.equals(object0);
      assertEquals((-555.423345617), axisSpace0.getBottom(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      axisSpace0.add((-996.974), rectangleEdge0);
      AxisSpace axisSpace1 = new AxisSpace();
      boolean boolean0 = axisSpace0.equals(axisSpace1);
      assertEquals((-996.974), axisSpace0.getTop(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-122.63461298174), (-122.63461298174), 1464.1247, (-122.63461298174));
      axisSpace0.setRight((-952.5116838));
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      axisSpace0.reserved(rectangle2D_Double0, rectangleEdge0);
      assertEquals((-952.5116838), axisSpace0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      axisSpace0.add(580.9, rectangleEdge0);
      axisSpace0.reserved(rectangle2D_Float0, rectangleEdge1);
      assertEquals(580.9, axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      
      axisSpace0.setBottom((-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      Point point0 = new Point();
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      Rectangle2D rectangle2D0 = axisSpace0.reserved(rectangle0, rectangleEdge0);
      axisSpace0.expand(rectangle2D0, rectangle2D0);
      assertEquals(0.0, rectangle2D0.getMinY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setTop(520.9426);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      axisSpace0.expand(rectangle0, rectangle2D_Double0);
      assertEquals(520.9426, axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      axisSpace0.add(520.9426, rectangleEdge0);
      axisSpace0.ensureAtLeast(198.46218845803, rectangleEdge0);
      assertEquals(520.9426, axisSpace0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      axisSpace0.ensureAtLeast((-926.0729417), rectangleEdge0);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      axisSpace0.ensureAtLeast((-1.0), rectangleEdge1);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      axisSpace0.ensureAtLeast((-1015.501621339015), rectangleEdge0);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      AxisSpace axisSpace1 = new AxisSpace();
      axisSpace1.ensureAtLeast(axisSpace0);
      assertEquals(0.0, axisSpace1.getRight(), 0.01);
      assertEquals(0.0, axisSpace1.getLeft(), 0.01);
      assertEquals(0.0, axisSpace1.getBottom(), 0.01);
      assertEquals(0.0, axisSpace1.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setTop((-1325.7389650909));
      Point point0 = new Point();
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      axisSpace0.setLeft((-1325.7389650909));
      axisSpace0.shrink(rectangle0, rectangle0);
      assertEquals((-1325.7389650909), axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      
      axisSpace0.setBottom((-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      Point point0 = new Point();
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      Rectangle2D rectangle2D0 = axisSpace0.reserved(rectangle0, rectangleEdge0);
      axisSpace0.shrink(rectangle2D0, rectangle2D0);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Dimension dimension0 = new Dimension(23, (-1));
      Rectangle rectangle0 = new Rectangle(dimension0);
      Rectangle rectangle1 = (Rectangle)axisSpace0.shrink(rectangle0, rectangle0);
      assertEquals(23, rectangle1.width);
      assertEquals((-1), rectangle1.height);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setTop((-1325.7389650909));
      Point point0 = new Point();
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      axisSpace0.shrink(rectangle0, rectangle0);
      assertEquals((-1325.7389650909), axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setTop(1.0);
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = (Rectangle)polygon0.getBounds2D();
      axisSpace0.shrink(rectangle0, rectangle0);
      assertEquals(1, rectangle0.y);
      assertEquals((-1.0), rectangle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setLeft(1.0);
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = (Rectangle)polygon0.getBounds2D();
      axisSpace0.shrink(rectangle0, rectangle0);
      assertEquals((-1), rectangle0.width);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-122.63461298174), (-122.63461298174), 1464.1247, (-122.63461298174));
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      Rectangle2D rectangle2D0 = axisSpace0.reserved(rectangle2D_Double0, rectangleEdge0);
      axisSpace0.shrink(rectangle2D0, rectangle2D_Double0);
      assertEquals(0.0, rectangle2D_Double0.width, 0.01);
      assertTrue(rectangle2D_Double0.equals((Object)rectangle2D0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setTop(2085.1148167481);
      double double0 = axisSpace0.getTop();
      assertEquals(2085.1148167481, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setTop((-1325.7389650909));
      double double0 = axisSpace0.getTop();
      assertEquals((-1325.7389650909), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      axisSpace0.add(520.9426, rectangleEdge0);
      double double0 = axisSpace0.getRight();
      assertEquals(520.9426, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setRight((-2733.379896984));
      double double0 = axisSpace0.getRight();
      assertEquals((-2733.379896984), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      
      axisSpace0.setLeft(1.0);
      double double0 = axisSpace0.getLeft();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setLeft((-1231.69602587376));
      double double0 = axisSpace0.getLeft();
      assertEquals((-1231.69602587376), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      axisSpace0.add(197.88, rectangleEdge1);
      double double0 = axisSpace0.getBottom();
      assertEquals(197.88, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      
      axisSpace0.setBottom((-1.0));
      double double0 = axisSpace0.getBottom();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle rectangle0 = new Rectangle((-1), (-1), (-1), (-1));
      Rectangle2D rectangle2D0 = axisSpace0.expand(rectangle0, rectangle0);
      assertEquals((-1.5), rectangle2D0.getCenterY(), 0.01);
      assertEquals((-1.5), rectangle2D0.getCenterX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Point point0 = new Point(685, 685);
      Dimension dimension0 = new Dimension(685, 23);
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      Rectangle2D rectangle2D0 = axisSpace0.expand(rectangle0, rectangle0);
      assertEquals(696.5, rectangle2D0.getCenterY(), 0.01);
      assertEquals(1027.5, rectangle2D0.getCenterX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setRight(1654.29186);
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      axisSpace0.expand(rectangle2D0, rectangle2D0);
      assertEquals(1654.29186, axisSpace0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-122.63461298174), (-122.63461298174), 1464.1247, (-122.63461298174));
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      axisSpace0.add(1464.1247, rectangleEdge0);
      axisSpace0.expand(rectangle2D_Double0, rectangle2D_Double0);
      assertEquals(1464.1247, axisSpace0.getLeft(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle rectangle0 = new Rectangle(1649, 1649);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      Rectangle2D rectangle2D0 = axisSpace0.reserved(rectangle0, rectangleEdge0);
      // Undeclared exception!
      try { 
        axisSpace0.shrink((Rectangle2D) null, rectangle2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.AxisSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      // Undeclared exception!
      try { 
        axisSpace0.reserved((Rectangle2D) null, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.AxisSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      // Undeclared exception!
      try { 
        axisSpace0.expand((Rectangle2D) null, (Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.AxisSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      // Undeclared exception!
      try { 
        axisSpace0.ensureAtLeast((AxisSpace) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.AxisSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      AxisSpace axisSpace1 = (AxisSpace)axisSpace0.clone();
      boolean boolean0 = axisSpace0.equals(axisSpace1);
      assertEquals(0.0, axisSpace1.getBottom(), 0.01);
      assertEquals(0.0, axisSpace1.getTop(), 0.01);
      assertEquals(0.0, axisSpace1.getRight(), 0.01);
      assertEquals(0.0, axisSpace1.getLeft(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setBottom(179.0195412206);
      AxisSpace axisSpace1 = new AxisSpace();
      boolean boolean0 = axisSpace0.equals(axisSpace1);
      assertEquals(179.0195412206, axisSpace0.getBottom(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      AxisSpace axisSpace1 = new AxisSpace();
      axisSpace0.ensureAtLeast(468.0510930086, rectangleEdge0);
      boolean boolean0 = axisSpace0.equals(axisSpace1);
      assertEquals(468.0510930086, axisSpace0.getTop(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle rectangle0 = new Rectangle();
      boolean boolean0 = axisSpace0.equals(rectangle0);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      boolean boolean0 = axisSpace0.equals(axisSpace0);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setRight(1125.6);
      AxisSpace axisSpace1 = new AxisSpace();
      boolean boolean0 = axisSpace0.equals(axisSpace1);
      assertEquals(1125.6, axisSpace0.getRight(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle rectangle0 = new Rectangle();
      Rectangle2D rectangle2D0 = axisSpace0.reserved(rectangle0, (RectangleEdge) null);
      assertNull(rectangle2D0);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle rectangle0 = new Rectangle();
      Rectangle rectangle1 = (Rectangle)axisSpace0.expand(rectangle0, rectangle0);
      assertEquals(0, rectangle1.height);
      assertEquals(0, rectangle1.width);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Rectangle2D rectangle2D0 = axisSpace0.shrink(rectangle2D_Float0, (Rectangle2D) null);
      assertEquals(0.0, rectangle2D0.getCenterX(), 0.01);
      assertEquals(0.0, rectangle2D0.getCenterY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      axisSpace0.ensureAtLeast(1.0, rectangleEdge1);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      axisSpace0.shrink(rectangle2D_Float0, rectangle2D_Float0);
      assertEquals((-1.0F), rectangle2D_Float0.width, 0.01F);
      assertEquals((-1.0), rectangle2D_Float0.getMaxX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      // Undeclared exception!
      try { 
        axisSpace0.ensureAtLeast((double) 5392, (RectangleEdge) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // AxisSpace.ensureAtLeast(): unrecognised AxisLocation.
         //
         verifyException("org.jfree.chart.axis.AxisSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      axisSpace0.ensureAtLeast(3300.3, rectangleEdge0);
      assertEquals(3300.3, axisSpace0.getLeft(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      axisSpace0.ensureAtLeast(0.0, rectangleEdge0);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      axisSpace0.ensureAtLeast(33.38909366080322, rectangleEdge1);
      assertEquals(33.38909366080322, axisSpace0.getBottom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      axisSpace0.ensureAtLeast(0.0, rectangleEdge0);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      axisSpace0.ensureAtLeast((double) 0.0F, rectangleEdge0);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      axisSpace0.ensureAtLeast(0.0, rectangleEdge0);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      // Undeclared exception!
      try { 
        axisSpace0.add(84.68341, (RectangleEdge) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'edge' argument.
         //
         verifyException("org.jfree.chart.axis.AxisSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      double double0 = axisSpace0.getBottom();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setLeft((-2733.379896984));
      AxisSpace axisSpace1 = new AxisSpace();
      boolean boolean0 = axisSpace0.equals(axisSpace1);
      assertEquals((-2733.379896984), axisSpace0.getLeft(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      double double0 = axisSpace0.getLeft();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      double double0 = axisSpace0.getRight();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      double double0 = axisSpace0.getTop();
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Object object0 = axisSpace0.clone();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      axisSpace0.add(1464.1247, rectangleEdge0);
      boolean boolean0 = axisSpace0.equals(object0);
      assertEquals(1464.1247, axisSpace0.getLeft(), 0.01);
      assertFalse(boolean0);
  }
}
