/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 06:07:56 GMT 2022
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Vector3DFormat_ESTest extends Vector3DFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3DFormat vector3DFormat0 = Vector3DFormat.getInstance();
      ParsePosition parsePosition0 = new ParsePosition(0);
      vector3DFormat0.parse("{(NaN); (NaN); (NaN)}", parsePosition0);
      assertEquals(15, parsePosition0.getErrorIndex());
      assertEquals(21, parsePosition0.getIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3DFormat vector3DFormat0 = new Vector3DFormat("2|o B7cA", "2|o B7cA", "2|o B7cA");
      Vector3D vector3D0 = vector3DFormat0.parse("");
      assertNull(vector3D0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3DFormat vector3DFormat0 = Vector3DFormat.getInstance();
      Vector3D vector3D0 = vector3DFormat0.parse("{(-Infinity); (-Infinity); (-Infinity)}");
      assertEquals(Double.POSITIVE_INFINITY, vector3D0.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3DFormat vector3DFormat0 = Vector3DFormat.getInstance();
      Vector3D vector3D0 = vector3DFormat0.parse("{(NaN); (NaN); (NaN)}");
      assertEquals(Double.NaN, vector3D0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3DFormat vector3DFormat0 = Vector3DFormat.getInstance();
      Vector3D vector3D0 = vector3DFormat0.parse("{-1; 0; 0}");
      assertEquals(1.0, vector3D0.getNormSq(), 0.01);
      assertNotNull(vector3D0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3DFormat vector3DFormat0 = Vector3DFormat.getInstance();
      Vector3D vector3D0 = vector3DFormat0.parse("{0; 0; 0}");
      assertEquals(0.0, vector3D0.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      Vector3DFormat vector3DFormat0 = Vector3DFormat.getInstance(locale0);
      Vector3D vector3D0 = Vector3D.PLUS_K;
      StringBuffer stringBuffer0 = new StringBuffer(1524);
      FieldPosition fieldPosition0 = new FieldPosition(1524);
      vector3DFormat0.format((Vector<Euclidean3D>) vector3D0, stringBuffer0, fieldPosition0);
      assertEquals(9, stringBuffer0.length());
      assertEquals("{0; 0; 1}", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Vector3DFormat vector3DFormat0 = Vector3DFormat.getInstance(locale0);
      // Undeclared exception!
      try { 
        vector3DFormat0.parse("org.apache.commons.math3.exception.MathIllegalNumberException", (ParsePosition) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.VectorFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance();
      Vector3DFormat vector3DFormat0 = new Vector3DFormat("", "", "", numberFormat0);
      // Undeclared exception!
      try { 
        vector3DFormat0.parse("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Vector3DFormat.getInstance((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      Vector3DFormat vector3DFormat0 = null;
      try {
        vector3DFormat0 = new Vector3DFormat("", "VT4hoAKa@pPR/}-uz='", (String) null, numberFormat0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.VectorFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3DFormat vector3DFormat0 = null;
      try {
        vector3DFormat0 = new Vector3DFormat((String) null, (String) null, "m?");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.VectorFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3DFormat vector3DFormat0 = Vector3DFormat.getInstance();
      ParsePosition parsePosition0 = new ParsePosition(0);
      vector3DFormat0.parse("{0; 0; 1}", parsePosition0);
      assertEquals(9, parsePosition0.getIndex());
      assertEquals("java.text.ParsePosition[index=9,errorIndex=-1]", parsePosition0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3DFormat vector3DFormat0 = new Vector3DFormat();
      ParsePosition parsePosition0 = new ParsePosition(7785);
      Vector3D vector3D0 = vector3DFormat0.parse("", parsePosition0);
      assertNull(vector3D0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3DFormat vector3DFormat0 = new Vector3DFormat();
      Vector3D vector3D0 = Vector3D.PLUS_K;
      StringBuffer stringBuffer0 = new StringBuffer("; ");
      // Undeclared exception!
      try { 
        vector3DFormat0.format((Vector<Euclidean3D>) vector3D0, stringBuffer0, (FieldPosition) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.VectorFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      Vector3DFormat vector3DFormat0 = Vector3DFormat.getInstance(locale0);
      // Undeclared exception!
      try { 
        vector3DFormat0.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.CompositeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3DFormat vector3DFormat0 = Vector3DFormat.getInstance();
      try { 
        vector3DFormat0.parse("!2LKK~'d&E(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: string \"!2LKK~'d&E(\" unparseable (from position 0) as an object of type org.apache.commons.math3.geometry.euclidean.threed.Vector3D
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3DFormat vector3DFormat0 = new Vector3DFormat("NrI9m&VW{= {", "NrI9m&VW{= {", "(`b");
      ParsePosition parsePosition0 = new ParsePosition(3);
      parsePosition0.setIndex((-1049));
      // Undeclared exception!
      try { 
        vector3DFormat0.parse("(`b", parsePosition0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("UQkM:");
      Vector3DFormat vector3DFormat0 = new Vector3DFormat(choiceFormat0);
      Vector3D vector3D0 = Vector3D.ZERO;
      StringBuffer stringBuffer0 = new StringBuffer("}");
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 332);
      // Undeclared exception!
      try { 
        vector3DFormat0.format((Vector<Euclidean3D>) vector3D0, stringBuffer0, fieldPosition0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("java.text.ChoiceFormat", e);
      }
  }
}