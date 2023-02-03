/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 06:38:18 GMT 2022
 */

package org.apache.commons.math3.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.dfp.Dfp;
import org.apache.commons.math3.fraction.BigFraction;
import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.linear.DefaultFieldMatrixPreservingVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultFieldMatrixPreservingVisitor_ESTest extends DefaultFieldMatrixPreservingVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultFieldMatrixPreservingVisitor<Dfp> defaultFieldMatrixPreservingVisitor0 = new DefaultFieldMatrixPreservingVisitor<Dfp>((Dfp) null);
      Dfp dfp0 = defaultFieldMatrixPreservingVisitor0.end();
      assertNull(dfp0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      DefaultFieldMatrixPreservingVisitor<Fraction> defaultFieldMatrixPreservingVisitor0 = new DefaultFieldMatrixPreservingVisitor<Fraction>(fraction0);
      Fraction fraction1 = defaultFieldMatrixPreservingVisitor0.end();
      assertEquals(0L, fraction1.longValue());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      DefaultFieldMatrixPreservingVisitor<Complex> defaultFieldMatrixPreservingVisitor0 = new DefaultFieldMatrixPreservingVisitor<Complex>(complex0);
      defaultFieldMatrixPreservingVisitor0.visit((-1537), (-1537), complex0);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO;
      DefaultFieldMatrixPreservingVisitor<BigFraction> defaultFieldMatrixPreservingVisitor0 = new DefaultFieldMatrixPreservingVisitor<BigFraction>(bigFraction0);
      defaultFieldMatrixPreservingVisitor0.start((-714), (-8), (-714), (-8), (-1537), (-2932));
  }
}