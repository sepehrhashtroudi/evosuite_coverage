/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 01:40:31 GMT 2023
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NameAttributeTest_ESTest extends NameAttributeTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationOr0, coreOperationOr0);
      Expression expression0 = nameAttributeTest0.getNameTestExpression();
      assertSame(expression0, coreOperationOr0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      nameAttributeTest0.args = null;
      // Undeclared exception!
      try { 
        nameAttributeTest0.getNameTestExpression();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.NameAttributeTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[1];
      nameAttributeTest0.args = expressionArray0;
      // Undeclared exception!
      try { 
        nameAttributeTest0.getNameTestExpression();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.NameAttributeTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      boolean boolean0 = nameAttributeTest0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      Expression expression0 = nameAttributeTest0.getNameTestExpression();
      assertNull(expression0);
  }
}
