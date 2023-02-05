/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 01 21:06:22 GMT 2023
 */

package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ByteSourceJsonBootstrapper_ESTest extends ByteSourceJsonBootstrapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte) (-119);
      InputAccessor.Std inputAccessor_Std0 = new InputAccessor.Std(byteArray0);
      inputAccessor_Std0.nextByte();
      MatchStrength matchStrength0 = ByteSourceJsonBootstrapper.hasJSONFormat(inputAccessor_Std0);
      MatchStrength matchStrength1 = ByteSourceJsonBootstrapper.hasJSONFormat(inputAccessor_Std0);
      assertSame(matchStrength1, matchStrength0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      InputAccessor.Std inputAccessor_Std0 = new InputAccessor.Std(byteArray0, 0, 0);
      MatchStrength matchStrength0 = ByteSourceJsonBootstrapper.hasJSONFormat(inputAccessor_Std0);
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      JsonFactory jsonFactory0 = new JsonFactory(objectCodec0);
      BufferRecycler bufferRecycler0 = jsonFactory0._getBufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, matchStrength0, true);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, byteArrayInputStream0);
      ObjectCodec objectCodec1 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      BytesToNameCanonicalizer bytesToNameCanonicalizer0 = BytesToNameCanonicalizer.createRoot();
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
      JsonParser jsonParser0 = byteSourceJsonBootstrapper0.constructParser(1309, objectCodec1, bytesToNameCanonicalizer0, charsToNameCanonicalizer0, true, true);
      assertEquals(1309, jsonParser0.getFeatureMask());
      assertEquals(JsonEncoding.UTF8, iOContext0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, "m5%<EGSWYD ^fT", false);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, byteArrayInputStream0);
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
      // Undeclared exception!
      try { 
        byteSourceJsonBootstrapper0.constructParser((byte)13, objectCodec0, (BytesToNameCanonicalizer) null, charsToNameCanonicalizer0, true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonFactory jsonFactory0 = new JsonFactory((ObjectCodec) null);
      BufferRecycler bufferRecycler0 = jsonFactory0._getBufferRecycler();
      Object object0 = new Object();
      IOContext iOContext0 = new IOContext(bufferRecycler0, object0, true);
      File file0 = MockFile.createTempFile("f3budj*N%c P>  pk", "");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, mockFileInputStream0);
      byteSourceJsonBootstrapper0._bytesPerChar = 2000;
      byteSourceJsonBootstrapper0.detectEncoding();
      byteSourceJsonBootstrapper0.constructReader();
      assertEquals((-2), mockFileInputStream0.available());
      assertEquals(JsonEncoding.UTF8, iOContext0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-32);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 13);
      IOContext iOContext0 = new IOContext(bufferRecycler0, bufferedInputStream0, false);
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, bufferedInputStream0);
      try { 
        byteSourceJsonBootstrapper0.detectEncoding();
        fail("Expecting exception: CharConversionException");
      
      } catch(CharConversionException e) {
         //
         // Unsupported UCS-4 endianness (2143) detected
         //
         verifyException("com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      JsonFactory jsonFactory0 = new JsonFactory(objectCodec0);
      BufferRecycler bufferRecycler0 = jsonFactory0._getBufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, false);
      byte[] byteArray0 = new byte[1];
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, byteArray0, (-357), 0);
      boolean boolean0 = byteSourceJsonBootstrapper0.ensureLoaded(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 13);
      IOContext iOContext0 = new IOContext(bufferRecycler0, bufferedInputStream0, false);
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, bufferedInputStream0);
      boolean boolean0 = byteSourceJsonBootstrapper0.ensureLoaded(13);
      assertEquals(0, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonFactory jsonFactory0 = new JsonFactory();
      BufferRecycler bufferRecycler0 = jsonFactory0._getBufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, jsonFactory0, true);
      byte[] byteArray0 = new byte[5];
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, byteArray0, (byte)116, (-489));
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      BytesToNameCanonicalizer bytesToNameCanonicalizer0 = BytesToNameCanonicalizer.createRoot();
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
      JsonParser jsonParser0 = byteSourceJsonBootstrapper0.constructParser(0, objectCodec0, bytesToNameCanonicalizer0, charsToNameCanonicalizer0, true, true);
      assertEquals(0, jsonParser0.getFeatureMask());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      JsonFactory jsonFactory0 = new JsonFactory(objectCodec0);
      BufferRecycler bufferRecycler0 = jsonFactory0._getBufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, false);
      byte[] byteArray0 = new byte[2];
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, byteArray0, 635, (-4129));
      ObjectCodec objectCodec1 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      BytesToNameCanonicalizer bytesToNameCanonicalizer0 = BytesToNameCanonicalizer.createRoot();
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
      JsonParser jsonParser0 = byteSourceJsonBootstrapper0.constructParser((byte) (-56), objectCodec1, bytesToNameCanonicalizer0, charsToNameCanonicalizer0, false, true);
      assertEquals((-56), jsonParser0.getFeatureMask());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteSourceJsonBootstrapper.hasJSONFormat((InputAccessor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      InputAccessor.Std inputAccessor_Std0 = new InputAccessor.Std(byteArray0, 125, 65534);
      // Undeclared exception!
      try { 
        ByteSourceJsonBootstrapper.hasJSONFormat(inputAccessor_Std0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 125
         //
         verifyException("com.fasterxml.jackson.core.format.InputAccessor$Std", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      byte[] byteArray0 = new byte[2];
      InputAccessor.Std inputAccessor_Std0 = new InputAccessor.Std(pipedInputStream0, byteArray0);
      try { 
        ByteSourceJsonBootstrapper.hasJSONFormat(inputAccessor_Std0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, false);
      PipedInputStream pipedInputStream0 = new PipedInputStream(468);
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, pipedInputStream0);
      try { 
        byteSourceJsonBootstrapper0.ensureLoaded(468);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonFactory jsonFactory0 = new JsonFactory();
      BufferRecycler bufferRecycler0 = jsonFactory0._getBufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, jsonFactory0, true);
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, (byte[]) null, 2000, 2000);
      // Undeclared exception!
      try { 
        byteSourceJsonBootstrapper0.detectEncoding();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, "L@&FH6*T@l3g", false);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, pushbackInputStream0);
      try { 
        byteSourceJsonBootstrapper0.detectEncoding();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, (InputStream) null);
      // Undeclared exception!
      try { 
        byteSourceJsonBootstrapper0.constructReader();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IOContext iOContext0 = new IOContext((BufferRecycler) null, (Object) null, false);
      byte[] byteArray0 = new byte[3];
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, byteArray0, (byte) (-67), (byte)84);
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      BytesToNameCanonicalizer bytesToNameCanonicalizer0 = BytesToNameCanonicalizer.createRoot();
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
      // Undeclared exception!
      try { 
        byteSourceJsonBootstrapper0.constructParser(0, objectCodec0, bytesToNameCanonicalizer0, charsToNameCanonicalizer0, true, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -67
         //
         verifyException("com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = null;
      try {
        byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper((IOContext) null, pipedInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonFactory jsonFactory0 = new JsonFactory();
      BufferRecycler bufferRecycler0 = jsonFactory0._getBufferRecycler();
      Object object0 = new Object();
      IOContext iOContext0 = new IOContext(bufferRecycler0, object0, false);
      byte[] byteArray0 = new byte[5];
      JsonEncoding jsonEncoding0 = JsonEncoding.UTF16_BE;
      iOContext0.setEncoding(jsonEncoding0);
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, byteArray0, (byte) (-32), (-2175));
      Reader reader0 = byteSourceJsonBootstrapper0.constructReader();
      assertNotNull(reader0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
      byte[] byteArray0 = new byte[5];
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, byteArray0, 1234, 2);
      // Undeclared exception!
      try { 
        byteSourceJsonBootstrapper0.detectEncoding();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1234
         //
         verifyException("com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)102;
      InputAccessor.Std inputAccessor_Std0 = new InputAccessor.Std(byteArray0);
      MatchStrength matchStrength0 = ByteSourceJsonBootstrapper.hasJSONFormat(inputAccessor_Std0);
      assertEquals(MatchStrength.NO_MATCH, matchStrength0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)49;
      InputAccessor.Std inputAccessor_Std0 = new InputAccessor.Std(byteArray0);
      MatchStrength matchStrength0 = ByteSourceJsonBootstrapper.hasJSONFormat(inputAccessor_Std0);
      assertEquals(MatchStrength.WEAK_MATCH, matchStrength0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IOContext iOContext0 = new IOContext((BufferRecycler) null, (Object) null, false);
      byte[] byteArray0 = new byte[0];
      JsonEncoding jsonEncoding0 = JsonEncoding.UTF32_BE;
      iOContext0.setEncoding(jsonEncoding0);
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, byteArray0, (-32768), (-32768));
      Reader reader0 = byteSourceJsonBootstrapper0.constructReader();
      assertNotNull(reader0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      JsonFactory jsonFactory0 = new JsonFactory(objectCodec0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)74;
      JsonParser jsonParser0 = jsonFactory0.createParser(byteArray0);
      assertEquals(1, jsonParser0.getFeatureMask());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      JsonFactory jsonFactory0 = new JsonFactory(objectCodec0);
      byte[] byteArray0 = new byte[2];
      JsonParser jsonParser0 = jsonFactory0.createParser(byteArray0);
      assertEquals(1, jsonParser0.getFeatureMask());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)47;
      byteArray0[1] = (byte) (-72);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 13);
      IOContext iOContext0 = new IOContext(bufferRecycler0, bufferedInputStream0, false);
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, bufferedInputStream0);
      JsonEncoding jsonEncoding0 = byteSourceJsonBootstrapper0.detectEncoding();
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(JsonEncoding.UTF8, jsonEncoding0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 13);
      IOContext iOContext0 = new IOContext(bufferRecycler0, bufferedInputStream0, false);
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, bufferedInputStream0);
      JsonEncoding jsonEncoding0 = byteSourceJsonBootstrapper0.detectEncoding();
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(JsonEncoding.UTF32_BE, jsonEncoding0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
      byte[] byteArray0 = new byte[0];
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, byteArray0, 2000, 0);
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      BytesToNameCanonicalizer bytesToNameCanonicalizer0 = BytesToNameCanonicalizer.createRoot();
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
      byteSourceJsonBootstrapper0.constructParser(2000, objectCodec0, bytesToNameCanonicalizer0, charsToNameCanonicalizer0, false, true);
      ObjectCodec objectCodec1 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        byteSourceJsonBootstrapper0.constructParser((-2984), objectCodec1, bytesToNameCanonicalizer0, charsToNameCanonicalizer0, false, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Trying to call same allocXxx() method second time
         //
         verifyException("com.fasterxml.jackson.core.io.IOContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      Object object0 = new Object();
      IOContext iOContext0 = new IOContext(bufferRecycler0, object0, true);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ByteSourceJsonBootstrapper byteSourceJsonBootstrapper0 = new ByteSourceJsonBootstrapper(iOContext0, pipedInputStream0);
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      BytesToNameCanonicalizer bytesToNameCanonicalizer0 = BytesToNameCanonicalizer.createRoot();
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
      try { 
        byteSourceJsonBootstrapper0.constructParser(0, objectCodec0, bytesToNameCanonicalizer0, charsToNameCanonicalizer0, false, true);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
}