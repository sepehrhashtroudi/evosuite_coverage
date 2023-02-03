/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:06:47 GMT 2022
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractDuration_ESTest extends AbstractDuration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Duration duration0 = hours0.toStandardDuration();
      Duration duration1 = duration0.withDurationAdded((-157L), 85);
      String string0 = duration1.toString();
      assertEquals("PT7730941129186.655S", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Days days0 = Days.TWO;
      Duration duration0 = days0.toStandardDuration();
      String string0 = duration0.toString();
      assertEquals("PT172800S", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Duration duration0 = Duration.millis((-2067L));
      duration0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(36L);
      Duration duration1 = duration0.multipliedBy(3456L);
      boolean boolean0 = duration0.equals(duration1);
      assertFalse(boolean0);
      assertFalse(duration1.equals((Object)duration0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Duration duration0 = Duration.standardDays(4219L);
      Duration duration1 = Duration.standardHours(4219L);
      boolean boolean0 = duration0.isShorterThan(duration1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-1819L));
      Duration duration1 = duration0.negated();
      boolean boolean0 = duration1.isEqual(duration0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-1134L));
      String string0 = duration0.toString();
      assertEquals("PT-97977600S", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Period period0 = duration0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Duration duration0 = weeks0.toStandardDuration();
      Duration duration1 = duration0.toDuration();
      assertEquals((-360777252864L), duration1.getStandardHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(0L);
      Duration duration1 = duration0.toDuration();
      assertEquals(0L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Duration duration0 = Duration.standardHours(2703L);
      Duration duration1 = duration0.toDuration();
      assertEquals(2703L, duration1.getStandardHours());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-1134L));
      Hours hours0 = Hours.TWO;
      Duration duration1 = hours0.toStandardDuration();
      boolean boolean0 = duration0.isEqual(duration1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      boolean boolean0 = duration0.equals(duration0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Duration duration0 = new Duration(107048703889008L, 107048703889008L);
      // Undeclared exception!
      try { 
        duration0.compareTo((ReadableDuration) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.AbstractDuration", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-1134L));
      Hours hours0 = Hours.TWO;
      Duration duration1 = hours0.toStandardDuration();
      int int0 = duration1.compareTo((ReadableDuration) duration0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.TWO;
      Duration duration0 = days0.toStandardDuration();
      Duration duration1 = duration0.withMillis(311L);
      int int0 = duration1.compareTo((ReadableDuration) duration0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-1134L));
      int int0 = duration0.compareTo((ReadableDuration) duration0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Duration duration0 = Duration.millis((-452L));
      String string0 = duration0.toString();
      assertEquals("PT-0.452S", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      String string0 = duration0.toString();
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = duration0.dividedBy(1000000L);
      boolean boolean0 = duration1.equals(duration0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Duration duration0 = Duration.standardHours(2703L);
      Days days0 = duration0.toStandardDays();
      boolean boolean0 = duration0.equals(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = Duration.millis((-452L));
      boolean boolean0 = duration0.equals(duration1);
      assertFalse(boolean0);
      assertFalse(duration1.equals((Object)duration0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = Duration.millis((-452L));
      Duration duration2 = duration1.dividedBy((-452L));
      boolean boolean0 = duration0.isShorterThan(duration2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      boolean boolean0 = duration0.isShorterThan(duration0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = Duration.millis((-452L));
      boolean boolean0 = duration0.isLongerThan(duration1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      boolean boolean0 = duration0.isLongerThan(duration0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-137L));
      boolean boolean0 = duration0.isEqual((ReadableDuration) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      boolean boolean0 = duration0.isEqual((ReadableDuration) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      boolean boolean0 = duration0.isEqual(duration0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-137L));
      boolean boolean0 = duration0.isLongerThan((ReadableDuration) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      boolean boolean0 = duration0.isShorterThan((ReadableDuration) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Duration duration0 = days0.toStandardDuration();
      // Undeclared exception!
      try { 
        duration0.toPeriod();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -51539607552
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}