/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 06:19:10 GMT 2022
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.apache.commons.math3.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math3.geometry.euclidean.threed.SubPlane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Plane_ESTest extends Plane_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = Vector3D.PLUS_K;
      Plane plane0 = new Plane(vector3D0, vector3D1);
      Plane plane1 = new Plane(vector3D0);
      double double0 = plane0.getOffset(plane1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-1945.924249), 1.0E-10);
      Plane plane0 = new Plane(vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D1 = rotationOrder0.getA2();
      boolean boolean0 = plane0.contains(vector3D1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(0.0, 1.0E-10, 0.0);
      Plane plane0 = new Plane(vector3D0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector3D vector3D1 = Vector3D.PLUS_J;
      Vector2D vector2D0 = plane0.toSubSpace(vector3D1);
      assertEquals(1.0, vector2D0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Plane plane0 = new Plane(vector3D0);
      Vector2D vector2D0 = plane0.toSubSpace(vector3D0);
      assertTrue(vector2D0.isNaN());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 2.0;
      Vector2D vector2D0 = new Vector2D(doubleArray0);
      Vector3D vector3D1 = plane0.toSpace(vector2D0);
      assertEquals(2.677945044588987, vector3D1.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector2D vector2D0 = plane0.toSubSpace(vector3D0);
      Vector3D vector3D1 = plane0.toSpace(vector2D0);
      assertEquals(1.0, vector3D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Plane plane0 = new Plane(vector3D0);
      Vector2D vector2D0 = new Vector2D((-1028.99105769904), (-1028.99105769904));
      Vector3D vector3D1 = plane0.toSpace(vector2D0);
      assertEquals((-0.7853981633974484), vector3D1.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Plane plane0 = new Plane(vector3D0);
      Vector2D vector2D0 = Vector2D.ZERO;
      Vector3D vector3D1 = plane0.toSpace(vector2D0);
      assertEquals(Double.NaN, vector3D1.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-751.2002533308898), (-751.2002533308898));
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector2D vector2D0 = plane0.toSubSpace(vector3D0);
      Vector3D vector3D1 = plane0.toSpace(vector2D0);
      assertEquals((-3.9513211718189965E-17), vector2D0.getX(), 0.01);
      assertEquals(0.3519083857643554, vector3D1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(0.9999999999999998, 0.9999999999999998);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Vector3D vector3D1 = rotationOrder0.getA2();
      Vector3D vector3D2 = new Vector3D(0.9999999999999998, vector3D0, 0.9999999999999998, vector3D1);
      Plane plane0 = new Plane(vector3D0, vector3D1, vector3D2);
      Vector3D vector3D3 = rotationOrder0.getA3();
      Plane plane1 = new Plane(vector3D3, vector3D2);
      Plane plane2 = new Plane(vector3D0, vector3D1);
      Vector3D vector3D4 = Plane.intersection(plane2, plane1, plane0);
      assertEquals(4.8145736354355595, vector3D4.getNormSq(), 0.01);
      assertNotNull(vector3D4);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D0);
      Vector3D vector3D1 = Vector3D.MINUS_J;
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = plane0.intersection(line0);
      assertNotNull(vector3D2);
      assertEquals((-1.0146536357569526E-17), vector3D2.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D0);
      Vector3D vector3D1 = vector3D0.negate();
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = plane0.intersection(line0);
      assertNotNull(vector3D2);
      assertEquals(0.0, vector3D2.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector3D vector3D1 = plane0.getU();
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = plane0.intersection(line0);
      assertNotNull(vector3D2);
      assertEquals(1.0146536357569526E-17, vector3D2.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector3D vector3D1 = plane0.getV();
      assertNotSame(vector3D1, vector3D0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Plane plane0 = new Plane(vector3D0, vector3D0);
      plane0.revertSelf();
      Vector3D vector3D1 = plane0.getV();
      assertEquals((-1.0), vector3D1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Plane plane0 = new Plane(vector3D0);
      Vector3D vector3D1 = plane0.getV();
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Plane plane0 = new Plane(vector3D0);
      Vector3D vector3D1 = plane0.getU();
      assertEquals(3.141592653589793, vector3D1.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      plane0.revertSelf();
      Vector3D vector3D1 = plane0.getU();
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = plane0.intersection(line0);
      assertNotNull(vector3D2);
      assertEquals((-1.0146536357569526E-17), vector3D2.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      plane0.revertSelf();
      plane0.revertSelf();
      Vector3D vector3D1 = plane0.getU();
      assertEquals(0.0, vector3D1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector3D vector3D1 = plane0.getU();
      assertEquals(-0.0, vector3D1.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector2D vector2D0 = Vector2D.ZERO;
      Vector3D vector3D1 = plane0.getPointAt(vector2D0, (-1896.80098809));
      assertEquals(3594061.38644302, vector3D1.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Plane plane0 = new Plane(vector3D0);
      Vector2D vector2D0 = Vector2D.ZERO;
      Vector3D vector3D1 = plane0.getPointAt(vector2D0, (-1.0));
      assertEquals((-1.0), vector3D1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector2D vector2D0 = new Vector2D((-2166.2947011781716), 0.0);
      plane0.revertSelf();
      Vector3D vector3D1 = plane0.getPointAt(vector2D0, 1952.02723761);
      assertEquals((-1951.02723761), vector3D1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D vector3D1 = new Vector3D(442.74100600097, 442.74100600097, 1684.4);
      Vector3D vector3D2 = new Vector3D(442.74100600097, vector3D0, 442.74100600097, vector3D1);
      Plane plane0 = new Plane(vector3D2, vector3D1);
      Vector3D vector3D3 = plane0.getOrigin();
      assertEquals(Double.NEGATIVE_INFINITY, vector3D3.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector3D vector3D1 = plane0.getOrigin();
      assertEquals((-1.0), vector3D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector3D vector3D1 = plane0.getOrigin();
      assertEquals((-1.0), vector3D1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector3D vector3D1 = plane0.getOrigin();
      assertEquals(1.0, vector3D1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Plane plane0 = new Plane(vector3D0);
      Vector3D vector3D1 = plane0.getOrigin();
      assertEquals(Double.NaN, vector3D1.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = vector3D0.negate();
      Plane plane0 = new Plane(vector3D0);
      Plane plane1 = new Plane(plane0);
      plane0.revertSelf();
      Plane plane2 = new Plane(vector3D1, vector3D1);
      plane1.reset(plane2);
      double double0 = plane0.getOffset(plane1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Plane plane1 = new Plane(vector3D0);
      plane1.revertSelf();
      double double0 = plane1.getOffset(plane0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = Vector3D.PLUS_I;
      Plane plane0 = new Plane(vector3D0, vector3D1);
      double double0 = plane0.getOffset((Vector<Euclidean3D>) vector3D1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Plane plane0 = new Plane(vector3D0);
      plane0.revertSelf();
      double double0 = plane0.getOffset((Vector<Euclidean3D>) vector3D0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector3D vector3D1 = plane0.getNormal();
      assertTrue(vector3D1.isNaN());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Plane plane0 = new Plane(vector3D0);
      Vector3D vector3D1 = plane0.getNormal();
      assertEquals(1.0, vector3D1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.MINUS_J;
      Plane plane0 = new Plane(vector3D0, vector3D1);
      plane0.revertSelf();
      plane0.revertSelf();
      Vector3D vector3D2 = plane0.getNormal();
      assertEquals((-1.0), vector3D2.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = Vector3D.PLUS_I;
      Plane plane0 = new Plane(vector3D0, vector3D1);
      Vector3D vector3D2 = plane0.getNormal();
      assertEquals(1.0, vector3D2.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector3D vector3D1 = plane0.getV();
      plane0.reset(vector3D0, vector3D1);
      Vector3D vector3D2 = plane0.getNormal();
      assertEquals((-1.0), vector3D2.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        plane0.translate((Vector3D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Plane plane0 = new Plane(vector3D0);
      // Undeclared exception!
      try { 
        plane0.toSubSpace((Vector<Euclidean3D>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        plane0.toSpace((Vector<Euclidean2D>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Plane plane0 = new Plane(vector3D0);
      // Undeclared exception!
      try { 
        plane0.sameOrientationAs((Hyperplane<Euclidean3D>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Plane plane0 = new Plane(vector3D0);
      // Undeclared exception!
      try { 
        plane0.rotate(vector3D0, (Rotation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D0);
      Vector2D vector2D0 = Vector2D.ZERO;
      Vector3D vector3D1 = plane0.getPointAt(vector2D0, 0.0);
      try { 
        plane0.reset(vector3D1, vector3D1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Plane plane0 = new Plane(vector3D0);
      // Undeclared exception!
      try { 
        plane0.reset((Vector3D) null, vector3D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        plane0.reset((Plane) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        plane0.isSimilarTo((Plane) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        Plane.intersection((Plane) null, (Plane) null, (Plane) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Plane plane0 = new Plane(vector3D0);
      // Undeclared exception!
      try { 
        plane0.intersection((Plane) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Plane plane0 = new Plane(vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        plane0.intersection((Line) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        plane0.getPointAt((Vector2D) null, 170.06520190214);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        plane0.getOffset((Plane) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        plane0.getOffset((Vector<Euclidean3D>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        plane0.contains((Vector3D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Plane plane0 = null;
      try {
        plane0 = new Plane((Vector3D) null, (Vector3D) null, (Vector3D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      Plane plane0 = null;
      try {
        plane0 = new Plane(vector3D0, vector3D0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Plane plane0 = null;
      try {
        plane0 = new Plane((Vector3D) null, (Vector3D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-1888.48), (-1888.48), (-1888.48));
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      Plane plane0 = null;
      try {
        plane0 = new Plane(vector3D1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Plane plane0 = null;
      try {
        plane0 = new Plane((Vector3D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Plane plane0 = null;
      try {
        plane0 = new Plane((Plane) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0);
      boolean boolean0 = plane0.sameOrientationAs(plane0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Plane plane0 = new Plane(vector3D0, vector3D0);
      boolean boolean0 = plane0.sameOrientationAs(plane0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0);
      Vector3D vector3D1 = Plane.intersection(plane0, plane0, plane0);
      assertFalse(vector3D1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(0.9999999999999998, 0.9999999999999998);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Vector3D vector3D1 = rotationOrder0.getA2();
      Vector3D vector3D2 = new Vector3D(0.9999999999999998, vector3D0, 0.9999999999999998, vector3D1);
      Plane plane0 = new Plane(vector3D0, vector3D1, vector3D2);
      boolean boolean0 = plane0.contains(vector3D1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D0);
      boolean boolean0 = plane0.contains(vector3D0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector3D vector3D1 = Plane.intersection(plane0, plane0, plane0);
      assertNull(vector3D1);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D0);
      Line line0 = plane0.intersection(plane0);
      assertNull(line0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0);
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = plane0.intersection(line0);
      assertEquals(Double.NaN, vector3D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = vector3D0.negate();
      Plane plane0 = new Plane(vector3D0);
      Plane plane1 = new Plane(vector3D1, vector3D1);
      boolean boolean0 = plane0.isSimilarTo(plane1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = vector3D0.negate();
      Plane plane0 = new Plane(vector3D0);
      plane0.revertSelf();
      Plane plane1 = new Plane(vector3D1, vector3D1);
      boolean boolean0 = plane0.isSimilarTo(plane1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D0);
      boolean boolean0 = plane0.isSimilarTo(plane0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D0);
      Vector3D vector3D1 = plane0.getNormal();
      assertEquals((-1.0), vector3D1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Plane plane0 = new Plane(vector3D0, vector3D0);
      double double0 = plane0.getOffset((Vector<Euclidean3D>) vector3D0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector3D vector3D1 = plane0.getU();
      assertEquals(Double.NaN, vector3D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      PolyhedronsSet polyhedronsSet0 = plane0.wholeSpace();
      assertNotNull(polyhedronsSet0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0);
      Plane plane1 = plane0.translate(vector3D0);
      assertNotSame(plane1, plane0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0);
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Vector3D vector3D1 = plane0.toSpace(vector2D0);
      assertFalse(vector3D1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Plane plane0 = new Plane(vector3D0, vector3D0);
      SubPlane subPlane0 = plane0.wholeHyperplane();
      assertNotNull(subPlane0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Plane plane1 = plane0.copySelf();
      assertFalse(plane1.equals((Object)plane0));
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D0);
      Plane plane1 = new Plane(plane0);
      plane0.revertSelf();
      boolean boolean0 = plane1.isSimilarTo(plane0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Rotation rotation0 = new Rotation(rotationOrder0, (-1.0), 0.0, 0.0);
      Plane plane1 = plane0.rotate(vector3D0, rotation0);
      Line line0 = plane1.intersection(plane0);
      Vector3D vector3D1 = plane1.intersection(line0);
      assertNull(vector3D1);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D0);
      Vector2D vector2D0 = Vector2D.NaN;
      Vector3D vector3D1 = plane0.getPointAt(vector2D0, 0.0);
      assertFalse(vector3D1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Plane plane0 = null;
      try {
        plane0 = new Plane(vector3D0, vector3D0, vector3D0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D0);
      Vector3D vector3D1 = plane0.getOrigin();
      assertEquals(0.0, vector3D1.getZ(), 0.01);
  }
}