/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 01 21:12:52 GMT 2023
 */

package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonLocation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonLocation_ESTest extends JsonLocation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("", (-739L), (-739L), 242, 242);
      JsonLocation jsonLocation1 = new JsonLocation("", (-739L), 242, 242);
      boolean boolean0 = jsonLocation1.equals(jsonLocation0);
      assertEquals(242, jsonLocation1.getLineNr());
      assertEquals(242, jsonLocation1.getColumnNr());
      assertEquals((-1L), jsonLocation1.getByteOffset());
      assertFalse(jsonLocation0.equals((Object)jsonLocation1));
      assertEquals((-739L), jsonLocation1.getCharOffset());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("[Source: ", (-760L), 0, 0);
      JsonLocation jsonLocation1 = new JsonLocation("[Source: ", 2717L, 0L, 0, 0);
      boolean boolean0 = jsonLocation0.equals(jsonLocation1);
      assertFalse(boolean0);
      assertEquals((-760L), jsonLocation0.getCharOffset());
      assertEquals(0, jsonLocation1.getColumnNr());
      assertEquals(2717L, jsonLocation1.getByteOffset());
      assertEquals(0, jsonLocation1.getLineNr());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("[Source: ", (-760L), (-9), (-9));
      JsonLocation jsonLocation1 = new JsonLocation("[Source: ", 2717L, 0L, (-9), 0);
      boolean boolean0 = jsonLocation0.equals(jsonLocation1);
      assertEquals((-9), jsonLocation1.getLineNr());
      assertEquals(2717L, jsonLocation1.getByteOffset());
      assertFalse(boolean0);
      assertEquals((-9), jsonLocation0.getColumnNr());
      assertEquals((-760L), jsonLocation0.getCharOffset());
      assertEquals(0, jsonLocation1.getColumnNr());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("<Wm.WROMv L", (-187L), (-2144661723), (-2144661723));
      JsonLocation jsonLocation1 = new JsonLocation("<Wm.WROMv L", (-187L), (-1), (-3485));
      boolean boolean0 = jsonLocation0.equals(jsonLocation1);
      assertFalse(boolean0);
      assertEquals((-1L), jsonLocation1.getByteOffset());
      assertEquals((-1), jsonLocation1.getLineNr());
      assertEquals((-3485), jsonLocation1.getColumnNr());
      assertEquals((-187L), jsonLocation1.getCharOffset());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonLocation jsonLocation0 = JsonLocation.NA;
      boolean boolean0 = jsonLocation0.equals(jsonLocation0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      JsonLocation jsonLocation0 = new JsonLocation(object0, (-4135), 345L, (-4135), (-4135));
      jsonLocation0.hashCode();
      assertEquals((-4135), jsonLocation0.getLineNr());
      assertEquals((-4135L), jsonLocation0.getByteOffset());
      assertEquals((-4135), jsonLocation0.getColumnNr());
      assertEquals(345L, jsonLocation0.getCharOffset());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      JsonLocation jsonLocation0 = new JsonLocation(object0, 345L, 345L, 666, (-4135));
      jsonLocation0.hashCode();
      assertEquals(345L, jsonLocation0.getByteOffset());
      assertEquals(345L, jsonLocation0.getCharOffset());
      assertEquals(666, jsonLocation0.getLineNr());
      assertEquals((-4135), jsonLocation0.getColumnNr());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation((Object) null, (-4804L), (-1400), 0);
      int int0 = jsonLocation0.getLineNr();
      assertEquals((-1L), jsonLocation0.getByteOffset());
      assertEquals(0, jsonLocation0.getColumnNr());
      assertEquals((-4804L), jsonLocation0.getCharOffset());
      assertEquals((-1400), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation((Object) null, (-4804L), (-1400), 0);
      jsonLocation0.getSourceRef();
      assertEquals((-1L), jsonLocation0.getByteOffset());
      assertEquals((-1400), jsonLocation0.getLineNr());
      assertEquals((-4804L), jsonLocation0.getCharOffset());
      assertEquals(0, jsonLocation0.getColumnNr());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      JsonLocation jsonLocation0 = new JsonLocation(object0, (-4415L), 0, 0);
      int int0 = jsonLocation0.getLineNr();
      assertEquals(0, int0);
      assertEquals((-1L), jsonLocation0.getByteOffset());
      assertEquals((-4415L), jsonLocation0.getCharOffset());
      assertEquals(0, jsonLocation0.getColumnNr());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      JsonLocation jsonLocation0 = new JsonLocation(object0, 521L, 521L, 93, 93);
      int int0 = jsonLocation0.getLineNr();
      assertEquals(93, int0);
      assertEquals(93, jsonLocation0.getColumnNr());
      assertEquals(521L, jsonLocation0.getCharOffset());
      assertEquals(521L, jsonLocation0.getByteOffset());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation((Object) null, 0L, 0L, (-2534), 2061);
      int int0 = jsonLocation0.getColumnNr();
      assertEquals(2061, int0);
      assertEquals((-2534), jsonLocation0.getLineNr());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonLocation jsonLocation0 = JsonLocation.NA;
      int int0 = jsonLocation0.getColumnNr();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      JsonLocation jsonLocation0 = new JsonLocation(object0, 0L, 0L, 176, (-3725));
      jsonLocation0.getCharOffset();
      assertEquals(176, jsonLocation0.getLineNr());
      assertEquals((-3725), jsonLocation0.getColumnNr());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonLocation jsonLocation0 = JsonLocation.NA;
      long long0 = jsonLocation0.getCharOffset();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      JsonLocation jsonLocation0 = new JsonLocation(object0, 0L, 0L, 176, (-3725));
      jsonLocation0.getByteOffset();
      assertEquals(176, jsonLocation0.getLineNr());
      assertEquals((-3725), jsonLocation0.getColumnNr());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      JsonLocation jsonLocation0 = new JsonLocation(object0, (-2211L), 1237, 1237);
      JsonLocation jsonLocation1 = new JsonLocation(jsonLocation0, 1237, 1237, 1237, 0);
      long long0 = jsonLocation1.getByteOffset();
      assertEquals(1237, jsonLocation1.getLineNr());
      assertEquals((-2211L), jsonLocation0.getCharOffset());
      assertEquals(1237, jsonLocation0.getColumnNr());
      assertEquals(0, jsonLocation1.getColumnNr());
      assertEquals(1237L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonLocation jsonLocation0 = JsonLocation.NA;
      long long0 = jsonLocation0.getByteOffset();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("", 4, 24L, 4, 4);
      JsonLocation jsonLocation1 = new JsonLocation("", 24L, 4, 4);
      boolean boolean0 = jsonLocation1.equals(jsonLocation0);
      assertEquals(4, jsonLocation1.getLineNr());
      assertEquals((-1L), jsonLocation1.getByteOffset());
      assertEquals(4, jsonLocation1.getColumnNr());
      assertFalse(boolean0);
      assertEquals(24L, jsonLocation1.getCharOffset());
      assertFalse(jsonLocation0.equals((Object)jsonLocation1));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("N?!MZq(+D>`<S%;", 3369L, 0, 0);
      JsonLocation jsonLocation1 = new JsonLocation("N?!MZq(+D>`<S%;", 0, 0, 0, 0);
      boolean boolean0 = jsonLocation0.equals(jsonLocation1);
      assertFalse(boolean0);
      assertEquals(3369L, jsonLocation0.getCharOffset());
      assertEquals(0, jsonLocation1.getLineNr());
      assertEquals(0, jsonLocation1.getColumnNr());
      assertEquals((-1L), jsonLocation0.getByteOffset());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("{", 1886L, 1886L, 209, 209);
      JsonLocation jsonLocation1 = new JsonLocation("{", 209, (-2144691083), (-2144691083));
      boolean boolean0 = jsonLocation0.equals(jsonLocation1);
      assertEquals((-2144691083), jsonLocation1.getLineNr());
      assertEquals((-2144691083), jsonLocation1.getColumnNr());
      assertEquals((-1L), jsonLocation1.getByteOffset());
      assertFalse(boolean0);
      assertEquals(209L, jsonLocation1.getCharOffset());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("N?!MZq(+D>`<S%;", 3369L, 0, 0);
      JsonLocation jsonLocation1 = JsonLocation.NA;
      boolean boolean0 = jsonLocation0.equals(jsonLocation1);
      assertEquals(0, jsonLocation0.getColumnNr());
      assertEquals((-1L), jsonLocation0.getByteOffset());
      assertEquals(3369L, jsonLocation0.getCharOffset());
      assertFalse(boolean0);
      assertEquals(0, jsonLocation0.getLineNr());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation((Object) null, 252L, 1L, 1, 1780);
      JsonLocation jsonLocation1 = new JsonLocation((Object) null, 1271L, 1, 1);
      boolean boolean0 = jsonLocation0.equals(jsonLocation1);
      assertFalse(boolean0);
      assertEquals(1, jsonLocation0.getLineNr());
      assertEquals((-1L), jsonLocation1.getByteOffset());
      assertEquals(1780, jsonLocation0.getColumnNr());
      assertEquals(1271L, jsonLocation1.getCharOffset());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("N?!MZq(+D>`<S%;", 3369L, 0, 0);
      boolean boolean0 = jsonLocation0.equals("[Source: java.lang.String@0000000002; line: 0, column: 0]");
      assertFalse(boolean0);
      assertEquals(0, jsonLocation0.getLineNr());
      assertEquals(3369L, jsonLocation0.getCharOffset());
      assertEquals((-1L), jsonLocation0.getByteOffset());
      assertEquals(0, jsonLocation0.getColumnNr());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation((Object) null, 1074L, 1074L, 1840700269, 1840700269);
      boolean boolean0 = jsonLocation0.equals((Object) null);
      assertEquals(1840700269, jsonLocation0.getColumnNr());
      assertFalse(boolean0);
      assertEquals(1840700269, jsonLocation0.getLineNr());
      assertEquals(1074L, jsonLocation0.getByteOffset());
      assertEquals(1074L, jsonLocation0.getCharOffset());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation((Object) null, 1074L, 1074L, 1840700269, 1840700269);
      JsonLocation jsonLocation1 = new JsonLocation(jsonLocation0, 1074L, 1840700269, 1840700269, 1840700269);
      boolean boolean0 = jsonLocation0.equals(jsonLocation1);
      assertEquals(1074L, jsonLocation1.getByteOffset());
      assertEquals(1840700269, jsonLocation1.getColumnNr());
      assertEquals(1840700269L, jsonLocation1.getCharOffset());
      assertEquals(1840700269, jsonLocation1.getLineNr());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation((Object) null, 1074L, 1074L, 1840700269, 1840700269);
      jsonLocation0.hashCode();
      assertEquals(1074L, jsonLocation0.getCharOffset());
      assertEquals(1074L, jsonLocation0.getByteOffset());
      assertEquals(1840700269, jsonLocation0.getLineNr());
      assertEquals(1840700269, jsonLocation0.getColumnNr());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation((Object) null, 252L, 1L, 1, 1780);
      String string0 = jsonLocation0.toString();
      assertEquals(252L, jsonLocation0.getByteOffset());
      assertEquals("[Source: UNKNOWN; line: 1, column: 1780]", string0);
      assertEquals(1L, jsonLocation0.getCharOffset());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("N?!MZq(+D>`<S%;", 3369L, 0, 0);
      jsonLocation0.toString();
      assertEquals(3369L, jsonLocation0.getCharOffset());
      assertEquals(0, jsonLocation0.getLineNr());
      assertEquals(0, jsonLocation0.getColumnNr());
      assertEquals((-1L), jsonLocation0.getByteOffset());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("N?!MZq(+D>`<S%;", 3369L, 0, 0);
      long long0 = jsonLocation0.getCharOffset();
      assertEquals(0, jsonLocation0.getColumnNr());
      assertEquals(3369L, long0);
      assertEquals((-1L), jsonLocation0.getByteOffset());
      assertEquals(0, jsonLocation0.getLineNr());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("N?!MZq(+D>`<S%;", 3369L, 0, 0);
      int int0 = jsonLocation0.getColumnNr();
      assertEquals((-1L), jsonLocation0.getByteOffset());
      assertEquals(0, int0);
      assertEquals(3369L, jsonLocation0.getCharOffset());
      assertEquals(0, jsonLocation0.getLineNr());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JsonLocation jsonLocation0 = new JsonLocation("", (-1L), (-1L), 246, 246);
      JsonLocation jsonLocation1 = new JsonLocation("", (-1L), 246, 246);
      boolean boolean0 = jsonLocation1.equals(jsonLocation0);
      assertEquals((-1L), jsonLocation1.getByteOffset());
      assertEquals((-1L), jsonLocation1.getCharOffset());
      assertTrue(boolean0);
      assertEquals(246, jsonLocation1.getColumnNr());
      assertEquals(246, jsonLocation1.getLineNr());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JsonLocation jsonLocation0 = JsonLocation.NA;
      Object object0 = jsonLocation0.getSourceRef();
      assertEquals("N/A", object0);
  }
}
