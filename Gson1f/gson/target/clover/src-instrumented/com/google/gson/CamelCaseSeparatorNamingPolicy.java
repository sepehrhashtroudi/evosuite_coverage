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

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;

/**
 * Converts the field name that uses camel-case define word separation into separate words that
 * are separated by the provided {@code separatorString}.
 *
 * <p>The following is an example:</p>
 * <pre>
 * class IntWrapper {
 *   public int integerField = 0;
 * }
 *
 * CamelCaseSeparatorNamingPolicy policy = new CamelCaseSeparatorNamingPolicy("_");
 * String translatedFieldName =
 *     policy.translateName(IntWrapper.class.getField("integerField"));
 *
 * assert("integer_Field".equals(translatedFieldName));
 * </pre>
 *
 * @author Joel Leitch
 */
final class CamelCaseSeparatorNamingPolicy extends RecursiveFieldNamingPolicy {public static class __CLR4_4_166lds19g5h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0076\u006f\u0073\u0075\u0069\u0074\u0065\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675640789680L,8589935092L,22,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private final String separatorString;

  /**
   * Constructs a new CamelCaseSeparatorNamingPolicy object that will add the
   * {@code separatorString} between each of the words separated by camel case.
   *
   * @param separatorString the string value to place between words
   * @throws IllegalArgumentException thrown if the {@code separatorString} parameter
   *         is null or empty.
   */
  public CamelCaseSeparatorNamingPolicy(String separatorString) {try{__CLR4_4_166lds19g5h.R.inc(6);
    __CLR4_4_166lds19g5h.R.inc(7);Preconditions.checkNotNull(separatorString);
    __CLR4_4_166lds19g5h.R.inc(8);Preconditions.checkArgument(!"".equals(separatorString));
    __CLR4_4_166lds19g5h.R.inc(9);this.separatorString = separatorString;
  }finally{__CLR4_4_166lds19g5h.R.flushNeeded();}}

  @Override
  protected String translateName(String target, Type fieldType,
      Collection<Annotation> annnotations) {try{__CLR4_4_166lds19g5h.R.inc(10);
    __CLR4_4_166lds19g5h.R.inc(11);StringBuilder translation = new StringBuilder();
    __CLR4_4_166lds19g5h.R.inc(12);for (int i = 0; (((i < target.length())&&(__CLR4_4_166lds19g5h.R.iget(13)!=0|true))||(__CLR4_4_166lds19g5h.R.iget(14)==0&false)); i++) {{
      __CLR4_4_166lds19g5h.R.inc(15);char character = target.charAt(i);
      __CLR4_4_166lds19g5h.R.inc(16);if ((((Character.isUpperCase(character) && translation.length() != 0)&&(__CLR4_4_166lds19g5h.R.iget(17)!=0|true))||(__CLR4_4_166lds19g5h.R.iget(18)==0&false))) {{
        __CLR4_4_166lds19g5h.R.inc(19);translation.append(separatorString);
      }
      }__CLR4_4_166lds19g5h.R.inc(20);translation.append(character);
    }

    }__CLR4_4_166lds19g5h.R.inc(21);return translation.toString();
  }finally{__CLR4_4_166lds19g5h.R.flushNeeded();}}
}
