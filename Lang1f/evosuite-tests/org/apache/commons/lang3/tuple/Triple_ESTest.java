/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 20:58:24 GMT 2022
 */

package org.apache.commons.lang3.tuple;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.IllegalFormatConversionException;
import java.util.UnknownFormatConversionException;
import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.apache.commons.lang3.tuple.MutableTriple;
import org.apache.commons.lang3.tuple.Triple;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Triple_ESTest extends Triple_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutableTriple<ImmutableTriple<String, Object, Integer>, Object, MutableTriple<Object, String, String>> mutableTriple0 = new MutableTriple<ImmutableTriple<String, Object, Integer>, Object, MutableTriple<Object, String, String>>();
      String string0 = "5=%G{";
      MutableTriple.of("5=%G{", (Integer) null, "5=%G{");
      int int0 = 0;
      Integer integer0 = new Integer(0);
      ImmutableTriple<String, Object, Integer> immutableTriple0 = new ImmutableTriple<String, Object, Integer>("5=%G{", (Object) null, integer0);
      ImmutableTriple<Integer, String, String> immutableTriple1 = new ImmutableTriple<Integer, String, String>((Integer) null, "", "");
      immutableTriple1.getRight();
      immutableTriple0.equals("");
      immutableTriple0.getLeft();
      mutableTriple0.setLeft(immutableTriple0);
      String string1 = "org.apache.commons.lang3.tuple.Triple";
      Integer integer1 = new Integer(0);
      MutableTriple<String, Integer, Integer> mutableTriple1 = new MutableTriple<String, Integer, Integer>("org.apache.commons.lang3.tuple.Triple", (Integer) null, integer1);
      mutableTriple1.setMiddle((Integer) null);
      Integer integer2 = new Integer(0);
      ImmutableTriple<Integer, Object, String> immutableTriple2 = ImmutableTriple.of(integer1, (Object) integer2, (String) null);
      Triple.of(immutableTriple2, "org.apache.commons.lang3.tuple.Triple", "clone");
      // Undeclared exception!
      try { 
        immutableTriple0.toString("5=%G{");
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // g != java.lang.String
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(41);
      Integer integer1 = new Integer(41);
      MutableTriple<Object, Integer, Object> mutableTriple0 = MutableTriple.of((Object) integer0, integer1, (Object) integer1);
      ImmutableTriple<Integer, Integer, Triple<Object, Integer, Object>> immutableTriple0 = new ImmutableTriple<Integer, Integer, Triple<Object, Integer, Object>>(integer0, integer0, mutableTriple0);
      immutableTriple0.toString("5euVe");
      MutableTriple<Object, String, Object> mutableTriple1 = new MutableTriple<Object, String, Object>();
      ImmutableTriple<Integer, Integer, Object> immutableTriple1 = new ImmutableTriple<Integer, Integer, Object>(integer1, integer0, "[j#,P)VWOcuw>o$%.fi");
      Integer integer2 = new Integer((-384));
      Integer integer3 = new Integer(0);
      ImmutableTriple<Integer, Integer, Object> immutableTriple2 = ImmutableTriple.of(integer0, integer2, (Object) integer3);
      immutableTriple1.compareTo((Triple<Integer, Integer, Object>) immutableTriple2);
      Triple<Triple<Object, String, Object>, Triple<Integer, Integer, Object>, String> triple0 = Triple.of((Triple<Object, String, Object>) mutableTriple1, (Triple<Integer, Integer, Object>) immutableTriple1, "qD.'liOVfNg@g@");
      triple0.toString();
      Object object0 = new Object();
      Integer integer4 = new Integer(1);
      Integer integer5 = new Integer(1);
      MutableTriple<Object, Object, Integer> mutableTriple2 = new MutableTriple<Object, Object, Integer>(object0, integer4, integer5);
      Integer integer6 = (Integer)mutableTriple2.middle;
      Integer integer7 = new Integer(2522);
      MutableTriple<Object, Object, String> mutableTriple3 = MutableTriple.of((Object) integer6, (Object) integer7, "((null,null,null),(41,41,[j#,P)VWOcuw>o$%.fi),qD.'liOVfNg@g@)");
      Integer integer8 = (Integer)mutableTriple3.left;
      ImmutableTriple<MutableTriple<Object, Object, String>, Object, String> immutableTriple3 = new ImmutableTriple<MutableTriple<Object, Object, String>, Object, String>(mutableTriple3, integer8, "5euVe");
      // Undeclared exception!
      try { 
        immutableTriple3.toString("((null,null,null),(41,41,[j#,P)VWOcuw>o$%.fi),qD.'liOVfNg@g@)");
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = '.'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = null;
      MutableTriple<Object, String, String> mutableTriple0 = new MutableTriple<Object, String, String>((Object) null, (String) null, (String) null);
      mutableTriple0.setLeft((Object) null);
      // Undeclared exception!
      try { 
        mutableTriple0.toString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer((-197));
      ImmutableTriple<Integer, Integer, String> immutableTriple0 = new ImmutableTriple<Integer, Integer, String>(integer0, integer0, "fs^f");
      MutableTriple<String, String, Object> mutableTriple0 = new MutableTriple<String, String, Object>();
      ImmutableTriple.of((Triple<Integer, Integer, String>) immutableTriple0, mutableTriple0, integer0);
      MutableTriple<String, Object, Object> mutableTriple1 = new MutableTriple<String, Object, Object>();
      mutableTriple1.getMiddle();
      MutableTriple<Integer, Object, MutableTriple<String, Object, Object>> mutableTriple2 = new MutableTriple<Integer, Object, MutableTriple<String, Object, Object>>(integer0, "fs^f", mutableTriple1);
      Integer integer1 = new Integer((-197));
      MutableTriple<Integer, Object, MutableTriple<String, Object, Object>> mutableTriple3 = MutableTriple.of(integer1, (Object) null, mutableTriple1);
      mutableTriple1.setMiddle(immutableTriple0);
      int int0 = mutableTriple2.compareTo((Triple<Integer, Object, MutableTriple<String, Object, Object>>) mutableTriple3);
      assertEquals(1, int0);
      
      mutableTriple2.getMiddle();
      MutableTriple<Object, Integer, Object> mutableTriple4 = new MutableTriple<Object, Integer, Object>();
      MutableTriple.of("v-^^S-Pbt", (Object) null, mutableTriple4);
      boolean boolean0 = mutableTriple4.equals(mutableTriple1);
      assertFalse(boolean0);
      
      ImmutableTriple<Object, String, String> immutableTriple1 = ImmutableTriple.of((Object) null, (String) null, "~'$\"*.T_");
      immutableTriple1.hashCode();
      MutableTriple<Integer, Object, String> mutableTriple5 = new MutableTriple<Integer, Object, String>();
      String string0 = mutableTriple5.right;
      MutableTriple<Integer, Object, String> mutableTriple6 = new MutableTriple<Integer, Object, String>(integer0, (Object) null, "");
      Triple<Object, String, MutableTriple<Integer, Object, String>> triple0 = Triple.of((Object) "fs^f", (String) null, mutableTriple6);
      Triple.of((Object) null, triple0, (Object) "v-^^S-Pbt");
      assertFalse(mutableTriple6.equals((Object)mutableTriple5));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(1);
      MutableTriple<String, Integer, String> mutableTriple0 = MutableTriple.of("I+o54vgPIHY45", integer0, "I+o54vgPIHY45");
      Integer integer1 = new Integer(1);
      ImmutableTriple<String, Integer, String> immutableTriple0 = ImmutableTriple.of("I+o54vgPIHY45", integer1, "I+o54vgPIHY45");
      String string0 = immutableTriple0.toString();
      assertEquals("(I+o54vgPIHY45,1,I+o54vgPIHY45)", string0);
      
      int int0 = mutableTriple0.compareTo((Triple<String, Integer, String>) immutableTriple0);
      MutableTriple<Integer, String, MutableTriple<String, Integer, String>> mutableTriple1 = new MutableTriple<Integer, String, MutableTriple<String, Integer, String>>(integer0, "I+o54vgPIHY45", mutableTriple0);
      mutableTriple1.getMiddle();
      ImmutableTriple<Integer, Integer, String> immutableTriple1 = ImmutableTriple.of(integer0, integer0, "I+o54vgPIHY45");
      int int1 = immutableTriple1.hashCode();
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableTriple<String, MutableTriple<Object, Object, String>, Object> mutableTriple0 = new MutableTriple<String, MutableTriple<Object, Object, String>, Object>();
      mutableTriple0.hashCode();
      Triple.of(mutableTriple0, (Object) "org.apache.commons.lang3.tuple.ImmutableTriple", (Triple<String, MutableTriple<Object, Object, String>, Object>) mutableTriple0);
      mutableTriple0.getRight();
      ImmutableTriple<Object, Object, Object> immutableTriple0 = ImmutableTriple.of((Object) "org.apache.commons.lang3.tuple.ImmutableTriple", (Object) mutableTriple0, (Object) mutableTriple0);
      MutableTriple<Integer, Object, Integer> mutableTriple1 = new MutableTriple<Integer, Object, Integer>();
      ImmutableTriple<ImmutableTriple<Object, Object, Object>, Object, MutableTriple<Integer, Object, Integer>> immutableTriple1 = new ImmutableTriple<ImmutableTriple<Object, Object, Object>, Object, MutableTriple<Integer, Object, Integer>>(immutableTriple0, immutableTriple0, mutableTriple1);
      Object object0 = immutableTriple1.getMiddle();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "CPjKld4v=WBj!7";
      Integer integer0 = new Integer(68);
      Triple<String, Object, Integer> triple0 = Triple.of("CPjKld4v=WBj!7", (Object) "CPjKld4v=WBj!7", integer0);
      MutableTriple<Object, String, Integer> mutableTriple0 = new MutableTriple<Object, String, Integer>();
      Integer integer1 = new Integer(0);
      MutableTriple<String, Integer, Integer> mutableTriple1 = MutableTriple.of("CPjKld4v=WBj!7", integer1, integer0);
      ImmutableTriple<Object, Object, MutableTriple<String, Integer, Integer>> immutableTriple0 = new ImmutableTriple<Object, Object, MutableTriple<String, Integer, Integer>>(mutableTriple0, triple0, mutableTriple1);
      Object object0 = immutableTriple0.getLeft();
      MutableTriple<Object, Object, Integer> mutableTriple2 = new MutableTriple<Object, Object, Integer>(object0, immutableTriple0, integer1);
      ImmutableTriple<Triple<String, Object, Integer>, MutableTriple<Object, String, Integer>, MutableTriple<Object, Object, Integer>> immutableTriple1 = ImmutableTriple.of(triple0, mutableTriple0, mutableTriple2);
      immutableTriple1.getMiddle();
      Integer integer2 = new Integer(0);
      Integer integer3 = new Integer(0);
      ImmutableTriple.of((Object) integer2, (Object) mutableTriple0, integer3);
      Integer integer4 = new Integer(68);
      int int0 = 2040;
      Integer integer5 = new Integer(2040);
      Integer integer6 = new Integer(68);
      ImmutableTriple<Integer, Object, Object> immutableTriple2 = new ImmutableTriple<Integer, Object, Object>(integer4, integer5, integer6);
      Integer integer7 = (Integer)immutableTriple2.middle;
      MutableTriple<Object, String, String> mutableTriple3 = MutableTriple.of((Object) integer7, "CPjKld4v=WBj!7", "CPjKld4v=WBj!7");
      mutableTriple3.setLeft(integer4);
      String string1 = "org.apache.commons.lang3.tuple.Triple";
      Integer integer8 = new Integer(0);
      ImmutableTriple<String, Object, String> immutableTriple3 = new ImmutableTriple<String, Object, String>("org.apache.commons.lang3.tuple.Triple", integer8, "CPjKld4v=WBj!7");
      MutableTriple<Object, ImmutableTriple<String, Object, String>, Triple<Object, String, String>> mutableTriple4 = MutableTriple.of((Object) integer7, immutableTriple3, (Triple<Object, String, String>) mutableTriple3);
      // Undeclared exception!
      try { 
        mutableTriple4.compareTo((Triple<Object, ImmutableTriple<String, Object, String>, Triple<Object, String, String>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.tuple.Triple", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = ":s~@:P\\}#O3qb";
      MutableTriple<String, Object, Object> mutableTriple0 = MutableTriple.of(":s~@:P}#O3qb", (Object) null, (Object) ":s~@:P}#O3qb");
      mutableTriple0.getMiddle();
      mutableTriple0.getRight();
      Triple<String, Triple<String, Object, Object>, String> triple0 = Triple.of("ZJF}A<9", (Triple<String, Object, Object>) mutableTriple0, (String) null);
      triple0.getRight();
      Integer integer0 = new Integer(0);
      MutableTriple<Object, String, Object> mutableTriple1 = MutableTriple.of((Object) integer0, (String) null, (Object) integer0);
      Integer integer1 = new Integer((-727));
      Triple<Object, String, Object> triple1 = Triple.of((Object) mutableTriple1, "+hQBC'ePjj", (Object) integer1);
      // Undeclared exception!
      try { 
        mutableTriple1.compareTo(triple1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.lang3.tuple.MutableTriple cannot be cast to java.lang.Integer
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutableTriple<Object, String, Triple<Object, Integer, String>> mutableTriple0 = new MutableTriple<Object, String, Triple<Object, Integer, String>>();
      Integer integer0 = new Integer((-3329));
      ImmutableTriple<Object, Integer, String> immutableTriple0 = ImmutableTriple.of((Object) mutableTriple0, integer0, "8W|,t");
      MutableTriple<Object, String, Triple<Object, Integer, String>> mutableTriple1 = new MutableTriple<Object, String, Triple<Object, Integer, String>>(mutableTriple0, "", immutableTriple0);
      mutableTriple0.compareTo((Triple<Object, String, Triple<Object, Integer, String>>) mutableTriple1);
      Integer integer1 = new Integer((-3329));
      ImmutableTriple<Object, Object, Object> immutableTriple1 = ImmutableTriple.of((Object) "8W|,t", (Object) "", (Object) "");
      MutableTriple<Integer, Triple<Object, Object, Object>, Integer> mutableTriple2 = MutableTriple.of(integer1, (Triple<Object, Object, Object>) immutableTriple1, integer1);
      mutableTriple2.setMiddle(immutableTriple1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableTriple<ImmutableTriple<Integer, String, Integer>, Integer, ImmutableTriple<Object, String, Integer>> mutableTriple0 = new MutableTriple<ImmutableTriple<Integer, String, Integer>, Integer, ImmutableTriple<Object, String, Integer>>();
      Integer integer0 = new Integer(1079);
      Integer integer1 = new Integer(0);
      ImmutableTriple<Integer, String, Integer> immutableTriple0 = ImmutableTriple.of(integer0, "", integer1);
      immutableTriple0.hashCode();
      mutableTriple0.setLeft(immutableTriple0);
      Integer integer2 = new Integer((-1));
      MutableTriple<Object, Integer, Object> mutableTriple1 = new MutableTriple<Object, Integer, Object>(immutableTriple0, integer2, integer0);
      Integer integer3 = new Integer((-1));
      Integer integer4 = new Integer(0);
      Triple<Integer, Object, Integer> triple0 = Triple.of(integer3, (Object) immutableTriple0, integer4);
      Object object0 = triple0.getRight();
      MutableTriple<Integer, Triple<Object, Integer, Object>, Object> mutableTriple2 = MutableTriple.of(integer0, (Triple<Object, Integer, Object>) mutableTriple1, (Object) object0);
      Object object1 = mutableTriple2.getRight();
      assertEquals(0, object1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(0);
      ImmutableTriple<String, Integer, Integer> immutableTriple0 = ImmutableTriple.of("'LgA.FdoOn[#sv", integer0, integer1);
      Integer integer2 = immutableTriple0.getMiddle();
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MutableTriple<Object, String, Object> mutableTriple0 = new MutableTriple<Object, String, Object>();
      mutableTriple0.getMiddle();
      ImmutableTriple<Integer, String, MutableTriple<Object, String, Object>> immutableTriple0 = new ImmutableTriple<Integer, String, MutableTriple<Object, String, Object>>(integer0, "org.apache.commons.lang3.tuple.MutableTriple", mutableTriple0);
      immutableTriple0.getRight();
      MutableTriple<Object, Integer, MutableTriple<Object, String, Object>> mutableTriple1 = new MutableTriple<Object, Integer, MutableTriple<Object, String, Object>>();
      mutableTriple1.getMiddle();
      Integer integer1 = new Integer((-2643));
      Integer integer2 = new Integer(1);
      ImmutableTriple<Integer, Integer, Integer> immutableTriple1 = new ImmutableTriple<Integer, Integer, Integer>(integer1, (Integer) null, integer2);
      Integer integer3 = immutableTriple1.getMiddle();
      assertNull(integer3);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(1659);
      Integer integer1 = new Integer(1659);
      ImmutableTriple<Integer, String, Integer> immutableTriple0 = new ImmutableTriple<Integer, String, Integer>(integer0, "", integer1);
      immutableTriple0.getRight();
      Integer integer2 = new Integer(1659);
      MutableTriple<Integer, Object, Integer> mutableTriple0 = new MutableTriple<Integer, Object, Integer>(integer2, integer2, integer0);
      ImmutableTriple<Object, String, Object> immutableTriple1 = new ImmutableTriple<Object, String, Object>(mutableTriple0, "", mutableTriple0);
      ImmutableTriple<MutableTriple<Integer, Object, Integer>, Triple<Object, String, Object>, Object> immutableTriple2 = ImmutableTriple.of(mutableTriple0, (Triple<Object, String, Object>) immutableTriple1, (Object) integer1);
      immutableTriple2.hashCode();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutableTriple<Integer, Triple<String, Object, Object>, Object> mutableTriple0 = new MutableTriple<Integer, Triple<String, Object, Object>, Object>();
      Integer integer0 = new Integer((-2119));
      Integer integer1 = new Integer(298);
      MutableTriple<Integer, String, Object> mutableTriple1 = MutableTriple.of(integer0, ">|`2$*YR", (Object) integer1);
      Integer integer2 = mutableTriple1.left;
      boolean boolean0 = mutableTriple0.equals(integer2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutableTriple<Integer, Integer, Triple<Object, Object, Object>> mutableTriple0 = new MutableTriple<Integer, Integer, Triple<Object, Object, Object>>();
      mutableTriple0.getRight();
      MutableTriple<Object, Object, Object> mutableTriple1 = new MutableTriple<Object, Object, Object>();
      mutableTriple1.getLeft();
      mutableTriple0.setRight(mutableTriple1);
      Integer integer0 = new Integer(2);
      MutableTriple<String, Integer, Object> mutableTriple2 = MutableTriple.of("LR", integer0, (Object) null);
      MutableTriple<String, Integer, Object> mutableTriple3 = new MutableTriple<String, Integer, Object>();
      int int0 = mutableTriple2.compareTo((Triple<String, Integer, Object>) mutableTriple3);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer((-627));
      MutableTriple<String, Object, Object> mutableTriple0 = MutableTriple.of("org.apache.commons.lang3.tuple.Triple", (Object) "org.apache.commons.lang3.tuple.Triple", (Object) integer0);
      String string0 = "";
      Triple<String, Object, Object> triple0 = Triple.of("org.apache.commons.lang3.tuple.Triple", (Object) integer0, (Object) "");
      // Undeclared exception!
      try { 
        mutableTriple0.compareTo(triple0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ImmutableTriple<MutableTriple<Object, String, String>, Object, Object> immutableTriple0 = new ImmutableTriple<MutableTriple<Object, String, String>, Object, Object>((MutableTriple<Object, String, String>) null, (Object) null, (Object) null);
      immutableTriple0.getLeft();
      // Undeclared exception!
      try { 
        immutableTriple0.compareTo((Triple<MutableTriple<Object, String, String>, Object, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.tuple.Triple", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MutableTriple<Object, Object, Object> mutableTriple0 = new MutableTriple<Object, Object, Object>();
      MutableTriple<Integer, Object, MutableTriple<Object, Object, Object>> mutableTriple1 = MutableTriple.of(integer0, (Object) null, mutableTriple0);
      mutableTriple1.hashCode();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Integer integer0 = new Integer(327);
      ImmutableTriple<Integer, String, String> immutableTriple0 = ImmutableTriple.of(integer0, "", "");
      immutableTriple0.toString("");
      immutableTriple0.getMiddle();
      ImmutableTriple<String, Integer, String> immutableTriple1 = new ImmutableTriple<String, Integer, String>("", integer0, "");
      Integer integer1 = immutableTriple1.getMiddle();
      assertEquals(327, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Triple<String, Object, MutableTriple<Integer, Integer, Integer>> triple0 = Triple.of("LIKk.kr@L2-Bs%p[/", (Object) "LIKk.kr@L2-Bs%p[/", (MutableTriple<Integer, Integer, Integer>) null);
      triple0.toString();
      Integer integer0 = new Integer((-1828));
      MutableTriple<Integer, String, Integer> mutableTriple0 = new MutableTriple<Integer, String, Integer>(integer0, "_Isn.$+POe.W]|[z", integer0);
      mutableTriple0.toString("GIzE[8C-");
      MutableTriple<String, Integer, MutableTriple<Integer, String, Integer>> mutableTriple1 = MutableTriple.of("GIzE[8C-", integer0, mutableTriple0);
      mutableTriple1.setLeft("`zq1GS/b`},");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer(0);
      ImmutableTriple<String, Integer, String> immutableTriple0 = ImmutableTriple.of("", integer0, "");
      String string0 = immutableTriple0.getLeft();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Triple<Integer, Object, String> triple0 = Triple.of(integer0, (Object) integer0, "");
      Integer integer1 = triple0.getLeft();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MutableTriple<Object, String, String> mutableTriple0 = new MutableTriple<Object, String, String>(integer0, "org.apache.commons.lang3.tuple.Triple", "org.apache.commons.lang3.tuple.Triple");
      ImmutableTriple<Integer, Triple<Object, String, String>, String> immutableTriple0 = ImmutableTriple.of(integer0, (Triple<Object, String, String>) mutableTriple0, "na5");
      immutableTriple0.toString();
      ImmutableTriple<Integer, Triple<Object, String, String>, String> immutableTriple1 = new ImmutableTriple<Integer, Triple<Object, String, String>, String>(integer0, mutableTriple0, "K'Kj(gl{5FI*&!ENJJ");
      immutableTriple0.compareTo((Triple<Integer, Triple<Object, String, String>, String>) immutableTriple1);
      Integer integer1 = new Integer(0);
      mutableTriple0.setLeft(integer1);
      immutableTriple0.toString();
      Triple<Object, String, String> triple0 = immutableTriple0.getMiddle();
      triple0.equals(immutableTriple0);
      triple0.compareTo((Triple<Object, String, String>) mutableTriple0);
      ImmutableTriple<String, ImmutableTriple<String, Integer, String>, Integer> immutableTriple2 = ImmutableTriple.of("#;F3-?#tr.#RWOE2^<", (ImmutableTriple<String, Integer, String>) null, integer1);
      immutableTriple2.toString();
      immutableTriple2.toString("#;F3-?#tr.#RWOE2^<");
      immutableTriple2.getLeft();
      MutableTriple<MutableTriple<Object, Object, Object>, String, Object> mutableTriple1 = new MutableTriple<MutableTriple<Object, Object, Object>, String, Object>();
      MutableTriple<Object, Object, Object> mutableTriple2 = new MutableTriple<Object, Object, Object>();
      Object object0 = new Object();
      ImmutableTriple<String, Object, String> immutableTriple3 = new ImmutableTriple<String, Object, String>("N\"/JV?!LKd!BUEmJ", object0, "#;F3-?#tr.#RWOE2^<");
      MutableTriple<Integer, String, Object> mutableTriple3 = new MutableTriple<Integer, String, Object>();
      MutableTriple<Integer, Triple<String, Object, String>, MutableTriple<Integer, String, Object>> mutableTriple4 = new MutableTriple<Integer, Triple<String, Object, String>, MutableTriple<Integer, String, Object>>();
      MutableTriple<String, Object, String> mutableTriple5 = new MutableTriple<String, Object, String>("na5", "N\"/JV?!LKd!BUEmJ", "#;F3-?#tr.#RWOE2^<");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MutableTriple<Object, ImmutableTriple<Integer, Object, Object>, Object> mutableTriple0 = new MutableTriple<Object, ImmutableTriple<Integer, Object, Object>, Object>();
      mutableTriple0.hashCode();
      MutableTriple<String, String, String> mutableTriple1 = new MutableTriple<String, String, String>();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MutableTriple<String, Object, MutableTriple<String, String, Object>> mutableTriple0 = new MutableTriple<String, Object, MutableTriple<String, String, Object>>();
      Integer integer0 = new Integer(1320);
      MutableTriple<ImmutableTriple<Integer, ImmutableTriple<Integer, ImmutableTriple, Integer>, Integer>, ImmutableTriple<ImmutableTriple<ImmutableTriple, Object, ImmutableTriple>, Object, ImmutableTriple<ImmutableTriple, Object, ImmutableTriple>>, String> mutableTriple1 = new MutableTriple<ImmutableTriple<Integer, ImmutableTriple<Integer, ImmutableTriple, Integer>, Integer>, ImmutableTriple<ImmutableTriple<ImmutableTriple, Object, ImmutableTriple>, Object, ImmutableTriple<ImmutableTriple, Object, ImmutableTriple>>, String>();
      ImmutableTriple<Object, Object, Integer> immutableTriple0 = new ImmutableTriple<Object, Object, Integer>(integer0, mutableTriple1, (Integer) null);
      MutableTriple mutableTriple2 = (MutableTriple)immutableTriple0.middle;
      MutableTriple<String, String, Object> mutableTriple3 = new MutableTriple<String, String, Object>();
      mutableTriple0.setRight(mutableTriple3);
      mutableTriple0.equals(mutableTriple2);
      Integer integer1 = new Integer(1320);
      ImmutableTriple<Object, String, String> immutableTriple1 = new ImmutableTriple<Object, String, String>((Object) null, "]B*LcZ4>X\f3YC7+`.k", "=/)rS6$i+W\"nI>16P|");
      ImmutableTriple<Object, Object, Triple<Object, String, String>> immutableTriple2 = ImmutableTriple.of((Object) integer1, (Object) "]B*LcZ4>X\f3YC7+`.k", (Triple<Object, String, String>) immutableTriple1);
      Object object0 = immutableTriple2.getLeft();
      MutableTriple<Object, Object, Object> mutableTriple4 = MutableTriple.of((Object) object0, (Object) "", (Object) null);
      MutableTriple<MutableTriple<Object, Object, Object>, String, Triple<Object, Object, Object>> mutableTriple5 = new MutableTriple<MutableTriple<Object, Object, Object>, String, Triple<Object, Object, Object>>(mutableTriple4, "", mutableTriple4);
      Triple<Object, Object, Object> triple0 = mutableTriple5.getRight();
      assertNotNull(triple0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MutableTriple<String, Object, MutableTriple<String, String, Object>> mutableTriple0 = new MutableTriple<String, Object, MutableTriple<String, String, Object>>();
      MutableTriple<Integer, Object, String> mutableTriple1 = new MutableTriple<Integer, Object, String>();
      mutableTriple0.equals(mutableTriple1);
      Object object0 = new Object();
      MutableTriple<Object, String, Object> mutableTriple2 = new MutableTriple<Object, String, Object>();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Integer integer0 = new Integer(41);
      ImmutableTriple<Object, Integer, String> immutableTriple0 = new ImmutableTriple<Object, Integer, String>(integer0, integer0, "o3iX");
      Integer integer1 = new Integer(41);
      MutableTriple<Integer, Object, Object> mutableTriple0 = new MutableTriple<Integer, Object, Object>(integer1, "o3iX", integer0);
      Triple<ImmutableTriple<Object, Integer, String>, String, MutableTriple<Integer, Object, Object>> triple0 = Triple.of(immutableTriple0, "o3iX", mutableTriple0);
      triple0.equals(mutableTriple0);
      triple0.hashCode();
      Integer integer2 = new Integer(41);
      Integer integer3 = new Integer(41);
      MutableTriple<Object, ImmutableTriple<MutableTriple<Integer, Object, Integer>, MutableTriple<String, String, String>, Integer>, String> mutableTriple1 = new MutableTriple<Object, ImmutableTriple<MutableTriple<Integer, Object, Integer>, MutableTriple<String, String, String>, Integer>, String>();
      MutableTriple<Triple<Object, Object, Object>, MutableTriple<Object, Integer, Object>, MutableTriple<Integer, String, Object>> mutableTriple2 = new MutableTriple<Triple<Object, Object, Object>, MutableTriple<Object, Integer, Object>, MutableTriple<Integer, String, Object>>();
      MutableTriple<Integer, String, Object> mutableTriple3 = new MutableTriple<Integer, String, Object>();
      Integer integer4 = new Integer(41);
      Triple.of(integer4, (Triple<Integer, String, Object>) mutableTriple3, (Triple<Integer, String, Object>) mutableTriple3);
      mutableTriple2.setRight(mutableTriple3);
      Integer integer5 = new Integer(41);
      assertTrue(integer5.equals((Object)integer0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MutableTriple<Object, Object, String> mutableTriple0 = new MutableTriple<Object, Object, String>();
  }
}
