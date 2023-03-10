/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 23:20:06 GMT 2022
 */

package org.apache.commons.math3.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.BivariateFunction;
import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;
import org.apache.commons.math3.analysis.function.Log;
import org.apache.commons.math3.analysis.function.Multiply;
import org.apache.commons.math3.analysis.function.Pow;
import org.apache.commons.math3.analysis.function.Rint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FunctionUtils_ESTest extends FunctionUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnivariateDifferentiableFunction[] univariateDifferentiableFunctionArray0 = new UnivariateDifferentiableFunction[0];
      UnivariateDifferentiableFunction univariateDifferentiableFunction0 = FunctionUtils.compose(univariateDifferentiableFunctionArray0);
      try { 
        FunctionUtils.sample(univariateDifferentiableFunction0, 271.0, 0.0, 1454);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 271 is larger than, or equal to, the maximum (0)
         //
         verifyException("org.apache.commons.math3.analysis.FunctionUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      try { 
        FunctionUtils.sample((UnivariateFunction) null, 10.0, 10.0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of sample is not positive: 0
         //
         verifyException("org.apache.commons.math3.analysis.FunctionUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Pow pow0 = new Pow();
      UnivariateFunction univariateFunction0 = FunctionUtils.fix2ndArgument(pow0, (-887.91549));
      Rint rint0 = new Rint();
      UnivariateFunction univariateFunction1 = FunctionUtils.combine(pow0, rint0, univariateFunction0);
      assertFalse(univariateFunction1.equals((Object)univariateFunction0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnivariateDifferentiableFunction[] univariateDifferentiableFunctionArray0 = new UnivariateDifferentiableFunction[5];
      UnivariateDifferentiableFunction univariateDifferentiableFunction0 = FunctionUtils.add(univariateDifferentiableFunctionArray0);
      // Undeclared exception!
      try { 
        FunctionUtils.sample(univariateDifferentiableFunction0, (-1.0), 788.293253996, 695);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.FunctionUtils$5", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnivariateFunction univariateFunction0 = FunctionUtils.multiply((UnivariateFunction[]) null);
      // Undeclared exception!
      try { 
        FunctionUtils.sample(univariateFunction0, 814.2032474, 1661.060153875388, 3795);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.FunctionUtils$7", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Log log0 = new Log();
      try { 
        FunctionUtils.sample(log0, 0.0, 0.0, 49);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is larger than, or equal to, the maximum (0)
         //
         verifyException("org.apache.commons.math3.analysis.FunctionUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnivariateDifferentiableFunction[] univariateDifferentiableFunctionArray0 = new UnivariateDifferentiableFunction[0];
      UnivariateDifferentiableFunction univariateDifferentiableFunction0 = FunctionUtils.multiply(univariateDifferentiableFunctionArray0);
      try { 
        FunctionUtils.sample(univariateDifferentiableFunction0, (-387.0), (-78.7910887), (-1500));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of sample is not positive: -1,500
         //
         verifyException("org.apache.commons.math3.analysis.FunctionUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultivariateFunction multivariateFunction0 = FunctionUtils.collector((BivariateFunction) null, (-1592.3132));
      assertNotNull(multivariateFunction0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnivariateDifferentiableFunction univariateDifferentiableFunction0 = FunctionUtils.multiply((UnivariateDifferentiableFunction[]) null);
      MultivariateFunction multivariateFunction0 = FunctionUtils.collector((BivariateFunction) null, (UnivariateFunction) univariateDifferentiableFunction0, 4290.36906);
      assertNotNull(multivariateFunction0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Multiply multiply0 = new Multiply();
      UnivariateFunction univariateFunction0 = FunctionUtils.fix1stArgument(multiply0, (-3.141592653589793));
      double[] doubleArray0 = FunctionUtils.sample(univariateFunction0, (-3.141592653589793), 11.9637640734265, 2186);
      assertEquals(2186, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnivariateFunction univariateFunction0 = FunctionUtils.fix2ndArgument((BivariateFunction) null, 4290.36906);
      // Undeclared exception!
      try { 
        FunctionUtils.sample(univariateFunction0, (-2077.837419716036), (-1580.7681471269), 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.FunctionUtils$13", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnivariateFunction[] univariateFunctionArray0 = new UnivariateFunction[3];
      UnivariateFunction univariateFunction0 = FunctionUtils.compose(univariateFunctionArray0);
      assertNotNull(univariateFunction0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnivariateFunction univariateFunction0 = FunctionUtils.add((UnivariateFunction[]) null);
      // Undeclared exception!
      try { 
        FunctionUtils.sample(univariateFunction0, (-2077.837419716036), (-1580.7681471269), 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.FunctionUtils$4", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnivariateDifferentiableFunction[] univariateDifferentiableFunctionArray0 = new UnivariateDifferentiableFunction[0];
      UnivariateDifferentiableFunction univariateDifferentiableFunction0 = FunctionUtils.add(univariateDifferentiableFunctionArray0);
      // Undeclared exception!
      try { 
        FunctionUtils.sample(univariateDifferentiableFunction0, (-1.0), 788.293253996, 695);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.analysis.FunctionUtils$5", e);
      }
  }
}
