/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 16 05:51:33 GMT 2023
 */

package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ViewMatcher_ESTest extends ViewMatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 4);
      Class<Object> class1 = Object.class;
      classArray0[0] = class1;
      ViewMatcher viewMatcher0 = ViewMatcher.construct(classArray0);
      boolean boolean0 = viewMatcher0.isVisibleForView(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 9);
      Class<Integer> class0 = Integer.class;
      classArray0[0] = class0;
      ViewMatcher viewMatcher0 = ViewMatcher.construct(classArray0);
      boolean boolean0 = viewMatcher0.isVisibleForView(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 9);
      Class<Integer> class0 = Integer.class;
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = class0;
      classArray0[3] = class0;
      classArray0[4] = class0;
      classArray0[5] = class0;
      classArray0[6] = class0;
      classArray0[7] = class0;
      classArray0[8] = class0;
      ViewMatcher viewMatcher0 = ViewMatcher.construct(classArray0);
      Class<Object> class1 = Object.class;
      boolean boolean0 = viewMatcher0.isVisibleForView(class1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      ViewMatcher viewMatcher0 = ViewMatcher.construct(classArray0);
      Class<String> class1 = String.class;
      boolean boolean0 = viewMatcher0.isVisibleForView(class1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      ViewMatcher viewMatcher0 = ViewMatcher.construct(classArray0);
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = viewMatcher0.isVisibleForView(class1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      ViewMatcher viewMatcher0 = ViewMatcher.construct(classArray0);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        viewMatcher0.isVisibleForView(class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.util.ViewMatcher$Single", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      ViewMatcher viewMatcher0 = ViewMatcher.construct(classArray0);
      boolean boolean0 = viewMatcher0.isVisibleForView(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 0);
      ViewMatcher viewMatcher0 = ViewMatcher.construct(classArray0);
      assertNotNull(viewMatcher0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Class<String> class0 = String.class;
      ViewMatcher viewMatcher0 = ViewMatcher.construct((Class<?>[]) null);
      boolean boolean0 = viewMatcher0.isVisibleForView(class0);
      assertFalse(boolean0);
  }
}
