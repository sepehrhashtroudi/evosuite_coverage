/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 02:16:20 GMT 2022
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.text.AttributedCharacterIterator;
import java.time.temporal.ChronoField;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StackedBarRenderer3D_ESTest extends StackedBarRenderer3D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(2.0, 2.0);
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      int[] intArray0 = new int[1];
      intArray0[0] = 4806;
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.createStackedValueList(defaultKeyedValues2DDataset0, (Comparable) null, intArray0, 0.14, false);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4806, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      boolean boolean0 = stackedBarRenderer3D0.getRenderAsPercentages();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      stackedBarRenderer3D0.setIgnoreZeroValues(true);
      boolean boolean0 = stackedBarRenderer3D0.getIgnoreZeroValues();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      double[][] doubleArray0 = new double[1][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = stackedBarRenderer3D0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0);
      assertEquals(0.0, range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      double[][] doubleArray0 = new double[9][3];
      double[] doubleArray1 = new double[7];
      doubleArray0[0] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      ChronoField chronoField0 = ChronoField.HOUR_OF_AMPM;
      LinkedList<AttributedCharacterIterator.Attribute> linkedList0 = new LinkedList<AttributedCharacterIterator.Attribute>();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.drawStackHorizontal(linkedList0, chronoField0, (Graphics2D) null, categoryStepRenderer_State0, rectangle2D0, (CategoryPlot) null, categoryAxis3D0, (ValueAxis) null, defaultCategoryDataset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StackedBarRenderer3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(547.591, 0.0, false);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "qExs,Re";
      Number[][] numberArray0 = new Number[4][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, numberArray0, numberArray0);
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.createStackedValueList(defaultIntervalCategoryDataset0, "", intArray0, 2074.355235168, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown 'category' key.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0.0, true);
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, (-4));
      Year year0 = new Year(mockDate0);
      int[] intArray0 = new int[3];
      intArray0[1] = (-4);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.createStackedValueList(defaultBoxAndWhiskerCategoryDataset0, year0, intArray0, 27.0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(2552.3484525159, 0.0);
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("HB.VlDS2>2[qNJ#l");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(extendedCategoryAxis0);
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = new CategoryItemRendererState(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.calculateBarWidth(combinedDomainCategoryPlot0, (Rectangle2D) null, defaultMultiValueCategoryDataset0, categoryItemRendererState0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      boolean boolean0 = stackedBarRenderer3D0.getRenderAsPercentages();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      ChronoField chronoField0 = ChronoField.HOUR_OF_AMPM;
      boolean boolean0 = stackedBarRenderer3D0.equals(chronoField0);
      assertFalse(boolean0);
      assertFalse(stackedBarRenderer3D0.getRenderAsPercentages());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(2825.711, 1758.715276530641);
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      int[] intArray0 = new int[0];
      List list0 = stackedBarRenderer3D0.createStackedValueList(defaultMultiValueCategoryDataset0, 0.0F, intArray0, 1.0F, false);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(2825.711, 1758.715276530641);
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-3632.8934612), (double) stackedBarRenderer3D0.ZERO);
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultMultiValueCategoryDataset0, (CategoryAxis) null, cyclicNumberAxis0, stackedBarRenderer3D0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(1.0F, (-605.0F), (-1.0F), 2.0F);
      Rectangle2D rectangle2D0 = categoryPlot0.DEFAULT_INSETS.createOutsetRectangle((Rectangle2D) rectangle2D_Float0, true, true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.calculateBarWidth(categoryPlot0, rectangle2D0, defaultMultiValueCategoryDataset0, categoryStepRenderer_State0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StackedBarRenderer3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      double[][] doubleArray0 = new double[5][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = stackedBarRenderer3D0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0);
      assertEquals(0.5, range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(351.5026813197501, 351.5026813197501);
      Range range0 = stackedBarRenderer3D0.findRangeBounds((CategoryDataset) null);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      stackedBarRenderer3D0.getIgnoreZeroValues();
      assertFalse(stackedBarRenderer3D0.getRenderAsPercentages());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      stackedBarRenderer3D0.hashCode();
      assertFalse(stackedBarRenderer3D0.getRenderAsPercentages());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      assertFalse(stackedBarRenderer3D0.getRenderAsPercentages());
      
      stackedBarRenderer3D0.setRenderAsPercentages(true);
      assertTrue(stackedBarRenderer3D0.getRenderAsPercentages());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0.0, false);
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.createStackedValueList(defaultKeyedValues2DDataset0, (Comparable) null, intArray0, 0.0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.KeyedObjects2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      StackedBarRenderer3D stackedBarRenderer3D1 = (StackedBarRenderer3D)stackedBarRenderer3D0.clone();
      boolean boolean0 = stackedBarRenderer3D0.equals(stackedBarRenderer3D1);
      assertTrue(boolean0);
      assertTrue(stackedBarRenderer3D1.getRenderAsPercentages());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0.0);
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.createStackedValueList((CategoryDataset) null, "({0}, {1}) = {2}", intArray0, 0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StackedBarRenderer3D", e);
      }
  }
}