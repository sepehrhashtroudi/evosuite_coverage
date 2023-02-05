/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2008 Google Inc.
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

/**
 * This exception is raised if there is a serious issue that occurs during parsing of a Json
 * string.  One of the main usages for this class is for the Gson infrastructure.  If the incoming
 * Json is bad/malicious, an instance of this exception is raised.
 *
 * <p>This exception is a {@link RuntimeException} because it is exposed to the client.  Using a
 * {@link RuntimeException} avoids bad coding practices on the client side where they catch the
 * exception and do nothing.  It is often the case that you want to blow up if there is a parsing
 * error (i.e. often clients do not know how to recover from a {@link JsonParseException}.</p>
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class JsonParseException extends RuntimeException {public static class __CLR4_4_115r15rldr3cijm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0076\u006f\u0073\u0075\u0069\u0074\u0065\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675583825374L,8589935092L,1509,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  static final long serialVersionUID = -4086729973971783390L;

  /**
   * Creates exception with the specified message. If you are wrapping another exception, consider
   * using {@link #JsonParseException(String, Throwable)} instead.
   *
   * @param msg error message describing a possible cause of this exception.
   */
  public JsonParseException(String msg) {
    super(msg);__CLR4_4_115r15rldr3cijm.R.inc(1504);try{__CLR4_4_115r15rldr3cijm.R.inc(1503);
  }finally{__CLR4_4_115r15rldr3cijm.R.flushNeeded();}}

  /**
   * Creates exception with the specified message and cause.
   *
   * @param msg error message describing what happened.
   * @param cause root exception that caused this exception to be thrown.
   */
  public JsonParseException(String msg, Throwable cause) {
    super(msg, cause);__CLR4_4_115r15rldr3cijm.R.inc(1506);try{__CLR4_4_115r15rldr3cijm.R.inc(1505);
  }finally{__CLR4_4_115r15rldr3cijm.R.flushNeeded();}}

  /**
   * Creates exception with the specified cause. Consider using
   * {@link #JsonParseException(String, Throwable)} instead if you can describe what happened.
   *
   * @param cause root exception that caused this exception to be thrown.
   */
  public JsonParseException(Throwable cause) {
    super(cause);__CLR4_4_115r15rldr3cijm.R.inc(1508);try{__CLR4_4_115r15rldr3cijm.R.inc(1507);
  }finally{__CLR4_4_115r15rldr3cijm.R.flushNeeded();}}
}