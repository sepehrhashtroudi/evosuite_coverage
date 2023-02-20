/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Feb 16 09:45:15 GMT 2023
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
public class CheckSideEffects_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.jscomp.CheckSideEffects"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CheckSideEffects_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.javascript.jscomp.MakeDeclaredNamesUnique",
      "com.google.javascript.jscomp.CoalesceVariableNames",
      "com.google.javascript.jscomp.graph.LinkedUndirectedGraph",
      "com.google.javascript.jscomp.type.ReverseAbstractInterpreter",
      "com.google.javascript.jscomp.graph.GraphColoring$GreedyGraphColoring",
      "com.google.javascript.jscomp.JsMessage$Builder",
      "com.google.javascript.jscomp.type.FlowScope",
      "com.google.javascript.jscomp.graph.SubGraph",
      "com.google.javascript.jscomp.MinimizeExitPoints",
      "com.google.javascript.jscomp.graph.GraphNode",
      "com.google.javascript.jscomp.NodeTraversal$Callback",
      "com.google.javascript.jscomp.CheckSideEffects",
      "com.google.javascript.jscomp.SourceAst",
      "com.google.javascript.jscomp.graph.Graph",
      "com.google.javascript.jscomp.MessageBundle",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.jscomp.SourceExcerptProvider",
      "com.google.javascript.jscomp.InlineProperties$PropertyInfo",
      "com.google.javascript.jscomp.graph.LinkedUndirectedGraph$AnnotatedLinkedUndirectedGraphNode",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.jscomp.graph.Annotatable",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.javascript.jscomp.JSModule",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.jscomp.SyntacticScopeCreator$1",
      "com.google.javascript.jscomp.InferJSDocInfo",
      "com.google.javascript.jscomp.GoogleJsMessageIdGenerator",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode",
      "com.google.javascript.jscomp.XtbMessageBundle$SecureEntityResolver",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.javascript.jscomp.NodeTraversal",
      "com.google.javascript.jscomp.ControlFlowGraph",
      "com.google.javascript.jscomp.ComposeWarningsGuard",
      "com.google.javascript.jscomp.ExternExportsPass",
      "com.google.javascript.jscomp.graph.GraphvizGraph",
      "com.google.javascript.jscomp.NodeTraversal$AbstractScopedCallback",
      "com.google.javascript.jscomp.VariableMap",
      "com.google.javascript.jscomp.ExpandJqueryAliases",
      "com.google.javascript.jscomp.JsAst",
      "com.google.javascript.jscomp.HotSwapCompilerPass",
      "com.google.javascript.jscomp.NodeUtil",
      "com.google.javascript.jscomp.JsMessageVisitor",
      "com.google.javascript.jscomp.SourceFile$Builder",
      "com.google.javascript.jscomp.JsMessageDefinition",
      "com.google.javascript.jscomp.CheckMissingGetCssName",
      "com.google.javascript.jscomp.graph.DiGraph$DiGraphEdge",
      "com.google.javascript.jscomp.MoveFunctionDeclarations",
      "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter",
      "com.google.javascript.jscomp.MemoizedScopeCreator",
      "com.google.javascript.jscomp.WarningsGuard",
      "com.google.javascript.jscomp.RenameVars$Assignment",
      "com.google.javascript.jscomp.Normalize$ScopeTicklingCallback",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.javascript.jscomp.CheckDebuggerStatement",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.jscomp.ControlFlowGraph$Branch",
      "com.google.javascript.jscomp.ConvertToDottedProperties",
      "com.google.javascript.jscomp.SyntheticAst",
      "com.google.javascript.jscomp.Normalize$NormalizeStatements",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.rhino.jstype.RelationshipVisitor",
      "com.google.javascript.jscomp.ScopeCreator",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.javascript.jscomp.InlineProperties",
      "com.google.javascript.jscomp.CheckSideEffects$StripProtection",
      "com.google.javascript.jscomp.graph.GraphvizGraph$GraphvizNode",
      "com.google.javascript.jscomp.graph.AdjacencyGraph",
      "com.google.javascript.jscomp.deps.SortedDependencies$CircularDependencyException",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphEdge",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.javascript.jscomp.Normalize$1",
      "com.google.javascript.jscomp.EmptyMessageBundle",
      "com.google.javascript.jscomp.FieldCleanupPass$QualifiedNameSearchTraversal",
      "com.google.javascript.jscomp.ClosureRewriteClass$ClassDefinition",
      "com.google.javascript.jscomp.CheckRegExp",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.CssRenamingMap",
      "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback$SideEffectAccumulator",
      "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode",
      "com.google.javascript.jscomp.PrepareAst",
      "com.google.javascript.jscomp.CombinedCompilerPass",
      "com.google.javascript.jscomp.CheckGlobalThis",
      "com.google.javascript.jscomp.CssRenamingMap$Style",
      "com.google.javascript.jscomp.UnreachableCodeElimination",
      "com.google.javascript.jscomp.CompilerInput",
      "com.google.javascript.jscomp.SourceFile$Generated",
      "com.google.javascript.jscomp.AbstractCompiler",
      "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter",
      "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard",
      "com.google.javascript.jscomp.MessageFormatter",
      "com.google.javascript.jscomp.ProcessClosurePrimitives",
      "com.google.javascript.jscomp.Compiler",
      "com.google.javascript.jscomp.Normalize$DuplicateDeclarationHandler",
      "com.google.javascript.jscomp.NodeTraversal$ScopedCallback",
      "com.google.javascript.jscomp.graph.Graph$GraphEdge",
      "com.google.javascript.jscomp.LineNumberCheck",
      "com.google.javascript.jscomp.ClosureRewriteClass",
      "com.google.javascript.jscomp.DiagnosticGroup",
      "com.google.javascript.jscomp.ErrorHandler",
      "com.google.javascript.jscomp.SyntacticScopeCreator$RedeclarationHandler",
      "com.google.javascript.jscomp.SourceFile$Preloaded",
      "com.google.javascript.jscomp.Denormalize",
      "com.google.javascript.jscomp.SourceFile$Generator",
      "com.google.javascript.jscomp.JSError",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.javascript.jscomp.Denormalize$StripConstantAnnotations",
      "com.google.javascript.jscomp.ReplaceMessagesForChrome",
      "com.google.javascript.jscomp.StrictModeCheck",
      "com.google.javascript.jscomp.NodeTraversal$AbstractShallowCallback",
      "com.google.javascript.jscomp.graph.GraphvizGraph$GraphvizEdge",
      "com.google.javascript.jscomp.RemoveUnusedClassProperties",
      "com.google.javascript.jscomp.CompilerPass",
      "com.google.javascript.jscomp.ErrorManager",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.jscomp.Scope",
      "com.google.javascript.jscomp.RenameVars",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.javascript.jscomp.Scope$Var",
      "com.google.javascript.jscomp.SourceInformationAnnotator",
      "com.google.javascript.jscomp.InlineProperties$GatherCandidates",
      "com.google.javascript.jscomp.CoalesceVariableNames$1",
      "com.google.javascript.jscomp.graph.LatticeElement",
      "com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer",
      "com.google.javascript.jscomp.Normalize$PropagateConstantAnnotationsOverVars",
      "com.google.javascript.jscomp.GatherRawExports",
      "com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler",
      "com.google.javascript.jscomp.JsMessageVisitor$MalformedException",
      "com.google.javascript.jscomp.graph.UndiGraph$UndiGraphNode",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.jscomp.graph.Annotation",
      "com.google.javascript.jscomp.Region",
      "com.google.javascript.rhino.IR",
      "com.google.javascript.jscomp.NodeTraversal$AbstractPostOrderCallback",
      "com.google.javascript.jscomp.graph.LinkedUndirectedGraph$LinkedUndirectedGraphNode",
      "com.google.javascript.rhino.jstype.StaticReference",
      "com.google.javascript.jscomp.Normalize",
      "com.google.javascript.jscomp.PrepareAst$PrepareAnnotations",
      "com.google.javascript.jscomp.AnonymousFunctionNamingCallback",
      "com.google.javascript.jscomp.XtbMessageBundle$1",
      "com.google.javascript.jscomp.XtbMessageBundle",
      "com.google.javascript.jscomp.FindExportableNodes",
      "com.google.javascript.jscomp.graph.LinkedUndirectedGraph$AnnotatedLinkedUndirectedGraphEdge",
      "com.google.javascript.jscomp.RenameVars$1",
      "com.google.javascript.jscomp.RenameVars$2",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph",
      "com.google.javascript.jscomp.VarCheck",
      "com.google.javascript.jscomp.graph.UndiGraph$UndiGraphEdge",
      "com.google.javascript.jscomp.FieldCleanupPass",
      "com.google.javascript.jscomp.JsMessage",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.jscomp.SourceFile$OnDisk",
      "com.google.javascript.rhino.jstype.StaticSymbolTable",
      "com.google.javascript.jscomp.JSModuleGraph$ModuleDependenceException",
      "com.google.javascript.jscomp.OptimizeArgumentsArray",
      "com.google.javascript.jscomp.graph.DiGraph",
      "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphEdge",
      "com.google.javascript.jscomp.graph.UndiGraph",
      "com.google.javascript.jscomp.CheckSuspiciousCode",
      "com.google.javascript.jscomp.ConstCheck",
      "com.google.javascript.jscomp.ReplaceMessages",
      "com.google.javascript.rhino.jstype.Visitor",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.jscomp.deps.DependencyInfo",
      "com.google.javascript.jscomp.NodeTraversal$AbstractNodeTypePruningCallback",
      "com.google.javascript.jscomp.NodeTraversal$AbstractShallowStatementCallback",
      "com.google.javascript.jscomp.Normalize$VerifyConstants",
      "com.google.javascript.jscomp.JsMessage$IdGenerator",
      "com.google.javascript.jscomp.graph.LinkedUndirectedGraph$LinkedUndirectedGraphEdge",
      "com.google.javascript.jscomp.SyntacticScopeCreator",
      "com.google.javascript.jscomp.GroupVariableDeclarations",
      "com.google.javascript.jscomp.graph.GraphColoring",
      "com.google.javascript.jscomp.InlineProperties$ReplaceCandidates",
      "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback$GetReplacementSideEffectSubexpressions"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CheckSideEffects_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.javascript.jscomp.NodeTraversal$AbstractPostOrderCallback",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.jscomp.CheckSideEffects",
      "com.google.javascript.jscomp.InferJSDocInfo",
      "com.google.javascript.jscomp.NodeTraversal",
      "com.google.javascript.jscomp.SyntacticScopeCreator",
      "com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler",
      "com.google.javascript.jscomp.CheckSideEffects$StripProtection",
      "com.google.javascript.jscomp.Denormalize",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.jscomp.CheckRegExp",
      "com.google.javascript.jscomp.RemoveUnusedClassProperties",
      "com.google.javascript.jscomp.FindExportableNodes",
      "com.google.javascript.jscomp.CombinedCompilerPass",
      "com.google.javascript.jscomp.LineNumberCheck",
      "com.google.javascript.jscomp.Normalize$NormalizeStatements",
      "com.google.javascript.jscomp.MemoizedScopeCreator",
      "com.google.javascript.jscomp.ExpandJqueryAliases",
      "com.google.javascript.jscomp.MakeDeclaredNamesUnique",
      "com.google.javascript.jscomp.ExternExportsPass",
      "com.google.javascript.jscomp.InlineProperties$PropertyInfo",
      "com.google.javascript.jscomp.InlineProperties",
      "com.google.javascript.jscomp.GatherRawExports",
      "com.google.javascript.jscomp.StrictModeCheck",
      "com.google.javascript.jscomp.SyntheticAst",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.javascript.rhino.IR",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.jscomp.SourceFile$Builder",
      "com.google.javascript.jscomp.Denormalize$StripConstantAnnotations",
      "com.google.javascript.jscomp.VarCheck",
      "com.google.javascript.jscomp.CheckGlobalThis",
      "com.google.javascript.jscomp.ProcessClosurePrimitives",
      "com.google.javascript.jscomp.MoveFunctionDeclarations",
      "com.google.javascript.jscomp.CheckMissingGetCssName",
      "com.google.javascript.jscomp.OptimizeArgumentsArray",
      "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback$GetReplacementSideEffectSubexpressions",
      "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback",
      "com.google.javascript.jscomp.GroupVariableDeclarations",
      "com.google.javascript.jscomp.ConstCheck",
      "com.google.javascript.jscomp.GoogleJsMessageIdGenerator",
      "com.google.javascript.jscomp.JsMessageVisitor",
      "com.google.javascript.jscomp.ReplaceMessagesForChrome",
      "com.google.javascript.jscomp.Normalize$VerifyConstants",
      "com.google.javascript.jscomp.Normalize$PropagateConstantAnnotationsOverVars",
      "com.google.javascript.jscomp.JsAst",
      "com.google.javascript.jscomp.EmptyMessageBundle",
      "com.google.javascript.jscomp.ReplaceMessages",
      "com.google.javascript.jscomp.SourceInformationAnnotator",
      "com.google.javascript.jscomp.PrepareAst$PrepareAnnotations",
      "com.google.javascript.jscomp.CoalesceVariableNames$1",
      "com.google.javascript.jscomp.CoalesceVariableNames",
      "com.google.javascript.jscomp.CheckSuspiciousCode",
      "com.google.javascript.jscomp.UnreachableCodeElimination",
      "com.google.javascript.jscomp.CompilerInput",
      "com.google.javascript.jscomp.ConvertToDottedProperties",
      "com.google.javascript.jscomp.MinimizeExitPoints",
      "com.google.javascript.jscomp.NodeTraversal$AbstractShallowCallback",
      "com.google.javascript.jscomp.FieldCleanupPass$QualifiedNameSearchTraversal",
      "com.google.javascript.jscomp.CheckDebuggerStatement",
      "com.google.javascript.jscomp.JSError",
      "com.google.javascript.jscomp.JSModule",
      "com.google.javascript.jscomp.ClosureRewriteClass",
      "com.google.javascript.jscomp.AbstractCompiler",
      "com.google.javascript.jscomp.AnonymousFunctionNamingCallback",
      "com.google.javascript.jscomp.RenameVars$1",
      "com.google.javascript.jscomp.RenameVars$2",
      "com.google.javascript.jscomp.RenameVars",
      "com.google.javascript.jscomp.VariableMap",
      "com.google.javascript.jscomp.XtbMessageBundle$SecureEntityResolver",
      "com.google.javascript.jscomp.XtbMessageBundle"
    );
  }
}
