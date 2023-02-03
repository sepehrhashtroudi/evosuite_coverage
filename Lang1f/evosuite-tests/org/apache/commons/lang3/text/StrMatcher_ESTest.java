/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 20:43:17 GMT 2022
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.text.StrMatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StrMatcher_ESTest extends StrMatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      char[] charArray0 = new char[8];
      charArray0[0] = ' ';
      int int0 = strMatcher_TrimMatcher0.isMatch(charArray0, 0, (-1774), 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("");
      char[] charArray0 = new char[9];
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, 0, (-1185), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("");
      char[] charArray0 = new char[8];
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, 604, 0, 2352);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = ',';
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("'\"");
      int int0 = strMatcher0.isMatch(charArray0, 0, (-1399), Integer.MAX_VALUE);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("1Ui2q73MeK|:v~yuXw");
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        strMatcher0.isMatch(charArray0, (-4815), (-853), 1778);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4815
         //
         verifyException("org.apache.commons.lang3.text.StrMatcher$StringMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '{';
      charArray0[2] = 'h';
      charArray0[3] = '\'';
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      int int0 = strMatcher_CharSetMatcher0.isMatch(charArray0, 1, 1, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[4];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      int int0 = strMatcher_CharSetMatcher0.isMatch(charArray0, 1, 1, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('w');
      char[] charArray0 = new char[6];
      int int0 = strMatcher_CharMatcher0.isMatch(charArray0, 0, 0, (-2061));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("RK#Ug&a%'i]Q");
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        strMatcher0.isMatch(charArray0, 2587, (-897), (-897));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2587
         //
         verifyException("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charMatcher('?');
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        strMatcher0.isMatch(charArray0, 2209, 2209, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2209
         //
         verifyException("org.apache.commons.lang3.text.StrMatcher$CharMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      // Undeclared exception!
      try { 
        strMatcher0.isMatch(charArray0, (int) ',', 4, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 44
         //
         verifyException("org.apache.commons.lang3.text.StrMatcher$TrimMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        strMatcher0.isMatch(charArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      char[] charArray0 = new char[3];
      int int0 = strMatcher_TrimMatcher0.isMatch(charArray0, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("");
      char[] charArray0 = new char[0];
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("'\"");
      int int0 = strMatcher0.isMatch(charArray0, 0, (-1399), Integer.MAX_VALUE);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrMatcher strMatcher0 = StrMatcher.charMatcher('u');
      int int0 = strMatcher0.isMatch(charArray0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[5];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      int int0 = strMatcher0.isMatch(charArray0, 0, 2686, (int) '\u0000');
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("");
      // Undeclared exception!
      try { 
        strMatcher0.isMatch((char[]) null, 134);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("=");
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("");
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[0];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("org.apache.commons.lang3.text.StrMatcher$NoMatcher");
      char[] charArray0 = new char[0];
      int int0 = strMatcher0.isMatch(charArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.spaceMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.singleQuoteMatcher();
      // Undeclared exception!
      try { 
        strMatcher0.isMatch((char[]) null, (-338), (-338), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrMatcher$CharMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      char[] charArray0 = new char[1];
      int int0 = strMatcher0.isMatch(charArray0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.tabMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.commaMatcher();
      char[] charArray0 = new char[3];
      charArray0[0] = 'Q';
      int int0 = strMatcher0.isMatch(charArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[6];
      StrMatcher strMatcher0 = StrMatcher.noneMatcher();
      int int0 = strMatcher0.isMatch(charArray0, 0, 0, (int) 'B');
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StrMatcher.NoMatcher strMatcher_NoMatcher0 = new StrMatcher.NoMatcher();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      char[] charArray0 = new char[3];
      charArray0[0] = '-';
      int int0 = strMatcher_TrimMatcher0.isMatch(charArray0, 0, 54, 54);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      int int0 = strMatcher0.isMatch(charArray0, 0, 0, 0);
      assertEquals(1, int0);
  }
}
