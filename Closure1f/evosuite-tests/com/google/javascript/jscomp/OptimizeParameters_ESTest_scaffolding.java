/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Feb 16 09:58:48 GMT 2023
 */

package com.google.javascript.jscomp;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class OptimizeParameters_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.jscomp.OptimizeParameters"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(OptimizeParameters_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.javascript.jscomp.ErrorHandler",
      "com.google.javascript.jscomp.type.ReverseAbstractInterpreter",
      "com.google.javascript.jscomp.SourceFile$Preloaded",
      "com.google.javascript.jscomp.SourceFile$Generator",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.javascript.jscomp.NodeTraversal$Callback",
      "com.google.javascript.jscomp.SourceAst",
      "com.google.javascript.jscomp.SimpleDefinitionFinder",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.jscomp.SourceExcerptProvider",
      "com.google.javascript.jscomp.CompilerPass",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.jscomp.ErrorManager",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.javascript.jscomp.Scope",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.jscomp.JSModule",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.javascript.jscomp.ComposeWarningsGuard",
      "com.google.javascript.jscomp.JsAst",
      "com.google.javascript.jscomp.OptimizeParameters",
      "com.google.javascript.jscomp.SourceFile$Builder",
      "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.jscomp.DefinitionSite",
      "com.google.javascript.jscomp.Region",
      "com.google.javascript.rhino.IR",
      "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter",
      "com.google.javascript.jscomp.WarningsGuard",
      "com.google.javascript.jscomp.DefaultPassConfig",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.jscomp.CleanupPasses",
      "com.google.javascript.jscomp.DefinitionProvider",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.jscomp.PassConfig",
      "com.google.javascript.jscomp.SyntheticAst",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.jscomp.OptimizeParameters$Parameter",
      "com.google.javascript.jscomp.ScopeCreator",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.javascript.jscomp.SourceFile$OnDisk",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.rhino.jstype.StaticSymbolTable",
      "com.google.javascript.jscomp.JSModuleGraph$ModuleDependenceException",
      "com.google.javascript.jscomp.deps.SortedDependencies$CircularDependencyException",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.javascript.jscomp.OptimizeCalls$CallGraphCompilerPass",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.deps.DependencyInfo",
      "com.google.javascript.jscomp.deps.SortedDependencies$MissingProvideException",
      "com.google.javascript.jscomp.CompilerInput",
      "com.google.javascript.jscomp.SourceFile$Generated",
      "com.google.javascript.jscomp.AbstractCompiler",
      "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter",
      "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard",
      "com.google.javascript.jscomp.Compiler"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(OptimizeParameters_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.javascript.jscomp.OptimizeParameters",
      "com.google.javascript.jscomp.OptimizeParameters$Parameter",
      "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.javascript.jscomp.SourceFile$Builder",
      "com.google.javascript.jscomp.CompilerInput",
      "com.google.javascript.jscomp.JsAst",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.jscomp.SyntheticAst",
      "com.google.javascript.rhino.IR",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.jscomp.JSModule"
    );
  }
}
