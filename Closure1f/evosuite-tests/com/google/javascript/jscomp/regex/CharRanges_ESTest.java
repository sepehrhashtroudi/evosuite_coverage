/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 10:09:48 GMT 2023
 */

package com.google.javascript.jscomp.regex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.regex.CharRanges;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CharRanges_ESTest extends CharRanges_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.EMPTY;
      charRanges0.ALL_CODE_UNITS.shift(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.ALL_CODE_UNITS;
      int[] intArray0 = new int[1];
      intArray0[0] = 4035;
      CharRanges charRanges1 = CharRanges.withMembers(intArray0);
      charRanges0.containsAll(charRanges1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-1783);
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      charRanges0.containsAll(charRanges0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[2];
      CharRanges charRanges0 = CharRanges.ALL_CODE_UNITS;
      CharRanges charRanges1 = CharRanges.withMembers(intArray0);
      charRanges1.difference(charRanges0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-1173);
      intArray0[1] = (-384);
      CharRanges charRanges0 = CharRanges.withRanges(intArray0);
      charRanges0.ALL_CODE_UNITS.intersection(charRanges0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.inclusive((-2685), (-2685));
      CharRanges charRanges1 = CharRanges.ALL_CODE_UNITS;
      charRanges0.intersection(charRanges1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.inclusive((-16), (-16));
      int[] intArray0 = new int[8];
      intArray0[0] = (-16);
      intArray0[1] = (-16);
      intArray0[2] = (-16);
      intArray0[3] = 32;
      intArray0[4] = (-16);
      intArray0[5] = (-16);
      intArray0[6] = (-16);
      intArray0[7] = 1281;
      CharRanges charRanges1 = CharRanges.withMembers(intArray0);
      CharRanges charRanges2 = charRanges0.ALL_CODE_UNITS.difference(charRanges1);
      charRanges2.union(charRanges1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = 2730;
      // Undeclared exception!
      try { 
        CharRanges.withRanges(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 > 2730
         //
         verifyException("com.google.javascript.jscomp.regex.CharRanges", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.inclusive((-781), 1456);
      int[] intArray0 = new int[2];
      intArray0[0] = 45;
      intArray0[1] = 1456;
      CharRanges charRanges1 = CharRanges.withRanges(intArray0);
      charRanges0.EMPTY.union(charRanges1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.inclusive(774, 774);
      charRanges0.start(0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[4] = (-425);
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      charRanges0.start(0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.inclusive(1042, 2254);
      charRanges0.minSetBit();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[4] = (-425);
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      charRanges0.minSetBit();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.inclusive(1042, 2254);
      CharRanges charRanges1 = charRanges0.ALL_CODE_UNITS.intersection(charRanges0);
      assertNotSame(charRanges1, charRanges0);
      assertTrue(charRanges1.equals((Object)charRanges0));
      assertEquals(1042, charRanges0.minSetBit());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-1173);
      CharRanges charRanges0 = CharRanges.withRanges(intArray0);
      CharRanges charRanges1 = charRanges0.intersection(charRanges0);
      assertNotSame(charRanges1, charRanges0);
      assertTrue(charRanges1.equals((Object)charRanges0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.EMPTY;
      int int0 = charRanges0.getNumRanges();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-3500);
      CharRanges charRanges0 = CharRanges.withRanges(intArray0);
      int int0 = charRanges0.end(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.ALL_CODE_UNITS;
      int int0 = charRanges0.end(0);
      assertEquals(65536, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[1] = (-312);
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      int int0 = charRanges0.end(0);
      assertEquals((-312), charRanges0.minSetBit());
      assertEquals((-311), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-1783);
      CharRanges charRanges0 = CharRanges.ALL_CODE_UNITS;
      CharRanges charRanges1 = CharRanges.withRanges(intArray0);
      CharRanges charRanges2 = charRanges1.difference(charRanges0);
      assertTrue(charRanges2.equals((Object)charRanges1));
      assertNotSame(charRanges2, charRanges1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        CharRanges.withRanges((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.regex.CharRanges", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        CharRanges.withMembers((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.regex.CharRanges", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.inclusive((-586), (-586));
      // Undeclared exception!
      try { 
        charRanges0.union((CharRanges) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.regex.CharRanges", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.EMPTY;
      // Undeclared exception!
      try { 
        charRanges0.start((-18));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -36
         //
         verifyException("com.google.javascript.jscomp.regex.CharRanges", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.EMPTY;
      // Undeclared exception!
      try { 
        charRanges0.minSetBit();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.inclusive(0, 0);
      // Undeclared exception!
      try { 
        charRanges0.ALL_CODE_UNITS.intersection((CharRanges) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.regex.CharRanges", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.inclusive(2489, 2489);
      // Undeclared exception!
      try { 
        charRanges0.difference((CharRanges) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.regex.CharRanges", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.ALL_CODE_UNITS;
      // Undeclared exception!
      try { 
        charRanges0.containsAll((CharRanges) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.regex.CharRanges", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.inclusive(774, 774);
      charRanges0.hashCode();
      assertEquals(774, charRanges0.minSetBit());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.ALL_CODE_UNITS;
      Object object0 = new Object();
      boolean boolean0 = charRanges0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.inclusive(1042, 2254);
      boolean boolean0 = charRanges0.equals(charRanges0);
      assertTrue(boolean0);
      assertEquals(1042, charRanges0.minSetBit());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 3904;
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      String string0 = charRanges0.toString();
      assertEquals("[0x0 0xf40]", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.ALL_CODE_UNITS;
      String string0 = charRanges0.toString();
      assertEquals("[0x0-0xffff]", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.inclusive(774, 774);
      charRanges0.EMPTY.shift(774);
      assertEquals(774, charRanges0.minSetBit());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.ALL_CODE_UNITS;
      CharRanges charRanges1 = charRanges0.shift((-1783));
      assertEquals(1, charRanges1.getNumRanges());
      assertEquals((-1783), charRanges1.minSetBit());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.ALL_CODE_UNITS;
      CharRanges charRanges1 = charRanges0.shift(0);
      assertSame(charRanges1, charRanges0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[1] = 4521;
      CharRanges charRanges0 = CharRanges.ALL_CODE_UNITS;
      CharRanges charRanges1 = CharRanges.withRanges(intArray0);
      boolean boolean0 = charRanges1.containsAll(charRanges0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int[] intArray0 = new int[8];
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      CharRanges charRanges1 = CharRanges.inclusive(1, 3904);
      boolean boolean0 = charRanges1.containsAll(charRanges0);
      assertEquals(1, charRanges1.minSetBit());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[1] = 4521;
      CharRanges charRanges0 = CharRanges.withRanges(intArray0);
      CharRanges charRanges1 = CharRanges.withMembers(intArray0);
      boolean boolean0 = charRanges0.containsAll(charRanges1);
      assertFalse(boolean0);
      assertEquals(0, charRanges1.minSetBit());
      assertEquals(2, charRanges1.getNumRanges());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.inclusive(774, 774);
      CharRanges charRanges1 = CharRanges.inclusive((-1), 0);
      CharRanges charRanges2 = charRanges0.difference(charRanges1);
      assertTrue(charRanges2.equals((Object)charRanges0));
      assertEquals((-1), charRanges1.minSetBit());
      assertNotSame(charRanges2, charRanges0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.EMPTY;
      CharRanges charRanges1 = charRanges0.ALL_CODE_UNITS.difference(charRanges0);
      assertEquals(1, charRanges1.getNumRanges());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int[] intArray0 = new int[8];
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      CharRanges charRanges1 = charRanges0.EMPTY.difference(charRanges0);
      assertEquals(0, charRanges1.getNumRanges());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 3904;
      intArray0[5] = 2;
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      CharRanges charRanges1 = charRanges0.ALL_CODE_UNITS.intersection(charRanges0);
      assertEquals(3, charRanges1.getNumRanges());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int[] intArray0 = new int[6];
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      CharRanges charRanges1 = charRanges0.EMPTY.intersection(charRanges0);
      assertFalse(charRanges1.equals((Object)charRanges0));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.inclusive(1042, 2254);
      CharRanges charRanges1 = CharRanges.inclusive((-1032), (-1032));
      CharRanges charRanges2 = charRanges1.union(charRanges0);
      assertEquals(2, charRanges2.getNumRanges());
      assertEquals((-1032), charRanges2.minSetBit());
      assertEquals(1042, charRanges0.minSetBit());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.inclusive((-1), 0);
      int[] intArray0 = new int[8];
      intArray0[0] = 774;
      CharRanges charRanges1 = CharRanges.withMembers(intArray0);
      CharRanges charRanges2 = charRanges1.union(charRanges0);
      assertEquals(2, charRanges2.getNumRanges());
      assertEquals((-1), charRanges2.minSetBit());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 136;
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      CharRanges charRanges1 = CharRanges.ALL_CODE_UNITS;
      CharRanges charRanges2 = charRanges0.union(charRanges1);
      assertEquals(2, charRanges0.getNumRanges());
      assertTrue(charRanges2.equals((Object)charRanges1));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 3904;
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      CharRanges charRanges1 = CharRanges.inclusive(1, 3904);
      CharRanges charRanges2 = charRanges1.union(charRanges0);
      assertEquals(1, charRanges2.getNumRanges());
      assertEquals(2, charRanges0.getNumRanges());
      assertEquals(0, charRanges2.minSetBit());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.inclusive(774, 774);
      CharRanges charRanges1 = CharRanges.EMPTY;
      CharRanges charRanges2 = charRanges0.intersection(charRanges1);
      CharRanges charRanges3 = charRanges0.ALL_CODE_UNITS.union(charRanges2);
      assertFalse(charRanges3.isEmpty());
      assertTrue(charRanges2.isEmpty());
      assertEquals(774, charRanges0.minSetBit());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      int[] intArray0 = new int[0];
      CharRanges charRanges0 = CharRanges.withRanges(intArray0);
      CharRanges charRanges1 = charRanges0.union(charRanges0);
      assertSame(charRanges1, charRanges0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.EMPTY;
      boolean boolean0 = charRanges0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.ALL_CODE_UNITS;
      boolean boolean0 = charRanges0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      int[] intArray0 = new int[8];
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      int int0 = charRanges0.minSetBit();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[4] = (-3068);
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      boolean boolean0 = charRanges0.contains((-3068));
      assertEquals(2, charRanges0.getNumRanges());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 3904;
      intArray0[3] = 1;
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      assertEquals(2, charRanges0.getNumRanges());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 3904;
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      CharRanges charRanges1 = charRanges0.union(charRanges0);
      assertNotSame(charRanges1, charRanges0);
      assertEquals(2, charRanges1.getNumRanges());
      assertTrue(charRanges1.equals((Object)charRanges0));
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      int[] intArray0 = new int[0];
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      assertTrue(charRanges0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        CharRanges.withRanges(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.regex.CharRanges", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        CharRanges.withRanges(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 > 0
         //
         verifyException("com.google.javascript.jscomp.regex.CharRanges", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      // Undeclared exception!
      try { 
        CharRanges.inclusive(0, (-15));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 0 > -15
         //
         verifyException("com.google.javascript.jscomp.regex.CharRanges", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      int[] intArray0 = new int[2];
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      // Undeclared exception!
      try { 
        charRanges0.end((-2496));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4991
         //
         verifyException("com.google.javascript.jscomp.regex.CharRanges", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      int[] intArray0 = new int[6];
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      int int0 = charRanges0.start(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      int[] intArray0 = new int[8];
      CharRanges charRanges0 = CharRanges.withMembers(intArray0);
      boolean boolean0 = charRanges0.contains((-1));
      assertFalse(boolean0);
      assertFalse(charRanges0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CharRanges charRanges0 = CharRanges.ALL_CODE_UNITS;
      int int0 = charRanges0.getNumRanges();
      assertEquals(1, int0);
  }
}
