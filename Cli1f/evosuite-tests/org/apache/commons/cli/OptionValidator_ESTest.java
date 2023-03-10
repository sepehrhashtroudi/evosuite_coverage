/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 01:08:35 GMT 2022
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.OptionValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OptionValidator_ESTest extends OptionValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      try { 
        OptionValidator.validateOption("~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // illegal option value '~'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OptionValidator.validateOption("@");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OptionValidator.validateOption("?");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OptionValidator.validateOption("t");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OptionValidator.validateOption("");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      try { 
        OptionValidator.validateOption("'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // illegal option value '''
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OptionValidator.validateOption(" ");
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      OptionValidator.validateOption((String) null);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      OptionValidator optionValidator0 = new OptionValidator();
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      try { 
        OptionValidator.validateOption("opt contains illegal character value '");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // opt contains illegal character value ' '
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }
}
