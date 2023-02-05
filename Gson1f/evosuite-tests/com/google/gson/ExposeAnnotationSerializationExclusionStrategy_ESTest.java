/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 03 21:23:49 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.ExposeAnnotationSerializationExclusionStrategy;
import com.google.gson.FieldAttributes;
import java.lang.annotation.Annotation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExposeAnnotationSerializationExclusionStrategy_ESTest extends ExposeAnnotationSerializationExclusionStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      ExposeAnnotationSerializationExclusionStrategy exposeAnnotationSerializationExclusionStrategy0 = new ExposeAnnotationSerializationExclusionStrategy();
      boolean boolean0 = exposeAnnotationSerializationExclusionStrategy0.shouldSkipClass(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExposeAnnotationSerializationExclusionStrategy exposeAnnotationSerializationExclusionStrategy0 = new ExposeAnnotationSerializationExclusionStrategy();
      // Undeclared exception!
      try { 
        exposeAnnotationSerializationExclusionStrategy0.shouldSkipField((FieldAttributes) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.ExposeAnnotationSerializationExclusionStrategy", e);
      }
  }
}
