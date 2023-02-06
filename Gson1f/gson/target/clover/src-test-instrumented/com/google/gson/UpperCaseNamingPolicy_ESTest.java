/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 05 09:53:05 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.UpperCaseNamingPolicy;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UpperCaseNamingPolicy_ESTest extends UpperCaseNamingPolicy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UpperCaseNamingPolicy upperCaseNamingPolicy0 = new UpperCaseNamingPolicy();
      LinkedList<Annotation> linkedList0 = new LinkedList<Annotation>();
      String string0 = upperCaseNamingPolicy0.translateName("", (Type) null, (Collection<Annotation>) linkedList0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UpperCaseNamingPolicy upperCaseNamingPolicy0 = new UpperCaseNamingPolicy();
      Type[] typeArray0 = new Type[6];
      LinkedList<Annotation> linkedList0 = new LinkedList<Annotation>();
      // Undeclared exception!
      try { 
        upperCaseNamingPolicy0.translateName((String) null, typeArray0[4], (Collection<Annotation>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.UpperCaseNamingPolicy", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UpperCaseNamingPolicy upperCaseNamingPolicy0 = new UpperCaseNamingPolicy();
      LinkedList<Annotation> linkedList0 = new LinkedList<Annotation>();
      String string0 = upperCaseNamingPolicy0.translateName("com.google.gson.Pair", (Type) null, (Collection<Annotation>) linkedList0);
      assertEquals("COM.GOOGLE.GSON.PAIR", string0);
  }
}