/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 06:42:22 GMT 2022
 */

package org.apache.commons.math3.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.dfp.Dfp;
import org.apache.commons.math3.fraction.BigFraction;
import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.linear.DefaultFieldMatrixChangingVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultFieldMatrixChangingVisitor_ESTest extends DefaultFieldMatrixChangingVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      DefaultFieldMatrixChangingVisitor<Fraction> defaultFieldMatrixChangingVisitor0 = new DefaultFieldMatrixChangingVisitor<Fraction>(fraction0);
      Fraction fraction1 = defaultFieldMatrixChangingVisitor0.visit((-1), (-1), fraction0);
      assertEquals(2, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultFieldMatrixChangingVisitor<Dfp> defaultFieldMatrixChangingVisitor0 = new DefaultFieldMatrixChangingVisitor<Dfp>((Dfp) null);
      Dfp dfp0 = defaultFieldMatrixChangingVisitor0.end();
      assertNull(dfp0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      DefaultFieldMatrixChangingVisitor<Fraction> defaultFieldMatrixChangingVisitor0 = new DefaultFieldMatrixChangingVisitor<Fraction>(fraction0);
      defaultFieldMatrixChangingVisitor0.start((byte)0, (byte)1, 1678, 7482, (byte)3, 0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultFieldMatrixChangingVisitor<Dfp> defaultFieldMatrixChangingVisitor0 = new DefaultFieldMatrixChangingVisitor<Dfp>((Dfp) null);
      Dfp dfp0 = defaultFieldMatrixChangingVisitor0.visit(0, (-1523), (Dfp) null);
      assertNull(dfp0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_HALF;
      DefaultFieldMatrixChangingVisitor<BigFraction> defaultFieldMatrixChangingVisitor0 = new DefaultFieldMatrixChangingVisitor<BigFraction>(bigFraction0);
      BigFraction bigFraction1 = defaultFieldMatrixChangingVisitor0.end();
      assertEquals((short)0, bigFraction1.shortValue());
  }
}