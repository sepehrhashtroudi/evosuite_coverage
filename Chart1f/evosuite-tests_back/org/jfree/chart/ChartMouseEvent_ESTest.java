/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:27:21 GMT 2022
 */

package org.jfree.chart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.geom.Line2D;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JToolTip;
import javax.swing.JViewport;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.MenuDragMouseEvent;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartMouseEvent;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.entity.ChartEntity;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.WaferMapRenderer;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.WaferMapDataset;
import org.jfree.data.pie.DefaultPieDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ChartMouseEvent_ESTest extends ChartMouseEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      JInternalFrame jInternalFrame0 = new JInternalFrame();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jInternalFrame0, 10, 10, 0, 15, 10, (-993), (-1381), (-993), false, 89, (-993), 15, 1.0F);
      mouseWheelEvent0.consume();
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, mouseWheelEvent0, (ChartEntity) null);
      MouseEvent mouseEvent0 = chartMouseEvent0.getTrigger();
      assertFalse(mouseEvent0.isMetaDown());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset(0.0);
      CompassPlot compassPlot0 = new CompassPlot(defaultValueDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("_EcaC!Lop", compassPlot0);
      JMenu jMenu0 = new JMenu("org.jfree.data.category.AbstractCategoryDataset", false);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jMenu0, 1, 1, (-977), (-977), (-977), 2403, 1, (-977), true, (-63), 10, 10);
      ChartEntity chartEntity0 = new ChartEntity(compassPlot0.DEFAULT_LEGEND_ITEM_BOX);
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, mouseWheelEvent0, chartEntity0);
      MouseWheelEvent mouseWheelEvent1 = (MouseWheelEvent)chartMouseEvent0.getTrigger();
      assertEquals((-63), mouseWheelEvent1.getScrollType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset((-2067), Integer.MAX_VALUE, (Number) null);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, (WaferMapRenderer) null);
      JFreeChart jFreeChart0 = new JFreeChart("", waferMapPlot0);
      JViewport jViewport0 = new JViewport();
      MouseEvent mouseEvent0 = new MouseEvent(jViewport0, 10, 0L, (-2842), (-2842), 0, (-2842), 0, 10, false, 0);
      ChartEntity chartEntity0 = new ChartEntity(waferMapPlot0.DEFAULT_LEGEND_ITEM_BOX, (String) null);
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, mouseEvent0, chartEntity0);
      MouseEvent mouseEvent1 = chartMouseEvent0.getTrigger();
      assertTrue(mouseEvent1.isMetaDown());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      MeterPlot meterPlot0 = new MeterPlot();
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.data.general.SeriesChangeType", (Font) null, meterPlot0, true);
      MenuElement[] menuElementArray0 = new MenuElement[0];
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      MenuDragMouseEvent menuDragMouseEvent0 = new MenuDragMouseEvent(defaultTreeCellRenderer0, (-1715), (-2694L), (-1715), 0, 0, 10, 0, 10, false, menuElementArray0, menuSelectionManager0);
      ChartEntity chartEntity0 = new ChartEntity(meterPlot0.DEFAULT_LEGEND_ITEM_BOX, "org.jfree.data.general.SeriesChangeType");
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, menuDragMouseEvent0, chartEntity0);
      MouseEvent mouseEvent0 = chartMouseEvent0.getTrigger();
      assertTrue(mouseEvent0.isAltDown());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      JComboBox<Integer> jComboBox0 = new JComboBox<Integer>();
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      MenuDragMouseEvent menuDragMouseEvent0 = new MenuDragMouseEvent(jComboBox0, 0, 2219L, 10, 15, 15, 197, (-2897), (-3909), true, (MenuElement[]) null, menuSelectionManager0);
      ChartEntity chartEntity0 = new ChartEntity(multiplePiePlot0.DEFAULT_LEGEND_ITEM_CIRCLE, "!8`");
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, menuDragMouseEvent0, chartEntity0);
      MouseEvent mouseEvent0 = chartMouseEvent0.getTrigger();
      assertEquals(0, mouseEvent0.getButton());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultKeyedValues2DDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false, false, true, false, false);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(chartPanel0, 680, 768, 830, 680, 0, 0, false, 0, 10, 0);
      ChartEntity chartEntity0 = new ChartEntity(multiplePiePlot0.DEFAULT_LEGEND_ITEM_BOX);
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, mouseWheelEvent0, chartEntity0);
      MouseEvent mouseEvent0 = chartMouseEvent0.getTrigger();
      assertTrue(mouseEvent0.isAltGraphDown());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("H*CVY)iXFS,F4");
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(periodAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("H*CVY)iXFS,F4", combinedRangeXYPlot0);
      JInternalFrame jInternalFrame0 = new JInternalFrame("H*CVY)iXFS,F4", true, false, false);
      MouseEvent mouseEvent0 = new MouseEvent(jInternalFrame0, 500, 381L, 10, 500, 10, 10, true);
      ChartEntity chartEntity0 = new ChartEntity(combinedRangeXYPlot0.DEFAULT_LEGEND_ITEM_CIRCLE, "v`D");
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, mouseEvent0, chartEntity0);
      MouseEvent mouseEvent1 = chartMouseEvent0.getTrigger();
      assertFalse(mouseEvent1.isConsumed());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      PiePlot piePlot0 = new PiePlot(defaultPieDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("({0}, {1}) = {3} - {4}", piePlot0);
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, (MouseEvent) null, (ChartEntity) null);
      ChartEntity chartEntity0 = chartMouseEvent0.getEntity();
      assertNull(chartEntity0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultKeyedValues2DDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      jFreeChart0.setNotify(false);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false, false, true, false, false);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(chartPanel0, 680, 768, 830, 680, 0, 0, false, 0, 10, 0);
      ChartEntity chartEntity0 = new ChartEntity(multiplePiePlot0.DEFAULT_LEGEND_ITEM_BOX);
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, mouseWheelEvent0, chartEntity0);
      JFreeChart jFreeChart1 = chartMouseEvent0.getChart();
      assertEquals(15, jFreeChart1.getBackgroundImageAlignment());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultKeyedValues2DDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false, false, true, false, false);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(chartPanel0, 680, 768, 830, 680, 0, 0, false, 0, 10, 0);
      ChartEntity chartEntity0 = new ChartEntity(multiplePiePlot0.DEFAULT_LEGEND_ITEM_BOX);
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, mouseWheelEvent0, chartEntity0);
      JFreeChart jFreeChart1 = chartMouseEvent0.getChart();
      assertEquals(15, jFreeChart1.getBackgroundImageAlignment());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PolarPlot polarPlot0 = new PolarPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", polarPlot0);
      jFreeChart0.setBackgroundImageAlignment((-9999));
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, (MouseEvent) null, (ChartEntity) null);
      JFreeChart jFreeChart1 = chartMouseEvent0.getChart();
      assertEquals(0.5F, JFreeChart.DEFAULT_BACKGROUND_IMAGE_ALPHA, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JCheckBox jCheckBox0 = new JCheckBox((String) null, (Icon) null, false);
      MenuSelectionManager menuSelectionManager0 = MenuSelectionManager.defaultManager();
      MenuDragMouseEvent menuDragMouseEvent0 = new MenuDragMouseEvent(jCheckBox0, 0, 0, 0, 58, 0, 58, false, (MenuElement[]) null, menuSelectionManager0);
      Line2D.Double line2D_Double0 = new Line2D.Double();
      ChartEntity chartEntity0 = new ChartEntity(line2D_Double0);
      ChartMouseEvent chartMouseEvent0 = null;
      try {
        chartMouseEvent0 = new ChartMouseEvent((JFreeChart) null, menuDragMouseEvent0, chartEntity0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultStatisticalCategoryDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartEntity chartEntity0 = new ChartEntity(multiplePiePlot0.DEFAULT_LEGEND_ITEM_BOX, (String) null, "");
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, (MouseEvent) null, chartEntity0);
      MouseEvent mouseEvent0 = chartMouseEvent0.getTrigger();
      assertNull(mouseEvent0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PolarPlot polarPlot0 = new PolarPlot();
      JFreeChart jFreeChart0 = new JFreeChart(polarPlot0);
      JToolTip jToolTip0 = new JToolTip();
      MouseEvent mouseEvent0 = new MouseEvent(jToolTip0, 0, 709L, 15, 0, (-2642), 15, false);
      ChartEntity chartEntity0 = new ChartEntity(polarPlot0.DEFAULT_LEGEND_ITEM_CIRCLE, ",LYFe]WSi{kL", ",LYFe]WSi{kL");
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, mouseEvent0, chartEntity0);
      ChartEntity chartEntity1 = chartMouseEvent0.getEntity();
      assertEquals(",LYFe]WSi{kL", chartEntity1.getToolTipText());
  }
}
