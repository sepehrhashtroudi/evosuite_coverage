/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Jan 26 20:14:35 GMT 2023
 */

package org.apache.commons.compress.changes;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Change_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.compress.changes.Change"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("user.dir", "/home/sepehr/masters/test_generation/evosuite_coverage/Compress1f"); 
    java.lang.System.setProperty("user.home", "/home/sepehr"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "sepehr"); 
    java.lang.System.setProperty("user.timezone", "America/Edmonton"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Change_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.compress.archivers.zip.ZipArchiveEntry",
      "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField",
      "org.apache.commons.compress.archivers.ArchiveEntry",
      "org.apache.commons.compress.archivers.cpio.CpioConstants",
      "org.apache.commons.compress.archivers.zip.UnicodePathExtraField",
      "org.apache.commons.compress.archivers.zip.ZipLong",
      "org.apache.commons.compress.archivers.zip.AsiExtraField",
      "org.apache.commons.compress.archivers.tar.TarConstants",
      "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField",
      "org.apache.commons.compress.archivers.zip.ZipExtraField",
      "org.apache.commons.compress.archivers.zip.ZipShort",
      "org.apache.commons.compress.archivers.tar.TarArchiveEntry",
      "org.apache.commons.compress.archivers.jar.JarArchiveEntry",
      "org.apache.commons.compress.archivers.tar.TarUtils",
      "org.apache.commons.compress.changes.Change",
      "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry",
      "org.apache.commons.compress.archivers.zip.ExtraFieldUtils",
      "org.apache.commons.compress.archivers.ar.ArArchiveEntry",
      "org.apache.commons.compress.archivers.zip.UnixStat",
      "org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField",
      "org.apache.commons.compress.archivers.zip.JarMarker"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Enumeration", false, Change_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Change_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.compress.changes.Change",
      "org.apache.commons.compress.archivers.tar.TarArchiveEntry",
      "org.apache.commons.compress.archivers.tar.TarUtils",
      "org.apache.commons.compress.archivers.zip.ZipArchiveEntry",
      "org.apache.commons.compress.archivers.jar.JarArchiveEntry",
      "org.apache.commons.compress.archivers.zip.ZipShort",
      "org.apache.commons.compress.archivers.zip.AsiExtraField",
      "org.apache.commons.compress.archivers.zip.JarMarker",
      "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField",
      "org.apache.commons.compress.archivers.zip.UnicodePathExtraField",
      "org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField",
      "org.apache.commons.compress.archivers.zip.ExtraFieldUtils",
      "org.apache.commons.compress.archivers.zip.ZipLong",
      "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry",
      "org.apache.commons.compress.archivers.ar.ArArchiveEntry",
      "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField"
    );
  }
}
