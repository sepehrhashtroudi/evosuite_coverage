/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Jan 12 22:54:46 GMT 2023
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
public class JsMessageExtractor_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.jscomp.JsMessageExtractor"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JsMessageExtractor_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.javascript.jscomp.type.ReverseAbstractInterpreter",
      "com.google.javascript.jscomp.JsMessage$Builder",
      "com.google.javascript.jscomp.type.FlowScope",
      "com.google.javascript.jscomp.graph.GraphNode",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.jscomp.NodeTraversal$Callback",
      "com.google.javascript.jscomp.SimpleDefinitionFinder",
      "com.google.javascript.jscomp.graph.Graph",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.jscomp.DefaultPassConfig$101",
      "com.google.javascript.jscomp.DefaultPassConfig$102",
      "com.google.javascript.jscomp.graph.Annotatable",
      "com.google.javascript.jscomp.PassFactory",
      "com.google.javascript.jscomp.JSModule",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.jscomp.GoogleJsMessageIdGenerator",
      "com.google.javascript.jscomp.TypeInferencePass",
      "com.google.javascript.jscomp.ControlFlowGraph",
      "com.google.javascript.jscomp.graph.GraphvizGraph",
      "com.google.javascript.jscomp.ConcreteType$2",
      "com.google.javascript.jscomp.ConcreteType$3",
      "com.google.javascript.jscomp.ConcreteType$1",
      "com.google.javascript.jscomp.ConcreteType$6",
      "com.google.javascript.jscomp.ConcreteType$7",
      "com.google.javascript.jscomp.ConcreteType$4",
      "com.google.javascript.jscomp.HotSwapCompilerPass",
      "com.google.javascript.jscomp.ConcreteType$5",
      "com.google.javascript.jscomp.SourceFile$Builder",
      "com.google.javascript.jscomp.GlobalNamespace",
      "com.google.javascript.jscomp.CodingConvention",
      "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter",
      "com.google.javascript.jscomp.MemoizedScopeCreator",
      "com.google.javascript.jscomp.WarningsGuard",
      "com.google.javascript.jscomp.CompilerOptions",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.javascript.jscomp.PassConfig$State",
      "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.jscomp.graph.GraphvizGraph$GraphvizNode",
      "com.google.javascript.jscomp.CompilerOptions$AliasTransformation",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.javascript.jscomp.ConcreteType$ConcreteFunctionType",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.jscomp.CssRenamingMap",
      "com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException",
      "com.google.javascript.jscomp.CssRenamingMap$Style",
      "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter",
      "com.google.javascript.jscomp.ConcreteType$Factory",
      "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard",
      "com.google.javascript.jscomp.MessageFormatter",
      "com.google.javascript.jscomp.graph.Graph$GraphEdge",
      "com.google.javascript.jscomp.SourceFile$Preloaded",
      "com.google.javascript.jscomp.SourceFile$Generator",
      "com.google.javascript.jscomp.CodingConvention$SubclassRelationship",
      "com.google.javascript.jscomp.graph.GraphvizGraph$GraphvizEdge",
      "com.google.javascript.jscomp.CompilerPass",
      "com.google.javascript.jscomp.VariableRenamingPolicy",
      "com.google.javascript.jscomp.Scope",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode",
      "com.google.javascript.jscomp.Scope$Var",
      "com.google.javascript.jscomp.ConcreteType$ConcreteUnionType",
      "com.google.javascript.jscomp.JsMessageVisitor$MalformedException",
      "com.google.javascript.jscomp.JsMessage$PlaceholderReference",
      "com.google.javascript.rhino.jstype.StaticReference",
      "com.google.javascript.jscomp.PreprocessorSymbolTable",
      "com.google.javascript.jscomp.JsMessageExtractor$ExtractMessagesVisitor",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph",
      "com.google.javascript.jscomp.JsMessage$Style",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphEdge",
      "com.google.javascript.jscomp.OptimizeCalls$CallGraphCompilerPass",
      "com.google.javascript.jscomp.NodeTraversal$AbstractNodeTypePruningCallback",
      "com.google.javascript.jscomp.DefaultPassConfig$99",
      "com.google.javascript.jscomp.DefaultPassConfig$98",
      "com.google.javascript.jscomp.JsMessage$Hash",
      "com.google.javascript.jscomp.DefaultPassConfig$95",
      "com.google.javascript.jscomp.DefaultPassConfig$94",
      "com.google.javascript.jscomp.JsMessage$IdGenerator",
      "com.google.javascript.jscomp.DefaultPassConfig$97",
      "com.google.javascript.jscomp.DefaultPassConfig$96",
      "com.google.javascript.jscomp.DefaultPassConfig$91",
      "com.google.javascript.jscomp.CustomPassExecutionTime",
      "com.google.javascript.jscomp.DefaultPassConfig$90",
      "com.google.javascript.jscomp.DefaultPassConfig$93",
      "com.google.javascript.jscomp.DefaultPassConfig$92",
      "com.google.javascript.jscomp.FunctionNames",
      "com.google.javascript.jscomp.JsMessageExtractor",
      "com.google.javascript.jscomp.graph.SubGraph",
      "com.google.javascript.jscomp.SourceAst",
      "com.google.javascript.jscomp.DefaultPassConfig$88",
      "com.google.javascript.jscomp.DefaultPassConfig$87",
      "com.google.javascript.jscomp.DefaultPassConfig$89",
      "com.google.javascript.jscomp.DefaultPassConfig$84",
      "com.google.javascript.jscomp.MessageBundle",
      "com.google.javascript.jscomp.DefaultPassConfig$83",
      "com.google.javascript.jscomp.DefaultPassConfig$86",
      "com.google.javascript.jscomp.DefaultPassConfig$85",
      "com.google.javascript.jscomp.SourceExcerptProvider",
      "com.google.javascript.jscomp.DefaultPassConfig$80",
      "com.google.javascript.jscomp.DefaultPassConfig$82",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.jscomp.DefaultPassConfig$81",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.SourcePosition",
      "com.google.javascript.jscomp.InferJSDocInfo",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode",
      "com.google.javascript.jscomp.ComposeWarningsGuard",
      "com.google.javascript.jscomp.NodeTraversal",
      "com.google.javascript.jscomp.NodeTraversal$AbstractScopedCallback",
      "com.google.javascript.jscomp.VariableMap",
      "com.google.javascript.jscomp.DefaultPassConfig$77",
      "com.google.javascript.jscomp.JsMessageVisitor",
      "com.google.javascript.jscomp.DefaultPassConfig$76",
      "com.google.javascript.jscomp.DefaultPassConfig$79",
      "com.google.javascript.jscomp.JsMessageDefinition",
      "com.google.javascript.jscomp.DefaultPassConfig$78",
      "com.google.javascript.jscomp.DefaultPassConfig$73",
      "com.google.javascript.jscomp.DefaultPassConfig$72",
      "com.google.javascript.jscomp.ConcreteType",
      "com.google.javascript.jscomp.DefaultPassConfig$75",
      "com.google.javascript.jscomp.graph.DiGraph$DiGraphEdge",
      "com.google.javascript.jscomp.DefaultPassConfig$74",
      "com.google.javascript.jscomp.DefaultPassConfig$71",
      "com.google.javascript.jscomp.DefaultPassConfig$70",
      "com.google.javascript.jscomp.TightenTypes",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.jscomp.ControlFlowGraph$Branch",
      "com.google.javascript.jscomp.PassConfig",
      "com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType",
      "com.google.javascript.jscomp.ConcreteType$TypeFilter",
      "com.google.javascript.jscomp.DefaultPassConfig$69",
      "com.google.javascript.jscomp.DefaultPassConfig$66",
      "com.google.javascript.jscomp.DefaultPassConfig$65",
      "com.google.javascript.rhino.jstype.RelationshipVisitor",
      "com.google.javascript.jscomp.ScopeCreator",
      "com.google.javascript.jscomp.DefaultPassConfig$68",
      "com.google.javascript.jscomp.DefaultPassConfig$67",
      "com.google.javascript.jscomp.DefaultPassConfig$62",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.javascript.jscomp.DefaultPassConfig$61",
      "com.google.javascript.jscomp.DefaultPassConfig$64",
      "com.google.javascript.jscomp.DefaultPassConfig$63",
      "com.google.javascript.jscomp.DefaultPassConfig$60",
      "com.google.javascript.jscomp.graph.AdjacencyGraph",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.jscomp.deps.SortedDependencies$CircularDependencyException",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.javascript.jscomp.DefaultPassConfig$HotSwapPassFactory",
      "com.google.javascript.jscomp.PropertyRenamingPolicy",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphEdge",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.DefaultPassConfig$59",
      "com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler$NullAliasTransformation",
      "com.google.javascript.jscomp.DefaultPassConfig$58",
      "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode",
      "com.google.javascript.jscomp.DefaultPassConfig$55",
      "com.google.javascript.jscomp.DefaultPassConfig$54",
      "com.google.javascript.jscomp.CompilerOptions$AliasTransformationHandler",
      "com.google.javascript.jscomp.DefaultPassConfig$57",
      "com.google.javascript.jscomp.DefaultPassConfig$56",
      "com.google.javascript.jscomp.DefaultPassConfig$51",
      "com.google.javascript.jscomp.DefaultPassConfig$50",
      "com.google.javascript.jscomp.DefaultPassConfig$53",
      "com.google.javascript.jscomp.SourceFile$Generated",
      "com.google.javascript.jscomp.CompilerInput",
      "com.google.javascript.jscomp.DefaultPassConfig$52",
      "com.google.javascript.jscomp.AbstractCompiler",
      "com.google.javascript.jscomp.Compiler",
      "com.google.javascript.jscomp.DiagnosticGroup",
      "com.google.javascript.jscomp.NodeTraversal$ScopedCallback",
      "com.google.javascript.jscomp.DefaultPassConfig$48",
      "com.google.javascript.jscomp.JSError",
      "com.google.javascript.jscomp.DefaultPassConfig$47",
      "com.google.javascript.jscomp.DefaultPassConfig$49",
      "com.google.javascript.jscomp.DefaultPassConfig$44",
      "com.google.javascript.jscomp.DefaultPassConfig$43",
      "com.google.javascript.jscomp.DefaultPassConfig$46",
      "com.google.javascript.jscomp.DefaultPassConfig$45",
      "com.google.javascript.jscomp.DefaultPassConfig$40",
      "com.google.javascript.jscomp.NodeTraversal$AbstractShallowCallback",
      "com.google.javascript.jscomp.DefaultPassConfig$42",
      "com.google.javascript.jscomp.DefaultPassConfig$41",
      "com.google.javascript.jscomp.AnonymousFunctionNamingCallback$FunctionNamer",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.javascript.jscomp.graph.LatticeElement",
      "com.google.javascript.jscomp.DefaultPassConfig$37",
      "com.google.javascript.jscomp.ConcreteType$ConcreteAll",
      "com.google.javascript.jscomp.DefaultPassConfig$36",
      "com.google.javascript.jscomp.DefaultPassConfig$39",
      "com.google.javascript.jscomp.DefaultPassConfig$38",
      "com.google.javascript.jscomp.DefaultPassConfig$33",
      "com.google.javascript.jscomp.DefaultPassConfig$32",
      "com.google.javascript.jscomp.DefaultPassConfig$35",
      "com.google.javascript.jscomp.DefaultPassConfig$34",
      "com.google.javascript.jscomp.DefaultPassConfig$31",
      "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator",
      "com.google.javascript.jscomp.graph.Annotation",
      "com.google.javascript.jscomp.Region",
      "com.google.javascript.jscomp.DefaultPassConfig$30",
      "com.google.javascript.jscomp.NodeTraversal$AbstractPostOrderCallback",
      "com.google.javascript.jscomp.DefaultPassConfig",
      "com.google.javascript.jscomp.DefinitionProvider",
      "com.google.javascript.jscomp.DefaultPassConfig$29",
      "com.google.javascript.jscomp.DefaultPassConfig$26",
      "com.google.javascript.jscomp.DefaultPassConfig$25",
      "com.google.javascript.jscomp.DefaultPassConfig$28",
      "com.google.javascript.jscomp.DefaultPassConfig$27",
      "com.google.javascript.jscomp.DefaultPassConfig$22",
      "com.google.javascript.jscomp.DefaultPassConfig$21",
      "com.google.javascript.jscomp.DefaultPassConfig$24",
      "com.google.javascript.jscomp.DefaultPassConfig$23",
      "com.google.javascript.jscomp.CompilerOptions$DevMode",
      "com.google.javascript.jscomp.DependencyOptions",
      "com.google.javascript.jscomp.DefaultPassConfig$20",
      "com.google.javascript.jscomp.JsMessage",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.jscomp.SourceFile$OnDisk",
      "com.google.javascript.rhino.jstype.StaticSymbolTable",
      "com.google.javascript.jscomp.JSModuleGraph$ModuleDependenceException",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.javascript.jscomp.graph.DiGraph",
      "com.google.javascript.jscomp.DefaultPassConfig$19",
      "com.google.javascript.rhino.jstype.Visitor",
      "com.google.javascript.jscomp.DefaultPassConfig$18",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.jscomp.DefaultPassConfig$15",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.jscomp.DefaultPassConfig$14",
      "com.google.javascript.jscomp.deps.DependencyInfo",
      "com.google.javascript.jscomp.DefaultPassConfig$17",
      "com.google.javascript.jscomp.NodeTraversal$AbstractShallowStatementCallback",
      "com.google.javascript.jscomp.DefaultPassConfig$16",
      "com.google.javascript.jscomp.DefaultPassConfig$7",
      "com.google.javascript.jscomp.DefaultPassConfig$11",
      "com.google.javascript.jscomp.DefaultPassConfig$8",
      "com.google.javascript.jscomp.DefaultPassConfig$10",
      "com.google.javascript.jscomp.DefaultPassConfig$5",
      "com.google.javascript.jscomp.DefaultPassConfig$13",
      "com.google.javascript.jscomp.DefaultPassConfig$6",
      "com.google.javascript.jscomp.DefaultPassConfig$12",
      "com.google.javascript.jscomp.DefaultPassConfig$9",
      "com.google.javascript.jscomp.ConcreteType$ConcreteNoneType",
      "com.google.javascript.jscomp.DefaultPassConfig$3",
      "com.google.javascript.jscomp.DefaultPassConfig$4",
      "com.google.javascript.jscomp.DefaultPassConfig$1",
      "com.google.javascript.jscomp.DefaultPassConfig$2"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JsMessageExtractor_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.javascript.jscomp.JsMessageExtractor",
      "com.google.javascript.jscomp.NodeTraversal$AbstractPostOrderCallback",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.jscomp.JsMessageVisitor",
      "com.google.javascript.jscomp.JsMessageExtractor$ExtractMessagesVisitor",
      "com.google.javascript.jscomp.GoogleJsMessageIdGenerator",
      "com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler$NullAliasTransformation",
      "com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler",
      "com.google.javascript.jscomp.CompilerOptions",
      "com.google.javascript.jscomp.DependencyOptions",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.javascript.jscomp.SourceFile$Builder"
    );
  }
}
