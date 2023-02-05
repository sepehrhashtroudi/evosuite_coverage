/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 01:25:03 GMT 2023
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CoreOperationSubtract_ESTest extends CoreOperationSubtract_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Constant constant0 = new Constant("BPubwq~3*`0");
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, (NodeTest) null);
      Object object0 = coreOperationSubtract0.computeValue(ancestorContext0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QName qName0 = new QName((String) null, "-");
      Expression[] expressionArray0 = new Expression[2];
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(variableReference0, variableReference0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(extensionFunction0, expressionArray0[1]);
      CoreFunction coreFunction0 = new CoreFunction((-1283), expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationLessThan0, coreFunction0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationMod0, variableReference0);
      Integer integer0 = new Integer((-1283));
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, integer0, (Locale) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      InitialContext initialContext0 = new InitialContext(rootContext0);
      // Undeclared exception!
      try { 
        coreOperationSubtract0.computeValue(initialContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: -
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationUnion0, coreOperationUnion0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNotEqual0, coreOperationAdd0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationNotEqual0, nameAttributeTest0);
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(expressionArray0[6], (Expression) null);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationAnd0, coreOperationMultiply0);
      // Undeclared exception!
      try { 
        coreOperationSubtract0.computeValue((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(variableReference0, variableReference0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeTypeTest0);
      NodeSetContext nodeSetContext0 = new NodeSetContext(ancestorContext0, (NodeSet) null);
      // Undeclared exception!
      try { 
        coreOperationSubtract0.computeValue(nodeSetContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Double double0 = Expression.ONE;
      Constant constant0 = new Constant(double0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
      Expression[] expressionArray0 = new Expression[0];
      coreOperationSubtract0.args = expressionArray0;
      // Undeclared exception!
      try { 
        coreOperationSubtract0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Double double0 = Expression.ONE;
      Constant constant0 = new Constant(double0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
      int int0 = coreOperationSubtract0.getPrecedence();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Double double0 = Expression.ONE;
      Constant constant0 = new Constant(double0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
      String string0 = coreOperationSubtract0.getSymbol();
      assertEquals("-", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Double double0 = Expression.ONE;
      Constant constant0 = new Constant(double0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
      boolean boolean0 = coreOperationSubtract0.isSymmetric();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Constant constant0 = new Constant(",Q_AX)");
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, coreOperationMod0);
      // Undeclared exception!
      try { 
        coreOperationSubtract0.computeValue((EvalContext) null);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }
}