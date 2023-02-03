/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Jan 12 23:21:42 GMT 2023
 */

package com.google.debugging.sourcemap;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SourceMapGeneratorV3_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.debugging.sourcemap.SourceMapGeneratorV3"; 
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
    java.lang.System.setProperty("user.dir", "/home/sepehr/masters/test_generation/evosuite_coverage/Closure1f"); 
    java.lang.System.setProperty("user.home", "/home/sepehr"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "sepehr"); 
    java.lang.System.setProperty("user.timezone", "America/Edmonton"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SourceMapGeneratorV3_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.debugging.sourcemap.SourceMapSection",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3",
      "com.google.debugging.sourcemap.Util",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingTraversal",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingVisitor",
      "com.google.debugging.sourcemap.SourceMapGenerator",
      "com.google.debugging.sourcemap.SourceMapSection$SectionType",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$LineMapper",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$UsedMappingCheck",
      "com.google.debugging.sourcemap.SourceMapParseException",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$EntryVisitor",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$Mapping",
      "com.google.debugging.sourcemap.FilePosition",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$ConsumerEntryVisitor"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SourceMapGeneratorV3_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.debugging.sourcemap.SourceMapGeneratorV3",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$Mapping",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$ConsumerEntryVisitor",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingTraversal",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$UsedMappingCheck",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$LineMapper",
      "com.google.debugging.sourcemap.Util",
      "com.google.debugging.sourcemap.SourceMapSection$SectionType",
      "com.google.debugging.sourcemap.SourceMapSection",
      "com.google.debugging.sourcemap.FilePosition"
    );
  }
}