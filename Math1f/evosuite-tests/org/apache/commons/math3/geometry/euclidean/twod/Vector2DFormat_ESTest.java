/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 06:24:51 GMT 2022
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2DFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Vector2DFormat_ESTest extends Vector2DFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector2DFormat vector2DFormat0 = new Vector2DFormat();
      ParsePosition parsePosition0 = new ParsePosition(0);
      vector2DFormat0.parse("{(NaN); (NaN)}", parsePosition0);
      assertEquals(14, parsePosition0.getIndex());
      assertEquals(8, parsePosition0.getErrorIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector2DFormat vector2DFormat0 = new Vector2DFormat();
      ParsePosition parsePosition0 = new ParsePosition(0);
      vector2DFormat0.parse("{0; 0}", parsePosition0);
      assertEquals("java.text.ParsePosition[index=6,errorIndex=-1]", parsePosition0.toString());
      assertEquals(6, parsePosition0.getIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance();
      Vector2DFormat vector2DFormat0 = new Vector2DFormat("/6ngnY+", "}C:Pu~S Q_;", "1,Z0j-]U?9A@8", numberFormat0);
      Vector2D vector2D0 = vector2DFormat0.parse("");
      assertNull(vector2D0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector2DFormat vector2DFormat0 = Vector2DFormat.getInstance();
      Vector2D vector2D0 = vector2DFormat0.parse("{(NaN); (NaN)}");
      assertEquals(Double.NaN, vector2D0.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector2DFormat vector2DFormat0 = Vector2DFormat.getInstance();
      Vector2D vector2D0 = vector2DFormat0.parse("{(-Infinity); (-Infinity)}");
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector2DFormat vector2DFormat0 = Vector2DFormat.getInstance();
      Vector2D vector2D0 = vector2DFormat0.parse("{0; 0}");
      assertEquals(0.0, vector2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector2DFormat vector2DFormat0 = Vector2DFormat.getInstance();
      ParsePosition parsePosition0 = new ParsePosition(0);
      // Undeclared exception!
      try { 
        vector2DFormat0.parse("", parsePosition0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector2DFormat vector2DFormat0 = new Vector2DFormat();
      ParsePosition parsePosition0 = new ParsePosition(997);
      // Undeclared exception!
      try { 
        vector2DFormat0.parse((String) null, parsePosition0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.CompositeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector2DFormat vector2DFormat0 = Vector2DFormat.getInstance();
      // Undeclared exception!
      try { 
        vector2DFormat0.parse("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      Vector2DFormat vector2DFormat0 = new Vector2DFormat(numberFormat0);
      // Undeclared exception!
      try { 
        vector2DFormat0.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.CompositeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Vector2DFormat.getInstance((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector2DFormat vector2DFormat0 = new Vector2DFormat();
      StringBuffer stringBuffer0 = new StringBuffer();
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 0);
      // Undeclared exception!
      try { 
        vector2DFormat0.format((Vector<Euclidean2D>) null, stringBuffer0, fieldPosition0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.Vector2DFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance(locale0);
      Vector2DFormat vector2DFormat0 = null;
      try {
        vector2DFormat0 = new Vector2DFormat("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", ")B`^q$*Msnt3", (String) null, numberFormat0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.VectorFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector2DFormat vector2DFormat0 = null;
      try {
        vector2DFormat0 = new Vector2DFormat((String) null, "org.apache.commons.math3.exception.MathArithmeticException", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.VectorFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector2DFormat vector2DFormat0 = new Vector2DFormat("", "", "");
      ParsePosition parsePosition0 = new ParsePosition(14);
      vector2DFormat0.parse("L ':4<(e#nrQ_4", parsePosition0);
      assertEquals("java.text.ParsePosition[index=13,errorIndex=-1]", parsePosition0.toString());
      assertEquals((-1), parsePosition0.getErrorIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      Vector2DFormat vector2DFormat0 = new Vector2DFormat(numberFormat0);
      ParsePosition parsePosition0 = new ParsePosition(4178);
      Vector2D vector2D0 = vector2DFormat0.parse("", parsePosition0);
      assertNull(vector2D0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      Vector2DFormat vector2DFormat0 = Vector2DFormat.getInstance(locale0);
      assertEquals("; ", vector2DFormat0.getSeparator());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector2DFormat vector2DFormat0 = Vector2DFormat.getInstance();
      try { 
        vector2DFormat0.parse("}");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: string \"}\" unparseable (from position 0) as an object of type org.apache.commons.math3.geometry.euclidean.twod.Vector2D
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.Vector2DFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector2DFormat vector2DFormat0 = new Vector2DFormat();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "; ");
      FieldPosition fieldPosition0 = new FieldPosition((-4739));
      vector2DFormat0.format((Vector<Euclidean2D>) vector2D0, stringBuffer0, fieldPosition0);
      assertEquals(26, stringBuffer0.length());
      assertEquals("; {(Infinity); (Infinity)}", stringBuffer0.toString());
  }
}
