/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2009 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.gson;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;

/**
 * A streaming parser that allows reading of multiple {@link JsonElement}s from the specified reader
 * asynchronously.
 * 
 * <p>This class is conditionally thread-safe (see Item 70, Effective Java second edition). To
 * properly use this class across multiple threads, you will need to add some external
 * synchronization.  For example:
 * 
 * <pre>
 * JsonStreamParser parser = new JsonStreamParser("['first'] {'second':10} 'third'");
 * JsonElement element;
 * synchronized (parser) {  // synchronize on an object shared by threads
 *   if (parser.hasNext()) {
 *     element = parser.next();
 *   }
 * }
 * </pre>
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 * @since 1.4
 */
public final class JsonStreamParser implements Iterator<JsonElement> {public static class __CLR4_4_11fy1fyldr3cil8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0076\u006f\u0073\u0075\u0069\u0074\u0065\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675583825374L,8589935092L,1896,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private final JsonReader parser;
  private final Object lock;

  /**
   * @param json The string containing JSON elements concatenated to each other.
   * @since 1.4
   */
  public JsonStreamParser(String json) {
    this(new StringReader(json));__CLR4_4_11fy1fyldr3cil8.R.inc(1871);try{__CLR4_4_11fy1fyldr3cil8.R.inc(1870);      
  }finally{__CLR4_4_11fy1fyldr3cil8.R.flushNeeded();}}
  
  /**
   * @param reader The data stream containing JSON elements concatenated to each other.
   * @since 1.4
   */
  public JsonStreamParser(Reader reader) {try{__CLR4_4_11fy1fyldr3cil8.R.inc(1872);
    __CLR4_4_11fy1fyldr3cil8.R.inc(1873);parser = new JsonReader(reader);
    __CLR4_4_11fy1fyldr3cil8.R.inc(1874);parser.setLenient(true);
    __CLR4_4_11fy1fyldr3cil8.R.inc(1875);lock = new Object();
  }finally{__CLR4_4_11fy1fyldr3cil8.R.flushNeeded();}}
  
  /**
   * Returns the next available {@link JsonElement} on the reader. Null if none available.
   * 
   * @return the next available {@link JsonElement} on the reader. Null if none available.
   * @throws JsonParseException if the incoming stream is malformed JSON.
   * @since 1.4
   */
  public JsonElement next() throws JsonParseException {try{__CLR4_4_11fy1fyldr3cil8.R.inc(1876);
    __CLR4_4_11fy1fyldr3cil8.R.inc(1877);if ((((!hasNext())&&(__CLR4_4_11fy1fyldr3cil8.R.iget(1878)!=0|true))||(__CLR4_4_11fy1fyldr3cil8.R.iget(1879)==0&false))) {{
      __CLR4_4_11fy1fyldr3cil8.R.inc(1880);throw new NoSuchElementException();
    }
    
    }__CLR4_4_11fy1fyldr3cil8.R.inc(1881);try {
      __CLR4_4_11fy1fyldr3cil8.R.inc(1882);return Streams.parse(parser);
    } catch (StackOverflowError e) {
      __CLR4_4_11fy1fyldr3cil8.R.inc(1883);throw new JsonParseException("Failed parsing JSON source to Json", e);
    } catch (OutOfMemoryError e) {
      __CLR4_4_11fy1fyldr3cil8.R.inc(1884);throw new JsonParseException("Failed parsing JSON source to Json", e);
    } catch (JsonParseException e) {
      __CLR4_4_11fy1fyldr3cil8.R.inc(1885);throw (((e.getCause() instanceof EOFException )&&(__CLR4_4_11fy1fyldr3cil8.R.iget(1886)!=0|true))||(__CLR4_4_11fy1fyldr3cil8.R.iget(1887)==0&false))? new NoSuchElementException() : e;
    }
  }finally{__CLR4_4_11fy1fyldr3cil8.R.flushNeeded();}}

  /**
   * Returns true if a {@link JsonElement} is available on the input for consumption
   * @return true if a {@link JsonElement} is available on the input, false otherwise
   * @since 1.4
   */
  public boolean hasNext() {try{__CLR4_4_11fy1fyldr3cil8.R.inc(1888);
    __CLR4_4_11fy1fyldr3cil8.R.inc(1889);synchronized (lock) {
      __CLR4_4_11fy1fyldr3cil8.R.inc(1890);try {
        __CLR4_4_11fy1fyldr3cil8.R.inc(1891);return parser.peek() != JsonToken.END_DOCUMENT;
      } catch (MalformedJsonException e) {
        __CLR4_4_11fy1fyldr3cil8.R.inc(1892);throw new JsonSyntaxException(e);
      } catch (IOException e) {
        __CLR4_4_11fy1fyldr3cil8.R.inc(1893);throw new JsonIOException(e);
      }
    }
  }finally{__CLR4_4_11fy1fyldr3cil8.R.flushNeeded();}}

  /**
   * This optional {@link Iterator} method is not relevant for stream parsing and hence is not
   * implemented.
   * @since 1.4
   */
  public void remove() {try{__CLR4_4_11fy1fyldr3cil8.R.inc(1894);
    __CLR4_4_11fy1fyldr3cil8.R.inc(1895);throw new UnsupportedOperationException();
  }finally{__CLR4_4_11fy1fyldr3cil8.R.flushNeeded();}}
}
