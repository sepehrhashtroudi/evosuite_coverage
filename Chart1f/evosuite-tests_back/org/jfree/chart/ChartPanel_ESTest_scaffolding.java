/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Aug 27 03:25:40 GMT 2022
 */

package org.jfree.chart;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ChartPanel_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  protected static ExecutorService executor; 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.ChartPanel"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/sepehr/test_generation/evosuite_coverage/Chart1f"); 
    java.lang.System.setProperty("user.home", "/home/sepehr"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "sepehr"); 
    java.lang.System.setProperty("user.timezone", "America/Edmonton"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ChartPanel_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.MouseWheelHandler",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.editor.ChartEditorManager",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.time.Minute",
      "org.jfree.chart.Effect3D",
      "org.jfree.data.general.ValueDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.ui.PaintSample",
      "org.jfree.data.RangeInfo",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.data.pie.PieDatasetSelectionState",
      "org.jfree.chart.labels.StandardCrosshairLabelGenerator",
      "org.jfree.data.general.DatasetSelectionState",
      "org.jfree.chart.renderer.category.BarPainter",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.title.ShortTextTitle",
      "org.jfree.chart.editor.DefaultChartEditor",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.chart.ChartMouseEvent",
      "org.jfree.chart.axis.Timeline",
      "org.jfree.chart.ui.Contributor",
      "org.jfree.data.xy.XYDatasetSelectionState",
      "org.jfree.chart.needle.LongNeedle",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.chart.panel.PanHandler",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.entity.XYAnnotationEntity",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.util.ShadowGenerator",
      "org.jfree.data.time.Second",
      "org.jfree.chart.util.PaintMap",
      "org.jfree.chart.needle.PlumNeedle",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.data.xy.XYIntervalSeries",
      "org.jfree.chart.title.CompositeTitle",
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.data.category.AbstractCategoryDataset",
      "org.jfree.chart.renderer.PolarItemRenderer",
      "org.jfree.data.xy.XYZDataset",
      "org.jfree.chart.event.OverlayChangeListener",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.data.statistics.MultiValueCategoryDataset",
      "org.jfree.data.gantt.TaskSeries",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.ui.ExtensionFileFilter",
      "org.jfree.chart.needle.PointerNeedle",
      "org.jfree.chart.ui.Licences",
      "org.jfree.data.category.SelectableCategoryDataset",
      "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.data.time.Millisecond",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.annotations.AbstractAnnotation",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.labels.CategoryItemLabelGenerator",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.chart.imagemap.URLTagFragmentGenerator",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.block.EntityBlockResult",
      "org.jfree.chart.util.XYCoordinateType",
      "org.jfree.chart.ui.FontDisplayField",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.ChartMouseListener",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.pie.PieDataset",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.needle.ShipNeedle",
      "org.jfree.data.event.DatasetChangeListener",
      "org.jfree.data.Value",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.data.gantt.Task",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.panel.Overlay",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.labels.XYSeriesLabelGenerator",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.chart.plot.PieLabelRecord",
      "org.jfree.data.DomainOrder",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.data.xy.SelectableXYDataset",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.title.Title",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.chart.labels.PieToolTipGenerator",
      "org.jfree.data.gantt.SlidingGanttCategoryDataset",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer$State",
      "org.jfree.data.general.DatasetAndSelection",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.panel.ZoomHandler",
      "org.jfree.data.time.Day",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.chart.ui.BasicProjectInfo",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.urls.CategoryURLGenerator",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.chart.entity.TickLabelEntity",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.chart.panel.CrosshairOverlay",
      "org.jfree.chart.axis.DateAxis$1",
      "org.jfree.chart.entity.CategoryItemEntity",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.needle.LineNeedle",
      "org.jfree.chart.entity.CategoryLabelEntity",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.chart.event.OverlayChangeEvent",
      "org.jfree.chart.labels.CrosshairLabelGenerator",
      "org.jfree.chart.annotations.XYTitleAnnotation",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.ComparableObjectItem",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.BufferedImageRenderingSource",
      "org.jfree.data.event.SeriesChangeEvent",
      "org.jfree.chart.util.GradientPaintTransformer",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.data.general.SeriesChangeType",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.chart.title.ImageTitle",
      "org.jfree.chart.encoders.ImageEncoderFactory",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.chart.encoders.ImageEncoder",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.util.DefaultShadowGenerator",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.data.statistics.StatisticalCategoryDataset",
      "org.jfree.chart.event.DatasetChangeInfo",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.Values",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.needle.MiddlePinNeedle",
      "org.jfree.data.general.SeriesException",
      "org.jfree.chart.event.ChartChangeListener",
      "org.jfree.chart.entity.AxisEntity",
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.text.TextBox",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.labels.CategorySeriesLabelGenerator",
      "org.jfree.chart.needle.WindNeedle",
      "org.jfree.data.category.CategoryDatasetSelectionState",
      "org.jfree.chart.axis.MarkerAxisBand",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.chart.ui.ProjectInfo",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.editor.DefaultAxisEditor",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.annotations.Annotation",
      "org.jfree.chart.axis.DateTickUnitType",
      "org.jfree.chart.editor.DefaultPlotEditor",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.chart.entity.TitleEntity",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.labels.PieSectionLabelGenerator",
      "org.jfree.chart.axis.Tick",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.chart.urls.PieURLGenerator",
      "org.jfree.chart.plot.CategoryCrosshairState",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.urls.XYURLGenerator",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.plot.Selectable",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.axis.SegmentedTimeline$BaseTimelineSegmentRange",
      "org.jfree.chart.labels.CategoryToolTipGenerator",
      "org.jfree.chart.renderer.category.GradientBarPainter",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.entity.XYItemEntity",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.TimePeriodValue",
      "org.jfree.chart.ui.StrokeSample",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.data.DomainInfo",
      "org.jfree.chart.renderer.RenderAttributes",
      "org.jfree.data.gantt.XYTaskDataset",
      "org.jfree.chart.editor.DefaultChartEditorFactory",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.annotations.CategoryAnnotation",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.data.xy.XYDomainInfo",
      "org.jfree.chart.axis.SegmentedTimeline$SegmentRange",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.encoders.SunPNGEncoderAdapter",
      "org.jfree.chart.editor.ChartEditor",
      "org.jfree.chart.RenderingSource",
      "org.jfree.chart.plot.MeterInterval",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.time.DateRange",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.event.AnnotationChangeListener",
      "org.jfree.data.function.Function2D",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.plot.PieSelectionAttributes",
      "org.jfree.chart.editor.DefaultNumberAxisEditor",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.data.xy.XYIntervalDataItem",
      "org.jfree.data.xy.OHLCDataset",
      "org.jfree.chart.util.SerialUtilities",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.data.RangeType",
      "org.jfree.data.time.Month",
      "org.jfree.chart.title.DateTitle",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.chart.renderer.category.ScatterRenderer",
      "org.jfree.chart.block.EntityBlockParams",
      "org.jfree.data.general.Dataset",
      "org.jfree.data.pie.AbstractPieDataset",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.JFreeChart",
      "org.jfree.data.pie.PieDatasetChangeInfo",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.data.DataUtilities",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.data.xy.WindDataset",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.chart.JFreeChartInfo",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.data.time.MonthConstants",
      "org.jfree.chart.util.StrokeMap",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "org.jfree.chart.entity.PlotEntity",
      "org.jfree.chart.axis.SegmentedTimeline$Segment",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.data.KeyedObjects",
      "org.jfree.chart.ui.Library",
      "org.jfree.data.time.SerialDate",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.plot.PiePlotState",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.plot.XYCrosshairState",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.category.SlidingCategoryDataset",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.labels.XYToolTipGenerator",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.data.event.SeriesChangeListener",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.block.Block",
      "org.jfree.data.pie.PieDatasetChangeType",
      "org.jfree.data.pie.SelectablePieDataset",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.chart.labels.XYItemLabelGenerator",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.data.xy.XYRangeInfo",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.data.general.SeriesChangeInfo",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.data.general.KeyedValues2DDataset",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.data.Range",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.util.LogFormat",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.chart.editor.DefaultTitleEditor",
      "org.jfree.data.category.IntervalCategoryDataset",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.data.time.Year",
      "org.jfree.chart.panel.AbstractOverlay",
      "org.jfree.chart.Drawable",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.imagemap.ToolTipTagFragmentGenerator",
      "org.jfree.chart.text.TextLine",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.chart.plot.Crosshair",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.needle.PinNeedle",
      "org.jfree.chart.panel.AbstractMouseHandler",
      "org.jfree.data.xy.TableXYDataset",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.chart.plot.Pannable",
      "org.jfree.data.gantt.GanttCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.Values2D",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.data.statistics.BoxAndWhiskerXYDataset",
      "org.jfree.data.pie.DefaultPieDataset",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.chart.axis.TickType",
      "org.jfree.data.general.KeyedValuesDataset",
      "org.jfree.data.time.Week",
      "org.jfree.chart.entity.PieSectionEntity",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.event.PlotChangeListener",
      "org.jfree.chart.editor.ChartEditorFactory",
      "org.jfree.data.general.Series",
      "org.jfree.chart.ui.LCBLayout",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.data.event.DatasetChangeEvent",
      "org.jfree.chart.renderer.PaintScale",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.axis.CategoryLabelWidthType"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.sql.Connection", false, ChartPanel_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.ChartMouseListener", false, ChartPanel_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ChartPanel_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.editor.DefaultChartEditorFactory",
      "org.jfree.chart.editor.ChartEditorManager",
      "org.jfree.chart.encoders.SunPNGEncoderAdapter",
      "org.jfree.chart.encoders.ImageEncoderFactory",
      "org.jfree.chart.util.SerialUtilities",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.pie.AbstractPieDataset",
      "org.jfree.data.pie.DefaultPieDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.KeyedObjects",
      "org.jfree.chart.event.DatasetChangeInfo",
      "org.jfree.data.event.DatasetChangeEvent",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.gantt.XYTaskDataset",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.general.DatasetAndSelection",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.RangeType",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.ui.Library",
      "org.jfree.chart.ui.BasicProjectInfo",
      "org.jfree.chart.ui.ProjectInfo",
      "org.jfree.chart.JFreeChartInfo",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.ui.Contributor",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.panel.AbstractMouseHandler",
      "org.jfree.chart.panel.ZoomHandler",
      "org.jfree.chart.panel.PanHandler",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.util.PaintMap",
      "org.jfree.chart.util.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.plot.PieSelectionAttributes",
      "org.jfree.chart.util.DefaultShadowGenerator",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.BufferedImageRenderingSource",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.event.OverlayChangeEvent",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.util.LogFormat",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.DataUtilities",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.renderer.RenderAttributes",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateTickUnitType",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.data.category.AbstractCategoryDataset",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.GradientBarPainter",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.data.category.SlidingCategoryDataset",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Week",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.data.time.Hour",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.data.gantt.SlidingGanttCategoryDataset",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Minute",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.title.ImageTitle",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.ui.ExtensionFileFilter",
      "org.jfree.chart.panel.AbstractOverlay",
      "org.jfree.chart.panel.CrosshairOverlay",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.renderer.category.ScatterRenderer",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.chart.editor.DefaultChartEditor",
      "org.jfree.chart.ui.LCBLayout",
      "org.jfree.chart.ui.PaintSample",
      "org.jfree.chart.editor.DefaultTitleEditor",
      "org.jfree.chart.ui.FontDisplayField",
      "org.jfree.chart.editor.DefaultPlotEditor",
      "org.jfree.chart.ui.StrokeSample",
      "org.jfree.chart.editor.DefaultAxisEditor",
      "org.jfree.chart.editor.DefaultNumberAxisEditor",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.title.DateTitle",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.annotations.AbstractAnnotation",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.chart.annotations.XYTitleAnnotation",
      "org.jfree.chart.util.XYCoordinateType",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.title.ShortTextTitle",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.entity.TitleEntity",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.MouseWheelHandler",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.plot.Crosshair",
      "org.jfree.chart.labels.StandardCrosshairLabelGenerator",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.chart.title.CompositeTitle",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.ChartMouseEvent"
    );
  }
}
