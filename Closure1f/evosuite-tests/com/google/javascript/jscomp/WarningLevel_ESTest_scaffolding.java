/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Jan 12 23:00:26 GMT 2023
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
public class WarningLevel_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.jscomp.WarningLevel"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(WarningLevel_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.javascript.jscomp.WarningLevel",
      "com.google.javascript.jscomp.CompilerOptions$TweakProcessing",
      "com.google.javascript.jscomp.type.ReverseAbstractInterpreter",
      "com.google.javascript.jscomp.CompilerOptions$LanguageMode",
      "com.google.javascript.jscomp.JsMessage$Builder",
      "com.google.javascript.jscomp.type.FlowScope",
      "com.google.javascript.jscomp.graph.SubGraph",
      "com.google.javascript.jscomp.graph.GraphNode",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.jscomp.NodeTraversal$Callback",
      "com.google.javascript.jscomp.SourceAst",
      "com.google.javascript.jscomp.CheckSideEffects",
      "com.google.javascript.jscomp.WarningLevel$1",
      "com.google.javascript.jscomp.graph.Graph",
      "com.google.javascript.jscomp.MessageBundle",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.jscomp.SourceExcerptProvider",
      "com.google.javascript.jscomp.ReferenceCollectingCallback$Behavior",
      "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.jscomp.graph.Annotatable",
      "com.google.javascript.jscomp.JSModule",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.rhino.SourcePosition",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode",
      "com.google.javascript.jscomp.ComposeWarningsGuard",
      "com.google.javascript.jscomp.NodeTraversal",
      "com.google.javascript.jscomp.ControlFlowGraph",
      "com.google.javascript.jscomp.graph.GraphvizGraph",
      "com.google.javascript.jscomp.ConcreteType$2",
      "com.google.javascript.jscomp.NodeTraversal$AbstractScopedCallback",
      "com.google.javascript.jscomp.ConcreteType$3",
      "com.google.javascript.jscomp.VariableMap",
      "com.google.javascript.jscomp.ConcreteType$1",
      "com.google.javascript.jscomp.ConcreteType$6",
      "com.google.javascript.jscomp.ProcessTweaks$TweakFunctionCall",
      "com.google.javascript.jscomp.ConcreteType$7",
      "com.google.javascript.jscomp.ConcreteType$4",
      "com.google.javascript.jscomp.HotSwapCompilerPass",
      "com.google.javascript.jscomp.ConcreteType$5",
      "com.google.javascript.jscomp.JsMessageVisitor",
      "com.google.javascript.jscomp.SourceFile$Builder",
      "com.google.javascript.jscomp.JsMessageDefinition",
      "com.google.javascript.jscomp.ShowByPathWarningsGuard$ShowType",
      "com.google.javascript.jscomp.GlobalNamespace",
      "com.google.javascript.jscomp.ConcreteType",
      "com.google.javascript.jscomp.graph.DiGraph$DiGraphEdge",
      "com.google.javascript.jscomp.CodingConvention",
      "com.google.javascript.jscomp.ControlStructureCheck",
      "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter",
      "com.google.javascript.jscomp.VariableReferenceCheck",
      "com.google.javascript.jscomp.WarningsGuard",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler",
      "com.google.javascript.jscomp.CheckDebuggerStatement",
      "com.google.javascript.jscomp.CompilerOptions",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.jscomp.ControlFlowGraph$Branch",
      "com.google.javascript.jscomp.CompilerOptions$Reach",
      "com.google.javascript.jscomp.DisambiguateProperties$Property",
      "com.google.javascript.jscomp.DisambiguateProperties$FindExternProperties",
      "com.google.javascript.jscomp.DisambiguateProperties$AbstractScopingCallback",
      "com.google.javascript.jscomp.ProcessTweaks$CollectTweaksResult",
      "com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType",
      "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy",
      "com.google.javascript.jscomp.ConcreteType$TypeFilter",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.jscomp.DiagnosticGroups",
      "com.google.javascript.rhino.jstype.RelationshipVisitor",
      "com.google.javascript.jscomp.ScopeCreator",
      "com.google.javascript.jscomp.CheckProvides",
      "com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem",
      "com.google.javascript.jscomp.graph.GraphvizGraph$GraphvizNode",
      "com.google.javascript.jscomp.ProcessTweaks$TweakInfo",
      "com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceMap",
      "com.google.javascript.jscomp.graph.AdjacencyGraph",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.jscomp.deps.SortedDependencies$CircularDependencyException",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.javascript.jscomp.CompilerOptions$AliasTransformation",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.jscomp.PropertyRenamingPolicy",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphEdge",
      "com.google.javascript.jscomp.CheckGlobalNames",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.javascript.jscomp.ConcreteType$ConcreteFunctionType",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.jscomp.CheckRegExp",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler$NullAliasTransformation",
      "com.google.javascript.jscomp.CssRenamingMap",
      "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode",
      "com.google.javascript.jscomp.CompilerOptions$AliasTransformationHandler",
      "com.google.javascript.jscomp.CheckGlobalThis",
      "com.google.javascript.jscomp.CssRenamingMap$Style",
      "com.google.javascript.jscomp.CompilerInput",
      "com.google.javascript.jscomp.SourceFile$Generated",
      "com.google.javascript.jscomp.AbstractCompiler",
      "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter",
      "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard",
      "com.google.javascript.jscomp.MessageFormatter",
      "com.google.javascript.jscomp.Compiler",
      "com.google.javascript.jscomp.DiagnosticGroup",
      "com.google.javascript.jscomp.NodeTraversal$ScopedCallback",
      "com.google.javascript.jscomp.graph.Graph$GraphEdge",
      "com.google.javascript.jscomp.ErrorHandler",
      "com.google.javascript.jscomp.SyntacticScopeCreator$RedeclarationHandler",
      "com.google.javascript.jscomp.ConcreteType$ConcreteUniqueType",
      "com.google.javascript.jscomp.SourceFile$Preloaded",
      "com.google.javascript.jscomp.SourceFile$Generator",
      "com.google.javascript.jscomp.JSError",
      "com.google.javascript.jscomp.ProcessDefines",
      "com.google.javascript.jscomp.StrictModeCheck",
      "com.google.javascript.jscomp.NodeTraversal$AbstractShallowCallback",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.javascript.jscomp.DisambiguateProperties$FindRenameableProperties",
      "com.google.javascript.jscomp.CodingConvention$ObjectLiteralCast",
      "com.google.javascript.jscomp.ShowByPathWarningsGuard",
      "com.google.javascript.jscomp.CodingConvention$SubclassRelationship",
      "com.google.javascript.jscomp.graph.GraphvizGraph$GraphvizEdge",
      "com.google.javascript.jscomp.CompilerPass",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.javascript.jscomp.ErrorManager",
      "com.google.javascript.jscomp.VariableRenamingPolicy",
      "com.google.javascript.jscomp.Scope",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode",
      "com.google.javascript.jscomp.Scope$Var",
      "com.google.javascript.jscomp.ReferenceCollectingCallback$Reference",
      "com.google.javascript.jscomp.graph.LatticeElement",
      "com.google.javascript.jscomp.ConcreteType$ConcreteUnionType",
      "com.google.javascript.jscomp.DisambiguateProperties$Warnings",
      "com.google.javascript.jscomp.ConcreteType$ConcreteAll",
      "com.google.javascript.jscomp.JsMessageVisitor$MalformedException",
      "com.google.javascript.jscomp.DisambiguateProperties$TypeSystem",
      "com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection",
      "com.google.javascript.jscomp.graph.Annotation",
      "com.google.javascript.jscomp.Region",
      "com.google.javascript.jscomp.ProcessTweaks",
      "com.google.javascript.jscomp.NodeTraversal$AbstractPostOrderCallback",
      "com.google.javascript.rhino.jstype.StaticReference",
      "com.google.javascript.jscomp.CompilerOptions$TracerMode",
      "com.google.javascript.jscomp.DisambiguateProperties",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph",
      "com.google.javascript.jscomp.VarCheck",
      "com.google.javascript.jscomp.CompilerOptions$DevMode",
      "com.google.javascript.jscomp.TypeValidator",
      "com.google.javascript.jscomp.ProcessTweaks$TweakFunction",
      "com.google.javascript.jscomp.DependencyOptions",
      "com.google.javascript.jscomp.JsMessage",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.jscomp.SourceFile$OnDisk",
      "com.google.javascript.rhino.jstype.StaticSymbolTable",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.javascript.jscomp.graph.DiGraph",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphEdge",
      "com.google.javascript.jscomp.CheckSuspiciousCode",
      "com.google.javascript.jscomp.ConstCheck",
      "com.google.javascript.rhino.jstype.Visitor",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.jscomp.graph.UnionFind",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.jscomp.deps.DependencyInfo",
      "com.google.javascript.jscomp.ProcessTweaks$CollectTweaks",
      "com.google.javascript.jscomp.NodeTraversal$AbstractNodeTypePruningCallback",
      "com.google.javascript.jscomp.NodeTraversal$AbstractShallowStatementCallback",
      "com.google.javascript.rhino.JSTypeExpression",
      "com.google.javascript.jscomp.JsMessage$IdGenerator",
      "com.google.javascript.jscomp.SyntacticScopeCreator",
      "com.google.javascript.jscomp.ConcreteType$ConcreteNoneType"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(WarningLevel_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.javascript.jscomp.WarningLevel",
      "com.google.javascript.jscomp.WarningLevel$1",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.CheckGlobalThis",
      "com.google.javascript.jscomp.DiagnosticGroups",
      "com.google.javascript.jscomp.DiagnosticGroup",
      "com.google.javascript.jscomp.TypeValidator",
      "com.google.javascript.jscomp.NodeTraversal$AbstractPostOrderCallback",
      "com.google.javascript.jscomp.VarCheck",
      "com.google.javascript.jscomp.CheckGlobalNames",
      "com.google.javascript.jscomp.VariableReferenceCheck",
      "com.google.javascript.jscomp.ProcessDefines",
      "com.google.javascript.jscomp.ProcessTweaks$TweakFunction",
      "com.google.javascript.jscomp.ProcessTweaks",
      "com.google.javascript.jscomp.CheckDebuggerStatement",
      "com.google.javascript.jscomp.CheckRegExp",
      "com.google.javascript.jscomp.SyntacticScopeCreator",
      "com.google.javascript.jscomp.CheckSideEffects",
      "com.google.javascript.jscomp.ConstCheck",
      "com.google.javascript.jscomp.DisambiguateProperties$Warnings",
      "com.google.javascript.jscomp.ControlStructureCheck",
      "com.google.javascript.jscomp.StrictModeCheck",
      "com.google.javascript.jscomp.CheckProvides",
      "com.google.javascript.jscomp.JsMessageVisitor",
      "com.google.javascript.jscomp.CheckSuspiciousCode",
      "com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler$NullAliasTransformation",
      "com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler",
      "com.google.javascript.jscomp.CompilerOptions",
      "com.google.javascript.jscomp.DependencyOptions",
      "com.google.javascript.jscomp.WarningsGuard",
      "com.google.javascript.jscomp.ShowByPathWarningsGuard",
      "com.google.javascript.jscomp.ShowByPathWarningsGuard$ShowType"
    );
  }
}
