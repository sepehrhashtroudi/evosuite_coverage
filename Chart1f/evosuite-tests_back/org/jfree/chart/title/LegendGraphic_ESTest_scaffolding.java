/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 26 23:06:23 GMT 2022
 */

package org.jfree.chart.title;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class LegendGraphic_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.title.LegendGraphic"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(LegendGraphic_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.Drawable",
      "org.jfree.chart.util.GradientPaintTransformer",
      "org.jfree.data.event.SeriesChangeEvent",
      "org.jfree.data.DomainOrder",
      "org.jfree.data.DomainInfo",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.title.LegendGraphic",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.data.general.DatasetSelectionState",
      "org.jfree.data.xy.TableXYDataset",
      "org.jfree.data.general.SeriesChangeType",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.chart.util.Size2D",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.util.SerialUtilities",
      "org.jfree.data.event.SeriesChangeListener",
      "org.jfree.data.xy.XYDatasetSelectionState",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.block.Block",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.data.event.DatasetChangeEvent",
      "org.jfree.chart.util.UnitType",
      "org.jfree.data.general.SeriesChangeInfo",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.data.event.DatasetChangeListener",
      "org.jfree.chart.event.DatasetChangeInfo",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.data.Range",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.data.general.SeriesException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(LegendGraphic_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.title.LegendGraphic",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.util.SerialUtilities",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.data.Range",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.xy.IntervalXYDelegate"
    );
  }
}
