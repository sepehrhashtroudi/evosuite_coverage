/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 15 19:49:52 GMT 2022
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.commons.lang3.JavaVersion;
import org.apache.commons.lang3.SystemUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class SystemUtils_ESTest extends SystemUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("5(a3(}3 7yI2Dj4~V/ ", "Hcbc+_Np7V\"vyL!", "5(a3(}3 7yI2Dj4~V/ ", "u");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSNameMatch("OpenBSDLinux", "OpenBSDLinux");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionMatch("+W~h%j+$PmUsh5IZC%}", "+W~h%j+$PmUsh5IZC%}");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/sepehr");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      File file0 = SystemUtils.getUserHome();
      assertTrue(file0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/sepehr/test_generation/all_projects_coverage/evosuite_coverage/Lang1f");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      File file0 = SystemUtils.getUserDir();
      assertEquals(0L, file0.getFreeSpace());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, true);
      File file0 = SystemUtils.getJavaIoTmpDir();
      assertFalse(file0.isHidden());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, false);
      File file0 = SystemUtils.getJavaIoTmpDir();
      assertTrue(file0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/usr/lib/jvm/java-8-openjdk-amd64/jre");
      byte[] byteArray0 = new byte[2];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = SystemUtils.getJavaHome();
      assertFalse(file0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/usr/lib/jvm/java-8-openjdk-amd64/jre");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = SystemUtils.getJavaHome();
      assertEquals("jre", file0.getName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        SystemUtils.isOSMatch("u", "eW", (String) null, "NNf");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        SystemUtils.isJavaVersionMatch("//]Yh`opdfbJv&&Zf-O", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        SystemUtils.isJavaVersionAtLeast((JavaVersion) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.JavaVersion", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSNameMatch((String) null, "od\"W=F!3 R_Fro1\"(");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        SystemUtils.isOSNameMatch("Linux", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("5(a3(}3 7yI2Dj4~V/ ", "5(a3(}3 7yI2Dj4~V/ ", "5(a3(}3 7yI2Dj4~V/ ", "5(a3(}3 7yI2Dj4~V/ ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("Z$ KgnXVzLN", "Z$ KgnXVzLN", "n7GGT]x", "n7GGT]x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", (String) null, "1.8", "JAVA_1_5");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch((String) null, "/tmp", "52.0", "Bc:!");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionMatch((String) null, "/home/sepehr");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaAwtHeadless();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SystemUtils systemUtils0 = new SystemUtils();
      assertFalse(SystemUtils.IS_OS_IRIX);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      File file0 = SystemUtils.getUserHome();
      assertTrue(file0.exists());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      File file0 = SystemUtils.getUserDir();
      assertTrue(file0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      File file0 = SystemUtils.getJavaHome();
      assertEquals(0L, file0.getUsableSpace());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JavaVersion javaVersion0 = JavaVersion.JAVA_0_9;
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast(javaVersion0);
      assertTrue(boolean0);
  }
}
