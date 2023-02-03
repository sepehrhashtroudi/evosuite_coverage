/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 23:12:27 GMT 2022
 */

package org.apache.commons.math3.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.MathIllegalNumberException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.util.MathArrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NonMonotonicSequenceException_ESTest extends NonMonotonicSequenceException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = MathIllegalNumberException.INTEGER_ZERO;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      NonMonotonicSequenceException nonMonotonicSequenceException0 = new NonMonotonicSequenceException(integer0, integer0, 561, mathArrays_OrderDirection0, false);
      boolean boolean0 = nonMonotonicSequenceException0.getStrict();
      assertEquals(561, nonMonotonicSequenceException0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      NonMonotonicSequenceException nonMonotonicSequenceException0 = new NonMonotonicSequenceException((Number) null, (Number) null, 646, mathArrays_OrderDirection0, false);
      nonMonotonicSequenceException0.getPrevious();
      assertFalse(nonMonotonicSequenceException0.getStrict());
      assertEquals(646, nonMonotonicSequenceException0.getIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Byte byte0 = new Byte((byte)0);
      NonMonotonicSequenceException nonMonotonicSequenceException0 = new NonMonotonicSequenceException(byte0, byte0, (byte)0);
      nonMonotonicSequenceException0.getPrevious();
      assertEquals(0, nonMonotonicSequenceException0.getIndex());
      assertTrue(nonMonotonicSequenceException0.getStrict());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-81));
      NonMonotonicSequenceException nonMonotonicSequenceException0 = new NonMonotonicSequenceException(byte0, byte0, 1020);
      int int0 = nonMonotonicSequenceException0.getIndex();
      assertTrue(nonMonotonicSequenceException0.getStrict());
      assertEquals(1020, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(268);
      NonMonotonicSequenceException nonMonotonicSequenceException0 = new NonMonotonicSequenceException(integer0, integer0, (-1930));
      int int0 = nonMonotonicSequenceException0.getIndex();
      assertEquals((-1930), int0);
      assertTrue(nonMonotonicSequenceException0.getStrict());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Short short0 = new Short((short)0);
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      NonMonotonicSequenceException nonMonotonicSequenceException0 = new NonMonotonicSequenceException(short0, short0, (short)0, mathArrays_OrderDirection0, true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Short short0 = new Short((short)2);
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      NonMonotonicSequenceException nonMonotonicSequenceException0 = new NonMonotonicSequenceException(short0, short0, 287, mathArrays_OrderDirection0, true);
      nonMonotonicSequenceException0.getPrevious();
      assertEquals(287, nonMonotonicSequenceException0.getIndex());
      assertTrue(nonMonotonicSequenceException0.getStrict());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NonMonotonicSequenceException nonMonotonicSequenceException0 = new NonMonotonicSequenceException((Number) null, (Number) null, 0, (MathArrays.OrderDirection) null, false);
      nonMonotonicSequenceException0.getDirection();
      assertFalse(nonMonotonicSequenceException0.getStrict());
      assertEquals(0, nonMonotonicSequenceException0.getIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-105));
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      NonMonotonicSequenceException nonMonotonicSequenceException0 = new NonMonotonicSequenceException(byte0, byte0, (byte) (-105), mathArrays_OrderDirection0, false);
      nonMonotonicSequenceException0.getPrevious();
      assertFalse(nonMonotonicSequenceException0.getStrict());
      assertEquals((-105), nonMonotonicSequenceException0.getIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Short short0 = new Short((short) (-3202));
      NonMonotonicSequenceException nonMonotonicSequenceException0 = new NonMonotonicSequenceException(short0, short0, 0);
      boolean boolean0 = nonMonotonicSequenceException0.getStrict();
      assertTrue(boolean0);
      assertEquals(0, nonMonotonicSequenceException0.getIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = MathIllegalNumberException.INTEGER_ZERO;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      NonMonotonicSequenceException nonMonotonicSequenceException0 = new NonMonotonicSequenceException(integer0, integer0, 0, mathArrays_OrderDirection0, false);
      nonMonotonicSequenceException0.getDirection();
      assertEquals(0, nonMonotonicSequenceException0.getIndex());
      assertFalse(nonMonotonicSequenceException0.getStrict());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Short short0 = new Short((short) (-3202));
      NonMonotonicSequenceException nonMonotonicSequenceException0 = new NonMonotonicSequenceException(short0, short0, 0);
      int int0 = nonMonotonicSequenceException0.getIndex();
      assertEquals(0, int0);
      assertTrue(nonMonotonicSequenceException0.getStrict());
  }
}
