/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 02:29:25 GMT 2022
 */

package org.apache.commons.codec;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.StringEncoderComparator;
import org.apache.commons.codec.language.Caverphone;
import org.apache.commons.codec.language.RefinedSoundex;
import org.apache.commons.codec.language.Soundex;
import org.apache.commons.codec.net.BCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringEncoderComparator_ESTest extends StringEncoderComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Caverphone caverphone0 = new Caverphone();
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(caverphone0);
      int int0 = stringEncoderComparator0.compare("PKKMK11111", "BxY0;+Wl!qMR:q&");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(bCodec0);
      int int0 = stringEncoderComparator0.compare("4G_", ">$Fk64rkJ2RoQ(`B");
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      char[] charArray0 = new char[3];
      Soundex soundex0 = new Soundex(charArray0);
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(soundex0);
      // Undeclared exception!
      try { 
        stringEncoderComparator0.compare("ci", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: I
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      char[] charArray0 = new char[1];
      RefinedSoundex refinedSoundex0 = new RefinedSoundex(charArray0);
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(refinedSoundex0);
      // Undeclared exception!
      try { 
        stringEncoderComparator0.compare("xq9", "xq9");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 23
         //
         verifyException("org.apache.commons.codec.language.RefinedSoundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        stringEncoderComparator0.compare("n(`sFcv>d|L|@H8zK.(", object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.StringEncoderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(bCodec0);
      Integer integer0 = new Integer((-1));
      int int0 = stringEncoderComparator0.compare("HIA", integer0);
      assertEquals(0, int0);
  }
}
