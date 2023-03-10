/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 00:40:34 GMT 2022
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.RefineryUtilities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RefineryUtilities_ESTest extends RefineryUtilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        RefineryUtilities.createTablePanel((TableModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.RefineryUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        RefineryUtilities.getMaximumWindowBounds();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        RefineryUtilities.positionFrameOnScreen((Window) null, (-75.6313107659), (-75.6313107659));
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        RefineryUtilities.positionDialogRelativeToParent((Dialog) null, 3151.978398236543, 3151.978398236543);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.RefineryUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 3125);
      JPanel jPanel0 = RefineryUtilities.createTablePanel(defaultTableModel0);
      assertTrue(jPanel0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        RefineryUtilities.getCenterPoint();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Color color0 = Color.orange;
      JLabel jLabel0 = RefineryUtilities.createJLabel("", (Font) null, color0);
      assertTrue(jLabel0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        RefineryUtilities.positionFrameRandomly((Window) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JButton jButton0 = RefineryUtilities.createJButton("org.jfree.chart.util.RefineryUtilities", (Font) null);
      assertTrue(jButton0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        RefineryUtilities.centerDialogInParent((Dialog) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.RefineryUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JLabel jLabel0 = RefineryUtilities.createJLabel("Null 'anchor' argument.", (Font) null);
      assertFalse(jLabel0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        RefineryUtilities.centerFrameOnScreen((Window) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
      }
  }
}
