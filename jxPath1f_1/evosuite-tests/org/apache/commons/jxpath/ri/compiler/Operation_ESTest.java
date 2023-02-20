/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 01:17:21 GMT 2023
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Operation_ESTest extends Operation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, (Expression[]) null, stepArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(expressionPath0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationNegate0, coreOperationNegate0);
      Expression[] expressionArray0 = coreOperationSubtract0.getArguments();
      assertEquals(2, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CoreOperationMod coreOperationMod0 = new CoreOperationMod((Expression) null, (Expression) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationMod0, (Expression) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationNotEqual0, coreOperationMod0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(nameAttributeTest0, coreOperationLessThan0);
      boolean boolean0 = coreOperationSubtract0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion((Expression[]) null);
      boolean boolean0 = coreOperationUnion0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationOr0, coreOperationOr0);
      boolean boolean0 = coreOperationGreaterThanOrEqual0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.Operation");
      Expression[] expressionArray0 = new Expression[0];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      Expression[] expressionArray1 = extensionFunction0.getArguments();
      assertNotNull(expressionArray1);
      
      CoreFunction coreFunction0 = new CoreFunction(2503, expressionArray1);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertFalse(boolean0);
  }
}
