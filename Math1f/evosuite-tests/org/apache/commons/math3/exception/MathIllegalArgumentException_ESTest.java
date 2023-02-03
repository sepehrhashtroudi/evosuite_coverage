/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 23:07:15 GMT 2022
 */

package org.apache.commons.math3.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.DummyLocalizable;
import org.apache.commons.math3.exception.util.ExceptionContext;
import org.apache.commons.math3.exception.util.Localizable;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MathIllegalArgumentException_ESTest extends MathIllegalArgumentException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      DummyLocalizable dummyLocalizable0 = new DummyLocalizable("");
      MathIllegalArgumentException mathIllegalArgumentException0 = new MathIllegalArgumentException(dummyLocalizable0, objectArray0);
      String string0 = mathIllegalArgumentException0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      DummyLocalizable dummyLocalizable0 = new DummyLocalizable("");
      MathIllegalArgumentException mathIllegalArgumentException0 = new MathIllegalArgumentException(dummyLocalizable0, objectArray0);
      String string0 = mathIllegalArgumentException0.getLocalizedMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      MathIllegalArgumentException mathIllegalArgumentException0 = new MathIllegalArgumentException((Localizable) null, objectArray0);
      // Undeclared exception!
      try { 
        mathIllegalArgumentException0.getMessage();
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
      LocalizedFormats localizedFormats0 = LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA;
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) localizedFormats0;
      MathIllegalArgumentException mathIllegalArgumentException0 = new MathIllegalArgumentException(localizedFormats0, objectArray0);
      // Undeclared exception!
      try { 
        mathIllegalArgumentException0.getMessage();
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
      Object[] objectArray0 = new Object[7];
      MathIllegalArgumentException mathIllegalArgumentException0 = new MathIllegalArgumentException((Localizable) null, objectArray0);
      // Undeclared exception!
      try { 
        mathIllegalArgumentException0.getLocalizedMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.exception.util.ExceptionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) localizedFormats0;
      MathIllegalArgumentException mathIllegalArgumentException0 = new MathIllegalArgumentException(localizedFormats0, objectArray0);
      // Undeclared exception!
      try { 
        mathIllegalArgumentException0.getLocalizedMessage();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Number
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA;
      Object[] objectArray0 = new Object[8];
      MathIllegalArgumentException mathIllegalArgumentException0 = new MathIllegalArgumentException(localizedFormats0, objectArray0);
      String string0 = mathIllegalArgumentException0.getLocalizedMessage();
      assertEquals("cannot compute beta density at 0 when alpha = null", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA;
      Object[] objectArray0 = new Object[6];
      MathIllegalArgumentException mathIllegalArgumentException0 = new MathIllegalArgumentException(localizedFormats0, objectArray0);
      String string0 = mathIllegalArgumentException0.getMessage();
      assertEquals("cannot compute beta density at 0 when alpha = null", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.CLASS_DOESNT_IMPLEMENT_COMPARABLE;
      Object[] objectArray0 = new Object[1];
      MathIllegalArgumentException mathIllegalArgumentException0 = new MathIllegalArgumentException(localizedFormats0, objectArray0);
      ExceptionContext exceptionContext0 = mathIllegalArgumentException0.getContext();
      assertNotNull(exceptionContext0);
  }
}
