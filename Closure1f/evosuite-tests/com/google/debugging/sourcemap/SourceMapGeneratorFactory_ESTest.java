/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 18:29:19 GMT 2023
 */

package com.google.debugging.sourcemap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.debugging.sourcemap.SourceMapFormat;
import com.google.debugging.sourcemap.SourceMapGeneratorFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SourceMapGeneratorFactory_ESTest extends SourceMapGeneratorFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        SourceMapGeneratorFactory.getInstance((SourceMapFormat) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.debugging.sourcemap.SourceMapGeneratorFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SourceMapFormat sourceMapFormat0 = SourceMapFormat.DEFAULT;
      // Undeclared exception!
      try { 
        SourceMapGeneratorFactory.getInstance(sourceMapFormat0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.google.debugging.sourcemap.SourceMapGeneratorV3", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SourceMapFormat sourceMapFormat0 = SourceMapFormat.V3;
      // Undeclared exception!
      try { 
        SourceMapGeneratorFactory.getInstance(sourceMapFormat0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.google.debugging.sourcemap.SourceMapGeneratorV3", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SourceMapFormat sourceMapFormat0 = SourceMapFormat.V2;
      // Undeclared exception!
      try { 
        SourceMapGeneratorFactory.getInstance(sourceMapFormat0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.google.debugging.sourcemap.SourceMapGeneratorV2", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SourceMapFormat sourceMapFormat0 = SourceMapFormat.V1;
      // Undeclared exception!
      try { 
        SourceMapGeneratorFactory.getInstance(sourceMapFormat0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.google.debugging.sourcemap.SourceMapGeneratorV1", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        SourceMapGeneratorFactory.getInstance();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.google.debugging.sourcemap.SourceMapGeneratorV3", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SourceMapGeneratorFactory sourceMapGeneratorFactory0 = new SourceMapGeneratorFactory();
  }
}
