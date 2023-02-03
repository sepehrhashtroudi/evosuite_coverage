/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 21:07:46 GMT 2022
 */

package org.apache.commons.lang3.mutable;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.mutable.MutableInt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MutableInt_ESTest extends MutableInt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Long long0 = new Long(0L);
      MutableInt mutableInt0 = new MutableInt(long0);
      MutableInt mutableInt1 = new MutableInt((-2028));
      boolean boolean0 = mutableInt0.equals(mutableInt1);
      assertFalse(mutableInt1.equals((Object)mutableInt0));
      assertEquals((-2028), mutableInt1.intValue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Float float0 = new Float(0.0);
      MutableInt mutableInt0 = new MutableInt(float0);
      mutableInt0.subtract((Number) mutableInt0);
      assertEquals((short)0, mutableInt0.shortValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt();
      mutableInt0.increment();
      mutableInt0.toInteger();
      assertEquals(1L, mutableInt0.longValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(1098);
      mutableInt0.subtract((Number) mutableInt0);
      mutableInt0.subtract(1098);
      mutableInt0.toInteger();
      assertEquals((-1098.0F), mutableInt0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(0);
      long long0 = mutableInt0.longValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(1098);
      mutableInt0.subtract((Number) mutableInt0);
      mutableInt0.subtract(1098);
      long long0 = mutableInt0.longValue();
      assertEquals((-1098), mutableInt0.intValue());
      assertEquals((-1098L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(1239);
      mutableInt0.subtract(1239);
      int int0 = mutableInt0.intValue();
      assertEquals(0.0, mutableInt0.doubleValue(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Float float0 = new Float(0.0);
      MutableInt mutableInt0 = new MutableInt(float0);
      mutableInt0.increment();
      int int0 = mutableInt0.intValue();
      assertEquals(1, (int)mutableInt0.toInteger());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt();
      Integer integer0 = mutableInt0.getValue();
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(1098);
      mutableInt0.subtract((Number) mutableInt0);
      mutableInt0.subtract(1098);
      mutableInt0.getValue();
      assertEquals((-1098L), mutableInt0.longValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Float float0 = new Float(0.0);
      MutableInt mutableInt0 = new MutableInt(float0);
      float float1 = mutableInt0.floatValue();
      assertEquals(0.0F, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt((-1804));
      float float0 = mutableInt0.floatValue();
      assertEquals((-1804.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(0);
      double double0 = mutableInt0.doubleValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(1098);
      mutableInt0.subtract((Number) mutableInt0);
      mutableInt0.subtract(1098);
      double double0 = mutableInt0.doubleValue();
      assertEquals((byte) (-74), mutableInt0.byteValue());
      assertEquals((-1098.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt((-1));
      // Undeclared exception!
      try { 
        mutableInt0.setValue((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt((-1));
      // Undeclared exception!
      try { 
        mutableInt0.compareTo((MutableInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt();
      // Undeclared exception!
      try { 
        mutableInt0.add((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutableInt mutableInt0 = null;
      try {
        mutableInt0 = new MutableInt("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MutableInt mutableInt0 = null;
      try {
        mutableInt0 = new MutableInt((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt((-2092));
      int int0 = mutableInt0.intValue();
      assertEquals((-2092), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(1098);
      MutableInt mutableInt1 = new MutableInt(mutableInt0);
      Integer integer0 = new Integer(1098);
      mutableInt1.subtract((Number) integer0);
      int int0 = mutableInt1.compareTo(mutableInt0);
      assertEquals((byte)0, mutableInt1.byteValue());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt();
      int int0 = mutableInt0.compareTo(mutableInt0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt();
      MutableInt mutableInt1 = new MutableInt();
      mutableInt1.decrement();
      boolean boolean0 = mutableInt1.equals(mutableInt0);
      assertEquals("-1", mutableInt1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(1098);
      boolean boolean0 = mutableInt0.equals(mutableInt0);
      assertTrue(boolean0);
      assertEquals(1098, (int)mutableInt0.getValue());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(1098);
      String string0 = mutableInt0.toString();
      assertEquals("1098", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt();
      mutableInt0.increment();
      MutableInt mutableInt1 = new MutableInt();
      int int0 = mutableInt0.compareTo(mutableInt1);
      assertEquals((short)1, mutableInt0.shortValue());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(1098);
      mutableInt0.add(1098);
      assertEquals((byte) (-108), mutableInt0.byteValue());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(1098);
      float float0 = mutableInt0.floatValue();
      assertEquals(1098.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt("1098");
      assertEquals(1098, mutableInt0.intValue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt();
      mutableInt0.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt();
      Integer integer0 = mutableInt0.toInteger();
      assertEquals(0, (int)integer0);
      
      boolean boolean0 = mutableInt0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(1098);
      Integer integer0 = mutableInt0.getValue();
      assertEquals(1098, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(1098);
      double double0 = mutableInt0.doubleValue();
      assertEquals(1098.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(1098);
      long long0 = mutableInt0.longValue();
      assertEquals(1098L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(1098);
      mutableInt0.add((Number) mutableInt0);
      assertEquals(2196, mutableInt0.intValue());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt(1098);
      Integer integer0 = new Integer(1098);
      mutableInt0.setValue((Number) integer0);
      assertEquals(1098.0, mutableInt0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MutableInt mutableInt0 = new MutableInt((-1));
      mutableInt0.setValue((-1));
      assertEquals((short) (-1), mutableInt0.shortValue());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Float float0 = new Float(1533.826);
      MutableInt mutableInt0 = new MutableInt(float0);
      // Undeclared exception!
      try { 
        mutableInt0.subtract((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableInt", e);
      }
  }
}
