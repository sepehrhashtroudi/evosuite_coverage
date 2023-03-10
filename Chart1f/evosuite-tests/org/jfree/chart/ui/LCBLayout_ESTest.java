/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 02:02:19 GMT 2022
 */

package org.jfree.chart.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.io.File;
import javax.swing.Icon;
import javax.swing.JColorChooser;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.colorchooser.DefaultColorSelectionModel;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.javax.swing.MockJFileChooser;
import org.evosuite.runtime.mock.javax.swing.filechooser.MockFileSystemView;
import org.jfree.chart.ui.LCBLayout;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LCBLayout_ESTest extends LCBLayout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LCBLayout lCBLayout0 = new LCBLayout(7051);
      JScrollPane jScrollPane0 = new JScrollPane();
      lCBLayout0.minimumLayoutSize(jScrollPane0);
      lCBLayout0.layoutContainer(jScrollPane0);
      assertTrue(jScrollPane0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LCBLayout lCBLayout0 = new LCBLayout(7051);
      JScrollPane jScrollPane0 = new JScrollPane();
      Dimension dimension0 = lCBLayout0.minimumLayoutSize(jScrollPane0);
      assertEquals(20, dimension0.height);
      
      Dimension dimension1 = lCBLayout0.preferredLayoutSize(jScrollPane0);
      assertEquals(60, dimension1.height);
      assertEquals(109, dimension1.width);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LCBLayout lCBLayout0 = new LCBLayout(3501);
      Color color0 = Color.getHSBColor(3501, 3501, 3501);
      DefaultColorSelectionModel defaultColorSelectionModel0 = new DefaultColorSelectionModel(color0);
      JColorChooser jColorChooser0 = new JColorChooser(defaultColorSelectionModel0);
      jColorChooser0.setSize((-4031), 350);
      lCBLayout0.layoutContainer(jColorChooser0);
      Dimension dimension0 = lCBLayout0.preferredLayoutSize(jColorChooser0);
      assertEquals((-4015), dimension0.width);
      assertEquals(0, dimension0.height);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LCBLayout lCBLayout0 = new LCBLayout(32);
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Icon icon0 = defaultTreeCellRenderer0.getDefaultLeafIcon();
      JToggleButton jToggleButton0 = new JToggleButton("JY", icon0);
      lCBLayout0.layoutContainer(jToggleButton0);
      Dimension dimension0 = lCBLayout0.minimumLayoutSize(defaultTreeCellRenderer0);
      assertEquals(0, dimension0.height);
      assertEquals((-18), dimension0.width);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LCBLayout lCBLayout0 = new LCBLayout(1747);
      // Undeclared exception!
      try { 
        lCBLayout0.preferredLayoutSize((Container) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.ui.LCBLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LCBLayout lCBLayout0 = new LCBLayout(0);
      JSpinner jSpinner0 = new JSpinner();
      // Undeclared exception!
      try { 
        lCBLayout0.preferredLayoutSize(jSpinner0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.jfree.chart.ui.LCBLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LCBLayout lCBLayout0 = new LCBLayout(999);
      // Undeclared exception!
      try { 
        lCBLayout0.minimumLayoutSize((Container) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.ui.LCBLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSpinner jSpinner0 = new JSpinner();
      LCBLayout lCBLayout0 = new LCBLayout(0);
      // Undeclared exception!
      try { 
        lCBLayout0.minimumLayoutSize(jSpinner0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.jfree.chart.ui.LCBLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LCBLayout lCBLayout0 = new LCBLayout(9);
      // Undeclared exception!
      try { 
        lCBLayout0.layoutContainer((Container) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.ui.LCBLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LCBLayout lCBLayout0 = new LCBLayout(0);
      FileSystemView fileSystemView0 = MockFileSystemView.getFileSystemView();
      MockJFileChooser mockJFileChooser0 = new MockJFileChooser((File) null, fileSystemView0);
      // Undeclared exception!
      try { 
        lCBLayout0.layoutContainer(mockJFileChooser0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.jfree.chart.ui.LCBLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LCBLayout lCBLayout0 = null;
      try {
        lCBLayout0 = new LCBLayout((-994));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.ui.LCBLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LCBLayout lCBLayout0 = new LCBLayout(7051);
      JScrollPane jScrollPane0 = new JScrollPane();
      lCBLayout0.layoutContainer(jScrollPane0);
      assertFalse(jScrollPane0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LCBLayout lCBLayout0 = new LCBLayout(7051);
      JScrollPane jScrollPane0 = new JScrollPane();
      lCBLayout0.minimumLayoutSize(jScrollPane0);
      Dimension dimension0 = lCBLayout0.minimumLayoutSize(jScrollPane0);
      assertEquals(20, dimension0.height);
      assertEquals(59, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LCBLayout lCBLayout0 = new LCBLayout(7051);
      JScrollPane jScrollPane0 = new JScrollPane();
      Dimension dimension0 = lCBLayout0.preferredLayoutSize(jScrollPane0);
      assertEquals(60, dimension0.height);
      
      Dimension dimension1 = lCBLayout0.minimumLayoutSize(jScrollPane0);
      assertEquals(60, dimension1.height);
      assertEquals(109, dimension1.width);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LCBLayout lCBLayout0 = new LCBLayout(0);
      JSpinner jSpinner0 = new JSpinner();
      lCBLayout0.removeLayoutComponent("*+(V.Wzh8", (Component) jSpinner0);
      assertFalse(jSpinner0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LCBLayout lCBLayout0 = new LCBLayout(0);
      JSpinner jSpinner0 = new JSpinner();
      JSpinner.NumberEditor jSpinner_NumberEditor0 = new JSpinner.NumberEditor(jSpinner0);
      lCBLayout0.addLayoutComponent((Component) jSpinner_NumberEditor0);
      assertTrue(jSpinner_NumberEditor0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LCBLayout lCBLayout0 = new LCBLayout(0);
      JSpinner jSpinner0 = new JSpinner();
      lCBLayout0.addLayoutComponent("(z^/gaO#", (Component) jSpinner0);
      assertFalse(jSpinner0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LCBLayout lCBLayout0 = new LCBLayout(0);
      JSpinner jSpinner0 = new JSpinner();
      lCBLayout0.removeLayoutComponent((Component) jSpinner0);
      assertFalse(jSpinner0.getIgnoreRepaint());
  }
}
