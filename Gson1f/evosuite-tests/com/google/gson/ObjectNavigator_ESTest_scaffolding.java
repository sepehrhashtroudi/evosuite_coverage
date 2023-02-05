/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Feb 03 21:36:02 GMT 2023
 */

package com.google.gson;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ObjectNavigator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.gson.ObjectNavigator"; 
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
    java.lang.System.setProperty("user.country", "CA"); 
    java.lang.System.setProperty("user.dir", "/home/sepehr/masters/d4j-test-generation/evosuite_coverage/Gson1f"); 
    java.lang.System.setProperty("user.home", "/home/sepehr"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "sepehr"); 
    java.lang.System.setProperty("user.timezone", "America/Edmonton"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ObjectNavigator_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.gson.SyntheticFieldExclusionStrategy",
      "com.google.gson.ObjectNavigator$Visitor",
      "com.google.gson.Pair",
      "com.google.gson.Primitives",
      "com.google.gson.GenericArrayTypeImpl",
      "com.google.gson.CamelCaseSeparatorNamingPolicy",
      "com.google.gson.ObjectTypePair",
      "com.google.gson.FieldAttributes",
      "com.google.gson.LowerCamelCaseSeparatorNamingPolicy",
      "com.google.gson.LruCache",
      "com.google.gson.JavaFieldNamingPolicy",
      "com.google.gson.AnonymousAndLocalClassExclusionStrategy",
      "com.google.gson.Cache",
      "com.google.gson.ExposeAnnotationSerializationExclusionStrategy",
      "com.google.gson.ObjectNavigator",
      "com.google.gson.ExclusionStrategy",
      "com.google.gson.TypeUtils",
      "com.google.gson.TypeInfo",
      "com.google.gson.ExposeAnnotationDeserializationExclusionStrategy",
      "com.google.gson.ObjectNavigatorFactory",
      "com.google.gson.InnerClassExclusionStrategy",
      "com.google.gson.FieldNamingStrategy2Adapter",
      "com.google.gson.UpperCamelCaseSeparatorNamingPolicy",
      "com.google.gson.ParameterizedTypeHandlerMap",
      "com.google.gson.MemoryRefStack",
      "com.google.gson.DisjunctionExclusionStrategy",
      "com.google.gson.ParameterizedTypeImpl",
      "com.google.gson.ModifierBasedExclusionStrategy",
      "com.google.gson.JsonFieldNameValidator",
      "com.google.gson.UpperCaseNamingPolicy",
      "com.google.gson.Preconditions",
      "com.google.gson.FieldNamingStrategy2",
      "com.google.gson.annotations.Since",
      "com.google.gson.NullExclusionStrategy",
      "com.google.gson.SerializedNameAnnotationInterceptingNamingPolicy",
      "com.google.gson.RecursiveFieldNamingPolicy",
      "com.google.gson.ModifyFirstLetterNamingPolicy",
      "com.google.gson.VersionExclusionStrategy",
      "com.google.gson.CompositionFieldNamingPolicy",
      "com.google.gson.LowerCaseNamingPolicy",
      "com.google.gson.annotations.Until"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ObjectNavigator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.gson.ObjectNavigator",
      "com.google.gson.Primitives",
      "com.google.gson.MemoryRefStack",
      "com.google.gson.ObjectTypePair",
      "com.google.gson.ExposeAnnotationSerializationExclusionStrategy",
      "com.google.gson.LruCache",
      "com.google.gson.FieldAttributes",
      "com.google.gson.Preconditions",
      "com.google.gson.DisjunctionExclusionStrategy",
      "com.google.gson.SyntheticFieldExclusionStrategy",
      "com.google.gson.RecursiveFieldNamingPolicy",
      "com.google.gson.CamelCaseSeparatorNamingPolicy",
      "com.google.gson.VersionExclusionStrategy",
      "com.google.gson.InnerClassExclusionStrategy",
      "com.google.gson.ParameterizedTypeHandlerMap",
      "com.google.gson.TypeUtils",
      "com.google.gson.NullExclusionStrategy",
      "com.google.gson.CompositionFieldNamingPolicy",
      "com.google.gson.UpperCamelCaseSeparatorNamingPolicy",
      "com.google.gson.ModifyFirstLetterNamingPolicy",
      "com.google.gson.ObjectNavigatorFactory",
      "com.google.gson.ParameterizedTypeImpl",
      "com.google.gson.Pair",
      "com.google.gson.ExposeAnnotationDeserializationExclusionStrategy",
      "com.google.gson.TypeInfo",
      "com.google.gson.LowerCamelCaseSeparatorNamingPolicy",
      "com.google.gson.LowerCaseNamingPolicy",
      "com.google.gson.ModifierBasedExclusionStrategy",
      "com.google.gson.JavaFieldNamingPolicy",
      "com.google.gson.JsonFieldNameValidator",
      "com.google.gson.SerializedNameAnnotationInterceptingNamingPolicy",
      "com.google.gson.FieldNamingStrategy2Adapter",
      "com.google.gson.GenericArrayTypeImpl",
      "com.google.gson.AnonymousAndLocalClassExclusionStrategy",
      "com.google.gson.UpperCaseNamingPolicy"
    );
  }
}
