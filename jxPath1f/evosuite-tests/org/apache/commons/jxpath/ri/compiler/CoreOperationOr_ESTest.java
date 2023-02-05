/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 01:34:53 GMT 2023
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CoreOperationOr_ESTest extends CoreOperationOr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName("", (String) null);
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[7];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) stepArray0[4]);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        coreOperationOr0.computeValue(initialContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreFunction0, coreFunction0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThan0, coreOperationLessThan0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationGreaterThanOrEqual0, coreOperationLessThan0);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      QName qName0 = new QName("`3r", "`3r");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "or");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationOr0.computeValue(descendantContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of argument: position(org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual@0000000003 = org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan@0000000002)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationOr0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationAdd0, coreOperationAdd0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationAdd0, coreOperationLessThan0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationMultiply0, coreOperationAdd0);
      nameAttributeTest0.args = expressionArray0;
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, nameAttributeTest0.args, stepArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(expressionPath0, expressionPath0);
      expressionArray0[0] = (Expression) coreOperationDivide0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationOr");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationOr0.computeValue(parentContext0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("Z*LlBk59q-\"j<}GjV");
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, coreOperationMod0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, coreOperationLessThanOrEqual0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "Z*LlBk59q-\"j<}GjV");
      QName qName0 = new QName("#5G^/]JiL{X,Ao@p=i?");
      Integer integer0 = new Integer((-268));
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, integer0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        coreOperationOr0.computeValue(rootContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("z0zf}\".]&:0#=,]HO");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      Object object0 = coreOperationOr0.computeValue((EvalContext) null);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Double double0 = Expression.NOT_A_NUMBER;
      Constant constant0 = new Constant(double0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) constant0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Boolean boolean0 = (Boolean)coreOperationOr0.computeValue(initialContext0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[13];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      boolean boolean0 = coreOperationOr0.isSymmetric();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[13];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      int int0 = coreOperationOr0.getPrecedence();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[13];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      String string0 = coreOperationOr0.getSymbol();
      assertEquals("or", string0);
  }
}
