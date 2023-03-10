/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 21:06:22 GMT 2022
 */

package org.apache.commons.lang3.mutable;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.mutable.MutableShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class MutableShort_ESTest extends MutableShort_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short) (-1458));
      MutableShort mutableShort1 = new MutableShort(mutableShort0);
      mutableShort0.add((Number) mutableShort1);
      boolean boolean0 = mutableShort1.equals(mutableShort0);
      assertEquals((-2916L), mutableShort0.longValue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort();
      Short short0 = mutableShort0.toShort();
      assertEquals((short)0, (short)short0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short)2356);
      mutableShort0.add((short)2356);
      mutableShort0.add((short)2356);
      Short short0 = mutableShort0.toShort();
      assertEquals((short)7068, (short)short0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short)1087);
      short short0 = mutableShort0.shortValue();
      assertEquals((short)1087, short0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort();
      Integer integer0 = new Integer((-846));
      mutableShort0.add((Number) integer0);
      short short0 = mutableShort0.shortValue();
      assertEquals("-846", mutableShort0.toString());
      assertEquals((short) (-846), short0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short) (-1));
      mutableShort0.increment();
      long long0 = mutableShort0.longValue();
      assertEquals(0, mutableShort0.intValue());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short)2356);
      long long0 = mutableShort0.longValue();
      assertEquals(2356L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Short short0 = new Short((short)1120);
      MutableShort mutableShort0 = new MutableShort((Number) short0);
      mutableShort0.subtract((short)1120);
      int int0 = mutableShort0.intValue();
      assertEquals("0", mutableShort0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer(1);
      MutableShort mutableShort0 = new MutableShort(integer0);
      int int0 = mutableShort0.intValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short)2490);
      Short short0 = mutableShort0.getValue();
      assertEquals((short)2490, (short)short0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      MutableShort mutableShort0 = new MutableShort(float0);
      mutableShort0.subtract((Number) float0);
      mutableShort0.increment();
      mutableShort0.decrement();
      mutableShort0.getValue();
      assertEquals((short)0, (short)mutableShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short) (-3422));
      mutableShort0.add((short) (-3422));
      Short short0 = mutableShort0.getValue();
      assertEquals((short) (-6844), (short)short0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short)3098);
      mutableShort0.setValue((short)0);
      float float0 = mutableShort0.floatValue();
      assertEquals(0, mutableShort0.intValue());
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      MutableShort mutableShort0 = new MutableShort(float0);
      mutableShort0.subtract((Number) float0);
      mutableShort0.increment();
      float float1 = mutableShort0.floatValue();
      assertEquals(1.0, mutableShort0.doubleValue(), 0.01);
      assertEquals(1.0F, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort();
      MutableShort mutableShort1 = new MutableShort((short) (-645));
      mutableShort0.subtract((Number) mutableShort1);
      double double0 = mutableShort0.doubleValue();
      assertEquals((short)645, mutableShort0.shortValue());
      assertEquals(645.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short)1);
      // Undeclared exception!
      try { 
        mutableShort0.subtract((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableShort", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort();
      // Undeclared exception!
      try { 
        mutableShort0.setValue((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableShort", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      MutableShort mutableShort0 = new MutableShort(float0);
      // Undeclared exception!
      try { 
        mutableShort0.compareTo((MutableShort) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableShort", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short)0);
      // Undeclared exception!
      try { 
        mutableShort0.add((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableShort", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MutableShort mutableShort0 = null;
      try {
        mutableShort0 = new MutableShort("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MutableShort mutableShort0 = null;
      try {
        mutableShort0 = new MutableShort((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableShort", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort();
      short short0 = mutableShort0.shortValue();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort();
      MutableShort mutableShort1 = new MutableShort((short) (-1458));
      int int0 = mutableShort0.compareTo(mutableShort1);
      assertEquals(1, int0);
      assertEquals((-1458L), mutableShort1.longValue());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Float float0 = new Float(0.0);
      MutableShort mutableShort0 = new MutableShort(float0);
      mutableShort0.subtract((short)601);
      MutableShort mutableShort1 = new MutableShort("0");
      int int0 = mutableShort0.compareTo(mutableShort1);
      assertEquals((byte) (-89), mutableShort0.byteValue());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short) (-1458));
      int int0 = mutableShort0.compareTo(mutableShort0);
      assertEquals(0, int0);
      assertEquals((-1458), mutableShort0.intValue());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short) (-1458));
      boolean boolean0 = mutableShort0.equals(mutableShort0);
      assertTrue(boolean0);
      assertEquals((-1458), mutableShort0.intValue());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Float float0 = new Float(0.0);
      MutableShort mutableShort0 = new MutableShort(float0);
      Object object0 = new Object();
      boolean boolean0 = mutableShort0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort();
      MutableShort mutableShort1 = new MutableShort((short) (-1458));
      boolean boolean0 = mutableShort1.equals(mutableShort0);
      assertFalse(boolean0);
      assertFalse(mutableShort0.equals((Object)mutableShort1));
      assertEquals((short) (-1458), mutableShort1.shortValue());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      MutableShort mutableShort0 = new MutableShort(float0);
      float float1 = mutableShort0.floatValue();
      assertEquals((-1.0F), float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short) (-3422));
      int int0 = mutableShort0.intValue();
      assertEquals((-3422), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short) (-1458));
      mutableShort0.setValue((Number) mutableShort0);
      assertEquals((short) (-1458), mutableShort0.shortValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short) (-3422));
      Short short0 = mutableShort0.getValue();
      mutableShort0.subtract((Number) short0);
      double double0 = mutableShort0.doubleValue();
      assertEquals((byte)0, mutableShort0.byteValue());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short) (-1458));
      long long0 = mutableShort0.longValue();
      assertEquals((-1458L), long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short) (-1458));
      Short short0 = mutableShort0.toShort();
      assertEquals((short) (-1458), (short)short0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Float float0 = new Float(0.0);
      MutableShort mutableShort0 = new MutableShort(float0);
      String string0 = mutableShort0.toString();
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short) (-3422));
      mutableShort0.hashCode();
      assertEquals((short) (-3422), mutableShort0.shortValue());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MutableShort mutableShort0 = new MutableShort((short) (-3422));
      double double0 = mutableShort0.doubleValue();
      assertEquals((-3422.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      MutableShort mutableShort0 = new MutableShort(float0);
      mutableShort0.decrement();
      assertEquals((short) (-2), (short)mutableShort0.getValue());
  }
}
