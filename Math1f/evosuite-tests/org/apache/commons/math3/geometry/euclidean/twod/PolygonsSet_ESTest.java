/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 06:26:02 GMT 2022
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.AffineTransform;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.geometry.partitioning.Transform;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(0.0, (-4100.4457), (-4649.0), (-3.4028234663852886E38));
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(false);
      polygonsSet0.getBarycenter();
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.getVertices();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector2D[] vector2DArray0 = new Vector2D[4];
      Vector2D vector2D0 = new Vector2D(1277.82910170346, 1892.760040052);
      vector2DArray0[0] = vector2D0;
      Vector2D vector2D1 = new Vector2D(Double.POSITIVE_INFINITY, vector2D0, 1277.82910170346, vector2D0, 1892.760040052, vector2D0, (-126.22315538978), vector2D0);
      vector2DArray0[1] = vector2D1;
      vector2DArray0[2] = vector2D0;
      vector2DArray0[3] = vector2D1;
      PolygonsSet polygonsSet0 = new PolygonsSet(1277.82910170346, vector2DArray0);
      // Undeclared exception!
      try { 
        polygonsSet0.getVertices();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion$BoundaryBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(polygonsSet0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      Vector2D vector2D0 = new Vector2D(0.9999999999, (-1377.7027012));
      Line line0 = new Line(vector2D0, (-1.0));
      bSPTree0.insertCut(line0);
      // Undeclared exception!
      try { 
        polygonsSet1.getVertices();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(2.405575294517348E-9, 3.4028234663852886E38, 2.405575294517348E-9, 3.4028234663852886E38);
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(false);
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree0);
      polygonsSet1.getSize();
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, 1301.42761213);
      PolygonsSet polygonsSet0 = line0.wholeSpace();
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance(2287.339, (-1135.2018823), (-1135.2018823));
      Transform<Euclidean2D, Euclidean1D> transform0 = Line.getTransform(affineTransform0);
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      bSPTree0.setAttribute(transform0);
      // Undeclared exception!
      try { 
        polygonsSet0.computeGeometricalProperties();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.twod.Line$LineTransform cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PolygonsSet polygonsSet0 = null;
      try {
        polygonsSet0 = new PolygonsSet((Collection<SubHyperplane<Euclidean2D>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PolygonsSet polygonsSet0 = null;
      try {
        polygonsSet0 = new PolygonsSet((-0.999999999999998), (-1.0), (-0.999999999999998), 3.4028234663852886E38);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.BSPTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector2D[] vector2DArray0 = new Vector2D[6];
      Vector2D vector2D0 = new Vector2D(4.0, 0.0);
      vector2DArray0[0] = vector2D0;
      Vector2D vector2D1 = new Vector2D((-5767.383412750837), (-5767.383412750837));
      Vector2D vector2D2 = new Vector2D((-686.2055377188453), vector2D1);
      vector2DArray0[1] = vector2D2;
      vector2DArray0[2] = vector2D2;
      vector2DArray0[3] = vector2DArray0[0];
      vector2DArray0[4] = vector2DArray0[0];
      vector2DArray0[5] = vector2D2;
      PolygonsSet polygonsSet0 = new PolygonsSet((-5767.383412750837), vector2DArray0);
      // Undeclared exception!
      try { 
        polygonsSet0.computeGeometricalProperties();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector2D[] vector2DArray0 = new Vector2D[6];
      Vector2D vector2D0 = new Vector2D(4.0, 0.0);
      vector2DArray0[0] = vector2D0;
      Vector2D vector2D1 = new Vector2D((-5767.383412750837), (-5767.383412750837));
      vector2DArray0[1] = vector2D0;
      vector2DArray0[2] = vector2D1;
      Vector2D vector2D2 = Vector2D.NaN;
      vector2DArray0[3] = vector2D2;
      vector2DArray0[4] = vector2DArray0[2];
      vector2DArray0[5] = vector2DArray0[3];
      PolygonsSet polygonsSet0 = new PolygonsSet((-5767.383412750837), vector2DArray0);
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(11.089387223, Double.POSITIVE_INFINITY, 0.0, (-3444.16288));
      // Undeclared exception!
      try { 
        polygonsSet0.computeGeometricalProperties();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, 0.0);
      SubLine subLine0 = line0.wholeHyperplane();
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
      assertEquals(1, vector2DArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector2D[] vector2DArray0 = new Vector2D[7];
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      vector2DArray0[0] = vector2D0;
      vector2DArray0[1] = vector2D0;
      vector2DArray0[2] = vector2DArray0[1];
      vector2DArray0[3] = vector2DArray0[1];
      vector2DArray0[4] = vector2DArray0[0];
      vector2DArray0[5] = vector2DArray0[0];
      vector2DArray0[6] = vector2D0;
      PolygonsSet polygonsSet0 = new PolygonsSet(0.0, vector2DArray0);
      Vector2D[][] vector2DArray1 = polygonsSet0.getVertices();
      assertEquals(0, vector2DArray1.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector2D[] vector2DArray0 = new Vector2D[4];
      Vector2D vector2D0 = new Vector2D(1277.82910170346, 1892.760040052);
      vector2DArray0[0] = vector2D0;
      vector2DArray0[1] = vector2DArray0[0];
      vector2DArray0[2] = vector2D0;
      vector2DArray0[3] = vector2D0;
      PolygonsSet polygonsSet0 = new PolygonsSet(1277.82910170346, vector2DArray0);
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((BSPTree<Euclidean2D>) null);
      // Undeclared exception!
      try { 
        polygonsSet0.getVertices();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector2D[] vector2DArray0 = new Vector2D[6];
      Vector2D vector2D0 = new Vector2D(4.0, 0.0);
      vector2DArray0[0] = vector2D0;
      Vector2D vector2D1 = new Vector2D((-5767.383412750837), (-5767.383412750837));
      Vector2D vector2D2 = new Vector2D((-686.2055377188453), vector2D1);
      vector2DArray0[1] = vector2D2;
      Vector2D vector2D3 = Vector2D.NEGATIVE_INFINITY;
      vector2DArray0[2] = vector2D3;
      Vector2D vector2D4 = Vector2D.NaN;
      vector2DArray0[3] = vector2D4;
      vector2DArray0[4] = vector2D0;
      vector2DArray0[5] = vector2D2;
      PolygonsSet polygonsSet0 = new PolygonsSet((-5767.383412750837), vector2DArray0);
      // Undeclared exception!
      try { 
        polygonsSet0.computeGeometricalProperties();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(3.141592653489793, 0.0, 3.141592653489793, 0.0);
      polygonsSet0.getVertices();
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector2D[] vector2DArray0 = new Vector2D[1];
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      vector2DArray0[0] = vector2D0;
      PolygonsSet polygonsSet0 = new PolygonsSet(2.8284272948121343, vector2DArray0);
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(3.141592653489793, 0.0, 3.141592653489793, 0.0);
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.getCell(vector2D0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
      polygonsSet1.computeGeometricalProperties();
      assertTrue(polygonsSet1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector2D[] vector2DArray0 = new Vector2D[6];
      Vector2D vector2D0 = new Vector2D(1502.06622111, 1502.06622111);
      vector2DArray0[0] = vector2D0;
      vector2DArray0[1] = vector2D0;
      Vector2D vector2D1 = new Vector2D(0.001, vector2DArray0[0], 1502.06622111, vector2DArray0[0], 0.001, vector2DArray0[0], 1502.06622111, vector2DArray0[0]);
      vector2DArray0[2] = vector2D1;
      vector2DArray0[3] = vector2D1;
      vector2DArray0[4] = vector2DArray0[0];
      vector2DArray0[5] = vector2DArray0[4];
      PolygonsSet polygonsSet0 = new PolygonsSet(1502.06622111, vector2DArray0);
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector2D[] vector2DArray0 = new Vector2D[9];
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      vector2DArray0[0] = vector2D0;
      Vector2D vector2D1 = Vector2D.ZERO;
      vector2DArray0[1] = vector2D1;
      Vector2D vector2D2 = Vector2D.ZERO;
      vector2DArray0[2] = vector2D2;
      vector2DArray0[3] = vector2D1;
      vector2DArray0[4] = vector2DArray0[1];
      vector2DArray0[5] = vector2DArray0[3];
      vector2DArray0[6] = vector2DArray0[0];
      vector2DArray0[7] = vector2DArray0[0];
      vector2DArray0[8] = vector2D2;
      PolygonsSet polygonsSet0 = new PolygonsSet(0.0, vector2DArray0);
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector2D[] vector2DArray0 = new Vector2D[0];
      PolygonsSet polygonsSet0 = new PolygonsSet(375.552936, vector2DArray0);
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.getVertices();
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
      assertEquals(0, vector2DArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector2D[] vector2DArray0 = new Vector2D[6];
      Vector2D vector2D0 = new Vector2D(4.0, 0.0);
      vector2DArray0[0] = vector2D0;
      Vector2D vector2D1 = new Vector2D((-5767.383412750837), (-5767.383412750837));
      vector2DArray0[1] = vector2D1;
      vector2DArray0[2] = vector2DArray0[0];
      vector2DArray0[3] = vector2D0;
      vector2DArray0[4] = vector2D1;
      vector2DArray0[5] = vector2D0;
      PolygonsSet polygonsSet0 = null;
      try {
        polygonsSet0 = new PolygonsSet((-5767.383412750837), vector2DArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
