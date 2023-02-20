/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 02:28:21 GMT 2023
 */

package org.apache.commons.jxpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Set;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.PackageFunctions;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.util.TypeConverter;
import org.apache.commons.jxpath.util.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PackageFunctions_ESTest extends PackageFunctions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("Index is less than 1: ", "Index is less than 1: ");
      TypeUtils.setTypeConverter((TypeConverter) null);
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction("Index is less than 1: ", "j8u)dn`7&", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("|", "|");
      Object[] objectArray0 = new Object[6];
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("|");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      basicNodeSet0.add(variablePointer0);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(basicNodeSet0).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction("|", "|", objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '|'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("Cannot invoke extension function ", "");
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction("", "org.apache.commons.jxpath.PackageFunctions", (Object[]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function :org.apache.commons.jxpath.PackageFunctions; Class 'Cannot invoke extension function org/apache/commons/jxpath.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("myN~+4", (String) null);
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction((String) null, "_N VKZBu=TpXS MU8C.", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function _N VKZBu=TpXS MU8C.; Class 'myN~+4_N VKZBu=TpXS MU8C.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("myN~+4", (String) null);
      Set set0 = packageFunctions0.getUsedNamespaces();
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) set0;
      Function function0 = packageFunctions0.getFunction((String) null, "rq", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("?", "?");
      Object[] objectArray0 = new Object[7];
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(basicNodeSet0, (NodePointer) null, "?").when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      packageFunctions0.getFunction("?", "?", objectArray0);
      packageFunctions0.getFunction("?", (String) null, objectArray0);
      Function function0 = packageFunctions0.getFunction("?", (String) null, objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("?", "?");
      Object[] objectArray0 = new Object[7];
      Function function0 = packageFunctions0.getFunction((String) null, "<<unknown namespace>>", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("Index is less than 1: ", "Index is less than 1: ");
      Object[] objectArray0 = new Object[0];
      Function function0 = packageFunctions0.getFunction(" of ", (String) null, objectArray0);
      assertNull(function0);
  }
}