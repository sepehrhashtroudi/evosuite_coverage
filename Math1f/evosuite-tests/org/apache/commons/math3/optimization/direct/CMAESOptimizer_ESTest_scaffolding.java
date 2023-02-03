/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 19 03:38:11 GMT 2022
 */

package org.apache.commons.math3.optimization.direct;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class CMAESOptimizer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math3.optimization.direct.CMAESOptimizer"; 
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
    java.lang.System.setProperty("user.dir", "/home/sepehr/test_generation/evosuite_coverage/Math1f"); 
    java.lang.System.setProperty("user.home", "/home/sepehr"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "sepehr"); 
    java.lang.System.setProperty("user.timezone", "America/Edmonton"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CMAESOptimizer_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math3.linear.RealVector$2",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.optimization.direct.CMAESOptimizer$PopulationSize",
      "org.apache.commons.math3.linear.RealVectorFormat",
      "org.apache.commons.math3.linear.RealVector",
      "org.apache.commons.math3.optimization.GoalType",
      "org.apache.commons.math3.random.AbstractWell",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathUnsupportedOperationException",
      "org.apache.commons.math3.optimization.OptimizationData",
      "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer",
      "org.apache.commons.math3.linear.RealMatrixFormat",
      "org.apache.commons.math3.optimization.direct.CMAESOptimizer",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.optimization.AbstractConvergenceChecker",
      "org.apache.commons.math3.optimization.ConvergenceChecker",
      "org.apache.commons.math3.linear.SparseRealMatrix",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.random.Well19937c",
      "org.apache.commons.math3.analysis.BivariateFunction",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.random.MersenneTwister",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.exception.TooManyEvaluationsException",
      "org.apache.commons.math3.analysis.UnivariateFunction",
      "org.apache.commons.math3.linear.RealMatrix",
      "org.apache.commons.math3.analysis.MultivariateFunction",
      "org.apache.commons.math3.optimization.PointValuePair",
      "org.apache.commons.math3.linear.RealLinearOperator",
      "org.apache.commons.math3.random.Well1024a",
      "org.apache.commons.math3.random.Well19937a",
      "org.apache.commons.math3.optimization.direct.CMAESOptimizer$FitnessFunction",
      "org.apache.commons.math3.random.JDKRandomGenerator",
      "org.apache.commons.math3.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.optimization.BaseOptimizer",
      "org.apache.commons.math3.random.Well44497b",
      "org.apache.commons.math3.random.Well44497a",
      "org.apache.commons.math3.optimization.SimpleValueChecker",
      "org.apache.commons.math3.random.RandomAdaptor",
      "org.apache.commons.math3.linear.OpenMapRealMatrix",
      "org.apache.commons.math3.util.Incrementor$1",
      "org.apache.commons.math3.random.ISAACRandom",
      "org.apache.commons.math3.optimization.BaseMultivariateSimpleBoundsOptimizer",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.optimization.direct.CMAESOptimizer$Sigma",
      "org.apache.commons.math3.random.SynchronizedRandomGenerator",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math3.random.BitsStreamGenerator",
      "org.apache.commons.math3.linear.NonSquareMatrixException",
      "org.apache.commons.math3.exception.MultiDimensionMismatchException",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.linear.Array2DRowRealMatrix",
      "org.apache.commons.math3.optimization.MultivariateOptimizer",
      "org.apache.commons.math3.util.FastMath$CodyWaite",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.util.Pair",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.util.CompositeFormat",
      "org.apache.commons.math3.linear.AbstractRealMatrix",
      "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer",
      "org.apache.commons.math3.linear.AnyMatrix",
      "org.apache.commons.math3.util.Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math3.exception.MathParseException",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.optimization.BaseMultivariateOptimizer",
      "org.apache.commons.math3.random.RandomGenerator",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.linear.RealVectorPreservingVisitor",
      "org.apache.commons.math3.linear.RealVectorChangingVisitor",
      "org.apache.commons.math3.optimization.direct.CMAESOptimizer$DoubleIndex",
      "org.apache.commons.math3.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.random.Well512a"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.math3.optimization.ConvergenceChecker", false, CMAESOptimizer_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CMAESOptimizer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer",
      "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer",
      "org.apache.commons.math3.random.BitsStreamGenerator",
      "org.apache.commons.math3.random.MersenneTwister",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.optimization.direct.CMAESOptimizer",
      "org.apache.commons.math3.optimization.direct.CMAESOptimizer$Sigma",
      "org.apache.commons.math3.optimization.direct.CMAESOptimizer$PopulationSize",
      "org.apache.commons.math3.optimization.direct.CMAESOptimizer$FitnessFunction",
      "org.apache.commons.math3.optimization.direct.CMAESOptimizer$DoubleIndex",
      "org.apache.commons.math3.optimization.GoalType",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.optimization.AbstractConvergenceChecker",
      "org.apache.commons.math3.optimization.SimpleValueChecker",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.util.Incrementor$1",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.exception.TooManyEvaluationsException",
      "org.apache.commons.math3.random.AbstractWell",
      "org.apache.commons.math3.random.Well44497a",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.random.Well512a",
      "org.apache.commons.math3.random.Well1024a",
      "org.apache.commons.math3.random.Well19937a",
      "org.apache.commons.math3.random.SynchronizedRandomGenerator",
      "org.apache.commons.math3.random.ISAACRandom",
      "org.apache.commons.math3.random.Well44497b",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.util.FastMath$CodyWaite",
      "org.apache.commons.math3.random.JDKRandomGenerator",
      "org.apache.commons.math3.random.Well19937c",
      "org.apache.commons.math3.random.RandomAdaptor"
    );
  }
}
