/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 01 21:27:41 GMT 2023
 */

package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.util.VersionUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VersionUtil_ESTest extends VersionUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Version version0 = VersionUtil.parseVersion("0+n", "PackageVersion", "VERSION.txt");
      assertEquals(0, version0.getMajorVersion());
      assertEquals("VERSION.txt", version0.getArtifactId());
      assertNotNull(version0);
      assertEquals("PackageVersion", version0.getGroupId());
      assertEquals(0, version0.getMinorVersion());
      assertEquals(0, version0.getPatchLevel());
      assertFalse(version0.isSnapshot());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Version version0 = VersionUtil.parseVersion(":|.x#1O27\"V +|4f(v", "groupId", "HY#^E");
      assertFalse(version0.isSnapshot());
      assertEquals(0, version0.getMinorVersion());
      assertEquals("groupId", version0.getGroupId());
      assertEquals("HY#^E", version0.getArtifactId());
      assertNotNull(version0);
      assertEquals(0, version0.getMajorVersion());
      assertEquals(0, version0.getPatchLevel());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = VersionUtil.parseVersionPart(" to find version information, problem: ");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = VersionUtil.parseVersionPart("3)gs\"4}KE61qjb$*");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Version version0 = VersionUtil.parseVersion("/iV :4:d=*y?*", "/iV :4:d=*y?*", (String) null);
      assertEquals("", version0.getArtifactId());
      assertTrue(version0.isSnapshot());
      assertEquals(0, version0.getMajorVersion());
      assertNotNull(version0);
      assertEquals(0, version0.getMinorVersion());
      assertEquals(4, version0.getPatchLevel());
      assertEquals("/iV :4:d=*y?*", version0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Version version0 = VersionUtil.parseVersion("UTF-32LE", "UTF-32LE", "UTF-32LE");
      assertEquals(0, version0.getMajorVersion());
      assertEquals(32, version0.getMinorVersion());
      assertEquals("UTF-32LE", version0.getArtifactId());
      assertEquals(0, version0.getPatchLevel());
      assertFalse(version0.isSnapshot());
      assertEquals("UTF-32LE", version0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Version version0 = VersionUtil.parseVersion("9%Fh)", "version", "Bad version class ");
      assertNotNull(version0);
      assertFalse(version0.isSnapshot());
      assertEquals(0, version0.getMinorVersion());
      assertEquals(9, version0.getMajorVersion());
      assertEquals("version", version0.getGroupId());
      assertEquals(0, version0.getPatchLevel());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Version version0 = VersionUtil.parseVersion("!ZS$_1v8G)]$R");
      assertEquals(0, version0.getMajorVersion());
      assertNotNull(version0);
      assertEquals("", version0.getGroupId());
      assertEquals("", version0.getArtifactId());
      assertFalse(version0.isSnapshot());
      assertEquals(0, version0.getPatchLevel());
      assertEquals(1, version0.getMinorVersion());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Version version0 = VersionUtil.packageVersionFor(class0);
      assertNull(version0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        VersionUtil.versionFor((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.util.VersionUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        VersionUtil.parseVersionPart((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.util.VersionUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        VersionUtil.parseVersion(":", ":", ":");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.fasterxml.jackson.core.util.VersionUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        VersionUtil.parseVersion(".");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.fasterxml.jackson.core.util.VersionUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        VersionUtil.mavenVersionFor((ClassLoader) null, "8_", "E}C_a^");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.util.VersionUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Version version0 = VersionUtil.parseVersion("", "3T", "");
      assertNull(version0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Version version0 = VersionUtil.parseVersion((String) null, "ZYaZL3DdS}b0>u~", (String) null);
      assertNull(version0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Version version0 = VersionUtil.versionFor(class0);
      assertEquals(0, version0.getMajorVersion());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Version version0 = VersionUtil.parseVersion("2: ");
      assertNotNull(version0);
      assertEquals("", version0.getArtifactId());
      assertEquals(2, version0.getMajorVersion());
      assertEquals(0, version0.getMinorVersion());
      assertEquals("", version0.getGroupId());
      assertFalse(version0.isSnapshot());
      assertEquals(0, version0.getPatchLevel());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Version version0 = VersionUtil.parseVersion("%Uh- {hO:1-I],");
      assertTrue(version0.isSnapshot());
      assertNotNull(version0);
      assertEquals("", version0.getGroupId());
      assertEquals(0, version0.getMinorVersion());
      assertEquals(1, version0.getPatchLevel());
      assertEquals(0, version0.getMajorVersion());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Version version0 = VersionUtil.parseVersion((String) null);
      assertNull(version0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Version version0 = VersionUtil.mavenVersionFor(classLoader0, "79SmpkJ`Bc", "");
      assertEquals(0, version0.getMajorVersion());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        VersionUtil.throwInternal();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Internal error: this code path should never get executed
         //
         verifyException("com.fasterxml.jackson.core.util.VersionUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      VersionUtil versionUtil0 = new VersionUtil();
      Version version0 = versionUtil0.version();
      assertEquals("", version0.getGroupId());
  }
}
