/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:10:23 GMT 2022
 */

package org.apache.commons.math3.primes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math3.primes.Primes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Primes_ESTest extends Primes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      List<Integer> list0 = Primes.primeFactors(2);
      assertTrue(list0.contains(2));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = Primes.isPrime(51);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = Primes.isPrime(2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = Primes.isPrime(4327);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Primes.primeFactors(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math3.primes.Primes", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List<Integer> list0 = Primes.primeFactors(1700);
      assertEquals(5, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = Primes.nextPrime(539);
      assertEquals(541, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = Primes.nextPrime(293);
      assertEquals(293, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = Primes.nextPrime(0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = Primes.nextPrime(2);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Primes.nextPrime((-2225));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,225 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.primes.Primes", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = Primes.nextPrime(285);
      assertEquals(293, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = Primes.isPrime(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = Primes.nextPrime(4314);
      assertEquals(4327, int0);
  }
}
