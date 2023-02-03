/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 23:18:04 GMT 2022
 */

package org.apache.commons.math3.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.util.ExceptionContext;
import org.apache.commons.math3.exception.util.Localizable;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MathArithmeticException_ESTest extends MathArithmeticException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      MathArithmeticException mathArithmeticException0 = new MathArithmeticException((Localizable) null, objectArray0);
      // Undeclared exception!
      try { 
        mathArithmeticException0.getMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.exception.util.ExceptionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.MINIMAL_STEPSIZE_REACHED_DURING_INTEGRATION;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) localizedFormats0;
      MathArithmeticException mathArithmeticException0 = new MathArithmeticException(localizedFormats0, objectArray0);
      // Undeclared exception!
      try { 
        mathArithmeticException0.getMessage();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Number
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      MathArithmeticException mathArithmeticException0 = new MathArithmeticException((Localizable) null, objectArray0);
      // Undeclared exception!
      try { 
        mathArithmeticException0.getLocalizedMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.exception.util.ExceptionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object object0 = new Object();
      LocalizedFormats localizedFormats0 = LocalizedFormats.MINIMAL_STEPSIZE_REACHED_DURING_INTEGRATION;
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = object0;
      MathArithmeticException mathArithmeticException0 = new MathArithmeticException(localizedFormats0, objectArray0);
      // Undeclared exception!
      try { 
        mathArithmeticException0.getLocalizedMessage();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Number
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.MINIMAL_STEPSIZE_REACHED_DURING_INTEGRATION;
      Object[] objectArray0 = new Object[8];
      MathArithmeticException mathArithmeticException0 = new MathArithmeticException(localizedFormats0, objectArray0);
      String string0 = mathArithmeticException0.getMessage();
      assertEquals("minimal step size (null) reached, integration needs null", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.MINIMAL_STEPSIZE_REACHED_DURING_INTEGRATION;
      Object[] objectArray0 = new Object[5];
      MathArithmeticException mathArithmeticException0 = new MathArithmeticException(localizedFormats0, objectArray0);
      String string0 = mathArithmeticException0.getLocalizedMessage();
      assertEquals("minimal step size (null) reached, integration needs null", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MathArithmeticException mathArithmeticException0 = new MathArithmeticException();
      ExceptionContext exceptionContext0 = mathArithmeticException0.getContext();
      assertNotNull(exceptionContext0);
  }
}
