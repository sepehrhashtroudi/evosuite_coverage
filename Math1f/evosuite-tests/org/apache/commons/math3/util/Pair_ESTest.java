/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 21:56:51 GMT 2022
 */

package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Pair_ESTest extends Pair_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(199);
      Pair<Object, Object> pair0 = new Pair<Object, Object>(integer0, integer0);
      boolean boolean0 = pair0.equals(pair0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Pair<Object, Integer> pair0 = new Pair<Object, Integer>((Object) null, integer0);
      Pair<Object, Object> pair1 = new Pair<Object, Object>(pair0, (Object) null);
      Object object0 = pair1.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Pair<String, Integer> pair0 = new Pair<String, Integer>("]dC9WjX`t\u0005Lc<", (Integer) null);
      Integer integer0 = pair0.getSecond();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Pair<Object, Object> pair0 = new Pair<Object, Object>((Object) null, (Object) null);
      Object object0 = pair0.getKey();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Pair<String, Integer> pair0 = new Pair<String, Integer>("", (Integer) null);
      Pair<Object, Object> pair1 = new Pair<Object, Object>(pair0);
      Object object0 = pair1.getFirst();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Pair<String, Integer> pair0 = null;
      try {
        pair0 = new Pair<String, Integer>((Pair<? extends String, ? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.Pair", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Pair<Integer, String> pair0 = new Pair<Integer, String>((Integer) null, "ZBVT75tkA?BW{yf{U<");
      Pair<Object, Object> pair1 = new Pair<Object, Object>((Object) null, pair0);
      boolean boolean0 = pair1.equals("[@Lg8");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer((-2077));
      Pair<String, Integer> pair0 = new Pair<String, Integer>("ZBVT75tkA?BW{yf{U<", integer0);
      String string0 = pair0.getKey();
      assertEquals("ZBVT75tkA?BW{yf{U<", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Pair<Integer, String> pair0 = new Pair<Integer, String>((Integer) null, "ZBVT75tkA?BW{yf{U<");
      Pair<Integer, Object> pair1 = new Pair<Integer, Object>(pair0);
      Object object0 = pair1.getValue();
      assertEquals("ZBVT75tkA?BW{yf{U<", object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Pair<Integer, String> pair0 = new Pair<Integer, String>((Integer) null, "1YELcaYl.%@z,07#");
      Pair<Integer, Object> pair1 = new Pair<Integer, Object>(pair0);
      pair1.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Pair<String, Object> pair0 = new Pair<String, Object>("5H/U|", (Object) null);
      pair0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Pair<Object, Object> pair0 = new Pair<Object, Object>("k;J|#.TY=", (Object) null);
      Pair<Object, Object> pair1 = new Pair<Object, Object>(pair0);
      boolean boolean0 = pair1.equals(pair0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Pair<String, Object> pair0 = new Pair<String, Object>("5H/U|", (Object) null);
      Pair<Object, String> pair1 = new Pair<Object, String>("5H/U|", "5H/U|");
      boolean boolean0 = pair0.equals(pair1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Pair<String, Integer> pair0 = new Pair<String, Integer>("", (Integer) null);
      Pair<Object, Object> pair1 = new Pair<Object, Object>(pair0);
      Pair<Object, Integer> pair2 = new Pair<Object, Integer>((Object) null, (Integer) null);
      boolean boolean0 = pair1.equals(pair2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Pair<Integer, String> pair0 = new Pair<Integer, String>((Integer) null, "ZBVT75tkA?BW{yf{U<");
      Pair<Object, Object> pair1 = new Pair<Object, Object>((Object) null, pair0);
      boolean boolean0 = pair1.equals(pair0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Pair<String, Object> pair0 = new Pair<String, Object>("R2r)U-`cXpaY(V0kW", "R2r)U-`cXpaY(V0kW");
      Pair<Object, Object> pair1 = new Pair<Object, Object>(pair0);
      boolean boolean0 = pair1.equals(pair0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Pair<String, String> pair0 = new Pair<String, String>("", "");
      Pair<String, String> pair1 = new Pair<String, String>((String) null, "");
      Pair<String, Object> pair2 = new Pair<String, Object>(pair1);
      boolean boolean0 = pair2.equals(pair0);
      assertFalse(pair0.equals((Object)pair1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Pair<String, String> pair0 = new Pair<String, String>("", "");
      Object object0 = pair0.getSecond();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Pair<Integer, String> pair0 = new Pair<Integer, String>((Integer) null, "");
      Pair<Object, Object> pair1 = new Pair<Object, Object>((Object) null, pair0);
      Object object0 = pair1.getFirst();
      assertNull(object0);
  }
}