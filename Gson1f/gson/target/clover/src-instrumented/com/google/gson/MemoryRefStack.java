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

import java.util.Stack;

/**
 * A stack data structure that only does a memory reference comparison
 * when looking for a particular item in the stack.  This stack does
 * not allow {@code null} values to be added.
 *
 * @author Joel Leitch
 */
final class MemoryRefStack {public static class __CLR4_4_11kw1kwlds19gld{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0076\u006f\u0073\u0075\u0069\u0074\u0065\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675640789680L,8589935092L,2068,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private final Stack<ObjectTypePair> stack = new Stack<ObjectTypePair>();

  /**
   * Adds a new element to the top of the stack.
   *
   * @param obj the object to add to the stack
   * @return the object that was added
   */
  public ObjectTypePair push(ObjectTypePair obj) {try{__CLR4_4_11kw1kwlds19gld.R.inc(2048);
    __CLR4_4_11kw1kwlds19gld.R.inc(2049);Preconditions.checkNotNull(obj);

    __CLR4_4_11kw1kwlds19gld.R.inc(2050);return stack.push(obj);
  }finally{__CLR4_4_11kw1kwlds19gld.R.flushNeeded();}}

  /**
   * Removes the top element from the stack.
   *
   * @return the element being removed from the stack
   * @throws java.util.EmptyStackException thrown if the stack is empty
   */
  public ObjectTypePair pop() {try{__CLR4_4_11kw1kwlds19gld.R.inc(2051);
    __CLR4_4_11kw1kwlds19gld.R.inc(2052);return stack.pop();
  }finally{__CLR4_4_11kw1kwlds19gld.R.flushNeeded();}}

  public boolean isEmpty() {try{__CLR4_4_11kw1kwlds19gld.R.inc(2053);
    __CLR4_4_11kw1kwlds19gld.R.inc(2054);return stack.isEmpty();
  }finally{__CLR4_4_11kw1kwlds19gld.R.flushNeeded();}}

  /**
   * Retrieves the item from the top of the stack, but does not remove it.
   *
   * @return the item from the top of the stack
   * @throws java.util.EmptyStackException thrown if the stack is empty
   */
  public ObjectTypePair peek() {try{__CLR4_4_11kw1kwlds19gld.R.inc(2055);
    __CLR4_4_11kw1kwlds19gld.R.inc(2056);return stack.peek();
  }finally{__CLR4_4_11kw1kwlds19gld.R.flushNeeded();}}

  /**
   * Performs a memory reference check to see it the {@code obj} exists in
   * the stack.
   *
   * @param obj the object to search for in the stack
   * @return true if this object is already in the stack otherwise false
   */
  public boolean contains(ObjectTypePair obj) {try{__CLR4_4_11kw1kwlds19gld.R.inc(2057);
    __CLR4_4_11kw1kwlds19gld.R.inc(2058);if ((((obj == null)&&(__CLR4_4_11kw1kwlds19gld.R.iget(2059)!=0|true))||(__CLR4_4_11kw1kwlds19gld.R.iget(2060)==0&false))) {{
      __CLR4_4_11kw1kwlds19gld.R.inc(2061);return false;
    }

    }__CLR4_4_11kw1kwlds19gld.R.inc(2062);for (ObjectTypePair stackObject : stack) {{
      __CLR4_4_11kw1kwlds19gld.R.inc(2063);if ((((stackObject.getObject() == obj.getObject()
          && stackObject.type.equals(obj.type) )&&(__CLR4_4_11kw1kwlds19gld.R.iget(2064)!=0|true))||(__CLR4_4_11kw1kwlds19gld.R.iget(2065)==0&false))) {{
        __CLR4_4_11kw1kwlds19gld.R.inc(2066);return true;
      }
    }}
    }__CLR4_4_11kw1kwlds19gld.R.inc(2067);return false;
  }finally{__CLR4_4_11kw1kwlds19gld.R.flushNeeded();}}
}
