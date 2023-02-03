/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:15:37 GMT 2022
 */

package org.apache.commons.math3.primes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.primes.SmallPrimes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SmallPrimes_ESTest extends SmallPrimes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        SmallPrimes.millerRabinPrimeTest((-727));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // BigInteger: modulus not positive
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<Integer> list0 = SmallPrimes.trialDivision(3701);
      assertTrue(list0.contains(3701));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List<Integer> list0 = SmallPrimes.trialDivision(1);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List<Integer> list0 = SmallPrimes.trialDivision(1098);
      int int0 = SmallPrimes.smallTrialDivision((-666), list0);
      assertEquals(8, list0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      int int0 = SmallPrimes.boundedTrialDivision(0, 1, linkedList0);
      assertEquals(0, int0);
      assertFalse(linkedList0.contains(1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      SmallPrimes.trialDivision(0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      SmallPrimes.smallTrialDivision(0, linkedList0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        SmallPrimes.smallTrialDivision(0, (List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = SmallPrimes.millerRabinPrimeTest(885);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = SmallPrimes.millerRabinPrimeTest(1319);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = SmallPrimes.millerRabinPrimeTest(2521);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = SmallPrimes.millerRabinPrimeTest(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      List<Integer> list0 = SmallPrimes.trialDivision((-727));
      assertEquals(2, list0.size());
      assertFalse(list0.contains((-727)));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = SmallPrimes.boundedTrialDivision(1, 4949, (List<Integer>) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        SmallPrimes.boundedTrialDivision(0, 4507, (List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.primes.SmallPrimes", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      List<Integer> list0 = SmallPrimes.trialDivision(1878);
      int int0 = SmallPrimes.boundedTrialDivision((-713), 4949, list0);
      assertEquals(4, list0.size());
      assertEquals((-713), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      int int0 = SmallPrimes.smallTrialDivision(424, linkedList0);
      assertEquals(4, linkedList0.size());
      assertEquals(1, int0);
  }
}