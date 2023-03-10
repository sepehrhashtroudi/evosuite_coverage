/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 05 09:23:18 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.JavaFieldNamingPolicy;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaFieldNamingPolicy_ESTest extends JavaFieldNamingPolicy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JavaFieldNamingPolicy javaFieldNamingPolicy0 = new JavaFieldNamingPolicy();
      LinkedList<Annotation> linkedList0 = new LinkedList<Annotation>();
      String string0 = javaFieldNamingPolicy0.translateName((String) null, (Type) null, (Collection<Annotation>) linkedList0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JavaFieldNamingPolicy javaFieldNamingPolicy0 = new JavaFieldNamingPolicy();
      LinkedList<Annotation> linkedList0 = new LinkedList<Annotation>();
      String string0 = javaFieldNamingPolicy0.translateName("N5J%:D\"\",gO", (Type) null, (Collection<Annotation>) linkedList0);
      assertEquals("N5J%:D\"\",gO", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JavaFieldNamingPolicy javaFieldNamingPolicy0 = new JavaFieldNamingPolicy();
      LinkedList<Annotation> linkedList0 = new LinkedList<Annotation>();
      String string0 = javaFieldNamingPolicy0.translateName("", (Type) null, (Collection<Annotation>) linkedList0);
      assertEquals("", string0);
  }
}
