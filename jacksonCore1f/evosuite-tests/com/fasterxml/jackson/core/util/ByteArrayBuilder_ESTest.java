/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 01 21:28:51 GMT 2023
 */

package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ByteArrayBuilder_ESTest extends ByteArrayBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, 2000);
      byte[] byteArray0 = byteArrayBuilder0.resetAndGetFirstSegment();
      byteArrayBuilder0.write(byteArray0);
      byteArrayBuilder0.write(byteArray0);
      assertEquals(1000, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      BufferRecycler.ByteBufferType bufferRecycler_ByteBufferType0 = BufferRecycler.ByteBufferType.WRITE_CONCAT_BUFFER;
      byte[] byteArray0 = new byte[1];
      bufferRecycler0.releaseByteBuffer(bufferRecycler_ByteBufferType0, byteArray0);
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, 4000);
      byteArrayBuilder0.appendThreeBytes((byte) (-90));
      assertEquals(2, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, 2000);
      byteArrayBuilder0.appendThreeBytes((-15));
      assertEquals(3, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(2);
      byteArrayBuilder0.appendThreeBytes(0);
      assertEquals(1, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      BufferRecycler.ByteBufferType bufferRecycler_ByteBufferType0 = BufferRecycler.ByteBufferType.WRITE_CONCAT_BUFFER;
      byte[] byteArray0 = new byte[1];
      bufferRecycler0.releaseByteBuffer(bufferRecycler_ByteBufferType0, byteArray0);
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, 4000);
      byteArrayBuilder0.appendTwoBytes(2454);
      assertEquals(1, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, 2000);
      byteArrayBuilder0.release();
      byte[] byteArray0 = byteArrayBuilder0.resetAndGetFirstSegment();
      assertNull(byteArray0);
      assertEquals(0, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(0);
      byteArrayBuilder0.appendTwoBytes((-1));
      int int0 = byteArrayBuilder0.getCurrentSegmentLength();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
      byteArrayBuilder0.setCurrentSegmentLength((-1509));
      int int0 = byteArrayBuilder0.getCurrentSegmentLength();
      assertEquals((-1509), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0);
      byteArrayBuilder0.release();
      byte[] byteArray0 = byteArrayBuilder0.getCurrentSegment();
      assertNull(byteArray0);
      assertEquals(0, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(0);
      byte[] byteArray0 = byteArrayBuilder0.getCurrentSegment();
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0);
      byteArrayBuilder0.completeAndCoalesce(169);
      assertEquals(169, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
      // Undeclared exception!
      try { 
        byteArrayBuilder0.write((byte[]) null, 40, 40);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(0);
      // Undeclared exception!
      try { 
        byteArrayBuilder0.write((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.util.ByteArrayBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
      byteArrayBuilder0.setCurrentSegmentLength((-1509));
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        byteArrayBuilder0.write(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0);
      byteArrayBuilder0.release();
      // Undeclared exception!
      try { 
        byteArrayBuilder0.write(2000);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.util.ByteArrayBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
      byteArrayBuilder0.setCurrentSegmentLength((-1794));
      // Undeclared exception!
      try { 
        byteArrayBuilder0.write((-1794));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1794
         //
         verifyException("com.fasterxml.jackson.core.util.ByteArrayBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0);
      byteArrayBuilder0.release();
      byteArrayBuilder0.setCurrentSegmentLength(2000);
      // Undeclared exception!
      try { 
        byteArrayBuilder0.toByteArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(0);
      byteArrayBuilder0.setCurrentSegmentLength((-233));
      // Undeclared exception!
      try { 
        byteArrayBuilder0.toByteArray();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.util.ByteArrayBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0);
      byteArrayBuilder0.release();
      // Undeclared exception!
      try { 
        byteArrayBuilder0.finishCurrentSegment();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0);
      byteArrayBuilder0.release();
      // Undeclared exception!
      try { 
        byteArrayBuilder0.completeAndCoalesce(2000);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, (-857));
      // Undeclared exception!
      try { 
        byteArrayBuilder0.completeAndCoalesce((-757));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.util.ByteArrayBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, (-2274));
      byteArrayBuilder0.release();
      // Undeclared exception!
      try { 
        byteArrayBuilder0.appendTwoBytes(8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.util.ByteArrayBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, 986);
      byteArrayBuilder0.setCurrentSegmentLength((-3970));
      // Undeclared exception!
      try { 
        byteArrayBuilder0.appendTwoBytes((-3970));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3970
         //
         verifyException("com.fasterxml.jackson.core.util.ByteArrayBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, 4);
      byteArrayBuilder0.release();
      // Undeclared exception!
      try { 
        byteArrayBuilder0.appendThreeBytes((-2372));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.util.ByteArrayBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
      byteArrayBuilder0.setCurrentSegmentLength((-710));
      // Undeclared exception!
      try { 
        byteArrayBuilder0.appendThreeBytes(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -710
         //
         verifyException("com.fasterxml.jackson.core.util.ByteArrayBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, 2000);
      byteArrayBuilder0.setCurrentSegmentLength((-663));
      // Undeclared exception!
      try { 
        byteArrayBuilder0.append(1000);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -663
         //
         verifyException("com.fasterxml.jackson.core.util.ByteArrayBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = null;
      try {
        byteArrayBuilder0 = new ByteArrayBuilder((-1364));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.util.ByteArrayBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(4000);
      byte[] byteArray0 = byteArrayBuilder0.finishCurrentSegment();
      byteArrayBuilder0.write(byteArray0);
      // Undeclared exception!
      try { 
        byteArrayBuilder0.write(byteArray0, 262144, 4000);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, (-857));
      byte[] byteArray0 = byteArrayBuilder0.toByteArray();
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(0);
      byteArrayBuilder0.append((-3872));
      assertEquals(1, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, (-857));
      byte[] byteArray0 = byteArrayBuilder0.finishCurrentSegment();
      assertEquals(1000, byteArray0.length);
      
      byteArrayBuilder0.reset();
      assertEquals(0, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, (-857));
      byteArrayBuilder0.reset();
      assertEquals(0, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = null;
      try {
        byteArrayBuilder0 = new ByteArrayBuilder((BufferRecycler) null, (-845));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.util.ByteArrayBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(556648);
      byte[] byteArray0 = byteArrayBuilder0.finishCurrentSegment();
      assertEquals(262144, byteArray0.length);
      assertEquals(0, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, (-857));
      byte[] byteArray0 = new byte[0];
      byteArrayBuilder0.write(byteArray0, 0, (-302));
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
      byteArrayBuilder0.setCurrentSegmentLength(2345);
      byteArrayBuilder0.appendThreeBytes(2345);
      byteArrayBuilder0.toByteArray();
      assertEquals(0, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
      byteArrayBuilder0.appendTwoBytes(2345);
      byteArrayBuilder0.toByteArray();
      assertEquals(2, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, 2000);
      byteArrayBuilder0.release();
      byteArrayBuilder0.release();
      assertEquals(0, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0);
      byteArrayBuilder0.release();
      // Undeclared exception!
      try { 
        byteArrayBuilder0.append((byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.util.ByteArrayBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
      byteArrayBuilder0.setCurrentSegmentLength(2345);
      byteArrayBuilder0.appendThreeBytes(2345);
      byteArrayBuilder0.release();
      assertEquals(0, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
      byte[] byteArray0 = byteArrayBuilder0.getCurrentSegment();
      assertEquals(500, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
      byteArrayBuilder0.write(2345);
      assertEquals(1, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
      byteArrayBuilder0.flush();
      assertEquals(0, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(0);
      byte[] byteArray0 = byteArrayBuilder0.resetAndGetFirstSegment();
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
      byteArrayBuilder0.setCurrentSegmentLength(2809);
      // Undeclared exception!
      try { 
        byteArrayBuilder0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
      byte[] byteArray0 = byteArrayBuilder0.completeAndCoalesce(0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(0);
      byteArrayBuilder0.close();
      assertEquals(0, byteArrayBuilder0.getCurrentSegmentLength());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
      int int0 = byteArrayBuilder0.getCurrentSegmentLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0);
      byteArrayBuilder0.finishCurrentSegment();
      // Undeclared exception!
      try { 
        byteArrayBuilder0.completeAndCoalesce(2000);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
}
