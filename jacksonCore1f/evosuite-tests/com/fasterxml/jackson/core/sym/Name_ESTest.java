/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 01 21:26:17 GMT 2023
 */

package com.fasterxml.jackson.core.sym;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.sym.Name1;
import com.fasterxml.jackson.core.sym.Name2;
import com.fasterxml.jackson.core.sym.Name3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Name_ESTest extends Name_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Name3 name3_0 = new Name3((String) null, 0, 0, (-153), (-212));
      String string0 = name3_0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Name1 name1_0 = new Name1("com.fasterxml.jackson.core.sym.Name", 792, 2);
      String string0 = name1_0.toString();
      assertEquals("com.fasterxml.jackson.core.sym.Name", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Name1 name1_0 = new Name1((String) null, 0, (-1));
      String string0 = name1_0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Name3 name3_0 = new Name3("com.fasterxml.jackson.core.sym.Name", (-2451), (-2451), (-221), (-221));
      String string0 = name3_0.getName();
      assertEquals("com.fasterxml.jackson.core.sym.Name", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Name2 name2_0 = new Name2("", 1770, 1770, 1770);
      int[] intArray0 = new int[6];
      intArray0[0] = 1770;
      intArray0[1] = 1770;
      boolean boolean0 = name2_0.equals(intArray0, 2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Name1 name1_0 = Name1.sEmptyName;
      int[] intArray0 = new int[2];
      boolean boolean0 = name1_0.equals(intArray0, 2702);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Name1 name1_0 = Name1.getEmptyName();
      boolean boolean0 = name1_0.equals(0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Name2 name2_0 = new Name2("", (-2739), 5004, 5004);
      boolean boolean0 = name2_0.equals(5004, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Name1 name1_0 = Name1.getEmptyName();
      boolean boolean0 = name1_0.equals(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Name1 name1_0 = Name1.sEmptyName;
      boolean boolean0 = name1_0.equals(1183);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Name1 name1_0 = new Name1("9cLMv%", 0, (-5365));
      boolean boolean0 = name1_0.equals((Object) name1_0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Name1 name1_0 = Name1.sEmptyName;
      String string0 = name1_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Name1 name1_0 = Name1.sEmptyName;
      String string0 = name1_0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Name2 name2_0 = new Name2("", (-2739), 5004, 5004);
      Object object0 = new Object();
      boolean boolean0 = name2_0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Name1 name1_0 = Name1.sEmptyName;
      name1_0.hashCode();
  }
}
