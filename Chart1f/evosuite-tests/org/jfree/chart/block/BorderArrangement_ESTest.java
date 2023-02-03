/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 23:45:41 GMT 2022
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.EmptyBlock;
import org.jfree.chart.block.LengthConstraintType;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BorderArrangement_ESTest extends BorderArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range((-2691.5517145433), (-2691.5517145433));
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeRR(blockContainer0, range0, (Range) null, (Graphics2D) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'base' argument.
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      Range range0 = new Range(0.4554400580065817, 0.4554400580065817);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.4554400580065817, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(4662.351900905, 4662.351900905);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(4662.351900905, range0);
      Size2D size2D0 = borderArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(4662.351900905, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      Range range0 = new Range((-2691.5517145433), (-2691.5517145433));
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, range0);
      Size2D size2D0 = borderArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals((-2691.5517145433), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      RectangleInsets rectangleInsets0 = new RectangleInsets(408.9479425246232, (-2718.3), (-348.173938), (-1.0));
      blockContainer0.setMargin(rectangleInsets0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 1.5);
      assertEquals((-2717.8), size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      RectangleInsets rectangleInsets0 = new RectangleInsets(1.0, 1.0, 1.0, 1.0);
      blockContainer0.setMargin(rectangleInsets0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals(2.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-1.0), (-1.0));
      Size2D size2D0 = borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals((-1.0), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(4662.351900905, 4662.351900905);
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(6.043070727618187, range0, lengthConstraintType0, 6.043070727618187, range0, lengthConstraintType0);
      Size2D size2D0 = borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(6.043070727618187, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, (-3289.952));
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      blockContainer0.setMargin(2774.0935969, (-1090.9902930260544), (-1.0), (-1023.0));
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(2773.0935969, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, (-3289.952));
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-1.0), (-1.0));
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-1.0).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN((BlockContainer) null, (Graphics2D) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-1.0), (-1.0));
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-1.0).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      // Undeclared exception!
      try { 
        borderArrangement0.add(blockContainer0, blockContainer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.chart.block.BlockContainer cannot be cast to org.jfree.chart.util.RectangleEdge
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      borderArrangement0.add(emptyBlock0, (Object) null);
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range((-2691.5517145433), (-2691.5517145433));
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, (-789.65575861));
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.clear();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      boolean boolean0 = borderArrangement0.equals(blockContainer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      borderArrangement0.add(emptyBlock0, rectangleEdge1);
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range((-2691.5517145433), (-2691.5517145433));
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      Size2D size2D0 = borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      Range range0 = new Range((-2691.5517145433), (-2691.5517145433));
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      borderArrangement0.add(emptyBlock0, rectangleEdge1);
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      Range range0 = new Range((-2691.5517145433), (-2691.5517145433));
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(11.156821105870034, 11.156821105870034);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range((-2691.5517145433), (-2691.5517145433));
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals((-2691.5517145433), size2D0.height, 0.01);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      borderArrangement0.add(emptyBlock0, rectangleEdge1);
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range((-2691.5517145433), (-2691.5517145433));
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals((-2691.5517145433), size2D0.height, 0.01);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 1.5);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      borderArrangement0.add(emptyBlock0, rectangleEdge1);
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      Range range0 = new Range((-2691.5517145433), (-2691.5517145433));
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(11.156821105870034, 11.156821105870034);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range((-2691.5517145433), (-2691.5517145433));
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(11.156821105870034, range0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-2691.5517145433).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      borderArrangement0.add(emptyBlock0, rectangleEdge1);
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 1618.8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-1.0).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      Range range0 = new Range(0.0, 173.33884650272356);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, range0);
      Size2D size2D0 = borderArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(11.156821105870034, 11.156821105870034);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(11.156821105870034, size2D0.height, 0.01);
      assertEquals(11.156821105870034, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(4662.351900905, 4662.351900905);
      borderArrangement0.add(blockContainer0, (Object) null);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range((-2691.5517145433), (-2691.5517145433));
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(11.156821105870034, range0);
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals((-2691.5517145433), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(4662.351900905, 4662.351900905);
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(1.0, range0, lengthConstraintType0, 1.0, range0, lengthConstraintType0);
      borderArrangement0.add(blockContainer0, (Object) null);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(4662.351900905, 4662.351900905);
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      LengthConstraintType lengthConstraintType1 = LengthConstraintType.RANGE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(1.0, range0, lengthConstraintType0, 1.0, range0, lengthConstraintType1);
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-1.0), (-1.0));
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals((-1.0), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      borderArrangement0.add(emptyBlock0, rectangleEdge1);
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      Size2D size2D0 = blockContainer0.arrange((Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      borderArrangement0.add(emptyBlock0, rectangleEdge1);
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
      assertEquals((-1.0), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(boolean0);
  }
}