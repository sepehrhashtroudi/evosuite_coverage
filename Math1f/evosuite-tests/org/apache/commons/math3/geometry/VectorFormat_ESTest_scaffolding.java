/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 19 06:37:24 GMT 2022
 */

package org.apache.commons.math3.geometry;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class VectorFormat_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math3.geometry.VectorFormat"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(VectorFormat_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math3.geometry.Vector",
      "org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat",
      "org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D$LazyHolder",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.geometry.Space",
      "org.apache.commons.math3.util.MathArrays",
      "org.apache.commons.math3.util.MathArrays$1",
      "org.apache.commons.math3.util.MathArrays$2",
      "org.apache.commons.math3.geometry.euclidean.oned.Vector1D",
      "org.apache.commons.math3.geometry.euclidean.twod.Vector2DFormat",
      "org.apache.commons.math3.geometry.euclidean.twod.Vector2D",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.util.MathArrays$OrderDirection",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.MathInternalError",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.geometry.VectorFormat",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D",
      "org.apache.commons.math3.exception.NonMonotonicSequenceException",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathUnsupportedOperationException",
      "org.apache.commons.math3.util.FastMath$CodyWaite",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.util.CompositeFormat",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.util.Pair",
      "org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D$LazyHolder",
      "org.apache.commons.math3.exception.MathParseException",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.util.MathArrays$Position",
      "org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D$LazyHolder",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.random.RandomGenerator",
      "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat",
      "org.apache.commons.math3.geometry.euclidean.threed.Vector3D",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D",
      "org.apache.commons.math3.Field"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.text.Format$Field", false, VectorFormat_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(VectorFormat_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.geometry.VectorFormat",
      "org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat",
      "org.apache.commons.math3.geometry.euclidean.twod.Vector2DFormat",
      "org.apache.commons.math3.util.CompositeFormat",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.exception.MathParseException",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat",
      "org.apache.commons.math3.geometry.euclidean.oned.Vector1D",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.geometry.euclidean.threed.Vector3D",
      "org.apache.commons.math3.geometry.euclidean.twod.Vector2D",
      "org.apache.commons.math3.util.MathArrays",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.util.FastMath$CodyWaite",
      "org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D",
      "org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D$LazyHolder",
      "org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D",
      "org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D$LazyHolder",
      "org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D",
      "org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D$LazyHolder",
      "org.apache.commons.math3.exception.MathArithmeticException"
    );
  }
}
