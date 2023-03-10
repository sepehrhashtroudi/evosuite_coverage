/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:36:32 GMT 2022
 */

package org.apache.commons.math3.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiDirectionalSimplex_ESTest extends MultiDirectionalSimplex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[0][5];
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0, (-409.1064941), (-409.1064941));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // simplex must contain at least one point
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[7][3];
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0, 1, 369.757199870445);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 6
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex((double[][]) null, 0.5, 630.3366974389);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[10][9];
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // equal vertices 1 and 0 in simplex configuration
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[3][6];
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 2
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex((double[]) null, 2166.6104, (-1624.2));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(1100, (-312.0960284912), 16, (-312.0960284912));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex(1294, 0.0, 3501.1224962, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // equal vertices 0 and {1} in simplex configuration
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex((-2092), 0.5, (-2092), 1098.966124464278);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(1457, 1457, 556.611);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex(0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero not allowed here
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex((-2139), (-2330.0), (-2139));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(161, 2.0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex(0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero not allowed here
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex((-1526), 0.0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(2070);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero not allowed here
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(16, (-2163.074645));
      assertEquals(16, multiDirectionalSimplex0.getDimension());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(1, 369.757199870445, (-1.0), 6980.1254);
      assertEquals(1, multiDirectionalSimplex0.getDimension());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = (double) 1;
      doubleArray0[2] = 369.757199870445;
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0, 369.757199870445, 259.97435);
      assertEquals(3, multiDirectionalSimplex0.getDimension());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = (double) 1;
      doubleArray0[2] = 369.757199870445;
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0);
      assertEquals(3, multiDirectionalSimplex0.getDimension());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0);
      assertEquals(0, multiDirectionalSimplex0.getDimension());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0, 0.0, 0.0);
      assertEquals(0, multiDirectionalSimplex0.getDimension());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[][] doubleArray0 = new double[0][8];
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // simplex must contain at least one point
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(36, 36, 36);
      assertEquals(36, multiDirectionalSimplex0.getDimension());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[][] doubleArray0 = new double[2][1];
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0, (-1952.8219450228), (-129.84963518099656));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // equal vertices 1 and 0 in simplex configuration
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(16);
      assertEquals(16, multiDirectionalSimplex0.getDimension());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // equal vertices 0 and {1} in simplex configuration
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      MultiDirectionalSimplex multiDirectionalSimplex0 = null;
      try {
        multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0, 832.649218507248, 832.649218507248);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // equal vertices 0 and {1} in simplex configuration
         //
         verifyException("org.apache.commons.math3.optimization.direct.AbstractSimplex", e);
      }
  }
}
