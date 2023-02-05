/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 01:19:58 GMT 2023
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LocationPath_ESTest extends LocationPath_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = locationPath0.isAbsolute();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.LocationPath", "org.apache.commons.jxpath.ri.compiler.LocationPath");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[3];
      Step step0 = new Step(9, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[1];
      stepArray0[3] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) stepArray0[1]);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Object object0 = locationPath0.computeValue(initialContext0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1240));
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step((-1240), nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = step0;
      stepArray0[4] = stepArray0[1];
      stepArray0[5] = stepArray0[0];
      stepArray0[6] = stepArray0[1];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "8wEkds-v@^gBN");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Object object0 = locationPath0.compute(initialContext0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locationPath0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      InitialContext initialContext0 = (InitialContext)locationPath0.compute(rootContext0);
      assertEquals(0, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[7];
      VariableReference variableReference0 = new VariableReference(qName0);
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      Expression[] expressionArray1 = new Expression[9];
      expressionArray1[8] = (Expression) expressionPath0;
      Step step0 = new Step((-2980), nodeNameTest0, expressionArray1);
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      locationPath0.toString();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(":0nl%etjI`");
      Expression[] expressionArray0 = new Expression[9];
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      Step step0 = new Step(0, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[3] = (Expression) coreOperationUnion0;
      Step step0 = new Step(0, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Step[] stepArray0 = new Step[9];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locationPath0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.LocationPath", "org.apache.commons.jxpath.ri.compiler.LocationPath");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = new InitialContext(rootContext0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, processingInstructionTest0);
      // Undeclared exception!
      try { 
        locationPath0.compute(descendantContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: org.apache.commons.jxpath.ri.compiler.LocationPath:org.apache.commons.jxpath.ri.compiler.LocationPath
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      boolean boolean0 = locationPath0.isAbsolute();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locationPath0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      QName qName0 = new QName("3b#Y_O`zVS6GvQ", "3b#Y_O`zVS6GvQ");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "3b#Y_O`zVS6GvQ");
      SelfContext selfContext0 = (SelfContext)locationPath0.createContextForStep(rootContext0, 1, nodeNameTest0);
      BeanPointer beanPointer0 = (BeanPointer)locationPath0.computeValue(selfContext0);
      assertTrue(beanPointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      // Undeclared exception!
      try { 
        locationPath0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "8wEkds-v@^gBN");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        locationPath0.compute(initialContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Step[] stepArray0 = new Step[10];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      String string0 = locationPath0.toString();
      assertEquals("/null/null/null/null/null/null/null/null/null/null", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      locationPath0.toString();
      assertFalse(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertFalse(boolean0);
  }
}
