/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 19:48:20 GMT 2022
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.JavaVersion;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class JavaVersion_ESTest extends JavaVersion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JavaVersion javaVersion0 = JavaVersion.JAVA_1_7;
      JavaVersion javaVersion1 = JavaVersion.JAVA_1_2;
      boolean boolean0 = javaVersion0.atLeast(javaVersion1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JavaVersion[] javaVersionArray0 = JavaVersion.values();
      assertEquals(9, javaVersionArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavaVersion javaVersion0 = JavaVersion.valueOf("JAVA_1_2");
      assertEquals(JavaVersion.JAVA_1_2, javaVersion0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JavaVersion.getJavaVersion("9j^aKJ.x");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JavaVersion javaVersion0 = JavaVersion.JAVA_1_2;
      // Undeclared exception!
      try { 
        javaVersion0.atLeast((JavaVersion) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.JavaVersion", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JavaVersion.get("1-8");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JavaVersion javaVersion0 = JavaVersion.get("1.8");
      assertEquals(JavaVersion.JAVA_1_8, javaVersion0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JavaVersion javaVersion0 = JavaVersion.getJavaVersion("1.6");
      assertEquals(JavaVersion.JAVA_1_6, javaVersion0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JavaVersion javaVersion0 = JavaVersion.get("1.5");
      assertEquals(JavaVersion.JAVA_1_5, javaVersion0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JavaVersion javaVersion0 = JavaVersion.get("1.4");
      assertEquals(JavaVersion.JAVA_1_4, javaVersion0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JavaVersion javaVersion0 = JavaVersion.getJavaVersion("1.2");
      assertEquals(JavaVersion.JAVA_1_2, javaVersion0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JavaVersion javaVersion0 = JavaVersion.get("1.1");
      assertEquals(JavaVersion.JAVA_1_1, javaVersion0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JavaVersion javaVersion0 = JavaVersion.get("0.9");
      assertEquals(JavaVersion.JAVA_0_9, javaVersion0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JavaVersion javaVersion0 = JavaVersion.JAVA_1_1;
      boolean boolean0 = javaVersion0.atLeast(javaVersion0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JavaVersion javaVersion0 = JavaVersion.get("1.3");
      assertEquals(JavaVersion.JAVA_1_3, javaVersion0);
      
      JavaVersion javaVersion1 = JavaVersion.JAVA_1_6;
      boolean boolean0 = javaVersion0.atLeast(javaVersion1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JavaVersion javaVersion0 = JavaVersion.JAVA_1_7;
      String string0 = javaVersion0.toString();
      assertEquals("1.7", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JavaVersion javaVersion0 = JavaVersion.getJavaVersion("1.7");
      assertEquals(JavaVersion.JAVA_1_7, javaVersion0);
  }
}
