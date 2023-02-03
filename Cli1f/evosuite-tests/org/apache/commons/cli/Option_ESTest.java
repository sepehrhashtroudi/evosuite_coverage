/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 01:04:46 GMT 2022
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Option_ESTest extends Option_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Option option0 = new Option("Gi", "Gi", false, "Gi");
      option0.hashCode();
      assertEquals("arg", option0.getArgName());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setArgs(664);
      option0.addValue("2!n7!]c*");
      assertEquals(664, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Option option0 = new Option("", "", false, "arg");
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs(0);
      option0.addValue("");
      assertEquals(0, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Option option0 = new Option(" ", true, " ");
      option0.setArgs((-512));
      boolean boolean0 = option0.hasArgs();
      assertEquals((-512), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      assertEquals(1, option0.getArgs());
      
      option0.setArgs(0);
      boolean boolean0 = option0.hasArg();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Option option0 = new Option("", "/lk15");
      option0.setRequired(true);
      boolean boolean0 = option0.isRequired();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Option option0 = new Option(" ", true, " ");
      option0.setOptionalArg(true);
      boolean boolean0 = option0.hasOptionalArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Option option0 = new Option("", true, "I.I.$$;mp,:PoN");
      assertFalse(option0.hasValueSeparator());
      
      option0.addValue((String) null);
      option0.getValuesList();
      assertEquals("I.I.$$;mp,:PoN", option0.getDescription());
      assertEquals(1, option0.getArgs());
      assertEquals("arg", option0.getArgName());
      assertFalse(option0.hasLongOpt());
      assertEquals("", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "+ARG");
      option0.setValueSeparator('6');
      char char0 = option0.getValueSeparator();
      assertEquals('6', char0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Option option0 = new Option("l3", "JM0zjr");
      option0.setValueSeparator('U');
      char char0 = option0.getValueSeparator();
      assertEquals('U', char0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getValue((String) null);
      assertEquals((-1), option0.getArgs());
      assertEquals("arg", option0.getArgName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Option option0 = new Option(" ", true, " ");
      String string0 = option0.getValue("");
      assertNotNull(string0);
      assertTrue(option0.hasArgName());
      assertEquals(1, option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "");
      option0.addValue("");
      option0.setArgs((-2));
      option0.addValue("'");
      option0.getValue(1);
      assertTrue(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "");
      option0.addValue("");
      option0.setArgs((-2));
      option0.addValue("");
      option0.getValue(1);
      assertTrue(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Option option0 = new Option("arg", "", false, "!`@y6Y&qb@7AXDib");
      option0.setArgs((-818));
      option0.addValue("arg");
      option0.getValue();
      assertEquals((-818), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Option option0 = new Option("", "rA9LqWK8KloC&d@", false, (String) null);
      option0.setType("");
      option0.getType();
      assertEquals("rA9LqWK8KloC&d@", option0.getLongOpt());
      assertTrue(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals("arg", option0.getArgName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getOpt();
      assertTrue(option0.hasArgName());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Option option0 = new Option("", "", false, "arg");
      String string0 = option0.getOpt();
      assertEquals("arg", option0.getDescription());
      assertTrue(option0.hasArgName());
      assertEquals("", string0);
      assertEquals("", option0.getLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Option option0 = new Option("", "*csF", false, "NO_ARGS_ALLOWED");
      String string0 = option0.getLongOpt();
      assertEquals("NO_ARGS_ALLOWED", option0.getDescription());
      assertEquals("arg", option0.getArgName());
      assertEquals("", option0.getOpt());
      assertEquals("*csF", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Option option0 = new Option("", "*csF", false, "NO_ARGS_ALLOWED");
      assertEquals("*csF", option0.getLongOpt());
      
      option0.setLongOpt("");
      option0.getLongOpt();
      assertEquals("NO_ARGS_ALLOWED", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Option option0 = new Option((String) null, true, (String) null);
      option0.getKey();
      assertTrue(option0.hasArg());
      assertTrue(option0.hasArgName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", true, (String) null);
      String string0 = option0.getKey();
      assertFalse(option0.hasLongOpt());
      assertEquals(1, option0.getArgs());
      assertNotNull(string0);
      assertEquals("arg", option0.getArgName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Option option0 = new Option("QQ", "", true, "gg%PW5'.BBvPm");
      int int0 = option0.getId();
      assertEquals("gg%PW5'.BBvPm", option0.getDescription());
      assertTrue(option0.hasArg());
      assertEquals("QQ", option0.getOpt());
      assertEquals("", option0.getLongOpt());
      assertTrue(option0.hasArgName());
      assertEquals(81, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Option option0 = new Option("", "*csF", false, "NO_ARGS_ALLOWED");
      String string0 = option0.getDescription();
      assertEquals("*csF", option0.getLongOpt());
      assertEquals("NO_ARGS_ALLOWED", string0);
      assertEquals((-1), option0.getArgs());
      assertEquals("", option0.getOpt());
      assertEquals("arg", option0.getArgName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Option option0 = new Option("", "");
      String string0 = option0.getDescription();
      assertTrue(option0.hasArgName());
      assertEquals((-1), option0.getArgs());
      assertNotNull(string0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Option option0 = new Option((String) null, true, (String) null);
      assertTrue(option0.hasArg());
      
      option0.setArgs(0);
      int int0 = option0.getArgs();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "+ARG");
      option0.setArgs((-2208));
      int int0 = option0.getArgs();
      assertEquals((-2208), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Option option0 = new Option("", (String) null);
      assertTrue(option0.hasArgName());
      
      option0.setArgName((String) null);
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Option option0 = new Option(" ", true, " ");
      assertEquals("arg", option0.getArgName());
      
      option0.setArgName("");
      option0.getArgName();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Option option0 = new Option("v", true, "v");
      option0.addValue("Pr1b3X)7A");
      try { 
        option0.getValue((-2388));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, false, "e0F1C&')x%Id'uZ;j69");
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Option option0 = new Option("", "c<bF4/|Py>", true, "");
      option0.setValueSeparator('#');
      // Undeclared exception!
      try { 
        option0.addValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("iFMO%p%ktP<{uF", true, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // opt contains illegal character value '%'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("/!w&(mW7FL>bG", "", true, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // opt contains illegal character value '/'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("[ option: arg +ARG :: [ option: arg +ARG :: arg ] ]", "arg");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // opt contains illegal character value '['
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "+ARG");
      option0.getValue();
      assertEquals("+ARG", option0.getDescription());
      assertEquals("", option0.getLongOpt());
      assertTrue(option0.hasLongOpt());
      assertTrue(option0.hasArg());
      assertTrue(option0.hasArgName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Option option0 = new Option("", true, "");
      boolean boolean0 = option0.hasValueSeparator();
      assertFalse(boolean0);
      assertFalse(option0.hasLongOpt());
      assertTrue(option0.hasArgName());
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "+ARG");
      option0.setValueSeparator('6');
      boolean boolean0 = option0.hasValueSeparator();
      assertEquals('6', option0.getValueSeparator());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Option option0 = new Option("", (String) null);
      option0.getValueSeparator();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertTrue(option0.hasArgName());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.hashCode();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertTrue(option0.hasArgName());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Option option0 = new Option((String) null, "I~yqg", false, "arg");
      option0.hashCode();
      assertEquals(73, option0.getId());
      assertTrue(option0.hasArgName());
      assertTrue(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals("arg", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      Option option1 = new Option((String) null, (String) null, false, "Eu8s#Yy7XL&reA");
      boolean boolean0 = option0.equals(option1);
      assertEquals((-1), option1.getArgs());
      assertTrue(boolean0);
      assertTrue(option1.hasArgName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      Option option1 = new Option("", "", true, "");
      boolean boolean0 = option0.equals(option1);
      assertTrue(option1.hasArgName());
      assertTrue(boolean0);
      assertTrue(option1.hasArg());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      Option option1 = new Option("arg", "");
      boolean boolean0 = option0.equals(option1);
      assertFalse(boolean0);
      assertEquals("arg", option1.getOpt());
      assertFalse(option1.hasLongOpt());
      assertTrue(option1.hasArgName());
      assertEquals((-1), option1.getArgs());
      assertEquals("", option1.getDescription());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      Option option1 = new Option((String) null, "1h7fBTBP/\u0000B*", false, "Eu8s#Yy7XL&reA");
      boolean boolean0 = option0.equals(option1);
      assertEquals((-1), option1.getArgs());
      assertEquals(49, option1.getId());
      assertEquals("arg", option1.getArgName());
      assertFalse(option1.equals((Object)option0));
      assertFalse(boolean0);
      assertEquals("Eu8s#Yy7XL&reA", option1.getDescription());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Option option0 = new Option("", true, "");
      boolean boolean0 = option0.equals("");
      assertFalse(option0.hasLongOpt());
      assertTrue(option0.hasArg());
      assertFalse(boolean0);
      assertTrue(option0.hasArgName());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Option option0 = new Option("", (String) null);
      boolean boolean0 = option0.equals((Object) null);
      assertTrue(option0.hasArgName());
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      boolean boolean0 = option0.equals(option0);
      assertTrue(boolean0);
      assertTrue(option0.hasArgName());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      Option option1 = new Option("", "");
      boolean boolean0 = option0.equals(option1);
      assertEquals((-1), option1.getArgs());
      assertTrue(option1.hasArgName());
      assertEquals(1, option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      Option option1 = new Option("", "", true, "");
      option1.setType(option0);
      String string0 = option1.toString();
      assertEquals("[ option:   +ARG ::  :: [ option:   +ARG ::  ] ]", string0);
      assertTrue(option1.hasArgName());
      assertEquals(1, option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      String string0 = option0.toString();
      assertEquals("arg", option0.getArgName());
      assertEquals("[ option:   +ARG ::  ]", string0);
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Option option0 = new Option("", "");
      String string0 = option0.toString();
      assertEquals((-1), option0.getArgs());
      assertEquals("arg", option0.getArgName());
      assertEquals("[ option:   ::  ]", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      String[] stringArray0 = option0.getValues();
      assertNull(stringArray0);
      assertEquals(1, option0.getArgs());
      assertEquals("arg", option0.getArgName());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.addValue("");
      String[] stringArray0 = option0.getValues();
      assertFalse(option0.hasValueSeparator());
      assertNotNull(stringArray0);
      assertTrue(option0.hasArg());
      assertEquals("arg", option0.getArgName());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Option option0 = new Option(" ", true, " ");
      option0.addValue("q_");
      option0.getValue("q_");
      assertTrue(option0.hasArgName());
      assertFalse(option0.hasLongOpt());
      assertFalse(option0.hasValueSeparator());
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      option0.getValue((-2597));
      assertTrue(option0.hasArgName());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "");
      option0.addValue("");
      try { 
        option0.getValue(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Option option0 = new Option("v", "v", true, "v");
      option0.addValue("v");
      // Undeclared exception!
      try { 
        option0.addValue("illegal option value '");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot add value, list full.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Option option0 = new Option("", (String) null, true, "");
      option0.setArgs((-1527));
      option0.setValueSeparator('D');
      option0.addValue("ND DB(<:0");
      assertEquals('D', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Option option0 = new Option("", (String) null, true, "");
      option0.setValueSeparator('D');
      option0.addValue("ND DB(<:0");
      assertEquals('D', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Option option0 = new Option("arg", "");
      // Undeclared exception!
      try { 
        option0.addValue("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // NO_ARGS_ALLOWED
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Option option0 = new Option("", "c<bF4/|Py>", true, "");
      option0.addValue("");
      String string0 = option0.getValue();
      assertEquals(1, option0.getArgs());
      assertFalse(option0.hasValueSeparator());
      assertEquals("c<bF4/|Py>", option0.getLongOpt());
      assertTrue(option0.hasArgName());
      assertEquals("", option0.getDescription());
      assertNotNull(string0);
      assertEquals("", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Option option0 = new Option(" ", true, " ");
      option0.setArgs((-2));
      boolean boolean0 = option0.hasArgs();
      assertEquals((-2), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Option option0 = new Option("", (String) null, true, "");
      boolean boolean0 = option0.hasArgs();
      assertEquals(1, option0.getArgs());
      assertFalse(boolean0);
      assertTrue(option0.hasArgName());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Option option0 = new Option("", true, "``,+mdu^n_C<AFK&a%D");
      option0.setArgs(120);
      boolean boolean0 = option0.hasArgs();
      assertEquals(120, option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "");
      boolean boolean0 = option0.hasArgName();
      assertTrue(boolean0);
      assertEquals(1, option0.getArgs());
      assertTrue(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Option option0 = new Option("", (String) null);
      assertTrue(option0.hasArgName());
      
      option0.setArgName((String) null);
      boolean boolean0 = option0.hasArgName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Option option0 = new Option("", (String) null, true, "");
      option0.setArgs((-1527));
      boolean boolean0 = option0.hasArg();
      assertEquals((-1527), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "");
      boolean boolean0 = option0.hasArg();
      assertEquals("arg", option0.getArgName());
      assertTrue(boolean0);
      assertTrue(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "+ARG");
      boolean boolean0 = option0.hasLongOpt();
      assertTrue(boolean0);
      assertEquals("", option0.getLongOpt());
      assertTrue(option0.hasArg());
      assertEquals("+ARG", option0.getDescription());
      assertTrue(option0.hasArgName());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Option option0 = new Option("", (String) null, true, "");
      boolean boolean0 = option0.hasLongOpt();
      assertFalse(boolean0);
      assertEquals("arg", option0.getArgName());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "");
      String string0 = option0.getKey();
      assertNotNull(string0);
      assertEquals("arg", option0.getArgName());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "");
      int int0 = option0.getArgs();
      assertEquals(1, int0);
      assertTrue(option0.hasLongOpt());
      assertEquals("arg", option0.getArgName());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Option option0 = new Option(" ", true, " ");
      String string0 = option0.getOpt();
      assertFalse(option0.hasLongOpt());
      assertNotNull(string0);
      assertTrue(option0.hasArg());
      assertEquals("arg", option0.getArgName());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Option option0 = new Option(" ", true, " ");
      option0.hasOptionalArg();
      assertFalse(option0.hasLongOpt());
      assertEquals(1, option0.getArgs());
      assertTrue(option0.hasArgName());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "");
      assertEquals("arg", option0.getArgName());
      
      option0.setArgName("");
      boolean boolean0 = option0.hasArgName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Option option0 = new Option(" ", true, " ");
      option0.setDescription("");
      assertFalse(option0.hasLongOpt());
      assertEquals(1, option0.getArgs());
      assertTrue(option0.hasArgName());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.getType();
      assertFalse(option0.hasLongOpt());
      assertEquals(1, option0.getArgs());
      assertEquals("arg", option0.getArgName());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Option option0 = new Option("", " ");
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Option option0 = new Option("", (String) null, true, "");
      String string0 = option0.getLongOpt();
      assertNull(string0);
      assertTrue(option0.hasArg());
      assertEquals("arg", option0.getArgName());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      option0.getValuesList();
      assertTrue(option0.hasArgName());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "");
      option0.isRequired();
      assertTrue(option0.hasArg());
      assertTrue(option0.hasLongOpt());
      assertTrue(option0.hasArgName());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "");
      option0.setArgs((-2));
      boolean boolean0 = option0.hasArg();
      assertEquals((-2), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "");
      String string0 = option0.getArgName();
      assertTrue(option0.hasLongOpt());
      assertTrue(option0.hasArg());
      assertEquals("arg", string0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Option option0 = new Option("", (String) null);
      String string0 = option0.getDescription();
      assertNull(string0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals("arg", option0.getArgName());
  }
}