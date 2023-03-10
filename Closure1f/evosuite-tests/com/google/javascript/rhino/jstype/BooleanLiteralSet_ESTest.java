/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 09:20:35 GMT 2023
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BooleanLiteralSet_ESTest extends BooleanLiteralSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.BOTH;
      BooleanLiteralSet booleanLiteralSet1 = BooleanLiteralSet.get(false);
      BooleanLiteralSet booleanLiteralSet2 = booleanLiteralSet1.union(booleanLiteralSet0);
      assertEquals(BooleanLiteralSet.BOTH, booleanLiteralSet2);
      
      BooleanLiteralSet booleanLiteralSet3 = booleanLiteralSet1.intersection(booleanLiteralSet2);
      assertEquals(BooleanLiteralSet.FALSE, booleanLiteralSet3);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BooleanLiteralSet[] booleanLiteralSetArray0 = BooleanLiteralSet.values();
      assertEquals(4, booleanLiteralSetArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.valueOf("TRUE");
      assertEquals(BooleanLiteralSet.TRUE, booleanLiteralSet0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.get(false);
      // Undeclared exception!
      try { 
        booleanLiteralSet0.union((BooleanLiteralSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.BooleanLiteralSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.EMPTY;
      // Undeclared exception!
      try { 
        booleanLiteralSet0.intersection((BooleanLiteralSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.BooleanLiteralSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.get(false);
      assertEquals(BooleanLiteralSet.FALSE, booleanLiteralSet0);
      
      boolean boolean0 = booleanLiteralSet0.contains(true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.get(true);
      assertEquals(BooleanLiteralSet.TRUE, booleanLiteralSet0);
      
      boolean boolean0 = booleanLiteralSet0.contains(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.get(false);
      assertEquals(BooleanLiteralSet.FALSE, booleanLiteralSet0);
      
      boolean boolean0 = booleanLiteralSet0.contains(false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.EMPTY;
      boolean boolean0 = booleanLiteralSet0.contains(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.EMPTY;
      BooleanLiteralSet booleanLiteralSet1 = BooleanLiteralSet.TRUE;
      BooleanLiteralSet booleanLiteralSet2 = booleanLiteralSet0.union(booleanLiteralSet1);
      assertEquals(BooleanLiteralSet.TRUE, booleanLiteralSet2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.EMPTY;
      BooleanLiteralSet booleanLiteralSet1 = booleanLiteralSet0.intersection(booleanLiteralSet0);
      assertEquals(BooleanLiteralSet.EMPTY, booleanLiteralSet1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.BOTH;
      BooleanLiteralSet booleanLiteralSet1 = BooleanLiteralSet.get(false);
      assertEquals(BooleanLiteralSet.FALSE, booleanLiteralSet1);
      
      BooleanLiteralSet booleanLiteralSet2 = booleanLiteralSet1.union(booleanLiteralSet0);
      assertEquals(BooleanLiteralSet.BOTH, booleanLiteralSet2);
      
      boolean boolean0 = booleanLiteralSet2.contains(false);
      assertTrue(boolean0);
  }
}
