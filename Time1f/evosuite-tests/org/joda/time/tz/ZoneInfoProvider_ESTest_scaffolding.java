/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 19 04:58:53 GMT 2022
 */

package org.joda.time.tz;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ZoneInfoProvider_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.joda.time.tz.ZoneInfoProvider"; 
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
    java.lang.System.setProperty("user.dir", "/home/sepehr/test_generation/evosuite_coverage/Time1f"); 
    java.lang.System.setProperty("user.home", "/home/sepehr"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "sepehr"); 
    java.lang.System.setProperty("user.timezone", "America/Edmonton"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ZoneInfoProvider_ESTest_scaffolding.class.getClassLoader() ,
      "org.joda.time.DateTimeZone",
      "org.joda.time.tz.DateTimeZoneBuilder$RuleSet",
      "org.joda.time.tz.DateTimeZoneBuilder$Recurrence",
      "org.joda.time.DateTimeUtils$MillisProvider",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.Seconds",
      "org.joda.time.tz.DateTimeZoneBuilder$Transition",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.JodaTimePermission",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.field.AbstractPartialFieldProperty",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.MutableDateTime$Property",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.ReadableInterval",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.chrono.BasicChronology$YearInfo",
      "org.joda.time.LocalDate$Property",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.DateMidnight$Property",
      "org.joda.time.ReadWritableInterval",
      "org.joda.time.base.AbstractDateTime",
      "org.joda.time.format.PeriodFormatterBuilder",
      "org.joda.time.format.DateTimePrinter",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.tz.CachedDateTimeZone$Info",
      "org.joda.time.base.BaseInterval",
      "org.joda.time.Duration",
      "org.joda.time.format.FormatUtils",
      "org.joda.time.PeriodType",
      "org.joda.time.format.PeriodFormatter",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.Interval",
      "org.joda.time.base.AbstractInstant",
      "org.joda.time.LocalDateTime$Property",
      "org.joda.time.tz.DateTimeZoneBuilder",
      "org.joda.time.YearMonthDay$Property",
      "org.joda.time.format.DateTimeParserBucket",
      "org.joda.time.field.UnsupportedDateTimeField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.ReadWritablePeriod",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.LocalDateTime",
      "org.joda.time.MutablePeriod",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.MutableDateTime",
      "org.joda.time.base.BasePeriod$1",
      "org.joda.time.format.PeriodPrinter",
      "org.joda.time.tz.CachedDateTimeZone",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.ReadableDateTime",
      "org.joda.time.format.PeriodFormatterBuilder$Literal",
      "org.joda.time.format.PeriodParser",
      "org.joda.time.base.BaseDuration",
      "org.joda.time.DateMidnight",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.YearMonthDay",
      "org.joda.time.format.DateTimeParser",
      "org.joda.time.LocalTime$Property",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.DateTime$Property",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.tz.DateTimeZoneBuilder$Rule",
      "org.joda.time.Days",
      "org.joda.time.DateTimeField",
      "org.joda.time.field.FieldUtils",
      "org.joda.time.base.AbstractPeriod",
      "org.joda.time.ReadableInstant",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.DateTimeUtils$SystemMillisProvider",
      "org.joda.time.base.BaseSingleFieldPeriod",
      "org.joda.time.IllegalInstantException",
      "org.joda.time.IllegalFieldValueException",
      "org.joda.time.tz.DefaultNameProvider",
      "org.joda.time.tz.Provider",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.ReadablePeriod",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.chrono.AssembledChronology$Fields",
      "org.joda.time.DurationFieldType",
      "org.joda.time.ReadWritableInstant",
      "org.joda.time.MutableInterval",
      "org.joda.time.tz.NameProvider",
      "org.joda.time.Minutes",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.base.AbstractPartial",
      "org.joda.time.base.BasePartial",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.base.AbstractDuration",
      "org.joda.time.LocalTime",
      "org.joda.time.base.AbstractInterval",
      "org.joda.time.Hours",
      "org.joda.time.base.BasePeriod",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.tz.DateTimeZoneBuilder$DSTZone",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.TimeOfDay$Property",
      "org.joda.time.TimeOfDay",
      "org.joda.time.format.ISOPeriodFormat",
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.DateTimeZone$1",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.tz.DateTimeZoneBuilder$OfYear",
      "org.joda.time.Period",
      "org.joda.time.ReadableDuration",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.DurationField",
      "org.joda.time.Weeks",
      "org.joda.time.Chronology",
      "org.joda.time.DateTime",
      "org.joda.time.format.PeriodFormatterBuilder$Composite",
      "org.joda.time.field.AbstractReadableInstantFieldProperty",
      "org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix",
      "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix",
      "org.joda.time.LocalDate",
      "org.joda.time.format.DateTimeParserBucket$SavedField",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.ReadWritableDateTime",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "org.joda.time.Instant",
      "org.joda.time.format.PeriodFormatterBuilder$Separator",
      "org.joda.time.ReadablePartial",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.field.BaseDurationField"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ZoneInfoProvider_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.tz.DefaultNameProvider",
      "org.joda.time.DateTimeZone",
      "org.joda.time.tz.DateTimeZoneBuilder",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.tz.DateTimeZoneBuilder$DSTZone",
      "org.joda.time.tz.DateTimeZoneBuilder$Recurrence",
      "org.joda.time.tz.DateTimeZoneBuilder$OfYear",
      "org.joda.time.tz.CachedDateTimeZone",
      "org.joda.time.format.FormatUtils"
    );
  }
}
