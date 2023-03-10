/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 05 10:07:22 GMT 2023
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.DefaultTypeAdapters;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.FieldNamingStrategy2;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.ModifyFirstLetterNamingPolicy;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GsonBuilder_ESTest extends GsonBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      gsonBuilder0.setDateFormat(4338, 4338);
      // Undeclared exception!
      try { 
        gsonBuilder0.create();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 4338
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      // Undeclared exception!
      try { 
        gsonBuilder0.setFieldNamingStrategy((FieldNamingStrategy) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // condition failed: false
         //
         verifyException("com.google.gson.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      // Undeclared exception!
      try { 
        gsonBuilder0.setFieldNamingPolicy((FieldNamingPolicy) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.GsonBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      // Undeclared exception!
      try { 
        gsonBuilder0.setExclusionStrategies((ExclusionStrategy[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.GsonBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      gsonBuilder0.create();
      Class<DefaultTypeAdapters.MapTypeAdapter> class0 = DefaultTypeAdapters.MapTypeAdapter.class;
      DefaultTypeAdapters.MapTypeAdapter defaultTypeAdapters_MapTypeAdapter0 = new DefaultTypeAdapters.MapTypeAdapter();
      // Undeclared exception!
      try { 
        gsonBuilder0.registerTypeHierarchyAdapter(class0, defaultTypeAdapters_MapTypeAdapter0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Attempted to modify an unmodifiable map.
         //
         verifyException("com.google.gson.ParameterizedTypeHandlerMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      gsonBuilder0.setVersion((-3347.9062));
      // Undeclared exception!
      try { 
        gsonBuilder0.create();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // condition failed: false
         //
         verifyException("com.google.gson.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      ModifyFirstLetterNamingPolicy.LetterModifier modifyFirstLetterNamingPolicy_LetterModifier0 = ModifyFirstLetterNamingPolicy.LetterModifier.LOWER;
      ModifyFirstLetterNamingPolicy modifyFirstLetterNamingPolicy0 = new ModifyFirstLetterNamingPolicy(modifyFirstLetterNamingPolicy_LetterModifier0);
      GsonBuilder gsonBuilder1 = gsonBuilder0.setFieldNamingStrategy((FieldNamingStrategy2) modifyFirstLetterNamingPolicy0);
      assertSame(gsonBuilder1, gsonBuilder0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      gsonBuilder0.setDateFormat(0, (-3313));
      // Undeclared exception!
      try { 
        gsonBuilder0.create();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -3313
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      GsonBuilder gsonBuilder1 = gsonBuilder0.setDateFormat(29);
      Gson gson0 = gsonBuilder1.create();
      assertNotNull(gson0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      gsonBuilder0.setDateFormat("-");
      Gson gson0 = gsonBuilder0.create();
      assertNotNull(gson0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      gsonBuilder0.setDateFormat("");
      Gson gson0 = gsonBuilder0.create();
      assertNotNull(gson0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      gsonBuilder0.setVersion(1.0);
      Gson gson0 = gsonBuilder0.create();
      assertNotNull(gson0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      gsonBuilder0.create();
      DefaultTypeAdapters.MapTypeAdapter defaultTypeAdapters_MapTypeAdapter0 = new DefaultTypeAdapters.MapTypeAdapter();
      // Undeclared exception!
      try { 
        gsonBuilder0.registerTypeAdapter((Type) null, defaultTypeAdapters_MapTypeAdapter0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Attempted to modify an unmodifiable map.
         //
         verifyException("com.google.gson.ParameterizedTypeHandlerMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      Class<String> class0 = String.class;
      DefaultTypeAdapters.FloatSerializer defaultTypeAdapters_FloatSerializer0 = new DefaultTypeAdapters.FloatSerializer(true);
      GsonBuilder gsonBuilder1 = gsonBuilder0.registerTypeHierarchyAdapter(class0, defaultTypeAdapters_FloatSerializer0);
      assertSame(gsonBuilder1, gsonBuilder0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      Class<DefaultTypeAdapters.DefaultJavaSqlDateTypeAdapter> class0 = DefaultTypeAdapters.DefaultJavaSqlDateTypeAdapter.class;
      // Undeclared exception!
      try { 
        gsonBuilder0.registerTypeHierarchyAdapter(class0, gsonBuilder0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // condition failed: false
         //
         verifyException("com.google.gson.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      Class<DefaultTypeAdapters.DefaultTimeTypeAdapter> class0 = DefaultTypeAdapters.DefaultTimeTypeAdapter.class;
      // Undeclared exception!
      try { 
        gsonBuilder0.registerTypeAdapter(class0, gsonBuilder0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // condition failed: false
         //
         verifyException("com.google.gson.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      ExclusionStrategy[] exclusionStrategyArray0 = new ExclusionStrategy[1];
      GsonBuilder gsonBuilder1 = gsonBuilder0.setExclusionStrategies(exclusionStrategyArray0);
      assertSame(gsonBuilder1, gsonBuilder0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      LongSerializationPolicy longSerializationPolicy0 = LongSerializationPolicy.STRING;
      GsonBuilder gsonBuilder1 = gsonBuilder0.setLongSerializationPolicy(longSerializationPolicy0);
      assertSame(gsonBuilder0, gsonBuilder1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      GsonBuilder gsonBuilder1 = gsonBuilder0.generateNonExecutableJson();
      assertSame(gsonBuilder0, gsonBuilder1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      FieldNamingStrategy fieldNamingStrategy0 = mock(FieldNamingStrategy.class, new ViolatedAssumptionAnswer());
      GsonBuilder gsonBuilder1 = gsonBuilder0.setFieldNamingStrategy(fieldNamingStrategy0);
      assertSame(gsonBuilder0, gsonBuilder1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      gsonBuilder0.disableInnerClassSerialization();
      Gson gson0 = gsonBuilder0.create();
      assertNotNull(gson0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      Class<DefaultTypeAdapters.MapTypeAdapter> class0 = DefaultTypeAdapters.MapTypeAdapter.class;
      DefaultTypeAdapters.MapTypeAdapter defaultTypeAdapters_MapTypeAdapter0 = new DefaultTypeAdapters.MapTypeAdapter();
      GsonBuilder gsonBuilder1 = gsonBuilder0.registerTypeHierarchyAdapter(class0, defaultTypeAdapters_MapTypeAdapter0);
      assertSame(gsonBuilder0, gsonBuilder1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      GsonBuilder gsonBuilder1 = gsonBuilder0.disableHtmlEscaping();
      assertSame(gsonBuilder1, gsonBuilder0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      DefaultTypeAdapters.MapTypeAdapter defaultTypeAdapters_MapTypeAdapter0 = new DefaultTypeAdapters.MapTypeAdapter();
      GsonBuilder gsonBuilder1 = gsonBuilder0.registerTypeAdapter((Type) null, defaultTypeAdapters_MapTypeAdapter0);
      assertSame(gsonBuilder1, gsonBuilder0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      GsonBuilder gsonBuilder1 = gsonBuilder0.serializeSpecialFloatingPointValues();
      assertSame(gsonBuilder0, gsonBuilder1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      GsonBuilder gsonBuilder1 = gsonBuilder0.setPrettyPrinting();
      assertSame(gsonBuilder0, gsonBuilder1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES;
      GsonBuilder gsonBuilder1 = gsonBuilder0.setFieldNamingPolicy(fieldNamingPolicy0);
      assertSame(gsonBuilder1, gsonBuilder0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      Class<Byte> class0 = Byte.TYPE;
      DefaultTypeAdapters.DoubleSerializer defaultTypeAdapters_DoubleSerializer0 = new DefaultTypeAdapters.DoubleSerializer(false);
      GsonBuilder gsonBuilder1 = gsonBuilder0.registerTypeAdapter(class0, defaultTypeAdapters_DoubleSerializer0);
      assertSame(gsonBuilder0, gsonBuilder1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      GsonBuilder gsonBuilder1 = gsonBuilder0.excludeFieldsWithModifiers((int[]) null);
      assertSame(gsonBuilder0, gsonBuilder1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      DefaultTypeAdapters.DefaultTimestampDeserializer defaultTypeAdapters_DefaultTimestampDeserializer0 = new DefaultTypeAdapters.DefaultTimestampDeserializer();
      GsonBuilder gsonBuilder1 = gsonBuilder0.registerTypeAdapter((Type) null, defaultTypeAdapters_DefaultTimestampDeserializer0);
      assertSame(gsonBuilder0, gsonBuilder1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      GsonBuilder gsonBuilder1 = gsonBuilder0.serializeNulls();
      assertSame(gsonBuilder0, gsonBuilder1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      gsonBuilder0.excludeFieldsWithoutExposeAnnotation();
      Gson gson0 = gsonBuilder0.create();
      assertNotNull(gson0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GsonBuilder gsonBuilder0 = new GsonBuilder();
      Class<DefaultTypeAdapters.DefaultTimeTypeAdapter> class0 = DefaultTypeAdapters.DefaultTimeTypeAdapter.class;
      DefaultTypeAdapters.DefaultTimestampDeserializer defaultTypeAdapters_DefaultTimestampDeserializer0 = new DefaultTypeAdapters.DefaultTimestampDeserializer();
      GsonBuilder gsonBuilder1 = gsonBuilder0.registerTypeHierarchyAdapter(class0, defaultTypeAdapters_DefaultTimestampDeserializer0);
      assertSame(gsonBuilder0, gsonBuilder1);
  }
}
