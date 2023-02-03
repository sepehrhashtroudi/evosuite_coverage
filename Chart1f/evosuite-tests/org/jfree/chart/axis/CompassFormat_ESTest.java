/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 22:48:35 GMT 2022
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CompassFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CompassFormat_ESTest extends CompassFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CompassFormat compassFormat0 = new CompassFormat();
      ParsePosition parsePosition0 = new ParsePosition(0);
      Number number0 = compassFormat0.parse("", parsePosition0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CompassFormat compassFormat0 = new CompassFormat();
      StringBuffer stringBuffer0 = new StringBuffer("T#Tf?'2h% },M");
      FieldPosition fieldPosition0 = new FieldPosition(0);
      compassFormat0.format(1L, stringBuffer0, fieldPosition0);
      assertEquals("T#Tf?'2h% },MN", stringBuffer0.toString());
      assertEquals(14, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CompassFormat compassFormat0 = new CompassFormat();
      StringBuffer stringBuffer0 = new StringBuffer();
      FieldPosition fieldPosition0 = new FieldPosition(10);
      compassFormat0.format(2191.2228425225, stringBuffer0, fieldPosition0);
      assertEquals(3, stringBuffer0.length());
      assertEquals("NNE", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CompassFormat compassFormat0 = new CompassFormat();
      FieldPosition fieldPosition0 = new FieldPosition((Format.Field) null, (-297));
      // Undeclared exception!
      try { 
        compassFormat0.format((-1L), (StringBuffer) null, fieldPosition0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.CompassFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CompassFormat compassFormat0 = new CompassFormat();
      FieldPosition fieldPosition0 = new FieldPosition(14);
      // Undeclared exception!
      try { 
        compassFormat0.format(781.155, (StringBuffer) null, fieldPosition0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.CompassFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CompassFormat compassFormat0 = new CompassFormat();
      String string0 = compassFormat0.getDirectionCode(0.0);
      assertEquals("N", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CompassFormat compassFormat0 = new CompassFormat();
      String string0 = compassFormat0.getDirectionCode((-1.0));
      assertEquals("N", string0);
  }
}