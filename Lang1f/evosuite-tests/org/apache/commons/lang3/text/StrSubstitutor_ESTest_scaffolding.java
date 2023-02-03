/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Aug 15 20:40:53 GMT 2022
 */

package org.apache.commons.lang3.text;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class StrSubstitutor_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.lang3.text.StrSubstitutor"; 
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
    java.lang.System.setProperty("user.dir", "/home/sepehr/test_generation/all_projects_coverage/evosuite_coverage/Lang1f"); 
    java.lang.System.setProperty("user.home", "/home/sepehr"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "sepehr"); 
    java.lang.System.setProperty("user.timezone", "America/Edmonton"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(StrSubstitutor_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.lang3.text.StrTokenizer",
      "org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter",
      "org.apache.commons.lang3.ObjectUtils$Null",
      "org.apache.commons.lang3.text.StrMatcher$CharMatcher",
      "org.apache.commons.lang3.text.StrBuilder$StrBuilderTokenizer",
      "org.apache.commons.lang3.SystemUtils",
      "org.apache.commons.lang3.JavaVersion",
      "org.apache.commons.lang3.text.StrMatcher$NoMatcher",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.commons.lang3.text.StrMatcher",
      "org.apache.commons.lang3.text.StrMatcher$TrimMatcher",
      "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher",
      "org.apache.commons.lang3.ObjectUtils",
      "org.apache.commons.lang3.builder.Builder",
      "org.apache.commons.lang3.text.StrLookup$MapStrLookup",
      "org.apache.commons.lang3.exception.CloneFailedException",
      "org.apache.commons.lang3.text.StrMatcher$StringMatcher",
      "org.apache.commons.lang3.text.StrLookup",
      "org.apache.commons.lang3.text.StrSubstitutor",
      "org.apache.commons.lang3.text.StrBuilder$StrBuilderReader",
      "org.apache.commons.lang3.text.StrBuilder"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(StrSubstitutor_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.lang3.text.StrMatcher$CharMatcher",
      "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher",
      "org.apache.commons.lang3.text.StrMatcher$TrimMatcher",
      "org.apache.commons.lang3.text.StrMatcher$NoMatcher",
      "org.apache.commons.lang3.text.StrMatcher",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.commons.lang3.text.StrMatcher$StringMatcher",
      "org.apache.commons.lang3.text.StrSubstitutor",
      "org.apache.commons.lang3.text.StrLookup$MapStrLookup",
      "org.apache.commons.lang3.text.StrLookup",
      "org.apache.commons.lang3.text.StrBuilder",
      "org.apache.commons.lang3.JavaVersion",
      "org.apache.commons.lang3.SystemUtils",
      "org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter",
      "org.apache.commons.lang3.text.StrBuilder$StrBuilderReader",
      "org.apache.commons.lang3.ObjectUtils$Null",
      "org.apache.commons.lang3.ObjectUtils"
    );
  }
}
