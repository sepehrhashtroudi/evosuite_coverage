/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 05:32:14 GMT 2022
 */

package org.apache.commons.math3.transform;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Ceil;
import org.apache.commons.math3.analysis.function.Log;
import org.apache.commons.math3.analysis.function.Rint;
import org.apache.commons.math3.analysis.function.Sinc;
import org.apache.commons.math3.analysis.function.Tan;
import org.apache.commons.math3.transform.FastHadamardTransformer;
import org.apache.commons.math3.transform.TransformType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastHadamardTransformer_ESTest extends FastHadamardTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      int[] intArray0 = new int[8];
      intArray0[1] = (-2242);
      int[] intArray1 = fastHadamardTransformer0.fht(intArray0);
      assertArrayEquals(new int[] {(-2242), 2242, (-2242), 2242, (-2242), 2242, (-2242), 2242}, intArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (double) (-3346);
      TransformType transformType0 = TransformType.INVERSE;
      double[] doubleArray1 = fastHadamardTransformer0.transform(doubleArray0, transformType0);
      assertArrayEquals(new double[] {(-836.5), (-836.5), 836.5, 836.5}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      Tan tan0 = new Tan();
      TransformType transformType0 = TransformType.INVERSE;
      double[] doubleArray0 = fastHadamardTransformer0.transform((UnivariateFunction) tan0, 3.947457923821984E-183, 1.0705673935006142E-106, 1, transformType0);
      assertArrayEquals(new double[] {3.947457923821984E-183}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = fastHadamardTransformer0.fht(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      // Undeclared exception!
      try { 
        fastHadamardTransformer0.transform((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.transform.FastHadamardTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      double[] doubleArray0 = new double[0];
      TransformType transformType0 = TransformType.FORWARD;
      // Undeclared exception!
      try { 
        fastHadamardTransformer0.transform(doubleArray0, transformType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a power of 2
         //
         verifyException("org.apache.commons.math3.transform.FastHadamardTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      TransformType transformType0 = TransformType.FORWARD;
      // Undeclared exception!
      try { 
        fastHadamardTransformer0.transform((double[]) null, transformType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.transform.FastHadamardTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      TransformType transformType0 = TransformType.INVERSE;
      Sinc sinc0 = new Sinc(true);
      // Undeclared exception!
      try { 
        fastHadamardTransformer0.transform((UnivariateFunction) sinc0, (double) (-1103), 0.0, (-4636), transformType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of sample is not positive: -4,636
         //
         verifyException("org.apache.commons.math3.analysis.FunctionUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      Rint rint0 = new Rint();
      TransformType transformType0 = TransformType.FORWARD;
      // Undeclared exception!
      try { 
        fastHadamardTransformer0.transform((UnivariateFunction) rint0, 1.0, 1.0, 1501, transformType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 is larger than, or equal to, the maximum (1)
         //
         verifyException("org.apache.commons.math3.analysis.FunctionUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      TransformType transformType0 = TransformType.FORWARD;
      // Undeclared exception!
      try { 
        fastHadamardTransformer0.transform((UnivariateFunction) null, 0.0, 1.0, 1372, transformType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.FunctionUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      int[] intArray0 = new int[5];
      try { 
        fastHadamardTransformer0.fht(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 is not a power of 2
         //
         verifyException("org.apache.commons.math3.transform.FastHadamardTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      // Undeclared exception!
      try { 
        fastHadamardTransformer0.fht((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.transform.FastHadamardTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      double[] doubleArray0 = new double[9];
      try { 
        fastHadamardTransformer0.fht(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9 is not a power of 2
         //
         verifyException("org.apache.commons.math3.transform.FastHadamardTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      // Undeclared exception!
      try { 
        fastHadamardTransformer0.fht((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.transform.FastHadamardTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      int[] intArray0 = new int[1];
      int[] intArray1 = fastHadamardTransformer0.transform(intArray0);
      assertArrayEquals(new int[] {0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      Ceil ceil0 = new Ceil();
      TransformType transformType0 = TransformType.INVERSE;
      // Undeclared exception!
      try { 
        fastHadamardTransformer0.transform((UnivariateFunction) ceil0, (-1650.967569782591), 0.0, 690, transformType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 690 is not a power of 2
         //
         verifyException("org.apache.commons.math3.transform.FastHadamardTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      TransformType transformType0 = TransformType.FORWARD;
      Log log0 = new Log();
      // Undeclared exception!
      fastHadamardTransformer0.transform((UnivariateFunction) log0, 0.0, 669.78194, 8388608, transformType0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FastHadamardTransformer fastHadamardTransformer0 = new FastHadamardTransformer();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        fastHadamardTransformer0.transform(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a power of 2
         //
         verifyException("org.apache.commons.math3.transform.FastHadamardTransformer", e);
      }
  }
}
