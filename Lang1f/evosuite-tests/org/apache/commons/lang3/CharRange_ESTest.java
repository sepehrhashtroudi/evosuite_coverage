/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 20:01:17 GMT 2022
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.Consumer;
import org.apache.commons.lang3.CharRange;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CharRange_ESTest extends CharRange_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CharRange charRange0 = CharRange.is(')');
      CharRange charRange1 = CharRange.isIn('', ')');
      CharRange charRange2 = CharRange.isNot('');
      CharRange.is(')');
      charRange1.contains(charRange2);
      CharRange charRange3 = CharRange.isIn(':', '3');
      CharRange charRange4 = CharRange.isNotIn(')', '');
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      charRange1.spliterator();
      charRange3.iterator();
      charRange3.forEach(consumer0);
      charRange2.contains(charRange3);
      charRange0.contains(charRange1);
      charRange1.iterator();
      CharRange charRange5 = CharRange.isNot('/');
      CharRange.isNotIn('/', 'C');
      CharRange.isNotIn('4', '4');
      CharRange.isNotIn('3', 'e');
      CharRange.isNotIn('?', 'q');
      CharRange charRange6 = CharRange.isNotIn('C', '/');
      charRange6.contains(charRange4);
      charRange1.contains(charRange2);
      CharRange.isNotIn('/', '/');
      charRange5.getEnd();
      CharRange.isNot(':');
      charRange3.toString();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char char0 = 't';
      char char1 = '\\';
      CharRange charRange0 = CharRange.isIn('t', '\\');
      // Undeclared exception!
      try { 
        charRange0.contains((CharRange) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Range must not be null
         //
         verifyException("org.apache.commons.lang3.CharRange", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char char0 = 'L';
      CharRange charRange0 = CharRange.isIn('L', 'L');
      charRange0.toString();
      CharRange charRange1 = CharRange.is('L');
      charRange0.equals("L");
      charRange1.iterator();
      // Undeclared exception!
      try { 
        charRange1.contains((CharRange) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Range must not be null
         //
         verifyException("org.apache.commons.lang3.CharRange", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharRange charRange0 = CharRange.isIn('9', '9');
      charRange0.getStart();
      charRange0.getEnd();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharRange charRange0 = CharRange.is('\"');
      CharRange charRange1 = CharRange.isNotIn('\"', '\"');
      charRange0.toString();
      charRange0.toString();
      CharRange.isNot('\"');
      charRange0.getEnd();
      charRange1.contains(charRange0);
      CharRange.isNotIn('R', 'R');
      charRange1.isNegated();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharRange charRange0 = CharRange.isNot('-');
      CharRange charRange1 = CharRange.isNot('[');
      CharRange.isIn('[', '-');
      charRange1.contains(charRange0);
      charRange0.getStart();
      charRange0.getStart();
      CharRange.isIn('=', 'Y');
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharRange charRange0 = CharRange.isNot('W');
      CharRange charRange1 = CharRange.isNotIn('W', 'W');
      charRange0.equals(charRange1);
      charRange0.getEnd();
      char char0 = '&';
      CharRange.isNotIn('&', 'v');
      CharRange.is(')');
      charRange1.contains(charRange0);
      charRange1.spliterator();
      Consumer<Character> consumer0 = (Consumer<Character>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      CharRange.isIn('{', '{');
      CharRange.isNot('W');
      // Undeclared exception!
      charRange1.forEach(consumer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharRange charRange0 = CharRange.isIn('/', '/');
      CharRange.isNotIn('/', '/');
      CharRange charRange1 = CharRange.isIn('/', 'B');
      charRange1.spliterator();
      charRange0.getStart();
      charRange0.contains('/');
      CharRange charRange2 = CharRange.is('|');
      charRange0.contains(charRange2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharRange charRange0 = CharRange.is('S');
      charRange0.spliterator();
      CharRange charRange1 = CharRange.is('S');
      charRange0.contains(charRange1);
      CharRange charRange2 = CharRange.isIn('S', '_');
      CharRange charRange3 = CharRange.is('B');
      charRange0.contains(charRange2);
      charRange0.toString();
      charRange2.iterator();
      charRange2.contains('S');
      CharRange.isIn('|', 'B');
      charRange3.contains('-');
      charRange3.getEnd();
      charRange3.getEnd();
      charRange2.getStart();
      charRange3.toString();
      CharRange.isNotIn('&', '>');
      charRange0.isNegated();
      charRange1.getStart();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharRange charRange0 = CharRange.is('[');
      charRange0.toString();
      CharRange charRange1 = CharRange.isNot('[');
      charRange0.contains(charRange1);
      CharRange charRange2 = CharRange.is('[');
      charRange0.contains(charRange2);
      CharRange charRange3 = CharRange.isNotIn('6', 'C');
      charRange2.contains(charRange0);
      charRange0.isNegated();
      CharRange charRange4 = CharRange.isNot('6');
      charRange4.contains(charRange2);
      charRange2.contains('');
      CharRange.isNot('');
      charRange2.equals(charRange3);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CharRange charRange0 = CharRange.isNotIn('9', '9');
      CharRange.isIn('M', 'M');
      CharRange.is('\"');
      CharRange charRange1 = CharRange.isNotIn('2', '2');
      charRange0.contains('9');
      charRange0.contains('9');
      charRange1.toString();
      CharRange.isNotIn('N', '\"');
      CharRange.isNot('9');
      charRange1.contains(charRange0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharRange charRange0 = CharRange.is('m');
      CharRange.isNotIn('m', '2');
      CharRange charRange1 = CharRange.isIn('m', 'h');
      charRange0.getStart();
      charRange0.contains(charRange1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharRange charRange0 = CharRange.is('*');
      CharRange charRange1 = CharRange.is('@');
      charRange0.hashCode();
      charRange0.hashCode();
      charRange0.contains('A');
      charRange0.toString();
      charRange1.iterator();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CharRange charRange0 = CharRange.isNotIn('4', 'z');
      CharRange charRange1 = CharRange.isNotIn('4', '4');
      charRange0.contains(charRange1);
      charRange0.getEnd();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CharRange charRange0 = CharRange.is('Z');
      charRange0.iterator();
      CharRange charRange1 = CharRange.isIn('Z', 'Z');
      charRange0.toString();
      CharRange.is('s');
      charRange1.spliterator();
      charRange0.iterator();
      CharRange.isNotIn('Z', '>');
      CharRange charRange2 = CharRange.isNotIn('g', 'g');
      charRange2.toString();
      charRange0.equals(charRange1);
      Consumer<Character> consumer0 = (Consumer<Character>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      Consumer<Character> consumer1 = (Consumer<Character>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      charRange0.forEach(consumer1);
      CharRange.isIn('v', 'v');
      // Undeclared exception!
      charRange2.forEach(consumer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CharRange charRange0 = CharRange.is('#');
      CharRange charRange1 = CharRange.isNotIn('8', 'T');
      charRange0.contains(charRange1);
      CharRange charRange2 = CharRange.is('y');
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      charRange2.forEach(consumer0);
      charRange0.isNegated();
      charRange0.getEnd();
      charRange0.equals(charRange2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CharRange charRange0 = CharRange.isNotIn('\'', 'P');
      CharRange charRange1 = CharRange.isNot('\'');
      charRange0.getStart();
      CharRange charRange2 = CharRange.is('P');
      charRange2.spliterator();
      charRange0.getStart();
      charRange0.toString();
      CharRange.is('\'');
      CharRange charRange3 = CharRange.isIn('\'', '\'');
      charRange1.equals(charRange3);
      CharRange charRange4 = CharRange.isNot('t');
      Object object0 = new Object();
      charRange4.equals(object0);
      charRange0.equals("^'-P");
      charRange1.equals(charRange3);
      CharRange charRange5 = CharRange.isNotIn('\'', 'Z');
      charRange5.iterator();
      charRange5.equals(charRange4);
      CharRange.is('Z');
      CharRange charRange6 = CharRange.isIn('P', 'P');
      charRange6.spliterator();
      CharRange charRange7 = CharRange.isNotIn('\'', '\'');
      CharRange.is('N');
      CharRange.isNotIn('t', '-');
      charRange4.iterator();
      charRange4.hashCode();
      charRange1.contains('\'');
      CharRange.is('Z');
      charRange7.iterator();
      charRange1.contains('<');
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char char0 = '+';
      CharRange charRange0 = CharRange.is('+');
      charRange0.spliterator();
      CharRange charRange1 = CharRange.isNot('Y');
      char char1 = 'a';
      CharRange.isNot('a');
      CharRange charRange2 = CharRange.isIn('+', '%');
      charRange1.contains(charRange2);
      charRange0.toString();
      // Undeclared exception!
      try { 
        charRange1.forEach((Consumer<? super Character>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CharRange charRange0 = CharRange.isIn('F', 'F');
      CharRange charRange1 = CharRange.isIn('F', '~');
      CharRange charRange2 = CharRange.is('X');
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      charRange2.forEach(consumer0);
      charRange2.spliterator();
      charRange1.iterator();
      CharRange.isIn('w', 'F');
      CharRange.isIn('R', '2');
      charRange0.contains(charRange1);
      charRange0.getStart();
      CharRange.isNot('w');
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CharRange charRange0 = CharRange.isIn('i', 'R');
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      charRange0.toString();
      charRange0.forEach(consumer0);
      CharRange charRange1 = CharRange.isNotIn('i', 'R');
      charRange1.contains(charRange0);
      charRange1.contains(charRange0);
      charRange1.iterator();
      CharRange charRange2 = CharRange.isIn('0', '0');
      charRange0.contains(charRange1);
      CharRange charRange3 = CharRange.isNot(';');
      charRange0.contains(charRange3);
      charRange0.getEnd();
      CharRange.isNot('0');
      CharRange.isNotIn('5', 'j');
      charRange0.isNegated();
      charRange2.iterator();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char char0 = '(';
      CharRange charRange0 = CharRange.isNot('(');
      charRange0.toString();
      charRange0.getEnd();
      charRange0.spliterator();
      charRange0.isNegated();
      charRange0.toString();
      CharRange charRange1 = CharRange.is('(');
      charRange1.contains(charRange0);
      charRange0.isNegated();
      charRange0.toString();
      CharRange.is('(');
      Consumer<Character> consumer0 = (Consumer<Character>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      charRange0.forEach(consumer0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CharRange charRange0 = CharRange.is('>');
      char char0 = charRange0.getEnd();
      assertEquals('>', char0);
      assertEquals('>', charRange0.getStart());
      assertFalse(charRange0.isNegated());
  }
}
