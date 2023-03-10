/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 02:35:54 GMT 2022
 */

package org.jfree.chart.renderer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Point2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.renderer.Outlier;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Outlier_ESTest extends Outlier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Outlier outlier0 = new Outlier(0.0, 0.0, 0.0);
      Outlier outlier1 = new Outlier(0.0, (-871.284761480649), 0.0);
      outlier0.setRadius(2122.0);
      Point2D.Double point2D_Double0 = new Point2D.Double();
      outlier1.setPoint(point2D_Double0);
      boolean boolean0 = outlier0.equals(outlier1);
      assertEquals(2122.0, outlier0.getRadius(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Outlier outlier0 = new Outlier(0.0, 1.0, 0.0);
      boolean boolean0 = outlier0.overlaps(outlier0);
      assertTrue(boolean0);
      assertEquals(0.0, outlier0.getRadius(), 0.01);
      assertEquals(1.0, outlier0.getY(), 0.01);
      assertEquals(0.0, outlier0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Outlier outlier0 = new Outlier(1163.1422436107, 1163.1422436107, 1163.1422436107);
      Outlier outlier1 = new Outlier(1.5369143986131584, 1163.1422436107, 1163.1422436107);
      int int0 = outlier0.compareTo(outlier1);
      assertEquals((-1161.6053292120869), outlier1.getX(), 0.01);
      assertEquals(1163.1422436107, outlier1.getRadius(), 0.01);
      assertEquals(1, int0);
      assertEquals(0.0, outlier1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Outlier outlier0 = new Outlier(0.0, 2350.273640071288, 0.0);
      Outlier outlier1 = new Outlier(0.0, (-234.3), 0.0);
      int int0 = outlier0.compareTo(outlier1);
      assertEquals(1, int0);
      assertEquals(0.0, outlier1.getX(), 0.01);
      assertEquals(0.0, outlier1.getRadius(), 0.01);
      assertEquals((-234.3), outlier1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Outlier outlier0 = new Outlier((-2143.5851), (-2053.4374843), (-2053.4374843));
      double double0 = outlier0.getY();
      assertEquals((-2053.4374843), outlier0.getRadius(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals((-90.14761569999973), outlier0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Outlier outlier0 = new Outlier(0.0, 1.0, (-1741.330550791773));
      double double0 = outlier0.getY();
      assertEquals(1742.330550791773, double0, 0.01);
      assertEquals((-1741.330550791773), outlier0.getRadius(), 0.01);
      assertEquals(1741.330550791773, outlier0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Outlier outlier0 = new Outlier(1.0, 1.0, (-1.0));
      double double0 = outlier0.getX();
      assertEquals((-1.0), outlier0.getRadius(), 0.01);
      assertEquals(2.0, outlier0.getY(), 0.01);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Outlier outlier0 = new Outlier((-1842.217824463), (-1368.40061103211), (-1368.40061103211));
      double double0 = outlier0.getX();
      assertEquals((-473.81721343089), double0, 0.01);
      assertEquals(0.0, outlier0.getY(), 0.01);
      assertEquals((-1368.40061103211), outlier0.getRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Outlier outlier0 = new Outlier(1.0, 1.0, 1.0);
      outlier0.setRadius(0.0);
      double double0 = outlier0.getRadius();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Outlier outlier0 = new Outlier(1.0, 1.0, 1.0);
      double double0 = outlier0.getRadius();
      assertEquals(0.0, outlier0.getX(), 0.01);
      assertEquals(0.0, outlier0.getY(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Outlier outlier0 = new Outlier((-2395.0), (-2395.0), (-2395.0));
      assertEquals(0.0, outlier0.getX(), 0.01);
      assertEquals(0.0, outlier0.getY(), 0.01);
      
      outlier0.setPoint((Point2D) null);
      outlier0.getPoint();
      assertEquals((-2395.0), outlier0.getRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Outlier outlier0 = new Outlier((-2395.0), (-2395.0), (-2395.0));
      outlier0.setPoint((Point2D) null);
      // Undeclared exception!
      try { 
        outlier0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Outlier outlier0 = new Outlier(1.0, 1.0, 1.0);
      // Undeclared exception!
      try { 
        outlier0.overlaps((Outlier) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Outlier outlier0 = new Outlier(2536.0825891500417, 2536.0825891500417, 0.0);
      outlier0.setPoint((Point2D) null);
      // Undeclared exception!
      try { 
        outlier0.getY();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Outlier outlier0 = new Outlier((-2143.5851), (-2053.4374843), (-2053.4374843));
      outlier0.setPoint((Point2D) null);
      // Undeclared exception!
      try { 
        outlier0.getX();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Outlier outlier0 = new Outlier((-5731.35677), 830.7793608, 1.1);
      outlier0.setPoint((Point2D) null);
      Outlier outlier1 = new Outlier((-5731.35677), 1.1, 1.1);
      // Undeclared exception!
      try { 
        outlier0.equals(outlier1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Outlier outlier0 = new Outlier(5164.06445, (-409.404), (-3210.0832));
      // Undeclared exception!
      try { 
        outlier0.compareTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Outlier outlier0 = new Outlier((-1.0), (-1.0), (-1.0));
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        outlier0.compareTo(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.jfree.chart.renderer.Outlier
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Outlier outlier0 = new Outlier((-1724.3), (-1368.40061103211), (-1724.3));
      double double0 = outlier0.getX();
      assertEquals((-1724.3), outlier0.getRadius(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(355.89938896789, outlier0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Outlier outlier0 = new Outlier((-2032.3312428883), 131.6737325, 284.1541000092622);
      double double0 = outlier0.getY();
      assertEquals((-152.4803675092622), double0, 0.01);
      assertEquals(284.1541000092622, outlier0.getRadius(), 0.01);
      assertEquals((-2316.485342897562), outlier0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Outlier outlier0 = new Outlier((-2974.335), (-2974.335), (-2974.335));
      Point2D.Float point2D_Float0 = new Point2D.Float();
      Outlier outlier1 = new Outlier(0.0F, (-2974.335), 0.0F);
      outlier1.setPoint(point2D_Float0);
      assertEquals(0.0, outlier1.getRadius(), 0.01);
      
      outlier1.setRadius((-2974.335));
      boolean boolean0 = outlier0.equals(outlier1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Outlier outlier0 = new Outlier((-2974.335), (-2974.335), (-2974.335));
      Point2D.Float point2D_Float0 = new Point2D.Float();
      Outlier outlier1 = new Outlier(0.0F, (-2974.335), 0.0F);
      assertEquals((-2974.335), outlier1.getY(), 0.01);
      
      outlier1.setPoint(point2D_Float0);
      boolean boolean0 = outlier0.equals(outlier1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Outlier outlier0 = new Outlier(1.0, 1.0, 1.0);
      boolean boolean0 = outlier0.equals("D3$mTrB");
      assertEquals(0.0, outlier0.getY(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, outlier0.getX(), 0.01);
      assertEquals(1.0, outlier0.getRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Outlier outlier0 = new Outlier(1162.446181796, 1162.446181796, (-1365.351081293626));
      boolean boolean0 = outlier0.equals(outlier0);
      assertEquals(2527.797263089626, outlier0.getX(), 0.01);
      assertEquals(2527.797263089626, outlier0.getY(), 0.01);
      assertTrue(boolean0);
      assertEquals((-1365.351081293626), outlier0.getRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Outlier outlier0 = new Outlier(1163.1422436107, 1163.1422436107, 1163.1422436107);
      Outlier outlier1 = new Outlier(1.5369143986131584, 1163.1422436107, 1163.1422436107);
      boolean boolean0 = outlier1.equals(outlier0);
      assertEquals(1163.1422436107, outlier1.getRadius(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, outlier1.getY(), 0.01);
      assertEquals((-1161.6053292120869), outlier1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Outlier outlier0 = new Outlier(577.4018363747406, 577.4018363747406, 577.4018363747406);
      Outlier outlier1 = new Outlier((-1432.0), 577.4018363747406, (-1432.0));
      boolean boolean0 = outlier0.overlaps(outlier1);
      assertFalse(boolean0);
      assertEquals((-1432.0), outlier1.getRadius(), 0.01);
      assertEquals(2009.4018363747405, outlier1.getY(), 0.01);
      assertEquals(0.0, outlier1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Outlier outlier0 = new Outlier(1.0, 1.0, 1.0);
      Outlier outlier1 = new Outlier(2853.188979215, 1.0, 2853.188979215);
      boolean boolean0 = outlier0.overlaps(outlier1);
      assertEquals(0.0, outlier1.getX(), 0.01);
      assertFalse(boolean0);
      assertEquals(2853.188979215, outlier1.getRadius(), 0.01);
      assertEquals((-2852.188979215), outlier1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Outlier outlier0 = new Outlier(2751.6257, 2751.6257, 2751.6257);
      assertEquals(0.0, outlier0.getY(), 0.01);
      
      Point2D.Float point2D_Float0 = new Point2D.Float(2424.2944F, (-2222.9395F));
      outlier0.setPoint(point2D_Float0);
      Outlier outlier1 = new Outlier((-3.008958785208738), 2424.2944F, 2751.6257);
      boolean boolean0 = outlier1.overlaps(outlier0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Outlier outlier0 = new Outlier(2751.6257, 2751.6257, 2751.6257);
      boolean boolean0 = outlier0.overlaps(outlier0);
      assertEquals(0.0, outlier0.getY(), 0.01);
      assertEquals(0.0, outlier0.getX(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Outlier outlier0 = new Outlier((-2143.5851), (-2053.4374843), (-2053.4374843));
      boolean boolean0 = outlier0.overlaps(outlier0);
      assertEquals((-90.14761569999973), outlier0.getX(), 0.01);
      assertEquals((-2053.4374843), outlier0.getRadius(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, outlier0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Outlier outlier0 = new Outlier(2751.6257, 2751.6257, 2751.6257);
      assertEquals(0.0, outlier0.getY(), 0.01);
      
      Point2D.Float point2D_Float0 = new Point2D.Float(2424.2944F, (-2222.9395F));
      outlier0.setPoint(point2D_Float0);
      Outlier outlier1 = new Outlier((-3.008958785208738), 2424.2944F, 2751.6257);
      int int0 = outlier0.compareTo(outlier1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Outlier outlier0 = new Outlier(577.4018363747406, 577.4018363747406, 577.4018363747406);
      Outlier outlier1 = new Outlier(577.4018363747406, (-1432.0), (-1432.0));
      int int0 = outlier0.compareTo(outlier1);
      assertEquals(2009.4018363747405, outlier1.getX(), 0.01);
      assertEquals(0.0, outlier1.getY(), 0.01);
      assertEquals((-1432.0), outlier1.getRadius(), 0.01);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Outlier outlier0 = new Outlier((-2143.5851), (-2053.4374843), (-2053.4374843));
      int int0 = outlier0.compareTo(outlier0);
      assertEquals(0.0, outlier0.getY(), 0.01);
      assertEquals((-2053.4374843), outlier0.getRadius(), 0.01);
      assertEquals((-90.14761569999973), outlier0.getX(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Outlier outlier0 = new Outlier((-2143.5851), (-2053.4374843), (-2053.4374843));
      double double0 = outlier0.getRadius();
      assertEquals((-90.14761569999973), outlier0.getX(), 0.01);
      assertEquals(0.0, outlier0.getY(), 0.01);
      assertEquals((-2053.4374843), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Outlier outlier0 = new Outlier((-2143.5851), (-2053.4374843), (-2053.4374843));
      String string0 = outlier0.toString();
      assertEquals((-2053.4374843), outlier0.getRadius(), 0.01);
      assertEquals("{-90.14761569999973,0.0}", string0);
  }
}
