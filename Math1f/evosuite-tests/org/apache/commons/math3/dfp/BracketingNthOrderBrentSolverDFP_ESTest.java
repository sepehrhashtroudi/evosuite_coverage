/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 21:25:35 GMT 2022
 */

package org.apache.commons.math3.dfp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.AllowedSolution;
import org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFP;
import org.apache.commons.math3.dfp.Dfp;
import org.apache.commons.math3.dfp.UnivariateDfpFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BracketingNthOrderBrentSolverDFP_ESTest extends BracketingNthOrderBrentSolverDFP_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BracketingNthOrderBrentSolverDFP bracketingNthOrderBrentSolverDFP0 = new BracketingNthOrderBrentSolverDFP((Dfp) null, (Dfp) null, (Dfp) null, 2);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      try { 
        bracketingNthOrderBrentSolverDFP0.solve((-412), (UnivariateDfpFunction) null, (Dfp) null, (Dfp) null, (Dfp) null, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BracketingNthOrderBrentSolverDFP bracketingNthOrderBrentSolverDFP0 = new BracketingNthOrderBrentSolverDFP((Dfp) null, (Dfp) null, (Dfp) null, 16);
      UnivariateDfpFunction univariateDfpFunction0 = mock(UnivariateDfpFunction.class, new ViolatedAssumptionAnswer());
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolverDFP0.solve(16, univariateDfpFunction0, (Dfp) null, (Dfp) null, (Dfp) null, allowedSolution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFP", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BracketingNthOrderBrentSolverDFP bracketingNthOrderBrentSolverDFP0 = null;
      try {
        bracketingNthOrderBrentSolverDFP0 = new BracketingNthOrderBrentSolverDFP((Dfp) null, (Dfp) null, (Dfp) null, (-1283));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,283 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFP", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BracketingNthOrderBrentSolverDFP bracketingNthOrderBrentSolverDFP0 = new BracketingNthOrderBrentSolverDFP((Dfp) null, (Dfp) null, (Dfp) null, 985);
      bracketingNthOrderBrentSolverDFP0.getEvaluations();
      assertEquals(985, bracketingNthOrderBrentSolverDFP0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      UnivariateDfpFunction univariateDfpFunction0 = mock(UnivariateDfpFunction.class, new ViolatedAssumptionAnswer());
      BracketingNthOrderBrentSolverDFP bracketingNthOrderBrentSolverDFP0 = new BracketingNthOrderBrentSolverDFP((Dfp) null, (Dfp) null, (Dfp) null, 1615);
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolverDFP0.solve(1615, univariateDfpFunction0, (Dfp) null, (Dfp) null, allowedSolution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFP", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BracketingNthOrderBrentSolverDFP bracketingNthOrderBrentSolverDFP0 = new BracketingNthOrderBrentSolverDFP((Dfp) null, (Dfp) null, (Dfp) null, 985);
      bracketingNthOrderBrentSolverDFP0.getFunctionValueAccuracy();
      assertEquals(985, bracketingNthOrderBrentSolverDFP0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BracketingNthOrderBrentSolverDFP bracketingNthOrderBrentSolverDFP0 = new BracketingNthOrderBrentSolverDFP((Dfp) null, (Dfp) null, (Dfp) null, 985);
      bracketingNthOrderBrentSolverDFP0.getAbsoluteAccuracy();
      assertEquals(985, bracketingNthOrderBrentSolverDFP0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BracketingNthOrderBrentSolverDFP bracketingNthOrderBrentSolverDFP0 = new BracketingNthOrderBrentSolverDFP((Dfp) null, (Dfp) null, (Dfp) null, 16);
      bracketingNthOrderBrentSolverDFP0.getMaxEvaluations();
      assertEquals(16, bracketingNthOrderBrentSolverDFP0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      BracketingNthOrderBrentSolverDFP bracketingNthOrderBrentSolverDFP0 = new BracketingNthOrderBrentSolverDFP((Dfp) null, (Dfp) null, (Dfp) null, 985);
      int int0 = bracketingNthOrderBrentSolverDFP0.getMaximalOrder();
      assertEquals(985, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      BracketingNthOrderBrentSolverDFP bracketingNthOrderBrentSolverDFP0 = new BracketingNthOrderBrentSolverDFP((Dfp) null, (Dfp) null, (Dfp) null, 985);
      bracketingNthOrderBrentSolverDFP0.getRelativeAccuracy();
      assertEquals(985, bracketingNthOrderBrentSolverDFP0.getMaximalOrder());
  }
}
