/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 00:07:36 GMT 2022
 */

package org.jfree.chart.needle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.SoftBevelBorder;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.needle.ShipNeedle;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShipNeedle_ESTest extends ShipNeedle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ShipNeedle shipNeedle0 = new ShipNeedle();
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Line2D.Double line2D_Double0 = new Line2D.Double(1, Double.NEGATIVE_INFINITY, 1.5, 1.7976931348623157E308);
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      Point2D.Float point2D_Float0 = new Point2D.Float();
      shipNeedle0.drawNeedle(graphics2D0, rectangle2D0, point2D_Float0, (-1));
      assertEquals(0.5, shipNeedle0.getRotateX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ShipNeedle shipNeedle0 = new ShipNeedle();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getBackgroundNonSelectionColor();
      shipNeedle0.setFillPaint(color0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(1838.843335956534, 0.0, 0.0, 0.0);
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      Object[] objectArray0 = new Object[6];
      DefaultComboBoxModel<Object> defaultComboBoxModel0 = new DefaultComboBoxModel<Object>(objectArray0);
      JList<Object> jList0 = new JList<Object>(defaultComboBoxModel0);
      Point point0 = jList0.indexToLocation(1);
      // Undeclared exception!
      try { 
        shipNeedle0.drawNeedle((Graphics2D) null, rectangle0, point0, 1838.843335956534);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.needle.MeterNeedle", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ShipNeedle shipNeedle0 = new ShipNeedle();
      boolean boolean0 = shipNeedle0.equals(shipNeedle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ShipNeedle shipNeedle0 = new ShipNeedle();
      boolean boolean0 = shipNeedle0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ShipNeedle shipNeedle0 = new ShipNeedle();
      ImageIcon imageIcon0 = new ImageIcon();
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem("V_3", imageIcon0);
      boolean boolean0 = shipNeedle0.equals(jRadioButtonMenuItem0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ShipNeedle shipNeedle0 = new ShipNeedle();
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)line2D_Double0.getBounds2D();
      Point2D.Float point2D_Float0 = new Point2D.Float();
      shipNeedle0.drawNeedle(sunGraphics2D0, rectangle2D_Double0, point2D_Float0, 0.0F);
      assertEquals(140, sunGraphics2D0.lcdTextContrast);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ShipNeedle shipNeedle0 = new ShipNeedle();
      Color color0 = Color.white;
      SoftBevelBorder softBevelBorder0 = new SoftBevelBorder(1900, color0, color0, color0, color0);
      JEditorPane jEditorPane0 = new JEditorPane();
      Rectangle rectangle0 = softBevelBorder0.getInteriorRectangle((Component) jEditorPane0, 1900, 2146315902, 2146315902, 2146315902);
      shipNeedle0.drawNeedle((Graphics2D) null, rectangle0, (Point2D) null, 852.72115001659);
      assertEquals(0.5, shipNeedle0.getRotateX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ShipNeedle shipNeedle0 = new ShipNeedle();
      Object object0 = shipNeedle0.clone();
      boolean boolean0 = shipNeedle0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ShipNeedle shipNeedle0 = new ShipNeedle();
      shipNeedle0.hashCode();
  }
}