/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 20:12:06 GMT 2022
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.CharSetUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class CharSetUtils_ESTest extends CharSetUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[5];
      String string0 = CharSetUtils.squeeze("", stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = CharSetUtils.delete((String) null, stringArray0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = CharSetUtils.delete("q3", (String[]) null);
      assertEquals("q3", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "x";
      String string0 = CharSetUtils.delete("x", stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[3];
      String string0 = CharSetUtils.delete("x", stringArray0);
      assertEquals("x", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "x";
      String string0 = CharSetUtils.keep("x", stringArray0);
      assertEquals("x", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = CharSetUtils.keep("ymG?HUf'^uT", stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = CharSetUtils.keep("", stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[1] = "(Ca7:[-V.##*s=}~/L";
      int int0 = CharSetUtils.count("(Ca7:[-V.##*s=}~/L", stringArray0);
      assertEquals(17, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[1];
      int int0 = CharSetUtils.count("5zWOs%Lq$sZK", stringArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[1];
      int int0 = CharSetUtils.count("", stringArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "x";
      boolean boolean0 = CharSetUtils.containsAny("Q8'^<Tlp>b4+.'Ur%", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = ";";
      boolean boolean0 = CharSetUtils.containsAny(";", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[7];
      boolean boolean0 = CharSetUtils.containsAny(";", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[1];
      boolean boolean0 = CharSetUtils.containsAny((String) null, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[1] = "(Ca7:[-V.##*s=}~/L";
      String string0 = CharSetUtils.squeeze("(Ca7:[-V.##*s=}~/L", stringArray0);
      assertEquals("(Ca7:[-V.#*s=}~/L", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[1] = "$&T0Y";
      String string0 = CharSetUtils.squeeze("ZZ%", stringArray0);
      assertEquals("ZZ%", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "5zWOs%Lq$sZK";
      String string0 = CharSetUtils.squeeze(" vs ", stringArray0);
      assertEquals(" vs ", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = CharSetUtils.squeeze("org.apache.commons.lang3.CharSetUtils", stringArray0);
      assertEquals("org.apache.commons.lang3.CharSetUtils", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[3];
      String string0 = CharSetUtils.keep(stringArray0[0], stringArray0);
      String string1 = CharSetUtils.squeeze(string0, stringArray0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CharSetUtils charSetUtils0 = new CharSetUtils();
  }
}