/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 26 21:26:57 GMT 2022
 */

package org.jfree.data.xy;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MatrixSeries_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.data.xy.MatrixSeries"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MatrixSeries_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.category.IntervalCategoryDataset",
      "org.jfree.data.time.TimePeriodValue",
      "org.jfree.data.time.Year",
      "org.jfree.data.event.SeriesChangeEvent",
      "org.jfree.data.DomainOrder",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.xy.SelectableXYDataset",
      "org.jfree.data.xy.XYZDataset",
      "org.jfree.data.DomainInfo",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.xy.YIntervalSeries",
      "org.jfree.data.gantt.TaskSeries",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.XIntervalDataItem",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.RangeInfo",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.data.general.DatasetSelectionState",
      "org.jfree.data.xy.TableXYDataset",
      "org.jfree.data.general.SeriesChangeType",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.data.gantt.GanttCategoryDataset",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.data.Values2D",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.event.SeriesChangeListener",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.data.xy.XYDatasetSelectionState",
      "org.jfree.data.general.Dataset",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.event.DatasetChangeEvent",
      "org.jfree.data.general.SeriesChangeInfo",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.data.xy.WindDataset",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.data.event.DatasetChangeListener",
      "org.jfree.chart.event.DatasetChangeInfo",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.xy.YIntervalDataItem",
      "org.jfree.data.gantt.Task",
      "org.jfree.data.time.MonthConstants",
      "org.jfree.data.xy.XIntervalSeries",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.data.ComparableObjectItem",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.general.SeriesException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MatrixSeries_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.data.event.SeriesChangeEvent",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.YIntervalSeries",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.event.DatasetChangeInfo",
      "org.jfree.data.event.DatasetChangeEvent",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.chart.util.ObjectUtilities"
    );
  }
}
