/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 00:55:51 GMT 2022
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.MultipleGradientPaint;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.plot.PieLabelDistributor;
import org.jfree.chart.plot.PieLabelRecord;
import org.jfree.chart.text.TextBox;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractPieLabelDistributor_ESTest extends AbstractPieLabelDistributor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor((-1));
      pieLabelDistributor0.distributeLabels((-1006.46401), (-1));
      assertEquals(0, pieLabelDistributor0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor((-128));
      TextBox textBox0 = new TextBox();
      PieLabelRecord pieLabelRecord0 = new PieLabelRecord((Comparable) null, (-128), 0, textBox0, (-128), (-128), 2438.19);
      pieLabelDistributor0.addPieLabelRecord(pieLabelRecord0);
      PieLabelRecord pieLabelRecord1 = pieLabelDistributor0.getPieLabelRecord(0);
      assertEquals(64.0, pieLabelRecord1.getLowerY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor((-101));
      TextBox textBox0 = new TextBox();
      PieLabelRecord pieLabelRecord0 = new PieLabelRecord((Comparable) null, (-101), 0, textBox0, (-101), 1602.76867714476, 0);
      pieLabelRecord0.setBaseY(1602.76867714476);
      pieLabelDistributor0.addPieLabelRecord(pieLabelRecord0);
      PieLabelRecord pieLabelRecord1 = pieLabelDistributor0.getPieLabelRecord(0);
      assertEquals((-101.0), pieLabelRecord1.getLabelHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor(0);
      TextBox textBox0 = new TextBox();
      PieLabelRecord pieLabelRecord0 = new PieLabelRecord((Comparable) null, 0, 0, textBox0, 0, 0, 2438.19);
      pieLabelDistributor0.addPieLabelRecord(pieLabelRecord0);
      PieLabelRecord pieLabelRecord1 = pieLabelDistributor0.getPieLabelRecord(0);
      assertEquals(0.0, pieLabelRecord1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor(4);
      TextBox textBox0 = new TextBox();
      PieLabelRecord pieLabelRecord0 = new PieLabelRecord((Comparable) null, 4, 0, textBox0, 4, 4, 0);
      pieLabelDistributor0.addPieLabelRecord(pieLabelRecord0);
      PieLabelRecord pieLabelRecord1 = pieLabelDistributor0.getPieLabelRecord(0);
      assertEquals(4.0, pieLabelRecord1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor((-101));
      TextBox textBox0 = new TextBox();
      PieLabelRecord pieLabelRecord0 = new PieLabelRecord((Comparable) null, (-101), 0, textBox0, (-101), 1602.76867714476, 0);
      pieLabelRecord0.setAllocatedY(1602.76867714476);
      pieLabelDistributor0.addPieLabelRecord(pieLabelRecord0);
      PieLabelRecord pieLabelRecord1 = pieLabelDistributor0.getPieLabelRecord(0);
      assertEquals(1602.76867714476, pieLabelRecord1.getGap(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor((-101));
      TextBox textBox0 = new TextBox();
      PieLabelRecord pieLabelRecord0 = new PieLabelRecord((Comparable) null, (-101), (-101), textBox0, (-101), 1602.76867714476, (-101));
      pieLabelDistributor0.addPieLabelRecord(pieLabelRecord0);
      PieLabelRecord pieLabelRecord1 = pieLabelDistributor0.getPieLabelRecord(0);
      assertEquals((-101.0), pieLabelRecord1.getLinkPercent(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor((-101));
      TextBox textBox0 = new TextBox();
      PieLabelRecord pieLabelRecord0 = new PieLabelRecord((Comparable) null, (-101), 0, textBox0, (-101), 1602.76867714476, 2438.19);
      pieLabelDistributor0.addPieLabelRecord(pieLabelRecord0);
      int int0 = pieLabelDistributor0.getItemCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor((-128));
      pieLabelDistributor0.labels = null;
      // Undeclared exception!
      try { 
        pieLabelDistributor0.getPieLabelRecord(335);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.AbstractPieLabelDistributor", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor(0);
      LinkedList<MultipleGradientPaint.ColorSpaceType> linkedList0 = new LinkedList<MultipleGradientPaint.ColorSpaceType>();
      pieLabelDistributor0.labels = (List) linkedList0;
      MultipleGradientPaint.ColorSpaceType multipleGradientPaint_ColorSpaceType0 = MultipleGradientPaint.ColorSpaceType.SRGB;
      linkedList0.offerFirst(multipleGradientPaint_ColorSpaceType0);
      // Undeclared exception!
      try { 
        pieLabelDistributor0.getPieLabelRecord(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.awt.MultipleGradientPaint$ColorSpaceType cannot be cast to org.jfree.chart.plot.PieLabelRecord
         //
         verifyException("org.jfree.chart.plot.AbstractPieLabelDistributor", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor((-1));
      // Undeclared exception!
      try { 
        pieLabelDistributor0.getPieLabelRecord((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor(2048);
      pieLabelDistributor0.labels = null;
      // Undeclared exception!
      try { 
        pieLabelDistributor0.getItemCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.AbstractPieLabelDistributor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor((-1714));
      pieLabelDistributor0.labels = null;
      // Undeclared exception!
      try { 
        pieLabelDistributor0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.AbstractPieLabelDistributor", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor((-120));
      TextBox textBox0 = new TextBox();
      pieLabelDistributor0.labels = null;
      PieLabelRecord pieLabelRecord0 = new PieLabelRecord((Comparable) null, (-120), 0, textBox0, (-120), (-120), 0);
      // Undeclared exception!
      try { 
        pieLabelDistributor0.addPieLabelRecord(pieLabelRecord0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.AbstractPieLabelDistributor", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor((-1324));
      // Undeclared exception!
      try { 
        pieLabelDistributor0.addPieLabelRecord((PieLabelRecord) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'record' argument.
         //
         verifyException("org.jfree.chart.plot.AbstractPieLabelDistributor", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor(1209);
      // Undeclared exception!
      try { 
        pieLabelDistributor0.getPieLabelRecord(6);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 6, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor(1209);
      int int0 = pieLabelDistributor0.getItemCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PieLabelDistributor pieLabelDistributor0 = new PieLabelDistributor((-1));
      pieLabelDistributor0.clear();
      assertEquals(0, pieLabelDistributor0.getItemCount());
  }
}