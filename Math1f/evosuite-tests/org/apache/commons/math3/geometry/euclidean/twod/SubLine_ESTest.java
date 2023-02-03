/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 06:22:58 GMT 2022
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.Side;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SubLine_ESTest extends SubLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      Line line1 = new Line(vector2D0, vector2D0);
      line1.setOriginOffset((-1.0E-10));
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line1);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector2D vector2D0 = plane0.toSubSpace(vector3D0);
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, (-1320.18738));
      IntervalsSet intervalsSet0 = new IntervalsSet(0.0, 876.23673);
      SubLine subLine1 = new SubLine(line0, intervalsSet0);
      Vector2D vector2D1 = subLine0.intersection(subLine1, true);
      assertEquals(0.0, vector2D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      // Undeclared exception!
      try { 
        subLine0.split((Hyperplane<Euclidean2D>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      IntervalsSet intervalsSet0 = new IntervalsSet((-5295.0), 3307.1259304);
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>(line0);
      IntervalsSet intervalsSet1 = intervalsSet0.buildNew(bSPTree0);
      SubLine subLine0 = new SubLine(line0, intervalsSet1);
      // Undeclared exception!
      try { 
        subLine0.split(line0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.twod.Line cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, (-1.0E-10));
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>();
      IntervalsSet intervalsSet0 = new IntervalsSet(bSPTree0);
      SubLine subLine1 = new SubLine(line0, intervalsSet0);
      // Undeclared exception!
      try { 
        subLine0.intersection(subLine1, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, vector2D0);
      LinkedList<SubHyperplane<Euclidean1D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean1D>>();
      IntervalsSet intervalsSet0 = new IntervalsSet(linkedList0);
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>(intervalsSet0);
      IntervalsSet intervalsSet1 = intervalsSet0.buildNew(bSPTree0);
      SubLine subLine1 = new SubLine(line0, intervalsSet1);
      // Undeclared exception!
      try { 
        subLine0.intersection(subLine1, false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, 0.0);
      Vector1D vector1D0 = Vector1D.NaN;
      OrientedPoint orientedPoint0 = new OrientedPoint(vector1D0, true);
      IntervalsSet intervalsSet0 = orientedPoint0.wholeSpace();
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>();
      IntervalsSet intervalsSet1 = intervalsSet0.buildNew(bSPTree0);
      SubLine subLine0 = new SubLine(line0, intervalsSet1);
      // Undeclared exception!
      try { 
        subLine0.getSegments();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, (-1.0E-10));
      IntervalsSet intervalsSet0 = new IntervalsSet();
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>(line0);
      IntervalsSet intervalsSet1 = intervalsSet0.buildNew(bSPTree0);
      SubLine subLine0 = new SubLine(line0, intervalsSet1);
      // Undeclared exception!
      try { 
        subLine0.getSegments();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.twod.Line cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SubLine subLine0 = null;
      try {
        subLine0 = new SubLine((Vector2D) null, (Vector2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SubLine subLine0 = null;
      try {
        subLine0 = new SubLine((Segment) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.SubLine", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D(0.99, 0.99);
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = new Vector2D(0.99, vector2D0, 0.99, vector2D0, 0.99, vector2D0);
      Line line0 = new Line(vector2D0, vector2D1);
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D(0.006281290770985557, 0.006281290770985557);
      Line line0 = new Line(vector2D0, 0.006281290770985557);
      Line line1 = new Line(line0);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      line1.setOriginOffset(0.006281290770985557);
      SubLine subLine0 = new SubLine(line1, intervalsSet0);
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D((-441.071714319914), (-441.071714319914));
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Hyperplane<Euclidean2D> hyperplane0 = subLine0.getHyperplane();
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(hyperplane0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, vector2D0);
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D((-441.071714319914), (-441.071714319914));
      Vector2D vector2D1 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D1, vector2D0);
      Line line0 = new Line(vector2D1, 1577.07323077);
      Side side0 = subLine0.side(line0);
      assertEquals(Side.PLUS, side0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D(0.006281290770985557, 0.006281290770985557);
      Line line0 = new Line(vector2D0, 0.006281290770985557);
      Line line1 = new Line(line0);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      line1.setOriginOffset(0.006281290770985557);
      SubLine subLine0 = new SubLine(line1, intervalsSet0);
      Side side0 = subLine0.side(line0);
      assertEquals(Side.MINUS, side0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D((-444.5447075727144), (-444.5447075727144));
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, vector2D0);
      Side side0 = subLine0.side(line0);
      assertEquals(Side.HYPER, side0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, vector2D0);
      Side side0 = subLine0.side(line0);
      assertEquals(Side.MINUS, side0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      Vector2D vector2D1 = subLine0.intersection(subLine0, false);
      assertNotSame(vector2D1, vector2D0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, vector2D0);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine1 = new SubLine(line0, intervalsSet0);
      Vector2D vector2D1 = subLine1.intersection(subLine0, false);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D((-444.5447075727144), (-444.5447075727144));
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = Vector2D.ZERO;
      SubLine subLine1 = new SubLine(vector2D1, vector2D0);
      Vector2D vector2D2 = subLine1.intersection(subLine0, true);
      assertNotNull(vector2D2);
      
      Line line0 = new Line(vector2D0, vector2D2);
      Side side0 = subLine0.side(line0);
      assertEquals(Side.PLUS, side0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine1 = line0.wholeHyperplane();
      Vector2D vector2D1 = subLine1.intersection(subLine0, true);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = subLine0.intersection(subLine0, true);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, 0.0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      Vector2D vector2D1 = subLine0.intersection(subLine0, false);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = subLine0.intersection(subLine0, false);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Segment segment0 = new Segment(vector2D0, vector2D0, (Line) null);
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      try { 
        subLine0.side((Hyperplane<Euclidean2D>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.SubLine", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      List<Segment> list0 = subLine0.getSegments();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, (-1.0E-10));
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      AbstractSubHyperplane<Euclidean2D, Euclidean1D> abstractSubHyperplane0 = subLine0.buildNew(line0, intervalsSet0);
      assertNotSame(subLine0, abstractSubHyperplane0);
  }
}