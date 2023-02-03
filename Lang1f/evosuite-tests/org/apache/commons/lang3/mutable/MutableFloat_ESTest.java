/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 21:05:40 GMT 2022
 */

package org.apache.commons.lang3.mutable;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class MutableFloat_ESTest extends MutableFloat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(242.15273F);
      MutableFloat mutableFloat1 = new MutableFloat(mutableFloat0);
      mutableFloat1.increment();
      boolean boolean0 = mutableFloat1.equals(mutableFloat0);
      assertEquals(243.15273F, mutableFloat1.getValue(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      mutableFloat0.subtract(2000.4163F);
      assertEquals("-2000.4163", mutableFloat0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      mutableFloat0.add((-546.7661F));
      assertEquals((short) (-546), mutableFloat0.shortValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat("7");
      assertFalse(mutableFloat0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-653.0F));
      Float float0 = mutableFloat0.toFloat();
      assertEquals((-653.0F), (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      Short short0 = new Short((short)152);
      mutableFloat0.add((Number) short0);
      mutableFloat0.toFloat();
      assertEquals(152.0F, mutableFloat0.getValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(242.15273F);
      long long0 = mutableFloat0.longValue();
      assertEquals(242L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-653.0F));
      long long0 = mutableFloat0.longValue();
      assertEquals((-653L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      int int0 = mutableFloat0.intValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(1578.0F);
      Float float0 = new Float((double) 1578.0F);
      mutableFloat0.setValue((float) 1);
      mutableFloat0.subtract((Number) float0);
      int int0 = mutableFloat0.intValue();
      assertEquals((-1577.0F), mutableFloat0.toFloat(), 0.01F);
      assertEquals((-1577), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(1140.454F);
      Float float0 = mutableFloat0.getValue();
      assertEquals(1140.454F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      mutableFloat0.decrement();
      mutableFloat0.getValue();
      assertEquals((-1.0F), mutableFloat0.getValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(0.0F);
      float float0 = mutableFloat0.floatValue();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(1578.0F);
      Float float0 = new Float((double) 1578.0F);
      mutableFloat0.setValue((float) 1);
      mutableFloat0.subtract((Number) float0);
      float float1 = mutableFloat0.floatValue();
      assertEquals((-1577L), mutableFloat0.longValue());
      assertEquals((-1577.0F), float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(242.15273F);
      double double0 = mutableFloat0.doubleValue();
      assertEquals(242.15272521972656, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(694.46F);
      MutableFloat mutableFloat1 = new MutableFloat();
      int int0 = mutableFloat0.compareTo(mutableFloat1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      MutableFloat mutableFloat1 = new MutableFloat(2824.2F);
      int int0 = mutableFloat0.compareTo(mutableFloat1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      // Undeclared exception!
      try { 
        mutableFloat0.subtract((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      // Undeclared exception!
      try { 
        mutableFloat0.setValue((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(1578.0F);
      // Undeclared exception!
      try { 
        mutableFloat0.compareTo((MutableFloat) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-1153.5742F));
      // Undeclared exception!
      try { 
        mutableFloat0.add((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MutableFloat mutableFloat0 = null;
      try {
        mutableFloat0 = new MutableFloat((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MutableFloat mutableFloat0 = null;
      try {
        mutableFloat0 = new MutableFloat((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Byte byte0 = new Byte((byte)0);
      MutableFloat mutableFloat0 = new MutableFloat((Number) byte0);
      mutableFloat0.increment();
      MutableFloat mutableFloat1 = new MutableFloat((float) 0);
      boolean boolean0 = mutableFloat1.equals(mutableFloat0);
      assertEquals(1, mutableFloat0.intValue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Byte byte0 = new Byte((byte)0);
      MutableFloat mutableFloat0 = new MutableFloat((Number) byte0);
      boolean boolean0 = mutableFloat0.equals(mutableFloat0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(1578.0F);
      boolean boolean0 = mutableFloat0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(1578L, mutableFloat0.longValue());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(1578.0F);
      String string0 = mutableFloat0.toString();
      assertEquals("1578.0", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(1578.0F);
      mutableFloat0.hashCode();
      assertEquals((short)1578, mutableFloat0.shortValue());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      double double0 = mutableFloat0.doubleValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      mutableFloat0.decrement();
      double double0 = mutableFloat0.doubleValue();
      assertEquals((-1L), mutableFloat0.longValue());
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Byte byte0 = new Byte((byte)0);
      MutableFloat mutableFloat0 = new MutableFloat((Number) byte0);
      Float float0 = mutableFloat0.toFloat();
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      Float float0 = mutableFloat0.getValue();
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(1578.0F);
      int int0 = mutableFloat0.intValue();
      assertEquals(1578, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(1578.0F);
      float float0 = mutableFloat0.floatValue();
      assertEquals(1578.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      boolean boolean0 = mutableFloat0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MutableFloat mutableFloat0 = null;
      try {
        mutableFloat0 = new MutableFloat("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(1578.0F);
      mutableFloat0.isNaN();
      assertEquals((short)1578, mutableFloat0.shortValue());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(1578.0F);
      Float float0 = new Float((double) 1578.0F);
      mutableFloat0.setValue((Number) float0);
      assertFalse(mutableFloat0.isNaN());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Byte byte0 = new Byte((byte)0);
      MutableFloat mutableFloat0 = new MutableFloat((Number) byte0);
      long long0 = mutableFloat0.longValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      int int0 = mutableFloat0.compareTo(mutableFloat0);
      assertEquals(0, int0);
  }
}
