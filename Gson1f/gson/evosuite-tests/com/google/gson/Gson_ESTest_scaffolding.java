/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Feb 05 09:52:32 GMT 2023
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
public class Gson_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.gson.Gson"; 
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
    java.lang.System.setProperty("user.dir", "/home/sepehr/masters/evosuite_coverage/Gson1f/gson"); 
    java.lang.System.setProperty("user.home", "/home/sepehr"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "sepehr"); 
    java.lang.System.setProperty("user.timezone", "America/Edmonton"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Gson_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.gson.ObjectNavigator$Visitor",
      "com.google.gson.Primitives",
      "com.google.gson.TypeInfoMap",
      "com.google.gson.ObjectConstructor",
      "com.google.gson.DefaultTypeAdapters$DefaultTimestampDeserializer",
      "com.google.gson.DefaultTypeAdapters$LongDeserializer",
      "com.google.gson.DefaultTypeAdapters$DefaultJavaSqlDateTypeAdapter",
      "com.google.gson.JsonDeserializationContextDefault",
      "com.google.gson.DefaultTypeAdapters$CollectionTypeAdapter",
      "com.google.gson.JsonDeserializationContext",
      "com.google.gson.JavaFieldNamingPolicy",
      "com.google.gson.DefaultTypeAdapters$TreeSetCreator",
      "com.google.gson.DefaultTypeAdapters$UuidTypeAdapter",
      "com.google.gson.DefaultTypeAdapters",
      "com.google.gson.ObjectNavigator",
      "com.google.gson.ExclusionStrategy",
      "com.google.gson.DefaultTypeAdapters$HashSetCreator",
      "com.google.gson.DefaultTypeAdapters$ByteTypeAdapter",
      "com.google.gson.stream.JsonScope",
      "com.google.gson.DefaultTypeAdapters$IntegerTypeAdapter",
      "com.google.gson.DisjunctionExclusionStrategy",
      "com.google.gson.ParameterizedTypeImpl",
      "com.google.gson.ModifierBasedExclusionStrategy",
      "com.google.gson.DefaultTypeAdapters$FloatSerializer",
      "com.google.gson.JsonFieldNameValidator",
      "com.google.gson.JsonArray",
      "com.google.gson.LongSerializationPolicy",
      "com.google.gson.NullExclusionStrategy",
      "com.google.gson.annotations.Until",
      "com.google.gson.Streams$1",
      "com.google.gson.stream.JsonReader$1",
      "com.google.gson.Streams",
      "com.google.gson.GenericArrayTypeImpl",
      "com.google.gson.DefaultTypeAdapters$LocaleTypeAdapter",
      "com.google.gson.stream.JsonReader",
      "com.google.gson.FieldAttributes",
      "com.google.gson.JsonArrayDeserializationVisitor",
      "com.google.gson.InstanceCreator",
      "com.google.gson.DefaultTypeAdapters$DefaultDateTypeAdapter",
      "com.google.gson.LongSerializationPolicy$DefaultStrategy",
      "com.google.gson.DefaultTypeAdapters$ShortTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$DoubleDeserializer",
      "com.google.gson.DefaultTypeAdapters$BooleanTypeAdapter",
      "com.google.gson.stream.JsonWriter",
      "com.google.gson.TypeUtils",
      "com.google.gson.TypeInfo",
      "com.google.gson.TypeInfoCollection",
      "com.google.gson.DefaultTypeAdapters$CharacterTypeAdapter",
      "com.google.gson.MemoryRefStack",
      "com.google.gson.DefaultTypeAdapters$DoubleSerializer",
      "com.google.gson.JsonObjectDeserializationVisitor",
      "com.google.gson.stream.MalformedJsonException",
      "com.google.gson.stream.JsonToken",
      "com.google.gson.TypeInfoFactory",
      "com.google.gson.SerializedNameAnnotationInterceptingNamingPolicy",
      "com.google.gson.RecursiveFieldNamingPolicy",
      "com.google.gson.VersionExclusionStrategy",
      "com.google.gson.DefaultTypeAdapters$LongSerializer",
      "com.google.gson.JsonNull",
      "com.google.gson.SyntheticFieldExclusionStrategy",
      "com.google.gson.JsonObject",
      "com.google.gson.Pair",
      "com.google.gson.LongSerializationPolicy$Strategy",
      "com.google.gson.JsonSerializer",
      "com.google.gson.DefaultTypeAdapters$StringTypeAdapter",
      "com.google.gson.ObjectTypePair",
      "com.google.gson.Streams$AppendableWriter$CurrentWrite",
      "com.google.gson.Escaper",
      "com.google.gson.Cache",
      "com.google.gson.JsonSerializationContextDefault",
      "com.google.gson.DefaultTypeAdapters$MapTypeAdapter",
      "com.google.gson.Gson",
      "com.google.gson.ObjectNavigatorFactory",
      "com.google.gson.JsonDeserializerExceptionWrapper",
      "com.google.gson.JsonDeserializationVisitor",
      "com.google.gson.DefaultTypeAdapters$GregorianCalendarTypeAdapter",
      "com.google.gson.annotations.SerializedName",
      "com.google.gson.FieldNamingStrategy2",
      "com.google.gson.DefaultTypeAdapters$EnumTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$PropertiesCreator",
      "com.google.gson.DefaultTypeAdapters$BigDecimalTypeAdapter",
      "com.google.gson.JsonIOException",
      "com.google.gson.DefaultTypeAdapters$NumberTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$BigIntegerTypeAdapter",
      "com.google.gson.JsonParseException",
      "com.google.gson.DefaultTypeAdapters$UrlTypeAdapter",
      "com.google.gson.TypeInfoArray",
      "com.google.gson.AnonymousAndLocalClassExclusionStrategy",
      "com.google.gson.LruCache",
      "com.google.gson.JsonElement",
      "com.google.gson.stream.JsonWriter$1",
      "com.google.gson.DefaultTypeAdapters$UriTypeAdapter",
      "com.google.gson.Streams$AppendableWriter",
      "com.google.gson.JsonSerializationContext",
      "com.google.gson.JsonPrimitive",
      "com.google.gson.MappedObjectConstructor",
      "com.google.gson.CircularReferenceException",
      "com.google.gson.DefaultTypeAdapters$DefaultTimeTypeAdapter",
      "com.google.gson.LongSerializationPolicy$StringStrategy",
      "com.google.gson.DefaultTypeAdapters$FloatDeserializer",
      "com.google.gson.JsonSyntaxException",
      "com.google.gson.InnerClassExclusionStrategy",
      "com.google.gson.ParameterizedTypeHandlerMap",
      "com.google.gson.Preconditions",
      "com.google.gson.annotations.Since",
      "com.google.gson.JsonSerializationVisitor",
      "com.google.gson.JsonDeserializer"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Gson_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.gson.AnonymousAndLocalClassExclusionStrategy",
      "com.google.gson.SyntheticFieldExclusionStrategy",
      "com.google.gson.ModifierBasedExclusionStrategy",
      "com.google.gson.JsonFieldNameValidator",
      "com.google.gson.SerializedNameAnnotationInterceptingNamingPolicy",
      "com.google.gson.RecursiveFieldNamingPolicy",
      "com.google.gson.JavaFieldNamingPolicy",
      "com.google.gson.DisjunctionExclusionStrategy",
      "com.google.gson.Preconditions",
      "com.google.gson.Gson",
      "com.google.gson.DefaultTypeAdapters$DefaultDateTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$DefaultJavaSqlDateTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$DefaultTimeTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$DefaultTimestampDeserializer",
      "com.google.gson.DefaultTypeAdapters$EnumTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$UrlTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$UriTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$UuidTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$LocaleTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$CollectionTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$MapTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$BigDecimalTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$BigIntegerTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$BooleanTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$ByteTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$CharacterTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$DoubleDeserializer",
      "com.google.gson.DefaultTypeAdapters$FloatDeserializer",
      "com.google.gson.DefaultTypeAdapters$IntegerTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$LongDeserializer",
      "com.google.gson.DefaultTypeAdapters$NumberTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$ShortTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$StringTypeAdapter",
      "com.google.gson.DefaultTypeAdapters$PropertiesCreator",
      "com.google.gson.DefaultTypeAdapters$TreeSetCreator",
      "com.google.gson.DefaultTypeAdapters$HashSetCreator",
      "com.google.gson.DefaultTypeAdapters$GregorianCalendarTypeAdapter",
      "com.google.gson.ParameterizedTypeHandlerMap",
      "com.google.gson.Pair",
      "com.google.gson.JsonDeserializerExceptionWrapper",
      "com.google.gson.DefaultTypeAdapters",
      "com.google.gson.LongSerializationPolicy$DefaultStrategy",
      "com.google.gson.LongSerializationPolicy$StringStrategy",
      "com.google.gson.LongSerializationPolicy",
      "com.google.gson.Escaper",
      "com.google.gson.JsonElement",
      "com.google.gson.JsonNull",
      "com.google.gson.Primitives",
      "com.google.gson.stream.JsonToken",
      "com.google.gson.Streams$1",
      "com.google.gson.MappedObjectConstructor",
      "com.google.gson.DefaultTypeAdapters$DoubleSerializer",
      "com.google.gson.DefaultTypeAdapters$FloatSerializer",
      "com.google.gson.DefaultTypeAdapters$LongSerializer",
      "com.google.gson.JsonArray",
      "com.google.gson.ObjectTypePair",
      "com.google.gson.ParameterizedTypeImpl",
      "com.google.gson.stream.JsonReader",
      "com.google.gson.stream.JsonScope",
      "com.google.gson.Streams",
      "com.google.gson.stream.JsonReader$1",
      "com.google.gson.JsonDeserializationContextDefault",
      "com.google.gson.ObjectNavigatorFactory",
      "com.google.gson.stream.JsonWriter",
      "com.google.gson.JsonPrimitive",
      "com.google.gson.JsonDeserializationVisitor",
      "com.google.gson.JsonObjectDeserializationVisitor",
      "com.google.gson.ObjectNavigator",
      "com.google.gson.TypeInfo",
      "com.google.gson.TypeUtils",
      "com.google.gson.JsonParseException",
      "com.google.gson.JsonSerializationContextDefault",
      "com.google.gson.MemoryRefStack",
      "com.google.gson.JsonSerializationVisitor",
      "com.google.gson.JsonObject",
      "com.google.gson.LruCache",
      "com.google.gson.FieldAttributes",
      "com.google.gson.TypeInfoFactory",
      "com.google.gson.Streams$AppendableWriter",
      "com.google.gson.Streams$AppendableWriter$CurrentWrite",
      "com.google.gson.stream.JsonWriter$1",
      "com.google.gson.JsonIOException",
      "com.google.gson.TypeInfoArray",
      "com.google.gson.CircularReferenceException",
      "com.google.gson.GenericArrayTypeImpl",
      "com.google.gson.TypeInfoCollection",
      "com.google.gson.InnerClassExclusionStrategy",
      "com.google.gson.VersionExclusionStrategy",
      "com.google.gson.stream.MalformedJsonException",
      "com.google.gson.JsonSyntaxException",
      "com.google.gson.TypeInfoMap"
    );
  }
}