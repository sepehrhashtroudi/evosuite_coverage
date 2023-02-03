/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 01:27:54 GMT 2022
 */

package org.jfree.chart.plot.dial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JInternalFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.Crosshair;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.dial.DialPlot;
import org.jfree.chart.plot.dial.DialTextAnnotation;
import org.jfree.chart.plot.dial.DialValueIndicator;
import org.jfree.chart.text.TextAnchor;
import org.jfree.data.general.DefaultValueDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DialTextAnnotation_ESTest extends DialTextAnnotation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("");
      assertEquals((-90.0), dialTextAnnotation0.getAngle(), 0.01);
      
      dialTextAnnotation0.setAngle(2176.35);
      dialTextAnnotation0.hashCode();
      assertEquals(0.3, dialTextAnnotation0.getRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("");
      Object object0 = dialTextAnnotation0.clone();
      dialTextAnnotation0.setAngle((-1502.4855827));
      boolean boolean0 = dialTextAnnotation0.equals(object0);
      assertEquals((-1502.4855827), dialTextAnnotation0.getAngle(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation(",q1=");
      DialPlot dialPlot0 = new DialPlot();
      GeneralPath generalPath0 = new GeneralPath(dialPlot0.DEFAULT_LEGEND_ITEM_CIRCLE);
      Rectangle rectangle0 = generalPath0.getBounds();
      // Undeclared exception!
      try { 
        dialTextAnnotation0.draw((Graphics2D) null, dialPlot0, rectangle0, (Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.dial.DialTextAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("xLYa]+0\u0004/}\":>ph4");
      assertEquals(0.3, dialTextAnnotation0.getRadius(), 0.01);
      
      dialTextAnnotation0.setRadius(0.0);
      double double0 = dialTextAnnotation0.getRadius();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("");
      dialTextAnnotation0.getLabel();
      assertEquals((-90.0), dialTextAnnotation0.getAngle(), 0.01);
      assertEquals(0.3, dialTextAnnotation0.getRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("Null 'label' argument.");
      Crosshair crosshair0 = new Crosshair(0.0);
      Font font0 = crosshair0.getLabelFont();
      dialTextAnnotation0.setFont(font0);
      dialTextAnnotation0.getFont();
      assertEquals((-90.0), dialTextAnnotation0.getAngle(), 0.01);
      assertEquals(0.3, dialTextAnnotation0.getRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("xLYa]+0\u0004/}\":>ph4");
      assertEquals((-90.0), dialTextAnnotation0.getAngle(), 0.01);
      
      dialTextAnnotation0.setAngle(0.0);
      double double0 = dialTextAnnotation0.getAngle();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("}821TS4M]W");
      dialTextAnnotation0.setAngle(418.3570572);
      double double0 = dialTextAnnotation0.getAngle();
      assertEquals(418.3570572, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("fb<RJ-Q8!{mW\"K");
      DialValueIndicator dialValueIndicator0 = new DialValueIndicator();
      TextAnchor textAnchor0 = dialValueIndicator0.getTextAnchor();
      dialTextAnnotation0.setAnchor(textAnchor0);
      DialTextAnnotation dialTextAnnotation1 = new DialTextAnnotation("fb<RJ-Q8!{mW\"K");
      boolean boolean0 = dialTextAnnotation0.equals(dialTextAnnotation1);
      assertEquals((-90.0), dialTextAnnotation1.getAngle(), 0.01);
      assertEquals(0.3, dialTextAnnotation1.getRadius(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("");
      Object object0 = dialTextAnnotation0.clone();
      dialTextAnnotation0.setAngle(2281.98380881134);
      boolean boolean0 = dialTextAnnotation0.equals(object0);
      assertEquals(2281.98380881134, dialTextAnnotation0.getAngle(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("fb<RJ-Q8!{mW\"K");
      dialTextAnnotation0.setRadius(2257.4028);
      DialTextAnnotation dialTextAnnotation1 = new DialTextAnnotation("fb<RJ-Q8!{mW\"K");
      boolean boolean0 = dialTextAnnotation0.equals(dialTextAnnotation1);
      assertEquals(2257.4028, dialTextAnnotation0.getRadius(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("");
      DialTextAnnotation dialTextAnnotation1 = (DialTextAnnotation)dialTextAnnotation0.clone();
      assertTrue(dialTextAnnotation1.equals((Object)dialTextAnnotation0));
      
      MeterPlot meterPlot0 = new MeterPlot();
      Color color0 = (Color)meterPlot0.getValuePaint();
      dialTextAnnotation1.setPaint(color0);
      boolean boolean0 = dialTextAnnotation0.equals(dialTextAnnotation1);
      assertFalse(dialTextAnnotation1.equals((Object)dialTextAnnotation0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("]p(eZ");
      DialTextAnnotation dialTextAnnotation1 = new DialTextAnnotation("");
      boolean boolean0 = dialTextAnnotation0.equals(dialTextAnnotation1);
      assertFalse(boolean0);
      assertEquals(0.3, dialTextAnnotation1.getRadius(), 0.01);
      assertEquals((-90.0), dialTextAnnotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("");
      DialTextAnnotation dialTextAnnotation1 = (DialTextAnnotation)dialTextAnnotation0.clone();
      boolean boolean0 = dialTextAnnotation0.equals(dialTextAnnotation1);
      assertEquals(0.3, dialTextAnnotation1.getRadius(), 0.01);
      assertTrue(boolean0);
      assertEquals((-90.0), dialTextAnnotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("6af+AJ#UOxmn");
      boolean boolean0 = dialTextAnnotation0.equals(dialTextAnnotation0);
      assertEquals(0.3, dialTextAnnotation0.getRadius(), 0.01);
      assertTrue(boolean0);
      assertEquals((-90.0), dialTextAnnotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("xLYa]+0\u0004/}\":>ph4");
      Paint paint0 = dialTextAnnotation0.getPaint();
      boolean boolean0 = dialTextAnnotation0.equals(paint0);
      assertEquals(0.3, dialTextAnnotation0.getRadius(), 0.01);
      assertFalse(boolean0);
      assertEquals((-90.0), dialTextAnnotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("w:PDN u3H$2ix");
      // Undeclared exception!
      try { 
        dialTextAnnotation0.setAnchor((TextAnchor) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.plot.dial.DialTextAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("/eG%");
      TextAnchor textAnchor0 = dialTextAnnotation0.getAnchor();
      dialTextAnnotation0.setAnchor(textAnchor0);
      assertEquals((-90.0), dialTextAnnotation0.getAngle(), 0.01);
      assertEquals(0.3, dialTextAnnotation0.getRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("2+fE-XLPc;P6");
      // Undeclared exception!
      try { 
        dialTextAnnotation0.setRadius((-4953.29));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'radius' cannot be negative.
         //
         verifyException("org.jfree.chart.plot.dial.DialTextAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("");
      // Undeclared exception!
      try { 
        dialTextAnnotation0.setPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.plot.dial.DialTextAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("/eG%");
      // Undeclared exception!
      try { 
        dialTextAnnotation0.setFont((Font) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.plot.dial.DialTextAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("~_H={f+1\u0007");
      Font font0 = dialTextAnnotation0.getFont();
      dialTextAnnotation0.setFont(font0);
      assertEquals((-90.0), dialTextAnnotation0.getAngle(), 0.01);
      assertEquals("Tahoma", font0.getName());
      assertFalse(font0.isPlain());
      assertEquals(0.3, dialTextAnnotation0.getRadius(), 0.01);
      assertEquals(14.0F, font0.getSize2D(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("Tahoma");
      // Undeclared exception!
      try { 
        dialTextAnnotation0.setLabel((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'label' argument.
         //
         verifyException("org.jfree.chart.plot.dial.DialTextAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("");
      dialTextAnnotation0.setLabel("O");
      assertEquals((-90.0), dialTextAnnotation0.getAngle(), 0.01);
      assertEquals(0.3, dialTextAnnotation0.getRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = null;
      try {
        dialTextAnnotation0 = new DialTextAnnotation((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'label' argument.
         //
         verifyException("org.jfree.chart.plot.dial.DialTextAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("");
      Font font0 = dialTextAnnotation0.getFont();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2281.98380881134, 4763.95616);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(cyclicNumberAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("Column key (", font0, combinedRangeCategoryPlot0, true);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2939, 500, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      DialPlot dialPlot0 = new DialPlot(defaultValueDataset0);
      JInternalFrame jInternalFrame0 = new JInternalFrame("';XGDw.4&y", true, false, true, true);
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      Rectangle2D rectangle2D0 = cyclicNumberAxis0.DEFAULT_AXIS_LABEL_INSETS.createOutsetRectangle((Rectangle2D) rectangle0);
      dialTextAnnotation0.draw(graphics2D0, dialPlot0, rectangle2D0, rectangle2D0);
      assertEquals(0.3, dialTextAnnotation0.getRadius(), 0.01);
      assertEquals((-90.0), dialTextAnnotation0.getAngle(), 0.01);
      assertFalse(font0.isPlain());
      assertEquals("Tahoma", font0.getName());
      assertEquals(14, font0.getSize());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("~_H={f+1\u0007");
      double double0 = dialTextAnnotation0.getAngle();
      assertEquals((-90.0), double0, 0.01);
      assertEquals(0.3, dialTextAnnotation0.getRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("");
      Integer integer0 = new Integer(35);
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((Number) integer0);
      DialPlot dialPlot0 = new DialPlot(defaultValueDataset0);
      // Undeclared exception!
      try { 
        dialTextAnnotation0.draw((Graphics2D) null, dialPlot0, (Rectangle2D) null, (Rectangle2D) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rect' argument.
         //
         verifyException("org.jfree.chart.plot.dial.DialPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("6af+AJ#UOxmn");
      double double0 = dialTextAnnotation0.getRadius();
      assertEquals(0.3, double0, 0.01);
      assertEquals((-90.0), dialTextAnnotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("/eG%");
      boolean boolean0 = dialTextAnnotation0.isClippedToWindow();
      assertTrue(boolean0);
      assertEquals((-90.0), dialTextAnnotation0.getAngle(), 0.01);
      assertEquals(0.3, dialTextAnnotation0.getRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("/eG%");
      dialTextAnnotation0.hashCode();
      assertEquals(0.3, dialTextAnnotation0.getRadius(), 0.01);
      assertEquals((-90.0), dialTextAnnotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("/eG%");
      dialTextAnnotation0.getLabel();
      assertEquals((-90.0), dialTextAnnotation0.getAngle(), 0.01);
      assertEquals(0.3, dialTextAnnotation0.getRadius(), 0.01);
  }
}
