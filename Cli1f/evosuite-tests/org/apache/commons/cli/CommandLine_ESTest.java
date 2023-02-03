/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 01:07:17 GMT 2022
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CommandLine_ESTest extends CommandLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", false, "");
      commandLine0.addOption(option0);
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(1, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", true, "");
      option0.addValue("");
      commandLine0.addOption(option0);
      String[] stringArray0 = commandLine0.getOptionValues("");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", false, "");
      option0.setArgs(305);
      option0.addValue("");
      commandLine0.addOption(option0);
      String string0 = commandLine0.getOptionValue("", "4H&KY~{qAW7");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", false, "");
      option0.setArgs(305);
      option0.addValue("nZqjJL=Pw_a<gV)^gt9");
      commandLine0.addOption(option0);
      String string0 = commandLine0.getOptionValue("");
      assertEquals("nZqjJL=Pw_a<gV)^gt9", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('h', (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('f', "YMQy@IFx}f(;(_");
      assertEquals("YMQy@IFx}f(;(_", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addArg("");
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addArg("");
      List list0 = commandLine0.getArgList();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      // Undeclared exception!
      try { 
        commandLine0.hasOption((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      // Undeclared exception!
      try { 
        commandLine0.getOptionValues((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption((Option) null);
      // Undeclared exception!
      try { 
        commandLine0.getOptionValues('A');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.CommandLine", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      // Undeclared exception!
      try { 
        commandLine0.getOptionValue((String) null, " :: ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      // Undeclared exception!
      try { 
        commandLine0.getOptionValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption((Option) null);
      // Undeclared exception!
      try { 
        commandLine0.getOptionValue('F');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.CommandLine", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption((Option) null);
      // Undeclared exception!
      try { 
        commandLine0.getOptionObject("FH;KW&/[2");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.CommandLine", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", false, "");
      option0.setArgs(305);
      Object object0 = new Object();
      option0.setType(object0);
      option0.addValue("");
      commandLine0.addOption(option0);
      // Undeclared exception!
      try { 
        commandLine0.getOptionObject("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Class
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption((Option) null);
      // Undeclared exception!
      try { 
        commandLine0.getOptionObject('+');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.CommandLine", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue("nZqjJL=Pw_a<gV)^gt9", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", true, "");
      commandLine0.addOption(option0);
      String[] stringArray0 = commandLine0.getOptionValues("");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getOptionValues("");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", false, "");
      option0.setArgs(305);
      option0.addValue("");
      commandLine0.addOption(option0);
      String string0 = commandLine0.getOptionValue("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getOptionObject("");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.hasOption("org.apache.commons.cli.CommandLine");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", false, "");
      option0.setArgs(305);
      option0.addValue("Cr2x*>!l,,6`hO");
      commandLine0.addOption(option0);
      String string0 = commandLine0.getOptionValue("", "4H&KY~{qAW7");
      assertEquals("Cr2x*>!l,,6`hO", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", false, "");
      option0.setLongOpt("]QcH9pjh(%lB");
      commandLine0.addOption(option0);
      Object object0 = commandLine0.getOptionObject("]QcH9pjh(%lB");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", false, "");
      commandLine0.addOption(option0);
      String string0 = commandLine0.getOptionValue('R');
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", false, "");
      commandLine0.addOption(option0);
      Object object0 = commandLine0.getOptionObject('-');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      List list0 = commandLine0.getArgList();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('(', "");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", false, "");
      commandLine0.addOption(option0);
      boolean boolean0 = commandLine0.hasOption("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getOptionValues('F');
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Iterator iterator0 = commandLine0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(0, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.hasOption('`');
      assertFalse(boolean0);
  }
}