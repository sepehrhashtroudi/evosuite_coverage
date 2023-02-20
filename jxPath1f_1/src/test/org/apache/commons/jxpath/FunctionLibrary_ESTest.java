/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 02 02:30:43 GMT 2023
 */

package org.apache.commons.jxpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Set;
import org.apache.commons.jxpath.ClassFunctions;
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.FunctionLibrary;
import org.apache.commons.jxpath.Functions;
import org.apache.commons.jxpath.PackageFunctions;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FunctionLibrary_ESTest extends FunctionLibrary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      PackageFunctions packageFunctions0 = new PackageFunctions("AB`Sf", "");
      functionLibrary0.addFunctions(packageFunctions0);
      functionLibrary0.addFunctions(packageFunctions0);
      Function function0 = functionLibrary0.getFunction("", "AB`Sf", (Object[]) null);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      functionLibrary0.addFunctions((Functions) null);
      // Undeclared exception!
      try { 
        functionLibrary0.getUsedNamespaces();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.FunctionLibrary", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      PackageFunctions packageFunctions0 = new PackageFunctions("", "Twxa59*FjP");
      functionLibrary0.addFunctions(packageFunctions0);
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        functionLibrary0.getFunction("Twxa59*FjP", "org.apache.commons.jxpath.ClassFunctions", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function Twxa59*FjP:org.apache.commons.jxpath.ClassFunctions; Class 'org/apache/commons/jxpath.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      PackageFunctions packageFunctions0 = new PackageFunctions("", "Twxa59*FjP");
      functionLibrary0.addFunctions(packageFunctions0);
      functionLibrary0.addFunctions(functionLibrary0);
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "Twxa59*FjP";
      // Undeclared exception!
      functionLibrary0.getFunction("Twxa59*FjP", "Twxa59*FjP", objectArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Class<Integer> class0 = Integer.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "a(z");
      functionLibrary0.addFunctions(classFunctions0);
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) "a(z";
      // Undeclared exception!
      try { 
        functionLibrary0.getFunction("a(z", "a(z", objectArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"a(z\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Object[] objectArray0 = new Object[5];
      functionLibrary0.addFunctions((Functions) null);
      // Undeclared exception!
      try { 
        functionLibrary0.getFunction("OKg%!e\"J/z__F)Awq", "org.apache.commons.jxpath.FunctionLibrary", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.FunctionLibrary", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) functionLibrary0;
      Class<Integer> class0 = Integer.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "");
      functionLibrary0.addFunctions(classFunctions0);
      // Undeclared exception!
      try { 
        functionLibrary0.getFunction("", "$</+.[u>Ebr", objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      PackageFunctions packageFunctions0 = new PackageFunctions("", "");
      functionLibrary0.addFunctions(packageFunctions0);
      functionLibrary0.addFunctions(packageFunctions0);
      functionLibrary0.addFunctions(packageFunctions0);
      Function function0 = functionLibrary0.getFunction("", "", (Object[]) null);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      functionLibrary0.getFunction("", "", (Object[]) null);
      Function function0 = functionLibrary0.getFunction("", "", (Object[]) null);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Set set0 = functionLibrary0.getUsedNamespaces();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      functionLibrary0.getFunction("", "", (Object[]) null);
      Set set0 = functionLibrary0.getUsedNamespaces();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      functionLibrary0.removeFunctions(functionLibrary0);
  }
}