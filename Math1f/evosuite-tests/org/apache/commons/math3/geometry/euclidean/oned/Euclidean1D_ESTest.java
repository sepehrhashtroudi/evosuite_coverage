/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 06:03:10 GMT 2022
 */

package org.apache.commons.math3.geometry.euclidean.oned;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Euclidean1D_ESTest extends Euclidean1D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Euclidean1D euclidean1D0 = Euclidean1D.getInstance();
      int int0 = euclidean1D0.getDimension();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Euclidean1D euclidean1D0 = Euclidean1D.getInstance();
      try { 
        euclidean1D0.getSubSpace();
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // method not supported in dimension 1
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D", e);
      }
  }
}