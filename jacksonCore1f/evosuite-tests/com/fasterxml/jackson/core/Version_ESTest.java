/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 01 21:08:10 GMT 2023
 */

package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.Version;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Version_ESTest extends Version_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Version version0 = new Version(0, 0, 0, "", "", "");
      Version version1 = new Version(0, 0, (-413), "", "", "");
      int int0 = version0.compareTo(version1);
      assertEquals(0, version1.getMinorVersion());
      assertEquals(0, version0.getPatchLevel());
      assertEquals(0, version1.getMajorVersion());
      assertEquals(413, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Version version0 = new Version(0, (-76), 0, "", "", "");
      Version version1 = Version.unknownVersion();
      int int0 = version0.compareTo(version1);
      assertEquals(0, version0.getPatchLevel());
      assertEquals(0, version0.getMajorVersion());
      assertEquals((-76), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      Version version1 = new Version(45, 45, 1300, (String) null, (String) null, "");
      int int0 = version0.compareTo(version1);
      assertEquals(1300, version1.getPatchLevel());
      assertEquals(45, version1.getMinorVersion());
      assertEquals(45, version1.getMajorVersion());
      assertEquals((-45), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Version version0 = new Version(0, 0, 0, "", "2O", "2O");
      Version version1 = new Version(4956, 4956, 4956, "", "2O", "");
      int int0 = version0.compareTo(version1);
      assertEquals(4956, version1.getMinorVersion());
      assertEquals(4956, version1.getPatchLevel());
      assertFalse(version0.isSnapshot());
      assertEquals(2, int0);
      assertEquals("2O", version1.getGroupId());
      assertEquals(4956, version1.getMajorVersion());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Version version0 = new Version(2242, 2242, 2242, "(~{iR>[q2 V^(6~", "(~{iR>[q2 V^(6~", (String) null);
      Version version1 = new Version(2242, (-2138), 0, "", "(~{iR>[q2 V^(6~", "");
      int int0 = version0.compareTo(version1);
      assertEquals(2242, version0.getMinorVersion());
      assertEquals(0, version1.getPatchLevel());
      assertEquals(2242, version0.getPatchLevel());
      assertEquals(2242, version1.getMajorVersion());
      assertTrue(version0.isSnapshot());
      assertEquals("(~{iR>[q2 V^(6~", version1.getGroupId());
      assertEquals(4380, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      Version version1 = new Version(0, 0, 0, "0.0.0", "//0.0.0", "0.0.0");
      int int0 = version1.compareTo(version0);
      assertEquals("0.0.0", version1.getArtifactId());
      assertEquals(0, version1.getMinorVersion());
      assertEquals(0, version1.getMajorVersion());
      assertEquals(0, version1.getPatchLevel());
      assertEquals(7, int0);
      assertTrue(version1.isSnapshot());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Version version0 = new Version((-7187), (-7187), (-7187), (String) null, (String) null, (String) null);
      Version version1 = new Version((-7187), (-7187), (-7187), "-7187.-7187.-7187", "//-7187.-7187.-7187--7187.-7187.-7187", "");
      boolean boolean0 = version1.equals(version0);
      assertFalse(boolean0);
      assertFalse(version0.equals((Object)version1));
      assertEquals("", version1.getArtifactId());
      assertTrue(version1.isSnapshot());
      assertEquals((-7187), version1.getMinorVersion());
      assertEquals((-7187), version1.getPatchLevel());
      assertEquals((-7187), version1.getMajorVersion());
      assertEquals("//-7187.-7187.-7187--7187.-7187.-7187", version1.getGroupId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      Version version1 = new Version(0, 0, 1502, "t ]+qRebl");
      boolean boolean0 = version1.equals(version0);
      assertEquals(1502, version1.getPatchLevel());
      assertTrue(version1.isSnapshot());
      assertEquals(0, version1.getMajorVersion());
      assertEquals(0, version1.getMinorVersion());
      assertFalse(boolean0);
      assertFalse(version0.equals((Object)version1));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Version version0 = new Version(0, 0, 0, "", "", "");
      Version version1 = new Version(1, 1, 1, "", "//0.0.-413", "//0.0.-413");
      boolean boolean0 = version0.equals(version1);
      assertFalse(version1.isSnapshot());
      assertEquals("//0.0.-413", version1.getGroupId());
      assertEquals(1, version1.getMinorVersion());
      assertEquals("//0.0.-413", version1.getArtifactId());
      assertFalse(boolean0);
      assertEquals(1, version1.getMajorVersion());
      assertEquals(1, version1.getPatchLevel());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Version version0 = new Version(0, 1026, 1026, ")", ")", "<]h Q`!rN!xvXhCAU");
      Version version1 = Version.unknownVersion();
      boolean boolean0 = version0.equals(version1);
      assertEquals(1026, version0.getPatchLevel());
      assertEquals("<]h Q`!rN!xvXhCAU", version0.getArtifactId());
      assertEquals(0, version0.getMajorVersion());
      assertFalse(boolean0);
      assertEquals(")", version0.getGroupId());
      assertEquals(1026, version0.getMinorVersion());
      assertTrue(version0.isSnapshot());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Version version0 = new Version(164, 164, (-3535), "eeoQ:MRQU", "", "");
      version0.hashCode();
      assertEquals("", version0.getArtifactId());
      assertEquals("", version0.getGroupId());
      assertTrue(version0.isSnapshot());
      assertEquals((-3535), version0.getPatchLevel());
      assertEquals(164, version0.getMajorVersion());
      assertEquals(164, version0.getMinorVersion());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Version version0 = new Version(0, 0, 1806, "j4om#:`|", "", "");
      version0.hashCode();
      assertTrue(version0.isSnapshot());
      assertEquals(0, version0.getMinorVersion());
      assertEquals(1806, version0.getPatchLevel());
      assertEquals("", version0.getGroupId());
      assertEquals("", version0.getArtifactId());
      assertEquals(0, version0.getMajorVersion());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Version version0 = new Version((-4857), 0, 0, (String) null);
      version0.hashCode();
      assertEquals((-4857), version0.getMajorVersion());
      assertEquals(0, version0.getMinorVersion());
      assertEquals(0, version0.getPatchLevel());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Version version0 = new Version(0, 0, 0, "@2r}$SCki[RZw$6", "=/Q8@=o>a5&Mf63", "@2r}$SCki[RZw$6");
      version0.hashCode();
      assertEquals(0, version0.getMinorVersion());
      assertEquals(0, version0.getPatchLevel());
      assertEquals(0, version0.getMajorVersion());
      assertEquals("@2r}$SCki[RZw$6", version0.getArtifactId());
      assertTrue(version0.isSnapshot());
      assertEquals("=/Q8@=o>a5&Mf63", version0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Version version0 = new Version(0, 1011, 0, "sPf1WcvBmBVpC", "", "//0.0.0");
      String string0 = version0.toString();
      assertEquals("0.1011.0-sPf1WcvBmBVpC", string0);
      assertEquals("//0.0.0", version0.getArtifactId());
      assertEquals("", version0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Version version0 = new Version(0, 1026, 1026, ")", ")", "<]h Q`!rN!xvXhCAU");
      String string0 = version0.toFullString();
      assertEquals(")/<]h Q`!rN!xvXhCAU/0.1026.1026-)", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Version version0 = new Version(0, 1026, 1026, ")", ")", "<]h Q`!rN!xvXhCAU");
      String string0 = version0.getArtifactId();
      assertEquals(")", version0.getGroupId());
      assertEquals(1026, version0.getMinorVersion());
      assertEquals(0, version0.getMajorVersion());
      assertEquals(1026, version0.getPatchLevel());
      assertEquals("<]h Q`!rN!xvXhCAU", string0);
      assertTrue(version0.isSnapshot());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Version version0 = new Version(0, 0, 826, "", ")V~p", "");
      int int0 = version0.getPatchLevel();
      assertEquals(")V~p", version0.getGroupId());
      assertFalse(version0.isSnapshot());
      assertEquals(826, int0);
      assertEquals("", version0.getArtifactId());
      assertEquals(0, version0.getMajorVersion());
      assertEquals(0, version0.getMinorVersion());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Version version0 = new Version(164, 164, (-3535), "eeoQ:MRQU", "", "");
      int int0 = version0.getPatchLevel();
      assertEquals((-3535), int0);
      assertEquals(164, version0.getMajorVersion());
      assertEquals(164, version0.getMinorVersion());
      assertEquals("", version0.getGroupId());
      assertTrue(version0.isSnapshot());
      assertEquals("", version0.getArtifactId());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Version version0 = new Version(1, 1, 0, "");
      int int0 = version0.getMinorVersion();
      assertEquals(1, int0);
      assertEquals(0, version0.getPatchLevel());
      assertEquals(1, version0.getMajorVersion());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Version version0 = new Version((-445), (-1989), (-1989), (String) null);
      int int0 = version0.getMinorVersion();
      assertEquals((-1989), int0);
      assertEquals((-1989), version0.getPatchLevel());
      assertEquals((-445), version0.getMajorVersion());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Version version0 = new Version(2242, 2242, 2242, "(~{iR>[q2 V^(6~", "(~{iR>[q2 V^(6~", (String) null);
      int int0 = version0.getMajorVersion();
      assertTrue(version0.isSnapshot());
      assertEquals("(~{iR>[q2 V^(6~", version0.getGroupId());
      assertEquals(2242, version0.getMinorVersion());
      assertEquals(2242, int0);
      assertEquals(2242, version0.getPatchLevel());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Version version0 = new Version((-445), (-1989), (-1989), (String) null);
      int int0 = version0.getMajorVersion();
      assertEquals((-1989), version0.getPatchLevel());
      assertEquals((-445), int0);
      assertEquals((-1989), version0.getMinorVersion());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Version version0 = new Version(0, 1026, 1026, ")", ")", "<]h Q`!rN!xvXhCAU");
      String string0 = version0.getGroupId();
      assertEquals(0, version0.getMajorVersion());
      assertTrue(version0.isSnapshot());
      assertEquals(")", string0);
      assertEquals(1026, version0.getPatchLevel());
      assertEquals("<]h Q`!rN!xvXhCAU", version0.getArtifactId());
      assertEquals(1026, version0.getMinorVersion());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      String string0 = version0.getArtifactId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Version version0 = new Version(164, 164, (-3535), "eeoQ:MRQU", "", "");
      // Undeclared exception!
      try { 
        version0.compareTo((Version) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.Version", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      String string0 = version0.toString();
      assertEquals("0.0.0", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Version version0 = new Version(0, 0, 0, "<]h Q`!rN!xvXhCAU");
      boolean boolean0 = version0.isSnapshot();
      assertEquals(0, version0.getPatchLevel());
      assertTrue(boolean0);
      assertEquals(0, version0.getMajorVersion());
      assertEquals(0, version0.getMinorVersion());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      boolean boolean0 = version0.isSnapshot();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      Version version1 = new Version(28, 28, 28, "0.0.0");
      int int0 = version1.compareTo(version0);
      assertEquals(28, version1.getMajorVersion());
      assertTrue(version1.isSnapshot());
      assertEquals(28, version1.getMinorVersion());
      assertEquals(28, version1.getPatchLevel());
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Version version0 = new Version(0, 0, 0, "=/Q8@=o>a5&Mf63", "=/Q8@=o>a5&Mf63", "=/Q8@=o>a5&Mf63");
      Version version1 = new Version(0, 0, 0, "@2r}$SCki[RZw$6", "=/Q8@=o>a5&Mf63", "@2r}$SCki[RZw$6");
      int int0 = version0.compareTo(version1);
      assertEquals("=/Q8@=o>a5&Mf63", version1.getGroupId());
      assertTrue(version1.isSnapshot());
      assertEquals(0, version1.getMinorVersion());
      assertEquals(0, version1.getMajorVersion());
      assertEquals((-3), int0);
      assertEquals(0, version1.getPatchLevel());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Version version0 = new Version(0, 0, 0, "=/Q8@=o>a5&Mf63", "=/Q8@=o>a5&Mf63", "=/Q8@=o>a5&Mf63");
      Version version1 = Version.unknownVersion();
      int int0 = version1.compareTo(version0);
      assertEquals(0, version0.getPatchLevel());
      assertEquals(0, version0.getMinorVersion());
      assertTrue(version0.isSnapshot());
      assertEquals("=/Q8@=o>a5&Mf63", version0.getArtifactId());
      assertEquals((-15), int0);
      assertEquals(0, version0.getMajorVersion());
      assertEquals("=/Q8@=o>a5&Mf63", version0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      int int0 = version0.compareTo(version0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      Version version1 = new Version(0, 0, 1502, "0.0.0");
      int int0 = version1.compareTo(version0);
      assertEquals(1502, int0);
      assertEquals(0, version1.getMinorVersion());
      assertTrue(version1.isSnapshot());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Version version0 = new Version(0, 0, 0, "=/Q8@=o>a5&Mf63", "=/Q8@=o>a5&Mf63", "=/Q8@=o>a5&Mf63");
      Version version1 = new Version(0, 0, 0, "@2r}$SCki[RZw$6", "=/Q8@=o>a5&Mf63", "@2r}$SCki[RZw$6");
      boolean boolean0 = version1.equals(version0);
      assertEquals(0, version1.getPatchLevel());
      assertTrue(version1.isSnapshot());
      assertEquals("=/Q8@=o>a5&Mf63", version1.getGroupId());
      assertFalse(boolean0);
      assertEquals(0, version1.getMinorVersion());
      assertEquals(0, version1.getMajorVersion());
      assertFalse(version0.equals((Object)version1));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      Version version1 = new Version(0, 0, 1502, "0.0.0");
      boolean boolean0 = version0.equals(version1);
      assertEquals(1502, version1.getPatchLevel());
      assertFalse(version1.equals((Object)version0));
      assertTrue(version1.isSnapshot());
      assertFalse(boolean0);
      assertEquals(0, version1.getMinorVersion());
      assertEquals(0, version1.getMajorVersion());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      Version version1 = new Version(0, 0, 0, "<]h Q`!rN!xvXhCAU");
      boolean boolean0 = version0.equals(version1);
      assertTrue(version1.isSnapshot());
      assertTrue(version1.equals((Object)version0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Version version0 = new Version((-7187), (-7187), (-7187), (String) null, (String) null, (String) null);
      Version version1 = Version.unknownVersion();
      boolean boolean0 = version1.equals(version0);
      assertEquals((-7187), version0.getMajorVersion());
      assertFalse(boolean0);
      assertEquals((-7187), version0.getMinorVersion());
      assertEquals((-7187), version0.getPatchLevel());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      boolean boolean0 = version0.equals("0.0.0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Version version0 = new Version((-7187), (-7187), (-7187), (String) null, (String) null, (String) null);
      boolean boolean0 = version0.equals((Object) null);
      assertEquals((-7187), version0.getMajorVersion());
      assertEquals((-7187), version0.getPatchLevel());
      assertFalse(boolean0);
      assertEquals((-7187), version0.getMinorVersion());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      boolean boolean0 = version0.equals(version0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      Version version1 = new Version(0, 1011, 0, "sPf1WcvBmBVpC", "", "//0.0.0");
      boolean boolean0 = version0.equals(version1);
      assertEquals(1011, version1.getMinorVersion());
      assertEquals("//0.0.0", version1.getArtifactId());
      assertTrue(version1.isSnapshot());
      assertFalse(boolean0);
      assertEquals("", version1.getGroupId());
      assertEquals(0, version1.getMajorVersion());
      assertEquals(0, version1.getPatchLevel());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Version version0 = new Version((-7187), (-7187), (-7187), "", "H", "");
      boolean boolean0 = version0.isSnapshot();
      assertEquals("", version0.getArtifactId());
      assertFalse(boolean0);
      assertEquals((-7187), version0.getPatchLevel());
      assertEquals((-7187), version0.getMajorVersion());
      assertEquals((-7187), version0.getMinorVersion());
      assertEquals("H", version0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      boolean boolean0 = version0.isUknownVersion();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Version version0 = new Version(0, 0, 0, "=/Q8@=o>a5&Mf63", "=/Q8@=o>a5&Mf63", "=/Q8@=o>a5&Mf63");
      boolean boolean0 = version0.isUknownVersion();
      assertEquals(0, version0.getPatchLevel());
      assertTrue(version0.isSnapshot());
      assertEquals(0, version0.getMajorVersion());
      assertEquals("=/Q8@=o>a5&Mf63", version0.getGroupId());
      assertFalse(boolean0);
      assertEquals("=/Q8@=o>a5&Mf63", version0.getArtifactId());
      assertEquals(0, version0.getMinorVersion());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      String string0 = version0.toFullString();
      assertEquals("//0.0.0", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      int int0 = version0.getPatchLevel();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      int int0 = version0.getMajorVersion();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      String string0 = version0.getGroupId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Version version0 = Version.unknownVersion();
      int int0 = version0.getMinorVersion();
      assertEquals(0, int0);
  }
}
