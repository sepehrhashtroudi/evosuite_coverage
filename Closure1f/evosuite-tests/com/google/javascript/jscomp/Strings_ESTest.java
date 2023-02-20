/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 18:08:37 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Strings;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Strings_ESTest extends Strings_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = Strings.truncateAtMaxLength("Ft)`", 3, true);
      assertEquals("Ft)", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = Strings.truncateAtMaxLength("com.google.j...", 276, true);
      assertEquals("com.google.j...", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Strings.truncateAtMaxLength((String) null, 417, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Strings", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = Strings.truncateAtMaxLength("com.gogle.javascrit.jcomp.Strinas", 13, true);
      assertEquals("com.gogle....", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = Strings.truncateAtMaxLength("n", 0, false);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = Strings.truncateAtMaxLength("", 0, true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        Strings.truncateAtMaxLength("A759i%;wAVQ0E&F6", (-1), true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
