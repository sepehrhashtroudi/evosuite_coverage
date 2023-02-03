/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 23:03:16 GMT 2022
 */

package org.jfree.chart.title;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.title.ShortTextTitle;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.time.DateRange;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShortTextTitle_ESTest extends ShortTextTitle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("}M\";cfV");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("/CjbKK(*qccN[", shortTextTitle0.DEFAULT_FONT, combinedDomainCategoryPlot0, true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      DateRange dateRange0 = DateAxis.DEFAULT_DATE_RANGE;
      Range range0 = Range.expandToInclude(dateRange0, 2014.90982);
      Size2D size2D0 = shortTextTitle0.arrangeRR(graphics2D0, dateRange0, range0);
      assertEquals(13.96875, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("Serge V. Grachov");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("Serge V. Grachov", shortTextTitle0.DEFAULT_FONT, combinedDomainCategoryPlot0, false);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
      Size2D size2D0 = shortTextTitle0.arrangeRN(graphics2D0, range0);
      assertEquals(121.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("5dtTz D");
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      PiePlot piePlot0 = new PiePlot(defaultKeyedValuesDataset0);
      JFreeChart jFreeChart0 = new JFreeChart(piePlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Size2D size2D0 = shortTextTitle0.arrangeNN(graphics2D0);
      assertEquals(13.96875, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      PiePlot piePlot0 = new PiePlot();
      JFreeChart jFreeChart0 = new JFreeChart(piePlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, (double) 10, (-1237.422), chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      Size2D size2D0 = shortTextTitle0.arrangeNN(graphics2D0);
      assertEquals(13.96875, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("Serge V. Grachov");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("Serge V. Grachov", shortTextTitle0.DEFAULT_FONT, combinedDomainCategoryPlot0, false);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      Size2D size2D0 = shortTextTitle0.arrangeFN(graphics2D0, 15);
      assertEquals(0.0, size2D0.width, 0.01);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      PiePlot piePlot0 = new PiePlot();
      JFreeChart jFreeChart0 = new JFreeChart(piePlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, (double) 10, (-1237.422), chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      Size2D size2D0 = shortTextTitle0.arrangeFN(graphics2D0, 1396.7975506);
      assertEquals(1396.7975506, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((double) (-5968L));
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("", shortTextTitle0.DEFAULT_FONT, thermometerPlot0, true);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1, 1750);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      // Undeclared exception!
      try { 
        shortTextTitle0.draw(graphics2D0, (Rectangle2D) null, (Object) bufferedImageRenderingSource0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      // Undeclared exception!
      try { 
        shortTextTitle0.arrangeRR((Graphics2D) null, (Range) null, (Range) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("+=A/7[<");
      // Undeclared exception!
      try { 
        shortTextTitle0.arrangeRN((Graphics2D) null, (Range) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      // Undeclared exception!
      try { 
        shortTextTitle0.arrangeNN((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      // Undeclared exception!
      try { 
        shortTextTitle0.arrangeFN((Graphics2D) null, 2658.795399072869);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, (-788.0));
      RectangleConstraint rectangleConstraint1 = rectangleConstraint0.toUnconstrainedHeight();
      // Undeclared exception!
      try { 
        shortTextTitle0.arrange((Graphics2D) null, rectangleConstraint1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      // Undeclared exception!
      try { 
        shortTextTitle0.arrange((Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'c' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = null;
      try {
        shortTextTitle0 = new ShortTextTitle((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'text' argument.
         //
         verifyException("org.jfree.chart.title.TextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("/CjbKK(*qccN[", shortTextTitle0.DEFAULT_FONT, combinedDomainCategoryPlot0, true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      shortTextTitle0.draw(graphics2D0, (Rectangle2D) defaultCaret0, (Object) "dV'aq:-G4ng<?{O:V");
      assertEquals(0, defaultCaret0.height);
      assertEquals(0.0, defaultCaret0.getMinY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("}M\";cEfV");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("/CjbKK(*qccN[", shortTextTitle0.DEFAULT_FONT, combinedDomainCategoryPlot0, true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      GeneralPath generalPath0 = new GeneralPath(combinedDomainCategoryPlot0.DEFAULT_LEGEND_ITEM_BOX);
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)generalPath0.getBounds2D();
      shortTextTitle0.draw(graphics2D0, (Rectangle2D) rectangle2D_Float0, (Object) "/CjbKK(*qccN[");
      assertEquals(6.0F, rectangle2D_Float0.height, 0.01F);
      assertEquals((-3.0), rectangle2D_Float0.getMinY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("5dtTz D");
      RingPlot ringPlot0 = new RingPlot();
      JFreeChart jFreeChart0 = new JFreeChart(ringPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Range range0 = new Range(0.0, 0);
      Size2D size2D0 = shortTextTitle0.arrangeRR(graphics2D0, range0, range0);
      assertEquals(0.0, size2D0.width, 0.01);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("5dtTz D");
      RingPlot ringPlot0 = new RingPlot();
      JFreeChart jFreeChart0 = new JFreeChart(ringPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Range range0 = new Range(0.0, 0);
      Size2D size2D0 = shortTextTitle0.arrangeRN(graphics2D0, range0);
      assertEquals(0.0, size2D0.height, 0.01);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("}M\";cfV");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("/CjbKK(*qccN[", shortTextTitle0.DEFAULT_FONT, combinedDomainCategoryPlot0, true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(219.4, 2014.90982);
      RectangleConstraint rectangleConstraint1 = rectangleConstraint0.toUnconstrainedHeight();
      Size2D size2D0 = shortTextTitle0.arrange(graphics2D0, rectangleConstraint1);
      assertEquals(15.96875, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("}M\";cfV");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("/CjbKK(*qccN[", shortTextTitle0.DEFAULT_FONT, combinedDomainCategoryPlot0, true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(219.4, 2014.90982);
      DateRange dateRange0 = DateAxis.DEFAULT_DATE_RANGE;
      RectangleConstraint rectangleConstraint1 = rectangleConstraint0.toRangeHeight(dateRange0);
      // Undeclared exception!
      try { 
        shortTextTitle0.arrange(graphics2D0, rectangleConstraint1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("/CjbKK(*qccN[", shortTextTitle0.DEFAULT_FONT, combinedDomainCategoryPlot0, true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0, 0.2);
      RectangleConstraint rectangleConstraint1 = rectangleConstraint0.toUnconstrainedHeight();
      Size2D size2D0 = shortTextTitle0.arrange(graphics2D0, rectangleConstraint1);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("(XJ$p\"5xE");
      Range range0 = ValueAxis.DEFAULT_RANGE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, (-376));
      // Undeclared exception!
      try { 
        shortTextTitle0.arrange((Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("}M\";cEfV");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("/CjbKK(*qccN[", shortTextTitle0.DEFAULT_FONT, combinedDomainCategoryPlot0, true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      DateRange dateRange0 = DateAxis.DEFAULT_DATE_RANGE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(dateRange0, dateRange0);
      RectangleConstraint rectangleConstraint1 = rectangleConstraint0.toUnconstrainedHeight();
      Size2D size2D0 = shortTextTitle0.arrange(graphics2D0, rectangleConstraint1);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("/CjbKK(*qccN[", shortTextTitle0.DEFAULT_FONT, combinedDomainCategoryPlot0, true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0, 0.2);
      // Undeclared exception!
      try { 
        shortTextTitle0.arrange(graphics2D0, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("N");
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, (-788.0));
      DateRange dateRange0 = DateAxis.DEFAULT_DATE_RANGE;
      RectangleConstraint rectangleConstraint1 = rectangleConstraint0.toRangeHeight(dateRange0);
      RectangleConstraint rectangleConstraint2 = rectangleConstraint1.toUnconstrainedWidth();
      // Undeclared exception!
      try { 
        shortTextTitle0.arrange((Graphics2D) null, rectangleConstraint2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, (-788.0));
      RectangleConstraint rectangleConstraint1 = rectangleConstraint0.toUnconstrainedWidth();
      // Undeclared exception!
      try { 
        shortTextTitle0.arrange((Graphics2D) null, rectangleConstraint1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("}M\";cEfV");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("/CjbKK(*qccN[", shortTextTitle0.DEFAULT_FONT, combinedDomainCategoryPlot0, true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      DateRange dateRange0 = DateAxis.DEFAULT_DATE_RANGE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(dateRange0, dateRange0);
      Size2D size2D0 = shortTextTitle0.arrange(graphics2D0, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeCategoryPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 345);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      Size2D size2D0 = shortTextTitle0.arrange(graphics2D0, rectangleConstraint0);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }
}