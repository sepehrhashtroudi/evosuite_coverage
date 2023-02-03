/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 23:17:06 GMT 2022
 */

package org.apache.commons.math3.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NoBracketingException_ESTest extends NoBracketingException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NoBracketingException noBracketingException0 = new NoBracketingException(0.0, 0.0, 0.0, (-739.15));
      double double0 = noBracketingException0.getLo();
      assertEquals(0.0, noBracketingException0.getHi(), 0.01);
      assertEquals(0.0, noBracketingException0.getFLo(), 0.01);
      assertEquals((-739.15), noBracketingException0.getFHi(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NoBracketingException noBracketingException0 = new NoBracketingException(3204.4561810038467, 3204.4561810038467, 0.0, 1908.23546);
      double double0 = noBracketingException0.getLo();
      assertEquals(3204.4561810038467, noBracketingException0.getHi(), 0.01);
      assertEquals(0.0, noBracketingException0.getFLo(), 0.01);
      assertEquals(3204.4561810038467, double0, 0.01);
      assertEquals(1908.23546, noBracketingException0.getFHi(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NoBracketingException noBracketingException0 = new NoBracketingException(0.0, 0.0, 0.0, 0.0);
      double double0 = noBracketingException0.getHi();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, noBracketingException0.getLo(), 0.01);
      assertEquals(0.0, noBracketingException0.getFHi(), 0.01);
      assertEquals(0.0, noBracketingException0.getFLo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NoBracketingException noBracketingException0 = new NoBracketingException(45.0, 45.0, 45.0, 45.0);
      double double0 = noBracketingException0.getHi();
      assertEquals(45.0, noBracketingException0.getFHi(), 0.01);
      assertEquals(45.0, double0, 0.01);
      assertEquals(45.0, noBracketingException0.getFLo(), 0.01);
      assertEquals(45.0, noBracketingException0.getLo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NoBracketingException noBracketingException0 = new NoBracketingException((-539.8995661645549), (-348.80343251389), 0.0, (-348.80343251389));
      double double0 = noBracketingException0.getFLo();
      assertEquals(0.0, double0, 0.01);
      assertEquals((-348.80343251389), noBracketingException0.getFHi(), 0.01);
      assertEquals((-539.8995661645549), noBracketingException0.getLo(), 0.01);
      assertEquals((-348.80343251389), noBracketingException0.getHi(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NoBracketingException noBracketingException0 = new NoBracketingException(4505.3397169925, 4505.3397169925, 4505.3397169925, 1.0);
      double double0 = noBracketingException0.getFLo();
      assertEquals(4505.3397169925, noBracketingException0.getHi(), 0.01);
      assertEquals(4505.3397169925, noBracketingException0.getLo(), 0.01);
      assertEquals(4505.3397169925, double0, 0.01);
      assertEquals(1.0, noBracketingException0.getFHi(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NoBracketingException noBracketingException0 = new NoBracketingException(1167.9727730648801, 1167.9727730648801, 1167.9727730648801, 1167.9727730648801);
      double double0 = noBracketingException0.getFHi();
      assertEquals(1167.9727730648801, noBracketingException0.getHi(), 0.01);
      assertEquals(1167.9727730648801, noBracketingException0.getLo(), 0.01);
      assertEquals(1167.9727730648801, double0, 0.01);
      assertEquals(1167.9727730648801, noBracketingException0.getFLo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.AT_LEAST_ONE_ROW;
      NoBracketingException noBracketingException0 = new NoBracketingException(localizedFormats0, (-1.0), 1493.13, 1493.13, 0.0, (Object[]) null);
      double double0 = noBracketingException0.getFHi();
      assertEquals(1493.13, noBracketingException0.getHi(), 0.01);
      assertEquals(1493.13, noBracketingException0.getFLo(), 0.01);
      assertEquals((-1.0), noBracketingException0.getLo(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NoBracketingException noBracketingException0 = new NoBracketingException((-4662.82651978), (-4662.82651978), (-4662.82651978), (-4662.82651978));
      double double0 = noBracketingException0.getLo();
      assertEquals((-4662.82651978), noBracketingException0.getHi(), 0.01);
      assertEquals((-4662.82651978), double0, 0.01);
      assertEquals((-4662.82651978), noBracketingException0.getFHi(), 0.01);
      assertEquals((-4662.82651978), noBracketingException0.getFLo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NoBracketingException noBracketingException0 = new NoBracketingException((-4662.82651978), (-4662.82651978), (-4662.82651978), (-4662.82651978));
      double double0 = noBracketingException0.getFLo();
      assertEquals((-4662.82651978), noBracketingException0.getHi(), 0.01);
      assertEquals((-4662.82651978), double0, 0.01);
      assertEquals((-4662.82651978), noBracketingException0.getFHi(), 0.01);
      assertEquals((-4662.82651978), noBracketingException0.getLo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NoBracketingException noBracketingException0 = new NoBracketingException((-4662.82651978), (-4662.82651978), (-4662.82651978), (-4662.82651978));
      double double0 = noBracketingException0.getHi();
      assertEquals((-4662.82651978), noBracketingException0.getLo(), 0.01);
      assertEquals((-4662.82651978), noBracketingException0.getFHi(), 0.01);
      assertEquals((-4662.82651978), double0, 0.01);
      assertEquals((-4662.82651978), noBracketingException0.getFLo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NoBracketingException noBracketingException0 = new NoBracketingException((-4662.82651978), (-4662.82651978), (-4662.82651978), (-4662.82651978));
      double double0 = noBracketingException0.getFHi();
      assertEquals((-4662.82651978), noBracketingException0.getFLo(), 0.01);
      assertEquals((-4662.82651978), double0, 0.01);
      assertEquals((-4662.82651978), noBracketingException0.getLo(), 0.01);
      assertEquals((-4662.82651978), noBracketingException0.getHi(), 0.01);
  }
}
