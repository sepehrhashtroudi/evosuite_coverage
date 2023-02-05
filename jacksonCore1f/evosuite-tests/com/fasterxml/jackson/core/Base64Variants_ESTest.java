/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 01 21:08:43 GMT 2023
 */

package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Variants_ESTest extends Base64Variants_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      try { 
        Base64Variants.valueOf((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No Base64Variant with name <null>
         //
         verifyException("com.fasterxml.jackson.core.Base64Variants", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      try { 
        Base64Variants.valueOf("MIME-NO-LINEFEWDS");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No Base64Variant with name 'MIME-NO-LINEFEWDS'
         //
         verifyException("com.fasterxml.jackson.core.Base64Variants", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Base64Variant base64Variant0 = Base64Variants.valueOf("PEM");
      assertEquals(64, base64Variant0.getMaxLineLength());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Base64Variant base64Variant0 = Base64Variants.valueOf("MODIFIED-FOR-URL");
      assertEquals("MODIFIED-FOR-URL", base64Variant0.getName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Base64Variant base64Variant0 = Base64Variants.valueOf("MIME");
      assertEquals("MIME", base64Variant0.getName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Base64Variant base64Variant0 = Base64Variants.valueOf("MIME-NO-LINEFEEDS");
      assertEquals("MIME-NO-LINEFEEDS", base64Variant0.getName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Base64Variants base64Variants0 = new Base64Variants();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Base64Variant base64Variant0 = Base64Variants.getDefaultVariant();
      assertEquals((-2), Base64Variant.BASE64_VALUE_PADDING);
  }
}
